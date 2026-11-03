package com.aspose.slides.internal.t5g;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.core.resources.ResourcesLoader;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferDouble;
import java.awt.image.DataBufferFloat;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.imageio.stream.ImageInputStream;

public class u3 {
   public static final String[] n5 = new String[]{"jpeg", "gif", "png", "bmp", "pcx", "iff", "ras", "pbm", "pgm", "ppm", "psd", "swf"};
   public static final String[] l6 = new String[]{
      "image/jpeg",
      "image/gif",
      "image/png",
      "image/bmp",
      "image/pcx",
      "image/iff",
      "image/ras",
      "image/x-portable-bitmap",
      "image/x-portable-graymap",
      "image/x-portable-pixmap",
      "image/psd",
      "application/x-shockwave-flash"
   };
   private int u3;
   private int a6;
   private int u9;
   private int h0 = -1;
   private boolean c8;
   private int t2;
   private ImageInputStream s7;
   private long x8 = 0L;
   private boolean n3 = true;
   private List y4;
   private boolean e2;
   private int t9;
   private int z1;
   private int t4;
   private int q0;
   private int z3;
   private static int[] m1 = null;
   private static HashMap<Long, Integer> k7 = null;
   private static final int[] m3 = new int[]{
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
   static SortedMap<Integer, Integer> k5 = new TreeMap<>();
   private static int[] z8 = new int[8193];

   private void n5(String var1) {
      if (this.y4 == null) {
         this.y4 = new ArrayList();
      }

      this.y4.add(var1);
   }

   public boolean n5() {
      this.t2 = -1;
      this.u3 = -1;
      this.a6 = -1;
      this.u9 = -1;
      this.t9 = 1;
      this.z1 = -1;
      this.t4 = -1;
      this.y4 = null;

      try {
         int var1 = this.t9() & 0xFF;
         int var2 = this.t9() & 0xFF;
         if (var1 == 71 && var2 == 73) {
            return this.h0();
         } else if (var1 == 137 && var2 == 80) {
            return this.x8();
         } else if (var1 == 255 && var2 == 216) {
            return this.t2();
         } else if (var1 == 66 && var2 == 77) {
            return this.u9();
         } else if (var1 == 10 && var2 < 6) {
            return this.s7();
         } else if (var1 == 70 && var2 == 79) {
            return this.c8();
         } else if (var1 == 89 && var2 == 166) {
            return this.y4();
         } else if (var1 == 80 && var2 >= 49 && var2 <= 54) {
            return this.l6(var2 - 48);
         } else if (var1 == 56 && var2 == 66) {
            return this.n3();
         } else {
            return var1 == 70 && var2 == 87 ? this.e2() : false;
         }
      } catch (IOException var3) {
         return false;
      }
   }

   private boolean u9() throws IOException {
      byte[] var1 = new byte[44];
      if (this.n5(var1) != var1.length) {
         return false;
      }

      this.u3 = this.l6(var1, 16);
      this.a6 = this.l6(var1, 20);
      if (this.u3 >= 1 && this.a6 >= 1) {
         this.u9 = this.u3(var1, 26);
         if (this.u9 != 1 && this.u9 != 4 && this.u9 != 8 && this.u9 != 16 && this.u9 != 24 && this.u9 != 32) {
            return false;
         }

         int var2 = (int)(this.l6(var1, 36) * 0.0254);
         if (var2 > 0) {
            this.u9(var2);
         }

         int var3 = (int)(this.l6(var1, 40) * 0.0254);
         if (var3 > 0) {
            this.a6(var3);
         }

         this.t2 = 3;
         return true;
      } else {
         return false;
      }
   }

   private boolean h0() throws IOException {
      byte[] var1 = new byte[]{70, 56, 55, 97};
      byte[] var2 = new byte[]{70, 56, 57, 97};
      byte[] var3 = new byte[11];
      if (this.n5(var3) != 11) {
         return false;
      }

      if (!this.n5(var3, 0, var2, 0, 4) && !this.n5(var3, 0, var1, 0, 4)) {
         return false;
      }

      this.t2 = 1;
      this.u3 = this.u3(var3, 4);
      this.a6 = this.u3(var3, 6);
      int var4 = var3[8] & 255;
      this.u9 = (var4 >> 4 & 7) + 1;
      this.c8 = (var4 & 2) != 0;
      if (!this.e2) {
         return true;
      }

      if ((var4 & 128) != 0) {
         int var5 = (1 << (var4 & 7) + 1) * 3;
         this.h0(var5);
      }

      this.t9 = 0;

      int var12;
      label111:
      do {
         var12 = this.t9();
         switch (var12) {
            case 33:
               int var13 = this.t9();
               if (this.n3 && var13 == 254) {
                  StringBuilder var15 = new StringBuilder();

                  while (true) {
                     int var8 = this.t9();
                     if (var8 == -1) {
                        return false;
                     }

                     if (var8 > 0) {
                        for (int var9 = 0; var9 < var8; var9++) {
                           int var10 = this.t9();
                           if (var10 == -1) {
                              return false;
                           }

                           var15.append((char)var10);
                        }
                     }

                     if (var8 <= 0) {
                        continue label111;
                     }
                  }
               } else {
                  while (true) {
                     int var14 = this.t9();
                     if (var14 > 0) {
                        this.h0(var14);
                     } else if (var14 == -1) {
                        return false;
                     }

                     if (var14 <= 0) {
                        continue label111;
                     }
                  }
               }
            case 44:
               if (this.n5(var3, 0, 9) != 9) {
                  return false;
               }

               var4 = var3[8] & 255;
               int var6 = (var4 & 7) + 1;
               if (var6 > this.u9) {
                  this.u9 = var6;
               }

               if ((var4 & 128) != 0) {
                  this.h0((1 << var6) * 3);
               }

               this.h0(1);

               int var7;
               do {
                  var7 = this.t9();
                  if (var7 > 0) {
                     this.h0(var7);
                  } else if (var7 == -1) {
                     return false;
                  }
               } while (var7 > 0);

               this.t9++;
            case 59:
               break;
            default:
               return false;
         }
      } while (var12 != 59);

      return true;
   }

   private boolean c8() throws IOException {
      byte[] var1 = new byte[10];
      if (this.n5(var1, 0, 10) != 10) {
         return false;
      }

      byte[] var2 = new byte[]{82, 77};
      if (!this.n5(var1, 0, var2, 0, 2)) {
         return false;
      }

      int var3 = this.n5(var1, 6);
      if (var3 != 1229734477 && var3 != 1346522400) {
         return false;
      }

      while (this.n5(var1, 0, 8) == 8) {
         int var4 = this.n5(var1, 0);
         int var5 = this.n5(var1, 4);
         if ((var5 & 1) == 1) {
            var5++;
         }

         if (var4 == 1112361028) {
            if (this.n5(var1, 0, 9) != 9) {
               return false;
            }

            this.t2 = 5;
            this.u3 = this.k5(var1, 0);
            this.a6 = this.k5(var1, 2);
            this.u9 = var1[8] & 255;
            return this.u3 > 0 && this.a6 > 0 && this.u9 > 0 && this.u9 < 33;
         }

         this.h0(var5);
      }

      return false;
   }

   private boolean t2() throws IOException {
      byte[] var1 = new byte[12];

      while (this.n5(var1, 0, 4) == 4) {
         int var2 = this.k5(var1, 0);
         int var3 = this.k5(var1, 2);
         if ((var2 & 0xFF00) != 65280) {
            return false;
         }

         if (var2 == 65504) {
            if (var3 < 14) {
               return false;
            }

            if (this.n5(var1, 0, 12) != 12) {
               return false;
            }

            byte[] var8 = new byte[]{74, 70, 73, 70, 0};
            if (this.n5(var8, 0, var1, 0, 5)) {
               if (var1[7] == 1) {
                  this.u9(this.k5(var1, 8));
                  this.a6(this.k5(var1, 10));
               } else if (var1[7] == 2) {
                  int var10 = this.k5(var1, 8);
                  int var6 = this.k5(var1, 10);
                  this.u9((int)(var10 * 2.54F));
                  this.a6((int)(var6 * 2.54F));
               }
            }

            this.h0(var3 - 14);
         } else if (this.n3 && var3 > 2 && var2 == 65534) {
            var3 -= 2;
            byte[] var4 = new byte[var3];
            if (this.n5(var4, 0, var3) != var3) {
               return false;
            }

            String var5 = new String(var4, "iso-8859-1");
            var5 = var5.trim();
            this.n5(var5);
         } else {
            if (var2 >= 65472 && var2 <= 65487 && var2 != 65476 && var2 != 65480) {
               if (this.n5(var1, 0, 6) != 6) {
                  return false;
               }

               this.t2 = 0;
               this.u9 = (var1[0] & 255) * (var1[5] & 255);
               this.c8 = var2 == 65474 || var2 == 65478 || var2 == 65482 || var2 == 65486;
               this.u3 = this.k5(var1, 3);
               this.a6 = this.k5(var1, 1);
               return true;
            }

            this.h0(var3 - 2);
         }
      }

      return false;
   }

   private boolean s7() throws IOException {
      byte[] var1 = new byte[64];
      if (this.n5(var1) != var1.length) {
         return false;
      }

      if (var1[0] != 1) {
         return false;
      }

      int var2 = this.u3(var1, 2);
      int var3 = this.u3(var1, 4);
      int var4 = this.u3(var1, 6);
      int var5 = this.u3(var1, 8);
      if (var2 >= 0 && var4 >= var2 && var3 >= 0 && var5 >= var3) {
         this.u3 = var4 - var2 + 1;
         this.a6 = var5 - var3 + 1;
         byte var6 = var1[1];
         byte var7 = var1[63];
         if (var7 != 1 || var6 != 1 && var6 != 2 && var6 != 4 && var6 != 8) {
            if (var7 != 3 || var6 != 8) {
               return false;
            }

            this.u9 = 24;
         } else {
            this.u9 = var6;
         }

         this.u9(this.u3(var1, 10));
         this.a6(this.u3(var1, 10));
         this.t2 = 4;
         return true;
      } else {
         return false;
      }
   }

   private boolean x8() throws IOException {
      byte[] var1 = new byte[]{78, 71, 13, 10, 26, 10};
      byte[] var2 = new byte[27];
      if (this.n5(var2) != 27) {
         return false;
      }

      if (!this.n5(var2, 0, var1, 0, 6)) {
         return false;
      }

      this.t2 = 2;
      this.u3 = this.n5(var2, 14);
      this.a6 = this.n5(var2, 18);
      this.u9 = var2[22] & 255;
      this.h0 = var2[23] & 255;
      if (this.h0 == 2 || this.h0 == 6) {
         this.u9 *= 3;
      }

      this.c8 = (var2[26] & 255) != 0;
      return true;
   }

   private boolean l6(int var1) throws IOException {
      if (var1 >= 1 && var1 <= 6) {
         int[] var2 = new int[]{7, 8, 9};
         this.t2 = var2[(var1 - 1) % 3];
         boolean var3 = false;

         while (true) {
            String var4 = this.z1();
            if (var4 != null) {
               var4 = var4.trim();
            }

            if (var4 != null && var4.length() >= 1) {
               if (var4.charAt(0) != '#') {
                  if (var3) {
                     int var12;
                     try {
                        var12 = Integer.parseInt(var4);
                     } catch (NumberFormatException var9) {
                        return false;
                     }

                     if (var12 < 0) {
                        return false;
                     }

                     for (int var13 = 0; var13 < 25; var13++) {
                        if (var12 < 1 << var13 + 1) {
                           this.u9 = var13 + 1;
                           if (this.t2 == 9) {
                              this.u9 *= 3;
                           }

                           return true;
                        }
                     }

                     return false;
                  }

                  int var5 = var4.indexOf(32);
                  if (var5 == -1) {
                     return false;
                  }

                  String var6 = var4.substring(0, var5);
                  var5 = var4.lastIndexOf(32);
                  if (var5 == -1) {
                     return false;
                  }

                  String var7 = var4.substring(var5 + 1);

                  try {
                     this.u3 = Integer.parseInt(var6);
                     this.a6 = Integer.parseInt(var7);
                  } catch (NumberFormatException var10) {
                     return false;
                  }

                  if (this.u3 < 1 || this.a6 < 1) {
                     return false;
                  }

                  if (this.t2 == 7) {
                     this.u9 = 1;
                     return true;
                  }

                  var3 = true;
               } else if (this.n3 && var4.length() > 1) {
                  this.n5(var4.substring(1));
               }
            }
         }
      } else {
         return false;
      }
   }

   private boolean n3() throws IOException {
      byte[] var1 = new byte[24];
      if (this.n5(var1) != var1.length) {
         return false;
      }

      byte[] var2 = new byte[]{80, 83};
      if (!this.n5(var1, 0, var2, 0, 2)) {
         return false;
      }

      this.t2 = 10;
      this.u3 = this.n5(var1, 16);
      this.a6 = this.n5(var1, 12);
      int var3 = this.k5(var1, 10);
      int var4 = this.k5(var1, 20);
      this.u9 = var3 * var4;
      return this.u3 > 0 && this.a6 > 0 && this.u9 > 0 && this.u9 <= 64;
   }

   private boolean y4() throws IOException {
      byte[] var1 = new byte[14];
      if (this.n5(var1) != var1.length) {
         return false;
      }

      byte[] var2 = new byte[]{106, -107};
      if (!this.n5(var1, 0, var2, 0, 2)) {
         return false;
      }

      this.t2 = 6;
      this.u3 = this.n5(var1, 2);
      this.a6 = this.n5(var1, 6);
      this.u9 = this.n5(var1, 10);
      return this.u3 > 0 && this.a6 > 0 && this.u9 > 0 && this.u9 <= 24;
   }

   private boolean e2() throws IOException {
      byte[] var1 = new byte[6];
      if (this.n5(var1) != var1.length) {
         return false;
      }

      this.t2 = 11;
      int var2 = (int)this.k5(5);
      int var3 = this.u3(var2);
      int var4 = this.u3(var2);
      int var5 = this.u3(var2);
      int var6 = this.u3(var2);
      this.u3 = var4 / 20;
      this.a6 = var6 / 20;
      this.u9(72);
      this.a6(72);
      return this.u3 > 0 && this.a6 > 0;
   }

   public static boolean n5(t4 var0) {
      byte var1 = 64;
      byte[] var2 = new byte[64];

      try {
         var0.read(var2, 0, var2.length);
         var0.seek(0L, 0);
      } catch (Exception var4) {
         return false;
      }

      if (com.aspose.slides.internal.l1b.k5.u3(var2, 0) == 1 && com.aspose.slides.internal.l1b.k5.u3(var2, 40) == 1179469088) {
         return true;
      }

      short var3 = com.aspose.slides.internal.l1b.k5.l6(var2, 0);
      return var3 > 0 && var3 <= 8 || var3 == -12841;
   }

   private boolean n5(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      while (var5-- > 0) {
         if (var1[var2++] != var3[var4++]) {
            return false;
         }
      }

      return true;
   }

   private int n5(byte[] var1, int var2) {
      return (var1[var2] & 0xFF) << 24 | (var1[var2 + 1] & 0xFF) << 16 | (var1[var2 + 2] & 0xFF) << 8 | var1[var2 + 3] & 0xFF;
   }

   private int l6(byte[] var1, int var2) {
      return (var1[var2 + 3] & 0xFF) << 24 | (var1[var2 + 2] & 0xFF) << 16 | (var1[var2 + 1] & 0xFF) << 8 | var1[var2] & 0xFF;
   }

   public int l6() {
      return this.z1;
   }

   public int k5() {
      return this.t4;
   }

   private int k5(byte[] var1, int var2) {
      return (var1[var2] & 0xFF) << 8 | var1[var2 + 1] & 0xFF;
   }

   private int u3(byte[] var1, int var2) {
      return var1[var2] & 0xFF | (var1[var2 + 1] & 0xFF) << 8;
   }

   private int t9() throws IOException {
      return this.s7.readByte();
   }

   private int n5(byte[] var1) throws IOException {
      this.s7.readFully(var1);
      return var1.length;
   }

   private int n5(byte[] var1, int var2, int var3) throws IOException {
      this.s7.readFully(var1, var2, var3);
      return var3;
   }

   private String z1() throws IOException {
      return this.n5(new StringBuilder());
   }

   private String n5(StringBuilder var1) throws IOException {
      boolean var3;
      do {
         int var2 = this.t9();
         var3 = var2 == -1 || var2 == 10;
         if (!var3) {
            var1.append((char)var2);
         }
      } while (!var3);

      return var1.toString();
   }

   private long k5(int var1) throws IOException {
      if (var1 == 0) {
         return 0L;
      }

      int var2 = var1;
      long var3 = 0L;
      if (this.z3 == 0) {
         this.q0 = this.s7.readByte();
         this.z3 = 8;
      }

      while (true) {
         int var5 = var2 - this.z3;
         if (var5 <= 0) {
            var3 |= this.q0 >> -var5;
            this.z3 -= var2;
            this.q0 = this.q0 & 255 >> 8 - this.z3;
            return var3;
         }

         var3 |= this.q0 << var5;
         var2 -= this.z3;
         this.q0 = this.s7.readByte();
         this.z3 = 8;
      }
   }

   private int u3(int var1) throws IOException {
      long var2 = this.k5(var1);
      if ((var2 & 1L << var1 - 1) != 0L) {
         var2 |= -1L << var1;
      }

      return (int)var2;
   }

   public void n5(ImageInputStream var1) {
      this.s7 = var1;

      try {
         this.x8 = this.s7.getStreamPosition();
      } catch (IOException var3) {
         throw new com.aspose.slides.exceptions.IOException("I/O error occurred", var3);
      }
   }

   private void a6(int var1) {
      this.t4 = var1;
   }

   private void u9(int var1) {
      this.z1 = var1;
   }

   private void h0(int var1) throws IOException {
      while (var1 > 0) {
         long var2 = this.s7.skipBytes(var1);
         if (var2 > 0L) {
            var1 = (int)(var1 - var2);
         }
      }
   }

   public static float[] l6(ImageInputStream var0) {
      float[] var5;
      try {
         int var1 = var0.getBitOffset();
         long var2 = var0.getStreamPosition();
         var0.setBitOffset(0);
         var0.seek(var0.getFlushedPosition());
         u3 var4 = new u3();
         var4.n5(var0);
         if (var4.n5()) {
            var5 = new float[]{var4.k5(), var4.l6()};
         } else {
            var5 = new float[0];
         }

         var0.setBitOffset(var1);
         var0.seek(var2);
      } catch (IOException var6) {
         var5 = new float[0];
      }

      return var5;
   }

   public static int[] u3() {
      if (m1 == null) {
         t4 var0 = ResourcesLoader.loadResource("System.Drawing.Imaging", "convert8to64PArgb.dat");
         m1 = new int[(int)(var0.getLength() / 2L)];
         com.aspose.slides.internal.z0k.n5 var1 = new com.aspose.slides.internal.z0k.n5(var0);

         for (int var2 = 0; var2 < m1.length; var2++) {
            m1[var2] = var1.k7();
         }

         var1.n3();
      }

      return m1;
   }

   private static HashMap<Long, Integer> t4() {
      if (k7 == null) {
         t4 var0 = ResourcesLoader.loadResource("System.Drawing.Imaging", "convert64PArgbto8.dat");
         int var1 = (int)(var0.getLength() / 6L);
         k7 = new HashMap<>(var1);
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var0);

         for (int var3 = 0; var3 < var1; var3++) {
            long var4 = var2.c4();
            int var6 = var2.r4();
            k7.put(var4, var6);
         }

         var2.n3();
      }

      return k7;
   }

