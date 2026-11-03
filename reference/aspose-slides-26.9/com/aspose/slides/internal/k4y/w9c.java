package com.aspose.slides.internal.k4y;

public class w9c extends b3 {
   private double n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public w9c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      w9c$1 var2 = new w9c$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w9c() {
      this.k5();
   }

   private void k5() {
      this.n5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
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
   static double n5(w9c var0, double var1) {
      return var0.n5 = var1;
   }
}
