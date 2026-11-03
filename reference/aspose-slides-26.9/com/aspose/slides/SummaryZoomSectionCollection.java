package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public final class SummaryZoomSectionCollection extends DomObject<SummaryZoomFrame> implements ISummaryZoomSectionCollection {
   final List<ISummaryZoomSection> n5 = new List<>();

   SummaryZoomSectionCollection(SummaryZoomFrame parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final ISummaryZoomSection get_Item(int index) {
      return this.n5.get_Item(index);
   }

   final ISummaryZoomSection n5(ISummaryZoomSection var1) {
      this.n5.addItem(var1);
      return var1;
   }

   @Override
   public final ISummaryZoomSection addSummaryZoomSection(ISection section) {
      if (section != null && section.getStartedFromSlide() != null && section.getStartedFromSlide().getPresentation() == this.u9.getPresentation()) {
         ISummaryZoomSection var2 = this.getSummarySection(section);
         if (var2 != null) {
            return var2;
         }

         var2 = new SummaryZoomSection(this.u9);
         var2.setTargetSection(section);
         if (this.n5.isEmpty()) {
            this.n5.addItem(var2);
         } else {
            int var3 = this.u9.getPresentation().getSections().indexOf(section);
            int var4 = 0;

            for (int var5 = 0; var5 < this.size(); var5++) {
               if (this.u9.getPresentation().getSections().indexOf(this.get_Item(var5).getTargetSection()) > var3) {
                  var4 = var5;
                  break;
               }

               var4 = var5 + 1;
            }

            this.n5.insertItem(var4, var2);
         }

         this.n5();
         return var2;
      } else {
         throw new ArgumentException("Referenced slide of section does not belong to the current presentation.");
      }
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final int indexOf(ISummaryZoomSection summaryZoomSection) {
      return this.n5.indexOf(summaryZoomSection);
   }

   private void l6(ISummaryZoomSection var1) {
      this.n5.removeItem(var1);
      this.n5();
   }

   @Override
   public final void removeSummaryZoomSection(ISection section) {
      if (section != null) {
         ISummaryZoomSection var2 = this.getSummarySection(section);
         if (var2 != null) {
            this.l6(var2);
         }
      }
   }

   @Override
   public final ISummaryZoomSection getSummarySection(ISection section) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            ISummaryZoomSection var3 = (ISummaryZoomSection)var2.next();
            if (var3.getTargetSection() != null && com.aspose.slides.ms.System.o0.n5(((Section)var3.getTargetSection()).n5(), ((Section)section).n5())) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   private void n5() {
      float var1 = this.u9.getHeight();
      float var2 = this.u9.getWidth();
      float var3 = var1 * var2;
      float var4 = ((SlideSize)this.u9.getPresentation().getSlideSize()).n5().k5();
      float var5 = ((SlideSize)this.u9.getPresentation().getSlideSize()).n5().l6();
      float var6 = var4 * var5;
      int var7 = 1;
      byte var8 = 1;

      for (int var9 = this.size(); var5 * var7 > var2 || var4 * var8 > var1; var8 = (byte)(var9 % var7 > 0 ? var9 / var7 + 1 : var9 / var7)) {
         do {
            var4 *= 0.9F;
            var5 *= 0.9F;
            var6 = var4 * var5;
         } while (var6 * var9 > var3 || var5 > var2 || var4 > var1);

         var7 = com.aspose.slides.internal.v6g.k5.u3(var2 / var5, 13);
      }

      float var10 = (var2 - var5 * var7) / 2.0F;
      float var11 = (var1 - var4 * var8) / 2.0F;
      float var12 = 0.05F;

      for (int var13 = 0; var13 < this.size(); var13++) {
         this.get_Item(var13).setX(var10 + var13 % var7 * var5 + var5 * var12 / 2.0F);
         this.get_Item(var13).setX(this.get_Item(var13).getX() - this.get_Item(var13).getX() * ((SummaryZoomSection)this.get_Item(var13)).k5() / 100.0F);
         this.get_Item(var13).setY(var11 + (int)((double)var13 / var7) * var4 + var4 * var12 / 2.0F);
         this.get_Item(var13).setY(this.get_Item(var13).getY() + this.get_Item(var13).getY() * ((SummaryZoomSection)this.get_Item(var13)).u9() / 100.0F);
         this.get_Item(var13).setWidth((var5 - var5 * var12) * ((SummaryZoomSection)this.get_Item(var13)).x8() / 100.0F);
         this.get_Item(var13).setHeight((var4 - var4 * var12) * ((SummaryZoomSection)this.get_Item(var13)).y4() / 100.0F);
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

   @Override
   public final IGenericEnumerator<ISummaryZoomSection> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ISummaryZoomSection> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
