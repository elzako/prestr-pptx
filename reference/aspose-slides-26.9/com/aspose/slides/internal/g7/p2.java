package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;

public class p2 extends g9t {
   private v5 n5;
   private z4 l6;
   private Dictionary<Integer, z4> k5;
   private Dictionary<Integer, v5$l6> u3 = null;

   public p2(v5 var1, u0a var2, d7u var3) {
      super(null, var2, var3);
      this.n5 = var1;
      this.l6 = new m3(((v5$a6)var1.u9()).n5());
      this.k5 = new Dictionary<>(var1.u3().size());
      this.u3 = var1.u3();
   }

   @Override
   public z4 n5() {
      return this.l6;
   }

   @Override
   public z4 n5(int var1) {
      z4 var2 = null;
      z4[] var3 = new z4[]{var2};
      boolean var4 = !this.k5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         if (this.u3.containsKey(var1)) {
            var2 = new m3(((v5$u9)this.u3.get_Item(var1)).u9());
            this.k5.set_Item(var1, var2);
         } else {
            var2 = null;
         }
      }

      return var2;
   }
}
