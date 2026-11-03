package com.aspose.slides.internal.k4y;

public class g4w extends b3 {
   private int n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private long u9;
   private long h0;
   private int c8;
   private int t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "w_Val", "w_Color", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade", "w_Sz", "w_Space", "w_Shadow", "w_Frame"
   );

   public g4w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g4w$1 var2 = new g4w$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g4w() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = 0;
      this.u9 = 4294967295L;
      this.h0 = 4294967295L;
      this.c8 = 0;
      this.t2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:val", f4v.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("w:color", this.l6);
      }

      if (this.k5 != 0) {
         var2.l6("w:themeColor", j6i.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("w:themeTint", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("w:themeShade", this.a6);
      }

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("w:sz", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("w:space", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("w:shadow", h5k.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("w:frame", h5k.n5(this.t2));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(g4w var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(g4w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(g4w var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(g4w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(g4w var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(g4w var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long l6(g4w var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int k5(g4w var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int u3(g4w var0, int var1) {
      return var0.t2 = var1;
   }
}
