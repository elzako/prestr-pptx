package com.aspose.slides;

class v5b implements k1e {
   private double n5;
   private x5r l6 = new x5r();
   private t8 k5;
   private boolean u3;

   private void n5(double var1) {
      this.n5 = var1;
   }

   public v5b(x5r var1, t8 var2) {
      this.reset();
      var1.n5(this.l6);
      this.k5 = var2;
   }

   @Override
   public final boolean hasNext() {
      if (this.u3) {
         this.n5(Double.NaN);
         return false;
      } else {
         this.n5(this.l6.k5(this.k5));
         this.u3 = true;
         return true;
      }
   }

   @Override
   public final void reset() {
      this.n5(Double.NaN);
      this.u3 = false;
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
