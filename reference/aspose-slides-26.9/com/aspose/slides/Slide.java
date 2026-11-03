package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Dimension;
import java.io.OutputStream;

public final class Slide extends BaseSlide implements ISlide {
   private Slide$n5 u9;
   private s4m h0;
   private o5y c8;
   private LayoutSlide t2;
   private final NotesSlideManager s7;
   private SlideHeaderFooterManager x8;
   private final SlideThemeManager n3;
   private boolean y4;
   private final List<IComment> e2 = new List<>();
   private boolean t9;
   private int z1;

   Slide(SlideCollection parentImmediate) {
      super(parentImmediate);
      if (this.h0 == null) {
         this.h0 = new s4m();
      }

      if (this.c8 == null) {
         this.c8 = new o5y();
      }

      this.c8.n5(this);
      this.n3 = new SlideThemeManager(this);
      this.s7 = new NotesSlideManager(this);
      this.t9 = true;
      this.z1 = -1;
      this.n5 = new SlideShowTransition(this);
      this.n5(new i3g(this));
   }

   final i3g t4() {
      return (i3g)this.l6();
   }

   @Override
   o8 k5() {
      if (this.h0 == null) {
         this.h0 = new s4m();
      }

      return this.h0;
   }

   @Override
   f1 u3() {
      if (this.c8 == null) {
         this.c8 = new o5y();
      }

      return this.c8;
   }

   final s4m q0() {
      if (this.h0 == null) {
         this.h0 = new s4m();
      }

      return this.h0;
   }

   final o5y z3() {
      if (this.c8 == null) {
         this.c8 = new o5y();
      }

      return this.c8;
   }

   final SlideHeaderFooterManager m1() {
      if (this.x8 == null) {
         this.x8 = new SlideHeaderFooterManager(this);
      }

      return this.x8;
   }

   @Override
   public final ISlideHeaderFooterManager getHeaderFooterManager() {
      return this.m1();
   }

   @Override
   public final IOverrideThemeManager getThemeManager() {
      return this.n3;
   }

   @Override
   public final int getSlideNumber() {
      return this.getPresentation().getFirstSlideNumber() + this.getPresentation().getSlides().indexOf(this);
   }

   @Override
   public final void setSlideNumber(int value) {
      if (value < this.getPresentation().getFirstSlideNumber()) {
         this.getPresentation().setFirstSlideNumber(value);
      }

      this.getPresentation().getSlides().reorder(value - 1, this);
   }

   @Override
   public final boolean getHidden() {
      return !this.y4;
   }

   @Override
   public final void setHidden(boolean value) {
      this.y4 = !value;
   }

   @Override
   public boolean getShowMasterShapes() {
      return this.t9;
   }

   @Override
   public void setShowMasterShapes(boolean value) {
      this.t9 = value;
   }

   @Override
   void n5(float var1, float var2, float var3) {
      if (n5(var1) || n5(var2)) {
         super.n5(var1, var2, var3);
         NotesSlide var4 = com.aspose.slides.internal.v6g.k5.n5(this.getNotesSlideManager().getNotesSlide(), NotesSlide.class);
         if (var4 != null) {
            var4.n5(var1, var2, var3);
         }
      }
   }

   final boolean k7() {
      return this.t9 && this.t2 != null;
   }

   final boolean m3() {
      return this.k7() && this.t2.getShowMasterShapes() && this.t2.getMasterSlide() != null;
   }

   final int z8() {
      return this.getPresentation().getSlides().indexOf(this);
   }

   final int j5() {
      return this.z1 == -1 ? this.getSlideNumber() : this.z1;
   }

   final void l6(int var1) {
      this.z1 = var1;
   }

