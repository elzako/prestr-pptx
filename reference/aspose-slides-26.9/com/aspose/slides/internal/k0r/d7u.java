package com.aspose.slides.internal.k0r;

public class d7u extends e6r {
   private int n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private byte c8;

   public d7u() {
      this.w1().n5(61753);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.k5 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.u3 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.a6 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.u9 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.h0 = com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.c4()), 0);
      this.c8 = var1.z1();
      var1.c8(3);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.l6), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.k5), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.u3), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.a6), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.u9), 0) & 4294967295L);
      var1.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(this.h0), 0) & 4294967295L);
      var1.n5(this.c8);
      var1.n5((byte)0);
      var1.n5((byte)0);
      var1.n5((byte)0);
   }

   @Override
   public int n5() {
      return 32;
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

   public final float a6() {
      return this.a6;
   }

   public final void u3(float var1) {
      this.a6 = var1;
   }

   public final float u9() {
      return this.u9;
   }

   public final void a6(float var1) {
      this.u9 = var1;
   }

   public final float h0() {
      return this.h0;
   }

   public final void u9(float var1) {
      this.h0 = var1;
   }

   public final byte c8() {
      return this.c8;
   }

   public final void n5(byte var1) {
      this.c8 = var1;
   }

   public final boolean t2() {
      return (this.n5 & 1) == 1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.n5 |= 1;
      } else {
         this.n5 &= -2;
      }
   }

   public final boolean s7() {
      return (this.n5 & 2) == 2;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.n5 |= 2;
      } else {
         this.n5 &= -3;
      }
   }

   public final boolean x8() {
      return (this.n5 & 4) == 4;
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.n5 |= 4;
      } else {
         this.n5 &= -5;
      }
   }

   public final boolean n3() {
      return (this.n5 & 8) == 8;
   }

   public final void u3(boolean var1) {
      if (var1) {
         this.n5 |= 8;
      } else {
         this.n5 &= -9;
      }
   }
}
