package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class u3$n5 implements IGenericEnumerable<k5> {
   private IGenericEnumerable<l6> n5;

   public u3$n5(IGenericEnumerable<l6> var1) {
      this.n5 = var1;
   }

   @Override
   public final IGenericEnumerator<k5> iterator() {
      return new u3$l6(this.n5);
   }
}
