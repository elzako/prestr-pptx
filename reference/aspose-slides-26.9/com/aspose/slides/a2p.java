package com.aspose.slides;

abstract class a2p extends h2v {
   public a2p(t9z var1) {
      super(var1);
   }

   protected final boolean u9() {
      h2v[] var1 = this.t2().t9().n5(this.c8());

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].n3() > this.n3()) {
            return false;
         }
      }

      return true;
   }

   protected final boolean h0() {
      h2v[] var1 = this.t2().t9().n5(this.c8());

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].n3() < this.n3()) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6() {
      if (this.d2() != 0.0F && this.d5() != 0.0F) {
         n1g var1 = this.e2().y4().t2();
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
         f9 var3 = new f9(var1);
         var3.n5(var2.y4());

         try {
            com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
            boolean var5 = this.e2().k5(var4.y4());
            if (!var5) {
               this.e2().l6(var4.y4());
               this.e2().n5(var4.y4());
            }
         } finally {
            var3.n5();
         }
      }
   }

   @Override
   void U_() {
      if (this.T_()) {
         if (this.e2() != null && !this.e2().k7().isNoEffects()) {
            n1g var1 = this.e2().y4().t2();
            com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
            f9 var3 = new f9(var1);
            var3.n5(var2.y4());

            try {
               com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
               this.e2().u3(var4.y4());
            } finally {
               var3.n5();
            }
         }
      }
   }

   abstract com.aspose.slides.internal.o9b.w1 u3();

   abstract com.aspose.slides.internal.o9b.w1 k5();

   protected final int c8() {
      return this.t2().l6.indexOf(this);
   }

   protected final f7c t2() {
      return (f7c)this.y1();
   }
}
