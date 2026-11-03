package com.aspose.slides.internal.k4y;

public class l3e extends b3 {
   private double n5;
   private double l6;
   private float k5;
   private float u3;
   private int a6;
   private byte u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("tx", "ty", "sx", "sy", "flip", "algn");

   public l3e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      l3e$1 var2 = new l3e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l3e() {
      this.c8();
   }

   private void c8() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
      this.a6 = -1;
      this.u9 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.d2.k5(this.n5)) {
         var2.l6("tx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.l6)) {
         var2.l6("ty", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.k5)) {
         if (var2.n5) {
            var2.l6("sx", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.k5), "%"}));
         } else {
            var2.l6("sx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 1000.0F), 14)));
         }
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u3)) {
         if (var2.n5) {
            var2.l6("sy", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u3), "%"}));
         } else {
            var2.l6("sy", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 1000.0F), 14)));
         }
      }

      if (this.a6 != -1) {
         var2.l6("flip", t0.n5(this.a6));
      }

      if (this.u9 != -1) {
         var2.l6("algn", j6.n5(this.u9));
      }

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

   public final float k5() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void l6(float var1) {
      this.u3 = var1;
   }

   public final int a6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final byte u9() {
      return this.u9;
   }

   public final void n5(byte var1) {
      this.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static double n5(l3e var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(l3e var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float n5(l3e var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float l6(l3e var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(l3e var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte n5(l3e var0, byte var1) {
      return var0.u9 = var1;
   }
}
