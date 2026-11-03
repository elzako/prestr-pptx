package com.aspose.slides.internal.v4y;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.t4;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.Arrays;

public class l6 {
   public static final int[] n5 = new int[]{2, 1, 0, 3};

   public static BufferedImage n5(int var0, int var1, int var2) {
      return n5(var0, var1, var2, false);
   }

   public static BufferedImage n5(int var0, int var1, int var2, boolean var3) {
      if (var0 > 0 && var1 > 0) {
         int var4 = t4.a6(var2);
         int var5 = t4.n5(var2);
         if (var2 == 1060876) {
            return l6(var0, var1);
         } else if (var2 == 3424269) {
            return k5(var0, var1);
         } else if (var2 == 1851406) {
            return u3(var0, var1);
         } else if (var2 == 397319) {
            return n5(var0, var1);
         } else if (var2 == 139273) {
            return a6(var0, var1);
         } else if (var2 == 2498570) {
            return n5(var0, var1, var3);
         } else if (var2 == 925707) {
            return u9(var0, var1);
         } else if (var2 == 198659) {
            return l6(var0, var1, var4, var5);
         } else {
            return var2 == 197634 ? n5(var0, var1, var4, var5) : new BufferedImage(var0, var1, var4);
         }
      } else {
         throw new ArgumentException("Argument width[" + var0 + "] or height[" + var1 + "] cannot be less or equal to zero");
      }
   }

   public static BufferedImage n5(int var0, int var1, int var2, int var3) {
      return new BufferedImage(var0, var1, var2, new IndexColorModel(var3, 16, com.aspose.slides.internal.j9e.u3.n5, 0, true, -1, 0));
   }

   public static BufferedImage l6(int var0, int var1, int var2, int var3) {
      return new BufferedImage(var0, var1, var2, new IndexColorModel(var3, 256, com.aspose.slides.internal.j9e.u3.l6, 0, true, -1, 0));
   }

   public static BufferedImage n5(int var0, int var1) {
      char var2 = '耀';
      short var3 = 31744;
      short var4 = 992;
      byte var5 = 31;
      DirectColorModel var6 = new DirectColorModel(16, 31744, 992, 31, 32768);
      WritableRaster var7 = var6.createCompatibleWritableRaster(var0, var1);
      return new BufferedImage(var6, var7, false, null);
   }

   private static BufferedImage a6(int var0, int var1) {
      return new BufferedImage(var0, var1, 1);
   }

   private static BufferedImage n5(int var0, int var1, boolean var2) {
      return new BufferedImage(var0, var1, var2 ? 2 : 6);
   }

   public static boolean n5(BufferedImage var0) {
      if (var0.getType() == 0 && var0.getColorModel() instanceof ComponentColorModel && var0.getSampleModel() instanceof ComponentSampleModel) {
         ComponentColorModel var1 = (ComponentColorModel)var0.getColorModel();
         ComponentSampleModel var2 = (ComponentSampleModel)var0.getSampleModel();
         if (var1.getNumComponents() == 4
            && Arrays.equals(var1.getComponentSize(), new int[]{8, 8, 8, 8})
            && var1.getTransferType() == 0
            && var2.getTransferType() == 0
            && Arrays.equals(var2.getBandOffsets(), n5)) {
            return true;
         }
      }

      return false;
   }

   private static BufferedImage u9(int var0, int var1) {
      return new BufferedImage(var0, var1, 7);
   }

   public static BufferedImage l6(int var0, int var1) {
      k5 var2 = new k5();
      WritableRaster var3 = var2.createCompatibleWritableRaster(var0, var1);
      return new BufferedImage(var2, var3, false, null);
   }

   public static BufferedImage k5(int var0, int var1) {
      u3 var2 = new u3();
      WritableRaster var3 = var2.createCompatibleWritableRaster(var0, var1);
      return new BufferedImage(var2, var3, false, null);
   }

   public static BufferedImage u3(int var0, int var1) {
      a6 var2 = new a6();
      WritableRaster var3 = var2.createCompatibleWritableRaster(var0, var1);
      return new BufferedImage(var2, var3, false, null);
   }
}
