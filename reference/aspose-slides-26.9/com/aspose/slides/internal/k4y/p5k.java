package com.aspose.slides.internal.k4y;

public class p5k extends b3 {
   private String n5;
   private u1 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("ang", "pos");

   public p5k(com.aspose.slides.ms.System.Xml.c7 var1) {
      p5k$1 var2 = new p5k$1(this);
      n5(var1, var2);
      n5(var1, new p5k$2(this, var1));
   }

   public p5k() {
      this.l6 = new u1();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("ang", this.n5);
      this.l6.n5("a", var2, "pos");
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final u1 l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(p5k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u1 n5(p5k var0, u1 var1) {
      return var0.l6 = var1;
   }
}
