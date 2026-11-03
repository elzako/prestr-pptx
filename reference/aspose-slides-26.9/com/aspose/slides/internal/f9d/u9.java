package com.aspose.slides.internal.f9d;

import com.aspose.slides.ms.System.d1;

public final class u9 {
   public final byte[] n5 = new byte[573];
   public short[] l6 = new short[16];
   public final int[] k5 = new int[573];
   public int u3;
   public int a6;
   public int u9;
   public int h0;
   private final short[] c8;
   private final short[] t2;
   private short[] s7;
   private final com.aspose.slides.internal.g3j.a6 x8 = new com.aspose.slides.internal.g3j.a6();
   private final com.aspose.slides.internal.g3j.a6 n3 = new com.aspose.slides.internal.g3j.a6();
   private final com.aspose.slides.internal.g3j.a6 y4 = new com.aspose.slides.internal.g3j.a6();
   private e2 e2;
   private short t9;
   private int z1;
   private int t4;
   private int q0;
   private byte z3;
   private int m1;
   private int k7;
   private int m3;
   private int z8;
   private short[] j5;
   private int w1;
   private int r4;
   private int c4;
   private boolean y2;
   private int y1;
   private int a0;
   private int d2;
   private int d5;
   private int s3;
   private int p8;
   private int f2;
   private byte[] i1;
   private int e5;
   private int b3;
   private short[] o0;
   private int z7;
   private int v4;
   private int u6;
   private int t1;
   private int a5;
   private int h2;
   private int v0;
   private byte[] f0;
   private int a3;
   private boolean p3;
   private boolean x9 = true;
   private int y0;
   private int j9;
   private com.aspose.slides.internal.g3j.k5 z6;
   private int e9;

   public u9() {
      this.t2 = new short[1146];
      this.c8 = new short[122];
      this.s7 = new short[78];
   }

   public final boolean n5() {
      return this.x9;
   }

   public final void n5(boolean var1) {
      this.x9 = var1;
   }

   public final int l6() {
      return this.e5;
   }

   public final void n5(int var1) {
      this.e5 = var1;
   }

   public final int k5() {
      return this.b3;
   }

   public final void l6(int var1) {
      this.b3 = var1;
   }

   public final byte[] u3() {
      return this.i1;
   }

   public final int n5(e2 var1, int var2) {
      this.e2 = var1;
      this.e2.t2 = this;
      this.a5 = 15;
      this.v0 = 1 << this.a5;
      this.h2 = this.v0 - 1;
      this.m1 = 15;
      this.z8 = 1 << this.m1;
      this.k7 = this.z8 - 1;
      this.m3 = (this.m1 + 3 - 1) / 3;
      this.f0 = new byte[this.v0 * 2];
      this.o0 = new short[this.v0];
      this.j5 = new short[this.z8];
      this.a0 = 16384;
      this.i1 = new byte[this.a0 * 4];
      this.q0 = this.a0;
      this.r4 = 3 * this.a0;
      this.y0 = var2;
      this.j9 = 0;
      this.a6();
      return 0;
   }

   public final void a6() {
      this.e2.c8 = 0L;
      this.e2.u3 = 0L;
      this.e5 = 0;
      this.p3 = false;
      this.u6 = this.n5() ? 42 : 113;
      this.e2.n5(com.aspose.slides.internal.g3j.n5.n5(0L, null, 0, 0) & 4294967295L);
      this.y2 = false;
      this.n3();
      this.x8();
   }

