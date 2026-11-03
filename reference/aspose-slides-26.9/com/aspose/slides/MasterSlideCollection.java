package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class MasterSlideCollection extends DomObject<Presentation> implements IMasterSlideCollection {
   final List<IMasterSlide> n5 = new List<>();

   MasterSlideCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IMasterSlide get_Item(int index) {
      return this.n5.get_Item(index);
   }

   final void n5(IMasterSlide var1) {
      this.n5.addItem(var1);
   }

   final IMasterSlide n5() {
      MasterSlide var1 = new MasterSlide(this);
      this.n5.addItem(var1);
      return var1;
   }

   @Override
   public final void remove(IMasterSlide value) {
      if (this.n5.containsItem(value)) {
         synchronized (this.n5.getSyncRoot()) {
            if (value.hasDependingSlides()) {
               throw new PptxEditException("Error removing master slide: this master slide is used in presentation.");
            }

            List var3 = new List<>(value.getLayoutSlides());
            List$Enumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  ILayoutSlide var5 = (ILayoutSlide)var4.next();
                  var5.remove();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            this.n5.removeItem(value);
            if (value.getThemeManager().getOverrideTheme() == value.getPresentation().getMasterTheme() && this.n5.size() > 0) {
               ((MasterSlide)value).z1().n5(this.n5.get_Item(0).getThemeManager().getOverrideTheme());
            }

            ((MasterSlide)value).n5((r0g)null);
         }
      }
   }

   @Override
   public final void removeAt(int index) {
      if (index >= 0 && index < this.n5.size()) {
         this.remove(this.n5.get_Item(index));
      } else {
         throw new IndexOutOfRangeException("Error removing master slide: index out of range.");
      }
   }

   @Override
   public final void removeUnused(boolean ignorePreserveField) {
      synchronized (this.n5.getSyncRoot()) {
         int var3 = 0;

         while (var3 < this.n5.size()) {
            MasterSlide var4 = (MasterSlide)this.n5.get_Item(var3);
            if ((ignorePreserveField || !var4.getPreserve()) && !var4.hasDependingSlides()) {
               this.remove(this.n5.get_Item(var3));
            } else {
               var3++;
            }
         }
      }
   }

   @Override
   public final IMasterSlide addClone(IMasterSlide sourceMaster) {
      return this.n5((MasterSlide)sourceMaster, true);
   }

   @Override
   public final IMasterSlide insertClone(int index, IMasterSlide sourceMaster) {
      MasterSlide var3 = this.n5((MasterSlide)sourceMaster, true);
      int var4 = this.n5.indexOf(var3);
      if (index == var4) {
         return var3;
      }

      synchronized (this.n5.getSyncRoot()) {
         for (int var6 = var4; var6 > index; var6--) {
            this.n5.set_Item(var6, this.n5.get_Item(var6 - 1));
         }

         this.n5.set_Item(index, var3);
         return var3;
      }
   }

   final MasterSlide n5(MasterSlide var1, boolean var2) {
      MasterSlide var3;
      if (var1.getPresentation() == this.u9) {
         var3 = (MasterSlide)n0r.n5(this.u9, var1, var2);
      } else {
         var3 = (MasterSlide)n0r.n5(this.u9, var1, var2);
         TextStyle var4 = (TextStyle)var1.getPresentation().getDefaultTextStyle();
         boolean var5 = ((TextStyle)var3.getOtherStyle()).u3(var4);
         if (!var5) {
            var3.n5((com.aspose.slides.ITextStyle)(var4));
         }

         for (int var6 = 0; var6 < var3.u9.size(); var6++) {
            LayoutSlide var7 = (LayoutSlide)var3.u9.get_Item(var6);
            if (!var5) {
               var7.n5((com.aspose.slides.ITextStyle)(var4));
            }
         }

         float var13 = ((SlideSize)this.u9.getSlideSize()).n5().l6() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().l6();
         float var14 = ((SlideSize)this.u9.getSlideSize()).n5().k5() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().k5();
         IGenericEnumerator var8 = var3.getLayoutSlides().iterator();

         try {
            while (var8.hasNext()) {
               ILayoutSlide var9 = (ILayoutSlide)var8.next();
               ((BaseSlide)var9).n5(var13, var14);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }

         var3.n5(var13, var14);
      }

      return var3;
   }

   final IMasterSlide n5(IMasterSlide var1, boolean var2) {
      MasterSlide var3 = (MasterSlide)var1;
      long var4 = var3.u9();
      h7 var6 = null;
      if (this.u9.a6.containsKey(var4)) {
         var6 = this.u9.a6.get_Item(var4);
      }

      MasterSlide var7 = var6 == null ? null : (MasterSlide)var6.n5();
      if (var7 == null) {
         var7 = this.n5(var3, var2);
         this.u9.a6.set_Item(var4, new h7<>(MasterSlide.class, var7));
      }

      return var7;
   }

   void l6() {
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
   public final IGenericEnumerator<IMasterSlide> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IMasterSlide> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
