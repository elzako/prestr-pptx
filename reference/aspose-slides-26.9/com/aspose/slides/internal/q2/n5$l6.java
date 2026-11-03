package com.aspose.slides.internal.q2;

import com.aspose.slides.internal.n5.e2;
import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.u3;
import com.aspose.slides.internal.n5.x8;

class n5$l6 extends x8 {
   // $VF: synthetic field
   final n5 s7;

   public n5$l6(n5 var1, u3 var2) {
      this.s7 = var1;
      this.t2 = var2;
      this.c8 = 32;
      this.n5 = com.aspose.slides.internal.q2.n5.e2;
      this.l6 = com.aspose.slides.internal.q2.n5.t9;
      this.k5 = com.aspose.slides.internal.q2.n5.z1;
      this.u3 = com.aspose.slides.internal.q2.n5.t4;
      this.a6 = com.aspose.slides.internal.q2.n5.q0;
      this.u9 = com.aspose.slides.internal.q2.n5.z3;
      this.h0 = com.aspose.slides.internal.q2.n5.m1;
   }

   @Override
   public String n5() {
      return "1:1: Tokens : ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral );";
   }

   @Override
   public int l6(int var1, e2 var2) throws m3 {
      int var3 = var1;
      switch (var1) {
         case 0:
            int var4 = var2.n5(1);
            int var5 = var2.l6();
            var2.a6();
            byte var10 = -1;
            if (var4 == 61) {
               var10 = 118;
            } else if (var4 == 42) {
               var10 = 119;
            } else if (var4 == 47) {
               var10 = 120;
            } else if ((
                  var4 >= 0 && var4 <= 9
                     || var4 >= 11 && var4 <= 12
                     || var4 >= 14 && var4 <= 41
                     || var4 >= 43 && var4 <= 46
                     || var4 >= 48 && var4 <= 60
                     || var4 >= 62 && var4 <= 8231
                     || var4 >= 8234 && var4 <= 65535
               )
               && com.aspose.slides.internal.q2.n5.n5(this.s7)) {
               var10 = 122;
            } else {
               var10 = 121;
            }

            var2.u3(var5);
            if (var10 >= 0) {
               return var10;
            }
            break;
         case 1:
            int var6 = var2.n5(1);
            int var7 = var2.l6();
            var2.a6();
            short var8 = -1;
            if ((var6 >= 0 && var6 <= 9 || var6 >= 11 && var6 <= 12 || var6 >= 14 && var6 <= 8231 || var6 >= 8234 && var6 <= 65535)
               && com.aspose.slides.internal.q2.n5.n5(this.s7)) {
               var8 = 122;
            } else {
               var8 = 188;
            }

            var2.u3(var7);
            if (var8 >= 0) {
               return var8;
            }
      }

      m3 var12 = new m3(this.n5(), 32, var3, var2);
      this.n5(var12);
      throw var12;
   }
}
