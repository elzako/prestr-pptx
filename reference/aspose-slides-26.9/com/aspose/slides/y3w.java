package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class y3w {
   private final double n5;
   private final com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private final float k5;
   private final double u3;
   private final float a6 = 3.0F;
   private final int u9 = 4;

   public y3w(IInnerShadow var1) {
      if (var1 == null) {
         throw new ArgumentNullException("innerShadow");
      }

      this.n5 = var1.getBlurRadius();
      ((ColorFormat)var1.getShadowColor()).u3().n5(this.l6);
      this.k5 = var1.getDirection();
      this.u3 = var1.getDistance();
   }

   public y3w(IInnerShadowEffectiveData var1) {
      if (var1 == null) {
         throw new ArgumentNullException("innerShadowEffectiveData");
      }

      this.n5 = var1.getBlurRadius();
      ((d8f)var1).l6().n5(this.l6);
      this.k5 = var1.getDirection();
      this.u3 = var1.getDistance();
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, IShapeFrame var5) {
      if (var2 == null) {
         throw new ArgumentNullException("graphicsPath is null");
      }

      if (var3 != null && var3.u3() != 0) {
         com.aspose.slides.internal.x4g.s7 var6 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
         com.aspose.slides.internal.o9b.y1 var7 = var6.s7().y4();
         float var8 = (float)this.n5;
         float var9 = var8 / 3.0F;
         int var10 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var7.s7() / (var7.k5() + var7.s7()) * var9 + 0.5F)), 14)
            + 2;
         int var11 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var7.k5() / (var7.k5() + var7.s7()) * var9 + 0.5F)), 14)
            + 2;
         com.aspose.slides.internal.x4g.s7 var12 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
         com.aspose.slides.internal.x4g.m1 var13 = this.n5(var7.y4());
         var12.l6(var13);
         com.aspose.slides.internal.o9b.y1 var14 = var12.s7().y4();
         com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var7.x8() + var10, -var7.n3() + var11);
         var12.l6(var15);
         var6.l6(var15);
         int var16 = com.aspose.slides.internal.v6g.k5.u3(var7.s7() + 2 * var10, 13);
         int var17 = com.aspose.slides.internal.v6g.k5.u3(var7.k5() + 2 * var11, 13);
         com.aspose.slides.internal.o9b.l6 var18 = new com.aspose.slides.internal.o9b.l6(var16, var17, 2498570);

         try {
            if (var1.y1() != null) {
               var18.n5(var1.y1().y4(), var1.y1().c8());
            }

            com.aspose.slides.internal.o9b.z1 var19 = n2d.n5(var18, var1);

            try {
               var19.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
               if (var3.u3() != 0) {
                  var19.n5(new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(var3.n5().s7() & 255, 255, 0, 0).o8()), var12);
               }
            } finally {
               if (var19 != null) {
                  var19.dispose();
               }
            }

            com.aspose.slides.internal.o9b.c8 var20 = this.l6.o8();
            if (var3.u3() == 1 && (var3.n5().s7() & 255) != 255) {
               int var21 = com.aspose.slides.internal.v6g.k5.u3((var20.s7() & 0xFF) * ((var3.n5().s7() & 0xFF) / 255.0F), 13);
               com.aspose.slides.internal.o9b.c8.n5(var21, var20.o8()).n5(var20);
            }

            this.n5(var18, var20.o8());
            if (var7.k5(var14.y4())) {
               x9p.n5(var18, var9, 4, 3);
            }

            com.aspose.slides.internal.o9b.l6 var58 = new com.aspose.slides.internal.o9b.l6(var16, var17, var18.s7());

            try {
               com.aspose.slides.internal.o9b.z1 var59 = n2d.n5(var58, var1);

               try {
                  var59.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
                  com.aspose.slides.internal.o9b.u6 var22 = new com.aspose.slides.internal.o9b.u6(var18);

                  try {
                     var59.n5(var22, var6);
                  } finally {
                     if (var22 != null) {
                        var22.dispose();
                     }
                  }

                  float var23 = var7.x8() - var10;
                  float var24 = var7.n3() - var11;
                  var1.n5(var58, var23, var24, var18.e2(), var18.h0());
               } finally {
                  if (var59 != null) {
                     var59.dispose();
                  }
               }
            } finally {
               if (var58 != null) {
                  var58.dispose();
               }
            }
         } finally {
            if (var18 != null) {
               var18.dispose();
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

   private com.aspose.slides.internal.x4g.m1 n5(com.aspose.slides.internal.o9b.y1 var1) {
      float var2 = this.k5;
      float var3 = (float)this.u3;
      com.aspose.slides.internal.o9b.y1 var4 = var1.y4();
      float var5 = var4.x8() + var4.s7() / 2.0F;
      float var6 = var4.n3() + var4.k5() / 2.0F;
      com.aspose.slides.internal.x4g.m1 var7 = new com.aspose.slides.internal.x4g.m1();
      if (var2 != 0.0F || var3 != 0.0F) {
         com.aspose.slides.internal.x4g.m1 var8 = new com.aspose.slides.internal.x4g.m1();
         var8.n5(var2, new com.aspose.slides.internal.o9b.w1(var5, var6));
         var8.k5(-var3, 0.0F);
         var8.n5(-var2, new com.aspose.slides.internal.o9b.w1(var5, var6));
         var7.n5(var8, 1);
      }

      return var7;
   }
}
