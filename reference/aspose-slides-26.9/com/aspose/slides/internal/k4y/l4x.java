package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l4x extends b3 {
   private m4f n5;
   private m0s l6;
   private m0s k5;
   private r6c u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("chr", "pos", "vertJc", "ctrlPr");

   public l4x(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l4x$1(this, var1));
   }

   public l4x() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "chr");
      }

      if (this.l6 != null) {
         this.l6.n5("m", var2, "pos");
      }

      if (this.k5 != null) {
         this.k5.n5("m", var2, "vertJc");
      }

      if (this.u3 != null) {
         this.u3.n5("m", var2, "ctrlPr");
      }

      var2.s7();
   }

   public final void n5(m4f var1) {
      this.n5 = var1;
   }

   public final void n5(m0s var1) {
      this.l6 = var1;
   }

   public final void l6(m0s var1) {
      this.k5 = var1;
   }

   public final r6c n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <ctrlPr> element can be added.");
      }

      this.u3 = new r6c();
      return this.u3;
   }

   public final m4f l6() {
      return this.n5;
   }

   public final m0s k5() {
      return this.l6;
   }

   public final m0s u3() {
      return this.k5;
   }

   public final r6c a6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static m4f n5(l4x var0, m4f var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static m0s n5(l4x var0, m0s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static m0s l6(l4x var0, m0s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static r6c n5(l4x var0, r6c var1) {
      return var0.u3 = var1;
   }
}
