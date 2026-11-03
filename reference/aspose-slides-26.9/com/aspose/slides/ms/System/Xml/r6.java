package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

public class r6 implements IEnumerator {
   private b9 n5;
   private l0 l6;
   private int k5;

   public r6(b9 var1) {
      this.n5 = var1;
      this.l6 = null;
      this.k5 = var1.l6();
   }

   @Override
   public final boolean hasNext() {
      if (this.n5.l6() != this.k5) {
         throw new InvalidOperationException(v3.n5("The element list has changed. The enumeration operation failed to continue."));
      }

      this.l6 = this.n5.n5(this.l6);
      return this.l6 != null;
   }

   @Override
   public final void reset() {
      this.l6 = null;
      this.k5 = this.n5.l6();
   }

   @Override
   public final Object next() {
      return this.l6;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
