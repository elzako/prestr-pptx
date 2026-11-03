package com.aspose.slides.internal.b9y;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j8;

public class u9 extends h0<u9> {
   public byte n5;
   public byte l6;
   public int k5;
   public int u3;
   // $VF: synthetic field
   static final boolean a6 = !u9.class.desiredAssertionStatus();

   public void n5(u9 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public u9 n5() {
      u9 var1 = new u9();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(u9 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u9) ? false : this.l6((u9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = 31 * var1 + this.l6;
      var1 = 31 * var1 + this.k5;
      return 31 * var1 + this.u3;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u9 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u9 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
