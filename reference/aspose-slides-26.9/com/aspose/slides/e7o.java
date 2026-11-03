package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

class e7o {
   private ISoftEdgeEffectiveData n5;

   public e7o(ISoftEdgeEffectiveData var1) {
      this.n5 = var1;
   }

   public final void n5(e3 var1, s5u var2, com.aspose.slides.internal.x4g.s7 var3, a1v var4, l6v var5) {
      if (this.n5.getRadius() != 0.0) {
         if (var4 != null && var4.u3() != 0 || var5 != null && var5.u9()) {
            var3 = com.aspose.slides.internal.v6g.k5.n5(var3.deepClone(), com.aspose.slides.internal.x4g.s7.class);
            com.aspose.slides.internal.o9b.y1 var6 = var3.s7().y4();
            float var7 = 1.0F;
            float var8 = 1.0F;
            if (com.aspose.slides.internal.v6g.k5.l6(var4, q3d.class)) {
               com.aspose.slides.internal.o9b.t4 var9 = com.aspose.slides.internal.v6g.k5.n5(var4, q3d.class).y1();
               float[] var10 = var1.a0().m1().n5();
               if (var9.e2() > var6.s7() && var10[0] > 2.0F) {
                  var7 = var9.e2() / var6.s7();
               }

               if (var9.h0() > var6.k5() && var10[3] > 2.0F) {
                  var8 = var9.h0() / var6.k5();
               }

               if (var2 != null) {
                  float var11 = var2.y4() / 72.0F;
                  var7 *= var11;
                  var8 *= var11;
               }
            }

            float var99 = 0.0F;
            if (var5 != null && var5.u9()) {
               var99 = (float)var5.n5();
            }

            byte var100 = 8;
            com.aspose.slides.internal.o9b.w1 var101 = new com.aspose.slides.internal.o9b.w1(var6.x8() - (var99 + var100), var6.n3() - (var99 + var100));
            com.aspose.slides.internal.x4g.m1 var12 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var101.l6(), -var101.k5());
            var3.l6(var12);
            com.aspose.slides.internal.o9b.l6 var13 = null;

            try {
               var13 = new com.aspose.slides.internal.o9b.l6(
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var7 * (var6.s7() + 2.0F * (var99 + var100)))), 14),
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var8 * (var6.k5() + 2.0F * (var99 + var100)))), 14),
                  2498570
               );
               if (var1.a0() != null) {
                  var13.n5(var1.a0().s7(), var1.a0().x8());
               }

               com.aspose.slides.internal.o9b.z1 var14 = n2d.n5(var13, var1);

               try {
                  var14.n5(var7, var8);
                  var14.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
                  com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1();
                  var15.n5(var12, 1);
                  if (var4 != null && var4.u3() != 0) {
                     com.aspose.slides.internal.o9b.u3 var16 = d4.k5(var4);

                     try {
                        com.aspose.slides.internal.x4g.m1 var17 = n2d.n5(var16);
                        var17.n5(var15, 1);
                        n2d.n5(var16, var17);
                        var14.n5(var16, var3);
                     } finally {
                        if (var16 != null) {
                           var16.dispose();
                        }
                     }
                  }

                  if (var5 != null && var5.u9()) {
                     com.aspose.slides.internal.o9b.m3 var103 = var5.q0();

                     try {
                        com.aspose.slides.internal.x4g.m1 var106 = var103.t4();
                        var106.n5(var15, 1);
                        var103.n5(var106);
                        var14.n5(var103, var3);
                     } finally {
                        if (var103 != null) {
                           var103.dispose();
                        }
                     }
                  }
               } finally {
                  if (var14 != null) {
                     var14.dispose();
                  }
               }

               com.aspose.slides.internal.o9b.l6 var102 = new com.aspose.slides.internal.o9b.l6(var13.e2(), var13.h0(), var13.s7());

               try {
                  com.aspose.slides.internal.o9b.z1 var104 = com.aspose.slides.internal.o9b.z1.n5(var102);

                  try {
                     var104.l6(1);
                     var104.k5(1);
                     var104.a6(3);
                     var104.u9(3);
                     var104.n5(var7, var8);
                     float var107 = 0.0F;
                     float var18 = (float)this.n5.getRadius();
                     if (var4 != null && var4.u3() != 0) {
                        var104.n5(com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, 0).o8());
                        var104.n5(new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(255, 255, 0, 0).o8()), var3);
                        float var110 = var18 >= 50.0F ? 1.8F : 1.75F;
                        var107 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var110 * var18)), 14);
                        com.aspose.slides.internal.o9b.m3 var111 = new com.aspose.slides.internal.o9b.m3(
                           com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, 0).o8(), var107
                        );

                        try {
                           var104.n5(var111, var3);
                        } finally {
                           if (var111 != null) {
                              var111.dispose();
                           }
                        }
                     } else if (var5 != null && var5.u9()) {
                        var104.n5(com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, 0).o8());
                        float var19 = 1.75F;
                        if (var99 - var19 * var18 >= 0.0F) {
                           var107 = var99 - var19 * var18;
                        } else {
                           var107 = 0.0F;
                        }

                        com.aspose.slides.internal.o9b.m3 var20 = var5.q0();

                        try {
                           var20.n5(com.aspose.slides.internal.o9b.c8.n5(255, 255, 0, 0).o8());
                           var20.k5(var107);
                           var104.n5(var20, var3);
                        } finally {
                           if (var20 != null) {
                              var20.dispose();
                           }
                        }
                     }

                     this.n5(var13, var102, com.aspose.slides.ms.System.q1.n5((float)(var7), (float)(var8)), 2);
                  } finally {
                     if (var104 != null) {
                        var104.dispose();
                     }
                  }
               } finally {
                  if (var102 != null) {
                     var102.dispose();
                  }
               }

               if (var7 > 1.0F) {
                  com.aspose.slides.internal.o9b.y1 var105 = new com.aspose.slides.internal.o9b.y1(
                     com.aspose.slides.internal.v6g.k5.u3(var101.l6(), 13),
                     com.aspose.slides.internal.v6g.k5.u3(var101.k5(), 13),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6.s7() + 2.0F * (var99 + var100))), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6.k5() + 2.0F * (var99 + var100))), 14)
                  );
                  var1.n5(var13, var105.x8(), var105.n3(), var105.s7(), var105.k5());
               } else {
                  var1.n5(var13, com.aspose.slides.internal.v6g.k5.u3(var101.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var101.k5(), 13));
               }
            } finally {
               var3.dispose();
               if (var13 != null) {
                  var13.dispose();
               }
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2, float var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("bitmap cannot be null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("alphaChannelBitmap cannot be null.");
      }

      if (var1.e2() == var2.e2() && var1.h0() == var2.h0()) {
         int[] var5 = new int[var2.e2() * var2.h0()];
         if (var2.e2() != 0 && var2.h0() != 0) {
            int var6 = com.aspose.slides.internal.o9b.t4.n5(var2.s7()) >> 3;
            byte[] var7 = n2d.n5(var2);
            int var8 = var4;

            for (int var9 = 0; var9 < var5.length; var9++) {
               var5[var9] = var7[var8] & 255;
               var8 += var6;
            }

            int[] var19 = new int[var5.length];
            float var10 = (float)this.n5.getRadius();
            float var11 = var10 >= 50.0F ? 0.32258067F : 0.3125F;
            x9p.n5(var5, var19, var2.e2(), var2.h0(), var3 * var10 * var11, 3);
            var5 = var19;
            var8 = var4;

            for (int var12 = 0; var12 < var5.length; var12++) {
               var7[var8] = (byte)var5[var12];
               var8 += var6;
            }
         }

         if (var1.e2() != 0 && var1.h0() != 0) {
            com.aspose.slides.internal.j9e.n5 var15 = var1.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var1.e2(), var1.h0()), 3, var1.s7());
            com.aspose.slides.ms.System.x9 var16 = var15.u3();
            int var18 = com.aspose.slides.ms.System.q1.n5(var15.a6()) * var1.h0();
            byte[] var20 = new byte[var18];
            com.aspose.slides.internal.e3m.n5.n5(var16, var20, 0, var18);
            byte var21 = 0;
            float[] var22 = new float[256];

            for (int var23 = 0; var23 < 256; var23++) {
               var22[var23] = var23 / 255.0F;
            }

            for (int var24 = 0; var24 < var1.e2() * var1.h0(); var24++) {
               int var13 = var21 + 3;
               int var14 = var20[var13] & 255;
               if (var14 != 0) {
                  var20[var13] = com.aspose.slides.internal.v6g.k5.n5((Object)(var22[var14] * var5[var24]), 13);
               }

               var21 += 4;
            }

            com.aspose.slides.internal.e3m.n5.n5(var20, 0, var16, var18);
            var1.n5(var15);
         }
      } else {
         throw new ArgumentException(
            "Width and Height values of the bitmap argument should be equal the Width and the Height values of the alphaChannelBitmap argument."
         );
      }
   }
}
