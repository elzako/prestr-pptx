package com.aspose.slides.internal.v1y;

import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;
import java.util.List;

abstract class l6<TCtx extends u9> extends n5<TCtx> {
   protected final com.aspose.slides.internal.x4g.u9 u3;

   protected l6(com.aspose.slides.internal.t9z.h0 var1, com.aspose.slides.internal.x4g.u9 var2) {
      super(var1);
      this.u3 = var2;
   }

   protected float l6() {
      return this.n5.l6() * this.u3.t2();
   }

   protected abstract com.aspose.slides.internal.x4g.s7 k5();

   protected abstract TCtx u3();

   protected TCtx a6() {
      u9 var1 = this.u3();
      var1.n3 = (com.aspose.slides.internal.x4g.s7)this.k5().deepClone();
      var1.n3.y4();
      this.h0(var1);
      float var2 = this.c8(var1);
      var1.n5 = -var2;
      float var3 = this.u9();
      var1.l6 = var2 * this.l6.q0() * var3;
      float var4 = this.l6();
      if (var4 >= this.n5.u3()) {
         var3 = 2.0F * var3;
      }

      var1.t4 = var3;
      return (TCtx)var1;
   }

   protected float u9() {
      float var1 = this.u3.t2();
      if (var1 <= 0.0F) {
         var1 = 1.0F;
      }

      return var1;
   }

   private float h0() {
      float var1 = this.u9();
      return this.u3.c8() * this.l6.q0() * var1;
   }

   protected void n5(TCtx var1, float var2, float var3) {
      var1.a6 = var2;
      var1.u9 = var3;
      if (!var1.x8 && var1.l6 != 0.0F) {
         double var4 = com.aspose.slides.internal.e3j.u9.k5(var1.k5, var1.u3, var2, var3);
         if (var4 > var1.l6) {
            var1.x8 = true;
         }
      }
   }

   protected boolean n5(TCtx var1) {
      return true;
   }

   protected void l6(TCtx var1) {
      this.u9((TCtx)var1);
      w1 var2 = new w1(var1.k5, var1.u3);
      float var3 = this.h0();
      if (var3 != 0.0F && this.n5((TCtx)var1)) {
         if (var1.q0 == null) {
            Iterator var4 = var1.t2.u9();
            if (var4.hasNext()) {
               com.aspose.slides.internal.v9l.l6 var5 = (com.aspose.slides.internal.v9l.l6)var4.next();
               w1 var6 = var5.u3();
               var2 = this.n5(var3, var2, var6, var4);
            }
         } else {
            var2 = this.n5(var3, var2, var1.q0, null);
         }
      }

      var1.t2.n5(com.aspose.slides.internal.v9l.l6.n5(var2.l6(), var2.k5()));
   }

   private void u9(TCtx var1) {
      Iterator var2 = var1.t2.u9();
      if (var2.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var3 = (com.aspose.slides.internal.v9l.l6)var2.next();
         w1 var4 = var3.u3();
         float[] var5 = this.k5.n5(var1.k5, var1.u3, var4.l6(), var4.k5());
         var1.c8 = new w1(var5[0], var5[1]);
      }
   }

   private w1 n5(float var1, w1 var2, w1 var3, Iterator<com.aspose.slides.internal.v9l.l6> var4) {
      w1 var5 = com.aspose.slides.internal.e3j.u9.n5(new com.aspose.slides.internal.e3j.u3(var2, var3), var2, var3, var1);
      if (var1 > 0.0F && var1 >= com.aspose.slides.internal.e3j.u9.n5(var2, var3) && var4 != null) {
         var4.remove();
      }

      return var5;
   }

   protected abstract void k5(TCtx var1);

   protected final void u3(TCtx var1) {
   }

   protected final void a6(TCtx var1) {
   }

   private void h0(u9 var1) {
      a6 var2 = new a6();
      com.aspose.slides.internal.t9z.u3.n5(var1.n3, var2);
      var1.y4 = var2.k5();
      var1.e2 = var2.u3();
      var1.t9 = var2.a6();
   }

   private float c8(u9 var1) {
      com.aspose.slides.internal.e3j.u3 var2 = new com.aspose.slides.internal.e3j.u3(new w1(0.0F, 0.0F), new w1(0.0F, 1.0F));
      float var3 = 0.0F;

      for (int var4 = 0; var4 < var1.e2.size(); var4++) {
         List var5 = var1.e2.get(var4);

         for (Object recoveredElement$var7$3689 : var5) {
            com.aspose.slides.internal.e3j.a6 var7 = (com.aspose.slides.internal.e3j.a6)recoveredElement$var7$3689;
            com.aspose.slides.internal.e3j.u3 var8 = new com.aspose.slides.internal.e3j.u3(var7.n5(), var7.l6());
            w1 var9 = var2.n5(var8);
            if (var9 != null && com.aspose.slides.internal.e3j.u9.n5(var9) && var9.k5() < var3 && var7.l6(var9, 0.01F)) {
               var3 = var9.k5();
               var1.z1 = var1.t9.get(0);
            }
         }

         if (var4 > 0) {
            List var12 = var1.e2.get(var4 - 1);
            if (!var12.isEmpty() && !var5.isEmpty()) {
               com.aspose.slides.internal.e3j.a6 var13 = (com.aspose.slides.internal.e3j.a6)var12.get(var12.size() - 1);
               com.aspose.slides.internal.e3j.a6 var14 = (com.aspose.slides.internal.e3j.a6)var5.get(0);
               com.aspose.slides.internal.e3j.a6 var15 = new com.aspose.slides.internal.e3j.a6(var13.l6(), var14.n5());
               com.aspose.slides.internal.e3j.u3 var10 = new com.aspose.slides.internal.e3j.u3(var15.n5(), var15.l6());
               w1 var11 = var2.n5(var10);
               if (var11 != null && com.aspose.slides.internal.e3j.u9.n5(var11) && var11.k5() < var3 && var15.l6(var11, 0.01F)) {
                  var3 = var11.k5();
                  var1.z1 = false;
               }
            }
         }
      }

      return Math.abs(var3);
   }

