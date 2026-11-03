package com.aspose.slides.internal.e5a;

import com.aspose.slides.ms.System.d1;

public final class s7 {
   private int y0;
   private static final String[] j9 = new String[]{
      "need dictionary", "stream end", d1.n5, "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", d1.n5
   };
   public p8 n5;
   public int l6;
   public byte[] k5;
   public int u3;
   public int a6;
   public byte u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public byte[] x8;
   public int n3;
   public short[] y4;
   public short[] e2;
   public int t9;
   public int z1;
   public int t4;
   public int q0;
   public int z3;
   public int m1;
   private s7$n5 z6;
   public int k7;
   public int m3;
   public int z8;
   public int j5;
   public int w1;
   public int r4;
   public int c4;
   public int y2;
   public int y1;
   public short[] a0;
   public short[] d2;
   public short[] d5;
   public j5 s3 = new j5();
   public j5 p8 = new j5();
   public j5 f2 = new j5();
   public short[] i1 = new short[16];
   public int[] e5 = new int[573];
   public int b3;
   public int o0;
   public byte[] z7 = new byte[573];
   public int v4;
   public int u6;
   public int t1;
   public int a5;
   public int h2;
   public int v0;
   public int f0;
   public int a3;
   public short p3;
   public int x9;
   private boolean e9 = false;
   private boolean o5 = true;

   public s7() {
      this.a0 = new short[1146];
      this.d2 = new short[122];
      this.d5 = new short[78];
   }

   private void s7() {
      this.n3 = 2 * this.c8;

      for (int var1 = 0; var1 < this.z1; var1++) {
         this.e2[var1] = 0;
      }

      this.z6 = s7$n5.n5(this.y2);
      this.y0 = this.z6.a6;
      this.j5 = 0;
      this.m1 = 0;
      this.r4 = 0;
      this.k7 = this.c4 = 2;
      this.z8 = 0;
      this.t9 = 0;
   }

   private void x8() {
      this.s3.c8 = this.a0;
      this.s3.s7 = com.aspose.slides.internal.e5a.z8.k5;
      this.p8.c8 = this.d2;
      this.p8.s7 = com.aspose.slides.internal.e5a.z8.u3;
      this.f2.c8 = this.d5;
      this.f2.s7 = com.aspose.slides.internal.e5a.z8.a6;
      this.p3 = 0;
      this.x9 = 0;
      this.a3 = 8;
      this.n5();
   }

   public final void n5() {
      for (int var1 = 0; var1 < 286; var1++) {
         this.a0[var1 * 2] = 0;
      }

      for (int var2 = 0; var2 < 30; var2++) {
         this.d2[var2 * 2] = 0;
      }

      for (int var3 = 0; var3 < 19; var3++) {
         this.d5[var3 * 2] = 0;
      }

      this.a0[512] = 1;
      this.h2 = this.v0 = 0;
      this.t1 = this.f0 = 0;
   }

   public final void n5(short[] var1, int var2) {
      int var3 = this.e5[var2];

      for (int var4 = var2 << 1; var4 <= this.b3; var4 <<= 1) {
         if (var4 < this.b3 && n5(var1, this.e5[var4 + 1], this.e5[var4], this.z7)) {
            var4++;
         }

         if (n5(var1, var3, this.e5[var4], this.z7)) {
            break;
         }

         this.e5[var2] = this.e5[var4];
         var2 = var4;
      }

      this.e5[var2] = var3;
   }

   public static boolean n5(short[] var0, int var1, int var2, byte[] var3) {
      short var4 = var0[var1 * 2];
      short var5 = var0[var2 * 2];
      return var4 < var5 || var4 == var5 && var3[var1] <= var3[var2];
   }

