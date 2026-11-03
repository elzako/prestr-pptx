package com.aspose.slides.internal.k4y;

public class g5t extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private a6g h0;
   private o7o c8;
   private t7j t2;
   private r3w s7;
   private r6d x8;
   private y7e n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "chart:class",
      "svg:width",
      "svg:height",
      "chart:column-mapping",
      "chart:row-mapping",
      "chart:style-name",
      "title",
      "subtitle",
      "footer",
      "legend",
      "plot-area",
      "table"
   );

   public g5t(com.aspose.slides.ms.System.Xml.c7 var1) {
      g5t$1 var2 = new g5t$1(this);
      n5(var1, var2);
      n5(var1, new g5t$2(this, var1));
   }

   public g5t() {
      this.x8 = new r6d();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("chart:class", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("svg:width", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:height", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("chart:column-mapping", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("chart:row-mapping", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("chart:style-name", this.u9);
      }

      if (this.h0 != null) {
         this.h0.n5("chart", var2, "title");
      }

      if (this.c8 != null) {
         this.c8.n5("chart", var2, "subtitle");
      }

      if (this.t2 != null) {
         this.t2.n5("chart", var2, "footer");
      }

      if (this.s7 != null) {
         this.s7.n5("chart", var2, "legend");
      }

      this.x8.n5("chart", var2, "plot-area");
      if (this.n3 != null) {
         this.n3.n5("table", var2, "table");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u9;
   }

   public final a6g a6() {
      return this.h0;
   }

   public final o7o u9() {
      return this.c8;
   }

   public final r3w h0() {
      return this.s7;
   }

   public final r6d c8() {
      return this.x8;
   }

   public final y7e t2() {
      return this.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(g5t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(g5t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(g5t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(g5t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(g5t var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(g5t var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static a6g n5(g5t var0, a6g var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static o7o n5(g5t var0, o7o var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static t7j n5(g5t var0, t7j var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static r3w n5(g5t var0, r3w var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static r6d n5(g5t var0, r6d var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static y7e n5(g5t var0, y7e var1) {
      return var0.n3 = var1;
   }
}
