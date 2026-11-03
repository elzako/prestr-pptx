package com.aspose.slides.internal.k4y;

public class f7p extends b3 {
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
   private c6x e2;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
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
      "title",
      "desc",
      "event-listeners"
   );

   public f7p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f7p$1 var2 = new f7p$1(this);
      n5(var1, var2);
      n5(var1, new f7p$2(this, var1));
   }

   public f7p() {
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

      if (this.n3 != null) {
         this.n5("svg", var2, "title", this.n3, false);
      }

      if (this.y4 != null) {
         this.n5("svg", var2, "desc", this.y4, false);
      }

      if (this.e2 != null) {
         this.e2.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t9;
   }

   // $VF: synthetic method
   static String n5(f7p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(f7p var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(f7p var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(f7p var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(f7p var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(f7p var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(f7p var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(f7p var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(f7p var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(f7p var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(f7p var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n5(f7p var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static String t2(f7p var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String l6(f7p var0) {
      return var0.y4;
   }

   // $VF: synthetic method
   static c6x n5(f7p var0, c6x var1) {
      return var0.e2 = var1;
   }
}
