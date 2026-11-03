package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class n1r extends g4a {
   public n1r(Ink var1) {
      super(var1);
   }

   public final Ink n5() {
      return (Ink)super.a6();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!this.a6().getHidden() && !var2.c8().getHideInk()) {
         boolean var4 = false;
         if (!this.a6().a5()) {
            var4 = var1.n5("Figure", ((ShapeFrame)this.a6().getFrame()).n5().y4(), this.a6().getAlternativeText());
         }

         var3.throwIfInterruptionRequested();
         boolean var5 = com.aspose.slides.internal.v6g.k5.l6(var1, w2.class) && ((w2)var1).l6();
         ShapeFrame var6 = this.n3();
         float var7 = var6.getX();
         float var8 = var6.getY();
         float var9 = var6.getWidth();
         float var10 = var6.getHeight();
         if (!com.aspose.slides.ms.System.n1.k5(var7)
            && !com.aspose.slides.ms.System.n1.k5(var8)
            && !com.aspose.slides.ms.System.n1.k5(var9)
            && !com.aspose.slides.ms.System.n1.k5(var10)) {
            if (var6.getWidth() != 0.0F || var6.getHeight() != 0.0F) {
               List var11 = new List();
               if (this.n5().k5().size() > 0) {
                  List$Enumerator var12 = this.n5().k5().iterator();

                  try {
                     while (var12.hasNext()) {
                        q8i var13 = (q8i)var12.next();
                        this.n5(var13, var11);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                        var12.dispose();
                     }
                  }
               }

               List$Enumerator var30 = this.n5().n5().iterator();

               try {
                  while (var30.hasNext()) {
                     InkTrace var31 = (InkTrace)var30.next();
                     var11.addItem(var31);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                     var30.dispose();
                  }
               }

               com.aspose.slides.internal.x4g.s7 var32 = new com.aspose.slides.internal.x4g.s7();
               List$Enumerator var14 = var11.iterator();

               try {
                  while (var14.hasNext()) {
                     InkTrace var15 = (InkTrace)var14.next();
                     var32.l6(
                        (com.aspose.slides.internal.o9b.w1[])var15.n5(com.aspose.slides.internal.o9b.p8.n5(new com.aspose.slides.internal.o9b.p8(0, 0)).a6())
                           .toArray(new com.aspose.slides.internal.o9b.w1[0])
                     );
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     var14.dispose();
                  }
               }

               com.aspose.slides.internal.o9b.y1 var33 = var32.s7().y4();
               com.aspose.slides.internal.w0.c8 var16 = new com.aspose.slides.internal.w0.c8(
                  var6.getFlipH() == 1 ? -1.0F : 1.0F,
                  0.0F,
                  0.0F,
                  var6.getFlipV() == 1 ? -1.0F : 1.0F,
                  var6.getFlipH() == 1 ? var6.getCenterX() * 2.0F : 0.0F,
                  var6.getFlipV() == 1 ? var6.getCenterY() * 2.0F : 0.0F
               );
               if (!com.aspose.slides.ms.System.n1.k5(var6.getRotation())) {
                  var16.n5(
                     var6.getFlipH() == 1 ^ var6.getFlipV() == 1 ? -var6.getRotation() : var6.getRotation(),
                     new com.aspose.slides.internal.o9b.w1(var6.getCenterX(), var6.getCenterY()),
                     0
                  );
               }

               com.aspose.slides.internal.w0.c8 var17 = var16;
               if (!var5) {
                  var17.l6(var7, var8);
               }

               if (var33.s7() != 0.0F && var33.k5() != 0.0F) {
                  var17.n5(var9 / var33.s7(), var33.k5() < ((InkBrush)((InkTrace)var11.get_Item(0)).getBrush()).l6().l6() ? 1.0F : var10 / var33.k5());
               }

               var1.k5(var17);
               var1.n5(this.n5());
               this.n5(var1, var11, var2, var33.y4(), var5);
               var1.n5((Shape)null);
               var1.z3();
               if (var4) {
                  var1.u9();
               }
            }
         }
      }
   }

   private void n5(e3 var1, List<InkTrace> var2, s5u var3, com.aspose.slides.internal.o9b.y1 var4, boolean var5) {
      float var6 = var1.y1().c8() / var1.c8();
      float var7 = var1.y1().y4() / var1.t2();
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      var8.l6(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 100.0F, 50.0F));
      j5m var9 = new j5m(this.n3().cloneT(), var1.q0(), var8, this.h0(), var3);
      l6v var10 = new l6v(var9, this.a6().y2());
      var10.n5(true);
      var10.n5((byte)0);
      a1v var11 = a1v.l6(var9, this.a6().c8);
      List$Enumerator var12 = var2.iterator();

      try {
         while (var12.hasNext()) {
            InkTrace var13 = (InkTrace)var12.next();
            InkBrush var14 = (InkBrush)var13.getBrush();
            e3 var15 = var1;
            com.aspose.slides.internal.o9b.l6 var16 = var1.y1();
            List var17 = new List();
            List var18 = new List();
            com.aspose.slides.internal.o9b.f2 var19 = var14.l6().a6();
            var10.n5((double)var19.l6());
            if (Ink.getInkEffectImages().containsKey(var14.getInkEffect())) {
               LineFillFormat var20 = new LineFillFormat(this.n5());
               var20.u3();
               var20.t2().setPictureFillMode(0);
               IPPImage var21 = this.u9().getImages().addImage(Ink.getInkEffectImages().get_Item(var14.getInkEffect()));
               var20.t2().getPicture().setImage(var21);
               float var22 = (float)var13.n3().l6("X").y4();
               float var23 = (float)var13.n3().l6("Y").y4();
               float var24 = var14.k5().l6() * 72.0F / 2.54F / var22 - var9.l6.getX();
               float var25 = var14.k5().k5() * 72.0F / 2.54F / var23 - var9.l6.getY();
               var20.t2().setTileOffsetX(var24);
               var20.t2().setTileOffsetY(var25);
               var20.t2().setTileScaleX(var14.u3());
               var20.t2().setTileScaleY(var14.u3());
               q3d var26 = new q3d(var9, (PictureFillFormat)var20.t2());
               var11 = var26;
               var10.u9 = var26;
            } else {
               var10.n5(var13.y4().o8());
               var11.n5(var10.h0().o8());
               var11.l6(var10.h0().o8());
            }

            if (var14.u9() == 2) {
               if (var3.c8().getInterpretMaskOpAsOpacity()) {
                  var10.n5(com.aspose.slides.internal.o9b.c8.n5(128, var13.y4().o8()).o8());
                  var11.n5(var10.h0().o8());
                  var11.l6(var10.h0().o8());
               } else {
                  if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class) || com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
                     RenderingOptions var36 = new RenderingOptions();
                     var36.getInkOptions().setHideInk(true);
                     var16 = ((Slide)this.h0())
                        .l6(
                           var36,
                           new com.aspose.slides.internal.o9b.p8(
                              com.aspose.slides.internal.v6g.k5.u3(var1.s7() * var6, 13), com.aspose.slides.internal.v6g.k5.u3(var1.x8() * var7, 13)
                           )
                        );
                  }

                  com.aspose.slides.internal.o9b.l6 var37 = new com.aspose.slides.internal.o9b.l6(var16.e2(), var16.h0(), var16.s7());
                  var37.n5();
                  var15 = new r1c(var37, var1.s7(), var1.x8());
                  var15.k5(var1.q0());
               }
            }

            if (var5 && var15 == var1) {
               com.aspose.slides.internal.o9b.l6 var38 = new com.aspose.slides.internal.o9b.l6(
                  com.aspose.slides.internal.v6g.k5.u3(var4.s7() + ((InkBrush)var13.getBrush()).l6().l6(), 13) + 2,
                  com.aspose.slides.internal.v6g.k5.u3(var4.k5() + ((InkBrush)var13.getBrush()).l6().k5(), 13) + 2,
                  var16.s7()
               );
               var38.n5();
               var15 = new r1c(var38, var38.e2(), var38.h0());
               com.aspose.slides.internal.w0.c8 var42 = new com.aspose.slides.internal.w0.c8();
               var42.l6(((InkBrush)var13.getBrush()).l6().l6() / 2.0F, ((InkBrush)var13.getBrush()).l6().k5() / 2.0F);
               var15.k5(var42);
            }

            for (int var39 = 0; var39 < var13.l6().size(); var39++) {
               com.aspose.slides.internal.o9b.w1 var43 = new com.aspose.slides.internal.o9b.w1();
               float var45 = 0.0F;
               List var47 = var13.l6().get_Item(var39);

               for (int var49 = 0; var49 < var47.size(); var49++) {
                  if ("X".equals(var13.n3().l6().get_Item(var49).l6())) {
                     var43.n5((Float)var47.get_Item(var49) - var4.a6());
                  }

                  if ("Y".equals(var13.n3().l6().get_Item(var49).l6())) {
                     var43.l6((Float)var47.get_Item(var49) - var4.t2());
                  }

                  if ("F".equals(var13.n3().l6().get_Item(var49).l6())) {
                     var45 = (Float)var47.get_Item(var49);
                  }
               }

               var17.addItem(var43.u3());
               var18.addItem(var45);
            }

            if (var14.a6() == 1) {
               var10.n5(1.0);
               new List();
               if (var17.size() > 0) {
                  int var44 = 0;
                  com.aspose.slides.internal.x4g.s7 var46 = new com.aspose.slides.internal.x4g.s7();
                  List var40 = new List();
                  com.aspose.slides.internal.o9b.w1 var48 = ((com.aspose.slides.internal.o9b.w1)var17.get_Item(var44)).u3();
                  com.aspose.slides.internal.o9b.w1 var50 = new com.aspose.slides.internal.o9b.w1(
                     var48.l6() - var19.l6() / 2.0F, var48.k5() + var19.k5() / 2.0F
                  );
                  var40.addItem(var50.u3());
                  com.aspose.slides.internal.o9b.w1 var51 = new com.aspose.slides.internal.o9b.w1(
                     var48.l6() + var19.l6() / 2.0F, var48.k5() + var19.k5() / 2.0F
                  );
                  var40.addItem(var51.u3());
                  com.aspose.slides.internal.o9b.w1 var52 = new com.aspose.slides.internal.o9b.w1(
                     var48.l6() + var19.l6() / 2.0F, var48.k5() - var19.k5() / 2.0F
                  );
                  var40.addItem(var52.u3());
                  com.aspose.slides.internal.o9b.w1 var27 = new com.aspose.slides.internal.o9b.w1(
                     var48.l6() - var19.l6() / 2.0F, var48.k5() - var19.k5() / 2.0F
                  );
                  var40.addItem(var27.u3());
                  var40.addItem(var50.u3());
                  var46.k5((com.aspose.slides.internal.o9b.w1[])var40.toArray(new com.aspose.slides.internal.o9b.w1[0]));
                  var15.n5(var46, (var10.h0().s7() & 255) < 255 ? null : var10, var11);

                  while (var44 < var17.size() - 1) {
                     var40 = new List();
                     com.aspose.slides.internal.o9b.w1 var28 = ((com.aspose.slides.internal.o9b.w1)var17.get_Item(var44 + 1)).u3();
                     com.aspose.slides.internal.o9b.w1 var29 = new com.aspose.slides.internal.o9b.w1(
                        var28.l6() - var19.l6() / 2.0F, var28.k5() + var19.k5() / 2.0F
                     );
                     com.aspose.slides.internal.o9b.w1 var30 = new com.aspose.slides.internal.o9b.w1(
                        var28.l6() + var19.l6() / 2.0F, var28.k5() + var19.k5() / 2.0F
                     );
                     com.aspose.slides.internal.o9b.w1 var31 = new com.aspose.slides.internal.o9b.w1(
                        var28.l6() + var19.l6() / 2.0F, var28.k5() - var19.k5() / 2.0F
                     );
                     com.aspose.slides.internal.o9b.w1 var32 = new com.aspose.slides.internal.o9b.w1(
                        var28.l6() - var19.l6() / 2.0F, var28.k5() - var19.k5() / 2.0F
                     );
                     if (var48.l6() < var28.l6() && var48.k5() > var28.k5()) {
                        var40.addItem(var27.u3());
                        var40.addItem(var32.u3());
                        var40.addItem(var31.u3());
                        var40.addItem(var30.u3());
                        var40.addItem(var51.u3());
                        var40.addItem(var52.u3());
                        var40.addItem(var27.u3());
                     }

                     if (var48.l6() == var28.l6() && var48.k5() > var28.k5()) {
                        var40.addItem(var27.u3());
                        var40.addItem(var32.u3());
                        var40.addItem(var31.u3());
                        var40.addItem(var52.u3());
                        var40.addItem(var27.u3());
                     }

                     if (var48.l6() > var28.l6() && var48.k5() > var28.k5()) {
                        var40.addItem(var50.u3());
                        var40.addItem(var29.u3());
                        var40.addItem(var32.u3());
                        var40.addItem(var31.u3());
                        var40.addItem(var52.u3());
                        var40.addItem(var27.u3());
                        var40.addItem(var50.u3());
                     }

                     if (var48.l6() < var28.l6() && var48.k5() == var28.k5()) {
                        var40.addItem(var52.u3());
                        var40.addItem(var31.u3());
                        var40.addItem(var30.u3());
                        var40.addItem(var51.u3());
                        var40.addItem(var52.u3());
                     }

                     if (var48.l6() > var28.l6() && var48.k5() == var28.k5()) {
                        var40.addItem(var27.u3());
                        var40.addItem(var32.u3());
                        var40.addItem(var29.u3());
                        var40.addItem(var50.u3());
                        var40.addItem(var27.u3());
                     }

                     if (var48.l6() < var28.l6() && var48.k5() < var28.k5()) {
                        var40.addItem(var50.u3());
                        var40.addItem(var29.u3());
                        var40.addItem(var30.u3());
                        var40.addItem(var31.u3());
                        var40.addItem(var52.u3());
                        var40.addItem(var51.u3());
                        var40.addItem(var50.u3());
                     }

                     if (var48.l6() == var28.l6() && var48.k5() < var28.k5()) {
                        var40.addItem(var50.u3());
                        var40.addItem(var51.u3());
                        var40.addItem(var30.u3());
                        var40.addItem(var29.u3());
                        var40.addItem(var50.u3());
                     }

                     if (var48.l6() > var28.l6() && var48.k5() < var28.k5()) {
                        var40.addItem(var27.u3());
                        var40.addItem(var32.u3());
                        var40.addItem(var29.u3());
                        var40.addItem(var30.u3());
                        var40.addItem(var51.u3());
                        var40.addItem(var50.u3());
                        var40.addItem(var27.u3());
                     }

                     if (var40.size() > 0) {
                        var46.t2();
                        var46.k5((com.aspose.slides.internal.o9b.w1[])var40.toArray(new com.aspose.slides.internal.o9b.w1[0]));
                        var15.n5(var46, (var10.h0().s7() & 255) < 255 ? null : var10, var11);
                     }

                     var28.n5(var48);
                     var50 = new com.aspose.slides.internal.o9b.w1(var48.l6() - var19.l6() / 2.0F, var48.k5() + var19.k5() / 2.0F);
                     var51 = new com.aspose.slides.internal.o9b.w1(var48.l6() + var19.l6() / 2.0F, var48.k5() + var19.k5() / 2.0F);
                     var52 = new com.aspose.slides.internal.o9b.w1(var48.l6() + var19.l6() / 2.0F, var48.k5() - var19.k5() / 2.0F);
                     var27 = new com.aspose.slides.internal.o9b.w1(var48.l6() - var19.l6() / 2.0F, var48.k5() - var19.k5() / 2.0F);
                     var44++;
                  }
               }
            } else {
               var15.n5(var10, (com.aspose.slides.internal.o9b.w1[])var17.toArray(new com.aspose.slides.internal.o9b.w1[0]));
            }

            if (var14.u9() == 2 && !var3.c8().getInterpretMaskOpAsOpacity()) {
               this.n5(var16, var15.y1());
               var1.n5(var16, -var1.q0().c8(), -var1.q0().t2(), var1.s7(), var1.x8());
               if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class) || com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
                  var16.dispose();
                  var15.dispose();
               }
            } else if (var5) {
               var1.n5(
                  var15.y1(),
                  this.n5().getX() - ((InkBrush)var13.getBrush()).l6().l6() / 2.0F,
                  this.n5().getY() - ((InkBrush)var13.getBrush()).l6().k5() / 2.0F
               );
               var15.dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   private void n5(q8i var1, List<InkTrace> var2) {
      List$Enumerator var3 = var1.l6().iterator();

      try {
         while (var3.hasNext()) {
            q8i var4 = (q8i)var3.next();
            this.n5(var4, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var13 = var1.n5().iterator();

      try {
         while (var13.hasNext()) {
            InkTrace var5 = (InkTrace)var13.next();
            var2.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      int var3 = var1.e2();
      int var4 = var1.h0();
      com.aspose.slides.internal.j9e.n5 var5 = var2.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var2.e2(), var2.h0()), 1, 2498570);
      com.aspose.slides.internal.j9e.n5 var6 = var1.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var1.e2(), var1.h0()), 3, 2498570);
      com.aspose.slides.ms.System.x9 var7 = var5.u3();
      com.aspose.slides.ms.System.x9 var8 = var6.u3();
      int var9 = var3 * var4;
      int[] var10 = new int[var9];
      int[] var11 = new int[var9];
      com.aspose.slides.internal.e3m.n5.n5(var7, var10, 0, var9);
      com.aspose.slides.internal.e3m.n5.n5(var8, var11, 0, var9);

      for (int var12 = 0; var12 < var4; var12++) {
         for (int var13 = 0; var13 < var3; var13++) {
            int var14 = var12 * var3 + var13;
            int var15 = var10[var14];
            int var16 = var11[var14];
            int var17 = n5(var15, var16);
            var11[var14] = var17;
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var11, 0, var8, var9);
      var2.n5(var5);
      var1.n5(var6);
   }

   static int n5(int var0, int var1) {
      long var2 = var1 & 4294967295L;
      if ((var0 >> 24 & 0xFF) != 0) {
         var2 = var1 & var0 & 4294967295L;
      }

      return (int)var2;
   }
}
