package com.aspose.slides.internal.k4y;

public class p4p extends b3 {
   private double l6;
   private double k5;
   private int u3;
   public static final int n5 = h9.n5("custom");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("cx", "cy", "type");

   public p4p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      p4p$1 var2 = new p4p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p4p() {
      this.a6();
   }

   private void a6() {
      this.l6 = Double.NaN;
      this.k5 = Double.NaN;
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("cx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      var2.l6("cy", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
      if (this.u3 != n5) {
         var2.l6("type", h9.n5(this.u3));
      }

      var2.s7();
   }

   public final double n5() {
      return this.l6;
   }

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final double l6() {
      return this.k5;
   }

   public final void l6(double var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static double n5(p4p var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(p4p var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(p4p var0, int var1) {
      return var0.u3 = var1;
   }
}
