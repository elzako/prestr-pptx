package com.aspose.slides.internal.k4y;

public class l4y extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("draw:id", "svg:x", "svg:y", "draw:align");

   public l4y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l4y$1 var2 = new l4y$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l4y() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("svg:x", this.l6);
      var2.l6("svg:y", this.k5);
      if (this.u3 != 0) {
         var2.l6("draw:align", s1b.n5(this.u3));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(l4y var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(l4y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(l4y var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(l4y var0, int var1) {
      return var0.u3 = var1;
   }
}
