package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.InputStream;

public final class SlideCollection extends DomObject<Presentation> implements ISlideCollection {
   final List<ISlide> n5 = new List<>();
   static final Slide[] l6 = new Slide[0];

   SlideCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final ISlide get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final ISlide addClone(ISlide sourceSlide) {
      Slide var2 = (Slide)sourceSlide;
      synchronized ((Presentation)this.u9) {
         if (var2.getPresentation() == this.u9) {
            return (Slide)n0r.n5(this.u9, var2.getLayoutSlide(), var2);
         }

         com.aspose.slides.internal.o9b.f2 var4 = ((SlideSize)this.u9.getSlideSize()).n5().a6();
         com.aspose.slides.internal.o9b.f2 var5 = ((SlideSize)var2.getPresentation().getSlideSize()).n5().a6();
         if (var4.l6() != var5.l6() || var4.k5() != var5.k5()) {
            this.u9.a6().n5("The slide-size of source and of target presentation is different!", 99);
         }

         IMasterSlide var6 = ((MasterSlideCollection)this.u9.getMasters()).n5(var2.w1().getMasterSlide(), true);
         return this.addClone(var2, var6, false);
      }
   }

   @Override
   public final ISlide addClone(ISlide sourceSlide, ISection section) {
      if (sourceSlide == null) {
         throw new ArgumentNullException("sourceSlide");
      }

      if (section == null) {
         throw new ArgumentNullException("section");
      }

      int var3 = this.u9.getSections().indexOf(section);
      if (var3 == -1) {
         throw new PptxEditException("The presentation doesn't contain the specified section.");
      }

      boolean var4 = section.getStartedFromSlide() == null;
      if (var3 == this.u9.getSections().size() - 1) {
         ISlide var9 = this.addClone(sourceSlide);
         if (var4) {
            ((Section)section).n5(var9);
         }

         return var9;
      } else {
         ISection var6 = null;

         for (int var7 = var3 + 1; var7 < this.u9.getSections().size(); var7++) {
            if (this.u9.getSections().get_Item(var7).getStartedFromSlide() != null) {
               var6 = this.u9.getSections().get_Item(var7);
               break;
            }
         }

         if (var6 == null) {
            ISlide var8 = this.addClone(sourceSlide);
            if (var4) {
               ((Section)section).n5(var8);
            }

            return var8;
         } else {
            int var10 = this.n5.indexOf(var6.getStartedFromSlide());
            ISlide var5 = this.insertClone(var10, sourceSlide);
            if (var4) {
               ((Section)section).n5(var5);
            }

            return var5;
         }
      }
   }

   @Override
   public final ISlide insertClone(int index, ISlide sourceSlide) {
      ISlide var3 = this.addClone(sourceSlide);
      this.reorder(index, var3);
      return var3;
   }

   @Override
   public final ISlide addEmptySlide(ILayoutSlide layout) {
      Slide var2 = this.n5(layout);
      this.n5(var2);
      return var2;
   }

   @Override
   public final ISlide insertEmptySlide(int index, ILayoutSlide layout) {
      Slide var3 = this.n5(layout);
      this.n5(index, var3);
      return var3;
   }

   private Slide n5(ILayoutSlide var1) {
      if (var1 == null) {
         throw new ArgumentNullException("layout");
      }

      if (var1.getPresentation() != this.u9) {
         throw new PptxEditException("Layout from other presentation specified.");
      }

      Slide var2 = this.u9.k7();
      var2.setLayoutSlide(var1);
      return var2;
   }

   final Slide n5() {
      return this.u9.k7();
   }

