package com.aspose.slides.internal.k4y;

public class n9s extends b3 {
   private int k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private y1g c8;
   public static final int n5 = e1r.n5("slides");
   public static final int l6 = k4i.n5("clr");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "prnWhat", "clrMode", "hiddenSlides", "scaleToFitPaper", "frameSlides", "extLst"
   );

   public n9s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n9s$1 var2 = new n9s$1(this);
      n5(var1, var2);
      n5(var1, new n9s$2(this, var1));
   }

   public n9s() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u3 = l6;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("prnWhat", e1r.n5(this.k5));
      }

      if (this.u3 != l6) {
         var2.l6("clrMode", k4i.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("hiddenSlides", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("scaleToFitPaper", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("frameSlides", this.h0 ? "1" : "0");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static int n5(n9s var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(n9s var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n9s var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n9s var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(n9s var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static y1g n5(n9s var0, y1g var1) {
      return var0.c8 = var1;
   }
}
