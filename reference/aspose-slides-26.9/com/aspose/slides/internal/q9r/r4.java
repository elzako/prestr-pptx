package com.aspose.slides.internal.q9r;

import com.aspose.slides.ms.System.j8;

public class r4 extends com.aspose.slides.internal.v6g.h0<r4> {
   public int n5;
   public short l6;

   public r4() {
   }

   public r4(int var1, short var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public r4(com.aspose.slides.internal.z5z.n5 var1) {
      this.n5 = var1.a6();
      this.l6 = var1.u3();
   }

   public void n5(r4 var1) {
      var1 = var1 == null ? new r4() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public r4 n5() {
      r4 var1 = new r4();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(r4 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r4) ? false : this.l6((r4)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
