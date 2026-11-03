package com.aspose.slides.internal.e5;

class e5$n5 {
   private boolean n5 = false;
   private r4 l6;
   private e5 k5;

   public e5$n5(k5 var1, e5 var2) {
      this.l6 = (r4)var1;
      this.k5 = var2;
   }

   public final boolean n5() {
      if (!this.n5) {
         k5 var1 = this.l6.h0();

         while (var1.l6()) {
            int var2 = com.aspose.slides.internal.v3.l6.n5(var1.u3());
            if (var2 == 1) {
               if (e5.n5(this.k5) == 108) {
                  this.n5 = true;
                  return this.n5;
               }
            } else if (var2 != 4) {
               return this.n5;
            }
         }

         this.n5 = e5.l6(this.k5) || e5.k5(this.k5);
      }

      return this.n5;
   }

   public final void l6() {
      this.n5 = false;
   }
}
