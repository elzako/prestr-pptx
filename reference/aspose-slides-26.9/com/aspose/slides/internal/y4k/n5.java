package com.aspose.slides.internal.y4k;

import com.aspose.slides.internal.f7v.w2;
import com.aspose.slides.internal.p0s.l6;
import com.aspose.slides.internal.t5g.u3;
import com.sun.imageio.plugins.png.PNGImageWriter;
import com.sun.imageio.plugins.png.PNGMetadata;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import javax.imageio.IIOException;
import javax.imageio.IIOImage;
import javax.imageio.ImageWriteParam;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

public class n5 {
   private PNGImageWriter l6;
   ImageOutputStream n5 = null;

   public n5(ImageWriterSpi var1) {
      this.l6 = new PNGImageWriter(var1);
   }

   public void n5(Object var1) {
      this.l6.setOutput(var1);
      this.n5 = (ImageOutputStream)var1;
   }

   public void n5(IIOMetadata var1, IIOImage var2, ImageWriteParam var3) throws IIOException {
      BufferedImage var4 = (BufferedImage)var2.getRenderedImage();
      Object var5 = var4.getProperty("bitspPixel");
      int var6 = (Integer)(var5.equals(BufferedImage.UndefinedProperty) ? var4.getColorModel().getPixelSize() : var5);
      Object var7 = var4.getProperty("pixelFormat");
      int var8 = (Integer)(var7.equals(BufferedImage.UndefinedProperty) ? 0 : var7);
      IIOMetadata var9 = var2.getMetadata();
      if (var9 instanceof w2) {
         var9 = ((w2)var9).q0();
      }

      var4 = this.n5(var4, var6);
      if (var9 != null && var9 instanceof PNGMetadata) {
         PNGMetadata var10 = (PNGMetadata)var9;
         if (!(var4.getColorModel() instanceof IndexColorModel) && var4.getColorModel().getNumComponents() == 4) {
            if (var10.IHDR_present) {
               var10.IHDR_colorType = 6;
            }

            if (var10.bKGD_present) {
               var10.bKGD_colorType = 2;
            }

            if (var10.sBIT_present) {
               var10.sBIT_colorType = 6;
            }

            var10.sRGB_present = false;
            var10.PLTE_present = false;
            var10.tRNS_present = false;
            var10.pHYs_present = false;
         }
      }

      var9 = this.n5(var4, var9);
      var2 = new IIOImage(var4, var2.getThumbnails(), var9);
      this.l6.write(var1, var2, var3);
   }

   private IIOMetadata n5(BufferedImage var1, IIOMetadata var2) {
      try {
         float var3 = (Float)var1.getProperty("dpiX");
         float var4 = (Float)var1.getProperty("dpiY");
         double var5 = 2.54;
         double var7 = 1.0 * var3 / 10.0 / var5;
         double var9 = 1.0 * var4 / 10.0 / var5;
         IIOMetadataNode var11 = new IIOMetadataNode("HorizontalPixelSize");
         var11.setAttribute("value", Double.toString(var7));
         IIOMetadataNode var12 = new IIOMetadataNode("VerticalPixelSize");
         var12.setAttribute("value", Double.toString(var9));
         IIOMetadataNode var13 = new IIOMetadataNode("Dimension");
         var13.appendChild(var11);
         var13.appendChild(var12);
         IIOMetadataNode var14 = new IIOMetadataNode("javax_imageio_1.0");
         var14.appendChild(var13);
         if (var2 != null) {
            var2.mergeTree("javax_imageio_1.0", var14);
         } else {
            var2 = new PNGMetadata();
            var2.mergeTree("javax_imageio_1.0", var14);
         }
      } catch (Exception var15) {
         com.aspose.slides.internal.f8y.n5.k5("PNG dpi metadata was not saved");
      }

      return var2;
   }

   private BufferedImage n5(BufferedImage var1, int var2) {
      int var3 = (Integer)(var1.getProperty("pixelFormat").equals(BufferedImage.UndefinedProperty) ? 139273 : var1.getProperty("pixelFormat"));
      ColorModel var4 = var1.getColorModel();
      if (var2 != 16 && (var2 != 32 || var4.getNumColorComponents() != 3 || var3 != 139273) && var3 != 8207) {
         ColorSpace var5 = var4.getColorSpace();
         if (var5 instanceof l6) {
            ColorConvertOp var6 = new ColorConvertOp(var5, ColorSpace.getInstance(1004), null);
            var1 = var6.filter(var1, null);
         }

         return var1;
      } else {
         return u3.l6(var1);
      }
   }
}