   public static int n5(long var0) {
      Integer var2 = t4().get(var0);
      if (var2 == null) {
         throw new IllegalStateException("Unknown 64PArgb bytes");
      } else {
         return var2;
      }
   }

   public static int n5(byte var0) {
      return m3[var0 & 0xFF];
   }

   public static byte n5(int var0) {
      if (var0 < 0) {
         throw new IllegalArgumentException("colorComponent16bit must be not negative");
      } else if (var0 <= 8192) {
         return (byte)z8[var0];
      } else {
         return (byte)(var0 <= 32767 ? -1 : 0);
      }
   }

   public static BufferedImage n5(BufferedImage var0, int var1, int var2, int var3, int var4) {
      if (l6(var0, var1, var2, var3, var4)) {
         return a6(var0);
      }

      BufferedImage var5 = var0.getSubimage(var1, var2, var3, var4);
      WritableRaster var6 = var5.getRaster();
      WritableRaster var7 = var6.createCompatibleWritableRaster();
      var7.setDataElements(0, 0, var6);
      return new BufferedImage(var5.getColorModel(), var7, var5.getColorModel().isAlphaPremultiplied(), null);
   }

   private static boolean l6(BufferedImage var0, int var1, int var2, int var3, int var4) {
      return var1 == 0 && var2 == 0 && var3 == var0.getWidth() && var4 == var0.getHeight() && u3(var0);
   }

