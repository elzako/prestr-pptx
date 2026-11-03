package com.aspose.slides.internal.k4y;

public class q5p extends b3 {
   private int l6;
   private String k5;
   private String u3;
   private int a6;
   private String u9;
   public static final int n5 = f6r.n5("solid");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "style:style", "style:width", "style:height", "style:vertical-align", "style:color"
   );

   public q5p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q5p$1 var2 = new q5p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q5p() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.u3 = "100%";
      this.a6 = 0;
      this.u9 = "#000000";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("style:style", f6r.n5(this.l6));
      }

      var2.l6("style:width", this.k5);
      if (!"100%".equals(this.u3)) {
         var2.l6("style:height", this.u3);
      }

      var2.l6("style:vertical-align", j7x.n5(this.a6));
      if (!"#000000".equals(this.u9)) {
         var2.l6("style:color", this.u9);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(q5p var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(q5p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(q5p var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(q5p var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(q5p var0, String var1) {
      return var0.u9 = var1;
   }
}
