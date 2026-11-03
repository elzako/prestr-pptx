package com.aspose.slides.internal.k4y;

public class d2a extends b3 {
   private double n5 = 0.0;
   private float l6 = 100.0F;
   private float k5 = 0.0F;
   private float u3 = 0.0F;
   private float a6 = 100.0F;
   private double u9 = 0.0;
   private float h0 = 0.0F;
   private float c8 = 90.0F;
   private float t2 = 100.0F;
   private float s7 = 100.0F;
   private float x8 = 0.0F;
   private float n3 = 0.0F;
   private byte y4 = -1;
   private boolean e2 = true;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "blurRad", "stA", "stPos", "endA", "endPos", "dist", "dir", "fadeDir", "sx", "sy", "kx", "ky", "algn", "rotWithShape"
   );

   public d2a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      d2a$1 var2 = new d2a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d2a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0) {
         var2.l6(
            "blurRad", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14))
         );
      }

      n5(var2, "stA", this.l6, 100.0F);
      n5(var2, "stPos", this.k5, 0.0F);
      n5(var2, "endA", this.u3, 0.0F);
      n5(var2, "endPos", this.a6, 100.0F);
      if (this.u9 != 0.0) {
         var2.l6("dist", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u9 * 12700.0), 14)));
      }

      if (this.h0 != 0.0F) {
         var2.l6("dir", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.h0 * 60000.0F), 14)));
      }

      if (this.c8 != 90.0F) {
         var2.l6(
            "fadeDir", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.c8 * 60000.0F), 14))
         );
      }

      n5(var2, "sx", this.t2, 100.0F);
      n5(var2, "sy", this.s7, 100.0F);
      if (this.x8 != 0.0F) {
         var2.l6("kx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.x8 * 60000.0F), 14)));
      }

      if (this.n3 != 0.0F) {
         var2.l6("ky", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n3 * 60000.0F), 14)));
      }

      if (this.y4 != 7 && this.y4 != -1) {
         var2.l6("algn", j6.n5(this.y4));
      }

      if (!this.e2) {
         var2.l6("rotWithShape", this.e2 ? "1" : "0");
      }

      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void k5(float var1) {
      this.u3 = var1;
   }

   public final float a6() {
      return this.a6;
   }

   public final void u3(float var1) {
      this.a6 = var1;
   }

   public final double u9() {
      return this.u9;
   }

   public final void l6(double var1) {
      this.u9 = var1;
   }

   public final float h0() {
      return this.h0;
   }

   public final void a6(float var1) {
      this.h0 = var1;
   }

   public final float c8() {
      return this.c8;
   }

   public final void u9(float var1) {
      this.c8 = var1;
   }

   public final float t2() {
      return this.t2;
   }

   public final void h0(float var1) {
      this.t2 = var1;
   }

   public final float s7() {
      return this.s7;
   }

   public final void c8(float var1) {
      this.s7 = var1;
   }

   public final float x8() {
      return this.x8;
   }

   public final void t2(float var1) {
      this.x8 = var1;
   }

   public final float n3() {
      return this.n3;
   }

   public final void s7(float var1) {
      this.n3 = var1;
   }

   public final byte y4() {
      return this.y4;
   }

   public final void n5(byte var1) {
      this.y4 = var1;
   }

   public final boolean e2() {
      return this.e2;
   }

   public final void n5(boolean var1) {
      this.e2 = var1;
   }

   private static float l6(String var0) {
      return var0.charAt(var0.length() - 1) == '%'
         ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var0, 0, var0.length() - 1))
         : (float)com.aspose.slides.ms.System.Xml.f4.t9(var0) / 1000.0F;
   }

   private static void n5(com.aspose.slides.internal.n8e.u4 var0, String var1, float var2, float var3) {
      if (var2 != var3) {
         if (var0.n5) {
            var0.l6(var1, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var2), "%"}));
         } else {
            var0.l6(var1, com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var2 * 1000.0F), 14)));
         }
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return t9;
   }

   // $VF: synthetic method
   static double n5(d2a var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float n5(d2a var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float n5(String var0) {
      return l6(var0);
   }

   // $VF: synthetic method
   static float l6(d2a var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float k5(d2a var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static float u3(d2a var0, float var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double l6(d2a var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static float a6(d2a var0, float var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static float u9(d2a var0, float var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static float h0(d2a var0, float var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static float c8(d2a var0, float var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static float t2(d2a var0, float var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static float s7(d2a var0, float var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static byte n5(d2a var0, byte var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d2a var0, boolean var1) {
      return var0.e2 = var1;
   }
}
