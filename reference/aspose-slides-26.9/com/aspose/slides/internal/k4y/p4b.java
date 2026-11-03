package com.aspose.slides.internal.k4y;

public class p4b extends b3 {
   private byte l6;
   private double k5;
   public static final byte n5 = q1.n5("vert");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("orient", "pos");

   public p4b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      p4b$1 var2 = new p4b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p4b() {
      this.u3();
   }

   private void u3() {
      this.l6 = n5;
      this.k5 = 0.0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("orient", q1.n5(this.l6));
      }

      if (this.k5 != 0.0) {
         var2.l6("pos", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
      }

      var2.s7();
   }

   public final byte n5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final double l6() {
      return this.k5;
   }

   public final void n5(double var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static byte n5(p4b var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(p4b var0, double var1) {
      return var0.k5 = var1;
   }
}
