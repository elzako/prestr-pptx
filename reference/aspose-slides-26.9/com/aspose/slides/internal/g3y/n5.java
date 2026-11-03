package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.imageio.stream.ImageInputStream;

class n5 {
   static SortedMap<Integer, Integer> n5 = new TreeMap<>();
   static SortedMap<Integer, Integer> l6 = new TreeMap<>();

   public static byte n5(int var0) {
      if (n5.containsKey(var0)) {
         return n5.get(var0).byteValue();
      }

      if (var0 >= 0 && var0 <= 8192) {
         Integer var1 = n5.firstKey();

         for (Integer var3 : n5.keySet()) {
            if (var3 >= var0) {
               return var3 - var0 > var0 - var1 ? n5.get(var1).byteValue() : n5.get(var3).byteValue();
            }

            var1 = var3;
         }

         return -1;
      } else {
         throw new IllegalArgumentException("colorComponent16bit must be in [0..8192] diapason");
      }
   }

   public static k5 n5(ImageInputStream var0, int var1) throws IOException {
      return new k5(var0, var1);
   }

   private static void n5(n5$n5[] var0, byte[] var1, byte[] var2, byte[] var3) {
      for (int var4 = 0; var4 < var0.length; var4++) {
         var1[var4] = (byte)var0[var4].n5[2];
         var2[var4] = (byte)var0[var4].n5[1];
         var3[var4] = (byte)var0[var4].n5[0];
      }
   }

   private static n5$n5[] l6(k5 var0, ImageInputStream var1) throws IOException {
      n5$n5[] var2 = new n5$n5[var0.n3];

      for (int var3 = 0; var3 < var0.n3; var3++) {
         n5$n5 var4 = new n5$n5(var1);
         var2[var3] = var4;
      }

      return var2;
   }

   public static BufferedImage n5(k5 var0, ImageInputStream var1, boolean var2) throws IOException {
      n5$n5[] var3 = null;
      if (var0.a6 <= 8) {
         var3 = l6(var0, var1);
      }

      return n5(var0, var1, var3, var2);
   }

   public static BufferedImage n5(k5 var0, ImageInputStream var1, n5$n5[] var2, boolean var3) throws IOException {
      BufferedImage var4 = null;
      if (var0.a6 == 1 && var0.u9 == 0) {
         var4 = n5(var0, var1, var2);
      } else if (var0.a6 == 4 && var0.u9 == 0) {
         var4 = l6(var0, var1, var2);
      } else if (var0.a6 == 8 && var0.u9 == 0) {
         var4 = k5(var0, var1, var2);
      } else if (var0.a6 == 24 && var0.u9 == 0) {
         var4 = n5(var0, var1);
      } else if (var0.a6 == 32 && var0.u9 == 0) {
         var4 = l6(var0, var1, var3);
      } else {
         if (var0.a6 != 64 || var0.u9 != 0) {
            throw new IOException("Unknown format: bits=" + var0.a6 + ", compression=" + var0.u9);
         }

         var4 = k5(var0, var1, var3);
      }

      return var4;
   }

   public static BufferedImage n5(k5 var0, ImageInputStream var1, n5$n5[] var2) throws IOException {
      byte[] var3 = new byte[var2.length];
      byte[] var4 = new byte[var2.length];
      byte[] var5 = new byte[var2.length];
      n5(var2, var3, var4, var5);
      IndexColorModel var6 = new IndexColorModel(1, 2, var3, var4, var5);
      BufferedImage var7 = new BufferedImage(var0.l6, var0.k5, 12, var6);
      WritableRaster var8 = var7.getRaster();
      int var9 = var0.l6;
      int var10 = var9;
      if (var10 % 32 != 0) {
         var10 = (var10 / 32 + 1) * 32;
      }

      int var11 = var10 - var9;
      int var12 = var11 / 8;
      int var13 = var10 / 8;
      int[] var14 = new int[var13];

      for (int var15 = var0.k5 - 1; var15 >= 0; var15--) {
         for (int var16 = 0; var16 < var13; var16++) {
            var14[var16] = var1.readUnsignedByte();
         }

         for (int var21 = 0; var21 < var0.l6; var21++) {
            int var17 = var21 / 8;
            int var18 = var14[var17];
            int var19 = var21 % 8;
            int var20 = var18 >> 7 - var19 & 1;
            var8.setSample(var21, var15, 0, var20);
         }
      }

      return var7;
   }

