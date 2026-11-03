package com.aspose.slides.internal.k4y;

public class m7p extends b3 {
   private float n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("sz", "autoAdjust");

   public m7p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      m7p$1 var2 = new m7p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m7p() {
      this.u3();
   }

   private void u3() {
      this.n5 = Float.NaN;
      this.l6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5) {
         var2.l6("sz", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
      } else {
         var2.l6("sz", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
      }

      if (!this.l6) {
         var2.l6("autoAdjust", this.l6 ? "1" : "0");
      }

      var2.s7();
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
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
   static float n5(m7p var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m7p var0, boolean var1) {
      return var0.l6 = var1;
   }
}
