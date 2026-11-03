package com.aspose.slides.internal.k4y;

public class l8k extends b3 {
   private double n5;
   private l8r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("viewportSz", "extLst");

   public l8k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      l8k$1 var2 = new l8k$1(this);
      n5(var1, var2);
      n5(var1, new l8k$2(this, var1));
   }

   public l8k() {
      this.k5();
   }

   private void k5() {
      this.n5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      com.aspose.slides.internal.f8y.n5.n5(!com.aspose.slides.ms.System.d2.k5(this.n5), "Required property \"ViewportSz\" is uninitialized.");
      var2.l6(
         "viewportSz", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14))
      );
      if (this.l6 != null) {
         this.l6.n5("am3d", var2, "extLst");
      }

      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static double n5(l8k var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(l8k var0, l8r var1) {
      return var0.l6 = var1;
   }
}
