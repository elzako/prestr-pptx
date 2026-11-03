package com.aspose.slides.internal.t9;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.y4.z1;

public class u3$n5 implements IGenericEnumerable<Integer> {
   private z1 n5;
   private com.aspose.slides.internal.h0.h0 l6;

   public u3$n5(z1 var1, com.aspose.slides.internal.h0.h0 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final IGenericEnumerator<Integer> iterator() {
      return new u3$l6(this.n5, this.l6);
   }
}
