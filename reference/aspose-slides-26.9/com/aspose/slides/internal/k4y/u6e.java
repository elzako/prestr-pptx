package com.aspose.slides.internal.k4y;

public class u6e extends b3 {
   private float n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public u6e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      u6e$1 var2 = new u6e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u6e() {
      this.k5();
   }

   private void k5() {
      this.n5 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5) {
         var2.l6("val", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
      } else {
         var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
      }

      var2.s7();
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static float n5(u6e var0, float var1) {
      return var0.n5 = var1;
   }
}
