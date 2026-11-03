package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class a6 {
   public static void n5(BufferedImage var0, ImageOutputStream var1) throws IOException {
      n5(var0, -1, var1);
   }

   public static void n5(List<BufferedImage> var0, ImageOutputStream var1) throws IOException {
      n5(var0, null, null, var1);
   }

   public static void n5(BufferedImage var0, int var1, ImageOutputStream var2) throws IOException {
      ArrayList var3 = new ArrayList(1);
      var3.add(var0);
      n5(var3, new int[]{var1}, new boolean[]{false}, var2);
   }

   public static void n5(List<BufferedImage> var0, int[] var1, boolean[] var2, ImageOutputStream var3) throws IOException {
      int var4 = var0.size();
      n5(var4, 1, var3);
      int var5 = 6 + var4 * 16;
      ArrayList var6 = new ArrayList(var4);
      ArrayList var7 = new ArrayList(var4);
      ArrayList var8 = null;
      if (var2 != null) {
         var8 = new ArrayList(var4);
      }

      ImageWriter var9 = null;

      for (int var10 = 0; var10 < var4; var10++) {
         BufferedImage var11 = (BufferedImage)var0.get(var10);
         int var12 = var1 == null ? -1 : var1[var10];
         BufferedImage var13 = var12 == -1 ? var11 : n5(var11, var12);
         var7.add(var13);
         k5 var14 = l6.n5(var13, 0, 0);
         c8 var15 = n5(var14);
         if (var2 != null) {
            if (var2[var10]) {
               if (var9 == null) {
                  var9 = n5();
               }

               byte[] var16 = n5(var9, var13);
               var8.add(var16);
               var15.h0 = var16.length;
            } else {
               var8.add(null);
            }
         }

         var14.k5 *= 2;
         var15.c8 = var5;
         var5 += var15.h0;
         var15.n5(var3);
         var6.add(var14);
      }

      for (int var17 = 0; var17 < var4; var17++) {
         BufferedImage var18 = (BufferedImage)var0.get(var17);
         BufferedImage var19 = (BufferedImage)var7.get(var17);
         if (var2 != null && var2[var17]) {
            byte[] var21 = (byte[])var8.get(var17);
            var3.write(var21);
         } else {
            k5 var20 = (k5)var6.get(var17);
            var20.n5(var3);
            if (var20.a6 <= 8) {
               IndexColorModel var22 = (IndexColorModel)var19.getColorModel();
               l6.n5(var22, var3);
            }

            n5(var19, var20, var3);
            l6(var18, var1 == null ? var20.a6 : var1[var17], var3);
         }
      }

      var3.flush();
   }

   public static void n5(int var0, int var1, ImageOutputStream var2) throws IOException {
      var2.writeShort(0);
      var2.writeShort((short)var1);
      var2.writeShort((short)var0);
   }

   public static c8 n5(k5 var0) {
      c8 var1 = new c8();
      var1.n5 = var0.l6 == 256 ? 0 : var0.l6;
      var1.l6 = var0.k5 == 256 ? 0 : var0.k5;
      var1.k5 = var0.n3 >= 256 ? 0 : var0.n3;
      var1.u3 = 0;
      var1.a6 = 1;
      var1.u9 = var0.a6;
      int var2 = var0.a6 <= 8 ? (1 << var0.a6) * 4 : 0;
      int var3 = l6.n5(var0.l6, var0.k5, var0.a6);
      int var4 = l6.n5(var0.l6, var0.k5, 1);
      var1.h0 = var0.n5 + var2 + var3 + var4;
      var1.c8 = 0;
      return var1;
   }

   public static void l6(BufferedImage var0, int var1, ImageOutputStream var2) throws IOException {
      WritableRaster var3 = var0.getAlphaRaster();
      if (var0.getColorModel() instanceof IndexColorModel && var0.getColorModel().hasAlpha()) {
         int var18 = var0.getWidth();
         int var20 = var0.getHeight();
         int var22 = l6.n5(var18, var1);
         byte[] var24 = new byte[var22];
         IndexColorModel var27 = (IndexColorModel)var0.getColorModel();
         WritableRaster var28 = var0.getRaster();

         for (int var29 = var20 - 1; var29 >= 0; var29--) {
            for (int var30 = 0; var30 < var18; var30++) {
               int var31 = var30 / 8;
               int var32 = var30 % 8;
               int var14 = var28.getSample(var30, var29, 0);
               int var15 = var27.getAlpha(var14);
               int var16 = ~var15 & 1;
               var24[var31] = n5(var24[var31], var32, var16);
            }

            var2.write(var24);
         }
      } else if (var3 == null) {
         int var4 = var0.getHeight();
         int var5 = var0.getWidth();
         int var6 = l6.n5(var5, var1);
         byte[] var7 = new byte[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            var7[var8] = 0;
         }

         for (int var25 = var4 - 1; var25 >= 0; var25--) {
            var2.write(var7);
         }
      } else {
         int var17 = var0.getWidth();
         int var19 = var0.getHeight();
         int var21 = l6.n5(var17, 1);
         byte[] var23 = new byte[var21];

         for (int var26 = var19 - 1; var26 >= 0; var26--) {
            for (int var9 = 0; var9 < var17; var9++) {
               int var10 = var9 / 8;
               int var11 = var9 % 8;
               int var12 = var3.getSample(var9, var26, 0);
               int var13 = ~var12 & 1;
               var23[var10] = n5(var23[var10], var11, var13);
            }

            var2.write(var23);
         }
      }

      var2.flush();
   }

   private static byte n5(byte var0, int var1, int var2) {
      int var3 = 1 << 7 - var1;
      var0 = (byte)(var0 & ~var3);
      return (byte)(var0 | var2 << 7 - var1);
   }

   private static void n5(BufferedImage var0, k5 var1, ImageOutputStream var2) throws IOException {
      WritableRaster var3 = var0.getRaster();
      switch (var1.a6) {
         case 1:
            l6.n5(var3, var2);
            break;
         case 4:
            l6.l6(var3, var2);
            break;
         case 8:
            l6.k5(var3, var2);
            break;
         case 24:
            l6.u3(var3, var2);
            break;
         case 32:
            WritableRaster var4 = var0.getAlphaRaster();
            l6.n5(var3, var4, var2);
      }
   }

   public static BufferedImage n5(BufferedImage var0, int var1) {
      BufferedImage var2 = null;
      switch (var1) {
         case 1:
            var2 = a6$n5.n5(var0);
            break;
         case 4:
            var2 = a6$n5.l6(var0);
            break;
         case 8:
            var2 = a6$n5.k5(var0);
            break;
         case 24:
            int var3 = var0.getColorModel().getPixelSize();
            if (var3 != 24 && var3 != 32) {
               var2 = a6$n5.u3(var0);
            } else {
               var2 = var0;
            }
            break;
         case 32:
            int var4 = var0.getColorModel().getPixelSize();
            if (var4 != 24 && var4 != 32) {
               var2 = a6$n5.a6(var0);
            } else {
               var2 = var0;
            }
      }

      return var2;
   }

   private static ImageWriter n5() {
      ImageWriter var0 = null;
      Iterator var1 = ImageIO.getImageWritersByFormatName("png");
      if (var1.hasNext()) {
         var0 = (ImageWriter)var1.next();
      }

      return var0;
   }

   private static byte[] n5(ImageWriter var0, BufferedImage var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      ImageOutputStream var3 = ImageIO.createImageOutputStream(var2);
      var0.setOutput(var3);
      var0.write(var1);
      var2.flush();
      return var2.toByteArray();
   }
}
