package com.aspose.slides.internal.c9t;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.io.IOException;
import javax.imageio.stream.ImageOutputStream;

public class k5 {
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

   public static void n5(RenderedImage var0, int var1, int var2, ImageOutputStream var3) throws IOException {
      BufferedImage var4 = (BufferedImage)var0;
      n5(var4, var1, var2, var3, false);
   }

   public static void l6(RenderedImage var0, int var1, int var2, ImageOutputStream var3) throws IOException {
      BufferedImage var4 = (BufferedImage)var0;
      n5(var4, var1, var2, var3, true);
   }

   private static void n5(BufferedImage var0, int var1, int var2, ImageOutputStream var3, boolean var4) throws IOException {
      n3 var5 = n5(var0, var1, var2, var4);
      int var6 = 14 + (int)var5.n5;
      int var7 = var5.l6 * 4;
      int var8 = var6 + var7 * var5.k5;
      n5(var8, var6, var3);
      var5.n5(var3);
      if (!var4) {
         n5(var0, var3);
      } else {
         n5(var0.getRaster(), var3);
      }
   }

   public static n3 n5(BufferedImage var0, int var1, int var2, boolean var3) {
      n3 var4 = new n3();
      var4.x8 = 0L;
      var4.s7 = 0L;
      var4.u9 = 0L;
      var4.k5 = var0.getHeight();
      var4.l6 = var0.getWidth();
      var4.a6 = var3 ? 64 : (short)var0.getColorModel().getPixelSize();
      var4.d2 = 1 << (var4.a6 >= 32 ? 24 : var4.a6);
      var4.h0 = 0L;
      if (var1 != 0 && var2 != 0) {
         var4.c8 = Math.round(var1 / 25.4F * 1000.0F);
         var4.t2 = Math.round(var2 / 25.4F * 1000.0F);
      }

      return var4;
   }

   public static void n5(int var0, int var1, ImageOutputStream var2) throws IOException {
      var2.writeByte(66);
      var2.writeByte(77);
      var2.writeInt(var0);
      var2.writeInt(0);
      var2.writeInt(var1);
   }

   public static void n5(BufferedImage var0, ImageOutputStream var1) throws IOException {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();

      for (int var4 = var3 - 1; var4 >= 0; var4--) {
         for (int var5 = 0; var5 < var2; var5++) {
            int var6 = var0.getRGB(var5, var4);
            int var7 = var6 >> 24 & 0xFF;
            int var8 = var6 >> 16 & 0xFF;
            int var9 = var6 >> 8 & 0xFF;
            int var10 = var6 >> 0 & 0xFF;
            var1.writeByte(var10);
            var1.writeByte(var9);
            var1.writeByte(var8);
            var1.writeByte(var7);
         }
      }
   }

   public static void n5(Raster var0, ImageOutputStream var1) throws IOException {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();

      for (int var4 = var3 - 1; var4 >= 0; var4--) {
         for (int var5 = 0; var5 < var2; var5++) {
            int var6 = var0.getSample(var5, var4, 0);
            int var7 = var0.getSample(var5, var4, 1);
            int var8 = var0.getSample(var5, var4, 2);
            int var9 = var0.getSample(var5, var4, 3);
            var1.writeByte(var8 & 0xFF);
            var1.writeByte(var8 >> 8 & 0xFF);
            var1.writeByte(var7 & 0xFF);
            var1.writeByte(var7 >> 8 & 0xFF);
            var1.writeByte(var6 & 0xFF);
            var1.writeByte(var6 >> 8 & 0xFF);
            var1.writeByte(var9 & 0xFF);
            var1.writeByte(var9 >> 8 & 0xFF);
         }
      }
   }
}
