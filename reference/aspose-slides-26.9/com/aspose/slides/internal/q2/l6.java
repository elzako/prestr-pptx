package com.aspose.slides.internal.q2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.i4.a1;
import com.aspose.slides.internal.i4.a7;
import com.aspose.slides.internal.i4.b3;
import com.aspose.slides.internal.i4.c5;
import com.aspose.slides.internal.i4.d5;
import com.aspose.slides.internal.i4.d6;
import com.aspose.slides.internal.i4.d9;
import com.aspose.slides.internal.i4.e5;
import com.aspose.slides.internal.i4.f4;
import com.aspose.slides.internal.i4.h2;
import com.aspose.slides.internal.i4.h5;
import com.aspose.slides.internal.i4.i6;
import com.aspose.slides.internal.i4.j6;
import com.aspose.slides.internal.i4.m1;
import com.aspose.slides.internal.i4.n3;
import com.aspose.slides.internal.i4.n7;
import com.aspose.slides.internal.i4.o0;
import com.aspose.slides.internal.i4.p4;
import com.aspose.slides.internal.i4.p6;
import com.aspose.slides.internal.i4.q2;
import com.aspose.slides.internal.i4.r1;
import com.aspose.slides.internal.i4.s0;
import com.aspose.slides.internal.i4.s4;
import com.aspose.slides.internal.i4.t2;
import com.aspose.slides.internal.i4.t3;
import com.aspose.slides.internal.i4.t5;
import com.aspose.slides.internal.i4.u5;
import com.aspose.slides.internal.i4.v3;
import com.aspose.slides.internal.i4.v4;
import com.aspose.slides.internal.i4.v8;
import com.aspose.slides.internal.i4.w8;
import com.aspose.slides.internal.i4.y6;
import com.aspose.slides.internal.i4.y8;
import com.aspose.slides.internal.i4.z1;
import com.aspose.slides.internal.i4.z7;
import com.aspose.slides.internal.l6.a6;
import com.aspose.slides.internal.l6.y4;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n5.a0;
import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.q0;
import com.aspose.slides.internal.n5.r4;
import com.aspose.slides.internal.n5.w1;
import com.aspose.slides.internal.n5.x8;
import com.aspose.slides.internal.n5.y2;
import com.aspose.slides.internal.n5.z8;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.internal.x7n.s7;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.z3;

public class l6 extends z8 {
   public static final String[] k5 = new String[]{
      "<invalid>",
      "<EOR>",
      "<DOWN>",
      "<UP>",
      "NULL",
      "TRUE",
      "FALSE",
      "BREAK",
      "CASE",
      "CATCH",
      "CONTINUE",
      "DEFAULT",
      "DELETE",
      "DO",
      "ELSE",
      "FINALLY",
      "FOR",
      "FUNCTION",
      "IF",
      "IN",
      "INSTANCEOF",
      "NEW",
      "RETURN",
      "SWITCH",
      "THIS",
      "THROW",
      "TRY",
      "TYPEOF",
      "VAR",
      "VOID",
      "WHILE",
      "WITH",
      "ABSTRACT",
      "BOOLEAN",
      "BYTE",
      "CHAR",
      "CLASS",
      "CONST",
      "DEBUGGER",
      "DOUBLE",
      "ENUM",
      "EXPORT",
      "EXTENDS",
      "FINAL",
      "FLOAT",
      "GOTO",
      "IMPLEMENTS",
      "IMPORT",
      "INT",
      "INTERFACE",
      "LONG",
      "NATIVE",
      "PACKAGE",
      "PRIVATE",
      "PROTECTED",
      "PUBLIC",
      "SHORT",
      "STATIC",
      "SUPER",
      "SYNCHRONIZED",
      "THROWS",
      "TRANSIENT",
      "VOLATILE",
      "LBRACE",
      "RBRACE",
      "LPAREN",
      "RPAREN",
      "LBRACK",
      "RBRACK",
      "DOT",
      "SEMIC",
      "COMMA",
      "LT",
      "GT",
      "LTE",
      "GTE",
      "EQ",
      "NEQ",
      "SAME",
      "NSAME",
      "ADD",
      "SUB",
      "MUL",
      "MOD",
      "INC",
      "DEC",
      "SHL",
      "SHR",
      "SHU",
      "AND",
      "OR",
      "XOR",
      "NOT",
      "INV",
      "LAND",
      "LOR",
      "QUE",
      "COLON",
      "ASSIGN",
      "ADDASS",
      "SUBASS",
      "MULASS",
      "MODASS",
      "SHLASS",
      "SHRASS",
      "SHUASS",
      "ANDASS",
      "ORASS",
      "XORASS",
      "DIV",
      "DIVASS",
      "ARGS",
      "ARRAY",
      "BLOCK",
      "BYFIELD",
      "BYINDEX",
      "CALL",
      "CEXPR",
      "EXPR",
      "FORITER",
      "FORSTEP",
      "ITEM",
      "LABELLED",
      "NAMEDVALUE",
      "NEG",
      "OBJECT",
      "PAREXPR",
      "PDEC",
      "PINC",
      "POS",
      "BSLASH",
      "DQUOTE",
      "SQUOTE",
      "TAB",
      "VT",
      "FF",
      "SP",
      "NBSP",
      "USP",
      "WhiteSpace",
      "LF",
      "CR",
      "LS",
      "PS",
      "LineTerminator",
      "EOL",
      "MultiLineComment",
      "SingleLineComment",
      "Identifier",
      "StringLiteral",
      "HexDigit",
      "IdentifierStartASCII",
      "DecimalDigit",
      "IdentifierPart",
      "IdentifierNameASCIIStart",
      "RegularExpressionLiteral",
      "OctalDigit",
      "ExponentPart",
      "DecimalIntegerLiteral",
      "DecimalLiteral",
      "OctalIntegerLiteral",
      "HexIntegerLiteral",
      "CharacterEscapeSequence",
      "ZeroToThree",
      "OctalEscapeSequence",
      "HexEscapeSequence",
      "UnicodeEscapeSequence",
      "EscapeSequence",
      "BackslashSequence",
      "RegularExpressionFirstChar",
      "RegularExpressionChar"
   };
   protected y4 u3 = new a6();
   private s4 e2l = null;
   private boolean v2x = false;
   private static final s7 y9r = new s7();
   private static final j5 u7c = com.aspose.slides.internal.l7h.j5.k5("iso-8859-1");
   private List<String> x2y;
   private static final u9 x5h = new u9("=", "+=", "-=", "*=", "%=", "<<=", ">>=", ">>>=", "&=", "|=", "^=", "/=");
   protected l6$n5 a6 = new l6$n5(this, this);
   protected l6$l6 u9 = new l6$l6(this, this);
   protected l6$k5 h0 = new l6$k5(this, this);
   static final String[] c8 = new String[]{
      "\u0004\u0003\u0002\uffff\u0001\u0003\u0001\uffff\u0002\u0003\u0002\uffff\u0001\u0003\u0001\u0002\u0001\u0003\u0002\uffff\u000b\u0003\u001f\uffff\u0001\u0001\u0001\uffff\u0001\u0003\u0001\uffff\u0001\u0003\u0002\uffff\u0001\u0003\t\uffff\u0002\u0003\u0002\uffff\u0002\u0003\u0006\uffff\u0002\u00036\uffff\u0002\u0003\u0005\uffff\u0001\u0003\u0003\uffff\u0003\u0003",
      "\u0001\uffff",
      "\u0001\uffff",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      ""
   };
   static final short[] t2 = com.aspose.slides.internal.n5.x8.n5("(\uffff");
   static final short[] s7 = com.aspose.slides.internal.n5.x8.n5("(\uffff");
   static final char[] x8 = com.aspose.slides.internal.n5.x8.l6("\u0001\u0004\u0002\u0000%\uffff");
   static final char[] n3 = com.aspose.slides.internal.n5.x8.l6("\u0001¡\u0002\u0000%\uffff");
   static final short[] y4 = com.aspose.slides.internal.n5.x8.n5("\u0003\uffff\u0001\u0003\"\uffff\u0001\u0001\u0001\u0002");
   static final short[] e2 = com.aspose.slides.internal.n5.x8.n5("\u0001\uffff\u0001\u0000\u0001\u0001%\uffff}>");
   static final short[][] t9;
   static final String[] z1;
   static final short[] t4;
   static final short[] q0;
   static final char[] z3;
   static final char[] m1;
   static final short[] k7;
   static final short[] m3;
   static final short[][] z8;
   static final String[] j5;
   static final short[] w1;
   static final short[] r4;
   static final char[] c4;
   static final char[] y2;
   static final short[] y1;
   static final short[] a0;
   static final short[][] d2;
   public static final com.aspose.slides.internal.n5.a6 d5;
   public static final com.aspose.slides.internal.n5.a6 s3;
   public static final com.aspose.slides.internal.n5.a6 p8;
   public static final com.aspose.slides.internal.n5.a6 f2;
   public static final com.aspose.slides.internal.n5.a6 i1;
   public static final com.aspose.slides.internal.n5.a6 e5;
   public static final com.aspose.slides.internal.n5.a6 b3;
   public static final com.aspose.slides.internal.n5.a6 o0;
   public static final com.aspose.slides.internal.n5.a6 z7;
   public static final com.aspose.slides.internal.n5.a6 v4;
   public static final com.aspose.slides.internal.n5.a6 u6;
   public static final com.aspose.slides.internal.n5.a6 t1;
   public static final com.aspose.slides.internal.n5.a6 a5;
   public static final com.aspose.slides.internal.n5.a6 h2;
   public static final com.aspose.slides.internal.n5.a6 v0;
   public static final com.aspose.slides.internal.n5.a6 f0;
   public static final com.aspose.slides.internal.n5.a6 a3;
   public static final com.aspose.slides.internal.n5.a6 p3;
   public static final com.aspose.slides.internal.n5.a6 x9;
   public static final com.aspose.slides.internal.n5.a6 y0;
   public static final com.aspose.slides.internal.n5.a6 j9;
   public static final com.aspose.slides.internal.n5.a6 z6;
   public static final com.aspose.slides.internal.n5.a6 e9;
   public static final com.aspose.slides.internal.n5.a6 o5;
   public static final com.aspose.slides.internal.n5.a6 j8;
   public static final com.aspose.slides.internal.n5.a6 w2;
   public static final com.aspose.slides.internal.n5.a6 s0;
   public static final com.aspose.slides.internal.n5.a6 v8;
   public static final com.aspose.slides.internal.n5.a6 v3;
   public static final com.aspose.slides.internal.n5.a6 g7;
   public static final com.aspose.slides.internal.n5.a6 j4;
   public static final com.aspose.slides.internal.n5.a6 i9;
   public static final com.aspose.slides.internal.n5.a6 f5;
   public static final com.aspose.slides.internal.n5.a6 j3;
   public static final com.aspose.slides.internal.n5.a6 n1;
   public static final com.aspose.slides.internal.n5.a6 p6;
   public static final com.aspose.slides.internal.n5.a6 d1;
   public static final com.aspose.slides.internal.n5.a6 s4;
   public static final com.aspose.slides.internal.n5.a6 h6;
   public static final com.aspose.slides.internal.n5.a6 y8;
   public static final com.aspose.slides.internal.n5.a6 c3;
   public static final com.aspose.slides.internal.n5.a6 l4;
   public static final com.aspose.slides.internal.n5.a6 i6;
   public static final com.aspose.slides.internal.n5.a6 a7;
   public static final com.aspose.slides.internal.n5.a6 r8;
   public static final com.aspose.slides.internal.n5.a6 r1;
   public static final com.aspose.slides.internal.n5.a6 y5;
   public static final com.aspose.slides.internal.n5.a6 k8;
   public static final com.aspose.slides.internal.n5.a6 b5;
   public static final com.aspose.slides.internal.n5.a6 u8;
   public static final com.aspose.slides.internal.n5.a6 w5;
   public static final com.aspose.slides.internal.n5.a6 q1;
   public static final com.aspose.slides.internal.n5.a6 u5;
   public static final com.aspose.slides.internal.n5.a6 w8;
   public static final com.aspose.slides.internal.n5.a6 c2;
   public static final com.aspose.slides.internal.n5.a6 t3;
   public static final com.aspose.slides.internal.n5.a6 u4;
   public static final com.aspose.slides.internal.n5.a6 s9;
   public static final com.aspose.slides.internal.n5.a6 p7;
   public static final com.aspose.slides.internal.n5.a6 z5;
   public static final com.aspose.slides.internal.n5.a6 h5;
   public static final com.aspose.slides.internal.n5.a6 a8;
   public static final com.aspose.slides.internal.n5.a6 f4;
   public static final com.aspose.slides.internal.n5.a6 y9;
   public static final com.aspose.slides.internal.n5.a6 a1;
   public static final com.aspose.slides.internal.n5.a6 w3;
   public static final com.aspose.slides.internal.n5.a6 i4;
   public static final com.aspose.slides.internal.n5.a6 q3;
   public static final com.aspose.slides.internal.n5.a6 q2;
   public static final com.aspose.slides.internal.n5.a6 p4;
   public static final com.aspose.slides.internal.n5.a6 d6;
   public static final com.aspose.slides.internal.n5.a6 y6;
   public static final com.aspose.slides.internal.n5.a6 n7;
   public static final com.aspose.slides.internal.n5.a6 l5;
   public static final com.aspose.slides.internal.n5.a6 u2;
   public static final com.aspose.slides.internal.n5.a6 d9;
   public static final com.aspose.slides.internal.n5.a6 c5;
   public static final com.aspose.slides.internal.n5.a6 t5;
   public static final com.aspose.slides.internal.n5.a6 j6;
   public static final com.aspose.slides.internal.n5.a6 w9;
   public static final com.aspose.slides.internal.n5.a6 m8;
   public static final com.aspose.slides.internal.n5.a6 b9;
   public static final com.aspose.slides.internal.n5.a6 r6;
   public static final com.aspose.slides.internal.n5.a6 r5;
   public static final com.aspose.slides.internal.n5.a6 h9;
   public static final com.aspose.slides.internal.n5.a6 r7;
   public static final com.aspose.slides.internal.n5.a6 n9;
   public static final com.aspose.slides.internal.n5.a6 a2;
   public static final com.aspose.slides.internal.n5.a6 h1;
   public static final com.aspose.slides.internal.n5.a6 t6;
   public static final com.aspose.slides.internal.n5.a6 v6;
   public static final com.aspose.slides.internal.n5.a6 x0;
   public static final com.aspose.slides.internal.n5.a6 o2;
   public static final com.aspose.slides.internal.n5.a6 e0;
   public static final com.aspose.slides.internal.n5.a6 i2;
   public static final com.aspose.slides.internal.n5.a6 x7;
   public static final com.aspose.slides.internal.n5.a6 z0;
   public static final com.aspose.slides.internal.n5.a6 z9;
   public static final com.aspose.slides.internal.n5.a6 f8;
   public static final com.aspose.slides.internal.n5.a6 s2;
   public static final com.aspose.slides.internal.n5.a6 n2;
   public static final com.aspose.slides.internal.n5.a6 l0;
   public static final com.aspose.slides.internal.n5.a6 p9;
   public static final com.aspose.slides.internal.n5.a6 g8;
   public static final com.aspose.slides.internal.n5.a6 i0;
   public static final com.aspose.slides.internal.n5.a6 b4;
   public static final com.aspose.slides.internal.n5.a6 x5;
   public static final com.aspose.slides.internal.n5.a6 i8;
   public static final com.aspose.slides.internal.n5.a6 a4;
   public static final com.aspose.slides.internal.n5.a6 x3;
   public static final com.aspose.slides.internal.n5.a6 b2;
   public static final com.aspose.slides.internal.n5.a6 m4;
   public static final com.aspose.slides.internal.n5.a6 b1;
   public static final com.aspose.slides.internal.n5.a6 j1;
   public static final com.aspose.slides.internal.n5.a6 k6;
   public static final com.aspose.slides.internal.n5.a6 o7;
   public static final com.aspose.slides.internal.n5.a6 v9;
   public static final com.aspose.slides.internal.n5.a6 r9;
   public static final com.aspose.slides.internal.n5.a6 c7;
   public static final com.aspose.slides.internal.n5.a6 w4;
   public static final com.aspose.slides.internal.n5.a6 n0;
   public static final com.aspose.slides.internal.n5.a6 f1;
   public static final com.aspose.slides.internal.n5.a6 k2;
   public static final com.aspose.slides.internal.n5.a6 o8;
   public static final com.aspose.slides.internal.n5.a6 n8;
   public static final com.aspose.slides.internal.n5.a6 t0;
   public static final com.aspose.slides.internal.n5.a6 n6;
   public static final com.aspose.slides.internal.n5.a6 p5;
   public static final com.aspose.slides.internal.n5.a6 b0;
   public static final com.aspose.slides.internal.n5.a6 r0;
   public static final com.aspose.slides.internal.n5.a6 k3;
   public static final com.aspose.slides.internal.n5.a6 d7;
   public static final com.aspose.slides.internal.n5.a6 o1;
   public static final com.aspose.slides.internal.n5.a6 m0;
   public static final com.aspose.slides.internal.n5.a6 o4;
   public static final com.aspose.slides.internal.n5.a6 k1;
   public static final com.aspose.slides.internal.n5.a6 o6;
   public static final com.aspose.slides.internal.n5.a6 g2;
   public static final com.aspose.slides.internal.n5.a6 l8;
   public static final com.aspose.slides.internal.n5.a6 s8;
   public static final com.aspose.slides.internal.n5.a6 i3;
   public static final com.aspose.slides.internal.n5.a6 q6;
   public static final com.aspose.slides.internal.n5.a6 g1;
   public static final com.aspose.slides.internal.n5.a6 k4;
   public static final com.aspose.slides.internal.n5.a6 e8;
   public static final com.aspose.slides.internal.n5.a6 b6;
   public static final com.aspose.slides.internal.n5.a6 v7;
   public static final com.aspose.slides.internal.n5.a6 t7;
   public static final com.aspose.slides.internal.n5.a6 c9;
   public static final com.aspose.slides.internal.n5.a6 d3;
   public static final com.aspose.slides.internal.n5.a6 o3;
   public static final com.aspose.slides.internal.n5.a6 l1;
   public static final com.aspose.slides.internal.n5.a6 y7;
   public static final com.aspose.slides.internal.n5.a6 i7;
   public static final com.aspose.slides.internal.n5.a6 c6;
   public static final com.aspose.slides.internal.n5.a6 x1;
   public static final com.aspose.slides.internal.n5.a6 s6;
   public static final com.aspose.slides.internal.n5.a6 b7;
   public static final com.aspose.slides.internal.n5.a6 b8;
   public static final com.aspose.slides.internal.n5.a6 q7;
   public static final com.aspose.slides.internal.n5.a6 r3;
   public static final com.aspose.slides.internal.n5.a6 q8;
   public static final com.aspose.slides.internal.n5.a6 w0;
   public static final com.aspose.slides.internal.n5.a6 p1;
   public static final com.aspose.slides.internal.n5.a6 q9;
   public static final com.aspose.slides.internal.n5.a6 x6;
   public static final com.aspose.slides.internal.n5.a6 m9;
   public static final com.aspose.slides.internal.n5.a6 r2;
   public static final com.aspose.slides.internal.n5.a6 l7;
   public static final com.aspose.slides.internal.n5.a6 q5;
   public static final com.aspose.slides.internal.n5.a6 e4;
   public static final com.aspose.slides.internal.n5.a6 g6;
   public static final com.aspose.slides.internal.n5.a6 o9;
   public static final com.aspose.slides.internal.n5.a6 a9;
   public static final com.aspose.slides.internal.n5.a6 u0;
   public static final com.aspose.slides.internal.n5.a6 d8;
   public static final com.aspose.slides.internal.n5.a6 q4;
   public static final com.aspose.slides.internal.n5.a6 f7;
   public static final com.aspose.slides.internal.n5.a6 k9;
   public static final com.aspose.slides.internal.n5.a6 s5;
   public static final com.aspose.slides.internal.n5.a6 l2;
   public static final com.aspose.slides.internal.n5.a6 j7;
   public static final com.aspose.slides.internal.n5.a6 k0;
   public static final com.aspose.slides.internal.n5.a6 d4;
   public static final com.aspose.slides.internal.n5.a6 v2;
   public static final com.aspose.slides.internal.n5.a6 e7;
   public static final com.aspose.slides.internal.n5.a6 e6;
   public static final com.aspose.slides.internal.n5.a6 j0;
   public static final com.aspose.slides.internal.n5.a6 u1;
   public static final com.aspose.slides.internal.n5.a6 x2;
   public static final com.aspose.slides.internal.n5.a6 p0;
   public static final com.aspose.slides.internal.n5.a6 s1;
   public static final com.aspose.slides.internal.n5.a6 g9;
   public static final com.aspose.slides.internal.n5.a6 l9;
   public static final com.aspose.slides.internal.n5.a6 z2;
   public static final com.aspose.slides.internal.n5.a6 m5;
   public static final com.aspose.slides.internal.n5.a6 v5;
   public static final com.aspose.slides.internal.n5.a6 p2;
   public static final com.aspose.slides.internal.n5.a6 v1;
   public static final com.aspose.slides.internal.n5.a6 g4;
   public static final com.aspose.slides.internal.n5.a6 h7;
   public static final com.aspose.slides.internal.n5.a6 m6;
   public static final com.aspose.slides.internal.n5.a6 t8;
   public static final com.aspose.slides.internal.n5.a6 f3;
   public static final com.aspose.slides.internal.n5.a6 g3;
   public static final com.aspose.slides.internal.n5.a6 e1;
   public static final com.aspose.slides.internal.n5.a6 m2;
   public static final com.aspose.slides.internal.n5.a6 g0;
   public static final com.aspose.slides.internal.n5.a6 i5;
   public static final com.aspose.slides.internal.n5.a6 j2;
   public static final com.aspose.slides.internal.n5.a6 w6;
   public static final com.aspose.slides.internal.n5.a6 g5;
   public static final com.aspose.slides.internal.n5.a6 h8;
   public static final com.aspose.slides.internal.n5.a6 m7;
   public static final com.aspose.slides.internal.n5.a6 h4;
   public static final com.aspose.slides.internal.n5.a6 w7;
   public static final com.aspose.slides.internal.n5.a6 e3;
   public static final com.aspose.slides.internal.n5.a6 f9;
   public static final com.aspose.slides.internal.n5.a6 n4;
   public static final com.aspose.slides.internal.n5.a6 y3;
   public static final com.aspose.slides.internal.n5.a6 u7;
   public static final com.aspose.slides.internal.n5.a6 x4;
   public static final com.aspose.slides.internal.n5.a6 z4;
   public static final com.aspose.slides.internal.n5.a6 h3;
   public static final com.aspose.slides.internal.n5.a6 d0;
   public static final com.aspose.slides.internal.n5.a6 c1;
   public static final com.aspose.slides.internal.n5.a6 l3;
   public static final com.aspose.slides.internal.n5.a6 c0;
   public static final com.aspose.slides.internal.n5.a6 f6;
   public static final com.aspose.slides.internal.n5.a6 f1s;
   public static final com.aspose.slides.internal.n5.a6 k0t;
   public static final com.aspose.slides.internal.n5.a6 e6r;
   public static final com.aspose.slides.internal.n5.a6 p5k;
   public static final com.aspose.slides.internal.n5.a6 z6z;
   public static final com.aspose.slides.internal.n5.a6 y9w;
   public static final com.aspose.slides.internal.n5.a6 i0e;
   public static final com.aspose.slides.internal.n5.a6 f6z;
   public static final com.aspose.slides.internal.n5.a6 u1s;
   public static final com.aspose.slides.internal.n5.a6 t4r;
   public static final com.aspose.slides.internal.n5.a6 e5a;
   public static final com.aspose.slides.internal.n5.a6 r3q;
   public static final com.aspose.slides.internal.n5.a6 d4n;
   public static final com.aspose.slides.internal.n5.a6 f8y;
   public static final com.aspose.slides.internal.n5.a6 o9b;
   public static final com.aspose.slides.internal.n5.a6 x4g;
   public static final com.aspose.slides.internal.n5.a6 j9e;
   public static final com.aspose.slides.internal.n5.a6 n3c;
   public static final com.aspose.slides.internal.n5.a6 v7u;
   public static final com.aspose.slides.internal.n5.a6 x7n;
   public static final com.aspose.slides.internal.n5.a6 z0k;
   public static final com.aspose.slides.internal.n5.a6 g8v;
   public static final com.aspose.slides.internal.n5.a6 k1d;
   public static final com.aspose.slides.internal.n5.a6 v2s;
   public static final com.aspose.slides.internal.n5.a6 f1c;
   public static final com.aspose.slides.internal.n5.a6 p6w;
   public static final com.aspose.slides.internal.n5.a6 p4l;
   public static final com.aspose.slides.internal.n5.a6 p6t;
   public static final com.aspose.slides.internal.n5.a6 e3m;
   public static final com.aspose.slides.internal.n5.a6 k9m;
   public static final com.aspose.slides.internal.n5.a6 h3d;
   public static final com.aspose.slides.internal.n5.a6 u6p;
   public static final com.aspose.slides.internal.n5.a6 o8m;
   public static final com.aspose.slides.internal.n5.a6 f3c;
   public static final com.aspose.slides.internal.n5.a6 j2p;
   public static final com.aspose.slides.internal.n5.a6 u0a;
   public static final com.aspose.slides.internal.n5.a6 w1n;
   public static final com.aspose.slides.internal.n5.a6 m6n;
   public static final com.aspose.slides.internal.n5.a6 l7h;
   public static final com.aspose.slides.internal.n5.a6 r7c;
   public static final com.aspose.slides.internal.n5.a6 l2p;
   public static final com.aspose.slides.internal.n5.a6 r5t;
   public static final com.aspose.slides.internal.n5.a6 r6i;
   public static final com.aspose.slides.internal.n5.a6 h3r;
   public static final com.aspose.slides.internal.n5.a6 n5u;
   public static final com.aspose.slides.internal.n5.a6 b8c;
   public static final com.aspose.slides.internal.n5.a6 t1z;
   public static final com.aspose.slides.internal.n5.a6 d0p;
   public static final com.aspose.slides.internal.n5.a6 x6s;
   public static final com.aspose.slides.internal.n5.a6 s5g;
   public static final com.aspose.slides.internal.n5.a6 k4s;
   public static final com.aspose.slides.internal.n5.a6 x7i;
   public static final com.aspose.slides.internal.n5.a6 r5d;
   public static final com.aspose.slides.internal.n5.a6 v9e;
   public static final com.aspose.slides.internal.n5.a6 t9p;
   public static final com.aspose.slides.internal.n5.a6 w4w;
   public static final com.aspose.slides.internal.n5.a6 c9b;
   public static final com.aspose.slides.internal.n5.a6 r5w;
   public static final com.aspose.slides.internal.n5.a6 t5g;
   public static final com.aspose.slides.internal.n5.a6 m5l;
   public static final com.aspose.slides.internal.n5.a6 k3h;
   public static final com.aspose.slides.internal.n5.a6 u4k;
   public static final com.aspose.slides.internal.n5.a6 g1p;
   public static final com.aspose.slides.internal.n5.a6 c4t;
   public static final com.aspose.slides.internal.n5.a6 z1n;
   public static final com.aspose.slides.internal.n5.a6 k2p;
   public static final com.aspose.slides.internal.n5.a6 u7f;
   public static final com.aspose.slides.internal.n5.a6 s1o;
   public static final com.aspose.slides.internal.n5.a6 n2z;
   public static final com.aspose.slides.internal.n5.a6 w8d;
   public static final com.aspose.slides.internal.n5.a6 l8r;
   public static final com.aspose.slides.internal.n5.a6 x1f;
   public static final com.aspose.slides.internal.n5.a6 o3i;
   public static final com.aspose.slides.internal.n5.a6 z6e;
   public static final com.aspose.slides.internal.n5.a6 g4u;
   public static final com.aspose.slides.internal.n5.a6 y8m;
   public static final com.aspose.slides.internal.n5.a6 c7f;
   public static final com.aspose.slides.internal.n5.a6 c1x;
   public static final com.aspose.slides.internal.n5.a6 j8m;
   public static final com.aspose.slides.internal.n5.a6 p7x;
   public static final com.aspose.slides.internal.n5.a6 o6t;
   public static final com.aspose.slides.internal.n5.a6 l1b;
   public static final com.aspose.slides.internal.n5.a6 n9q;
   public static final com.aspose.slides.internal.n5.a6 d2n;
   public static final com.aspose.slides.internal.n5.a6 g2x;
   public static final com.aspose.slides.internal.n5.a6 s2b;
   public static final com.aspose.slides.internal.n5.a6 o5k;
   public static final com.aspose.slides.internal.n5.a6 n1g;
   public static final com.aspose.slides.internal.n5.a6 q8g;
   public static final com.aspose.slides.internal.n5.a6 e6a;
   public static final com.aspose.slides.internal.n5.a6 x4a;
   public static final com.aspose.slides.internal.n5.a6 r7n;
   public static final com.aspose.slides.internal.n5.a6 f3l;
   public static final com.aspose.slides.internal.n5.a6 p2i;
   public static final com.aspose.slides.internal.n5.a6 c9t;
   public static final com.aspose.slides.internal.n5.a6 m4d;
   public static final com.aspose.slides.internal.n5.a6 g3y;
   public static final com.aspose.slides.internal.n5.a6 d2a;
   public static final com.aspose.slides.internal.n5.a6 r6a;
   public static final com.aspose.slides.internal.n5.a6 c5q;
   public static final com.aspose.slides.internal.n5.a6 p6r;
   public static final com.aspose.slides.internal.n5.a6 e8p;
   public static final com.aspose.slides.internal.n5.a6 e4w;
   public static final com.aspose.slides.internal.n5.a6 y4k;
   public static final com.aspose.slides.internal.n5.a6 h6l;
   public static final com.aspose.slides.internal.n5.a6 q4d;
   public static final com.aspose.slides.internal.n5.a6 q9u;
   public static final com.aspose.slides.internal.n5.a6 y5s;
   public static final com.aspose.slides.internal.n5.a6 b9y;
   public static final com.aspose.slides.internal.n5.a6 d9m;
   public static final com.aspose.slides.internal.n5.a6 g9t;

