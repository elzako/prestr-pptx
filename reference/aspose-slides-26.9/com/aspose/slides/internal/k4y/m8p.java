package com.aspose.slides.internal.k4y;

public class m8p extends b3 {
   private String n5;
   private int l6;
   private int k5;
   private int u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "id", "on", "type", "obscured", "color", "opacity", "offset", "color2", "offset2", "origin", "matrix"
   );

   public m8p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m8p$1 var2 = new m8p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m8p() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
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

      if (this.k5 != 0) {
         var2.l6("type", u8c.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("obscured", r5b.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("color", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("opacity", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("offset", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("color2", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("offset2", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("origin", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("matrix", this.x8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(m8p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(m8p var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(m8p var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int k5(m8p var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(m8p var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(m8p var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(m8p var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(m8p var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(m8p var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(m8p var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String c8(m8p var0, String var1) {
      return var0.x8 = var1;
   }
}
