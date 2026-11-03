package com.aspose.slides.internal.g7;

public class x6s extends r5w {
   private q8 u3;

   public x6s(p6r var1, int var2, q8 var3) {
      super(var1, var2);
      this.u3 = var3;
   }

   @Override
   protected void n5() {
      this.k5 = new q7[this.n5.u3().size()];

      for (int var1 = 0; var1 < this.n5.u3().size(); var1++) {
         if (this.n5.u3().get_Item(var1).s7() != 2) {
            throw new d9m(com.aspose.slides.ms.System.d1.n5("Unsupported format {1} for lookup type: {0}",new Object[]{ this.n5.n5(), this.n5.u3().get_Item(var1).s7()}));
         }

         t1z var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5.u3().get_Item(var1), t1z.class);
         if (var2 == null) {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect table passed for lookup {0}", new Object[]{this.n5.n5()}));
         }

         this.k5[var1] = new d0p(var2, this.n5, this.l6, this.u3);
      }
   }
}
