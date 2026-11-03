package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n3p extends b3 {
   private long n5;
   private boolean l6;
   private g7 k5;
   private n8n u3;
   private r2o a6;
   private t4e u9;
   private t4e h0;
   private t7b c8;
   private t7b t2;
   private k1b s7;
   private n9v x8;
   private b9y n3;
   private j3z y4;
   private h6m e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "hidden",
      "catScaling",
      "valScaling",
      "title",
      "units",
      "majorGridlines",
      "minorGridlines",
      "majorTickMarks",
      "minorTickMarks",
      "tickLabels",
      "numFmt",
      "spPr",
      "txPr",
      "extLst"
   );

   public n3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z8();
      n3p$1 var2 = new n3p$1(this);
      n5(var1, var2);
      n5(var1, new n3p$2(this, var1));
   }

   public n3p() {
      this.z8();
   }

   private void z8() {
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6) {
         var2.l6("hidden", this.l6 ? "1" : "0");
      }

      if (this.k5 != null) {
         switch (t9.n5(this.k5.n5())) {
            case 2:
               ((b1k)this.k5.k5()).n5("cx", var2, this.k5.n5());
               break;
            case 3:
               ((t2a)this.k5.k5()).n5("cx", var2, this.k5.n5());
         }
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "title");
      }

      if (this.a6 != null) {
         this.a6.n5("cx", var2, "units");
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "majorGridlines");
      }

      if (this.h0 != null) {
         this.h0.n5("cx", var2, "minorGridlines");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "majorTickMarks");
      }

      if (this.t2 != null) {
         this.t2.n5("cx", var2, "minorTickMarks");
      }

      if (this.s7 != null) {
         this.s7.n5("cx", var2, "tickLabels");
      }

      if (this.x8 != null) {
         this.x8.n5("cx", var2, "numFmt");
      }

      if (this.n3 != null) {
         this.n3.n5("cx", var2, "spPr");
      }

      if (this.y4 != null) {
         this.y4.n5("cx", var2, "txPr");
      }

      if (this.e2 != null) {
         this.e2.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final n8n n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <title> element can be added.");
      }

      this.u3 = new n8n();
      return this.u3;
   }

   public final r2o l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <units> element can be added.");
      }

      this.a6 = new r2o();
      return this.a6;
   }

   public final t4e k5() {
      if (this.u9 != null) {
         throw new Exception("Only one <majorGridlines> element can be added.");
      }

      this.u9 = new t4e();
      return this.u9;
   }

   public final t4e u3() {
      if (this.h0 != null) {
         throw new Exception("Only one <minorGridlines> element can be added.");
      }

      this.h0 = new t4e();
      return this.h0;
   }

   public final void n5(t7b var1) {
      this.c8 = var1;
   }

   public final k1b a6() {
      if (this.s7 != null) {
         throw new Exception("Only one <tickLabels> element can be added.");
      }

      this.s7 = new k1b();
      return this.s7;
   }

   public final n9v u9() {
      if (this.x8 != null) {
         throw new Exception("Only one <numFmt> element can be added.");
      }

      this.x8 = new n9v();
      return this.x8;
   }

   public final b9y h0() {
      if (this.n3 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.n3 = new b9y();
      return this.n3;
   }

   public final j3z c8() {
      if (this.y4 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.y4 = new j3z();
      return this.y4;
   }

   public final void n5(h6m var1) {
      this.e2 = var1;
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("AxisScaling already is initialized.");
      }

      switch (t9.n5(var1)) {
         case 2:
            this.k5 = new g7("catScaling", new b1k());
            break;
         case 3:
            this.k5 = new g7("valScaling", new t2a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final boolean t2() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final g7 s7() {
      return this.k5;
   }

   public final n8n x8() {
      return this.u3;
   }

   public final r2o n3() {
      return this.a6;
   }

   public final t4e y4() {
      return this.u9;
   }

   public final t4e e2() {
      return this.h0;
   }

   public final t7b t9() {
      return this.c8;
   }

   public final t7b z1() {
      return this.t2;
   }

   public final k1b t4() {
      return this.s7;
   }

   public final n9v q0() {
      return this.x8;
   }

   public final b9y z3() {
      return this.n3;
   }

   public final j3z m1() {
      return this.y4;
   }

   public final h6m k7() {
      return this.e2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 m3() {
      return t9;
   }

   // $VF: synthetic method
   static long n5(n3p var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n3p var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(n3p var0, g7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static n8n n5(n3p var0, n8n var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static r2o n5(n3p var0, r2o var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static t4e n5(n3p var0, t4e var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static t4e l6(n3p var0, t4e var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static t7b n5(n3p var0, t7b var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static t7b l6(n3p var0, t7b var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static k1b n5(n3p var0, k1b var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static n9v n5(n3p var0, n9v var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static b9y n5(n3p var0, b9y var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(n3p var0, j3z var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static h6m n5(n3p var0, h6m var1) {
      return var0.e2 = var1;
   }
}