   public static BufferedImage l6(k5 var0, ImageInputStream var1, n5$n5[] var2) throws IOException {
      byte[] var3 = new byte[var2.length];
      byte[] var4 = new byte[var2.length];
      byte[] var5 = new byte[var2.length];
      n5(var2, var3, var4, var5);
      IndexColorModel var6 = new IndexColorModel(4, var0.n3, var3, var4, var5);
      BufferedImage var7 = new BufferedImage(var0.l6, var0.k5, 12, var6);
      WritableRaster var8 = var7.getRaster();
      int var9 = var0.l6 * 4;
      if (var9 % 32 != 0) {
         var9 = (var9 / 32 + 1) * 32;
      }

      int var10 = var9 / 8;
      int[] var11 = new int[var10];

      for (int var12 = var0.k5 - 1; var12 >= 0; var12--) {
         for (int var13 = 0; var13 < var10; var13++) {
            int var14 = var1.readUnsignedByte();
            var11[var13] = var14;
         }

         for (int var18 = 0; var18 < var0.l6; var18++) {
            int var19 = var18 / 2;
            int var15 = var18 % 2;
            int var16 = var11[var19];
            int var17 = var16 >> 4 * (1 - var15) & 15;
            var8.setSample(var18, var12, 0, var17);
         }
      }

      return var7;
   }

   public static BufferedImage k5(k5 var0, ImageInputStream var1, n5$n5[] var2) throws IOException {
      byte[] var3 = new byte[var2.length];
      byte[] var4 = new byte[var2.length];
      byte[] var5 = new byte[var2.length];
      n5(var2, var3, var4, var5);
      IndexColorModel var6 = new IndexColorModel(8, var0.n3, var3, var4, var5);
      BufferedImage var7 = new BufferedImage(var0.l6, var0.k5, 13, var6);
      WritableRaster var8 = var7.getRaster();
      int var9 = var0.l6;
      int var10 = var9;
      if (var10 % 4 != 0) {
         var10 = (var10 / 4 + 1) * 4;
      }

      int var11 = var10 - var9;

      for (int var12 = var0.k5 - 1; var12 >= 0; var12--) {
         for (int var13 = 0; var13 < var0.l6; var13++) {
            int var14 = var1.readUnsignedByte();
            var8.setSample(var13, var12, 0, var14);
         }

         var1.skipBytes(var11);
      }

      return var7;
   }

   public static BufferedImage n5(k5 var0, ImageInputStream var1) throws IOException {
      BufferedImage var2 = new BufferedImage(var0.l6, var0.k5, 1);
      WritableRaster var3 = var2.getRaster();
      int var4 = var0.l6 * 3;
      int var5 = var4;
      if (var5 % 4 != 0) {
         var5 = (var5 / 4 + 1) * 4;
      }

      int var6 = var5 - var4;

      for (int var7 = var0.k5 - 1; var7 >= 0; var7--) {
         for (int var8 = 0; var8 < var0.l6; var8++) {
            int var9 = var1.readUnsignedByte();
            int var10 = var1.readUnsignedByte();
            int var11 = var1.readUnsignedByte();
            var3.setSample(var8, var7, 0, var11);
            var3.setSample(var8, var7, 1, var10);
            var3.setSample(var8, var7, 2, var9);
         }

         var1.skipBytes(var6);
      }

      return var2;
   }

   public static BufferedImage l6(k5 var0, ImageInputStream var1, boolean var2) throws IOException {
      BufferedImage var3 = new BufferedImage(var0.l6, var0.k5, var2 ? 2 : 1);
      WritableRaster var4 = var3.getRaster();
      WritableRaster var5 = var2 ? var3.getAlphaRaster() : null;

      for (int var6 = var0.k5 - 1; var6 >= 0; var6--) {
         for (int var7 = 0; var7 < var0.l6; var7++) {
            int var8 = var1.readUnsignedByte();
            int var9 = var1.readUnsignedByte();
            int var10 = var1.readUnsignedByte();
            int var11 = var1.readUnsignedByte();
            var4.setSample(var7, var6, 0, var10);
            var4.setSample(var7, var6, 1, var9);
            var4.setSample(var7, var6, 2, var8);
            if (var5 != null) {
               var5.setSample(var7, var6, 0, var11);
            }
         }
      }

      return var3;
   }