   public final int l6(boolean var1) {
      if (this.e2.a6 != null && (this.e2.n5 != null || this.e2.k5 == 0) && (this.u6 != 666 || var1)) {
         if (this.e2.h0 == 0) {
            throw new com.aspose.slides.internal.z3b.n5("OutputBuffer is full (AvailableBytesOut == 0)");
         }

         boolean var2 = this.y2;
         this.y2 = var1;
         if (this.u6 == 42) {
            int var3 = 8 + (this.a5 - 8 << 4) << 8;
            int var4 = (this.y0 - 1 & 0xFF) >> 1;
            if (var4 > 3) {
               var4 = 3;
            }

            var3 |= var4 << 6;
            if (this.t1 != 0) {
               var3 |= 32;
            }

            var3 += 31 - var3 % 31;
            this.u6 = 113;
            this.u3(var3);
            if (this.t1 != 0) {
               this.u3((int)((this.e2.n5() & 4294967295L) >> 16));
               this.u3((int)(this.e2.n5() & 65535L));
            }

            this.e2.n5(com.aspose.slides.internal.g3j.n5.n5(0L, null, 0, 0) & 4294967295L);
         }

         if (this.e5 != 0) {
            this.e2.u3();
            if (this.e2.h0 == 0) {
               this.y2 = false;
               return 0;
            }
         } else if (this.e2.k5 == 0 && var1 != var2 && !var1) {
            return 0;
         }

         if (this.u6 == 666 && this.e2.k5 != 0) {
            throw new com.aspose.slides.internal.z3b.n5("status == FINISH_STATE && _codec.AvailableBytesIn != 0");
         }

         if (this.e2.k5 != 0 || this.d2 != 0 || var1 && this.u6 != 666) {
            int var7;
            switch (this.e9) {
               case 0:
                  var7 = this.u3(var1);
                  break;
               case 1:
                  var7 = this.k5(var1);
                  break;
               default:
                  var7 = this.a6(var1);
            }

            if (var7 == 2 || var7 == 3) {
               this.u6 = 666;
            }

            if (var7 == 0 || var7 == 2) {
               if (this.e2.h0 == 0) {
                  this.y2 = false;
               }

               return 0;
            }

            if (var7 == 1) {
               this.l6(0, 0, false);
               this.e2.u3();
               if (this.e2.h0 == 0) {
                  this.y2 = false;
                  return 0;
               }
            }
         }

         if (!var1) {
            return 0;
         } else if (this.n5() && !this.p3) {
            this.u3((int)(this.e2.n5() >> 16 & 4294967295L));
            this.u3((int)(this.e2.n5() & 65535L));
            this.e2.u3();
            this.p3 = true;
            return this.e5 != 0 ? 0 : 1;
         } else {
            return 1;
         }
      } else {
         throw new com.aspose.slides.internal.z3b.n5(d1.n5);
      }
   }

   public final int u9() {
      if (this.u6 != 42 && this.u6 != 113 && this.u6 != 666) {
         return -2;
      }

      this.i1 = null;
      this.j5 = null;
      this.o0 = null;
      this.f0 = null;
      return this.u6 == 113 ? -3 : 0;
   }

   public final void n5(short[] var1, int var2) {
      int var3 = this.k5[var2];

      for (int var4 = var2 << 1; var4 <= this.u3; var4 <<= 1) {
         if (var4 < this.u3 && n5(var1, this.k5[var4 + 1], this.k5[var4], this.n5)) {
            var4++;
         }

         if (n5(var1, var3, this.k5[var4], this.n5)) {
            break;
         }

         this.k5[var2] = this.k5[var4];
         var2 = var4;
      }

      this.k5[var2] = var3;
   }

   private static boolean n5(short[] var0, int var1, int var2, byte[] var3) {
      short var4 = var0[var1 * 2];
      short var5 = var0[var2 * 2];
      return var4 < var5 || var4 == var5 && var3[var1] <= var3[var2];
   }

   private int k5(boolean var1) {
      int var2 = 0;

      while (true) {
         if (this.d2 < 262) {
            this.y4();
            if (this.d2 < 262 && !var1) {
               return 0;
            }

            if (this.d2 == 0) {
               this.u9(var1);
               if (this.e2.h0 == 0) {
                  if (var1) {
                     return 2;
                  }

                  return 0;
               }

               return var1 ? 3 : 1;
            }
         }

         if (this.d2 >= 3) {
            this.w1 = (this.w1 << this.m3 ^ this.f0[this.t1 + 2] & 255 & 0xFF) & this.k7;
            var2 = this.j5[this.w1] & '\uffff';
            this.o0[this.t1 & this.h2] = this.j5[this.w1];
            this.j5[this.w1] = (short)this.t1;
         }

         if (var2 != 0L && (this.t1 - var2 & 65535) <= this.v0 - 262 && this.j9 != 2) {
            this.s3 = this.k5(var2);
         }

         boolean var3;
         if (this.s3 < 3) {
            var3 = this.n5(0, this.f0[this.t1] & 255 & 0xFF);
            this.d2--;
            this.t1++;
         } else {
            var3 = this.n5(this.t1 - this.p8, this.s3 - 3);
            this.d2 = this.d2 - this.s3;
            if (this.s3 <= this.z6.u3 && this.d2 >= 3) {
               this.s3--;

               do {
                  this.t1++;
                  this.w1 = (this.w1 << this.m3 ^ this.f0[this.t1 + 2] & 255 & 0xFF) & this.k7;
                  var2 = this.j5[this.w1] & '\uffff';
                  this.o0[this.t1 & this.h2] = this.j5[this.w1];
                  this.j5[this.w1] = (short)this.t1;
               } while (--this.s3 != 0);

               this.t1++;
            } else {
               this.t1 = this.t1 + this.s3;
               this.s3 = 0;
               this.w1 = this.f0[this.t1] & 255 & 0xFF;
               this.w1 = (this.w1 << this.m3 ^ this.f0[this.t1 + 1] & 255 & 0xFF) & this.k7;
            }
         }

         if (var3) {
            this.u9(false);
            if (this.e2.h0 == 0) {
               return 0;
            }
         }
      }
   }

