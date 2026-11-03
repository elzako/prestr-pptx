package com.aspose.slides;

class z0k {
   private final n1g n5;

   public z0k(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      if (!u6p.n5(this.n5.n3().getType())) {
         boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
         if (this.n5.m1().c8() != null) {
            if (!var1) {
               this.n5(this.n5, this.n5.m1());
            } else {
               this.l6(this.n5, this.n5.m1());
            }
         }

         if (this.n5.q0().c8() != null) {
            if (!var1) {
               this.l6(this.n5, this.n5.q0());
            } else {
               this.n5(this.n5, this.n5.q0());
            }
         }

         if (this.n5.m3().c8() != null) {
            this.k5(this.n5, this.n5.m3());
         }
      }
   }

   private void n5(n1g var1, l5 var2) {
      float var3 = (float)var2.e2();
      float var4 = (float)var2.t9();
      float var5 = (float)(var2.c8().isLogarithmic() ? var2.n5(var2.w1()) : var2.w1());
      float var6 = (float)(var2.c8().isLogarithmic() ? var2.n5(var2.j5()) : var2.j5());
      if (var2.c8().getShowMajorGridLines() && var5 > 0.0F || var2.c8().getShowMinorGridLines() && var6 > 0.0F) {
         IRotation3D var7 = var1.n3().getRotation3D();
         int var8 = var7.getRotationY() & 65535;
         float var9 = var1.e5().c8();
         var9 *= (var7.getDepthPercents() & 65535) / 100.0F;
         float var10 = var9 * ((var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var11 = var9 + var10;
         float var12 = 0.0F;
         if (!var1.n3().getRotation3D().getRightAngleAxes()) {
            var12 = -(var9 + var10);
         }

         float var13 = var3 - var4;
         float var14 = var1.e5().l6();
         float var15 = var1.e5().k5();
         float var16 = var1.e5().u3();
         float var17 = var1.e5().a6() / var13;
         if (var2.c8().getShowMajorGridLines() && var5 > 0.0F) {
            for (float var18 = var4; var18 <= var3; var18 += var5) {
               float var19 = var18 - var4;
               float var20 = var14;
               float var21 = var14 + var16;
               float var22 = var15 - var17 * var19;
               com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var23.l6(var20, var22, var21, var22);
                  var2.l6(var23, 0.0F, var12);
               } finally {
                  if (var23 != null) {
                     var23.dispose();
                  }
               }

               if (var8 >= 180) {
                  var20 = var14 + var16;
               }

               com.aspose.slides.internal.x4g.s7 var24 = new com.aspose.slides.internal.x4g.s7();

               try {
                  float var25 = 0.5F;
                  var24.l6(var20, var22 - var25, var20 + var25, var22 - var25);
                  var2.l6(var24, -var11, var12);
               } finally {
                  if (var24 != null) {
                     var24.dispose();
                  }
               }
            }
         }

         if (var2.c8().getShowMinorGridLines() && var6 > 0.0F) {
            for (float var50 = var4; var50 <= var3; var50 += var6) {
               float var51 = var50 - var4;
               float var52 = var14;
               float var53 = var15 - var17 * var51;
               float var54 = var14 + var16;
               com.aspose.slides.internal.x4g.s7 var55 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var55.l6(var52, var53, var54, var53);
                  var2.k5(var55, 0.0F, var12);
               } finally {
                  if (var55 != null) {
                     var55.dispose();
                  }
               }

               if (var8 >= 180) {
                  var52 = var14 + var16;
               }

               com.aspose.slides.internal.x4g.s7 var56 = new com.aspose.slides.internal.x4g.s7();

               try {
                  float var57 = 0.01F;
                  var56.l6(var52, var53 + var57, var52, var53);
                  var2.k5(var56, -var11, var12);
               } finally {
                  if (var56 != null) {
                     var56.dispose();
                  }
               }
            }
         }
      }
   }

