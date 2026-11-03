package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public class v8 extends com.aspose.slides.internal.v6g.h0<v8> {
   private int n5;
   private int l6;

   public v8() {
   }

   public v8(int var1, int var2) {
      this.n5(var1);
      this.l6(var2);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return (float)q1.z3(this.n5() * this.n5() + (double)this.l6() * this.l6());
   }

   public static v8 n5(v8 var0, v8 var1) {
      return new v8(var0.n5() - var1.n5(), var0.l6() - var1.l6());
   }

   public static s0 n5(v8 var0) {
      return new s0(var0.n5(), var0.l6());
   }

   public void l6(v8 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public v8 u3() {
      v8 var1 = new v8();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   private boolean k5(v8 var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof v8) ? false : this.k5((v8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v8 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v8 bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
