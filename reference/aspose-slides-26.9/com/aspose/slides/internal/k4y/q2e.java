package com.aspose.slides.internal.k4y;

public class q2e extends b3 {
   private long n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cacheId", "r:id");

   public q2e(com.aspose.slides.ms.System.Xml.c7 var1) {
      q2e$1 var2 = new q2e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q2e() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("cacheId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
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
   static long n5(q2e var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(q2e var0, String var1) {
      return var0.l6 = var1;
   }
}
