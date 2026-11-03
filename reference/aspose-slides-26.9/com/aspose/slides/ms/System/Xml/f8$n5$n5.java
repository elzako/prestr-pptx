package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

class f8$n5$n5 implements IEnumerator {
   private Object n5;
   private int l6 = -1;

   public f8$n5$n5(Object var1) {
      this.n5 = var1;
   }

   @Override
   public final Object next() {
      if (this.l6 != 0) {
         throw new InvalidOperationException();
      } else {
         return this.n5;
      }
   }

   @Override
   public final boolean hasNext() {
      if (this.l6 < 0) {
         this.l6 = 0;
         return true;
      } else {
         this.l6 = 1;
         return false;
      }
   }

   @Override
   public final void reset() {
      this.l6 = -1;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
