package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.ms.System.IDisposable;

final class i3g extends t0 {
   public i3g(Slide var1) {
      super(var1);
   }

   public final Slide l6() {
      return (Slide)this.n5;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.p8 var1) {
      y4x var2 = new y4x();
      var2.t2 = y4x.n5(var1.u3());
      com.aspose.slides.internal.t4r.n5 var3 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      s5u var4 = new s5u(this.l6(), var3, var2);
      return this.n5(var1.u3(), var4);
   }

   public final com.aspose.slides.internal.o9b.l6 n5(ITiffOptions var1) {
      this.n5().n5(var1);
      com.aspose.slides.ms.System.o0 var2 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var2.k5());
         com.aspose.slides.internal.n8e.a5.n5(6, 7, 5);
         if (!com.aspose.slides.ms.System.d1.n5(var1.getDefaultRegularFont())) {
            this.n5().t9().n5(var1.getDefaultRegularFont());
         } else {
            this.n5().t9().n5((String)null);
         }

         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();
         com.aspose.slides.internal.o9b.l6 var4;
         if (com.aspose.slides.internal.v6g.k5.l6(var1.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
            && ((NotesCommentsLayoutingOptions)var1.getSlidesLayoutOptions()).l6()) {
            if (((NotesCommentsLayoutingOptions)var1.getSlidesLayoutOptions()).getNotesPosition() == 1) {
               throw new InvalidOperationException("Use NotesPositions.BottomTruncated instead of NotesPositions.BottomFull as result may overflow one page!");
            }

            r2k.n5(this.n5(), var3, new int[]{this.l6().z8() + 1}, (TiffOptions)var1, (InterruptionToken)this.n5().a6().getInterruptionToken());
            var4 = (com.aspose.slides.internal.o9b.l6)com.aspose.slides.internal.o9b.t4.n5(var3);
         } else {
            r2k.n5(this.l6(), var3, var1);
            var4 = (com.aspose.slides.internal.o9b.l6)com.aspose.slides.internal.o9b.t4.n5(var3);
         }

         r6e.n5(var2.k5(), var4);
         return var4;
      } catch (RuntimeException var9) {
         this.n5().t9().n5((String)null);
         r6e.l6(var2.k5());
         throw var9;
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(6, 7, 5);
         this.n5().n5((ISaveOptions)null);
      }
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.p8 var1, s5u var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 139273);
      float var4 = 96.0F;
      var3.n5(var4, var4);
      com.aspose.slides.ms.System.o0 var5 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var5.k5());
         com.aspose.slides.internal.n8e.a5.n5(11, 1, 11);
         com.aspose.slides.internal.o9b.f2 var6 = ((SlideSize)this.n5().getSlideSize()).n5().a6();
         c2m var7 = this.n5().j5();

         try {
            r1c var8 = new r1c(var3, var6.l6(), var6.k5());

            try {
               var8.n5(
                  new com.aspose.slides.internal.o9b.y1(-1.0F, -1.0F, var6.l6() + 2.0F, var6.k5() + 2.0F),
                  null,
                  new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
               );
               InterruptionToken var9 = (InterruptionToken)this.n5().a6().getInterruptionToken();
               this.n5(var8, null, var2, true, false, var9);
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         this.n5().checkInterruption();
         r6e.n5(var5.k5(), var3);
         return var3;
      } catch (OperationCanceledException var65) {
         this.n5(var3, var5.k5());
         throw var65;
      } catch (RuntimeException var66) {
         this.n5(var3, var5.k5());
         throw var66;
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(11, 1, 11);
         Dictionary$Enumerator var15 = var2.t4().l6().iterator();

         try {
            while (var15.hasNext()) {
               KeyValuePair var16 = (KeyValuePair)var15.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var16.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var16.getValue()).k5().dispose();
                  var2.t4().l6((com.aspose.slides.internal.k9.h0)var16.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
               var15.dispose();
            }
         }
      }
   }

   final com.aspose.slides.internal.o9b.l6 l6(com.aspose.slides.internal.o9b.p8 var1) {
      com.aspose.slides.internal.t4r.n5 var2 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 139273);
      var3.n5(96.0F, 96.0F);
      com.aspose.slides.ms.System.o0 var4 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var4.k5());
         com.aspose.slides.internal.o9b.f2 var5 = ((SlideSize)this.n5().getSlideSize()).n5().a6();
         r1c var6 = new r1c(var3, var5.l6(), var5.k5());

         try {
            var6.n5(
               new com.aspose.slides.internal.o9b.y1(-1.0F, -1.0F, var5.l6() + 2.0F, var5.k5() + 2.0F),
               null,
               new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
            );
            y4x var7 = new y4x();
            this.n5(var6, var2, var7, (InterruptionToken)this.n5().a6().getInterruptionToken());
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         this.n5().checkInterruption();
         r6e.n5(var4.k5(), var3);
         return var3;
      } catch (OperationCanceledException var51) {
         this.n5(var3, var4.k5());
         throw var51;
      } catch (RuntimeException var52) {
         this.n5(var3, var4.k5());
         throw var52;
      } finally {
         Dictionary$Enumerator var13 = var2.l6().iterator();

         try {
            while (var13.hasNext()) {
               KeyValuePair var14 = (KeyValuePair)var13.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var14.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var14.getValue()).k5().dispose();
                  var2.l6(var14.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }
   }

   final IPPImage n5(boolean var1) {
      com.aspose.slides.internal.t4r.n5 var2 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)this.n5().getSlideSize()).n5().a6();
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13), 139273
      );
      float var5 = 96.0F;
      var4.n5(var5, var5);
      var4.n5();

      try {
         c2m var6 = this.n5().j5();

         try {
            r1c var7 = new r1c(var4, var3.l6(), var3.k5());

            try {
               if (var1) {
                  var7.n5(
                     new com.aspose.slides.internal.o9b.y1(-1.0F, -1.0F, var3.l6() + 2.0F, var3.k5() + 2.0F),
                     null,
                     new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
                  );
               }

               y4x var8 = new y4x();
               var8.x8 = var1;
               InterruptionToken var9 = (InterruptionToken)this.n5().a6().getInterruptionToken();
               s5u var10 = new s5u(this.l6(), var2, var8);
               this.n5(var7, null, var10, var8, var9);
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         return ((ImageCollection)this.n5().getImages()).n5(var4);
      } catch (OperationCanceledException var66) {
         var4.dispose();
         throw var66;
      } catch (RuntimeException var67) {
         var4.dispose();
         throw var67;
      } finally {
         Dictionary$Enumerator var16 = var2.l6().iterator();

         try {
            while (var16.hasNext()) {
               KeyValuePair var17 = (KeyValuePair)var16.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var17.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var17.getValue()).k5().dispose();
                  var2.l6(var17.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }
      }
   }

   final void n5(
      e3 var1, com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2, y4x var3, InterruptionToken var4
   ) {
      s5u var5 = new s5u(this.l6(), var2, var3);
      this.n5(var1, null, var5, var3, var4);
   }

   final void n5(e3 var1, IShapeFrame var2, s5u var3, y4x var4, InterruptionToken var5) {
      this.n5(var1, var2, var3, var4.x8, var4.c8, var5);
   }

   final void n5(e3 var1, IShapeFrame var2, s5u var3, boolean var4, boolean var5, InterruptionToken var6) {
      ShapeFrame var7 = (ShapeFrame)var2;
      ShapeFrame var8 = this.l6().y4();
      com.aspose.slides.internal.w0.c8 var10;
      if (var2 == null) {
         com.aspose.slides.internal.w0.c8 var9 = new com.aspose.slides.internal.w0.c8(
            var8.getFlipH() == 1 ? -1.0F : 1.0F,
            0.0F,
            0.0F,
            var8.getFlipV() == 1 ? -1.0F : 1.0F,
            var8.getFlipH() == 1 ? var8.getCenterX() * 2.0F : 0.0F,
            var8.getFlipV() == 1 ? var8.getCenterY() * 2.0F : 0.0F
         );
         if (!com.aspose.slides.ms.System.n1.k5(var8.getRotation())) {
            var9.n5(
               var8.getFlipH() == 1 ^ var8.getFlipV() == 1 ? -var8.getRotation() : var8.getRotation(),
               new com.aspose.slides.internal.o9b.w1(var8.getCenterX(), var8.getCenterY()),
               0
            );
         }

         var10 = var9;
      } else {
         var10 = new com.aspose.slides.internal.w0.c8(
            var7.getWidth() / var8.getWidth(), 0.0F, 0.0F, var7.getHeight() / var8.getHeight(), var7.getX(), var7.getY()
         );
      }

      var1.k5(var10);
      var1.n5(var3);
      a1v var11 = this.n5((Background)this.l6().getBackground(), var8, var1, var3);
      if (var11 == null) {
         var11 = new a1v(com.aspose.slides.internal.o9b.c8.w4().o8());
      }

      if (var11.u3() == 1) {
         var1.l6(false);
      }

      if (var4) {
         var1.n5(var8.n5().y4(), null, var11);
      }

      if (var11.u3() == 1) {
         var1.l6(true);
      }

      this.n5(var1, var3, var6);
      this.l6(var1, var3, var6);
      this.k5(var1, var3, var6);
      this.n5(var1, var3);
      this.l6(var1, var3);
      this.k5(var1, var3);
      this.n5(var1, var5, var8);
   }

   final void n5(e3 var1, boolean var2, ShapeFrame var3) {
      if (var2) {
         var1.n5(var3.n5().y4(), new l6v(com.aspose.slides.internal.o9b.c8.m3().o8(), 0.2F), null);
      }

      this.n5(var1);
      var1.z3();
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1, ISVGOptions var2) {
      if (var2 == null) {
         var2 = new SVGOptions();
      }

      a4w var3 = null;
      ILinkEmbedController var4 = ((SVGOptions)var2).l6();
      if (var4 != null && var4 != com.aspose.slides.internal.k0r.f0.n5 || var2.getExternalFontsHandling() == 1) {
         v3s var5 = new v3s();
         var3 = new a4w(var5);
         m6q var6 = new m6q((Presentation)this.l6().getPresentation());

         j0v[] var7;
         try {
            var7 = var6.n5(new int[]{this.l6().z8() + 1});
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         var3.n5(var7);
      }

      q4b var39 = new q4b(
         com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.n5().getSlideSize()).n5().l6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.n5().getSlideSize()).n5().k5(), 13),
         72.0F,
         72.0F,
         72.0F,
         (SVGOptions)var2,
         var3
      );
      com.aspose.slides.internal.t4r.n5 var41 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      this.n5().n5(var2);
      com.aspose.slides.ms.System.o0 var40 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var40.k5());
         com.aspose.slides.internal.n8e.a5.n5(9, 9, 3);
         y4x var8 = new y4x();
         var8.e2.setHideInk(var2.getInkOptions().getHideInk());
         var8.e2.setInterpretMaskOpAsOpacity(var2.getInkOptions().getInterpretMaskOpAsOpacity());
         var8.h0 = true;
         var8.t2 = ((SVGOptions)var2).k5().k5();
         var8.s7 = var2.getDeletePicturesCroppedAreas();
         var8.t4 = var2.getDisableFontLigatures();
         InterruptionToken var9 = (InterruptionToken)this.n5().a6().getInterruptionToken();
         f1f var10 = new f1f(this.l6(), var41, var8, var2.getShapeFormattingController());
         this.n5(var39, null, var10, var8, var9);
         var39.n5(var1, true);
         r6e.n5(var40.k5(), var1);
      } catch (RuntimeException var35) {
         r6e.l6(var40.k5());
         throw var35;
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(9, 9, 3);
         Dictionary$Enumerator var13 = var41.l6().iterator();

         try {
            while (var13.hasNext()) {
               KeyValuePair var14 = (KeyValuePair)var13.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var14.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var14.getValue()).k5().dispose();
                  var41.l6(var14.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }

         this.n5().n5((ISaveOptions)null);
         var39.dispose();
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      try {
         com.aspose.slides.internal.n8e.a5.n5(2, 2, 9);
         com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

         try {
            this.n5(var2, null);
            var2.setPosition(0L);
            SvgImage var3 = new SvgImage(var2);
            com.aspose.slides.internal.w9s.k5 var4 = new com.aspose.slides.internal.w9s.k5();
            com.aspose.slides.internal.z0k.e2 var5 = var4.n5(var3.getSvgContent());

            try {
               var1.setPosition(0L);
               var5.writeTo(var1);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(2, 2, 9);
      }
   }

   private void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (this.l6().m3()) {
         ((MasterSlide)this.l6().w1().getMasterSlide()).k5.e5().n5(var1, var2, var3);
         if (this.l6().y2() != null && this.l6().r4().getShapes().size() > 0) {
            this.l6().y2().n5();
         }
      }
   }

   private void l6(e3 var1, s5u var2, InterruptionToken var3) {
      if (this.l6().k7()) {
         this.l6().w1().k5.e5().n5(var1, var2, var3);
         if (this.l6().y2() != null && this.l6().getLayoutSlide().getShapes().size() > 0) {
            this.l6().y2().n5();
         }
      }
   }

   private void k5(e3 var1, s5u var2, InterruptionToken var3) {
      this.l6().k5.e5().n5(var1, var2, var3);
      if (this.l6().y2() != null && this.l6().getShapes().size() > 0) {
         this.l6().y2().n5();
      }
   }

   private void n5(e3 var1, s5u var2) {
      if (this.l6().m3()) {
         IGenericEnumerator var3 = this.l6().w1().getMasterSlide().getControls().iterator();

         try {
            while (var3.hasNext()) {
               Control var4 = (Control)var3.next();
               var4.n5(var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (this.l6().y2() != null && this.l6().r4().getControls().size() > 0) {
            this.l6().y2().n5();
         }
      }
   }

   private void l6(e3 var1, s5u var2) {
      if (this.l6().k7()) {
         IGenericEnumerator var3 = this.l6().w1().getControls().iterator();

         try {
            while (var3.hasNext()) {
               Control var4 = (Control)var3.next();
               var4.n5(var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (this.l6().y2() != null && this.l6().getLayoutSlide().getControls().size() > 0) {
            this.l6().y2().n5();
         }
      }
   }

   private void k5(e3 var1, s5u var2) {
      IGenericEnumerator var3 = this.l6().getControls().iterator();

      try {
         while (var3.hasNext()) {
            Control var4 = (Control)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (this.l6().y2() != null && this.l6().getControls().size() > 0) {
         this.l6().y2().n5();
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.ms.System.o0 var2) {
      this.n5(var2.k5());
      var1.dispose();
   }

   private void n5(com.aspose.slides.ms.System.o0 var1) {
      r6e.l6(var1.k5());
   }
}
