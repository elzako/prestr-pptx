package com.aspose.slides.internal.f4l;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class f2 extends n1 {
   private int n5;
   private int l6 = 900097;

   public f2() {
      this.n5 = 2;
   }

   public final int n5() {
      return this.l6;
   }

   private void n5(int var1) {
      if (var1 != 900097) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final int l6() {
      return this.n5;
   }

   private void l6(int var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(Object var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(var1, int.class);
      this.n5((int)((var2 & 4294963200L) >> 12));
      this.l6(var2 & 4095);
   }
}
