package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;

public class u9 extends l6<com.aspose.slides.internal.w4c.k5> {
   public u9(m3 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.k5 var3) {
      w1 var4 = new w1(var1, var2);
      com.aspose.slides.internal.e3j.u3 var5 = com.aspose.slides.internal.e3j.u3.n5(var3.e2, var4);
      w1 var6 = var5.n5(var3.u9);
      if (var6 == null) {
         return null;
      }

      double var7 = com.aspose.slides.internal.e3j.u9.n5(var6, var3.n5) / var3.t2;
      w1 var9 = var5.n5(var3.n3);
      w1 var10 = var5.n5(var3.y4);
      if (var9 != null && var10 != null) {
         double var11 = 1.0 - com.aspose.slides.internal.e3j.u9.n5(var9, var4) / com.aspose.slides.internal.e3j.u9.n5(var9, var10);
         double var13 = 1.0 - var11;

         for (int var15 = this.k5.length - 1; var15 > 0; var15--) {
            float var16 = this.l6[var15 - 1];
            float var17 = this.l6[var15];
            float var18 = this.k5[var15 - 1];
            float var19 = this.k5[var15];
            if (var18 > var19) {
               float var20 = var16;
               var16 = var17;
               var17 = var20;
               var20 = var18;
               var18 = var19;
               var19 = var20;
            }

            if (var18 <= var7 && var7 <= var19) {
               com.aspose.slides.internal.o9b.c8 var24 = this.l6(var7, this.n5.t2(), var18, var19, var16, var17);
               com.aspose.slides.internal.o9b.c8 var21 = this.n5(var7, var3.u3, var18, var19, var16, var17);
               var21 = this.n5(var21, var11);
               com.aspose.slides.internal.o9b.c8 var22 = this.n5(var7, var3.a6, var18, var19, var16, var17);
               var22 = this.n5(var22, var13);
               return this.n5(
                  255,
                  (var24.x8() & 255) + (var21.x8() & 255) + (var22.x8() & 255),
                  (var24.n3() & 255) + (var21.n3() & 255) + (var22.n3() & 255),
                  (var24.y4() & 255) + (var21.y4() & 255) + (var22.y4() & 255)
               );
            }
         }

         return com.aspose.slides.internal.o9b.c8.n5(0);
      } else {
         return null;
      }
   }
}
