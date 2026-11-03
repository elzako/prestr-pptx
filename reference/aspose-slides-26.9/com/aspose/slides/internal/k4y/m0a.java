package com.aspose.slides.internal.k4y;

public class m0a extends b3 {
   private double n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public m0a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m0a$1 var2 = new m0a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m0a() {
      this.l6();
   }

   private void l6() {
      this.n5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static double n5(m0a var0, double var1) {
      return var0.n5 = var1;
   }
}
