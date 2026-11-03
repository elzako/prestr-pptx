package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

class c8k {
   private com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();
   private double l6;
   private static final float[] k5 = new float[]{17.5F, 17.5F, 14.5F, 14.5F, 10.5F, 10.25F, 8.25F, 7.25F, 7.25F, 5.25F, 4.25F};
   private static final float[] u3 = new float[]{17.5F, 17.5F, 17.5F, 17.5F, 17.5F, 14.25F, 10.5F, 10.5F, 6.25F, 5.25F, 4.75F};
   private static final float[] a6 = new float[]{33.0F, 24.5F, 20.0F, 18.0F, 16.5F, 12.25F, 10.5F, 8.5F, 7.0F, 5.0F, 4.0F};
   private static final float[] u9 = new float[]{33.0F, 24.0F, 20.0F, 18.0F, 18.5F, 12.25F, 10.5F, 8.5F, 7.0F, 5.5F, 4.5F};
   private static final float[] h0 = new float[]{41.5F, 35.5F, 27.5F, 22.5F, 17.5F, 13.0F, 10.5F, 8.25F, 6.5F, 5.0F, 4.0F};
   private static final float[] c8 = new float[]{41.5F, 35.5F, 27.5F, 22.5F, 17.5F, 13.5F, 11.0F, 8.25F, 6.75F, 5.0F, 4.25F};
   private static final float[] t2 = new float[]{4.0F, 6.0F, 8.0F, 12.0F, 16.0F, 24.0F, 32.0F, 48.0F, 64.0F, 96.0F, 128.0F};