   private void l6(n1g var1, l5 var2) {
      double var3 = var2.e2();
      double var5 = var2.t9();
      double var7 = var2.c8().isLogarithmic() ? var2.n5(var2.w1()) : var2.w1();
      double var9 = (float)(var2.c8().isLogarithmic() ? var2.n5(var2.j5()) : var2.j5());
      if (var2.c8().getShowMajorGridLines() && var7 > 0.0 || var2.c8().getShowMinorGridLines() && var9 > 0.0) {
         IRotation3D var11 = var1.n3().getRotation3D();
         float var12 = var1.e5().c8();
         var12 *= (var11.getDepthPercents() & 65535) / 100.0F;
         float var13 = var12 * ((var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var14 = 0.0F;
         float var15 = var12 + var13;
         if (!var1.n3().getRotation3D().getRightAngleAxes()) {
            var14 = -(var12 + var13);
         }

         int var16 = var2.c8().getBaseUnitScale();
         double var17;
         if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
            var17 = p4.n5(
                  var16,
                  com.aspose.slides.internal.v6g.k5.u3(var3, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var3, 14),
                  false
               )
               + 1.0;
         } else {
            var17 = var3 - var5;
         }

         float var19 = var1.e5().l6();
         float var20 = var1.e5().k5();
         float var21 = var1.e5().u3() / (float)var17;
         float var22 = var1.e5().a6();
         if (var2.c8().getShowMajorGridLines() && var7 > 0.0) {
            double var23;
            if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
               var23 = p4.l6(
                  var2.c8().getBaseUnitScale(),
                  var2.m1(),
                  com.aspose.slides.internal.v6g.k5.u3(var7, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                  false
               );
            } else {
               var23 = var5;
            }

            while (var23 <= var3 || var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1 && var23 <= var3) {
               double var25;
               if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
                  var25 = p4.n5(
                     var16,
                     com.aspose.slides.internal.v6g.k5.u3(var23, 14),
                     com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                     com.aspose.slides.internal.v6g.k5.u3(var3, 14),
                     false
                  );
               } else {
                  var25 = var23 - var5;
               }

               float var27 = (float)(var19 + var21 * var25);
               float var28 = (float)(var19 + var21 * var25);
               float var29 = var20 - var22;
               com.aspose.slides.internal.x4g.s7 var30 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var30.l6(var27, var20, var28, var29);
                  var2.l6(var30, 0.0F, var14);
               } finally {
                  if (var30 != null) {
                     var30.dispose();
                  }
               }

               com.aspose.slides.internal.x4g.s7 var31 = new com.aspose.slides.internal.x4g.s7();

               try {
                  float var32 = 0.01F;
                  if (var2.c8().getMajorGridLinesFormat().getLine() != null
                     && !com.aspose.slides.ms.System.d2.k5(var2.c8().getMajorGridLinesFormat().getLine().getWidth())) {
                     var32 = (float)var2.c8().getMajorGridLinesFormat().getLine().getWidth();
                  }

                  var31.l6(var27, var20, var27 + var32, var20);
                  var2.l6(var31, -var15, var14);
               } finally {
                  if (var31 != null) {
                     var31.dispose();
                  }
               }

               if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
                  var23 = p4.l6(
                     var2.c8().getBaseUnitScale(),
                     var2.m1(),
                     com.aspose.slides.internal.v6g.k5.u3(var7, 14),
                     com.aspose.slides.internal.v6g.k5.u3(var23, 14),
                     false
                  );
               } else {
                  var23 += var7;
               }
            }
         }

         if (var2.c8().getShowMinorGridLines() && var9 > 0.0) {
            double var57;
            if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
               var57 = p4.l6(
                  var2.c8().getBaseUnitScale(),
                  var2.k7(),
                  com.aspose.slides.internal.v6g.k5.u3(var9, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                  false
               );
            } else {
               var57 = var5 + var9;
            }

            while (var57 <= var3 || var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1 && var57 <= var3) {
               double var58;
               if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
                  var58 = p4.n5(
                     var16,
                     com.aspose.slides.internal.v6g.k5.u3(var57, 14),
                     com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                     com.aspose.slides.internal.v6g.k5.u3(var3, 14),
                     false
                  );
               } else {
                  var58 = var57 - var5;
               }

               float var59 = (float)(var19 + var21 * var58);
               float var60 = (float)(var19 + var21 * var58);
               float var61 = var20 - var22;
               com.aspose.slides.internal.x4g.s7 var62 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var62.l6(var59, var20, var60, var61);
                  var2.k5(var62, 0.0F, var14);
               } finally {
                  if (var62 != null) {
                     var62.dispose();
                  }
               }

