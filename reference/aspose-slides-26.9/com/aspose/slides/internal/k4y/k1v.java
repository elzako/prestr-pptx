package com.aspose.slides.internal.k4y;

public class k1v extends b3 {
   private int n5;
   private double l6;
   private double k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("type", "val", "maxVal");

   public k1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k1v$1 var2 = new k1v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k1v() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = Double.NaN;
      this.k5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", b5g.n5(this.n5));
      if (!com.aspose.slides.ms.System.d2.k5(this.l6)) {
         var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.k5)) {
         var2.l6("maxVal", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(k1v var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(k1v var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(k1v var0, double var1) {
      return var0.k5 = var1;
   }
}
