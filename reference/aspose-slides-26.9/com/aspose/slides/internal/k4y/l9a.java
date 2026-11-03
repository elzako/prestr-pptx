package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l9a extends b3 {
   private b8n n5;
   private v2o l6;
   private k2s k5;
   private p6x u3;
   private b9y a6;
   private j3z u9;
   private h5r h0;
   private c8q c8;
   private c8q t2;
   private c8q s7;
   private c8q x8;
   private c8q n3;
   private c8q y4;
   private String e2;
   private g7 t9;
   private a9t z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "idx",
      "delete",
      "layout",
      "tx",
      "numFmt",
      "spPr",
      "txPr",
      "dLblPos",
      "showLegendKey",
      "showVal",
      "showCatName",
      "showSerName",
      "showPercent",
      "showBubbleSize",
      "separator",
      "extLst"
   );

   public l9a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l9a$1(this, var1));
   }

   public l9a() {
      this.n5 = new b8n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "idx");
      if (this.t9 != null) {
         switch (t4.n5(this.t9.n5())) {
            case 1:
               ((c8q)this.t9.k5()).n5("c", var2, this.t9.n5());
         }
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "layout");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "tx");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "numFmt");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "spPr");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "txPr");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "dLblPos");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "showLegendKey");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "showVal");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "showCatName");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "showSerName");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "showPercent");
      }

      if (this.y4 != null) {
         this.y4.n5("c", var2, "showBubbleSize");
      }

      if (this.e2 != null) {
         this.n5("c", var2, "separator", this.e2, false);
      }

      if (this.z1 != null) {
         this.z1.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final v2o n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <layout> element can be added.");
      }

      this.l6 = new v2o();
      return this.l6;
   }

   public final k2s l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.k5 = new k2s();
      return this.k5;
   }

   public final p6x k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <numFmt> element can be added.");
      }

      this.u3 = new p6x();
      return this.u3;
   }

   public final b9y u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.a6 = new b9y();
      return this.a6;
   }

   public final j3z a6() {
      if (this.u9 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.u9 = new j3z();
      return this.u9;
   }

   public final h5r u9() {
      if (this.h0 != null) {
         throw new Exception("Only one <dLblPos> element can be added.");
      }

      this.h0 = new h5r();
      return this.h0;
   }

   public final c8q h0() {
      if (this.c8 != null) {
         throw new Exception("Only one <showLegendKey> element can be added.");
      }

      this.c8 = new c8q();
      return this.c8;
   }

   public final void n5(c8q var1) {
      this.c8 = var1;
   }

   public final c8q c8() {
      if (this.t2 != null) {
         throw new Exception("Only one <showVal> element can be added.");
      }

      this.t2 = new c8q();
      return this.t2;
   }

   public final void l6(c8q var1) {
      this.t2 = var1;
   }

   public final c8q t2() {
      if (this.s7 != null) {
         throw new Exception("Only one <showCatName> element can be added.");
      }

      this.s7 = new c8q();
      return this.s7;
   }

   public final void k5(c8q var1) {
      this.s7 = var1;
   }

   public final c8q s7() {
      if (this.x8 != null) {
         throw new Exception("Only one <showSerName> element can be added.");
      }

      this.x8 = new c8q();
      return this.x8;
   }

   public final void u3(c8q var1) {
      this.x8 = var1;
   }

   public final c8q x8() {
      if (this.n3 != null) {
         throw new Exception("Only one <showPercent> element can be added.");
      }

      this.n3 = new c8q();
      return this.n3;
   }

   public final void a6(c8q var1) {
      this.n3 = var1;
   }

   public final c8q n3() {
      if (this.y4 != null) {
         throw new Exception("Only one <showBubbleSize> element can be added.");
      }

      this.y4 = new c8q();
      return this.y4;
   }

   public final void u9(c8q var1) {
      this.y4 = var1;
   }

   public final x8 y4() {
      if (this.z1 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.z1 = new a9t();
      return this.z1;
   }

   public final g7 n5(String var1) {
      if (this.t9 != null) {
         throw new Exception("Delete already is initialized.");
      }

      switch (t4.n5(var1)) {
         case 1:
            this.t9 = new g7("delete", new c8q());
            return this.t9;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }
   }

   public final b8n e2() {
      return this.n5;
   }

   public final v2o t9() {
      return this.l6;
   }

   public final k2s z1() {
      return this.k5;
   }

   public final p6x t4() {
      return this.u3;
   }

   public final b9y q0() {
      return this.a6;
   }

   public final j3z z3() {
      return this.u9;
   }

   public final h5r m1() {
      return this.h0;
   }

   public final c8q k7() {
      return this.c8;
   }

   public final c8q m3() {
      return this.t2;
   }

   public final c8q z8() {
      return this.s7;
   }

   public final c8q j5() {
      return this.x8;
   }

   public final c8q w1() {
      return this.n3;
   }

   public final c8q r4() {
      return this.y4;
   }

   public final String c4() {
      return this.e2;
   }

   public final void l6(String var1) {
      this.e2 = var1;
   }

   public final g7 y2() {
      return this.t9;
   }

   public final x8 y1() {
      return this.z1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a0() {
      return t4;
   }

   // $VF: synthetic method
   static b8n n5(l9a var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(l9a var0, g7 var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static v2o n5(l9a var0, v2o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static k2s n5(l9a var0, k2s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static p6x n5(l9a var0, p6x var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b9y n5(l9a var0, b9y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static j3z n5(l9a var0, j3z var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static h5r n5(l9a var0, h5r var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static c8q n5(l9a var0, c8q var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c8q l6(l9a var0, c8q var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static c8q k5(l9a var0, c8q var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static c8q u3(l9a var0, c8q var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static c8q a6(l9a var0, c8q var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static c8q u9(l9a var0, c8q var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String n5(l9a var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String n5(l9a var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static a9t n5(l9a var0, a9t var1) {
      return var0.z1 = var1;
   }
}
