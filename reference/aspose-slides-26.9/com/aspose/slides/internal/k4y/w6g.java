package com.aspose.slides.internal.k4y;

public class w6g extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private int a6;
   private String u9;
   private int h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private c6x z1;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "xlink:href",
      "xlink:type",
      "office:target-frame-name",
      "xlink:show",
      "office:name",
      "draw:nohref",
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
      "svg:viewBox",
      "draw:points",
      "title",
      "desc",
      "event-listeners"
   );

   public w6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      w6g$1 var2 = new w6g$1(this);
      n5(var1, var2);
      n5(var1, new w6g$2(this, var1));
   }

   public w6g() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.a6 = 0;
      this.h0 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("xlink:href", this.l6);
      }

      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("office:target-frame-name", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("xlink:show", h9l.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("office:name", this.u9);
      }

      if (this.h0 != 0) {
         var2.l6("draw:nohref", l0h.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("svg:x", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("svg:y", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("svg:width", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("svg:height", this.x8);
      }

      var2.l6("svg:viewBox", this.n3);
      var2.l6("draw:points", this.y4);
      if (this.e2 != null) {
         this.n5("svg", var2, "title", this.e2, false);
      }

      if (this.t9 != null) {
         this.n5("svg", var2, "desc", this.t9, false);
      }

      if (this.z1 != null) {
         this.z1.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t4;
   }

   // $VF: synthetic method
   static String n5(w6g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(w6g var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(w6g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(w6g var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(w6g var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(w6g var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(w6g var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(w6g var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(w6g var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(w6g var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(w6g var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String t2(w6g var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String s7(w6g var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String n5(w6g var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static String x8(w6g var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String l6(w6g var0) {
      return var0.t9;
   }

   // $VF: synthetic method
   static c6x n5(w6g var0, c6x var1) {
      return var0.z1 = var1;
   }
}
