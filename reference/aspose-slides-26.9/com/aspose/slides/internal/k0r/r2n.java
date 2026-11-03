package com.aspose.slides.internal.k0r;

public class r2n extends e6r {
   private int n5;
   private float l6;
   private float k5;
   private float u3;
   private long a6;

   public r2n() {
      this.w1().n5(61752);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.k5 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.u3 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.a6 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.l6), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.k5), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.u3), 0) & 4294967295L);
      var1.n5(this.a6 & 4294967295L);
   }

   @Override
   public int n5() {
      return 20;
   }

   public final float l6() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void k5(float var1) {
      this.u3 = var1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.n5 |= 1;
      } else {
         this.n5 &= -2;
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.n5 |= 2;
      } else {
         this.n5 &= -3;
      }
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.n5 |= 4;
      } else {
         this.n5 &= -5;
      }
   }
}
