package com.aspose.slides.internal.k4y;

public class n6p extends b3 {
   private c3d n5;
   private p6k l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("docMk", "sldMk");

   public n6p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n6p$1(this, var1));
   }

   public n6p() {
      this.n5 = new c3d();
      this.l6 = new p6k();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("pc", var3, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
      this.n5.n5("pc", var2, "docMk");
      this.l6.n5("pc", var2, "sldMk");
      var2.s7();
   }

   public final p6k n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static c3d n5(n6p var0, c3d var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p6k n5(n6p var0, p6k var1) {
      return var0.l6 = var1;
   }
}
