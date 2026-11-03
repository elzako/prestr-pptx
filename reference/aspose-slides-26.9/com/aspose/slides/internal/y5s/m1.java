package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class m1 extends com.aspose.slides.internal.v6g.h0<m1> {
   private static final m1 n5 = new m1();
   private float l6;
   private float k5;

   public m1() {
   }

   public m1(float var1, float var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public float n5() {
      return this.l6;
   }

   public void n5(float var1) {
      this.l6 = var1;
   }

   public float l6() {
      return this.k5;
   }

   public void l6(float var1) {
      this.k5 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof m1)) {
         return false;
      }

      m1 var2 = ((m1)obj).k5();
      return var2.n5() == this.n5() && var2.l6() == this.l6() && j8.n5(var2).k5(j8.n5(this));
   }

   @Override
   public int hashCode() {
      return (int)this.l6 << 16 | (int)this.k5 & 65535;
   }

   @Override
   public String toString() {
      return d1.n5(com.aspose.slides.internal.x7n.l6.u3(), "{{X={0}, Y={1}}}", this.l6, this.k5);
   }

   public void n5(m1 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public m1 k5() {
      m1 var1 = new m1();
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
   public m1 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(m1 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
