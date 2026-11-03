package com.aspose.slides;

class t3 extends v8r {
   static void n5(v5s var0) {
      a9x var1 = var0.a6();
      com.aspose.slides.internal.k0r.q5 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.k5(), com.aspose.slides.internal.k0r.q5.class);
      AutoShape var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), AutoShape.class);
      if (var3 == null) {
         var3 = var0.h0().y4();
         var1.n5(var3);
      }

      l6(var0);
      var3.n5(var3.k7().x8().t2() == 202);
      int var4 = s1f.n5(var2.u3().t2());
      if (var4 == 0) {
         if (var2.u3().t2() != 0 && var2.u3().t2() != 100) {
            AutoShapeImp var5 = AutoShapeImp.n5(var2.u3().t2());
            n5(var3.e2(), var5, var2);
         } else {
            new w8e(var3.e2(), var2);
            if (var3.e2().u9() == null) {
               var1.x8();
               var1.y4().m3().removeItemByKey(var0.t2());
               return;
            }
         }
      } else if (var2.u3().c8()) {
         var3.e2().l6(var4);
      }

      if (!var1.z3().y4()) {
         m3e.n5(var3.getFillFormat(), var1);
         r9a.n5(var3.getLineFormat(), s1f.l6(var3.getShapeType()), false, var1);
         f7k.n5(var3.getEffectFormat(), var1);
         d3r.n5(var3.getThreeDFormat(), false, var1);
      }

      if (var3.e2().l6() != null) {
         IShapeFrame var42 = var3.getFrame();
         AutoShapeImp var6 = AutoShapeImp.n5(var2.u3().t2());
         int[] var7;
         if (var6 != null && var6.n5() != null) {
            var7 = new int[com.aspose.slides.ms.System.q1.n5(var3.e2().l6().length, var6.n5().length)];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var6.n5())), com.aspose.slides.ms.System.u3.n5((Object)(var7)), var6.n5().length);
         } else {
            var7 = new int[var3.e2().l6().length];
         }

         for (int var8 = 0; var8 < var7.length; var8++) {
            com.aspose.slides.internal.k0r.z5 var9 = var2.a6() != null
               ? com.aspose.slides.internal.v6g.k5.n5(var2.a6().l6().n5(var8 + 327), com.aspose.slides.internal.k0r.z5.class)
               : null;
            if (var9 != null) {
               var7[var8] = (int)var9.j5();
            }
         }

         for (int var43 = 0; var43 < var3.e2().l6().length; var43++) {
            var3.e2().l6()[var43] = new y2(com.aspose.slides.ms.System.d1.n5(new String[]{"adj", com.aspose.slides.ms.System.a3.l6(var43)}), 0L);
         }

         s1f.n5(var3.e2().l6(), var3.e2().x8(), var7, var42.getWidth(), var42.getHeight());
         if (var4 == 89) {
            double var10 = var3.e2().l6()[0].l6() % 360.0F;
            double var12 = var3.e2().l6()[1].l6() % 360.0F;
            double var14 = var10 / 180.0 * Math.PI;
            double var16 = var12 / 180.0 * Math.PI;
            double var18 = com.aspose.slides.ms.System.q1.c8(var14) / 2.0 + 0.5;
            double var20 = com.aspose.slides.ms.System.q1.h0(var14) / 2.0 + 0.5;
            double var22 = com.aspose.slides.ms.System.q1.c8(var16) / 2.0 + 0.5;
            double var24 = com.aspose.slides.ms.System.q1.h0(var16) / 2.0 + 0.5;
            double var26 = com.aspose.slides.ms.System.q1.k5(var18, var22);
            double var28 = com.aspose.slides.ms.System.q1.k5(var20, var24);
            double var30 = com.aspose.slides.ms.System.q1.l6(var18, var22);
            double var32 = com.aspose.slides.ms.System.q1.l6(var20, var24);
            if (var26 > 0.5) {
               var26 = 0.5;
            }

            if (var30 < 0.5) {
               var30 = 0.5;
            }

            if (var28 > 0.5) {
               var28 = 0.5;
            }

            if (var32 < 0.5) {
               var32 = 0.5;
            }

            if (var10 > var12) {
               var12 += 360.0;
            }

            if (var12 > 360.0) {
               var30 = 1.0;
            }

            if (var10 < 90.0 && var12 > 90.0) {
               var32 = 1.0;
            }

            if (var10 < 180.0 && var12 > 180.0) {
               var26 = 0.0;
            }

            if (var10 < 270.0 && var12 > 270.0) {
               var28 = 0.0;
            }

            double var34 = var42.getWidth() / (var30 - var26);
            double var36 = var42.getHeight() / (var32 - var28);
            double var38 = var42.getX() - var26 * var34;
            double var40 = var42.getY() - var28 * var36;
            var3.setFrame(new ShapeFrame(var38, var40, var34, var36, var42.getFlipH(), var42.getFlipV(), var42.getRotation()));
         }
      }

      n5(var1);
      var3.c8();
   }

   static void n5(a9x var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), AutoShape.class);
      if (var1 != null) {
         g5x.n5(var0.z3());
         var0.z3().n5();
      }
   }
}
