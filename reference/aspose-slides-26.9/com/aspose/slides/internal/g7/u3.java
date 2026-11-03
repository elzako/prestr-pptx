package com.aspose.slides.internal.g7;

class u3 {
   private z3 n5;
   private a6 l6;

   public u3(z3 var1, int var2) {
      this.l6 = new a6(var2);
      this.n5 = var1;
   }

   public final short n5() {
      short var1 = 1;

      short var3;
      do {
         boolean var2 = this.n5.l6();
         var1 = var2 ? this.l6.n5[var1].k5 : this.l6.n5[var1].l6;
         var3 = this.l6.n5[var1].u3;
      } while (var3 < 0);

      this.l6.l6(var1);
      return var3;
   }
}
