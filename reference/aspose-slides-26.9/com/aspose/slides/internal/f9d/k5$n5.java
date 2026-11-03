package com.aspose.slides.internal.f9d;

class k5$n5 {
   private int n5;
   private boolean l6;
   private k5$n5[] k5 = new k5$n5[2];

   private k5$n5() {
   }

   public final boolean n5() {
      return this.l6;
   }

   private void n5(boolean var1) {
      this.l6 = var1;
      if (var1) {
         this.k5 = null;
      }
   }

   public final int l6() {
      return this.n5;
   }

   private void l6(int var1) {
      this.n5 = var1;
   }

   public static void n5(k5$n5[] var0, int var1, int var2, int var3) {
      if (var0[0] == null) {
         var0[0] = new k5$n5();
      }

      k5$n5 var4 = var0[0];

      do {
         int var5 = var1 >> --var2 & 1;
         k5$n5 var6 = var4.n5(var5);
         if (var6 == null) {
            var6 = new k5$n5();
            var4.n5(var5, var6);
         }

         var4 = var6;
      } while (var2 > 0);

      var4.l6(var3);
      var4.n5(true);
   }

   public final k5$n5 n5(int var1) {
      return this.k5[var1];
   }

   private void n5(int var1, k5$n5 var2) {
      this.k5[var1] = var2;
   }
}
