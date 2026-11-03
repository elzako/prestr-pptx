package com.aspose.slides;

class o8m {
   static void n5(n1g var0, boolean var1, com.aspose.slides.internal.o9b.y2 var2) {
      if (!k5(var0.n3().getType())) {
         if (u6p.l6(var0.n3())) {
            k5(var0, var1, var2.n3());
         } else {
            l6(var0, var1, var2.n3());
         }
      }
   }

   private static void l6(n1g var0, boolean var1, com.aspose.slides.internal.o9b.y2 var2) {
      if (!k5(var0.n3().getType())) {
         int var3 = var0.n3().getType();
         IRotation3D var4 = var0.n3().getRotation3D();
         float var5 = (var4.getDepthPercents() & 65535) / 100.0F;
         float var6 = (var0.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
         float var7 = (var0.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
         int var8 = n1g.u3(var0.y4());
         int var9;
         if (var0.q0().c8().getCategoryAxisType() == 1) {
            if (l6(var3)) {
               var9 = var0.q0().d5();
            } else {
               var9 = p4.n5(
                     var0.q0().c8().getBaseUnitScale(),
                     com.aspose.slides.internal.v6g.k5.u3(var0.q0().z3(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var0.q0().q0(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var0.q0().z3(), 14),
                     false
                  )
                  + 1;
            }
         } else if (l6(var3)) {
            var9 = l5.n5(var0.q0(), var8);
         } else {
            var9 = var8;
         }

         int var10 = n5(var3) ? 1 : var0.y4().size();
         float var11;
         if (!u6p.k5(var0.n3())) {
            var11 = var9 * (var10 + var7) / (1.0F + var6);
         } else {
            var11 = (float)var9 / var10;
         }

         float var12 = 1.0F;
         if (var0.y4().size() != 1 || var3 != 6 && var3 != 14 && var3 != 10 && var3 != 18 && var3 != 25) {
            if (var3 == 6 || var3 == 25) {
               var12 = 0.7F;
            }
         } else {
            var12 = 0.67F;
         }

         float var13 = var4.getRotationY() & 65535;
         float var14 = var4.getRotationX();
         float var15 = var2.t2();
         float var16 = var2.l6() * var12;
         if (!var4.getRightAngleAxes() && com.aspose.slides.ms.System.q1.n5(var13) + com.aspose.slides.ms.System.q1.n5(var14) >= 10.0F) {
            if (var3 == 6) {
               var16 = var2.l6() * var12;
               var15 = var2.t2() * var12;
            }

            if (var3 == 3 || var3 == 4 || var3 == 5 || var3 == 33 || var3 == 36 || var3 == 37) {
               float var17 = 1.0F + (var4.getPerspective() & 0xFF) / 200.0F;
               var15 /= var17;
               var16 /= var17;
            }
         }

         float var36 = !var1 ? var15 / var11 : var16 / var11;
         double var18 = com.aspose.slides.ms.System.q1.h0(var13 * Math.PI / 180.0);
         double var20 = com.aspose.slides.ms.System.q1.h0(var14 * Math.PI / 180.0);
         if (!var4.getRightAngleAxes()) {
            var18 = com.aspose.slides.ms.System.q1.h0(var13 * Math.PI / 180.0);
            var20 = com.aspose.slides.ms.System.q1.h0(var14 * Math.PI / 180.0);
            if (var3 == 3 || var3 == 33 || var3 == 5) {
               var18 = com.aspose.slides.ms.System.q1.h0(var13 * Math.PI / 180.0) * 2.0;
               var20 = com.aspose.slides.ms.System.q1.h0(var14 * Math.PI / 180.0) * 2.0;
            } else if (var3 == 6 || var3 == 25) {
               var18 = com.aspose.slides.ms.System.q1.h0(var13 * Math.PI / 180.0) / 2.0;
               var20 = com.aspose.slides.ms.System.q1.h0(var14 * Math.PI / 180.0) / 2.0;
            }
         }

         float var22 = (float)(var18 * (var36 * var5));
         float var23 = (float)(var20 * (var36 * var5));
         float var24 = (var15 + com.aspose.slides.ms.System.q1.n5(var22) - 2.0F) / var2.t2();
         float var25 = (var16 + com.aspose.slides.ms.System.q1.n5(var23) - 2.0F) / var2.l6();
         float var26 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var24, var25), 1.0F);
         float var27 = var15 / var26;
         float var28 = var16 / var26;
         float var29 = com.aspose.slides.ms.System.q1.l6(var22);
         float var30 = com.aspose.slides.ms.System.q1.l6(var23);
         float var31;
         float var32;
         if (var0.n3().getRotation3D().getRightAngleAxes()) {
            var31 = var2.s7() + (var2.t2() - var27 + var22 / var26 - 4.0F * var29) / 2.0F;
            var32 = var2.x8() + var28 + (var2.l6() - var28 - var23 / var26 + 4.0F * var30) / 2.0F;
         } else if (!var0.n3().hasDataTable() && var3 != 6 && var3 != 37 && var3 != 36 && var3 != 5 && var3 != 25) {
            var31 = var2.s7() + (var2.t2() - var27) / 2.0F;
            var32 = var2.x8() + var28 + (var2.l6() - var28 + var23 / var26 + 4.0F * var30) / 2.0F;
         } else {
            var31 = var2.s7() + (var2.t2() - var27 - var22 - 4.0F * var29) / 2.0F;
            if (var3 == 6) {
               var32 = var2.x8() + var28 + (var2.l6() - var28) / 2.0F + var23;
            } else {
               var32 = var2.x8() + var28 + (var2.l6() - var28) / 2.0F;
            }
         }

         var0.e5().n5(var31);
         var0.e5().l6(var32);
         var0.e5().k5(var27);
         var0.e5().u3(var28);
         var0.e5().a6(var36 / var26);
         var0.e5().u9(var22 / var26);
         var0.e5().h0(var23 / var26);
         var0.e5().c8(var26);
         var0.i1().n5(var31);
         var0.i1().l6(var32);
         var0.i1().k5(var27);
         var0.i1().u3(var28);
         var0.i1().a6(0.0F);
         var0.i1().t2(var31);
         var0.i1().s7(var32 - var28);
         var0.i1().x8(var31 + var27);
         var0.i1().n3(var32);
         float var33 = var0.e5().h0() * var5 / (1.0F + var6);
         float var34 = var33 * var6;
         float var35 = var33 + var34;
         if (!var1) {
            n5(var0.f2(), var13, var14, var31, var32, var28, var27, var35);
            l6(var0.b3(), var13, var14, var31, var32, var28, var27, var35);
         } else {
            n5(var0.b3(), var13, var14, var31, var32, var28, var27, var35);
            l6(var0.f2(), var13, var14, var31, var32, var28, var27, var35);
         }
      }
   }

   private static void k5(n1g var0, boolean var1, com.aspose.slides.internal.o9b.y2 var2) {
      if (!k5(var0.n3().getType())) {
         int var3 = var0.n3().getType();
         IRotation3D var4 = var0.n3().getRotation3D();
         float var5 = (var4.getDepthPercents() & 65535) / 100.0F;
         float var6 = (var0.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
         float var7 = var4.getRotationY() & 65535;
         float var8 = var4.getRotationX();
         double var9 = com.aspose.slides.ms.System.q1.h0(var7 * Math.PI / 180.0);
         double var11 = com.aspose.slides.ms.System.q1.h0(var8 * Math.PI / 180.0);
         int var13 = n1g.u3(var0.y4());
         int var17;
         if (var0.q0().c8().getCategoryAxisType() == 1) {
            if (!l6(var3)) {
               int var14 = var0.q0().c8().getBaseUnitScale();
               int var15 = com.aspose.slides.internal.v6g.k5.u3(var0.q0().z3(), 14);
               int var16 = com.aspose.slides.internal.v6g.k5.u3(var0.q0().q0(), 14);
               var17 = p4.n5(var14, var15, var16, var15, false) + 1;
            } else {
               var17 = var0.q0().d5();
            }
         } else {
            var17 = l6(var3) ? l5.n5(var0.q0(), var13) : var13;
         }

         float var38 = (float)var17 / var0.y4().size();
         float var39 = 0.95F;
         float var40 = 0.6F;
         float var18 = 1.0F;
         if (var4.getRightAngleAxes()) {
            if (var38 >= 1.0F) {
               var40 = 0.5F * (1.0F + 1.0F / (var38 * var38 + 1.0F));
            } else {
               var40 = 0.5F * (1.0F + 1.0F / (var38 * var38));
            }

            var18 = var39;
         } else if (var38 < 1.0F) {
            var40 = 0.5F * (1.0F + (float)(var9 * var11) / var38);
            var39 = var40;
         } else {
            var18 = var39;
            var39 = 0.8F;
         }

         if (var40 > 1.0F) {
            var40 = 1.0F;
         }

         float var19 = var2.t2() * var39;
         float var20 = var2.l6() * var40;
         float var21 = var19 / var38;
         float var22 = 0.0F;
         float var23 = 0.0F;
         float var24 = (float)(var9 * (var21 * var5));
         float var25 = (float)(var11 * (var21 * var5));
         float var26 = (var19 + var24) / var2.t2();
         float var27 = (var20 + var25) / var2.l6();
         float var28 = var4.getRightAngleAxes()
            ? com.aspose.slides.ms.System.q1.n5((float)(com.aspose.slides.ms.System.q1.n5((float)(var26), (float)(var27))), (float)(1.0F))
            : com.aspose.slides.ms.System.q1.n5((float)(com.aspose.slides.ms.System.q1.l6(var26, var27)), (float)(1.0F));
         float var29 = var19 / var28;
         float var30 = var20 / var28;
         float var31 = com.aspose.slides.ms.System.q1.l6(var24);
         float var32 = com.aspose.slides.ms.System.q1.l6(var25);
         float var33;
         float var34;
         if (var0.n3().getRotation3D().getRightAngleAxes()) {
            var33 = var2.s7() + (var2.t2() - var29 + var24 / var28 - 4.0F * var31) / 2.0F;
            var34 = var2.x8() + var30 + (var2.l6() - var30 - var25 / var28 + 8.0F * var32) / 2.0F;
         } else {
            float var35 = com.aspose.slides.ms.System.q1.n5((float)(var24), (float)(var25));
            var33 = var2.s7() + (var2.t2() - var29 - 4.0F * var31) / 2.0F - (float)var9 * var35;
            var34 = var2.x8() + var30 + (var2.l6() - var30) / 2.0F + (float)var11 * var35;
         }

         var0.e5().n5(var33);
         var0.e5().l6(var34);
         var0.e5().k5(var29);
         var0.e5().u3(var30);
         var0.e5().a6(var21 * var18 / var28);
         var0.e5().u9(var22 / var28);
         var0.e5().h0(var23 / var28);
         var0.e5().c8(var28);
         var0.i1().n5(var33);
         var0.i1().l6(var34);
         var0.i1().k5(var29);
         var0.i1().u3(var30);
         var0.i1().a6(0.0F);
         var0.i1().t2(var33);
         var0.i1().s7(var34 - var30);
         var0.i1().x8(var33 + var29);
         var0.i1().n3(var34);
         float var41 = var0.e5().h0() * var5 / (1.0F + var6);
         float var36 = var41 * var6;
         float var37 = var41 + var36;
         if (!var1) {
            n5(var0.f2(), var7, var8, var33, var34, var30, var29, var37);
            l6(var0.b3(), var7, var8, var33, var34, var30, var29, var37);
         } else {
            n5(var0.b3(), var7, var8, var33, var34, var30, var29, var37);
            l6(var0.f2(), var7, var8, var33, var34, var30, var29, var37);
         }
      }
   }

   private static void n5(y9r var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1 < 180.0F) {
         var0.n5(var3);
         var0.l6(var4);
         var0.u3(var5);
         var0.k5(1.0F);
         var0.a6(var7);
         var0.t2(var3);
         var0.s7(var4 - var5 - 1.0F);
         var0.x8(var3);
         var0.n3(var4);
         var0.a6(var7);
      } else {
         var0.n5(var3 + var6);
         var0.l6(var4);
         var0.u3(var5);
         var0.k5(1.0F);
         var0.a6(var7);
         var0.t2(var3 + var6);
         var0.s7(var4 - var5);
         var0.x8(var3 + var6 + 1.0F);
         var0.n3(var4);
      }
   }

   private static void l6(y9r var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var2 >= 0.0F) {
         var0.t2(var3);
         var0.s7(var4);
         var0.x8(var3 + var6);
         var0.n3(var4);
         var0.a6(var7);
      } else {
         var0.t2(0.0F);
         var0.s7(0.0F);
         var0.x8(0.0F);
         var0.n3(0.0F);
         var0.a6(0.0F);
      }
   }

   private static boolean n5(int var0) {
      switch (var0) {
         case 4:
         case 5:
         case 8:
         case 9:
         case 12:
         case 13:
         case 16:
         case 17:
         case 36:
         case 37:
         case 39:
         case 40:
         case 42:
         case 43:
         case 45:
         case 46:
            return true;
         case 6:
         case 7:
         case 10:
         case 11:
         case 14:
         case 15:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 38:
         case 41:
         case 44:
         default:
            return false;
      }
   }

   private static boolean l6(int var0) {
      switch (var0) {
         case 25:
         case 50:
         case 51:
         case 52:
            return true;
         default:
            return false;
      }
   }

   private static boolean k5(int var0) {
      switch (var0) {
         case 27:
         case 30:
            return true;
         default:
            return false;
      }
   }
}
