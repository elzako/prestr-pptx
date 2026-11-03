package com.aspose.slides.internal.k4y;

public class v9d extends b3 {
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private int c8;
   private int t2;
   private int s7;
   private String x8;
   public static final int n5 = k0p.n5("repeat");
   public static final int l6 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "style:repeat", "style:position", "style:filter-name", "draw:opacity", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data"
   );

   public v9d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      v9d$1 var2 = new v9d$1(this);
      n5(var1, var2);
      n5(var1, new v9d$2(this, var1));
   }

   public v9d() {
      this.u3();
   }

   private void u3() {
      this.k5 = n5;
      this.c8 = l6;
      this.t2 = 0;
      this.s7 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("style:repeat", k0p.n5(this.k5));
      }

      var2.l6("style:position", this.u3);
      if (this.a6 != null) {
         var2.l6("style:filter-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:opacity", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("xlink:href", this.h0);
      }

      if (this.c8 != l6) {
         var2.l6("xlink:type", v5w.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("xlink:show", h8e.n5(this.t2));
      }

      if (this.s7 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.s7));
      }

      if (this.x8 != null) {
         this.n5("office", var2, "binary-data", this.x8, false);
      }

      var2.s7();
   }

   public final int n5() {
      return this.k5;
   }

   public final String l6() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return n3;
   }

   // $VF: synthetic method
   static int n5(v9d var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(v9d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(v9d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(v9d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(v9d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(v9d var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int k5(v9d var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int u3(v9d var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String a6(v9d var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String n5(v9d var0) {
      return var0.x8;
   }
}
