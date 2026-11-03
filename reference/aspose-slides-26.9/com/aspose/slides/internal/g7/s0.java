package com.aspose.slides.internal.g7;

class s0 {
   private a5 n5;

   public s0(a5 var1) {
      this.n5 = var1;
   }

   final void n5(j8 var1) {
      var1.n5(this.n5.l6());
      var1.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.a6(), 8));
      if (var1.k5() > 0) {
         var1.n5(this.n5.u9());
         var1.n5(new int[var1.k5() + 1]);

         for (int var2 = 0; var2 <= var1.k5(); var2++) {
            var1.a6()[var2] = this.n5.n5(com.aspose.slides.internal.v6g.k5.u3(var1.u3(), 6));
         }

         int var5 = var1.a6()[var1.a6().length - 1];
         int var3 = var5 - 1;
         var1.n5(new byte[var3]);

         for (int var4 = 0; var4 < var1.u9().length; var4++) {
            var1.u9()[var4] = this.n5.k5();
         }
      }

      var1.l6(this.n5.l6() - 1L);
   }
}
