/* Generated By:JavaCC: Do not edit this line. InterfaceParserConstants.java */
package org.mxupdate.update.datamodel;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface InterfaceParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DESCRIPTION = 5;
  /** RegularExpression Id. */
  int ABSTRACT_TRUE = 6;
  /** RegularExpression Id. */
  int ABSTRACT_FALSE = 7;
  /** RegularExpression Id. */
  int DERIVED = 8;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 9;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 10;
  /** RegularExpression Id. */
  int ATTRIBUTE = 11;
  /** RegularExpression Id. */
  int STRING = 16;
  /** RegularExpression Id. */
  int SINGLE = 17;
  /** RegularExpression Id. */
  int APOSTROPHE = 18;
  /** RegularExpression Id. */
  int CHAR = 19;
  /** RegularExpression Id. */
  int FOR = 20;
  /** RegularExpression Id. */
  int FOR_RELATIONSHIP_ALL = 25;
  /** RegularExpression Id. */
  int FOR_RELATIONSHIP = 26;
  /** RegularExpression Id. */
  int FOR_TYPE_ALL = 27;
  /** RegularExpression Id. */
  int FOR_TYPE = 28;
  /** RegularExpression Id. */
  int PROPERTY = 29;
  /** RegularExpression Id. */
  int PROPERTYTO = 30;
  /** RegularExpression Id. */
  int PROPERTYVAL = 31;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 36;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 37;
  /** RegularExpression Id. */
  int ADMINTYPE_APOSTROPHE = 38;
  /** RegularExpression Id. */
  int ADMINTYPE_CHAR = 39;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int STRING_EXPECTED = 1;
  /** Lexical state. */
  int FOR_EXPECTED = 2;
  /** Lexical state. */
  int ADMINREF_EXPECTED = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"description\"",
    "\"abstract\"",
    "\"!abstract\"",
    "\"derived\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"attribute\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<STRING>",
    "<SINGLE>",
    "\"\\\"\"",
    "<CHAR>",
    "\"for\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<FOR_RELATIONSHIP_ALL>",
    "\"relationship\"",
    "<FOR_TYPE_ALL>",
    "\"type\"",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
    "\"\\\"\"",
    "<ADMINTYPE_CHAR>",
  };

}