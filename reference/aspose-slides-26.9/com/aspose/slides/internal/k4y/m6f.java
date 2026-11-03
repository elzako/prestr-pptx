package com.aspose.slides.internal.k4y;

public class m6f extends b3 {
   private int n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("w_Val");

   public m6f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m6f$1 var2 = new m6f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m6f() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:val", z0o.n5(this.n5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static int n5(m6f var0, int var1) {
      return var0.n5 = var1;
   }
}
