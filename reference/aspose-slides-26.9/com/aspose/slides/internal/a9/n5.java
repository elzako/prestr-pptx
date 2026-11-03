package com.aspose.slides.internal.a9;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.w0.t4;
import com.aspose.slides.internal.w0.z1;
import com.aspose.slides.ms.System.j8;

public class n5 extends h0<n5> {
   public com.aspose.slides.internal.u0.n5<t4> n5 = new com.aspose.slides.internal.u0.n5<>();
   public byte[] l6;
   public IGenericList<z1> k5;

   public void n5(n5 var1) {
      this.n5.n5(var1.n5);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public n5 n5() {
      n5 var1 = new n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(n5 var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5);
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
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
