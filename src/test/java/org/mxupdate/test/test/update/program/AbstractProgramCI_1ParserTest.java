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

package org.mxupdate.test.test.update.program;

import org.mxupdate.test.test.update.AbstractParserTest;
import org.mxupdate.update.program.ProgramCI_mxJPO;

/**
 * Tests the {@link ProgramCI_mxJPO program CI} parser.
 *
 * @author The MxUpdate Team
 */
public abstract class AbstractProgramCI_1ParserTest
    extends AbstractParserTest<ProgramCI_mxJPO>
{
    protected Object[][] getData(final String _kind)
    {
        return new Object[][]  {
            {"0) simple",
                    "",
                    "kind " + _kind + " description \"\" "},
            // uuid
            {"1a) uuid with minus separator",
                    "",
                    "kind " + _kind + " uuid \"FDA75674-9792-11E6-AE22-56B6B6499611\" description \"\""},
            {"1b) uuid w/o minus separator",
                    "",
                    "kind " + _kind + " uuid \"FDA75674979211E6AE2256B6B6499611\"     description \"\""},
            {"1c) uuid convert from single to string",
                    "kind " + _kind + " uuid \"FDA7-5674979211-E6AE2256B6-B6499611\"  description \"\"",
                    "kind " + _kind + " uuid   FDA7-5674979211-E6AE2256B6-B6499611    description \"\""},
            // description
            {"2a) description",
                    "",
                    "kind " + _kind + " description \"abc def\" "},
            {"2b) description not defined",
                    "kind " + _kind + " description \"\"",
                    "kind " + _kind + "                  "},
            {"2c) multi-line description",
                    "",
                    "kind " + _kind + " description \"abc\ndef\""},
            {"2d) tab's in description",
                    "kind " + _kind + " description \"abc\\tdef\"",
                    "kind " + _kind + " description \"abc\tdef\""},
            // hidden flag
            {"3a) hidden",
                    "",
                    "kind " + _kind + " description \"\" hidden "},
            {"3b) not hidden (not defined)",
                    "kind " + _kind + " description \"\"         ",
                    "kind " + _kind + " description \"\" !hidden "},
            // needsbusinessobject flag
            {"4a) needsbusinessobject",
                    "",
                    "kind " + _kind + " description \"\" needsbusinessobject "},
            {"4b) not needsbusinessobject (not defined)",
                    "kind " + _kind + " description \"\"         ",
                    "kind " + _kind + " description \"\" !needsbusinessobject "},
            // downloadable flag
            {"5a) downloadable",
                    "",
                    "kind " + _kind + " description \"\" downloadable "},
            {"5b) not downloadable (not defined)",
                    "kind " + _kind + " description \"\"               ",
                    "kind " + _kind + " description \"\" !downloadable "},
            // pipe flag
            {"6a) pipe",
                    "",
                    "kind " + _kind + " description \"\" pipe "},
            {"6b) not pipe (not defined)",
                    "kind " + _kind + " description \"\"         ",
                    "kind " + _kind + " description \"\" !pipe "},
            // pooled flag
            {"7a) pooled",
                    "",
                    "kind " + _kind + " description \"\" pooled "},
            {"7b) not pooled (not defined)",
                    "kind " + _kind + " description \"\"         ",
                    "kind " + _kind + " description \"\" !pooled "},
            // rule
            {"8a) rule",
                    "",
                    "kind " + _kind + " description \"\" rule \"abc\""},
            {"8b) empty rule",
                    "kind " + _kind + " description \"\"              ",
                    "kind " + _kind + " description \"\" rule \"\" "},
            // execute
            {"9a) execute immediate",
                    "kind " + _kind + " description \"\"                  ",
                    "kind " + _kind + " description \"\" execute immediate"},
            {"9b) execute deferred",
                    "",
                    "kind " + _kind + " description \"\" execute deferred"},
            {"9c) execute user",
                    "",
                    "kind " + _kind + " description \"\" execute user \"TestUser\""},
            // code
            {"10a) code",
                    "",
                    "kind " + _kind + " description \"\" code \" side \n second \""},
            {"10b) code empty definition",
                    "kind " + _kind + " description \"\"           ",
                    "kind " + _kind + " description \"\" code \"\" "},
            {"10c) code with tab converted must be converted",
                    "",
                    "kind " + _kind + " description \"\" code \"abc\\tdef\""},
            // property
            {"20a) property special characters",
                    "",
                    "kind " + _kind + " description \"\" property \"{}\\\"\""},
            {"20b) property and value special characters",
                    "",
                    "kind " + _kind + " description \"\" property \"{}\\\"\" value \"{}\\\"\""},
            {"20c) property link special characters",
                    "",
                    "kind " + _kind + " description \"\" property \"{}\\\"\" to type \"{}\\\"\""},
            {"20d) property link and value special characters",
                    "",
                    "kind " + _kind + " description \"\" property \"{}\\\"\" to type \"{}\\\"\" value \"{}\\\"\""},
        };
    }
}
