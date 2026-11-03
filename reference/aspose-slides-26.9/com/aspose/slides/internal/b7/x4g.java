package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class x4g {
   private int n5;

   public x4g() {
      this.n5(1);
   }

   public x4g(int var1) {
      this.n5(var1);
   }

   public int n5() {
      return this.n5;
   }

   private void n5(int var1) {
      if (var1 >= 1 && var1 <= 32767) {
         this.n5 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value");
      }
   }
}
