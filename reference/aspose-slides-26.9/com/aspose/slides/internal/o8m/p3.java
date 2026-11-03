package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;

class p3 extends w5 {
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int[] u9;
   private int h0;
   static byte[] n5 = new byte[]{
      -39,
      120,
      -7,
      -60,
      25,
      -35,
      -75,
      -19,
      40,
      -23,
      -3,
      121,
      74,
      -96,
      -40,
      -99,
      -58,
      126,
      55,
      -125,
      43,
      118,
      83,
      -114,
      98,
      76,
      100,
      -120,
      68,
      -117,
      -5,
      -94,
      23,
      -102,
      89,
      -11,
      -121,
      -77,
      79,
      19,
      97,
      69,
      109,
      -115,
      9,
      -127,
      125,
      50,
      -67,
      -113,
      64,
      -21,
      -122,
      -73,
      123,
      11,
      -16,
      -107,
      33,
      34,
      92,
      107,
      78,
      -126,
      84,
      -42,
      101,
      -109,
      -50,
      96,
      -78,
      28,
      115,
      86,
      -64,
      20,
      -89,
      -116,
      -15,
      -36,
      18,
      117,
      -54,
      31,
      59,
      -66,
      -28,
      -47,
      66,
      61,
      -44,
      48,
      -93,
      60,
      -74,
      38,
      111,
      -65,
      14,
      -38,
      70,
      105,
      7,
      87,
      39,
      -14,
      29,
      -101,
      -68,
      -108,
      67,
      3,
      -8,
      17,
      -57,
      -10,
      -112,
      -17,
      62,
      -25,
      6,
      -61,
      -43,
      47,
      -56,
      102,
      30,
      -41,
      8,
      -24,
      -22,
      -34,
      -128,
      82,
      -18,
      -9,
      -124,
      -86,
      114,
      -84,
      53,
      77,
      106,
      42,
      -106,
      26,
      -46,
      113,
      90,
      21,
      73,
      116,
      75,
      -97,
      -48,
      94,
      4,
      24,
      -92,
      -20,
      -62,
      -32,
      65,
      110,
      15,
      81,
      -53,
      -52,
      36,
      -111,
      -81,
      80,
      -95,
      -12,
      112,
      57,
      -103,
      124,
      58,
      -123,
      35,
      -72,
      -76,
      122,
      -4,
      2,
      54,
      91,
      37,
      85,
      -105,
      49,
      45,
      93,
      -6,
      -104,
      -29,
      -118,
      -110,
      -82,
      5,
      -33,
      41,
      16,
      103,
      108,
      -70,
      -55,
      -45,
      0,
      -26,
      -49,
      -31,
      -98,
      -88,
      44,
      99,
      22,
      1,
      63,
      88,
      -30,
      -119,
      -87,
      13,
      56,
      52,
      27,
      -85,
      51,
      -1,
      -80,
      -69,
      72,
      12,
      95,
      -71,
      -79,
      -51,
      46,
      -59,
      -13,
      -37,
      71,
      -27,
      -91,
      -100,
      119,
      10,
      -90,
      32,
      104,
      -2,
      127,
      -63,
      -83
   };

