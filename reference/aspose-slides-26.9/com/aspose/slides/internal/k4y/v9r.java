package com.aspose.slides.internal.k4y;

public class v9r extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("shapeId", "r:id", "name");

   public v9r(com.aspose.slides.ms.System.Xml.c7 var1) {
      v9r$1 var2 = new v9r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v9r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("shapeId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.l6);
      if (this.k5 != null) {
         var2.l6("name", this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(v9r var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(v9r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(v9r var0, String var1) {
      return var0.k5 = var1;
   }
}
