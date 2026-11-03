package com.aspose.slides.internal.k4y;

public class i0d extends b3 {
   private String n5;
   private char l6;
   private int k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name", "style:leader-char", "style:type", "style:position"
   );

   public i0d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i0d$1 var2 = new i0d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i0d() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      if (this.l6 != 0) {
         var2.l6("style:leader-char", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      var2.l6("style:type", p5r.n5(this.k5));
      var2.l6("style:position", this.u3);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(i0d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static char n5(i0d var0, char var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(i0d var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(i0d var0, String var1) {
      return var0.u3 = var1;
   }
}
