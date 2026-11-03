package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class o5m {
   static void n5(IEffectFormat var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      com.aspose.slides.internal.k0r.r3 var3 = var2.a6();
      com.aspose.slides.internal.k0r.a9 var4 = var2.h0();
      com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(517), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(518), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(528), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(529), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(521), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var10 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(524), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var11 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(522), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var12 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(523), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var13 = var4 == null
         ? null
         : com.aspose.slides.internal.v6g.k5.n5(var4.l6().n5(540), com.aspose.slides.internal.k0r.z5.class);
      v5s var14 = var1.z1();
      if (var14 != null) {
         var2 = (com.aspose.slides.internal.k0r.q5)var14.k5();
         var3 = var2.a6();
         var4 = var2.h0();
         com.aspose.slides.internal.k0r.z5 var15 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(517), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var16 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(518), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var17 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(528), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var18 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(529), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var19 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(521), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var20 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(524), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var21 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(522), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var22 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(523), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var23 = var4 == null
            ? null
            : com.aspose.slides.internal.v6g.k5.n5(var4.l6().n5(540), com.aspose.slides.internal.k0r.z5.class);
         if (var5 == null) {
            var5 = var15;
         }

         if (var6 == null) {
            var6 = var16;
         }

         if (var7 == null) {
            var7 = var17;
         }

         if (var8 == null) {
            var8 = var18;
         }

         if (var9 == null) {
            var9 = var19;
         }

         if (var10 == null) {
            var10 = var20;
         }

         if (var11 == null) {
            var11 = var21;
         }

         if (var12 == null) {
            var12 = var22;
         }

         if (var13 == null) {
            var13 = var23;
         }
      }

      var0.enableOuterShadowEffect();
      IOuterShadow var30 = var0.getOuterShadowEffect();
      var30.setBlurRadius(var13 != null ? (int)var13.j5() / 12700.0 : 0.0);
      p0s var31 = g0t.n5(var5, var6).n5();
      var30.setDistance(var31.n5);
      var30.setDirection(var31.l6);
      u0b.n5(var30.getShadowColor(), var2, 513, 516, 8421504L);
      long var24 = 0L;
      long var26 = 0L;
      if (var7 != null) {
         var24 = var7.j5();
      }

      if (var8 != null) {
         var26 = var8.j5();
      }

      if (var24 == 4294934528L && var26 == 4294934528L) {
         var30.setRectangleAlign((byte)0);
      } else if ((var24 & 4294967295L) == 0L && var26 == 4294934528L) {
         var30.setRectangleAlign((byte)1);
      } else if ((var24 & 4294967295L) == 32768L && var26 == 4294934528L) {
         var30.setRectangleAlign((byte)2);
      } else if (var24 == 4294934528L && (var26 & 4294967295L) == 0L) {
         var30.setRectangleAlign((byte)3);
      } else if ((var24 & 4294967295L) == 0L && (var26 & 4294967295L) == 0L) {
         var30.setRectangleAlign((byte)4);
      } else if ((var24 & 4294967295L) == 32768L && (var26 & 4294967295L) == 0L) {
         var30.setRectangleAlign((byte)5);
      } else if (var24 == 4294934528L && (var26 & 4294967295L) == 32768L) {
         var30.setRectangleAlign((byte)6);
      } else if ((var24 & 4294967295L) == 0L && (var26 & 4294967295L) == 32768L) {
         var30.setRectangleAlign((byte)7);
      } else if ((var24 & 4294967295L) == 32768L && (var26 & 4294967295L) == 32768L) {
         var30.setRectangleAlign((byte)8);
      } else {
         var1.y4().a6().n5().a6().n5("Loading of non-predefined OuterShadow.RectangleAlign ppt data is not implemented yet.", 3);
      }

      int var32 = var9 != null ? (int)var9.j5() : 65536;
      int var33 = var10 != null ? (int)var10.j5() : 65536;
      int var34 = var11 != null ? (int)var11.j5() : 0;
      int var35 = var12 != null ? (int)var12.j5() : 0;
      var30.setScaleHorizontal(var32 * 100.0 / 65536.0);
      var30.setScaleVertical(var33 * 100.0 / 65536.0);
      var30.setSkewHorizontal(com.aspose.slides.ms.System.q1.t9((double)var34 / var32) * 180.0 / Math.PI);
      var30.setSkewVertical(com.aspose.slides.ms.System.q1.t9((double)var35 / var33) * 180.0 / Math.PI);
   }

   static void n5(IOuterShadow var0, k1z var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.r3 var2 = var1.z3().a6();
         com.aspose.slides.internal.k0r.w8 var3 = var2.l6();
         com.aspose.slides.internal.k0r.w8 var4 = var1.z3().h0().l6();
         if (var0.getBlurRadius() != 0.0) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(540, com.aspose.slides.internal.v6g.k5.a6(var0.getBlurRadius() * 12700.0 + 0.5, 14)));
         }

         g0t.n5(new p0s(var0.getDistance(), var0.getDirection()), var2);
         u0b.n5(var0.getShadowColor(), var3, 513, 516, var1.u3().a6().n5());
         switch (var0.getRectangleAlign()) {
            case -1:
            case 7:
               var3.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
               break;
            case 0:
               var3.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
               var3.l6(new com.aspose.slides.internal.k0r.z5(529, 4294934528L));
               break;
            case 1:
               var3.l6(new com.aspose.slides.internal.k0r.z5(529, 4294934528L));
               break;
            case 2:
               var3.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
               var3.l6(new com.aspose.slides.internal.k0r.z5(529, 4294934528L));
               break;
            case 3:
               var3.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
            case 4:
               break;
            case 5:
               var3.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
               break;
            case 6:
               var3.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
               var3.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
               break;
            case 8:
               var3.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
               var3.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
               break;
            default:
               throw new Exception();
         }

         int var5 = 65536;
         int var6 = 65536;
         if (var0.getScaleHorizontal() != 100.0) {
            var3.l6(
               new com.aspose.slides.internal.k0r.z5(
                  521,
                  (
                        var5 = com.aspose.slides.internal.v6g.k5.u3(
                           var0.getScaleHorizontal() * 65536.0 / 100.0 + com.aspose.slides.ms.System.q1.u9(var0.getScaleHorizontal()) * 0.5, 14
                        )
                     )
                     & 4294967295L
               )
            );
         }

         if (var0.getScaleVertical() != 100.0) {
            var3.l6(
               new com.aspose.slides.internal.k0r.z5(
                  524,
                  (
                        var6 = com.aspose.slides.internal.v6g.k5.u3(
                           var0.getScaleVertical() * 65536.0 / 100.0 + com.aspose.slides.ms.System.q1.u9(var0.getScaleVertical()) * 0.5, 14
                        )
                     )
                     & 4294967295L
               )
            );
         }

         if (var0.getSkewHorizontal() != 0.0) {
            var3.l6(
               new com.aspose.slides.internal.k0r.z5(
                  522,
                  com.aspose.slides.internal.v6g.k5.a6(
                     var5 * com.aspose.slides.ms.System.q1.t2(var0.getSkewHorizontal() * Math.PI / 180.0)
                        + com.aspose.slides.ms.System.q1.u9(var0.getSkewHorizontal()) * 0.5,
                     14
                  )
               )
            );
         }

         if (var0.getSkewVertical() != 0.0) {
            var3.l6(
               new com.aspose.slides.internal.k0r.z5(
                  523,
                  com.aspose.slides.internal.v6g.k5.a6(
                     var6 * com.aspose.slides.ms.System.q1.t2(var0.getSkewVertical() * Math.PI / 180.0)
                        + com.aspose.slides.ms.System.q1.u9(var0.getSkewVertical()) * 0.5,
                     14
                  )
               )
            );
         }
      }
   }

   public static void n5(IOuterShadowEffectiveData var0, k1z var1) {
      if (var0 != null) {
         k0p var2 = com.aspose.slides.internal.v6g.k5.n5(var0, k0p.class);
         com.aspose.slides.internal.k0r.r3 var3 = var1.z3().a6();
         com.aspose.slides.internal.k0r.w8 var4 = var3.l6();
         com.aspose.slides.internal.k0r.w8 var5 = var1.z3().h0().l6();
         if (var2.getBlurRadius() != 0.0) {
            var5.l6(new com.aspose.slides.internal.k0r.z5(540, com.aspose.slides.internal.v6g.k5.a6(var2.getBlurRadius() * 12700.0 + 0.5, 14)));
         }

         g0t.n5(new p0s(var2.getDistance(), var2.getDirection()), var3);
         u0b.n5(var2.n5.k5(), var4, 513, 516, var1.u3().a6().n5());
         switch (var2.getRectangleAlign()) {
            case -1:
            case 7:
               var4.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
               break;
            case 0:
               var4.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(529, 4294934528L));
               break;
            case 1:
               var4.l6(new com.aspose.slides.internal.k0r.z5(529, 4294934528L));
               break;
            case 2:
               var4.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(529, 4294934528L));
               break;
            case 3:
               var4.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
            case 4:
               break;
            case 5:
               var4.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
               break;
            case 6:
               var4.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
               break;
            case 8:
               var4.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
               break;
            default:
               throw new Exception();
         }

         int var6 = 65536;
         int var7 = 65536;
         if (var2.getScaleHorizontal() != 100.0) {
            var4.l6(
               new com.aspose.slides.internal.k0r.z5(
                  521,
                  (
                        var6 = com.aspose.slides.internal.v6g.k5.u3(
                           var2.getScaleHorizontal() * 65536.0 / 100.0 + com.aspose.slides.ms.System.q1.u9(var2.getScaleHorizontal()) * 0.5, 14
                        )
                     )
                     & 4294967295L
               )
            );
         }

         if (var2.getScaleVertical() != 100.0) {
            var4.l6(
               new com.aspose.slides.internal.k0r.z5(
                  524,
                  (
                        var7 = com.aspose.slides.internal.v6g.k5.u3(
                           var2.getScaleVertical() * 65536.0 / 100.0 + com.aspose.slides.ms.System.q1.u9(var2.getScaleVertical()) * 0.5, 14
                        )
                     )
                     & 4294967295L
               )
            );
         }

         if (var2.getSkewHorizontal() != 0.0) {
            var4.l6(
               new com.aspose.slides.internal.k0r.z5(
                  522,
                  com.aspose.slides.internal.v6g.k5.a6(
                     var6 * com.aspose.slides.ms.System.q1.t2(var2.getSkewHorizontal() * Math.PI / 180.0)
                        + com.aspose.slides.ms.System.q1.u9(var2.getSkewHorizontal()) * 0.5,
                     14
                  )
               )
            );
         }

         if (var2.getSkewVertical() != 0.0) {
            var4.l6(
               new com.aspose.slides.internal.k0r.z5(
                  523,
                  com.aspose.slides.internal.v6g.k5.a6(
                     var7 * com.aspose.slides.ms.System.q1.t2(var2.getSkewVertical() * Math.PI / 180.0)
                        + com.aspose.slides.ms.System.q1.u9(var2.getSkewVertical()) * 0.5,
                     14
                  )
               )
            );
         }
      }
   }
}
