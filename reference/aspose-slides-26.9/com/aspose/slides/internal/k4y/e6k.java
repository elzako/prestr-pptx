package com.aspose.slides.internal.k4y;

public class e6k extends b3 {
   private String n5;
   private int l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private int y4;
   private String e2;
   private String t9;
   private int z1;
   private String t4;
   private String q0;
   private String z3;
   private int m1;
   private int k7;
   private String m3;
   private String z8;
   private int j5;
   private int w1;
   private String r4;
   private String c4;
   private b5v y2;
   private static final com.aspose.slides.internal.v6g.u9 y1 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "type",
      "on",
      "color",
      "opacity",
      "color2",
      "src",
      "o:href",
      "o:althref",
      "size",
      "origin",
      "position",
      "aspect",
      "colors",
      "angle",
      "alignshape",
      "focus",
      "focussize",
      "focusposition",
      "method",
      "o:detectmouseclick",
      "o:title",
      "o:opacity2",
      "recolor",
      "rotate",
      "r:id",
      "o:relid",
      "fill"
   );

   public e6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      e6k$1 var2 = new e6k$1(this);
      n5(var1, var2);
      n5(var1, new e6k$2(this, var1));
   }

   public e6k() {
      this.n3();
   }

   private void n3() {
      this.l6 = 0;
      this.k5 = 0;
      this.y4 = 0;
      this.z1 = 0;
      this.m1 = 0;
      this.k7 = 0;
      this.j5 = 0;
      this.w1 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("id", this.n5);
      }

      if (this.l6 != 0) {
         var2.l6("type", n5x.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("on", r5b.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("color", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("opacity", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("color2", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("src", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("o:href", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("o:althref", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("size", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("origin", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("position", this.n3);
      }

      if (this.y4 != 0) {
         var2.l6("aspect", z0n.n5(this.y4));
      }

      if (this.e2 != null) {
         var2.l6("colors", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("angle", this.t9);
      }

      if (this.z1 != 0) {
         var2.l6("alignshape", r5b.n5(this.z1));
      }

      if (this.t4 != null) {
         var2.l6("focus", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("focussize", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("focusposition", this.z3);
      }

      if (this.m1 != 0) {
         var2.l6("method", n9n.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("o:detectmouseclick", m4w.n5(this.k7));
      }

      if (this.m3 != null) {
         var2.l6("o:title", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("o:opacity2", this.z8);
      }

      if (this.j5 != 0) {
         var2.l6("recolor", r5b.n5(this.j5));
      }

      if (this.w1 != 0) {
         var2.l6("rotate", r5b.n5(this.w1));
      }

      if (this.r4 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.r4);
      }

      if (this.c4 != null) {
         var2.l6("o:relid", this.c4);
      }

      if (this.y2 != null) {
         this.y2.n5("o", var2, "fill");
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final String u9() {
      return this.e2;
   }

   public final void u3(String var1) {
      this.e2 = var1;
   }

   public final String h0() {
      return this.t9;
   }

   public final void a6(String var1) {
      this.t9 = var1;
   }

   public final void u9(String var1) {
      this.t4 = var1;
   }

   public final void h0(String var1) {
      this.q0 = var1;
   }

   public final String c8() {
      return this.z3;
   }

   public final void c8(String var1) {
      this.z3 = var1;
   }

   public final void k5(int var1) {
      this.m1 = var1;
   }

   public final String t2() {
      return this.z8;
   }

   public final void t2(String var1) {
      this.z8 = var1;
   }

   public final void u3(int var1) {
      this.w1 = var1;
   }

   public final String s7() {
      return this.c4;
   }

   public final void s7(String var1) {
      this.c4 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return y1;
   }

   // $VF: synthetic method
   static String n5(e6k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(e6k var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(e6k var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(e6k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(e6k var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(e6k var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(e6k var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(e6k var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(e6k var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String c8(e6k var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(e6k var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String s7(e6k var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int k5(e6k var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String x8(e6k var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String n3(e6k var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int u3(e6k var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(e6k var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String e2(e6k var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t9(e6k var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int a6(e6k var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int u9(e6k var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String z1(e6k var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String t4(e6k var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static int h0(e6k var0, int var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int c8(e6k var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String q0(e6k var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String z3(e6k var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static b5v n5(e6k var0, b5v var1) {
      return var0.y2 = var1;
   }
}
