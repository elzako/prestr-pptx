package com.aspose.slides.internal.x6s;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.v3;

class h0$n5 implements IEnumerator {
   private h0 n5;
   private h0 l6;
   private boolean k5;

   public h0$n5(h0 var1) {
      this.n5 = var1.n5();
   }

   @Override
   public Object next() {
      if (this.k5) {
         if (this.l6 == null) {
            throw new InvalidOperationException(v3.n5("Enumeration has already finished.", d1.n5));
         } else {
            return this.l6.k5().n5();
         }
      } else {
         throw new InvalidOperationException(v3.n5("Enumeration has not started. Call MoveNext.", d1.n5));
      }
   }

   @Override
   public boolean hasNext() {
      if (!this.k5) {
         this.l6 = this.n5.n5();
         this.k5 = true;
      }

      if (this.l6 != null && this.l6.l6()) {
         return true;
      }

      this.l6 = null;
      return false;
   }

   @Override
   public void reset() {
      this.k5 = false;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
