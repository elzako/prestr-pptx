package com.aspose.slides.internal.k4y;

public class o3a extends b3 {
   private boolean n5;
   private boolean l6;
   private double k5;
   private double u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("top", "percent", "val", "filterVal");

   public o3a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o3a$1 var2 = new o3a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o3a() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = false;
      this.k5 = Double.NaN;
      this.u3 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("top", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("percent", this.l6 ? "1" : "0");
      }

      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      if (!com.aspose.slides.ms.System.d2.k5(this.u3)) {
         var2.l6("filterVal", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(o3a var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(o3a var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(o3a var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double l6(o3a var0, double var1) {
      return var0.u3 = var1;
   }
}
