package com.aspose.slides.internal.k4y;

public class p6w extends b3 {
   private double n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("z");

   public p6w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      p6w$1 var2 = new p6w$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p6w() {
      this.k5();
   }

   private void k5() {
      this.n5 = 0.0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0) {
         var2.l6("z", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
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
      return l6;
   }

   // $VF: synthetic method
   static double n5(p6w var0, double var1) {
      return var0.n5 = var1;
   }
}
