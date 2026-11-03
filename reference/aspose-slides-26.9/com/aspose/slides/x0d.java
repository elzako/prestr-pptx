package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class x0d extends k6 {
   public x0d(float var1) {
      super(var1, 100.0F);
   }

   public final boolean n5(e3 var1, s5u var2, GeometryShape var3, ShapeElement[] var4, ShapeFrame var5, IFillParamSource var6) {
      if (var4.length == 0) {
         return false;
      }

      g0 var7 = h4.n5(var3);
      if (var7 == null) {
         return false;
      }

      float[] var8 = h4.n5(var7.k5(), var7.n5(), var7.l6());
      if (var8 == null) {
         return false;
      }

      if (n7d.l6(var3.getShapeType()) && !n7d.n5((com.aspose.slides.Shape)(var3))) {
         return false;
      }

      x2i var9 = l0y.n5(var3);
      float var10 = var9 != null ? var9.l6() : 0.0F;
      int var11 = n5(var9, true);
      com.aspose.slides.internal.s6.r4 var12 = t4x.l6(var8).c8();
      var2.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.getWidth(), var3.getHeight()));
      a1v[] var13 = new a1v[6];
      float var14 = 1.0F;
      com.aspose.slides.internal.s6.s0 var15 = new com.aspose.slides.internal.s6.s0(0.0F);
      byte var16 = 0;
      com.aspose.slides.internal.o9b.y1 var17 = com.aspose.slides.internal.o9b.y1.n5.y4();

      for (ShapeElement var21 : var4) {
         if (var21.l6.h0() != 0) {
            boolean var22 = false;
            if (var21.getFillSource() != 0) {
               a1v var23 = var3.t9().n5(var1, var5, var21.l6, var13, var21.getFillSource(), var6, var2);
               var22 = var23 != null && var23.u3() != 0 && var23.u3() != -1;
            }

            if (var21.getStrokeSource() != 0) {
               l6v var42 = var3.t9().n5(var5, var1.q0(), var21.l6, var2);
               if (var42 != null && var42.u9() && var42.c8() != null && var42.c8().u3() != 0 && var42.c8().u3() != -1) {
                  var14 = com.aspose.slides.ms.System.q1.n5(var14, (float)var42.n5());
                  if (!var22 && (var42.s7() > 0 || var42.x8() > 0)) {
                     com.aspose.slides.internal.o9b.m3 var24 = var42.q0();
                     com.aspose.slides.internal.x4g.s7 var25 = (com.aspose.slides.internal.x4g.s7)var21.l6.deepClone();
                     com.aspose.slides.internal.n2d.y4.n5(var25, var24);
                     com.aspose.slides.internal.o9b.y1 var26 = var25.s7().y4();
                     var14 = com.aspose.slides.ms.System.q1.n5(var14, com.aspose.slides.ms.System.q1.l6(var26.s7(), var26.k5()));
                     com.aspose.slides.internal.s6.s0 var27 = new com.aspose.slides.internal.s6.s0(var5.getWidth(), var5.getHeight());
                     com.aspose.slides.internal.s6.s0 var28 = n5(var42.m1(), var42.s7(), var27.a6()).a6();
                     com.aspose.slides.internal.s6.s0 var29 = n5(var42.k7(), var42.x8(), var27.a6()).a6();
                     com.aspose.slides.internal.s6.s0.l6(var29, var28).n5(var15);
                  }

                  if (!var22 && !n7d.l6(var3.getShapeType()) && var42.n5() <= 1.0 && com.aspose.slides.ms.System.q1.n5(var12.k5() - 1.0F) < 1.0E-4) {
                     var22 = false;
                  } else {
                     var22 = true;
                  }
               }

               var16 += var22 ? 1 : 0;
            }

            if (com.aspose.slides.internal.o9b.y1.k5(var17, com.aspose.slides.internal.o9b.y1.n5) && var22) {
               var21.l6.s7().a6(var17);
            } else if (var22) {
               com.aspose.slides.internal.o9b.y1.l6(var17.y4(), var21.l6.s7().y4()).a6(var17);
            }
         }
      }

      if (var16 == 0) {
         return false;
      }

      com.aspose.slides.internal.o9b.y1 var37 = new com.aspose.slides.internal.o9b.y1();
      ShapeFrame var38 = var5;
      if (this.l6()) {
         var38 = var3.e5().n5(true);
      }

      com.aspose.slides.internal.o9b.y1[] var39 = new com.aspose.slides.internal.o9b.y1[]{var37};
      com.aspose.slides.internal.o9b.l6 var40 = this.n5(var1, var2, var3, var4, var38, var14, (byte)7, var39);
      var39[0].a6(var37);
      float var41 = var5.getCenterX();
      float var43 = var5.getCenterY();
      float var44 = var5.n5().s7() / 2.0F;
      float var45 = var5.n5().k5() / 2.0F;
      if (this.n5(var3)) {
         var41 = var17.x8() + var17.s7() / 2.0F;
         var43 = var17.n3() + var17.k5() / 2.0F;
         var44 = var17.s7() / 2.0F;
         var45 = var17.k5() / 2.0F;
      }

      com.aspose.slides.internal.s6.v3 var46 = new com.aspose.slides.internal.s6.v3(var44, var45, 0.0F);
      com.aspose.slides.internal.s6.s0 var47 = new com.aspose.slides.internal.s6.s0(var41, var43);
      if (var16 == 1) {
         if (var5.getFlipH() == 1 && !this.n5(var3)) {
            var15.n5(-var15.n5());
         }

         if (var5.getFlipV() == 1 && !this.n5(var3)) {
            var15.l6(-var15.l6());
         }

         com.aspose.slides.internal.s6.s0.n5(var47, this.n5(var3) ? com.aspose.slides.internal.s6.s0.n5(-2.0F, var15) : var15).n5(var47);
      } else {
         var15 = new com.aspose.slides.internal.s6.s0(0.0F);
      }

      y5x var48 = new y5x();
      var48.k5(var11);
      var48.n5(var40);
      var48.l6(var40);
      com.aspose.slides.internal.w0.c8 var49 = new com.aspose.slides.internal.w0.c8(
         var5.getFlipH() == 1 ? -1.0F : 1.0F,
         0.0F,
         0.0F,
         var5.getFlipV() == 1 ? -1.0F : 1.0F,
         !this.n5(var3) && var5.getFlipH() == 1 ? -var15.n5() * 2.0F : 0.0F,
         !this.n5(var3) && var5.getFlipV() == 1 ? var15.l6() * 2.0F : 0.0F
      );
      var48.n5(this.n5(var47.a6(), var10, var37.y4(), true, this.l6, var49));
      com.aspose.slides.internal.s6.v3 var30 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3 var31 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3[] var32 = new com.aspose.slides.internal.s6.v3[]{var30};
      com.aspose.slides.internal.s6.v3[] var33 = new com.aspose.slides.internal.s6.v3[]{var31};
      var48.h0().n5(var12.c8(), var32, var33);
      var32[0].l6(var30);
      var33[0].l6(var31);
      var46.n5(com.aspose.slides.internal.s6.w2.n5(var46.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var30.n5()), com.aspose.slides.ms.System.q1.n5(var31.n5())}));
      var46.l6(com.aspose.slides.internal.s6.w2.n5(var46.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var30.l6()), com.aspose.slides.ms.System.q1.n5(var31.l6())}));
      List var34 = new List();
      var34.addItem(var48);
      com.aspose.slides.internal.s6.s0 var35 = (this.n5(var3) ? this.n5(var47.a6(), var5) : var47).a6();
      List var36 = new List();
      var36.addItem(j4u.n5());
      this.n5(var1, var3, var34, var12.c8(), var35.a6(), var46.h0(), var11, var8, var36);
      this.n5(var34);
      return true;
   }

   public static boolean l6(GeometryShape var0) {
      x2i var1 = l0y.n5(var0);
      if (var1 == null) {
         return true;
      } else {
         return n7d.l6(var0.getShapeType()) ? true : var1.h0() == null && var1.c8() == null && com.aspose.slides.ms.System.q1.n5(var1.n5()) < Float.MIN_VALUE;
      }
   }

   private com.aspose.slides.internal.s6.s0 n5(com.aspose.slides.internal.s6.s0 var1, IShapeFrame var2) {
      float var3 = var2.getCenterX();
      float var4 = var2.getCenterY();
      com.aspose.slides.internal.w0.c8 var5 = new com.aspose.slides.internal.w0.c8(
         var2.getFlipH() == 1 ? -1.0F : 1.0F,
         0.0F,
         0.0F,
         var2.getFlipV() == 1 ? -1.0F : 1.0F,
         var2.getFlipH() == 1 ? 2.0F * var3 : 0.0F,
         var2.getFlipV() == 1 ? 2.0F * var4 : 0.0F
      );
      if (!com.aspose.slides.ms.System.n1.k5(var2.getRotation())) {
         var5.n5(var2.getFlipH() == 1 ^ var2.getFlipV() == 1 ? -var2.getRotation() : var2.getRotation(), new com.aspose.slides.internal.o9b.w1(var3, var4), 0);
      }

      com.aspose.slides.internal.o9b.w1 var6 = var5.n5(new com.aspose.slides.internal.o9b.w1(var1.n5(), var1.l6())).u3();
      return new com.aspose.slides.internal.s6.s0(var6.l6(), var6.k5());
   }
}
