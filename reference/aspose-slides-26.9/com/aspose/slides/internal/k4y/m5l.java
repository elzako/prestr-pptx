package com.aspose.slides.internal.k4y;

public class m5l extends b3 {
   private float n5;
   private byte l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("ang", "scaled");

   public m5l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      m5l$1 var2 = new m5l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m5l() {
      this.u3();
   }

   private void u3() {
      this.n5 = Float.NaN;
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.n1.k5(this.n5)) {
         var2.l6("ang", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 60000.0F), 14)));
      }

      if (this.l6 != -1) {
         var2.l6("scaled", this.l6 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static float n5(m5l var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(m5l var0, byte var1) {
      return var0.l6 = var1;
   }
}
