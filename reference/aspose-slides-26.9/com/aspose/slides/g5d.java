package com.aspose.slides;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

final class g5d {
   private int n5;
   private int l6;
   private float k5;
   private float u3;
   private float a6;
   private final ColorOperationCollection u9;
   private m2n h0;
   private ISlideComponent c8;
   private r0g t2;
   private long s7;
   private static final r0s[] x8 = new r0s[]{
      new r0s(com.aspose.slides.internal.n2d.l6.r4().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.e2().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.l6().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.m1().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.j5().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.c4().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.y2().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.w1().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.y1().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.k5().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.n5().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.z3().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.u3().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.z1().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.t4().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.c8().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.t2().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.t9().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.y4().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.k7().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.x8().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.t2().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.x8().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.z8().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.m3().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.q0().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.l6().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.m1().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.z1().o8()),
      new r0s(com.aspose.slides.internal.n2d.l6.j5().o8())
   };
   private static final r0s[] n3 = new r0s[]{
      new r0s(com.aspose.slides.internal.o9b.c8.t9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.t4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.q0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.m1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.k7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.m3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.c4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.d2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.d5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.s3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.p8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.f2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.e5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.b3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.o0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.v4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.u6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.t1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.h2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.v0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.f0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.p3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.x9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.e9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.o5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.s0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.v8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.v3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.g7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.f5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.n1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.p6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.d1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.s4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.h6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.c3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.l4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.k8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.b5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.u8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.q1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.u5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.c2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.t3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.u4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.s9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.p7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.h5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.f4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.q3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.q2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.p4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.d6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.y6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.n7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.l5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.u2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.d9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.c5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.t5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.m8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.b9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.h9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.n9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.h1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.t6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.v6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.x0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.o2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.e0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.x7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.z9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.f8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.s2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.n2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.l0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.p9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.g8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.b4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.x5().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.i8().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.a4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.x3().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.b2().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.m4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.b1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.j1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.k6().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.o7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.v9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.r9().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.c7().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.w4().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.n0().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.f1().o8()),
      new r0s(com.aspose.slides.internal.o9b.c8.k2().o8())
   };

   g5d(r0g var1, m2n var2) {
      this.t2 = var1;
      this.n5(-1);
      this.u9 = new ColorOperationCollection();
      m2n var3 = var2;
      if (var3 == null) {
         var3 = new m2n(null);
      }

      this.h0 = var3;
      if (var2 != null) {
         m2n[] var4 = new m2n[]{this.h0};
         this.h0 = var4[0];
      }
   }

   g5d(r0g var1, int var2, m2n var3) {
      this(var1, var3);
      this.l6(var2);
   }

   g5d(r0g var1, int var2, m2n var3, boolean var4) {
      this(var1, var3);
      this.u3(var2);
   }

   g5d(r0g var1, com.aspose.slides.internal.o9b.c8 var2, m2n var3) {
      this(var1, var3);
      this.n5(var2.o8());
   }

   public final com.aspose.slides.internal.o9b.c8 n5() {
      r0s var1 = this.z3();
      this.u9.n5(var1);
      return var1.n5();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      if (var1.t2()) {
         this.k5 = this.u3 = this.a6 = Float.NaN;
         this.t9().add(5, 0.0F);
      } else {
         this.n5 = 0;
         this.k5 = var1.x8() & 0xFF;
         this.u3 = var1.n3() & 0xFF;
         this.a6 = var1.y4() & 0xFF;
         this.t9().clear();
         if ((var1.s7() & 255) != 255) {
            this.t9().add(5, (var1.s7() & 0xFF) / 255.0F);
         }
      }

      this.w1();
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      if (this.n5 != var1) {
         switch (var1) {
            case 0:
               r0s var7 = this.k7();
               this.k5 = (float)com.aspose.slides.ms.System.q1.u3(var7.l6 * 255.0F);
               this.u3 = (float)com.aspose.slides.ms.System.q1.u3(var7.k5 * 255.0F);
               this.a6 = (float)com.aspose.slides.ms.System.q1.u3(var7.u3 * 255.0F);
               break;
            case 1:
               r0s var6 = this.k7();
               this.k5 = var6.l6;
               this.u3 = var6.k5;
               this.a6 = var6.u3;
               break;
            case 2:
               r0s var2 = this.k7();
               float[] var3 = new float[]{this.k5};
               float[] var4 = new float[]{this.u3};
               float[] var5 = new float[]{this.a6};
               ColorFormat.n5(var2.l6, var2.k5, var2.u3, var3, var4, var5);
               this.k5 = var3[0];
               this.u3 = var4[0];
               this.a6 = var5[0];
               break;
            case 3:
            case 4:
            case 5:
               this.l6 = 0;
               this.q0().n5(new com.aspose.slides.internal.o9b.c8());
         }

         this.n5 = var1;
         this.w1();
      }
   }

