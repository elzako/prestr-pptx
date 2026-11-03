package com.aspose.slides.internal.w9c;

import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;

public abstract class a6 extends l6 {
   protected w1 n5;
   protected w1 l6;
   protected w1 k5;
   protected w1 u3;
   protected l6$n5 a6;
   protected l6$n5 e2;

   protected a6(float var1, com.aspose.slides.internal.e6q.u3 var2, w1 var3, w1 var4, w1 var5, w1 var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   protected void n5(w1 var1, w1 var2) {
      float var3 = 1.5F * this.u9;
      float var4 = var3 / 2.0F;
      float var5 = Math.abs(var1.k5() - var2.k5());
      float var6 = Math.abs(var1.l6() - var2.l6());
      float var7 = (float)Math.sqrt(var6 * var6 + var5 * var5);
      float var8 = var5 / var7;
      float var9 = var6 / var7;
      float var10 = var4 * var8;
      float var11 = var4 * var9;
      float var12 = var2.l6();
      float var13 = var2.k5();
      float var14 = var1.l6() < var2.l6() ? var12 - var11 : var12 + var11;
      float var15 = var1.k5() < var2.k5() ? var13 - var10 : var13 + var10;
      float var16 = var1.l6() < var2.l6() ? var12 + var11 : var12 - var11;
      float var17 = var1.k5() < var2.k5() ? var13 + var10 : var13 - var10;
      w1 var18 = new w1(var12 - var14, var13 - var15);
      w1 var19 = var18.k5() == 0.0F ? new w1(-var18.k5() / var18.l6(), 1.0F) : new w1(1.0F, -var18.l6() / var18.k5());
      var19 = n5(var19, var4);
      float var20 = Math.abs(var19.l6());
      float var21 = Math.abs(var19.k5());
      if (var18.l6() > 0.0F) {
         if (var18.k5() > 0.0F) {
            this.n5 = new w1(var14 - var20, var15 + var21);
            this.l6 = new w1(var16 - var20, var17 + var21);
            this.k5 = new w1(var14 + var20, var15 - var21);
            this.u3 = new w1(var16 + var20, var17 - var21);
         } else {
            this.n5 = new w1(var14 + var20, var15 + var21);
            this.l6 = new w1(var16 + var20, var17 + var21);
            this.k5 = new w1(var14 - var20, var15 - var21);
            this.u3 = new w1(var16 - var20, var17 - var21);
         }
      } else if (var18.k5() > 0.0F) {
         this.n5 = new w1(var14 - var20, var15 - var21);
         this.l6 = new w1(var16 - var20, var17 - var21);
         this.k5 = new w1(var14 + var20, var15 + var21);
         this.u3 = new w1(var16 + var20, var17 + var21);
      } else {
         this.n5 = new w1(var14 + var20, var15 - var21);
         this.l6 = new w1(var16 + var20, var17 - var21);
         this.k5 = new w1(var14 - var20, var15 + var21);
         this.u3 = new w1(var16 - var20, var17 + var21);
      }
   }

   protected l6$n5 n5(Iterator<com.aspose.slides.internal.e6q.u9> var1) {
      return this.n5(this.n5, this.k5, var1);
   }
}
