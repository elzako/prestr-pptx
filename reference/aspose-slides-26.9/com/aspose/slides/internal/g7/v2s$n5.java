package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;
import java.util.Comparator;

public class v2s$n5 implements Comparator<r9> {
   private String n5;

   public v2s$n5(String var1) {
      this.n5 = var1;
   }

   public final int n5(r9 var1, r9 var2) {
      k2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      k2 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, k2.class);
      if (var3 != null && var4 != null) {
         return com.aspose.slides.ms.System.a3.n5(var3.n5(), var4.n5());
      } else {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Incorrect GlyphID instance in {0} list!", new Object[]{this.n5}));
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(r9 bridgeArg0, r9 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
