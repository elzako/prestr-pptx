package com.aspose.slides.internal.e4w;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.y5s.h0;
import com.aspose.slides.internal.y5s.r4;
import com.aspose.slides.internal.z0k.t4;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.io.IOException;
import javax.imageio.IIOImage;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.MemoryCacheImageOutputStream;

public class n5 extends ImageWriter {
   private t4 n5 = null;
   private int l6;
   private int k5;

   public n5(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public void setOutput(Object output) {
      if (output instanceof t4) {
         this.n5 = (t4)output;
      } else if (output != null) {
         throw new IllegalArgumentException("Illegal output type!");
      }
   }

   @Override
   public void dispose() {
   }

   @Override
   public IIOMetadata getDefaultStreamMetadata(ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier imageType, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertStreamMetadata(IIOMetadata inData, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertImageMetadata(IIOMetadata inData, ImageTypeSpecifier imageType, ImageWriteParam param) {
      return null;
   }

   @Override
   public void write(IIOMetadata streamMetadata, IIOImage image, ImageWriteParam param) throws IOException {
      if (this.n5 == null) {
         throw new InvalidOperationException("output == null!");
      }

      if (image == null) {
         throw new IllegalArgumentException("image == null!");
      }

      BufferedImage var4 = (BufferedImage)image.getRenderedImage();
      this.k5 = (Integer)(
         var4.getProperty("bitspPixel").equals(BufferedImage.UndefinedProperty) ? var4.getColorModel().getPixelSize() : var4.getProperty("bitspPixel")
      );
      this.l6 = (Integer)(var4.getProperty("pixelFormat").equals(BufferedImage.UndefinedProperty) ? 139273 : var4.getProperty("pixelFormat"));
      if (this.k5 != 48 && this.k5 != 64) {
         var4 = this.n5(var4);
         this.n5(var4, image.getMetadata());
      } else {
         this.n5(streamMetadata, image, param);
      }
   }

   private void n5(BufferedImage var1, IIOMetadata var2) {
      com.aspose.slides.internal.l4o.l6 var3 = null;

      try {
         var3 = new com.aspose.slides.internal.l4o.l6(var1.getWidth(), var1.getHeight());
         com.aspose.slides.internal.d7u.n5 var4 = this.l6(var1, var2);
         var3.n5(var4.n5());
         var3.n5(var1.getColorModel().hasAlpha());
         if (var1.getType() == 6) {
            var3.n5(new k5(var1, var4));
         } else if (var1.getType() == 5) {
            var3.n5(new l6(var1, var4));
         } else if (var1.getColorModel() instanceof IndexColorModel && this.k5 >= 8) {
            var3.n5(new u3(var1, var4));
         } else {
            var3.l6(var3.s7(), com.aspose.slides.internal.t2h.n5.n5(var1));
         }

         com.aspose.slides.internal.l4o.l6.n5(this.n5, var3, var4);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private com.aspose.slides.internal.d7u.n5 l6(BufferedImage var1, IIOMetadata var2) {
      com.aspose.slides.internal.d7u.n5 var3 = new com.aspose.slides.internal.d7u.n5();
      var3.l6(1);
      if (var1.getColorModel() instanceof IndexColorModel) {
         var3.n5(3);
         var3.n5((byte)var1.getColorModel().getPixelSize());
         IndexColorModel var4 = (IndexColorModel)var1.getColorModel();
         int[] var5 = new int[var4.getMapSize()];
         var4.getRGBs(var5);
         var3.n5(new h0(var5));
      } else if (!var1.getColorModel().hasAlpha()) {
         var3.n5(2);
         var3.n5((byte)var1.getColorModel().getComponentSize(0));
      } else {
         var3.n5(6);
         var3.n5((byte)var1.getColorModel().getComponentSize(0));
      }

      r4 var7 = new r4();
      Object var8 = var1.getProperty("dpiX");
      Object var6 = var1.getProperty("dpiY");
      if (var8 != BufferedImage.UndefinedProperty) {
         var7.n5(((Number)var8).doubleValue());
      }

      if (var6 != BufferedImage.UndefinedProperty) {
         var7.l6(((Number)var6).doubleValue());
      }

      if (var7.n5() != 0.0 || var7.l6() != 0.0) {
         var3.n5(var7);
      }

      return var3;
   }

   private BufferedImage n5(BufferedImage var1) {
      return this.l6(var1) ? com.aspose.slides.internal.t5g.u3.k5(var1) : var1;
   }

   private boolean l6(BufferedImage var1) {
      return this.k5 == 16 || this.k5 == 32 && var1.getColorModel().getNumColorComponents() == 3 && this.l6 == 139273 || this.l6 == 8207;
   }

   private void n5(IIOMetadata var1, IIOImage var2, ImageWriteParam var3) throws IOException {
      MemoryCacheImageOutputStream var4 = new MemoryCacheImageOutputStream(this.n5.toOutputStream());
      com.aspose.slides.internal.y4k.n5 var5 = new com.aspose.slides.internal.y4k.n5(this.originatingProvider);
      var5.n5(var4);
      var5.n5(var1, var2, var3);
      var4.flush();
   }
}
