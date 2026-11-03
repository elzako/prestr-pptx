package com.aspose.slides.internal.k4y;

public class r3w extends b3 {
   private int n5;
   private int l6;
   private String k5;
   private String u3;
   private int a6;
   private double u9;
   private String h0;
   private byte c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "chart:legend-position",
      "chart:legend-align",
      "svg:x",
      "svg:y",
      "style:legend-expansion",
      "style:legend-expansion-aspect-ratio",
      "chart:style-name",
      "loext:overlay"
   );

   public r3w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      r3w$1 var2 = new r3w$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public r3w() {
      this.a6();
   }

   private void a6() {
      this.n5 = 0;
      this.l6 = 0;
      this.a6 = 0;
      this.u9 = Double.NaN;
      this.c8 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("chart:legend-position", k3r.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("chart:legend-align", n0p.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("svg:x", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:y", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("style:legend-expansion", m2l.n5(this.a6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6("style:legend-expansion-aspect-ratio", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("chart:style-name", this.h0);
      }

      if (this.c8 != -1) {
         var2.l6("loext:overlay", this.c8 == 1 ? "true" : "false");
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final String l6() {
      return this.h0;
   }

   public final byte k5() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return t2;
   }

   // $VF: synthetic method
   static int n5(r3w var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(r3w var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(r3w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(r3w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int k5(r3w var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double n5(r3w var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(r3w var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte n5(r3w var0, byte var1) {
      return var0.c8 = var1;
   }
}
