package com.aspose.slides.internal.t2h;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class n5 {
   public static int[] n5(BufferedImage var0) {
      WritableRaster var1 = var0.getRaster();
      int var2 = var0.getHeight();
      int var3 = var0.getWidth();
      int[] var4 = new int[var3 * var2];
      switch (var0.getType()) {
         case 0:
         case 3:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
            n5(var0, var4);
            break;
         case 1:
            n5(var1, var4);
            break;
         case 2:
            l6(var1, var4);
            break;
         case 4:
            k5(var1, var4);
            break;
         case 5:
            u3(var1, var4);
            break;
         case 6:
            a6(var1, var4);
            break;
         default:
            throw new IllegalArgumentException(String.format("Unexpected image type %s", var0.getType()));
      }

      return var4;
   }

   public static int[] n5(BufferedImage var0, int var1, int[] var2) {
      WritableRaster var3 = var0.getRaster();
      int var4 = var0.getWidth();
      if (var2 == null || var2.length < var4) {
         var2 = new int[var4];
      }

      switch (var0.getType()) {
         case 0:
         case 3:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
            l6(var0, var1, var2);
            break;
         case 1:
            n5(var3, var1, var2);
            break;
         case 2:
            l6(var3, var1, var2);
            break;
         case 4:
            k5(var3, var1, var2);
            break;
         case 5:
            u3(var3, var1, var2);
            break;
         case 6:
            a6(var3, var1, var2);
            break;
         default:
            throw new IllegalArgumentException(String.format("Unexpected image type %s", var0.getType()));
      }

      return var2;
   }

   private static void n5(BufferedImage var0, int[] var1) {
      ColorModel var2 = var0.getColorModel();
      WritableRaster var3 = var0.getRaster();
      Object var4 = n5(var3);
      int var5 = 0;
      int var6 = var3.getWidth();
      int var7 = var3.getHeight();

      for (int var8 = 0; var8 < var7; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            int var10 = var2.getRGB(var3.getDataElements(var9, var8, var4));
            var1[var5++] = var10;
         }
      }
   }

   private static void l6(BufferedImage var0, int var1, int[] var2) {
      ColorModel var3 = var0.getColorModel();
      WritableRaster var4 = var0.getRaster();
      Object var5 = n5(var4);
      int var6 = var4.getWidth();

      for (int var7 = 0; var7 < var6; var7++) {
         int var8 = var3.getRGB(var4.getDataElements(var7, var1, var5));
         var2[var7] = var8;
      }
   }

   private static void n5(Raster var0, int[] var1) {
      DataBufferInt var2 = (DataBufferInt)var0.getDataBuffer();
      int[] var3 = var2.getData();

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = var3[var4];
         int var6 = var5 >> 16 & 0xFF;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 0xFF000000 | var6 << 16 | var7 << 8 | var8;
         var1[var4] = var9;
      }
   }

   private static void n5(Raster var0, int var1, int[] var2) {
      DataBufferInt var3 = (DataBufferInt)var0.getDataBuffer();
      int[] var4 = var3.getData();
      int var5 = var0.getWidth();
      int var6 = var1 * var5;

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var4[var6++];
         int var9 = var8 >> 16 & 0xFF;
         int var10 = var8 >> 8 & 0xFF;
         int var11 = var8 & 0xFF;
         int var12 = 0xFF000000 | var9 << 16 | var10 << 8 | var11;
         var2[var7] = var12;
      }
   }

   private static void l6(Raster var0, int[] var1) {
      DataBufferInt var2 = (DataBufferInt)var0.getDataBuffer();
      int[] var3 = var2.getData();
      System.arraycopy(var3, 0, var1, 0, var1.length);
   }

   private static void l6(Raster var0, int var1, int[] var2) {
      int var3 = var0.getWidth();
      DataBufferInt var4 = (DataBufferInt)var0.getDataBuffer();
      int[] var5 = var4.getData();
      System.arraycopy(var5, var1 * var3, var2, 0, var2.length);
   }

   private static void k5(Raster var0, int[] var1) {
      DataBufferInt var2 = (DataBufferInt)var0.getDataBuffer();
      int[] var3 = var2.getData();

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = var3[var4];
         int var6 = var5 >> 16 & 0xFF;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 0xFF000000 | var8 << 16 | var7 << 8 | var6;
         var1[var4] = var9;
      }
   }

   private static void k5(Raster var0, int var1, int[] var2) {
      DataBufferInt var3 = (DataBufferInt)var0.getDataBuffer();
      int[] var4 = var3.getData();
      int var5 = var0.getWidth();
      int var6 = var1 * var5;

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var4[var6++];
         int var9 = var8 >> 16 & 0xFF;
         int var10 = var8 >> 8 & 0xFF;
         int var11 = var8 & 0xFF;
         int var12 = 0xFF000000 | var11 << 16 | var10 << 8 | var9;
         var2[var7] = var12;
      }
   }

   private static void u3(Raster var0, int[] var1) {
      DataBufferByte var2 = (DataBufferByte)var0.getDataBuffer();
      byte[] var3 = var2.getData();
      int var4 = var0.getWidth();
      int var5 = var0.getHeight();
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var5; var8++) {
         for (int var9 = 0; var9 < var4; var9++) {
            int var10 = var3[var6++] & 255;
            int var11 = var3[var6++] & 255;
            int var12 = var3[var6++] & 255;
            int var13 = 0xFF000000 | var12 << 16 | var11 << 8 | var10;
            var1[var7++] = var13;
         }
      }
   }

   private static void u3(Raster var0, int var1, int[] var2) {
      DataBufferByte var3 = (DataBufferByte)var0.getDataBuffer();
      byte[] var4 = var3.getData();
      int var5 = var0.getWidth();
      int var6 = var1 * var5 * 3;

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var4[var6++] & 255;
         int var9 = var4[var6++] & 255;
         int var10 = var4[var6++] & 255;
         int var11 = 0xFF000000 | var10 << 16 | var9 << 8 | var8;
         var2[var7] = var11;
      }
   }

   private static void a6(Raster var0, int[] var1) {
      DataBufferByte var2 = (DataBufferByte)var0.getDataBuffer();
      byte[] var3 = var2.getData();
      int var4 = var0.getWidth();
      int var5 = var0.getHeight();
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var5; var8++) {
         for (int var9 = 0; var9 < var4; var9++) {
            int var10 = var3[var6++] & 255;
            int var11 = var3[var6++] & 255;
            int var12 = var3[var6++] & 255;
            int var13 = var3[var6++] & 255;
            int var14 = var10 << 24 | var13 << 16 | var12 << 8 | var11;
            var1[var7++] = var14;
         }
      }
   }

   private static void a6(Raster var0, int var1, int[] var2) {
      DataBufferByte var3 = (DataBufferByte)var0.getDataBuffer();
      byte[] var4 = var3.getData();
      int var5 = var0.getWidth();
      int var6 = var1 * var5 * 4;

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var4[var6++] & 255;
         int var9 = var4[var6++] & 255;
         int var10 = var4[var6++] & 255;
         int var11 = var4[var6++] & 255;
         int var12 = var8 << 24 | var11 << 16 | var10 << 8 | var9;
         var2[var7] = var12;
      }
   }

   public static void n5(int[] var0, BufferedImage var1) {
      WritableRaster var2 = var1.getRaster();
      int var3 = var1.getHeight();
      int var4 = var1.getWidth();
      switch (var1.getType()) {
         case 0:
         case 3:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
            n5(var1, var4, var3, var0);
            break;
         case 1:
         case 2:
            u9(var2, var0);
            break;
         case 4:
            h0(var2, var0);
            break;
         case 5:
            n5(var2, var4, var3, var0);
            break;
         case 6:
            l6(var2, var4, var3, var0);
            break;
         default:
            throw new IllegalArgumentException(String.format("Unexpected image type %s", var1.getType()));
      }
   }

   private static void n5(BufferedImage var0, int var1, int var2, int[] var3) {
      ColorModel var4 = var0.getColorModel();
      WritableRaster var5 = var0.getRaster();
      Object var6 = n5(var5);
      int var7 = 0;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var1; var9++) {
            int var10 = var3[var7++];
            var5.setDataElements(var9, var8, var4.getDataElements(var10, var6));
         }
      }
   }

   private static void u9(Raster var0, int[] var1) {
      DataBufferInt var2 = (DataBufferInt)var0.getDataBuffer();
      int[] var3 = var2.getData();
      System.arraycopy(var1, 0, var3, 0, var1.length);
   }

   private static void h0(Raster var0, int[] var1) {
      DataBufferInt var2 = (DataBufferInt)var0.getDataBuffer();
      int[] var3 = var2.getData();

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = var1[var4];
         int var6 = var5 >> 16 & 0xFF;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 0xFF000000 | var8 << 16 | var7 << 8 | var6;
         var3[var4] = var9;
      }
   }

   private static void n5(Raster var0, int var1, int var2, int[] var3) {
      DataBufferByte var4 = (DataBufferByte)var0.getDataBuffer();
      byte[] var5 = var4.getData();
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var1; var9++) {
            int var10 = var3[var6++];
            byte var11 = (byte)(var10 >> 16 & 0xFF);
            byte var12 = (byte)(var10 >> 8 & 0xFF);
            byte var13 = (byte)(var10 & 0xFF);
            var5[var7++] = var13;
            var5[var7++] = var12;
            var5[var7++] = var11;
         }
      }
   }

   private static void l6(Raster var0, int var1, int var2, int[] var3) {
      DataBufferByte var4 = (DataBufferByte)var0.getDataBuffer();
      byte[] var5 = var4.getData();
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var1; var9++) {
            int var10 = var3[var6++];
            byte var11 = (byte)(var10 >> 24 & 0xFF);
            byte var12 = (byte)(var10 >> 16 & 0xFF);
            byte var13 = (byte)(var10 >> 8 & 0xFF);
            byte var14 = (byte)(var10 & 0xFF);
            var5[var7++] = var11;
            var5[var7++] = var14;
            var5[var7++] = var13;
            var5[var7++] = var12;
         }
      }
   }

   public static Object n5(Raster var0) {
      int var1 = var0.getDataBuffer().getDataType();
      switch (var1) {
         case 0:
            return new byte[var0.getNumBands()];
         case 1:
            return new short[var0.getNumBands()];
         case 2:
         default:
            throw new IllegalArgumentException("Unknown data buffer type: " + var1);
         case 3:
            return new int[var0.getNumBands()];
         case 4:
            return new float[var0.getNumBands()];
         case 5:
            return new double[var0.getNumBands()];
      }
   }
}
