package com.aspose.slides.internal.r5t;

import java.util.HashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class y1 extends ScheduledThreadPoolExecutor {
   private HashMap<Object, t2> n5 = new HashMap<>(1000);

   public y1(int var1) {
      super(var1);
   }

   @Override
   protected void finalize() {
      for (t2 var2 : this.n5.values()) {
         var2.k5();
      }

      this.n5.clear();
      super.finalize();
   }
}