   private int u3(boolean var1) {
      int var2 = 65535;
      if (var2 > this.i1.length - 5) {
         var2 = this.i1.length - 5;
      }

      while (true) {
         if (this.d2 <= 1) {
            this.y4();
            if (this.d2 == 0 && !var1) {
               return 0;
            }

            if (this.d2 == 0) {
               this.u9(var1);
               if (this.e2.h0 == 0) {
                  return var1 ? 2 : 0;
               }

               return var1 ? 3 : 1;
            }
         }

         this.t1 = this.t1 + this.d2;
         this.d2 = 0;
         int var3 = this.t4 + var2;
         if (this.t1 == 0 || this.t1 >= var3) {
            this.d2 = this.t1 - var3;
            this.t1 = var3;
            this.u9(false);
            if (this.e2.h0 == 0) {
               return 0;
            }
         }

         if (this.t1 - this.t4 >= this.v0 - 262) {
            this.u9(false);
            if (this.e2.h0 == 0) {
               return 0;
            }
         }
      }
   }

   private int a6(boolean var1) {
      int var2 = 0;
      short[] var3 = this.j5;
      byte[] var4 = this.f0;

      while (true) {
         if (this.d2 < 262) {
            this.y4();
            if (this.d2 < 262 && !var1) {
               return 0;
            }

            if (this.d2 == 0) {
               if (this.d5 != 0) {
                  this.n5(0, var4[this.t1 - 1] & 255 & 0xFF);
                  this.d5 = 0;
               }

               this.u9(var1);
               if (this.e2.h0 == 0) {
                  if (var1) {
                     return 2;
                  }

                  return 0;
               }

               return var1 ? 3 : 1;
            }
         }

         if (this.d2 >= 3) {
            this.w1 = (this.w1 << this.m3 ^ var4[this.t1 + 2] & 255 & 0xFF) & this.k7;
            var2 = var3[this.w1] & '\uffff';
            this.o0[this.t1 & this.h2] = var3[this.w1];
            var3[this.w1] = (short)this.t1;
         }

         this.z7 = this.s3;
         this.v4 = this.p8;
         this.s3 = 2;
         if (var2 != 0 && this.z7 < this.z6.u3 && (this.t1 - var2 & 65535) <= this.v0 - 262) {
            if (this.j9 != 2) {
               this.s3 = this.k5(var2);
            }

            if (this.s3 <= 5 && (this.j9 == 1 || this.s3 == 3 && this.t1 - this.p8 > 4096)) {
               this.s3 = 2;
            }
         }

         if (this.z7 >= 3 && this.s3 <= this.z7) {
            int var5 = this.t1 + this.d2 - 3;
            boolean var8 = this.n5(this.t1 - 1 - this.v4, this.z7 - 3);
            this.d2 = this.d2 - (this.z7 - 1);
            this.z7 -= 2;
            int var7 = this.w1;

            do {
               if (++this.t1 <= var5) {
                  var7 = (var7 << this.m3 ^ var4[this.t1 + 2] & 255 & 0xFF) & this.k7;
                  var2 = var3[var7] & '\uffff';
                  this.o0[this.t1 & this.h2] = var3[var7];
                  var3[var7] = (short)this.t1;
               }
            } while (--this.z7 != 0);

            this.w1 = var7;
            this.d5 = 0;
            this.s3 = 2;
            this.t1++;
            if (var8) {
               this.u9(false);
               if (this.e2.h0 == 0) {
                  return 0;
               }
            }
         } else if (this.d5 != 0) {
            boolean var6 = this.n5(0, var4[this.t1 - 1] & 255 & 0xFF);
            if (var6) {
               this.u9(false);
            }

            this.t1++;
            this.d2--;
            if (this.e2.h0 == 0) {
               return 0;
            }
         } else {
            this.d5 = 1;
            this.t1++;
            this.d2--;
         }
      }
   }

