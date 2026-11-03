package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class w1 extends com.aspose.slides.internal.v6g.h0<w1> {
   private static final w1 n5 = new w1();
   private float l6;
   private float k5;
   private float u3;
   private float a6;

   public w1() {
   }

   public w1(float var1, float var2, float var3, float var4) {
      this.u3 = var1;
      this.a6 = var2;
      this.k5 = var3;
      this.l6 = var4;
   }

   public float n5() {
      return this.u3;
   }

   public void n5(float var1) {
      this.u3 = var1;
   }

   public float l6() {
      return this.a6;
   }

   public void l6(float var1) {
      this.a6 = var1;
   }

   public float k5() {
      return this.k5;
   }

   public void k5(float var1) {
      this.k5 = var1;
   }

   public float u3() {
      return this.l6;
   }

   public void u3(float var1) {
      this.l6 = var1;
   }

   public float a6() {
      return this.n5() + this.k5();
   }

   public float u9() {
      return this.l6() + this.u3();
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof w1)) {
         return false;
      }

      w1 var2 = ((w1)obj).h0();
      return var2.n5() == this.n5() && var2.l6() == this.l6() && var2.k5() == this.k5() && var2.u3() == this.u3();
   }

   @Override
   public int hashCode() {
      return (int)(
         (long)this.n5()
            ^ ((long)this.l6() << 13 & 4294967295L | (long)this.l6() >> 19)
            ^ ((long)this.k5() << 26 & 4294967295L | (long)this.k5() >> 6)
            ^ ((long)this.u3() << 7 & 4294967295L | (long)this.u3() >> 25)
      );
   }

   @Override
   public String toString() {
      return d1.n5(com.aspose.slides.internal.x7n.l6.u3(), "{{X={0}, Y={1}, Width={2}, Height={3}}}", this.u3, this.a6, this.k5, this.l6);
   }

   public void n5(w1 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public w1 h0() {
      w1 var1 = new w1();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.h0();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1 Clone() {
      return this.h0();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w1 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
