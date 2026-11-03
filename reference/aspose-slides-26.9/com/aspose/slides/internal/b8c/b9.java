package com.aspose.slides.internal.b8c;

public class b9 extends com.aspose.slides.internal.v6g.h0<b9> {
   public s7 n5;
   public com.aspose.slides.ms.System.c4[] l6;

   public void n5(b9 var1) {
      var1 = var1 == null ? new b9() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public b9 n5() {
      b9 var1 = new b9();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(b9 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof b9) ? false : this.l6((b9)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b9 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b9 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
