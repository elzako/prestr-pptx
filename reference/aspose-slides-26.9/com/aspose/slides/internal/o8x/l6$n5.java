package com.aspose.slides.internal.o8x;

import com.aspose.slides.ms.System.j8;

class l6$n5 extends com.aspose.slides.internal.v6g.h0<l6$n5> {
   private c8[] n5;
   private n3 l6;
   private int k5;

   public l6$n5() {
   }

   public final void n5(int var1) {
      this.k5 = var1;
      this.n5 = (c8[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(c8.class), this.k5));
      this.l6 = new n3(null, 1);
      this.n5[0].n5(this.l6);
   }

   public final c8[] n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6.l6();
   }

   public final void n5(c8[][] var1, int[] var2) {
      var1[0] = this.n5;
      var2[0] = this.l6.l6();
      int var3 = this.l6.l6() + 1;
      this.l6.n5(var3);
      if (var3 >= this.n5.length) {
         if (this.k5 < 65536) {
            this.k5 *= 2;
         }

         this.n5 = (c8[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(c8.class), this.k5));
         this.l6.n5(this.n5);
         this.l6 = new n3(var1[0], this.l6.n5() + 1);
         this.n5[0].n5(this.l6);
      }
   }

   public void n5(l6$n5 var1) {
      var1 = var1 == null ? new l6$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public l6$n5 k5() {
      l6$n5 var1 = new l6$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(l6$n5 var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l6$n5) ? false : this.l6((l6$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6$n5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l6$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
