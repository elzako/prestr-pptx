package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class z3y {
   private final com.aspose.slides.internal.o9b.w1[] n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;

   public final com.aspose.slides.internal.o9b.w1[] n5() {
      return this.n5;
   }

   public final float l6() {
      return this.l6;
   }

   public final float k5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.y1 u3() {
      return new com.aspose.slides.internal.o9b.y1(this.u3, this.a6, this.l6, this.k5);
   }

   public final com.aspose.slides.internal.o9b.w1 a6() {
      return new com.aspose.slides.internal.o9b.w1(this.u3 + this.l6 / 2.0F, this.a6 + this.k5 / 2.0F);
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      com.aspose.slides.internal.o9b.w1 var2 = this.a6().u3();
      float var3 = var1.l6() - var2.l6();
      float var4 = var1.k5() - var2.k5();
      this.u3 += var3;
      this.a6 += var4;
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1();

      for (int var6 = 0; var6 < this.n5.length; var6++) {
         this.n5[var6].n5(var5);
         this.n5[var6] = new com.aspose.slides.internal.o9b.w1(var5.l6() + var3, var5.k5() + var4);
      }
   }

   public final void n5(float var1) {
      if (var1 != 0.0F) {
         if (var1 < 0.0F) {
            var1 += 360.0F;
         }

         double var2 = var1 * (Math.PI / 180.0) % (Math.PI * 2);
         double var4 = com.aspose.slides.ms.System.q1.c8(var2);
         double var6 = com.aspose.slides.ms.System.q1.h0(var2);
         com.aspose.slides.internal.o9b.w1 var8 = this.a6().u3();
         com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1();

         for (int var10 = 0; var10 < this.n5.length; var10++) {
            this.n5[var10].n5(var9);
            float var11 = var8.l6() - var9.l6();
            float var12 = var8.k5() - var9.k5();
            this.n5[var10] = new com.aspose.slides.internal.o9b.w1(
               (float)(var8.l6() + var11 * var4 - var12 * var6), (float)(var8.k5() + var11 * var6 + var12 * var4)
            );
         }

         this.u9();
      }
   }

   public z3y(com.aspose.slides.internal.o9b.y1 var1) {
      this.n5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      this.n5[0] = new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.t2());
      this.n5[1] = new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.t2());
      this.n5[2] = new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.l6());
      this.n5[3] = new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.l6());
      this.u9();
   }

   public z3y(com.aspose.slides.internal.o9b.y1[] var1) {
      this.n5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var1.length * 4)
      );

      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = var2 * 4;
         com.aspose.slides.internal.o9b.y1 var4 = var1[var2].y4();
         this.n5[var3 + 0] = new com.aspose.slides.internal.o9b.w1(var4.a6(), var4.t2());
         this.n5[var3 + 1] = new com.aspose.slides.internal.o9b.w1(var4.h0(), var4.t2());
         this.n5[var3 + 2] = new com.aspose.slides.internal.o9b.w1(var4.h0(), var4.l6());
         this.n5[var3 + 3] = new com.aspose.slides.internal.o9b.w1(var4.a6(), var4.l6());
      }

      this.u9();
   }

   public z3y(com.aspose.slides.internal.o9b.w1[] var1) {
      this.n5 = var1;
      this.u9();
   }

   private void u9() {
      if (this.n5.length == 0) {
         this.u3 = this.a6 = this.l6 = this.k5 = 0.0F;
      } else {
         float var1 = this.n5[0].l6();
         float var2 = this.n5[0].k5();
         float var3 = this.n5[0].l6();
         float var4 = this.n5[0].k5();

         for (int var5 = 1; var5 < this.n5.length; var5++) {
            float[] var6 = new float[]{var1};
            float[] var7 = new float[]{var2};
            float[] var8 = new float[]{var3};
            float[] var9 = new float[]{var4};
            x5h.n5(this.n5[var5].u3(), var6, var7, var8, var9);
            var1 = var6[0];
            var2 = var7[0];
            var3 = var8[0];
            var4 = var9[0];
         }

         this.u3 = var1;
         this.a6 = var2;
         this.l6 = var3 - var1;
         this.k5 = var4 - var2;
      }
   }

   public final boolean l6(com.aspose.slides.internal.o9b.w1 var1) {
      return n5(var1.u3(), this.n5);
   }

   public final boolean n5(z3y var1) {
      return n5(this.n5, var1.n5);
   }

   public final boolean l6(z3y var1) {
      for (com.aspose.slides.internal.o9b.w1 var5 : this.n5) {
         if (n5(var5.u3(), var1.n5)) {
            return false;
         }
      }

      return true;
   }

   public final boolean n5(IGenericEnumerable<z3y> var1, float var2) {
      com.aspose.slides.internal.o9b.y1 var3 = this.u3().y4();
      var3.n5(var2, var2);
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            z3y var5 = (z3y)var4.next();
            if (var3.k5(var5.u3().y4())) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return false;
   }

   private static boolean n5(com.aspose.slides.internal.o9b.w1[] var0, com.aspose.slides.internal.o9b.w1[] var1) {
      for (com.aspose.slides.internal.o9b.w1 var5 : var0) {
         if (!n5(var5.u3(), var1)) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1[] var1) {
      int var2 = var1.length;
      boolean var3 = false;
      int var4 = 0;

      for (int var5 = var2 - 1; var4 < var2; var5 = var4++) {
         if (var1[var4].k5() > var0.k5() != var1[var5].k5() > var0.k5()
            && var0.l6() < (var1[var5].l6() - var1[var4].l6()) * (var0.k5() - var1[var4].k5()) / (var1[var5].k5() - var1[var4].k5()) + var1[var4].l6()) {
            var3 = !var3;
         }
      }

      return var3;
   }
}
