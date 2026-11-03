package com.aspose.slides.internal.k4y;

public class o5k extends b3 {
   private double n5;
   private double l6;
   private double k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("x", "y", "z");

   public o5k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      o5k$1 var2 = new o5k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o5k() {
      this.a6();
   }

   private void a6() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.k5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("x", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      var2.l6("y", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      var2.l6("z", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
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

   public final double k5() {
      return this.k5;
   }

   public final void k5(double var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static double n5(o5k var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(o5k var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double k5(o5k var0, double var1) {
      return var0.k5 = var1;
   }
}
