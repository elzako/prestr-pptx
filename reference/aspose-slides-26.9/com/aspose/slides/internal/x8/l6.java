package com.aspose.slides.internal.x8;

public abstract class l6 extends g7 {
   private b3 n5;
   private b3 l6;

   protected l6(b3 var1, b3 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   protected final b3 n5() {
      return this.n5;
   }

   protected final b3 l6() {
      return this.l6;
   }

   @Override
   public int k5() {
      return 10;
   }

   @Override
   public int u3() {
      return this.n5().u3() + this.l6().u3();
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.n5 var1) {
      ((g7)this.n5()).n5(var1);
      if (this.l6() != null) {
         ((g7)this.l6()).n5(var1);
      }

      super.n5(var1);
   }

   @Override
   public boolean a6() {
      return ((g7)this.n5()).a6() | ((g7)this.l6()).a6();
   }
}
