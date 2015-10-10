/* Generated By:JavaCC: Do not edit this line. TypeParserConstants.java */
package org.mxupdate.update.datamodel;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface TypeParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SYMBOLICNAME = 5;
  /** RegularExpression Id. */
  int DESCRIPTION = 6;
  /** RegularExpression Id. */
  int ABSTRACT_TRUE = 7;
  /** RegularExpression Id. */
  int ABSTRACT_FALSE = 8;
  /** RegularExpression Id. */
  int DERIVED = 9;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 10;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 11;
  /** RegularExpression Id. */
  int METHOD = 12;
  /** RegularExpression Id. */
  int LOCAL = 13;
  /** RegularExpression Id. */
  int ATTRIBUTE = 14;
  /** RegularExpression Id. */
  int STRING = 15;
  /** RegularExpression Id. */
  int SINGLE = 16;
  /** RegularExpression Id. */
  int MULTILINESTRING = 17;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 18;
  /** RegularExpression Id. */
  int KIND = 19;
  /** RegularExpression Id. */
  int BASIC = 20;
  /** RegularExpression Id. */
  int COMPOSED = 21;
  /** RegularExpression Id. */
  int KIND_BINARY = 22;
  /** RegularExpression Id. */
  int KIND_BOOLEAN = 23;
  /** RegularExpression Id. */
  int KIND_DATE = 24;
  /** RegularExpression Id. */
  int KIND_INTEGER = 25;
  /** RegularExpression Id. */
  int KIND_REAL = 26;
  /** RegularExpression Id. */
  int KIND_STRING = 27;
  /** RegularExpression Id. */
  int DEFAULTVALUE = 28;
  /** RegularExpression Id. */
  int MULTIVALUE_TRUE = 29;
  /** RegularExpression Id. */
  int MULTIVALUE_FALSE = 30;
  /** RegularExpression Id. */
  int RESETONCLONE_TRUE = 31;
  /** RegularExpression Id. */
  int RESETONCLONE_FALSE = 32;
  /** RegularExpression Id. */
  int RESETONREVISION_TRUE = 33;
  /** RegularExpression Id. */
  int RESETONREVISION_FALSE = 34;
  /** RegularExpression Id. */
  int RANGEVALUE_TRUE = 35;
  /** RegularExpression Id. */
  int RANGEVALUE_FALSE = 36;
  /** RegularExpression Id. */
  int MULTILINE_TRUE = 37;
  /** RegularExpression Id. */
  int MULTILINE_FALSE = 38;
  /** RegularExpression Id. */
  int RULE = 39;
  /** RegularExpression Id. */
  int DIMENSION = 40;
  /** RegularExpression Id. */
  int MAXLENGTH = 41;
  /** RegularExpression Id. */
  int MAXLENGTH_NUMBER = 42;
  /** RegularExpression Id. */
  int RANGE_EQUAL = 43;
  /** RegularExpression Id. */
  int RANGE_GREATERTHAN = 44;
  /** RegularExpression Id. */
  int RANGE_GREATERTHANEQUAL = 45;
  /** RegularExpression Id. */
  int RANGE_LESSTHAN = 46;
  /** RegularExpression Id. */
  int RANGE_LESSTHANEQUAL = 47;
  /** RegularExpression Id. */
  int RANGE_NOTEQUAL = 48;
  /** RegularExpression Id. */
  int RANGE_MATCH = 49;
  /** RegularExpression Id. */
  int RANGE_NOTMATCH = 50;
  /** RegularExpression Id. */
  int RANGE_SMATCH = 51;
  /** RegularExpression Id. */
  int RANGE_NOTSMATCH = 52;
  /** RegularExpression Id. */
  int RANGE_PROGRAM = 53;
  /** RegularExpression Id. */
  int RANGE_BETWEEN = 54;
  /** RegularExpression Id. */
  int BETW1_STRING = 55;
  /** RegularExpression Id. */
  int BETW1_SINGLE = 56;
  /** RegularExpression Id. */
  int BETW1_APOSTROPHE = 57;
  /** RegularExpression Id. */
  int BETW1_CHAR = 58;
  /** RegularExpression Id. */
  int BETW2_INCLUSIVE = 59;
  /** RegularExpression Id. */
  int BETW2_EXCLUSIVE = 60;
  /** RegularExpression Id. */
  int BETW3_STRING = 61;
  /** RegularExpression Id. */
  int BETW3_SINGLE = 62;
  /** RegularExpression Id. */
  int BETW3_APOSTROPHE = 63;
  /** RegularExpression Id. */
  int BETW3_CHAR = 64;
  /** RegularExpression Id. */
  int BETW4_INCLUSIVE = 65;
  /** RegularExpression Id. */
  int BETW4_EXCLUSIVE = 66;
  /** RegularExpression Id. */
  int TRIGGER = 67;
  /** RegularExpression Id. */
  int INPUT = 68;
  /** RegularExpression Id. */
  int TRIGEVENT = 69;
  /** RegularExpression Id. */
  int ACTION = 70;
  /** RegularExpression Id. */
  int CHECK = 71;
  /** RegularExpression Id. */
  int OVERRIDE = 72;
  /** RegularExpression Id. */
  int PROPERTY = 73;
  /** RegularExpression Id. */
  int PROPERTYTO = 74;
  /** RegularExpression Id. */
  int PROPERTYVAL = 75;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 76;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 77;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int TRIGKIND_EXPECTED = 1;
  /** Lexical state. */
  int TRIGEVENT_EXPECTED = 2;
  /** Lexical state. */
  int BETW4_EXPECTED = 3;
  /** Lexical state. */
  int BETW3_EXPECTED = 4;
  /** Lexical state. */
  int BETW2_EXPECTED = 5;
  /** Lexical state. */
  int BETW1_EXPECTED = 6;
  /** Lexical state. */
  int MAXLENGTH_EXPECTED = 7;
  /** Lexical state. */
  int KIND_EXPECTED = 8;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 9;
  /** Lexical state. */
  int STRING_EXPECTED = 10;
  /** Lexical state. */
  int DEFAULT = 11;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"symbolicname\"",
    "\"description\"",
    "\"abstract\"",
    "\"!abstract\"",
    "\"derived\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"method\"",
    "\"local\"",
    "\"attribute\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "\"kind\"",
    "\"basic\"",
    "\"composed\"",
    "\"binary\"",
    "\"boolean\"",
    "\"date\"",
    "\"integer\"",
    "\"real\"",
    "\"string\"",
    "\"default\"",
    "\"multivalue\"",
    "\"!multivalue\"",
    "\"resetonclone\"",
    "\"!resetonclone\"",
    "\"resetonrevision\"",
    "\"!resetonrevision\"",
    "\"rangevalue\"",
    "\"!rangevalue\"",
    "\"multiline\"",
    "\"!multiline\"",
    "\"rule\"",
    "\"dimension\"",
    "\"maxlength\"",
    "<MAXLENGTH_NUMBER>",
    "<RANGE_EQUAL>",
    "<RANGE_GREATERTHAN>",
    "<RANGE_GREATERTHANEQUAL>",
    "<RANGE_LESSTHAN>",
    "<RANGE_LESSTHANEQUAL>",
    "<RANGE_NOTEQUAL>",
    "<RANGE_MATCH>",
    "<RANGE_NOTMATCH>",
    "<RANGE_SMATCH>",
    "<RANGE_NOTSMATCH>",
    "<RANGE_PROGRAM>",
    "<RANGE_BETWEEN>",
    "<BETW1_STRING>",
    "<BETW1_SINGLE>",
    "\"\\\"\"",
    "<BETW1_CHAR>",
    "\"inclusive\"",
    "\"exclusive\"",
    "<BETW3_STRING>",
    "<BETW3_SINGLE>",
    "\"\\\"\"",
    "<BETW3_CHAR>",
    "\"inclusive\"",
    "\"exclusive\"",
    "\"trigger\"",
    "\"input\"",
    "<TRIGEVENT>",
    "\"action\"",
    "\"check\"",
    "\"override\"",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
    "\"{\"",
    "\"}\"",
  };

}
