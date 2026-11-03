package com.aspose.slides.internal.k4y;

public class y3q extends b3 {
   private int n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private String c8;
   private String t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "w_Val", "w_Color", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade", "w_Fill", "w_ThemeFill", "w_ThemeFillTint", "w_ThemeFillShade"
   );

   public y3q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y3q$1 var2 = new y3q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y3q() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = 0;
      this.h0 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:val", z4l.n5(this.n5));
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

      if (this.u9 != null) {
         var2.l6("w:fill", this.u9);
      }

      if (this.h0 != 0) {
         var2.l6("w:themeFill", j6i.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("w:themeFillTint", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("w:themeFillShade", this.t2);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(y3q var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(y3q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(y3q var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(y3q var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(y3q var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(y3q var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(y3q var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(y3q var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(y3q var0, String var1) {
      return var0.t2 = var1;
   }
}
