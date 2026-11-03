package com.aspose.slides.internal.k4y;

public class a0p extends b3 {
   private int l6;
   public static final int n5 = a3k.n5("outer");
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("val");

   public a0p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      a0p$1 var2 = new a0p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a0p() {
      this.k5();
   }

   private void k5() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("val", a3k.n5(this.l6));
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
   static int n5(a0p var0, int var1) {
      return var0.l6 = var1;
   }
}