   public final int k5() {
      return this.n5 != 5 ? -1 : this.l6;
   }

   public final void l6(int var1) {
      if (var1 == -1) {
         if (this.n5 == 5) {
            this.n5(0);
         } else {
            this.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         }
      } else {
         if (this.n5 != 5) {
            this.n5(5);
         }

         this.l6 = var1;
         this.w1();
      }
   }

   public final int u3() {
      return this.n5 != 4 ? -1 : this.l6;
   }

   public final void k5(int var1) {
      if (var1 == -1 && this.n5 == 4) {
         this.n5(0);
      } else {
         if (this.n5 != 4) {
            this.n5(4);
         }

         this.l6 = var1;
         this.w1();
      }
   }

   public final int a6() {
      return this.n5 != 3 ? -1 : this.l6;
   }

   public final void u3(int var1) {
      if (var1 == -1 && this.n5 == 3) {
         this.n5(0);
      } else {
         if (this.n5 != 3) {
            this.n5(3);
         }

         this.l6 = var1;
         this.w1();
      }
   }

   public final byte u9() {
      return this.n5 == 0 ? com.aspose.slides.internal.v6g.k5.n5((Object)(this.k5), 13) : this.m1().x8();
   }

   public final void n5(byte var1) {
      if (this.n5 != 0) {
         this.n5(0);
      }

      this.k5 = r0s.k5(var1 & 0xFF, 0.0F, 255.0F);
      this.w1();
   }

   public final byte h0() {
      return this.n5 == 0 ? com.aspose.slides.internal.v6g.k5.n5((Object)(this.u3), 13) : this.m1().n3();
   }

   public final void l6(byte var1) {
      if (this.n5 != 0) {
         this.n5(0);
      }

      this.u3 = r0s.k5(var1 & 0xFF, 0.0F, 255.0F);
      this.w1();
   }

   public final byte c8() {
      return this.n5 == 0 ? com.aspose.slides.internal.v6g.k5.n5((Object)(this.a6), 13) : this.m1().y4();
   }

   public final void k5(byte var1) {
      if (this.n5 != 0) {
         this.n5(0);
      }

      this.a6 = r0s.k5(var1 & 0xFF, 0.0F, 255.0F);
      this.w1();
   }

   public final float t2() {
      return this.n5 == 1 ? this.k5 : this.z3().l6;
   }

   public final void n5(float var1) {
      if (this.n5 != 1) {
         this.n5(1);
      }

      this.k5 = r0s.k5(var1, 0.0F, 1.0F);
      this.w1();
   }

   public final float s7() {
      return this.n5 == 1 ? this.u3 : this.z3().k5;
   }

   public final void l6(float var1) {
      if (this.n5 != 1) {
         this.n5(1);
      }

      this.u3 = r0s.k5(var1, 0.0F, 1.0F);
      this.w1();
   }

   public final float x8() {
      return this.n5 == 1 ? this.a6 : this.z3().u3;
   }

   public final void k5(float var1) {
      if (this.n5 != 1) {
         this.n5(1);
      }

      this.a6 = r0s.k5(var1, 0.0F, 1.0F);
      this.w1();
   }

   public final float n3() {
      if (this.n5 == 2) {
         return this.k5;
      }

      r0s var1 = this.z3();
      return ColorFormat.n5(var1.l6, var1.k5, var1.u3);
   }

   public final void u3(float var1) {
      if (this.n5 != 2) {
         this.n5(2);
      }

      var1 %= 360.0F;
      if (var1 < 0.0F) {
         var1 += 360.0F;
      }

      this.k5 = var1;
      this.w1();
   }

   public final float y4() {
      if (this.n5 == 2) {
         return this.u3;
      }

      r0s var1 = this.z3();
      return ColorFormat.l6(var1.l6, var1.k5, var1.u3);
   }

