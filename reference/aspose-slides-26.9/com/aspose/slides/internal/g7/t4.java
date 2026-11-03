package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

class t4 {
   private int n5;
   private byte[] l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentException("Position cannot be less than zero");
      }

      if (var1 > this.l6.length) {
         throw new ArgumentException("Position is out of input bounds");
      }

      this.n5 = var1;
   }

   public final int l6() {
      return this.l6.length;
   }

   public t4(byte[] var1) {
      this.l6 = var1;
   }

   public final long k5() {
      long var1 = com.aspose.slides.internal.v6g.k5.u9(this.u3(), 10);
      var1 <<= 32;
      return var1 | com.aspose.slides.internal.v6g.k5.u9(this.u3(), 10);
   }

   public final long u3() {
      long var1 = com.aspose.slides.internal.v6g.k5.a6(this.u9(), 8);
      var1 = com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) << 16, 10);
      return com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) | com.aspose.slides.internal.v6g.k5.a6(this.u9(), 8), 10);
   }

   public final int a6() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5], 6) << 24
         | com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5 + 1], 6) << 16
         | com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5 + 2], 6) << 8
         | com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5 + 3], 6);
      this.n5 += 4;
      return var1;
   }

   public final int u9() {
      int var1 = com.aspose.slides.internal.v6g.k5.k5(
         com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5 + 1], 6), 9
      );
      this.n5 += 2;
      return var1;
   }

   public final short h0() {
      short var1 = (short)(com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(this.l6[this.n5 + 1], 6));
      this.n5 += 2;
      return var1;
   }

   public final byte c8() {
      byte var1 = this.l6[this.n5];
      this.n5++;
      return var1;
   }
}