   private static boolean u3(BufferedImage var0) {
      return n5(var0.getRaster().getDataBuffer());
   }

   private static boolean n5(DataBuffer var0) {
      return var0 instanceof DataBufferByte
         || var0 instanceof DataBufferShort
         || var0 instanceof DataBufferUShort
         || var0 instanceof DataBufferInt
         || var0 instanceof DataBufferFloat
         || var0 instanceof DataBufferDouble;
   }

   private static BufferedImage a6(BufferedImage var0) {
      WritableRaster var1 = var0.getRaster();
      WritableRaster var2 = var1.createCompatibleWritableRaster();
      DataBuffer var3 = var1.getDataBuffer();
      DataBuffer var4 = var2.getDataBuffer();
      n5(var3, var4);
      return new BufferedImage(var0.getColorModel(), var2, var0.getColorModel().isAlphaPremultiplied(), null);
   }

   private static void n5(DataBuffer var0, DataBuffer var1) {
      if (var0 instanceof DataBufferByte) {
         DataBufferByte var2 = (DataBufferByte)var0;
         DataBufferByte var3 = (DataBufferByte)var1;
         System.arraycopy(var2.getData(), 0, var3.getData(), 0, var2.getData().length);
      } else if (var0 instanceof DataBufferShort) {
         DataBufferShort var4 = (DataBufferShort)var0;
         DataBufferShort var9 = (DataBufferShort)var1;
         System.arraycopy(var4.getData(), 0, var9.getData(), 0, var4.getData().length);
      } else if (var0 instanceof DataBufferUShort) {
         DataBufferUShort var5 = (DataBufferUShort)var0;
         DataBufferUShort var10 = (DataBufferUShort)var1;
         System.arraycopy(var5.getData(), 0, var10.getData(), 0, var5.getData().length);
      } else if (var0 instanceof DataBufferInt) {
         DataBufferInt var6 = (DataBufferInt)var0;
         DataBufferInt var11 = (DataBufferInt)var1;
         System.arraycopy(var6.getData(), 0, var11.getData(), 0, var6.getData().length);
      } else if (var0 instanceof DataBufferFloat) {
         DataBufferFloat var7 = (DataBufferFloat)var0;
         DataBufferFloat var12 = (DataBufferFloat)var1;
         System.arraycopy(var7.getData(), 0, var12.getData(), 0, var7.getData().length);
      } else {
         if (!(var0 instanceof DataBufferDouble)) {
            throw new ArgumentOutOfRangeException("Unexpected type of DataBuffer: " + var0.getClass().getName());
         }

         DataBufferDouble var8 = (DataBufferDouble)var0;
         DataBufferDouble var13 = (DataBufferDouble)var1;
         System.arraycopy(var8.getData(), 0, var13.getData(), 0, var8.getData().length);
      }
   }

