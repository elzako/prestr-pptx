package com.aspose.slides.internal.k4y;

public class x1 extends b3 {
   private e6 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("imgLayer");

   public x1(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new x1$1(this, var1));
   }

   public x1() {
      this.n5 = new e6();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("a14", var3, "http://schemas.microsoft.com/office/drawing/2010/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      this.n5.n5("a14", var2, "imgLayer");
      var2.s7();
   }

   public final e6 n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static e6 n5(x1 var0, e6 var1) {
      return var0.n5 = var1;
   }
}
