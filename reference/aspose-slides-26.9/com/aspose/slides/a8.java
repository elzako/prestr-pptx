package com.aspose.slides;

abstract class a8 {
   protected boolean n5 = false;
   private u2w l6;
   private c9v k5;

   public a8(c9v var1, u2w var2) {
      this.k5 = var1;
      this.l6 = var2;
   }

   abstract void n5(z5 var1);

   abstract void n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2);

   protected final w3 n5() {
      return this.k5.a6();
   }

   protected final w3 l6() {
      return this.k5.u3();
   }

   protected final w3 k5() {
      return this.k5.h0();
   }

   protected final w3 u3() {
      return this.k5.u9();
   }

   protected final Chart a6() {
      return this.l6.u3().n3();
   }

   protected final u2w u9() {
      return this.l6;
   }

   protected final c9v h0() {
      return this.k5;
   }

   final boolean n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2, float var3, float var4, float var5, float var6) {
      boolean var7 = false;
      boolean var8 = false;
      if (var3 > var1[0].l6()) {
         var1[0].n5(var3);
         this.n5(var2, var1, var3, var4);
         var7 = true;
      }

      if (var4 > com.aspose.slides.ms.System.q1.n5((double)(this.a6().getWidth() - (var1[0].l6() + var2[0].l6())), 2)) {
         var1[0].n5(var1[0].l6() - (var1[0].l6() + var2[0].l6() + var4 - this.a6().getWidth()));
         this.n5(var2, var1, var3, var4);
         var7 = true;
      }

      if (var5 > var1[0].k5()) {
         var1[0].l6(var5);
         this.l6(var2, var1, var5, var6);
         var8 = true;
      }

      if (var6 > com.aspose.slides.ms.System.q1.n5((double)(this.a6().getHeight() - (var1[0].k5() + var2[0].k5())), 2)) {
         var1[0].l6(var1[0].k5() - (var1[0].k5() + var2[0].k5() + var6 - this.a6().getHeight()));
         this.l6(var2, var1, var5, var6);
         var8 = true;
      }

      return var8 || var7;
   }

   private void n5(com.aspose.slides.internal.o9b.f2[] var1, com.aspose.slides.internal.o9b.w1[] var2, float var3, float var4) {
      float var5 = this.a6().getWidth();
      if (var3 > var2[0].l6()) {
         var2[0].n5(var3);
      }

      if (var2[0].l6() + var1[0].l6() + var4 - var5 > 0.0F) {
         var1[0].n5(var1[0].l6() - (var2[0].l6() + var1[0].l6() + var4 - var5));
      }
   }

   private void l6(com.aspose.slides.internal.o9b.f2[] var1, com.aspose.slides.internal.o9b.w1[] var2, float var3, float var4) {
      float var5 = this.a6().getHeight();
      if (var3 > var2[0].k5()) {
         var2[0].l6(var3);
      }

      if (var2[0].k5() + var1[0].k5() + var4 - var5 > 0.0F) {
         var1[0].l6(var1[0].k5() - (var2[0].k5() + var1[0].k5() + var4 - var5));
      }
   }
}
