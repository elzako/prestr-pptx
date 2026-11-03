package com.aspose.slides.internal.d8;

import com.aspose.slides.internal.f3.u3;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j8;

public class n5<TArg, TResult> extends h0<n5> {
   private u3<TArg, TResult> n5;
   private com.aspose.slides.ms.System.n5<TResult> l6;

   public n5() {
      this.n5 = null;
      this.l6 = null;
   }

   public n5(com.aspose.slides.ms.System.n5<TResult> var1, u3<TArg, TResult> var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public final void n5(TArg var1) {
      this.l6.invoke(this.n5.invoke((TArg)var1));
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
