package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class u3$k5 implements IGenericEnumerable<a6> {
   private IGenericEnumerable<l6> n5;

   public u3$k5(IGenericEnumerable<l6> var1) {
      this.n5 = var1;
   }

   @Override
   public final IGenericEnumerator<a6> iterator() {
      return new u3$u3(this.n5);
   }
}
