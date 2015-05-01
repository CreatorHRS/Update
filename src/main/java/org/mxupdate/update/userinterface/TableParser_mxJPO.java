/* TableParser.java */
/* Generated By:JavaCC: Do not edit this line. TableParser.java */
package org.mxupdate.update.userinterface;

import java.lang.reflect.InvocationTargetException;

import org.mxupdate.update.userinterface.AbstractUIWithFields_mxJPO.AbstractField.ExpressionType;
import org.mxupdate.update.userinterface.AbstractUIWithFields_mxJPO.AbstractField.SortType;
import org.mxupdate.update.userinterface.AbstractUIWithFields_mxJPO.Setting;
import org.mxupdate.update.userinterface.Table_mxJPO.Column;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.ParseException;
import org.mxupdate.update.util.AbstractParser_mxJPO.SimpleCharStream;
import org.mxupdate.update.util.AbstractParser_mxJPO.Token;
import org.mxupdate.update.util.AbstractParser_mxJPO.TokenMgrError;
import org.mxupdate.update.util.AdminPropertyList_mxJPO.AdminProperty;

/**
 * Parses the update format for {@link Table_mxJPO}. */
@SuppressWarnings("unused")
class TableParser_mxJPO
    extends AbstractParser_mxJPO<Table_mxJPO> implements TableParserConstants_mxJPO {

/**************************************************************************** */

/**
 * Parses one complete interface definition.
 *
 * @param _form    target interface to update with parsed values
 */
  final public void parse(final Table_mxJPO _table) throws ParseException, SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {Token tmp;
    AdminProperty property;
    Column column;
    Setting setting;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DESCRIPTION:
      case HIDDEN_TRUE:
      case HIDDEN_FALSE:
      case COLUMN:
      case PROPERTY:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DESCRIPTION:{
        jj_consume_token(DESCRIPTION);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTILINESTRING:{
          tmp = jj_consume_token(MULTILINESTRING);
this.setValue(_table, "description",                       this.getString(tmp.image));
          break;
          }
        case MULTILINESINGLE:{
          tmp = jj_consume_token(MULTILINESINGLE);
this.setValue(_table, "description",                       this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case HIDDEN_TRUE:{
        jj_consume_token(HIDDEN_TRUE);
this.setValue(_table, "hidden",                            true);
        break;
        }
      case HIDDEN_FALSE:{
        jj_consume_token(HIDDEN_FALSE);
this.setValue(_table, "hidden",                            false);
        break;
        }
      case COLUMN:{
        jj_consume_token(COLUMN);
column = new Column();this.appendValue(_table, "fields", column);
        jj_consume_token(COLUMN_OPEN);
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COLUMN_NAME:
          case COLUMN_LABEL:
          case COLUMN_SELECT:
          case COLUMN_BOBJ:
          case COLUMN_REL:
          case COLUMN_RANGE:
          case COLUMN_HREF:
          case COLUMN_ALT:
          case COLUMN_HIDDEN_TRUE:
          case COLUMN_HIDDEN_FALSE:
          case COLUMN_USER:
          case COLUMN_SORTTYPE:
          case COLUMN_SETTING:{
            ;
            break;
            }
          default:
            jj_la1[2] = jj_gen;
            break label_2;
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COLUMN_NAME:{
            jj_consume_token(COLUMN_NAME);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "name",                              this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "name",                              this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[3] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_LABEL:{
            jj_consume_token(COLUMN_LABEL);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "label",                             this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "label",                             this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[4] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_SELECT:{
            jj_consume_token(COLUMN_SELECT);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "expression",                        this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "expression",                        this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[5] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_BOBJ:{
            jj_consume_token(COLUMN_BOBJ);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "expression",                        this.getString(tmp.image));this.setValue(column, "expressionType", ExpressionType.BUSINESSOBJECT);
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "expression",                        this.getSingle(tmp.image));this.setValue(column, "expressionType", ExpressionType.BUSINESSOBJECT);
              break;
              }
            default:
              jj_la1[6] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_REL:{
            jj_consume_token(COLUMN_REL);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "expression",                        this.getString(tmp.image));this.setValue(column, "expressionType", ExpressionType.RELATIONSHIP);
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "expression",                        this.getSingle(tmp.image));this.setValue(column, "expressionType", ExpressionType.RELATIONSHIP);
              break;
              }
            default:
              jj_la1[7] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_RANGE:{
            jj_consume_token(COLUMN_RANGE);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "range",                             this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "range",                             this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[8] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_HREF:{
            jj_consume_token(COLUMN_HREF);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "href",                              this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "href",                              this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[9] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_ALT:{
            jj_consume_token(COLUMN_ALT);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(column, "alt",                               this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(column, "alt",                               this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[10] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_HIDDEN_TRUE:{
            jj_consume_token(COLUMN_HIDDEN_TRUE);
this.setValue(column, "hidden",                            true);
            break;
            }
          case COLUMN_HIDDEN_FALSE:{
            jj_consume_token(COLUMN_HIDDEN_FALSE);
this.setValue(column, "hidden",                            false);
            break;
            }
          case COLUMN_USER:{
            jj_consume_token(COLUMN_USER);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.appendValue(column, "users",                          this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.appendValue(column, "users",                          this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[11] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_SORTTYPE:{
            jj_consume_token(COLUMN_SORTTYPE);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_SORTTYPE_ALPHA:{
              jj_consume_token(COLUMN_SORTTYPE_ALPHA);
this.setValue(column, "sortType",                          SortType.ALPHANUMERIC);
              break;
              }
            case COLUMN_SORTTYPE_NUMERIC:{
              jj_consume_token(COLUMN_SORTTYPE_NUMERIC);
this.setValue(column, "sortType",                          SortType.NUMERIC);
              break;
              }
            case COLUMN_SORTTYPE_OTHER:{
              jj_consume_token(COLUMN_SORTTYPE_OTHER);
this.setValue(column, "sortType",                          SortType.OTHER);
              break;
              }
            case COLUMN_SORTTYPE_NONE:{
              jj_consume_token(COLUMN_SORTTYPE_NONE);
this.setValue(column, "sortType",                          SortType.NONE);
              break;
              }
            default:
              jj_la1[12] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case COLUMN_SETTING:{
            jj_consume_token(COLUMN_SETTING);
setting = new Setting();this.appendValue(column, "settings", setting);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case SETTING_STRING:{
              tmp = jj_consume_token(SETTING_STRING);
this.setValue(setting, "name",                             this.getString(tmp.image));
              break;
              }
            case SETTING_SINGLE:{
              tmp = jj_consume_token(SETTING_SINGLE);
this.setValue(setting, "name",                             this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[13] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case COLUMN_STRING:{
              tmp = jj_consume_token(COLUMN_STRING);
this.setValue(setting, "value",                            this.getString(tmp.image));
              break;
              }
            case COLUMN_SINGLE:{
              tmp = jj_consume_token(COLUMN_SINGLE);
this.setValue(setting, "value",                            this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[14] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          default:
            jj_la1[15] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
        jj_consume_token(COLUMN_CLOSE);
        break;
        }
      case PROPERTY:{
        jj_consume_token(PROPERTY);
property = new AdminProperty();this.appendValue(_table, "properties", "propertiesStack", property);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(property, "name", this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(property, "name", this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PROPERTYTO:
          case PROPERTYVAL:{
            ;
            break;
            }
          default:
            jj_la1[17] = jj_gen;
            break label_3;
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PROPERTYVAL:{
            jj_consume_token(PROPERTYVAL);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case STRING:{
              tmp = jj_consume_token(STRING);
this.setValue(property, "value", this.getString(tmp.image));
              break;
              }
            case SINGLE:{
              tmp = jj_consume_token(SINGLE);
this.setValue(property, "value", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[18] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case PROPERTYTO:{
            jj_consume_token(PROPERTYTO);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case ADMINTYPE_STRING:{
              tmp = jj_consume_token(ADMINTYPE_STRING);
this.setValue(property, "refAdminType", this.getString(tmp.image));
              break;
              }
            case ADMINTYPE_SINGLE:{
              tmp = jj_consume_token(ADMINTYPE_SINGLE);
this.setValue(property, "refAdminType", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[19] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case STRING:{
              tmp = jj_consume_token(STRING);
this.setValue(property, "refAdminName", this.getString(tmp.image));
              break;
              }
            case SINGLE:{
              tmp = jj_consume_token(SINGLE);
this.setValue(property, "refAdminName", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[20] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          default:
            jj_la1[21] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  /** Generated Token Manager. */
  public TableParserTokenManager_mxJPO token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[23];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x10e0,0xc00,0xfff8000,0x30000000,0x30000000,0x30000000,0x30000000,0x30000000,0x30000000,0x30000000,0x30000000,0x30000000,0x0,0xc0000000,0x30000000,0xfff8000,0x300,0x0,0x300,0x0,0x300,0x0,0x10e0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x10,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xf,0x0,0x0,0x0,0x0,0x60,0x0,0x180,0x0,0x60,0x10,};
   }

  /** Constructor with InputStream. */
  public TableParser_mxJPO(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public TableParser_mxJPO(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new TableParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public TableParser_mxJPO(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new TableParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new TableParserTokenManager_mxJPO(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public TableParser_mxJPO(TableParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TableParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[41];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 23; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 41; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
