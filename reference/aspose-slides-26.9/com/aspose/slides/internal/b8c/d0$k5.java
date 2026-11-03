package com.aspose.slides.internal.b8c;

public class d0$k5 extends com.aspose.slides.internal.v6g.h0<d0$k5> {
   public com.aspose.slides.ms.System.Xml.k6 n5;
   public x4 l6;

   public d0$k5() {
   }

   public d0$k5(com.aspose.slides.ms.System.Xml.k6 var1, x4 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(d0$k5 var1) {
      var1 = var1 == null ? new d0$k5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public d0$k5 n5() {
      d0$k5 var1 = new d0$k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d0$k5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d0$k5) ? false : this.l6((d0$k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d0$k5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d0$k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
