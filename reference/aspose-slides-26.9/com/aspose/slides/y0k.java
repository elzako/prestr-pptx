package com.aspose.slides;

class y0k extends g4a {
   public y0k(GeometryShape var1) {
      super(var1);
   }

   public final GeometryShape u3() {
      return (GeometryShape)super.a6();
   }

   static boolean n5(IEffectFormatEffectiveData var0) {
      return var0 != null && !var0.isNoEffects();
   }

   static boolean l6(IEffectFormatEffectiveData var0) {
      return var0 == null
         || var0.getFillOverlayEffect() == null
            && (var0.getBlurEffect() == null || var0.getBlurEffect().getRadius() == 0.0)
            && (var0.getSoftEdgeEffect() == null || !(var0.getSoftEdgeEffect().getRadius() > 0.0));
   }

   static boolean k5(IEffectFormatEffectiveData var0) {
      return var0 == null
         || (var0.getBlurEffect() == null || var0.getBlurEffect().getRadius() == 0.0)
            && (var0.getSoftEdgeEffect() == null || var0.getSoftEdgeEffect().getRadius() == 0.0);
   }

   a1v n5(e3 var1, ShapeFrame var2, com.aspose.slides.internal.x4g.s7 var3, a1v[] var4, byte var5, IFillParamSource var6, s5u var7) {
      a1v var8 = var4[var5 & 0xFF];
      if (var8 != null) {
         return var8;
      }

      if (var5 == 0) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var6, FillFormat.class)) {
         f6a var9 = null;
         if (this.a6().getFillFormat().getFillType() == 2
            && this.a6().getFillFormat().getGradientFormat() != null
            && this.a6().getFillFormat().getGradientFormat().getGradientStops().size() == 0) {
            FillFormat var10 = new FillFormat(this.a6());
            var10.setFillType((byte)2);
            var10.getGradientFormat().setGradientShape((byte)0);
            ((GradientStopCollection)var10.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.m3().o8());
            ((GradientStopCollection)var10.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.w4().o8());
            var10.getGradientFormat().setLinearGradientAngle(this.a6().getFillFormat().getGradientFormat().getLinearGradientAngle());
            var9 = var10.c8();
         } else {
            var9 = this.a6().c8.c8();
         }

         Slide var25 = var7 != null && var7.u3() != this.h0() ? com.aspose.slides.internal.v6g.k5.n5(var7.u3(), Slide.class) : null;
         boolean var11 = n5(var25, this.h0());
         if (var11) {
            var9.n5(var25, w6a.n5);
         }

         IShapeFrame var12 = var9.c8() && this.a6().isGrouped() ? this.a6().f0().getFrame() : var2;
         com.aspose.slides.internal.x4g.s7 var13 = var9.c8() && this.a6().isGrouped() ? null : var3;
         j5m var14 = new j5m(var12.cloneT(), var1, var13, this.h0(), this.u3().getShapeType(), var7);
         var8 = a1v.n5(var14, var9, var5, (EffectFormat)this.a6().getEffectFormat());
         if (var11) {
            var9.n5(this.h0(), w6a.n5);
         }

         if (var9.getFillType() == 2
            && this.a6().isGrouped()
            && com.aspose.slides.internal.v6g.k5.l6(this.a6().getParentGroup().getFillFormat(), FillFormat.class)) {
            IFillFormatEffectiveData var15 = ((FillFormat)this.a6().getParentGroup().getFillFormat()).getEffective();
            if (com.aspose.slides.internal.v6g.k5.l6(var8, u4z.class) && var15.getFillType() == 2) {
               IShapeFrame var16 = this.a6().getFrame();
               com.aspose.slides.internal.w0.c8 var17 = new com.aspose.slides.internal.w0.c8(
                  var16.getFlipH() == 1 ? -1.0F : 1.0F,
                  0.0F,
                  0.0F,
                  var16.getFlipV() == 1 ? -1.0F : 1.0F,
                  var16.getFlipH() == 1 ? var16.getCenterX() * 2.0F : 0.0F,
                  var16.getFlipV() == 1 ? var16.getCenterY() * 2.0F : 0.0F
               );
               if (!com.aspose.slides.ms.System.n1.k5(var16.getRotation())) {
                  var17.n5(
                     var16.getFlipH() == 1 ^ var16.getFlipV() == 1 ? -var16.getRotation() : var16.getRotation(),
                     new com.aspose.slides.internal.o9b.w1(var16.getCenterX(), var16.getCenterY()),
                     0
                  );
               }

               com.aspose.slides.internal.x4g.m1 var18 = com.aspose.slides.internal.n8e.n1.l6(var17);
               if (var18.k5()) {
                  IShapeFrame var19 = this.a6().getParentGroup().getFrame();
                  com.aspose.slides.internal.w0.c8 var20 = new com.aspose.slides.internal.w0.c8(
                     var19.getFlipH() == 1 ? -1.0F : 1.0F,
                     0.0F,
                     0.0F,
                     var19.getFlipV() == 1 ? -1.0F : 1.0F,
                     var19.getFlipH() == 1 ? var19.getCenterX() * 2.0F : 0.0F,
                     var19.getFlipV() == 1 ? var19.getCenterY() * 2.0F : 0.0F
                  );
                  if (!com.aspose.slides.ms.System.n1.k5(var19.getRotation())) {
                     var20.n5(
                        var19.getFlipH() == 1 ^ var19.getFlipV() == 1 ? -var19.getRotation() : var19.getRotation(),
                        new com.aspose.slides.internal.o9b.w1(var19.getCenterX(), var19.getCenterY()),
                        0
                     );
                  }

                  com.aspose.slides.internal.x4g.m1 var21 = com.aspose.slides.internal.n8e.n1.l6(var20);
                  var18.h0();
                  var18.n5(var21, 0);
                  com.aspose.slides.internal.v6g.k5.n5(var8, u4z.class).n5(var18);
               }
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var6, PictureFillFormat.class)) {
         j5m var23 = new j5m(var2.cloneT(), var1, var3, this.h0(), this.u3().getShapeType(), var7);
         var8 = new q3d(var23, (EffectFormat)this.a6().getEffectFormat(), (PictureFillFormat)var6, !((PictureFillFormat)var6).a6());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var6, Background.class)) {
         Background var24 = (Background)var6;
         f6a var26 = (f6a)var24.getEffective().getFillFormat();
         IShapeFrame var27 = var26.c8() && this.a6().isGrouped() ? this.a6().f0().getFrame() : var2;
         com.aspose.slides.internal.x4g.s7 var28 = var26.c8() && this.a6().isGrouped() ? null : var3;
         j5m var29 = new j5m(var27.cloneT(), var1.q0(), var28, this.h0(), var7);
         var8 = a1v.n5(var29, var26, var5, (EffectFormat)this.a6().getEffectFormat());
      }

      var4[var5 & 0xFF] = var8;
      return var8;
   }

   final l6v n5(ShapeFrame var1, com.aspose.slides.internal.w0.c8 var2, com.aspose.slides.internal.x4g.s7 var3, s5u var4) {
      LineFormat var5 = this.a6().y2();
      t8r var6 = var5.c8();
      Slide var7 = var4 != null && var4.u3() != this.h0() ? com.aspose.slides.internal.v6g.k5.n5(var4.u3(), Slide.class) : null;
      boolean var8 = n5(var7, this.h0());
      if (var8) {
         var6.n5(var7, w6a.n5);
      }

      if (var6.getFillFormat().getFillType() == 2 && var6.getWidth() != 0.0) {
         var3 = (com.aspose.slides.internal.x4g.s7)var3.deepClone();
         com.aspose.slides.internal.o9b.m3 var9 = new com.aspose.slides.internal.o9b.m3(com.aspose.slides.internal.o9b.c8.m3().o8(), (float)var6.getWidth());
         var3.n5(var9);
      }

      BaseSlide var11 = var7;
      if (var11 == null) {
         var11 = this.h0();
      }

      l6v var10 = new l6v(new j5m(var1.cloneT(), var2, var3, var11, var4), var6, 0);
      if (var8) {
         var6.n5(this.h0(), w6a.n5);
      }

      return var10;
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!this.a6().getHidden()) {
         ShapeFrame var4 = this.n3();
         this.n5(var1, var2, var4);
      }
   }

   void n5(e3 var1, s5u var2, ShapeElement[] var3, ShapeFrame var4, IEffectFormatEffectiveData var5, byte var6) {
      if ((var6 & 2) != 0 && n5(var5)) {
         this.n5(var1, var2, var3, var4, this.a6().getFillFormat(), var5, true);
      }

      if ((var6 & 1) != 0 && l6(var5)) {
         IPictureFillFormat var7 = com.aspose.slides.internal.v6g.k5.n5(this.a6().getFillFormat(), IPictureFillFormat.class);
         if (var7 == null) {
            FillFormat var8 = com.aspose.slides.internal.v6g.k5.n5(this.a6().getFillFormat(), FillFormat.class);
            if (var8 != null) {
               var7 = var8.getPictureFillFormat();
            }
         }

         this.n5(var1, var2, var3, var4, this.a6().getFillFormat(), var7);
      }

      if ((var6 & 4) != 0 && n5(var5)) {
         this.n5(var1, var2, var3, var4, this.a6().getFillFormat(), var5, false);
      }

      if ((var6 & 1) != 0 && k5(var5)) {
         this.n5(var1, var2, var3, var4);
      }
   }

   private boolean n5() {
      return this.a6().isGrouped() && this.a6().getParentGroup().getEffectFormat().getOuterShadowEffect() != null
         ? this.a6().getEffectFormat().getOuterShadowEffect() != null
            || this.a6().getParentGroup().getThreeDFormat().getCamera().getCameraType() != -1
            || this.a6().getThreeDFormat().getCamera().getCameraType() != -1
         : true;
   }

   private boolean l6() {
      return this.a6().isGrouped() && this.a6().getParentGroup().getEffectFormat().getGlowEffect() != null
         ? this.a6().getEffectFormat().getGlowEffect() != null || this.a6().getThreeDFormat().getCamera().getCameraType() != -1
         : true;
   }

   final void n5(e3 var1, s5u var2, ShapeElement[] var3, ShapeFrame var4, IFillParamSource var5, IEffectFormatEffectiveData var6, boolean var7) {
      if (var6 != null && var3.length != 0) {
         boolean var8 = var6.getReflectionEffect() != null
            || var6.getOuterShadowEffect() != null
            || var6.getGlowEffect() != null
            || var6.getBlurEffect() != null
            || var6.getSoftEdgeEffect() != null
            || var6.getFillOverlayEffect() != null;
         boolean var9 = var6.getInnerShadowEffect() != null;
         if (var7 && var8 || !var7 && var9) {
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, j0b.class)) {
               a1v[] var10 = new a1v[6];

               for (int var11 = 0; var11 < var3.length; var11++) {
                  if (var3[var11].getStrokeSource() != 0 || var3[var11].a6 != 0) {
                     a1v var12 = null;
                     if (var3[var11].a6 != 0 && var3[var11].l6.h0() != 0) {
                        var12 = this.n5(var1, var4, var3[var11].l6, var10, var3[var11].a6, var5, var2);
                     }

                     l6v var13 = null;
                     if (var3[var11].getStrokeSource() != 0 && var3[var11].l6.h0() != 0) {
                        var13 = this.n5(var4, var1.q0(), var3[var11].l6, var2).w1();
                     }

                     com.aspose.slides.internal.x4g.s7 var14 = var3[var11].l6;
                     if (var6.getReflectionEffect() != null && var7) {
                        q2b var15 = new q2b(var6.getReflectionEffect());
                        var15.n5(var1, var14, var12, var13, var4);
                     }

                     if (var6.getInnerShadowEffect() != null && !var7) {
                        y3w var17 = new y3w(var6.getInnerShadowEffect());
                        var17.n5(var1, var14, var12, var13, var4);
                     }

                     if (var6.getOuterShadowEffect() != null && var7 && this.n5()) {
                        n7q var18 = new n7q(var6.getOuterShadowEffect());
                        var18.n5(var1, var14, var12, var13);
                     }

                     if (var6.getGlowEffect() != null && var7 && this.l6()) {
                        i5q var19 = new i5q(var6.getGlowEffect());
                        var19.n5(var1, var14, var12, var13);
                     }

                     if (var6.getBlurEffect() != null && var7) {
                        q7 var20 = new q7(var6.getBlurEffect());
                        var20.n5(var1, var14, var12, var13, var4);
                     }

                     if (var6.getSoftEdgeEffect() != null && var7) {
                        e7o var21 = new e7o(var6.getSoftEdgeEffect());
                        var21.n5(var1, var2, var14, var12, var13);
                     }

                     if (var6.getFillOverlayEffect() != null && var7) {
                        w0r var22 = new w0r(var6.getFillOverlayEffect());
                        var22.n5(var1, var14, var12, var13, var4);
                     }

                     if (com.aspose.slides.internal.v6g.k5.l6(var12, q3d.class)) {
                        q3d var23 = (q3d)var12;
                        com.aspose.slides.internal.o9b.t4 var16 = var23.y1();
                        if (var16 != null && var2.n5(var16) == null) {
                           var23.dispose();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   final void n5(e3 var1, s5u var2, ShapeElement[] var3, ShapeFrame var4, IFillParamSource var5, IPictureFillFormat var6) {
      a1v[] var7 = new a1v[6];
      com.aspose.slides.internal.o9b.y1 var8 = var4.n5().y4();
      com.aspose.slides.internal.o9b.y1 var9 = com.aspose.slides.internal.o9b.y1.n5.y4();

      for (int var10 = 0; var10 < var3.length; var10++) {
         if (var3[var10].k5() == 0 && var3[var10].getFillSource() != 0) {
            com.aspose.slides.internal.x4g.s7 var11 = (com.aspose.slides.internal.x4g.s7)var3[var10].l6().deepClone();
            var11.y4();
            if (var9.u3()) {
               var11.s7().a6(var9);
            } else {
               com.aspose.slides.internal.o9b.y1.l6(var9.y4(), var11.s7().y4()).a6(var9);
            }

            var11.dispose();
         }
      }

      if (var8.l6(var9.y4())) {
         var9.a6(var8);
      } else {
         com.aspose.slides.internal.o9b.y1.l6(var8.y4(), var9.y4()).a6(var8);
      }

      if (var8.s7() != 0.0F && var8.k5() != 0.0F) {
         w2 var23 = com.aspose.slides.internal.v6g.k5.n5(var1, w2.class);
         var4 = new ShapeFrame(var8.x8(), var8.n3(), var8.s7(), var8.k5(), var4.getFlipH(), var4.getFlipV(), var4.getRotation());
         AutoShape var24 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), AutoShape.class);
         if (var24 != null && var24.l6() != null && this.n5((GeometryShape)var24) && this.n5(var24)) {
            TextFrame var12 = var24.l6();
            PPImage var13 = (PPImage)var24.u3().getPictureFillFormat().getPicture().getImage();
            float var14 = var13.getWidth();
            float var15 = var13.getHeight();
            float var16 = var14 / var15;
            float var17 = var8.s7() / var8.k5();
            if (var16 != var17 && var12.getParagraphs().getCount() > 0) {
               float var18 = var8.s7();
               float var19 = var8.k5();
               float var20 = var8.x8();
               float var21 = var8.n3();
               switch (var12.getParagraphs().get_Item(0).getParagraphFormat().getAlignment()) {
                  case 1:
                     var18 = var16 * var8.k5() * var13.t2().l6() / 96.0F;
                     var20 = var8.x8() + (var8.s7() - var18) / 2.0F;
                     var19 *= var13.t2().k5() / 96.0F;
                  default:
                     var4 = new ShapeFrame(var20, var21, var18, var19, var4.getFlipH(), var4.getFlipV(), var4.getRotation());
               }
            }
         }

         for (int var25 = 0; var25 < var3.length; var25++) {
            if (var3[var25].a6 != 0 && var3[var25].l6.h0() != 0) {
               a1v var26 = this.n5(var1, var4, var3[var25].l6, var7, var3[var25].a6, var5, var2);
               boolean var27 = var6 != null && k8s.n5(var6.getPicture().getImageTransform());
               if (var23 != null && !var23.e2() && var27 && var6.getPicture().getImage() != null) {
                  com.aspose.slides.internal.s5.c8 var28 = var26.u9();
                  if (com.aspose.slides.internal.v6g.k5.l6(var26, q3d.class) && com.aspose.slides.internal.v6g.k5.n5(var26, q3d.class).a0()) {
                     var23.n5(
                        var6.getPicture().getImage(),
                        com.aspose.slides.internal.v6g.k5.n5(var26, q3d.class).o0().y4(),
                        new a6l(com.aspose.slides.internal.o9b.c8.u3.o8(), var28)
                     );
                     return;
                  }

                  if (var6.getPicture().getImage().getSvgImage() != null) {
                     com.aspose.slides.internal.o9b.y1 var31 = new com.aspose.slides.internal.o9b.y1();
                     if (com.aspose.slides.internal.v6g.k5.l6(var26, y4f.class)) {
                        com.aspose.slides.internal.v6g.k5.n5(var26, y4f.class).o0().a6(var31);
                     } else {
                        var31 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 0.0F, 0.0F);
                     }

                     IPPImage var33 = ((ImageCollection)this.u9().getImages()).l6(var6.getPicture().getImage().getSvgImage());
                     var23.n5(var33, var31.y4(), new a6l(com.aspose.slides.internal.o9b.c8.u3.o8(), var28));
                     return;
                  }
               }

               int var29 = var1.a0().t4();
               if (var3[var25].l6.a6().length == 4
                  && (
                     !com.aspose.slides.internal.v6g.k5.l6(var26, q3d.class)
                        || !com.aspose.slides.internal.v6g.k5.n5(var26, q3d.class).a0()
                        || !var27
                        || !var26.u9().n5()
                  )) {
                  var1.a0().u9(3);
               }

               var26.n5(((PictureFillFormat)var6).t2());
               var1.n5(var3[var25].l6, null, var26);
               var1.a0().u9(var29);
               if (com.aspose.slides.internal.v6g.k5.l6(var26, q3d.class)) {
                  q3d var30 = (q3d)var26;
                  com.aspose.slides.internal.o9b.t4 var32 = var30.y1();
                  if (var32 != null && var2.n5(var32) == null) {
                     var30.dispose();
                  }
               }
            }
         }
      }
   }

   final void n5(e3 var1, s5u var2, ShapeElement[] var3, ShapeFrame var4) {
      if (var3.length != 0) {
         l6v var5 = this.n5(var4, var1.q0(), var3[0].l6, var2);

         for (int var6 = 0; var6 < var3.length; var6++) {
            if (var3[var6].getStrokeSource() != 0 && var3[var6].l6.h0() != 0) {
               var1.n5(var3[var6].l6, var5, (a1v)null);
            }
         }
      }
   }

   private void n5(e3 var1, s5u var2, ShapeFrame var3) {
      if (this.a6().getHyperlinkClick() != null) {
         var1.l6(this.a6().getHyperlinkClick());
      }

      if (var3.getWidth() != 0.0F || var3.getHeight() != 0.0F) {
         float var4 = var3.getX();
         float var5 = var3.getY();
         float var6 = var3.getWidth();
         float var7 = var3.getHeight();
         if (!com.aspose.slides.ms.System.n1.k5(var4)
            && !com.aspose.slides.ms.System.n1.k5(var5)
            && !com.aspose.slides.ms.System.n1.k5(var6)
            && !com.aspose.slides.ms.System.n1.k5(var7)) {
            com.aspose.slides.internal.w0.c8 var8 = new com.aspose.slides.internal.w0.c8(
               var3.getFlipH() == 1 ? -1.0F : 1.0F,
               0.0F,
               0.0F,
               var3.getFlipV() == 1 ? -1.0F : 1.0F,
               var3.getFlipH() == 1 ? var3.getCenterX() * 2.0F : 0.0F,
               var3.getFlipV() == 1 ? var3.getCenterY() * 2.0F : 0.0F
            );
            if (!com.aspose.slides.ms.System.n1.k5(var3.getRotation())) {
               var8.n5(
                  var3.getFlipH() == 1 ^ var3.getFlipV() == 1 ? -var3.getRotation() : var3.getRotation(),
                  new com.aspose.slides.internal.o9b.w1(var3.getCenterX(), var3.getCenterY()),
                  0
               );
            }

            com.aspose.slides.internal.w0.c8 var9 = var8;
            Shape[] var10 = this.a6().f2();
            j2x var11 = this.u3().e2();
            if (var11.x8() == -1) {
               for (int var12 = 0; var12 < var10.length; var12++) {
                  GeometryShape var13 = com.aspose.slides.internal.v6g.k5.n5(var10[var12], GeometryShape.class);
                  if (var13 != null && var13.e2().x8() != -1) {
                     if (this.a6().getLineFormat() == null || this.a6().getLineFormat().getSketchFormat().getSketchType() != 0) {
                        var11 = var13.e2();
                        break;
                     }

                     if (var13.getLineFormat() == null || ((SketchFormat)var13.getLineFormat().getSketchFormat()).a6().x8() != -1) {
                        var11 = ((SketchFormat)var13.getLineFormat().getSketchFormat()).a6();
                        break;
                     }
                  }
               }
            }

            if (com.aspose.slides.ms.System.q1.n5(var4) < 0.26F) {
               var4 = 0.0F;
            }

            if (com.aspose.slides.ms.System.q1.n5(var5) < 0.26F) {
               var5 = 0.0F;
            }

            ShapeElement[] var15 = this.n5(this.a6(), var11, var4, var5, var6, var7);
            IEffectFormatEffectiveData var16 = var15.length > 0 ? this.a6().y1().getEffective() : null;
            boolean var14 = false;
            if (l6(var16)) {
               var14 = l6o.n5(var1, var2, this.u3(), var15, var3, this.a6().getFillFormat());
            }

            if (!var14) {
               var1.k5(var9);
               this.n5(var1, var2, var15, var3, var16, (byte)7);
            }

            if (this.a6().getHyperlinkClick() != null) {
               var1.a6();
            }

            if (!var14) {
               var1.z3();
            }
         }
      }
   }

   private ShapeElement[] n5(Shape var1, j2x var2, float var3, float var4, float var5, float var6) {
      ShapeElement[] var7 = var2.n5(var1, var3, var4, var5, var6);
      AutoShape var8 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
      boolean var9 = var8 != null && this.n5((GeometryShape)var8) && this.n5(var8);
      if (var9 && var7.length > 0) {
         ShapeElement[] var10 = new ShapeElement[var7.length];

         for (int var11 = 0; var11 < var7.length; var11++) {
            ShapeElement var12 = var7[var11];
            byte var13 = var12.k5() == 0 && var12.getFillSource() == 0 ? 1 : var12.getFillSource();
            var10[var11] = new ShapeElement(var12.getParentShape(), var12.l6, var12.k5(), var12.k5, var13, var12.getStrokeSource(), var12.h0);
         }

         return var10;
      } else {
         return var7;
      }
   }

   static boolean n5(Slide var0, BaseSlide var1) {
      if (var0 == null) {
         return false;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterSlide.class) && var0.getLayoutSlide() != null) {
         BaseThemeManager var2 = (BaseThemeManager)var0.getLayoutSlide().getThemeManager();
         if (var2.u3().n5()) {
            return true;
         }
      }

      return var0.getThemeManager().isOverrideThemeEnabled() || ((BaseThemeManager)var0.getThemeManager()).u3().n5();
   }

   private boolean n5(AutoShape var1) {
      return var1.y4() && var1.u3() != null && var1.u3().getFillType() == 4;
   }

   private boolean n5(GeometryShape var1) {
      return var1.e2() != null && var1.e2().t2() == -1;
   }
}
