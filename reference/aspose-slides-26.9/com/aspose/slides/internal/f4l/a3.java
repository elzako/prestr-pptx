package com.aspose.slides.internal.f4l;

public final class a3 extends p8 {
   private int n5;
   private short l6;
   private com.aspose.slides.ms.System.u3 k5;
   private u3[] u3;
   private byte[] a6;
   private short u9;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void n5(short var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.u3 k5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.ms.System.u3 var1) {
      this.k5 = var1;
   }

   public final short u3() {
      return this.u9;
   }

   public final void l6(short var1) {
      this.u9 = var1;
   }

   public final u3[] a6() {
      return this.u3;
   }

   public final void n5(u3[] var1) {
      this.u3 = var1;
   }

   public final byte[] h0() {
      return this.a6;
   }

   public final void n5(byte[] var1) {
      this.a6 = var1;
   }

   public int c8() {
      int var1 = 4;
      var1 += 4;
      var1 += 4;
      if (this.n5 > 0) {
         if ((this.l6 & 2048) > 0) {
            var1 += this.n5 * 8;
         } else if ((this.l6 & 16384) > 0) {
            var1 += this.n5 * 4;
         } else {
            var1 += this.n5 * 8;
         }
      }

      if (this.u3 != null && this.u3.length > 0) {
         var1 += this.n5;
      }

      if (var1 % 4 != 0) {
         this.a6 = new byte[4 - var1 % 4];
         if (this.a6 != null) {
            var1 += this.a6.length;
         }
      }

      return var1;
   }
}