   final w2 n5(
      boolean var1,
      com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2,
      y4x var3,
      InterruptionToken var4
   ) {
      w2 var5 = new w2(
         com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.getPresentation().getSlideSize()).n5().l6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.getPresentation().getSlideSize()).n5().k5(), 13),
         72.0F,
         72.0F,
         var1,
         var3,
         ((Presentation)this.getPresentation()).t9(),
         null
      );
      this.t4().n5(var5, var2, var3, var4);
      return var5;
   }

   final w2 n5(
      boolean var1,
      com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2,
      y4x var3,
      List<Integer> var4,
      InterruptionToken var5
   ) {
      w2 var6 = new w2(
         com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.getPresentation().getSlideSize()).n5().l6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.getPresentation().getSlideSize()).n5().k5(), 13),
         72.0F,
         72.0F,
         var1,
         var3,
         ((Presentation)this.getPresentation()).t9(),
         var4
      );
      this.t4().n5(var6, var2, var3, var5);
      return var6;
   }

   @Override
   public final IImage getImage(float scaleX, float scaleY) {
      this.z1().checkInterruption();
      return u4i.n5(this.k5(scaleX, scaleY));
   }

   final com.aspose.slides.internal.o9b.l6 k5(float var1, float var2) {
      com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)this.getPresentation().getSlideSize()).n5().a6();
      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var3.l6() * var1), 14),
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13) * var2), 14)
      );
      return this.t4().n5(var4.u3());
   }

   @Override
   public final IImage getImage() {
      this.z1().checkInterruption();
      return this.getImage(0.2F, 0.2F);
   }

   @Override
   public final IImage getImage(Dimension imageSize) {
      this.z1().checkInterruption();
      return this.n5(com.aspose.slides.internal.o9b.p8.n5(imageSize));
   }

   IImage n5(com.aspose.slides.internal.o9b.p8 var1) {
      return u4i.n5(this.t4().n5(var1.u3()));
   }

   @Override
   public final IImage getImage(ITiffOptions options) {
      this.z1().checkInterruption();
      return u4i.n5(this.t4().n5(options));
   }

   @Override
   public final IImage getImage(IRenderingOptions options) {
      this.z1().checkInterruption();
      return this.getImage(options, 0.2F, 0.2F);
   }

   @Override
   public final IImage getImage(IRenderingOptions options, float scaleX, float scaleY) {
      this.z1().checkInterruption();
      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8();
      com.aspose.slides.internal.o9b.f2 var5 = ((SlideSize)this.z1().getSlideSize()).n5().a6();
      NotesCommentsLayoutingOptions var6 = com.aspose.slides.internal.v6g.k5.n5(options.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var6 != null && var6.getNotesPosition() != 0) {
         float var7 = ((NotesCommentsLayoutingOptions)options.getSlidesLayoutOptions()).getCommentsPosition() == 2
            ? ((NotesCommentsLayoutingOptions)options.getSlidesLayoutOptions()).getCommentsAreaWidth()
            : 0.0F;
         var4.n5(com.aspose.slides.internal.v6g.k5.u3((((NotesSize)this.z1().getNotesSize()).n5().l6() + var7) * scaleX, 13));
         var4.l6(com.aspose.slides.internal.v6g.k5.u3(((NotesSize)this.z1().getNotesSize()).n5().k5() * scaleY, 13));
      } else {
         var4.n5(com.aspose.slides.internal.v6g.k5.u3(var5.l6() * scaleX, 13));
         var4.l6(com.aspose.slides.internal.v6g.k5.u3(var5.k5() * scaleY, 13));
      }

      return this.n5(options, var4.u3());
   }

   @Override
   public final IImage getImage(IRenderingOptions options, Dimension imageSize) {
      this.z1().checkInterruption();
      return this.n5(options, com.aspose.slides.internal.o9b.p8.n5(imageSize));
   }

   IImage n5(IRenderingOptions var1, com.aspose.slides.internal.o9b.p8 var2) {
      return u4i.n5(this.l6(var1, var2.u3()));
   }

   final com.aspose.slides.internal.o9b.l6 l6(IRenderingOptions var1, com.aspose.slides.internal.o9b.p8 var2) {
      y4x var3 = new y4x();
      var3.u3 = var1.getWarningCallback();
      var3.e2.setHideInk(var1.getInkOptions().getHideInk());
      var3.e2.setInterpretMaskOpAsOpacity(var1.getInkOptions().getInterpretMaskOpAsOpacity());
      var3.z1 = var1.getGradientStyle();
      var3.t4 = var1.getDisableFontLigatures();
      var3.t2 = y4x.n5(var2.u3());
      com.aspose.slides.internal.t4r.n5 var4 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      s5u var5 = new s5u(this, var4, var3);
      NotesCommentsLayoutingOptions var6 = com.aspose.slides.internal.v6g.k5.n5(var1.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var6 != null) {
         if (var6.getNotesPosition() == 1) {
            throw new InvalidOperationException("Use NotesPositions.BottomTruncated instead of NotesPositions.BottomFull as result may overflow one page!");
         } else {
            return f2z.n5(this.z1(), var3, var6, new int[]{this.z8() + 1}, var2.u3())[0];
         }
      } else {
         this.z1().n5(var1);
         this.z1().t9().n5(!com.aspose.slides.ms.System.d1.n5(var1.getDefaultRegularFont()) ? var1.getDefaultRegularFont() : null);
         return this.t4().n5(var2.u3(), var5);
      }
   }

   @Override
   public final void writeAsSvg(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new Slide$1(this, stream));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5(var1, null);
   }

   @Override
   public final void writeAsSvg(OutputStream stream, ISVGOptions svgOptions) {
      com.aspose.slides.internal.l6o.l6.n5(new Slide$2(this, stream, svgOptions));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, ISVGOptions var2) {
      c2m var3 = ((Presentation)this.getPresentation()).j5();

      try {
         if (var2 != null) {
            if (!com.aspose.slides.ms.System.d1.n5(var2.getDefaultRegularFont())) {
               ((Presentation)this.getPresentation()).t9().n5(var2.getDefaultRegularFont());
            } else {
               ((Presentation)this.getPresentation()).t9().n5((String)null);
            }
         }

         this.t4().n5(var1, var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final void writeAsEmf(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new Slide$3(this, stream));
   }

   void l6(com.aspose.slides.internal.z0k.t4 var1) {
      e7n.n5(var1, "stream");
      this.t4().n5(var1);
   }

   @Override
   public final void remove() {
      if (this.z1() == null) {
         throw new PptxEditException("Slide is already removed from presentation.");
      }

      this.z1().getSlides().remove(this);
   }

   @Override
   public final ILayoutSlide getLayoutSlide() {
      return this.t2;
   }

   @Override
   public final void setLayoutSlide(ILayoutSlide value) {
      if (com.aspose.slides.ms.System.j8.l6(this.t2, value)) {
         this.n5((LayoutSlide)value, true, true);
      } else {
         this.n5(value);
         this.d5();
         this.y1();
         this.t2 = (LayoutSlide)value;
         this.a0();
         this.d2();
      }
   }

   @Override
   public final void reset() {
      IGenericEnumerator var1 = this.getShapes().iterator();

      try {
         while (var1.hasNext()) {
            Shape var2 = (Shape)var1.next();
            Placeholder var3 = (Placeholder)var2.getPlaceholder();
            if (var3 != null && (var3.getIndex() & 4294967295L) != 4294967295L) {
               var2.s7();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var13 = this.t2.c8().iterator();

      try {
         while (var13.hasNext()) {
            Shape var14 = (Shape)var13.next();
            Placeholder var4 = (Placeholder)var14.getPlaceholder();
            if (var4 != null && (var4.getIndex() & 4294967295L) != 4294967295L) {
               Shape var5 = this.l6(var4.getIndex());
               if (var5 == null && var4.getType() != 6 && var4.getType() != 7 && var4.getType() != 5 && var4.getType() != 4) {
                  var5 = (Shape)this.getShapes().addClone(var14);
                  var5.addPlaceholder(var4);
                  if (com.aspose.slides.internal.v6g.k5.l6(var5, AutoShape.class)) {
                     ((AutoShape)var5).l6().setText("");
                  }

                  var5.s7();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   final LayoutSlide w1() {
      return this.t2;
   }

   final void n5(LayoutSlide var1) {
      this.n5(var1, false);
   }

   final void n5(LayoutSlide var1, boolean var2) {
      this.n5(var1, var2, false);
   }

   final void n5(LayoutSlide var1, boolean var2, boolean var3) {
      this.n5((ILayoutSlide)var1);
      this.d5();
      this.m1().n5(var1, var2, var3);
      this.t2 = var1;
      this.d2();
   }

   final void l6(LayoutSlide var1) {
      this.t2 = var1;
   }

   final IMasterSlide r4() {
      return this.t2 == null ? null : this.t2.getMasterSlide();
   }

   @Override
   public final INotesSlideManager getNotesSlideManager() {
      return this.s7;
   }

   @Override
   public final IComment[] getSlideComments(ICommentAuthor author) {
      if (author == null) {
         return (IComment[])this.e2.toArray(new IComment[0]);
      }

      List var2 = new List(this.e2.size());
      List$Enumerator var3 = this.e2.iterator();

      try {
         while (var3.hasNext()) {
            Comment var4 = (Comment)var3.next();
            if (var4.getAuthor() == author) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (IComment[])var2.toArray(new IComment[0]);
   }

   final IComment[] n5(ICommentAuthor var1) {
      List var2 = new List();

      for (IComment var6 : this.getSlideComments(var1)) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var6, ModernComment.class)) {
            var2.addItem(var6);
         }
      }

      return (IComment[])var2.toArray(new IComment[0]);
   }

   final IComment[] l6(ICommentAuthor var1) {
      List var2 = new List();

      for (IComment var6 : this.getSlideComments(var1)) {
         if (com.aspose.slides.internal.v6g.k5.l6(var6, ModernComment.class)) {
            var2.addItem(var6);
         }
      }

      return (IComment[])var2.toArray(new IComment[0]);
   }

   final void n5(IComment var1) {
      this.e2.addItem(var1);
   }

   final void l6(IComment var1) {
      this.e2.removeItem(var1);
   }

   @Override
   Shape[] n5(IPlaceholder var1) {
      if (this.t2 == null) {
         return a6;
      }

      Shape var2 = null;
      Shape var3 = null;
      if (var1.getIndex() == 4294967295L) {
         var3 = this.t2.l6.l6((Placeholder)var1);
         if (this.t2.getMasterSlide() != null) {
            var2 = ((BaseSlide)this.t2.getMasterSlide()).l6.n5(var1, null);
         }

         if (var3 == null) {
            return var2 == null ? a6 : new Shape[]{var2};
         } else {
            return var2 == null ? new Shape[]{var3} : new Shape[]{var3, var2};
         }
      } else {
         var3 = this.t2.l6.n5((Placeholder)var1);
         if (var3 != null && this.t2.getMasterSlide() != null) {
            var2 = ((BaseSlide)this.t2.getMasterSlide()).l6.n5(var3.getPlaceholder(), (Placeholder)var1);
         }

         if (var3 == null) {
            return a6;
         } else {
            return var2 == null ? new Shape[]{var3} : new Shape[]{var3, var2};
         }
      }
   }

   @Override
   public void joinPortionsWithSameFormatting() {
      if (this.getNotesSlideManager().getNotesSlide() != null) {
         this.getNotesSlideManager().getNotesSlide().joinPortionsWithSameFormatting();
      }

      super.joinPortionsWithSameFormatting();
   }

   final int c4() {
      int var1 = 0;
      if (this.m3() && this.r4().getShapes().size() > 0) {
         var1++;
      }

      if (this.k7() && this.getLayoutSlide().getShapes().size() > 0) {
         var1++;
      }

      if (this.getShapes().size() > 0) {
         var1++;
      }

      if (this.m3() && this.r4().getControls().size() > 0) {
         var1++;
      }

      if (this.k7() && this.getLayoutSlide().getControls().size() > 0) {
         var1++;
      }

      if (this.getControls().size() > 0) {
         var1++;
      }

      return var1;
   }

   final Slide$n5 y2() {
      return this.u9;
   }

   final void n5(Slide$n5 var1) {
      this.u9 = var1;
   }

   private void y1() {
      if (this.t2 != null) {
         this.m1().u3();
      }
   }

   private void a0() {
      if (this.t2 != null) {
         ((PresentationHeaderFooterManager)this.getPresentation().getHeaderFooterManager()).n5(this, this.w1());
      }
   }

   private void d2() {
      if (this.t2 != null) {
         this.t2.l6.n5.l6(new Slide$4(this));
      }
   }

   private void d5() {
      if (this.t2 != null) {
         this.t2.l6.n5.n5(new Slide$5(this));
      }
   }

   private void n5(ILayoutSlide var1) {
      if (var1 != null && var1.getPresentation() != this.getPresentation()) {
         throw new PptxEditException("Layout slide must be from the same presentation.");
      }
   }
}
