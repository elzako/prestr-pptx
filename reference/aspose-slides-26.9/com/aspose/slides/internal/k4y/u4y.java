package com.aspose.slides.internal.k4y;

public class u4y extends b3 {
   private j9g n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("change-info");

   public u4y(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new u4y$1(this, var1));
   }

   public u4y() {
      this.n5 = new j9g();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("office", var2, "change-info");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static j9g n5(u4y var0, j9g var1) {
      return var0.n5 = var1;
   }
}