   public static BufferedImage k5(k5 var0, ImageInputStream var1, boolean var2) throws IOException {
      var2 = true;
      BufferedImage var3 = new BufferedImage(var0.l6, var0.k5, var2 ? 2 : 1);
      WritableRaster var4 = var3.getRaster();
      WritableRaster var5 = var2 ? var3.getAlphaRaster() : null;

      for (int var6 = var0.k5 - 1; var6 >= 0; var6--) {
         for (int var7 = 0; var7 < var0.l6; var7++) {
            short var8 = var1.readShort();
            short var9 = var1.readShort();
            short var10 = var1.readShort();
            short var11 = var1.readShort();
            var4.setSample(var7, var6, 0, n5(var10));
            var4.setSample(var7, var6, 1, n5(var9));
            var4.setSample(var7, var6, 2, n5(var8));
            if (var5 != null) {
               var5.setSample(var7, var6, 0, n5(var11));
            }
         }
      }

      return var3;
   }

   static {
      n5.put(0, 0);
      n5.put(2, 1);
      n5.put(5, 2);
      n5.put(7, 3);
      n5.put(10, 4);
      n5.put(12, 5);
      n5.put(15, 6);
      n5.put(17, 7);
      n5.put(20, 8);
      n5.put(22, 9);
      n5.put(25, 10);
      n5.put(27, 11);
      n5.put(30, 12);
      n5.put(33, 13);
      n5.put(36, 14);
      n5.put(39, 15);
      n5.put(42, 16);
      n5.put(46, 17);
      n5.put(50, 18);
      n5.put(53, 19);
      n5.put(57, 20);
      n5.put(61, 21);
      n5.put(66, 22);
      n5.put(70, 23);
      n5.put(75, 24);
      n5.put(80, 25);
      n5.put(85, 26);
      n5.put(90, 27);
      n5.put(95, 28);
      n5.put(101, 29);
      n5.put(106, 30);
      n5.put(112, 31);
      n5.put(118, 32);
      n5.put(125, 33);
      n5.put(131, 34);
      n5.put(138, 35);
      n5.put(145, 36);
      n5.put(152, 37);
      n5.put(159, 38);
      n5.put(166, 39);
      n5.put(174, 40);
      n5.put(182, 41);
      n5.put(190, 42);
      n5.put(198, 43);
      n5.put(206, 44);
      n5.put(215, 45);
      n5.put(224, 46);
      n5.put(233, 47);
      n5.put(242, 48);
      n5.put(252, 49);
      n5.put(261, 50);
      n5.put(271, 51);
      n5.put(281, 52);
      n5.put(292, 53);
      n5.put(302, 54);
      n5.put(313, 55);
      n5.put(324, 56);
      n5.put(335, 57);
      n5.put(347, 58);
      n5.put(358, 59);
      n5.put(370, 60);
      n5.put(382, 61);
      n5.put(395, 62);
      n5.put(407, 63);
      n5.put(420, 64);
      n5.put(433, 65);
      n5.put(446, 66);
      n5.put(460, 67);
      n5.put(474, 68);
      n5.put(488, 69);
      n5.put(502, 70);
      n5.put(516, 71);
      n5.put(531, 72);
      n5.put(546, 73);
      n5.put(561, 74);
      n5.put(576, 75);
      n5.put(592, 76);
      n5.put(608, 77);
      n5.put(624, 78);
      n5.put(641, 79);
      n5.put(657, 80);
      n5.put(674, 81);
      n5.put(691, 82);
      n5.put(709, 83);
      n5.put(726, 84);
      n5.put(744, 85);
      n5.put(762, 86);
      n5.put(781, 87);
      n5.put(799, 88);
      n5.put(818, 89);
      n5.put(838, 90);
      n5.put(857, 91);
      n5.put(877, 92);
      n5.put(897, 93);
      n5.put(917, 94);
      n5.put(937, 95);
      n5.put(958, 96);
      n5.put(979, 97);
      n5.put(1001, 98);
      n5.put(1022, 99);
      n5.put(1044, 100);
      n5.put(1066, 101);
      n5.put(1088, 102);
      n5.put(1111, 103);
      n5.put(1134, 104);
      n5.put(1157, 105);
      n5.put(1181, 106);
      n5.put(1204, 107);
      n5.put(1228, 108);
      n5.put(1253, 109);
      n5.put(1277, 110);
      n5.put(1302, 111);
      n5.put(1327, 112);
      n5.put(1353, 113);
      n5.put(1378, 114);
      n5.put(1404, 115);
      n5.put(1431, 116);
      n5.put(1457, 117);
      n5.put(1484, 118);
      n5.put(1511, 119);
      n5.put(1539, 120);
      n5.put(1566, 121);
      n5.put(1594, 122);
      n5.put(1623, 123);
      n5.put(1651, 124);
      n5.put(1680, 125);
      n5.put(1709, 126);
      n5.put(1739, 127);
      n5.put(1768, 128);
      n5.put(1798, 129);
      n5.put(1829, 130);
      n5.put(1859, 131);
      n5.put(1890, 132);
      n5.put(1921, 133);
      n5.put(1953, 134);
      n5.put(1985, 135);
      n5.put(2017, 136);
      n5.put(2049, 137);
      n5.put(2082, 138);
      n5.put(2115, 139);
      n5.put(2148, 140);
      n5.put(2182, 141);
      n5.put(2216, 142);
      n5.put(2250, 143);
      n5.put(2285, 144);
      n5.put(2320, 145);
      n5.put(2355, 146);
      n5.put(2390, 147);
      n5.put(2426, 148);
      n5.put(2462, 149);
      n5.put(2498, 150);
      n5.put(2535, 151);
      n5.put(2572, 152);
      n5.put(2610, 153);
      n5.put(2647, 154);
      n5.put(2685, 155);
      n5.put(2723, 156);
      n5.put(2762, 157);
      n5.put(2801, 158);
      n5.put(2840, 159);
      n5.put(2880, 160);
      n5.put(2920, 161);
      n5.put(2960, 162);
      n5.put(3000, 163);
      n5.put(3041, 164);
      n5.put(3082, 165);
      n5.put(3124, 166);
      n5.put(3166, 167);
      n5.put(3208, 168);
      n5.put(3250, 169);
      n5.put(3293, 170);
      n5.put(3336, 171);
      n5.put(3380, 172);
      n5.put(3423, 173);
      n5.put(3467, 174);
      n5.put(3512, 175);
      n5.put(3557, 176);
      n5.put(3602, 177);
      n5.put(3647, 178);
      n5.put(3693, 179);
      n5.put(3739, 180);
      n5.put(3785, 181);
      n5.put(3832, 182);
      n5.put(3879, 183);
      n5.put(3927, 184);
      n5.put(3974, 185);
      n5.put(4022, 186);
      n5.put(4071, 187);
      n5.put(4120, 188);
      n5.put(4169, 189);
      n5.put(4218, 190);
      n5.put(4268, 191);
      n5.put(4318, 192);
      n5.put(4369, 193);
      n5.put(4419, 194);
      n5.put(4471, 195);
      n5.put(4522, 196);
      n5.put(4574, 197);
      n5.put(4626, 198);
      n5.put(4679, 199);
      n5.put(4732, 200);
      n5.put(4785, 201);
      n5.put(4838, 202);
      n5.put(4892, 203);
      n5.put(4947, 204);
      n5.put(5001, 205);
      n5.put(5056, 206);
      n5.put(5111, 207);
      n5.put(5167, 208);
      n5.put(5223, 209);
      n5.put(5280, 210);
      n5.put(5336, 211);
      n5.put(5393, 212);
      n5.put(5451, 213);
      n5.put(5509, 214);
      n5.put(5567, 215);
      n5.put(5625, 216);
      n5.put(5684, 217);
      n5.put(5743, 218);
      n5.put(5803, 219);
      n5.put(5863, 220);
      n5.put(5923, 221);
      n5.put(5984, 222);
      n5.put(6045, 223);
      n5.put(6106, 224);
      n5.put(6168, 225);
      n5.put(6230, 226);
      n5.put(6293, 227);
      n5.put(6356, 228);
      n5.put(6419, 229);
      n5.put(6482, 230);
      n5.put(6546, 231);
      n5.put(6611, 232);
      n5.put(6675, 233);
      n5.put(6740, 234);
      n5.put(6806, 235);
      n5.put(6871, 236);
      n5.put(6938, 237);
      n5.put(7004, 238);
      n5.put(7071, 239);
      n5.put(7138, 240);
      n5.put(7206, 241);
      n5.put(7274, 242);
      n5.put(7342, 243);
      n5.put(7411, 244);
      n5.put(7480, 245);
      n5.put(7550, 246);
      n5.put(7619, 247);
      n5.put(7690, 248);
      n5.put(7760, 249);
      n5.put(7831, 250);
      n5.put(7903, 251);
      n5.put(7974, 252);
      n5.put(8047, 253);
      n5.put(8119, 254);
      n5.put(8192, 255);
   }
}
