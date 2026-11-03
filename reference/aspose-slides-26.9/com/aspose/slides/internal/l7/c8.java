package com.aspose.slides.internal.l7;

public abstract class c8 extends h0$n5 {
   private l6 n5;

   protected c8(u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   protected final l6 e2() {
      if (this.n5 == null) {
         this.n5 = this.n5(this.k5());
      }

      return this.n5;
   }

   @Override
   protected void n3() {
      this.n5 = null;
   }

   @Override
   public int x8() {
      return 0;
   }

   @Override
   public boolean s7() {
      return true;
   }

   @Override
   public int n5(com.aspose.slides.internal.m9.c8 var1) {
      return 0;
   }

   @Override
   public l6 n5() {
      if (!this.s7()) {
         return null;
      }

      l6 var1 = this.e2();
      this.n5(var1);
      return var1;
   }
}