   @Override
   public final ISlide addClone(ISlide sourceSlide, ILayoutSlide destLayout) {
      if (destLayout.getPresentation() != this.u9) {
         throw new PptxEditException("Layout must belong to the target presentation.");
      }

      Slide var3;
      if (sourceSlide.getPresentation() == this.u9) {
         var3 = (Slide)n0r.n5(this.u9, destLayout, sourceSlide);
      } else {
         try {
            com.aspose.slides.internal.n8e.a5.n5(14, 4, 8);
            var3 = (Slide)n0r.n5(this.u9, destLayout, sourceSlide);
            var3.n5(sourceSlide.getPresentation().getDefaultTextStyle());
            this.n5(var3.getShapes());
            float var4 = ((SlideSize)this.u9.getSlideSize()).n5().l6() / ((SlideSize)sourceSlide.getPresentation().getSlideSize()).n5().l6();
            float var5 = ((SlideSize)this.u9.getSlideSize()).n5().k5() / ((SlideSize)sourceSlide.getPresentation().getSlideSize()).n5().k5();
            var3.n5(var4, var5);
         } finally {
            com.aspose.slides.internal.n8e.a5.l6(14, 4, 8);
         }
      }

      return var3;
   }

   final void n5(IShapeCollection var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, IAutoShape.class)) {
               ((AutoShape)var3).c8();
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var3, IGroupShape.class)) {
               this.n5(((IGroupShape)var3).getShapes());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final ISlide insertClone(int index, ISlide sourceSlide, ILayoutSlide destLayout) {
      ISlide var4 = this.addClone(sourceSlide, destLayout);
      this.reorder(index, var4);
      return var4;
   }

   @Override
   public final ISlide addClone(ISlide sourceSlide, IMasterSlide destMaster, boolean allowCloneMissingLayout) {
      Slide var4 = (Slide)sourceSlide;
      MasterSlide var5 = (MasterSlide)destMaster;
      if (var5.getPresentation() != this.u9) {
         throw new PptxEditException("Master must belong to target presentation.");
      }

      MasterSlide var6 = (MasterSlide)var4.w1().getMasterSlide();
      int var7 = 0;

      while (var7 < var6.u9.size() && var4.w1() != var6.u9.get_Item(var7)) {
         var7++;
      }

      LayoutSlide var8 = null;
      if (var7 < var6.u9.size() && var7 < var5.u9.size() && var5.u9.get_Item(var7).getLayoutType() == var4.w1().getLayoutType()) {
         var8 = (LayoutSlide)var5.u9.get_Item(var7);
      } else {
         for (int var9 = 0; var9 < var5.u9.size(); var9++) {
            if (var4.w1().getLayoutType() == var5.u9.get_Item(var9).getLayoutType()
               || com.aspose.slides.ms.System.d1.a6(var4.w1().getName(), var5.u9.get_Item(var9).getName())) {
               var8 = (LayoutSlide)var5.u9.get_Item(var9);
               break;
            }
         }
      }

      if (var8 == null) {
         if (!allowCloneMissingLayout) {
            throw new PptxEditException(
               com.aspose.slides.ms.System.d1.n5(
                  "Layout slide with \"{0}\" layout type or name \"{1}\" not found for specified Master slide. ",new Object[]{
                  com.aspose.slides.ms.System.s3.n5(SlideLayoutType.class, var4.w1().getLayoutType()),
                  var4.w1().getName()
               })
            );
         }

         var8 = (LayoutSlide)this.u9.getLayoutSlides().addClone(var4.w1(), var5);
      }

      return this.addClone(var4, var8);
   }

   @Override
   public final ISlide insertClone(int index, ISlide sourceSlide, IMasterSlide destMaster, boolean allowCloneMissingLayout) {
      ISlide var5 = this.addClone(sourceSlide, destMaster, allowCloneMissingLayout);
      this.reorder(index, var5);
      return var5;
   }

   final void n5(ISlide var1) {
      this.n5.addItem(var1);
      this.n5(this.n5.size() - 1);
   }

   final void n5(int var1, ISlide var2) {
      this.n5.insertItem(var1, var2);
      this.n5(var1);
   }

   final void l6() {
      this.n5.clear();
   }

   private void n5(GroupShape var1, ISlide var2, ISlide var3) {
      for (int var4 = 0; var4 < var1.getShapes().size(); var4++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.getShapes().get_Item(var4), GroupShape.class)) {
            this.n5((GroupShape)var1.getShapes().get_Item(var4), var2, var3);
         }

         if (this.n5(var1.getShapes().get_Item(var4), var2, var3)) {
            var4--;
         }
      }
   }

   private boolean n5(IShape var1, ISlide var2, ISlide var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, SummaryZoomFrame.class)) {
         ISection var4 = ((SectionCollection)this.u9.getSections()).n5(var3);
         if (var4 == null) {
            return false;
         }

         ISummaryZoomSectionCollection var5 = ((SummaryZoomFrame)var1).getSummaryZoomCollection();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            ISection var7 = var5.get_Item(var6).getTargetSection();
            if (var7 != null && com.aspose.slides.ms.System.o0.n5(((Section)var7).n5(), ((Section)var4).n5())) {
               ISectionSlideCollection var8 = var4.getSlidesListOfSection();
               if (var4.getStartedFromSlide() == var3) {
                  if (var8.size() == 1) {
                     var5.removeSummaryZoomSection(var4);
                     if (var5.size() == 0) {
                        var2.getShapes().remove(var1);
                        return true;
                     }
                  } else {
                     ((Section)var4).n5(this.n5.get_Item(this.indexOf(var3) + 1));
                     var5.get_Item(var6).setTargetSection(var4);
                     ((SummaryZoomSection)var5.get_Item(var6)).setTargetSlide(((Section)var4).getStartedFromSlide());
                  }
               }
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, SectionZoomFrame.class)) {
         ISection var9 = ((SectionCollection)this.u9.getSections()).n5(var3);
         if (var9 != null && com.aspose.slides.ms.System.o0.n5(((SectionZoomFrame)var1).n5(), ((Section)var9).n5())) {
            ISectionSlideCollection var10 = var9.getSlidesListOfSection();
            if (var9.getStartedFromSlide() == var3) {
               if (var10.size() == 1) {
                  var2.getShapes().remove(var1);
                  return true;
               }

               ((Section)var9).n5(this.n5.get_Item(this.indexOf(var3) + 1));
               ((SectionZoomFrame)var1).setTargetSlide(var9.getStartedFromSlide());
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, ZoomFrame.class) && ((ZoomFrame)var1).m3() == ((Slide)var3).getSlideId()) {
         var2.getShapes().remove(var1);
         return true;
      }

      return false;
   }

   @Override
   public final void remove(ISlide value) {
      if (this.n5.containsItem(value)) {
         List$Enumerator var2 = this.n5.iterator();

         try {
            while (var2.hasNext()) {
               ISlide var3 = (ISlide)var2.next();

               for (int var4 = 0; var4 < var3.getShapes().size(); var4++) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var3.getShapes().get_Item(var4), GroupShape.class)) {
                     this.n5((GroupShape)var3.getShapes().get_Item(var4), var3, value);
                  }

                  if (this.n5(var3.getShapes().get_Item(var4), var3, value)) {
                     var4--;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         ((SectionCollection)this.u9.getSections()).l6(value);
         int var11 = this.n5.indexOf(value);
         synchronized (this.n5.getSyncRoot()) {
            this.n5.removeItem(value);
            this.n5(var11);
            ((Slide)value).n5((r0g)null);
         }

         this.n5(value, var11);
      }
   }

   @Override
   public final void removeAt(int index) {
      if (index >= 0 && index <= this.n5.size() - 1) {
         this.remove(this.n5.get_Item(index));
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   private void n5(ISlide var1, int var2) {
      List var3 = (List)this.u9.getHyperlinkQueries().getAnyHyperlinks();
      IGenericEnumerator var4 = this.u9.getMasters().iterator();

      try {
         while (var4.hasNext()) {
            IMasterSlide var5 = (IMasterSlide)var4.next();
            var3.addRange(var5.getHyperlinkQueries().getAnyHyperlinks());
            IGenericEnumerator var6 = var5.getLayoutSlides().iterator();

            try {
               while (var6.hasNext()) {
                  ILayoutSlide var7 = (ILayoutSlide)var6.next();
                  var3.addRange(var7.getHyperlinkQueries().getAnyHyperlinks());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      IGenericEnumerator var32 = this.u9.getSlides().iterator();

      try {
         while (var32.hasNext()) {
            ISlide var33 = (ISlide)var32.next();
            if (var33.getNotesSlideManager().getNotesSlide() != null) {
               var3.addRange(var33.getNotesSlideManager().getNotesSlide().getHyperlinkQueries().getAnyHyperlinks());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
            var32.dispose();
         }
      }

      List$Enumerator var34 = var3.iterator();

      try {
         while (var34.hasNext()) {
            IHyperlinkContainer var35 = (IHyperlinkContainer)var34.next();
            Hyperlink var8 = (Hyperlink)var35.getHyperlinkClick();
            if (var8 != null && var8.getActionType() == 8 && var8.getTargetSlide() == var1) {
               if (var2 < this.u9.getSlides().size()) {
                  var8.u3().n5(this.get_Item(var2));
               } else {
                  var35.getHyperlinkManager().removeHyperlinkClick();
               }
            }

            Hyperlink var9 = (Hyperlink)var35.getHyperlinkMouseOver();
            if (var9 != null && var9.getActionType() == 8 && var9.getTargetSlide() == var1) {
               if (var2 < this.u9.getSlides().size()) {
                  var9.u3().n5(this.get_Item(var2));
               } else {
                  var35.getHyperlinkManager().removeHyperlinkMouseOver();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var34, IDisposable.class)) {
            var34.dispose();
         }
      }
   }

   @Override
   public final IGenericEnumerator<ISlide> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ISlide> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final ISlide[] toArray() {
      return this.n5.toArray(new ISlide[0]);
   }

   @Override
   public final ISlide[] toArray(int startIndex, int count) {
      if (startIndex >= 0 && count >= 0 && startIndex + count <= this.size()) {
         Slide[] var3 = new Slide[count];

         for (int var4 = 0; var4 < count; var4++) {
            var3[var4] = (Slide)this.n5.get_Item(var4 + startIndex);
         }

         return var3;
      } else {
         throw new ArgumentOutOfRangeException("startIndex", "Wrong index or slides count.");
      }
   }

   @Override
   public final void reorder(int index, ISlide slide) {
      if (index >= 0 && index < this.size()) {
         if (slide.getPresentation() != this.u9) {
            throw new PptxEditException("Trying to move slide from other presentation.");
         }

         int var3 = this.n5.indexOf(slide);
         if (var3 < 0) {
            throw new PptxEditException("Trying to move removed slide.");
         }

         if (index != var3) {
            ((SectionCollection)slide.getPresentation().getSections()).l6(slide);
            if (index == 0 && slide.getPresentation().getSections().size() > 0) {
               ((Section)slide.getPresentation().getSections().get_Item(0)).n5(slide);
            }

            this.l6(index, slide);
         }
      } else {
         throw new PptxEditException("Index must lay within [0..Count-1] range.");
      }
   }

   final void l6(int var1, ISlide var2) {
      int var3 = this.n5.indexOf(var2);
      if (var1 != var3) {
         synchronized (this.n5.getSyncRoot()) {
            if (var1 < var3) {
               for (int var8 = var3; var8 > var1; var8--) {
                  this.n5.set_Item(var8, this.n5.get_Item(var8 - 1));
               }
            } else {
               for (int var5 = var3; var5 < var1; var5++) {
                  this.n5.set_Item(var5, this.n5.get_Item(var5 + 1));
               }
            }

            this.n5.set_Item(var1, var2);
         }

         this.n5(var1);
      }
   }

   final void n5(int var1) {
      if (this.u9 != null && !this.u9.x8()) {
         ((PresentationHeaderFooterManager)this.u9.getHeaderFooterManager()).n5(var1);
      }
   }

   @Override
   public final void reorder(int index, ISlide... slides) {
      if (index < 0 || index > this.size() - slides.length) {
         throw new PptxEditException("Index must lay within [0..Count - slides.Length] range.");
      }

      if (slides.length != 0) {
         Dictionary var3 = new Dictionary(slides.length);

         for (int var4 = 0; var4 < slides.length; var4++) {
            if (slides[var4].getPresentation() != this.u9) {
               throw new PptxEditException("Trying to move slide from other presentation.");
            }

            if (var3.containsKey(slides[var4])) {
               throw new PptxEditException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "Trying to move the same slide twice. Slide number: ", com.aspose.slides.ms.System.a3.l6(slides[var4].getSlideNumber())
                  })
               );
            }

            var3.set_Item(slides[var4], slides[var4]);
         }

         int var16 = this.n5.size();
         int var5 = 0;
         int[] var6 = new int[slides.length];

         for (int var7 = 0; var7 < var16; var7++) {
            if (var3.containsKey(this.n5.get_Item(var7))) {
               var6[var5++] = var7;
            }
         }

         if (var5 < slides.length) {
            throw new PptxEditException("Trying to move removed slide.");
         }

         synchronized (this.n5.getSyncRoot()) {
            for (int var8 = 0; var8 < var6.length - 1; var8++) {
               int var9 = var6[var8] - var8;
               int var10 = var6[var8 + 1] - var8 - 2;
               if (var10 >= index) {
                  var10 = index - 1;
               }

               for (int var11 = var9; var11 <= var10; var11++) {
                  this.n5.set_Item(var11, slides[var11 + var8 + 1]);
               }

               if (var10 == index - 1) {
                  break;
               }
            }

            int var17 = index + slides.length - 1;
            int var18 = 0;

            for (int var20 = var6.length - 1; var18 < var6.length - 1; var20--) {
               int var21 = var6[var20] + var18;
               int var12 = var6[var20 - 1] + var18 + 2;
               if (var12 <= var17) {
                  var12 = var17 + 1;
               }

               for (int var13 = var21; var13 >= var12; var13--) {
                  this.n5.set_Item(var13, slides[var13 - var18 - 1]);
               }

               if (var12 == var17 + 1) {
                  break;
               }

               var18++;
            }

            for (int var19 = 0; var19 < slides.length; var19++) {
               this.n5.set_Item(index + var19, slides[var19]);
            }
         }

         this.n5(index);
      }
   }

   @Override
   public final int indexOf(ISlide slide) {
      return this.n5.indexOf(slide);
   }

   @Override
   public final ISlide[] addFromPdf(String path) {
      com.aspose.slides.internal.z0k.n3 var2 = new com.aspose.slides.internal.z0k.n3(path, 3, 1, 1);

      try {
         return this.n5(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public final ISlide[] addFromPdf(String path, PdfImportOptions pdfImportOptions) {
      com.aspose.slides.internal.z0k.n3 var3 = new com.aspose.slides.internal.z0k.n3(path, 3, 1, 1);

      try {
         return this.n5(var3, pdfImportOptions);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final ISlide[] addFromPdf(InputStream pdfStream) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(pdfStream));
   }

   ISlide[] n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.e7.l6 var2 = com.aspose.slides.internal.e7.l6.n5(var1);

      try {
         return h8k.n5(this.u9, var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public final ISlide[] addFromPdf(InputStream pdfStream, PdfImportOptions pdfImportOptions) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(pdfStream), pdfImportOptions);
   }

   ISlide[] n5(com.aspose.slides.internal.z0k.t4 var1, PdfImportOptions var2) {
      com.aspose.slides.internal.e7.l6 var3 = com.aspose.slides.internal.e7.l6.n5(var1);

      try {
         return h8k.n5(this.u9, var3, var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final ISlide[] addFromHtml(String htmlText, IExternalResourceResolver resolver, String uri) {
      return this.n5(this.size(), htmlText, resolver, uri, false);
   }

   @Override
   public final ISlide[] addFromHtml(String htmlText) {
      return this.n5(this.size(), htmlText, null, "", false);
   }

   @Override
   public final ISlide[] addFromHtml(InputStream htmlStream, IExternalResourceResolver resolver, String uri) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(htmlStream), resolver, uri);
   }

   ISlide[] n5(com.aspose.slides.internal.z0k.t4 var1, IExternalResourceResolver var2, String var3) {
      return this.n5(this.size(), new com.aspose.slides.internal.z0k.m3(var1).c8(), var2, var3, false);
   }

   @Override
   public final ISlide[] addFromHtml(InputStream htmlStream) {
      return this.l6(com.aspose.slides.internal.z0k.t4.fromJava(htmlStream));
   }

   ISlide[] l6(com.aspose.slides.internal.z0k.t4 var1) {
      return this.n5(this.size(), new com.aspose.slides.internal.z0k.m3(var1).c8(), null, "", false);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, String htmlText, IExternalResourceResolver resolver, String uri) {
      return this.n5(index, htmlText, resolver, uri, false);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, String htmlText, IExternalResourceResolver resolver, String uri, boolean useSlideWithIndexAsStart) {
      return this.n5(index, htmlText, resolver, uri, useSlideWithIndexAsStart);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, String htmlText) {
      return this.n5(index, htmlText, null, "", false);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, String htmlText, boolean useSlideWithIndexAsStart) {
      return this.n5(index, htmlText, null, "", useSlideWithIndexAsStart);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, InputStream htmlStream, IExternalResourceResolver resolver, String uri) {
      return this.n5(index, com.aspose.slides.internal.z0k.t4.fromJava(htmlStream), resolver, uri);
   }

   ISlide[] n5(int var1, com.aspose.slides.internal.z0k.t4 var2, IExternalResourceResolver var3, String var4) {
      return this.n5(var1, new com.aspose.slides.internal.z0k.m3(var2).c8(), var3, var4, false);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, InputStream htmlStream, IExternalResourceResolver resolver, String uri, boolean useSlideWithIndexAsStart) {
      return this.n5(index, com.aspose.slides.internal.z0k.t4.fromJava(htmlStream), resolver, uri, useSlideWithIndexAsStart);
   }

   ISlide[] n5(int var1, com.aspose.slides.internal.z0k.t4 var2, IExternalResourceResolver var3, String var4, boolean var5) {
      return this.n5(var1, new com.aspose.slides.internal.z0k.m3(var2).c8(), var3, var4, var5);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, InputStream htmlStream) {
      return this.n5(index, com.aspose.slides.internal.z0k.t4.fromJava(htmlStream));
   }

   ISlide[] n5(int var1, com.aspose.slides.internal.z0k.t4 var2) {
      return this.n5(var1, new com.aspose.slides.internal.z0k.m3(var2).c8(), null, "", false);
   }

   @Override
   public final ISlide[] insertFromHtml(int index, InputStream htmlStream, boolean useSlideWithIndexAsStart) {
      return this.n5(index, com.aspose.slides.internal.z0k.t4.fromJava(htmlStream), useSlideWithIndexAsStart);
   }

   ISlide[] n5(int var1, com.aspose.slides.internal.z0k.t4 var2, boolean var3) {
      return this.n5(var1, new com.aspose.slides.internal.z0k.m3(var2).c8(), null, "", var3);
   }

   private ISlide[] n5(int var1, String var2, IExternalResourceResolver var3, String var4, boolean var5) {
      if (var1 >= 0 && var1 <= this.size()) {
         try {
            return i9o.n5(this.u9, var1, new f7s(var3), var2, var4, var5);
         } catch (RuntimeException var7) {
            com.aspose.slides.internal.n8e.v4.n5(var7);
            return null;
         }
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
