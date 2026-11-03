package com.aspose.slides;

class z2r {
   private double n5;
   private float l6;
   private double k5;
   private com.aspose.slides.internal.o9b.c8 u3 = new com.aspose.slides.internal.o9b.c8();
   private byte a6;
   private double u9;
   private double h0;
   private double c8;
   private double t2;
   private boolean s7;

   z2r(IOuterShadowEffectiveData var1) {
      this(var1, false);
   }

   z2r(IOuterShadowEffectiveData var1, boolean var2) {
      this.n5 = var1.getBlurRadius();
      this.l6 = var1.getDirection();
      this.k5 = var1.getDistance();
      ((k0p)var1).l6().n5(this.u3);
      this.a6 = var1.getRectangleAlign();
      this.u9 = var1.getSkewHorizontal();
      this.h0 = var1.getSkewVertical();
      this.c8 = var1.getScaleHorizontal();
      this.t2 = var1.getScaleVertical();
      this.s7 = var2;
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, TextParam var3) {
      if (var2.h0() != 0) {
         float var4 = var3.t4();
         boolean var5 = com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class);
         com.aspose.slides.internal.x4g.m1 var6;
         if (this.c8 == 100.0 && this.t2 == 100.0) {
            var6 = this.n5(var3, new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.n5.n5, var3.n5.l6), var4, var5);
         } else {
            var6 = this.n5(var3, var2.s7().y4(), var4, var5);
         }

         com.aspose.slides.internal.x4g.s7 var7 = null;
         com.aspose.slides.internal.o9b.l6 var8 = null;
         com.aspose.slides.internal.o9b.m3 var9 = null;
         com.aspose.slides.internal.o9b.u3 var10 = null;

