package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class GlobalLayoutSlideCollection extends LayoutSlideCollection implements IGlobalLayoutSlideCollection {
   GlobalLayoutSlideCollection(Presentation parent) {
      super(parent);
   }

   @Override
   public final ILayoutSlide addClone(ILayoutSlide sourceLayout) {
      LayoutSlide var2 = (LayoutSlide)sourceLayout;
      synchronized (this.n5()) {
         if (var2.getPresentation() == this.n5()) {
            return n0r.n5(var2.getMasterSlide(), var2);
         }

         IMasterSlide var4 = ((MasterSlideCollection)this.n5().getMasters()).n5(var2.getMasterSlide(), false);
         return this.addClone(var2, var4);
      }
   }

   @Override
   public final ILayoutSlide addClone(ILayoutSlide sourceLayout, IMasterSlide destMaster) {
      LayoutSlide var3 = (LayoutSlide)sourceLayout;
      if (destMaster.getPresentation() != this.n5()) {
         throw new PptxEditException("Master must belong to the target presentation.");
      }

      LayoutSlide var4;
      if (var3.getPresentation() == this.n5()) {
         var4 = (LayoutSlide)n0r.n5(destMaster, var3);
      } else {
         var4 = (LayoutSlide)n0r.n5(destMaster, var3);
         var4.n5(var3.getPresentation().getDefaultTextStyle());
         float var5 = ((SlideSize)((Presentation)this.l6).getSlideSize()).n5().l6() / ((SlideSize)sourceLayout.getPresentation().getSlideSize()).n5().l6();
         float var6 = ((SlideSize)((Presentation)this.l6).getSlideSize()).n5().k5() / ((SlideSize)sourceLayout.getPresentation().getSlideSize()).n5().k5();
         var4.n5(var5, var6);
      }

      return var4;
   }

   @Override
   public final ILayoutSlide add(IMasterSlide master, byte layoutType, String layoutName) {
      if (master == null) {
         throw new ArgumentNullException("master");
      }

      if (master.getPresentation() != this.n5()) {
         throw new ArgumentException("Master slide must be from the same presentation.");
      }

      LayoutSlide var4 = w6g.n5(master, layoutType);
      if (layoutName != null) {
         IMasterSlide var5 = var4.getMasterSlide();
         List var6 = new List();
         IGenericEnumerator var7 = var5.getLayoutSlides().iterator();

         try {
            while (var7.hasNext()) {
               ILayoutSlide var8 = (ILayoutSlide)var7.next();
               if (var8 != var4) {
                  var6.addItem(var8.getName());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         if (var6.containsItem(layoutName)) {
            throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"The layout name \"", layoutName, "\" is already in use. Please modify the name."}));
         }

         var4.setName(layoutName);
      } else {
         IMasterSlide var17 = var4.getMasterSlide();
         List var18 = new List();
         IGenericEnumerator var19 = var17.getLayoutSlides().iterator();

         try {
            while (var19.hasNext()) {
               ILayoutSlide var20 = (ILayoutSlide)var19.next();
               if (var20 != var4) {
                  var18.addItem(var20.getName());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
               var19.dispose();
            }
         }

         String var21 = var4.getName();

         for (int var9 = 1; var18.containsItem(var4.getName()); var9++) {
            var4.setName(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var9), "_", var21}));
         }
      }

      return var4;
   }
}
