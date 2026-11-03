package com.aspose.slides.internal.k4y;

public class g7i extends n3 {
   private String n5;
   private boolean l6;
   private d3l k5;
   private e8b u3;
   private l7h a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "macro", "fPublished", "nvGraphicFramePr", "xfrm", "graphic"
   );

   public g7i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      g7i$1 var2 = new g7i$1(this);
      n5(var1, var2);
      n5(var1, new g7i$2(this, var1));
   }

   public g7i() {
      this.u9();
      this.k5 = new d3l();
      this.u3 = new e8b();
      this.a6 = new l7h();
   }

   private void u9() {
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("macro", this.n5);
      }

      if (this.l6) {
         var2.l6("fPublished", this.l6 ? "1" : "0");
      }

      this.k5.n5("cdr", var2, "nvGraphicFramePr");
      this.u3.n5("cdr", var2, "xfrm");
      this.a6.n5("a", var2, "graphic");
      var2.s7();
   }

   @Override
   public y4 n5() {
      return this.k5;
   }

   @Override
   public e8b l6() {
      return this.u3;
   }

   @Override
   public l7h k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(g7i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(g7i var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static d3l n5(g7i var0, d3l var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e8b n5(g7i var0, e8b var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l7h n5(g7i var0, l7h var1) {
      return var0.a6 = var1;
   }
}
