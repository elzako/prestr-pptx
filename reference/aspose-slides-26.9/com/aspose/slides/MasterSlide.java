package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

public class MasterSlide extends BaseSlide implements IMasterSlide {
   private o1l e2;
   private a3a t9;
   MasterLayoutSlideCollection u9;
   private MasterSlideHeaderFooterManager z1;
   TextStyle h0;
   TextStyle c8;
   TextStyle t2;
   TextStyle s7;
   TextStyle x8;
   TextStyle n3;
   boolean y4;
   private final MasterThemeManager t4;
   private final DrawingGuidesCollection q0;

   MasterSlide(MasterSlideCollection parentImmediate) {
      super(parentImmediate);
      if (this.e2 == null) {
         this.e2 = new o1l();
      }

      if (this.t9 == null) {
         this.t9 = new a3a();
      }

      this.t9.n5(this);
      this.t4().n5 = new MasterSlide$1(this);
      this.t4 = new MasterThemeManager(this);
      this.u9 = new MasterLayoutSlideCollection(this);
      this.h0 = new TextStyle(this);
      this.c8 = new TextStyle(this);
      this.t2 = new TextStyle(this);
      this.s7 = new TextStyle(this);
      this.x8 = new TextStyle(this);
      this.n3 = new TextStyle(this);
      this.n5 = new SlideShowTransition(this);
      this.q0 = new DrawingGuidesCollection(DrawingGuidesCollection.l6.o8());
      this.n5(new t0(this));
   }

   @Override
   o8 k5() {
      if (this.e2 == null) {
         this.e2 = new o1l();
      }

      return this.e2;
   }

   @Override
   f1 u3() {
      if (this.t9 == null) {
         this.t9 = new a3a();
      }

      return this.t9;
   }

   final o1l t4() {
      if (this.e2 == null) {
         this.e2 = new o1l();
      }

      return this.e2;
   }

   final a3a q0() {
      if (this.t9 == null) {
         this.t9 = new a3a();
      }

      return this.t9;
   }

   final ILayoutSlide l6(byte var1) {
      return new LayoutSlide(this, var1);
   }

   @Override
   public final IMasterSlideHeaderFooterManager getHeaderFooterManager() {
      return this.z3();
   }

   @Override
   public final IMasterSlide applyExternalThemeToDependingSlides(String fname) {
      String var2 = com.aspose.slides.internal.z0k.z1.k5(fname);

      try {
         f7o var3 = new f7o(var2, ((Presentation)this.getPresentation()).a6());
         return var3.n5(this);
      } catch (com.aspose.slides.internal.n8e.n5 var4) {
         throw new PptxReadException("External theme reading aborted.", var4);
      } catch (RuntimeException var5) {
         throw new PptxException("Applying external theme aborted.", var5);
      }
   }

   @Override
   public final ITextStyle getTitleStyle() {
      return this.h0;
   }

   @Override
   public final ITextStyle getBodyStyle() {
      return this.c8;
   }

   final MasterSlideHeaderFooterManager z3() {
      if (this.z1 == null) {
         this.z1 = new MasterSlideHeaderFooterManager(this);
      }

      return this.z1;
   }

   final ITextStyle m1() {
      return this.t2;
   }

   final ITextStyle k7() {
      return this.s7;
   }

   final ITextStyle m3() {
      return this.x8;
   }

   @Override
   public final ITextStyle getOtherStyle() {
      return this.n3;
   }

   @Override
   public final IMasterLayoutSlideCollection getLayoutSlides() {
      return this.u9;
   }

   @Override
   public final boolean getPreserve() {
      return this.y4;
   }

   @Override
   public final void setPreserve(boolean value) {
      this.y4 = value;
   }

   @Override
   public final ISlide[] getDependingSlides() {
      List var1 = new List();
      int var2 = this.getPresentation().getSlides().size();

      for (int var3 = 0; var3 < var2; var3++) {
         if (((Slide)this.getPresentation().getSlides().get_Item(var3)).r4() == this) {
            var1.addItem(this.getPresentation().getSlides().get_Item(var3));
         }
      }

      return var1.size() > 0 ? (ISlide[])var1.toArray(new ISlide[0]) : SlideCollection.l6;
   }

   @Override
   public final boolean hasDependingSlides() {
      int var1 = this.getPresentation().getSlides().size();

      for (int var2 = 0; var2 < var1; var2++) {
         if (((Slide)this.getPresentation().getSlides().get_Item(var2)).r4() == this) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final IMasterThemeManager getThemeManager() {
      return this.t4;
   }

   @Override
   public String getName() {
      return this.t4.getOverrideTheme().getName();
   }

   @Override
   public void setName(String value) {
      this.t4.getOverrideTheme().setName(value);
   }

   @Override
   public boolean getShowMasterShapes() {
      return false;
   }

   @Override
   public void setShowMasterShapes(boolean value) {
      if (value) {
         throw new NotSupportedException("MasterSlide doesn't contain another master slide and doesn't support this setter.");
      }
   }

   @Override
   public final IDrawingGuidesCollection getDrawingGuides() {
      return this.q0;
   }

   final void z8() {
      this.l6.n5(this);
   }

   @Override
   void n5(float var1, float var2, float var3) {
      if (n5(var1) || n5(var2)) {
         super.n5(var1, var2, var3);
         this.h0.n5(var3);
         this.c8.n5(var3);
         this.n3.n5(var3);
      }
   }

   @Override
   void l6(float var1, float var2) {
      super.l6(var1, var2);
      IGenericEnumerator var3 = this.getLayoutSlides().iterator();

      try {
         while (var3.hasNext()) {
            LayoutSlide var4 = (LayoutSlide)var3.next();
            var4.l6(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
