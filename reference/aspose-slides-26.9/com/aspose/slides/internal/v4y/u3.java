package com.aspose.slides.internal.v4y;

import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferUShort;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;

public class u3 extends ColorModel {
   public static final int[] n5 = new int[]{0, 1, 2, 3};

   public u3() {
      this(false);
   }

   protected u3(boolean var1) {
      super(64, new int[]{16, 16, 16, 16}, ColorSpace.getInstance(1000), true, var1, 1, 1);
   }

   @Override
   public WritableRaster createCompatibleWritableRaster(int width, int height) {
      PixelInterleavedSampleModel var3 = new PixelInterleavedSampleModel(1, width, height, 4, 4 * width, n5);
      DataBufferUShort var4 = new DataBufferUShort(width * height * 4);
      return Raster.createWritableRaster(var3, var4, null);
   }

   @Override
   public boolean isCompatibleRaster(Raster raster) {
      return true;
   }

   @Override
   public boolean isCompatibleSampleModel(SampleModel sm) {
      return sm instanceof PixelInterleavedSampleModel && sm.getNumBands() == 4;
   }

   @Override
   public int getRed(int pixel) {
      return 0;
   }

   @Override
   public int getGreen(int pixel) {
      return 0;
   }

   @Override
   public int getBlue(int pixel) {
      return 0;
   }

   @Override
   public int getAlpha(int pixel) {
      return 255;
   }

   @Override
   public int getAlpha(Object inData) {
      short[] var2 = (short[])inData;
      return this.n5(var2[3]);
   }

   @Override
   public int getRed(Object inData) {
      short[] var2 = (short[])inData;
      return com.aspose.slides.internal.t5g.u3.n5(var2[0] & 65535) & 0xFF;
   }

   @Override
   public int getGreen(Object inData) {
      short[] var2 = (short[])inData;
      return com.aspose.slides.internal.t5g.u3.n5(var2[1] & 65535) & 0xFF;
   }

   @Override
   public int getBlue(Object inData) {
      short[] var2 = (short[])inData;
      return com.aspose.slides.internal.t5g.u3.n5(var2[2] & 65535) & 0xFF;
   }

   @Override
   public Object getDataElements(int rgb, Object pixel) {
      Object var3 = null;
      if (pixel == null) {
         var3 = new short[4];
      } else {
         var3 = (short[])pixel;
      }

      byte var4 = (byte)(rgb >> 24 & 0xFF);
      byte var5 = (byte)(rgb >> 16 & 0xFF);
      byte var6 = (byte)(rgb >> 8 & 0xFF);
      byte var7 = (byte)(rgb & 0xFF);
      ((Object[])var3)[0] = this.l6(var5);
      ((Object[])var3)[1] = this.l6(var6);
      ((Object[])var3)[2] = this.l6(var7);
      ((Object[])var3)[3] = this.n5(var4);
      return var3;
   }

   @Override
   public WritableRaster getAlphaRaster(WritableRaster raster) {
      int var2 = raster.getMinX();
      int var3 = raster.getMinY();
      int[] var4 = new int[]{raster.getNumBands() - 1};
      return raster.createWritableChild(var2, var3, raster.getWidth(), raster.getHeight(), var2, var3, var4);
   }

   private int n5(byte var1, byte var2) {
      int var3 = (var1 & 255) * 255 + (var2 & 255);
      int var4 = 0;
      if (var3 >> 5 > 255) {
         var4 = com.aspose.slides.internal.t5g.u3.n5(var3) & 255;
      } else {
         var4 = var3 >> 5 & 0xFF;
      }

      return var4;
   }

   private int n5(short var1) {
      return this.n5((byte)(var1 >> 8 & 0xFF), (byte)(var1 & 0xFF));
   }

   private short n5(byte var1) {
      int var2 = (var1 & 255) << 5;
      return (short)((var2 / 255 & 0xFF) << 8 | var2 % 255 & 0xFF);
   }

   private short l6(byte var1) {
      int var2 = com.aspose.slides.internal.t5g.u3.n5(var1);
      return (short)(var2 & 65535);
   }
}
