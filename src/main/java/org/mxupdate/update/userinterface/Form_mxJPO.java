/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.update.userinterface;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import matrix.util.MatrixException;

import org.mxupdate.mapping.TypeDef_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.ParseException;
import org.mxupdate.update.util.DeltaUtil_mxJPO;
import org.mxupdate.update.util.MqlBuilder_mxJPO;
import org.mxupdate.update.util.MqlBuilder_mxJPO.MultiLineMqlBuilder;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.mxupdate.update.util.UpdateBuilder_mxJPO;
import org.mxupdate.update.util.UpdateException_mxJPO;
import org.xml.sax.SAXException;

/**
 * The class is used to export, create, delete and update forms within MX.
 *
 * @author The MxUpdate Team
 */
public class Form_mxJPO
    extends AbstractUIWithFields_mxJPO<Form_mxJPO>
{
    /** Set of all ignored URLs from the XML definition for forms. */
    private static final Set<String> IGNORED_URLS = new HashSet<String>();
    static  {
        Form_mxJPO.IGNORED_URLS.add("/footer");
        Form_mxJPO.IGNORED_URLS.add("/header");
        Form_mxJPO.IGNORED_URLS.add("/height");
        Form_mxJPO.IGNORED_URLS.add("/leftMargin");
        Form_mxJPO.IGNORED_URLS.add("/rightMargin");
        Form_mxJPO.IGNORED_URLS.add("/webform");
        Form_mxJPO.IGNORED_URLS.add("/width");
    }

    /** Minimum field index. Null means no fields. */
    private Integer minFieldIdx;

    /**
     * Constructor used to initialize the type definition enumeration.
     *
     * @param _typeDef  defines the related type definition enumeration
     * @param _mxName   MX name of the administration object
     */
    public Form_mxJPO(final TypeDef_mxJPO _typeDef,
                      final String _mxName)
    {
        super(_typeDef, _mxName);
    }

    @Override()
    public void parseUpdate(final String _code)
        throws SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, ParseException
    {
        new FormParser_mxJPO(new StringReader(_code)).parse(this);
        this.prepare();
    }

    @Override()
    protected void parse(final ParameterCache_mxJPO _paramCache)
        throws MatrixException, SAXException, IOException
    {
        super.parse(_paramCache);
        final String ret = MqlBuilder_mxJPO.mql().cmd("escape print form ").arg(this.getName()).cmd(" select ").arg("field.number").cmd(" dump").exec(_paramCache);
        if ((ret != null) && !ret.isEmpty())  {
            this.minFieldIdx = Integer.parseInt(ret.split(",")[0]);
        }
    }

    /**
     * <p>Parses all form specific URL values. No specific values for the web
     * form exists</p>
     * <p>If an <code>_url</code> is included in {@link #IGNORED_URLS}, this
     * URL is ignored.</p>
     *
     * @param _paramCache   parameter cache with MX context
     * @param _url          URL to parse
     * @param _content      related content of the URL to parse
     * @return <i>true</i> if <code>_url</code> could be parsed; otherwise
     *         <i>false</i>
     * @see #IGNORED_URLS
     */
    @Override()
    protected boolean parse(final ParameterCache_mxJPO _paramCache,
                            final String _url,
                            final String _content)
    {
        final boolean parsed;
        if (Form_mxJPO.IGNORED_URLS.contains(_url))  {
            parsed = true;
        } else  {
            parsed = super.parse(_paramCache, _url, _content);
        }
        return parsed;
    }

    @Override()
    protected void write(final ParameterCache_mxJPO _paramCache,
                         final Appendable _out)
        throws IOException
    {
        final UpdateBuilder_mxJPO updateBuilder = new UpdateBuilder_mxJPO(_paramCache);

        this.writeHeader(_paramCache, updateBuilder.getStrg());

        updateBuilder
                .start("form")
                //              tag             | default | value                              | write?
                .string(        "description",              this.getDescription())
                .flagIfTrue(    "hidden",           false,  this.isHidden(),                    this.isHidden())
                .list(this.getFields())
                .properties(this.getProperties())
                .end();

        _out.append(updateBuilder.toString());
    }

    /**
     * Creates given web form object with given name. Because the MQL add
     * command for a web form must include the string &quot;web&quot; a
     * specific create method must be written.
     *
     * @param _paramCache   parameter cache
     * @throws Exception if the web form could not be created within MX
     */
    @Override()
    public void create(final ParameterCache_mxJPO _paramCache)
        throws Exception
    {
        MqlBuilder_mxJPO.mql().cmd("escape add ").cmd(this.getTypeDef().getMxAdminName()).cmd(" ").arg(this.getName()).cmd(" web; ").exec(_paramCache);
    }

    @Override()
    protected void calcDelta(final ParameterCache_mxJPO _paramCache,
                             final MultiLineMqlBuilder _mql,
                             final Form_mxJPO _current)
        throws UpdateException_mxJPO
    {
        DeltaUtil_mxJPO.calcValueDelta(  _mql,              "description",              this.getDescription(),  _current.getDescription());
        DeltaUtil_mxJPO.calcFlagDelta(   _mql,              "hidden",            false, this.isHidden(),        _current.isHidden());

        final Iterator<AbstractField> currentFieldIter = _current.getFields().iterator();
        final Iterator<AbstractField> targetFieldIter = this.getFields().iterator();

        int idx = 1;
        boolean equal = _current.getFields().size() == this.getFields().size();
        // compare the field in sequence
        AbstractField targetField = null;
        while(currentFieldIter.hasNext() && targetFieldIter.hasNext()) {
            final AbstractField currentField = currentFieldIter.next();
            targetField = targetFieldIter.next();
            if (currentField.compareTo(targetField) == 0)  {
                idx++;
                targetField = null;
            } else {
                equal = false;
                break;
            }
        }

        // the fields are not the same from idx on or the current has more than the target
        // --> updates must be done
        if (!equal) {
            // to ensure that fields are numbered correctly
            if (this.minFieldIdx != null) {
                _mql.newLine()
                    .cmd(" field modify ").arg(String.valueOf(this.minFieldIdx)).cmd(" order ").arg("1");
            }
            // remove all field after the ones that were equal
            int idy = _current.getFields().size();
            while (idy > idx - 1) {
                _mql.newLine()
                    .cmd(" field delete ").arg(String.valueOf(idy));
                idy--;
            }

            if (!equal) {
                // append new fields
                if (targetField != null) {
                    targetField.calcDelta(_mql, idx++);
                }
                while(targetFieldIter.hasNext()) {
                    targetField = targetFieldIter.next();
                    targetField.calcDelta(_mql, idx++);
                }
            }
        }
        this.getProperties().calcDelta(_mql, "", _current.getProperties());
    }

    /**
     * Class used to define a field of a web form.
     */
    public static class Field
        extends AbstractField
    {
        /** Constructor setting the tag. */
        public Field()
        {
            super("field");
        }
    }
}
