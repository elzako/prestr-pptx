package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

public final class p7 implements IEnumerator {
   public l0 n5;
   public l0 l6;
   public boolean k5;

   public p7(l0 var1) {
      this.n5 = var1;
      this.l6 = var1.getFirstChild();
      this.k5 = true;
   }

   @Override
   public final boolean hasNext() {
      if (this.k5) {
         this.l6 = this.n5.getFirstChild();
         this.k5 = false;
      } else if (this.l6 != null) {
         this.l6 = this.l6.getNextSibling();
      }

      return this.l6 != null;
   }

   @Override
   public final void reset() {
      this.k5 = true;
      this.l6 = this.n5.getFirstChild();
   }

   @Override
   public final Object next() {
      if (!this.k5 && this.l6 != null) {
         return this.l6;
      } else {
         throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
      }
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
