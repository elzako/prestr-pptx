package com.aspose.slides.internal.r5t;

class u3$n5$n5 extends l6 {
   // $VF: synthetic field
   final u3$n5 n5;

   u3$n5$n5(u3$n5 var1, boolean var2) {
      super(var2, 1);
      this.n5 = var1;
   }

   @Override
   public boolean l6() {
      synchronized (this.l6) {
         this.k5 = true;
         this.l6.notify();
         this.k5().countDown();
         return true;
      }
   }
}
