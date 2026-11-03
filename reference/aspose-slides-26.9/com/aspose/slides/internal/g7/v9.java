package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class v9 {
   private byte[] n5;
   private byte[] l6;
   private byte[] k5;
   private t4 u3;
   private t4 a6;
   private t4 u9;

   public v9(byte[] var1, byte[] var2, byte[] var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = new t4(var1);
      this.a6 = new t4(var2);
      this.u9 = new t4(var3);
   }

   public final v9$l6 n5(int var1, s8 var2) {
      v9$k5[] var3 = this.n5(var1);
      long var4 = 0L;
      boolean var6 = false;

      for (int var7 = 0; var7 < var1; var7++) {
         if (((var4 & 4294967295L) / 2L & 4294967295L) > 65535L) {
            var6 = true;
            break;
         }

         var4 = (var4 & 4294967295L) + (var3[var7].n5() + 4 - 1 & -4 & 4294967295L) & 4294967295L;
      }

      return this.n5(var3, var6, var2);
   }

   private v9$l6 n5(v9$k5[] var1, boolean var2, s8 var3) {
      v9$k5 var4 = var1[0];
      v9$l6 var5 = new v9$l6();
      var5.n5 = n5(var1);
      var5.l6 = var2;
      var5.k5 = n5(var2, var1);
      var5.u3 = var4.a6;
      var5.a6 = var4.u9;
      var5.h0 = var4.k5;
      var5.h0 = var4.u3;
      var5.c8 = var4.c8.length & 65535;
      v9$n5 var6 = com.aspose.slides.internal.v6g.k5.n5(var4, v9$n5.class);
      if (var6 != null) {
         var5.t2 = var6.n5;
      }

      short var7 = var3.l6(0);
      int var8 = var3.n5(0);
      short var9 = (short)((var8 & 65535) - var7 - (var4.a6 - var4.k5));
      short var10 = (short)(var7 + (var4.a6 - var4.k5));
      var5.s7 = var7;
      var5.n3 = var8;
      var5.x8 = var9;
      var5.y4 = var10;

      for (int var11 = 1; var11 < var1.length; var11++) {
         var4 = var1[var11];
         if (var4.a6 > var5.u3) {
            var5.u3 = var4.a6;
         }

         if (var4.u9 > var5.a6) {
            var5.a6 = var4.u9;
         }

         if (var4.k5 < var5.u9) {
            var5.u9 = var4.k5;
         }

         if (var4.u3 < var5.h0) {
            var5.h0 = var4.u3;
         }

         if ((var5.c8 & 65535) < var4.c8.length) {
            var5.c8 = var4.c8.length & 65535;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var4, v9$n5.class)) {
            var5.t2 = ((v9$n5)var4).n5;
         }

         var7 = var3.l6(var11);
         var8 = var3.n5(var11);
         var9 = (short)((var8 & 65535) - var7 - (var4.a6 - var4.k5));
         var10 = (short)(var7 + (var4.a6 - var4.k5));
         if (var7 < var5.s7) {
            var5.s7 = var7;
         }

         if (var9 < var5.x8) {
            var5.x8 = var9;
         }

         if ((var8 & 65535) > (var5.n3 & 65535)) {
            var5.n3 = var8;
         }

         if (var10 > var5.y4) {
            var5.y4 = var10;
         }
      }

      return var5;
   }

   private static byte[] n5(v9$k5[] var0) {
      int var1 = 0;

      for (v9$k5 var5 : var0) {
         var1 += var5.n5() + 4 - 1 & -4;
      }

      byte[] var9 = new byte[var1];
      q0 var10 = new q0(var9);

      for (v9$k5 var7 : var0) {
         var7.n5(var10);
         int var8 = (var7.n5() + 4 - 1 & -4) - var7.n5();
         var10.n5(var10.n5() + var8);
      }

      return var9;
   }

   private static byte[] n5(boolean var0, v9$k5[] var1) {
      byte[] var2 = new byte[(var1.length + 1) * (var0 ? 4 : 2)];
      q0 var3 = new q0(var2);
      long var4 = 0L;

      for (int var6 = 0; var6 <= var1.length; var6++) {
         if (var0) {
            var3.n5(var4);
         } else {
            var3.k5((int)((var4 & 4294967295L) / 2L & 4294967295L & 65535L));
         }

         var4 = (var4 & 4294967295L) + ((var6 < var1.length ? var1[var6].n5() + 4 - 1 & -4 & 4294967295L : 0L) & 4294967295L) & 4294967295L;
      }

      return var2;
   }

   private v9$k5[] n5(int var1) {
      v9$k5[] var2 = new v9$k5[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         short var4 = this.u3.h0();
         var2[var3] = var4 < 0 ? this.n5() : this.n5(var4);
      }

      if (this.u3.n5() != this.u3.l6()) {
         throw new InvalidOperationException("Invalid length of glyph data array");
      }

      if (this.a6.n5() != this.a6.l6()) {
         throw new InvalidOperationException("Invalid length of glyph push data array");
      }

      if (this.u9.n5() != this.u9.l6()) {
         throw new InvalidOperationException("Invalid length of glyph instructions array");
      }

      this.u3.n5(0);
      this.a6.n5(0);
      this.u9.n5(0);
      return var2;
   }

   private v9$n5 n5() {
      v9$n5 var1 = new v9$n5();
      var1.k5 = this.u3.h0();
      var1.u3 = this.u3.h0();
      var1.a6 = this.u3.h0();
      var1.u9 = this.u3.h0();
      int var2 = this.u3.n5();

      int var3;
      do {
         var1.n5++;
         var3 = this.u3.u9();
         this.u3.n5(this.u3.n5() + 2);
         if ((var3 & 65535 & 1) == 1) {
            this.u3.n5(this.u3.n5() + 4);
         } else {
            this.u3.n5(this.u3.n5() + 2);
         }

         if ((var3 & 65535 & 8) == 8) {
            this.u3.n5(this.u3.n5() + 2);
         } else if ((var3 & 65535 & 64) == 64) {
            this.u3.n5(this.u3.n5() + 4);
         } else if ((var3 & 65535 & 128) == 128) {
            this.u3.n5(this.u3.n5() + 8);
         }
      } while ((var3 & 65535 & 32) == 32);

      var1.h0 = new byte[this.u3.n5() - var2];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), var2, com.aspose.slides.ms.System.u3.n5((Object)(var1.h0)), 0, var1.h0.length);
      if ((var3 & 65535 & 256) == 256) {
         this.n5(var1);
      }

      return var1;
   }

   private v9$a6 n5(short var1) {
      v9$u3 var2 = new v9$u3();
      var2.n5 = 32767;
      var2.l6 = 32767;
      v9$u3 var3 = new v9$u3();
      var3.n5 = -32768;
      var3.l6 = -32768;
      boolean var4 = false;
      if (var1 == 32767) {
         var1 = this.u3.h0();
         var2.n5 = this.u3.h0();
         var2.l6 = this.u3.h0();
         var3.n5 = this.u3.h0();
         var3.l6 = this.u3.h0();
         var4 = true;
      }

      v9$a6 var5 = new v9$a6(null);
      var5.l6 = var1;
      var5.n5 = new int[var1];
      int var6 = 0;

      for (int var7 = 0; var7 < var1; var7++) {
         int var8 = n5(this.u3);
         var6 = (var6 & 65535) + (var8 & 65535) & 65535;
         var5.n5[var7] = var6;
      }

      if ((var6 & 65535) > 0 || var1 > 0) {
         var6++;
      }

      var5.h0 = new byte[var6 & 65535];
      var5.t2 = new short[var6 & 65535];
      var5.s7 = new short[var6 & 65535];
      byte[] var13 = new byte[var6 & 65535];

      for (int var14 = 0; var14 < (var6 & 65535); var14++) {
         var13[var14] = this.u3.c8();
      }

      v9$u3 var15 = new v9$u3();

      for (int var9 = 0; var9 < (var6 & 65535); var9++) {
         byte var10 = 0;
         byte[] var11 = new byte[]{0};
         v9$u3 var12 = this.n5(var13[var9], var11).n5();
         var10 = var11[0];
         var5.h0[var9] = var10;
         var5.t2[var9] = var12.n5;
         var5.s7[var9] = var12.l6;
         var15.n5 = (short)(var15.n5 + var12.n5);
         var15.l6 = (short)(var15.l6 + var12.l6);
         if (!var4) {
            if (var2.n5 > var15.n5) {
               var2.n5 = var15.n5;
            }

            if (var2.l6 > var15.l6) {
               var2.l6 = var15.l6;
            }

            if (var3.n5 < var15.n5) {
               var3.n5 = var15.n5;
            }

            if (var3.l6 < var15.l6) {
               var3.l6 = var15.l6;
            }
         }
      }

      var5.k5 = var2.n5;
      var5.u3 = var2.l6;
      var5.a6 = var3.n5;
      var5.u9 = var3.l6;
      if (var1 > 0) {
         this.n5(var5);
      }

      return var5;
   }

   private void n5(v9$k5 var1) {
      int var2 = n5(this.u3);
      int var3 = n5(this.u3);
      byte[] var5;
      if ((var2 & 65535) > 0) {
         byte[] var4 = this.n5(this.l6(var2 & 65535));
         var5 = new byte[var4.length + (var3 & 65535)];

         int var6;
         for (var6 = 0; var6 < var4.length; var6++) {
            var5[var6] = var4[var6];
         }

         while (var6 < var5.length) {
            var5[var6] = this.u9.c8();
            var6++;
         }
      } else {
         var5 = new byte[var3 & 65535];

         for (int var7 = 0; var7 < (var3 & 65535); var7++) {
            var5[var7] = this.u9.c8();
         }
      }

      var1.c8 = var5;
   }

   private byte[] n5(short[] var1) {
      int var2 = 0;
      List var3 = new List();

      while (var2 < var1.length) {
         int[] var4 = new int[]{var2};
         var3.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.n5(var4, var1)))));
         var2 = var4[0];
      }

      return t2.n5(var3);
   }

   private byte[] n5(int[] var1, short[] var2) {
      byte var3 = -80;
      byte var4 = -72;
      byte var5 = 64;
      byte var6 = 65;
      boolean var7 = false;
      int var8 = var1[0];
      List var9 = new List(var2.length * 2);

      while (var1[0] < var2.length) {
         if (!var7) {
            if (var2[var1[0]] >= 0 && var2[var1[0]] <= 255) {
               n5(var9, (byte)var2[var1[0]]);
            } else {
               if (var8 != var1[0]) {
                  break;
               }

               var7 = true;
               n5(var9, var2[var1[0]]);
            }
         } else {
            if (var2[var1[0]] >= 0 && var2[var1[0]] <= 255) {
               break;
            }

            n5(var9, var2[var1[0]]);
         }

         var1[0]++;
      }

      byte var10 = (byte)(var1[0] - var8);
      byte var11;
      if (var7) {
         var11 = (var10 & 255) <= 8 ? (byte)(184 + (var10 & 255) - 1) : 65;
      } else {
         var11 = (var10 & 255) <= 8 ? (byte)(176 + (var10 & 255) - 1) : 64;
      }

      var9.insertItem(0, var11);
      if ((var10 & 255) > 8) {
         var9.insertItem(1, var10);
      }

      return t2.n5(var9);
   }

   private static void n5(List<Byte> var0, byte var1) {
      var0.addItem(var1);
   }

   private static void n5(List<Byte> var0, short var1) {
      var0.addItem((byte)(var1 >> 8 & 0xFF));
      var0.addItem((byte)(var1 & 0xFF));
   }

   private short[] l6(int var1) {
      short[] var2 = new short[var1];
      int var3 = 0;

      while (var3 < var1) {
         byte var4 = this.l6[this.a6.n5()];
         if (var4 == -5) {
            short var5 = var2[var3 - 2];
            this.a6.n5(this.a6.n5() + 1);
            var2[var3++] = var5;
            var2[var3++] = l6(this.a6);
            var2[var3++] = var5;
         } else if (var4 == -4) {
            short var12 = var2[var3 - 2];
            this.a6.n5(this.a6.n5() + 1);
            var2[var3++] = var12;
            var2[var3++] = l6(this.a6);
            var2[var3++] = var12;
            var2[var3++] = l6(this.a6);
            var2[var3++] = var12;
         } else {
            var2[var3++] = l6(this.a6);
         }
      }

      return var2;
   }

   private v9$u3 n5(byte var1, byte[] var2) {
      var2[0] = 0;
      if ((var1 & 255 & 128) == 0) {
         var2[0] = (byte)(var2[0] & 0xFF | 1);
      }

      f4l$n5 var3 = f4l.n5(var1 & 255 & 127).n5();
      byte var4 = (byte)((var3.n5 & 255) - 1);
      int var5 = 0;

      for (int var6 = 0; var6 < (var4 & 255); var6++) {
         var5 <<= 8;
         var5 |= this.u3.c8() & 255;
      }

      int var9 = var5 >> (var4 & 255) * 8 - (var3.l6 & 255);
      var9 &= (1 << (var3.l6 & 255)) - 1;
      int var7 = var5 >> (var4 & 255) * 8 - (var3.l6 & 255) - (var3.k5 & 255);
      var7 &= (1 << (var3.k5 & 255)) - 1;
      var9 += var3.u3 & 65535;
      var7 += var3.a6 & 65535;
      if (var3.u9) {
         var9 = -var9;
      }

      if (var3.h0) {
         var7 = -var7;
      }

      return new v9$u3((short)var9, (short)var7);
   }

   private static int n5(t4 var0) {
      int var1 = 0;
      byte var2 = var0.c8();
      if (var2 == -3) {
         var1 = var0.c8() & 255;
         var1 = (var1 & 65535) << 8 & 65535;
         var1 = (var1 & 65535 | var0.c8() & 255) & 65535;
      } else if (var2 == -1) {
         var1 = (var0.c8() & 255) + 253 & 65535;
      } else if (var2 == -2) {
         var1 = (var0.c8() & 255) + 506 & 65535;
      } else {
         var1 = var2 & 255;
      }

      return var1;
   }

   private static short l6(t4 var0) {
      byte var1 = var0.c8();
      short var3;
      if (var1 == -3) {
         int var2 = var0.c8() & 255;
         var2 = (var2 & 65535) << 8 & 65535;
         var2 = (var2 & 65535 | var0.c8() & 255) & 65535;
         var3 = (short)var2;
      } else {
         byte var6 = 1;
         if (var1 == -6) {
            var6 = -1;
            var1 = var0.c8();
         }

         if (var1 == -1) {
            var3 = (short)((var0.c8() & 255) + 250);
         } else if (var1 == -2) {
            var3 = (short)((var0.c8() & 255) + 500);
         } else {
            var3 = (short)(var1 & 0xFF);
         }

         var3 = (short)(var3 * var6);
      }

      return var3;
   }
}
