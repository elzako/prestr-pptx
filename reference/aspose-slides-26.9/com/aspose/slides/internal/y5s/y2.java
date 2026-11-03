package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class y2 extends com.aspose.slides.internal.v6g.h0<y2> {
   private static final y2 n5 = new y2();
   private int l6;
   private int k5;

   public y2() {
   }

   public y2(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public int n5() {
      return this.l6;
   }

   public int l6() {
      return this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof y2)) {
         return false;
      }

      y2 var2 = ((y2)obj).k5();
      return var2.l6 == this.l6 && var2.k5 == this.k5;
   }

   @Override
   public int hashCode() {
      return this.l6 ^ this.k5;
   }

   @Override
   public String toString() {
      return d1.n5(com.aspose.slides.internal.x7n.l6.u3(), "{{Width={0}, Height={1}}}", this.l6, this.k5);
   }

   public void n5(y2 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public y2 k5() {
      y2 var1 = new y2();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y2 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y2 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
