package com.aspose.slides.internal.k4y;

public class i7l extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private String h0;
   private String c8;
   private String t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "position", "polar", "map", "invx", "invy", "switch", "xrange", "yrange", "radiusrange"
   );

   public i7l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i7l$1 var2 = new i7l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i7l() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("position", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("polar", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("map", this.k5);
      }

      if (this.u3 != 0) {
         var2.l6("invx", r5b.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("invy", r5b.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("switch", i6j.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("xrange", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("yrange", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("radiusrange", this.t2);
      }

      var2.s7();
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.h0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(i7l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i7l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(i7l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(i7l var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(i7l var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(i7l var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(i7l var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(i7l var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(i7l var0, String var1) {
      return var0.t2 = var1;
   }
}
