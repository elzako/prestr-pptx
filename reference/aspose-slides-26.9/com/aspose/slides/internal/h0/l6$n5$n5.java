package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;

public class l6$n5$n5 implements IGenericEnumerator<String> {
   private IGenericEnumerator<l6$n5> n5;

   public l6$n5$n5(IGenericList<l6$n5> var1) {
      this.n5 = var1.iterator();
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
   }

   @Override
   public final boolean hasNext() {
      return this.n5.hasNext();
   }

   @Override
   public final void reset() {
      this.n5.reset();
   }

   public final String n5() {
      return this.n5.next().n5().toString();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public String next() {
      return this.n5();
   }

}
