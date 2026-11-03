package com.aspose.slides.internal.b8c;

public class d9 extends com.aspose.slides.internal.v6g.h0<d9> {
   public int n5;
   public Object l6;

   public d9() {
   }

   public d9(int var1, Object var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(d9 var1) {
      var1 = var1 == null ? new d9() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public d9 n5() {
      d9 var1 = new d9();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d9 var1) {
      return var1.n5 == this.n5 && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d9) ? false : this.l6((d9)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d9 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d9 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
