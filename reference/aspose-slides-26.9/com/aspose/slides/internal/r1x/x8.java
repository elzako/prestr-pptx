package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class x8 {
   private final x8$n5 n5;

   public x8(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("entries");
      }

      if (var1.length == 0) {
         throw new ArgumentOutOfRangeException("entries", "At least one palette entry should be specified.");
      }

      this.n5 = new x8$n5();
      this.n5.n5(var1);
   }

   public final int n5(int var1) {
      return this.n5.n5(var1);
   }
}
