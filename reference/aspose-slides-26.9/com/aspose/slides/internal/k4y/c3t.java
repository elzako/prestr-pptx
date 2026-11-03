package com.aspose.slides.internal.k4y;

public class c3t extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private u2q a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("by", "from", "to", "p14:bounceEnd", "cBhvr");

   public c3t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      c3t$1 var2 = new c3t$1(this);
      n5(var1, var2);
      n5(var1, new c3t$2(this, var1));
   }

   public c3t() {
      this.u9();
      this.a6 = new u2q();
   }

   private void u9() {
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.n1.k5(this.n5)) {
         var2.l6("by", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 60000.0F), 14)));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.l6)) {
         var2.l6("from", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 60000.0F), 14)));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.k5)) {
         var2.l6("to", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 60000.0F), 14)));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u3)) {
         if (var2.n5) {
            var2.l6("p14:bounceEnd", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u3), "%"}));
         } else {
            var2.l6(
               "p14:bounceEnd",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 1000.0F), 14))
            );
         }
      }

      this.a6.n5("p", var2, "cBhvr");
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

   public final u2q u3() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u9;
   }

   // $VF: synthetic method
   static float n5(c3t var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(c3t var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(c3t var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float u3(c3t var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u2q n5(c3t var0, u2q var1) {
      return var0.a6 = var1;
   }
}
