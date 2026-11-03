package com.aspose.slides.internal.c4i;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class z1 extends m1 {
   private int n5;

   public z1(e5 var1) {
      super(var1);
   }

   public final int u3() {
      return this.n5;
   }

   public final void k5(int var1) {
      if (var1 > 63) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }
}
