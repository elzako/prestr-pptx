package com.aspose.slides.internal.f3h;

import com.aspose.slides.ms.System.d1;
import java.util.Arrays;

final class c8 {
   private static int y0 = 9;
   private static int j9 = 8;
   private c8$n5 z6;
   private static String[] e9 = new String[]{
      "need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""
   };
   private static int o5 = 32;
   private static int j8 = 42;
   private static int w2 = 113;
   private static int s0 = 666;
   private static int v8 = 8;
   private static int v3 = 0;
   private static int g7 = 1;
   private static int j4 = 2;
   private static int i9 = 0;
   private static int f5 = 1;
   private static int j3 = 2;
   private static int n1 = 16;
   private static int p6 = 3;
   private static int d1 = 258;
   private static int s4 = d1 + p6 + 1;
   private static int h6 = 2 * com.aspose.slides.internal.f3h.z1.u9 + 1;
   private static int y8 = 256;
   u3 n5;
   int l6;
   byte[] k5;
   int u3;
   int a6;
   byte u9;
   int h0;
   int c8;
   int t2;
   int s7;
   byte[] x8;
   int n3;
   short[] y4;
   short[] e2;
   int t9;
   int z1;
   int t4;
   int q0;
   int z3;
   int m1;
   private c8$l6 c3;
   int k7;
   int m3;
   int z8;
   int j5;
   int w1;
   int r4;
   int c4;
   int y2;
   int y1;
   short[] a0;
   short[] d2;
   short[] d5;
   m1 s3 = new m1();
   m1 p8 = new m1();
   m1 f2 = new m1();
   short[] i1 = new short[com.aspose.slides.internal.f3h.z1.n5 + 1];
   int[] e5 = new int[2 * com.aspose.slides.internal.f3h.z1.u9 + 1];
   int b3;
   int o0;
   byte[] z7 = new byte[2 * com.aspose.slides.internal.f3h.z1.u9 + 1];
   int v4;
   int u6;
   int t1;
   int a5;
   int h2;
   int v0;
   int f0;
   int a3;
   short p3;
   int x9;
   private boolean l4 = false;
   private boolean i6 = true;

   c8() {
      this.a0 = new short[h6 * 2];
      this.d2 = new short[(2 * com.aspose.slides.internal.f3h.z1.k5 + 1) * 2];
      this.d5 = new short[(2 * com.aspose.slides.internal.f3h.z1.l6 + 1) * 2];
   }

   private void t2() {
      this.n3 = 2 * this.c8;
      Arrays.fill(this.e2, 0, this.z1, (short)0);
      this.c3 = c8$l6.n5(this.y2);
      this.n3();
      this.j5 = 0;
      this.m1 = 0;
      this.r4 = 0;
      this.k7 = this.c4 = p6 - 1;
      this.z8 = 0;
      this.t9 = 0;
   }

   private void s7() {
      this.s3.c8 = this.a0;
      this.s3.s7 = com.aspose.slides.internal.f3h.z3.k5;
      this.p8.c8 = this.d2;
      this.p8.s7 = com.aspose.slides.internal.f3h.z3.u3;
      this.f2.c8 = this.d5;
      this.f2.s7 = com.aspose.slides.internal.f3h.z3.a6;
      this.p3 = 0;
      this.x9 = 0;
      this.a3 = 8;
      this.n5();
   }

   void n5() {
      for (int var1 = 0; var1 < com.aspose.slides.internal.f3h.z1.u9; var1++) {
         this.a0[var1 * 2] = 0;
      }

      for (int var2 = 0; var2 < com.aspose.slides.internal.f3h.z1.k5; var2++) {
         this.d2[var2 * 2] = 0;
      }

      for (int var3 = 0; var3 < com.aspose.slides.internal.f3h.z1.l6; var3++) {
         this.d5[var3 * 2] = 0;
      }

      this.a0[y8 * 2] = 1;
      this.h2 = this.v0 = 0;
      this.t1 = this.f0 = 0;
   }

