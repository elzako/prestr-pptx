package com.aspose.slides.internal.k4y;

public class m1f extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "draw:handle-mirror-vertical",
      "draw:handle-mirror-horizontal",
      "draw:handle-switched",
      "draw:handle-position",
      "draw:handle-range-x-minimum",
      "draw:handle-range-x-maximum",
      "draw:handle-range-y-minimum",
      "draw:handle-range-y-maximum",
      "draw:handle-polar",
      "draw:handle-radius-range-minimum",
      "draw:handle-radius-range-maximum"
   );

   public m1f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m1f$1 var2 = new m1f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m1f() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("draw:handle-mirror-vertical", this.n5 ? "true" : "false");
      }

      if (this.l6) {
         var2.l6("draw:handle-mirror-horizontal", this.l6 ? "true" : "false");
      }

      if (this.k5) {
         var2.l6("draw:handle-switched", this.k5 ? "true" : "false");
      }

      var2.l6("draw:handle-position", this.u3);
      if (this.a6 != null) {
         var2.l6("draw:handle-range-x-minimum", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:handle-range-x-maximum", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("draw:handle-range-y-minimum", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:handle-range-y-maximum", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:handle-polar", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("draw:handle-radius-range-minimum", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("draw:handle-radius-range-maximum", this.x8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n3;
   }

   // $VF: synthetic method
   static boolean n5(m1f var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m1f var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(m1f var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(m1f var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(m1f var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(m1f var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(m1f var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(m1f var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(m1f var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(m1f var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String c8(m1f var0, String var1) {
      return var0.x8 = var1;
   }
}
