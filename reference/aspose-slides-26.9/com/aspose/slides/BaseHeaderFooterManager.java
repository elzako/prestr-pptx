package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class BaseHeaderFooterManager implements IBaseHeaderFooterManager, r0g {
   private final r0g n5;

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   BaseHeaderFooterManager(r0g parentImmediate) {
      if (parentImmediate == null) {
         throw new ArgumentNullException("parentImmediate");
      }

      this.n5 = parentImmediate;
   }

   static void n5(BaseSlide var0) {
      var0.l6.n5(var0);
   }

   static void n5(BaseSlide var0, Shape var1) {
      if (var0 != null && var1 != null) {
         boolean var2 = false;
         AutoShape var3 = null;
         byte var4 = var1.getPlaceholder().getType();
         IGenericEnumerator var5 = var0.getShapes().iterator();

         try {
            while (var5.hasNext()) {
               Shape var6 = (Shape)var5.next();
               if (var6.getPlaceholder() != null) {
                  if (var6.getPlaceholder().getType() == var4 && var6.getPlaceholder().getIndex() == var1.getPlaceholder().getIndex()) {
                     var2 = true;
                     var3 = com.aspose.slides.internal.v6g.k5.n5(var6, AutoShape.class);
                     break;
                  }

                  if (var6.getPlaceholder().getType() == var4 && var6.getPlaceholder().getIndex() == 4294967295L) {
                     var0.l6.n5(var6);
                     var6.addPlaceholder(var1.getPlaceholder());
                     var2 = true;
                     var3 = com.aspose.slides.internal.v6g.k5.n5(var6, AutoShape.class);
                     break;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         if (!var2) {
            AutoShape var10 = ((ShapeCollection)var0.getShapes()).n3();
            var10.u6();
            var10.setName(var1.getName());
            var10.addPlaceholder(var1.getPlaceholder());
            var3 = com.aspose.slides.internal.v6g.k5.n5(var10, AutoShape.class);
            if (var4 < 9) {
               var3.addTextFrame("");
            }
         }

         if (var3 != null && BaseSlideHeaderFooterManager.n5(var4)) {
            n5(com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class), var3);
         }

         n5(var0);
      }
   }

   static void n5(BaseSlide var0, BaseSlide var1, byte var2) {
      if (var0 != null && var1 != null) {
         IGenericEnumerator var3 = var1.getShapes().iterator();

         try {
            while (var3.hasNext()) {
               Shape var4 = (Shape)var3.next();
               if (var4.getPlaceholder() != null && var4.getPlaceholder().getType() == var2) {
                  n5(var0, var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   static void n5(BaseSlide var0, byte var1) {
      if (var0 != null) {
         for (int var2 = var0.getShapes().size() - 1; var2 >= 0; var2--) {
            IShape var3 = var0.getShapes().get_Item(var2);
            if (var3.getPlaceholder() != null && var3.getPlaceholder().getType() == var1) {
               var0.getShapes().removeAt(var2);
               var0.l6.n5(var3);
            }
         }

         n5(var0);
      }
   }

   private static void n5(AutoShape var0, AutoShape var1) {
      if (var0 != null && var1 != null) {
         IParagraphCollection var2 = var1.getTextFrame().getParagraphs();
         var2.clear();
         IGenericEnumerator var3 = var0.getTextFrame().getParagraphs().iterator();

         try {
            while (var3.hasNext()) {
               IParagraph var4 = (IParagraph)var3.next();
               var2.add(new Paragraph((Paragraph)var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         ((TextFrameFormat)var1.getTextFrame().getTextFrameFormat()).n5((TextFrameFormat)var0.getTextFrame().getTextFrameFormat());
      }
   }
}
