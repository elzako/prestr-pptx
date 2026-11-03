package com.aspose.slides.internal.k4y;

public class w6u extends b3 {
   private long n5;
   private double l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("idx", "val");

   public w6u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      w6u$1 var2 = new w6u$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w6u() {
      this.u3();
   }

   private void u3() {
      this.l6 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      var2.s7();
   }

   public final long n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(w6u var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(w6u var0, double var1) {
      return var0.l6 = var1;
   }
}
