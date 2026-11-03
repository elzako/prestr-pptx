package com.aspose.slides.internal.k4y;

public class h6t extends b3 {
   private double n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("pos", "algn");

   public h6t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      h6t$1 var2 = new h6t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h6t() {
      this.u3();
   }

   private void u3() {
      this.n5 = Double.NaN;
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.d2.k5(this.n5)) {
         var2.l6("pos", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      }

      if (this.l6 != 0) {
         var2.l6("algn", w4.n5(this.l6));
      }

      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static double n5(h6t var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(h6t var0, int var1) {
      return var0.l6 = var1;
   }
}
