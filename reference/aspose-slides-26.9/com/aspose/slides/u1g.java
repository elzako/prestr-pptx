package com.aspose.slides;

class u1g {
   private s1e l6;
   final com.aspose.slides.internal.v6g.n5<s1e> n5 = new u1g$1(this);
   private ColorFormat k5;
   private float u3 = Float.NaN;
   private float a6 = Float.NaN;
   private float u9 = Float.NaN;
   private byte h0 = -1;
   private boolean c8;

   u1g(IShape var1) {
      this.k5 = new ColorFormat((r0g)var1);
      this.n5((byte)-1);
   }

   public final boolean n5() {
      return this.l6() == -1;
   }

   public final byte l6() {
      return this.h0;
   }

   public final void n5(byte var1) {
      this.h0 = var1;
      this.s7();
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      this.k5.getColorTransform().clear();
      if (!com.aspose.slides.ms.System.n1.k5(this.a6)) {
         this.k5.getColorTransform().add(16, this.a6);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u9)) {
         this.k5.getColorTransform().add(15, this.u9);
      }

      return this.k5.u3();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.k5.n5(var1.o8());
      this.s7();
   }

   final String u3() {
      return this.l6() == 1
         ? com.aspose.slides.ms.System.d1.n5(new String[]{
            "#", com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5("{0:x8}", new Object[]{this.k5().h0()}), 2, 6)
         })
         : "none";
   }

   public final int a6() {
      return this.k5.getSchemeColor();
   }

   public final void n5(int var1) {
      this.k5.setSchemeColor(var1);
      this.s7();
   }

   public final float u9() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
      this.s7();
   }

   public final float h0() {
      return this.a6;
   }

   public final void l6(float var1) {
      this.a6 = var1;
      this.s7();
   }

   public final float c8() {
      return this.u9;
   }

   public final void k5(float var1) {
      this.u9 = var1;
      this.s7();
   }

   final boolean t2() {
      return this.c8;
   }

   final void n5(boolean var1) {
      this.c8 = var1;
   }

   final void s7() {
      s1e var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static s1e n5(u1g var0, s1e var1) {
      return var0.l6 = var1;
   }
}
