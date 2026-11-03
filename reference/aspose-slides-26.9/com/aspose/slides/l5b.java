package com.aspose.slides;

class l5b implements k1e {
   private double n5;
   private t8 l6;
   private c6u k5;
   private int u3;

   private void n5(double var1) {
      this.n5 = var1;
   }

   public l5b(c6u var1, t8 var2) {
      this.reset();
      this.k5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean hasNext() {
      while (++this.u3 < this.k5.c8()) {
         r6t var1 = this.k5.n5(this.u3);
         if (var1.c8() == 2) {
            this.n5(Double.NaN);
            throw new c1h((String)var1.u3());
         }

         if (var1.c8() == 1 && var1.u9() != null) {
            this.n5(var1.u9());
            return true;
         }
      }

      this.n5(Double.NaN);
      return false;
   }

   @Override
   public final void reset() {
      this.n5(Double.NaN);
      this.u3 = -1;
   }

   public Double n5() {
      return this.n5;
   }

   @Override
   public final void dispose() {
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Double next() {
      return this.n5();
   }

}
