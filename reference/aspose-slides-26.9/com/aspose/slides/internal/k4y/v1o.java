package com.aspose.slides.internal.k4y;

public class v1o extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("SourceId");

   public v1o(com.aspose.slides.ms.System.Xml.c7 var1) {
      v1o$1 var2 = new v1o$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.l6 = var1.z1();
      }
   }

   public v1o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("mdssi", var3, "http://schemas.openxmlformats.org/package/2006/digital-signature");
      var2.l6("SourceId", this.n5);
      var2.l6(this.l6);
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
   static String n5(v1o var0, String var1) {
      return var0.n5 = var1;
   }
}