               com.aspose.slides.internal.x4g.s7 var63 = new com.aspose.slides.internal.x4g.s7();

               try {
                  float var64 = 0.01F;
                  if (var2.c8().getMinorGridLinesFormat().getLine() != null) {
                     var64 = (float)var2.c8().getMinorGridLinesFormat().getLine().getWidth();
                  }

                  var63.l6(var59, var20, var59 + var64, var20);
                  var2.k5(var63, -var15, var14);
               } finally {
                  if (var63 != null) {
                     var63.dispose();
                  }
               }

               if (var2.y4() == 0 && var2.c8().getCategoryAxisType() == 1) {
                  var57 = p4.l6(
                     var2.c8().getBaseUnitScale(),
                     var2.k7(),
                     com.aspose.slides.internal.v6g.k5.u3(var9, 14),
                     com.aspose.slides.internal.v6g.k5.u3(var57, 14),
                     false
                  );
               } else {
                  var57 += var9;
               }
            }
         }
      }
   }

   private void k5(n1g var1, l5 var2) {
      if (var2.y4() == 4) {
         float var3 = (float)var2.e2();
         float var4 = (float)var2.t9();
         float var5 = (float)(var2.c8().isLogarithmic() ? var2.n5(var2.w1()) : var2.w1());
         float var6 = (float)(var2.c8().isLogarithmic() ? var2.n5(var2.j5()) : var2.j5());
         if (var2.c8().getShowMajorGridLines() && var5 > 0.0F || var2.c8().getShowMinorGridLines() && var6 > 0.0F) {
            if (u6p.l6(var1.n3())) {
               var3 -= com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(var6));
            }

            IRotation3D var7 = var1.n3().getRotation3D();
            float var8 = var7.getRotationY() & 65535;
            float var9 = var1.e5().c8();
            var9 *= (var7.getDepthPercents() & 65535) / 100.0F;
            float var10 = var9 * ((var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
            float var11 = -(var9 + var10);
            if (var7.getRightAngleAxes()) {
               var11 = var9 + var10;
            }

            float var12 = var3 - var4;
            float var13 = var1.e5().l6();
            float var14 = var1.e5().k5() - var1.e5().a6();
            float var15 = var1.e5().l6() + var1.e5().u3();
            float var16 = var1.e5().k5();
            if (var2.c8().getShowMinorGridLines() && var6 > 0.0F) {
               for (float var17 = var4; var17 <= var3; var17 += var6) {
                  double var18 = var17 - var4;
                  float var20 = (float)(var18 * var11) / var12;
                  com.aspose.slides.internal.x4g.s7 var21 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     if (var8 < 180.0F) {
                        var21.l6(var13, var14, var13, var16);
                     } else {
                        var21.l6(var15, var14, var15, var16);
                     }

                     var2.k5(var21, 0.0F, var20);
                  } finally {
                     if (var21 != null) {
                        var21.dispose();
                     }
                  }

                  com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var22.l6(var13, var16, var15, var16);
                     var2.k5(var22, 0.0F, var20);
                  } finally {
                     if (var22 != null) {
                        var22.dispose();
                     }
                  }
               }
            }

            if (var2.c8().getShowMajorGridLines() && var5 > 0.0F) {
               for (float var49 = var4; var49 <= var3; var49 += var5) {
                  float var24 = var49 - var4;
                  float var25 = var24 * var11 / var12;
                  com.aspose.slides.internal.x4g.s7 var50 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     if (var8 < 180.0F) {
                        var50.l6(var13, var14, var13, var16);
                     } else {
                        var50.l6(var15, var14, var15, var16);
                     }

                     var2.l6(var50, 0.0F, var25);
                  } finally {
                     if (var50 != null) {
                        var50.dispose();
                     }
                  }

                  com.aspose.slides.internal.x4g.s7 var51 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var51.l6(var13, var16, var15, var16);
                     var2.l6(var51, 0.0F, var25);
                  } finally {
                     if (var51 != null) {
                        var51.dispose();
                     }
                  }
               }
            }
         }
      }
   }
}