   private void u9(boolean var1) {
      this.n5(this.t4 >= 0 ? this.t4 : -1, this.t1 - this.t4, var1);
      this.t4 = this.t1;
      this.e2.u3();
   }

   private void h0() {
      for (int var1 = 0; var1 < 286; var1++) {
         this.t2[var1 * 2] = 0;
      }

      for (int var2 = 0; var2 < 30; var2++) {
         this.c8[var2 * 2] = 0;
      }

      for (int var3 = 0; var3 < 19; var3++) {
         this.s7[var3 * 2] = 0;
      }

      this.t2[512] = 1;
      this.h0 = 0;
      this.u9 = 0;
      this.f2 = 0;
      this.y1 = 0;
   }

   private void n5(int var1, int var2, boolean var3) {
      int var4 = 0;
      int var5;
      int var6;
      if (this.y0 > 0) {
         if (this.z3 == 2) {
            this.s7();
         }

         this.y4.n5(this);
         this.n3.n5(this);
         var4 = this.t2();
         var5 = (int)((this.u9 + 3 + 7 & 4294967295L) >> 3);
         var6 = (int)((this.h0 + 3 + 7 & 4294967295L) >> 3);
         if (var6 <= var5) {
            var5 = var6;
         }
      } else {
         var6 = var2 + 5;
         var5 = var6;
      }

      if (var2 + 4 <= var5 && var1 != -1) {
         this.l6(var1, var2, var3);
      } else if (var6 == var5) {
         this.l6(2 + (var3 ? 1 : 0), 3);
         this.n5(com.aspose.slides.internal.g3j.u3.l6, com.aspose.slides.internal.g3j.u3.n5);
      } else {
         this.l6(4 + (var3 ? 1 : 0), 3);
         this.n5(this.y4.t2 + 1, this.n3.t2 + 1, var4 + 1);
         this.n5(this.t2, this.c8);
      }

      this.h0();
      if (var3) {
         this.c8();
      }
   }

   private void l6(int var1, int var2, boolean var3) {
      this.l6(0 + (var3 ? 1 : 0), 3);
      this.k5(var1, var2, true);
   }

   private boolean n5(int var1, int var2) {
      this.i1[this.q0 + this.y1 * 2] = (byte)((var1 & 4294967295L) >> 8 & 4294967295L);
      this.i1[this.q0 + this.y1 * 2 + 1] = (byte)var1;
      this.i1[this.r4 + this.y1] = (byte)var2;
      this.y1++;
      if (var1 == 0) {
         this.t2[var2 * 2]++;
      } else {
         this.f2++;
         var1--;
         this.t2[(com.aspose.slides.internal.g3j.a6.n5[var2] + 256 + 1) * 2]++;
         this.c8[com.aspose.slides.internal.g3j.a6.n5(var1) * 2]++;
      }

      if ((this.y1 & 8191) == 0 && this.y0 > 2) {
         int var3 = this.y1 * 8;
         int var4 = this.t1 - this.t4;

         for (int var5 = 0; var5 < 30; var5++) {
            var3 = (int)(var3 + this.c8[var5 * 2] * (5L + com.aspose.slides.internal.g3j.a6.a6[var5]));
         }

         var3 = (int)((var3 & 4294967295L) >> 3);
         if (this.f2 < this.y1 / 2 && var3 < var4 / 2) {
            return true;
         }
      }

      return this.y1 == this.a0 - 1 || this.y1 == this.a0;
   }

   private void c8() {
      if (this.z1 > 8) {
         this.a6(this.t9);
      } else if (this.z1 > 0) {
         this.n5((byte)this.t9);
      }

      this.t9 = 0;
      this.z1 = 0;
   }

   private int t2() {
      this.l6(this.t2, this.y4.t2);
      this.l6(this.c8, this.n3.t2);
      this.x8.n5(this);
      int var1 = 18;

      while (var1 >= 3 && this.s7[com.aspose.slides.internal.g3j.a6.u3[var1] * 2 + 1] == 0) {
         var1--;
      }

      this.u9 += 3 * (var1 + 1) + 5 + 5 + 4;
      return var1;
   }

