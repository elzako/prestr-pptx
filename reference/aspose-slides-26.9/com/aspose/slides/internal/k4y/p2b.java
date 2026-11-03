package com.aspose.slides.internal.k4y;

public class p2b extends b3 {
   private byte n5;
   private byte l6;
   private boolean k5;
   private l6l u3;
   private l6l a6;
   private l6l u9;
   private l6l h0;
   private l6l c8;
   private l6l t2;
   private l6l s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "diagonalUp", "diagonalDown", "outline", "left", "right", "top", "bottom", "diagonal", "vertical", "horizontal"
   );

   public p2b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      p2b$1 var2 = new p2b$1(this);
      n5(var1, var2);
      n5(var1, new p2b$2(this, var1));
   }

   public p2b() {
      this.u9();
   }

   private void u9() {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("diagonalUp", this.n5 == 1 ? "1" : "0");
      }

      if (this.l6 != -1) {
         var2.l6("diagonalDown", this.l6 == 1 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("outline", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "left");
      }

      if (this.a6 != null) {
         this.a6.n5("ssml", var2, "right");
      }

      if (this.u9 != null) {
         this.u9.n5("ssml", var2, "top");
      }

      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "bottom");
      }

      if (this.c8 != null) {
         this.c8.n5("ssml", var2, "diagonal");
      }

      if (this.t2 != null) {
         this.t2.n5("ssml", var2, "vertical");
      }

      if (this.s7 != null) {
         this.s7.n5("ssml", var2, "horizontal");
      }

      var2.s7();
   }

   public final l6l n5() {
      return this.u3;
   }

   public final l6l l6() {
      return this.a6;
   }

   public final l6l k5() {
      return this.u9;
   }

   public final l6l u3() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return x8;
   }

   // $VF: synthetic method
   static byte n5(p2b var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(p2b var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(p2b var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l6l n5(p2b var0, l6l var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l6l l6(p2b var0, l6l var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l6l k5(p2b var0, l6l var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l6l u3(p2b var0, l6l var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l6l a6(p2b var0, l6l var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static l6l u9(p2b var0, l6l var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l6l h0(p2b var0, l6l var1) {
      return var0.s7 = var1;
   }
}
