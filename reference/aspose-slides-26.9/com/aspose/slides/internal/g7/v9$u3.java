package com.aspose.slides.internal.g7;

class v9$u3 extends com.aspose.slides.internal.v6g.h0<v9$u3> {
   public short n5;
   public short l6;

   public v9$u3() {
   }

   public v9$u3(short var1, short var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(v9$u3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public v9$u3 n5() {
      v9$u3 var1 = new v9$u3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(v9$u3 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof v9$u3) ? false : this.l6((v9$u3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v9$u3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v9$u3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
