package com.aspose.slides.internal.k4y;

public class c8c extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("name", "r:id");

   public c8c(com.aspose.slides.ms.System.Xml.c7 var1) {
      c8c$1 var2 = new c8c$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public c8c() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.l6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(c8c var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(c8c var0, String var1) {
      return var0.l6 = var1;
   }
}
