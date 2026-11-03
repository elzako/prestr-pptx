package com.aspose.slides.internal.k4y;

public class x1n extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "style:rel-width", "fo:start-indent", "fo:end-indent", "fo:space-before", "fo:space-after"
   );

   public x1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x1n$1 var2 = new x1n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x1n() {
      this.l6();
   }

   private void l6() {
      this.l6 = "0cm";
      this.k5 = "0cm";
      this.u3 = "0cm";
      this.a6 = "0cm";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:rel-width", this.n5);
      if (!"0cm".equals(this.l6)) {
         var2.l6("fo:start-indent", this.l6);
      }

      if (!"0cm".equals(this.k5)) {
         var2.l6("fo:end-indent", this.k5);
      }

      if (!"0cm".equals(this.u3)) {
         var2.l6("fo:space-before", this.u3);
      }

      if (!"0cm".equals(this.a6)) {
         var2.l6("fo:space-after", this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(x1n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x1n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(x1n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(x1n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(x1n var0, String var1) {
      return var0.a6 = var1;
   }
}
