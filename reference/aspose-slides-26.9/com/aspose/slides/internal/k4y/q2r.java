package com.aspose.slides.internal.k4y;

public class q2r extends b3 {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("left", "right", "top", "bottom", "header", "footer");

   public q2r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q2r$1 var2 = new q2r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q2r() {
      this.l6();
   }

   private void l6() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.k5 = Double.NaN;
      this.u3 = Double.NaN;
      this.a6 = Double.NaN;
      this.u9 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("left", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      var2.l6("right", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      var2.l6("top", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      var2.l6("bottom", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      var2.l6("header", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      var2.l6("footer", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static double n5(q2r var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(q2r var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double k5(q2r var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double u3(q2r var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double a6(q2r var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double u9(q2r var0, double var1) {
      return var0.u9 = var1;
   }
}