   void n5(short[] var1, int var2) {
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

   static boolean n5(short[] var0, int var1, int var2, byte[] var3) {
      short var4 = var0[var1 * 2];
      short var5 = var0[var2 * 2];
      return var4 < var5 || var4 == var5 && var3[var1] <= var3[var2];
   }

   void l6(short[] var1, int var2) {
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

               this.d5[com.aspose.slides.internal.f3h.z1.c8 * 2]++;
            } else if (var5 <= 10) {
               this.d5[com.aspose.slides.internal.f3h.z1.t2 * 2]++;
            } else {
               this.d5[com.aspose.slides.internal.f3h.z1.s7 * 2]++;
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

   int l6() {
      this.l6(this.a0, this.s3.t2);
      this.l6(this.d2, this.p8.t2);
      this.f2.l6(this);
      int var1 = com.aspose.slides.internal.f3h.z1.l6 - 1;

      while (var1 >= 3 && this.d5[com.aspose.slides.internal.f3h.m1.u3[var1] * 2 + 1] == 0) {
         var1--;
      }

      this.h2 += 3 * (var1 + 1) + 5 + 5 + 4;
      return var1;
   }

   void n5(int var1, int var2, int var3) {
      this.n5(var1 - 257, 5);
      this.n5(var2 - 1, 5);
      this.n5(var3 - 4, 4);

      for (int var4 = 0; var4 < var3; var4++) {
         this.n5(this.d5[com.aspose.slides.internal.f3h.m1.u3[var4] * 2 + 1], 3);
      }

      this.k5(this.a0, var1 - 1);
      this.k5(this.d2, var2 - 1);
   }

   void k5(short[] var1, int var2) {
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

               this.n5(com.aspose.slides.internal.f3h.z1.c8, this.d5);
               this.n5(var5 - 3, 2);
            } else if (var5 <= 10) {
               this.n5(com.aspose.slides.internal.f3h.z1.t2, this.d5);
               this.n5(var5 - 3, 3);
            } else {
               this.n5(com.aspose.slides.internal.f3h.z1.s7, this.d5);
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
      System.arraycopy(var1, var2, this.k5, this.a6, var3);
      this.a6 += var3;
   }

   void n5(int var1, short[] var2) {
      int var3 = var1 * 2;
      this.n5(var2[var3] & 65535, var2[var3 + 1] & 65535);
   }

   void n5(int var1, int var2) {
      if (this.x9 > n1 - var2) {
         this.p3 = (short)(this.p3 | (short)(var1 << this.x9 & 65535));
         this.k5[this.a6++] = (byte)this.p3;
         this.k5[this.a6++] = (byte)(this.p3 >> 8);
         this.p3 = (short)((var1 & 4294967295L) >> n1 - this.x9);
         this.x9 = this.x9 + (var2 - n1);
      } else {
         this.p3 = (short)(this.p3 | (short)(var1 << this.x9 & 65535));
         this.x9 += var2;
      }
   }

   void k5() {
      this.n5(g7 << 1, 3);
      this.n5(y8, com.aspose.slides.internal.f3h.z3.n5);
      this.a6();
      if (1 + this.a3 + 10 - this.x9 < 9) {
         this.n5(g7 << 1, 3);
         this.n5(y8, com.aspose.slides.internal.f3h.z3.n5);
         this.a6();
      }

      this.a3 = 7;
   }

   boolean l6(int var1, int var2) {
      this.k5[this.a5 + this.t1 * 2] = (byte)((var1 & 4294967295L) >> 8);
      this.k5[this.a5 + this.t1 * 2 + 1] = (byte)var1;
      this.k5[this.v4 + this.t1] = (byte)var2;
      this.t1++;
      if (var1 == 0) {
         this.a0[var2 * 2]++;
      } else {
         this.f0++;
         var1--;
         this.a0[(com.aspose.slides.internal.f3h.m1.a6[var2] + com.aspose.slides.internal.f3h.z1.u3 + 1) * 2]++;
         this.d2[com.aspose.slides.internal.f3h.m1.n5(var1) * 2]++;
      }

      if ((this.t1 & 8191) == 0 && this.y2 > 2) {
         int var3 = this.t1 << 3;
         int var4 = this.j5 - this.m1;

         for (int var5 = 0; var5 < com.aspose.slides.internal.f3h.z1.k5; var5++) {
            var3 = (int)(var3 + this.d2[var5 * 2] * (5L + com.aspose.slides.internal.f3h.m1.l6[var5]));
         }

         var3 >>= 3;
         if (this.f0 < this.t1 / 2 && var3 < var4 / 2) {
            return true;
         }
      }

      return this.t1 == this.u6 - 1 || this.t1 == this.u6;
   }

   void n5(short[] var1, short[] var2) {
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
               int var7 = com.aspose.slides.internal.f3h.m1.a6[var6];
               this.n5(var7 + com.aspose.slides.internal.f3h.z1.u3 + 1, var1);
               int var8 = com.aspose.slides.internal.f3h.m1.n5[var7];
               if (var8 != 0) {
                  var6 -= com.aspose.slides.internal.f3h.m1.u9[var7];
                  this.n5(var6, var8);
               }

               var7 = com.aspose.slides.internal.f3h.m1.n5(--var5);
               this.n5(var7, var2);
               var8 = com.aspose.slides.internal.f3h.m1.l6[var7];
               if (var8 != 0) {
                  var5 -= com.aspose.slides.internal.f3h.m1.h0[var7];
                  this.n5(var5, var8);
               }
            }
         } while (var3 < this.t1);
      }

