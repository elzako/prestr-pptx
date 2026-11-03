package com.aspose.slides.internal.b7s;

import com.aspose.slides.internal.r1x.v3;

public class r4 implements u9 {
   private final v3 n5;
   private h0[] l6;
   private byte[] k5;
   private int u3;
   private int a6;
   private long u9;
   private int h0;
   private int c8;

   public r4(v3 var1) {
      this.n5 = var1;
      this.k5 = new byte[40000];
      this.u3 = 0;
      this.a6 = 0;
   }

   @Override
   public final void n5(h0[] var1) {
      this.l6 = var1;
   }

   @Override
   public final void n5(int var1, byte[] var2, int var3, int var4, int var5) {
   }

   @Override
   public final void l6(int var1, byte[] var2, int var3, int var4, int var5) {
      this.l6[var1].l6(var2, var3, var4, var5);
   }

   @Override
   public final void n5() {
      if ((this.k5[this.u3] & 255) != 255) {
         this.k5();
         if ((this.k5[this.u3] & 255) != 255) {
            throw new com.aspose.slides.internal.z3b.k5("TooMuchCompressedData");
         }
      }

      if ((this.u9 & 4294967295L) != 0L) {
         throw new com.aspose.slides.internal.z3b.k5("TooMuchCompressedData");
      }
   }

   public final int l6() {
      int var1 = this.s7();
      return this.a6 - var1;
   }

   public final int n5(int var1) {
      if (this.h0 < var1) {
         this.h0();
         if (this.h0 < var1) {
            throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
         }
      }

      com.aspose.slides.internal.f8y.n5.n5(var1 != 0 && var1 <= this.h0, "Invalid number of bits for reading.");
      com.aspose.slides.internal.f8y.n5.n5(var1 < 32, "Invalid number of bits for reading.");
      int var2 = (int)((this.u9 & 4294967295L) >> 32 - var1);
      this.l6(var1);
      return var2;
   }

   public final boolean k5() {
      if (this.h0 <= 0) {
         this.h0();
      }

      boolean var1 = (this.u9 & 4294967295L & -2147483648L & 4294967295L) != 0L;
      this.l6(1);
      return var1;
   }

   public final int u3() {
      if (this.h0 < 8) {
         this.h0();
      }

      return (int)((this.u9 & 4294967295L) >> 24);
   }

   public final int a6() {
      int var1 = this.t2();
      if (var1 >= 0) {
         this.l6(var1 + 1);
         return var1;
      }

      this.l6(15);
      int var2 = 15;

      while (!this.k5()) {
         var2++;
      }

      return var2;
   }

   public final void l6(int var1) {
      this.h0 -= var1;
      this.u9 = (this.u9 & 4294967295L) << (var1 & 31) & 4294967295L;
   }

   private void u9() {
      int var1 = this.a6 - this.u3;
      if (var1 <= 64) {
         if (var1 >= 0) {
            System.arraycopy(this.k5, this.u3 + 0, this.k5, 0, var1);
         }

         this.a6 = this.a6 - this.u3;
         this.c8 = this.c8 - this.u3;
         this.u3 = 0;
         int var2 = this.n5.n5(this.k5, this.a6, this.k5.length - var1);
         this.a6 += var2;
      }
   }

   private void h0() {
      com.aspose.slides.internal.f8y.n5.n5(this.h0 <= 24, "The number of valid bits should be less than or equal to 24.");
      if (!this.x8()) {
         this.u9();

         while (this.u3 < this.a6) {
            long var1 = this.k5[this.u3] & 0xFF;
            if ((var1 & 4294967295L) == 255L && (this.u3 == this.a6 - 1 || (this.k5[this.u3 + 1] & 255 & 128) != 0)) {
               if (this.h0 <= 0) {
                  throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
               } else {
                  return;
               }
            }

            this.u9 = (this.u9 | (var1 & 4294967295L) << (24 - this.h0 & 31)) & 4294967295L;
            this.u3++;
            this.h0 += 8;
            if ((var1 & 4294967295L) == 255L) {
               this.h0--;
            }

            if (this.h0 >= 24) {
               this.c8 = this.c8();
               return;
            }
         }

         if (this.h0 <= 0) {
            throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
         }
      }
   }

   private int c8() {
      int var1 = this.u3;

      while (var1 < this.a6 && (this.k5[var1] & 255) != 255) {
         var1++;
      }

      return var1;
   }

   private int t2() {
      if (this.h0 < 16) {
         this.h0();
      }

      long var1 = this.u9;

      for (int var3 = 0; var3 < 16; var3++) {
         if ((var1 & 4294967295L & -2147483648L & 4294967295L) != 0L) {
            return var3;
         }

         var1 = (var1 & 4294967295L) << 1 & 4294967295L;
      }

      return -1;
   }

   private int s7() {
      int var1 = this.h0;

      int var2;
      for (var2 = this.u3; var2 > 0; var2--) {
         int var3 = (this.k5[var2 - 1] & 255) == 255 ? 7 : 8;
         if (var1 < var3) {
            break;
         }

         var1 -= var3;
      }

      return var2;
   }

   private boolean x8() {
      if (this.u3 < this.c8 - 3) {
         this.u9 = (this.u9 | (this.k5(this.u3) & 4294967295L) >> this.h0) & 4294967295L;
         int var1 = 32 - this.h0 >> 3;
         this.u3 += var1;
         this.h0 += var1 * 8;
         com.aspose.slides.internal.f8y.n5.n5(this.h0 >= 24, "Condition validBits >= 24 is violated.");
         return true;
      } else {
         return false;
      }
   }

   private long k5(int var1) {
      return ((this.k5[var1 + 0] & 255) << 24 | (this.k5[var1 + 1] & 255) << 16 | (this.k5[var1 + 2] & 255) << 8 | this.k5[var1 + 3] & 0xFF) & 4294967295L;
   }
}
