package com.aspose.slides.internal.m4d;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.z0k.t4;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.io.IOException;
import java.util.LinkedHashSet;
import javax.imageio.IIOImage;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;

public class u3 extends ImageWriter {
   private t4 n5 = null;
   private boolean l6 = false;
   private boolean k5 = false;
   private a0 u3;

   public u3(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public void setOutput(Object output) {
      if (output instanceof t4) {
         this.n5 = (t4)output;
      }
   }

   @Override
   public void reset() {
      this.l6 = false;
      this.k5 = false;
      this.n5 = null;
   }

   @Override
   public void dispose() {
      if (this.u3 != null) {
         this.u3.dispose();
         this.u3 = null;
      }
   }

   @Override
   public boolean canWriteSequence() {
      return true;
   }

   @Override
   public void prepareWriteSequence(IIOMetadata streamMetadata) throws IOException {
      this.l6 = true;
      this.k5 = true;
      this.u3 = new a0(this.n5);
   }

   @Override
   public void writeToSequence(IIOImage iioimage, ImageWriteParam param) throws IOException {
      if (this.n5 == null) {
         throw new InvalidOperationException("output == null!");
      }

      if (iioimage == null) {
         throw new IllegalArgumentException("image == null!");
      }

      if (iioimage.hasRaster()) {
         throw new NotSupportedException("canWriteRasters() == false!");
      }

      if (!this.l6) {
         throw new InvalidOperationException("prepareWriteSequence() was not invoked!");
      }

      RenderedImage var3 = iioimage.getRenderedImage();
      l6 var4 = com.aspose.slides.internal.v6g.k5.n5(iioimage.getMetadata(), l6.class);
      this.n5(this.u3, var3, var4, this.k5, false);
      this.k5 = false;
   }

   @Override
   public void endWriteSequence() throws IOException {
      this.n5(this.u3);
      if (this.u3 != null) {
         this.u3.dispose();
      }

      this.l6 = false;
   }

   @Override
   public IIOMetadata getDefaultStreamMetadata(ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier imageType, ImageWriteParam param) {
      return new l6();
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
   public void write(IIOMetadata streamMetadata, IIOImage iioimage, ImageWriteParam param) throws IOException {
      if (this.n5 == null) {
         throw new InvalidOperationException("output == null!");
      }

      if (iioimage == null) {
         throw new IllegalArgumentException("iioimage == null!");
      }

      if (iioimage.hasRaster()) {
         throw new NotSupportedException("canWriteRasters() == false!");
      }

      RenderedImage var4 = iioimage.getRenderedImage();
      l6 var5 = com.aspose.slides.internal.v6g.k5.n5(iioimage.getMetadata(), l6.class);
      if (this.n5(var5)) {
         byte[] var6 = var5.u3();
         this.n5.write(var6, 0, var6.length);
         this.n5.flush();
      } else {
         a0 var10 = new a0(this.n5);

         try {
            this.n5(var10, var4, null, true, true);
         } finally {
            var10.dispose();
         }
      }
   }

   private boolean n5(l6 var1) {
      return var1 != null && !var1.a6();
   }

   private void n5(a0 var1, RenderedImage var2, l6 var3, boolean var4, boolean var5) throws IOException {
      if (this.l6(var2)) {
         var2 = this.n5((BufferedImage)var2);
      }

      com.aspose.slides.internal.j3b.u3 var6 = this.n5(var2, var3);
      if (var4) {
         this.n5(var2, var3, var6, var1);
         this.n5(var6, var1);
         this.l6(var3);
      }

      this.l6(var2, var3, var6, var1);
      if (var5) {
         this.n5(var1);
      }
   }

   private RenderedImage n5(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      LinkedHashSet var4 = new LinkedHashSet();

      for (int var5 = 0; var5 < var3; var5++) {
         for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var1.getRGB(var6, var5);
            var4.add(var7);
         }
      }

      if (var4.size() > 256) {
         return u9.n5(var1);
      }

      byte[] var14 = new byte[var4.size()];
      byte[] var15 = new byte[var4.size()];
      byte[] var16 = new byte[var4.size()];
      byte[] var8 = new byte[var4.size()];
      int var9 = 0;

      for (Object recoveredElement$var11$5191 : var4) {
         Integer var11 = (Integer)recoveredElement$var11$5191;
         var14[var9] = (byte)(var11 >> 24 & 0xFF);
         var15[var9] = (byte)(var11 >> 16 & 0xFF);
         var16[var9] = (byte)(var11 >> 8 & 0xFF);
         var8[var9] = (byte)(var11 >> 0 & 0xFF);
         var9++;
      }

      IndexColorModel var17 = new IndexColorModel(8, var4.size(), var15, var16, var8, var14);
      BufferedImage var18 = new BufferedImage(var1.getWidth(), var1.getHeight(), 13, var17);

      for (int var12 = 0; var12 < var1.getHeight(); var12++) {
         for (int var13 = 0; var13 < var1.getWidth(); var13++) {
            var18.setRGB(var13, var12, var1.getRGB(var13, var12));
         }
      }

      return var18;
   }

   private com.aspose.slides.internal.j3b.u3 n5(RenderedImage var1, l6 var2) {
      com.aspose.slides.internal.j3b.u3 var3 = null;
      if (var2 != null) {
         var3 = var2.n5().y4();
      } else {
         IndexColorModel var4 = (IndexColorModel)var1.getColorModel();
         int[] var5 = new int[var4.getMapSize()];

         for (int var6 = 0; var6 < var5.length; var6++) {
            int var7 = var4.getAlpha(var6);
            int var8 = var4.getRed(var6);
            int var9 = var4.getGreen(var6);
            int var10 = var4.getBlue(var6);
            var5[var6] = com.aspose.slides.internal.y5s.u9.n5(new Color(var8, var9, var10, var7));
         }

         var3 = new com.aspose.slides.internal.y5s.h0(var5);
      }

      u3$n5 var12 = new u3$n5((byte)0, var3).k5();
      return var12.l6();
   }

   private byte n5(RenderedImage var1) {
      IndexColorModel var2 = (IndexColorModel)var1.getColorModel();
      return (byte)var2.getTransparentPixel();
   }

   private byte n5(com.aspose.slides.internal.j3b.u3 var1) {
      u3$n5 var2 = new u3$n5((byte)0, var1).k5();
      return var2.n5();
   }

   private void n5(RenderedImage var1, l6 var2, com.aspose.slides.internal.j3b.u3 var3, a0 var4) {
      com.aspose.slides.internal.e2l.u3 var5 = var2 != null ? var2.l6() : null;
      if (var5 == null) {
         byte var6;
         if (var3 == null) {
            var6 = com.aspose.slides.internal.e2l.u3.n5(0, false, false, (byte)0);
         } else {
            var6 = com.aspose.slides.internal.e2l.u3.n5(var3.n5(), true, false, (byte)0);
         }

         var5 = new com.aspose.slides.internal.e2l.u3(var1.getWidth(), var1.getHeight(), var6, (byte)-1, (byte)0);
      }

      var5.n5(var4);
   }

   private void n5(com.aspose.slides.internal.j3b.u3 var1, a0 var2) {
      if (var1 != null) {
         com.aspose.slides.internal.e2l.a6.n5(var2, var1);
      }
   }

   private void l6(RenderedImage var1, l6 var2, com.aspose.slides.internal.j3b.u3 var3, a0 var4) throws IOException {
      if (var2 != null) {
         com.aspose.slides.internal.v2x.k5 var5 = var2.k5();
         com.aspose.slides.internal.v2x.u3 var6 = var5.j5();
         if (var6 != null) {
            var6.n5(var4.l6());
         }

         var5.n5(var4.l6());
      } else {
         byte var12 = this.n5(var1);
         com.aspose.slides.internal.v2x.u3 var13 = new com.aspose.slides.internal.v2x.u3(0, var12 != -1, var12, false, var12 >= 0 ? 2 : 0);
         var13.n5(var4.l6());
         int[] var7 = com.aspose.slides.internal.t2h.n5.n5((BufferedImage)var1);
         com.aspose.slides.internal.v2x.k5 var8 = null;

         try {
            var8 = new com.aspose.slides.internal.v2x.k5(var1.getMinX(), var1.getMinY(), var1.getWidth(), var1.getHeight(), var3, false, false, this.n5(var3));
            var8.k5(var8.s7(), var7);
            var8.n5(var4.l6());
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      }
   }

   private void l6(l6 var1) {
      if (var1 != null) {
         com.aspose.slides.internal.e2l.h0[] var2 = var1.n5().q0();

         for (com.aspose.slides.internal.e2l.h0 var6 : var2) {
            if (!(var6 instanceof com.aspose.slides.internal.v2x.u3) && !(var6 instanceof com.aspose.slides.internal.v2x.k5)) {
               var6.n5(this.u3.l6());
            }
         }
      }
   }

   private void n5(a0 var1) {
      var1.n5((byte)59);
      var1.l6(var1.n5());
   }

   private boolean l6(RenderedImage var1) {
      SampleModel var2 = var1.getSampleModel();
      ColorModel var3 = var1.getColorModel();
      return var2.getNumBands() != 1 || var2.getSampleSize()[0] > 8 || var3.getComponentSize()[0] > 8;
   }
}
