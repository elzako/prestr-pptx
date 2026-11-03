package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class q2c extends c8 implements j9 {
   private y4x n5;
   private b1m l6;
   private c8q k5;
   private v2r u3;
   private n9p a6;
   private n9p u9;
   private n8e h0;
   private p6x c8;
   private c8m t2;
   private c8m s7;
   private k0r x8;
   private b9y n3;
   private j3z y4;
   private y4x e2;
   private g7 t9;
   private b9b z1;
   private b9b t4;
   private a9t q0;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "axId",
      "scaling",
      "delete",
      "axPos",
      "majorGridlines",
      "minorGridlines",
      "title",
      "numFmt",
      "majorTickMark",
      "minorTickMark",
      "tickLblPos",
      "spPr",
      "txPr",
      "crossAx",
      "crosses",
      "crossesAt",
      "tickLblSkip",
      "tickMarkSkip",
      "extLst"
   );

   public q2c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new q2c$1(this, var1));
   }

   public q2c() {
      this.n5 = new y4x();
      this.l6 = new b1m();
      this.u3 = new v2r();
      this.e2 = new y4x();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "axId");
      this.l6.n5("c", var2, "scaling");
      if (this.k5 != null) {
         this.k5.n5("c", var2, "delete");
      }

      this.u3.n5("c", var2, "axPos");
      if (this.a6 != null) {
         this.a6.n5("c", var2, "majorGridlines");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "minorGridlines");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "title");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "numFmt");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "majorTickMark");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "minorTickMark");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "tickLblPos");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "spPr");
      }

      if (this.y4 != null) {
         this.y4.n5("c", var2, "txPr");
      }

      this.e2.n5("c", var2, "crossAx");
      if (this.t9 != null) {
         switch (z3.n5(this.t9.n5())) {
            case 14:
               ((n6h)this.t9.k5()).n5("c", var2, this.t9.n5());
               break;
            case 15:
               ((x8w)this.t9.k5()).n5("c", var2, this.t9.n5());
         }
      }

      if (this.z1 != null) {
         this.z1.n5("c", var2, "tickLblSkip");
      }

      if (this.t4 != null) {
         this.t4.n5("c", var2, "tickMarkSkip");
      }

      if (this.q0 != null) {
         this.q0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public c8q u3() {
      if (this.k5 != null) {
         throw new Exception("Only one <delete> element can be added.");
      }

      this.k5 = new c8q();
      return this.k5;
   }

   @Override
   public n9p h0() {
      if (this.a6 != null) {
         throw new Exception("Only one <majorGridlines> element can be added.");
      }

      this.a6 = new n9p();
      return this.a6;
   }

   @Override
   public n9p t2() {
      if (this.u9 != null) {
         throw new Exception("Only one <minorGridlines> element can be added.");
      }

      this.u9 = new n9p();
      return this.u9;
   }

   @Override
   public n8e x8() {
      if (this.h0 != null) {
         throw new Exception("Only one <title> element can be added.");
      }

      this.h0 = new n8e();
      return this.h0;
   }

   @Override
   public p6x y4() {
      if (this.c8 != null) {
         throw new Exception("Only one <numFmt> element can be added.");
      }

      this.c8 = new p6x();
      return this.c8;
   }

   @Override
   public c8m t9() {
      if (this.t2 != null) {
         throw new Exception("Only one <majorTickMark> element can be added.");
      }

      this.t2 = new c8m();
      return this.t2;
   }

   @Override
   public c8m t4() {
      if (this.s7 != null) {
         throw new Exception("Only one <minorTickMark> element can be added.");
      }

      this.s7 = new c8m();
      return this.s7;
   }

   @Override
   public k0r z3() {
      if (this.x8 != null) {
         throw new Exception("Only one <tickLblPos> element can be added.");
      }

      this.x8 = new k0r();
      return this.x8;
   }

   @Override
   public b9y k7() {
      if (this.n3 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.n3 = new b9y();
      return this.n3;
   }

   @Override
   public j3z z8() {
      if (this.y4 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.y4 = new j3z();
      return this.y4;
   }

   @Override
   public final b9b i1() {
      if (this.z1 != null) {
         throw new Exception("Only one <tickLblSkip> element can be added.");
      }

      this.z1 = new b9b();
      return this.z1;
   }

   @Override
   public final b9b e5() {
      if (this.t4 != null) {
         throw new Exception("Only one <tickMarkSkip> element can be added.");
      }

      this.t4 = new b9b();
      return this.t4;
   }

   @Override
   public void n5(x8 var1) {
      this.q0 = (a9t)var1;
   }

   @Override
   public g7 n5(String var1) {
      if (this.t9 != null) {
         throw new Exception("Crossing already is initialized.");
      }

      switch (z3.n5(var1)) {
         case 14:
            this.t9 = new g7("crosses", new n6h());
            break;
         case 15:
            this.t9 = new g7("crossesAt", new x8w());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.t9;
   }

   @Override
   public y4x n5() {
      return this.n5;
   }

   @Override
   public b1m l6() {
      return this.l6;
   }

   @Override
   public c8q k5() {
      return this.k5;
   }

   @Override
   public v2r a6() {
      return this.u3;
   }

   @Override
   public n9p u9() {
      return this.a6;
   }

   @Override
   public n9p c8() {
      return this.u9;
   }

   @Override
   public n8e s7() {
      return this.h0;
   }

   @Override
   public p6x n3() {
      return this.c8;
   }

   @Override
   public c8m e2() {
      return this.t2;
   }

   @Override
   public c8m z1() {
      return this.s7;
   }

   @Override
   public k0r q0() {
      return this.x8;
   }

   @Override
   public b9y m1() {
      return this.n3;
   }

   @Override
   public j3z m3() {
      return this.y4;
   }

   @Override
   public y4x j5() {
      return this.e2;
   }

   @Override
   public g7 w1() {
      return this.t9;
   }

   @Override
   public b9b d2() {
      return this.z1;
   }

   @Override
   public b9b d5() {
      return this.t4;
   }

   @Override
   public x8 f2() {
      return this.q0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x9() {
      return z3;
   }

   // $VF: synthetic method
   static y4x n5(q2c var0, y4x var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b1m n5(q2c var0, b1m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c8q n5(q2c var0, c8q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v2r n5(q2c var0, v2r var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static n9p n5(q2c var0, n9p var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static n9p l6(q2c var0, n9p var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static n8e n5(q2c var0, n8e var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static p6x n5(q2c var0, p6x var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c8m n5(q2c var0, c8m var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static c8m l6(q2c var0, c8m var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static k0r n5(q2c var0, k0r var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static b9y n5(q2c var0, b9y var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(q2c var0, j3z var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static y4x l6(q2c var0, y4x var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static g7 n5(q2c var0, g7 var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static b9b n5(q2c var0, b9b var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static b9b l6(q2c var0, b9b var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static a9t n5(q2c var0, a9t var1) {
      return var0.q0 = var1;
   }
}
