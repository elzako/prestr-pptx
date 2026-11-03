package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class a8s implements IGenericCloneable<a8s>, IDisposable {
   private float k7;
   boolean n5 = false;
   boolean l6 = false;
   protected com.aspose.slides.internal.o9b.y1 k5 = new com.aspose.slides.internal.o9b.y1();
   protected float u3;
   protected float a6;
   protected float u9;
   private float m3;
   private float z8;
   private com.aspose.slides.internal.o9b.c8 j5 = com.aspose.slides.internal.o9b.c8.u3.o8();
   private int w1 = 0;
   private int r4 = 0;
   protected com.aspose.slides.internal.o9b.u3 h0 = null;
   protected com.aspose.slides.internal.o9b.u3 c8 = null;
   protected com.aspose.slides.internal.o9b.u3 t2 = null;
   protected com.aspose.slides.internal.o9b.u3 s7 = null;
   protected com.aspose.slides.internal.o9b.u3 x8 = null;
   protected com.aspose.slides.internal.o9b.m3 n3 = null;
   protected com.aspose.slides.internal.o9b.w1 y4 = new com.aspose.slides.internal.o9b.w1();
   protected com.aspose.slides.internal.o9b.w1 e2 = new com.aspose.slides.internal.o9b.w1();
   protected com.aspose.slides.internal.o9b.w1 t9 = new com.aspose.slides.internal.o9b.w1();
   protected com.aspose.slides.internal.o9b.w1 z1 = new com.aspose.slides.internal.o9b.w1();
   protected com.aspose.slides.internal.o9b.w1 t4 = new com.aspose.slides.internal.o9b.w1();
   protected com.aspose.slides.internal.o9b.w1 q0 = new com.aspose.slides.internal.o9b.w1();
   protected x7b z3 = x7b.n5;
   protected x7b m1 = x7b.n5;
   private String c4;
   private boolean y2 = false;
   private t9z y1 = null;

   protected a8s() {
   }

   public a8s(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      com.aspose.slides.internal.o9b.c8 var8,
      int var9,
      int var10,
      float var11,
      t9z var12
   ) {
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8.o8(), var9, var10, var11, var12);
   }

   public a8s(
      com.aspose.slides.internal.o9b.y1 var1,
      float var2,
      float var3,
      float var4,
      com.aspose.slides.internal.o9b.c8 var5,
      int var6,
      int var7,
      float var8,
      t9z var9
   ) {
      this.n5(var1.x8(), var1.n3(), var1.s7(), var1.k5(), var2, var3, var4, var5.o8(), var6, var7, var8, var9);
   }

   public a8s(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      com.aspose.slides.internal.o9b.c8 var8,
      int var9,
      int var10,
      float var11
   ) {
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8.o8(), var9, var10, var11, null);
   }

   private void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      com.aspose.slides.internal.o9b.c8 var8,
      int var9,
      int var10,
      float var11,
      t9z var12
   ) {
      this.m3 = var6;
      this.z8 = var7;
      var8.n5(this.j5);
      this.w1 = var9;
      this.r4 = var10;
      com.aspose.slides.internal.o9b.c8 var13 = k2s.n5(var10, var8.o8()).o8();
      this.n3 = new com.aspose.slides.internal.o9b.m3(var13.o8(), var11);
      this.n3.u9(2);
      this.k5(var1, var2, var3, var4, var5);
      this.y1 = var12;
      if (var12 != null) {
         com.aspose.slides.internal.o9b.y1 var14 = new com.aspose.slides.internal.o9b.y1(var1, var2, var3, var4);
         com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
         var15.l6(var14.y4());
         this.n3 = w5k.n5(var12.z8().o8(), (LineFormat)var12.s7().getFormat().getLine(), var12.y4().t2(), 1.0F);
      }
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.y2) {
         if (var1) {
            this.n3.dispose();
            this.q0();
            this.z3.dispose();
            this.m1.dispose();
         }

         this.y2 = true;
      }
   }

   public final a8s n5() {
      return new a8s(this.h0().y4(), this.c8(), this.l6(), this.k5(), this.j5.o8(), this.w1, this.r4, this.n3.q0(), this.y1);
   }

   public final float l6() {
      return this.a6;
   }

   public final float k5() {
      return this.u9;
   }

   public final float u3() {
      return this.k7;
   }

   public final void n5(float var1) {
      this.k7 = var1;
   }

   public final float a6() {
      return (this.a6 + this.u9) % 360.0F;
   }

   public final String u9() {
      return this.c4;
   }

   public final void n5(String var1) {
      this.c4 = var1;
   }

   public com.aspose.slides.internal.o9b.w1 n5(float var1, float[] var2) {
      com.aspose.slides.internal.o9b.w1 var3 = com.aspose.slides.internal.o9b.w1.n5.u3();
      if (this.k5() >= 180.0F) {
         var2[0] = this.u3(this.l6()) + this.k5() / 2.0F;
         this.l6(this.y4.l6(), this.y4.k5(), this.k5.s7() * var1, this.k5.k5() * var1, var2[0]).n5(var3);
      } else {
         float var4 = (this.t9.l6() + this.t4.l6()) / 2.0F;
         float var5 = (this.t9.k5() + this.t4.k5()) / 2.0F;
         float var6 = (float)(com.aspose.slides.ms.System.q1.u3(var5 - this.y4.k5(), var4 - this.y4.l6()) * 180.0 / Math.PI);
         var2[0] = this.u3(var6);
         this.l6(this.y4.l6(), this.y4.k5(), this.k5.s7() * var1, this.k5.k5() * var1, var2[0]).n5(var3);
      }

      var2[0] %= 360.0F;
      if (var2[0] < 0.0F) {
         var2[0] += 360.0F;
      }

      return var3;
   }

   final com.aspose.slides.internal.o9b.y1 h0() {
      return this.k5;
   }

   final float c8() {
      return this.u3;
   }

   final void t2() {
      this.y4();
      if (this.l6() > 90.0F && this.l6() < 270.0F) {
         this.x8();
         this.s7();
      } else {
         this.s7();
         this.x8();
      }

      this.n3();
   }

   final a8s[] l6(float var1) {
      if (this.l6() != var1 && this.a6() != var1) {
         float var2 = this.u3(this.l6());
         float var3 = (var1 - var2 + 360.0F) % 360.0F;
         a8s var4 = new a8s(this.h0().y4(), this.c8(), var2, var3, this.j5.o8(), this.w1, this.r4, this.n3.q0(), this.y1);
         var4.n5(this.k5());
         var4.n5 = true;
         if (this.k5() == 360.0F) {
            var4.n5(false, false);
         } else {
            var4.n5(true, false);
         }

         var3 = this.u3(this.a6()) - var1;
         a8s var5 = new a8s(this.h0().y4(), this.c8(), var1, var3, this.j5.o8(), this.w1, this.r4, this.n3.q0(), this.y1);
         var5.n5(this.k5());
         var5.n5 = true;
         if (this.k5() == 360.0F) {
            var5.n5(false, false);
         } else {
            var5.n5(false, true);
         }

         return new a8s[]{var4, var5};
      } else {
         return new a8s[]{this.n5()};
      }
   }

   final void n5(float var1, float var2, float var3, float var4, float var5) {
      this.k5(var1, var2, var3, var4, var5);
   }

   final void s7() {
      if (this.z3 != null) {
         if (this.l6() > 90.0F && this.l6() < 270.0F) {
            this.z3.n5(this.n3, this.t2, this.y1);
         } else {
            this.z3.n5(this.n3, this.h0, this.y1);
         }
      }
   }

   final void x8() {
      if (this.m1 != null) {
         if (this.a6() > 90.0F && this.a6() < 270.0F) {
            this.m1.n5(this.n3, this.h0, this.y1);
         } else {
            this.m1.n5(this.n3, this.s7, this.y1);
         }
      }
   }

   final void n3() {
      a8s$n5[] var1 = this.m1();

      for (a8s$n5 var5 : var1) {
         this.n5(this.n3, this.x8, var5.n5(), var5.l6(), var5.k5().u3(), var5.u3().u3());
      }
   }

   final void y4() {
      a8s$n5[] var1 = this.k7();

      for (a8s$n5 var5 : var1) {
         this.n5(this.n3, this.h0, var5.n5(), var5.l6(), var5.k5().u3(), var5.u3().u3());
      }
   }

   final void e2() {
      if (this.y1 != null) {
         com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
         var1.l6(this.k5.x8(), this.k5.n3(), this.k5.s7(), this.k5.k5(), this.a6, this.u9);
         this.y1.k5(var1);
      }

      if (this.y1 != null) {
         com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();
         if (this.u9 == 360.0F) {
            var2.n5(this.k5.x8(), this.k5.n3(), this.k5.s7(), this.k5.k5(), this.a6, this.u9);
         } else {
            var2.l6(this.k5.x8(), this.k5.n3(), this.k5.s7(), this.k5.k5(), this.a6, this.u9);
         }

         if (!w8d.n5(this.t4())) {
            this.y1.n5(var2);
         }
      }
   }

   final void t9() {
      if (this.y1 != null) {
         com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
         var1.l6(this.k5.x8(), this.k5.n3(), this.k5.s7(), this.k5.k5(), this.a6, this.u9);
         this.y1.k5(var1);
      }

      if (this.y1 != null) {
         com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();
         if (this.u9 == 360.0F) {
            var2.n5(this.k5.x8(), this.k5.n3(), this.k5.s7(), this.k5.k5(), this.a6, this.u9);
         } else {
            var2.l6(this.k5.x8(), this.k5.n3(), this.k5.s7(), this.k5.k5(), this.a6, this.u9);
         }

         if (!w8d.n5(this.t4())) {
            this.y1.n5(var2);
         }
      }
   }

   final com.aspose.slides.internal.o9b.y1 z1() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.t9.l6(), this.t9.k5(), 0.0F, 0.0F);
      if (this.a6 == 0.0F || this.a6 + this.u9 >= 360.0F) {
         com.aspose.slides.internal.o9b.y1[] var2 = new com.aspose.slides.internal.o9b.y1[]{var1};
         f3a.n5(var2, this.k5.h0());
         var2[0].a6(var1);
      }

      if (this.a6 <= 90.0F && this.a6 + this.u9 >= 90.0F || this.a6 + this.u9 >= 450.0F) {
         com.aspose.slides.internal.o9b.y1[] var3 = new com.aspose.slides.internal.o9b.y1[]{var1};
         f3a.l6(var3, this.k5.l6() + this.c8());
         var3[0].a6(var1);
      }

      if (this.a6 <= 180.0F && this.a6 + this.u9 >= 180.0F || this.a6 + this.u9 >= 540.0F) {
         com.aspose.slides.internal.o9b.y1[] var4 = new com.aspose.slides.internal.o9b.y1[]{var1};
         f3a.n5(var4, this.k5.a6());
         var4[0].a6(var1);
      }

      if (this.a6 <= 270.0F && this.a6 + this.u9 >= 270.0F || this.a6 + this.u9 >= 630.0F) {
         com.aspose.slides.internal.o9b.y1[] var5 = new com.aspose.slides.internal.o9b.y1[]{var1};
         f3a.l6(var5, this.k5.t2());
         var5[0].a6(var1);
      }

      com.aspose.slides.internal.o9b.y1[] var6 = new com.aspose.slides.internal.o9b.y1[]{var1};
      f3a.n5(var6, this.y4.u3());
      var6[0].a6(var1);
      var6[0] = var1;
      f3a.n5(var6, this.e2.u3());
      var6[0].a6(var1);
      var6[0] = var1;
      f3a.n5(var6, this.t9.u3());
      var6[0].a6(var1);
      var6[0] = var1;
      f3a.n5(var6, this.z1.u3());
      var6[0].a6(var1);
      var6[0] = var1;
      f3a.n5(var6, this.t4.u3());
      var6[0].a6(var1);
      var6[0] = var1;
      f3a.n5(var6, this.q0.u3());
      var6[0].a6(var1);
      return var1;
   }

   final t9z t4() {
      return this.y1;
   }

   protected void n5(com.aspose.slides.internal.o9b.c8 var1, int var2) {
      this.h0 = new com.aspose.slides.internal.o9b.i1(var1.o8());
      this.c8 = new com.aspose.slides.internal.o9b.i1(r1q.n5(var1.o8(), 0.3F).o8());
      switch (var2) {
         case 0:
            com.aspose.slides.internal.o9b.c8 var7 = com.aspose.slides.internal.o9b.c8.n5((var1.x8() & 255) / 2, (var1.n3() & 255) / 2, (var1.y4() & 255) / 2)
               .o8();
            com.aspose.slides.internal.o9b.i1 var4 = new com.aspose.slides.internal.o9b.i1(var7.o8());
            this.x8 = var4;
            this.s7 = var4;
            this.t2 = var4;
            break;
         case 1:
            com.aspose.slides.internal.o9b.i1 var3 = new com.aspose.slides.internal.o9b.i1(r1q.n5(var1.o8(), -0.3F).o8());
            this.x8 = var3;
            this.s7 = var3;
            this.t2 = var3;
            break;
         case 2:
            double var5 = this.a6 - 180.0F - 20.0F;
            if (var5 < 0.0) {
               var5 += 360.0;
            }

            this.t2 = this.n5(var1.o8(), var5);
            var5 = this.a6 + this.u9 - 20.0F;
            if (var5 < 0.0) {
               var5 += 360.0;
            }

            this.s7 = this.n5(var1.o8(), var5);
            this.x8 = this.n5(var1.o8());
      }
   }

   protected final void q0() {
      this.h0.dispose();
      this.t2.dispose();
      this.s7.dispose();
      this.x8.dispose();
      this.c8.dispose();
   }

   protected com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.o9b.c8 var1, double var2) {
      return new com.aspose.slides.internal.o9b.i1(
         r1q.n5(var1.o8(), -((float)(0.3F * (1.0 - 0.8 * com.aspose.slides.ms.System.q1.c8(var2 * Math.PI / 180.0))))).o8()
      );
   }

   protected com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.o9b.c8 var1) {
      com.aspose.slides.internal.x4g.a6 var2 = new com.aspose.slides.internal.x4g.a6();
      var2.n5(new com.aspose.slides.internal.o9b.c8[]{r1q.n5(var1.o8(), -0.15F), var1, r1q.n5(var1.o8(), -0.3F)});
      var2.n5(new float[]{0.0F, 0.1F, 1.0F});
      com.aspose.slides.internal.x4g.z3 var3 = com.aspose.slides.internal.x4g.z3.n5(
         this.k5, com.aspose.slides.internal.o9b.c8.j5(), com.aspose.slides.internal.o9b.c8.w4(), 0
      );
      var3.n5(var2);
      return var3;
   }

   protected final void n5(
      com.aspose.slides.internal.o9b.m3 var1,
      com.aspose.slides.internal.o9b.u3 var2,
      float var3,
      float var4,
      com.aspose.slides.internal.o9b.w1 var5,
      com.aspose.slides.internal.o9b.w1 var6
   ) {
      float var7 = 0.5F;
      if (this.y1 != null) {
         com.aspose.slides.internal.x4g.s7 var8 = this.l6(var3, var4, var5.u3(), var6.u3());
         if (this.n5) {
            com.aspose.slides.internal.x4g.s7 var9 = this.n5(var3, var4, var5.u3(), var6.u3());
            this.y1.n5(var8, var9, var7);
         } else {
            this.y1.n5(var8, var7);
         }
      }

      if (this.y1 != null) {
         List var14 = this.n5(var3, var4, var5.u3(), var6.u3(), this.u3());
         List$Enumerator var15 = var14.iterator();

         try {
            while (var15.hasNext()) {
               com.aspose.slides.internal.x4g.s7 var10 = (com.aspose.slides.internal.x4g.s7)var15.next();
               if (!w8d.n5(this.t4())) {
                  this.y1.n5(var10);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
               var15.dispose();
            }
         }
      }
   }

   protected final float k5(float var1) {
      double var2 = this.k5.s7() * com.aspose.slides.ms.System.q1.c8(var1 * Math.PI / 180.0);
      double var4 = this.k5.k5() * com.aspose.slides.ms.System.q1.h0(var1 * Math.PI / 180.0);
      float var6 = (float)(com.aspose.slides.ms.System.q1.u3(var4, var2) * 180.0 / Math.PI);
      return var6 < 0.0F ? var6 + 360.0F : var6;
   }

   protected final float u3(float var1) {
      double var2 = this.k5.k5() * com.aspose.slides.ms.System.q1.c8(var1 * Math.PI / 180.0);
      double var4 = this.k5.s7() * com.aspose.slides.ms.System.q1.h0(var1 * Math.PI / 180.0);
      float var6 = (float)(com.aspose.slides.ms.System.q1.u3(var4, var2) * 180.0 / Math.PI);
      return var6 < 0.0F ? var6 + 360.0F : var6;
   }

   protected final com.aspose.slides.internal.o9b.w1 l6(float var1, float var2, float var3, float var4, float var5) {
      double var6 = var5 * Math.PI / 180.0;
      return new com.aspose.slides.internal.o9b.w1(
         var1 + (float)(var3 * com.aspose.slides.ms.System.q1.c8(var6)), var2 + (float)(var4 * com.aspose.slides.ms.System.q1.h0(var6))
      );
   }

   private void k5(float var1, float var2, float var3, float var4, float var5) {
      this.k5 = new com.aspose.slides.internal.o9b.y1(var1, var2, var3, var4);
      this.u3 = var5;
      this.a6 = this.k5(this.m3);
      this.u9 = this.z8;
      if (this.u9 % 180.0F != 0.0F) {
         this.u9 = this.k5(this.m3 + this.z8) - this.a6;
      }

      if (this.u9 < 0.0F) {
         this.u9 += 360.0F;
      }

      this.n5(this.j5.o8(), this.w1);
      float var6 = var1 + var3 / 2.0F;
      float var7 = var2 + var4 / 2.0F;
      this.y4 = new com.aspose.slides.internal.o9b.w1(var6, var7);
      this.e2 = new com.aspose.slides.internal.o9b.w1(var6, var7 + var5);
      this.l6(var6, var7, var3 / 2.0F, var4 / 2.0F, this.m3).n5(this.t9);
      this.z1 = new com.aspose.slides.internal.o9b.w1(this.t9.l6(), this.t9.k5() + var5);
      this.l6(var6, var7, var3 / 2.0F, var4 / 2.0F, this.m3 + this.z8).n5(this.t4);
      this.q0 = new com.aspose.slides.internal.o9b.w1(this.t4.l6(), this.t4.k5() + var5);
      this.z3();
   }

   private void z3() {
      this.n5(true, true);
   }

   private void n5(boolean var1, boolean var2) {
      if (var1) {
         this.z3 = new x7b(this.y4.u3(), this.t9.u3(), this.z1.u3(), this.e2.u3(), this.u9 != 180.0F);
      } else {
         this.z3 = x7b.n5;
      }

      if (var2) {
         this.m1 = new x7b(this.y4.u3(), this.t4.u3(), this.q0.u3(), this.e2.u3(), this.u9 != 180.0F);
      } else {
         this.m1 = x7b.n5;
      }
   }

   private a8s$n5[] m1() {
      List var1 = new List();
      if (this.u9 != 0.0F && (!(this.a6 >= 180.0F) || !(this.a6 + this.u9 <= 360.0F))) {
         if (this.l6() < 180.0F) {
            float var2 = this.a6;
            com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(this.t9.l6(), this.t9.k5());
            float var4 = this.a6();
            com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(this.t4.l6(), this.t4.k5());
            if (this.a6 + this.u9 > 180.0F) {
               var4 = 180.0F;
               var5.n5(this.k5.x8());
               var5.l6(this.y4.k5());
            }

            var1.addItem(new a8s$n5(var2, var4, var3.u3(), var5.u3()));
         }

         if (this.a6 + this.u9 > 360.0F) {
            float var6 = 0.0F;
            com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(this.k5.h0(), this.y4.k5());
            float var8 = this.a6();
            com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(this.t4.l6(), this.t4.k5());
            if (var8 > 180.0F) {
               var8 = 180.0F;
               var9.n5(this.k5.a6());
               var9.l6(this.y4.k5());
            }

            var1.addItem(new a8s$n5(var6, var8, var7.u3(), var9.u3()));
         }
      }

      return (a8s$n5[])var1.toArray(new a8s$n5[0]);
   }

   private a8s$n5[] k7() {
      List var1 = new List();
      if (this.u9 != 0.0F && (!(this.a6 >= 0.0F) || !(this.a6 + this.u9 <= 180.0F)) && this.a6 + this.u9 > 180.0F) {
         float var2 = this.a6;
         com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(this.t9.l6(), this.t9.k5());
         float var4 = this.a6 + this.u9;
         com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(this.t4.l6(), this.t4.k5());
         if (var2 < 180.0F) {
            var2 = 180.0F;
            var3.n5(this.k5.a6());
            var3.l6(this.y4.k5());
         }

         if (var4 > 360.0F) {
            var4 = 360.0F;
            var5.n5(this.k5.h0());
            var5.l6(this.y4.k5());
         }

         var1.addItem(new a8s$n5(var2, var4, var3.u3(), var5.u3()));
         if (this.a6 < 360.0F && this.a6 + this.u9 > 540.0F) {
            var2 = 180.0F;
            var3 = new com.aspose.slides.internal.o9b.w1(this.k5.a6(), this.y4.k5());
            var4 = this.a6();
            var5 = new com.aspose.slides.internal.o9b.w1(this.t4.l6(), this.t4.k5());
            var1.addItem(new a8s$n5(var2, var4, var3.u3(), var5.u3()));
         }
      }

      return (a8s$n5[])var1.toArray(new a8s$n5[0]);
   }

   private com.aspose.slides.internal.x4g.s7 n5(float var1, float var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.w1 var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
      var5.n5(this.k5.y4(), var1, this.u3());
      var5.n5(this.k5.x8(), this.k5.n3() + this.u3, this.k5.s7(), this.k5.k5(), var2, -this.u3());
      return var5;
   }

   private com.aspose.slides.internal.x4g.s7 l6(float var1, float var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.w1 var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
      var5.n5(this.k5.y4(), var1, var2 - var1);
      var5.l6(var4.l6(), var4.k5(), var4.l6(), var4.k5() + this.u3);
      var5.n5(this.k5.x8(), this.k5.n3() + this.u3, this.k5.s7(), this.k5.k5(), var2, var1 - var2);
      var5.l6(var3.l6(), var3.k5() + this.u3, var3.l6(), var3.k5());
      return var5;
   }

   private List<com.aspose.slides.internal.x4g.s7> n5(
      float var1, float var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.w1 var4, float var5
   ) {
      List var6 = new List();
      if (var5 != 360.0F) {
         com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
         var7.n5(this.k5.y4(), var1, var2 - var1);
         var7.l6(var4.l6(), var4.k5(), var4.l6(), var4.k5() + this.u3);
         var7.n5(this.k5.x8(), this.k5.n3() + this.u3, this.k5.s7(), this.k5.k5(), var2, var1 - var2);
         var7.l6(var3.l6(), var3.k5() + this.u3, var3.l6(), var3.k5());
         var6.addItem(var7);
      } else {
         com.aspose.slides.internal.x4g.s7 var12 = new com.aspose.slides.internal.x4g.s7();
         var12.n5(this.k5.y4(), var1, var2 - var1);
         var6.addItem(var12);
         com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
         var8.n5(this.k5.x8(), this.k5.n3() + this.u3, this.k5.s7(), this.k5.k5(), var2, var1 - var2);
         var6.addItem(var8);
         int var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var1), (short)((short)1)), 14);
         if (var9 % 180 == 0) {
            com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
            var10.l6(var3.l6(), var3.k5() + this.u3, var3.l6(), var3.k5());
            var6.addItem(var10);
         }

         int var13 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var2), (short)((short)1)), 14);
         if (var13 % 180 == 0) {
            com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
            var11.l6(var4.l6(), var4.k5(), var4.l6(), var4.k5() + this.u3);
            var6.addItem(var11);
         }
      }

      return var6;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a8s cloneT() {
      return this.n5();
   }

}
