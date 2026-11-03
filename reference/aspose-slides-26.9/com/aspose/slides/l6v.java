package com.aspose.slides;

final class l6v implements IGenericCloneable<l6v>, Cloneable {
   private float[] t2;
   private static final com.aspose.slides.internal.o9b.w1[] s7 = new com.aspose.slides.internal.o9b.w1[]{
      new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F),
      new com.aspose.slides.internal.o9b.w1(-5.0F, -10.0F),
      new com.aspose.slides.internal.o9b.w1(5.0F, -10.0F),
      new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F)
   };
   private static final com.aspose.slides.internal.o9b.w1[] x8 = new com.aspose.slides.internal.o9b.w1[]{
      new com.aspose.slides.internal.o9b.w1(0.0F, -6.0F),
      new com.aspose.slides.internal.o9b.w1(5.0F, -10.0F),
      new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F),
      new com.aspose.slides.internal.o9b.w1(-5.0F, -10.0F),
      new com.aspose.slides.internal.o9b.w1(0.0F, -6.0F)
   };
   private static final com.aspose.slides.internal.o9b.w1[] n3 = new com.aspose.slides.internal.o9b.w1[]{
      new com.aspose.slides.internal.o9b.w1(-5.0F, 0.0F),
      new com.aspose.slides.internal.o9b.w1(0.0F, -5.0F),
      new com.aspose.slides.internal.o9b.w1(5.0F, 0.0F),
      new com.aspose.slides.internal.o9b.w1(0.0F, 5.0F),
      new com.aspose.slides.internal.o9b.w1(-5.0F, 0.0F)
   };
   private static final float[] y4 = new float[]{1.25F, 1.75F, 2.5F};
   private static final float[] e2 = new float[]{2.0F, 3.0F, 4.5F};
   static final float[] n5 = new float[]{0.0F, 0.16666667F, 0.33333334F, 0.6666667F, 0.8333333F, 1.0F};
   static final float[] l6 = new float[]{0.0F, 0.6F, 0.8F, 1.0F};
   static final float[] k5 = new float[]{0.0F, 0.2F, 0.4F, 1.0F};
   static final float[] u3 = new float[]{0.0F, 0.33333334F, 0.6666667F, 1.0F};
   float a6 = 576.0F;
   private double t9;
   private byte z1;
   private short t4;
   a1v u9;
   boolean h0 = false;
   private byte q0;
   private byte z3;
   private byte m1;
   private byte k7;
   private byte m3;
   private byte z8;
   private byte j5;
   private byte w1;
   private byte r4;
   static final com.aspose.slides.internal.n8e.k8<Byte, Integer> c8 = new com.aspose.slides.internal.n8e.k8<>();

   public l6v(com.aspose.slides.internal.o9b.c8 var1, float var2) {
      byte var3 = -1;
      this.m3 = var3;
      this.k7 = var3;
      byte var4 = -1;
      this.j5 = var4;
      this.z8 = var4;
      this.t9 = var2;
      this.u9 = new a1v(var1.o8());
      this.z1 = 0;
      this.t4 = 1;
      this.q0 = 0;
      byte var5 = 0;
      this.m1 = var5;
      this.z3 = var5;
      this.r4 = 2;
      this.w1 = 0;
   }

   public l6v(j5m var1, ILineParamSource var2) {
      this.t9 = -1.0;
      this.z1 = -1;
      this.r4 = -1;
      this.w1 = -1;
      this.t4 = -1;
      byte var3 = -1;
      this.m1 = var3;
      this.z3 = var3;
      byte var4 = -1;
      this.m3 = var4;
      this.k7 = var4;
      byte var5 = -1;
      this.j5 = var5;
      this.z8 = var5;
      this.q0 = -1;
      this.a6 = 72.0F;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, ILineFormat.class)) {
         ILineFormat var6 = (ILineFormat)var2;
         if (var6.getStyle() != -1) {
            this.z1 = var6.getStyle();
         }

         if (var6.getBeginArrowheadStyle() != -1) {
            this.z3 = var6.getBeginArrowheadStyle();
         }

         if (var6.getEndArrowheadStyle() != -1) {
            this.m1 = var6.getEndArrowheadStyle();
         }

         if (var6.getBeginArrowheadLength() != -1) {
            this.k7 = var6.getBeginArrowheadLength();
         }

         if (var6.getEndArrowheadLength() != -1) {
            this.m3 = var6.getEndArrowheadLength();
         }

         if (var6.getBeginArrowheadWidth() != -1) {
            this.z8 = var6.getBeginArrowheadWidth();
         }

         if (var6.getEndArrowheadWidth() != -1) {
            this.j5 = var6.getEndArrowheadWidth();
         }

         if (var6.getCapStyle() != -1) {
            this.r4 = var6.getCapStyle();
         }

         if (var6.getJoinStyle() != -1) {
            this.w1 = var6.getJoinStyle();
         }

         if (var6.getDashStyle() != -1) {
            this.q0 = var6.getDashStyle();
            if (var6.getDashStyle() == 11) {
               this.n5(var6.getCustomDashPattern());
            }
         }

         this.u9 = a1v.n5(var1, (LineFillFormat)var6.getFillFormat());
         if (!com.aspose.slides.ms.System.d2.k5(var6.getWidth())) {
            this.t9 = var6.getWidth();
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, t8r.class)) {
         this.u9 = new a1v(var1);
         this.n5((t8r)var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, n4k.class)) {
         this.u9 = new a1v(var1);
         n4k var7 = (n4k)var2;
         this.n5(var7.n5);
      }
   }

   public l6v(j5m var1, ILineFormatEffectiveData var2, int var3) {
      this.t4 = -1;
      this.a6 = 72.0F;
      this.z1 = var2.getStyle();
      this.z3 = var2.getBeginArrowheadStyle();
      this.m1 = var2.getEndArrowheadStyle();
      this.k7 = var2.getBeginArrowheadLength();
      this.m3 = var2.getEndArrowheadLength();
      this.z8 = var2.getBeginArrowheadWidth();
      this.j5 = var2.getEndArrowheadWidth();
      this.r4 = var2.getCapStyle();
      this.w1 = var2.getJoinStyle();
      this.q0 = var2.getDashStyle();
      if (var2.getDashStyle() == 11) {
         this.n5(var2.getCustomDashPattern());
      }

      this.u9 = a1v.n5(var1, (z1a)var2.getFillFormat());
      this.t9 = var2.getWidth();
   }

   private void n5(t8r var1) {
      if (var1 != null) {
         this.t9 = var1.getWidth();
         this.z1 = var1.getStyle();
         this.z3 = var1.getBeginArrowheadStyle();
         this.m1 = var1.getEndArrowheadStyle();
         this.k7 = var1.getBeginArrowheadLength();
         this.m3 = var1.getEndArrowheadLength();
         this.z8 = var1.getBeginArrowheadWidth();
         this.j5 = var1.getEndArrowheadWidth();
         this.r4 = var1.getCapStyle();
         this.w1 = var1.getJoinStyle();
         this.q0 = var1.getDashStyle();
         if (var1.getDashStyle() == 11) {
            this.n5(var1.getCustomDashPattern());
         }

         if (var1.getFillFormat() != null) {
            ;
         }
      }
   }

   public final double n5() {
      return this.t9 < 0.0 ? 1.0 : this.t9;
   }

   public final void n5(double var1) {
      this.t9 = var1;
   }

   public final byte l6() {
      return this.z1 == -1 ? 0 : this.z1;
   }

   public final void n5(byte var1) {
      this.z1 = var1;
   }

   public final byte k5() {
      return this.q0 == -1 ? 0 : this.q0;
   }

   public final void l6(byte var1) {
      this.q0 = var1;
   }

   public final byte u3() {
      return this.r4 != -1 ? this.r4 : 2;
   }

   public final void k5(byte var1) {
      this.r4 = var1;
   }

   public final byte a6() {
      return this.w1 != -1 ? this.w1 : 0;
   }

   public final boolean u9() {
      return this.t4 < 0 ? this.u9.u3() != 0 : this.t4 != 0;
   }

   public final void n5(boolean var1) {
      this.t4 = (short)(var1 ? 1 : 0);
   }

   public final com.aspose.slides.internal.o9b.c8 h0() {
      return this.u9.n5();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.u9 = new a1v(var1.o8());
   }

   public final a1v c8() {
      return this.u9;
   }

   public final boolean t2() {
      return this.u9() && this.c8() != null && this.c8().a6();
   }

   public final byte s7() {
      return this.z3 != -1 ? this.z3 : 0;
   }

   public final void u3(byte var1) {
      this.z3 = var1;
   }

   public final byte x8() {
      return this.m1 != -1 ? this.m1 : 0;
   }

   public final void a6(byte var1) {
      this.m1 = var1;
   }

   public final byte n3() {
      return this.k7 != -1 ? this.k7 : 1;
   }

   public final byte y4() {
      return this.m3 != -1 ? this.m3 : 1;
   }

   public final byte e2() {
      return this.z8 != -1 ? this.z8 : 1;
   }

   public final byte t9() {
      return this.j5 != -1 ? this.j5 : 1;
   }

   final float[] z1() {
      return this.t2;
   }

   final void n5(float[] var1) {
      this.t2 = var1;
   }

   final com.aspose.slides.internal.w0.s7 t4() {
      return this.n5(this.a6);
   }

   final com.aspose.slides.internal.w0.s7 n5(float var1) {
      if (this.u9 instanceof u4z) {
         u4z var2 = (u4z)this.u9;
         if (var2.u9.s7() > 1.0F && var2.u9.k5() == 0.0F) {
            var2.u9.n5((float)this.t9);
         }

         if (var2.u9.k5() > 1.0F && var2.u9.s7() == 0.0F) {
            var2.u9.l6((float)this.t9);
         }
      }

      com.aspose.slides.internal.w0.l6 var10 = d4.n5(this.u9);
      if (var10.n5() == 3) {
         com.aspose.slides.internal.w0.h0 var3 = (com.aspose.slides.internal.w0.h0)var10;
         float var4 = (float)this.n5();
         float var5 = var4 / 2.0F;
         float var6 = var3.a6().x8() - var5;
         float var7 = var3.a6().n3() - var5;
         float var8 = var3.a6().s7() + var4;
         float var9 = var3.a6().k5() + var4;
         var3.n5(new com.aspose.slides.internal.o9b.y1(var6, var7, var8, var9));
      }

      com.aspose.slides.internal.w0.s7 var11 = new com.aspose.slides.internal.w0.s7(var10, (float)this.n5() * var1 / 72.0F);
      var11.a6(this.u3() == 0 ? 2 : 0);
      var11.u3(c8.l6(this.a6()));
      var11.u9(5);
      switch (this.l6()) {
         case 0:
         default:
            break;
         case 1:
            var11.l6(u3);
            break;
         case 2:
            var11.l6(this.h0 ? k5 : l6);
            break;
         case 3:
            var11.l6(this.h0 ? l6 : k5);
            break;
         case 4:
            var11.l6(n5);
      }

      switch (this.k5()) {
         case 0:
         case 7:
         case 8:
         case 9:
         case 10:
         default:
            var11.u9(this.j5());
            break;
         case 1:
            var11.n5(new float[]{1.0F, 3.0F});
            break;
         case 2:
            var11.n5(new float[]{4.0F, 3.0F});
            break;
         case 3:
            var11.n5(new float[]{8.0F, 3.0F});
            break;
         case 4:
            var11.n5(new float[]{4.0F, 3.0F, 1.0F, 3.0F});
            break;
         case 5:
            var11.n5(new float[]{8.0F, 3.0F, 1.0F, 3.0F});
            break;
         case 6:
            var11.n5(new float[]{8.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F});
            break;
         case 11:
            if (this.z1().length > 0) {
               var11.n5(this.z1());
            }
      }

      com.aspose.slides.internal.x4g.u9 var12 = this.m3();
      com.aspose.slides.internal.x4g.u9 var13 = this.z8();
      if (var12 != null) {
         var11.l6(255);
      } else {
         var11.l6(this.u3() == 0 ? 2 : 16);
      }

      if (var13 != null) {
         var11.k5(255);
      } else {
         var11.k5(this.u3() == 0 ? 2 : 16);
      }

      return var11;
   }

   final com.aspose.slides.internal.o9b.m3 q0() {
      return this.l6(this.a6);
   }

   final com.aspose.slides.internal.o9b.m3 l6(float var1) {
      com.aspose.slides.internal.o9b.u3 var2 = d4.k5(this.u9);
      com.aspose.slides.internal.o9b.m3 var3 = new com.aspose.slides.internal.o9b.m3(var2, (float)this.n5() * var1 / 72.0F);
      var3.l6(this.u3() == 0 ? 2 : 0);
      var3.u9(c8.l6(this.a6()));
      switch (this.l6()) {
         case 0:
         default:
            break;
         case 1:
            var3.n5(u3);
            break;
         case 2:
            var3.n5(this.h0 ? k5 : l6);
            break;
         case 3:
            var3.n5(this.h0 ? l6 : k5);
            break;
         case 4:
            var3.n5(n5);
      }

      switch (this.k5()) {
         case 0:
         case 7:
         case 8:
         case 9:
         case 10:
         default:
            var3.k5(this.j5());
            break;
         case 1:
            var3.l6(new float[]{1.0F, 3.0F});
            break;
         case 2:
            var3.l6(new float[]{4.0F, 3.0F});
            break;
         case 3:
            var3.l6(new float[]{8.0F, 3.0F});
            break;
         case 4:
            var3.l6(new float[]{4.0F, 3.0F, 1.0F, 3.0F});
            break;
         case 5:
            var3.l6(new float[]{8.0F, 3.0F, 1.0F, 3.0F});
            break;
         case 6:
            var3.l6(new float[]{8.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F});
            break;
         case 11:
            if (this.z1().length > 0) {
               var3.l6(this.z1());
               var3.k5(5);
            }
      }

      com.aspose.slides.internal.x4g.u9 var4 = this.m3();
      com.aspose.slides.internal.x4g.u9 var5 = this.z8();
      if (var4 != null) {
         var3.u3(255);
         var3.l6(var4);
      } else {
         var3.u3(16);
      }

      if (var5 != null) {
         var3.a6(255);
         var3.n5(var5);
      } else {
         var3.a6(16);
      }

      return var3;
   }

   final a1v z3() {
      return this.u9;
   }

   static com.aspose.slides.internal.x4g.u9 n5(byte var0, byte var1, byte var2) {
      float var3 = 0.0F;
      float[] var4 = new float[]{0.0F};
      com.aspose.slides.internal.x4g.s7 var5 = n5(var0, var1, var2, var4);
      var3 = var4[0];
      if (var5 == null) {
         return null;
      }

      com.aspose.slides.internal.x4g.u9 var6;
      if (var0 == 5) {
         var6 = new com.aspose.slides.internal.x4g.u9(null, var5, 2, var3);
         var6.n5(2, 2);
      } else {
         var6 = new com.aspose.slides.internal.x4g.u9(var5, null, 3, var3);
      }

      return var6;
   }

   final com.aspose.slides.internal.x4g.s7 m1() {
      float var1 = (float)this.n5() * this.a6 / 72.0F;
      return n5(this.s7(), this.n3(), this.e2(), var1);
   }

   final com.aspose.slides.internal.x4g.s7 k7() {
      float var1 = (float)this.n5() * this.a6 / 72.0F;
      return n5(this.x8(), this.y4(), this.t9(), var1);
   }

   static com.aspose.slides.internal.x4g.s7 n5(byte var0, byte var1, byte var2, float var3) {
      float var4 = 0.0F;
      float[] var5 = new float[]{0.0F};
      com.aspose.slides.internal.x4g.s7 var6 = n5(var0, var1, var2, var5);
      var4 = var5[0];
      if (var6 == null) {
         return null;
      }

      com.aspose.slides.internal.x4g.m1 var7 = new com.aspose.slides.internal.x4g.m1();
      var7.n5(var3, var3);
      var6.l6(var7);
      if (var0 == 5) {
         com.aspose.slides.internal.o9b.m3 var8 = new com.aspose.slides.internal.o9b.m3(com.aspose.slides.internal.o9b.c8.m3().o8(), var3);
         var8.u3(2);
         var8.a6(2);
         var6.n5(var8);
      }

      return var6;
   }

   static com.aspose.slides.internal.x4g.s7 n5(byte var0, byte var1, byte var2, float[] var3) {
      var3[0] = 0.0F;
      if (var0 == 0) {
         return null;
      }

      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7(1);
      float var5 = 1.0F + (1 << var1);
      float var6 = 1.0F + (1 << var2);
      float var7;
      switch (var0) {
         case 1:
            var4.l6(s7);
            var4.n3();
            var7 = 0.9F;
            break;
         case 2:
            var4.l6(x8);
            var4.n3();
            var7 = 0.55F;
            break;
         case 3:
            var4.l6(n3);
            var4.n3();
            var7 = 0.3F;
            break;
         case 4:
            var4.n5(-5.0F, -5.0F, 10.0F, 10.0F);
            var4.n3();
            var7 = 0.3F;
            break;
         case 5:
            float var8 = e2[var1];
            float var9 = y4[var2];
            float var10 = (float)(com.aspose.slides.ms.System.q1.z3(var9 * var9 + var8 * var8) / 2.0 / var9);
            var4.l6(-var9 * 10.0F / var6, (-var10 - var8) * 10.0F / var5, 0.0F, -var10 * 10.0F / var5);
            var4.l6(0.0F, -var10 * 10.0F / var5, var9 * 10.0F / var6, (-var10 - var8) * 10.0F / var5);
            var7 = var10 / var5;
            break;
         default:
            return null;
      }

      var3[0] = var5 * var7;
      com.aspose.slides.internal.x4g.m1 var11 = new com.aspose.slides.internal.x4g.m1();
      var11.n5(var6 / 10.0F, var5 / 10.0F);
      var4.l6(var11);
      return var4;
   }

   final com.aspose.slides.internal.x4g.u9 m3() {
      return n5(this.s7(), this.n3(), this.e2());
   }

   final com.aspose.slides.internal.x4g.u9 z8() {
      return n5(this.x8(), this.y4(), this.t9());
   }

   final int j5() {
      switch (this.k5()) {
         case 0:
         default:
            return 0;
         case 1:
         case 8:
            return 2;
         case 2:
         case 3:
         case 7:
            return 1;
         case 4:
         case 5:
         case 9:
            return 3;
         case 6:
         case 10:
            return 4;
      }
   }

   public final l6v w1() {
      l6v var1 = (l6v)this.r4();
      var1.u9 = this.u9.s7();
      return var1;
   }

   protected Object r4() {
      try {
         l6v var1 = (l6v)super.clone();
         if (this.u9 != null) {
            var1.u9 = this.u9.s7();
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6v cloneT() {
      return this.w1();
   }


   static {
      c8.n5((byte)1, 1);
      c8.n5((byte)2, 0);
      c8.n5((byte)0, 2);
   }
}
