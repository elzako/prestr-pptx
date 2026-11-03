package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

class g4a {
   private Shape n5;
   private static final com.aspose.slides.internal.o9b.w1[] l6 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 0)
   );
   private static final float[] k5 = new float[0];

   public g4a(Shape var1) {
      if (var1 == null) {
         throw new ArgumentNullException("shape");
      }

      this.n5(var1);
   }

   public final Shape a6() {
      return this.n5;
   }

   private void n5(Shape var1) {
      this.n5 = var1;
   }

   public final Presentation u9() {
      return (Presentation)this.a6().getPresentation();
   }

   public final BaseSlide h0() {
      return this.a6().j9();
   }

   final com.aspose.slides.internal.o9b.w1[] c8() {
      com.aspose.slides.internal.o9b.w1[] var1 = this.a6().P_();
      if (var1 == null) {
         return l6;
      }

      if (var1.length > 0) {
         ShapeFrame var2 = this.a6().p8();
         com.aspose.slides.internal.w0.c8 var3 = new com.aspose.slides.internal.w0.c8(
            var2.getFlipH() == 1 ? -1.0F : 1.0F,
            0.0F,
            0.0F,
            var2.getFlipV() == 1 ? -1.0F : 1.0F,
            var2.getFlipH() == 1 ? var2.getCenterX() * 2.0F : 0.0F,
            var2.getFlipV() == 1 ? var2.getCenterY() * 2.0F : 0.0F
         );
         if (!com.aspose.slides.ms.System.n1.k5(var2.getRotation())) {
            var3.n5(
               var2.getFlipH() == 1 ^ var2.getFlipV() == 1 ? -var2.getRotation() : var2.getRotation(),
               new com.aspose.slides.internal.o9b.w1(var2.getCenterX(), var2.getCenterY()),
               0
            );
         }

         com.aspose.slides.internal.w0.c8 var4 = var3;
         var4.n5(var1);
         return var1;
      } else {
         return var1;
      }
   }

   final float[] t2() {
      float[] var1 = this.a6().Q_();
      return var1 != null ? var1 : k5;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(int var1, float var2, float var3) {
      float var4 = ((SlideSize)this.u9().getSlideSize()).n5().l6() > this.a6().getWidth()
         ? ((SlideSize)this.u9().getSlideSize()).n5().l6()
         : this.a6().getWidth();
      float var5 = ((SlideSize)this.u9().getSlideSize()).n5().k5() > this.a6().getHeight()
         ? ((SlideSize)this.u9().getSlideSize()).n5().k5()
         : this.a6().getHeight();
      if (var1 == 0 || var1 == 2) {
         var4 = ((SlideSize)this.u9().getSlideSize()).n5().l6();
         var5 = ((SlideSize)this.u9().getSlideSize()).n5().k5();
      }

      float var6 = this.a6().getWidth();
      float var7 = this.a6().getHeight();
      d2k var8 = d2k.k5.u3();
      float var9 = this.a6().s3().k5();
      if (var1 == 1) {
         this.a6().s3().n5(0.0F);
         float[] var10 = new float[]{var4};
         float[] var11 = new float[]{var5};
         com.aspose.slides.internal.o9b.y1 var12 = this.n5(var10, var11).y4();
         var4 = var10[0];
         var5 = var11[0];
         var8.n5 = var12.x8();
         var8.l6 = var12.n3();
         var6 = var12.s7();
         var7 = var12.k5();
      }

      com.aspose.slides.internal.o9b.l6 var68 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4 * var2), 14),
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5 * var3), 14),
         2498570
      );
      com.aspose.slides.internal.o9b.z1 var69 = com.aspose.slides.internal.o9b.z1.n5(var68);

      try {
         var69.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
      } finally {
         if (var69 != null) {
            var69.dispose();
         }
      }

      com.aspose.slides.ms.System.o0 var70 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var70.k5());
         var68.n5(96.0F, 96.0F);
         r1c var13 = new r1c(
            var68,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5), 14)
         );

         try {
            com.aspose.slides.internal.t4r.n5 var14 = new com.aspose.slides.internal.t4r.n5<>(
               com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
            );
            y4x var15 = new y4x();
            s5u var16 = new s5u(this.h0(), var14, var15);
            if (var8.n5 != 0.0F || var8.l6 != 0.0F) {
               var13.n5(-var8.n5, -var8.l6);
            }

            this.n5(var13, var16, InterruptionToken.getNone());
         } finally {
            if (var13 != null) {
               var13.dispose();
            }
         }

         if (var1 == 1) {
            int var71 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6 * var2)), 14);
            int var75 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var7 * var3)), 14);
            com.aspose.slides.internal.o9b.l6 var77 = new com.aspose.slides.internal.o9b.l6(var71, var75, 2498570);
            com.aspose.slides.internal.o9b.z1 var17 = com.aspose.slides.internal.o9b.z1.n5(var77);

            try {
               com.aspose.slides.internal.o9b.y1 var18 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var71, var75);
               var17.n5(var68, var18.y4(), var18.y4(), 2);
            } finally {
               if (var17 != null) {
                  var17.dispose();
               }
            }

            var68.dispose();
            var68 = var77;
         }

         if (var1 == 2) {
            com.aspose.slides.internal.o9b.l6 var72 = com.aspose.slides.internal.n8e.k7.n5(var68);
            var68.dispose();
            var68 = var72;
         }

         String var73 = null;
         String[] var10000 = new String[]{var73};
         byte[] var79 = null;
         byte[][] var81 = new byte[][]{var79};
         int[] var78 = Presentation.n5((s4e)this.u9().t4(), var81);
         var79 = var81[0];
         String[] var76 = com.aspose.slides.internal.n8e.w1.u3();
         if (Arrays.equals(var78, i7t.l6) && var79 != null && var79.length > 0) {
            var76 = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var79), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
         }

         int[] var19 = com.aspose.slides.internal.n8e.z7.n5;
         if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
            try {
               var19 = com.aspose.slides.internal.n8e.f2.l6();
            } catch (IllegalStateException var61) {
               var19 = com.aspose.slides.internal.n8e.z7.n5;
               com.aspose.slides.internal.n8e.v4.n5(var61);
            }
         }

         var73 = var76[0];
         if ((
               !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
                  || com.aspose.slides.internal.n8e.j5.n5() == null
                  || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
            )
            && !Arrays.equals(var78, i7t.k5)
            && !Arrays.equals(var19, com.aspose.slides.internal.n8e.z7.l6)) {
            TextParam$FontArgs var20 = new TextParam$FontArgs();
            var20.Name = "Arial";
            var20.Height = 26.0F;
            var20.Bold = true;
            TextParam var21 = new TextParam(this.u9(), 72.0F, var20.Clone());
            var21.n5(com.aspose.slides.internal.o9b.c8.n5(192, 255, 216, 207).o8());
            var21.l6(true);
            com.aspose.slides.internal.o9b.z1 var22 = com.aspose.slides.internal.o9b.z1.n5(var68);

            try {
               com.aspose.slides.internal.o9b.n3 var23 = new com.aspose.slides.internal.o9b.n3("Arial", 26.0F);
               var22.n5(
                  var73,
                  var23,
                  new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(192, 255, 216, 207).o8()),
                  new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var68.e2(), var68.h0())
               );
            } finally {
               if (var22 != null) {
                  var22.dispose();
               }
            }
         }

         r6e.n5(var70.k5(), var68);
         return var68;
      } catch (RuntimeException var66) {
         r6e.l6(var70.k5());
         var68.dispose();
         return null;
      } finally {
         this.a6().s3().n5(var9);
      }
   }

   final com.aspose.slides.internal.o9b.y1 s7() {
      float var1 = ((SlideSize)this.u9().getSlideSize()).n5().l6() > this.a6().getWidth()
         ? ((SlideSize)this.u9().getSlideSize()).n5().l6()
         : this.a6().getWidth();
      float var2 = ((SlideSize)this.u9().getSlideSize()).n5().k5() > this.a6().getHeight()
         ? ((SlideSize)this.u9().getSlideSize()).n5().k5()
         : this.a6().getHeight();
      float[] var3 = new float[]{var1};
      float[] var4 = new float[]{var2};
      com.aspose.slides.internal.o9b.y1 var5 = this.n5(var3, var4).y4();
      var1 = var3[0];
      var2 = var4[0];
      return var5;
   }

   private com.aspose.slides.internal.o9b.y1 n5(float[] var1, float[] var2) {
      float var3 = this.a6().getWidth();
      float var4 = this.a6().getHeight();
      d2k var5 = d2k.k5.u3();
      var5.n5 = this.a6().getX();
      var5.l6 = this.a6().getY();
      d0e var6 = this.a6().y1().h0();
      if (!var6.isNoEffects()) {
         com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(var5.n5, var5.l6, var3, var4);
         n2d.n5(var6, var7.y4()).a6(var7);
         var5.n5 = var7.x8();
         var5.l6 = var7.n3();
         var3 = var7.s7();
         var4 = var7.k5();
      }

      if (l6o.n5()) {
         com.aspose.slides.internal.o9b.y1 var12 = l6o.n5(this.a6()).y4();
         com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(var5.n5, var5.l6, var3, var4);
         com.aspose.slides.internal.o9b.y1.l6(var8.y4(), var12.y4()).a6(var8);
         var5.n5 = var8.x8();
         var5.l6 = var8.n3();
         var3 = var8.s7();
         var4 = var8.k5();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.a6(), AutoShape.class) && ((AutoShape)this.a6()).getTextFrame() != null) {
         AutoShape var13 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), AutoShape.class);
         if (var13.isTextBox()) {
            TextFrame var15 = (TextFrame)var13.getTextFrame();
            s3z.n5(var15.u3, this.a6().getWidth(), this.a6().getHeight(), null);
            d2k var9 = var15.u3.k5().u3();
            if (var4 < var9.l6) {
               var4 = var9.l6;
               d2k.n5(var5, var15.u3.l6()).n5(var5);
            }
         }
      }

      d2k[] var14 = new d2k[]{var5};
      float[] var16 = new float[]{var3};
      float[] var17 = new float[]{var4};
      this.n5(var14, var16, var17, var1, var2);
      var14[0].n5(var5);
      var3 = var16[0];
      var4 = var17[0];
      return new com.aspose.slides.internal.o9b.y1(var5.n5, var5.l6, var3, var4);
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1, ISVGOptions var2) {
      float var3 = this.a6().getWidth();
      float var4 = this.a6().getHeight();
      float var5 = this.a6().getX();
      float var6 = this.a6().getY();
      if (var2 == null) {
         var2 = new SVGOptions();
      }

      boolean var7 = false;
      boolean var8 = var2.getUseFrameRotation();
      float var9 = this.a6().s3().k5();
      if (var8 && !com.aspose.slides.ms.System.n1.k5(var9) && var9 != 0.0F) {
         com.aspose.slides.internal.o9b.y1 var10 = n5(this.a6().p8()).y4();
         var5 = var10.x8();
         var6 = var10.n3();
         var3 = var10.s7();
         var4 = var10.k5();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.a6(), GroupShape.class) && this.n5((IShape)this.a6())) {
         com.aspose.slides.internal.o9b.y1 var45 = this.x8().y4();
         var5 = var45.x8();
         var6 = var45.n3();
         var3 = var45.s7();
         var4 = var45.k5();
      }

      AutoShape var46 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), AutoShape.class);
      GeometryShape var11 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), GeometryShape.class);
      Ink var12 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), Ink.class);
      if (!var2.getUseFrameSize()
         && (var46 != null && var46.getTextFrame() != null && var46.l6().h0() || var11 != null && var11.e2() != null && var11.e2().x8() != 5 || var12 != null)) {
         com.aspose.slides.internal.o9b.y2 var13 = this.n5().n3();
         var3 = var13.t2();
         var4 = var13.l6();
         var5 = var13.s7();
         var6 = var13.x8();
         var7 = true;
      }

      if (var46 != null && var46.getTextFrame() != null && var46.isTextBox() && !var7 && !var2.getUseFrameSize()) {
         TextFrame var47 = (TextFrame)var46.getTextFrame();
         i2h var14 = var47.n5(this.a6()).k5();
         s3z.n5(var47.u3, this.a6().getWidth() - var14.l6 - var14.u3, this.a6().getHeight() - var14.k5 - var14.a6, null);
         d2k var15 = var47.u3.l6().u3();
         var6 += var15.l6;
         var5 += var15.n5;
         var4 = var47.u3.k5().l6 + var14.k5;
      }

      ILineFormatEffectiveData var48 = this.a6().getLineFormat() != null ? this.a6().getLineFormat().getEffective() : null;
      if (var48 != null
         && (var48.getAlignment() == 0 || var48.getAlignment() == -1)
         && var48.getFillFormat() != null
         && var48.getFillFormat().getFillType() != 0
         && !com.aspose.slides.ms.System.d2.k5(var48.getWidth())) {
         float var49 = (float)var48.getWidth();
         float var16 = 0.0F;
         if (var48.getBeginArrowheadStyle() != 0) {
            float[] var17 = new float[]{0.0F};
            com.aspose.slides.internal.x4g.s7 var51 = l6v.n5(
               var48.getBeginArrowheadStyle(), var48.getBeginArrowheadLength(), var48.getBeginArrowheadWidth(), var17
            );
            var16 = var17[0];
            com.aspose.slides.internal.o9b.y1 var18 = var51.n5(
                  new com.aspose.slides.internal.x4g.m1(0.0F, 1.0F, -1.0F, 0.0F, var16, 0.0F), com.aspose.slides.internal.o9b.z8.n5()
               )
               .y4();
            if (var18.s7() > var49) {
               var49 = var18.s7() * (float)var48.getWidth();
            }
         }

         if (var48.getEndArrowheadStyle() != 0) {
            float[] var56 = new float[]{var16};
            com.aspose.slides.internal.x4g.s7 var52 = l6v.n5(var48.getEndArrowheadStyle(), var48.getEndArrowheadLength(), var48.getEndArrowheadWidth(), var56);
            var16 = var56[0];
            com.aspose.slides.internal.o9b.y1 var58 = var52.n5(
                  new com.aspose.slides.internal.x4g.m1(0.0F, -1.0F, 1.0F, 0.0F, var16, 0.0F), com.aspose.slides.internal.o9b.z8.n5()
               )
               .y4();
            if (var58.s7() > var49) {
               var49 = var58.s7() * (float)var48.getWidth();
            }
         }

         if (!var7) {
            var5 -= var49 / 2.0F;
            var6 -= var49 / 2.0F;
            var3 += var49;
            var4 += var49;
         }
      }

      int var50 = com.aspose.slides.internal.v6g.k5.u3(var3 + 0.5, 14);
      int var53 = com.aspose.slides.internal.v6g.k5.u3(var4 + 0.5, 14);
      if (var50 < var3 || var53 < var4) {
         var50 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var3 + 0.5F)), 14);
         var53 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var4 + 0.5F)), 14);
      }

      q4b var55 = new q4b(var50, var53, 72.0F, 72.0F, 72.0F, (SVGOptions)var2, null);
      com.aspose.slides.internal.t4r.n5 var57 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      com.aspose.slides.ms.System.o0 var59 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var59.k5());
         y4x var19 = new y4x();
         var19.h0 = true;
         var19.t2 = ((SVGOptions)var2).k5().k5();
         var19.s7 = var2.getDeletePicturesCroppedAreas();
         var19.n3 = var8;
         f1f var20 = new f1f(this.h0(), var57, var19, var2.getShapeFormattingController());
         var55.n5(var20);
         if (var5 != 0.0F || var6 != 0.0F) {
            if (com.aspose.slides.internal.v6g.k5.l6(this.a6(), PictureFrame.class)) {
               var55.n5(-((float)com.aspose.slides.ms.System.q1.n5((double)(var5), 2)), -((float)com.aspose.slides.ms.System.q1.n5((double)(var6), 2)));
            } else {
               var55.n5((float)com.aspose.slides.ms.System.q1.k5(-var5), (float)com.aspose.slides.ms.System.q1.k5(-var6));
            }
         }

         this.n5(var55, var20, InterruptionToken.getNone());
         var55.n5(var1, true);
         r6e.n5(var59.k5(), var1);
      } catch (RuntimeException var43) {
         r6e.l6(var59.k5());
         throw var43;
      } finally {
         Presentation var25 = null;
         Presentation[] var26 = new Presentation[]{var25};
         d0u.n5(Presentation.class, this.a6().getParent_Immediate(), var26);
         var25 = var26[0];
         Dictionary$Enumerator var27 = var57.l6().iterator();

         try {
            while (var27.hasNext()) {
               KeyValuePair var28 = (KeyValuePair)var27.next();
               if (var25 == null || !var25.c4().n5((com.aspose.slides.internal.k9.h0)var28.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var28.getValue()).k5().dispose();
                  var57.l6(var28.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
               var27.dispose();
            }
         }

         var55.dispose();
      }
   }

   void k5() {
   }

   final com.aspose.slides.internal.o9b.y1 x8() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(
         this.a6().getX(),
         this.a6().getY(),
         this.a6().getWidth() > 1.0F ? this.a6().getWidth() : 1.0F,
         this.a6().getHeight() > 1.0F ? this.a6().getHeight() : 1.0F
      );
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(var1.s7() * 4.0F, 13), com.aspose.slides.internal.v6g.k5.u3(var1.k5() * 4.0F, 13), 2498570
      );
      com.aspose.slides.ms.System.o0 var3 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var3.k5());
         var2.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
         var2.n5(96.0F, 96.0F);
         com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(var1.x8() - var1.s7() / 2.0F, var1.n3() - var1.k5() / 2.0F);
         r1c var5 = new r1c(var2, var2.e2(), var2.h0());

         try {
            var5.n5(-var4.l6(), -var4.k5());
            s5u var6 = new s5u(
               this.h0(), new com.aspose.slides.internal.t4r.n5<>(com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class), new y4x()
            );
            this.n5(var5, var6, InterruptionToken.getNone());
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }

         com.aspose.slides.internal.o9b.y1 var15 = com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.n8e.k7.l6(var2)).y4();
         var15.k5(var4.l6(), var4.k5());
         com.aspose.slides.internal.o9b.y1.l6(var1.y4(), var15.y4()).a6(var1);
      } finally {
         r6e.n5(var3.k5(), var2);
         var2.dispose();
      }

      return var1;
   }

   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.a6(), LegacyDiagram.class)) {
         LegacyDiagram var4 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), LegacyDiagram.class);
         var4.k5().e5().n5(var1, var2, var3);
      } else {
         var3.throwIfInterruptionRequested();
         if (this.a6().w1() != null) {
            this.a6().w1().e5().n5(var1, var2, var3);
         }
      }
   }

   final ShapeFrame n5(double var1, double var3) {
      x4t var5 = new x4t();
      var5.l6 = 0.0F;
      var5.u3 = false;
      var5.k5 = false;
      l3f var6 = new l3f();
      new e4c(var1, var3).a6().n5(var6.n5);
      d2k.k5.n5(var6.l6);
      var6.k5 = var5;
      l3f var7 = this.n5(var6).l6();
      return new ShapeFrame(var7.n5.n5, var7.n5.l6, var7.l6.n5, var7.l6.l6, (byte)(var7.k5.u3 ? 1 : 0), (byte)(var7.k5.k5 ? 1 : 0), var7.k5.l6);
   }

   final l3f n5(l3f var1) {
      return this.n5(var1.l6(), false);
   }

   final l3f n5(l3f var1, boolean var2) {
      boolean var3 = this.a6().b3();
      boolean var4 = var3;
      boolean var5 = var1.k5.u3;
      boolean var6 = var1.k5.k5;
      float var7 = var1.k5.l6;
      d2k var8 = d2k.n5(var1.n5, d2k.n5(var1.l6, 2)).u3();
      d2k var9 = var8.u3();
      double var10 = var1.l6.n5;
      double var12 = var1.l6.l6;
      GroupShape var14 = this.a6().f0();

      while (var14 != null && (var14.x9() != null || var14.n5().k5() != null)) {
         if (var14.x9() != null) {
            o4f var15 = var14.R_();
            e4c var16 = var14.x8().u9();
            if (!var3) {
               var10 *= var16.n5;
               var12 *= var16.l6;
            } else {
               var10 *= var16.l6;
               var12 *= var16.n5;
            }

            if (!(var3 ^ var4)) {
               var5 ^= var15.u3() == 1;
               var6 ^= var15.a6() == 1;
            } else {
               var5 ^= var15.a6() == 1;
               var6 ^= var15.u3() == 1;
            }

            if (var15.u3() == 1 ^ var15.a6() == 1) {
               var7 = -var7;
            }

            var7 += var15.k5();
            var3 ^= var14.b3();
            var14.n5(var8.u3(), var9.u3(), var2).a6().n5(var8);
            e4c.n5(var15.n5(), e4c.n5(var14.z7(), 2)).a6().n5(var9);
            var14 = var14.f0();
         } else {
            o4f var17 = ((Shape)var14.n5().k5()).R_();
            if (!(var3 ^ var4)) {
               var5 ^= var17.u3() == 1;
               var6 ^= var17.a6() == 1;
            } else {
               var5 ^= var17.a6() == 1;
               var6 ^= var17.u3() == 1;
            }

            var3 ^= var14.b3();
            e4c.n5(var8.l6(), var17.n5()).a6().n5(var8);
            var17.n5().a6().n5(var9);
            var14 = ((Shape)var14.n5().k5()).f0();
         }
      }

      if (var14 != null && com.aspose.slides.internal.v6g.k5.l6(var14.p3(), Chart.class)) {
         e4c var18 = var14.x8().u9();
         if (!var3) {
            var10 *= var18.n5;
            var12 *= var18.l6;
         } else {
            var10 *= var18.l6;
            var12 *= var18.n5;
         }

         if (!(var3 ^ var4)) {
            var5 ^= var14.R_().u3() == 1;
            var6 ^= var14.R_().a6() == 1;
         } else {
            var5 ^= var14.R_().a6() == 1;
            var6 ^= var14.R_().u3() == 1;
         }

         if (var14.R_().u3() == 1 ^ var14.R_().a6() == 1) {
            var7 = -var7;
         }

         var7 += var14.R_().k5();
         var14.n5(var8.u3(), var9.u3(), var2).a6().n5(var8);
      }

      x4t var19 = new x4t();
      var19.u3 = var5;
      var19.k5 = var6;
      var19.l6 = ShapeFrame.n5(var7);
      l3f var20 = new l3f();
      var20.n5 = new d2k((float)(var8.n5 - var10 / 2.0), (float)(var8.l6 - var12 / 2.0));
      var20.l6 = new d2k((float)var10, (float)var12);
      var20.k5 = var19;
      return var20;
   }

   final ShapeFrame n3() {
      return this.n5(false);
   }

   final ShapeFrame n5(boolean var1) {
      l3f var2 = this.l6(var1).l6();
      return new ShapeFrame(var2.n5.n5, var2.n5.l6, var2.l6.n5, var2.l6.l6, (byte)(var2.k5.u3 ? 1 : 0), (byte)(var2.k5.k5 ? 1 : 0), var2.k5.l6);
   }

   final l3f y4() {
      return this.l6(false);
   }

   l3f l6(boolean var1) {
      this.k5();
      l3f var2 = this.t9().l6();
      return this.n5(var2.l6(), var1);
   }

   ShapeFrame e2() {
      this.k5();
      l3f var1 = this.t9().l6();
      int var2 = var1.k5.u3 ? 1 : 0;
      int var3 = var1.k5.k5 ? 1 : 0;
      return new ShapeFrame(var1.n5.n5, var1.n5.l6, var1.l6.n5, var1.l6.l6, (byte)var2, (byte)var3, var1.k5.l6);
   }

   final l3f t9() {
      o4f var1 = this.a6().R_();
      e4c var2 = var1.n5().u9();
      e4c var3 = this.a6().z7().u9();
      float var4 = var1.k5();
      byte var5 = var1.u3();
      byte var6 = var1.a6();
      if (com.aspose.slides.ms.System.d2.k5(var2.n5)
         || com.aspose.slides.ms.System.d2.k5(var2.l6)
         || com.aspose.slides.ms.System.d2.k5(var3.n5)
         || com.aspose.slides.ms.System.d2.k5(var3.l6)
         || com.aspose.slides.ms.System.n1.k5(var4)
         || var5 == -1
         || var6 == -1) {
         Shape[] var7 = this.a6().f2();

         for (int var8 = 0; var8 < var7.length; var8++) {
            Shape var9 = var7[var8];
            IShapeFrame var10 = var9.getFrame();
            if (com.aspose.slides.ms.System.d2.k5(var2.n5)) {
               var2.n5 = var10.getX();
            }

            if (com.aspose.slides.ms.System.d2.k5(var2.l6)) {
               var2.l6 = var10.getY();
            }

            if (com.aspose.slides.ms.System.d2.k5(var3.n5)) {
               var3.n5 = var10.getWidth();
            }

            if (com.aspose.slides.ms.System.d2.k5(var3.l6)) {
               var3.l6 = var10.getHeight();
            }

            if (com.aspose.slides.ms.System.n1.k5(var4)) {
               var4 = var10.getRotation();
            }

            if (var5 == -1) {
               var5 = var10.getFlipH();
            }

            if (var6 == -1) {
               var6 = var10.getFlipV();
            }

            if (!com.aspose.slides.ms.System.d2.k5(var2.n5)
               && !com.aspose.slides.ms.System.d2.k5(var2.l6)
               && !com.aspose.slides.ms.System.d2.k5(var3.n5)
               && !com.aspose.slides.ms.System.d2.k5(var3.l6)
               && !com.aspose.slides.ms.System.n1.k5(var4)
               && var5 != -1
               && var6 != -1) {
               break;
            }
         }
      }

      if (com.aspose.slides.ms.System.d2.k5(var2.n5)) {
         var2.n5 = 0.0;
      }

      if (com.aspose.slides.ms.System.d2.k5(var2.l6)) {
         var2.l6 = 0.0;
      }

      if (com.aspose.slides.ms.System.d2.k5(var3.n5)) {
         var3.n5 = 0.0;
      }

      if (com.aspose.slides.ms.System.d2.k5(var3.l6)) {
         var3.l6 = 0.0;
      }

      if (com.aspose.slides.ms.System.n1.k5(var4)) {
         var4 = 0.0F;
      }

      if (var5 == -1) {
         var5 = 0;
      }

      if (var6 == -1) {
         var6 = 0;
      }

      x4t var11 = new x4t();
      var11.l6 = var4;
      var11.u3 = var5 == 1;
      var11.k5 = var6 == 1;
      l3f var12 = new l3f();
      var2.a6().n5(var12.n5);
      var3.a6().n5(var12.l6);
      var12.k5 = var11;
      return var12;
   }

   com.aspose.slides.internal.o9b.w1[] z1() {
      ShapeFrame var1 = this.n3();
      float var2 = var1.getX();
      float var3 = var1.getY();
      float var4 = var1.getWidth();
      float var5 = var1.getHeight();
      return !com.aspose.slides.ms.System.n1.k5(var2)
            && !com.aspose.slides.ms.System.n1.k5(var3)
            && !com.aspose.slides.ms.System.n1.k5(var4)
            && !com.aspose.slides.ms.System.n1.k5(var5)
         ? new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var2 + var4 / 2.0F, var3),
            new com.aspose.slides.internal.o9b.w1(var2, var3 + var5 / 2.0F),
            new com.aspose.slides.internal.o9b.w1(var2 + var4 / 2.0F, var3 + var5),
            new com.aspose.slides.internal.o9b.w1(var2 + var4, var3 + var5 / 2.0F)
         }
         : null;
   }

   static com.aspose.slides.internal.o9b.y1 n5(IShapeFrame var0) {
      com.aspose.slides.internal.o9b.w1[] var1 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      var1[0] = new com.aspose.slides.internal.o9b.w1(var0.getX(), var0.getY());
      var1[1] = new com.aspose.slides.internal.o9b.w1(var0.getX() + var0.getWidth(), var0.getY());
      var1[2] = new com.aspose.slides.internal.o9b.w1(var0.getX() + var0.getWidth(), var0.getY() + var0.getHeight());
      var1[3] = new com.aspose.slides.internal.o9b.w1(var0.getX(), var0.getY() + var0.getHeight());
      com.aspose.slides.internal.w0.c8 var2 = new com.aspose.slides.internal.w0.c8(
         var0.getFlipH() == 1 ? -1.0F : 1.0F,
         0.0F,
         0.0F,
         var0.getFlipV() == 1 ? -1.0F : 1.0F,
         var0.getFlipH() == 1 ? var0.getCenterX() * 2.0F : 0.0F,
         var0.getFlipV() == 1 ? var0.getCenterY() * 2.0F : 0.0F
      );
      if (!com.aspose.slides.ms.System.n1.k5(var0.getRotation())) {
         var2.n5(
            var0.getFlipH() == 1 ^ var0.getFlipV() == 1 ? -var0.getRotation() : var0.getRotation(),
            new com.aspose.slides.internal.o9b.w1(var0.getCenterX(), var0.getCenterY()),
            0
         );
      }

      com.aspose.slides.internal.w0.c8 var3 = var2;
      var3.n5(var1);
      float var4 = Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;
      float var6 = Float.MAX_VALUE;
      float var7 = -Float.MAX_VALUE;

      for (com.aspose.slides.internal.o9b.w1 var11 : var1) {
         if (var4 > var11.l6()) {
            var4 = var11.l6();
         }

         if (var5 < var11.l6()) {
            var5 = var11.l6();
         }

         if (var6 > var11.k5()) {
            var6 = var11.k5();
         }

         if (var7 < var11.k5()) {
            var7 = var11.k5();
         }
      }

      return new com.aspose.slides.internal.o9b.y1(var4, var6, var5 - var4, var7 - var6);
   }

   private void n5(d2k[] var1, float[] var2, float[] var3, float[] var4, float[] var5) {
      if (this.n5((IShape)this.a6())) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.a6(), GroupShape.class)) {
            com.aspose.slides.internal.o9b.y1 var10 = this.x8().y4();
            if (com.aspose.slides.internal.o9b.y1.u3(var10, com.aspose.slides.internal.o9b.y1.n5)) {
               com.aspose.slides.internal.o9b.y1 var11 = new com.aspose.slides.internal.o9b.y1(
                  new com.aspose.slides.internal.o9b.w1(var1[0].n5, var1[0].l6), new com.aspose.slides.internal.o9b.f2(var2[0], var3[0])
               );
               com.aspose.slides.internal.o9b.y1.l6(var10.y4(), var11.y4()).a6(var11);
               var1[0].n5 = var11.x8();
               var1[0].l6 = var11.n3();
               var2[0] = var11.s7();
               var3[0] = var11.k5();
               if (var5[0] < var11.k5()) {
                  var5[0] = var11.k5();
               }

               if (var4[0] < var11.s7()) {
                  var4[0] = var11.s7();
               }
            }
         } else {
            ILineFormatEffectiveData var6 = this.a6().getLineFormat() != null ? this.a6().getLineFormat().getEffective() : null;
            if (var6 != null
               && (var6.getAlignment() == 0 || var6.getAlignment() == -1)
               && var6.getFillFormat() != null
               && var6.getFillFormat().getFillType() != 0
               && !com.aspose.slides.ms.System.d2.k5(var6.getWidth())) {
               float var7 = (float)var6.getWidth();
               float var8 = var7;
               if (var6.getBeginArrowheadStyle() != 0) {
                  float var9 = this.n5(var7, var6.getBeginArrowheadStyle(), var6.getBeginArrowheadLength(), var6.getBeginArrowheadWidth());
                  var8 = com.aspose.slides.ms.System.q1.n5((float)(var9), (float)(var8));
               }

               if (var6.getEndArrowheadStyle() != 0) {
                  float var12 = this.n5(var7, var6.getEndArrowheadStyle(), var6.getEndArrowheadLength(), var6.getEndArrowheadWidth());
                  var8 = com.aspose.slides.ms.System.q1.n5((float)(var12), (float)(var8));
               }

               var1[0].n5 -= var8 / 2.0F;
               var1[0].l6 -= var8 / 2.0F;
               var2[0] += var8;
               var3[0] += var8;
               var4[0] += var8;
               var5[0] += var8;
            }
         }
      }
   }

   private float n5(float var1, byte var2, byte var3, byte var4) {
      float var5 = 0.0F;
      float[] var6 = new float[]{0.0F};
      com.aspose.slides.internal.x4g.s7 var7 = l6v.n5(var2, var3, var4, var6);
      var5 = var6[0];
      var7.y4();
      var7 = e3.n5(new List<>(com.aspose.slides.ms.System.u3.n5(var7.a6())), var7, var1, var2);
      com.aspose.slides.internal.o9b.y1 var8 = var7.n5(
            new com.aspose.slides.internal.x4g.m1(0.0F, 1.0F, -1.0F, 0.0F, var5, 0.0F), com.aspose.slides.internal.o9b.z8.n5()
         )
         .y4();
      return var8.s7();
   }

   private boolean n5(IShape var1) {
      ILineFormatEffectiveData var2 = var1.getLineFormat() != null ? var1.getLineFormat().getEffective() : null;
      if (var2 != null
         && (var2.getAlignment() == 0 || var2.getAlignment() == -1)
         && var2.getFillFormat() != null
         && var2.getFillFormat().getFillType() != 0
         && !com.aspose.slides.ms.System.d2.k5(var2.getWidth())) {
         return true;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, GroupShape.class)) {
         IGenericEnumerator var3 = ((GroupShape)var1).getShapes().iterator();

         try {
            while (var3.hasNext()) {
               IShape var4 = (IShape)var3.next();
               if (this.n5(var4)) {
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return false;
   }

   private com.aspose.slides.internal.o9b.y2 n5() {
      float var1 = ((SlideSize)this.u9().getSlideSize()).n5().l6();
      float var2 = ((SlideSize)this.u9().getSlideSize()).n5().k5();
      float var3 = this.a6().s3().k5();
      boolean var4 = l6o.n5();
      l6o.n5(false);
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1), 14),
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var2), 14),
         2498570
      );
      com.aspose.slides.internal.o9b.z1 var6 = com.aspose.slides.internal.o9b.z1.n5(var5);

      try {
         var6.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      com.aspose.slides.ms.System.o0 var7 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var7.k5());
         com.aspose.slides.internal.n2d.y4.n5(var5, com.aspose.slides.internal.o9b.c8.w4().o8());
         var5.n5(96.0F, 96.0F);
         r1c var8 = new r1c(
            var5,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var2), 14)
         );

         try {
            com.aspose.slides.internal.t4r.n5 var9 = new com.aspose.slides.internal.t4r.n5<>(
               com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
            );
            y4x var10 = new y4x();
            s5u var11 = new s5u(this.h0(), var9, var10);
            var8.a0().c8(3);
            var8.a0().a6(2);
            this.n5(var8, var11, InterruptionToken.getNone());
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }

         com.aspose.slides.internal.o9b.y2 var30 = com.aspose.slides.internal.n8e.k7.l6(var5).n3();
         r6e.n5(var7.k5(), var5);
         var5.dispose();
         return var30;
      } catch (RuntimeException var27) {
         r6e.l6(var7.k5());
         var5.dispose();
         throw var27;
      } finally {
         this.a6().s3().n5(var3);
         l6o.n5(var4);
      }
   }

   final com.aspose.slides.internal.o9b.y1 t4() {
      q5 var1 = new q5(65536, 65536, 96.0F, 96.0F);

      try {
         com.aspose.slides.internal.t4r.n5 var2 = new com.aspose.slides.internal.t4r.n5<>(
            com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
         );
         y4x var3 = new y4x();
         s5u var4 = new s5u(this.h0(), var2, var3);
         this.n5(var1, var4, InterruptionToken.getNone());
         return var1.n5();
      } finally {
         var1.dispose();
      }
   }
}
