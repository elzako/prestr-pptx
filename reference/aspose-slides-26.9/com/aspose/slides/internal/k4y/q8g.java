package com.aspose.slides.internal.k4y;

public class q8g extends b3 {
   private double n5;
   private double l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cx", "cy");

   public q8g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      q8g$1 var2 = new q8g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q8g() {
      this.u3();
   }

   private void u3() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      var2.l6("cx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      var2.l6("cy", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final double l6() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static double n5(q8g var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(q8g var0, double var1) {
      return var0.l6 = var1;
   }
}
