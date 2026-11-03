package com.aspose.slides.internal.b8c;

class c2$n5$n5 extends com.aspose.slides.internal.v6g.h0<c2$n5$n5> {
   public char n5;
   public String l6;

   public c2$n5$n5() {
   }

   public c2$n5$n5(char var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(c2$n5$n5 var1) {
      var1 = var1 == null ? new c2$n5$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public c2$n5$n5 n5() {
      c2$n5$n5 var1 = new c2$n5$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(c2$n5$n5 var1) {
      return var1.n5 == this.n5 && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c2$n5$n5) ? false : this.l6((c2$n5$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c2$n5$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c2$n5$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
