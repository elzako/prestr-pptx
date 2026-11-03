package com.aspose.slides.internal.k4y;

public class i5 extends b3 {
   private o5k n5;
   private o7b l6;
   private o7b k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("anchor", "norm", "up", "extLst");

   public i5(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i5$1(this, var1));
   }

   public i5() {
      this.n5 = new o5k();
      this.l6 = new o7b();
      this.k5 = new o7b();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "anchor");
      this.l6.n5("a", var2, "norm");
      this.k5.n5("a", var2, "up");
      if (this.u3 != null) {
         this.u3.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final o5k n5() {
      return this.n5;
   }

   public final o7b l6() {
      return this.l6;
   }

   public final o7b k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static o5k n5(i5 var0, o5k var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static o7b n5(i5 var0, o7b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static o7b l6(i5 var0, o7b var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(i5 var0, l8r var1) {
      return var0.u3 = var1;
   }
}
