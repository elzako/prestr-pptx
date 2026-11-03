package com.aspose.slides.internal.o8m;

public final class e5 {
   private int n5;
   private int l6;
   private int k5;

   public e5(int var1, int var2, int var3) {
      this.n5 = var2;
      this.l6 = var1;
      this.k5 = var3;
   }

   public int n5() {
      return this.n5;
   }

   public int l6() {
      return this.l6;
   }

   public int k5() {
      return this.k5;
   }

   boolean n5(int var1) {
      int var2 = var1 - this.l6();
      boolean var3 = var2 >= 0 && var1 <= this.n5();
      return this.k5() == 0 ? var3 : var3 && var2 % this.k5() == 0;
   }

   static boolean n5(e5[] var0, int var1) {
      for (e5 var5 : var0) {
         if (var5.n5(var1)) {
            return true;
         }
      }

      return false;
   }
}
