package com.aspose.slides;

class v3c extends v6g {
   private g3y n5;
   private z4d[] l6;

   v3c(int var1, g3y var2) {
      this.n5 = var2;
      this.l6 = new z4d[var1];

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         this.l6[var3] = new z4d();
         this.n5(this.l6[var3]);
      }
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());

      for (z4d var5 : this.u3()) {
         var5.n3(var1);
      }
   }

   @Override
   protected void l6(z5 var1) {
      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   final z4d[] u3() {
      return this.l6;
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();

      try {
         for (int var2 = 1; var2 < this.l6.length; var2++) {
            var1.n5(
               new com.aspose.slides.internal.o9b.w1(this.l6[var2 - 1].p8(), this.l6[var2 - 1].f2()),
               new com.aspose.slides.internal.o9b.w1(this.l6[var2].p8(), this.l6[var2].f2())
            );
         }

         l6v var7 = d8.n5(this.n5, var1);
         com.aspose.slides.internal.x4g.s7 var3 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
         this.n5.t2().d2().n5(var3, var7, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
