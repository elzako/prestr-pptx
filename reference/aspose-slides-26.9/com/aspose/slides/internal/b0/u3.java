package com.aspose.slides.internal.b0;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.internal.t5n.l6$n5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e2;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class u3 implements IGenericEqualityComparer<l6$n5> {
   public static final u3 n5 = new u3();

   public final boolean n5(l6$n5 var1, l6$n5 var2) {
      if (var1 == null && var2 == null) {
         return true;
      } else {
         return var1 != null && var2 != null ? this.k5(var1, var2) : false;
      }
   }

   public final int n5(l6$n5 var1) {
      if (j8.l6(var1, null)) {
         return 0;
      }

      int var2 = e2.n5(var1.y4);
      var2 = var2 * 397 ^ var1.e2.hashCode();
      return var2 * 397 ^ s3.n5(l6.k5(var1));
   }

   private boolean k5(l6$n5 var1, l6$n5 var2) {
      return var1.y4 == var2.y4 && d1.a6(var1.e2, var2.e2) && l6.k5(var1) == l6.k5(var2);
   }

   public boolean l6(l6$n5 var1, l6$n5 var2) {
      return this.n5(var1, var2);
   }

   public int l6(l6$n5 var1) {
      return this.n5(var1);
   }

   @Override
   public boolean equals(Object o, Object o1) {
      return this.l6(com.aspose.slides.internal.v6g.k5.n5(o, l6$n5.class), com.aspose.slides.internal.v6g.k5.n5(o1, l6$n5.class));
   }

   @Override
   public int hashCode(Object o) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(o, l6$n5.class));
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int hashCodeT(l6$n5 bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean equalsT(l6$n5 bridgeArg0, l6$n5 bridgeArg1) {
      return this.l6(bridgeArg0, bridgeArg1);
   }

}
