package com.aspose.slides.internal.e2;

import com.aspose.slides.internal.n5.u3;
import com.aspose.slides.internal.n5.x8;

class k5$a6 extends x8 {
   // $VF: synthetic field
   final k5 s7;

   public k5$a6(k5 var1, u3 var2) {
      this.s7 = var1;
      this.t2 = var2;
      this.c8 = 22;
      this.n5 = com.aspose.slides.internal.e2.k5.n3;
      this.l6 = com.aspose.slides.internal.e2.k5.y4;
      this.k5 = com.aspose.slides.internal.e2.k5.e2;
      this.u3 = com.aspose.slides.internal.e2.k5.t9;
      this.a6 = com.aspose.slides.internal.e2.k5.z1;
      this.u9 = com.aspose.slides.internal.e2.k5.t4;
      this.h0 = com.aspose.slides.internal.e2.k5.q0;
   }

   @Override
   public String n5() {
      return "618:1: atstatement : ( CHARSET | import_rule | page | namespaceFx | VIEWPORT ( S )* LCURLY ( S )* declarations RCURLY -> ^( VIEWPORT declarations ) | FONTFACE ( S )* LCURLY ( S )* declarations RCURLY -> ^( FONTFACE declarations ) | COUNTER_STYLE ( S )* IDENT ( S )* LCURLY ( S )* declarations RCURLY -> ^( COUNTER_STYLE IDENT declarations ) | MEDIA ( S )* ( media )? LCURLY ( S )* ( ( ruleset | keyframes_rule ) ( S )* )* RCURLY -> ^( MEDIA ( media )? ( ruleset )* ( keyframes_rule )* ) | ATKEYWORD ( S )* (s= STRING_MACR ( S )* )? SEMICOLON | ATKEYWORD ( S )* LCURLY ( any )* RCURLY -> INVALID_STATEMENT );";
   }
}
