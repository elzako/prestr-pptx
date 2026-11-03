package com.aspose.slides.internal.k1;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public abstract class k5 extends com.aspose.slides.internal.y6.u3 {
   private long n5;
   private int l6;
   private int k5;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      if ((var1 & 65535) != 1) {
         throw new ArgumentOutOfRangeException("value", "This value MUST be 0x0001");
      }

      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public abstract void n5(com.aspose.slides.internal.z0k.l6 var1);
}