   public final void l6(short[] var1, int var2) {
      short var3 = -1;
      short var4 = var1[1];
      int var5 = 0;
      short var6 = 7;
      byte var7 = 4;
      if (var4 == 0) {
         var6 = 138;
         var7 = 3;
      }

      var1[(var2 + 1) * 2 + 1] = 32767;

      for (int var8 = 0; var8 <= var2; var8++) {
         short var9 = var4;
         var4 = var1[(var8 + 1) * 2 + 1];
         if (++var5 >= var6 || var9 != var4) {
            if (var5 < var7) {
               this.d5[var9 * 2] = (short)(this.d5[var9 * 2] + var5);
            } else if (var9 != 0) {
               if (var9 != var3) {
                  this.d5[var9 * 2]++;
               }

               this.d5[32]++;
            } else if (var5 <= 10) {
               this.d5[34]++;
            } else {
               this.d5[36]++;
            }

            var5 = 0;
            var3 = var9;
            if (var4 == 0) {
               var6 = 138;
               var7 = 3;
            } else if (var9 == var4) {
               var6 = 6;
               var7 = 3;
            } else {
               var6 = 7;
               var7 = 4;
            }
         }
      }
   }

   public final int l6() {
      this.l6(this.a0, this.s3.t2);
      this.l6(this.d2, this.p8.t2);
      this.f2.l6(this);
      int var1 = 18;

      while (var1 >= 3 && this.d5[com.aspose.slides.internal.e5a.j5.u3[var1] * 2 + 1] == 0) {
         var1--;
      }

      this.h2 += 3 * (var1 + 1) + 5 + 5 + 4;
      return var1;
   }

   public final void n5(int var1, int var2, int var3) {
      this.n5(var1 - 257, 5);
      this.n5(var2 - 1, 5);
      this.n5(var3 - 4, 4);

      for (int var4 = 0; var4 < var3; var4++) {
         this.n5(this.d5[com.aspose.slides.internal.e5a.j5.u3[var4] * 2 + 1], 3);
      }

      this.k5(this.a0, var1 - 1);
      this.k5(this.d2, var2 - 1);
   }

   public final void k5(short[] var1, int var2) {
      short var3 = -1;
      short var4 = var1[1];
      int var5 = 0;
      short var6 = 7;
      byte var7 = 4;
      if (var4 == 0) {
         var6 = 138;
         var7 = 3;
      }

      for (int var8 = 0; var8 <= var2; var8++) {
         short var9 = var4;
         var4 = var1[(var8 + 1) * 2 + 1];
         if (++var5 >= var6 || var9 != var4) {
            if (var5 < var7) {
               do {
                  this.n5(var9, this.d5);
               } while (--var5 != 0);
            } else if (var9 != 0) {
               if (var9 != var3) {
                  this.n5(var9, this.d5);
                  var5--;
               }

               this.n5(16, this.d5);
               this.n5(var5 - 3, 2);
            } else if (var5 <= 10) {
               this.n5(17, this.d5);
               this.n5(var5 - 3, 3);
            } else {
               this.n5(18, this.d5);
               this.n5(var5 - 11, 7);
            }

            var5 = 0;
            var3 = var9;
            if (var4 == 0) {
               var6 = 138;
               var7 = 3;
            } else if (var9 == var4) {
               var6 = 6;
               var7 = 3;
            } else {
               var6 = 7;
               var7 = 4;
            }
         }
      }
   }

