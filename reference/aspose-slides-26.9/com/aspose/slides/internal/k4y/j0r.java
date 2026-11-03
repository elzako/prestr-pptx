package com.aspose.slides.internal.k4y;

public class j0r extends b3 {
   private int n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "w_Val", "w_Color", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade"
   );

   public j0r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j0r$1 var2 = new j0r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public j0r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:val", t8g.n5(this.n5));
      }

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

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(j0r var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(j0r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(j0r var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(j0r var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(j0r var0, String var1) {
      return var0.a6 = var1;
   }
}
