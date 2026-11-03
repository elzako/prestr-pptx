package com.aspose.slides;

import com.aspose.slides.exceptions.OperationCanceledException;

/** Read-only cancellation observation; getNone() returns a token that never cancels. */
public class InterruptionToken implements IInterruptionToken {
   private static final InterruptionToken NONE = new InterruptionToken(null);
   private final InterruptionTokenSource source;

   public static InterruptionToken getNone() {
      return NONE;
   }

   InterruptionToken(InterruptionTokenSource source) {
      this.source = source;
   }

   @Override
   public final boolean isInterruptionRequested() {
      return this.source != null && this.source.isInterruptionRequested();
   }

   @Override
   public final void throwIfInterruptionRequested() {
      if (this.isInterruptionRequested()) {
         this.n5();
      }
   }

   private void n5() {
      throw new OperationCanceledException();
   }
}
