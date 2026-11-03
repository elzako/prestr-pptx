package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class f9d {
   static void n5(List<Long> var0, ExtraColorScheme var1) {
      m0l var2 = var1.n5();
      IColorScheme var3 = var1.getColorScheme();

      for (int var4 = 0; var4 < 8; var4++) {
         int var5 = s1f.u3(var4);
         byte var6 = var2.n5(var5);
         ((ColorFormat)var3.getByColorSchemeIndex(var6)).n5(com.aspose.slides.internal.n8e.v4.n5(255, ((Long)var0.get_Item(var4)).longValue()).o8());
      }

      ((ColorFormat)var3.getByColorSchemeIndex((byte)6)).n5(com.aspose.slides.internal.o9b.c8.n5(155, 187, 89).o8());
      ((ColorFormat)var3.getByColorSchemeIndex((byte)7)).n5(com.aspose.slides.internal.o9b.c8.n5(128, 100, 162).o8());
      ((ColorFormat)var3.getByColorSchemeIndex((byte)8)).n5(com.aspose.slides.internal.o9b.c8.n5(75, 172, 198).o8());
      ((ColorFormat)var3.getByColorSchemeIndex((byte)9)).n5(com.aspose.slides.internal.o9b.c8.n5(247, 150, 70).o8());
   }

   static void n5(ExtraColorScheme var0, com.aspose.slides.internal.k0r.r4 var1, boolean var2) {
      if (var0 != null) {
         boolean var3 = true;
         byte var4 = 6;
         com.aspose.slides.internal.k0r.k7 var5 = new com.aspose.slides.internal.k0r.k7();
         var5.w1().n5((short)(var2 ? 6 : 1));

         for (int var6 = 0; var6 < 8; var6++) {
            IColorFormat var7 = var0.getColorScheme().getByColorSchemeIndex(var0.n5().n5(s1f.u3(var6)));
            if (var7 != null && var7.getColorType() != -1) {
               var5.l6().set_Item(var6, com.aspose.slides.internal.n8e.v4.n5(((ColorFormat)var7).u3().o8()));
            }
         }

         var1.n5(var5);
      }
   }

   static void l6(List<Long> var0, ExtraColorScheme var1) {
      int[] var2 = new int[]{0, 1, 2, 3};
      double[] var3 = new double[4];

      for (int var4 = 0; var4 < 4; var4++) {
         var3[var4] = n5((Long)var0.get_Item(var4));
      }

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var5 = 3; var5 > var6; var5--) {
            if (var3[var2[var5 - 1]] > var3[var2[var5]]) {
               var2[var5] ^= var2[var5 - 1];
               var2[var5 - 1] = var2[var5 - 1] ^ var2[var5];
               var2[var5] ^= var2[var5 - 1];
            }
         }
      }

      var1.n5().n5(var2[0], (byte)0);
      var1.n5().n5(var2[1], (byte)2);
      var1.n5().n5(var2[2], (byte)3);
      var1.n5().n5(var2[3], (byte)1);
   }

   private static double n5(long var0) {
      double var2 = (var0 & 4294967295L & 255L & 4294967295L) / 255.0;
      double var4 = ((var0 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L) / 255.0;
      double var6 = ((var0 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L) / 255.0;
      double var8 = com.aspose.slides.ms.System.q1.l6(var2, com.aspose.slides.ms.System.q1.l6(var4, var6));
      double var10 = com.aspose.slides.ms.System.q1.k5(var2, com.aspose.slides.ms.System.q1.k5(var4, var6));
      return (var8 + var10) * 127.5;
   }
}
