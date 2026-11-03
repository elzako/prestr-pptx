package com.aspose.slides.internal.w0;

import com.aspose.slides.ms.System.j8;

public class z1 extends com.aspose.slides.internal.v6g.h0<z1> {
   public byte n5;
   public byte l6;
   public byte k5;

   public void n5(z1 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public z1 n5() {
      z1 var1 = new z1();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(z1 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof z1) ? false : this.l6((z1)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z1 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z1 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
