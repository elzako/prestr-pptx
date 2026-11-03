package com.aspose.slides.internal.g7;

class d0c$l6 extends com.aspose.slides.internal.v6g.h0<d0c$l6> {
   public byte n5;
   public byte l6;
   public byte k5;
   public byte u3;

   public d0c$l6() {
   }

   public void n5(d0c$l6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public d0c$l6 n5() {
      d0c$l6 var1 = new d0c$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d0c$l6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d0c$l6) ? false : this.l6((d0c$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d0c$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d0c$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
