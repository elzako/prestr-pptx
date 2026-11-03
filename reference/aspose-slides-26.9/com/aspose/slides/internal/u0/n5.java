package com.aspose.slides.internal.u0;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class n5<T> extends h0<n5> {
   public T n5;
   public T l6;

   public n5() {
   }

   public n5(T var1, T var2) {
      this.n5 = (T)var1;
      this.l6 = (T)var2;
   }

   @Override
   public String toString() {
      return d1.n5("{0} ; {1}", this.n5, this.l6);
   }

   public void n5(n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
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
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6);
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
