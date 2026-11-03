package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class q1k {
   private IReflectionEffectiveData n5;

   public q1k(IReflectionEffectiveData var1) {
      if (var1 == null) {
         throw new ArgumentNullException("reflectionEffectiveData is null.");
      }

      this.n5 = var1;
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, TextParam var3, com.aspose.slides.internal.o9b.w1 var4) {
      if (var2 == null) {
         throw new ArgumentNullException("path is null.");
      }

      if (var2.h0() != 0) {
         if (this.n5.getScaleHorizontal() != 0.0 && this.n5.getScaleVertical() != 0.0) {
            com.aspose.slides.internal.x4g.s7 var5 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
            com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1();
            boolean var7 = false;
            float var8 = var3.t4();
            boolean var9 = this.n5.getRotateShadowWithShape();
            boolean var10 = var3.u9;
            if (var10) {
               ShapeFrame var11 = var3.h0;
               com.aspose.slides.internal.o9b.y1 var12 = var11.n5().y4();
               if (!var9) {
                  com.aspose.slides.internal.w0.c8 var13 = new com.aspose.slides.internal.w0.c8(
                     var11.getFlipH() == 1 ? -1.0F : 1.0F,
                     0.0F,
                     0.0F,
                     var11.getFlipV() == 1 ? -1.0F : 1.0F,
                     var11.getFlipH() == 1 ? var11.getCenterX() * 2.0F : 0.0F,
                     var11.getFlipV() == 1 ? var11.getCenterY() * 2.0F : 0.0F
                  );
                  if (!com.aspose.slides.ms.System.n1.k5(var11.getRotation())) {
                     var13.n5(
                        var11.getFlipH() == 1 ^ var11.getFlipV() == 1 ? -var11.getRotation() : var11.getRotation(),
                        new com.aspose.slides.internal.o9b.w1(var11.getCenterX(), var11.getCenterY()),
                        0
                     );
                  }

                  com.aspose.slides.internal.x4g.m1 var14 = com.aspose.slides.internal.n8e.n1.l6(var13);
                  com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var15.l6(var12.y4());
                     var15.l6(var14);
                     var15.s7().a6(var12);
                  } finally {
                     if (var15 != null) {
                        var15.dispose();
                     }
                  }
               }

               com.aspose.slides.internal.x4g.m1 var89 = this.n5(new com.aspose.slides.internal.o9b.w1(var12.x8(), var12.n3() + var12.k5()), 1.0F);
               com.aspose.slides.internal.x4g.s7 var91 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var91.l6(var11.n5().y4());
                  var91.l6(var89);
                  var91.s7().a6(var6);
                  com.aspose.slides.internal.x4g.m1 var94 = com.aspose.slides.internal.n8e.n1.l6(var1.q0());
                  var89.n5(var94, 0);
               } finally {
                  if (var91 != null) {
                     var91.dispose();
                  }
               }

               var5.l6(var89);
            } else {
               var7 = true;
               float var86 = r4.n5(var8, 1.0F, 18.0F, 2.0F);
               com.aspose.slides.internal.x4g.m1 var88 = this.n5(var4.u3(), var86);
               var5.l6(var88);
               com.aspose.slides.internal.o9b.y1 var90 = var5.s7().y4();
               float var92 = 1.5F;
               if (var4.k5() - var90.n3() > 2.0F * var92) {
                  var6 = new com.aspose.slides.internal.o9b.y1(var90.x8(), var4.k5(), var90.s7() * var92, var90.k5() * var92);
               } else {
                  var6 = new com.aspose.slides.internal.o9b.y1(var90.x8(), var90.n3(), var90.s7() * var92, var90.k5() * var92);
               }
            }

            boolean var87 = false;
            double var18 = this.n5.getBlurRadius();
            com.aspose.slides.internal.o9b.w1 var93 = new com.aspose.slides.internal.o9b.w1(var6.x8() - (float)var18, var6.n3() - (float)var18);
            com.aspose.slides.internal.x4g.s7 var95 = var5;

            try {
               com.aspose.slides.internal.o9b.l6 var16 = new com.aspose.slides.internal.o9b.l6(
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var6.s7() + 2.0 * var18), 14),
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var6.k5() + 2.0 * var18), 14),
                  2498570
               );

               try {
                  if (var1.a0() != null) {
                     var16.n5(var1.a0().s7(), var1.a0().x8());
                  }

                  com.aspose.slides.internal.x4g.m1 var17 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var93.l6(), -var93.k5());
                  var95.l6(var17);
                  float var20 = 1.0F;
                  com.aspose.slides.internal.o9b.z1 var21 = n2d.n5(var16, var1);

                  try {
                     if (var3.u3() != null && var3.u3().u3() != 0) {
                        if (var3.u3().u3() == 1) {
                           float var22 = 1.0F;
                           IBackgroundEffectiveData var23 = var3.e2.getBackground().getEffective();
                           if (var23.getFillFormat().getFillType() == 1) {
                              var22 = ((f6a)var23.getFillFormat()).h0().c8() * 2.0F;
                           }

                           float var24 = var3.u3().n5().c8();
                           var87 = var24 >= 0.6;
                           var20 = var22 * var24 * 2.0F;
                        }

                        com.aspose.slides.internal.o9b.u3 var96 = d4.k5(var3.u3());

                        try {
                           var21.n5(var96, var95);
                        } finally {
                           if (var96 != null) {
                              var96.dispose();
                           }
                        }
                     }

                     if (var3.a6() != null && var3.a6().u9()) {
                        com.aspose.slides.internal.o9b.m3 var97 = var3.a6().q0();

                        try {
                           var21.n5(var97, var95);
                        } finally {
                           if (var97 != null) {
                              var97.dispose();
                           }
                        }
                     }
                  } finally {
                     if (var21 != null) {
                        var21.dispose();
                     }
                  }

                  if (var10) {
                     q2b.n5(var16, var16.h0(), this.n5, var87, var20);
                  } else {
                     q2b.n5(var16, var16.h0(), this.n5);
                  }

                  if (var18 >= 2.0) {
                     if (var10) {
                        x9p.n5(var16, var18 / 3.0, 3);
                     } else {
                        x9p.n5(var16, var18 / 6.0, 3);
                     }
                  }

                  if (!var9 && !var7) {
                     com.aspose.slides.internal.w0.c8 var98 = var1.q0();
                     var1.z3();
                     var1.n5(var16, var93.l6(), var93.k5(), var16.e2(), var16.h0());
                     var1.k5(var98);
                  } else {
                     var1.n5(var16, var93.l6(), var93.k5(), var16.e2(), var16.h0());
                  }
               } finally {
                  if (var16 != null) {
                     var16.dispose();
                  }
               }
            } finally {
               if (var95 != null) {
                  var95.dispose();
               }
            }
         }
      }
   }

   private com.aspose.slides.internal.x4g.m1 n5(com.aspose.slides.internal.o9b.w1 var1, float var2) {
      float var3 = (float)this.n5.getScaleHorizontal() / 100.0F;
      float var4 = (float)this.n5.getScaleVertical() / 100.0F;
      float var5 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.l6(var3));
      float var6 = com.aspose.slides.ms.System.q1.l6(var4);
      float var7 = 2.0F * var1.k5();
      float var8 = 0.0F;
      com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(var5, 0.0F, 0.0F, var6, var8, var7);
      com.aspose.slides.internal.x4g.m1 var10 = new com.aspose.slides.internal.x4g.m1();
      var10.k5(var1.l6(), var1.k5());
      var10.n5(com.aspose.slides.ms.System.q1.n5(var3), com.aspose.slides.ms.System.q1.n5(var4));
      var10.k5(-var1.l6(), -var1.k5());
      com.aspose.slides.internal.x4g.m1 var11 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, (float)this.n5.getDistance() * var2);
      com.aspose.slides.internal.x4g.m1 var12 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      var12.n5(var9, 1);
      var12.n5(var11, 1);
      var12.n5(var10, 1);
      return var12;
   }
}
