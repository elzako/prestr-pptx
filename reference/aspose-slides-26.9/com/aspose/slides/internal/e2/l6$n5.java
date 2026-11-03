package com.aspose.slides.internal.e2;

import com.aspose.slides.internal.n5.e2;
import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.u3;
import com.aspose.slides.internal.n5.x8;

class l6$n5 extends x8 {
   // $VF: synthetic field
   final l6 s7;

   public l6$n5(l6 var1, u3 var2) {
      this.s7 = var1;
      this.t2 = var2;
      this.c8 = 154;
      this.n5 = com.aspose.slides.internal.e2.l6.z8;
      this.l6 = com.aspose.slides.internal.e2.l6.j5;
      this.k5 = com.aspose.slides.internal.e2.l6.w1;
      this.u3 = com.aspose.slides.internal.e2.l6.r4;
      this.a6 = com.aspose.slides.internal.e2.l6.c4;
      this.u9 = com.aspose.slides.internal.e2.l6.y2;
      this.h0 = com.aspose.slides.internal.e2.l6.y1;
   }

   @Override
   public String n5() {
      return "1:1: Tokens : ( T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | IDENT | VENDOR_PREFIX | CHARSET | MEDIA | IMPORT | NOT | AND | ONLY | PAGE | MARGIN_AREA | VIEWPORT | FONTFACE | COUNTER_STYLE | NAMESPACE | ATKEYWORD | CLASSKEYWORD | STRING | HASH | INDEX | NUMBER | PERCENTAGE | DIMENSION | URI | UNIRANGE | CDO | CDC | SEMICOLON | COLON | COMMA | QUESTION | PERCENT | EQUALS | SLASH | GREATER | LESS | LCURLY | RCURLY | APOS | QUOT | LPAREN | RPAREN | LBRACE | RBRACE | EXCLAMATION | TILDE | MINUS | PLUS | ASTERISK | S | COMMENT | SL_COMMENT | EXPRESSION | FUNCTION | INCLUDES | LINEAR_GRADIENT_DIRECTION | DASHMATCH | STARTSWITH | ENDSWITH | CONTAINS | INVALID_TOKEN | BAD_STRING );";
   }

   @Override
   public int l6(int var1, e2 var2) throws m3 {
      int var3 = var1;
      switch (var1) {
         case 0:
            int var4 = var2.n5(1);
            byte var5 = -1;
            if (var4 == 64) {
               var5 = 1;
            } else if (var4 == 116) {
               var5 = 2;
            } else if (var4 == 102) {
               var5 = 3;
            } else if (var4 == 124) {
               var5 = 4;
            } else if (var4 == 35) {
               var5 = 5;
            } else if (var4 == 94) {
               var5 = 6;
            } else if (var4 == 110) {
               var5 = 7;
            } else if (var4 == 78) {
               var5 = 8;
            } else if (var4 == 95) {
               var5 = 9;
            } else if ((var4 < 128 || var4 > 55295) && (var4 < 57344 || var4 > 65533)) {
               if (var4 == 92) {
                  var5 = 11;
               } else if (var4 == 45) {
                  var5 = 12;
               } else if (var4 == 97) {
                  var5 = 13;
               } else if (var4 == 65) {
                  var5 = 14;
               } else if (var4 == 111) {
                  var5 = 15;
               } else if (var4 == 79) {
                  var5 = 16;
               } else if (var4 == 117) {
                  var5 = 17;
               } else if (var4 == 85) {
                  var5 = 18;
               } else if (var4 == 46) {
                  var5 = 19;
               } else if (var4 == 34) {
                  var5 = 20;
               } else if (var4 == 39) {
                  var5 = 21;
               } else if (var4 >= 48 && var4 <= 57) {
                  var5 = 22;
               } else if (var4 == 43) {
                  var5 = 23;
               } else if (var4 == 101) {
                  var5 = 24;
               } else if (var4 == 84) {
                  var5 = 25;
               } else if (var4 == 60) {
                  var5 = 26;
               } else if (var4 == 59) {
                  var5 = 27;
               } else if (var4 == 58) {
                  var5 = 28;
               } else if (var4 == 44) {
                  var5 = 29;
               } else if (var4 == 63) {
                  var5 = 30;
               } else if (var4 == 37) {
                  var5 = 31;
               } else if (var4 == 61) {
                  var5 = 32;
               } else if (var4 == 47) {
                  var5 = 33;
               } else if (var4 == 62) {
                  var5 = 34;
               } else if (var4 == 123) {
                  var5 = 35;
               } else if (var4 == 125) {
                  var5 = 36;
               } else if (var4 == 40) {
                  var5 = 37;
               } else if (var4 == 41) {
                  var5 = 38;
               } else if (var4 == 91) {
                  var5 = 39;
               } else if (var4 == 93) {
                  var5 = 40;
               } else if (var4 == 33) {
                  var5 = 41;
               } else if (var4 == 126) {
                  var5 = 42;
               } else if (var4 == 42) {
                  var5 = 43;
               } else if ((var4 < 9 || var4 > 10) && (var4 < 12 || var4 > 13) && var4 != 32) {
                  if ((var4 < 98 || var4 > 100) && (var4 < 103 || var4 > 109) && (var4 < 112 || var4 > 115) && (var4 < 118 || var4 > 122)) {
                     if ((var4 < 66 || var4 > 77) && (var4 < 80 || var4 > 83) && (var4 < 86 || var4 > 90)) {
                        if (var4 == 36) {
                           var5 = 47;
                        } else if (var4 >= 0 && var4 <= 8
                           || var4 == 11
                           || var4 >= 14 && var4 <= 31
                           || var4 == 38
                           || var4 == 96
                           || var4 == 127
                           || var4 >= 55296 && var4 <= 57343
                           || var4 >= 65534 && var4 <= 65535) {
                           var5 = 48;
                        }
                     } else {
                        var5 = 46;
                     }
                  } else {
                     var5 = 45;
                  }
               } else {
                  var5 = 44;
               }
            } else {
               var5 = 10;
            }

            if (var5 >= 0) {
               return var5;
            }
         default:
            m3 var6 = new m3(this.n5(), 154, var3, var2);
            this.n5(var6);
            throw var6;
      }
   }
}
