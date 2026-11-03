package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class g4u implements q7 {
   private o6t n5;
   private p6r l6;

   public g4u(o6t var1, p6r var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      s2b var3 = var1.n5(var2[0]);
      int var4 = this.n5.l6().k5(var3.n5());
      return var4 == -1 ? false : this.n5(var1, var2, var4);
   }

   private boolean n5(g2x var1, int[] var2, int var3) {
      if (var3 > this.n5.k5() - 1) {
         throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect coverage index for lookup {0}", new Object[]{this.n5.a6()}));
      }

      List var4 = var1.n5();
      s2b var5 = (s2b)var4.get_Item(var2[0]);
      k2 var6 = new k2(this.n5.u3()[var3] & 65535);
      var4.set_Item(var2[0], new s2b(var6, var5.k5()));
      var1.n5(var2);
      return true;
   }
}
