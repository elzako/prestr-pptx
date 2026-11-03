package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;

public abstract class n5$y4 implements com.aspose.slides.internal.h9s.u3 {
   private final int n5;
   private final int l6;
   private final int k5;
   private final long u3;
   private final long a6;
   private byte[] u9;
   private int h0;
   private int c8;
   private int t2;
   private long s7;
   private int x8;
   private long n3;
   private y2 y4 = new y2();
   private int e2;
   private long t9;

   protected n5$y4(int var1, int var2, int var3, y2 var4) {
      this.l6 = var2;
      this.k5 = var3;
      long var5 = (long)this.l6 * var1;
      this.a6 = (8L - var5 % 8L) % 8L;
      this.u3 = (var5 + 7L) / 8L * 8L;
      this.n5 = var1;
      var4.u3(this.y4);
      this.x8 = (int)(this.y4.c8() * this.u3 / 8L);
   }

   @Override
   public final int l6() {
      return this.e2;
   }

   protected final int k5() {
      return this.n5;
   }

   @Override
   public final boolean u3() {
      return this.u9 != null;
   }

   @Override
   public final void n5(Object var1, int var2, int[] var3) {
      if (this.u9 != null && this.s7 >= this.n5) {
         this.n5(var1, var2, var3, this.u9, this.c8, this.h0);
      }
   }

   @Override
   public final void n5(int var1, int var2) {
      this.t9 = var2 * this.u3 + (long)var1 * this.n5;
      this.x8 = 0;
   }

   @Override
   public final void n5(int var1) {
      this.t9 = var1 * this.u3;
      this.x8 = (int)(((long)this.y4.c8() - var1) * this.u3 / 8L);
   }

   @Override
   public final void n5(byte[] var1, int var2, Object var3, int var4, int[] var5) {
      if (var3 == null) {
         throw new ArgumentNullException("colors");
      }

      if (var4 - var5[0] <= 0) {
         throw new ArgumentOutOfRangeException("colors", "Cannot fill colors. Check the incoming array.");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("endOffset", "Expected positive integer.");
      }

      int var6 = 0;
      if (this.x8 > 0) {
         int var7 = q1.l6(var2, this.x8);
         var6 += var7;
         this.t9 += var7 * 8;
         this.x8 -= var7;
      } else if (this.u9 != null) {
         if (this.s7 >= this.n5) {
            throw new com.aspose.slides.internal.z3b.k5(
               "The method Convert was called incorrectly. Method FillLeftValues should be called first as there is some data pending to fill."
            );
         }

         long var8 = (this.n5 - this.s7 + 7L) / 8L;
         long var10 = q1.k5((long)var2 - var6, var8);
         long var12 = this.h0 + var10;
         byte[] var14 = new byte[(int)var12];

         int var15;
         for (var15 = 0; var15 < this.h0; var15++) {
            var14[var15] = this.u9[var15];
         }

         while (var15 < var12) {
            var14[var15] = var1[var6++];
            this.h0++;
            var15++;
         }

         this.u9 = var14;
         this.s7 += var10 * 8L;
         if (var10 == var8) {
            int var16 = (int)(this.t9 / this.u3);
            int var17 = (int)(this.t9 % this.u3 / this.n5);
            int var18 = (int)(this.s7 / this.n5);
            if (this.y4.k5()) {
               var18 = q1.l6(this.l6 - var17, var18);
            } else {
               var18 = q1.l6(this.y4.u9() - var17, var18);
            }

            if (var17 == 0) {
               this.n5();
            }

            if (var17 < this.y4.u3()) {
               int var19 = q1.l6(this.y4.u3() - var17, var18);
               this.n5(var14, this.c8, this.t2, var19);
               this.t9 = this.t9 + (long)var19 * this.n5;
            } else {
               var18 = q1.l6(var18, var4 - var5[0]);
               this.n5(var3, var5, var14, this.c8, this.t2, var18);
               var17 += var18;
               if (var17 == this.l6) {
                  this.t9 = ++var16 * this.u3;
               } else {
                  this.t9 = this.t9 + (long)var18 * this.n5;
               }
            }

            if (this.t9 % 8L > 0L) {
               var6--;
            }

            this.u9 = null;
            this.c8 = 0;
            this.h0 = 0;
            this.t2 = 0;
            this.s7 = 0L;
         }
      }

      if (var6 < var2) {
         this.n5(var3, var4, var5, var1, var6, var2);
      }

      this.e2 += var2;
   }

   protected void n5() {
   }

   protected void n5(byte[] var1, int var2, int var3, int var4) {
   }

