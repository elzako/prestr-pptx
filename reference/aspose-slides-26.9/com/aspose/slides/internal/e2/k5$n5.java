package com.aspose.slides.internal.e2;

import com.aspose.slides.internal.n5.u3;
import com.aspose.slides.internal.n5.x8;

class k5$n5 extends x8 {
   // $VF: synthetic field
   final k5 s7;

   public k5$n5(k5 var1, u3 var2) {
      this.s7 = var1;
      this.t2 = var2;
      this.c8 = 104;
      this.n5 = com.aspose.slides.internal.e2.k5.y2;
      this.l6 = com.aspose.slides.internal.e2.k5.y1;
      this.k5 = com.aspose.slides.internal.e2.k5.a0;
      this.u3 = com.aspose.slides.internal.e2.k5.d2;
      this.a6 = com.aspose.slides.internal.e2.k5.d5;
      this.u9 = com.aspose.slides.internal.e2.k5.s3;
      this.h0 = com.aspose.slides.internal.e2.k5.p8;
   }

   @Override
   public String n5() {
      return "848:7: ( ( MINUS )? IDENT -> ( MINUS )? IDENT | CLASSKEYWORD -> CLASSKEYWORD | NUMBER -> NUMBER | PERCENTAGE -> PERCENTAGE | DIMENSION -> DIMENSION | strinG -> strinG | URI -> URI | HASH -> HASH | UNIRANGE -> UNIRANGE | INCLUDES -> INCLUDES | COLON -> COLON | COMMA -> COMMA | GREATER -> GREATER | LESS -> LESS | QUESTION -> QUESTION | LINEAR_GRADIENT_DIRECTION -> LINEAR_GRADIENT_DIRECTION | PERCENT -> PERCENT | EQUALS -> EQUALS | SLASH -> SLASH | PLUS -> PLUS | ASTERISK -> ASTERISK | ( MINUS )? funct -> ( MINUS )? funct | DASHMATCH -> DASHMATCH | LPAREN ( valuepart )* RPAREN -> ^( PARENBLOCK ( valuepart )* ) | LBRACE ( valuepart )* RBRACE -> ^( BRACEBLOCK ( valuepart )* ) )";
   }
}