   public static BufferedImage n5(BufferedImage var0) {
      WritableRaster var1 = var0.getRaster();
      WritableRaster var2 = var1.createCompatibleWritableRaster();
      BufferedImage var3 = new BufferedImage(var0.getColorModel(), var2, var0.isAlphaPremultiplied(), null);
      int var4 = var0.getWidth();
      int var5 = var0.getHeight();
      Object var6 = null;

      for (int var7 = 0; var7 < var5; var7++) {
         var6 = var1.getDataElements(0, var5 - var7 - 1, var4, 1, var6);
         var2.setDataElements(0, var7, var4, 1, var6);
      }

      return var3;
   }

   public static BufferedImage l6(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
      n5(var0, var1);
      return var1;
   }

   public static BufferedImage k5(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(), var0.getHeight(), 6);
      n5(var0, var1);
      return var1;
   }

   public static void n5(BufferedImage var0, BufferedImage var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int[] var4 = var0.getRGB(0, 0, var2, var3, null, 0, var2);
      var1.setRGB(0, 0, var2, var3, var4, 0, var2);
   }

   public static boolean a6() {
      return !com.aspose.slides.internal.t9p.k5.s0
         ? true
         : !com.aspose.slides.internal.t9p.k5.j3
            && !com.aspose.slides.internal.t9p.k5.n1
            && !com.aspose.slides.internal.t9p.k5.d1
            && !com.aspose.slides.internal.t9p.k5.p6
            && !com.aspose.slides.internal.t9p.k5.s4
            && !com.aspose.slides.internal.t9p.k5.h6
            && !com.aspose.slides.internal.t9p.k5.y8
            && !com.aspose.slides.internal.t9p.k5.v8
            && !com.aspose.slides.internal.t9p.k5.v3
            && !com.aspose.slides.internal.t9p.k5.g7;
   }

   public static byte[] k5(ImageInputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[10240];
      int var3 = 0;

      while ((var3 = var0.read(var2)) >= 0) {
         var1.write(var2, 0, var3);
      }

      var1.close();
      return var1.toByteArray();
   }

   public static e2 u3(ImageInputStream var0) throws IOException {
      return new e2(k5(var0));
   }

   public static InputStream l6(t4 var0) {
      if (var0 instanceof e2) {
         return new ByteArrayInputStream(((e2)var0).toArray());
      }

      try {
         e2 var1 = null;

         try {
            var1 = com.aspose.slides.internal.l6o.l6.n5(var0);
            return new ByteArrayInputStream(var1.toArray());
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } finally {
         var0.dispose();
      }
   }

   public static InputStream a6(ImageInputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[10240];
      int var3 = 0;

      while ((var3 = var0.read(var2)) >= 0) {
         var1.write(var2, 0, var3);
      }

      var1.close();
      byte[] var4 = var1.toByteArray();
      Object var5 = null;
      return new ByteArrayInputStream(var4);
   }

   static {
      k5.put(0, 0);
      k5.put(2, 1);
      k5.put(5, 2);
      k5.put(7, 3);
      k5.put(10, 4);
      k5.put(12, 5);
      k5.put(15, 6);
      k5.put(17, 7);
      k5.put(20, 8);
      k5.put(22, 9);
      k5.put(25, 10);
      k5.put(27, 11);
      k5.put(30, 12);
      k5.put(33, 13);
      k5.put(36, 14);
      k5.put(39, 15);
      k5.put(42, 16);
      k5.put(46, 17);
      k5.put(50, 18);
      k5.put(53, 19);
      k5.put(57, 20);
      k5.put(61, 21);
      k5.put(66, 22);
      k5.put(70, 23);
      k5.put(75, 24);
      k5.put(80, 25);
      k5.put(85, 26);
      k5.put(90, 27);
      k5.put(95, 28);
      k5.put(101, 29);
      k5.put(106, 30);
      k5.put(112, 31);
      k5.put(118, 32);
      k5.put(125, 33);
      k5.put(131, 34);
      k5.put(138, 35);
      k5.put(145, 36);
      k5.put(152, 37);
      k5.put(159, 38);
      k5.put(166, 39);
      k5.put(174, 40);
      k5.put(182, 41);
      k5.put(190, 42);
      k5.put(198, 43);
      k5.put(206, 44);
      k5.put(215, 45);
      k5.put(224, 46);
      k5.put(233, 47);
      k5.put(242, 48);
      k5.put(252, 49);
      k5.put(261, 50);
      k5.put(271, 51);
      k5.put(281, 52);
      k5.put(292, 53);
      k5.put(302, 54);
      k5.put(313, 55);
      k5.put(324, 56);
      k5.put(335, 57);
      k5.put(347, 58);
      k5.put(358, 59);
      k5.put(370, 60);
      k5.put(382, 61);
      k5.put(395, 62);
      k5.put(407, 63);
      k5.put(420, 64);
      k5.put(433, 65);
      k5.put(446, 66);
      k5.put(460, 67);
      k5.put(474, 68);
      k5.put(488, 69);
      k5.put(502, 70);
      k5.put(516, 71);
      k5.put(531, 72);
      k5.put(546, 73);
      k5.put(561, 74);
      k5.put(576, 75);
      k5.put(592, 76);
      k5.put(608, 77);
      k5.put(624, 78);
      k5.put(641, 79);
      k5.put(657, 80);
      k5.put(674, 81);
      k5.put(691, 82);
      k5.put(709, 83);
      k5.put(726, 84);
      k5.put(744, 85);
      k5.put(762, 86);
      k5.put(781, 87);
      k5.put(799, 88);
      k5.put(818, 89);
      k5.put(838, 90);
      k5.put(857, 91);
      k5.put(877, 92);
      k5.put(897, 93);
      k5.put(917, 94);
      k5.put(937, 95);
      k5.put(958, 96);
      k5.put(979, 97);
      k5.put(1001, 98);
      k5.put(1022, 99);
      k5.put(1044, 100);
      k5.put(1066, 101);
      k5.put(1088, 102);
      k5.put(1111, 103);
      k5.put(1134, 104);
      k5.put(1157, 105);
      k5.put(1181, 106);
      k5.put(1204, 107);
      k5.put(1228, 108);
      k5.put(1253, 109);
      k5.put(1277, 110);
      k5.put(1302, 111);
      k5.put(1327, 112);
      k5.put(1353, 113);
      k5.put(1378, 114);
      k5.put(1404, 115);
      k5.put(1431, 116);
      k5.put(1457, 117);
      k5.put(1484, 118);
      k5.put(1511, 119);
      k5.put(1539, 120);
      k5.put(1566, 121);
      k5.put(1594, 122);
      k5.put(1623, 123);
      k5.put(1651, 124);
      k5.put(1680, 125);
      k5.put(1709, 126);
      k5.put(1739, 127);
      k5.put(1768, 128);
      k5.put(1798, 129);
      k5.put(1829, 130);
      k5.put(1859, 131);
      k5.put(1890, 132);
      k5.put(1921, 133);
      k5.put(1953, 134);
      k5.put(1985, 135);
      k5.put(2017, 136);
      k5.put(2049, 137);
      k5.put(2082, 138);
      k5.put(2115, 139);
      k5.put(2148, 140);
      k5.put(2182, 141);
      k5.put(2216, 142);
      k5.put(2250, 143);
      k5.put(2285, 144);
      k5.put(2320, 145);
      k5.put(2355, 146);
      k5.put(2390, 147);
      k5.put(2426, 148);
      k5.put(2462, 149);
      k5.put(2498, 150);
      k5.put(2535, 151);
      k5.put(2572, 152);
      k5.put(2610, 153);
      k5.put(2647, 154);
      k5.put(2685, 155);
      k5.put(2723, 156);
      k5.put(2762, 157);
      k5.put(2801, 158);
      k5.put(2840, 159);
      k5.put(2880, 160);
      k5.put(2920, 161);
      k5.put(2960, 162);
      k5.put(3000, 163);
      k5.put(3041, 164);
      k5.put(3082, 165);
      k5.put(3124, 166);
      k5.put(3166, 167);
      k5.put(3208, 168);
      k5.put(3250, 169);
      k5.put(3293, 170);
      k5.put(3336, 171);
      k5.put(3380, 172);
      k5.put(3423, 173);
      k5.put(3467, 174);
      k5.put(3512, 175);
      k5.put(3557, 176);
      k5.put(3602, 177);
      k5.put(3647, 178);
      k5.put(3693, 179);
      k5.put(3739, 180);
      k5.put(3785, 181);
      k5.put(3832, 182);
      k5.put(3879, 183);
      k5.put(3927, 184);
      k5.put(3974, 185);
      k5.put(4022, 186);
      k5.put(4071, 187);
      k5.put(4120, 188);
      k5.put(4169, 189);
      k5.put(4218, 190);
      k5.put(4268, 191);
      k5.put(4318, 192);
      k5.put(4369, 193);
      k5.put(4419, 194);
      k5.put(4471, 195);
      k5.put(4522, 196);
      k5.put(4574, 197);
      k5.put(4626, 198);
      k5.put(4679, 199);
      k5.put(4732, 200);
      k5.put(4785, 201);
      k5.put(4838, 202);
      k5.put(4892, 203);
      k5.put(4947, 204);
      k5.put(5001, 205);
      k5.put(5056, 206);
      k5.put(5111, 207);
      k5.put(5167, 208);
      k5.put(5223, 209);
      k5.put(5280, 210);
      k5.put(5336, 211);
      k5.put(5393, 212);
      k5.put(5451, 213);
      k5.put(5509, 214);
      k5.put(5567, 215);
      k5.put(5625, 216);
      k5.put(5684, 217);
      k5.put(5743, 218);
      k5.put(5803, 219);
      k5.put(5863, 220);
      k5.put(5923, 221);
      k5.put(5984, 222);
      k5.put(6045, 223);
      k5.put(6106, 224);
      k5.put(6168, 225);
      k5.put(6230, 226);
      k5.put(6293, 227);
      k5.put(6356, 228);
      k5.put(6419, 229);
      k5.put(6482, 230);
      k5.put(6546, 231);
      k5.put(6611, 232);
      k5.put(6675, 233);
      k5.put(6740, 234);
      k5.put(6806, 235);
      k5.put(6871, 236);
      k5.put(6938, 237);
      k5.put(7004, 238);
      k5.put(7071, 239);
      k5.put(7138, 240);
      k5.put(7206, 241);
      k5.put(7274, 242);
      k5.put(7342, 243);
      k5.put(7411, 244);
      k5.put(7480, 245);
      k5.put(7550, 246);
      k5.put(7619, 247);
      k5.put(7690, 248);
      k5.put(7760, 249);
      k5.put(7831, 250);
      k5.put(7903, 251);
      k5.put(7974, 252);
      k5.put(8047, 253);
      k5.put(8119, 254);
      k5.put(8192, 255);

      for (int var0 = 0; var0 < z8.length; var0++) {
         Integer var1 = k5.get(var0);
         if (var1 != null) {
            z8[var0] = var1;
         } else {
            z8[var0] = z8[var0 - 1];
         }
      }
   }
}
