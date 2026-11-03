package com.aspose.slides.internal.k4y;

public class h4i extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private byte h0;
   private byte c8;
   private long t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private byte k7;
   private int m3;
   private long z8;
   private String j5;
   private String w1;
   private String r4;
   private static final com.aspose.slides.internal.v6g.u9 c4 = new com.aspose.slides.internal.v6g.u9(
      "draw:page-number",
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
      "presentation:class",
      "presentation:placeholder",
      "presentation:user-transformed",
      "draw:z-index",
      "draw:id",
      "draw:layer",
      "draw:style-name",
      "draw:class-names",
      "presentation:style-name",
      "presentation:class-names",
      "draw:transform",
      "draw:name",
      "table:end-cell-address",
      "table:end-x",
      "table:end-y",
      "table:table-background",
      "text:anchor-type",
      "text:anchor-page-number",
      "draw:caption-id",
      "title",
      "desc"
   );

   public h4i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h4i$1 var2 = new h4i$1(this);
      n5(var1, var2);
      n5(var1, new h4i$2(this, var1));
   }

   public h4i() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.u9 = 0;
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = 4294967295L;
      this.k7 = -1;
      this.m3 = 0;
      this.z8 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("draw:page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("svg:x", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:y", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:width", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("svg:height", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("presentation:class", w6n.n5(this.u9));
      }

      if (this.h0 != -1) {
         var2.l6("presentation:placeholder", this.h0 == 1 ? "true" : "false");
      }

      if (this.c8 != -1) {
         var2.l6("presentation:user-transformed", this.c8 == 1 ? "true" : "false");
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("draw:id", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("draw:layer", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("draw:style-name", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("draw:class-names", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("presentation:style-name", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("presentation:class-names", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("draw:transform", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("draw:name", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("table:end-cell-address", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("table:end-x", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("table:end-y", this.m1);
      }

      if (this.k7 != -1) {
         var2.l6("table:table-background", this.k7 == 1 ? "true" : "false");
      }

      if (this.m3 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.m3));
      }

      if ((this.z8 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("draw:caption-id", this.j5);
      }

      if (this.w1 != null) {
         this.n5("svg", var2, "title", this.w1, false);
      }

      if (this.r4 != null) {
         this.n5("svg", var2, "desc", this.r4, false);
      }

      var2.s7();
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final void u3(String var1) {
      this.a6 = var1;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c4;
   }

   // $VF: synthetic method
   static long n5(h4i var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(h4i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(h4i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(h4i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(h4i var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(h4i var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte n5(h4i var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte l6(h4i var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long l6(h4i var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String a6(h4i var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u9(h4i var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String h0(h4i var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String c8(h4i var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String t2(h4i var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String s7(h4i var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String x8(h4i var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String n3(h4i var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String y4(h4i var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String e2(h4i var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String t9(h4i var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static byte k5(h4i var0, byte var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int l6(h4i var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static long k5(h4i var0, long var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String z1(h4i var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String t4(h4i var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String n5(h4i var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static String q0(h4i var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String l6(h4i var0) {
      return var0.r4;
   }
}
