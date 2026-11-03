package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.j8;

public class d2 extends com.aspose.slides.internal.v6g.h0<d2> {
   public boolean n5;
   public int l6;
   public String k5;
   // $VF: synthetic field
   static final boolean u3 = !d2.class.desiredAssertionStatus();

   public void n5(d2 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public d2 n5() {
      d2 var1 = new d2();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d2 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d2) ? false : this.l6((d2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 ? 1 : 0;
      var1 = 31 * var1 + this.l6;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d2 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d2 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
