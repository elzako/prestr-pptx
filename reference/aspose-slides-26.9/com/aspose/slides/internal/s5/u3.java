package com.aspose.slides.internal.s5;

import com.aspose.slides.ms.System.j8;

public class u3 extends com.aspose.slides.internal.v6g.h0<u3> {
   public short n5;
   public short l6;
   public short k5;

   public u3() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
   }

   public u3(short var1, short var2, short var3) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = var3;
   }

   public u3(int var1, int var2, int var3) {
      this((short)var1, (short)var2, (short)var3);
   }

   public static u3 n5(short[] var0, int var1) {
      int var2 = var1 * 3;
      return new u3(var0[var2], var0[var2 + 1], var0[var2 + 2]);
   }

   public void n5(u3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public u3 n5() {
      u3 var1 = new u3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(u3 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u3) ? false : this.l6((u3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
