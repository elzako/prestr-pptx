package com.aspose.slides.internal.g8v;

import java.util.concurrent.locks.ReentrantLock;

final class j8 extends y0 {
   // $VF: synthetic field
   final ReentrantLock n5;
   // $VF: synthetic field
   final y0 l6;

   j8(ReentrantLock var1, y0 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(z6 var1) {
      if (var1.c8()) {
         if (var1.h0()) {
            this.n5.unlock();
         }

         this.l6.n5(var1);
      } else {
         try {
            if (!var1.h0()) {
               this.n5.lock();
            }

            this.l6.n5(var1);
         } finally {
            this.n5.unlock();
         }
      }
   }
}
