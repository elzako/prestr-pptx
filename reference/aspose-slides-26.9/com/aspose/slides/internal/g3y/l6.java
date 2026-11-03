package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.io.IOException;
import javax.imageio.stream.ImageOutputStream;

class l6 {
   private static final int[] n5 = new int[]{
      0,
      2,
      5,
      7,
      10,
      12,
      15,
      17,
      20,
      22,
      25,
      27,
      30,
      33,
      36,
      39,
      42,
      46,
      50,
      53,
      57,
      61,
      66,
      70,
      75,
      80,
      85,
      90,
      95,
      101,
      106,
      112,
      118,
      125,
      131,
      138,
      145,
      152,
      159,
      166,
      174,
      182,
      190,
      198,
      206,
      215,
      224,
      233,
      242,
      252,
      261,
      271,
      281,
      292,
      302,
      313,
      324,
      335,
      347,
      358,
      370,
      382,
      395,
      407,
      420,
      433,
      446,
      460,
      474,
      488,
      502,
      516,
      531,
      546,
      561,
      576,
      592,
      608,
      624,
      641,
      657,
      674,
      691,
      709,
      726,
      744,
      762,
      781,
      799,
      818,
      838,
      857,
      877,
      897,
      917,
      937,
      958,
      979,
      1001,
      1022,
      1044,
      1066,
      1088,
      1111,
      1134,
      1157,
      1181,
      1204,
      1228,
      1253,
      1277,
      1302,
      1327,
      1353,
      1378,
      1404,
      1431,
      1457,
      1484,
      1511,
      1539,
      1566,
      1594,
      1623,
      1651,
      1680,
      1709,
      1739,
      1768,
      1798,
      1829,
      1859,
      1890,
      1921,
      1953,
      1985,
      2017,
      2049,
      2082,
      2115,
      2148,
      2182,
      2216,
      2250,
      2285,
      2320,
      2355,
      2390,
      2426,
      2462,
      2498,
      2535,
      2572,
      2610,
      2647,
      2685,
      2723,
      2762,
      2801,
      2840,
      2880,
      2920,
      2960,
      3000,
      3041,
      3082,
      3124,
      3166,
      3208,
      3250,
      3293,
      3336,
      3380,
      3423,
      3467,
      3512,
      3557,
      3602,
      3647,
      3693,
      3739,
      3785,
      3832,
      3879,
      3927,
      3974,
      4022,
      4071,
      4120,
      4169,
      4218,
      4268,
      4318,
      4369,
      4419,
      4471,
      4522,
      4574,
      4626,
      4679,
      4732,
      4785,
      4838,
      4892,
      4947,
      5001,
      5056,
      5111,
      5167,
      5223,
      5280,
      5336,
      5393,
      5451,
      5509,
      5567,
      5625,
      5684,
      5743,
      5803,
      5863,
      5923,
      5984,
      6045,
      6106,
      6168,
      6230,
      6293,
      6356,
      6419,
      6482,
      6546,
      6611,
      6675,
      6740,
      6806,
      6871,
      6938,
      7004,
      7071,
      7138,
      7206,
      7274,
      7342,
      7411,
      7480,
      7550,
      7619,
      7690,
      7760,
      7831,
      7903,
      7974,
      8047,
      8119,
      8192
   };

   public static k5 n5(BufferedImage var0, int var1, int var2) {
      return n5(var0, var1, var2, false);
   }

   public static k5 n5(BufferedImage var0, int var1, int var2, boolean var3) {
      k5 var4 = new k5();
      var4.x8 = 0;
      var4.s7 = 0;
      var4.u9 = 0;
      var4.k5 = var0.getHeight();
      var4.l6 = var0.getWidth();
      var4.a6 = var3 ? 64 : (short)var0.getColorModel().getPixelSize();
      var4.n3 = 1 << (var4.a6 >= 32 ? 24 : var4.a6);
      var4.h0 = 0;
      if (var1 != 0 && var2 != 0) {
         var4.c8 = Math.round(var1 / 25.4F * 1000.0F);
         var4.t2 = Math.round(var2 / 25.4F * 1000.0F);
      }

      return var4;
   }

