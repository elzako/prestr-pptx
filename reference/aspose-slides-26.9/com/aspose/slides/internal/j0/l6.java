package com.aspose.slides.internal.j0;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.internal.v2.u9;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.ms.System.d1;

public abstract class l6 implements e2 {
   private s7 n5;
   private com.aspose.slides.internal.v2.k5 l6;
   private com.aspose.slides.internal.v2.n5 k5;
   private com.aspose.slides.internal.v2.n5 u3;
   private int a6;
   private int u9;

   public l6(com.aspose.slides.internal.v2.s7 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, x8.class)) {
         this.n5 = new s7((x8)var1);
         x8 var2 = (x8)this.n5.t2();
         var2.l6(c8.g2x, c8.m0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.k5.class)) {
         this.l6 = (com.aspose.slides.internal.v2.k5)var1;
      }

      this.a6 = -1;
      this.u9 = -1;
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5 != null ? this.n5.t2() : this.l6;
   }

   public final com.aspose.slides.internal.v2.k5 h0() {
      return this.n5 != null ? this.n5.l6() : this.l6;
   }

   public static l6 n5(com.aspose.slides.internal.v2.s7 var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, u9.class)) {
         var0 = ((u9)var0).k5();
      }

      com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)var0;
      int var2 = var1.t2(c8.o4);
      switch (var2) {
         case 0:
            return new u3(var1);
         case 1:
         default:
            String var3 = d1.n5("Unknown function type {0}", new Object[]{var2});
            throw new IOException(var3);
         case 2:
            return new n5(var1);
         case 3:
            return new a6(var1);
         case 4:
            return new k5(var1);
      }
   }

   protected final float n5(float var1, float var2, float var3) {
      if (var1 < var2) {
         return var2;
      } else {
         return var1 > var3 ? var3 : var1;
      }
   }

   protected final float n5(float var1, float var2, float var3, float var4, float var5) {
      return var4 + (var1 - var2) * (var5 - var4) / (var3 - var2);
   }

   public final com.aspose.slides.internal.e6.l6 n5(int var1) {
      com.aspose.slides.internal.v2.n5 var2 = this.n3();
      return new com.aspose.slides.internal.e6.l6(var2, var1);
   }

   protected final s7 c8() {
      return this.n5;
   }

   private com.aspose.slides.internal.v2.n5 n5() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.k5 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.w9);
      }

      return this.k5;
   }

   public final com.aspose.slides.internal.e6.l6 l6(int var1) {
      com.aspose.slides.internal.v2.n5 var2 = this.n5();
      return new com.aspose.slides.internal.e6.l6(var2, var1);
   }

   public final int s7() {
      if (this.a6 == -1) {
         com.aspose.slides.internal.v2.n5 var1 = this.n5();
         this.a6 = var1.n5() / 2;
      }

      return this.a6;
   }

   public final int x8() {
      if (this.u9 == -1) {
         com.aspose.slides.internal.v2.n5 var1 = this.n3();
         this.u9 = var1.n5() / 2;
      }

      return this.u9;
   }

   protected final com.aspose.slides.internal.v2.n5 n3() {
      if (this.u3 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.u3 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.p4l);
      }

      return this.u3;
   }

   protected final float[] l6(float[] var1) {
      com.aspose.slides.internal.v2.n5 var2 = this.n3();
      float[] var5;
      if (var2 != null) {
         float[] var3 = var2.l6();
         int var4 = var3.length / 2;
         var5 = new float[var4];

         for (int var6 = 0; var6 < var4; var6++) {
            int var7 = var6 << 1;
            var5[var6] = this.n5(var1[var6], var3[var7], var3[var7 + 1]);
         }
      } else {
         var5 = var1;
      }

      return var5;
   }

   public final com.aspose.slides.internal.v2.n5 n5(com.aspose.slides.internal.v2.n5 var1) {
      float[] var2 = this.n5(var1.l6());
      com.aspose.slides.internal.v2.n5 var3 = new com.aspose.slides.internal.v2.n5();
      var3.n5(var2);
      return var3;
   }

   public abstract float[] n5(float[] var1);
}
