package com.aspose.slides.internal.r5t;

import java.util.concurrent.ThreadPoolExecutor;

final class q0 extends m1 {
   @Override
   public void invoke() {
      while (true) {
         label24: {
            if (z1.n5().size() > 0) {
               synchronized (z1.l6()) {
                  z1.n5().removeAll(new z3(this));
                  if (z1.n5().size() != 0) {
                     break label24;
                  }

                  z1.k5().shutdown();
                  z1.n5((ThreadPoolExecutor)null);
               }
            }

            z1.u3().set(false);
            return;
         }

         t2.l6(100);
      }
   }
}