   public final void a6(float var1) {
      if (this.n5 != 2) {
         this.n5(2);
      }

      this.u3 = r0s.k5(var1, 0.0F, 1.0F);
      this.w1();
   }

   public final float e2() {
      if (this.n5 == 2) {
         return this.a6;
      }

      r0s var1 = this.z3();
      return ColorFormat.k5(var1.l6, var1.k5, var1.u3);
   }

   public final void u9(float var1) {
      if (this.n5 != 2) {
         this.n5(2);
      }

      this.a6 = r0s.k5(var1, 0.0F, 1.0F);
      this.w1();
   }

   public final IColorOperationCollection t9() {
      return this.u9;
   }

   public final String a6(int var1) {
      switch (var1) {
         case 0:
            return this.r4();
         default:
            throw new IndexOutOfRangeException();
      }
   }

   final ISlideComponent z1() {
      if (this.c8 == null) {
         q7p var1 = null;
         ISlideComponent[] var2 = new ISlideComponent[]{this.c8};
         q7p[] var3 = new q7p[]{var1};
         d0u.n5(this.t2, var2, var3);
         this.c8 = var2[0];
         var1 = var3[0];
      }

      return this.c8;
   }

   final BaseSlide t4() {
      return (BaseSlide)(this.z1() != null ? this.z1().getSlide() : null);
   }

   final m2n q0() {
      return this.h0;
   }

   final r0s z3() {
      return this.n5((r0s)null);
   }

   final com.aspose.slides.internal.o9b.c8 m1() {
      r0s var1 = this.z3();
      return com.aspose.slides.internal.o9b.c8.n5(
         com.aspose.slides.internal.v6g.k5.u3(
            com.aspose.slides.ms.System.q1.u3(r0s.k5((!com.aspose.slides.ms.System.n1.k5(var1.l6) ? var1.l6 : 0.0F) * 255.0F, 0.0F, 255.0F)), 14
         ),
         com.aspose.slides.internal.v6g.k5.u3(
            com.aspose.slides.ms.System.q1.u3(r0s.k5((!com.aspose.slides.ms.System.n1.k5(var1.k5) ? var1.k5 : 0.0F) * 255.0F, 0.0F, 255.0F)), 14
         ),
         com.aspose.slides.internal.v6g.k5.u3(
            com.aspose.slides.ms.System.q1.u3(r0s.k5((!com.aspose.slides.ms.System.n1.k5(var1.u3) ? var1.u3 : 0.0F) * 255.0F, 0.0F, 255.0F)), 14
         )
      );
   }

   final r0s k7() {
      r0s var1 = this.z3();
      this.u9.n5(var1);
      return var1;
   }

   final void n5(g5d var1) {
      this.l6(var1);
      this.w1();
   }

   final void l6(g5d var1) {
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.n5 = var1.l6();
      this.l6 = var1.l6;
      this.q0().n5(var1.q0().n5().o8());
      this.u9.n5((ColorOperationCollection)var1.t9(), true);
   }

