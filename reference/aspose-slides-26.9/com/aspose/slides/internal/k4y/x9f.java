package com.aspose.slides.internal.k4y;

public class x9f extends b3 {
   private double n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public x9f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x9f$1 var2 = new x9f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x9f() {
      this.l6();
   }

   private void l6() {
      this.n5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static double n5(x9f var0, double var1) {
      return var0.n5 = var1;
   }
}