   private void k5(int var1, int var2, boolean var3) {
      this.c8();
      this.c4 = 8;
      if (var3) {
         this.a6((short)var2);
      }

      this.a6((short)(~var2));
      this.n5(this.f0, var1, var2);
   }

   private int k5(int var1) {
      int var2 = this.z6.k5;
      int var3 = this.t1;
      int var4 = this.z7;
      int var5 = this.t1 > this.v0 - 262 ? this.t1 - (this.v0 - 262) : 0;
      int var6 = this.z6.a6;
      int var7 = this.h2;
      byte[] var8 = this.f0;
      int var9 = this.t1 + 258;
      byte var10 = var8[var3 + var4 - 1];
      byte var11 = var8[var3 + var4];
      if (this.z7 >= this.z6.l6) {
         var2 >>= 2;
      }

      if (var6 > this.d2) {
         var6 = this.d2;
      }

      do {
         int var12 = var1;
         if ((var8[var12 + var4] & 255) == (var11 & 255) && (var8[var12 + var4 - 1] & 255) == (var10 & 255) && (var8[var12] & 255) == (var8[var3] & 255)) {
            if ((var8[++var12] & 255) == (var8[var3 + 1] & 255)) {
               var3 += 2;
               var12++;

               while (
                  var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var8[++var3] == var8[++var12]
                     && var3 < var9
               ) {
               }

               int var13 = 258 - (var9 - var3);
               var3 = var9 - 258;
               if (var13 > var4) {
                  this.p8 = var1;
                  var4 = var13;
                  if (var13 >= var6) {
                     break;
                  }

                  var10 = var8[var3 + var4 - 1];
                  var11 = var8[var3 + var4];
               }
            }
         }
      } while ((var1 = this.o0[var1 & var7] & '\uffff') > var5 && --var2 != 0);

      return var4 <= this.d2 ? var4 : this.d2;
   }

   private void u3(int var1) {
      this.n5((byte)(var1 >> 8));
      this.n5((byte)var1);
   }

   private void a6(int var1) {
      this.n5((byte)var1);
      this.n5((byte)((var1 & 4294967295L) >> 8));
   }

