package com.aspose.slides.internal.k4y;

public class i1l extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "horizontalCentered", "verticalCentered", "headings", "gridLines", "gridLinesSet"
   );

   public i1l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i1l$1 var2 = new i1l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i1l() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("horizontalCentered", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("verticalCentered", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("headings", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("gridLines", this.u3 ? "1" : "0");
      }

      if (!this.a6) {
         var2.l6("gridLinesSet", this.a6 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(i1l var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i1l var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i1l var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(i1l var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(i1l var0, boolean var1) {
      return var0.a6 = var1;
   }
}
