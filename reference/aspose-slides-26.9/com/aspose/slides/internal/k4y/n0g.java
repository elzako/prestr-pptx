package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n0g extends b3 {
   private m4f n5;
   private m4f l6;
   private m4f k5;
   private g3p u3;
   private h4t a6;
   private r6c u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("begChr", "sepChr", "endChr", "grow", "shp", "ctrlPr");

   public n0g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n0g$1(this, var1));
   }

   public n0g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "begChr");
      }

      if (this.l6 != null) {
         this.l6.n5("m", var2, "sepChr");
      }

      if (this.k5 != null) {
         this.k5.n5("m", var2, "endChr");
      }

      if (this.u3 != null) {
         this.u3.n5("m", var2, "grow");
      }

      if (this.a6 != null) {
         this.a6.n5("m", var2, "shp");
      }

      if (this.u9 != null) {
         this.u9.n5("m", var2, "ctrlPr");
      }

      var2.s7();
   }

   public final void n5(m4f var1) {
      this.n5 = var1;
   }

   public final void l6(m4f var1) {
      this.l6 = var1;
   }

   public final void k5(m4f var1) {
      this.k5 = var1;
   }

   public final void n5(g3p var1) {
      this.u3 = var1;
   }

   public final void n5(h4t var1) {
      this.a6 = var1;
   }

   public final r6c n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <ctrlPr> element can be added.");
      }

      this.u9 = new r6c();
      return this.u9;
   }

   public final m4f l6() {
      return this.n5;
   }

   public final m4f k5() {
      return this.l6;
   }

   public final m4f u3() {
      return this.k5;
   }

   public final g3p a6() {
      return this.u3;
   }

   public final h4t u9() {
      return this.a6;
   }

   public final r6c h0() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return h0;
   }

   // $VF: synthetic method
   static m4f n5(n0g var0, m4f var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static m4f l6(n0g var0, m4f var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static m4f k5(n0g var0, m4f var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g3p n5(n0g var0, g3p var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static h4t n5(n0g var0, h4t var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static r6c n5(n0g var0, r6c var1) {
      return var0.u9 = var1;
   }
}
