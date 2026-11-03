package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class f7o {
   private z5o n5;
   private List<z5o> l6 = new List<>();
   private LoadOptions k5;

   final LoadOptions n5() {
      return this.k5;
   }

   final void n5(LoadOptions var1) {
      this.k5 = var1;
   }

   private List<z5o> k5() {
      return this.l6;
   }

   public f7o() {
      this.n5(new LoadOptions());
      this.n5 = new z5o(this);
   }

   public f7o(String var1, LoadOptions var2) {
      this.n5(var2);
      this.n5 = new z5o(var1, var2, this);
   }

   public final z5o l6() {
      z5o var1 = new z5o(this);
      this.k5().addItem(var1);
      return var1;
   }

   public final IMasterSlide n5(IMasterSlide var1) {
      if (this.n5.n5().size() == 0) {
         return null;
      }

      IMasterSlide var2 = var1.getPresentation().getMasters().addClone(this.n5.n5().get_Item(0));

      for (ISlide var6 : var1.getDependingSlides()) {
         byte var7 = var6.getLayoutSlide().getLayoutType();
         ILayoutSlide var8 = var2.getLayoutSlides().getByType(var7);
         if (var8 != null) {
            var6.setLayoutSlide(var8);
         } else {
            var6.getLayoutSlide().setMasterSlide(var2);
         }
      }

      IGenericEnumerator var24 = var1.getShapes().iterator();

      try {
         while (var24.hasNext()) {
            Shape var25 = (Shape)var24.next();
            if (var25.getPlaceholder() == null && var25.h0().j5()) {
               var2.getShapes().addClone(var25);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }

      IGenericEnumerator var26 = var2.getLayoutSlides().iterator();

      try {
         while (var26.hasNext()) {
            ILayoutSlide var27 = (ILayoutSlide)var26.next();
            byte var28 = var27.getLayoutType();
            ILayoutSlide var29 = var1.getLayoutSlides().getByType(var28);
            if (var29 != null) {
               IGenericEnumerator var30 = var29.getShapes().iterator();

               try {
                  while (var30.hasNext()) {
                     Shape var9 = (Shape)var30.next();
                     if (var9.getPlaceholder() == null && var9.h0().j5()) {
                        var27.getShapes().addClone(var9);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                     var30.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      return var2;
   }
}
