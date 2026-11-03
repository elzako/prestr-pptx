package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Iterator;

class h5s {
   static byte[] n5(IPresentation var0, IPPImage var1, int var2) {
      if (var2 == 5) {
         return null;
      }

      Dictionary var3 = l6(var0, var1, var2);
      Object var4 = null;
      byte[][] var5 = new byte[][]{(byte[])var4};
      return var3.tryGetValue(var1, var5) ? var5[0] : null;
   }

   private static Dictionary<IPPImage, byte[]> l6(IPresentation var0, IPPImage var1, int var2) {
      Dictionary var3 = new Dictionary();
      Dictionary var4 = new Dictionary();
      IGenericEnumerator var5 = var0.getSlides().iterator();

      try {
         while (var5.hasNext()) {
            ISlide var6 = (ISlide)var5.next();
            n5(var6, ((SlideSize)var0.getSlideSize()).n5().l6(), ((SlideSize)var0.getSlideSize()).n5().k5(), var1, var2, var3, var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      IGenericEnumerator var22 = var0.getLayoutSlides().iterator();

      try {
         while (var22.hasNext()) {
            ILayoutSlide var7 = (ILayoutSlide)var22.next();
            n5(var7, ((SlideSize)var0.getSlideSize()).n5().l6(), ((SlideSize)var0.getSlideSize()).n5().k5(), var1, var2, var3, var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      IGenericEnumerator var23 = var0.getMasters().iterator();

      try {
         while (var23.hasNext()) {
            IMasterSlide var8 = (IMasterSlide)var23.next();
            n5(var8, ((SlideSize)var0.getSlideSize()).n5().l6(), ((SlideSize)var0.getSlideSize()).n5().k5(), var1, var2, var3, var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }

      return var3;
   }

   private static void n5(IPPImage var0, byte[] var1, Dictionary<IPPImage, byte[]> var2, Dictionary<IPPImage, Long> var3) {
      if (var1 != null) {
         IImage var4 = Images.fromData(var1);

         try {
            long var5 = (long)var4.getWidth() * var4.getHeight();
            long var7 = 0L;
            Long[] var9 = new Long[]{var7};
            boolean var10 = !var3.tryGetValue(var0, var9) || var5 > var9[0];
            var7 = var9[0];
            if (var10) {
               var3.set_Item(var0, var5);
               var2.set_Item(var0, var1);
            }
         } finally {
            var4.dispose();
         }
      }
   }

   private static void n5(IBaseSlide var0, float var1, float var2, IPPImage var3, int var4, Dictionary<IPPImage, byte[]> var5, Dictionary<IPPImage, Long> var6) {
      n5(var0.getShapes(), var3, var4, var5, var6);
      IFillFormat var7 = var0.getBackground().getFillFormat();
      if (var7.getFillType() == 4 && var7.getPictureFillFormat().getPicture() != null) {
         IPPImage var8 = var7.getPictureFillFormat().getPicture().getImage();
         if (var8 != null && (var3 == null || var3 == var8)) {
            n5(var8, n5(var8, var1, var2, var4), var5, var6);
         }
      }
   }

   private static void n5(IShapeCollection var0, IPPImage var1, int var2, Dictionary<IPPImage, byte[]> var3, Dictionary<IPPImage, Long> var4) {
      IGenericEnumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            IShape var6 = (IShape)var5.next();
            IPictureFrame var7 = com.aspose.slides.internal.v6g.k5.n5(var6, IPictureFrame.class);
            if (var7 != null && var7.getPictureFormat().getPicture() != null) {
               IPPImage var8 = var7.getPictureFormat().getPicture().getImage();
               n5(var8, var6, var1, var2, var3, var4);
            }

            if (var6.getFillFormat().getFillType() == 4 && var6.getFillFormat().getPictureFillFormat().getPicture() != null) {
               IPPImage var21 = var6.getFillFormat().getPictureFillFormat().getPicture().getImage();
               n5(var21, var6, var1, var2, var3, var4);
            }

            IAutoShape var22 = com.aspose.slides.internal.v6g.k5.n5(var6, IAutoShape.class);
            if (var22 != null && var22.getTextFrame() != null) {
               IGenericEnumerator var9 = var22.getTextFrame().getParagraphs().iterator();

               try {
                  while (var9.hasNext()) {
                     IParagraph var10 = (IParagraph)var9.next();
                     IBulletFormatEffectiveData var11 = var10.getParagraphFormat().getEffective().getBullet();
                     if (var11.getType() == 3 && var11.getFillFormat().getPictureFillFormat().getPicture() != null) {
                        IPPImage var12 = var11.getFillFormat().getPictureFillFormat().getPicture().getImage();
                        n5(var12, var6, var1, var2, var3, var4);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }
            }

            IGroupShape var23 = com.aspose.slides.internal.v6g.k5.n5(var6, IGroupShape.class);
            if (var23 != null) {
               n5(var23.getShapes(), var1, var2, var3, var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   private static void n5(IPPImage var0, IShape var1, IPPImage var2, int var3, Dictionary<IPPImage, byte[]> var4, Dictionary<IPPImage, Long> var5) {
      if (var0 != null && (var2 == null || var2 == var0)) {
         n5(var0, n5(var0, var1, var3), var4, var5);
      }
   }

   private static byte[] n5(IPPImage var0, IShape var1, int var2) {
      Presentation var3 = new Presentation();

      try {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            var3.getSlides().get_Item(0).getShapes().addClone(var1);
            return n5(var3, var4, var0, var2);
         } finally {
            var4.dispose();
         }
      } finally {
         var3.dispose();
      }
   }

   private static byte[] n5(IPPImage var0, float var1, float var2, int var3) {
      Presentation var4 = new Presentation();

      try {
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

         try {
            IPPImage var6 = var4.getImages().addImage(var0.getBinaryData());
            var4.getSlideSize().setSize(var1, var2, 0);
            ISlide var7 = var4.getSlides().get_Item(0);
            var7.getBackground().setType((byte)1);
            var7.getBackground().getFillFormat().setFillType((byte)4);
            var7.getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode(1);
            var7.getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(var6);
            return n5(var4, var5, var0, var3);
         } finally {
            var5.dispose();
         }
      } finally {
         var4.dispose();
      }
   }

   private static byte[] n5(Presentation var0, com.aspose.slides.internal.z0k.e2 var1, IPPImage var2, int var3) {
      HtmlOptions var4 = new HtmlOptions();
      var4.setPicturesCompression(var3);
      var4.setDeletePicturesCroppedAreas(true);
      var0.n5(var1, 13, var4);
      return n5(var1.toArray(), var2);
   }

   private static byte[] n5(byte[] var0, IPPImage var1) {
      String var2 = com.aspose.slides.internal.l7h.j5.z3().l6(var0);
      com.aspose.slides.internal.r7c.u9 var3 = com.aspose.slides.internal.r7c.c8.l6(var2, "data:image/(?:png|jpeg);base64,\\s*([^\\\"']+)");
      byte[] var4 = null;
      double var5 = Double.MAX_VALUE;
      long var7 = -1L;
      double var9 = (double)var1.getWidth() / var1.getHeight();
      Iterator var11 = var3.iterator();

      try {
         while (var11.hasNext()) {
            com.aspose.slides.internal.r7c.u3 var12 = (com.aspose.slides.internal.r7c.u3)var11.next();
            byte[] var13 = com.aspose.slides.ms.System.z3.s7(var12.a6().n5(1).k5());
            IImage var14 = Images.fromData(var13);

            try {
               double var15 = com.aspose.slides.ms.System.q1.n5((double)var14.getWidth() / var14.getHeight() - var9);
               long var17 = (long)var14.getWidth() * var14.getHeight();
               if (var15 < var5 || com.aspose.slides.ms.System.q1.n5(var15 - var5) < 1.0E-4 && var17 > var7) {
                  var4 = var13;
                  var5 = var15;
                  var7 = var17;
               }
            } finally {
               var14.dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            ((IDisposable)var11).dispose();
         }
      }

      return var4 == null ? null : n5(var4);
   }

   private static byte[] n5(byte[] var0) {
      IImage var1 = Images.fromData(var0);

      try {
         com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

         try {
            var1.save(var2.toOutputStream(), 6);
            return var2.toArray();
         } finally {
            var2.dispose();
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
