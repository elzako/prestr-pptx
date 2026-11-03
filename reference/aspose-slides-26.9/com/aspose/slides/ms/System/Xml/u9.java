package com.aspose.slides.ms.System.Xml;

public class u9 {
   private long[] n5;
   private int l6;
   private long k5 = 1L;

   public final void n5(boolean var1) {
      if ((this.k5 & 2147483648L & 4294967295L) != 0L) {
         this.k5();
      }

      this.k5 = ((this.k5 & 4294967295L) << 1 | (var1 ? 1L : 0L)) & 4294967295L;
   }

   public final boolean n5() {
      boolean var1 = (this.k5 & 4294967295L & 1L & 4294967295L) != 0L;
      this.k5 = (this.k5 & 4294967295L) >> 1 & 4294967295L;
      if ((this.k5 & 4294967295L) == 1L) {
         this.u3();
      }

      return var1;
   }

   public final boolean l6() {
      return (this.k5 & 4294967295L & 1L & 4294967295L) != 0L;
   }

   private void k5() {
      if (this.n5 == null) {
         this.n5 = new long[16];
      }

      this.n5[this.l6++] = this.k5;
      this.k5 = 1L;
      int var1 = this.n5.length;
      if (this.l6 >= var1) {
         long[] var2 = new long[2 * var1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), com.aspose.slides.ms.System.u3.n5((Object)(var2)), var1);
         this.n5 = var2;
      }
   }

   private void u3() {
      if (this.l6 > 0) {
         this.k5 = this.n5[--this.l6];
      }
   }
}
