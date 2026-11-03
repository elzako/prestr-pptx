package com.aspose.slides.internal.k4y;

public class b5s extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("r:id");

   public b5s(com.aspose.slides.ms.System.Xml.c7 var1) {
      b5s$1 var2 = new b5s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b5s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.n5);
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static String n5(b5s var0, String var1) {
      return var0.n5 = var1;
   }
}
