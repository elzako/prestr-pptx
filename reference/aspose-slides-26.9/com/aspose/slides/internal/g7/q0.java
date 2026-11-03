package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

class q0 {
   private byte[] n5;
   private int l6;

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentException("Position cannot be less than zero");
      }

      if (var1 > this.n5.length) {
         throw new ArgumentException("Position is out of output bounds");
      }

      this.l6 = var1;
   }

   public q0(byte[] var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.n5[this.l6] = (byte)(var1 >> 24 & 0xFF);
      this.n5[this.l6 + 1] = (byte)(var1 >> 16 & 0xFF);
      this.n5[this.l6 + 2] = (byte)(var1 >> 8 & 0xFF);
      this.n5[this.l6 + 3] = (byte)(var1 & 0xFF);
      this.l6 += 4;
   }

   public final void n5(long var1) {
      this.n5[this.l6] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) >> 24, 10) & 255L, 10)), 10
      );
      this.n5[this.l6 + 1] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) >> 16, 10) & 255L, 10)), 10
      );
      this.n5[this.l6 + 2] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) >> 8, 10) & 255L, 10)), 10
      );
      this.n5[this.l6 + 3] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) & 255L, 10)), 10
      );
      this.l6 += 4;
   }

   public final void n5(short var1) {
      this.n5[this.l6] = (byte)(var1 >> 8 & 0xFF);
      this.n5[this.l6 + 1] = (byte)(var1 & 0xFF);
      this.l6 += 2;
   }

   public final void k5(int var1) {
      this.n5[this.l6] = (byte)(com.aspose.slides.internal.v6g.k5.k5(var1, 8) >> 8 & 0xFF);
      this.n5[this.l6 + 1] = (byte)(com.aspose.slides.internal.v6g.k5.u3(var1, 8) & 0xFF);
      this.l6 += 2;
   }

   public final void n5(byte var1) {
      this.n5[this.l6] = var1;
      this.l6++;
   }
}
