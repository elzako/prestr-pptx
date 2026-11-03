package com.aspose.slides.internal.x8w;

public class m3 extends k7 {
   private byte[] n5 = new byte[16];
   private byte[] a6 = new byte[16];
   private byte[] u9 = new byte[16];
   private int h0;
   private byte[] c8 = new byte[48];
   private static byte[] t2 = new byte[]{
      41,
      46,
      67,
      -55,
      -94,
      -40,
      124,
      1,
      61,
      54,
      84,
      -95,
      -20,
      -16,
      6,
      19,
      98,
      -89,
      5,
      -13,
      -64,
      -57,
      115,
      -116,
      -104,
      -109,
      43,
      -39,
      -68,
      76,
      -126,
      -54,
      30,
      -101,
      87,
      60,
      -3,
      -44,
      -32,
      22,
      103,
      66,
      111,
      24,
      -118,
      23,
      -27,
      18,
      -66,
      78,
      -60,
      -42,
      -38,
      -98,
      -34,
      73,
      -96,
      -5,
      -11,
      -114,
      -69,
      47,
      -18,
      122,
      -87,
      104,
      121,
      -111,
      21,
      -78,
      7,
      63,
      -108,
      -62,
      16,
      -119,
      11,
      34,
      95,
      33,
      -128,
      127,
      93,
      -102,
      90,
      -112,
      50,
      39,
      53,
      62,
      -52,
      -25,
      -65,
      -9,
      -105,
      3,
      -1,
      25,
      48,
      -77,
      72,
      -91,
      -75,
      -47,
      -41,
      94,
      -110,
      42,
      -84,
      86,
      -86,
      -58,
      79,
      -72,
      56,
      -46,
      -106,
      -92,
      125,
      -74,
      118,
      -4,
      107,
      -30,
      -100,
      116,
      4,
      -15,
      69,
      -99,
      112,
      89,
      100,
      113,
      -121,
      32,
      -122,
      91,
      -49,
      101,
      -26,
      45,
      -88,
      2,
      27,
      96,
      37,
      -83,
      -82,
      -80,
      -71,
      -10,
      28,
      70,
      97,
      105,
      52,
      64,
      126,
      15,
      85,
      71,
      -93,
      35,
      -35,
      81,
      -81,
      58,
      -61,
      92,
      -7,
      -50,
      -70,
      -59,
      -22,
      38,
      44,
      83,
      13,
      110,
      -123,
      40,
      -124,
      9,
      -45,
      -33,
      -51,
      -12,
      65,
      -127,
      77,
      82,
      106,
      -36,
      55,
      -56,
      108,
      -63,
      -85,
      -6,
      36,
      -31,
      123,
      8,
      12,
      -67,
      -79,
      74,
      120,
      -120,
      -107,
      -117,
      -29,
      99,
      -24,
      109,
      -23,
      -53,
      -43,
      -2,
      59,
      0,
      29,
      57,
      -14,
      -17,
      -73,
      14,
      102,
      88,
      -48,
      -28,
      -90,
      119,
      114,
      -8,
      -21,
      117,
      75,
      10,
      49,
      68,
      80,
      -76,
      -113,
      -19,
      31,
      26,
      -37,
      -103,
      -115,
      51,
      -97,
      17,
      -125,
      20
   };

   private byte[] n5(int var1) {
      if (var1 <= 0) {
         return null;
      }

      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = (byte)var1;
      }

      return var2;
   }

   public m3() {
      this.t2();
   }

   @Override
   public void t2() {
      this.h0 = 0;
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, 16);
      com.aspose.slides.ms.System.u3.n5(this.a6, 0, 16);
      com.aspose.slides.ms.System.u3.n5(this.u9, 0, 16);
      com.aspose.slides.ms.System.u3.n5(this.c8, 0, 48);
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      int var4 = this.h0;
      this.h0 = var4 + var3 & 15;
      int var5 = 16 - var4;
      int var6;
      if (var3 >= var5) {
         com.aspose.slides.ms.System.y4.n5(var1, var2, this.u9, var4, var5);
         this.n5(this.n5, this.a6, this.u9, 0);

         for (var6 = var5; var6 + 15 < var3; var6 += 16) {
            this.n5(this.n5, this.a6, var1, var2 + var6);
         }

         var4 = 0;
      } else {
         var6 = 0;
      }

      com.aspose.slides.ms.System.y4.n5(var1, var2 + var6, this.u9, var4, var3 - var6);
   }

   @Override
   protected byte[] c8() {
      int var1 = this.h0;
      int var2 = 16 - var1;
      if (var2 > 0) {
         this.l6(this.n5(var2), 0, var2);
      }

      this.l6(this.a6, 0, 16);
      byte[] var3 = (byte[])this.n5.clone();
      this.t2();
      return var3;
   }

   private void n5(byte[] var1, byte[] var2, byte[] var3, int var4) {
      com.aspose.slides.ms.System.y4.n5(var1, 0, this.c8, 0, 16);
      com.aspose.slides.ms.System.y4.n5(var3, var4, this.c8, 16, 16);

      for (int var5 = 0; var5 < 16; var5++) {
         this.c8[var5 + 32] = (byte)(var1[var5] & 0xFF ^ var3[var4 + var5] & 0xFF);
      }

      int var8 = 0;

      for (int var6 = 0; var6 < 18; var6++) {
         for (int var7 = 0; var7 < 48; var7++) {
            var8 = this.c8[var7] = (byte)(this.c8[var7] ^ t2[var8]);
         }

         var8 = var8 + var6 & 0xFF;
      }

      com.aspose.slides.ms.System.y4.n5(this.c8, 0, var1, 0, 16);
      var8 = var2[15] & 255;

      for (int var10 = 0; var10 < 16; var10++) {
         var8 = var2[var10] ^= t2[var3[var4 + var10] & 0xFF ^ var8];
      }
   }
}
