package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

class s8 extends a1k {
   public int n5;
   private int[] l6;
   private short[] k5;

   public s8(int var1, byte[] var2) {
      super("hmtx", var2);
      if (var1 <= 0) {
         throw new ArgumentException("Number of metrics in 'htmx' table must be more than zero");
      }

      t4 var3 = new t4(var2);
      this.n5 = var1;
      this.l6 = new int[var1];
      this.k5 = new short[var1];

      for (int var4 = 0; var4 < var1; var4++) {
         this.l6[var4] = var3.u9();
         this.k5[var4] = var3.h0();
      }
   }

   public final int n5(int var1) {
      return var1 < this.n5 ? this.l6[var1] : this.l6[this.n5 - 1];
   }

   public final short l6(int var1) {
      return var1 < this.n5 ? this.k5[var1] : this.k5[this.n5 - 1];
   }
}
