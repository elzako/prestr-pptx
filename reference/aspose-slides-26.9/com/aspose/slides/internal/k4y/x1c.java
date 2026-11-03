package com.aspose.slides.internal.k4y;

public class x1c extends b3 {
   private boolean n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("thruBlk");

   public x1c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      x1c$1 var2 = new x1c$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x1c() {
      this.k5();
   }

   private void k5() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("thruBlk", this.n5 ? "1" : "0");
      }

      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static boolean n5(x1c var0, boolean var1) {
      return var0.n5 = var1;
   }
}
