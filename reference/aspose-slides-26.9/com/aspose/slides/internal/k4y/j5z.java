package com.aspose.slides.internal.k4y;

public class j5z extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private boolean u3;
   private t2c a6;
   private b9y u9;
   private d9m h0;
   private j3z c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "macro", "textlink", "fLocksText", "fPublished", "nvSpPr", "spPr", "style", "txBody"
   );

   public j5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j5z$1 var2 = new j5z$1(this);
      n5(var1, var2);
      n5(var1, new j5z$2(this, var1));
   }

   public j5z() {
      this.l6();
      this.a6 = new t2c();
      this.u9 = new b9y();
   }

   private void l6() {
      this.k5 = true;
      this.u3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("macro", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("textlink", this.l6);
      }

      if (!this.k5) {
         var2.l6("fLocksText", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("fPublished", this.u3 ? "1" : "0");
      }

      this.a6.n5("xdr", var2, "nvSpPr");
      this.u9.n5("xdr", var2, "spPr");
      if (this.h0 != null) {
         this.h0.n5("xdr", var2, "style");
      }

      if (this.c8 != null) {
         this.c8.n5("xdr", var2, "txBody");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(j5z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(j5z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(j5z var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(j5z var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static t2c n5(j5z var0, t2c var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(j5z var0, b9y var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static d9m n5(j5z var0, d9m var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j3z n5(j5z var0, j3z var1) {
      return var0.c8 = var1;
   }
}
