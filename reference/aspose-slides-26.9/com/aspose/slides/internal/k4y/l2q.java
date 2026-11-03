package com.aspose.slides.internal.k4y;

public class l2q extends b3 {
   private long n5;
   private double l6;
   private long k5;
   private double u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("col", "colOff", "row", "rowOff");

   public l2q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      n5(var1, new l2q$1(this, var1));
   }

   public l2q() {
      this.u9();
   }

   private void u9() {
      this.l6 = Double.NaN;
      this.u3 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("xdr", var2, "col", com.aspose.slides.ms.System.Xml.f4.l6(this.n5), false);
      this.n5("xdr", var2, "colOff", com.aspose.slides.ms.System.Xml.f4.n5(this.l6), false);
      this.n5("xdr", var2, "row", com.aspose.slides.ms.System.Xml.f4.l6(this.k5), false);
      this.n5("xdr", var2, "rowOff", com.aspose.slides.ms.System.Xml.f4.n5(this.u3), false);
      var2.s7();
   }

   public final long n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final long k5() {
      return this.k5;
   }

   public final double u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(l2q var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(l2q var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(l2q var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double l6(l2q var0, double var1) {
      return var0.u3 = var1;
   }
}
