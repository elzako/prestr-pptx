package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class x1n {
   private final String[][] n5;

   public x1n(String[][] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("coordinates");
      }

      this.n5 = var1;
   }

   public final String[] n5(int var1) {
      return this.n5[var1];
   }

   public final void n5(int var1, String[] var2) {
      this.n5[var1] = var2;
   }

   public final String n5(int var1, int var2) {
      return w8s.k5(this.n5[var1][var2]);
   }

   public final char n5(int var1, int var2, int var3) {
      return this.n5(var1, var2).charAt(var3);
   }
}
