package com.aspose.slides.internal.e9;

import com.aspose.slides.ms.System.a3;
import java.util.Comparator;

public class k5$u3 implements Comparator<k5$a6> {
   public final int n5(k5$a6 var1, k5$a6 var2) {
      k5$n5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.l6(), k5$n5.class);
      k5$n5 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), k5$n5.class);
      int var5 = var3 != null && var4 != null ? com.aspose.slides.internal.v6g.k5.u3(var3.n5().n5(), 14) : var1.n5();
      int var6 = var3 != null && var4 != null ? com.aspose.slides.internal.v6g.k5.u3(var4.n5().n5(), 14) : var2.n5();
      if (var5 == var6) {
         var5 = var1.n5();
         var6 = var2.n5();
      }

      return a3.n5(var5, var6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(k5$a6 bridgeArg0, k5$a6 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
