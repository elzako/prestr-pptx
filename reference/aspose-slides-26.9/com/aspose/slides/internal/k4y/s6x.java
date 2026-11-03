package com.aspose.slides.internal.k4y;

public class s6x extends b3 {
   private String n5;
   private String l6;
   private double k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("svg:offset", "svg:stop-color", "svg:stop-opacity");

   public s6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s6x$1 var2 = new s6x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s6x() {
      this.l6();
   }

   private void l6() {
      this.k5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("svg:offset", this.n5);
      if (this.l6 != null) {
         var2.l6("svg:stop-color", this.l6);
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.k5)) {
         var2.l6("svg:stop-opacity", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(s6x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s6x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(s6x var0, double var1) {
      return var0.k5 = var1;
   }
}