   public c8k(IGlowEffectiveData var1) {
      if (var1 == null) {
         throw new ArgumentNullException("glowEffectiveData is null.");
      }

      ((b4h)var1).l6().n5(this.n5);
      this.l6 = var1.getRadius();
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, TextParam var3) {
      if (var3.u3() != null && var3.u3().u3() != 0 || var3.a6() != null && var3.a6().u9()) {
         if (this.l6 != 0.0 && (this.n5.s7() & 255) != 0) {
            com.aspose.slides.internal.o9b.l6 var4 = null;
            com.aspose.slides.internal.o9b.m3 var5 = null;
            com.aspose.slides.internal.o9b.z1 var6 = null;
            double var7 = this.l6;
            com.aspose.slides.internal.o9b.c8 var9 = this.n5.o8();

            try {
               var5 = var3.a6() != null && var3.a6().u9() ? var3.a6().q0() : null;
               var2 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
               com.aspose.slides.internal.o9b.y1 var10 = var2.s7().y4();
               float var11 = 0.0F;
               if (var5 != null) {
                  var11 = var5.q0();
               }

               var4 = new com.aspose.slides.internal.o9b.l6(
                  com.aspose.slides.internal.v6g.k5.u3(var10.s7() + 2.0 * var7, 14), com.aspose.slides.internal.v6g.k5.u3(var10.k5() + 2.0 * var7, 14)
               );
               if (var1.a0() != null) {
                  var4.n5(var1.a0().s7(), var1.a0().x8());
               }

               com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(
                  (float)(var10.x8() - (var11 + var7)), (float)(var10.n3() - (var11 + var7))
               );
               com.aspose.slides.internal.x4g.m1 var13 = new com.aspose.slides.internal.x4g.m1();
               var13.k5(-var12.l6(), -var12.k5());
               var2.l6(var13);
               float var14 = var3.t4();
               boolean var15 = false;
               if (var7 <= 4.0 && var14 <= 26.0F) {
                  var15 = true;
               } else if (var7 <= 6.0 && var14 <= 20.0F) {
                  var15 = true;
               } else if (var7 < 10.0 && var14 <= 12.0F) {
                  var15 = true;
               }

               var6 = n2d.n5(var4, var1);
               if (!var15) {
                  com.aspose.slides.internal.o9b.c8 var75 = com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, var9.s7() & 255).o8();
                  if (var3.a6() != null && var3.a6().u9()) {
                     com.aspose.slides.internal.o9b.m3 var78 = com.aspose.slides.internal.v6g.k5.n5(var5.deepClone(), com.aspose.slides.internal.o9b.m3.class);

                     try {
                        var78.n5(var75.o8());
                        var6.n5(var78, var2);
                     } finally {
                        if (var78 != null) {
                           var78.dispose();
                        }
                     }
                  }

                  if (var3.u3() != null && var3.u3().u3() != 0) {
                     com.aspose.slides.internal.o9b.i1 var79 = new com.aspose.slides.internal.o9b.i1(var75.o8());

                     try {
                        var6.n5(var79, var2);
                     } finally {
                        if (var79 != null) {
                           var79.dispose();
                        }
                     }
                  }

                  byte[] var80 = n2d.n5(var4);
                  int[] var18 = new int[var80.length];
                  byte var19 = var9.y4();
                  byte var20 = var9.n3();
                  byte var21 = var9.x8();
                  int var22 = 0;

                  for (int var23 = 0; var23 < var80.length; var23 += 4) {
                     var18[var22++] = var80[var23] & 255;
                     var80[var23] = var19;
                     var80[var23 + 1] = var20;
                     var80[var23 + 2] = var21;
                  }

                  float var82 = 1.0F;
                  float var24 = 1.0F;
                  byte var25 = 3;
                  if (var7 <= 10.0) {
                     var82 = this.n5(t2, k5, var14);
                     var24 = this.n5(t2, u3, var14);
                  } else if (var7 > 10.0 && var7 <= 20.0) {
                     var82 = this.n5(t2, a6, var14);
                     var24 = this.n5(t2, u9, var14);
                  } else {
                     var82 = this.n5(t2, h0, var14);
                     var24 = this.n5(t2, c8, var14);
                  }

                  int[] var26 = new int[var18.length];
                  x9p.n5(var18, var26, var4.e2(), var4.h0(), var7 / var82, var25);
                  int var27 = var9.s7() & 255;

                  for (int var28 = 0; var28 < var26.length; var28++) {
                     if (var26[var28] != 0) {
                        var26[var28] = var27;
                     }
                  }

                  x9p.n5(var26, var18, var4.e2(), var4.h0(), var7 / var24, var25);
                  var22 = 0;

                  for (byte var85 = 3; var85 < var80.length; var85 += 4) {
                     var80[var85] = (byte)var18[var22++];
                  }

                  n2d.n5(var4, var80);
               } else {
                  float var16 = 5.0F;
                  if (var3.a6() != null && var3.a6().u9()) {
                     com.aspose.slides.internal.o9b.m3 var76 = com.aspose.slides.internal.v6g.k5.n5(var5.deepClone(), com.aspose.slides.internal.o9b.m3.class);

                     try {
                        var76.n5(var9.o8());
                        var76.k5((float)var7 / 5.0F);
                        var6.n5(var76, var2);
                     } finally {
                        if (var76 != null) {
                           var76.dispose();
                        }
                     }
                  } else {
                     com.aspose.slides.internal.o9b.m3 var17 = new com.aspose.slides.internal.o9b.m3(var9.o8(), (float)var7 / 5.0F);

                     try {
                        var6.n5(var17, var2);
                     } finally {
                        if (var17 != null) {
                           var17.dispose();
                        }
                     }
                  }

                  if (var3.u3() != null && var3.u3().u3() != 0) {
                     com.aspose.slides.internal.o9b.i1 var77 = new com.aspose.slides.internal.o9b.i1(var9.o8());

                     try {
                        var6.n5(var77, var2);
                     } finally {
                        if (var77 != null) {
                           var77.dispose();
                        }
                     }
                  }
               }

               var1.n5(var4, var12.l6(), var12.k5(), var4.e2(), var4.h0());
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }

               if (var4 != null) {
                  var4.dispose();
               }

               if (var6 != null) {
                  var6.dispose();
               }

               if (var2 != null) {
                  var2.dispose();
               }
            }
         }
      }
   }

   private float n5(float[] var1, float[] var2, double var3) {
      if (var1.length != var2.length) {
         throw new ArgumentException("fontHeight and rates should have same number of elements");
      }

      float var5 = -Float.MAX_VALUE;
      float var6 = Float.MAX_VALUE;

      for (float var10 : var1) {
         if (var5 < var10) {
            var5 = var10;
         }

         if (var6 > var10) {
            var6 = var10;
         }
      }

      if (var3 >= var5) {
         return var2[var2.length - 1];
      }

      if (var3 <= var6) {
         return var2[0];
      }

      int var13 = 0;
      int var14 = 0;

      for (int var15 = 0; var15 < var1.length; var15++) {
         if (var3 < var1[var15]) {
            var13 = var15 - 1;
            var14 = var15;
            break;
         }

         if (var3 == var1[var15]) {
            var13 = var15;
            var14 = var15;
            break;
         }
      }

      if (var13 == var14) {
         return var2[var13];
      }

      double var11 = var2[var13] + (var2[var14] - var2[var13]) / (var1[var14] - var1[var13]) * (var3 - var1[var13]);
      return (float)var11;
   }
}
