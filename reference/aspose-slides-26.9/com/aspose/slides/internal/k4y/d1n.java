package com.aspose.slides.internal.k4y;

public class d1n extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private String a6;
   private byte u9;
   private String h0;
   private byte c8;
   private byte t2;
   private String s7;
   private int x8;
   private String n3;
   private int y4;
   private String e2;
   private int t9;
   private String z1;
   private int t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private int m3;
   private String z8;
   private String j5;
   private String w1;
   private int r4;
   private String c4;
   private int y2;
   private String y1;
   private i4e a0;
   private i4e d2;
   private i4e d5;
   private i4e s3;
   private i4e p8;
   private static final com.aspose.slides.internal.v6g.u9 f2 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "on",
      "weight",
      "color",
      "opacity",
      "linestyle",
      "miterlimit",
      "joinstyle",
      "endcap",
      "dashstyle",
      "filltype",
      "src",
      "imageaspect",
      "imagesize",
      "imagealignshape",
      "color2",
      "startarrow",
      "startarrowwidth",
      "startarrowlength",
      "endarrow",
      "endarrowwidth",
      "endarrowlength",
      "o:href",
      "o:althref",
      "o:title",
      "o:forcedash",
      "r:id",
      "insetpen",
      "o:relid",
      "left",
      "top",
      "right",
      "bottom",
      "column"
   );

   public d1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      d1n$1 var2 = new d1n$1(this);
      n5(var1, var2);
      n5(var1, new d1n$2(this, var1));
   }

   public d1n() {
      this.y4();
   }

   private void y4() {
      this.l6 = 0;
      this.u9 = -1;
      this.c8 = -1;
      this.t2 = -1;
      this.x8 = 0;
      this.y4 = 0;
      this.t9 = 0;
      this.t4 = 0;
      this.q0 = 0;
      this.z3 = 0;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = 0;
      this.r4 = 0;
      this.y2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("id", this.n5);
      }

      if (this.l6 != 0) {
         var2.l6("on", r5b.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("weight", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("color", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("opacity", this.a6);
      }

      if (this.u9 != -1) {
         var2.l6("linestyle", h1.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("miterlimit", this.h0);
      }

      if (this.c8 != -1) {
         var2.l6("joinstyle", a2.n5(this.c8));
      }

      if (this.t2 != -1) {
         var2.l6("endcap", n9.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("dashstyle", this.s7);
      }

      if (this.x8 != 0) {
         var2.l6("filltype", n5x.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("src", this.n3);
      }

      if (this.y4 != 0) {
         var2.l6("imageaspect", z0n.n5(this.y4));
      }

      if (this.e2 != null) {
         var2.l6("imagesize", this.e2);
      }

      if (this.t9 != 0) {
         var2.l6("imagealignshape", r5b.n5(this.t9));
      }

      if (this.z1 != null) {
         var2.l6("color2", this.z1);
      }

      if (this.t4 != 0) {
         var2.l6("startarrow", v5u.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("startarrowwidth", z8w.n5(this.q0));
      }

      if (this.z3 != 0) {
         var2.l6("startarrowlength", q6x.n5(this.z3));
      }

      if (this.m1 != 0) {
         var2.l6("endarrow", v5u.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("endarrowwidth", z8w.n5(this.k7));
      }

      if (this.m3 != 0) {
         var2.l6("endarrowlength", q6x.n5(this.m3));
      }

      if (this.z8 != null) {
         var2.l6("o:href", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("o:althref", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("o:title", this.w1);
      }

      if (this.r4 != 0) {
         var2.l6("o:forcedash", m4w.n5(this.r4));
      }

      if (this.c4 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.c4);
      }

      if (this.y2 != 0) {
         var2.l6("insetpen", r5b.n5(this.y2));
      }

      if (this.y1 != null) {
         var2.l6("o:relid", this.y1);
      }

      if (this.a0 != null) {
         this.a0.n5("o", var2, "left");
      }

      if (this.d2 != null) {
         this.d2.n5("o", var2, "top");
      }

      if (this.d5 != null) {
         this.d5.n5("o", var2, "right");
      }

      if (this.s3 != null) {
         this.s3.n5("o", var2, "bottom");
      }

      if (this.p8 != null) {
         this.p8.n5("o", var2, "column");
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final byte a6() {
      return this.u9;
   }

   public final void n5(byte var1) {
      this.u9 = var1;
   }

   public final String u9() {
      return this.h0;
   }

   public final void k5(String var1) {
      this.h0 = var1;
   }

   public final byte h0() {
      return this.c8;
   }

   public final void l6(byte var1) {
      this.c8 = var1;
   }

   public final byte c8() {
      return this.t2;
   }

   public final void k5(byte var1) {
      this.t2 = var1;
   }

   public final String t2() {
      return this.s7;
   }

   public final void u3(String var1) {
      this.s7 = var1;
   }

   public final int s7() {
      return this.x8;
   }

   public final void l6(int var1) {
      this.x8 = var1;
   }

   public final String x8() {
      return this.z1;
   }

   public final void a6(String var1) {
      this.z1 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return f2;
   }

   // $VF: synthetic method
   static String n5(d1n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(d1n var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(d1n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(d1n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(d1n var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte n5(d1n var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(d1n var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte l6(d1n var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte k5(d1n var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(d1n var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(d1n var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String h0(d1n var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int k5(d1n var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String c8(d1n var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int u3(d1n var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t2(d1n var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int a6(d1n var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int u9(d1n var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int h0(d1n var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int c8(d1n var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int t2(d1n var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int s7(d1n var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String s7(d1n var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String x8(d1n var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String n3(d1n var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int x8(d1n var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String y4(d1n var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static int n3(d1n var0, int var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String e2(d1n var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static i4e n5(d1n var0, i4e var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static i4e l6(d1n var0, i4e var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static i4e k5(d1n var0, i4e var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static i4e u3(d1n var0, i4e var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static i4e a6(d1n var0, i4e var1) {
      return var0.p8 = var1;
   }
}
