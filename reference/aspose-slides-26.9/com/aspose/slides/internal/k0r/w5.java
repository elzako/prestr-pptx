package com.aspose.slides.internal.k0r;

public class w5 {
   private int n5;
   private int l6;

   public w5(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public int n5() {
      return this.n5;
   }

   public int l6() {
      return this.l6;
   }

   public long k5() {
      return (long)this.l6() << 32 | this.n5() & 4294967295L;
   }
}
