package com.aspose.slides.internal.k4y;

public class v9y extends b3 {
   private boolean n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("fLocksWithSheet", "fPrintsWithSheet");

   public v9y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v9y$1 var2 = new v9y$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v9y() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("fLocksWithSheet", this.n5 ? "1" : "0");
      }

      if (!this.l6) {
         var2.l6("fPrintsWithSheet", this.l6 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(v9y var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(v9y var0, boolean var1) {
      return var0.l6 = var1;
   }
}
