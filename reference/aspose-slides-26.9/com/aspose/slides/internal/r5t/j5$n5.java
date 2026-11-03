package com.aspose.slides.internal.r5t;

import java.util.TimerTask;

class j5$n5 extends TimerTask {
   private Object l6;
   private w1 k5;
   // $VF: synthetic field
   final j5 n5;

   j5$n5(j5 var1, w1 var2, Object var3) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
   }

   @Override
   public void run() {
      this.k5.n5(this.l6);
   }

   public j5$n5 n5() {
      return new j5$n5(this.n5, this.k5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5$n5 clone() {
      return this.n5();
   }

}