   public static void n5(IndexColorModel var0, ImageOutputStream var1) throws IOException {
      int var2 = var0.getMapSize();

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var0.getRGB(var3);
         int var5 = var4 >> 16 & 0xFF;
         int var6 = var4 >> 8 & 0xFF;
         int var7 = var4 & 0xFF;
         var1.writeByte(var7);
         var1.writeByte(var6);
         var1.writeByte(var5);
         var1.writeByte(0);
      }

      var1.flush();
   }

   public static int n5(int var0, int var1) {
      int var2 = var0 * var1 / 32;
      int var3 = var0 * var1 % 32;
      return var2 * 4 + (var3 > 0 ? 4 : 0);
   }

   public static int n5(int var0) {
      return n5(var0, 1);
   }

   public static int l6(int var0) {
      return n5(var0, 4);
   }

   public static int k5(int var0) {
      return n5(var0, 8);
   }

   public static int u3(int var0) {
      return n5(var0, 24);
   }

   public static int n5(int var0, int var1, int var2) {
      int var3 = 0;
      switch (var2) {
         case 1:
            var3 = n5(var0);
            break;
         case 4:
            var3 = l6(var0);
            break;
         case 8:
            var3 = k5(var0);
            break;
         case 24:
            var3 = u3(var0);
            break;
         case 32:
            var3 = var0 * 4;
      }

      return var3 * var1;
   }

   public static void n5(Raster var0, ImageOutputStream var1) throws IOException {
      int var2 = n5(var0.getWidth());
      byte[] var3 = new byte[var2];

      for (int var4 = var0.getHeight() - 1; var4 >= 0; var4--) {
         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = 0;
         }

         for (int var9 = 0; var9 < var0.getWidth(); var9++) {
            int var6 = var9 / 8;
            int var7 = var9 % 8;
            int var8 = var0.getSample(var9, var4, 0);
            if (var8 == 0) {
               var3[var6] = (byte)(var3[var6] & ~(1 << 7 - var7));
            } else {
               var3[var6] = (byte)(var3[var6] | 1 << 7 - var7);
            }
         }

         var1.write(var3);
      }

      var1.flush();
   }

   public static void l6(Raster var0, ImageOutputStream var1) throws IOException {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = l6(var2);
      byte[] var5 = new byte[var4];

      for (int var6 = var3 - 1; var6 >= 0; var6--) {
         for (int var7 = 0; var7 < var4; var7++) {
            var5[var7] = 0;
         }

         for (int var11 = 0; var11 < var2; var11++) {
            int var8 = var11 / 2;
            int var9 = var11 % 2;
            int var10 = var0.getSample(var11, var6, 0);
            var5[var8] = (byte)(var5[var8] | var10 << (1 - var9) * 4);
         }

         var1.write(var5);
      }

      var1.flush();
   }

   public static void k5(Raster var0, ImageOutputStream var1) throws IOException {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = k5(var2);

      for (int var5 = var3 - 1; var5 >= 0; var5--) {
         for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var0.getSample(var6, var5, 0);
            var1.writeByte(var7);
         }

         for (int var8 = var2; var8 < var4; var8++) {
            var1.writeByte(0);
         }
      }

      var1.flush();
   }

   public static void u3(Raster var0, ImageOutputStream var1) throws IOException {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = u3(var2);

      for (int var5 = var3 - 1; var5 >= 0; var5--) {
         for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var0.getSample(var6, var5, 0);
            int var8 = var0.getSample(var6, var5, 1);
            int var9 = var0.getSample(var6, var5, 2);
            var1.writeByte(var9);
            var1.writeByte(var8);
            var1.writeByte(var7);
         }

         for (int var10 = var2 * 3; var10 < var4; var10++) {
            var1.writeByte(0);
         }
      }

      var1.flush();
   }

   public static void n5(Raster var0, Raster var1, ImageOutputStream var2) throws IOException {
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();

      for (int var5 = var4 - 1; var5 >= 0; var5--) {
         for (int var6 = 0; var6 < var3; var6++) {
            int var7 = var0.getSample(var6, var5, 0);
            int var8 = var0.getSample(var6, var5, 1);
            int var9 = var0.getSample(var6, var5, 2);
            int var10 = var1.getSample(var6, var5, 0);
            var2.writeByte(var9);
            var2.writeByte(var8);
            var2.writeByte(var7);
            var2.writeByte(var10);
         }
      }

      var2.flush();
   }
}
