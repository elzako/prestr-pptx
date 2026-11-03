package com.aspose.slides.internal.k4y;

public class e7k extends b3 {
   private boolean n5;
   private y1g l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("updateAutomatic", "extLst");

   public e7k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      e7k$1 var2 = new e7k$1(this);
      n5(var1, var2);
      n5(var1, new e7k$2(this, var1));
   }

   public e7k() {
      this.k5();
   }

   private void k5() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("updateAutomatic", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         this.l6.n5("p", var2, "extLst");
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
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(e7k var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(e7k var0, y1g var1) {
      return var0.l6 = var1;
   }
}
