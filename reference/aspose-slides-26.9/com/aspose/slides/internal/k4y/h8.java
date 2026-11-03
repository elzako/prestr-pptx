package com.aspose.slides.internal.k4y;

public class h8 extends b3 {
   private double l6;
   private double k5;
   private int u3;
   public static final int n5 = d1.n5("circle");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("w", "h", "prst");

   public h8(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      h8$1 var2 = new h8$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h8() {
      this.a6();
   }

   private void a6() {
      this.l6 = 6.0;
      this.k5 = 6.0;
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != 6.0) {
         var2.l6("w", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      }

      if (this.k5 != 6.0) {
         var2.l6("h", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
      }

      if (this.u3 != n5) {
         var2.l6("prst", d1.n5(this.u3));
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
   static double n5(h8 var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(h8 var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(h8 var0, int var1) {
      return var0.u3 = var1;
   }
}
