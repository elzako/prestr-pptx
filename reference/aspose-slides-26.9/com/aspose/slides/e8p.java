package com.aspose.slides;

class e8p extends l5x {
   final void n5() {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "document-styles".equals(this.s7().n3())) {
            this.l6().u3().throwIfInterruptionRequested();
            com.aspose.slides.internal.k4y.t1g var1 = new com.aspose.slides.internal.k4y.t1g(this.s7());
            this.n5(var1);
         }
      }

      this.n3();
   }

   public e8p(com.aspose.slides.internal.c8m.z5 var1, z5q var2) {
      super(var1, var2);
   }

   private void n5(com.aspose.slides.internal.k4y.t1g var1) {
      i5s var2 = new i5s(var1.u3(), var1.a6(), null);
      this.l6().l6(var2);
   }
}
