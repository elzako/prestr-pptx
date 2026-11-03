package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class l4 implements IGenericEnumerable<d6b> {
   public final String n5;

   public l4(String var1) {
      this.n5 = var1;
   }

   @Override
   public final IGenericEnumerator<d6b> iterator() {
      return new z4h(this.n5);
   }
}
