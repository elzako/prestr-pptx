package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class SectionCollection extends DomObject<Presentation> implements ISectionCollection {
   final List<ISection> n5 = new List<>();

   SectionCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final ISection get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final ISection addSection(String name, ISlide startedFromSlide) {
      if (startedFromSlide == null) {
         throw new ArgumentNullException("startedFromSlide");
      }

      int var3 = this.u9.getSlides().indexOf(startedFromSlide);
      if (this.n5.size() == 0 && var3 > 0) {
         Section var4 = new Section("Default Section", this, this.u9.getSlides().get_Item(0));
         this.n5.addItem(var4);
      }

      int var6 = 0;

      for (int var5 = this.n5.size() - 1; var5 >= 0; var5--) {
         if (this.n5.get_Item(var5).getStartedFromSlide() != null) {
            if (this.n5.get_Item(var5).getStartedFromSlide() == startedFromSlide) {
               throw new PptxEditException("Section with the same first slide already exists.");
            }

            if (this.u9.getSlides().indexOf(this.n5.get_Item(var5).getStartedFromSlide()) < var3) {
               var6 = var5 + 1;
               break;
            }
         }
      }

      Section var7 = new Section(name, this, startedFromSlide);
      this.n5.insertItem(var6, var7);
      return var7;
   }

   @Override
   public final ISection appendEmptySection(String name) {
      if (this.n5.size() == 0) {
         Section var2 = new Section("Default Section", this, this.u9.getSlides().get_Item(0));
         this.n5.addItem(var2);
      }

      Section var3 = new Section(name, this, null);
      this.n5.addItem(var3);
      return var3;
   }

   @Override
   public final ISection addEmptySection(String name, int index) {
      if (index >= 0 && (index <= 0 || index < this.size())) {
         if (this.n5.size() == 0) {
            Section var3 = new Section("Default Section", this, this.u9.getSlides().get_Item(0));
            this.n5.addItem(var3);
         }

         Section var4 = new Section(name, this, null);
         this.n5.insertItem(index, var4);
         return var4;
      } else {
         throw new PptxEditException("Index must lay within [0..Count-1] range.");
      }
   }

   final ISection n5(String var1, ISlide var2, com.aspose.slides.ms.System.o0 var3) {
      Section var4 = new Section(var1, this, var2);
      var4.n5(var3.k5());
      this.n5.addItem(var4);
      return var4;
   }

   final ISection n5(ISlide var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            ISection var3 = (ISection)var2.next();
            SectionSlideCollection var4 = (SectionSlideCollection)var3.getSlidesListOfSection();
            if (var4.n5(var1)) {
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
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final int indexOf(ISection section) {
      return this.n5.indexOf(section);
   }

   @Override
   public final void removeSectionWithSlides(ISection section) {
      ISectionSlideCollection var2 = section.getSlidesListOfSection();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            this.u9.getSlides().remove(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.n5.removeItem(section);
   }

   @Override
   public final void removeSection(ISection section) {
      int var2 = this.n5.indexOf(section);
      if (var2 == 0 && this.n5.size() > 1) {
         throw new PptxEditException("First section cannot be removed if sections count in the collection more than 1.");
      }

      if (var2 > 0 && this.n5.get_Item(var2 - 1).getStartedFromSlide() == null) {
         ((Section)this.n5.get_Item(var2 - 1)).n5(section.getStartedFromSlide());
      }

      this.n5.removeItem(section);
   }

   @Override
   public final void reorderSectionWithSlides(ISection section, int index) {
      if (index >= 0 && index < this.size()) {
         int var3 = this.n5.indexOf(section);
         int var4 = 0;
         if (var3 < 0) {
            throw new PptxEditException("Trying to move removed section.");
         }

         if (var3 != index) {
            if (index < var3) {
               if (index > 0) {
                  for (int var5 = index - 1; var5 >= 0; var5--) {
                     if (this.n5.get_Item(var5).getStartedFromSlide() != null) {
                        ISectionSlideCollection var6 = this.n5.get_Item(var5).getSlidesListOfSection();
                        var4 = this.u9.getSlides().indexOf(var6.get_Item(var6.size() - 1));
                        break;
                     }
                  }
               }

               if (section.getStartedFromSlide() != null) {
                  ISectionSlideCollection var7 = section.getSlidesListOfSection();

                  for (int var12 = 0; var12 < var7.size(); var12++) {
                     ((SlideCollection)this.u9.getSlides()).l6(var4 + var12, var7.get_Item(var12));
                  }
               }

               for (int var8 = var3; var8 > index; var8--) {
                  this.n5.set_Item(var8, this.n5.get_Item(var8 - 1));
               }
            } else {
               if (index == this.n5.size() - 1) {
                  var4 = this.u9.getSlides().size() - 1;
               }

               for (int var9 = index + 1; var9 < this.n5.size(); var9++) {
                  if (this.n5.get_Item(var9).getStartedFromSlide() != null) {
                     var4 = this.u9.getSlides().indexOf(this.n5.get_Item(var9).getStartedFromSlide());
                  }
               }

               if (section.getStartedFromSlide() != null) {
                  ISectionSlideCollection var10 = section.getSlidesListOfSection();

                  for (int var13 = 0; var13 < var10.size(); var13++) {
                     ((SlideCollection)this.u9.getSlides()).l6(var4, var10.get_Item(var13));
                  }
               }

               for (int var11 = var3; var11 < index; var11++) {
                  this.n5.set_Item(var11, this.n5.get_Item(var11 + 1));
               }
            }

            this.n5.set_Item(index, section);
         }
      } else {
         throw new PptxEditException("Index must lay within [0..Count-1] range.");
      }
   }

   final void l6(ISlide var1) {
      if (this.n5.size() != 0) {
         List$Enumerator var2 = this.n5.iterator();

         try {
            while (var2.hasNext()) {
               Section var3 = (Section)var2.next();
               if (var3.getStartedFromSlide() == var1) {
                  ISectionSlideCollection var4 = var3.getSlidesListOfSection();
                  var3.n5(var4.size() == 1 ? null : var4.get_Item(1));
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final void clear() {
      this.n5.clear();
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
   public final IGenericEnumerator<ISection> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ISection> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
