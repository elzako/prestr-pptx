package com.aspose.slides.internal.g7;

public class r5d extends r5w {
   public r5d(p6r var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected void n5() {
      this.k5 = new q7[this.n5.u3().size()];

      for (int var1 = 0; var1 < this.n5.u3().size(); var1++) {
         if (this.n5.u3().get_Item(var1).s7() != 2) {
            throw new d9m(com.aspose.slides.ms.System.d1.n5("Unsupported format {1} for lookup type: {0}",new Object[]{ this.n5.n5(), this.n5.u3().get_Item(var1).s7()}));
         }

         w4w var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5.u3().get_Item(var1), w4w.class);
         if (var2 == null) {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect table passed for lookup {0}", new Object[]{this.n5.n5()}));
         }

         this.k5[var1] = new x7i(var2, this.n5);
      }
   }
}
