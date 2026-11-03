package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.EqualityComparer;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;

class j4$n5 extends EqualityComparer<j4$n5> implements com.aspose.slides.ms.System.a5<j4$n5> {
   private final com.aspose.slides.internal.z0k.t4 l6;
   private String k5;

   public j4$n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      this.l6 = var1;
      com.aspose.slides.internal.z0k.n3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.z0k.n3.class);
      if (var2 != null) {
         this.k5 = var2.n5();
      }
   }

   public final boolean n5(j4$n5 var1) {
      if (var1 == null) {
         return false;
      } else {
         return !d1.n5(this.k5) && !d1.n5(var1.k5) ? d1.a6(this.k5, var1.k5) : this.l6.equals(var1.l6);
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      j4$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, j4$n5.class);
      return var2 == null ? false : this.n5(var2);
   }

   @Override
   public int hashCode() {
      return !d1.n5(this.k5) ? this.k5.hashCode() : this.l6.hashCode();
   }

   public int l6(j4$n5 var1) {
      return var1 == null ? 0 : var1.hashCode();
   }

   public boolean n5(j4$n5 var1, j4$n5 var2) {
      return var1 == null ? var2 == null : var1.n5(var2);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean equalsT(j4$n5 bridgeArg0, j4$n5 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int hashCodeT(j4$n5 bridgeArg0) {
      return this.l6(bridgeArg0);
   }

}
