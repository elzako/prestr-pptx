package com.aspose.slides.internal.f7;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.w0.z1;
import com.aspose.slides.ms.System.j8;

public class a6 extends h0<a6> {
   public int n5;
   public int l6;
   public int k5;
   public int u3;

   public final z1 n5() {
      z1 var1 = new z1();
      var1.k5 = (byte)this.n5;
      var1.l6 = (byte)this.l6;
      var1.n5 = (byte)this.k5;
      return var1;
   }

   public void n5(a6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public a6 l6() {
      a6 var1 = new a6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(a6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a6) ? false : this.l6((a6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
