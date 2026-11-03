package com.aspose.slides.internal.v4y;

import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;

public class k5 extends ColorModel {
   public static final int[] n5 = new int[]{0, 1, 2};
   private final boolean l6;
   private final int[] k5 = new int[]{255, 255, 255};
   private final int[] u3 = new int[]{16, 8, 0};

   private k5(int var1, ColorSpace var2) {
      super(48, new int[]{16, 16, 16, 0}, var2, false, false, 1, var1);
      this.l6 = !var2.isCS_sRGB();
      this.n5();
   }

   public k5() {
      this(1);
   }

   public k5(int var1) {
      this(var1, ColorSpace.getInstance(1000));
   }

   private void n5() {
      if (this.getTransferType() != 1 && this.getTransferType() != 2 && this.getTransferType() != 0) {
         throw new IllegalArgumentException("Not supported data type: " + this.getTransferType());
      }
   }

   @Override
   public SampleModel createCompatibleSampleModel(int width, int height) {
      if (this.getTransferType() == 1) {
         return new PixelInterleavedSampleModel(1, width, height, 3, 3 * width, n5);
      } else if (this.getTransferType() == 2) {
         return new PixelInterleavedSampleModel(2, width, height, 3, 3 * width, n5);
      } else {
         throw new IllegalArgumentException("Not supported data type: " + this.getTransferType());
      }
   }

   @Override
   public WritableRaster createCompatibleWritableRaster(int width, int height) {
      DataBuffer var3 = null;
      if (this.getTransferType() == 1) {
         var3 = new DataBufferUShort(width * height * 3);
      } else {
         if (this.getTransferType() != 2) {
            throw new IllegalArgumentException("Not supported data type: " + this.getTransferType());
         }

         var3 = new DataBufferShort(width * height * 3);
      }

      SampleModel var4 = this.createCompatibleSampleModel(width, height);
      return Raster.createWritableRaster(var4, var3, null);
   }

   @Override
   public boolean isCompatibleRaster(Raster raster) {
      return true;
   }

   @Override
   public boolean isCompatibleSampleModel(SampleModel sm) {
      return sm instanceof PixelInterleavedSampleModel && sm.getNumBands() == 3;
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
      return 255;
   }

   @Override
   public int getRed(Object inData) {
      return this.n5(inData, 0);
   }

   @Override
   public int getGreen(Object inData) {
      return this.n5(inData, 1);
   }

   @Override
   public int getBlue(Object inData) {
      return this.n5(inData, 2);
   }

   private int n5(Object var1, int var2) {
      if (var1 instanceof byte[]) {
         return this.n5((byte[])var1, var2);
      } else if (var1 instanceof short[]) {
         return this.n5((short[])var1, var2);
      } else {
         throw new IllegalArgumentException("Not supported data type: " + var1.getClass().getSimpleName());
      }
   }

   private int n5(byte[] var1, int var2) {
      int var3 = var2 * 2;
      int var4 = var1[var3] & 255;
      int var5 = var1[var3 + 1] & 255;
      int var6 = (var4 << 8 | var5) & 65535;
      return this.n5(com.aspose.slides.internal.t5g.u3.n5(var6), var2);
   }

   private int n5(short[] var1, int var2) {
      return this.n5(com.aspose.slides.internal.t5g.u3.n5(var1[var2] & 65535), var2);
   }

   private int n5(byte var1, int var2) {
      int var3 = var1 & 255;
      if (!this.l6) {
         return var3;
      }

      int var4 = var3 << this.u3[var2];
      float[] var5 = this.getNormalizedComponents(var4, null, 0);
      float[] var6 = this.getColorSpace().toRGB(var5);
      return (int)(var6[var2] * 255.0F + 0.5F);
   }

   @Override
   public Object getDataElements(int rgb, Object pixel) {
      Object var3 = null;
      if (pixel == null) {
         var3 = new short[3];
      } else {
         var3 = (short[])pixel;
      }

      byte var4 = (byte)(rgb >> 16 & 0xFF);
      byte var5 = (byte)(rgb >> 8 & 0xFF);
      byte var6 = (byte)(rgb & 0xFF);
      ((Object[])var3)[0] = this.n5(var4);
      ((Object[])var3)[1] = this.n5(var5);
      ((Object[])var3)[2] = this.n5(var6);
      return var3;
   }

   @Override
   public final int[] getComponents(Object pixel, int[] components, int offset) {
      int var4 = (Integer)pixel;
      return this.getComponents(var4, components, offset);
   }

   @Override
   public final int[] getComponents(int pixel, int[] components, int offset) {
      byte var4 = 3;
      if (components == null) {
         components = new int[offset + var4];
      }

      for (int var5 = 0; var5 < var4; var5++) {
         components[offset + var5] = pixel >>> this.u3[var5] & this.k5[var5];
      }

      return components;
   }

   @Override
   public float[] getNormalizedComponents(int[] components, int offset, float[] normComponents, int normOffset) {
      if (this.getColorSpace() == null) {
         throw new UnsupportedOperationException("This method is not supported by this color model.");
      }

      if (components.length - offset < this.getNumComponents()) {
         throw new IllegalArgumentException("Incorrect number of components.  Expecting " + this.getNumComponents());
      }

      if (normComponents == null) {
         normComponents = new float[this.getNumComponents() + normOffset];
      }

      int[] var5 = new int[]{8, 8, 8};

      for (int var6 = 0; var6 < this.getNumComponents(); var6++) {
         normComponents[normOffset + var6] = (float)components[offset + var6] / ((1 << var5[var6]) - 1);
      }

      return normComponents;
   }

   private short n5(byte var1) {
      int var2 = com.aspose.slides.internal.t5g.u3.n5(var1);
      return (short)(var2 & 65535);
   }
}
