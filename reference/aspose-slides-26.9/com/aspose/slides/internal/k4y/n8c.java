package com.aspose.slides.internal.k4y;

public class n8c extends b3 {
   private double n5;
   private v6p l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("position", "color");

   public n8c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n8c$1 var2 = new n8c$1(this);
      n5(var1, var2);
      n5(var1, new n8c$2(this, var1));
   }

   public n8c() {
      this.u3();
      this.l6 = new v6p();
   }

   private void u3() {
      this.n5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("position", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      this.l6.n5("ssml", var2, "color");
      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final v6p l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static double n5(n8c var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v6p n5(n8c var0, v6p var1) {
      return var0.l6 = var1;
   }
}
