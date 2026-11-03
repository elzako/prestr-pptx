package com.aspose.slides.internal.b7s;

public class y1 implements u9 {
   private long n5;
   private int l6;
   private boolean k5;
   private y0 u3;
   private int a6;
   private h0[] u9;

   public y1(y0 var1) {
      this.u3 = var1;
      this.l6 = 32;
      this.n5 = 0L;
      this.k5 = false;
      this.a6 = 0;
   }

   @Override
   public final void n5(h0[] var1) {
      this.u9 = var1;
   }

   @Override
   public final void n5(int var1, byte[] var2, int var3, int var4, int var5) {
      this.u9[var1].n5(var2, var3, var4, var5);
   }

   @Override
   public final void l6(int var1, byte[] var2, int var3, int var4, int var5) {
   }

   @Override
   public final void n5() {
      this.l6();
      if (this.k5) {
         this.n5(0, (this.l6 - 1) % 8);
      } else {
         this.n5(0, this.l6 % 8);
      }

      this.l6();
      com.aspose.slides.internal.f8y.n5.n5(this.l6 == 32, "The number of free bits must be equal to 32 after all bits in the scan has been encoded.");
   }

   public final void n5(int var1) {
      this.n5((1 << var1) - 1, var1);
   }

   public final void n5(int var1, int var2) {
      com.aspose.slides.internal.f8y.n5.n5(var2 < 32 && var2 >= 0, "The number of bits must be in range [0, 32).");
      int var3 = (1 << var2) - 1;
      com.aspose.slides.internal.f8y.n5.n5((var1 | var3) == var3, "Not used bits must be set to zero.");
      this.l6 -= var2;
      if (this.l6 >= 0) {
         this.n5 = (this.n5 | (var1 & 4294967295L & 4294967295L) << (this.l6 & 31)) & 4294967295L;
      } else {
         this.n5 = (this.n5 | (var1 & 4294967295L & 4294967295L) >> -this.l6) & 4294967295L;
         this.l6();
         if (this.l6 < 0) {
            this.n5 = (this.n5 | (var1 & 4294967295L & 4294967295L) >> -this.l6) & 4294967295L;
            this.l6();
         }

         com.aspose.slides.internal.f8y.n5.n5(this.l6 >= 0, "The number of free bits must be equal to or greater than zero.");
         this.n5 = (this.n5 | (var1 & 4294967295L & 4294967295L) << (this.l6 & 31)) & 4294967295L;
      }
   }

   public final void l6() {
      for (int var1 = 0; var1 < 4 && this.l6 < 32; var1++) {
         byte var2;
         if (this.k5) {
            var2 = (byte)((this.n5 & 4294967295L) >> 25 & 4294967295L & 255L & 4294967295L);
            this.u3.n5(var2);
            this.n5 = (this.n5 & 4294967295L) << 7 & 4294967295L;
            this.l6 += 7;
         } else {
            var2 = (byte)((this.n5 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
            this.u3.n5(var2);
            this.n5 = (this.n5 & 4294967295L) << 8 & 4294967295L;
            this.l6 += 8;
         }

         this.k5 = (var2 & 255) == 255;
         this.a6++;
      }
   }
}
