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

package org.mxupdate.test.test.update.datamodel.notification;

import org.mxupdate.test.test.update.AbstractParserTest;
import org.mxupdate.update.BusObject_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests the {@link BusObject_mxJPO group CI} parser.
 *
 * @author The MxUpdate Team
 */
@Test()
public class NotficationCI_1ParserTest
    extends AbstractParserTest<BusObject_mxJPO>
{
    @Override()
    @DataProvider(name = "data")
    public Object[][] getData()
    {
        return new Object[][]
        {
            {"0) simple",
                "",
                "description \"\" current \"\""},
            // type
            {"1) type defined",
                    "                      description \"\" current \"Active\"",
                    "type \"Notification\" description \"\" current \"Active\""},
            // description
            {"2a) description",
                    "",
                    "description \"abc def\" current \"Active\""},
            {"2b) description not defined",
                    "description \"\" current \"Active\"",
                    "                 current \"Active\""},
            {"2c) multi-line description",
                    "",
                    "description \"abc\ndef\" current \"Active\""},
            {"2d) tab's in description",
                    "",
                    "description \"abc\\tdef\" current \"Active\""},
            // attribute
            {"4a) one attribute ",
                    "",
                    "description \"\" current \"\" attribute \"ATTRNAME\" \"ATTRVALUE\""},
            // attribute
            {"4b) various attributes ",
                    "description \"\" current \"\" attribute \"ATTRNAME\"  \"ATTRVALUE\" attribute \"ATTRNAME1\" \"ATTRVALUE\" attribute \"ATTRNAME2\" \"ATTRVALUE\"",
                    "description \"\" current \"\" attribute \"ATTRNAME2\" \"ATTRVALUE\" attribute \"ATTRNAME1\" \"ATTRVALUE\" attribute \"ATTRNAME\"  \"ATTRVALUE\""},
            {"4c) mulitine attribute value",
                    "",
                    "description \"\" current \"\" attribute \"ATTRNAME\" \"ATTR\n\nVALUE\""},
        };
    }

    @Override()
    protected BusObject_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                            final String _name)
    {
        return new BusObject_mxJPO(_paramCache.getMapping().getTypeDef("Notification"), _name);
    }
}