   private void l6(short[] var1, int var2) {
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
               this.s7[var9 * 2] = (short)(this.s7[var9 * 2] + var5);
            } else if (var9 != 0) {
               if (var9 != var3) {
                  this.s7[var9 * 2]++;
               }

               this.s7[32]++;
            } else if (var5 <= 10) {
               this.s7[34]++;
            } else {
               this.s7[36]++;
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

   private void n5(int var1, int var2, int var3) {
      this.l6(var1 - 257, 5);
      this.l6(var2 - 1, 5);
      this.l6(var3 - 4, 4);

      for (int var4 = 0; var4 < var3; var4++) {
         this.l6(this.s7[com.aspose.slides.internal.g3j.a6.u3[var4] * 2 + 1], 3);
      }

      this.k5(this.t2, var1 - 1);
      this.k5(this.c8, var2 - 1);
   }

   private void l6(int var1, int var2) {
      if (this.z1 > 16 - var2) {
         this.t9 = (short)(this.t9 & 65535 | var1 << this.z1 & 65535);
         this.a6(this.t9);
         this.t9 = (short)((var1 & 4294967295L) >> 16 - this.z1);
         this.z1 += var2 - 16;
      } else {
         this.t9 = (short)(this.t9 & 65535 | var1 << this.z1 & 65535);
         this.z1 += var2;
      }
   }

   private void n5(int var1, short[] var2) {
      int var3 = var1 * 2;
      this.l6(var2[var3] & 65535, var2[var3 + 1] & 65535);
   }

   private void n5(short[] var1, short[] var2) {
      int var3 = 0;
      if (this.y1 != 0) {
         byte[] var4 = this.u3();
         int var5 = this.q0;
         int var6 = this.r4;

         do {
            int var7 = (var4[var5 + var3 * 2] & 255) << 8 & 0xFF00 | var4[var5 + var3 * 2 + 1] & 255 & 0xFF;
            int var8 = var4[var6 + var3] & 255 & 0xFF;
            var3++;
            if (var7 == 0) {
               this.n5(var8, var1);
            } else {
               int var9 = com.aspose.slides.internal.g3j.a6.n5[var8];
               this.n5(var9 + 256 + 1, var1);
               int var10 = com.aspose.slides.internal.g3j.a6.u9[var9];
               if (var10 != 0) {
                  var8 -= com.aspose.slides.internal.g3j.a6.k5[var9];
                  this.l6(var8, var10);
               }

               var9 = com.aspose.slides.internal.g3j.a6.n5(--var7);
               this.n5(var9, var2);
               var10 = com.aspose.slides.internal.g3j.a6.a6[var9];
               if (var10 != 0) {
                  var7 -= com.aspose.slides.internal.g3j.a6.l6[var9];
                  this.l6(var7, var10);
               }
            }
         } while (var3 < this.y1);
      }

      this.n5(256, var1);
      this.c4 = var1[513];
   }

   private void k5(short[] var1, int var2) {
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
                  this.n5(var9, this.s7);
               } while (--var5 != 0);
            } else if (var9 != 0) {
               if (var9 != var3) {
                  this.n5(var9, this.s7);
                  var5--;
               }

               this.n5(16, this.s7);
               this.l6(var5 - 3, 2);
            } else if (var5 <= 10) {
               this.n5(17, this.s7);
               this.l6(var5 - 3, 3);
            } else {
               this.n5(18, this.s7);
               this.l6(var5 - 11, 7);
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

   private void s7() {
      int var1 = 0;
      short var2 = 0;
      short var3 = 0;

      while (var1 < 7) {
         var3 += this.t2[var1 * 2];
         var1++;
      }

      while (var1 < 128) {
         var2 += this.t2[var1 * 2];
         var1++;
      }

      while (var1 < 256) {
         var3 += this.t2[var1 * 2];
         var1++;
      }

      this.z3 = (byte)(var3 > var2 >> 2 ? 0 : 1);
   }

   private void x8() {
      this.a3 = 2 * this.v0;

      for (int var1 = 0; var1 < this.z8; var1++) {
         this.j5[var1] = 0;
      }

      this.z6 = com.aspose.slides.internal.g3j.k5.n5(this.y0);
      this.e9 = this.z6.n5;
      this.t1 = 0;
      this.t4 = 0;
      this.d2 = 0;
      this.z7 = 2;
      this.s3 = this.z7;
      this.d5 = 0;
      this.w1 = 0;
   }

   private void n3() {
      this.y4.c8 = this.t2;
      this.y4.s7 = com.aspose.slides.internal.g3j.u3.a6;
      this.n3.c8 = this.c8;
      this.n3.s7 = com.aspose.slides.internal.g3j.u3.u3;
      this.x8.c8 = this.s7;
      this.x8.s7 = com.aspose.slides.internal.g3j.u3.k5;
      this.t9 = 0;
      this.z1 = 0;
      this.c4 = 8;
      this.h0();
   }

   private void y4() {
      short[] var1 = this.j5;
      short[] var2 = this.o0;

      do {
         int var3 = this.a3 - this.d2 - this.t1;
         if (var3 == 0 && this.t1 == 0 && this.d2 == 0) {
            var3 = this.v0;
         } else if (var3 == -1) {
            var3--;
         } else if (this.t1 >= this.v0 + this.v0 - 262) {
            System.arraycopy(this.f0, this.v0, this.f0, 0, this.v0);
            this.p8 = this.p8 - this.v0;
            this.t1 = this.t1 - this.v0;
            this.t4 = this.t4 - this.v0;
            int var4 = this.z8;
            int var5 = var4;

            do {
               int var6 = var1[--var5] & '\uffff';
               var1[var5] = (short)(var6 >= this.v0 ? var6 - this.v0 : 0);
            } while (--var4 != 0);

            var4 = this.v0;
            var5 = var4;

            do {
               int var10 = var2[--var5] & '\uffff';
               var2[var5] = (short)(var10 >= this.v0 ? var10 - this.v0 : 0);
            } while (--var4 != 0);

            var3 += this.v0;
         }

         if (this.e2.k5 == 0) {
            return;
         }

         int var8 = this.e2.n5(this.f0, this.t1 + this.d2, var3);
         this.d2 += var8;
         if (this.d2 >= 3) {
            this.w1 = this.f0[this.t1] & 255 & 0xFF;
            this.w1 = (this.w1 << this.m3 ^ this.f0[this.t1 + 1] & 255 & 0xFF) & this.k7;
         }
      } while (this.d2 < 262 && this.e2.k5 != 0);
   }

   private void n5(byte[] var1, int var2, int var3) {
      System.arraycopy(var1, var2, this.i1, this.e5, var3);
      this.e5 += var3;
   }

   private void n5(byte var1) {
      this.i1[this.e5++] = var1;
   }
}