   protected w1 n5(u9 var1, float var2, float var3, w1 var4) {
      float var5 = var1.k5;
      float var6 = var1.u3;
      float[] var7 = this.k5.n5(var5, var6, var2, var3);
      com.aspose.slides.internal.x7u.u9 var8 = com.aspose.slides.internal.x7u.h0.n5(this.n5);
      com.aspose.slides.internal.z3o.a6 var9 = var8.l6(var7[0], var7[1]);
      float var10 = -var9.n5 * var1.t4;
      float var11 = -var9.l6 * var1.t4;
      return new w1(this.n5(var5, var10, var11, var4.l6(), var4.k5()), this.l6(var6, var10, var11, var4.l6(), var4.k5()));
   }

   private float n5(float var1, float var2, float var3, float var4, float var5) {
      return var1 + var4 * var2 - var5 * var3;
   }

   private float l6(float var1, float var2, float var3, float var4, float var5) {
      return var1 + var4 * var3 + var5 * var2;
   }

   protected float n5(u9 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.e3j.u3 var6 = new com.aspose.slides.internal.e3j.u3(new w1(var2, var3), new w1(var4, var5));
      com.aspose.slides.internal.e3j.a6 var7 = new com.aspose.slides.internal.e3j.a6(var2, var3, var4, var5);
      double var8 = var1.k5;
      double var10 = var1.u3;
      double var12 = var1.l6;
      if (var6.n5()) {
         double var38 = 1.0;
         double var39 = -2.0 * var10;
         double var40 = var10 * var10 + (double)var4 * var4 - 2.0 * var4 * var8 + var8 * var8 - var12 * var12;
         double[] var20 = com.aspose.slides.internal.e3j.u9.n5(var38, var39, var40);
         if (var20 == null) {
            return 0.0F;
         } else {
            double var21 = var20[0];
            if (var7.l6(new w1((float)var4, (float)var21), 0.01F)) {
               var1.q0 = new w1((float)var4, (float)var21);
               return com.aspose.slides.internal.e3j.u9.l6((float)(var4 - var8), (float)(var5 - var10), (float)(var4 - var8), (float)(var21 - var10));
            } else if (var20.length < 2) {
               return 0.0F;
            } else {
               var21 = var20[1];
               if (var7.l6(new w1((float)var4, (float)var21), 0.01F)) {
                  var1.q0 = new w1((float)var4, (float)var21);
                  return com.aspose.slides.internal.e3j.u9.l6((float)(var4 - var8), (float)(var5 - var10), (float)(var4 - var8), (float)(var21 - var10));
               } else {
                  return 0.0F;
               }
            }
         }
      } else {
         double var14 = -var6.n5 / var6.l6;
         double var16 = -var6.k5 / var6.l6;
         double var18 = var16 - var10;
         double var23 = 1.0 + var14 * var14;
         double var25 = 2.0 * var14 * var18 - 2.0 * var8;
         double var27 = var8 * var8 + var18 * var18 - var12 * var12;
         double[] var29 = com.aspose.slides.internal.e3j.u9.n5(var23, var25, var27);
         if (var29 == null) {
            return 0.0F;
         } else {
            double var30 = var29[0];
            double var32 = var6.n5((float)var30);
            if (var7.l6(new w1((float)var30, (float)var32), 0.01F)) {
               var1.q0 = new w1((float)var30, (float)var32);
               return com.aspose.slides.internal.e3j.u9.l6((float)(var4 - var8), (float)(var5 - var10), (float)(var30 - var8), (float)(var32 - var10));
            } else if (var29.length < 2) {
               return 0.0F;
            } else {
               double var34 = var29[1];
               double var36 = var6.n5((float)var34);
               if (var7.l6(new w1((float)var34, (float)var36), 0.01F)) {
                  var1.q0 = new w1((float)var34, (float)var36);
                  return com.aspose.slides.internal.e3j.u9.l6((float)(var4 - var8), (float)(var5 - var10), (float)(var34 - var8), (float)(var36 - var10));
               } else {
                  return 0.0F;
               }
            }
         }
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected void a6(k5 bridgeArg0) {
      this.l6((TCtx)bridgeArg0);
   }


   // $VF: synthetic method
   @Override
   protected void u3(k5 var1) {
      this.a6((TCtx)var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected void k5(k5 bridgeArg0) {
      this.u3((TCtx)bridgeArg0);
   }


   // $VF: synthetic method
   @Override
   protected void l6(k5 var1) {
      this.k5((TCtx)var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected TCtx n5() {
      return this.a6();
   }


   @Override
   protected void n5(k5 recoveredArg, float a, float b) {
      this.n5((TCtx)recoveredArg, a, b);
   }
}
