package com.aspose.slides.internal.k4y;

public class o9a extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private int u9;
   private String h0;
   private String c8;
   public static final int n5 = j9j.n5("left");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "style:width", "style:rel-width", "style:color", "style:line-style", "style:adjustment", "style:distance-before-sep", "style:distance-after-sep"
   );

   public o9a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o9a$1 var2 = new o9a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o9a() {
      this.l6();
   }

   private void l6() {
      this.a6 = 0;
      this.u9 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:width", this.l6);
      var2.l6("style:rel-width", this.k5);
      if (this.u3 != null) {
         var2.l6("style:color", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("style:line-style", w7z.n5(this.a6));
      }

      if (this.u9 != n5) {
         var2.l6("style:adjustment", j9j.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("style:distance-before-sep", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("style:distance-after-sep", this.c8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(o9a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(o9a var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(o9a var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(o9a var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(o9a var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(o9a var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(o9a var0, String var1) {
      return var0.c8 = var1;
   }
}
