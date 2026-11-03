package com.aspose.slides.internal.k0r;

public class e0 extends r4 {
   public e0() {
      this.w1().n5(2005);
   }

   public int l6() {
      int var1 = -1;

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if (this.k5(this.e2().get_Item(var2))) {
            var1 = com.aspose.slides.ms.System.q1.n5((int)(var1), (int)(this.e2().get_Item(var2).w1().k5()));
         }
      }

      return var1;
   }

   private boolean k5(e6r var1) {
      return var1 instanceof z0;
   }
}
