package com.aspose.slides.internal.v1y;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;

abstract class n5<TCtx extends k5> implements u3 {
   protected final com.aspose.slides.internal.t9z.h0 n5;
   protected final m3 l6;
   protected final com.aspose.slides.internal.z3o.h0 k5;

   protected n5(com.aspose.slides.internal.t9z.h0 var1) {
      this.n5 = var1;
      this.l6 = var1.n5();
      this.k5 = new com.aspose.slides.internal.z3o.h0();
   }

   @Override
   public u3$n5 n5(com.aspose.slides.internal.v9l.k5 var1) {
      k5 var2 = this.n5();
      Iterator var3 = var1.u9();

      while (var3.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var4 = (com.aspose.slides.internal.v9l.l6)var3.next();
         if (var2.x8) {
            var2.t2.l6(var4);
         } else {
            var2.h0 = var4.k5();
            switch (var4.l6()) {
               case 2:
                  this.n5((TCtx)var2);
               case 3:
               case 5:
               case 7:
               case 9:
               default:
                  break;
               case 4:
                  this.l6((TCtx)var2);
                  break;
               case 6:
                  this.k5((TCtx)var2);
                  break;
               case 8:
                  this.u3((TCtx)var2);
                  break;
               case 10:
                  var2.x8 = true;
            }
         }
      }

      this.a6((TCtx)var2);
      return this.u9((TCtx)var2);
   }

   protected abstract TCtx n5();

   private u3$n5 u9(TCtx var1) {
      u3$n5 var2 = new u3$n5();
      var2.n5 = var1.t2;
      var2.l6 = var1.s7;
      var2.k5 = new w1(var1.k5, var1.u3);
      var2.u3 = var1.c8;
      return var2;
   }

   protected void n5(k5 var1) {
      var1.k5 = var1.h0[0];
      var1.u3 = var1.h0[1];
      this.n5((TCtx)var1, var1.h0[0], var1.h0[1]);
   }

   protected abstract void l6(k5 var1);

   protected abstract void k5(k5 var1);

   protected abstract void u3(k5 var1);

   protected void a6(k5 var1) {
   }

   protected void n5(k5 var1, float var2, float var3) {
      var1.a6 = var2;
      var1.u9 = var3;
   }

   protected w1 n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      w1[] var8 = com.aspose.slides.internal.e3j.u9.n5(var1, var2, var3, var4, var5, var6, var7);
      if (var8.length == 1) {
         return var8[0];
      }

      double var9 = com.aspose.slides.internal.e3j.u9.k5(var8[0].l6(), var8[0].k5(), var6, var7);
      double var11 = com.aspose.slides.internal.e3j.u9.k5(var8[1].l6(), var8[1].k5(), var6, var7);
      return var9 < var11 ? var8[0] : var8[1];
   }

   protected float n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = 0.0F;
      float var11 = 1.0F;

      while (true) {
         float var12 = (var10 + var11) / 2.0F;
         if (Math.abs(var10 - var11) < 0.01F) {
            return var12;
         }

         w1 var13 = com.aspose.slides.internal.e3j.u9.l6(var12, var4, var5, var6, var7, var8, var9);
         double var14 = com.aspose.slides.internal.e3j.u9.k5(var2, var3, var13.l6(), var13.k5());
         if (Math.abs(var14 - var1) < 0.01F) {
            return var12;
         }

         if (var14 < var1) {
            var10 = var12;
         } else {
            var11 = var12;
         }
      }
   }

   protected float n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11) {
      float var12 = 0.1F;
      float var13 = 1.0F;

      float var14;
      for (var14 = 0.0F; var14 <= 1.0F - var12; var14 += var12) {
         var13 = var14 + var12;
         w1 var15 = com.aspose.slides.internal.e3j.u9.n5(var13, var4, var5, var6, var7, var8, var9, var10, var11);
         double var16 = com.aspose.slides.internal.e3j.u9.k5(var2, var3, var15.l6(), var15.k5());
         if (var16 >= var1) {
            break;
         }
      }

      while (true) {
         float var21 = (var14 + var13) / 2.0F;
         if (Math.abs(var14 - var13) < 0.01F) {
            return var21;
         }

         w1 var18 = com.aspose.slides.internal.e3j.u9.n5(var21, var4, var5, var6, var7, var8, var9, var10, var11);
         double var19 = com.aspose.slides.internal.e3j.u9.k5(var2, var3, var18.l6(), var18.k5());
         if (Math.abs(var19 - var1) < 0.01F) {
            return var21;
         }

         if (var19 < var1) {
            var14 = var21;
         } else {
            var13 = var21;
         }
      }
   }
}
