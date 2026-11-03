package com.aspose.slides.internal.k4y;

public class w2i extends b3 {
   private double n5;
   private double l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("x", "y");

   public w2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new w2i$1(this, var1));
   }

   public w2i() {
      this.u3();
   }

   private void u3() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("cdr", var2, "x", com.aspose.slides.ms.System.Xml.f4.n5(this.n5), false);
      this.n5("cdr", var2, "y", com.aspose.slides.ms.System.Xml.f4.n5(this.l6), false);
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
   static double n5(w2i var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(w2i var0, double var1) {
      return var0.l6 = var1;
   }
}
