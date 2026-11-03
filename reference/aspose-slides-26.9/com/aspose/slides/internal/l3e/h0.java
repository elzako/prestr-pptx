package com.aspose.slides.internal.l3e;

import com.aspose.slides.ms.System.j8;

public class h0 extends com.aspose.slides.internal.v6g.h0<h0> {
   private int n5;
   private byte[] l6;
   private short[] k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final byte[] l6() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final short[] k5() {
      return this.k5;
   }

   public final void n5(short[] var1) {
      this.k5 = var1;
   }

   public void n5(h0 var1) {
      var1 = var1 == null ? new h0() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public h0 u3() {
      h0 var1 = new h0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(h0 var1) {
      return var1.n5 == this.n5 && j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof h0) ? false : this.l6((h0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h0 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(h0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
