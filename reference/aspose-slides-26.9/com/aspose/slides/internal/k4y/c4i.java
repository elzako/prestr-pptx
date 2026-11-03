package com.aspose.slides.internal.k4y;

public class c4i extends b3 {
   private float n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public c4i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      c4i$1 var2 = new c4i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public c4i() {
      this.k5();
   }

   private void k5() {
      this.n5 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.n1.k5(this.n5)) {
         var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 100.0F), 14)));
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
   static float n5(c4i var0, float var1) {
      return var0.n5 = var1;
   }
}
