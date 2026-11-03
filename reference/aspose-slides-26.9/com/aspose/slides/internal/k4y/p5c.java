package com.aspose.slides.internal.k4y;

public class p5c extends y4 {
   private c4t n5;
   private k2p l6;
   private s1q k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvGraphicFramePr", "nvPr");

   public p5c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new p5c$1(this, var1));
   }

   public p5c() {
      this.n5 = new c4t();
      this.l6 = new k2p();
      this.k5 = new s1q();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("p", var2, "cNvPr");
      this.l6.n5("p", var2, "cNvGraphicFramePr");
      this.k5.n5("p", var2, "nvPr");
      var2.s7();
   }

   @Override
   public c4t n5() {
      return this.n5;
   }

   @Override
   public k2p l6() {
      return this.l6;
   }

   @Override
   public s1q k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static c4t n5(p5c var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k2p n5(p5c var0, k2p var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s1q n5(p5c var0, s1q var1) {
      return var0.k5 = var1;
   }
}
