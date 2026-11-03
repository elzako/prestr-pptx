package com.aspose.slides.internal.k4y;

public class s2l extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("r:id");

   public s2l(com.aspose.slides.ms.System.Xml.c7 var1) {
      s2l$1 var2 = new s2l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s2l() {
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static String n5(s2l var0, String var1) {
      return var0.n5 = var1;
   }
}
