package com.aspose.slides.internal.k4y;

public class e7j extends b3 {
   private boolean n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public e7j(com.aspose.slides.ms.System.Xml.c7 var1) {
      e7j$1 var2 = new e7j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e7j() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p15", var3, "http://schemas.microsoft.com/office/powerpoint/2012/main");
      var2.l6("val", this.n5 ? "1" : "0");
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static boolean n5(e7j var0, boolean var1) {
      return var0.n5 = var1;
   }
}
