package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class n7d extends k6 {
   public n7d(float var1) {
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

      boolean var8 = false;
      boolean[] var9 = new boolean[]{false};
      x2i var10 = l0y.n5(var3, var9);
      var8 = var9[0];
      float[] var11 = h4.n5(var7.k5(), var7.n5(), var7.l6(), var8);
      if (var11 == null) {
         return false;
      }

      com.aspose.slides.ms.System.o5 var12 = (var10 != null ? var10.k5() : new com.aspose.slides.ms.System.o5<>()).k5();
      int var13 = n5(var10, false);
      boolean var14 = com.aspose.slides.ms.System.o5.l6(var12, null) && n5(var13);
      com.aspose.slides.internal.s6.r4 var15 = t4x.l6(var11).c8();
      com.aspose.slides.internal.s6.v3 var16 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.s0 var17 = new com.aspose.slides.internal.s6.s0();
      com.aspose.slides.internal.s6.v3[] var18 = new com.aspose.slides.internal.s6.v3[]{var16};
      com.aspose.slides.internal.s6.s0[] var19 = new com.aspose.slides.internal.s6.s0[]{var17};
      List var20 = this.n5(var3, var5, var4, var6, var13, var1, var2, var10, var15.c8(), var14, var18, var19);
      var18[0].l6(var16);
      var19[0].n5(var17);
      if (var20.size() == 0) {
         return true;
      }

      if (var10 != null && var10.u9() != 6) {
         List var21 = j4u.n5(var10);
         this.n5(var1, var3, var20, var15.c8(), var17.a6(), var16.h0(), var13, var11, var21);
      } else {
         this.n5(var1, var3, var20, var15.c8(), var17.a6(), var16.h0(), var11);
      }

      this.n5(var20);
      return true;
   }

   final com.aspose.slides.internal.o9b.y1 n5(GeometryShape var1, ShapeFrame var2) {
      com.aspose.slides.internal.o9b.y1 var3 = new com.aspose.slides.internal.o9b.y1(var1.getX(), var1.getY(), var1.getWidth(), var1.getHeight());
      g0 var4 = h4.n5(var1);
      AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
      g0 var6 = null;
      x2i var7 = null;
      if (var5 != null && var5.isTextBox()) {
         TextFrame var8 = var5.l6();
         if (var8 != null && !com.aspose.slides.ms.System.d1.n5(var5.getTextFrame().getText())) {
            var6 = h4.n5(var8);
            var7 = l0y.n5(var8);
         }

         if (var7 != null && var6 != null) {
            ShapeFrame var9 = null;
            com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1();
            ShapeFrame[] var11 = new ShapeFrame[]{var9};
            com.aspose.slides.internal.o9b.y1[] var12 = new com.aspose.slides.internal.o9b.y1[]{var10};
            s3z.n5(var8.u3, var11, var12, null);
            var9 = var11[0];
            var12[0].a6(var10);
            f1z var13 = var8.u3;
            d2k var14 = var13.l6().u3();
            i2h var15 = var8.a6().k5();
            com.aspose.slides.internal.s6.s0 var16 = new com.aspose.slides.internal.s6.s0(var1.getX() + var15.l6 + var14.n5, var1.getY() + var15.k5 + var14.l6);
            com.aspose.slides.internal.s6.s0 var17 = new com.aspose.slides.internal.s6.s0(var13.k5().n5, s3z.k5(var13));
            var3 = new com.aspose.slides.internal.o9b.y1(var16.n5(), var16.l6(), var17.n5(), var17.l6());
         }
      }

      if (var4 == null && var6 == null) {
         return var3;
      }

      if (var4 == null) {
         var4 = var6;
      }

      boolean var31 = false;
      boolean[] var34 = new boolean[]{false};
      x2i var35 = l0y.n5(var1, var34);
      var31 = var34[0];
      if (var35 == null) {
         var35 = var7;
      }

      float[] var36 = h4.n5(var4.k5(), var4.n5(), var4.l6(), var31);
      if (var36 == null) {
         return var3;
      }

      float var37 = var35 != null ? var35.n5() : 0.0F;
      float var38 = var35 != null ? var35.l6() : 0.0F;
      com.aspose.slides.ms.System.o5 var39 = (var35 != null ? var35.k5() : new com.aspose.slides.ms.System.o5<>()).k5();
      int var40 = n5(var35, false);
      boolean var41 = com.aspose.slides.ms.System.o5.l6(var39, null) && (var40 == 2 || var40 == 3);
      com.aspose.slides.internal.s6.r4 var42 = t4x.l6(var36).c8();
      com.aspose.slides.internal.x4g.m1 var18 = new com.aspose.slides.internal.x4g.m1(
         var2.getFlipH() == 1 ? -1.0F : 1.0F,
         0.0F,
         0.0F,
         var2.getFlipV() == 1 ? -1.0F : 1.0F,
         var2.getFlipH() == 1 ? var2.getCenterX() * 2.0F : 0.0F,
         var2.getFlipV() == 1 ? var2.getCenterY() * 2.0F : 0.0F
      );
      y5x var19 = new y5x();
      var19.k5(var40);
      com.aspose.slides.internal.x4g.s7 var20 = new com.aspose.slides.internal.x4g.s7();
      var20.l6(var3.y4());
      var20.l6(var18);
      var19.n5(new List<>());
      var19.u3().addItem(var20);
      var19.n5(6);
      var19.l6(0);
      com.aspose.slides.internal.s6.v3 var21 = new com.aspose.slides.internal.s6.v3(var3.s7() / 2.0F, var3.k5() / 2.0F, var37);
      com.aspose.slides.internal.s6.s0 var22 = new com.aspose.slides.internal.s6.s0(var3.x8() + var3.s7() / 2.0F, var3.n3() + var3.k5() / 2.0F);
      List var23 = new List();
      var23.addItem(var19);
      this.n5(var23, var35, var38, var37, var22.a6(), var41);
      IEffectFormatEffectiveData var24 = var1.y1().getEffective();
      if (var24 != null && !var24.isNoEffects()) {
         ShapeFrame var25 = var2;
         if (this.l6()) {
            var25 = var1.e5().n5(true);
         }

         com.aspose.slides.internal.o9b.y1 var26 = n2d.n5(var24, var20.s7().y4()).y4();
         com.aspose.slides.internal.s6.s0 var27 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
         com.aspose.slides.internal.w0.c8 var28 = new com.aspose.slides.internal.w0.c8(
            var25.getFlipH() == 1 ? -1.0F : 1.0F,
            0.0F,
            0.0F,
            var25.getFlipV() == 1 ? -1.0F : 1.0F,
            var25.getFlipH() == 1 ? -var27.n5() * 2.0F : 0.0F,
            var25.getFlipV() == 1 ? var27.l6() * 2.0F : 0.0F
         );
         float var29 = var38 - var37;
         if (var35.h0() != null) {
            var29 -= (float)var35.h0().getHeight();
         }

         y5x var30 = new y5x();
         var19.k5(var40);
         var30.n5(this.n5(var22.a6(), var29, var26.y4(), false, this.l6, var28));
         var23.addItem(var30);
      }

      com.aspose.slides.internal.s6.v3[] var43 = new com.aspose.slides.internal.s6.v3[]{var21};
      this.n5(var23, var42.c8(), var43);
      var43[0].l6(var21);
      com.aspose.slides.internal.s6.v8 var44 = new com.aspose.slides.internal.s6.v8(0, 0);
      com.aspose.slides.internal.s6.r4 var45 = t4x.n5(var36).c8();
      float var46 = 1.0F;
      var44.n5(com.aspose.slides.internal.v6g.k5.u3((var21.n5() + var21.k5() * com.aspose.slides.ms.System.q1.n5(var45.a6()) + var46) * 2.0F, 13));
      var44.l6(com.aspose.slides.internal.v6g.k5.u3((var21.l6() + var21.k5() * com.aspose.slides.ms.System.q1.n5(var45.u9()) + var46) * 2.0F, 13));
      float var47 = var22.n5() - var44.n5() / 2.0F;
      float var48 = var22.l6() - var44.l6() / 2.0F;
      return new com.aspose.slides.internal.o9b.y1(var47, var48, var44.n5(), var44.l6());
   }

   protected final List<y5x> n5(
      GeometryShape var1,
      ShapeFrame var2,
      ShapeElement[] var3,
      IFillParamSource var4,
      int var5,
      e3 var6,
      s5u var7,
      x2i var8,
      com.aspose.slides.internal.s6.r4 var9,
      boolean var10,
      com.aspose.slides.internal.s6.v3[] var11,
      com.aspose.slides.internal.s6.s0[] var12
   ) {
      var11[0] = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F);
      var12[0] = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
      float var13 = var8 != null ? var8.n5() : 0.0F;
      float var14 = var8 != null ? var8.l6() : 0.0F;
      com.aspose.slides.ms.System.o5 var15 = (var8 != null ? var8.k5() : new com.aspose.slides.ms.System.o5<>()).k5();
      a1v[] var16 = new a1v[6];
      float var17 = 1.0F;
      com.aspose.slides.internal.s6.s0 var18 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
      com.aspose.slides.internal.x4g.m1 var19 = new com.aspose.slides.internal.x4g.m1(
         var2.getFlipH() == 1 ? -1.0F : 1.0F,
         0.0F,
         0.0F,
         var2.getFlipV() == 1 ? -1.0F : 1.0F,
         var2.getFlipH() == 1 ? var2.getCenterX() * 2.0F : 0.0F,
         var2.getFlipV() == 1 ? var2.getCenterY() * 2.0F : 0.0F
      );
      ShapeFrame var20 = var2;
      if (this.l6()) {
         var20 = var1.e5().n5(true);
         var19.n5(var1.getRotation() - var1.getParentGroup().getRotation(), new com.aspose.slides.internal.o9b.w1(var20.getCenterX(), var20.getCenterY()));
      }

      com.aspose.slides.ms.System.o5 var21 = (var8 != null ? var8.a6() : new com.aspose.slides.ms.System.o5<>()).k5();
      float var22 = var8 != null ? var8.u3() : 0.0F;
      boolean var23 = var21.l6() && !((com.aspose.slides.internal.o9b.c8)var21.n5()).t2() && var22 > 0.0F;
      List var24 = new List();

      for (ShapeElement var28 : var3) {
         if (var28.l6.h0() != 0) {
            y5x var29 = new y5x();
            var29.k5(var5);
            r0m var30 = new r0m();
            var30.n5(true);
            var30.n5(var28.getStrokeSource() != 0 ? var1.t9().n5(var20, var6.q0(), var28.l6, var7) : null);
            var30.l6(var23 ? new l6v(((com.aspose.slides.internal.o9b.c8)var21.n5()).o8(), var22) : null);
            a1v var31 = null;
            boolean var32 = false;
            if (var28.getFillSource() != 0) {
               var31 = var1.t9().n5(var6, var20, var28.l6, var16, var28.getFillSource(), var4, var7);
               if (var31 != null && var31.a6()) {
                  if (var31.u3() == 1 && (var31.n5().s7() & 255) != 0 && (var31.n5().s7() & 255) != 255) {
                     var29.k5(7);
                  }

                  var29.n5(var31.u3() == 1 && (var30 == null || !var30.u3()) ? n5(var31.n5().o8()) : n5(var6, var28.l6(), var31, var30, var19, this.n5));
                  var29.n5(var31);
                  var32 = true;
               }
            }

            l6v var33 = var30.n5();
            if (!var32) {
               if (var33 == null || !var33.t2()) {
                  continue;
               }

               if (var33.c8().u3() != 1) {
                  com.aspose.slides.internal.o9b.m3 var34 = var33.q0();
                  var34.k5(0);
                  com.aspose.slides.internal.x4g.s7 var35 = (com.aspose.slides.internal.x4g.s7)var28.l6().deepClone();
                  com.aspose.slides.internal.n2d.y4.n5(var35, var34);
                  var29.n5(n5(var6, var35, var33.c8(), null, var19, this.n5));
               } else {
                  var29.n5(n5(var33.h0().o8()));
               }

               if (com.aspose.slides.ms.System.o5.l6(var15, null)) {
                  var29.l6(n5(((com.aspose.slides.internal.o9b.c8)var15.n5()).o8()));
               } else {
                  var29.l6(var29.a6());
               }
            } else if (com.aspose.slides.ms.System.o5.l6(var15, null)) {
               var29.l6(n5(((com.aspose.slides.internal.o9b.c8)var15.n5()).o8()));
            } else if (var33 != null && var33.t2()) {
               var29.l6(var33.c8().u3() != 1 ? n5(var6, var28.l6(), var33.c8(), null, var19, this.n5) : n5(var33.h0().o8()));
            } else {
               var29.l6(var31.u3() != 1 ? n5(var6, var28.l6(), var31, null, var19, this.n5) : n5(var31.n5().o8()));
            }

            if (var29.a6() != null || var29.u9() != null) {
               com.aspose.slides.internal.x4g.s7 var44 = (com.aspose.slides.internal.x4g.s7)var28.l6.deepClone();
               if (var32 && var30.u3() && var30.a6() > 0.0F) {
                  this.n5(var44, var30.a6());
               }

               var44.l6(var19);
               var29.n5(new List<>());
               var29.u3().addItem(var44);
               var29.n5((var32 ? 2 : 0) | 4);
               var29.l6(0);
               if (!var32 && var33 != null && (var33.n5() > 0.0 || var33.s7() > 0 || var33.x8() > 0)) {
                  com.aspose.slides.internal.o9b.m3 var45 = var33.q0();
                  if (var13 != 0.0F) {
                     var45.k5(0);
                  }

                  boolean var36 = l6(var44);
                  com.aspose.slides.internal.n2d.y4.n5(var44, var45);
                  com.aspose.slides.internal.o9b.y1 var37 = var44.s7().y4();
                  var17 = com.aspose.slides.ms.System.q1.n5((float)(var17), (float)(com.aspose.slides.ms.System.q1.l6(var37.s7(), var37.k5())));
                  var29.n5(true);
                  var29.n5(var29.n5() | 2);
                  var29.l6(1);
                  com.aspose.slides.internal.s6.s0 var38 = new com.aspose.slides.internal.s6.s0(var2.getWidth(), var2.getHeight());
                  com.aspose.slides.internal.s6.s0 var39 = n5(var33.m1(), var33.s7(), var38.a6()).a6();
                  com.aspose.slides.internal.s6.s0 var40 = n5(var33.k7(), var33.x8(), var38.a6()).a6();
                  com.aspose.slides.internal.s6.s0.l6(var40, var39).n5(var18);
                  if (!var36) {
                     var29.n5(k5(var44));
                  }
               }

               var29.u3(var8.u9());
               var24.addItem(var29);
            }
         }
      }

      if (var24.size() == 0) {
         return var24;
      }

      var11[0] = new com.aspose.slides.internal.s6.v3(var2.n5().s7() / 2.0F, var2.n5().k5() / 2.0F, var13);
      var12[0] = new com.aspose.slides.internal.s6.s0(var2.getCenterX(), var2.getCenterY());
      if (var24.size() == 1) {
         if (var2.getFlipH() == 1) {
            var18.n5(-var18.n5());
         }

         if (var2.getFlipV() == 1) {
            var18.l6(-var18.l6());
         }

         com.aspose.slides.internal.s6.s0.n5(var12[0], var18).n5(var12[0]);
      }

      this.n5(var24, var8, var14, var13, var12[0].a6(), var10);
      boolean var41 = true;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArtShape.class)) {
         SmartArtShape var42 = (SmartArtShape)var1;
         var41 = var42.y4().h0().z1().c8() == var42.y4().z1() || this.n5(var42.y4().h0().z1().l6());
      }

      if (var41) {
         y5x var43 = this.n5(var1, var2, var6, var7, var3, var17, var8, var14, var12[0].a6(), var18.a6());
         if (var43 != null) {
            var24.addItem(var43);
         }
      }

      this.n5(var24, var9.c8(), var11);
      return var24;
   }

   private boolean n5(SmartArt var1) {
      int var2 = var1.getLayout();
      switch (var2) {
         case 13:
         case 40:
         case 91:
         case 116:
         case 132:
            return false;
         default:
            return true;
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, float var2) {
      com.aspose.slides.internal.o9b.y1 var3 = var1.s7().y4();
      float var4 = var3.x8() + var3.s7() * 0.5F;
      float var5 = var3.n3() + var3.k5() * 0.5F;
      com.aspose.slides.internal.x4g.m1 var6 = new com.aspose.slides.internal.x4g.m1();
      var6.k5(var4, var5);
      var6.n5((var3.s7() + var2) / var3.s7(), (var3.k5() + var2) / var3.k5());
      var6.k5(-var4, -var5);
      var1.l6(var6);
   }

   private void n5(List<y5x> var1, x2i var2, float var3, float var4, com.aspose.slides.internal.s6.s0 var5, boolean var6) {
      com.aspose.slides.internal.s6.t2 var7 = k4.n5(var2);
      List$Enumerator var8 = var1.iterator();

      try {
         while (var8.hasNext()) {
            y5x var9 = (y5x)var8.next();
            var9.n5(
               new com.aspose.slides.internal.s6.y2(
                  var9.u3().get_Item(0), var3, var4, var9.n5(), var9.l6(), var7, var6, var9.k5(), new com.aspose.slides.ms.System.o5<>(var5.a6())
               )
            );

            for (int var10 = 1; var10 < var9.u3().size(); var10++) {
               var9.h0()
                  .n5(var9.u3().get_Item(var10), var3, var4, var9.n5(), var9.l6(), var7, var6, var9.k5(), new com.aspose.slides.ms.System.o5<>(var5.a6()));
            }

            if (var9.u3().size() > 1) {
               var9.h0().n5(new com.aspose.slides.internal.s6.s0(0.0F, 0.0F), new com.aspose.slides.internal.s6.s0(1.0F, 1.0F));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }

   private y5x n5(
      GeometryShape var1,
      ShapeFrame var2,
      e3 var3,
      s5u var4,
      ShapeElement[] var5,
      float var6,
      x2i var7,
      float var8,
      com.aspose.slides.internal.s6.s0 var9,
      com.aspose.slides.internal.s6.s0 var10
   ) {
      IEffectFormatEffectiveData var11 = var1.y1().getEffective();
      if (var11 != null && (var11.getGlowEffect() != null || var11.getOuterShadowEffect() != null || var11.getReflectionEffect() != null)) {
         com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1();
         ShapeFrame var13 = var2;
         if (this.l6()) {
            var13 = var1.e5().n5(true);
         }

         com.aspose.slides.internal.o9b.y1[] var14 = new com.aspose.slides.internal.o9b.y1[]{var12};
         com.aspose.slides.internal.o9b.l6 var15 = this.n5(var3, var4, var1, var5, var13, var6, (byte)2, var14);
         var14[0].a6(var12);
         y5x var16 = new y5x();
         var16.n5(var15);
         var16.l6(var15);
         com.aspose.slides.internal.w0.c8 var17 = new com.aspose.slides.internal.w0.c8(
            var13.getFlipH() == 1 ? -1.0F : 1.0F,
            0.0F,
            0.0F,
            var13.getFlipV() == 1 ? -1.0F : 1.0F,
            var13.getFlipH() == 1 ? -var10.n5() * 2.0F : 0.0F,
            var13.getFlipV() == 1 ? var10.l6() * 2.0F : 0.0F
         );
         float var18 = var8 - (var7.n5() + 0.5F);
         if (var7.h0() != null) {
            float var19 = (float)var7.h0().getHeight();
            var18 -= var19 < 2.0F ? 2.0F * var19 : var19;
         }

         float var20 = com.aspose.slides.ms.System.q1.l6(var12.s7(), var12.k5()) / 3.0F;
         var16.n5(this.n5(var9.a6(), var18, var12.y4(), false, var20, var17));
         var16.k5(1);
         return var16;
      } else {
         return null;
      }
   }

   private void n5(List<y5x> var1, com.aspose.slides.internal.s6.r4 var2, com.aspose.slides.internal.s6.v3[] var3) {
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            y5x var5 = (y5x)var4.next();
            com.aspose.slides.internal.s6.v3 var6 = new com.aspose.slides.internal.s6.v3();
            com.aspose.slides.internal.s6.v3 var7 = new com.aspose.slides.internal.s6.v3();
            com.aspose.slides.internal.s6.v3[] var8 = new com.aspose.slides.internal.s6.v3[]{var6};
            com.aspose.slides.internal.s6.v3[] var9 = new com.aspose.slides.internal.s6.v3[]{var7};
            var5.h0().n5(var2.c8(), var8, var9);
            var8[0].l6(var6);
            var9[0].l6(var7);
            var3[0]
               .n5(
                  com.aspose.slides.internal.s6.w2.n5(var3[0].n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var6.n5()), com.aspose.slides.ms.System.q1.n5(var7.n5())})
               );
            var3[0]
               .l6(
                  com.aspose.slides.internal.s6.w2.n5(var3[0].l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var6.l6()), com.aspose.slides.ms.System.q1.n5(var7.l6())})
               );
            var3[0]
               .k5(
                  com.aspose.slides.internal.s6.w2.n5(var3[0].k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var6.k5()), com.aspose.slides.ms.System.q1.n5(var7.k5())})
               );
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   protected static boolean l6(com.aspose.slides.internal.x4g.s7 var0) {
      byte[] var1 = var0.u9();

      for (byte var5 : var1) {
         if ((var5 & 255 & 128) == 128) {
            return true;
         }
      }

      return false;
   }

   protected static List<com.aspose.slides.internal.x4g.s7> k5(com.aspose.slides.internal.x4g.s7 var0) {
      byte[] var1 = var0.u9();
      int var2 = 0;
      int var3 = 0;

      for (byte var7 : var1) {
         if ((var7 & 255 & 7) == 0 && var3 > 0) {
            var2++;
            var3 = 0;
         }

         var3++;
      }

      if (var3 > 0) {
         var2++;
      }

      List var9 = new List(var2);
      if (var2 < 2) {
         var9.addItem(var0);
         return var9;
      }

      com.aspose.slides.internal.o9b.w1[] var10 = var0.a6();
      List var11 = new List();
      List var12 = new List();

      for (int var8 = 0; var8 < var0.h0(); var8++) {
         if ((var1[var8] & 255 & 7) == 0 && var11.size() > 0) {
            var9.addItem(
               new com.aspose.slides.internal.x4g.s7(
                  (com.aspose.slides.internal.o9b.w1[])var11.toArray(new com.aspose.slides.internal.o9b.w1[0]), com.aspose.slides.internal.n8e.v4.l6(var12), var0.k5()
               )
            );
            var11.clear();
            var12.clear();
         }

         var11.addItem(var10[var8].u3());
         var12.addItem(var1[var8]);
      }

      if (var11.size() > 0) {
         var9.addItem(
            new com.aspose.slides.internal.x4g.s7(
               (com.aspose.slides.internal.o9b.w1[])var11.toArray(new com.aspose.slides.internal.o9b.w1[0]), com.aspose.slides.internal.n8e.v4.l6(var12), var0.k5()
            )
         );
      }

      return var9;
   }

   static boolean n5(Shape var0) {
      g0 var1 = h4.n5(var0.r4());
      if (var1 == null) {
         return false;
      }

      float[] var2 = h4.n5(var1.k5(), var1.n5(), var1.l6());
      if (var2 == null) {
         return false;
      }

      for (int var3 = 0; var3 < com.aspose.slides.ms.System.q1.l6(4, var2.length); var3++) {
         if (var2[var3] != 0.0F) {
            return true;
         }
      }

      return false;
   }

   static boolean l6(int var0) {
      switch (var0) {
         case 68:
         case 69:
         case 70:
         case 71:
         case 73:
         case 74:
         case 82:
         case 83:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 115:
         case 116:
         case 122:
         case 123:
         case 124:
         case 125:
         case 127:
         case 128:
            return true;
         case 72:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 114:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 126:
         default:
            return false;
      }
   }
}
