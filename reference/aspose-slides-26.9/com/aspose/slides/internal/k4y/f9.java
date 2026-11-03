package com.aspose.slides.internal.k4y;

public class f9 extends b3 {
   private double n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("rad", "grow");

   public f9(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      f9$1 var2 = new f9$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f9() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0.0;
      this.l6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0) {
         var2.l6("rad", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      }

      if (!this.l6) {
         var2.l6("grow", this.l6 ? "1" : "0");
      }

      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static double n5(f9 var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f9 var0, boolean var1) {
      return var0.l6 = var1;
   }
}
