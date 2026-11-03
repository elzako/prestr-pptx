package com.aspose.slides.internal.j9e;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class y4$n5 implements IEnumerator<com.aspose.slides.internal.m5l.l6> {
   private Iterator<com.aspose.slides.internal.m5l.l6> n5;
   private boolean l6 = false;

   public y4$n5(Iterator<com.aspose.slides.internal.m5l.l6> var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.m5l.l6 n5() {
      if (!this.l6) {
         throw new InvalidOperationException("Enumeration has not started.");
      }

      try {
         return this.n5.next();
      } catch (NoSuchElementException var2) {
         throw new InvalidOperationException("Enumeration has already ended");
      }
   }

   @Override
   public boolean hasNext() {
      this.l6 = true;
      return this.n5.hasNext();
   }

   @Override
   public void reset() {
      throw new NotSupportedException("reset");
   }

   @Override
   public void remove() {
      throw new NotSupportedException("");
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.m5l.l6 next() {
      return this.n5();
   }

}
