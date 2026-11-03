package com.aspose.slides.internal.c5e;

class u9 {
   private final l6 n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8 = -1;
   private int n3 = -1;
   private final int y4;
   private final int e2;
   private final int t9;
   private int[][] z1;
   private byte[][] t4;

   u9(l6 var1) {
      this.n5 = var1;
      this.l6 = 0;
      if (this.n5.c8) {
         this.y4 = 8 / this.n5.k5;
         this.t9 = this.n5.k5;
         if (this.n5.k5 == 1) {
            this.e2 = 128;
         } else if (this.n5.k5 == 2) {
            this.e2 = 192;
         } else {
            this.e2 = 240;
         }
      } else {
         this.e2 = this.t9 = this.y4 = 1;
      }

      this.l6(1);
      this.n5(0);
   }

   void n5(int var1) {
      this.x8 = var1;
      this.n3 = var1 * this.a6 + this.h0;
      if (this.n3 < 0 || this.n3 >= this.n5.l6) {
         throw new t9("bad row - this should not happen");
      }
   }

   void l6(int var1) {
      if (this.l6 != var1) {
         this.l6 = var1;
         switch (this.l6) {
            case 1:
               this.a6 = this.u9 = 8;
               this.c8 = this.h0 = 0;
               break;
            case 2:
               this.a6 = this.u9 = 8;
               this.c8 = 4;
               this.h0 = 0;
               break;
            case 3:
               this.u9 = 4;
               this.a6 = 8;
               this.c8 = 0;
               this.h0 = 4;
               break;
            case 4:
               this.u9 = this.a6 = 4;
               this.c8 = 2;
               this.h0 = 0;
               break;
            case 5:
               this.u9 = 2;
               this.a6 = 4;
               this.c8 = 0;
               this.h0 = 2;
               break;
            case 6:
               this.u9 = this.a6 = 2;
               this.c8 = 1;
               this.h0 = 0;
               break;
            case 7:
               this.u9 = 1;
               this.a6 = 2;
               this.c8 = 0;
               this.h0 = 1;
               break;
            default:
               throw new t9("bad interlace pass" + this.l6);
         }

         this.k5 = (this.n5.l6 - this.h0) / this.a6 + 1;
         if ((this.k5 - 1) * this.a6 + this.h0 >= this.n5.l6) {
            this.k5--;
         }

         this.u3 = (this.n5.n5 - this.c8) / this.u9 + 1;
         if ((this.u3 - 1) * this.u9 + this.c8 >= this.n5.n5) {
            this.u3--;
         }

         if (this.u3 == 0) {
            this.k5 = 0;
         }

         this.s7 = this.u9 * this.n5.u3;
         this.t2 = this.c8 * this.n5.u3;
      }
   }

   void n5(int[] var1, int[] var2, boolean var3) {
      if (this.n5.c8 && var3) {
         this.n5(var1, var2);
      } else {
         int var4 = 0;

         for (int var5 = this.t2; var4 < this.u3 * this.n5.u3; var5 += this.s7) {
            for (int var6 = 0; var6 < this.n5.u3; var6++) {
               var2[var5 + var6] = var1[var4 + var6];
            }

            var4 += this.n5.u3;
         }
      }
   }

   private void n5(int[] var1, int[] var2) {
      int var3 = 0;
      int var4 = this.e2;
      int var5 = -1;
      int var6 = 0;

      for (int var7 = this.c8; var6 < this.u3; var7 += this.u9) {
         var3 = var6 / this.y4;
         if (++var5 >= this.y4) {
            var5 = 0;
         }

         var4 >>= this.t9;
         if (var5 == 0) {
            var4 = this.e2;
         }

         int var8 = var7 / this.y4;
         int var9 = var7 % this.y4;
         int var10 = var1[var3] & var4;
         int var11 = var9 - var5;
         if (var11 > 0) {
            var10 >>= var11 * this.t9;
         } else if (var11 < 0) {
            var10 <<= -var11 * this.t9;
         }

         var2[var8] |= var10;
         var6++;
      }
   }

   void n5(byte[] var1, byte[] var2, boolean var3) {
      if (this.n5.c8 && var3) {
         this.n5(var1, var2);
      } else {
         int var4 = 0;

         for (int var5 = this.t2; var4 < this.u3 * this.n5.u3; var5 += this.s7) {
            for (int var6 = 0; var6 < this.n5.u3; var6++) {
               var2[var5 + var6] = var1[var4 + var6];
            }

            var4 += this.n5.u3;
         }
      }
   }

   private void n5(byte[] var1, byte[] var2) {
      int var3 = 0;
      int var4 = this.e2;
      int var5 = -1;
      int var6 = 0;

      for (int var7 = this.c8; var6 < this.u3; var7 += this.u9) {
         var3 = var6 / this.y4;
         if (++var5 >= this.y4) {
            var5 = 0;
         }

         var4 >>= this.t9;
         if (var5 == 0) {
            var4 = this.e2;
         }

         int var8 = var7 / this.y4;
         int var9 = var7 % this.y4;
         int var10 = var1[var3] & var4;
         int var11 = var9 - var5;
         if (var11 > 0) {
            var10 >>= var11 * this.t9;
         } else if (var11 < 0) {
            var10 <<= -var11 * this.t9;
         }

         var2[var8] = (byte)(var2[var8] | var10);
         var6++;
      }
   }

   boolean n5() {
      return this.l6 == 7 && this.x8 == this.k5 - 1;
   }

   int l6() {
      return this.x8;
   }

   int k5() {
      return this.n3;
   }

   int u3() {
      return this.k5;
   }

   int a6() {
      return this.u3;
   }

   public int u9() {
      return this.a6();
   }

   int[][] h0() {
      return this.z1;
   }

   void n5(int[][] var1) {
      this.z1 = var1;
   }

   byte[][] c8() {
      return this.t4;
   }

   void n5(byte[][] var1) {
      this.t4 = var1;
   }
}
