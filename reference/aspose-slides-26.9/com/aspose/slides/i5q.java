package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class i5q {
   private com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();
   private double l6;

   public i5q(IGlow var1) {
      if (var1 == null) {
         throw new ArgumentNullException("glowEffectiveData is null.");
      }

      ((ColorFormat)var1.getColor()).u3().n5(this.n5);
      this.l6 = var1.getRadius();
   }

   public i5q(IGlowEffectiveData var1) {
      if (var1 == null) {
         throw new ArgumentNullException("glowEffectiveData is null.");
      }

      ((b4h)var1).l6().n5(this.n5);
      this.l6 = var1.getRadius();
   }

   public final void n5(e3 var1, j0b$n5[] var2) {
      if (var2 != null) {
         float var3 = 0.0F;
         com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();

         for (j0b$n5 var8 : var2) {
            if (var8.n5() != null && var8.n5().h0() > 0) {
               var4.n5(var8.n5(), false);
               if (var8.k5() != null && var8.k5().u9()) {
                  var3 = com.aspose.slides.ms.System.q1.n5((float)(var3), (float)((float)var8.k5().n5()));
               }
            }
         }

         com.aspose.slides.internal.o9b.y1 var28 = var4.s7().y4();
         float var29 = (float)(var3 + this.l6);
         com.aspose.slides.internal.o9b.w1 var30 = new com.aspose.slides.internal.o9b.w1(var28.x8() - var29, var28.n3() - var29);
         com.aspose.slides.internal.x4g.m1 var31 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var30.l6(), -var30.k5());
         int var9 = com.aspose.slides.internal.v6g.k5.u3(var28.s7() + 2.0F * var29, 13);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(var28.k5() + 2.0F * var29, 13);
         com.aspose.slides.internal.o9b.l6 var11 = new com.aspose.slides.internal.o9b.l6(var9, var10);

         try {
            com.aspose.slides.internal.o9b.z1 var12 = n2d.n5(var11, var1);

            try {
               if (var1.a0() != null) {
                  var11.n5(var1.a0().s7(), var1.a0().x8());
               }

               for (j0b$n5 var16 : var2) {
                  a1v var17 = var16.l6() != null ? var16.l6().s7() : null;
                  l6v var18 = var16.k5() != null ? var16.k5().w1() : null;
                  com.aspose.slides.internal.x4g.s7 var19 = (com.aspose.slides.internal.x4g.s7)var16.n5().deepClone();
                  var19.l6(var31);
                  this.n5(var12, var19, this.n5.o8(), var31, var17, var18);
               }

               this.n5(var11, this.n5.o8(), this.l6, com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class));
               var1.n5(var11, var30.l6(), var30.k5(), var11.e2(), var11.h0());
            } finally {
               if (var12 != null) {
                  var12.dispose();
               }
            }
         } finally {
            if (var11 != null) {
               var11.dispose();
            }
         }
      }
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4) {
      if (var2 != null && var2.h0() != 0) {
         float var5 = 1.0F;
         if (!(this.l6 <= var5 / 2.0F)) {
            float[] var6 = var1.a0().m1().n5();
            float var7 = com.aspose.slides.ms.System.q1.n5((float)(var6[0]), (float)(var6[3]));
            if (!(this.l6 <= var5) || !(var7 < 2.0F)) {
               boolean var8 = this.n5(var3);
               boolean var9 = this.n5(var4);
               if (var8 || var9) {
                  float var10 = 0.0F;
                  if (var4 != null && var4.u9()) {
                     var10 = (float)var4.n5();
                  }

                  var2 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
                  com.aspose.slides.internal.o9b.y1 var11 = var2.s7().y4();
                  float var12 = (float)(var10 + this.l6);
                  float var13 = 0.5F;
                  com.aspose.slides.internal.o9b.w1 var14 = new com.aspose.slides.internal.o9b.w1(var11.x8() - var12 + var13, var11.n3() - var12 + var13);
                  com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var14.l6(), -var14.k5());
                  var2.l6(var15);
                  int var16 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var11.s7() + 2.0F * var12), 14);
                  int var17 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var11.k5() + 2.0F * var12), 14);
                  com.aspose.slides.internal.o9b.l6 var18 = new com.aspose.slides.internal.o9b.l6(var16, var17);

                  try {
                     com.aspose.slides.internal.o9b.z1 var19 = n2d.n5(var18, var1);

                     try {
                        var19.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
                        this.n5(var19, var2, this.n5.o8(), var15, var3, var4);
                        this.n5(var18, this.n5.o8(), this.l6, com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class));
                        var1.n5(var18, var14.l6(), var14.k5(), var18.e2(), var18.h0());
                     } finally {
                        if (var19 != null) {
                           var19.dispose();
                        }
                     }
                  } finally {
                     if (var18 != null) {
                        var18.dispose();
                     }
                  }
               }
            }
         }
      }
   }

   private void n5(
      com.aspose.slides.internal.o9b.z1 var1,
      com.aspose.slides.internal.x4g.s7 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      com.aspose.slides.internal.x4g.m1 var4,
      a1v var5,
      l6v var6
   ) {
      boolean var7 = this.n5(var5);
      boolean var8 = this.n5(var6);
      if (var8) {
         com.aspose.slides.internal.o9b.m3 var9 = var6.q0();

         try {
            var9.n5(var3.o8());
            var9.u9(2);
            var9.u3(2);
            var9.a6(2);
            var1.n5(var9, var2);
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }
      }

      if (var7) {
         com.aspose.slides.internal.o9b.u3 var18 = d4.k5(var5);

         try {
            com.aspose.slides.internal.x4g.m1 var10 = n2d.n5(var18);
            var10.n5(var4, 1);
            n2d.n5(var18, var10);
            var1.n5(var18, var2);
         } finally {
            if (var18 != null) {
               var18.dispose();
            }
         }
      }
   }

   private boolean n5(a1v var1) {
      boolean var2 = true;
      if (var1 != null && var1.u3() != 0) {
         if (var1.u3() == 1 && (var1.n5().s7() & 255) <= 1) {
            var2 = false;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   private boolean n5(l6v var1) {
      boolean var2 = true;
      if (var1 != null && var1.u9() && var1.z3().u3() != 0) {
         if (var1.z3().u3() == 1 && (var1.z3().n5().s7() & 255) <= 1) {
            var2 = false;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.c8 var2, double var3, boolean var5) {
      byte[] var6 = n2d.n5(var1);
      int[] var7 = new int[var6.length];
      int var8 = 0;
      byte var9 = var2.s7();
      byte var10 = var2.y4();
      byte var11 = var2.n3();
      byte var12 = var2.x8();

      for (int var13 = 0; var13 < var6.length; var13 += 4) {
         var6[var13] = var10;
         var6[var13 + 1] = var11;
         var6[var13 + 2] = var12;
         if ((var6[var13 + 3] & 255) == 255) {
            var6[var13 + 3] = var9;
         }

         var7[var8++] = var6[var13 + 3] & 255;
      }

      float var22 = 1.0F;
      float var14 = 6.0F;
      if (this.l6 <= var14) {
         var22 = 0.8F + (float)(this.l6 * 0.2) / var14;
      }

      float var15 = 5.3F * var22;
      float var16 = 6.0F * var22;
      byte var17 = 3;
      int[] var18 = new int[var7.length];
      x9p.n5(var7, var18, var1.e2(), var1.h0(), var3 / var15, var17);
      int var19 = var2.s7() & 255;

      for (int var20 = 0; var20 < var18.length; var20++) {
         if (var18[var20] != 0) {
            var18[var20] = var19;
         }
      }

      x9p.n5(var18, var7, var1.e2(), var1.h0(), var3 / var16, var17);
      var8 = 0;

      for (byte var23 = 3; var23 < var6.length; var23 += 4) {
         var6[var23] = (byte)var7[var8++];
      }

      n2d.n5(var1, var6);
      if (var5) {
         com.aspose.slides.internal.n2d.y4.n5(var1);
      }
   }

   public final com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("shapePath is null");
      }

      com.aspose.slides.internal.o9b.y1 var2 = var1.s7().y4();
      var2.n5(new com.aspose.slides.internal.o9b.f2((float)this.l6 / 2.0F, (float)this.l6 / 2.0F));
      return var2;
   }
}
