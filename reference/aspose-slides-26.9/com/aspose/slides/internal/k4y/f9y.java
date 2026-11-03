package com.aspose.slides.internal.k4y;

public class f9y extends b3 {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("l", "t", "r", "b");

   public f9y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f9y$1 var2 = new f9y$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f9y() {
      this.l6();
   }

   private void l6() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.k5 = Double.NaN;
      this.u3 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("l", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      var2.l6("t", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      var2.l6("r", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
      var2.l6("b", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u3 * 12700.0), 14)));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static double n5(f9y var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(f9y var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double k5(f9y var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double u3(f9y var0, double var1) {
      return var0.u3 = var1;
   }
}
