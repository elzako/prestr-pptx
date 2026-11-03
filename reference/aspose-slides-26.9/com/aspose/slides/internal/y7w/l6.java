package com.aspose.slides.internal.y7w;

import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.s0;

public class l6 {
   private final int n5;
   private final int l6;
   private final int k5;
   private final x8 u3;

   public l6(int var1, int var2, int var3, x8 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final void n5(y2 var1, n5 var2) {
      int var3 = (this.n5 + this.l6 - 1) / this.l6;
      int var4 = var1.x8() / this.k5;
      int var5 = (var1.x8() + var1.l6() - 1) / this.k5;
      int var6 = var1.s7() / this.l6;
      int var7 = (var1.s7() + var1.t2() - 1) / this.l6;

      for (int var8 = var4; var8 <= var5; var8++) {
         int var9 = var8 * this.k5;
         int var10 = var8 == var4 ? var1.x8() % this.k5 : 0;
         int var11 = var8 == var5 ? var1.n5() - var9 - var10 : this.k5 - var10;
         if (var7 <= var6) {
            if (var7 == var6) {
               int var21 = var6 * this.l6;
               int var22 = var1.s7() % this.l6;
               int var23 = var1.u9() - var21 - var22;
               int var24 = var8 * var3 + var6;
               y2 var25 = new y2(var22, var10, var23, var11);
               int[] var26 = var2.n5(var24, var6, var8, var25.n3());
               if (var26 != null) {
                  var25.k5(var21, var9);
                  this.u3.n5(var25.n3(), var26, var25.a6().k5(), new j5(var25.u9(), var25.n5()));
               }
            }
         } else {
            y2 var12 = new y2(var1.s7(), var9 + var10, var1.t2(), var11);
            s0 var13 = new s0(var12.n3());

            for (int var14 = var6; var14 <= var7; var14++) {
               int var15 = var14 * this.l6;
               int var16 = var14 == var6 ? var1.s7() % this.l6 : 0;
               int var17 = var14 == var7 ? var1.u9() - var15 - var16 : this.l6 - var16;
               int var18 = var8 * var3 + var14;
               y2 var19 = new y2(var16, var10, var17, var11);
               int[] var20 = var2.n5(var18, var14, var8, var19.n3());
               if (var20 != null) {
                  var19.k5(var15, var9);
                  var13.n5(var19.n3(), var20, var19.a6().k5(), new j5(var19.u9(), var19.n5()));
               }
            }

            if (var13.n5() != null) {
               this.u3.n5(var12.n3(), var13.n5(), var12.a6().k5(), new j5(var12.u9(), var12.n5()));
            }
         }
      }
   }
}
