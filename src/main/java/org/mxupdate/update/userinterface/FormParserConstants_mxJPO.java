/* Generated By:JavaCC: Do not edit this line. FormParserConstants.java */
package org.mxupdate.update.userinterface;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface FormParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DESCRIPTION = 5;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 6;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 7;
  /** RegularExpression Id. */
  int STRING = 8;
  /** RegularExpression Id. */
  int SINGLE = 9;
  /** RegularExpression Id. */
  int MULTILINESTRING = 10;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 11;
  /** RegularExpression Id. */
  int FIELD = 12;
  /** RegularExpression Id. */
  int FIELD_OPEN = 13;
  /** RegularExpression Id. */
  int FIELD_CLOSE = 14;
  /** RegularExpression Id. */
  int FIELD_NAME = 15;
  /** RegularExpression Id. */
  int FIELD_LABEL = 16;
  /** RegularExpression Id. */
  int FIELD_SELECT = 17;
  /** RegularExpression Id. */
  int FIELD_BOBJ = 18;
  /** RegularExpression Id. */
  int FIELD_REL = 19;
  /** RegularExpression Id. */
  int FIELD_RANGE = 20;
  /** RegularExpression Id. */
  int FIELD_HREF = 21;
  /** RegularExpression Id. */
  int FIELD_ALT = 22;
  /** RegularExpression Id. */
  int FIELD_USER = 23;
  /** RegularExpression Id. */
  int FIELD_SETTING = 24;
  /** RegularExpression Id. */
  int FIELD_STRING = 25;
  /** RegularExpression Id. */
  int FIELD_SINGLE = 26;
  /** RegularExpression Id. */
  int SETTING_STRING = 27;
  /** RegularExpression Id. */
  int SETTING_SINGLE = 28;
  /** RegularExpression Id. */
  int PROPERTY = 29;
  /** RegularExpression Id. */
  int PROPERTYTO = 30;
  /** RegularExpression Id. */
  int PROPERTYVAL = 31;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 32;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 33;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int SETTING_STRING_EXPECTED = 1;
  /** Lexical state. */
  int FIELD_STRING_EXPECTED = 2;
  /** Lexical state. */
  int FIELD_EXPECTED = 3;
  /** Lexical state. */
  int FIELD_OPENEXPECTED = 4;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 5;
  /** Lexical state. */
  int STRING_EXPECTED = 6;
  /** Lexical state. */
  int DEFAULT = 7;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"description\"",
    "\"hidden\"",
    "\"!hidden\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "\"field\"",
    "\"{\"",
    "\"}\"",
    "\"name\"",
    "\"label\"",
    "\"select\"",
    "\"businessobject\"",
    "\"relationship\"",
    "\"range\"",
    "\"href\"",
    "\"alt\"",
    "\"user\"",
    "\"setting\"",
    "<FIELD_STRING>",
    "<FIELD_SINGLE>",
    "<SETTING_STRING>",
    "<SETTING_SINGLE>",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
  };

}