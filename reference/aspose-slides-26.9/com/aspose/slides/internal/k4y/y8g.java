package com.aspose.slides.internal.k4y;

public class y8g extends b3 {
   private int k5;
   private String u3;
   private String a6;
   private int u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private double x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   public static final int n5 = p3r.n5("default");
   public static final int l6 = v1e.n5("custom");
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "presentation:node-type",
      "presentation:preset-id",
      "presentation:preset-sub-type",
      "presentation:preset-class",
      "presentation:master-element",
      "presentation:group-id",
      "anim:id",
      "xlink:href",
      "anim:audio-level",
      "smil:begin",
      "smil:end",
      "smil:dur",
      "smil:repeatDur",
      "smil:repeatCount"
   );

   public y8g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y8g$1 var2 = new y8g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y8g() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u9 = l6;
      this.x8 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("presentation:node-type", p3r.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("presentation:preset-id", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("presentation:preset-sub-type", this.a6);
      }

      if (this.u9 != l6) {
         var2.l6("presentation:preset-class", v1e.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("presentation:master-element", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("presentation:group-id", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("anim:id", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("xlink:href", this.s7);
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.x8)) {
         var2.l6("anim:audio-level", com.aspose.slides.ms.System.Xml.f4.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("smil:begin", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("smil:end", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("smil:dur", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("smil:repeatDur", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("smil:repeatCount", this.z1);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t4;
   }

   // $VF: synthetic method
   static int n5(y8g var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(y8g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(y8g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(y8g var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(y8g var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(y8g var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(y8g var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(y8g var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static double n5(y8g var0, double var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String h0(y8g var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String c8(y8g var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String t2(y8g var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String s7(y8g var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String x8(y8g var0, String var1) {
      return var0.z1 = var1;
   }
}
