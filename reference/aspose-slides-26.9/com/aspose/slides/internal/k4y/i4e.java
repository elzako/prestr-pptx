package com.aspose.slides.internal.k4y;

public class i4e extends b3 {
   private int n5;
   private int l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private byte h0;
   private String c8;
   private byte t2;
   private byte s7;
   private String x8;
   private int n3;
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
   private int z8;
   private String j5;
   private String w1;
   private String r4;
   private int c4;
   private static final com.aspose.slides.internal.v6g.u9 y2 = new com.aspose.slides.internal.v6g.u9(
      "v:ext",
      "on",
      "weight",
      "color",
      "color2",
      "opacity",
      "linestyle",
      "miterlimit",
      "joinstyle",
      "endcap",
      "dashstyle",
      "insetpen",
      "filltype",
      "src",
      "imageaspect",
      "imagesize",
      "imagealignshape",
      "startarrow",
      "startarrowwidth",
      "startarrowlength",
      "endarrow",
      "endarrowwidth",
      "endarrowlength",
      "o:href",
      "o:althref",
      "o:title",
      "o:forcedash"
   );

   public i4e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i4e$1 var2 = new i4e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i4e() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.h0 = -1;
      this.t2 = -1;
      this.s7 = -1;
      this.n3 = 0;
      this.y4 = 0;
      this.t9 = 0;
      this.t4 = 0;
      this.q0 = 0;
      this.z3 = 0;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = 0;
      this.z8 = 0;
      this.c4 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("on", m4w.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("weight", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("color", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("color2", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("opacity", this.u9);
      }

      if (this.h0 != -1) {
         var2.l6("linestyle", h1.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("miterlimit", this.c8);
      }

      if (this.t2 != -1) {
         var2.l6("joinstyle", a2.n5(this.t2));
      }

      if (this.s7 != -1) {
         var2.l6("endcap", n9.n5(this.s7));
      }

      if (this.x8 != null) {
         var2.l6("dashstyle", this.x8);
      }

      if (this.n3 != 0) {
         var2.l6("insetpen", m4w.n5(this.n3));
      }

      if (this.y4 != 0) {
         var2.l6("filltype", n5x.n5(this.y4));
      }

      if (this.e2 != null) {
         var2.l6("src", this.e2);
      }

      if (this.t9 != 0) {
         var2.l6("imageaspect", z0n.n5(this.t9));
      }

      if (this.z1 != null) {
         var2.l6("imagesize", this.z1);
      }

      if (this.t4 != 0) {
         var2.l6("imagealignshape", m4w.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("startarrow", v5u.n5(this.q0));
      }

      if (this.z3 != 0) {
         var2.l6("startarrowwidth", z8w.n5(this.z3));
      }

      if (this.m1 != 0) {
         var2.l6("startarrowlength", q6x.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("endarrow", v5u.n5(this.k7));
      }

      if (this.m3 != 0) {
         var2.l6("endarrowwidth", z8w.n5(this.m3));
      }

      if (this.z8 != 0) {
         var2.l6("endarrowlength", q6x.n5(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("o:href", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("o:althref", this.w1);
      }

      if (this.r4 != null) {
         var2.l6("o:title", this.r4);
      }

      if (this.c4 != 0) {
         var2.l6("o:forcedash", m4w.n5(this.c4));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y2;
   }

   // $VF: synthetic method
   static int n5(i4e var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(i4e var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(i4e var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(i4e var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(i4e var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(i4e var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte n5(i4e var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(i4e var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte l6(i4e var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte k5(i4e var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u9(i4e var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int k5(i4e var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int u3(i4e var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String h0(i4e var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int a6(i4e var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String c8(i4e var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int u9(i4e var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int h0(i4e var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int c8(i4e var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int t2(i4e var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int s7(i4e var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int x8(i4e var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int n3(i4e var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String t2(i4e var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String s7(i4e var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String x8(i4e var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static int y4(i4e var0, int var1) {
      return var0.c4 = var1;
   }
}
