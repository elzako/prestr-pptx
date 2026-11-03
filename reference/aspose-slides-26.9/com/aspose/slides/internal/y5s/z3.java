package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class z3 extends com.aspose.slides.internal.v6g.h0<z3> {
   private static final z3 n5 = new z3();
   private int l6;
   private int k5;

   public z3() {
   }

   public z3(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public static z3 n5() {
      return n5;
   }

   public int l6() {
      return this.l6;
   }

   public int k5() {
      return this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof z3)) {
         return false;
      }

      z3 var2 = ((z3)obj).u3();
      return var2.l6() == this.l6() && var2.k5() == this.k5();
   }

   @Override
   public int hashCode() {
      return this.l6 ^ this.k5;
   }

   @Override
   public String toString() {
      return d1.n5(com.aspose.slides.internal.x7n.l6.u3(), "{{X={0}, Y={1}}}", this.l6, this.k5);
   }

   public void n5(z3 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public z3 u3() {
      z3 var1 = new z3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z3 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