   private void n5(byte[] var1, int var2, int var3) {
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), this.a6, var3);
      this.a6 += var3;
   }

   private void n5(byte var1) {
      this.k5[this.a6++] = var1;
   }

   public final void n5(int var1) {
      this.n5((byte)var1);
      this.n5((byte)com.aspose.slides.internal.e5a.m3.n5(var1, 8));
   }

   public final void l6(int var1) {
      this.n5((byte)(var1 >> 8));
      this.n5((byte)var1);
   }

   public final void n5(int var1, short[] var2) {
      int var3 = var1 * 2;
      this.n5(var2[var3] & 65535, var2[var3 + 1] & 65535);
   }

   public final void n5(int var1, int var2) {
      if (this.x9 > 16 - var2) {
         this.p3 = (short)(this.p3 & 65535 | var1 << this.x9 & 65535);
         this.n5(this.p3);
         this.p3 = (short)com.aspose.slides.internal.e5a.m3.n5(var1, 16 - this.x9);
         this.x9 += var2 - 16;
      } else {
         this.p3 = (short)(this.p3 & 65535 | var1 << this.x9 & 65535);
         this.x9 += var2;
      }
   }

   public final void k5() {
      this.n5(2, 3);
      this.n5(256, com.aspose.slides.internal.e5a.z8.n5);
      this.a6();
      if (1 + this.a3 + 10 - this.x9 < 9) {
         this.n5(2, 3);
         this.n5(256, com.aspose.slides.internal.e5a.z8.n5);
         this.a6();
      }

      this.a3 = 7;
   }

   public final boolean l6(int var1, int var2) {
      this.k5[this.a5 + this.t1 * 2] = (byte)com.aspose.slides.internal.e5a.m3.n5(var1, 8);
      this.k5[this.a5 + this.t1 * 2 + 1] = (byte)var1;
      this.k5[this.v4 + this.t1] = (byte)var2;
      this.t1++;
      if (var1 == 0) {
         this.a0[var2 * 2]++;
      } else {
         this.f0++;
         var1--;
         this.a0[(com.aspose.slides.internal.e5a.j5.a6[var2] + 256 + 1) * 2]++;
         this.d2[com.aspose.slides.internal.e5a.j5.n5(var1) * 2]++;
      }

      if ((this.t1 & 8191) == 0 && this.y2 > 2) {
         int var3 = this.t1 * 8;
         int var4 = this.j5 - this.m1;

         for (int var5 = 0; var5 < 30; var5++) {
            var3 = (int)(var3 + this.d2[var5 * 2] * (5L + com.aspose.slides.internal.e5a.j5.l6[var5]));
         }

         var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 3);
         if (this.f0 < this.t1 / 2 && var3 < var4 / 2) {
            return true;
         }
      }

      return this.t1 == this.u6 - 1 || this.t1 == this.u6;
   }

   public final void n5(short[] var1, short[] var2) {
      int var3 = 0;
      if (this.t1 != 0) {
         do {
            int var4 = this.a5 + var3 * 2;
            int var5 = (this.k5[var4] & 255) << 8 & 0xFF00 | this.k5[var4 + 1] & 255 & 0xFF;
            int var6 = this.k5[this.v4 + var3] & 255 & 0xFF;
            var3++;
            if (var5 == 0) {
               this.n5(var6, var1);
            } else {
               int var7 = com.aspose.slides.internal.e5a.j5.a6[var6];
               this.n5(var7 + 256 + 1, var1);
               int var8 = com.aspose.slides.internal.e5a.j5.n5[var7];
               if (var8 != 0) {
                  var6 -= com.aspose.slides.internal.e5a.j5.u9[var7];
                  this.n5(var6, var8);
               }

               var7 = com.aspose.slides.internal.e5a.j5.n5(--var5);
               this.n5(var7, var2);
               var8 = com.aspose.slides.internal.e5a.j5.l6[var7];
               if (var8 != 0) {
                  var5 -= com.aspose.slides.internal.e5a.j5.h0[var7];
                  this.n5(var5, var8);
               }
            }
         } while (var3 < this.t1);
      }

      this.n5(256, var1);
      this.a3 = var1[513];
   }

   public final void u3() {
      int var1 = 0;
      short var2 = 0;
      short var3 = 0;

      while (var1 < 7) {
         var3 += this.a0[var1 * 2];
         var1++;
      }

      while (var1 < 128) {
         var2 += this.a0[var1 * 2];
         var1++;
      }

      while (var1 < 256) {
         var3 += this.a0[var1 * 2];
         var1++;
      }

      this.u9 = (byte)(var3 > com.aspose.slides.internal.e5a.m3.n5(var2, 2) ? 0 : 1);
   }

   public final void a6() {
      if (this.x9 == 16) {
         this.n5(this.p3);
         this.p3 = 0;
         this.x9 = 0;
      } else if (this.x9 >= 8) {
         this.n5((byte)this.p3);
         this.p3 = (short)com.aspose.slides.internal.e5a.m3.n5(this.p3, 8);
         this.x9 -= 8;
      }
   }

   public final void u9() {
      if (this.x9 > 8) {
         this.n5(this.p3);
      } else if (this.x9 > 0) {
         this.n5((byte)this.p3);
      }

      this.p3 = 0;
      this.x9 = 0;
   }

   public final void n5(int var1, int var2, boolean var3) {
      this.u9();
      this.a3 = 8;
      if (var3) {
         this.n5((short)var2);
         this.n5((short)(~var2));
      }

      this.n5(this.x8, var1, var2);
   }

   public final void n5(boolean var1) {
      this.k5(this.m1 >= 0 ? this.m1 : -1, this.j5 - this.m1, var1);
      this.m1 = this.j5;
      this.n5.k5();
   }

   public final int k5(int var1) {
      int var2 = 65535;
      if (var2 > this.k5.length - 5) {
         var2 = this.k5.length - 5;
      }

      while (true) {
         if (this.r4 <= 1) {
            this.n3();
            if (this.r4 == 0 && var1 == 0) {
               return 0;
            }

            if (this.r4 == 0) {
               this.n5(var1 == 4);
               if (this.n5.h0 == 0) {
                  return var1 == 4 ? 2 : 0;
               }

               return var1 == 4 ? 3 : 1;
            }
         }

         this.j5 = this.j5 + this.r4;
         this.r4 = 0;
         int var3 = this.m1 + var2;
         if (this.j5 == 0 || this.j5 >= var3) {
            this.r4 = this.j5 - var3;
            this.j5 = var3;
            this.n5(false);
            if (this.n5.h0 == 0) {
               return 0;
            }
         }

         if (this.j5 - this.m1 >= this.c8 - 262) {
            this.n5(false);
            if (this.n5.h0 == 0) {
               return 0;
            }
         }
      }
   }

   public final void l6(int var1, int var2, boolean var3) {
      this.n5(0 + (var3 ? 1 : 0), 3);
      this.n5(var1, var2, true);
   }

   public final void k5(int var1, int var2, boolean var3) {
      int var4 = 0;
      int var5;
      int var6;
      if (this.y2 > 0) {
         if (this.u9 == 2) {
            this.u3();
         }

         this.s3.l6(this);
         this.p8.l6(this);
         var4 = this.l6();
         var5 = com.aspose.slides.internal.e5a.m3.n5(this.h2 + 3 + 7, 3);
         var6 = com.aspose.slides.internal.e5a.m3.n5(this.v0 + 3 + 7, 3);
         if (var6 <= var5) {
            var5 = var6;
         }
      } else {
         var5 = var6 = var2 + 5;
      }

      if (var2 + 4 <= var5 && var1 != -1) {
         this.l6(var1, var2, var3);
      } else if (var6 == var5) {
         this.n5(2 + (var3 ? 1 : 0), 3);
         this.n5(com.aspose.slides.internal.e5a.z8.n5, com.aspose.slides.internal.e5a.z8.l6);
      } else {
         this.n5(4 + (var3 ? 1 : 0), 3);
         this.n5(this.s3.t2 + 1, this.p8.t2 + 1, var4 + 1);
         this.n5(this.a0, this.d2);
      }

      this.n5();
      if (var3) {
         this.u9();
      }
   }

   private void n3() {
      do {
         int var1 = this.n3 - this.r4 - this.j5;
         if (var1 == 0 && this.j5 == 0 && this.r4 == 0) {
            var1 = this.c8;
         } else if (var1 == -1) {
            var1--;
         } else if (this.j5 >= this.c8 + this.c8 - 262) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), this.c8, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), 0, this.c8);
            this.w1 = this.w1 - this.c8;
            this.j5 = this.j5 - this.c8;
            this.m1 = this.m1 - this.c8;
            int var2 = this.z1;
            int var3 = var2;

            do {
               int var4 = this.e2[--var3] & '\uffff';
               this.e2[var3] = (short)(var4 >= this.c8 ? var4 - this.c8 : 0);
            } while (--var2 != 0);

            var2 = this.c8;
            var3 = var2;

            do {
               int var8 = this.y4[--var3] & '\uffff';
               this.y4[var3] = (short)(var8 >= this.c8 ? var8 - this.c8 : 0);
            } while (--var2 != 0);

            var1 += this.c8;
         }

         if (this.n5.k5 == 0) {
            return;
         }

         int var6 = this.n5.n5(this.x8, this.j5 + this.r4, var1);
         this.r4 += var6;
         if (this.r4 >= 3) {
            this.t9 = this.x8[this.j5] & 255 & 0xFF;
            this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 1] & 255 & 0xFF) & this.q0;
         }
      } while (this.r4 < 262 && this.n5.k5 != 0);
   }

   public final int u3(int var1) {
      int var2 = 0;

      while (true) {
         if (this.r4 < 262) {
            this.n3();
            if (this.r4 < 262 && var1 == 0) {
               return 0;
            }

            if (this.r4 == 0) {
               this.n5(var1 == 4);
               if (this.n5.h0 == 0) {
                  if (var1 == 4) {
                     return 2;
                  }

                  return 0;
               }

               return var1 == 4 ? 3 : 1;
            }
         }

         if (this.r4 >= 3) {
            this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 2] & 255 & 0xFF) & this.q0;
            var2 = this.e2[this.t9] & '\uffff';
            this.y4[this.j5 & this.s7] = this.e2[this.t9];
            this.e2[this.t9] = (short)this.j5;
         }

         if (var2 != 0L && (this.j5 - var2 & 65535) <= this.c8 - 262 && this.y1 != 2) {
            this.k7 = this.u9(var2);
         }

         boolean var3;
         if (this.k7 < 3) {
            var3 = this.l6(0, this.x8[this.j5] & 255 & 0xFF);
            this.r4--;
            this.j5++;
         } else {
            var3 = this.l6(this.j5 - this.w1, this.k7 - 3);
            this.r4 = this.r4 - this.k7;
            if (this.k7 <= this.z6.l6 && this.r4 >= 3) {
               this.k7--;

               do {
                  this.j5++;
                  this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 2] & 255 & 0xFF) & this.q0;
                  var2 = this.e2[this.t9] & '\uffff';
                  this.y4[this.j5 & this.s7] = this.e2[this.t9];
                  this.e2[this.t9] = (short)this.j5;
               } while (--this.k7 != 0);

               this.j5++;
            } else {
               this.j5 = this.j5 + this.k7;
               this.k7 = 0;
               this.t9 = this.x8[this.j5] & 255 & 0xFF;
               this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 1] & 255 & 0xFF) & this.q0;
            }
         }

         if (var3) {
            this.n5(false);
            if (this.n5.h0 == 0) {
               return 0;
            }
         }
      }
   }

   public final int a6(int var1) {
      int var2 = 0;

      while (true) {
         if (this.r4 < 262) {
            this.n3();
            if (this.r4 < 262 && var1 == 0) {
               return 0;
            }

            if (this.r4 == 0) {
               if (this.z8 != 0) {
                  boolean var6 = this.l6(0, this.x8[this.j5 - 1] & 255 & 0xFF);
                  this.z8 = 0;
               }

               this.n5(var1 == 4);
               if (this.n5.h0 == 0) {
                  if (var1 == 4) {
                     return 2;
                  }

                  return 0;
               }

               return var1 == 4 ? 3 : 1;
            }
         }

         if (this.r4 >= 3) {
            this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 2] & 255 & 0xFF) & this.q0;
            var2 = this.e2[this.t9] & '\uffff';
            this.y4[this.j5 & this.s7] = this.e2[this.t9];
            this.e2[this.t9] = (short)this.j5;
         }

         this.c4 = this.k7;
         this.m3 = this.w1;
         this.k7 = 2;
         if (var2 != 0 && this.c4 < this.z6.l6 && (this.j5 - var2 & 65535) <= this.c8 - 262) {
            if (this.y1 != 2) {
               this.k7 = this.u9(var2);
            }

            if (this.k7 <= 5 && (this.y1 == 1 || this.k7 == 3 && this.j5 - this.w1 > 4096)) {
               this.k7 = 2;
            }
         }

         if (this.c4 >= 3 && this.k7 <= this.c4) {
            int var3 = this.j5 + this.r4 - 3;
            boolean var5 = this.l6(this.j5 - 1 - this.m3, this.c4 - 3);
            this.r4 = this.r4 - (this.c4 - 1);
            this.c4 -= 2;

            do {
               if (++this.j5 <= var3) {
                  this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 2] & 255 & 0xFF) & this.q0;
                  var2 = this.e2[this.t9] & '\uffff';
                  this.y4[this.j5 & this.s7] = this.e2[this.t9];
                  this.e2[this.t9] = (short)this.j5;
               }
            } while (--this.c4 != 0);

            this.z8 = 0;
            this.k7 = 2;
            this.j5++;
            if (var5) {
               this.n5(false);
               if (this.n5.h0 == 0) {
                  return 0;
               }
            }
         } else if (this.z8 != 0) {
            boolean var4 = this.l6(0, this.x8[this.j5 - 1] & 255 & 0xFF);
            if (var4) {
               this.n5(false);
            }

            this.j5++;
            this.r4--;
            if (this.n5.h0 == 0) {
               return 0;
            }
         } else {
            this.z8 = 1;
            this.j5++;
            this.r4--;
         }
      }
   }

   public final int u9(int var1) {
      int var2 = this.z6.u3;
      int var3 = this.j5;
      int var4 = this.c4;
      int var5 = this.j5 > this.c8 - 262 ? this.j5 - (this.c8 - 262) : 0;
      int var6 = this.z6.k5;
      int var7 = this.s7;
      int var8 = this.j5 + 258;
      byte var9 = this.x8[var3 + var4 - 1];
      byte var10 = this.x8[var3 + var4];
      if (this.c4 >= this.z6.n5) {
         var2 >>= 2;
      }

      if (var6 > this.r4) {
         var6 = this.r4;
      }

      do {
         int var11 = var1;
         if ((this.x8[var11 + var4] & 255) == (var10 & 255)
            && (this.x8[var11 + var4 - 1] & 255) == (var9 & 255)
            && (this.x8[var11] & 255) == (this.x8[var3] & 255)) {
            if ((this.x8[++var11] & 255) == (this.x8[var3 + 1] & 255)) {
               var3 += 2;
               var11++;

               while (
                  this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && this.x8[++var3] == this.x8[++var11]
                     && var3 < var8
               ) {
               }

               int var12 = 258 - (var8 - var3);
               var3 = var8 - 258;
               if (var12 > var4) {
                  this.w1 = var1;
                  var4 = var12;
                  if (var12 >= var6) {
                     break;
                  }

                  var9 = this.x8[var3 + var4 - 1];
                  var10 = this.x8[var3 + var4];
               }
            }
         }
      } while ((var1 = this.y4[var1 & var7] & '\uffff') > var5 && --var2 != 0);

      return var4 <= this.r4 ? var4 : this.r4;
   }

   public final boolean h0() {
      return this.o5;
   }

   public final void l6(boolean var1) {
      this.o5 = var1;
   }

   public final int n5(p8 var1, int var2, int var3, int var4) {
      return this.n5(var1, var2, var3, 8, var4);
   }

   public final int n5(p8 var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.n5.t2 = null;
      if (var3 < 9 || var3 > 15) {
         throw new f2("windowBits must be in the range 9..15.");
      } else if (var4 >= 1 && var4 <= 9) {
         this.n5.s7 = this;
         this.t2 = var3;
         this.c8 = 1 << this.t2;
         this.s7 = this.c8 - 1;
         this.t4 = var4 + 7;
         this.z1 = 1 << this.t4;
         this.q0 = this.z1 - 1;
         this.z3 = (this.t4 + 3 - 1) / 3;
         this.x8 = new byte[this.c8 * 2];
         this.y4 = new short[this.c8];
         this.e2 = new short[this.z1];
         this.u6 = 1 << var4 + 6;
         this.k5 = new byte[this.u6 * 4];
         this.a5 = this.u6;
         this.v4 = 3 * this.u6;
         this.y2 = var2;
         this.y1 = var5;
         this.c8();
         return 0;
      } else {
         throw new f2(d1.n5("memLevel must be in the range 1.. {0}", new Object[]{9}));
      }
   }

   public final void c8() {
      this.n5.c8 = 0L;
      this.n5.u3 = 0L;
      this.n5.t2 = null;
      this.a6 = 0;
      this.u3 = 0;
      this.e9 = false;
      this.l6 = this.h0() ? 42 : 113;
      this.n5.n3 = com.aspose.slides.internal.e5a.l6.n5(0L, null, 0, 0);
      this.h0 = 0;
      this.x8();
      this.s7();
   }

   public final int t2() {
      if (this.l6 != 42 && this.l6 != 113 && this.l6 != 666) {
         return -2;
      }

      this.k5 = null;
      this.e2 = null;
      this.y4 = null;
      this.x8 = null;
      return this.l6 == 113 ? -3 : 0;
   }

   public final int h0(int var1) {
      if (this.n5.a6 != null && (this.n5.n5 != null || this.n5.k5 == 0) && (this.l6 != 666 || var1 == 4)) {
         if (this.n5.h0 == 0) {
            this.n5.t2 = j9[7];
            throw new f2("OutputBuffer is full (AvailableBytesOut == 0)");
         }

         int var2 = this.h0;
         this.h0 = var1;
         if (this.l6 == 42) {
            int var3 = 8 + (this.t2 - 8 << 4) << 8;
            int var4 = (this.y2 - 1 & 0xFF) >> 1;
            if (var4 > 3) {
               var4 = 3;
            }

            var3 |= var4 << 6;
            if (this.j5 != 0) {
               var3 |= 32;
            }

            var3 += 31 - var3 % 31;
            this.l6 = 113;
            this.l6(var3);
            if (this.j5 != 0) {
               this.l6((int)com.aspose.slides.internal.e5a.m3.n5(this.n5.n3, 16));
               this.l6((int)(this.n5.n3 & 65535L));
            }

            this.n5.n3 = com.aspose.slides.internal.e5a.l6.n5(0L, null, 0, 0);
         }

         if (this.a6 != 0) {
            this.n5.k5();
            if (this.n5.h0 == 0) {
               this.h0 = -1;
               return 0;
            }
         } else if (this.n5.k5 == 0 && var1 <= var2 && var1 != 4) {
            return 0;
         }

         if (this.l6 == 666 && this.n5.k5 != 0) {
            this.n5.t2 = j9[7];
            throw new f2("status == FINISH_STATE && _codec.AvailableBytesIn != 0");
         }

         if (this.n5.k5 != 0 || this.r4 != 0 || var1 != 0 && this.l6 != 666) {
            int var7;
            switch (this.y0) {
               case 0:
                  var7 = this.k5(var1);
                  break;
               case 1:
                  var7 = this.u3(var1);
                  break;
               case 2:
               default:
                  var7 = this.a6(var1);
            }

            if (var7 == 2 || var7 == 3) {
               this.l6 = 666;
            }

            if (var7 == 0 || var7 == 2) {
               if (this.n5.h0 == 0) {
                  this.h0 = -1;
               }

               return 0;
            }

            if (var7 == 1) {
               if (var1 == 1) {
                  this.k5();
               } else {
                  this.l6(0, 0, false);
                  if (var1 == 3) {
                     for (int var8 = 0; var8 < this.z1; var8++) {
                        this.e2[var8] = 0;
                     }
                  }
               }

               this.n5.k5();
               if (this.n5.h0 == 0) {
                  this.h0 = -1;
                  return 0;
               }
            }
         }

         if (var1 != 4) {
            return 0;
         } else if (this.h0() && !this.e9) {
            this.l6((int)com.aspose.slides.internal.e5a.m3.n5(this.n5.n3, 16));
            this.l6((int)(this.n5.n3 & 65535L));
            this.n5.k5();
            this.e9 = true;
            return this.a6 != 0 ? 0 : 1;
         } else {
            return 1;
         }
      } else {
         this.n5.t2 = j9[4];
         throw new f2(d1.n5("Something is fishy. [{0}]", new Object[]{this.n5.t2}));
      }
   }
}
