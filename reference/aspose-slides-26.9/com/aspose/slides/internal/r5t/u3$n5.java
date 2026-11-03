package com.aspose.slides.internal.r5t;

import java.util.concurrent.locks.ReentrantLock;

class u3$n5 {
   private ReentrantLock n5;
   private u3$n5$n5 l6;

   private u3$n5(ReentrantLock var1) {
      this.n5 = var1;
      this.l6 = new u3$n5$n5(this, false);
   }

   public ReentrantLock n5() {
      return this.n5;
   }

   // Restored original synthetic constructor delegation: (Ljava/util/concurrent/locks/ReentrantLock;Lcom/aspose/slides/internal/r5t/a6;)V -> (Ljava/util/concurrent/locks/ReentrantLock;)V
   u3$n5(java.util.concurrent.locks.ReentrantLock recoveredArg0, com.aspose.slides.internal.r5t.a6 recoveredArg1) {
      this(recoveredArg0);
   }
}