      this.n5(y8, var1);
      this.a3 = var1[y8 * 2 + 1];
   }

   void u3() {
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

      while (var1 < com.aspose.slides.internal.f3h.z1.u3) {
         var3 += this.a0[var1 * 2];
         var1++;
      }

      this.u9 = (byte)(var3 > var2 >> 2 ? i9 : f5);
   }

   void a6() {
      if (this.x9 == 16) {
         this.k5[this.a6++] = (byte)this.p3;
         this.k5[this.a6++] = (byte)(this.p3 >> 8);
         this.p3 = 0;
         this.x9 = 0;
      } else if (this.x9 >= 8) {
         this.k5[this.a6++] = (byte)this.p3;
         this.p3 = (short)(this.p3 >> 8);
         this.x9 -= 8;
      }
   }

   void u9() {
      if (this.x9 > 8) {
         this.k5[this.a6++] = (byte)this.p3;
         this.k5[this.a6++] = (byte)(this.p3 >> 8);
      } else if (this.x9 > 0) {
         this.k5[this.a6++] = (byte)this.p3;
      }

      this.p3 = 0;
      this.x9 = 0;
   }

   void n5(int var1, int var2, boolean var3) {
      this.u9();
      this.a3 = 8;
      if (var3) {
         this.k5[this.a6++] = (byte)var2;
         this.k5[this.a6++] = (byte)(var2 >> 8);
         this.k5[this.a6++] = (byte)(~var2);
         this.k5[this.a6++] = (byte)(~var2 >> 8);
      }

      this.n5(this.x8, var1, var2);
   }

   void n5(boolean var1) {
      this.k5(this.m1 >= 0 ? this.m1 : -1, this.j5 - this.m1, var1);
      this.m1 = this.j5;
      this.n5.k5();
   }

   int n5(int var1) {
      int var2 = 65535;
      if (var2 > this.k5.length - 5) {
         var2 = this.k5.length - 5;
      }

      while (true) {
         if (this.r4 <= 1) {
            this.x8();
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

         if (this.j5 - this.m1 >= this.c8 - s4) {
            this.n5(false);
            if (this.n5.h0 == 0) {
               return 0;
            }
         }
      }
   }

   void l6(int var1, int var2, boolean var3) {
      this.n5((v3 << 1) + (var3 ? 1 : 0), 3);
      this.n5(var1, var2, true);
   }

   void k5(int var1, int var2, boolean var3) {
      int var4 = 0;
      int var5;
      int var6;
      if (this.y2 > 0) {
         if (this.u9 == j3) {
            this.u3();
         }

         this.s3.l6(this);
         this.p8.l6(this);
         var4 = this.l6();
         var5 = this.h2 + 3 + 7 >> 3;
         var6 = this.v0 + 3 + 7 >> 3;
         if (var6 <= var5) {
            var5 = var6;
         }
      } else {
         var5 = var6 = var2 + 5;
      }

      if (var2 + 4 <= var5 && var1 != -1) {
         this.l6(var1, var2, var3);
      } else if (var6 == var5) {
         this.n5((g7 << 1) + (var3 ? 1 : 0), 3);
         this.n5(com.aspose.slides.internal.f3h.z3.n5, com.aspose.slides.internal.f3h.z3.l6);
      } else {
         this.n5((j4 << 1) + (var3 ? 1 : 0), 3);
         this.n5(this.s3.t2 + 1, this.p8.t2 + 1, var4 + 1);
         this.n5(this.a0, this.d2);
      }

      this.n5();
      if (var3) {
         this.u9();
      }
   }

   private void x8() {
      do {
         int var1 = this.n3 - this.r4 - this.j5;
         if (var1 == 0 && this.j5 == 0 && this.r4 == 0) {
            var1 = this.c8;
         } else if (var1 == -1) {
            var1--;
         } else if (this.j5 >= this.c8 + this.c8 - s4) {
            System.arraycopy(this.x8, this.c8, this.x8, 0, this.c8);
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
         if (this.r4 >= p6) {
            this.t9 = this.x8[this.j5] & 255 & 0xFF;
            this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + 1] & 255 & 0xFF) & this.q0;
         }
      } while (this.r4 < s4 && this.n5.k5 != 0);
   }

   int l6(int var1) {
      int var2 = 0;

      while (true) {
         if (this.r4 < s4) {
            this.x8();
            if (this.r4 < s4 && var1 == 0) {
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

         if (this.r4 >= p6) {
            this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + (p6 - 1)] & 255 & 0xFF) & this.q0;
            var2 = this.e2[this.t9] & '\uffff';
            this.y4[this.j5 & this.s7] = this.e2[this.t9];
            this.e2[this.t9] = (short)this.j5;
         }

         if (var2 != 0L && (this.j5 - var2 & 65535) <= this.c8 - s4 && this.y1 != 2) {
            this.k7 = this.u3(var2);
         }

         boolean var3;
         if (this.k7 < p6) {
            var3 = this.l6(0, this.x8[this.j5] & 255 & 0xFF);
            this.r4--;
            this.j5++;
         } else {
            var3 = this.l6(this.j5 - this.w1, this.k7 - p6);
            this.r4 = this.r4 - this.k7;
            if (this.k7 <= this.c3.l6 && this.r4 >= p6) {
               this.k7--;

               do {
                  this.j5++;
                  this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + (p6 - 1)] & 255 & 0xFF) & this.q0;
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

   int k5(int var1) {
      int var2 = 0;

      while (true) {
         if (this.r4 < s4) {
            this.x8();
            if (this.r4 < s4 && var1 == 0) {
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

         if (this.r4 >= p6) {
            this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + (p6 - 1)] & 255 & 0xFF) & this.q0;
            var2 = this.e2[this.t9] & '\uffff';
            this.y4[this.j5 & this.s7] = this.e2[this.t9];
            this.e2[this.t9] = (short)this.j5;
         }

         this.c4 = this.k7;
         this.m3 = this.w1;
         this.k7 = p6 - 1;
         if (var2 != 0 && this.c4 < this.c3.l6 && (this.j5 - var2 & 65535) <= this.c8 - s4) {
            if (this.y1 != 2) {
               this.k7 = this.u3(var2);
            }

            if (this.k7 <= 5 && (this.y1 == 1 || this.k7 == p6 && this.j5 - this.w1 > 4096)) {
               this.k7 = p6 - 1;
            }
         }

         if (this.c4 >= p6 && this.k7 <= this.c4) {
            int var3 = this.j5 + this.r4 - p6;
            boolean var5 = this.l6(this.j5 - 1 - this.m3, this.c4 - p6);
            this.r4 = this.r4 - (this.c4 - 1);
            this.c4 -= 2;

            do {
               if (++this.j5 <= var3) {
                  this.t9 = (this.t9 << this.z3 ^ this.x8[this.j5 + (p6 - 1)] & 255 & 0xFF) & this.q0;
                  var2 = this.e2[this.t9] & '\uffff';
                  this.y4[this.j5 & this.s7] = this.e2[this.t9];
                  this.e2[this.t9] = (short)this.j5;
               }
            } while (--this.c4 != 0);

            this.z8 = 0;
            this.k7 = p6 - 1;
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

   int u3(int var1) {
      int var2 = this.c3.u3;
      int var3 = this.j5;
      int var4 = this.c4;
      int var5 = this.j5 > this.c8 - s4 ? this.j5 - (this.c8 - s4) : 0;
      int var6 = this.c3.k5;
      int var7 = this.s7;
      int var8 = this.j5 + d1;
      byte var9 = this.x8[var3 + var4 - 1];
      byte var10 = this.x8[var3 + var4];
      if (this.c4 >= this.c3.n5) {
         var2 >>= 2;
      }

      if (var6 > this.r4) {
         var6 = this.r4;
      }

      do {
         int var11 = var1;
         if (this.x8[var11 + var4] == var10 && this.x8[var11 + var4 - 1] == var9 && this.x8[var11] == this.x8[var3]) {
            if (this.x8[++var11] == this.x8[var3 + 1]) {
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

               int var12 = d1 - (var8 - var3);
               var3 = var8 - d1;
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

   boolean h0() {
      return this.i6;
   }

   void l6(boolean var1) {
      this.i6 = var1;
   }

   int n5(u3 var1, int var2, int var3, int var4) {
      return this.n5(var1, var2, var3, j9, var4);
   }

   int n5(u3 var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.n5.t2 = null;
      if (var3 < 9 || var3 > 15) {
         throw new a6("windowBits must be in the range 9..15.");
      } else if (var4 >= 1 && var4 <= y0) {
         this.n5.s7 = this;
         this.t2 = var3;
         this.c8 = 1 << this.t2;
         this.s7 = this.c8 - 1;
         this.t4 = var4 + 7;
         this.z1 = 1 << this.t4;
         this.q0 = this.z1 - 1;
         this.z3 = (this.t4 + p6 - 1) / p6;
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
         throw new a6(com.aspose.slides.ms.System.d1.n5("memLevel must be in the range 1.. {0}", new Object[]{y0}));
      }
   }

   void c8() {
      this.n5.u3 = this.n5.c8 = 0L;
      this.n5.t2 = null;
      this.a6 = 0;
      this.u3 = 0;
      this.l4 = false;
      this.l6 = this.h0() ? j8 : w2;
      this.n5.n3 = com.aspose.slides.internal.f3h.n5.n5(0L, null, 0, 0);
      this.h0 = 0;
      this.s7();
      this.t2();
   }

   private void n3() {
      switch (this.c3.a6) {
         case 0:
            this.z6 = new t2(this);
            break;
         case 1:
            this.z6 = new s7(this);
            break;
         case 2:
            this.z6 = new x8(this);
      }
   }

   int a6(int var1) {
      if (this.n5.a6 != null && (this.n5.n5 != null || this.n5.k5 == 0) && (this.l6 != s0 || var1 == 4)) {
         if (this.n5.h0 == 0) {
            this.n5.t2 = e9[7];
            throw new a6("OutputBuffer is full (AvailableBytesOut == 0)");
         }

         int var2 = this.h0;
         this.h0 = var1;
         if (this.l6 == j8) {
            int var3 = v8 + (this.t2 - 8 << 4) << 8;
            int var4 = (this.y2 - 1 & 0xFF) >> 1;
            if (var4 > 3) {
               var4 = 3;
            }

            var3 |= var4 << 6;
            if (this.j5 != 0) {
               var3 |= o5;
            }

            var3 += 31 - var3 % 31;
            this.l6 = w2;
            this.k5[this.a6++] = (byte)(var3 >> 8);
            this.k5[this.a6++] = (byte)var3;
            if (this.j5 != 0) {
               this.k5[this.a6++] = (byte)((this.n5.n3 & 4294967295L & 4278190080L) >> 24);
               this.k5[this.a6++] = (byte)((this.n5.n3 & 4294967295L & 16711680L) >> 16);
               this.k5[this.a6++] = (byte)((this.n5.n3 & 4294967295L & 65280L) >> 8);
               this.k5[this.a6++] = (byte)(this.n5.n3 & 4294967295L & 255L);
            }

            this.n5.n3 = com.aspose.slides.internal.f3h.n5.n5(0L, null, 0, 0);
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

         if (this.l6 == s0 && this.n5.k5 != 0) {
            this.n5.t2 = e9[7];
            throw new a6("status == FINISH_STATE && _codec.AvailableBytesIn != 0");
         }

         if (this.n5.k5 != 0 || this.r4 != 0 || var1 != 0 && this.l6 != s0) {
            int var7 = this.z6.n5(var1);
            if (var7 == 2 || var7 == 3) {
               this.l6 = s0;
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
         } else if (this.h0() && !this.l4) {
            this.k5[this.a6++] = (byte)((this.n5.n3 & 4294967295L & 4278190080L) >> 24);
            this.k5[this.a6++] = (byte)((this.n5.n3 & 4294967295L & 16711680L) >> 16);
            this.k5[this.a6++] = (byte)((this.n5.n3 & 4294967295L & 65280L) >> 8);
            this.k5[this.a6++] = (byte)(this.n5.n3 & 4294967295L & 255L);
            this.n5.k5();
            this.l4 = true;
            return this.a6 != 0 ? 0 : 1;
         } else {
            return 1;
         }
      } else {
         this.n5.t2 = e9[4];
         throw new a6(com.aspose.slides.ms.System.d1.n5("Something is fishy. [{0}]", new Object[]{this.n5.t2}));
      }
   }
}