   public p3(f0 var1, boolean var2, byte[] var3, byte[] var4) {
      super(var1, var2, var4);
      int var5 = var1.a6();
      if (var3 == null) {
         var3 = com.aspose.slides.internal.x8w.t4.n5(var1.u9() >> 3);
      } else {
         var3 = (byte[])var3.clone();
         var5 = Math.min(var5, var3.length << 3);
      }

      int var6 = var3.length;
      if (!e5.n5(var1.x8(), var6 << 3)) {
         String var13 = com.aspose.slides.internal.x8w.z3.n5("Key is too small ({0} bytes), it should be between {1} and {2} bytes long.", var6, 5, 16);
         throw new CryptographicException(var13);
      }

      byte[] var7 = new byte[128];
      int var8 = var5 + 7 >> 3;
      int var9 = 255 % (2 << 8 + var5 - (var8 << 3) - 1);
      System.arraycopy(var3, 0, var7, 0, var6);

      for (int var10 = var6; var10 < 128; var10++) {
         var7[var10] = (byte)(n5[(var7[var10 - 1] & 255) + (var7[var10 - var6] & 255) & 0xFF] & 0xFF);
      }

      var7[128 - var8] = n5[var7[128 - var8] & 0xFF & var9];

      for (int var14 = 127 - var8; var14 >= 0; var14--) {
         var7[var14] = n5[var7[var14 + 1] & 0xFF ^ var7[var14 + var8] & 0xFF];
      }

      this.u9 = new int[64];
      int var15 = 0;

      for (int var11 = 0; var11 < 64; var11++) {
         this.u9[var11] = (var7[var15++] & 255) + ((var7[var15++] & 255) << 8);
      }
   }

