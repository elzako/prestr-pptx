package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class m8i {
   private IInnerShadowEffectiveData n5;
   private final float l6 = 116.0F;
   private final float k5 = 3.0F;
   private final int u3 = 4;

   public m8i(IInnerShadowEffectiveData var1) {
      this.n5 = var1;
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, TextParam var3) {
      if (var2 == null) {
         throw new ArgumentNullException("graphicsPath is null");
      }

      if (var2.h0() != 0) {
         a1v var4 = var3.u3();
         if (var4 != null && var4.u3() != 0) {
            com.aspose.slides.internal.x4g.s7 var5 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
            com.aspose.slides.internal.o9b.y1 var6 = var5.s7().y4();
            float var7 = (float)this.n5.getBlurRadius();
            float var8 = var7 / 3.0F * var3.t4() / 116.0F;
            int var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6.s7() / (var6.k5() + var6.s7()) * var8)), 14) + 2;
            int var10 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6.k5() / (var6.k5() + var6.s7()) * var8)), 14) + 2;
            com.aspose.slides.internal.x4g.s7 var11 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
            com.aspose.slides.internal.x4g.m1 var12 = this.n5(var6.y4(), var3.t4());
            var11.l6(var12);
            com.aspose.slides.internal.x4g.m1 var13 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var6.x8() + var9, -var6.n3() + var10);
            var11.l6(var13);
            var5.l6(var13);
            int var14 = com.aspose.slides.internal.v6g.k5.u3(var6.s7() + 2 * var9, 13);
            int var15 = com.aspose.slides.internal.v6g.k5.u3(var6.k5() + 2 * var10, 13);
            com.aspose.slides.internal.o9b.l6 var16 = new com.aspose.slides.internal.o9b.l6(var14, var15, 2498570);

            try {
               if (var1.y1() != null) {
                  var16.n5(var1.y1().y4(), var1.y1().c8());
               }

               com.aspose.slides.internal.o9b.z1 var17 = n2d.n5(var16, var1);

               try {
                  var17.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
                  if (var4 != null && var4.u3() != 0) {
                     var17.n5(new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(var4.n5().s7() & 255, 255, 0, 0).o8()), var11);
                  }
               } finally {
                  if (var17 != null) {
                     var17.dispose();
                  }
               }

               com.aspose.slides.internal.o9b.c8 var18 = ((d8f)this.n5).l6().o8();
               if (var4.u3() == 1 && (var4.n5().s7() & 255) != 255) {
                  int var19 = com.aspose.slides.internal.v6g.k5.u3((var18.s7() & 0xFF) * ((var4.n5().s7() & 0xFF) / 255.0F), 13);
                  com.aspose.slides.internal.o9b.c8.n5(var19, var18.o8()).n5(var18);
               }

               this.n5(var16, var18.o8());
               x9p.n5(var16, var8, 3, 3);
               com.aspose.slides.internal.o9b.l6 var56 = new com.aspose.slides.internal.o9b.l6(var14, var15, var16.s7());

               try {
                  com.aspose.slides.internal.o9b.z1 var57 = n2d.n5(var56, var1);

                  try {
                     var57.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
                     com.aspose.slides.internal.o9b.u6 var20 = new com.aspose.slides.internal.o9b.u6(var16);

                     try {
                        var57.n5(var20, var5);
                     } finally {
                        if (var20 != null) {
                           var20.dispose();
                        }
                     }

                     float var21 = var6.x8() - var9;
                     float var22 = var6.n3() - var10;
                     var1.n5(var56, var21, var22, var56.e2(), var56.h0());
                  } finally {
                     if (var57 != null) {
                        var57.dispose();
                     }
                  }
               } finally {
                  if (var56 != null) {
                     var56.dispose();
                  }
               }
            } finally {
               if (var16 != null) {
                  var16.dispose();
               }
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.c8 var2) {
      byte[] var3 = n2d.n5(var1);
      byte var4 = var2.s7();
      byte var5 = var2.x8();
      byte var6 = var2.n3();
      byte var7 = var2.y4();
      float var8 = (255 - (var2.s7() & 255)) / 255.0F;
      float var9 = 1.0F - var8;
      int var10 = 0;

      while (var10 < var3.length) {
         int var11 = var10++;
         int var12 = var10++;
         int var13 = var10++;
         int var14 = var10++;
         byte var15 = var3[var13];
         if ((var15 & 255) != 0) {
            byte var16 = var3[var14];
            if ((var15 & 255) == 255) {
               if ((var16 & 255) == 255) {
                  var3[var14] = 0;
               } else {
                  var3[var14] = com.aspose.slides.internal.v6g.k5.n5((Object)((255 - (var16 & 255)) * var9), 13);
               }
            } else if ((var16 & 255) == 255) {
               var3[var14] = (byte)(255 - (var15 & 255));
            } else {
               float var17 = (var15 & 0xFF) / 255.0F;
               var3[var14] = com.aspose.slides.internal.v6g.k5.n5((Object)((255 - (var16 & 255)) * var9 * var17), 13);
            }
         } else {
            var3[var14] = var4;
         }

         var3[var11] = var7;
         var3[var12] = var6;
         var3[var13] = var5;
      }

      n2d.n5(var1, var3);
   }

   private com.aspose.slides.internal.x4g.m1 n5(com.aspose.slides.internal.o9b.y1 var1, float var2) {
      float var3 = this.n5.getDirection();
      float var4 = (float)(this.n5.getDistance() * var2 / 116.0);
      com.aspose.slides.internal.o9b.y1 var5 = var1.y4();
      float var6 = var5.x8() + var5.s7() / 2.0F;
      float var7 = var5.n3() + var5.k5() / 2.0F;
      com.aspose.slides.internal.x4g.m1 var8 = new com.aspose.slides.internal.x4g.m1();
      if (var3 != 0.0F || var4 != 0.0F) {
         com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1();
         var9.n5(var3, new com.aspose.slides.internal.o9b.w1(var6, var7));
         var9.k5(-var4, 0.0F);
         var9.n5(-var3, new com.aspose.slides.internal.o9b.w1(var6, var7));
         var8.n5(var9, 1);
      }

      return var8;
   }
}
