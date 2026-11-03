package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l6z extends b3 {
   private String n5;
   private b9y l6;
   private b5j k5;
   private i1t u3;
   private w2k a6;
   private x8w u9;
   private x8w h0;
   private x8w c8;
   private c8q t2;
   private c8q s7;
   private n1n x8;
   private a9t n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "name", "spPr", "trendlineType", "order", "period", "forward", "backward", "intercept", "dispRSqr", "dispEq", "trendlineLbl", "extLst"
   );

   public l6z(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l6z$1(this, var1));
   }

   public l6z() {
      this.k5 = new b5j();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5("c", var2, "name", this.n5, false);
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "spPr");
      }

      this.k5.n5("c", var2, "trendlineType");
      if (this.u3 != null) {
         this.u3.n5("c", var2, "order");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "period");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "forward");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "backward");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "intercept");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "dispRSqr");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "dispEq");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "trendlineLbl");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final b9y n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.l6 = new b9y();
      return this.l6;
   }

   public final i1t l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <order> element can be added.");
      }

      this.u3 = new i1t();
      return this.u3;
   }

   public final w2k k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <period> element can be added.");
      }

      this.a6 = new w2k();
      return this.a6;
   }

   public final x8w u3() {
      if (this.u9 != null) {
         throw new Exception("Only one <forward> element can be added.");
      }

      this.u9 = new x8w();
      return this.u9;
   }

   public final x8w a6() {
      if (this.h0 != null) {
         throw new Exception("Only one <backward> element can be added.");
      }

      this.h0 = new x8w();
      return this.h0;
   }

   public final x8w u9() {
      if (this.c8 != null) {
         throw new Exception("Only one <intercept> element can be added.");
      }

      this.c8 = new x8w();
      return this.c8;
   }

   public final c8q h0() {
      if (this.t2 != null) {
         throw new Exception("Only one <dispRSqr> element can be added.");
      }

      this.t2 = new c8q();
      return this.t2;
   }

   public final c8q c8() {
      if (this.s7 != null) {
         throw new Exception("Only one <dispEq> element can be added.");
      }

      this.s7 = new c8q();
      return this.s7;
   }

   public final n1n t2() {
      if (this.x8 != null) {
         throw new Exception("Only one <trendlineLbl> element can be added.");
      }

      this.x8 = new n1n();
      return this.x8;
   }

   public final void n5(x8 var1) {
      this.n3 = (a9t)var1;
   }

   public final String s7() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final b9y x8() {
      return this.l6;
   }

   public final b5j n3() {
      return this.k5;
   }

   public final i1t y4() {
      return this.u3;
   }

   public final w2k e2() {
      return this.a6;
   }

   public final x8w t9() {
      return this.u9;
   }

   public final x8w z1() {
      return this.h0;
   }

   public final x8w t4() {
      return this.c8;
   }

   public final c8q q0() {
      return this.t2;
   }

   public final c8q z3() {
      return this.s7;
   }

   public final n1n m1() {
      return this.x8;
   }

   public final x8 k7() {
      return this.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 m3() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(l6z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(l6z var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static b9y n5(l6z var0, b9y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b5j n5(l6z var0, b5j var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static i1t n5(l6z var0, i1t var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static w2k n5(l6z var0, w2k var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static x8w n5(l6z var0, x8w var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static x8w l6(l6z var0, x8w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static x8w k5(l6z var0, x8w var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c8q n5(l6z var0, c8q var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static c8q l6(l6z var0, c8q var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static n1n n5(l6z var0, n1n var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static a9t n5(l6z var0, a9t var1) {
      return var0.n3 = var1;
   }
}