         try {
            var7 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
            var7.l6(var6);
            byte var11 = 2;
            com.aspose.slides.internal.o9b.y1 var12 = var7.s7().y4();
            com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1(
               var12.x8() - (float)this.n5 - var11, var12.n3() - (float)this.n5 - var11
            );
            com.aspose.slides.internal.x4g.m1 var14 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var13.l6(), -var13.k5());
            var7.l6(var14);
            var8 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var12.s7() + 2 * var11 + 2.0 * this.n5, 14),
               com.aspose.slides.internal.v6g.k5.u3(var12.k5() + 2 * var11 + 2.0 * this.n5, 14),
               2498570
            );
            if (var1.a0() != null) {
               var8.n5(var1.a0().s7(), var1.a0().x8());
            }

            com.aspose.slides.internal.o9b.z1 var15 = n2d.n5(var8, var1);

            try {
               var15.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
               e4z var16 = var3.d2();
               var9 = var3.a6() != null && var3.a6().u9() ? var3.a6().q0() : null;
               var10 = var3.u3() != null ? d4.k5(var3.u3()) : com.aspose.slides.internal.o9b.a6.k5();
               if (var9 != null && var9.q0() > 0.0F) {
                  com.aspose.slides.internal.o9b.c8 var17 = this.u3.o8();
                  if (var9.z1() == 0) {
                     n2d.n5(this.u3.o8(), var9.k5().s7()).n5(var17);
                  }

                  com.aspose.slides.internal.o9b.m3 var18 = new com.aspose.slides.internal.o9b.m3(
                     com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, var17.s7() & 255).o8(), var9.q0() * (float)(this.c8 / 100.0)
                  );

                  try {
                     var15.n5(var18, var7);
                  } finally {
                     if (var18 != null) {
                        var18.dispose();
                     }
                  }
               }

               if (var10 != null) {
                  com.aspose.slides.internal.o9b.i1 var57 = com.aspose.slides.internal.v6g.k5.n5(var10, com.aspose.slides.internal.o9b.i1.class);
                  com.aspose.slides.internal.o9b.c8 var59 = this.u3.o8();
                  if (var57 != null) {
                     n2d.n5(this.u3.o8(), var57.h0().s7()).n5(var59);
                  }

                  com.aspose.slides.internal.o9b.i1 var19 = new com.aspose.slides.internal.o9b.i1(
                     com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, var59.s7() & 255).o8()
                  );

                  try {
                     if (var16.u9()) {
                        com.aspose.slides.internal.o9b.m3 var20 = new com.aspose.slides.internal.o9b.m3(var19, var16.h0() * 0.02F);

                        try {
                           var15.n5(var20, var7);
                        } finally {
                           if (var20 != null) {
                              var20.dispose();
                           }
                        }
                     }

                     if (var57 != null) {
                        if ((var57.h0().s7() & 255) > 0) {
                           var15.n5(var19, var7);
                        }
                     } else {
                        var15.n5(var19, var7);
                     }
                  } finally {
                     if (var19 != null) {
                        var19.dispose();
                     }
                  }
               }
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }

            byte[] var56 = n2d.n5(var8);
            int[] var58 = new int[var56.length];
            int var60 = 0;
            byte var62 = this.u3.y4();
            byte var63 = this.u3.n3();
            byte var21 = this.u3.x8();

            for (int var22 = 0; var22 < var56.length; var22 += 4) {
               var58[var60++] = (byte)((var56[var22 + 3] & 255) * (var56[var22] & 255) >> 8) & 255;
               var56[var22] = var62;
               var56[var22 + 1] = var63;
               var56[var22 + 2] = var21;
            }

            int[] var64 = new int[var58.length];
            if (var3.v4()) {
               x9p.n5(var58, var64, var8.e2(), var8.h0(), this.n5 / 3.0, 4);
            } else {
               float var23 = r4.n5(var4, (float)this.n5);
               byte var24 = 3;
               if (this.k5 < 2.0 && this.n5 <= 4.0) {
                  var24 = 4;
               }

               x9p.n5(var58, var64, var8.e2(), var8.h0(), var23, var24);
            }

            var60 = 0;

            for (int var65 = 3; var65 < var56.length; var65 += 4) {
               var56[var65] = (byte)var58[var60++];
            }

            n2d.n5(var8, var56);
            var1.n5(var8, var13.l6(), var13.k5(), var8.e2(), var8.h0());
         } finally {
            if (var9 != null) {
               var9.dispose();
            }

            if (var10 != null) {
               var10.dispose();
            }

            if (var8 != null) {
               var8.dispose();
            }

            if (var7 != null) {
               var7.dispose();
            }
         }
      }
   }

   public final com.aspose.slides.internal.x4g.m1 n5(TextParam var1, com.aspose.slides.internal.o9b.y1 var2, float var3, boolean var4) {
      com.aspose.slides.internal.x4g.m1 var5 = new com.aspose.slides.internal.x4g.m1();
      com.aspose.slides.internal.o9b.w1 var6 = n7q.n5(var2.y4(), this.a6).u3();
      if (this.u9 != 0.0 || this.h0 != 0.0) {
         com.aspose.slides.internal.x4g.m1 var7 = new com.aspose.slides.internal.x4g.m1();
         var7.k5(var6.l6(), var6.k5());
         var7.l6((float)(com.aspose.slides.ms.System.q1.t2(this.u9 / 180.0) * Math.PI), (float)(com.aspose.slides.ms.System.q1.t2(this.h0 / 180.0) * Math.PI));
         var7.k5(-var6.l6(), -var6.k5());
         var5.n5(var7, 1);
      }

      if ((this.c8 != 0.0 || this.t2 != 0.0) && (this.c8 != 100.0 || this.t2 != 100.0)) {
         com.aspose.slides.internal.x4g.m1 var10 = new com.aspose.slides.internal.x4g.m1();
         var10.k5(var6.l6(), var6.k5());
         var10.n5((float)(this.c8 / 100.0), (float)(this.t2 / 100.0));
         var10.k5(-var6.l6(), -var6.k5());
         var5.n5(var10, 1);
      }

      if (this.l6 != 0.0F || this.k5 != 0.0) {
         com.aspose.slides.internal.x4g.m1 var11 = new com.aspose.slides.internal.x4g.m1();
         var11.n5(this.l6, var6.u3());
         float var8 = 1.0F;
         if (!this.s7 && !com.aspose.slides.ms.System.n1.k5(var3)) {
            float var9 = this.n5(var3, var4);
            var8 = r4.n5(var3, 0.75F, 48.0F, var9);
         }

         float var12 = (float)(this.k5 * var8);
         var11.k5(var12, 0.0F);
         var11.n5(-this.l6, var6.u3());
         var5.n5(var11, 1);
      }

      return var5;
   }

   private float n5(float var1, boolean var2) {
      float var3 = 1.6F;
      if (var1 < 10.0F) {
         if (var2) {
            var3 = 1.4F;
         } else {
            var3 = 1.7F;
         }
      } else if (var1 >= 10.0F && var1 <= 17.0F) {
         if (var2) {
            var3 = 1.45F;
         } else {
            var3 = 1.65F;
         }
      } else if (var1 > 17.0F && var1 <= 20.0F) {
         if (var2) {
            var3 = 1.45F;
         } else if (var1 != 18.0F) {
            var3 = 1.55F;
         } else {
            var3 = 1.45F;
         }
      } else if (var1 > 20.0F && var1 < 24.0F) {
         if (var2) {
            var3 = 1.53F;
         } else {
            var3 = 1.62F;
         }
      }

      if (var1 >= 24.0F && var1 < 48.0F) {
         var3 = 1.62F;
      } else if (var1 >= 48.0F && var1 < 96.0F) {
         var3 = 1.55F;
      } else if (var1 >= 96.0F) {
         var3 = 1.6F;
      }

      return var3;
   }
}
