package com.aspose.slides.internal.k4y;

public class a8v extends b3 {
   private int n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public a8v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      a8v$1 var2 = new a8v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a8v() {
      this.k5();
   }

   private void k5() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", a1s.n5(this.n5));
      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static int n5(a8v var0, int var1) {
      return var0.n5 = var1;
   }
}
