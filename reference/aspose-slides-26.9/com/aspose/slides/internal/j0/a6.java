package com.aspose.slides.internal.j0;

import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.s7;

public class a6 extends l6 {
   private com.aspose.slides.internal.v2.n5 n5;
   private com.aspose.slides.internal.v2.n5 l6;
   private com.aspose.slides.internal.v2.n5 k5;

   public a6(s7 var1) {
      super(var1);
   }

   @Override
   public float[] n5(float[] var1) {
      l6 var2 = null;
      float var3 = var1[0];
      com.aspose.slides.internal.e6.l6 var4 = this.l6(0);
      float var5 = var4.n5();
      float var6 = var4.l6();
      var3 = this.n5(var3, var5, var6);
      com.aspose.slides.internal.v2.n5 var7 = this.n5();
      int var8 = var7.n5();
      if (var8 == 1) {
         s7 var9 = var7.k5(0);
         var2 = com.aspose.slides.internal.j0.l6.n5(var9);
         com.aspose.slides.internal.e6.l6 var10 = this.k5(0);
         float var11 = var10.n5();
         float var12 = var10.l6();
         var3 = this.n5(var3, var5, var6, var11, var12);
      } else {
         com.aspose.slides.internal.v2.n5 var20 = this.l6();
         float[] var22 = var20.l6();
         int var24 = var22.length;
         float[] var25 = new float[var24 + 2];
         int var13 = var25.length;
         var25[0] = var4.n5();
         var25[var13 - 1] = var4.l6();
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var22)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var25)), 1, var24);

         for (int var14 = 0; var14 < var13 - 1; var14++) {
            if (var3 >= var25[var14] && (var3 < var25[var14 + 1] || var14 == var13 - 2 && var3 == var25[var14 + 1])) {
               s7 var15 = var7.k5(var14);
               var2 = com.aspose.slides.internal.j0.l6.n5(var15);
               com.aspose.slides.internal.e6.l6 var16 = this.k5(var14);
               float var17 = var16.n5();
               float var18 = var16.l6();
               var3 = this.n5(var3, var25[var14], var25[var14 + 1], var17, var18);
               break;
            }
         }
      }

      float[] var21 = new float[]{var3};
      float[] var23 = var2.n5(var21);
      return this.l6(var23);
   }

   public final com.aspose.slides.internal.v2.n5 n5() {
      if (this.n5 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.n5 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.k1);
      }

      return this.n5;
   }

   public final com.aspose.slides.internal.v2.n5 l6() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.k5 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.o0);
      }

      return this.k5;
   }

   public final com.aspose.slides.internal.v2.n5 k5() {
      if (this.l6 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.l6 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.x0);
      }

      return this.l6;
   }

   private com.aspose.slides.internal.e6.l6 k5(int var1) {
      com.aspose.slides.internal.v2.n5 var2 = this.k5();
      return new com.aspose.slides.internal.e6.l6(var2, var1);
   }
}
