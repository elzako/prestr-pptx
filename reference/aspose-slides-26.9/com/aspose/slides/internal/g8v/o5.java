package com.aspose.slides.internal.g8v;

import java.util.concurrent.locks.ReentrantLock;

final class o5 extends j9 {
   // $VF: synthetic field
   final j9 n5;
   // $VF: synthetic field
   final ReentrantLock l6;

   o5(j9 var1, ReentrantLock var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public boolean n5(z6 var1) {
      boolean var2 = this.n5.n5(var1);
      if (var2) {
         this.l6.unlock();
      }

      return var2;
   }
}
