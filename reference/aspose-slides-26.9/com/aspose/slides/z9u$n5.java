package com.aspose.slides;

class z9u$n5 {
   private final int n5;
   private final int[] l6;
   private final String k5;

   public z9u$n5(int var1) {
      this.n5 = var1;
      this.l6 = null;
      this.k5 = null;
   }

   public z9u$n5(int var1, int... var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = null;
   }

   public z9u$n5(int var1, String var2) {
      this.n5 = var1;
      this.l6 = null;
      this.k5 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final String l6() {
      return this.k5;
   }

   public final int[] k5() {
      return this.l6;
   }

   public final boolean n5(int var1) {
      if (this.l6 != null) {
         for (int var5 : this.l6) {
            if (var5 == var1) {
               return true;
            }
         }
      }

      return false;
   }
}
