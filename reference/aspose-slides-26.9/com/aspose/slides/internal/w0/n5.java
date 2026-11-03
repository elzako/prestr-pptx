package com.aspose.slides.internal.w0;

import com.aspose.slides.ms.System.j8;

public class n5 extends com.aspose.slides.internal.v6g.h0<n5> {
   public static final n5 n5 = new n5();
   public byte l6;
   public byte k5;
   public byte u3;
   public byte a6;

   public final z1 n5() {
      z1 var1 = new z1();
      var1.n5 = this.k5;
      var1.l6 = this.u3;
      var1.k5 = this.a6;
      return var1;
   }

   public final int l6() {
      return (this.l6 & 0xFF) << 24 | (this.k5 & 0xFF) << 16 | (this.u3 & 0xFF) << 8 | this.a6 & 0xFF;
   }

   public static n5 n5(int var0) {
      n5 var1 = new n5();
      var1.l6 = (byte)(var0 >> 24 & 0xFF);
      var1.k5 = (byte)(var0 >> 16 & 0xFF);
      var1.u3 = (byte)(var0 >> 8 & 0xFF);
      var1.a6 = (byte)(var0 & 0xFF);
      return var1;
   }

   public void n5(n5 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public n5 k5() {
      n5 var1 = new n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(n5 var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof n5) ? false : this.l6((n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
