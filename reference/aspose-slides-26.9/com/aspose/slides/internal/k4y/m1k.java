package com.aspose.slides.internal.k4y;

public class m1k extends b3 {
   private w0l n5;
   private w3q l6;
   private c5y k5;
   private g4t u3;
   private p2b a6;
   private b1w u9;
   private l0k h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "font", "numFmt", "fill", "alignment", "border", "protection", "extLst"
   );

   public m1k(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new m1k$1(this, var1));
   }

   public m1k() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("ssml", var2, "font");
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "numFmt");
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "fill");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "alignment");
      }

      if (this.a6 != null) {
         this.a6.n5("ssml", var2, "border");
      }

      if (this.u9 != null) {
         this.u9.n5("ssml", var2, "protection");
      }

      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final w0l n5() {
      return this.n5;
   }

   public final c5y l6() {
      return this.k5;
   }

   public final p2b k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return c8;
   }

   // $VF: synthetic method
   static w0l n5(m1k var0, w0l var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w3q n5(m1k var0, w3q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c5y n5(m1k var0, c5y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g4t n5(m1k var0, g4t var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static p2b n5(m1k var0, p2b var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static b1w n5(m1k var0, b1w var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l0k n5(m1k var0, l0k var1) {
      return var0.h0 = var1;
   }
}
