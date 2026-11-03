package com.aspose.slides;

import java.util.concurrent.atomic.AtomicBoolean;

/** Thread-safe, one-way cancellation source; use a fresh source for an independent job. */
public class InterruptionTokenSource {
   private final AtomicBoolean interruptionRequested = new AtomicBoolean();

   public final InterruptionToken getToken() {
      return new InterruptionToken(this);
   }

   public final boolean isInterruptionRequested() {
      return this.interruptionRequested.get();
   }

   public final void interrupt() {
      this.interruptionRequested.set(true);
   }
}
