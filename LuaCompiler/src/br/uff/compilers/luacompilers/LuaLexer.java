/* The following code was generated by JFlex 1.6.1 */

package br.uff.compilers.luacompilers;

/* User Code */
import java.util.*;
import java_cup.runtime.*;
import java.io.*; 
import br.uff.compilers.luacompilers.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>F:/Projects/Lua-Compiler/LuaCompiler/src/br/uff/compilers/luacompilers/lua.jflex</tt>
 */
public class LuaLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int chuck = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\2\0\1\13\6\0\1\3\1\2\1\10\1\11\1\1\22\0\1\3"+
    "\1\0\1\20\1\66\1\0\1\62\2\0\1\55\1\56\1\57\1\22"+
    "\1\53\1\4\1\23\1\60\2\17\1\16\7\17\1\51\1\52\1\63"+
    "\1\12\1\64\2\0\1\37\1\46\1\45\1\25\1\24\1\41\1\14"+
    "\1\31\1\32\1\14\1\47\1\34\1\14\1\27\1\26\1\36\1\14"+
    "\1\35\1\42\1\40\1\44\1\14\1\30\3\14\1\5\1\21\1\6"+
    "\1\61\1\14\1\0\1\37\1\46\1\45\1\25\1\24\1\41\1\14"+
    "\1\31\1\32\1\14\1\47\1\34\1\14\1\27\1\26\1\36\1\14"+
    "\1\35\1\42\1\40\1\44\1\14\1\30\3\14\1\54\1\0\1\7"+
    "\1\65\6\0\1\10\32\0\1\3\11\0\1\15\12\0\1\15\4\0"+
    "\1\15\5\0\27\15\1\0\37\15\1\0\70\15\2\33\115\15\1\43"+
    "\u0142\15\4\0\14\15\16\0\5\15\7\0\1\15\1\0\1\15\21\0"+
    "\165\15\1\0\2\15\2\0\4\15\1\0\1\15\6\0\1\15\1\0"+
    "\3\15\1\0\1\15\1\0\24\15\1\0\123\15\1\0\213\15\1\0"+
    "\255\15\1\0\46\15\2\0\1\15\7\0\47\15\11\0\55\15\1\0"+
    "\1\15\1\0\2\15\1\0\2\15\1\0\1\15\10\0\33\15\5\0"+
    "\3\15\35\0\13\15\5\0\100\15\12\17\4\0\146\15\1\0\10\15"+
    "\2\0\12\15\1\0\6\15\12\17\3\15\2\0\1\15\20\0\73\15"+
    "\2\0\145\15\16\0\12\17\54\15\4\0\1\15\5\0\56\15\22\0"+
    "\34\15\104\0\23\15\61\0\200\15\2\0\12\17\1\0\23\15\1\0"+
    "\10\15\2\0\2\15\2\0\26\15\1\0\7\15\1\0\1\15\3\0"+
    "\4\15\2\0\11\15\2\0\2\15\2\0\4\15\10\0\1\15\4\0"+
    "\2\15\1\0\5\15\2\0\12\17\2\15\17\0\3\15\1\0\6\15"+
    "\4\0\2\15\2\0\26\15\1\0\7\15\1\0\2\15\1\0\2\15"+
    "\1\0\2\15\2\0\1\15\1\0\5\15\4\0\2\15\2\0\3\15"+
    "\3\0\1\15\7\0\4\15\1\0\1\15\7\0\12\17\6\15\13\0"+
    "\3\15\1\0\11\15\1\0\3\15\1\0\26\15\1\0\7\15\1\0"+
    "\2\15\1\0\5\15\2\0\12\15\1\0\3\15\1\0\3\15\2\0"+
    "\1\15\17\0\4\15\2\0\12\17\21\0\3\15\1\0\10\15\2\0"+
    "\2\15\2\0\26\15\1\0\7\15\1\0\2\15\1\0\5\15\2\0"+
    "\11\15\2\0\2\15\2\0\3\15\10\0\2\15\4\0\2\15\1\0"+
    "\5\15\2\0\12\17\1\0\1\15\20\0\2\15\1\0\6\15\3\0"+
    "\3\15\1\0\4\15\3\0\2\15\1\0\1\15\1\0\2\15\3\0"+
    "\2\15\3\0\3\15\3\0\14\15\4\0\5\15\3\0\3\15\1\0"+
    "\4\15\2\0\1\15\6\0\1\15\16\0\12\17\20\0\4\15\1\0"+
    "\10\15\1\0\3\15\1\0\27\15\1\0\20\15\3\0\10\15\1\0"+
    "\3\15\1\0\4\15\7\0\2\15\1\0\2\15\6\0\4\15\2\0"+
    "\12\17\21\0\3\15\1\0\10\15\1\0\3\15\1\0\27\15\1\0"+
    "\12\15\1\0\5\15\2\0\11\15\1\0\3\15\1\0\4\15\7\0"+
    "\2\15\7\0\1\15\1\0\4\15\2\0\12\17\1\0\2\15\16\0"+
    "\3\15\1\0\10\15\1\0\3\15\1\0\51\15\2\0\10\15\1\0"+
    "\3\15\1\0\5\15\10\0\1\15\10\0\4\15\2\0\12\17\12\0"+
    "\6\15\2\0\2\15\1\0\22\15\3\0\30\15\1\0\11\15\1\0"+
    "\1\15\2\0\7\15\3\0\1\15\4\0\6\15\1\0\1\15\1\0"+
    "\10\15\6\0\12\17\2\0\2\15\15\0\72\15\5\0\17\15\1\0"+
    "\12\17\47\0\2\15\1\0\1\15\2\0\2\15\1\0\1\15\2\0"+
    "\1\15\6\0\4\15\1\0\7\15\1\0\3\15\1\0\1\15\1\0"+
    "\1\15\2\0\2\15\1\0\15\15\1\0\3\15\2\0\5\15\1\0"+
    "\1\15\1\0\6\15\2\0\12\17\2\0\4\15\40\0\1\15\27\0"+
    "\2\15\6\0\12\17\13\0\1\15\1\0\1\15\1\0\1\15\4\0"+
    "\12\15\1\0\44\15\4\0\24\15\1\0\22\15\1\0\44\15\11\0"+
    "\1\15\71\0\100\15\12\17\6\0\100\15\12\17\4\15\2\0\46\15"+
    "\1\0\1\15\5\0\1\15\2\0\53\15\1\0\u014d\15\1\0\4\15"+
    "\2\0\7\15\1\0\1\15\1\0\4\15\2\0\51\15\1\0\4\15"+
    "\2\0\41\15\1\0\4\15\2\0\7\15\1\0\1\15\1\0\4\15"+
    "\2\0\17\15\1\0\71\15\1\0\4\15\2\0\103\15\2\0\3\15"+
    "\40\0\20\15\20\0\125\15\14\0\u026c\15\2\0\21\15\1\3\32\15"+
    "\5\0\113\15\3\0\13\15\7\0\15\15\1\0\7\15\13\0\25\15"+
    "\13\0\24\15\14\0\15\15\1\0\3\15\1\0\2\15\14\0\124\15"+
    "\3\0\1\15\4\0\2\15\2\0\12\17\41\0\3\15\2\0\12\17"+
    "\6\0\130\15\10\0\53\15\5\0\106\15\12\0\37\15\1\0\14\15"+
    "\4\0\14\15\12\0\12\17\36\15\2\0\5\15\13\0\54\15\4\0"+
    "\32\15\6\0\12\17\46\0\34\15\4\0\77\15\1\0\35\15\2\0"+
    "\1\15\12\17\6\0\12\17\15\0\1\15\10\0\17\15\101\0\114\15"+
    "\4\0\12\17\21\0\11\15\14\0\60\15\12\17\72\15\14\0\70\15"+
    "\10\0\12\17\3\0\3\15\12\17\44\15\122\0\3\15\1\0\43\15"+
    "\1\0\2\15\6\0\366\15\6\0\u011a\15\2\0\6\15\2\0\46\15"+
    "\2\0\6\15\2\0\10\15\1\0\1\15\1\0\1\15\1\0\1\15"+
    "\1\0\37\15\2\0\65\15\1\0\7\15\1\0\1\15\3\0\3\15"+
    "\1\0\7\15\3\0\4\15\2\0\6\15\4\0\15\15\5\0\3\15"+
    "\1\0\7\15\3\0\13\3\35\0\1\10\1\10\5\0\1\3\17\0"+
    "\2\15\23\0\1\15\12\0\1\3\21\0\1\15\15\0\1\15\20\0"+
    "\15\15\63\0\41\15\21\0\1\15\4\0\1\15\2\0\12\15\1\0"+
    "\1\15\3\0\5\15\6\0\1\15\1\0\1\15\1\0\1\15\1\0"+
    "\1\50\3\15\1\0\13\15\2\0\4\15\5\0\5\15\4\0\1\15"+
    "\21\0\51\15\u032d\0\64\15\u0716\0\57\15\1\0\57\15\1\0\205\15"+
    "\6\0\11\15\14\0\46\15\1\0\1\15\5\0\1\15\2\0\70\15"+
    "\7\0\1\15\17\0\30\15\11\0\7\15\1\0\7\15\1\0\7\15"+
    "\1\0\7\15\1\0\7\15\1\0\7\15\1\0\7\15\1\0\7\15"+
    "\1\0\40\15\57\0\1\15\u01d0\0\1\3\4\0\3\15\31\0\17\15"+
    "\1\0\5\15\2\0\5\15\4\0\126\15\2\0\2\15\2\0\3\15"+
    "\1\0\132\15\1\0\4\15\5\0\51\15\3\0\136\15\21\0\33\15"+
    "\65\0\20\15\u0200\0\u19b6\15\112\0\u51cd\15\63\0\u048d\15\103\0\56\15"+
    "\2\0\u010d\15\3\0\20\15\12\17\2\15\24\0\63\15\1\0\12\15"+
    "\1\0\37\15\1\0\123\15\45\0\11\15\2\0\147\15\2\0\4\15"+
    "\1\0\36\15\2\0\2\15\105\0\61\15\30\0\64\15\14\0\105\15"+
    "\13\0\12\17\6\0\30\15\3\0\1\15\4\0\12\17\44\15\2\0"+
    "\44\15\14\0\35\15\3\0\101\15\16\0\1\15\12\17\6\0\20\15"+
    "\12\17\5\15\1\0\67\15\11\0\16\15\2\0\12\17\6\0\27\15"+
    "\3\0\111\15\30\0\3\15\2\0\20\15\2\0\5\15\12\0\6\15"+
    "\2\0\6\15\2\0\6\15\11\0\7\15\1\0\7\15\1\0\53\15"+
    "\1\0\4\15\4\0\2\15\132\0\53\15\1\0\2\15\2\0\12\17"+
    "\6\0\u2ba4\15\14\0\27\15\4\0\61\15\u2104\0\u016e\15\2\0\152\15"+
    "\46\0\7\15\14\0\5\15\5\0\14\15\1\0\15\15\1\0\5\15"+
    "\1\0\1\15\1\0\2\15\1\0\2\15\1\0\154\15\41\0\u016b\15"+
    "\22\0\100\15\2\0\66\15\50\0\14\15\4\0\20\15\20\0\16\15"+
    "\5\0\2\15\30\0\3\15\40\0\5\15\1\0\207\15\23\0\12\17"+
    "\7\0\32\15\4\0\1\15\1\0\32\15\13\0\131\15\3\0\6\15"+
    "\2\0\6\15\2\0\6\15\2\0\3\15\43\0\14\15\1\0\32\15"+
    "\1\0\23\15\1\0\2\15\1\0\17\15\2\0\16\15\42\0\173\15"+
    "\105\0\65\15\210\0\1\15\202\0\35\15\3\0\61\15\17\0\1\15"+
    "\37\0\40\15\20\0\33\15\5\0\53\15\5\0\36\15\2\0\44\15"+
    "\4\0\10\15\1\0\5\15\52\0\236\15\2\0\12\17\126\0\50\15"+
    "\10\0\64\15\234\0\u0137\15\11\0\26\15\12\0\10\15\230\0\6\15"+
    "\2\0\1\15\1\0\54\15\1\0\2\15\3\0\1\15\2\0\27\15"+
    "\12\0\27\15\11\0\37\15\141\0\26\15\12\0\32\15\106\0\70\15"+
    "\6\0\2\15\100\0\4\15\1\0\2\15\5\0\10\15\1\0\3\15"+
    "\1\0\33\15\4\0\3\15\4\0\1\15\40\0\35\15\3\0\35\15"+
    "\43\0\10\15\1\0\36\15\31\0\66\15\12\0\26\15\12\0\23\15"+
    "\15\0\22\15\156\0\111\15\u03b7\0\107\15\37\0\12\17\17\0\74\15"+
    "\25\0\31\15\7\0\12\17\6\0\65\15\1\0\12\17\20\0\44\15"+
    "\2\0\1\15\11\0\105\15\13\0\12\17\1\15\45\0\22\15\1\0"+
    "\45\15\170\0\73\15\5\0\12\17\7\0\3\15\1\0\10\15\2\0"+
    "\2\15\2\0\26\15\1\0\7\15\1\0\2\15\1\0\5\15\2\0"+
    "\11\15\2\0\2\15\2\0\3\15\11\0\1\15\5\0\7\15\2\0"+
    "\7\15\3\0\5\15\u010b\0\106\15\1\0\1\15\10\0\12\17\246\0"+
    "\66\15\2\0\11\15\77\0\101\15\3\0\1\15\13\0\12\17\46\0"+
    "\70\15\10\0\12\17\u01d6\0\100\15\12\17\25\0\1\15\u01c0\0\71\15"+
    "\u0507\0\u0399\15\147\0\157\15\u0b91\0\u042f\15\u33d1\0\u0239\15\7\0\37\15"+
    "\1\0\12\17\146\0\36\15\2\0\5\15\13\0\67\15\11\0\4\15"+
    "\14\0\12\17\11\0\25\15\5\0\23\15\u0370\0\105\15\13\0\57\15"+
    "\20\0\21\15\u4060\0\2\15\u0bfe\0\153\15\5\0\15\15\3\0\11\15"+
    "\7\0\12\15\3\0\2\15\u14c6\0\5\15\3\0\6\15\10\0\10\15"+
    "\2\0\7\15\36\0\4\15\224\0\3\15\u01bb\0\125\15\1\0\107\15"+
    "\1\0\2\15\2\0\1\15\2\0\2\15\2\0\4\15\1\0\14\15"+
    "\1\0\1\15\1\0\7\15\1\0\101\15\1\0\4\15\2\0\10\15"+
    "\1\0\7\15\1\0\34\15\1\0\4\15\1\0\5\15\1\0\1\15"+
    "\3\0\7\15\1\0\u0154\15\2\0\31\15\1\0\31\15\1\0\37\15"+
    "\1\0\31\15\1\0\37\15\1\0\31\15\1\0\37\15\1\0\31\15"+
    "\1\0\37\15\1\0\31\15\1\0\10\15\2\0\62\17\u1000\0\305\15"+
    "\13\0\7\15\u0529\0\4\15\1\0\33\15\1\0\2\15\1\0\1\15"+
    "\2\0\1\15\1\0\12\15\1\0\4\15\1\0\1\15\1\0\1\15"+
    "\6\0\1\15\4\0\1\15\1\0\1\15\1\0\1\15\1\0\3\15"+
    "\1\0\2\15\1\0\1\15\2\0\1\15\1\0\1\15\1\0\1\15"+
    "\1\0\1\15\1\0\1\15\1\0\2\15\1\0\1\15\2\0\4\15"+
    "\1\0\7\15\1\0\4\15\1\0\4\15\1\0\1\15\1\0\12\15"+
    "\1\0\21\15\5\0\3\15\1\0\5\15\1\0\21\15\u0274\0\32\15"+
    "\6\0\32\15\6\0\32\15\u0e76\0\ua6d7\15\51\0\u1035\15\13\0\336\15"+
    "\u3fe2\0\u021e\15\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\15\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\11\1\12\6\7\1\1\6\7\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\1\1\27\1\0\1\30\3\0"+
    "\1\31\1\0\1\32\2\7\1\33\1\34\3\7\1\35"+
    "\1\36\1\35\1\36\11\7\1\37\1\40\1\41\2\0"+
    "\1\10\1\0\1\10\1\42\1\43\1\7\1\44\1\45"+
    "\4\7\1\46\2\7\1\47\3\7\1\50\1\0\1\51"+
    "\4\7\1\52\1\53\3\7\1\50\1\0\1\7\1\54"+
    "\1\55\2\7\1\56\1\7\1\57\1\0\1\60\1\61"+
    "\1\62\1\7\1\50\1\7\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\67\0\67\0\67\0\334"+
    "\0\u0113\0\u014a\0\u0181\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294"+
    "\0\u02cb\0\u0302\0\u0339\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c"+
    "\0\u0483\0\u04ba\0\67\0\67\0\67\0\67\0\67\0\67"+
    "\0\67\0\67\0\67\0\67\0\u04f1\0\u0528\0\u055f\0\67"+
    "\0\u0596\0\67\0\u05cd\0\u0604\0\u0181\0\67\0\u063b\0\u0672"+
    "\0\u06a9\0\u06e0\0\u0113\0\u0113\0\u0717\0\u074e\0\u0785\0\u0113"+
    "\0\u0113\0\67\0\67\0\u07bc\0\u07f3\0\u082a\0\u0861\0\u0898"+
    "\0\u08cf\0\u0906\0\u093d\0\u0974\0\67\0\67\0\67\0\u09ab"+
    "\0\u09e2\0\u05cd\0\u0a19\0\u0a19\0\67\0\u0113\0\u0a50\0\u0113"+
    "\0\u0113\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0113\0\u0b63\0\u0b9a"+
    "\0\u0113\0\u0bd1\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b"+
    "\0\u0d52\0\u0d89\0\u0dc0\0\u0113\0\u0113\0\u0df7\0\u0e2e\0\u0e65"+
    "\0\u0e9c\0\u0ed3\0\u0f0a\0\u0113\0\u0113\0\u0f41\0\u0f78\0\u0113"+
    "\0\u0faf\0\u0113\0\u0fe6\0\u0113\0\u0113\0\u0113\0\u101d\0\u0ed3"+
    "\0\u1054\0\u0113";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\2\1\4\1\5\1\6\1\7\1\0"+
    "\1\2\1\10\1\2\1\11\1\2\2\12\1\13\1\2"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\11"+
    "\1\23\1\24\1\25\1\26\1\11\1\27\1\30\1\31"+
    "\1\11\1\2\2\11\1\32\1\11\1\2\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\71\0\1\2\70\0\1\51"+
    "\11\0\2\12\61\0\1\52\70\0\4\11\4\0\25\11"+
    "\34\0\2\12\3\0\1\53\1\54\42\0\20\55\1\56"+
    "\1\57\45\55\16\0\2\12\72\0\1\60\57\0\4\11"+
    "\4\0\3\11\1\61\4\11\1\62\14\11\32\0\4\11"+
    "\4\0\2\11\1\63\22\11\32\0\4\11\4\0\11\11"+
    "\1\64\13\11\32\0\4\11\4\0\2\11\1\65\3\11"+
    "\2\66\15\11\32\0\4\11\4\0\5\11\1\67\17\11"+
    "\32\0\4\11\4\0\3\11\1\70\11\11\1\71\7\11"+
    "\45\0\1\72\11\0\1\73\41\0\4\11\4\0\2\11"+
    "\1\74\22\11\32\0\4\11\4\0\1\75\24\11\32\0"+
    "\4\11\4\0\3\11\1\76\21\11\32\0\4\11\4\0"+
    "\5\11\1\77\3\11\1\100\13\11\32\0\4\11\4\0"+
    "\2\11\1\101\10\11\1\102\4\11\1\103\4\11\32\0"+
    "\4\11\4\0\11\11\1\104\13\11\30\0\1\105\66\0"+
    "\1\106\66\0\1\107\54\0\5\110\1\111\1\110\1\0"+
    "\6\110\1\0\35\110\1\0\12\110\16\0\2\112\4\0"+
    "\1\54\46\0\1\113\11\0\2\114\2\0\1\113\44\0"+
    "\1\55\2\0\5\55\2\0\55\55\23\0\1\115\57\0"+
    "\4\11\4\0\1\11\1\116\23\11\32\0\4\11\4\0"+
    "\16\11\2\117\5\11\32\0\4\11\4\0\14\11\1\120"+
    "\10\11\32\0\4\11\4\0\10\11\1\121\14\11\32\0"+
    "\4\11\4\0\6\11\2\122\15\11\32\0\4\11\4\0"+
    "\21\11\1\123\3\11\32\0\4\11\4\0\12\11\1\124"+
    "\1\11\1\125\10\11\32\0\4\11\4\0\1\11\1\126"+
    "\23\11\32\0\4\11\4\0\1\127\24\11\32\0\4\11"+
    "\4\0\20\11\1\130\4\11\32\0\4\11\4\0\11\11"+
    "\1\131\13\11\32\0\4\11\4\0\10\11\1\132\14\11"+
    "\32\0\4\11\4\0\3\11\1\133\21\11\32\0\4\11"+
    "\4\0\1\134\24\11\16\0\6\135\2\0\6\135\1\0"+
    "\35\135\1\0\12\135\5\0\1\136\4\0\1\111\72\0"+
    "\2\114\63\0\4\11\4\0\1\137\24\11\32\0\4\11"+
    "\4\0\10\11\1\140\14\11\32\0\4\11\4\0\13\11"+
    "\1\141\11\11\32\0\4\11\4\0\1\142\24\11\32\0"+
    "\4\11\4\0\20\11\1\143\4\11\32\0\4\11\4\0"+
    "\3\11\1\144\21\11\32\0\4\11\4\0\1\145\24\11"+
    "\32\0\4\11\4\0\16\11\2\146\5\11\32\0\4\11"+
    "\4\0\21\11\1\147\3\11\32\0\4\11\4\0\13\11"+
    "\1\150\11\11\16\0\1\151\3\135\4\151\2\135\55\151"+
    "\1\136\1\0\4\136\1\152\1\136\2\0\55\136\14\0"+
    "\4\11\4\0\6\11\2\153\15\11\32\0\4\11\4\0"+
    "\1\154\24\11\32\0\4\11\4\0\10\11\1\155\14\11"+
    "\32\0\4\11\4\0\13\11\1\156\11\11\32\0\4\11"+
    "\4\0\11\11\1\157\13\11\32\0\4\11\4\0\1\160"+
    "\24\11\32\0\4\11\4\0\14\11\1\161\10\11\32\0"+
    "\4\11\4\0\23\11\2\162\16\0\1\151\2\0\5\151"+
    "\2\0\55\151\1\136\1\0\4\136\1\152\1\136\2\0"+
    "\1\136\1\163\53\136\14\0\4\11\4\0\15\11\1\164"+
    "\7\11\32\0\4\11\4\0\14\11\1\165\10\11\32\0"+
    "\4\11\4\0\3\11\1\166\21\11\32\0\4\11\4\0"+
    "\6\11\2\167\15\11\16\0\1\136\1\0\4\136\1\170"+
    "\1\136\2\0\55\136\14\0\4\11\4\0\2\11\1\171"+
    "\22\11\32\0\4\11\4\0\3\11\1\172\21\11\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4235];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\3\11\23\1\12\11\3\1\1\11"+
    "\1\0\1\11\3\0\1\11\1\0\12\1\2\11\11\1"+
    "\3\11\2\0\1\1\1\0\1\1\1\11\20\1\1\0"+
    "\13\1\1\0\10\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	StringBuffer string = new StringBuffer();

	private Symbol symbol(int type, int yyline, int yycolumn) {
		return new Symbol(type, yyline, yycolumn);
	}
	private Symbol symbol(int type, int yyline, int yycolumn, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LuaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2796) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* Syntax Error */
            }
          case 52: break;
          case 2: 
            { System.out.printf(" MINUS"); return symbol(sym.MINUS, yychar, yyline );
            }
          case 53: break;
          case 3: 
            { System.out.printf(" OPEN_BRACKETS"); return symbol(sym.OPEN_BRACKETS, yychar, yyline );
            }
          case 54: break;
          case 4: 
            { System.out.printf(" CLOSE_BRACKETS"); return symbol(sym.CLOSE_BRACKETS, yychar, yyline );
            }
          case 55: break;
          case 5: 
            { System.out.printf(" CLOSE_BRACES"); return symbol(sym.CLOSE_BRACES, yychar, yyline );
            }
          case 56: break;
          case 6: 
            { System.out.printf(" SIGN"); return symbol(sym.SIGN, yychar, yyline );
            }
          case 57: break;
          case 7: 
            { System.out.printf(" IDENTIFIER"); return symbol(sym.IDENTIFIER, yychar, yyline);
            }
          case 58: break;
          case 8: 
            { System.out.printf(" NUMBER"); return symbol(sym.NUMBER, yychar, yyline);
            }
          case 59: break;
          case 9: 
            { System.out.printf(" PLUS"); return symbol(sym.PLUS, yychar, yyline );
            }
          case 60: break;
          case 10: 
            { System.out.printf(" COMMA"); return symbol(sym.PERIOD, yychar, yyline );
            }
          case 61: break;
          case 11: 
            { System.out.printf(" COLON"); return symbol(sym.COLON, yychar, yyline );
            }
          case 62: break;
          case 12: 
            { System.out.printf(" SEMICOLON"); return symbol(sym.SEMICOLON, yychar, yyline );
            }
          case 63: break;
          case 13: 
            { System.out.printf(" COMMA"); return symbol(sym.COMMA, yychar, yyline );
            }
          case 64: break;
          case 14: 
            { System.out.printf(" OPEN_BRACES"); return symbol(sym.OPEN_BRACES, yychar, yyline );
            }
          case 65: break;
          case 15: 
            { System.out.printf(" OPEN_PARENTHESES"); return symbol(sym.OPEN_PARENTHESES, yychar, yyline );
            }
          case 66: break;
          case 16: 
            { System.out.printf(" CLOSE_PARENTHESES"); return symbol(sym.CLOSE_PARENTHESES, yychar, yyline );
            }
          case 67: break;
          case 17: 
            { System.out.printf(" TIMES"); return symbol(sym.TIMES, yychar, yyline );
            }
          case 68: break;
          case 18: 
            { System.out.printf(" DIV"); return symbol(sym.DIV, yychar, yyline );
            }
          case 69: break;
          case 19: 
            { System.out.printf(" UP_CARET"); return symbol(sym.UP_CARET, yychar, yyline );
            }
          case 70: break;
          case 20: 
            { System.out.printf(" PERCENT"); return symbol(sym.PERCENT, yychar, yyline );
            }
          case 71: break;
          case 21: 
            { System.out.printf(" LESS_THAN"); return symbol(sym.LESS_THAN, yychar, yyline );
            }
          case 72: break;
          case 22: 
            { System.out.printf(" GREATHER_THAN"); return symbol(sym.GREATHER_THAN, yychar, yyline );
            }
          case 73: break;
          case 23: 
            { System.out.printf(" LENGTH"); return symbol(sym.LENGTH, yychar, yyline );
            }
          case 74: break;
          case 24: 
            { System.out.printf(" EQUAL"); return symbol(sym.EQUAL, yychar, yyline );
            }
          case 75: break;
          case 25: 
            { System.out.printf(" STRING"); return symbol(sym.STRING, yychar, yyline);
            }
          case 76: break;
          case 26: 
            { System.out.printf(" TWO_PERIOD"); return symbol(sym.TWO_PERIOD, yychar, yyline );
            }
          case 77: break;
          case 27: 
            { System.out.printf(" DO"); return symbol(sym.DO, yychar, yyline);
            }
          case 78: break;
          case 28: 
            { System.out.printf(" OR"); return symbol(sym.OR, yychar, yyline);
            }
          case 79: break;
          case 29: 
            { System.out.printf(" IN"); return symbol(sym.IN, yychar, yyline );
            }
          case 80: break;
          case 30: 
            { System.out.printf(" IF"); return symbol(sym.IF, yychar, yyline );
            }
          case 81: break;
          case 31: 
            { System.out.printf(" LESS_THAN_EQUAL"); return symbol(sym.LESS_THAN_EQUAL, yychar, yyline );
            }
          case 82: break;
          case 32: 
            { System.out.printf(" GREATHER_THAN_EQUAL"); return symbol(sym.GREATHER_THAN_EQUAL, yychar, yyline );
            }
          case 83: break;
          case 33: 
            { System.out.printf(" DIFFERENT"); return symbol(sym.DIFFERENT, yychar, yyline );
            }
          case 84: break;
          case 34: 
            { System.out.printf(" ELLIPSIS"); return symbol(sym.ELLIPSIS, yychar, yyline );
            }
          case 85: break;
          case 35: 
            { System.out.printf(" END"); return symbol(sym.END, yychar, yyline );
            }
          case 86: break;
          case 36: 
            { System.out.printf(" NOT"); return symbol(sym.NOT, yychar, yyline );
            }
          case 87: break;
          case 37: 
            { System.out.printf(" NIL"); return symbol(sym.NIL, yychar, yyline );
            }
          case 88: break;
          case 38: 
            { System.out.printf(" AND"); return symbol(sym.AND, yychar, yyline );
            }
          case 89: break;
          case 39: 
            { System.out.printf(" FOR"); return symbol(sym.FOR, yychar, yyline );
            }
          case 90: break;
          case 40: 
            { System.out.printf(" COMMENT");
            }
          case 91: break;
          case 41: 
            { System.out.printf(" ELSE"); return symbol(sym.ELSE, yychar, yyline );
            }
          case 92: break;
          case 42: 
            { System.out.printf(" THEN"); return symbol(sym.THEN, yychar, yyline );
            }
          case 93: break;
          case 43: 
            { System.out.printf(" TRUE"); return symbol(sym.TRUE, yychar, yyline );
            }
          case 94: break;
          case 44: 
            { System.out.printf(" WHILE"); return symbol(sym.WHILE, yychar, yyline );
            }
          case 95: break;
          case 45: 
            { System.out.printf(" LOCAL"); return symbol(sym.LOCAL, yychar, yyline );
            }
          case 96: break;
          case 46: 
            { System.out.printf(" FALSE"); return symbol(sym.FALSE, yychar, yyline );
            }
          case 97: break;
          case 47: 
            { System.out.printf(" BREAK"); return symbol(sym.BREAK, yychar, yyline );
            }
          case 98: break;
          case 48: 
            { System.out.printf(" ELSEIF"); return symbol(sym.ELSEIF, yychar, yyline );
            }
          case 99: break;
          case 49: 
            { System.out.printf(" REPEAT"); return symbol(sym.REPEAT, yychar, yyline );
            }
          case 100: break;
          case 50: 
            { System.out.printf(" RETURN"); return symbol(sym.RETURN, yychar, yyline );
            }
          case 101: break;
          case 51: 
            { System.out.printf(" FUNCTION"); return symbol(sym.FUNCTION, yychar, yyline );
            }
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
