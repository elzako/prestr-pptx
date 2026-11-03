package com.aspose.slides.internal.k4y;

public class l5x extends b3 {
   private String n5;
   private long l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "style:length", "style:lines", "style:distance", "style:style-name"
   );

   public l5x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l5x$1 var2 = new l5x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l5x() {
      this.l6();
   }

   private void l6() {
      this.n5 = "1";
      this.l6 = 1L;
      this.k5 = "0cm";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"1".equals(this.n5)) {
         var2.l6("style:length", this.n5);
      }

      if ((this.l6 & 4294967295L) != 1L) {
         var2.l6("style:lines", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (!"0cm".equals(this.k5)) {
         var2.l6("style:distance", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("style:style-name", this.u3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(l5x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(l5x var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(l5x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(l5x var0, String var1) {
      return var0.u3 = var1;
   }
}
