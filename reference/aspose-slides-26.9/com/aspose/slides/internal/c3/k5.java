package com.aspose.slides.internal.c3;

public class k5 extends com.aspose.slides.internal.v6g.h0<k5> {
   private com.aspose.slides.internal.j3.z8 n5;
   private com.aspose.slides.internal.j3.z8 l6;

   public k5() {
   }

   public k5(com.aspose.slides.internal.j3.z8 var1) {
      this.n5 = var1;
      this.l6 = null;
   }

   public k5(com.aspose.slides.internal.j3.z8 var1, com.aspose.slides.internal.j3.z8 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final com.aspose.slides.internal.j3.z8 n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.j3.z8 l6() {
      return this.l6;
   }

   public void n5(k5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public k5 k5() {
      k5 var1 = new k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(k5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k5) ? false : this.l6((k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
