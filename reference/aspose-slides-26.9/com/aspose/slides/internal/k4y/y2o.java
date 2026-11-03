package com.aspose.slides.internal.k4y;

public class y2o extends b3 {
   private double n5;
   private l8r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w", "extLst");

   public y2o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      y2o$1 var2 = new y2o$1(this);
      n5(var1, var2);
      n5(var1, new y2o$2(this, var1));
   }

   public y2o() {
      this.u3();
   }

   private void u3() {
      this.n5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      if (this.l6 != null) {
         this.l6.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.l6 = (l8r)var1;
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final x8 l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static double n5(y2o var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(y2o var0, l8r var1) {
      return var0.l6 = var1;
   }
}
