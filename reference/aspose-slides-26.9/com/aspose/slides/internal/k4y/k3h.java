package com.aspose.slides.internal.k4y;

public class k3h extends b3 {
   private float n5;
   private float l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("bright", "contrast");

   public k3h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      k3h$1 var2 = new k3h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k3h() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0.0F;
      this.l6 = 0.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0F) {
         if (var2.n5) {
            var2.l6("bright", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6(
               "bright", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14))
            );
         }
      }

      if (this.l6 != 0.0F) {
         if (var2.n5) {
            var2.l6("contrast", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
         } else {
            var2.l6(
               "contrast",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14))
            );
         }
      }

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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static float n5(k3h var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(k3h var0, float var1) {
      return var0.l6 = var1;
   }
}
