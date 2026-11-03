package com.aspose.slides.internal.w9c;

import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;

public abstract class u3 extends l6 {
   protected w1 n5;
   protected w1 l6;
   protected l6$n5 k5;
   protected l6$n5 u3;

   protected u3(float var1, com.aspose.slides.internal.e6q.u3 var2, w1 var3, w1 var4, w1 var5, w1 var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   protected void n5(w1 var1, w1 var2) {
      float var3 = this.u9;
      float var4 = var2.l6();
      float var5 = var2.k5();
      float var6 = var5 - var3;
      this.l6 = new w1(var4, var5);
      this.n5 = new w1(var4, var6);
   }

   @Override
   public void n5() {
      float var1 = 0.5522848F;
      float var2 = this.u9;
      float var3 = var2 * var1;
      float var4 = this.n5.l6();
      float var5 = this.n5.k5();
      this.h0.k5(var4, var5);
      this.h0.n5(var4, var5, var4 + var3, var5, var4 + var2, var5 + var2 - var3, var4 + var2, var5 + var2);
      this.h0.n5(var4 + var2, var5 + var2, var4 + var2, var5 + var2 + var3, var4 + var3, var5 + 2.0F * var2, var4, var5 + 2.0F * var2);
      this.h0.n5(var4, var5 + 2.0F * var2, var4 - var3, var5 + 2.0F * var2, var4 - var2, var5 + var2 + var3, var4 - var2, var5 + var2);
      this.h0.n5(var4 - var2, var5 + var2, var4 - var2, var5 + var2 - var3, var4 - var3, var5, var4, var5);
   }

   protected l6$n5 n5(Iterator<com.aspose.slides.internal.e6q.u9> var1) {
      w1 var2 = null;
      int var3 = 0;
      w1 var4 = null;

      while (var2 == null && var1.hasNext()) {
         var3++;
         com.aspose.slides.internal.e6q.u9 var5 = (com.aspose.slides.internal.e6q.u9)var1.next();
         w1 var6 = var5.l6();
         if (var4 != null) {
            w1[] var7 = n5(var4, var6, this.l6, this.u9);
            if (var7.length > 0) {
               var2 = var7[var7.length - 1];
               if (Float.isNaN(var2.l6()) || Float.isNaN(var2.l6())) {
                  var2 = null;
               }
            }
         }

         var4 = var6;
      }

      return new l6$n5(var2, var2 == null ? var3 : var3 - 1);
   }

   private static w1[] n5(w1 var0, w1 var1, w1 var2, float var3) {
      float var4 = var1.l6() - var0.l6();
      float var5 = var1.k5() - var0.k5();
      float var6 = var2.l6() - var0.l6();
      float var7 = var2.k5() - var0.k5();
      float var8 = var4 * var4 + var5 * var5;
      float var9 = var4 * var6 + var5 * var7;
      float var10 = var6 * var6 + var7 * var7 - var3 * var3;
      float var11 = var9 / var8;
      float var12 = var10 / var8;
      float var13 = var11 * var11 - var12;
      if (var13 < 0.0F) {
         return new w1[0];
      }

      float var14 = (float)Math.sqrt(var13);
      float var15 = -var11 + var14;
      float var16 = -var11 - var14;
      w1 var17 = new w1(var0.l6() - var4 * var15, var0.k5() - var5 * var15);
      if (var13 == 0.0F) {
         return new w1[]{var17};
      }

      w1 var18 = new w1(var0.l6() - var4 * var16, var0.k5() - var5 * var16);
      return new w1[]{var17, var18};
   }
}
