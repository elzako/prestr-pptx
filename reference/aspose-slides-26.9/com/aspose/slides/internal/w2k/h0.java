package com.aspose.slides.internal.w2k;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;

public class h0 extends n5 {
   protected float n5;
   private com.aspose.slides.internal.e3j.h0 l6;

   public h0(m3 var1) {
      this.n5 = var1.t9() * (var1.q0() / 2.0F);
      this.l6 = com.aspose.slides.internal.e3j.h0.n5(this.n5, var1.t4().t2());
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.a6 var1, com.aspose.slides.internal.k3w.h0 var2, w1 var3, com.aspose.slides.internal.z3o.a6 var4, boolean var5) {
      this.n5(var1, var1.h0(), var2, var3, var4, var5);
   }

   private void n5(
      com.aspose.slides.internal.k3w.a6 var1,
      com.aspose.slides.internal.k3w.u9 var2,
      com.aspose.slides.internal.k3w.h0 var3,
      w1 var4,
      com.aspose.slides.internal.z3o.a6 var5,
      boolean var6
   ) {
      float var7 = var2.u9.l6();
      float var8 = var2.u9.k5();
      float var9 = var4.l6();
      float var10 = var4.k5();
      float var11 = var2.a6.l6();
      float var12 = var2.a6.k5();
      com.aspose.slides.internal.z3o.a6 var13 = var3.u3;
      if (this.n5(var1, var3, var6)) {
         w1[] var14 = this.n5(var11, var12, var7, var8, var9, var10, var13.n5, var13.l6, var5.n5, var5.l6, this.n5);
         if (com.aspose.slides.internal.e3j.u9.n5(var14[0]) && com.aspose.slides.internal.e3j.u9.n5(var14[1])) {
            var3.t2 = var14[0];
            var3.s7 = var14[1];
         }
      }

      if (this.l6(var1, var3, var6)) {
         w1[] var15 = this.n5(var11, var12, var7, var8, var9, var10, var13.k5, var13.u3, var5.k5, var5.u3, this.n5);
         if (com.aspose.slides.internal.e3j.u9.n5(var15[0]) && com.aspose.slides.internal.e3j.u9.n5(var15[1])) {
            var3.x8 = var15[0];
            var3.n3 = var15[1];
         }
      }
   }

   protected boolean n5(com.aspose.slides.internal.k3w.a6 var1, com.aspose.slides.internal.k3w.h0 var2, boolean var3) {
      return var2.n5.k5() ? false : !var1.a6() || this.n5(var2.h0, var3);
   }

   protected boolean l6(com.aspose.slides.internal.k3w.a6 var1, com.aspose.slides.internal.k3w.h0 var2, boolean var3) {
      return var2.n5.k5() ? true : !var1.a6() || this.n5(var2.c8, var3);
   }

   protected w1[] n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11) {
      w1 var12 = this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      w1 var13 = var12;
      w1 var14 = var12;
      if (com.aspose.slides.internal.e3j.u9.n5(var12)) {
         w1 var15 = new w1(var1, var2);
         float var16 = (float)com.aspose.slides.internal.e3j.u9.n5(var15, var12);
         if (var11 < var16) {
            var13 = this.n5(var15, var12, var16, var7, var8);
            if (var13 == null) {
               var13 = new w1(var1 + var7, var2 + var8);
            }

            var14 = this.n5(var15, var12, var16, var9, var10);
            if (var14 == null) {
               var14 = new w1(var1 + var9, var2 + var10);
            }
         }
      }

      return new w1[]{var13, var14};
   }

   private w1 n5(w1 var1, w1 var2, float var3, float var4, float var5) {
      w1 var6 = new w1(var2.l6() - var1.l6(), var2.k5() - var1.k5());
      w1[] var7 = this.l6.n5(new com.aspose.slides.internal.e3j.u3(new w1(var4, var5), var6));
      if (var7 != null) {
         w1 var8 = com.aspose.slides.internal.e3j.u9.n5(var7[0], var6) < com.aspose.slides.internal.e3j.u9.n5(var7[1], var6) ? var7[0] : var7[1];
         var8.n5(var8.l6() + var1.l6());
         var8.l6(var8.k5() + var1.k5());
         if (com.aspose.slides.internal.e3j.u9.n5(var1, var8) > var3) {
            var8 = var2;
         }

         return var8;
      } else {
         return null;
      }
   }
}
