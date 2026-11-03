package com.aspose.slides.internal.g7;

class t1 {
   private a5 n5;
   private v0 l6;

   public t1(v0 var1, a5 var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   public final void n5(u6 var1) {
      this.n5.n5(this.l6.k5().n5().e5);
      var1.n5(this.n5.k5());
      int var2 = 0;
      switch (var1.l6()) {
         case 0:
            var2 = this.l6.c8();
            break;
         case 3:
            int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.a6(), 8);
            var2 = var3 * 3 + 2;
      }

      var1.n5(new byte[var2]);

      for (int var4 = 0; var4 < var1.n5().length; var4++) {
         var1.n5()[var4] = this.n5.k5();
      }
   }
}
