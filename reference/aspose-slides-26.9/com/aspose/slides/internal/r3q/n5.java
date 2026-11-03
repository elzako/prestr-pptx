package com.aspose.slides.internal.r3q;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p3;

public class n5 extends h0<n5> {
   private boolean l6;
   public long n5;

   public n5() {
   }

   public n5(long var1) {
      this.n5 = var1;
      this.l6 = true;
   }

   public final boolean n5() {
      return this.l6;
   }

   public final long l6() {
      if (!this.n5()) {
         throw new InvalidOperationException("NullableInt64 doesn't have a value.");
      } else {
         return this.n5;
      }
   }

   @Override
   public boolean equals(Object other) {
      if (!this.n5()) {
         return other == null;
      } else {
         return other == null ? false : p3.l6(this.n5, other);
      }
   }

   @Override
   public int hashCode() {
      return !this.n5() ? 0 : p3.n5(this.n5);
   }

   @Override
   public String toString() {
      return !this.n5() ? d1.n5 : p3.l6(this.n5);
   }

   public void n5(n5 var1) {
      var1.l6 = this.l6;
      var1.n5 = this.n5;
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
