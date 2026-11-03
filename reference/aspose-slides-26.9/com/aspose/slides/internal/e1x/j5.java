package com.aspose.slides.internal.e1x;

import com.aspose.slides.ms.System.j8;

public class j5 extends com.aspose.slides.internal.v6g.h0<j5> {
   public int n5;
   public short l6;

   public j5() {
   }

   public j5(int var1, short var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public j5(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = var1.a6();
      this.l6 = var1.u3();
   }

   public final void n5(com.aspose.slides.internal.n2d.u3 var1) {
      var1.l6(this.n5 & 65535);
      var1.l6(this.l6);
   }

   public void n5(j5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public j5 n5() {
      j5 var1 = new j5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(j5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof j5) ? false : this.l6((j5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
