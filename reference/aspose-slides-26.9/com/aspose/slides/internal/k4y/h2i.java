package com.aspose.slides.internal.k4y;

public class h2i extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("svg:width", "chart:style-name");

   public h2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      h2i$1 var2 = new h2i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h2i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("svg:width", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("chart:style-name", this.l6);
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(h2i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(h2i var0, String var1) {
      return var0.l6 = var1;
   }
}
