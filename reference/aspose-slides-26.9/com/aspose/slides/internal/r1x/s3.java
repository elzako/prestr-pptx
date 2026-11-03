package com.aspose.slides.internal.r1x;

public class s3 extends com.aspose.slides.internal.v6g.h0<s3> {
   public boolean n5;
   public String l6;

   public void n5(s3 var1) {
      var1 = var1 == null ? new s3() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public s3 n5() {
      s3 var1 = new s3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(s3 var1) {
      return var1.n5 == this.n5 && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof s3) ? false : this.l6((s3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
