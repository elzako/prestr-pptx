package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k8g extends b3 {
   private h7e n5;
   private h5h l6;
   private j9y k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("tnLst", "bldLst", "extLst");

   public k8g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new k8g$1(this, var1));
   }

   public k8g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("p", var2, "tnLst");
      }

      if (this.l6 != null) {
         this.l6.n5("p", var2, "bldLst");
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final h7e n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <tnLst> element can be added.");
      }

      this.n5 = new h7e();
      return this.n5;
   }

   public final void n5(h7e var1) {
      this.n5 = var1;
   }

   public final h5h l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <bldLst> element can be added.");
      }

      this.l6 = new h5h();
      return this.l6;
   }

   public final void n5(h5h var1) {
      this.l6 = var1;
   }

   public final void n5(x8 var1) {
      this.k5 = (j9y)var1;
   }

   public final h7e k5() {
      return this.n5;
   }

   public final h5h u3() {
      return this.l6;
   }

   public final x8 a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static h7e n5(k8g var0, h7e var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static h5h n5(k8g var0, h5h var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static j9y n5(k8g var0, j9y var1) {
      return var0.k5 = var1;
   }
}
