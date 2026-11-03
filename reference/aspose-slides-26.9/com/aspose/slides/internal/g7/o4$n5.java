package com.aspose.slides.internal.g7;

class o4$n5 extends com.aspose.slides.internal.v6g.h0<o4$n5> {
   public byte n5;
   public byte l6;

   public o4$n5() {
   }

   public void n5(o4$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public o4$n5 n5() {
      o4$n5 var1 = new o4$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(o4$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof o4$n5) ? false : this.l6((o4$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o4$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(o4$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
