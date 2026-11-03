package com.aspose.slides.internal.d2a;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b7s.t2;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.c5q.u9;
import com.aspose.slides.internal.l9a.a6;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.t4;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import javax.imageio.IIOImage;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;

public class k5 extends ImageWriter {
   private final String n5 = "1d5be4b5-fa4a-452d-9cdd-5db35105e7eb";
   private t4 l6;

   public k5(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public void setOutput(Object output) {
      if (output instanceof t4) {
         this.l6 = (t4)output;
      } else if (this.l6 != null) {
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
      return new n5(new com.aspose.slides.internal.g7e.n5());
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
      if (this.l6 == null) {
         throw new InvalidOperationException("output == null!");
      }

      if (image == null) {
         throw new IllegalArgumentException("image == null!");
      }

      q0 var4 = null;
      y0 var5 = null;

      try {
         var4 = this.n5(image);
         this.n5(image.getRenderedImage(), var4.e5());
         var5 = new y0(this.l6);
         var5.n3();
         a6.n5(var4, var5.k5(), var4.z7(), var4.o0(), var4.w1(), var4.e5(), var4.x8());
      } finally {
         if (var5 != null) {
            com.aspose.slides.internal.n6h.a6.n5(var5);
         }

         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private q0 n5(IIOImage var1) {
      RenderedImage var2 = var1.getRenderedImage();
      IIOMetadata var3 = var1.getMetadata();
      com.aspose.slides.internal.l9a.u3 var4 = this.n5((BufferedImage)var2, var3);
      this.n5((BufferedImage)var2, var4);
      var4.n5(this.n5(var4, var2));
      return var4;
   }

   private com.aspose.slides.internal.l9a.u3 n5(BufferedImage var1, IIOMetadata var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      if (var2 != null && var2 instanceof n5) {
         com.aspose.slides.internal.g7e.n5 var6 = ((n5)var2).n5();
         return new com.aspose.slides.internal.l9a.u3(var6, var3, var4);
      } else {
         com.aspose.slides.internal.g7e.n5 var5 = new com.aspose.slides.internal.g7e.n5();
         var5.l6(this.n5(var1));
         return new com.aspose.slides.internal.l9a.u3(var5, var3, var4);
      }
   }

   private int n5(BufferedImage var1) {
      switch (var1.getType()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
            return 1;
         case 10:
         case 11:
            return 0;
         default:
            return 1;
      }
   }

   private void n5(BufferedImage var1, com.aspose.slides.internal.l9a.u3 var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      byte[] var5 = this.n5(var1, var2.e5());
      if (var5 != null) {
         var2.n5(var5);
      } else {
         int[] var6 = com.aspose.slides.internal.t2h.n5.n5(var1);
         var2.l6(new y2(0, 0, var3, var4), var6);
      }
   }

   private byte[] n5(BufferedImage var1, com.aspose.slides.internal.g7e.n5 var2) {
      com.aspose.slides.internal.c5q.a6 var3 = u9.n5(var1, var2);
      return var3 != null ? var3.n5(var1) : null;
   }

   private void n5(RenderedImage var1, com.aspose.slides.internal.g7e.n5 var2) {
      Object var3 = var1.getProperty("encoderParameters");
      if (!var3.equals(BufferedImage.UndefinedProperty)) {
         for (Object var7 : (Object[])var3) {
            Object[] var8 = (Object[])var7;
            if (var8[0].toString().equals("1d5be4b5-fa4a-452d-9cdd-5db35105e7eb")) {
               var2.k5((Integer)var8[1]);
            }
         }
      }
   }

   private t2 n5(q0 var1, RenderedImage var2) {
      t2 var3 = var1.z7();
      if (var3 == null) {
         var3 = new t2();
      }

      Object var4 = var2.getProperty("dpiX");
      Object var5 = var2.getProperty("dpiY");
      if (var4 != BufferedImage.UndefinedProperty) {
         var3.l6(((Float)var4).shortValue());
      }

      if (var5 != BufferedImage.UndefinedProperty) {
         var3.k5(((Float)var5).shortValue());
      }

      if (var4 != BufferedImage.UndefinedProperty || var5 != BufferedImage.UndefinedProperty) {
         var3.n5((byte)1);
      }

      return var3;
   }
}
