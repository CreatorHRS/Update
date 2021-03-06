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

package org.mxupdate.update.program;

import org.mxupdate.typedef.EMxAdmin_mxJPO;
import org.mxupdate.update.AbstractAdminObject_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;

import matrix.util.MatrixException;

/**
 * Common definition for the code of a program or page object.
 *
 * @author The MxUpdate Team
 * @param <CLASS> derived from this class
 */
public abstract class AbstractCode_mxJPO<CLASS extends AbstractCode_mxJPO<CLASS>>
    extends AbstractAdminObject_mxJPO<CLASS>
{
    /**
     * Defines the parameter for old MX versions which has the encoding problem
     * for double closing square brackets. Only if this parameter is defined
     * the encoding {@link #encodeXMLExport(String) work around method} is
     * executed.
     */
    private static final String PARAM_ENCODING_WORKAROUND = "ProgramUseEncodingWorkAround";

    /**
     * Inserted text in the {@link #code} if the program includes a
     * <code>CDATA</code> (two closing squared brackets '&#93;&#93;').
     */
    private static final String INSERT_TEXT = "Inserted" + "_by_" + "ENO" + "VIA";

    /**
     * Text which is used as replacement for two closing squared brackets
     * ('&#93;&#93;') which are not replaced from old MX versions.
     */
    private static final String REPLACE_TEXT = "]" + AbstractCode_mxJPO.INSERT_TEXT + "]" + AbstractCode_mxJPO.INSERT_TEXT;

    /**
     * Start string of the code section within the XML export of JPO / MQL
     * programs.
     */
    private static final String CODE_TAG_START = "<code><![CDATA[";

    /**
     * Length of the {@link #CODE_TAG_START} string.
     */
    private static final int LENGTH_CODE_TAG_START = AbstractCode_mxJPO.CODE_TAG_START.length();

    /**
     * End string of the code section within the XML export of JPO / MQL
     * programs.
     */
    private static final String CODE_TAG_END = "]]></code>";

    /** Source code of this program. */
    private String code;
    /** File with code to update. */
    private String file;

    /**
     * Constructor used to initialize the type definition enumeration and the
     * name.
     *
     * @param _mxClassDef   MX class definition
     * @param _mxName       MX name of the program object
     */
    protected AbstractCode_mxJPO(final EMxAdmin_mxJPO _mxClassDef,
                                 final String _mxName)
    {
        super(_mxClassDef, _mxName);
    }

    /**
     * Returns the {@link #code} of this program.
     *
     * @return code of this program
     */
    public String getCode()
    {
        return this.code;
    }

    /**
     * Returns the {@link #file} of this program.
     *
     * @return file of this program
     */
    protected String getFile()
    {
        return this.file;
    }

    /**
     * Return the XML export for programs. Because of
     * {@link #encodeXMLExport(String) 'problems'} of old MX versions with the
     * encoding of brackets the original method is overwritten. The special
     * encoding is only done if the parameter
     * {@link #PARAM_ENCODING_WORKAROUND} is activated.
     *
     * @param _paramCache   parameter cache
     * @return XML string (and for old MX version
     *         {@link #encodeXMLExport(String) encoded})
     * @throws MatrixException if export failed
     * @see #encodeXMLExport(String)
     */
    @Override()
    protected String execXMLExport(final ParameterCache_mxJPO _paramCache)
        throws MatrixException
    {
        final String xml = super.execXMLExport(_paramCache);
        final String ret;
        if (_paramCache.getValueBoolean(AbstractCode_mxJPO.PARAM_ENCODING_WORKAROUND))  {
            ret = this.encodeXMLExport(xml);
        } else  {
            ret = xml;
        }
        return ret;
    }

    /**
     * Encodes the XML string which is returned from old MX version. Old MX
     * versions have some problems with not encoded double closed squared
     * brackets. Newer MX versions itself encodes them to
     * {@link #REPLACE_TEXT}. This is also done from this method for old MX
     * versions.
     *
     * @param _xml  XML to encode
     * @return encoded XML
     * @see #execXMLExport(ParameterCache_mxJPO)
     * @see #REPLACE_TEXT
     */
    protected String encodeXMLExport(final String _xml)
    {
        final int startIdx = _xml.indexOf(AbstractCode_mxJPO.CODE_TAG_START);
        final int endIdx = _xml.lastIndexOf(AbstractCode_mxJPO.CODE_TAG_END);
        final String ret;
        if ((startIdx >=0) && (endIdx > startIdx))  {
            final String pre = _xml.substring(0, startIdx + AbstractCode_mxJPO.LENGTH_CODE_TAG_START);
            final String post = _xml.substring(endIdx);
            final String code = _xml.substring(startIdx + AbstractCode_mxJPO.LENGTH_CODE_TAG_START, endIdx);
            ret = pre + code.replaceAll("\\]\\]", AbstractCode_mxJPO.REPLACE_TEXT) + post;
        } else  {
            ret = _xml;
        }
        return ret;
    }

    /**
     * <p>Parses all common code specific URL values. This includes:
     * <ul>
     * <li>{@link #code} (program code or page content)</li>
     * </ul></p>
     *
     * @param _paramCache   parameter cache with MX context
     * @param _url          URL to parse
     * @param _content      content depending on the URL
     * @return <i>true</i> if <code>_url</code> could be parsed; otherwise
     *         <i>false</i>
     */
    @Override()
    public boolean parseAdminXMLExportEvent(final ParameterCache_mxJPO _paramCache,
                                            final String _url,
                                            final String _content)
    {
        final boolean parsed;
        // JPO + MQL programs
        if ("/code".equals(_url))  {
            this.code = (_content != null)
                        ? _content.replaceAll(AbstractCode_mxJPO.INSERT_TEXT, "")
                        : "";
            parsed = true;
        // page programs
        } else if ("/pageContent".equals(_url))  {
            this.code = (_content != null)
                        ? _content.replaceAll(AbstractCode_mxJPO.INSERT_TEXT, "")
                        : "";
            parsed = true;
        } else  {
            parsed = super.parseAdminXMLExportEvent(_paramCache, _url, _content);
        }
        return parsed;
    }
}
