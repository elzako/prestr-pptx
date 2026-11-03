package com.aspose.slides.internal.y9w;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import java.util.Comparator;

public class c8 implements Comparator<String> {
   public final int n5(String var1, String var2) {
      int var3 = a3.n5(var1.length(), var2.length());
      return var3 == 0 ? d1.h0(d1.t2(var1), d1.t2(var2)) : var3;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(String bridgeArg0, String bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