   @Override
   protected void l6(byte[] var1, byte[] var2) {
      this.l6 = var1[0] & 255 | (var1[1] & 255) << 8;
      this.k5 = var1[2] & 255 | (var1[3] & 255) << 8;
      this.u3 = var1[4] & 255 | (var1[5] & 255) << 8;
      this.a6 = var1[6] & 255 | (var1[7] & 255) << 8;
      if (this.y4) {
         for (this.h0 = 0; this.h0 <= 16; this.a6 = (this.a6 & 65535) << 5 | (this.a6 & 65535) >> 11) {
            this.l6 = (this.l6 & 65535) + ((this.u9[this.h0++] & 65535) + (this.a6 & 65535 & this.u3 & 65535) + (~(this.a6 & 65535) & this.k5 & 65535) & 65535);
            this.l6 = (this.l6 & 65535) << 1 | (this.l6 & 65535) >> 15;
            this.k5 = (this.k5 & 65535) + ((this.u9[this.h0++] & 65535) + (this.l6 & 65535 & this.a6 & 65535) + (~(this.l6 & 65535) & this.u3 & 65535) & 65535);
            this.k5 = (this.k5 & 65535) << 2 | (this.k5 & 65535) >> 14;
            this.u3 = (this.u3 & 65535) + ((this.u9[this.h0++] & 65535) + (this.k5 & 65535 & this.l6 & 65535) + (~(this.k5 & 65535) & this.a6 & 65535) & 65535);
            this.u3 = (this.u3 & 65535) << 3 | (this.u3 & 65535) >> 13;
            this.a6 = (this.a6 & 65535) + ((this.u9[this.h0++] & 65535) + (this.u3 & 65535 & this.k5 & 65535) + (~(this.u3 & 65535) & this.l6 & 65535) & 65535);
         }

         this.l6 = (this.l6 & 65535) + (this.u9[this.a6 & 65535 & 63] & 65535);
         this.k5 = (this.k5 & 65535) + (this.u9[this.l6 & 65535 & 63] & 65535);
         this.u3 = (this.u3 & 65535) + (this.u9[this.k5 & 65535 & 63] & 65535);

         for (this.a6 = (this.a6 & 65535) + (this.u9[this.u3 & 65535 & 63] & 65535); this.h0 <= 40; this.a6 = (this.a6 & 65535) << 5 | (this.a6 & 65535) >> 11) {
            this.l6 = (this.l6 & 65535) + ((this.u9[this.h0++] & 65535) + (this.a6 & 65535 & this.u3 & 65535) + (~(this.a6 & 65535) & this.k5 & 65535) & 65535);
            this.l6 = (this.l6 & 65535) << 1 | (this.l6 & 65535) >> 15;
            this.k5 = (this.k5 & 65535) + ((this.u9[this.h0++] & 65535) + (this.l6 & 65535 & this.a6 & 65535) + (~(this.l6 & 65535) & this.u3 & 65535) & 65535);
            this.k5 = (this.k5 & 65535) << 2 | (this.k5 & 65535) >> 14;
            this.u3 = (this.u3 & 65535) + ((this.u9[this.h0++] & 65535) + (this.k5 & 65535 & this.l6 & 65535) + (~(this.k5 & 65535) & this.a6 & 65535) & 65535);
            this.u3 = (this.u3 & 65535) << 3 | (this.u3 & 65535) >> 13;
            this.a6 = (this.a6 & 65535) + ((this.u9[this.h0++] & 65535) + (this.u3 & 65535 & this.k5 & 65535) + (~(this.u3 & 65535) & this.l6 & 65535) & 65535);
         }

         this.l6 = (this.l6 & 65535) + (this.u9[this.a6 & 65535 & 63] & 65535);
         this.k5 = (this.k5 & 65535) + (this.u9[this.l6 & 65535 & 63] & 65535);
         this.u3 = (this.u3 & 65535) + (this.u9[this.k5 & 65535 & 63] & 65535);

         for (this.a6 = (this.a6 & 65535) + (this.u9[this.u3 & 65535 & 63] & 65535); this.h0 < 64; this.a6 = (this.a6 & 65535) << 5 | (this.a6 & 65535) >> 11) {
            this.l6 = (this.l6 & 65535) + ((this.u9[this.h0++] & 65535) + (this.a6 & 65535 & this.u3 & 65535) + (~(this.a6 & 65535) & this.k5 & 65535) & 65535);
            this.l6 = (this.l6 & 65535) << 1 | (this.l6 & 65535) >> 15;
            this.k5 = (this.k5 & 65535) + ((this.u9[this.h0++] & 65535) + (this.l6 & 65535 & this.a6 & 65535) + (~(this.l6 & 65535) & this.u3 & 65535) & 65535);
            this.k5 = (this.k5 & 65535) << 2 | (this.k5 & 65535) >> 14;
            this.u3 = (this.u3 & 65535) + ((this.u9[this.h0++] & 65535) + (this.k5 & 65535 & this.l6 & 65535) + (~(this.k5 & 65535) & this.a6 & 65535) & 65535);
            this.u3 = (this.u3 & 65535) << 3 | (this.u3 & 65535) >> 13;
            this.a6 = (this.a6 & 65535) + ((this.u9[this.h0++] & 65535) + (this.u3 & 65535 & this.k5 & 65535) + (~(this.u3 & 65535) & this.l6 & 65535) & 65535);
         }
      } else {
         for (this.h0 = 63;
            this.h0 >= 44;
            this.l6 = (this.l6 & 65535) - ((this.u9[this.h0--] & 65535) + (this.a6 & 65535 & this.u3 & 65535) + (~(this.a6 & 65535) & this.k5 & 65535) & 65535)
         ) {
            this.a6 = (this.a6 & 65535) >> 5 | (this.a6 & 65535) << 11;
            this.a6 = (this.a6 & 65535) - ((this.u9[this.h0--] & 65535) + (this.u3 & 65535 & this.k5 & 65535) + (~(this.u3 & 65535) & this.l6 & 65535) & 65535);
            this.u3 = (this.u3 & 65535) >> 3 | (this.u3 & 65535) << 13;
            this.u3 = (this.u3 & 65535) - ((this.u9[this.h0--] & 65535) + (this.k5 & 65535 & this.l6 & 65535) + (~(this.k5 & 65535) & this.a6 & 65535) & 65535);
            this.k5 = (this.k5 & 65535) >> 2 | (this.k5 & 65535) << 14;
            this.k5 = (this.k5 & 65535) - ((this.u9[this.h0--] & 65535) + (this.l6 & 65535 & this.a6 & 65535) + (~(this.l6 & 65535) & this.u3 & 65535) & 65535);
            this.l6 = (this.l6 & 65535) >> 1 | (this.l6 & 65535) << 15;
         }

         this.a6 = (this.a6 & 65535) - (this.u9[this.u3 & 65535 & 63] & 65535);
         this.u3 = (this.u3 & 65535) - (this.u9[this.k5 & 65535 & 63] & 65535);
         this.k5 = (this.k5 & 65535) - (this.u9[this.l6 & 65535 & 63] & 65535);

         for (this.l6 = (this.l6 & 65535) - (this.u9[this.a6 & 65535 & 63] & 65535);
            this.h0 >= 20;
            this.l6 = (this.l6 & 65535) - ((this.u9[this.h0--] & 65535) + (this.a6 & 65535 & this.u3 & 65535) + (~(this.a6 & 65535) & this.k5 & 65535) & 65535)
         ) {
            this.a6 = (this.a6 & 65535) >> 5 | (this.a6 & 65535) << 11;
            this.a6 = (this.a6 & 65535) - ((this.u9[this.h0--] & 65535) + (this.u3 & 65535 & this.k5 & 65535) + (~(this.u3 & 65535) & this.l6 & 65535) & 65535);
            this.u3 = (this.u3 & 65535) >> 3 | (this.u3 & 65535) << 13;
            this.u3 = (this.u3 & 65535) - ((this.u9[this.h0--] & 65535) + (this.k5 & 65535 & this.l6 & 65535) + (~(this.k5 & 65535) & this.a6 & 65535) & 65535);
            this.k5 = (this.k5 & 65535) >> 2 | (this.k5 & 65535) << 14;
            this.k5 = (this.k5 & 65535) - ((this.u9[this.h0--] & 65535) + (this.l6 & 65535 & this.a6 & 65535) + (~(this.l6 & 65535) & this.u3 & 65535) & 65535);
            this.l6 = (this.l6 & 65535) >> 1 | (this.l6 & 65535) << 15;
         }

         this.a6 = (this.a6 & 65535) - (this.u9[this.u3 & 65535 & 63] & 65535);
         this.u3 = (this.u3 & 65535) - (this.u9[this.k5 & 65535 & 63] & 65535);
         this.k5 = (this.k5 & 65535) - (this.u9[this.l6 & 65535 & 63] & 65535);

         for (this.l6 = (this.l6 & 65535) - (this.u9[this.a6 & 65535 & 63] & 65535);
            this.h0 >= 0;
            this.l6 = (this.l6 & 65535) - ((this.u9[this.h0--] & 65535) + (this.a6 & 65535 & this.u3 & 65535) + (~(this.a6 & 65535) & this.k5 & 65535) & 65535)
         ) {
            this.a6 = (this.a6 & 65535) >> 5 | (this.a6 & 65535) << 11;
            this.a6 = (this.a6 & 65535) - ((this.u9[this.h0--] & 65535) + (this.u3 & 65535 & this.k5 & 65535) + (~(this.u3 & 65535) & this.l6 & 65535) & 65535);
            this.u3 = (this.u3 & 65535) >> 3 | (this.u3 & 65535) << 13;
            this.u3 = (this.u3 & 65535) - ((this.u9[this.h0--] & 65535) + (this.k5 & 65535 & this.l6 & 65535) + (~(this.k5 & 65535) & this.a6 & 65535) & 65535);
            this.k5 = (this.k5 & 65535) >> 2 | (this.k5 & 65535) << 14;
            this.k5 = (this.k5 & 65535) - ((this.u9[this.h0--] & 65535) + (this.l6 & 65535 & this.a6 & 65535) + (~(this.l6 & 65535) & this.u3 & 65535) & 65535);
            this.l6 = (this.l6 & 65535) >> 1 | (this.l6 & 65535) << 15;
         }
      }

      var2[0] = (byte)(this.l6 & 65535);
      var2[1] = (byte)((this.l6 & 65535) >> 8);
      var2[2] = (byte)(this.k5 & 65535);
      var2[3] = (byte)((this.k5 & 65535) >> 8);
      var2[4] = (byte)(this.u3 & 65535);
      var2[5] = (byte)((this.u3 & 65535) >> 8);
      var2[6] = (byte)(this.a6 & 65535);
      var2[7] = (byte)((this.a6 & 65535) >> 8);
   }
}
