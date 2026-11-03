package com.aspose.slides.internal.v7y;

class t2$n5 extends com.aspose.slides.internal.v6g.h0<t2$n5> {
   private j9 n5;
   private com.aspose.slides.internal.x6s.a6 l6;

   public t2$n5() {
   }

   public t2$n5(Object var1) {
      this.n5 = (j9)var1;
      this.l6 = null;
   }

   public final boolean n5() {
      this.l6 = this.n5.h0();
      return this.l6 != null;
   }

   public final void l6() {
      this.n5.t2();
   }

   public final String k5() {
      return this.l6.c8();
   }

   public void n5(t2$n5 var1) {
      var1 = var1 == null ? new t2$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public t2$n5 u3() {
      t2$n5 var1 = new t2$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(t2$n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof t2$n5) ? false : this.l6((t2$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t2$n5 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(t2$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