   public l6(a0 var1) {
      this(var1, new r4());
   }

   public l6(a0 var1, r4 var2) {
      super(var1, var2);
   }

   @Override
   public String[] u9() {
      return k5;
   }

   private boolean n5(e5 var1, Object[] var2) {
      if (var2[0] != null) {
         return com.aspose.slides.ms.System.z3.n5(var2[0]);
      }

      boolean var3;
      if (n5(var1)) {
         switch (this.l6.n5(1)) {
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 110:
               var3 = true;
               break;
            case 109:
            default:
               var3 = false;
         }
      } else {
         var3 = false;
      }

      var2[0] = com.aspose.slides.internal.v6g.k5.n5(var3);
      return var3;
   }

   private static boolean n5(e5 var0) {
      return var0 == null
         ? true
         : com.aspose.slides.internal.v6g.k5.l6(var0, s0.class)
            || com.aspose.slides.internal.v6g.k5.l6(var0, t3.class)
            || com.aspose.slides.internal.v6g.k5.l6(var0, i6.class);
   }

   private boolean l6(e5 var1, Object[] var2) {
      if (var2[0] != null) {
         return com.aspose.slides.ms.System.z3.n5(var2[0]);
      }

      boolean var3 = n5(var1) && this.l6.n5(1) == 19;
      var2[0] = com.aspose.slides.internal.v6g.k5.n5(var3);
      return var3;
   }

   private void n5(com.aspose.slides.internal.n5.j5 var1) {
      y2 var2 = this.l6.u9(1);
      int var3 = var2.n5();
      if (var3 != 70 && var3 != -1 && var3 != 64 && var3 != 145 && var3 != 146) {
         for (int var4 = var2.u9() - 1; var4 > 0; var4--) {
            var2 = this.l6.c8(var4);
            if (var2.a6() == 0) {
               break;
            }

            if (var2.n5() == 145
               || var2.n5() == 146 && (com.aspose.slides.ms.System.d1.k5(var2.l6(), "\r") || com.aspose.slides.ms.System.d1.k5(var2.l6(), "\n"))) {
               var2.k5(0);
               this.l6.u3(var2.u9());
               if (var1 != null) {
                  var1.n5 = var2;
               }
               break;
            }
         }
      }
   }

   private String k5(String var1) {
      return com.aspose.slides.ms.System.d1.l6(var1, 1, com.aspose.slides.ms.System.d1.k5(var1, '/') - 1);
   }

   private String u3(String var1) {
      return var1.charAt(var1.length() - 1) != '/'
         ? com.aspose.slides.ms.System.d1.k5(var1, com.aspose.slides.ms.System.d1.k5(var1, '/') + 1)
         : com.aspose.slides.ms.System.d1.n5;
   }

