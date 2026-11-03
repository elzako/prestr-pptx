package com.aspose.slides.internal.k4y;

public class n6y extends b3 {
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private String c8;
   private String t2;
   private int s7;
   private float x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private float z1;
   private int t4;
   private int q0;
   private String z3;
   private String m1;
   private int k7;
   private String m3;
   private float z8;
   private String j5;
   private String w1;
   private int r4;
   private String c4;
   private String y2;
   private int y1;
   private String a0;
   private String d2;
   private String d5;
   private int s3;
   private String p8;
   private String f2;
   private int i1;
   public static final int n5 = s5c.n5("parallel");
   public static final int l6 = c5j.n5("solid");
   public static final int k5 = a2c.n5("XY");
   private static final com.aspose.slides.internal.v6g.u9 e5 = new com.aspose.slides.internal.v6g.u9(
      "v:ext",
      "on",
      "type",
      "render",
      "viewpointorigin",
      "viewpoint",
      "plane",
      "skewangle",
      "skewamt",
      "foredepth",
      "backdepth",
      "orientation",
      "orientationangle",
      "lockrotationcenter",
      "autorotationcenter",
      "rotationcenter",
      "rotationangle",
      "colormode",
      "color",
      "shininess",
      "specularity",
      "diffusity",
      "metal",
      "edge",
      "facet",
      "lightface",
      "brightness",
      "lightposition",
      "lightlevel",
      "lightharsh",
      "lightposition2",
      "lightlevel2",
      "lightharsh2"
   );

   public n6y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n6y$1 var2 = new n6y$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public n6y() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = n5;
      this.h0 = l6;
      this.s7 = k5;
      this.x8 = Float.NaN;
      this.z1 = Float.NaN;
      this.t4 = 0;
      this.q0 = 0;
      this.k7 = 0;
      this.z8 = Float.NaN;
      this.r4 = 0;
      this.y1 = 0;
      this.s3 = 0;
      this.i1 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u3 != 0) {
         var2.l6("v:ext", a3n.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("on", m4w.n5(this.a6));
      }

      if (this.u9 != n5) {
         var2.l6("type", s5c.n5(this.u9));
      }

      if (this.h0 != l6) {
         var2.l6("render", c5j.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("viewpointorigin", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("viewpoint", this.t2);
      }

      if (this.s7 != k5) {
         var2.l6("plane", a2c.n5(this.s7));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.x8)) {
         var2.l6("skewangle", com.aspose.slides.ms.System.Xml.f4.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("skewamt", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("foredepth", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("backdepth", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("orientation", this.t9);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.z1)) {
         var2.l6("orientationangle", com.aspose.slides.ms.System.Xml.f4.n5(this.z1));
      }

      if (this.t4 != 0) {
         var2.l6("lockrotationcenter", m4w.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("autorotationcenter", m4w.n5(this.q0));
      }

      if (this.z3 != null) {
         var2.l6("rotationcenter", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("rotationangle", this.m1);
      }

      if (this.k7 != 0) {
         var2.l6("colormode", s3b.n5(this.k7));
      }

      if (this.m3 != null) {
         var2.l6("color", this.m3);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.z8)) {
         var2.l6("shininess", com.aspose.slides.ms.System.Xml.f4.n5(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("specularity", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("diffusity", this.w1);
      }

      if (this.r4 != 0) {
         var2.l6("metal", m4w.n5(this.r4));
      }

      if (this.c4 != null) {
         var2.l6("edge", this.c4);
      }

      if (this.y2 != null) {
         var2.l6("facet", this.y2);
      }

      if (this.y1 != 0) {
         var2.l6("lightface", m4w.n5(this.y1));
      }

      if (this.a0 != null) {
         var2.l6("brightness", this.a0);
      }

      if (this.d2 != null) {
         var2.l6("lightposition", this.d2);
      }

      if (this.d5 != null) {
         var2.l6("lightlevel", this.d5);
      }

      if (this.s3 != 0) {
         var2.l6("lightharsh", m4w.n5(this.s3));
      }

      if (this.p8 != null) {
         var2.l6("lightposition2", this.p8);
      }

      if (this.f2 != null) {
         var2.l6("lightlevel2", this.f2);
      }

      if (this.i1 != 0) {
         var2.l6("lightharsh2", m4w.n5(this.i1));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return e5;
   }

   // $VF: synthetic method
   static int n5(n6y var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(n6y var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(n6y var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int u3(n6y var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String n5(n6y var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String l6(n6y var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int a6(n6y var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static float n5(n6y var0, float var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String k5(n6y var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u3(n6y var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String a6(n6y var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String u9(n6y var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static float l6(n6y var0, float var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int u9(n6y var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int h0(n6y var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String h0(n6y var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String c8(n6y var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int c8(n6y var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String t2(n6y var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static float k5(n6y var0, float var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String s7(n6y var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String x8(n6y var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int t2(n6y var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String n3(n6y var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String y4(n6y var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static int s7(n6y var0, int var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String e2(n6y var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String t9(n6y var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String z1(n6y var0, String var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static int x8(n6y var0, int var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static String t4(n6y var0, String var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static String q0(n6y var0, String var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static int n3(n6y var0, int var1) {
      return var0.i1 = var1;
   }
}
