package com.aspose.slides.internal.k4y;

public class b3w extends b3 {
   private String n5;
   private boolean l6;
   private w3v k5;
   private e3 u3;
   private b9y a6;
   private d9m u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "macro", "fPublished", "nvPicPr", "blipFill", "spPr", "style"
   );

   public b3w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b3w$1 var2 = new b3w$1(this);
      n5(var1, var2);
      n5(var1, new b3w$2(this, var1));
   }

   public b3w() {
      this.l6();
      this.k5 = new w3v();
      this.u3 = new e3();
      this.a6 = new b9y();
   }

   private void l6() {
      this.n5 = "";
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("macro", this.n5);
      }

      if (this.l6) {
         var2.l6("fPublished", this.l6 ? "1" : "0");
      }

      this.k5.n5("xdr", var2, "nvPicPr");
      this.u3.n5("xdr", var2, "blipFill");
      this.a6.n5("xdr", var2, "spPr");
      if (this.u9 != null) {
         this.u9.n5("xdr", var2, "style");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(b3w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b3w var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w3v n5(b3w var0, w3v var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e3 n5(b3w var0, e3 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b9y n5(b3w var0, b9y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static d9m n5(b3w var0, d9m var1) {
      return var0.u9 = var1;
   }
}