   final void l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5(var1.o8());
      this.w1();
   }

   final void m3() {
      this.n5 = -1;
      this.k5 = this.u3 = this.a6 = 0.0F;
      this.u9.clear();
      this.w1();
   }

   final r0s n5(r0s var1) {
      switch (this.n5) {
         case 0:
            return new r0s(this.k5 / 255.0F, this.u3 / 255.0F, this.a6 / 255.0F);
         case 1:
            return new r0s(this.k5, this.u3, this.a6);
         case 2:
            return ColorFormat.u3(this.k5, this.u3, this.a6);
         case 3:
            int var2 = this.a6();
            r0g var3 = this.t2;

            while (var3 != null && !com.aspose.slides.internal.v6g.k5.l6(var3, Chart.class)) {
               var3 = var3.getParent_Immediate();
            }

            if (!com.aspose.slides.internal.v6g.k5.l6(var3, Chart.class)
               || !((Chart)var3).y4().n5() && !((Chart)var3).getThemeManager().isOverrideThemeEnabled()) {
               if (var2 == 12 && var1 != null) {
                  return new r0s(var1);
               } else {
                  BaseSlide var6 = this.t4();
                  IPresentationComponent var5 = var6 != null ? var6.t9() : null;
                  if (com.aspose.slides.internal.v6g.k5.l6(var5, BaseSlide.class)) {
                     var5 = ((BaseSlide)var5).t9();
                  }

                  return var5 != null ? var6.n5(this.a6()).t2() : new r0s(0.0F, 0.0F, 0.0F);
               }
            } else {
               byte var4 = ((Chart)var3).y4().n5(this.a6());
               return new r0s(((Chart)var3).n5(var4).o8());
            }
         case 4:
            return new r0s(x8[this.l6 & 127]);
         case 5:
            return new r0s(n3[this.l6]);
         default:
            return new r0s(Float.NaN, Float.NaN, Float.NaN);
      }
   }

   final r0s n5(IBaseSlide var1, r0s var2) {
      switch (this.n5) {
         case 0:
            return new r0s(this.k5 / 255.0F, this.u3 / 255.0F, this.a6 / 255.0F);
         case 1:
            return new r0s(this.k5, this.u3, this.a6);
         case 2:
            return ColorFormat.u3(this.k5, this.u3, this.a6);
         case 3:
            int var3 = this.a6();
            r0g var4 = this.t2;

            while (var4 != null && !com.aspose.slides.internal.v6g.k5.l6(var4, Chart.class)) {
               var4 = var4.getParent_Immediate();
            }

            if (!com.aspose.slides.internal.v6g.k5.l6(var4, Chart.class)
               || !((Chart)var4).y4().n5() && !((Chart)var4).getThemeManager().isOverrideThemeEnabled()) {
               if (var3 == 12 && var2 != null) {
                  return new r0s(var2);
               } else {
                  IPresentationComponent var6 = var1 != null ? ((BaseSlide)var1).t9() : null;
                  if (com.aspose.slides.internal.v6g.k5.l6(var6, BaseSlide.class)) {
                     var6 = ((BaseSlide)var6).t9();
                  }

                  return var6 != null ? ((BaseSlide)var1).n5(this.a6()).t2() : new r0s(0.0F, 0.0F, 0.0F);
               }
            } else {
               byte var5 = ((Chart)var4).y4().n5(this.a6());
               return new r0s(((Chart)var4).n5(var5).o8());
            }
         case 4:
            return new r0s(x8[this.l6 & 127]);
         case 5:
            return new r0s(n3[this.l6]);
         default:
            return new r0s(Float.NaN, Float.NaN, Float.NaN);
      }
   }

   final r0s n5(IBaseSlide var1) {
      r0s var2 = this.n5(var1, null);
      this.u9.n5(var2);
      return var2;
   }

   final r0s l6(IBaseSlide var1, r0s var2) {
      r0s var3 = this.n5(var1, var2);
      this.u9.n5(var3);
      return var3;
   }

   final com.aspose.slides.internal.o9b.c8 k5(IBaseSlide var1, r0s var2) {
      r0s var3 = this.n5(var1, var2);
      this.u9.n5(var3);
      return var3.n5();
   }

   final com.aspose.slides.internal.o9b.c8 l6(r0s var1) {
      r0s var2 = this.n5(var1);
      this.u9.n5(var2);
      return var2.n5();
   }

   final void n5(float var1, float var2, float var3, int var4) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      this.n5 = var4;
      this.w1();
   }

   final void n5(int var1, com.aspose.slides.internal.o9b.c8 var2) {
      if (var1 == -1 && this.n5 == 4) {
         this.n5(0);
      } else {
         if (this.n5 != 4) {
            this.n5(4);
         }

         this.l6 = var1;
         this.q0().n5(var2.o8());
         this.w1();
      }
   }

   final void n5(r0g var1) {
      this.t2 = var1;
      this.c8 = null;
      this.w1();
   }

   final long z8() {
      return (this.s7 & 4294967295L) + (this.u9.n5() & 4294967295L) & 4294967295L;
   }

   private void w1() {
      this.s7++;
   }

   private String r4() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      g5d var2 = this;
      String var3 = null;
      int var4 = -1;
      if (var2.l6() == 3) {
         var4 = var2.a6();
         BaseSlide var5 = this.t4();
         if (var5 != null && var5.t9() != null) {
            ColorFormat var6 = var5.n5(var2.a6());
            var6.k7();
            var2 = var6.l6();
         } else {
            var2 = new g5d(null, com.aspose.slides.internal.o9b.c8.m3().o8(), null);
         }
      }

      if (var2.l6() == 5) {
         switch (var2.k5()) {
            case 2:
               var3 = "aqua";
               break;
            case 7:
               var3 = "black";
               break;
            case 9:
               var3 = "blue";
               break;
            case 45:
               var3 = "fuchsia";
               break;
            case 50:
               var3 = "gray";
               break;
            case 51:
               var3 = "green";
               break;
            case 76:
               var3 = "lime";
               break;
            case 80:
               var3 = "maroon";
               break;
            case 95:
               var3 = "navy";
               break;
            case 97:
               var3 = "olive";
               break;
            case 112:
               var3 = "purple";
               break;
            case 113:
               var3 = "red";
               break;
            case 122:
               var3 = "silver";
               break;
            case 130:
               var3 = "teal";
               break;
            case 136:
               var3 = "white";
               break;
            case 138:
               var3 = "yellow";
         }
      }

      if (var3 != null || var4 >= 0) {
         boolean var7 = false;

         for (int var9 = 0; var9 < this.t9().size(); var9++) {
            if (!((ColorOperation)this.t9().get_Item(var9)).n5()) {
               var7 = true;
               break;
            }
         }

         if (!var7 && var2 != this) {
            for (int var10 = 0; var10 < var2.t9().size(); var10++) {
               if (!((ColorOperation)var2.t9().get_Item(var10)).n5()) {
                  var7 = true;
                  break;
               }
            }
         }

         if (var7) {
            var3 = null;
            var4 = -1;
         }
      }

      com.aspose.slides.internal.o9b.c8 var8 = this.l6(r0s.a6).o8();
      if (var3 != null) {
         var1.n5(var3);
      } else {
         var1.n5("#{0:x2}{1:x2}{2:x2}", var8.x8(), var8.n3(), var8.y4());
      }

      if (var4 >= 0) {
         var1.n5(" [{0}]", var4);
      }

      return var1.toString();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      g5d var2 = com.aspose.slides.internal.v6g.k5.n5(obj, g5d.class);
      if (var2 == null) {
         return false;
      }

      if (this.n5 != var2.l6()) {
         return false;
      }

      switch (this.n5) {
         case -1:
         default:
            break;
         case 0:
         case 1:
         case 2:
            if (this.k5 != var2.k5 || this.u3 != var2.u3 || this.a6 != var2.a6) {
               return false;
            }
            break;
         case 3:
         case 4:
         case 5:
            if (this.l6 != var2.l6 || com.aspose.slides.internal.o9b.c8.l6(this.q0().n5(), var2.q0().n5())) {
               return false;
            }
      }

      IColorOperationCollection var3 = this.t9();
      IColorOperationCollection var4 = var2.t9();
      if (var3.size() != var4.size()) {
         return false;
      }

      for (int var5 = 0; var5 < this.t9().size(); var5++) {
         if (!var3.get_Item(var5).equals(var4.get_Item(var5))) {
            return false;
         }
      }

      return true;
   }

   final boolean j5() {
      return this.n5 != -1 ? false : this.t9().size() == 0;
   }

   @Override
   public int hashCode() {
      return this.n5 + this.l6 + com.aspose.slides.internal.v6g.k5.u3(100.0F * (this.k5 + this.u3 + this.a6), 13);
   }

   @Override
   public String toString() {
      switch (this.n5) {
         case 0:
            return com.aspose.slides.ms.System.d1.n5("RGB color: {0}, {1}, {2}",new Object[]{ this.u9(), this.h0(), this.c8()});
         case 1:
            return com.aspose.slides.ms.System.d1.n5("RGB percentage: {0}, {1}, {2}",new Object[]{ this.t2(), this.s7(), this.x8()});
         case 2:
            return com.aspose.slides.ms.System.d1.n5("HSL color: {0}, {1}, {2}",new Object[]{ this.n3(), this.y4(), this.e2()});
         case 3:
            return com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.d1.n5("Scheme color: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(SchemeColor.class, this.a6())}),
               " = ",
               this.n5().toString()
            });
         case 4:
            return com.aspose.slides.ms.System.d1.n5("System color: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(SystemColor.class, this.u3())});
         case 5:
            return com.aspose.slides.ms.System.d1.n5("Preset color: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(PresetColor.class, this.k5())});
         default:
            return "Undefined color";
      }
   }
}
