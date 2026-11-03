package com.aspose.slides.internal.k4y;

public class y3o extends b3 {
   private String l6;
   private int k5;
   private int u3;
   private String a6;
   private int u9;
   private String h0;
   private String c8;
   private boolean t2;
   private b4f s7;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "xlink:href", "xlink:type", "xlink:actuate", "office:target-frame-name", "xlink:show", "office:name", "office:title", "office:server-map", "frame"
   );

   public y3o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y3o$1 var2 = new y3o$1(this);
      n5(var1, var2);
      n5(var1, new y3o$2(this, var1));
   }

   public y3o() {
      this.l6();
      this.s7 = new b4f();
   }

   private void l6() {
      this.k5 = n5;
      this.u3 = 0;
      this.u9 = 0;
      this.t2 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xlink:href", this.l6);
      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("office:target-frame-name", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("xlink:show", h9l.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("office:name", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("office:title", this.c8);
      }

      if (this.t2) {
         var2.l6("office:server-map", this.t2 ? "true" : "false");
      }

      this.s7.n5("draw", var2, "frame");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(y3o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(y3o var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(y3o var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(y3o var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(y3o var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(y3o var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(y3o var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y3o var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static b4f n5(y3o var0, b4f var1) {
      return var0.s7 = var1;
   }
}
