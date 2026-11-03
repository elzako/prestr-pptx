package com.aspose.slides.internal.k4y;

public class p3h extends b3 {
   private int l6;
   public static final int n5 = k1.n5("l");
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("dir");

   public p3h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      p3h$1 var2 = new p3h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p3h() {
      this.k5();
   }

   private void k5() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("dir", k1.n5(this.l6));
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(p3h var0, int var1) {
      return var0.l6 = var1;
   }
}
