package com.aspose.slides.internal.k4y;

public class k2l extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("w_Val", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade");

   public k2l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k2l$1 var2 = new k2l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k2l() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:val", this.n5);
      if (this.l6 != 0) {
         var2.l6("w:themeColor", j6i.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("w:themeTint", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("w:themeShade", this.u3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(k2l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(k2l var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(k2l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(k2l var0, String var1) {
      return var0.u3 = var1;
   }
}
