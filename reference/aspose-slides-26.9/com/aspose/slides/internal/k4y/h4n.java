package com.aspose.slides.internal.k4y;

public class h4n extends b3 {
   private int l6;
   private int k5;
   private String u3;
   private String a6;
   private int u9;
   private int h0;
   private String c8;
   private String t2;
   private int s7;
   private String x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;
   public static final int n5 = m4w.n5("f");
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "v:ext", "on", "type", "gap", "angle", "dropauto", "drop", "distance", "lengthspecified", "length", "accentbar", "textborder", "minusx", "minusy"
   );

   public h4n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h4n$1 var2 = new h4n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h4n() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.s7 = n5;
      this.n3 = 0;
      this.y4 = 0;
      this.e2 = 0;
      this.t9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != 0) {
         var2.l6("v:ext", a3n.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("on", m4w.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("type", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("gap", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("angle", y0s.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("dropauto", m4w.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("drop", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("distance", this.t2);
      }

      if (this.s7 != n5) {
         var2.l6("lengthspecified", m4w.n5(this.s7));
      }

      if (this.x8 != null) {
         var2.l6("length", this.x8);
      }

      if (this.n3 != 0) {
         var2.l6("accentbar", m4w.n5(this.n3));
      }

      if (this.y4 != 0) {
         var2.l6("textborder", m4w.n5(this.y4));
      }

      if (this.e2 != 0) {
         var2.l6("minusx", m4w.n5(this.e2));
      }

      if (this.t9 != 0) {
         var2.l6("minusy", m4w.n5(this.t9));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z1;
   }

   // $VF: synthetic method
   static int n5(h4n var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(h4n var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(h4n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(h4n var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(h4n var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int u3(h4n var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(h4n var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u3(h4n var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int a6(h4n var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String a6(h4n var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int u9(h4n var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int h0(h4n var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int c8(h4n var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int t2(h4n var0, int var1) {
      return var0.t9 = var1;
   }
}
