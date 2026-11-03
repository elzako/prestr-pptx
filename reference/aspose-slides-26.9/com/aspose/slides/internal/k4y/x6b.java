package com.aspose.slides.internal.k4y;

public class x6b extends b3 {
   private long n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("chart:repeated", "chart:style-name");

   public x6b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      x6b$1 var2 = new x6b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x6b() {
      this.k5();
   }

   private void k5() {
      this.n5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("chart:repeated", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
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
   static long n5(x6b var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(x6b var0, String var1) {
      return var0.l6 = var1;
   }
}
