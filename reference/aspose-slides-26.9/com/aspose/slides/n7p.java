package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class n7p {
   static void n5(int var0, boolean var1, List<IShape> var2) {
      if (var2.size() != 0) {
         IBaseSlide var3 = ((IShape)var2.get_Item(0)).getSlide();
         if (var3 == null) {
            throw new InvalidOperationException("Parent slide for the shape is not defined.");
         }

         float var4 = var1 ? 0.0F : ((IShape)var2.get_Item(0)).getX();
         float var5 = var1 ? 0.0F : ((IShape)var2.get_Item(0)).getY();
         float var6 = var1
            ? ((SlideSize)var3.getPresentation().getSlideSize()).n5().l6()
            : ((IShape)var2.get_Item(0)).getX() + ((IShape)var2.get_Item(0)).getWidth();
         float var7 = var1
            ? ((SlideSize)var3.getPresentation().getSlideSize()).n5().k5()
            : ((IShape)var2.get_Item(0)).getY() + ((IShape)var2.get_Item(0)).getHeight();
         float var8 = 0.0F;
         float var9 = 0.0F;
         List$Enumerator var10 = var2.iterator();

         try {
            while (var10.hasNext()) {
               IShape var11 = (IShape)var10.next();
               if (var11.getSlide() != var3) {
                  throw new InvalidOperationException("Shapes must be placed on the same slide.");
               }

               if (!var1) {
                  if (var11.getX() < var4) {
                     var4 = var11.getX();
                  }

                  if (var11.getY() < var5) {
                     var5 = var11.getY();
                  }

                  if (var11.getX() + var11.getWidth() > var6) {
                     var6 = var11.getX() + var11.getWidth();
                  }

                  if (var11.getY() + var11.getHeight() > var7) {
                     var7 = var11.getY() + var11.getHeight();
                  }
               }

               var9 += var11.getHeight();
               var8 += var11.getWidth();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         switch (var0) {
            case 0:
               n5(var2, var4);
               break;
            case 1:
               l6(var2, var6);
               break;
            case 2:
               n5(var2, var4, var6);
               break;
            case 3:
               k5(var2, var5);
               break;
            case 4:
               l6(var2, var5, var7);
               break;
            case 5:
               u3(var2, var7);
               break;
            case 6:
               n5(var2, var1, var8);
               break;
            case 7:
               l6(var2, var1, var9);
         }
      }
   }

   private static void n5(List<IShape> var0, float var1) {
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            var3.setX(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void l6(List<IShape> var0, float var1) {
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            var3.setX(var1 - var3.getWidth());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(List<IShape> var0, float var1, float var2) {
      float var3 = var1 + (var2 - var1) / 2.0F;
      List$Enumerator var4 = var0.iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            var5.setX(var3 - var5.getWidth() / 2.0F);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private static void k5(List<IShape> var0, float var1) {
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            var3.setY(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void l6(List<IShape> var0, float var1, float var2) {
      float var3 = var1 + (var2 - var1) / 2.0F;
      List$Enumerator var4 = var0.iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            var5.setY(var3 - var5.getHeight() / 2.0F);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private static void u3(List<IShape> var0, float var1) {
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            var3.setY(var1 - var3.getHeight());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(List<IShape> var0, boolean var1, float var2) {
      var0.sort(new n7p$1());
      if (var1) {
         IBaseSlide var3 = ((IShape)var0.get_Item(0)).getSlide();
         float var4 = ((SlideSize)var3.getPresentation().getSlideSize()).n5().l6();
         float var5 = (var4 - var2) / (var0.size() + 1);
         float var6 = var5;
         List$Enumerator var7 = var0.iterator();

         try {
            while (var7.hasNext()) {
               IShape var8 = (IShape)var7.next();
               var8.setX(var6);
               var6 += var5 + var8.getWidth();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      } else {
         if (var0.size() <= 2) {
            return;
         }

         float var12 = ((IShape)var0.get_Item(0)).getX() + ((IShape)var0.get_Item(0)).getWidth();
         float var13 = ((IShape)var0.get_Item(var0.size() - 1)).getX();
         float var14 = var2 - ((IShape)var0.get_Item(0)).getWidth() - ((IShape)var0.get_Item(var0.size() - 1)).getWidth();
         float var15 = (var13 - var12 - var14) / (var0.size() - 1);
         float var16 = var12 + var15;

         for (int var17 = 1; var17 < var0.size() - 1; var17++) {
            ((IShape)var0.get_Item(var17)).setX(var16);
            var16 += var15 + ((IShape)var0.get_Item(var17)).getWidth();
         }
      }
   }

   private static void l6(List<IShape> var0, boolean var1, float var2) {
      var0.sort(new n7p$2());
      if (var1) {
         IBaseSlide var3 = ((IShape)var0.get_Item(0)).getSlide();
         float var4 = ((SlideSize)var3.getPresentation().getSlideSize()).n5().k5();
         float var5 = (var4 - var2) / (var0.size() + 1);
         float var6 = var5;
         List$Enumerator var7 = var0.iterator();

         try {
            while (var7.hasNext()) {
               IShape var8 = (IShape)var7.next();
               var8.setY(var6);
               var6 += var5 + var8.getHeight();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      } else {
         if (var0.size() <= 2) {
            return;
         }

         float var12 = ((IShape)var0.get_Item(0)).getY() + ((IShape)var0.get_Item(0)).getHeight();
         float var13 = ((IShape)var0.get_Item(var0.size() - 1)).getY();
         float var14 = var2 - ((IShape)var0.get_Item(0)).getHeight() - ((IShape)var0.get_Item(var0.size() - 1)).getHeight();
         float var15 = (var13 - var12 - var14) / (var0.size() - 1);
         float var16 = var12 + var15;

         for (int var17 = 1; var17 < var0.size() - 1; var17++) {
            ((IShape)var0.get_Item(var17)).setY(var16);
            var16 += var15 + ((IShape)var0.get_Item(var17)).getHeight();
         }
      }
   }
}
