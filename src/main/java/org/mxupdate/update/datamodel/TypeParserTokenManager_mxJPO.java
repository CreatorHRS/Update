/* TypeParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. TypeParserTokenManager.java */
package org.mxupdate.update.datamodel;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.mxupdate.mapping.TypeDef_mxJPO;
import org.mxupdate.update.datamodel.helper.TriggerList_mxJPO.Trigger;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.ParseException;
import org.mxupdate.update.util.AbstractParser_mxJPO.SimpleCharStream;
import org.mxupdate.update.util.AbstractParser_mxJPO.Token;
import org.mxupdate.update.util.AbstractParser_mxJPO.TokenMgrError;
import org.mxupdate.update.util.AdminPropertyList_mxJPO.AdminProperty;
import org.mxupdate.update.util.ParameterCache_mxJPO;

/** Token Manager. */
@SuppressWarnings("unused")class TypeParserTokenManager_mxJPO implements TypeParserConstants_mxJPO {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_3(){
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa1_3(0x100000000L);
      case 99:
         return jjMoveStringLiteralDfa1_3(0x200000000L);
      case 111:
         return jjMoveStringLiteralDfa1_3(0x400000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa2_3(active0, 0x100000000L);
      case 104:
         return jjMoveStringLiteralDfa2_3(active0, 0x200000000L);
      case 118:
         return jjMoveStringLiteralDfa2_3(active0, 0x400000000L);
      default :
         return 2;
   }
}
private int jjMoveStringLiteralDfa2_3(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa3_3(active0, 0x600000000L);
      case 116:
         return jjMoveStringLiteralDfa3_3(active0, 0x100000000L);
      default :
         return 3;
   }
}
private int jjMoveStringLiteralDfa3_3(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_3(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa4_3(active0, 0x100000000L);
      case 114:
         return jjMoveStringLiteralDfa4_3(active0, 0x400000000L);
      default :
         return 4;
   }
}
private int jjMoveStringLiteralDfa4_3(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 107:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(4, 33);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_3(active0, 0x100000000L);
      case 114:
         return jjMoveStringLiteralDfa5_3(active0, 0x400000000L);
      default :
         return 5;
   }
   return 5;
}
private int jjMoveStringLiteralDfa5_3(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa6_3(active0, 0x400000000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(5, 32);
         break;
      default :
         return 6;
   }
   return 6;
}
private int jjMoveStringLiteralDfa6_3(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa7_3(active0, 0x400000000L);
      default :
         return 7;
   }
}
private int jjMoveStringLiteralDfa7_3(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(7, 34);
         break;
      default :
         return 8;
   }
   return 8;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x480L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1040L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x120L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1000200000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000080L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x920L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 111:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x800200000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      default :
         return 2;
   }
   return 2;
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x200400L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x60L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800L);
      default :
         return 3;
   }
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x600L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000400000L);
      default :
         return 4;
   }
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(4, 37);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000200L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x60L);
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(4, 22);
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      default :
         return 5;
   }
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 100:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(5, 11);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x200500L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x20L);
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(5, 9);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000080L);
      default :
         return 6;
   }
   return 6;
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 100:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(6, 8);
         break;
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(6, 10);
         break;
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 114:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(6, 21);
         break;
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      default :
         return 7;
   }
   return 7;
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x80L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(7, 6);
         return jjMoveStringLiteralDfa8_0(active0, 0x1020L);
      case 121:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(7, 35);
         break;
      default :
         return 8;
   }
   return 8;
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 8;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(8, 12);
         break;
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x20L);
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(8, 7);
         break;
      default :
         return 9;
   }
   return 9;
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 9;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 9;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x20L);
      default :
         return 10;
   }
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 10;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 10;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(10, 5);
         break;
      default :
         return 11;
   }
   return 11;
}
private final int jjStopStringLiteralDfa_4(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_4(int pos, long active0){
   return jjMoveNfa_4(jjStopStringLiteralDfa_4(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_4(){
   switch(curChar)
   {
      default :
         return jjMoveNfa_4(0, 0);
   }
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_4(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffa00000000L & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     { jjCheckNAdd(5); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 1:
                  if ((0xfffffffb00000000L & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 2:
                  if (curChar == 34)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 4:
                  if (curChar == 34 && kind > 42)
                     kind = 42;
                  break;
               case 5:
                  if ((0xfffffffa00000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAdd(5); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 5:
                  if ((0xd7ffffffffffffffL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAdd(5); }
                  break;
               case 1:
                  { jjAddStates(0, 2); }
                  break;
               case 3:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 5:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAdd(5); }
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_2(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_2(int pos, long active0){
   return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_2(){
   switch(curChar)
   {
      default :
         return jjMoveNfa_2(0, 0);
   }
}
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffa00000000L & l) == 0L)
                     break;
                  kind = 27;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xd7ffffffffffffffL & l) == 0L)
                     break;
                  kind = 27;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_1(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_1(int pos, long active0){
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      default :
         return jjMoveNfa_1(0, 0);
   }
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffa00000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(5); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 1:
                  if ((0xfffffffb00000000L & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 2:
                  if (curChar == 34)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 4:
                  if (curChar == 34 && kind > 17)
                     kind = 17;
                  break;
               case 5:
                  if ((0xfffffffa00000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(5); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 5:
                  if ((0xd7ffffffffffffffL & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(5); }
                  break;
               case 1:
                  { jjAddStates(0, 2); }
                  break;
               case 3:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 5:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(5); }
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 3, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\144\145\163\143\162\151\160\164\151\157\156", 
"\141\142\163\164\162\141\143\164", "\41\141\142\163\164\162\141\143\164", "\144\145\162\151\166\145\144", 
"\150\151\144\144\145\156", "\41\150\151\144\144\145\156", "\155\145\164\150\157\144", 
"\141\164\164\162\151\142\165\164\145", null, null, null, null, null, null, null, null, 
"\164\162\151\147\147\145\162", "\151\156\160\165\164", null, null, null, null, null, null, null, null, null, 
"\141\143\164\151\157\156", "\143\150\145\143\153", "\157\166\145\162\162\151\144\145", 
"\160\162\157\160\145\162\164\171", "\164\157", "\166\141\154\165\145", null, null, null, null, null, null, null, 
null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
     case 2:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       break;
     case 3:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_3();
       break;
     case 4:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_4();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public TypeParserTokenManager_mxJPO(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public TypeParserTokenManager_mxJPO (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
	
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit( SimpleCharStream stream, int lexState)
  {
  
    ReInit( stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 5 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "STRING_EXPECTED",
   "TRIGEVENT_EXPECTED",
   "TRIGKIND_EXPECTED",
   "ADMINREF_EXPECTED",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, -1, -1, 1, -1, -1, 1, 1, -1, -1, -1, -1, 0, 0, -1, -1, 2, 1, -1, -1, 
   -1, -1, 3, -1, -1, -1, -1, 1, 1, 1, 1, 4, 1, -1, -1, -1, -1, 1, 1, -1, -1, 
};
static final long[] jjtoToken = {
   0xc3f08661fe1L, 
};
static final long[] jjtoSkip = {
   0x3c0f781e01eL, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[6];
    private final int[] jjstateSet = new int[2 * 6];

    
    protected int curChar;
}