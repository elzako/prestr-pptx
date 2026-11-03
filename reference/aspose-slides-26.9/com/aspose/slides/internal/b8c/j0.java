package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;

public final class j0 implements IEnumerator {
   private IDictionaryEnumerator n5;

   public j0(Hashtable var1) {
      this.n5 = var1.iterator();
   }

   @Override
   public final void reset() {
      this.n5.reset();
   }

   @Override
   public final boolean hasNext() {
      return this.n5.hasNext();
   }

   @Override
   public final Object next() {
      u1 var1 = (u1)this.n5.getValue();
      return var1 != null ? var1.l6() : null;
   }

   public final u1 n5() {
      return (u1)this.n5.getValue();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
