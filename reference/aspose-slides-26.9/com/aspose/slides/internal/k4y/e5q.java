package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class e5q extends b3 {
   private c8q n5;
   private c8q l6;
   private c8q k5;
   private c8q u3;
   private b9y a6;
   private j3z u9;
   private a9t h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "showHorzBorder", "showVertBorder", "showOutline", "showKeys", "spPr", "txPr", "extLst"
   );

   public e5q(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e5q$1(this, var1));
   }

   public e5q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "showHorzBorder");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "showVertBorder");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "showOutline");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "showKeys");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "spPr");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "txPr");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final c8q n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <showHorzBorder> element can be added.");
      }

      this.n5 = new c8q();
      return this.n5;
   }

   public final c8q l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <showVertBorder> element can be added.");
      }

      this.l6 = new c8q();
      return this.l6;
   }

   public final c8q k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <showOutline> element can be added.");
      }

      this.k5 = new c8q();
      return this.k5;
   }

   public final c8q u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <showKeys> element can be added.");
      }

      this.u3 = new c8q();
      return this.u3;
   }

   public final b9y a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.a6 = new b9y();
      return this.a6;
   }

   public final j3z u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.u9 = new j3z();
      return this.u9;
   }

   public final void n5(x8 var1) {
      this.h0 = (a9t)var1;
   }

   public final c8q h0() {
      return this.n5;
   }

   public final c8q c8() {
      return this.l6;
   }

   public final c8q t2() {
      return this.k5;
   }

   public final c8q s7() {
      return this.u3;
   }

   public final b9y x8() {
      return this.a6;
   }

   public final j3z n3() {
      return this.u9;
   }

   public final x8 y4() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return c8;
   }

   // $VF: synthetic method
   static c8q n5(e5q var0, c8q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8q l6(e5q var0, c8q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c8q k5(e5q var0, c8q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c8q u3(e5q var0, c8q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b9y n5(e5q var0, b9y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static j3z n5(e5q var0, j3z var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static a9t n5(e5q var0, a9t var1) {
      return var0.h0 = var1;
   }
}