   private String a6(String var1) {
      a5 var2 = new a5(var1.length());
      int var3 = 1;
      int var4 = -1;

      while ((var4 = com.aspose.slides.ms.System.d1.l6(var1, '\\', var3)) != -1) {
         var2.n5(com.aspose.slides.ms.System.d1.l6(var1, var3, var4 - var3));
         char var5 = var1.charAt(var4 + 1);
         switch (var5) {
            case '\n':
               var4 += 2;
               break;
            case '\r':
               if (var1.charAt(var4 + 2) == '\n') {
                  var4 += 3;
               }
               break;
            case '"':
               var2.n5('"');
               var4 += 2;
               break;
            case '\'':
               var2.n5('\'');
               var4 += 2;
               break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
               String var6 = com.aspose.slides.ms.System.d1.l6(var1, var4 + 1, 3);
               char var7 = u7c.n5(new byte[]{com.aspose.slides.ms.System.z3.n5(var6, 8)})[0];
               var2.n5(var7);
               var4 += 4;
               break;
            case '\\':
               var2.n5('\\');
               var4 += 2;
               break;
            case 'b':
               var2.n5('\b');
               var4 += 2;
               break;
            case 'f':
               var2.n5('\f');
               var4 += 2;
               break;
            case 'n':
               var2.n5('\n');
               var4 += 2;
               break;
            case 'r':
               var2.n5('\r');
               var4 += 2;
               break;
            case 't':
               var2.n5('\t');
               var4 += 2;
               break;
            case 'u':
               char var10 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var1, var4 + 2, 4), 512));
               var2.n5(var10);
               var4 += 6;
               break;
            case 'v':
               var2.n5('\u000b');
               var4 += 2;
               break;
            case 'x':
               String var8 = com.aspose.slides.ms.System.d1.l6(var1, var4 + 2, 2);
               char var9 = u7c.n5(new byte[]{com.aspose.slides.ms.System.z3.n5(var8, 16)})[0];
               var2.n5(var9);
               var4 += 4;
               break;
            default:
               var2.n5(var5);
               var4 += 2;
         }

         var3 = var4;
      }

      if (var2.l6() == 0) {
         return com.aspose.slides.ms.System.d1.l6(var1, 1, var1.length() - 2);
      }

      var2.n5(com.aspose.slides.ms.System.d1.l6(var1, var3, var1.length() - var3 - 1));
      return var2.toString();
   }

   public List<String> h0() {
      return this.x2y;
   }

   public void n5(List<String> var1) {
      this.x2y = var1;
   }

   @Override
   public void n5(String[] var1, w1 var2) {
      super.n5(var1, var2);
      if (this.h0() == null) {
         this.n5(new List<>());
      }

      String var3 = this.l6(var2);
      String var4 = this.n5(var2, var1);
      this.h0().addItem(com.aspose.slides.ms.System.d1.n5(new String[]{var4, " at ", var3}));
   }

   public int l6(String var1) {
      switch (x5h.n5(var1)) {
         case 0:
            return 0;
         case 1:
            return 4;
         case 2:
            return 5;
         case 3:
            return 1;
         case 4:
            return 3;
         case 5:
            return 6;
         case 6:
            return 7;
         case 7:
            return 8;
         case 8:
            return 9;
         case 9:
            return 10;
         case 10:
            return 11;
         case 11:
            return 2;
         default:
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid assignment operator: ", var1}));
      }
   }

   @Override
   public void n5(String var1) {
   }

   public final l6$p3 c8() throws w1 {
      l6$p3 var1 = new l6$p3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$z3 var6 = null;
      l6$w2 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;

      try {
         try {
            byte var11 = 5;
            switch (this.l6.n5(1)) {
               case 4:
                  var11 = 1;
                  break;
               case 5:
               case 6:
                  var11 = 2;
                  break;
               case 149:
                  var11 = 4;
                  break;
               case 155:
                  var11 = 5;
                  break;
               case 159:
               case 160:
               case 161:
                  var11 = 3;
                  break;
               default:
                  throw new m3("", 3, 0, this.l6);
            }

            switch (var11) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 4, a5);
                  var8 = this.u3.n5(var3);
                  this.u3.l6(var2, var8);
                  var1.k5 = new s0(var3.l6());
                  break;
               case 2:
                  var2 = this.u3.n5();
                  this.n5(h2);
                  var6 = this.t2();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5 = new d9(com.aspose.slides.internal.v6g.k5.n5(var6.k5), 3);
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(v0);
                  var7 = this.s7();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = new d9(com.aspose.slides.internal.v6g.k5.n5(var7.k5), 14);
                  break;
               case 4:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, 149, f0);
                  var9 = this.u3.n5(var4);
                  this.u3.l6(var2, var9);
                  var1.k5 = new d9(this.a6(var4.l6()), 18);
                  break;
               case 5:
                  var2 = this.u3.n5();
                  var5 = (y2)this.n5(this.l6, 155, a3);
                  var10 = this.u3.n5(var5);
                  this.u3.l6(var2, var10);
                  var1.k5 = new h5(this.k5(var5.l6()), this.u3(var5.l6()));
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$z3 t2() throws w1 {
      l6$z3 var1 = new l6$z3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      Object var5 = null;
      Object var6 = null;

      try {
         try {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 5) {
               var7 = 1;
            } else {
               if (var8 != 6) {
                  throw new m3("", 4, 0, this.l6);
               }

               var7 = 2;
            }

            switch (var7) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 5, p3);
                  var5 = this.u3.n5(var3);
                  this.u3.l6(var2, var5);
                  var1.k5 = true;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, 6, x9);
                  var6 = this.u3.n5(var4);
                  this.u3.l6(var2, var6);
                  var1.k5 = false;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var12) {
            this.n5(var12);
            this.n5(this.l6, var12);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$w2 s7() throws w1 {
      l6$w2 var1 = new l6$w2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      Object var6 = null;
      Object var7 = null;
      Object var8 = null;

      try {
         try {
            byte var9 = 3;
            switch (this.l6.n5(1)) {
               case 159:
                  var9 = 1;
                  break;
               case 160:
                  var9 = 2;
                  break;
               case 161:
                  var9 = 3;
                  break;
               default:
                  throw new m3("", 5, 0, this.l6);
            }

            switch (var9) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 159, y0);
                  var6 = this.u3.n5(var3);
                  this.u3.l6(var2, var6);
                  var1.k5 = com.aspose.slides.ms.System.d2.n5(var3.l6(), 167, y9r);
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, 160, j9);
                  var7 = this.u3.n5(var4);
                  this.u3.l6(var2, var7);
                  var1.k5 = com.aspose.slides.ms.System.z3.u3(var4.l6(), 8);
                  break;
               case 3:
                  var2 = this.u3.n5();
                  var5 = (y2)this.n5(this.l6, 161, z6);
                  var8 = this.u3.n5(var5);
                  this.u3.l6(var2, var8);
                  var1.k5 = com.aspose.slides.ms.System.z3.u3(var5.l6(), 16);
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var13) {
            this.n5(var13);
            this.n5(this.l6, var13);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$g7 x8() throws w1 {
      l6$g7 var1 = new l6$g7();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      l6$p3 var7 = null;
      l6$c8 var8 = null;
      l6$s0 var9 = null;
      l6$s3 var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;

      try {
         try {
            byte var15 = 6;
            switch (this.l6.n5(1)) {
               case 4:
               case 5:
               case 6:
               case 149:
               case 155:
               case 159:
               case 160:
               case 161:
                  var15 = 3;
                  break;
               case 24:
                  var15 = 1;
                  break;
               case 63:
                  var15 = 5;
                  break;
               case 65:
                  var15 = 6;
                  break;
               case 67:
                  var15 = 4;
                  break;
               case 148:
                  var15 = 2;
                  break;
               default:
                  throw new m3("", 6, 0, this.l6);
            }

            switch (var15) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 24, e9);
                  var11 = this.u3.n5(var3);
                  this.u3.l6(var2, var11);
                  var1.k5 = new s0(var3.l6());
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, 148, o5);
                  var12 = this.u3.n5(var4);
                  this.u3.l6(var2, var12);
                  var1.k5 = new s0(var4.l6());
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(j8);
                  var7 = this.c8();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = var7.k5;
                  break;
               case 4:
                  var2 = this.u3.n5();
                  this.n5(w2);
                  var8 = this.n3();
                  this.n5.l6--;
                  this.u3.l6(var2, var8.n5());
                  var1.k5 = var8.k5;
                  break;
               case 5:
                  var2 = this.u3.n5();
                  this.n5(s0);
                  var9 = this.e2();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  var1.k5 = var9.k5;
                  break;
               case 6:
                  var2 = this.u3.n5();
                  var5 = (y2)this.n5(this.l6, 65, v8);
                  var13 = this.u3.n5(var5);
                  this.u3.l6(var2, var13);
                  this.n5(v3);
                  var10 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var10.n5());
                  var6 = (y2)this.n5(this.l6, 66, g7);
                  var14 = this.u3.n5(var6);
                  this.u3.l6(var2, var14);
                  var1.k5 = var10.k5;
                  this.v2x = com.aspose.slides.internal.v6g.k5.l6(var10.k5, r1.class);
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var19) {
            this.n5(var19);
            this.n5(this.l6, var19);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var19);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$c8 n3() throws w1 {
      l6$c8 var1 = new l6$c8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$h0 var6 = null;
      l6$h0 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      var1.k5 = new com.aspose.slides.internal.i4.u9();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 67, j4);
            var8 = this.u3.n5(var3);
            this.u3.l6(var2, var8);
            byte var11 = 2;
            int var12 = this.l6.n5(1);
            if ((var12 < 4 || var12 > 6)
               && var12 != 12
               && var12 != 17
               && var12 != 21
               && var12 != 24
               && var12 != 27
               && var12 != 29
               && var12 != 63
               && var12 != 65
               && var12 != 67
               && var12 != 71
               && (var12 < 80 || var12 > 81)
               && (var12 < 84 || var12 > 85)
               && (var12 < 92 || var12 > 93)
               && (var12 < 148 || var12 > 149)
               && var12 != 155
               && (var12 < 159 || var12 > 161)) {
               if (var12 == 68) {
                  int var13 = this.l6.n5(2);
                  if (this.l6.n5(1) == 71 || this.l6.n5(1) == 68) {
                     var11 = 1;
                  }
               }
            } else {
               var11 = 1;
            }

            switch (var11) {
               case 1:
                  this.n5(i9);
                  var6 = this.y4();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  if (var6.k5 != null) {
                     var1.k5.n5().addItem(var6.k5);
                  }

                  label131:
                  while (true) {
                     byte var29 = 2;
                     int var14 = this.l6.n5(1);
                     if (var14 == 71) {
                        var29 = 1;
                     }

                     switch (var29) {
                        case 1:
                           var4 = (y2)this.n5(this.l6, 71, f5);
                           var9 = this.u3.n5(var4);
                           this.u3.l6(var2, var9);
                           this.n5(j3);
                           var7 = this.y4();
                           this.n5.l6--;
                           this.u3.l6(var2, var7.n5());
                           if (var7.k5 != null) {
                              var1.k5.n5().addItem(var7.k5);
                           }
                           break;
                        default:
                           break label131;
                     }
                  }
            }

            var5 = (y2)this.n5(this.l6, 68, n1);
            var10 = this.u3.n5(var5);
            this.u3.l6(var2, var10);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var18) {
            this.n5(var18);
            this.n5(this.l6, var18);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$h0 y4() throws w1 {
      l6$h0 var1 = new l6$h0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$s7 var3 = null;

      try {
         try {
            var2 = this.u3.n5();
            byte var4 = 3;
            switch (this.l6.n5(1)) {
               case 4:
               case 5:
               case 6:
               case 12:
               case 17:
               case 21:
               case 24:
               case 27:
               case 29:
               case 63:
               case 65:
               case 67:
               case 80:
               case 81:
               case 84:
               case 85:
               case 92:
               case 93:
               case 148:
               case 149:
               case 155:
               case 159:
               case 160:
               case 161:
                  var4 = 1;
                  break;
               case 68:
                  int var14 = this.l6.n5(2);
                  if (this.l6.n5(1) == 71) {
                     var4 = 2;
                  } else {
                     if (this.l6.n5(1) != 68) {
                        throw new m3("", 9, 3, this.l6);
                     }

                     var4 = 3;
                  }
                  break;
               case 71:
                  int var5 = this.l6.n5(2);
                  if (this.l6.n5(1) == 71) {
                     var4 = 2;
                  } else {
                     if (this.l6.n5(1) != 68) {
                        throw new m3("", 9, 2, this.l6);
                     }

                     var4 = 3;
                  }
                  break;
               default:
                  throw new m3("", 9, 0, this.l6);
            }

            switch (var4) {
               case 1:
                  this.n5(p6);
                  var3 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 2:
                  if (this.l6.n5(1) != 71) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "arrayItem", " input.LA(1) == COMMA ");
                  }

                  var1.k5 = new s0("undefined");
                  break;
               case 3:
                  if (this.l6.n5(1) != 68) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "arrayItem", " input.LA(1) == RBRACK ");
                  }

                  var1.k5 = null;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var9) {
            this.n5(var9);
            this.n5(this.l6, var9);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var9);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$s0 e2() throws w1 {
      l6$s0 var1 = new l6$s0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$i9 var6 = null;
      l6$i9 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      var1.k5 = new p6();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 63, d1);
            var8 = this.u3.n5(var3);
            this.u3.l6(var2, var8);
            byte var11 = 2;
            int var12 = this.l6.n5(1);
            if (var12 >= 148 && var12 <= 149 || var12 >= 159 && var12 <= 161) {
               var11 = 1;
            }

            switch (var11) {
               case 1:
                  this.n5(s4);
                  var6 = this.t9();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5.n5(var6.k5);

                  label63:
                  while (true) {
                     byte var13 = 2;
                     int var14 = this.l6.n5(1);
                     if (var14 == 71) {
                        var13 = 1;
                     }

                     switch (var13) {
                        case 1:
                           var4 = (y2)this.n5(this.l6, 71, h6);
                           var9 = this.u3.n5(var4);
                           this.u3.l6(var2, var9);
                           this.n5(y8);
                           var7 = this.t9();
                           this.n5.l6--;
                           this.u3.l6(var2, var7.n5());
                           var1.k5.n5(var7.k5);
                           break;
                        default:
                           break label63;
                     }
                  }
            }

            var5 = (y2)this.n5(this.l6, 64, c3);
            var10 = this.u3.n5(var5);
            this.u3.l6(var2, var10);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var18) {
            this.n5(var18);
            this.n5(this.l6, var18);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$i9 t9() throws w1 {
      l6$i9 var1 = new l6$i9();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$u3 var4 = null;
      l6$f5 var5 = null;
      l6$z7 var6 = null;
      l6$v4 var7 = null;
      l6$f5 var8 = null;
      l6$s7 var9 = null;
      Object var10 = null;
      var1.k5 = new w8();
      h2 var11 = new h2();

      try {
         try {
            byte var12 = 2;
            int var13 = this.l6.n5(1);
            if (var13 == 148) {
               int var14 = this.l6.n5(2);
               if (var14 == 97) {
                  var12 = 2;
               } else {
                  if ((var14 < 148 || var14 > 149) && (var14 < 159 || var14 > 161)) {
                     throw new m3("", 13, 1, this.l6);
                  }

                  var12 = 1;
               }
            } else {
               if (var13 != 149 && (var13 < 159 || var13 > 161)) {
                  throw new m3("", 13, 0, this.l6);
               }

               var12 = 2;
            }

            label98:
            switch (var12) {
               case 1:
                  var2 = this.u3.n5();
                  this.n5(l4);
                  var4 = this.z1();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5.n5(var4.k5);
                  var1.k5.n5(var11);
                  this.n5(i6);
                  var5 = this.t4();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  String var32 = var5.k5;
                  var11.n5(var32);
                  var1.k5.n5(var32);
                  var1.k5.n5(var32);
                  byte var15 = 2;
                  int var16 = this.l6.n5(1);
                  if (var16 == 65) {
                     var15 = 1;
                  }

                  switch (var15) {
                     case 1:
                        this.n5(a7);
                        var6 = this.q1();
                        this.n5.l6--;
                        this.u3.l6(var2, var6.n5());

                        for (int var17 = 0; var17 < var6.k5.size(); var17++) {
                           var11.l6().addItem(var6.k5.get_Item(var17));
                        }
                     default:
                        this.n5(r8);
                        var7 = this.u5();
                        this.n5.l6--;
                        this.u3.l6(var2, var7.n5());
                        var11.n5(var7.k5);
                        break label98;
                  }
               case 2:
                  var2 = this.u3.n5();
                  this.n5(r1);
                  var8 = this.t4();
                  this.n5.l6--;
                  this.u3.l6(var2, var8.n5());
                  var1.k5.n5(var8.k5);
                  var3 = (y2)this.n5(this.l6, 97, y5);
                  var10 = this.u3.n5(var3);
                  this.u3.l6(var2, var10);
                  this.n5(k8);
                  var9 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  var1.k5.n5(var9.k5);
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var21) {
            this.n5(var21);
            this.n5(this.l6, var21);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var21);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$u3 z1() throws w1 {
      l6$u3 var1 = new l6$u3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 148, b5);
            var4 = this.u3.n5(var3);
            this.u3.l6(var2, var4);
            if (!"get".equals(var3.l6()) && !"set".equals(var3.l6())) {
               throw new com.aspose.slides.internal.n5.y4(this.l6, "accessor", " \"get\".equals(ex1.getText()) || \"set\".equals(ex1.getText()) ");
            }

            if ("get".equals(var3.l6())) {
               var1.k5 = 1;
            }

            if ("set".equals(var3.l6())) {
               var1.k5 = 2;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var9) {
            this.n5(var9);
            this.n5(this.l6, var9);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var9);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$f5 t4() throws w1 {
      l6$f5 var1 = new l6$f5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$w2 var5 = null;
      Object var6 = null;
      Object var7 = null;

      try {
         try {
            byte var8 = 3;
            switch (this.l6.n5(1)) {
               case 148:
                  var8 = 1;
                  break;
               case 149:
                  var8 = 2;
                  break;
               case 150:
               case 151:
               case 152:
               case 153:
               case 154:
               case 155:
               case 156:
               case 157:
               case 158:
               default:
                  throw new m3("", 14, 0, this.l6);
               case 159:
               case 160:
               case 161:
                  var8 = 3;
            }

            switch (var8) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 148, u8);
                  var6 = this.u3.n5(var3);
                  this.u3.l6(var2, var6);
                  var1.k5 = var3.l6();
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, 149, w5);
                  var7 = this.u3.n5(var4);
                  this.u3.l6(var2, var7);
                  var1.k5 = this.a6(var4.l6());
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(q1);
                  var5 = this.s7();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = com.aspose.slides.ms.System.d2.u9(var5.k5);
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var12) {
            this.n5(var12);
            this.n5(this.l6, var12);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$e9 q0() throws w1 {
      l6$e9 var1 = new l6$e9();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$g7 var3 = null;
      l6$t1 var4 = null;
      l6$j8 var5 = null;

      try {
         try {
            byte var6 = 3;
            switch (this.l6.n5(1)) {
               case 4:
               case 5:
               case 6:
               case 24:
               case 63:
               case 65:
               case 67:
               case 148:
               case 149:
               case 155:
               case 159:
               case 160:
               case 161:
                  var6 = 1;
                  break;
               case 17:
                  var6 = 2;
                  break;
               case 21:
                  var6 = 3;
                  break;
               default:
                  throw new m3("", 15, 0, this.l6);
            }

            switch (var6) {
               case 1:
                  var2 = this.u3.n5();
                  this.n5(u5);
                  var3 = this.x8();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  this.n5(w8);
                  var4 = this.w5();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5 = var4.k5;
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(c2);
                  var5 = this.z3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = var5.k5;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$j8 z3() throws w1 {
      l6$j8 var1 = new l6$j8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$e9 var4 = null;
      Object var5 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 21, t3);
            var5 = this.u3.n5(var3);
            var2 = this.u3.k5(var5, var2);
            this.n5(u4);
            var4 = this.q0();
            this.n5.l6--;
            this.u3.l6(var2, var4.n5());
            var1.k5 = new r1(var4.k5);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$u9 m1() throws w1 {
      l6$u9 var1 = new l6$u9();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$s7 var6 = null;
      l6$s7 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      var1.k5 = new y8();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 65, s9);
            var8 = this.u3.n5(var3);
            this.u3.l6(var2, var8);
            byte var11 = 2;
            int var12 = this.l6.n5(1);
            if (var12 >= 4 && var12 <= 6
               || var12 == 12
               || var12 == 17
               || var12 == 21
               || var12 == 24
               || var12 == 27
               || var12 == 29
               || var12 == 63
               || var12 == 65
               || var12 == 67
               || var12 >= 80 && var12 <= 81
               || var12 >= 84 && var12 <= 85
               || var12 >= 92 && var12 <= 93
               || var12 >= 148 && var12 <= 149
               || var12 == 155
               || var12 >= 159 && var12 <= 161) {
               var11 = 1;
            }

            switch (var11) {
               case 1:
                  this.n5(p7);
                  var6 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5.addItem(var6.k5);

                  label107:
                  while (true) {
                     byte var13 = 2;
                     int var14 = this.l6.n5(1);
                     if (var14 == 71) {
                        var13 = 1;
                     }

                     switch (var13) {
                        case 1:
                           var4 = (y2)this.n5(this.l6, 71, z5);
                           var9 = this.u3.n5(var4);
                           this.u3.l6(var2, var9);
                           this.n5(h5);
                           var7 = this.v0();
                           this.n5.l6--;
                           this.u3.l6(var2, var7.n5());
                           var1.k5.addItem(var7.k5);
                           break;
                        default:
                           break label107;
                     }
                  }
            }

            var5 = (y2)this.n5(this.l6, 66, a8);
            var10 = this.u3.n5(var5);
            this.u3.l6(var2, var10);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var18) {
            this.n5(var18);
            this.n5(this.l6, var18);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$a5 k7() throws w1 {
      l6$a5 var1 = new l6$a5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$s7 var6 = null;
      l6$s7 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      var1.k5 = new y8();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 63, f4);
            var8 = this.u3.n5(var3);
            this.u3.l6(var2, var8);
            byte var11 = 2;
            int var12 = this.l6.n5(1);
            if (var12 >= 4 && var12 <= 6
               || var12 == 12
               || var12 == 17
               || var12 == 21
               || var12 == 24
               || var12 == 27
               || var12 == 29
               || var12 == 63
               || var12 == 65
               || var12 == 67
               || var12 >= 80 && var12 <= 81
               || var12 >= 84 && var12 <= 85
               || var12 >= 92 && var12 <= 93
               || var12 >= 148 && var12 <= 149
               || var12 == 155
               || var12 >= 159 && var12 <= 161) {
               var11 = 1;
            }

            switch (var11) {
               case 1:
                  this.n5(y9);
                  var6 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5.addItem(var6.k5);

                  label107:
                  while (true) {
                     byte var13 = 2;
                     int var14 = this.l6.n5(1);
                     if (var14 == 71) {
                        var13 = 1;
                     }

                     switch (var13) {
                        case 1:
                           var4 = (y2)this.n5(this.l6, 71, a1);
                           var9 = this.u3.n5(var4);
                           this.u3.l6(var2, var9);
                           this.n5(w3);
                           var7 = this.v0();
                           this.n5.l6--;
                           this.u3.l6(var2, var7.n5());
                           var1.k5.addItem(var7.k5);
                           break;
                        default:
                           break label107;
                     }
                  }
            }

            var5 = (y2)this.n5(this.l6, 64, i4);
            var10 = this.u3.n5(var5);
            this.u3.l6(var2, var10);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var18) {
            this.n5(var18);
            this.n5(this.l6, var18);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$a3 m3() throws w1 {
      l6$a3 var1 = new l6$a3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      l6$e9 var7 = null;
      l6$a5 var8 = null;
      l6$u9 var9 = null;
      l6$s3 var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      new y8();

      try {
         var2 = this.u3.n5();
         this.n5(q3);
         var7 = this.q0();
         this.n5.l6--;
         this.u3.l6(var2, var7.n5());
         var1.k5 = var7.k5;

         while (true) {
            byte var16 = 4;
            switch (this.l6.n5(1)) {
               case 63:
               case 65:
                  var16 = 1;
               case 64:
               case 66:
               case 68:
               default:
                  break;
               case 67:
                  var16 = 2;
                  break;
               case 69:
                  var16 = 3;
            }

            switch (var16) {
               case 1:
                  byte var17 = 2;
                  int var18 = this.l6.n5(1);
                  if (var18 == 63) {
                     var17 = 1;
                  }

                  switch (var17) {
                     case 1:
                        this.n5(q2);
                        var8 = this.k7();
                        this.n5.l6--;
                        this.u3.l6(var2, var8.n5());
                        y8 var15 = var8.k5;
                  }

                  this.n5(p4);
                  var9 = this.m1();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  if (com.aspose.slides.internal.v6g.k5.l6(var1.k5, r1.class) && !this.v2x) {
                     ((r1)var1.k5).n5(var9.k5);
                     var1.k5 = new i6(var1.k5, null);
                  } else {
                     var1.k5 = new i6(new a7(var9.k5), var1.k5);
                  }
                  break;
               case 2:
                  var4 = (y2)this.n5(this.l6, 67, d6);
                  var12 = this.u3.n5(var4);
                  this.u3.l6(var2, var12);
                  this.n5(y6);
                  var10 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var10.n5());
                  var5 = (y2)this.n5(this.l6, 68, n7);
                  var13 = this.u3.n5(var5);
                  this.u3.l6(var2, var13);
                  var1.k5 = new i6(new v3(var10.k5), var1.k5);
                  break;
               case 3:
                  var6 = (y2)this.n5(this.l6, 69, l5);
                  var14 = this.u3.n5(var6);
                  this.u3.l6(var2, var14);
                  var3 = (y2)this.n5(this.l6, 148, u2);
                  var11 = this.u3.n5(var3);
                  this.u3.l6(var2, var11);
                  if (com.aspose.slides.internal.v6g.k5.l6(var1.k5, r1.class) && !this.v2x) {
                     ((r1)var1.k5).n5(new i6(new t3(var3.l6()), ((r1)var1.k5).n5()));
                  } else {
                     var1.k5 = new i6(new t3(var3.l6()), var1.k5);
                  }
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var22) {
         this.n5(var22);
         this.n5(this.l6, var22);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var22);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$v8 z8() throws w1 {
      l6$v8 var1 = new l6$v8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$a3 var3 = null;
      l6$v3 var4 = null;

      try {
         try {
            var2 = this.u3.n5();
            this.n5(d9);
            var3 = this.m3();
            this.n5.l6--;
            this.u3.l6(var2, var3.n5());
            var1.k5 = var3.k5;
            if (this.l6.n5(1) == 84 || this.l6.n5(1) == 85) {
               this.n5((com.aspose.slides.internal.n5.j5)null);
            }

            byte var5 = 2;
            int var6 = this.l6.n5(1);
            if (var6 >= 84 && var6 <= 85) {
               var5 = 1;
            }

            switch (var5) {
               case 1:
                  this.n5(c5);
                  var4 = this.j5();
                  this.n5.l6--;
                  var2 = this.u3.k5(var4.n5(), var2);
                  var1.k5 = new n7(var4.k5, var1.k5);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$v3 j5() throws w1 {
      l6$v3 var1 = new l6$v3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;

      try {
         try {
            byte var5 = 2;
            int var6 = this.l6.n5(1);
            if (var6 == 84) {
               var5 = 1;
            } else {
               if (var6 != 85) {
                  throw new m3("", 23, 0, this.l6);
               }

               var5 = 2;
            }

            switch (var5) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 84, t5);
                  var4 = this.u3.n5(var3);
                  this.u3.l6(var2, var4);
                  var3.u3(128);
                  var1.k5 = 7;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 85, j6);
                  var4 = this.u3.n5(var3);
                  this.u3.l6(var2, var4);
                  var3.u3(127);
                  var1.k5 = 8;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$r8 w1() throws w1 {
      l6$r8 var1 = new l6$r8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$v8 var3 = null;
      l6$r1 var4 = null;
      l6$r8 var5 = null;

      try {
         try {
            byte var6 = 2;
            int var7 = this.l6.n5(1);
            if ((var7 < 4 || var7 > 6)
               && var7 != 17
               && var7 != 21
               && var7 != 24
               && var7 != 63
               && var7 != 65
               && var7 != 67
               && (var7 < 148 || var7 > 149)
               && var7 != 155
               && (var7 < 159 || var7 > 161)) {
               if (var7 != 12 && var7 != 27 && var7 != 29 && (var7 < 80 || var7 > 81) && (var7 < 84 || var7 > 85) && (var7 < 92 || var7 > 93)) {
                  throw new m3("", 24, 0, this.l6);
               }

               var6 = 2;
            } else {
               var6 = 1;
            }

            switch (var6) {
               case 1:
                  var2 = this.u3.n5();
                  this.n5(w9);
                  var3 = this.z8();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 2:
                  Object var13 = this.u3.n5();
                  this.n5(m8);
                  var4 = this.r4();
                  this.n5.l6--;
                  var2 = this.u3.k5(var4.n5(), var13);
                  this.n5(b9);
                  var5 = this.w1();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new n7(var4.k5, var5.k5);
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var11) {
            this.n5(var11);
            this.n5(this.l6, var11);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var11);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$r1 r4() throws w1 {
      l6$r1 var1 = new l6$r1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      y2 var8 = null;
      y2 var9 = null;
      y2 var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      Object var15 = null;
      Object var16 = null;
      Object var17 = null;
      Object var18 = null;

      try {
         try {
            byte var19 = 9;
            switch (this.l6.n5(1)) {
               case 12:
                  var19 = 1;
                  break;
               case 27:
                  var19 = 3;
                  break;
               case 29:
                  var19 = 2;
                  break;
               case 80:
                  var19 = 6;
                  break;
               case 81:
                  var19 = 7;
                  break;
               case 84:
                  var19 = 4;
                  break;
               case 85:
                  var19 = 5;
                  break;
               case 92:
                  var19 = 9;
                  break;
               case 93:
                  var19 = 8;
                  break;
               default:
                  throw new m3("", 25, 0, this.l6);
            }

            switch (var19) {
               case 1:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, 12, r6);
                  var12 = this.u3.n5(var4);
                  this.u3.l6(var2, var12);
                  var1.k5 = 9;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var5 = (y2)this.n5(this.l6, 29, r5);
                  var13 = this.u3.n5(var5);
                  this.u3.l6(var2, var13);
                  var1.k5 = 10;
                  break;
               case 3:
                  var2 = this.u3.n5();
                  var6 = (y2)this.n5(this.l6, 27, h9);
                  var14 = this.u3.n5(var6);
                  this.u3.l6(var2, var14);
                  var1.k5 = 0;
                  break;
               case 4:
                  var2 = this.u3.n5();
                  var7 = (y2)this.n5(this.l6, 84, r7);
                  var15 = this.u3.n5(var7);
                  this.u3.l6(var2, var15);
                  var1.k5 = 5;
                  break;
               case 5:
                  var2 = this.u3.n5();
                  var8 = (y2)this.n5(this.l6, 85, n9);
                  var16 = this.u3.n5(var8);
                  this.u3.l6(var2, var16);
                  var1.k5 = 6;
                  break;
               case 6:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 80, a2);
                  var11 = this.u3.n5(var3);
                  this.u3.l6(var2, var11);
                  var3.u3(129);
                  var1.k5 = 4;
                  break;
               case 7:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 81, h1);
                  var11 = this.u3.n5(var3);
                  this.u3.l6(var2, var11);
                  var3.u3(124);
                  var1.k5 = 3;
                  break;
               case 8:
                  var2 = this.u3.n5();
                  var9 = (y2)this.n5(this.l6, 93, t6);
                  var17 = this.u3.n5(var9);
                  this.u3.l6(var2, var17);
                  var1.k5 = 11;
                  break;
               case 9:
                  var2 = this.u3.n5();
                  var10 = (y2)this.n5(this.l6, 92, v6);
                  var18 = this.u3.n5(var10);
                  this.u3.l6(var2, var18);
                  var1.k5 = 2;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var23) {
            this.n5(var23);
            this.n5(this.l6, var23);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var23);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$o5 c4() throws w1 {
      l6$o5 var1 = new l6$o5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$r8 var6 = null;
      l6$r8 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      byte var11 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(x0);
         var6 = this.w1();
         this.n5.l6--;
         this.u3.l6(var2, var6.n5());
         var1.k5 = var6.k5;

         while (true) {
            byte var12 = 2;
            int var13 = this.l6.n5(1);
            if (var13 >= 82 && var13 <= 83 || var13 == 109) {
               var12 = 1;
            }

            switch (var12) {
               case 1:
                  byte var14 = 3;
                  switch (this.l6.n5(1)) {
                     case 82:
                        var14 = 1;
                        break;
                     case 83:
                        var14 = 3;
                        break;
                     case 109:
                        var14 = 2;
                        break;
                     default:
                        throw new m3("", 26, 0, this.l6);
                  }

                  switch (var14) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 82, o2);
                        var8 = this.u3.n5(var3);
                        this.u3.l6(var2, var8);
                        var11 = 12;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 109, e0);
                        var9 = this.u3.n5(var4);
                        this.u3.l6(var2, var9);
                        var11 = 11;
                        break;
                     case 3:
                        var5 = (y2)this.n5(this.l6, 83, i2);
                        var10 = this.u3.n5(var5);
                        this.u3.l6(var2, var10);
                        var11 = 10;
                  }

                  this.n5(x7);
                  var7 = this.w1();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var11, var1.k5, var7.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var18) {
         this.n5(var18);
         this.n5(this.l6, var18);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$a6 y2() throws w1 {
      l6$a6 var1 = new l6$a6();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$o5 var5 = null;
      l6$o5 var6 = null;
      Object var7 = null;
      Object var8 = null;
      byte var9 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(z0);
         var5 = this.c4();
         this.n5.l6--;
         this.u3.l6(var2, var5.n5());
         var1.k5 = var5.k5;

         while (true) {
            byte var10 = 2;
            int var11 = this.l6.n5(1);
            if (var11 >= 80 && var11 <= 81) {
               var10 = 1;
            }

            switch (var10) {
               case 1:
                  byte var12 = 2;
                  int var13 = this.l6.n5(1);
                  if (var13 == 80) {
                     var12 = 1;
                  } else {
                     if (var13 != 81) {
                        throw new m3("", 28, 0, this.l6);
                     }

                     var12 = 2;
                  }

                  switch (var12) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 80, z9);
                        var7 = this.u3.n5(var3);
                        this.u3.l6(var2, var7);
                        var9 = 9;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 81, f8);
                        var8 = this.u3.n5(var4);
                        this.u3.l6(var2, var8);
                        var9 = 8;
                  }

                  this.n5(s2);
                  var6 = this.c4();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var9, var1.k5, var6.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var17) {
         this.n5(var17);
         this.n5(this.l6, var17);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var17);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$s4 y1() throws w1 {
      l6$s4 var1 = new l6$s4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$a6 var6 = null;
      l6$a6 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      byte var11 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(n2);
         var6 = this.y2();
         this.n5.l6--;
         this.u3.l6(var2, var6.n5());
         var1.k5 = var6.k5;

         while (true) {
            byte var12 = 2;
            int var13 = this.l6.n5(1);
            if (var13 >= 86 && var13 <= 88) {
               var12 = 1;
            }

            switch (var12) {
               case 1:
                  byte var14 = 3;
                  switch (this.l6.n5(1)) {
                     case 86:
                        var14 = 1;
                        break;
                     case 87:
                        var14 = 2;
                        break;
                     case 88:
                        var14 = 3;
                        break;
                     default:
                        throw new m3("", 30, 0, this.l6);
                  }

                  switch (var14) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 86, l0);
                        var8 = this.u3.n5(var3);
                        this.u3.l6(var2, var8);
                        var11 = 19;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 87, p9);
                        var9 = this.u3.n5(var4);
                        this.u3.l6(var2, var9);
                        var11 = 20;
                        break;
                     case 3:
                        var5 = (y2)this.n5(this.l6, 88, g8);
                        var10 = this.u3.n5(var5);
                        this.u3.l6(var2, var10);
                        var11 = 21;
                  }

                  this.n5(i0);
                  var7 = this.y2();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var11, var1.k5, var7.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var18) {
         this.n5(var18);
         this.n5(this.l6, var18);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$n1 a0() throws w1 {
      l6$n1 var1 = new l6$n1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      y2 var8 = null;
      l6$s4 var9 = null;
      l6$s4 var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      Object var15 = null;
      Object var16 = null;
      byte var17 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(b4);
         var9 = this.y1();
         this.n5.l6--;
         this.u3.l6(var2, var9.n5());
         var1.k5 = var9.k5;

         while (true) {
            byte var18 = 2;
            int var19 = this.l6.n5(1);
            if (var19 >= 19 && var19 <= 20 || var19 >= 72 && var19 <= 75) {
               var18 = 1;
            }

            switch (var18) {
               case 1:
                  byte var20 = 6;
                  switch (this.l6.n5(1)) {
                     case 19:
                        var20 = 6;
                        break;
                     case 20:
                        var20 = 5;
                        break;
                     case 72:
                        var20 = 1;
                        break;
                     case 73:
                        var20 = 2;
                        break;
                     case 74:
                        var20 = 3;
                        break;
                     case 75:
                        var20 = 4;
                        break;
                     default:
                        throw new m3("", 32, 0, this.l6);
                  }

                  switch (var20) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 72, x5);
                        var11 = this.u3.n5(var3);
                        this.u3.l6(var2, var11);
                        var17 = 5;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 73, i8);
                        var12 = this.u3.n5(var4);
                        this.u3.l6(var2, var12);
                        var17 = 6;
                        break;
                     case 3:
                        var5 = (y2)this.n5(this.l6, 74, a4);
                        var13 = this.u3.n5(var5);
                        this.u3.l6(var2, var13);
                        var17 = 3;
                        break;
                     case 4:
                        var6 = (y2)this.n5(this.l6, 75, x3);
                        var14 = this.u3.n5(var6);
                        this.u3.l6(var2, var14);
                        var17 = 4;
                        break;
                     case 5:
                        var7 = (y2)this.n5(this.l6, 20, b2);
                        var15 = this.u3.n5(var7);
                        this.u3.l6(var2, var15);
                        var17 = 22;
                        break;
                     case 6:
                        var8 = (y2)this.n5(this.l6, 19, m4);
                        var16 = this.u3.n5(var8);
                        this.u3.l6(var2, var16);
                        var17 = 23;
                  }

                  this.n5(b1);
                  var10 = this.y1();
                  this.n5.l6--;
                  this.u3.l6(var2, var10.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var17, var1.k5, var10.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var24) {
         this.n5(var24);
         this.n5(this.l6, var24);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var24);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$j3 d2() throws w1 {
      l6$j3 var1 = new l6$j3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      l6$s4 var8 = null;
      l6$s4 var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      byte var15 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(j1);
         var8 = this.y1();
         this.n5.l6--;
         this.u3.l6(var2, var8.n5());
         var1.k5 = var8.k5;

         while (true) {
            byte var16 = 2;
            int var17 = this.l6.n5(1);
            if (var17 == 20 || var17 >= 72 && var17 <= 75) {
               var16 = 1;
            }

            switch (var16) {
               case 1:
                  byte var18 = 5;
                  switch (this.l6.n5(1)) {
                     case 20:
                        var18 = 5;
                        break;
                     case 72:
                        var18 = 1;
                        break;
                     case 73:
                        var18 = 2;
                        break;
                     case 74:
                        var18 = 3;
                        break;
                     case 75:
                        var18 = 4;
                        break;
                     default:
                        throw new m3("", 34, 0, this.l6);
                  }

                  switch (var18) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 72, k6);
                        var10 = this.u3.n5(var3);
                        this.u3.l6(var2, var10);
                        var15 = 5;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 73, o7);
                        var11 = this.u3.n5(var4);
                        this.u3.l6(var2, var11);
                        var15 = 6;
                        break;
                     case 3:
                        var5 = (y2)this.n5(this.l6, 74, v9);
                        var12 = this.u3.n5(var5);
                        this.u3.l6(var2, var12);
                        var15 = 3;
                        break;
                     case 4:
                        var6 = (y2)this.n5(this.l6, 75, r9);
                        var13 = this.u3.n5(var6);
                        this.u3.l6(var2, var13);
                        var15 = 4;
                        break;
                     case 5:
                        var7 = (y2)this.n5(this.l6, 20, c7);
                        var14 = this.u3.n5(var7);
                        this.u3.l6(var2, var14);
                        var15 = 22;
                  }

                  this.n5(w4);
                  var9 = this.y1();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var15, var1.k5, var9.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var22) {
         this.n5(var22);
         this.n5(this.l6, var22);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var22);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$a0 d5() throws w1 {
      l6$a0 var1 = new l6$a0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      l6$n1 var7 = null;
      l6$n1 var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      byte var13 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(n0);
         var7 = this.a0();
         this.n5.l6--;
         this.u3.l6(var2, var7.n5());
         var1.k5 = var7.k5;

         while (true) {
            byte var14 = 2;
            int var15 = this.l6.n5(1);
            if (var15 >= 76 && var15 <= 79) {
               var14 = 1;
            }

            switch (var14) {
               case 1:
                  byte var16 = 4;
                  switch (this.l6.n5(1)) {
                     case 76:
                        var16 = 1;
                        break;
                     case 77:
                        var16 = 2;
                        break;
                     case 78:
                        var16 = 3;
                        break;
                     case 79:
                        var16 = 4;
                        break;
                     default:
                        throw new m3("", 36, 0, this.l6);
                  }

                  switch (var16) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 76, f1);
                        var9 = this.u3.n5(var3);
                        this.u3.l6(var2, var9);
                        var13 = 7;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 77, k2);
                        var10 = this.u3.n5(var4);
                        this.u3.l6(var2, var10);
                        var13 = 2;
                        break;
                     case 3:
                        var5 = (y2)this.n5(this.l6, 78, o8);
                        var11 = this.u3.n5(var5);
                        this.u3.l6(var2, var11);
                        var13 = 17;
                        break;
                     case 4:
                        var6 = (y2)this.n5(this.l6, 79, n8);
                        var12 = this.u3.n5(var6);
                        this.u3.l6(var2, var12);
                        var13 = 18;
                  }

                  this.n5(t0);
                  var8 = this.a0();
                  this.n5.l6--;
                  this.u3.l6(var2, var8.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var13, var1.k5, var8.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var20) {
         this.n5(var20);
         this.n5(this.l6, var20);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var20);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$y1 s3() throws w1 {
      l6$y1 var1 = new l6$y1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      l6$j3 var7 = null;
      l6$j3 var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      byte var13 = 24;

      try {
         var2 = this.u3.n5();
         this.n5(n6);
         var7 = this.d2();
         this.n5.l6--;
         this.u3.l6(var2, var7.n5());
         var1.k5 = var7.k5;

         while (true) {
            byte var14 = 2;
            int var15 = this.l6.n5(1);
            if (var15 >= 76 && var15 <= 79) {
               var14 = 1;
            }

            switch (var14) {
               case 1:
                  byte var16 = 4;
                  switch (this.l6.n5(1)) {
                     case 76:
                        var16 = 1;
                        break;
                     case 77:
                        var16 = 2;
                        break;
                     case 78:
                        var16 = 3;
                        break;
                     case 79:
                        var16 = 4;
                        break;
                     default:
                        throw new m3("", 38, 0, this.l6);
                  }

                  switch (var16) {
                     case 1:
                        var3 = (y2)this.n5(this.l6, 76, p5);
                        var9 = this.u3.n5(var3);
                        this.u3.l6(var2, var9);
                        var13 = 7;
                        break;
                     case 2:
                        var4 = (y2)this.n5(this.l6, 77, b0);
                        var10 = this.u3.n5(var4);
                        this.u3.l6(var2, var10);
                        var13 = 2;
                        break;
                     case 3:
                        var5 = (y2)this.n5(this.l6, 78, r0);
                        var11 = this.u3.n5(var5);
                        this.u3.l6(var2, var11);
                        var13 = 17;
                        break;
                     case 4:
                        var6 = (y2)this.n5(this.l6, 79, k3);
                        var12 = this.u3.n5(var6);
                        this.u3.l6(var2, var12);
                        var13 = 18;
                  }

                  this.n5(d7);
                  var8 = this.d2();
                  this.n5.l6--;
                  this.u3.l6(var2, var8.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(var13, var1.k5, var8.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var20) {
         this.n5(var20);
         this.n5(this.l6, var20);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var20);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$y4 p8() throws w1 {
      l6$y4 var1 = new l6$y4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$a0 var4 = null;
      l6$a0 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(o1);
         var4 = this.d5();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 89) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 89, m0);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(o4);
                  var5 = this.d5();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(14, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$n3 f2() throws w1 {
      l6$n3 var1 = new l6$n3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$y1 var4 = null;
      l6$y1 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(k1);
         var4 = this.s3();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 89) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 89, o6);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(g2);
                  var5 = this.s3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(14, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$t4 i1() throws w1 {
      l6$t4 var1 = new l6$t4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$y4 var4 = null;
      l6$y4 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(l8);
         var4 = this.p8();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 91) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 91, s8);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(i3);
                  var5 = this.p8();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(16, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$z1 e5() throws w1 {
      l6$z1 var1 = new l6$z1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$n3 var4 = null;
      l6$n3 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(q6);
         var4 = this.f2();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 91) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 91, g1);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(k4);
                  var5 = this.f2();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(16, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$t9 b3() throws w1 {
      l6$t9 var1 = new l6$t9();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$t4 var4 = null;
      l6$t4 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(e8);
         var4 = this.i1();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 90) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 90, b6);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(v7);
                  var5 = this.i1();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(15, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$e2 o0() throws w1 {
      l6$e2 var1 = new l6$e2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$z1 var4 = null;
      l6$z1 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(t7);
         var4 = this.e5();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 90) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 90, c9);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(d3);
                  var5 = this.e5();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(15, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$y0 z7() throws w1 {
      l6$y0 var1 = new l6$y0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$t9 var4 = null;
      l6$t9 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(o3);
         var4 = this.b3();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 94) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 94, l1);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(y7);
                  var5 = this.b3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(0, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$x9 v4() throws w1 {
      l6$x9 var1 = new l6$x9();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$e2 var4 = null;
      l6$e2 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(i7);
         var4 = this.o0();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 94) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 94, c6);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(x1);
                  var5 = this.o0();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(0, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$z6 u6() throws w1 {
      l6$z6 var1 = new l6$z6();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$y0 var4 = null;
      l6$y0 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(s6);
         var4 = this.z7();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 95) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 95, b7);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(b8);
                  var5 = this.z7();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(1, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$j9 t1() throws w1 {
      l6$j9 var1 = new l6$j9();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$x9 var4 = null;
      l6$x9 var5 = null;
      Object var6 = null;

      try {
         var2 = this.u3.n5();
         this.n5(q7);
         var4 = this.v4();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 == 95) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 95, r3);
                  var6 = this.u3.n5(var3);
                  var2 = this.u3.k5(var6, var2);
                  this.n5(q8);
                  var5 = this.v4();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = new com.aspose.slides.internal.i4.s7(1, var1.k5, var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var12) {
         this.n5(var12);
         this.n5(this.l6, var12);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$j5 a5() throws w1 {
      l6$j5 var1 = new l6$j5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      l6$z6 var5 = null;
      l6$s7 var6 = null;
      l6$s7 var7 = null;
      Object var8 = null;
      Object var9 = null;

      try {
         try {
            var2 = this.u3.n5();
            this.n5(w0);
            var5 = this.u6();
            this.n5.l6--;
            this.u3.l6(var2, var5.n5());
            var1.k5 = var5.k5;
            byte var10 = 2;
            int var11 = this.l6.n5(1);
            if (var11 == 96) {
               var10 = 1;
            }

            switch (var10) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 96, p1);
                  var8 = this.u3.n5(var3);
                  var2 = this.u3.k5(var8, var2);
                  this.n5(q9);
                  var6 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var4 = (y2)this.n5(this.l6, 97, x6);
                  this.n5(m9);
                  var7 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = new p4(var5.k5, var6.k5, var7.k5);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$z8 h2() throws w1 {
      l6$z8 var1 = new l6$z8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      l6$j9 var5 = null;
      l6$t2 var6 = null;
      l6$t2 var7 = null;
      Object var8 = null;
      Object var9 = null;

      try {
         try {
            var2 = this.u3.n5();
            this.n5(r2);
            var5 = this.t1();
            this.n5.l6--;
            this.u3.l6(var2, var5.n5());
            var1.k5 = var5.k5;
            byte var10 = 2;
            int var11 = this.l6.n5(1);
            if (var11 == 96) {
               var10 = 1;
            }

            switch (var10) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 96, l7);
                  var8 = this.u3.n5(var3);
                  var2 = this.u3.k5(var8, var2);
                  this.n5(q5);
                  var6 = this.a3();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var4 = (y2)this.n5(this.l6, 97, e4);
                  this.n5(g6);
                  var7 = this.a3();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = new p4(var5.k5, var6.k5, var7.k5);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$s7 v0() throws w1 {
      l6$s7 var1 = new l6$s7();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$j5 var3 = null;
      l6$x8 var4 = null;
      l6$s7 var5 = null;
      Object[] var6 = new Object[1];
      t2 var7 = new t2();

      try {
         try {
            var2 = this.u3.n5();
            this.n5(o9);
            var3 = this.a5();
            this.n5.l6--;
            this.u3.l6(var2, var3.n5());
            e5 var8 = var3.k5;
            var7.n5(var8);
            var1.k5 = var8;
            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 >= 98 && var10 <= 108 || var10 == 110) {
               int var11 = this.l6.n5(2);
               if (this.n5(var3.k5, var6)) {
                  var9 = 1;
               }
            }

            switch (var9) {
               case 1:
                  if (!this.n5(var3.k5, var6)) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "assignmentExpression", " isLeftHandSideAssign(lhs.value, isLhs) ");
                  }

                  this.n5(a9);
                  var4 = this.f0();
                  this.n5.l6--;
                  var2 = this.u3.k5(var4.n5(), var2);
                  var7.n5(this.l6(var4 != null ? this.l6.n5(var4.n5, var4.l6) : null));
                  this.n5(u0);
                  var5 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var7.l6(var5.k5);
                  var1.k5 = var7;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$x8 f0() throws w1 {
      l6$x8 var1 = new l6$x8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = this.l6.u9(1);
            if ((this.l6.n5(1) < 98 || this.l6.n5(1) > 108) && this.l6.n5(1) != 110) {
               throw new q0(null, this.l6);
            }

            this.l6.n5();
            this.u3.l6(var2, this.u3.n5(var3));
            this.n5.k5 = false;
            var1.l6 = this.l6.u9(-1);
            var1.k5 = this.u3.l6(var2);
            this.u3.n5(var1.k5, var1.n5, var1.l6);
         } catch (w1 var9) {
            this.n5(var9);
            this.n5(this.l6, var9);
            var1.k5 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var9);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$t2 a3() throws w1 {
      l6$t2 var1 = new l6$t2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$z8 var3 = null;
      l6$x8 var4 = null;
      l6$t2 var5 = null;
      Object[] var6 = new Object[1];
      t2 var7 = new t2();

      try {
         try {
            var2 = this.u3.n5();
            this.n5(q4);
            var3 = this.h2();
            this.n5.l6--;
            this.u3.l6(var2, var3.n5());
            e5 var8 = var3 != null ? var3.k5 : null;
            var1.k5 = var8;
            var7.n5(var8);
            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 >= 98 && var10 <= 108 || var10 == 110) {
               int var11 = this.l6.n5(2);
               if (this.n5(var3.k5, var6)) {
                  var9 = 1;
               }
            }

            switch (var9) {
               case 1:
                  if (!this.n5(var3.k5, var6)) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs.value, isLhs) ");
                  }

                  this.n5(f7);
                  var4 = this.f0();
                  this.n5.l6--;
                  var2 = this.u3.k5(var4.n5(), var2);
                  var7.n5(this.l6(var4 != null ? this.l6.n5(var4.n5, var4.l6) : null));
                  this.n5(k9);
                  var5 = this.a3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var7.l6(var5.k5);
                  var1.k5 = var7;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$s3 p3() throws w1 {
      l6$s3 var1 = new l6$s3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$s7 var4 = null;
      l6$s7 var5 = null;
      Object var6 = null;
      m1 var7 = new m1();

      try {
         var2 = this.u3.n5();
         this.n5(s5);
         var4 = this.v0();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var8 = 2;
            int var9 = this.l6.n5(1);
            if (var9 == 71) {
               var8 = 1;
            }

            switch (var8) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 71, l2);
                  var6 = this.u3.n5(var3);
                  this.u3.l6(var2, var6);
                  if (var7.n5().size() == 0) {
                     var7.n5().addItem(var1.k5);
                     var1.k5 = var7;
                  }

                  this.n5(j7);
                  var5 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var7.n5().addItem(var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var13) {
         this.n5(var13);
         this.n5(this.l6, var13);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$d2 x9() throws w1 {
      l6$d2 var1 = new l6$d2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$t2 var4 = null;
      l6$t2 var5 = null;
      Object var6 = null;
      m1 var7 = new m1();

      try {
         var2 = this.u3.n5();
         this.n5(k0);
         var4 = this.a3();
         this.n5.l6--;
         this.u3.l6(var2, var4.n5());
         var1.k5 = var4.k5;

         while (true) {
            byte var8 = 2;
            int var9 = this.l6.n5(1);
            if (var9 == 71) {
               var8 = 1;
            }

            switch (var8) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 71, d4);
                  var6 = this.u3.n5(var3);
                  this.u3.l6(var2, var6);
                  if (var7.n5().size() == 0) {
                     var7.n5().addItem(var1.k5);
                     var1.k5 = var7;
                  }

                  this.n5(v2);
                  var5 = this.a3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var7.n5().addItem(var5.k5);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var13) {
         this.n5(var13);
         this.n5(this.l6, var13);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$d1 y0() throws w1 {
      l6$d1 var1 = new l6$d1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      int var13 = this.l6.u3();
      this.n5(var1);

      try {
         try {
            byte var14 = 5;
            switch (this.l6.n5(1)) {
               case -1:
                  var14 = 2;
                  break;
               case 64:
                  var14 = 3;
                  break;
               case 70:
                  var14 = 1;
                  break;
               case 145:
                  var14 = 4;
                  break;
               case 146:
                  var14 = 5;
                  break;
               default:
                  throw new m3("", 56, 0, this.l6);
            }

            switch (var14) {
               case 1:
                  var2 = this.u3.n5();
                  var3 = (y2)this.n5(this.l6, 70, e7);
                  var8 = this.u3.n5(var3);
                  this.u3.l6(var2, var8);
                  break;
               case 2:
                  var2 = this.u3.n5();
                  var4 = (y2)this.n5(this.l6, -1, e6);
                  var9 = this.u3.n5(var4);
                  this.u3.l6(var2, var9);
                  break;
               case 3:
                  var2 = this.u3.n5();
                  var5 = (y2)this.n5(this.l6, 64, j0);
                  var10 = this.u3.n5(var5);
                  this.u3.l6(var2, var10);
                  this.l6.l6(var13);
                  break;
               case 4:
                  var2 = this.u3.n5();
                  var6 = (y2)this.n5(this.l6, 145, u1);
                  var11 = this.u3.n5(var6);
                  this.u3.l6(var2, var11);
                  break;
               case 5:
                  var2 = this.u3.n5();
                  var7 = (y2)this.n5(this.l6, 146, x2);
                  var12 = this.u3.n5(var7);
                  this.u3.l6(var2, var12);
            }

            var1.l6 = this.l6.u9(-1);
            var1.k5 = this.u3.l6(var2);
            this.u3.n5(var1.k5, var1.n5, var1.l6);
         } catch (w1 var18) {
            this.n5(var18);
            this.n5(this.l6, var18);
            var1.k5 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$c3 j9() throws w1 {
      l6$c3 var1 = new l6$c3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$u6 var3 = null;
      l6$q0 var4 = null;
      l6$y8 var5 = null;

      try {
         try {
            int var6 = 3;
            var6 = this.a6.n5(this.l6);
            switch (var6) {
               case 1:
                  var2 = this.u3.n5();
                  if (this.l6.n5(1) != 63) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "statement", " input.LA(1) == LBRACE ");
                  }

                  this.n5(p0);
                  var4 = this.e9();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5 = var4 != null ? var4.k5 : null;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  if (this.l6.n5(1) != 17) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "statement", " input.LA(1) == FUNCTION ");
                  }

                  this.n5(s1);
                  var3 = this.u8();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(g9);
                  var5 = this.z6();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = var5 != null ? var5.k5 : null;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$y8 z6() throws w1 {
      l6$y8 var1 = new l6$y8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$b5 var3 = null;
      l6$y2 var4 = null;
      l6$d5 var5 = null;
      l6$h2 var6 = null;
      l6$v0 var7 = null;
      l6$w1 var8 = null;
      l6$m1 var9 = null;
      l6$p6 var10 = null;
      l6$w5 var11 = null;
      l6$f0 var12 = null;
      l6$l4 var13 = null;
      l6$i6 var14 = null;
      l6$a7 var15 = null;

      try {
         try {
            int var16 = 13;
            var16 = this.u9.n5(this.l6);
            switch (var16) {
               case 1:
                  var2 = this.u3.n5();
                  this.n5(l9);
                  var3 = this.o5();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3 != null ? var3.k5 : null;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  this.n5(z2);
                  var4 = this.s0();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5 = var4 != null ? var4.k5 : null;
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(m5);
                  var5 = this.v8();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = var5 != null ? var5.k5 : null;
                  break;
               case 4:
                  var2 = this.u3.n5();
                  this.n5(v5);
                  var6 = this.v3();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5 = var6 != null ? var6.k5 : null;
                  break;
               case 5:
                  var2 = this.u3.n5();
                  this.n5(p2);
                  var7 = this.g7();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = var7 != null ? var7.k5 : null;
                  break;
               case 6:
                  var2 = this.u3.n5();
                  this.n5(v1);
                  var8 = this.s4();
                  this.n5.l6--;
                  this.u3.l6(var2, var8.n5());
                  var1.k5 = var8 != null ? var8.k5 : null;
                  break;
               case 7:
                  var2 = this.u3.n5();
                  this.n5(g4);
                  var9 = this.h6();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  var1.k5 = var9 != null ? var9.k5 : null;
                  break;
               case 8:
                  var2 = this.u3.n5();
                  this.n5(h7);
                  var10 = this.y8();
                  this.n5.l6--;
                  this.u3.l6(var2, var10.n5());
                  var1.k5 = var10 != null ? var10.k5 : null;
                  break;
               case 9:
                  var2 = this.u3.n5();
                  this.n5(m6);
                  var11 = this.c3();
                  this.n5.l6--;
                  this.u3.l6(var2, var11.n5());
                  var1.k5 = var11 != null ? var11.k5 : null;
                  break;
               case 10:
                  var2 = this.u3.n5();
                  this.n5(t8);
                  var12 = this.r8();
                  this.n5.l6--;
                  this.u3.l6(var2, var12.n5());
                  var1.k5 = var12 != null ? var12.k5 : null;
                  break;
               case 11:
                  var2 = this.u3.n5();
                  this.n5(f3);
                  var13 = this.l4();
                  this.n5.l6--;
                  this.u3.l6(var2, var13.n5());
                  var1.k5 = var13 != null ? var13.k5 : null;
                  break;
               case 12:
                  var2 = this.u3.n5();
                  this.n5(g3);
                  var14 = this.r1();
                  this.n5.l6--;
                  this.u3.l6(var2, var14.n5());
                  var1.k5 = var14 != null ? var14.k5 : null;
                  break;
               case 13:
                  var2 = this.u3.n5();
                  this.n5(e1);
                  var15 = this.y5();
                  this.n5.l6--;
                  this.u3.l6(var2, var15.n5());
                  var1.k5 = var15 != null ? var15.k5 : null;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var20) {
            this.n5(var20);
            this.n5(this.l6, var20);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var20);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$q0 e9() throws w1 {
      l6$q0 var1 = new l6$q0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$c3 var5 = null;
      Object var6 = null;
      Object var7 = null;
      var1.k5 = new n3();

      try {
         var2 = this.u3.n5();
         var3 = (y2)this.n5(this.l6, 63, m2);
         var6 = this.u3.n5(var3);
         this.u3.l6(var2, var6);

         while (true) {
            byte var8 = 2;
            int var9 = this.l6.n5(1);
            if (var9 >= 4 && var9 <= 7
               || var9 == 10
               || var9 >= 12 && var9 <= 13
               || var9 >= 16 && var9 <= 18
               || var9 >= 21 && var9 <= 31
               || var9 == 63
               || var9 == 65
               || var9 == 67
               || var9 == 70
               || var9 >= 80 && var9 <= 81
               || var9 >= 84 && var9 <= 85
               || var9 >= 92 && var9 <= 93
               || var9 >= 148 && var9 <= 149
               || var9 == 155
               || var9 >= 159 && var9 <= 161) {
               var8 = 1;
            }

            switch (var8) {
               case 1:
                  this.n5(g0);
                  var5 = this.j9();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5.n5().l6(var5 != null ? var5.k5 : null);
                  break;
               default:
                  var4 = (y2)this.n5(this.l6, 64, i5);
                  var7 = this.u3.n5(var4);
                  this.u3.l6(var2, var7);
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var13) {
         this.n5(var13);
         this.n5(this.l6, var13);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$b5 o5() throws w1 {
      l6$b5 var1 = new l6$b5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$k8 var5 = null;
      l6$k8 var6 = null;
      l6$d1 var7 = null;
      Object var8 = null;
      Object var9 = null;
      m1 var10 = new m1();

      try {
         var2 = this.u3.n5();
         var3 = (y2)this.n5(this.l6, 28, j2);
         var8 = this.u3.n5(var3);
         this.u3.l6(var2, var8);
         this.n5(w6);
         var5 = this.j8();
         this.n5.l6--;
         this.u3.l6(var2, var5.n5());
         var5.k5.n5(false);
         var1.k5 = var5.k5;

         while (true) {
            byte var11 = 2;
            int var12 = this.l6.n5(1);
            if (var12 == 71) {
               var11 = 1;
            }

            switch (var11) {
               case 1:
                  var4 = (y2)this.n5(this.l6, 71, g5);
                  var9 = this.u3.n5(var4);
                  this.u3.l6(var2, var9);
                  if (var10.n5().size() == 0) {
                     var10.n5().addItem(var1.k5);
                     var1.k5 = var10;
                  }

                  this.n5(h8);
                  var6 = this.j8();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var10.n5().addItem(var6.k5);
                  var6.k5.n5(false);
                  break;
               default:
                  this.n5(m7);
                  var7 = this.y0();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  if (var10.n5().size() > 0) {
                     for (Object var29 : var10.n5()) {
                        c5 var13 = new c5();
                        var13.n5(false);
                        var13.n5(((c5)var29).l6());
                        this.e2l.n5(var13);
                     }
                  } else {
                     c5 var28 = new c5();
                     var28.n5(false);
                     var28.n5(var5.k5.l6());
                     this.e2l.n5(var28);
                  }

                  return var1;
            }
         }
      } catch (w1 var17) {
         this.n5(var17);
         this.n5(this.l6, var17);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var17);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$k8 j8() throws w1 {
      l6$k8 var1 = new l6$k8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$s7 var5 = null;
      Object var6 = null;
      Object var7 = null;
      var1.k5 = new c5();
      var1.k5.n5(true);

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 148, h4);
            var6 = this.u3.n5(var3);
            this.u3.l6(var2, var6);
            var1.k5.n5(var3.l6());
            byte var8 = 2;
            int var9 = this.l6.n5(1);
            if (var9 == 98) {
               var8 = 1;
            }

            switch (var8) {
               case 1:
                  var4 = (y2)this.n5(this.l6, 98, w7);
                  var7 = this.u3.n5(var4);
                  var2 = this.u3.k5(var7, var2);
                  this.n5(e3);
                  var5 = this.v0();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5.n5(var5.k5);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var13) {
            this.n5(var13);
            this.n5(this.l6, var13);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$y5 w2() throws w1 {
      l6$y5 var1 = new l6$y5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$t2 var5 = null;
      Object var6 = null;
      Object var7 = null;
      var1.k5 = new c5();
      var1.k5.n5(true);

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 148, f9);
            var6 = this.u3.n5(var3);
            this.u3.l6(var2, var6);
            var1.k5.n5(var3.l6());
            byte var8 = 2;
            int var9 = this.l6.n5(1);
            if (var9 == 98) {
               var8 = 1;
            }

            switch (var8) {
               case 1:
                  var4 = (y2)this.n5(this.l6, 98, n4);
                  var7 = this.u3.n5(var4);
                  var2 = this.u3.k5(var7, var2);
                  this.n5(y3);
                  var5 = this.a3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5.n5(var5.k5);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var13) {
            this.n5(var13);
            this.n5(this.l6, var13);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$y2 s0() throws w1 {
      l6$y2 var1 = new l6$y2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      Object var3 = null;
      Object var4 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 70, u7);
            var1.k5 = new d5();
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var9) {
            this.n5(var9);
            this.n5(this.l6, var9);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var9);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$d5 v8() throws w1 {
      l6$d5 var1 = new l6$d5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$s3 var3 = null;
      Object var4 = null;

      try {
         try {
            var2 = this.u3.n5();
            this.n5(x4);
            var3 = this.p3();
            this.n5.l6--;
            this.u3.l6(var2, var3.n5());
            this.n5(z4);
            var4 = this.y0();
            this.n5.l6--;
            var1.k5 = new b3(var3 != null ? var3.k5 : null);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var9) {
            this.n5(var9);
            this.n5(this.l6, var9);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var9);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$h2 v3() throws w1 {
      l6$h2 var1 = new l6$h2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      l6$c3 var7 = null;
      l6$c3 var8 = null;
      l6$s3 var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      v8 var14 = new v8();
      var1.k5 = var14;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 18, h3);
            var10 = this.u3.n5(var3);
            this.u3.l6(var2, var10);
            var4 = (y2)this.n5(this.l6, 65, d0);
            var11 = this.u3.n5(var4);
            this.u3.l6(var2, var11);
            this.n5(c1);
            var9 = this.p3();
            this.n5.l6--;
            this.u3.l6(var2, var9.n5());
            var14.n5(var9 != null ? var9.k5 : null);
            var5 = (y2)this.n5(this.l6, 66, l3);
            var12 = this.u3.n5(var5);
            this.u3.l6(var2, var12);
            this.n5(c0);
            var7 = this.j9();
            this.n5.l6--;
            this.u3.l6(var2, var7.n5());
            var14.n5(var7 != null ? var7.k5 : null);
            byte var15 = 2;
            int var16 = this.l6.n5(1);
            if (var16 == 14) {
               int var17 = this.l6.n5(2);
               if (this.l6.n5(1) == 14) {
                  var15 = 1;
               }
            }

            switch (var15) {
               case 1:
                  if (this.l6.n5(1) != 14) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "ifStatement", " input.LA(1) == ELSE ");
                  }

                  var6 = (y2)this.n5(this.l6, 14, f6);
                  var13 = this.u3.n5(var6);
                  this.u3.l6(var2, var13);
                  this.n5(f1s);
                  var8 = this.j9();
                  this.n5.l6--;
                  this.u3.l6(var2, var8.n5());
                  var14.l6(var8 != null ? var8.k5 : null);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var21) {
            this.n5(var21);
            this.n5(this.l6, var21);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var21);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$v0 g7() throws w1 {
      l6$v0 var1 = new l6$v0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$c4 var3 = null;
      l6$u8 var4 = null;
      l6$o0 var5 = null;

      try {
         try {
            byte var6 = 3;
            switch (this.l6.n5(1)) {
               case 13:
                  var6 = 1;
                  break;
               case 16:
                  var6 = 3;
                  break;
               case 30:
                  var6 = 2;
                  break;
               default:
                  throw new m3("", 64, 0, this.l6);
            }

            switch (var6) {
               case 1:
                  var2 = this.u3.n5();
                  this.n5(k0t);
                  var3 = this.j4();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  this.n5(e6r);
                  var4 = this.i9();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5 = var4.k5;
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(p5k);
                  var5 = this.f5();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = (a1)var5.k5;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$c4 j4() throws w1 {
      l6$c4 var1 = new l6$c4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      l6$c3 var7 = null;
      l6$s3 var8 = null;
      l6$d1 var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 13, z6z);
            var10 = this.u3.n5(var3);
            this.u3.l6(var2, var10);
            this.n5(y9w);
            var7 = this.j9();
            this.n5.l6--;
            this.u3.l6(var2, var7.n5());
            var4 = (y2)this.n5(this.l6, 30, i0e);
            var11 = this.u3.n5(var4);
            this.u3.l6(var2, var11);
            var5 = (y2)this.n5(this.l6, 65, f6z);
            var12 = this.u3.n5(var5);
            this.u3.l6(var2, var12);
            this.n5(u1s);
            var8 = this.p3();
            this.n5.l6--;
            this.u3.l6(var2, var8.n5());
            var6 = (y2)this.n5(this.l6, 66, t4r);
            var13 = this.u3.n5(var6);
            this.u3.l6(var2, var13);
            this.n5(e5a);
            var9 = this.y0();
            this.n5.l6--;
            this.u3.l6(var2, var9.n5());
            var1.k5 = new com.aspose.slides.internal.i4.d2(var8 != null ? var8.k5 : null, var7 != null ? var7.k5 : null);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var18) {
            this.n5(var18);
            this.n5(this.l6, var18);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var18);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$u8 i9() throws w1 {
      l6$u8 var1 = new l6$u8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      Object var5 = null;
      l6$s3 var6 = null;
      l6$c3 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 30, r3q);
            var8 = this.u3.n5(var3);
            var2 = this.u3.k5(var8, var2);
            var4 = (y2)this.n5(this.l6, 65, d4n);
            this.n5(f8y);
            var6 = this.p3();
            this.n5.l6--;
            this.u3.l6(var2, var6.n5());
            var5 = (y2)this.n5(this.l6, 66, o9b);
            this.n5(x4g);
            var7 = this.j9();
            this.n5.l6--;
            this.u3.l6(var2, var7.n5());
            var1.k5 = new t5(var6 != null ? var6.k5 : null, var7 != null ? var7.k5 : null);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$o0 f5() throws w1 {
      l6$o0 var1 = new l6$o0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      Object var5 = null;
      l6$b3 var6 = null;
      l6$c3 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 16, j9e);
            var8 = this.u3.n5(var3);
            var2 = this.u3.k5(var8, var2);
            var4 = (y2)this.n5(this.l6, 65, n3c);
            this.n5(v7u);
            var6 = this.j3();
            this.n5.l6--;
            this.u3.l6(var2, var6.n5());
            var1.k5 = var6.k5;
            var5 = (y2)this.n5(this.l6, 66, x7n);
            this.n5(z0k);
            var7 = this.j9();
            this.n5.l6--;
            this.u3.l6(var2, var7.n5());
            var1.k5.l6(var7.k5);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$b3 j3() throws w1 {
      l6$b3 var1 = new l6$b3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$e5 var3 = null;
      l6$f2 var4 = null;
      l6$i1 var5 = null;

      try {
         try {
            byte var6 = 3;
            switch (this.l6.n5(1)) {
               case 4:
               case 5:
               case 6:
               case 12:
               case 17:
               case 21:
               case 24:
               case 27:
               case 29:
               case 63:
               case 65:
               case 67:
               case 80:
               case 81:
               case 84:
               case 85:
               case 92:
               case 93:
               case 148:
               case 149:
               case 155:
               case 159:
               case 160:
               case 161:
                  var6 = 2;
                  break;
               case 28:
                  var6 = 1;
                  break;
               case 70:
                  var6 = 3;
                  break;
               default:
                  throw new m3("", 65, 0, this.l6);
            }

            switch (var6) {
               case 1:
                  var2 = this.u3.n5();
                  this.n5(g8v);
                  var3 = this.n1();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  this.n5(k1d);
                  var4 = this.p6();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5 = var4.k5;
                  break;
               case 3:
                  var2 = this.u3.n5();
                  this.n5(v2s);
                  var5 = this.d1();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5 = var5.k5;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$e5 n1() throws w1 {
      l6$e5 var1 = new l6$e5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      l6$y5 var8 = null;
      l6$s3 var9 = null;
      l6$y5 var10 = null;
      l6$s3 var11 = null;
      l6$s3 var12 = null;
      Object var13 = null;
      Object var14 = null;
      Object var15 = null;
      Object var16 = null;
      Object var17 = null;
      v4 var18 = new v4();
      z7 var19 = new z7();
      m1 var20 = new m1();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 28, f1c);
            var13 = this.u3.n5(var3);
            this.u3.l6(var2, var13);
            this.n5(p6w);
            var8 = this.w2();
            this.n5.l6--;
            this.u3.l6(var2, var8.n5());
            c5 var21 = var8.k5;
            var18.n5(var21);
            var19.n5(var21);
            var8.k5.n5(false);
            byte var22 = 2;
            int var23 = this.l6.n5(1);
            if (var23 == 19) {
               var22 = 1;
            } else {
               if (var23 < 70 || var23 > 71) {
                  throw new m3("", 69, 0, this.l6);
               }

               var22 = 2;
            }

            switch (var22) {
               case 1:
                  var4 = (y2)this.n5(this.l6, 19, p4l);
                  var14 = this.u3.n5(var4);
                  this.u3.l6(var2, var14);
                  this.n5(p6t);
                  var9 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  var1.k5 = var19;
                  var19.n5(var9 != null ? var9.k5 : null);
                  break;
               case 2:
                  label316:
                  while (true) {
                     byte var24 = 2;
                     int var25 = this.l6.n5(1);
                     if (var25 == 71) {
                        var24 = 1;
                     }

                     switch (var24) {
                        case 1:
                           var5 = (y2)this.n5(this.l6, 71, e3m);
                           var15 = this.u3.n5(var5);
                           this.u3.l6(var2, var15);
                           if (var20.n5().size() == 0) {
                              var18.n5(var20);
                              var19.n5(var20);
                              var20.n5().addItem(var8.k5);
                           }

                           this.n5(k9m);
                           var10 = this.w2();
                           this.n5.l6--;
                           this.u3.l6(var2, var10.n5());
                           var10.k5.n5(false);
                           var20.n5().addItem(var10.k5);
                           break;
                        default:
                           var6 = (y2)this.n5(this.l6, 70, h3d);
                           var16 = this.u3.n5(var6);
                           this.u3.l6(var2, var16);
                           var24 = 2;
                           var25 = this.l6.n5(1);
                           if (var25 >= 4 && var25 <= 6
                              || var25 == 12
                              || var25 == 17
                              || var25 == 21
                              || var25 == 24
                              || var25 == 27
                              || var25 == 29
                              || var25 == 63
                              || var25 == 65
                              || var25 == 67
                              || var25 >= 80 && var25 <= 81
                              || var25 >= 84 && var25 <= 85
                              || var25 >= 92 && var25 <= 93
                              || var25 >= 148 && var25 <= 149
                              || var25 == 155
                              || var25 >= 159 && var25 <= 161) {
                              var24 = 1;
                           }

                           switch (var24) {
                              case 1:
                                 this.n5(u6p);
                                 var11 = this.p3();
                                 this.n5.l6--;
                                 this.u3.l6(var2, var11.n5());
                                 var18.k5(var11 != null ? var11.k5 : null);
                           }

                           var7 = (y2)this.n5(this.l6, 70, o8m);
                           var17 = this.u3.n5(var7);
                           this.u3.l6(var2, var17);
                           byte var26 = 2;
                           int var27 = this.l6.n5(1);
                           if (var27 >= 4 && var27 <= 6
                              || var27 == 12
                              || var27 == 17
                              || var27 == 21
                              || var27 == 24
                              || var27 == 27
                              || var27 == 29
                              || var27 == 63
                              || var27 == 65
                              || var27 == 67
                              || var27 >= 80 && var27 <= 81
                              || var27 >= 84 && var27 <= 85
                              || var27 >= 92 && var27 <= 93
                              || var27 >= 148 && var27 <= 149
                              || var27 == 155
                              || var27 >= 159 && var27 <= 161) {
                              var26 = 1;
                           }

                           switch (var26) {
                              case 1:
                                 this.n5(f3c);
                                 var12 = this.p3();
                                 this.n5.l6--;
                                 this.u3.l6(var2, var12.n5());
                                 var18.u3(var12 != null ? var12.k5 : null);
                              default:
                                 var1.k5 = var18;
                                 break label316;
                           }
                     }
                  }
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
            if (var20.n5().size() > 0) {
               for (Object var52 : var20.n5()) {
                  c5 var53 = new c5();
                  var53.n5(false);
                  var53.n5(((c5)var52).l6());
                  this.e2l.n5(var53);
               }
            } else {
               var21 = new c5();
               var21.n5(false);
               var21.n5(var8.k5.l6());
               this.e2l.n5(var21);
            }
         } catch (w1 var31) {
            this.n5(var31);
            this.n5(this.l6, var31);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var31);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$f2 p6() throws w1 {
      l6$f2 var1 = new l6$f2();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      l6$d2 var6 = null;
      l6$s3 var7 = null;
      l6$s3 var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      v4 var12 = new v4();
      z7 var13 = new z7();
      Object[] var14 = new Object[1];

      try {
         try {
            var2 = this.u3.n5();
            this.n5(j2p);
            var6 = this.x9();
            this.n5.l6--;
            this.u3.l6(var2, var6.n5());
            e5 var15 = var6.k5;
            var12.n5(var15);
            var13.n5((a1)var15);
            byte var16 = 2;
            int var17 = this.l6.n5(1);
            if (var17 == 19) {
               var16 = 1;
            } else {
               if (var17 != 70) {
                  throw new m3("", 72, 0, this.l6);
               }

               var16 = 2;
            }

            switch (var16) {
               case 1:
                  if (!this.l6(var6.k5, var14)) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "forControlExpression", " isLeftHandSideIn(ex1.value, isLhs) ");
                  }

                  var3 = (y2)this.n5(this.l6, 19, u0a);
                  var9 = this.u3.n5(var3);
                  this.u3.l6(var2, var9);
                  this.n5(w1n);
                  var7 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5 = var13;
                  var13.n5(var7.k5);
                  break;
               case 2:
                  var4 = (y2)this.n5(this.l6, 70, m6n);
                  var10 = this.u3.n5(var4);
                  this.u3.l6(var2, var10);
                  byte var18 = 2;
                  int var19 = this.l6.n5(1);
                  if (var19 >= 4 && var19 <= 6
                     || var19 == 12
                     || var19 == 17
                     || var19 == 21
                     || var19 == 24
                     || var19 == 27
                     || var19 == 29
                     || var19 == 63
                     || var19 == 65
                     || var19 == 67
                     || var19 >= 80 && var19 <= 81
                     || var19 >= 84 && var19 <= 85
                     || var19 >= 92 && var19 <= 93
                     || var19 >= 148 && var19 <= 149
                     || var19 == 155
                     || var19 >= 159 && var19 <= 161) {
                     var18 = 1;
                  }

                  switch (var18) {
                     case 1:
                        this.n5(l7h);
                        var7 = this.p3();
                        this.n5.l6--;
                        this.u3.l6(var2, var7.n5());
                        var12.k5(var7.k5);
                  }

                  var5 = (y2)this.n5(this.l6, 70, r7c);
                  var11 = this.u3.n5(var5);
                  this.u3.l6(var2, var11);
                  byte var20 = 2;
                  int var21 = this.l6.n5(1);
                  if (var21 >= 4 && var21 <= 6
                     || var21 == 12
                     || var21 == 17
                     || var21 == 21
                     || var21 == 24
                     || var21 == 27
                     || var21 == 29
                     || var21 == 63
                     || var21 == 65
                     || var21 == 67
                     || var21 >= 80 && var21 <= 81
                     || var21 >= 84 && var21 <= 85
                     || var21 >= 92 && var21 <= 93
                     || var21 >= 148 && var21 <= 149
                     || var21 == 155
                     || var21 >= 159 && var21 <= 161) {
                     var20 = 1;
                  }

                  switch (var20) {
                     case 1:
                        this.n5(l2p);
                        var8 = this.p3();
                        this.n5.l6--;
                        this.u3.l6(var2, var8.n5());
                        var12.u3(var8.k5);
                     default:
                        var1.k5 = var12;
                  }
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var25) {
            this.n5(var25);
            this.n5(this.l6, var25);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var25);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$i1 d1() throws w1 {
      l6$i1 var1 = new l6$i1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$s3 var5 = null;
      l6$s3 var6 = null;
      Object var7 = null;
      Object var8 = null;
      var1.k5 = new v4();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 70, r5t);
            var7 = this.u3.n5(var3);
            this.u3.l6(var2, var7);
            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 >= 4 && var10 <= 6
               || var10 == 12
               || var10 == 17
               || var10 == 21
               || var10 == 24
               || var10 == 27
               || var10 == 29
               || var10 == 63
               || var10 == 65
               || var10 == 67
               || var10 >= 80 && var10 <= 81
               || var10 >= 84 && var10 <= 85
               || var10 >= 92 && var10 <= 93
               || var10 >= 148 && var10 <= 149
               || var10 == 155
               || var10 >= 159 && var10 <= 161) {
               var9 = 1;
            }

            switch (var9) {
               case 1:
                  this.n5(r6i);
                  var5 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5.k5(var5.k5);
            }

            var4 = (y2)this.n5(this.l6, 70, h3r);
            var8 = this.u3.n5(var4);
            this.u3.l6(var2, var8);
            byte var11 = 2;
            int var12 = this.l6.n5(1);
            if (var12 >= 4 && var12 <= 6
               || var12 == 12
               || var12 == 17
               || var12 == 21
               || var12 == 24
               || var12 == 27
               || var12 == 29
               || var12 == 63
               || var12 == 65
               || var12 == 67
               || var12 >= 80 && var12 <= 81
               || var12 >= 84 && var12 <= 85
               || var12 >= 92 && var12 <= 93
               || var12 >= 148 && var12 <= 149
               || var12 == 155
               || var12 >= 159 && var12 <= 161) {
               var11 = 1;
            }

            switch (var11) {
               case 1:
                  this.n5(n5u);
                  var6 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5.u3(var6.k5);
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var16) {
            this.n5(var16);
            this.n5(this.l6, var16);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var16);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$w1 s4() throws w1 {
      l6$w1 var1 = new l6$w1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      Object var5 = null;
      Object var6 = null;
      Object var7 = null;
      String var8 = com.aspose.slides.ms.System.d1.n5;

      try {
         try {
            var2 = this.u3.n5();
            var4 = (y2)this.n5(this.l6, 10, b8c);
            var7 = this.u3.n5(var4);
            var2 = this.u3.k5(var7, var2);
            if (this.l6.n5(1) == 148) {
               this.n5((com.aspose.slides.internal.n5.j5)null);
            }

            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 == 148) {
               var9 = 1;
            }

            switch (var9) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 148, t1z);
                  var6 = this.u3.n5(var3);
                  this.u3.l6(var2, var6);
                  var8 = var3.l6();
               default:
                  this.n5(d0p);
                  var5 = this.y0();
                  this.n5.l6--;
                  var1.k5 = new com.aspose.slides.internal.i4.j5();
                  var1.k5.k5(var8);
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var14) {
            this.n5(var14);
            this.n5(this.l6, var14);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var14);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$m1 h6() throws w1 {
      l6$m1 var1 = new l6$m1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      Object var5 = null;
      Object var6 = null;
      Object var7 = null;
      String var8 = com.aspose.slides.ms.System.d1.n5;

      try {
         try {
            var2 = this.u3.n5();
            var4 = (y2)this.n5(this.l6, 7, x6s);
            var7 = this.u3.n5(var4);
            var2 = this.u3.k5(var7, var2);
            if (this.l6.n5(1) == 148) {
               this.n5((com.aspose.slides.internal.n5.j5)null);
            }

            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 == 148) {
               var9 = 1;
            }

            switch (var9) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 148, s5g);
                  var6 = this.u3.n5(var3);
                  this.u3.l6(var2, var6);
                  var8 = var3.l6();
               default:
                  this.n5(k4s);
                  var5 = this.y0();
                  this.n5.l6--;
                  var1.k5 = new z1();
                  var1.k5.k5(var8);
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var14) {
            this.n5(var14);
            this.n5(this.l6, var14);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var14);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$p6 y8() throws w1 {
      l6$p6 var1 = new l6$p6();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$s3 var4 = null;
      Object var5 = null;
      Object var6 = null;
      var1.k5 = new f4();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 22, x7i);
            var6 = this.u3.n5(var3);
            var2 = this.u3.k5(var6, var2);
            this.n5((com.aspose.slides.internal.n5.j5)null);
            byte var7 = 2;
            int var8 = this.l6.n5(1);
            if (var8 >= 4 && var8 <= 6
               || var8 == 12
               || var8 == 17
               || var8 == 21
               || var8 == 24
               || var8 == 27
               || var8 == 29
               || var8 == 63
               || var8 == 65
               || var8 == 67
               || var8 >= 80 && var8 <= 81
               || var8 >= 84 && var8 <= 85
               || var8 >= 92 && var8 <= 93
               || var8 >= 148 && var8 <= 149
               || var8 == 155
               || var8 >= 159 && var8 <= 161) {
               var7 = 1;
            }

            switch (var7) {
               case 1:
                  this.n5(r5d);
                  var4 = this.p3();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5.n5(var4.k5);
               default:
                  this.n5(v9e);
                  var5 = this.y0();
                  this.n5.l6--;
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
            }
         } catch (w1 var12) {
            this.n5(var12);
            this.n5(this.l6, var12);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$w5 c3() throws w1 {
      l6$w5 var1 = new l6$w5();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      Object var5 = null;
      l6$s3 var6 = null;
      l6$c3 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 31, t9p);
            var8 = this.u3.n5(var3);
            var2 = this.u3.k5(var8, var2);
            var4 = (y2)this.n5(this.l6, 65, w4w);
            this.n5(c9b);
            var6 = this.p3();
            this.n5.l6--;
            this.u3.l6(var2, var6.n5());
            var5 = (y2)this.n5(this.l6, 66, r5w);
            this.n5(t5g);
            var7 = this.j9();
            this.n5.l6--;
            this.u3.l6(var2, var7.n5());
            var1.k5 = new j6(var6.k5, var7.k5);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$l4 l4() throws w1 {
      l6$l4 var1 = new l6$l4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      l6$s3 var8 = null;
      l6$r4 var9 = null;
      l6$k7 var10 = null;
      Object var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      Object var15 = null;
      q2 var16 = new q2();
      var1.k5 = var16;
      int var17 = 0;

      try {
         var2 = this.u3.n5();
         var3 = (y2)this.n5(this.l6, 23, m5l);
         var11 = this.u3.n5(var3);
         this.u3.l6(var2, var11);
         var4 = (y2)this.n5(this.l6, 65, k3h);
         var12 = this.u3.n5(var4);
         this.u3.l6(var2, var12);
         this.n5(u4k);
         var8 = this.p3();
         this.n5.l6--;
         this.u3.l6(var2, var8.n5());
         var16.n5(var8 != null ? var8.k5 : null);
         var5 = (y2)this.n5(this.l6, 66, g1p);
         var13 = this.u3.n5(var5);
         this.u3.l6(var2, var13);
         var6 = (y2)this.n5(this.l6, 63, c4t);
         var14 = this.u3.n5(var6);
         this.u3.l6(var2, var14);

         while (true) {
            byte var18 = 3;
            int var19 = this.l6.n5(1);
            if (var19 == 11 && var17 == 0) {
               var18 = 1;
            } else if (var19 == 8) {
               var18 = 2;
            }

            switch (var18) {
               case 1:
                  if (var17 != 0) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "switchStatement", " defaultClauseCount == 0 ");
                  }

                  this.n5(z1n);
                  var9 = this.a7();
                  this.n5.l6--;
                  this.u3.l6(var2, var9.n5());
                  var17++;
                  var16.l6(var9 != null ? var9.k5 : null);
                  break;
               case 2:
                  this.n5(k2p);
                  var10 = this.i6();
                  this.n5.l6--;
                  this.u3.l6(var2, var10.n5());
                  var16.l6().addItem(var10 != null ? var10.k5 : null);
                  break;
               default:
                  var7 = (y2)this.n5(this.l6, 64, u7f);
                  var15 = this.u3.n5(var7);
                  this.u3.l6(var2, var15);
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var23) {
         this.n5(var23);
         this.n5(this.l6, var23);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var23);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$k7 i6() throws w1 {
      l6$k7 var1 = new l6$k7();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      l6$s3 var5 = null;
      l6$c3 var6 = null;
      Object var7 = null;
      Object var8 = null;
      var1.k5 = new com.aspose.slides.internal.i4.q0();

      try {
         var2 = this.u3.n5();
         var3 = (y2)this.n5(this.l6, 8, s1o);
         var7 = this.u3.n5(var3);
         var2 = this.u3.k5(var7, var2);
         this.n5(n2z);
         var5 = this.p3();
         this.n5.l6--;
         this.u3.l6(var2, var5.n5());
         var1.k5.n5(var5 != null ? var5.k5 : null);
         var4 = (y2)this.n5(this.l6, 97, w8d);

         while (true) {
            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 >= 4 && var10 <= 7
               || var10 == 10
               || var10 >= 12 && var10 <= 13
               || var10 >= 16 && var10 <= 18
               || var10 >= 21 && var10 <= 31
               || var10 == 63
               || var10 == 65
               || var10 == 67
               || var10 == 70
               || var10 >= 80 && var10 <= 81
               || var10 >= 84 && var10 <= 85
               || var10 >= 92 && var10 <= 93
               || var10 >= 148 && var10 <= 149
               || var10 == 155
               || var10 >= 159 && var10 <= 161) {
               var9 = 1;
            }

            switch (var9) {
               case 1:
                  this.n5(l8r);
                  var6 = this.j9();
                  this.n5.l6--;
                  this.u3.l6(var2, var6.n5());
                  var1.k5.l6().n5().l6(var6 != null ? var6.k5 : null);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var14) {
         this.n5(var14);
         this.n5(this.l6, var14);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var14);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$r4 a7() throws w1 {
      l6$r4 var1 = new l6$r4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      Object var4 = null;
      l6$c3 var5 = null;
      Object var6 = null;
      Object var7 = null;
      var1.k5 = new n3();

      try {
         var2 = this.u3.n5();
         var3 = (y2)this.n5(this.l6, 11, x1f);
         var6 = this.u3.n5(var3);
         var2 = this.u3.k5(var6, var2);
         var4 = (y2)this.n5(this.l6, 97, o3i);

         while (true) {
            byte var8 = 2;
            int var9 = this.l6.n5(1);
            if (var9 >= 4 && var9 <= 7
               || var9 == 10
               || var9 >= 12 && var9 <= 13
               || var9 >= 16 && var9 <= 18
               || var9 >= 21 && var9 <= 31
               || var9 == 63
               || var9 == 65
               || var9 == 67
               || var9 == 70
               || var9 >= 80 && var9 <= 81
               || var9 >= 84 && var9 <= 85
               || var9 >= 92 && var9 <= 93
               || var9 >= 148 && var9 <= 149
               || var9 == 155
               || var9 >= 159 && var9 <= 161) {
               var8 = 1;
            }

            switch (var8) {
               case 1:
                  this.n5(z6e);
                  var5 = this.j9();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5.n5().l6(var5 != null ? var5.k5 : null);
                  break;
               default:
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var13) {
         this.n5(var13);
         this.n5(this.l6, var13);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var13);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$f0 r8() throws w1 {
      l6$f0 var1 = new l6$f0();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$c3 var5 = null;
      Object var6 = null;
      Object var7 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 148, g4u);
            var6 = this.u3.n5(var3);
            this.u3.l6(var2, var6);
            var4 = (y2)this.n5(this.l6, 97, y8m);
            var7 = this.u3.n5(var4);
            this.u3.l6(var2, var7);
            this.n5(c7f);
            var5 = this.j9();
            this.n5.l6--;
            this.u3.l6(var2, var5.n5());
            var1.k5 = var5.k5;
            var1.k5.k5(var3.l6());
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var12) {
            this.n5(var12);
            this.n5(this.l6, var12);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var12);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$i6 r1() throws w1 {
      l6$i6 var1 = new l6$i6();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$s3 var4 = null;
      Object var5 = null;
      Object var6 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 25, c1x);
            var6 = this.u3.n5(var3);
            var2 = this.u3.k5(var6, var2);
            this.n5((com.aspose.slides.internal.n5.j5)null);
            this.n5(j8m);
            var4 = this.p3();
            this.n5.l6--;
            this.u3.l6(var2, var4.n5());
            var1.k5 = new d6(var4.k5);
            this.n5(p7x);
            var5 = this.y0();
            this.n5.l6--;
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var11) {
            this.n5(var11);
            this.n5(this.l6, var11);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var11);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$a7 y5() throws w1 {
      l6$a7 var1 = new l6$a7();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$q0 var4 = null;
      l6$m3 var5 = null;
      l6$p8 var6 = null;
      l6$p8 var7 = null;
      Object var8 = null;
      var1.k5 = new y6();

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 26, o6t);
            var8 = this.u3.n5(var3);
            var2 = this.u3.k5(var8, var2);
            this.n5(l1b);
            var4 = this.e9();
            this.n5.l6--;
            this.u3.l6(var2, var4.n5());
            var1.k5.n5(var4.k5);
            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 == 9) {
               var9 = 1;
            } else {
               if (var10 != 15) {
                  throw new m3("", 82, 0, this.l6);
               }

               var9 = 2;
            }

            label51:
            switch (var9) {
               case 1:
                  this.n5(n9q);
                  var5 = this.k8();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var1.k5.n5(var5.k5);
                  byte var11 = 2;
                  int var12 = this.l6.n5(1);
                  if (var12 == 15) {
                     var11 = 1;
                  }

                  switch (var11) {
                     case 1:
                        this.n5(d2n);
                        var6 = this.b5();
                        this.n5.l6--;
                        this.u3.l6(var2, var6.n5());
                        var1.k5.n5(var6.k5);
                     default:
                        break label51;
                  }
               case 2:
                  this.n5(g2x);
                  var7 = this.b5();
                  this.n5.l6--;
                  this.u3.l6(var2, var7.n5());
                  var1.k5.n5(var7.k5);
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var16) {
            this.n5(var16);
            this.n5(this.l6, var16);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var16);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$m3 k8() throws w1 {
      l6$m3 var1 = new l6$m3();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      Object var5 = null;
      Object var6 = null;
      l6$q0 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;

      try {
         try {
            var2 = this.u3.n5();
            var4 = (y2)this.n5(this.l6, 9, s2b);
            var9 = this.u3.n5(var4);
            var2 = this.u3.k5(var9, var2);
            var5 = (y2)this.n5(this.l6, 65, o5k);
            var3 = (y2)this.n5(this.l6, 148, n1g);
            var8 = this.u3.n5(var3);
            this.u3.l6(var2, var8);
            var6 = (y2)this.n5(this.l6, 66, q8g);
            this.n5(e6a);
            var7 = this.e9();
            this.n5.l6--;
            this.u3.l6(var2, var7.n5());
            var1.k5 = new com.aspose.slides.internal.i4.z3(var3 != null ? var3.l6() : null, var7 != null ? var7.k5 : null);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var16) {
            this.n5(var16);
            this.n5(this.l6, var16);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var16);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$p8 b5() throws w1 {
      l6$p8 var1 = new l6$p8();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      l6$q0 var4 = null;
      Object var5 = null;

      try {
         try {
            var2 = this.u3.n5();
            var3 = (y2)this.n5(this.l6, 15, x4a);
            var5 = this.u3.n5(var3);
            var2 = this.u3.k5(var5, var2);
            this.n5(r7n);
            var4 = this.e9();
            this.n5.l6--;
            this.u3.l6(var2, var4.n5());
            var1.k5 = new o0(var4 != null ? var4.k5 : null);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var10) {
            this.n5(var10);
            this.n5(this.l6, var10);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$u6 u8() throws w1 {
      l6$u6 var1 = new l6$u6();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$z7 var5 = null;
      l6$v4 var6 = null;
      Object var7 = null;
      Object var8 = null;
      com.aspose.slides.internal.i4.a5 var9 = new com.aspose.slides.internal.i4.a5();
      var1.k5 = new d5();
      this.e2l.n5(var9);

      try {
         try {
            var2 = this.u3.n5();
            var4 = (y2)this.n5(this.l6, 17, f3l);
            var8 = this.u3.n5(var4);
            this.u3.l6(var2, var8);
            var3 = (y2)this.n5(this.l6, 148, p2i);
            var7 = this.u3.n5(var3);
            this.u3.l6(var2, var7);
            var9.n5(var3.l6());
            this.n5(c9t);
            var5 = this.q1();
            this.n5.l6--;
            this.u3.l6(var2, var5.n5());

            for (int var10 = 0; var10 < var5.k5.size(); var10++) {
               var9.l6().addItem(var5.k5.get(var10));
            }

            this.n5(m4d);
            var6 = this.u5();
            this.n5.l6--;
            this.u3.l6(var2, var6.n5());
            var9.n5(var6.k5);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var14) {
            this.n5(var14);
            this.n5(this.l6, var14);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var14);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$t1 w5() throws w1 {
      l6$t1 var1 = new l6$t1();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$z7 var5 = null;
      l6$v4 var6 = null;
      Object var7 = null;
      Object var8 = null;
      var1.k5 = new h2();

      try {
         try {
            var2 = this.u3.n5();
            var4 = (y2)this.n5(this.l6, 17, g3y);
            var8 = this.u3.n5(var4);
            this.u3.l6(var2, var8);
            byte var9 = 2;
            int var10 = this.l6.n5(1);
            if (var10 == 148) {
               var9 = 1;
            }

            int var11;
            switch (var9) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 148, d2a);
                  var7 = this.u3.n5(var3);
                  this.u3.l6(var2, var7);
                  var1.k5.n5(var3.l6());
               default:
                  this.n5(r6a);
                  var5 = this.q1();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var11 = 0;
            }

            while (var11 < (var5 != null ? var5.k5 : null).size()) {
               var1.k5.l6().addItem((var5 != null ? var5.k5 : null).get(var11));
               var11++;
            }

            this.n5(c5q);
            var6 = this.u5();
            this.n5.l6--;
            this.u3.l6(var2, var6.n5());
            var1.k5.n5(var6 != null ? var6.k5 : null);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var15) {
            this.n5(var15);
            this.n5(this.l6, var15);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$z7 q1() throws w1 {
      l6$z7 var1 = new l6$z7();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      y2 var5 = null;
      y2 var6 = null;
      y2 var7 = null;
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var12 = null;
      y8 var13 = new y8();
      var1.k5 = var13;

      try {
         try {
            var2 = this.u3.n5();
            var5 = (y2)this.n5(this.l6, 65, p6r);
            var10 = this.u3.n5(var5);
            this.u3.l6(var2, var10);
            byte var14 = 2;
            int var15 = this.l6.n5(1);
            if (var15 == 148) {
               var14 = 1;
            }

            switch (var14) {
               case 1:
                  var3 = (y2)this.n5(this.l6, 148, e8p);
                  var8 = this.u3.n5(var3);
                  this.u3.l6(var2, var8);
                  var13.addItem(var3 != null ? var3.l6() : null);

                  label67:
                  while (true) {
                     byte var16 = 2;
                     int var17 = this.l6.n5(1);
                     if (var17 == 71) {
                        var16 = 1;
                     }

                     switch (var16) {
                        case 1:
                           var6 = (y2)this.n5(this.l6, 71, e4w);
                           var11 = this.u3.n5(var6);
                           this.u3.l6(var2, var11);
                           var4 = (y2)this.n5(this.l6, 148, y4k);
                           var9 = this.u3.n5(var4);
                           this.u3.l6(var2, var9);
                           var13.addItem(var4 != null ? var4.l6() : null);
                           break;
                        default:
                           break label67;
                     }
                  }
            }

            var7 = (y2)this.n5(this.l6, 66, h6l);
            var12 = this.u3.n5(var7);
            this.u3.l6(var2, var12);
            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var21) {
            this.n5(var21);
            this.n5(this.l6, var21);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var21);
         }

         return var1;
      } finally {
         ;
      }
   }

   public final l6$v4 u5() throws w1 {
      l6$v4 var1 = new l6$v4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      y2 var3 = null;
      y2 var4 = null;
      l6$h6 var5 = null;
      Object var6 = null;
      Object var7 = null;
      n3 var8 = new n3();
      s4 var9 = this.e2l;
      this.e2l = var8.n5();
      var1.k5 = var8;

      try {
         var2 = this.u3.n5();
         var3 = (y2)this.n5(this.l6, 63, q4d);
         var6 = this.u3.n5(var3);
         this.u3.l6(var2, var6);

         while (true) {
            byte var10 = 2;
            int var11 = this.l6.n5(1);
            if (var11 >= 4 && var11 <= 7
               || var11 == 10
               || var11 >= 12 && var11 <= 13
               || var11 >= 16 && var11 <= 18
               || var11 >= 21 && var11 <= 31
               || var11 == 63
               || var11 == 65
               || var11 == 67
               || var11 == 70
               || var11 >= 80 && var11 <= 81
               || var11 >= 84 && var11 <= 85
               || var11 >= 92 && var11 <= 93
               || var11 >= 148 && var11 <= 149
               || var11 == 155
               || var11 >= 159 && var11 <= 161) {
               var10 = 1;
            }

            switch (var10) {
               case 1:
                  this.n5(q9u);
                  var5 = this.c2();
                  this.n5.l6--;
                  this.u3.l6(var2, var5.n5());
                  var8.n5().l6(var5 != null ? var5.k5 : null);
                  break;
               default:
                  var4 = (y2)this.n5(this.l6, 64, y5s);
                  var7 = this.u3.n5(var4);
                  this.u3.l6(var2, var7);
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  this.e2l = var9;
                  return var1;
            }
         }
      } catch (w1 var15) {
         this.n5(var15);
         this.n5(this.l6, var15);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var15);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$j4 w8() throws w1 {
      l6$j4 var1 = new l6$j4();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$h6 var3 = null;
      u5 var4 = new u5();
      this.e2l = var4.n5();

      try {
         var2 = this.u3.n5();

         while (true) {
            byte var5 = 2;
            int var6 = this.l6.n5(1);
            if (var6 >= 4 && var6 <= 7
               || var6 == 10
               || var6 >= 12 && var6 <= 13
               || var6 >= 16 && var6 <= 18
               || var6 >= 21 && var6 <= 31
               || var6 == 63
               || var6 == 65
               || var6 == 67
               || var6 == 70
               || var6 >= 80 && var6 <= 81
               || var6 >= 84 && var6 <= 85
               || var6 >= 92 && var6 <= 93
               || var6 >= 148 && var6 <= 149
               || var6 == 155
               || var6 >= 159 && var6 <= 161) {
               var5 = 1;
            }

            switch (var5) {
               case 1:
                  this.n5(b9y);
                  var3 = this.c2();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var4.n5().l6(var3.k5);
                  break;
               default:
                  var1.k5 = var4;
                  var1.l6 = this.l6.u9(-1);
                  var1.u3 = this.u3.l6(var2);
                  this.u3.n5(var1.u3, var1.n5, var1.l6);
                  return var1;
            }
         }
      } catch (w1 var10) {
         this.n5(var10);
         this.n5(this.l6, var10);
         var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var10);
         return var1;
      } finally {
         ;
      }
   }

   public final l6$h6 c2() throws w1 {
      l6$h6 var1 = new l6$h6();
      var1.n5 = this.l6.u9(1);
      Object var2 = null;
      l6$u6 var3 = null;
      l6$c3 var4 = null;

      try {
         try {
            int var5 = 2;
            var5 = this.h0.n5(this.l6);
            switch (var5) {
               case 1:
                  var2 = this.u3.n5();
                  if (this.l6.n5(1) != 17) {
                     throw new com.aspose.slides.internal.n5.y4(this.l6, "sourceElement", " input.LA(1) == FUNCTION ");
                  }

                  this.n5(d9m);
                  var3 = this.u8();
                  this.n5.l6--;
                  this.u3.l6(var2, var3.n5());
                  var1.k5 = var3.k5;
                  break;
               case 2:
                  var2 = this.u3.n5();
                  this.n5(g9t);
                  var4 = this.j9();
                  this.n5.l6--;
                  this.u3.l6(var2, var4.n5());
                  var1.k5 = var4.k5;
            }

            var1.l6 = this.l6.u9(-1);
            var1.u3 = this.u3.l6(var2);
            this.u3.n5(var1.u3, var1.n5, var1.l6);
         } catch (w1 var9) {
            this.n5(var9);
            this.n5(this.l6, var9);
            var1.u3 = this.u3.n5(this.l6, var1.n5, this.l6.u9(-1), var9);
         }

         return var1;
      } finally {
         ;
      }
   }

   static {
      int var0 = c8.length;
      t9 = new short[var0][];

      for (int var1 = 0; var1 < var0; var1++) {
         t9[var1] = com.aspose.slides.internal.n5.x8.n5(c8[var1]);
      }

      z1 = new String[]{
         "\u0003\u0003\u0001\b\u0002\uffff\u0001\u0007\u0001\uffff\u0001\u0003\u0001\u0006\u0002\uffff\u0001\u0006\u0001\u0003\u0001\u0005\u0002\uffff\u0001\u0003\u0001\t\u0001\u000b\u0001\u0003\u0001\f\u0001\r\u0001\u0003\u0001\u0001\u0001\u0003\u0001\u0006\u0001\n\u001f\uffff\u0001\u0003\u0001\uffff\u0001\u0003\u0001\uffff\u0001\u0003\u0002\uffff\u0001\u0002\t\uffff\u0002\u0003\u0002\uffff\u0002\u0003\u0006\uffff\u0002\u00036\uffff\u0001\u0004\u0001\u0003\u0005\uffff\u0001\u0003\u0003\uffff\u0003\u0003",
         "",
         "",
         "",
         "\u0002\u0003*\uffff\u0003\u0003\u0001\uffff\u0001\u0003\u0001\uffff\u0017\u0003\u0002\uffff\u0003\u0003\u0001\u000e\r\u0003\"\uffff\u0002\u0003",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         ""
      };
      t4 = com.aspose.slides.internal.n5.x8.n5("\u000f\uffff");
      q0 = com.aspose.slides.internal.n5.x8.n5("\u0004\uffff\u0001\u0003\n\uffff");
      z3 = com.aspose.slides.internal.n5.x8.l6("\u0001\u0004\u0003\uffff\u0001\u0013\n\uffff");
      m1 = com.aspose.slides.internal.n5.x8.l6("\u0001¡\u0003\uffff\u0001\u0092\n\uffff");
      k7 = com.aspose.slides.internal.n5.x8.n5(
         "\u0001\uffff\u0001\u0001\u0001\u0002\u0001\u0003\u0001\uffff\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\u000b\u0001\f\u0001\r\u0001\n"
      );
      m3 = com.aspose.slides.internal.n5.x8.n5("\u000f\uffff}>");
      var0 = z1.length;
      z8 = new short[var0][];

      for (int var4 = 0; var4 < var0; var4++) {
         z8[var4] = com.aspose.slides.internal.n5.x8.n5(z1[var4]);
      }

      j5 = new String[]{
         "\u0004\u0002\u0002\uffff\u0001\u0002\u0001\uffff\u0002\u0002\u0002\uffff\u0001\u0002\u0001\u0001\u0001\u0002\u0002\uffff\u000b\u0002\u001f\uffff\u0001\u0002\u0001\uffff\u0001\u0002\u0001\uffff\u0001\u0002\u0002\uffff\u0001\u0002\t\uffff\u0002\u0002\u0002\uffff\u0002\u0002\u0006\uffff\u0002\u00026\uffff\u0002\u0002\u0005\uffff\u0001\u0002\u0003\uffff\u0003\u0002",
         "\u0001\uffff",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         ""
      };
      w1 = com.aspose.slides.internal.n5.x8.n5("'\uffff");
      r4 = com.aspose.slides.internal.n5.x8.n5("'\uffff");
      c4 = com.aspose.slides.internal.n5.x8.l6("\u0001\u0004\u0001\u0000%\uffff");
      y2 = com.aspose.slides.internal.n5.x8.l6("\u0001¡\u0001\u0000%\uffff");
      y1 = com.aspose.slides.internal.n5.x8.n5("\u0002\uffff\u0001\u0002#\uffff\u0001\u0001");
      a0 = com.aspose.slides.internal.n5.x8.n5("\u0001\uffff\u0001\u0000%\uffff}>");
      var0 = j5.length;
      d2 = new short[var0][];

      for (int var5 = 0; var5 < var0; var5++) {
         d2[var5] = com.aspose.slides.internal.n5.x8.n5(j5[var5]);
      }

      d5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      i1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      e5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      b3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      o0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      z7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v4 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      u6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      t1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      a5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      h2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      a3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      y0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      z6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      e9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      o5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      w2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      v3 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      g7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648858L, 15169748992L});
      i9 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 144L});
      f5 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648858L, 15169748992L});
      j3 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 144L});
      n1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      d1 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 1L, 15035531264L});
      s4 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 129L});
      h6 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 15035531264L});
      y8 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 129L});
      c3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      l4 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 15035531264L});
      i6 = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE, 2L});
      a7 = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE, 2L});
      r8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r1 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 8589934592L});
      y5 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      k8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      b5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      u8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      w5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      q1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      u5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      w8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      c2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      t3 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036835770256L, 10L, 15169748992L});
      u4 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648718L, 15169748992L});
      p7 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 132L});
      z5 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      h5 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 132L});
      a8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648715L, 15169748992L});
      y9 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 129L});
      a1 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      w3 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 129L});
      i4 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      q3 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036854775806L, 42L});
      q2 = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE, 2L});
      p4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036854775806L, 42L});
      d6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      y6 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 16L});
      n7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036854775806L, 42L});
      l5 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      u2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036854775806L, 42L});
      d9 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 3145728L});
      c5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      t5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      w9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      m8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      b9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      h9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      n9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      a2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      h1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      t6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 35184372875264L});
      o2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      e0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      i2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      x7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 35184372875264L});
      z0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 196608L});
      z9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      f8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      s2 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 196608L});
      n2 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 29360128L});
      l0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      p9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      g8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      i0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 29360128L});
      b4 = new com.aspose.slides.internal.n5.a6(new long[]{1572866L, 3840L});
      x5 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      i8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      a4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      x3 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      b2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      m4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      b1 = new com.aspose.slides.internal.n5.a6(new long[]{1572866L, 3840L});
      j1 = new com.aspose.slides.internal.n5.a6(new long[]{1048578L, 3840L});
      k6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      o7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      v9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      r9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      c7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      w4 = new com.aspose.slides.internal.n5.a6(new long[]{1048578L, 3840L});
      n0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 61440L});
      f1 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      k2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      o8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      n8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      t0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 61440L});
      n6 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 61440L});
      p5 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      b0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      r0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      k3 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      d7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 61440L});
      o1 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 33554432L});
      m0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      o4 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 33554432L});
      k1 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 33554432L});
      o6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      g2 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 33554432L});
      l8 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 134217728L});
      s8 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      i3 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 134217728L});
      q6 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 134217728L});
      g1 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      k4 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 134217728L});
      e8 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 67108864L});
      b6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      v7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 67108864L});
      t7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 67108864L});
      c9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      d3 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 67108864L});
      o3 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 1073741824L});
      l1 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      y7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 1073741824L});
      i7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 1073741824L});
      c6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      x1 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 1073741824L});
      s6 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 2147483648L});
      b7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      b8 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 2147483648L});
      q7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 2147483648L});
      r3 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      q8 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 2147483648L});
      w0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 4294967296L});
      p1 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      q9 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 8589934592L});
      x6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      m9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r2 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 4294967296L});
      l7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      q5 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 8589934592L});
      e4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      g6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      o9 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 105535936397312L});
      a9 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      u0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      d8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      q4 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 105535936397312L});
      f7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      k9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s5 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 128L});
      l2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      j7 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 128L});
      k0 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 128L});
      d4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      v2 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 128L});
      e7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      e6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      u1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p0 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      l9 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      z2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      m5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p2 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g4 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      h7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      m6 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      t8 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      e1 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      m2 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648779L, 15169748992L});
      g0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648779L, 15169748992L});
      i5 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j2 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      w6 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      g5 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      h8 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      m7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      h4 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 17179869184L});
      w7 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      e3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f9 = new com.aspose.slides.internal.n5.a6(new long[]{2L, 17179869184L});
      n4 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      y3 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      u7 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x4 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      z4 = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      h3 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      d0 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      c1 = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      l3 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      c0 = new com.aspose.slides.internal.n5.a6(new long[]{16386L});
      f6 = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      f1s = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      k0t = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      e6r = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p5k = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      z6z = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      y9w = new com.aspose.slides.internal.n5.a6(new long[]{1073741824L});
      i0e = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      f6z = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      u1s = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      t4r = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      e5a = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r3q = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      d4n = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      f8y = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      o9b = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      x4g = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j9e = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      n3c = new com.aspose.slides.internal.n5.a6(new long[]{-9223372035896242064L, 808648778L, 15169748992L});
      v7u = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      x7n = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      z0k = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g8v = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      k1d = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      v2s = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f1c = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      p6w = new com.aspose.slides.internal.n5.a6(new long[]{524288L, 192L});
      p4l = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      p6t = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      e3m = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      k9m = new com.aspose.slides.internal.n5.a6(new long[]{0L, 192L});
      h3d = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648778L, 15169748992L});
      u6p = new com.aspose.slides.internal.n5.a6(new long[]{0L, 64L});
      o8m = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677518L, 808648714L, 15169748992L});
      f3c = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      j2p = new com.aspose.slides.internal.n5.a6(new long[]{524288L, 64L});
      u0a = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      w1n = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      m6n = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648778L, 15169748992L});
      l7h = new com.aspose.slides.internal.n5.a6(new long[]{0L, 64L});
      r7c = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677518L, 808648714L, 15169748992L});
      l2p = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      r5t = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648778L, 15169748992L});
      r6i = new com.aspose.slides.internal.n5.a6(new long[]{0L, 64L});
      h3r = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677518L, 808648714L, 15169748992L});
      n5u = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      b8c = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 1441792L});
      t1z = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      d0p = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x6s = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 1441792L});
      s5g = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      k4s = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x7i = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648907L, 15170142208L});
      r5d = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      v9e = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      t9p = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      w4w = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      c9b = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      r5w = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      t5g = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      m5l = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      k3h = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      u4k = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      g1p = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE});
      c4t = new com.aspose.slides.internal.n5.a6(new long[]{2304L, 1L});
      z1n = new com.aspose.slides.internal.n5.a6(new long[]{2304L, 1L});
      k2p = new com.aspose.slides.internal.n5.a6(new long[]{2304L, 1L});
      u7f = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s1o = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      n2z = new com.aspose.slides.internal.n5.a6(new long[]{0L, 8589934592L});
      w8d = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433358L, 808648778L, 15169748992L});
      l8r = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433358L, 808648778L, 15169748992L});
      x1f = new com.aspose.slides.internal.n5.a6(new long[]{0L, 8589934592L});
      o3i = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433358L, 808648778L, 15169748992L});
      z6e = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433358L, 808648778L, 15169748992L});
      g4u = new com.aspose.slides.internal.n5.a6(new long[]{0L, 8589934592L});
      y8m = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648778L, 15169748992L});
      c7f = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      c1x = new com.aspose.slides.internal.n5.a6(new long[]{-9223372036164677520L, 808648714L, 15169748992L});
      j8m = new com.aspose.slides.internal.n5.a6(new long[]{0L, 193L, 393216L});
      p7x = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      o6t = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE});
      l1b = new com.aspose.slides.internal.n5.a6(new long[]{33280L});
      n9q = new com.aspose.slides.internal.n5.a6(new long[]{33282L});
      d2n = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g2x = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      s2b = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      o5k = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      n1g = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L});
      q8g = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE});
      e6a = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      x4a = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE});
      r7n = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      f3l = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      p2i = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      c9t = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE, 2L});
      m4d = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g3y = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L, 1048576L});
      d2a = new com.aspose.slides.internal.n5.a6(new long[]{0L, 2L});
      r6a = new com.aspose.slides.internal.n5.a6(new long[]{Long.MIN_VALUE, 2L});
      c5q = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      p6r = new com.aspose.slides.internal.n5.a6(new long[]{0L, 4L, 1048576L});
      e8p = new com.aspose.slides.internal.n5.a6(new long[]{0L, 132L});
      e4w = new com.aspose.slides.internal.n5.a6(new long[]{0L, 0L, 1048576L});
      y4k = new com.aspose.slides.internal.n5.a6(new long[]{0L, 132L});
      h6l = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      q4d = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648779L, 15169748992L});
      q9u = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433360L, 808648779L, 15169748992L});
      y5s = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      b9y = new com.aspose.slides.internal.n5.a6(new long[]{-9223372032561433358L, 808648778L, 15169748992L});
      d9m = new com.aspose.slides.internal.n5.a6(new long[]{2L});
      g9t = new com.aspose.slides.internal.n5.a6(new long[]{2L});
   }
}
