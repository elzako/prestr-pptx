package com.aspose.slides.internal.k4y;

public class i7i extends b3 {
   private boolean n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("fullCalcOnLoad");

   public i7i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i7i$1 var2 = new i7i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i7i() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("fullCalcOnLoad", this.n5 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static boolean n5(i7i var0, boolean var1) {
      return var0.n5 = var1;
   }
}
