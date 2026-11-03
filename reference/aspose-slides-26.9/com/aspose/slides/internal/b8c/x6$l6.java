package com.aspose.slides.internal.b8c;

class x6$l6 extends com.aspose.slides.internal.v6g.h0<x6$l6> {
   public boolean n5;
   public double l6;
   public long k5;
   public int u3;
   public com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();

   public x6$l6() {
   }

   public void n5(x6$l6 var1) {
      var1 = var1 == null ? new x6$l6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      this.a6.u3(var1.a6);
   }

   public x6$l6 n5() {
      x6$l6 var1 = new x6$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(x6$l6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && com.aspose.slides.ms.System.j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof x6$l6) ? false : this.l6((x6$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x6$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(x6$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
