package com.aspose.slides.internal.k4y;

public class u6v extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private String c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "id", "style", "on", "fitshape", "fitpath", "trim", "xscale", "string"
   );

   public u6v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u6v$1 var2 = new u6v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u6v() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("style", this.l6);
      }

      if (this.k5 != 0) {
         var2.l6("on", r5b.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("fitshape", r5b.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("fitpath", r5b.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("trim", r5b.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("xscale", r5b.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("string", this.c8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(u6v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u6v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(u6v var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(u6v var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int k5(u6v var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int u3(u6v var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int a6(u6v var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(u6v var0, String var1) {
      return var0.c8 = var1;
   }
}
