package com.aspose.slides.internal.g7;

public class t9p extends r5w {
   public t9p(p6r var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected void n5() {
      this.k5 = new q7[this.n5.u3().size()];

      for (int var1 = 0; var1 < this.n5.u3().size(); var1++) {
         if (this.n5.u3().get_Item(var1).s7() != 1) {
            throw new d9m(com.aspose.slides.ms.System.d1.n5("Unsupported format {1} for lookup type: {0}",new Object[]{ this.n5.n5(), this.n5.u3().get_Item(var1).s7()}));
         }

         m5l var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5.u3().get_Item(var1), m5l.class);
         if (var2 == null) {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect table passed for lookup {0}", new Object[]{this.n5.n5()}));
         }

         this.k5[var1] = new v9e(var2, this.n5);
      }
   }
}
