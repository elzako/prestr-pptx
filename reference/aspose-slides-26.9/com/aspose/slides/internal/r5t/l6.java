package com.aspose.slides.internal.r5t;

public class l6 extends c4 {
   public l6(boolean var1, int var2) {
      this.k5 = var1;
      this.u3 = var2;
   }

   public boolean n5() {
      synchronized (this.l6) {
         this.k5 = false;
         return true;
      }
   }

   public boolean l6() {
      synchronized (this.l6) {
         this.k5 = true;
         this.l6.notifyAll();
         this.k5().countDown();
         return true;
      }
   }
}
