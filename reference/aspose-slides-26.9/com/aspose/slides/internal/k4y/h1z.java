package com.aspose.slides.internal.k4y;

public class h1z extends b3 {
   private String n5;
   private boolean l6;
   private e6o k5;
   private b9y u3;
   private d9m a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("macro", "fPublished", "nvCxnSpPr", "spPr", "style");

   public h1z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h1z$1 var2 = new h1z$1(this);
      n5(var1, var2);
      n5(var1, new h1z$2(this, var1));
   }

   public h1z() {
      this.l6();
      this.k5 = new e6o();
      this.u3 = new b9y();
   }

   private void l6() {
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

      this.k5.n5("xdr", var2, "nvCxnSpPr");
      this.u3.n5("xdr", var2, "spPr");
      if (this.a6 != null) {
         this.a6.n5("xdr", var2, "style");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(h1z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h1z var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static e6o n5(h1z var0, e6o var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(h1z var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static d9m n5(h1z var0, d9m var1) {
      return var0.a6 = var1;
   }
}
