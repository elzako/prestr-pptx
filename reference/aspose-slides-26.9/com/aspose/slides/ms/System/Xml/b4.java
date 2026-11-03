package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;

public class b4 implements IEnumerator {
   private b5 n5;
   private int l6;
   private boolean k5;

   public b4(b5 var1) {
      this.n5 = var1;
      this.l6 = -1;
      this.k5 = false;
   }

   @Override
   public final void reset() {
      this.l6 = -1;
   }

   @Override
   public final boolean hasNext() {
      this.l6++;
      int var1 = this.n5.l6(this.l6 + 1);
      if (var1 - 1 < this.l6) {
         return false;
      }

      this.k5 = this.n5.k5(this.l6) != null;
      return this.k5;
   }

   @Override
   public final Object next() {
      return this.k5 ? this.n5.k5(this.l6) : null;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
