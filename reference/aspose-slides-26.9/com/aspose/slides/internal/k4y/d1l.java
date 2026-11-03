package com.aspose.slides.internal.k4y;

public class d1l extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private long u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "svg:d",
      "svg:viewBox",
      "draw:id",
      "draw:z-index",
      "draw:layer",
      "draw:style-name",
      "draw:class-names",
      "presentation:style-name",
      "presentation:class-names",
      "dr3d:transform"
   );

   public d1l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d1l$1 var2 = new d1l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d1l() {
      this.l6();
   }

   private void l6() {
      this.u3 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("svg:d", this.n5);
      var2.l6("svg:viewBox", this.l6);
      if (this.k5 != null) {
         var2.l6("draw:id", this.k5);
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("draw:layer", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:style-name", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("draw:class-names", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("presentation:style-name", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("presentation:class-names", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("dr3d:transform", this.s7);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(d1l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d1l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(d1l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(d1l var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(d1l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(d1l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(d1l var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(d1l var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(d1l var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(d1l var0, String var1) {
      return var0.s7 = var1;
   }
}
