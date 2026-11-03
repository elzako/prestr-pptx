package com.aspose.slides.internal.g7;

public class o3i extends d2a {
   public o3i(l1b var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected void n5() {
      this.k5 = new q7[this.n5.u3().size()];

      for (int var1 = 0; var1 < this.n5.u3().size(); var1++) {
         j8m var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5.u3().get_Item(var1), j8m.class);
         if (var2 == null) {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect table passed for lookup {0}", new Object[]{this.n5.n5()}));
         }

         this.k5[var1] = new z6e(var2, this.n5);
      }
   }
}
