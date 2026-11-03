package com.aspose.slides.internal.v4y;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.z0k.t4;
import java.awt.image.ComponentColorModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.util.Arrays;
import javax.imageio.ImageTypeSpecifier;

public class n5 {
   public static final int[] n5 = new int[]{0, 1, 2, 3};

   public static byte[] n5(int var0) {
      int var1 = 1 << var0;
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = (byte)(var3 * 255 / (var1 - 1));
      }

      return var2;
   }

   public static ImageTypeSpecifier l6(int var0) {
      byte[] var1 = n5(var0);
      return ImageTypeSpecifier.createIndexed(var1, var1, var1, null, var0, var0 <= 8 ? 0 : 1);
   }

   public static ImageTypeSpecifier k5(int var0) {
      k5 var1 = new k5(var0);
      return new ImageTypeSpecifier(var1, var1.createCompatibleSampleModel(1, 1));
   }

   public static ImageTypeSpecifier n5() {
      return new ImageTypeSpecifier(new u3(), new PixelInterleavedSampleModel(1, 1, 1, 4, 4, u3.n5));
   }

   public static ImageTypeSpecifier l6() {
      return new ImageTypeSpecifier(new a6(), new PixelInterleavedSampleModel(1, 1, 1, 4, 4, u3.n5));
   }

   public static ImageTypeSpecifier n5(t4 var0, t4 var1) {
      return new ImageTypeSpecifier(
         new ComponentColorModel(new com.aspose.slides.internal.p0s.n5(var0, var1), false, false, 1, 0), new PixelInterleavedSampleModel(0, 1, 1, 4, 4, n5)
      );
   }

   public static ImageTypeSpecifier k5() {
      return new ImageTypeSpecifier(
         new ComponentColorModel(new com.aspose.slides.internal.p0s.k5(), false, false, 1, 0), new PixelInterleavedSampleModel(0, 1, 1, 4, 4, n5)
      );
   }

   public static ImageTypeSpecifier n5(int var0, byte[] var1, byte[] var2, byte[] var3) {
      if (var0 != 1 && var0 != 4 && var0 != 8) {
         throw new ArgumentOutOfRangeException("BitDepth for Indexed-colour PNG image should be one of (1, 4, 8) but got " + var0);
      }

      int var4 = 1 << var0;
      byte[] var5 = var1;
      byte[] var6 = var2;
      byte[] var7 = var3;
      if (var5.length < var4) {
         var5 = Arrays.copyOf(var5, var4);
      }

      if (var6.length < var4) {
         var6 = Arrays.copyOf(var6, var4);
      }

      if (var7.length < var4) {
         var7 = Arrays.copyOf(var7, var4);
      }

      int var8 = Math.max(Math.max(var5.length, var6.length), var7.length);
      if (var8 > var4) {
         switch (var8) {
            case 2:
               var0 = 1;
               break;
            case 4:
               var0 = 2;
               break;
            case 16:
               var0 = 4;
               break;
            case 256:
               var0 = 8;
               break;
            default:
               var5 = new byte[var4];
               System.arraycopy(var1, 0, var5, 0, var4);
               var6 = new byte[var4];
               System.arraycopy(var2, 0, var6, 0, var4);
               var7 = new byte[var4];
               System.arraycopy(var3, 0, var7, 0, var4);
         }
      }

      return ImageTypeSpecifier.createIndexed(var5, var6, var7, null, var0, 0);
   }
}