   protected abstract void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6);

   private void n5(Object var1, int var2, int[] var3, byte[] var4, int var5, int var6) {
      int var7 = (int)(this.t9 / this.u3);
      int var8 = (int)(this.t9 % this.u3 / this.n5);
      if (var7 < this.k5 && var8 < this.l6) {
         int var9 = (int)(this.t9 % 8L);

         long var10;
         for (var10 = ((long)var6 - var5) * 8L - var9; var10 >= this.n5 && var3[0] < var2; var10 = ((long)var6 - var5) * 8L - var9) {
            int var12 = 0;
            if (this.y4.k5()) {
               var12 = q1.l6(this.l6 - var8, (int)(var10 / this.n5));
            } else {
               int[] var13 = new int[]{var5};
               int[] var14 = new int[]{var8};
               int[] var15 = new int[]{var7};
               this.n5(var4, var13, var10, var14, var15);
               var5 = var13[0];
               var8 = var14[0];
               var7 = var15[0];
               if (this.t9 == this.n3) {
                  var9 = (int)(this.t9 % 8L);
                  var12 = this.n5(var5, var6, var9, var8);
               }
            }

            var12 = q1.l6(var12, var2 - var3[0]);
            if (var12 > 0) {
               if (var8 == 0) {
                  this.n5();
               }

               this.n5(var1, var3, var4, var5, var9, var12);
               int var17 = (int)(((long)var12 * this.n5 + var9) / 8L);
               var5 += var17;
               var8 += var12;
               this.t9 = this.t9 + (long)var12 * this.n5;
               if (var8 == this.l6) {
                  var8 = 0;
                  var7++;
                  if (this.a6 > 0L) {
                     var5++;
                     this.t9 = this.t9 + this.a6;
                  }
               }
            }

            var9 = (int)(this.t9 % 8L);
         }

         this.n5(var4, var5, var6, var9, var10, var8, var7);
      }
   }

   private void n5(byte[] var1, int[] var2, long var3, int[] var5, int[] var6) {
      if (this.y4.l6(var5[0], var6[0])) {
         this.n3 = this.t9;
      } else {
         if (this.t9 >= this.n3) {
            if (var6[0] < this.y4.c8()) {
               this.n3 = this.y4.c8() * this.u3 + this.y4.u3() * this.n5;
            } else if (var6[0] >= this.y4.n5()) {
               this.n3 = this.k5 * this.u3;
            } else if (var5[0] < this.y4.u3()) {
               this.n3 = var6[0] * this.u3 + this.y4.u3() * this.n5;
            } else if (var6[0] + 1 == this.y4.n5()) {
               this.n3 = this.k5 * this.u3;
            } else {
               this.n3 = (var6[0] + 1) * this.u3 + this.y4.u3() * this.n5;
            }
         }

         long var7 = q1.k5(this.t9 + var3 / this.u3 * this.u3, this.n3);
         var3 -= var7 - this.t9;
         if (var7 % this.u3 + var3 >= this.u3) {
            long var9 = this.u3 - var7 % this.u3;
            long var11 = q1.k5(var7 + var9, this.n3);
            var3 -= var11 - var7;
            var7 = var11;
         }

         var7 = q1.k5(var7 + var3 / this.n5 * this.n5, this.n3);
         int var13 = (int)(var7 / this.u3);
         int var14 = (int)(var7 % this.u3 / this.n5);
         int var15 = (int)(var7 / 8L - this.t9 / 8L);
         var2[0] += var15;
         if (var13 >= this.y4.c8() && var13 < this.y4.n5() && var14 < this.y4.u9() && var14 > 0) {
            if (var6[0] < var13) {
               int var16 = (int)((var7 - var13 * this.u3) / 8L);
               this.n5();
               this.n5(var1, var2[0] - var16, 0, var14);
            } else {
               if (var5[0] == 0) {
                  this.n5();
               }

               this.n5(var1, var2[0] - var15, (int)(this.t9 % 8L), var14 - var5[0]);
            }
         }

         var5[0] = var14;
         var6[0] = var13;
         this.t9 = var7;
      }
   }

   private int n5(long var1, long var3, long var5, int var7) {
      int var8 = (int)(((var3 - var1) * 8L - var5) / this.n5);
      int var9 = this.y4.u9() - var7;
      return q1.l6(var8, var9);
   }

   private void n5(byte[] var1, int var2, int var3, int var4, long var5, int var7, int var8) {
      if (var3 == var2) {
         this.u9 = null;
         this.h0 = 0;
         this.c8 = 0;
         this.t2 = 0;
         this.s7 = 0L;
      } else if (var5 < this.n5) {
         if (this.y4.k5() || this.y4.l6(var7, var8) || var8 >= this.y4.c8() && var8 < this.y4.n5() && var7 < this.y4.u9()) {
            this.h0 = (int)((long)var3 - var2);
            this.u9 = new byte[this.h0];

            for (int var9 = 0; var9 < this.h0; var9++) {
               this.u9[var9] = var1[var2++];
            }

            this.c8 = 0;
            this.t2 = var4;
            this.s7 = var5;
         } else {
            this.t9 += var5;
            this.x8 = (int)((this.u3 - this.t9 % this.u3) / 8L);
            this.u9 = null;
            this.h0 = 0;
            this.c8 = 0;
            this.t2 = 0;
            this.s7 = 0L;
         }
      } else if (var5 >= this.n5) {
         this.h0 = var3;
         this.u9 = var1;
         this.c8 = var2;
         this.t2 = var4;
         this.s7 = var5;
      }
   }
}
