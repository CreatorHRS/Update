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

package org.mxupdate.test.test.update.datamodel.interfaceci;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.data.datamodel.AttributeData;
import org.mxupdate.test.data.datamodel.InterfaceData;
import org.mxupdate.test.data.datamodel.PathTypeData;
import org.mxupdate.test.data.datamodel.RelationshipData;
import org.mxupdate.test.data.datamodel.TypeData;
import org.mxupdate.test.data.system.PackageData;
import org.mxupdate.test.data.util.FlagList.Create;
import org.mxupdate.test.data.util.PropertyDef;
import org.mxupdate.test.test.update.AbstractDeltaCalculationTest;
import org.mxupdate.test.util.IssueLink;
import org.mxupdate.update.datamodel.Interface_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import matrix.util.MatrixException;

/**
 * Tests the {@link Interface_mxJPO interface CI} delta calculation.
 *
 * @author The MxUpdate Team
 */
@Test
public class InterfaceCI_2DeltaCalculationTest
    extends AbstractDeltaCalculationTest<Interface_mxJPO,InterfaceData>
{
    @Override
    @IssueLink("123")
    @DataProvider(name = "data")
    public Object[][] getData()
    {
        return new Object[][] {
            {"0a) simple",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")},
            {"0b) with escaped name",
                    new InterfaceData(this, "TestInterface \" 1"),
                    new InterfaceData(this, "TestInterface \" 1")},
            {"1a) new package",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("package", new PackageData(this, "TestPackage"))},
            {"1b) update package",
                    new InterfaceData(this, "Test").defData("package", new PackageData(this, "TestPackage1")),
                    new InterfaceData(this, "Test").defData("package", new PackageData(this, "TestPackage2"))},
            {"1c) remove package",
                    new InterfaceData(this, "Test").defData("package", new PackageData(this, "TestPackage")),
                    new InterfaceData(this, "Test").defKeyNotDefined("package")},
            {"2) uuid",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setValue("uuid", "FDA75674979211E6AE2256B6B6499611")},
            {"3a) symbolic name",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setValue("symbolicname", "interface_123")},
            {"3b) two symbolic name",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setValue("symbolicname", "interface_123").setValue("symbolicname", "interface_345")},
            {"4) issue #123: interface which is abstract",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setFlag("abstract", true, Create.ViaValue)},
            {"5) with property",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").addProperty(new PropertyDef("my test \"property\" desc\"\\\\ription"))},

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // for relationship / type / interface

            {"101) for pathtype all",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setSingle("for pathtype", "all")},
            {"102) for one pathtype",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("for pathtype", new PathTypeData(this, "Test"))},
            {"103) for two pathtypes",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("for pathtype", new PathTypeData(this, "Test \"1\"")).defData("for pathtype", new PathTypeData(this, "Test \"2\""))},

            {"111) for relation all",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setSingle("for relationship", "all")},
            {"112) for one relation",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("for relationship", new RelationshipData(this, "Test"))},
            {"113) for two relations",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("for relationship", new RelationshipData(this, "Test \"1\"")).defData("for relationship", new RelationshipData(this, "Test \"2\""))},

            {"121) for type all",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").setSingle("for type", "all")},
            {"122) for one type",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("for type", new TypeData(this, "Test"))},
            {"123) for two types",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test").defData("for type", new TypeData(this, "Test \"1\"")).defData("for type", new TypeData(this, "Test \"2\""))},

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // local attribute

            {"201) binary attribute",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "binary")
                                        .setValue("description", "abc def")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", "")) },
            {"202) boolean attribute",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "boolean")
                                        .setValue("description", "abc def")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", "")) },
            {"203) date attribute",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "date")
                                        .setValue("description", "abc def")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setFlag("rangevalue", false, Create.ViaFlag)
                                        .setValue("default", "")) },
            {"204) integer attribute",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "integer")
                                        .setValue("description", "abc def")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setFlag("rangevalue", false, Create.ViaFlag)
                                        .setValue("default", "")) },
            {"205) real attribute",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "real")
                                        .setValue("description", "abc def")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setFlag("rangevalue", false, Create.ViaFlag)
                                        .setValue("default", "")) },
            {"206) string attribute",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "string")
                                        .setValue("description", "abc def")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setFlag("multiline", false, Create.ViaFlag)
                                        .setSingle("maxlength", "0")
                                        .setValue("default", "")) },
            {"207a) attribute with new package",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .defData("package", new PackageData(this, "TestPackage"))
                                        .setSingle("kind", "boolean")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", ""))},
            {"207b) attribute with package update",
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .defData("package", new PackageData(this, "TestPackage1"))
                                        .setSingle("kind", "boolean")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", "")),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .defData("package", new PackageData(this, "TestPackage2"))
                                        .setSingle("kind", "boolean")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", ""))},
            {"207c) attribute with package remove",
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .defData("package", new PackageData(this, "TestPackage"))
                                        .setSingle("kind", "boolean")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", "")),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "boolean")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", ""))},
            {"208) attribute with uuid",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "boolean")
                                        .setValue("uuid", "UUID")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", "")) },
            {"209) attribute with symbolic name",
                    new InterfaceData(this, "Test"),
                    new InterfaceData(this, "Test")
                            .addLocalAttribute(
                                    new AttributeData(this, "ATTR1")
                                        .setSingle("kind", "boolean")
                                        .setValue("symbolicname", "attribute_" + AbstractTest.PREFIX + "Test." + AbstractTest.PREFIX + "ATTR1")
                                        .setValue("description", "")
                                        .setFlag("hidden", false, Create.ViaFlag)
                                        .setFlag("multivalue", false, Create.ViaFlag)
                                        .setFlag("resetonclone", false, Create.ViaFlag)
                                        .setFlag("resetonrevision", false, Create.ViaFlag)
                                        .setValue("default", "")) },
       };
    }

    @Override
    @BeforeMethod
    @AfterClass(groups = "close" )
    public void cleanup()
        throws MatrixException
    {
        this.cleanup(AbstractTest.CI.DM_INTERFACE);
        this.cleanup(AbstractTest.CI.DM_ATTRIBUTE);
        this.cleanup(AbstractTest.CI.DM_PATHTYPE);
        this.cleanup(AbstractTest.CI.DM_RELATIONSHIP);
        this.cleanup(AbstractTest.CI.DM_TYPE);
        this.cleanup(AbstractTest.CI.SYS_PACKAGE);
    }

    @Override
    protected Interface_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                            final String _name)
    {
        return new Interface_mxJPO(_name);
    }
}
