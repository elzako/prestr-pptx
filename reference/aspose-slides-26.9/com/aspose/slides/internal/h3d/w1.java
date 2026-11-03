package com.aspose.slides.internal.h3d;

import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class w1 extends com.aspose.slides.internal.v6g.h0<w1> {
   private String l6;
   private y8 k5;
   private Object u3;
   // $VF: synthetic field
   static final boolean n5 = !w1.class.desiredAssertionStatus();

   public w1() {
   }

   public String n5() {
      return this.l6;
   }

   public y8 l6() {
      return this.k5;
   }

   public Object k5() {
      return this.u3;
   }

   w1(String var1, y8 var2, Object var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   public void n5(w1 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public w1 u3() {
      w1 var1 = new w1();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(w1 var1) {
      return j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5) && j8.n5(var1.u3, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof w1) ? false : this.l6((w1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      var1 = 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
      return 31 * var1 + (this.u3 != null ? this.u3.hashCode() : 0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w1 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
