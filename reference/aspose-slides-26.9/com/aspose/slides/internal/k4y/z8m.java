package com.aspose.slides.internal.k4y;

public class z8m extends b3 {
   private String n5;
   private l8r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r:link", "extLst");

   public z8m(com.aspose.slides.ms.System.Xml.c7 var1) {
      z8m$1 var2 = new z8m$1(this);
      n5(var1, var2);
      n5(var1, new z8m$2(this, var1));
   }

   public z8m() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:link", this.n5);
      if (this.l6 != null) {
         this.l6.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(z8m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(z8m var0, l8r var1) {
      return var0.l6 = var1;
   }
}
