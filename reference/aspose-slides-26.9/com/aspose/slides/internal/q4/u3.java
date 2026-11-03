package com.aspose.slides.internal.q4;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.j8;

public class u3 extends h0<u3> {
   public int n5;
   public int l6;
   public byte k5;
   public int u3;

   public final void n5(t4 var1) {
      com.aspose.slides.internal.u0.l6.n5(var1, this.n5 & 65535);
      com.aspose.slides.internal.u0.l6.n5(var1, this.l6 & 65535);
      byte var2 = com.aspose.slides.internal.q4.k5.n5(this.u3);
      var1.writeByte(var2);
      var1.writeByte(this.k5);
      byte var3 = 0;
      var1.writeByte(var3);
   }

   public void n5(u3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
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
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
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
