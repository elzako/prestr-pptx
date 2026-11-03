package com.aspose.slides.internal.k4y;

public class v2x extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("lat", "lon", "rev");

   public v2x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      v2x$1 var2 = new v2x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v2x() {
      this.a6();
   }

   private void a6() {
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("lat", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 60000.0F), 14)));
      var2.l6("lon", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 60000.0F), 14)));
      var2.l6("rev", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 60000.0F), 14)));
      var2.s7();
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void k5(float var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static float n5(v2x var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(v2x var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(v2x var0, float var1) {
      return var0.k5 = var1;
   }
}
