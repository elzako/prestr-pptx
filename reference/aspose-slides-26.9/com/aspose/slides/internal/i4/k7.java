package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.ArrayList;
import java.util.Comparator;

public class k7 implements Comparator<g7> {
   private w2 n5;
   private u6 l6;

   public final w2 n5() {
      return this.n5;
   }

   public final u6 l6() {
      return this.l6;
   }

   public final int n5(g7 var1, g7 var2) {
      this.n5().n5(this.l6());
      ArrayList var3 = new ArrayList();
      var3.addItem(new d9(var1, 1));
      var3.addItem(new d9(var2, 1));
      new a7(var3).n5((j8)this.n5());
      return com.aspose.slides.ms.System.q1.u9(this.n5().t2().l6());
   }

   public k7(w2 var1, u6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(g7 bridgeArg0, g7 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
