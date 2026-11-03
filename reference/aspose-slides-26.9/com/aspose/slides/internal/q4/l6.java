package com.aspose.slides.internal.q4;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.j8;

public class l6 extends h0<l6> {
   public int n5;
   public int l6;
   public int k5;

   public final void n5(t4 var1) {
      var1.writeByte((byte)4);
      byte var2 = 0;
      byte var3 = 0;
      if (this.l6 >= 0) {
         var3 = (byte)this.l6;
         var2 = 1;
      }

      var2 = (byte)(var2 & 0xFF | this.k5 << 2);
      var1.writeByte(var2);
      int var4 = n5(this.n5);
      com.aspose.slides.internal.u0.l6.n5(var1, var4);
      var1.writeByte(var3);
      var1.writeByte((byte)0);
   }

   public static int n5(int var0) {
      return var0 / 10 & 65535;
   }

   public static int l6(int var0) {
      return (var0 & 65535) * 10;
   }

   public void n5(l6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public l6 n5() {
      l6 var1 = new l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(l6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l6) ? false : this.l6((l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
