package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.IHashCodeProvider;
import java.util.Comparator;

class e2$n5 implements IHashCodeProvider, Comparator {
   private e2$n5() {
   }

   @Override
   public int compare(Object o1, Object o2) {
      if (o1 instanceof String) {
         return o1.equals(o2) ? 0 : 1;
      } else {
         return o1 == o2 ? 0 : 1;
      }
   }

   @Override
   public int hashCode(Object o) {
      return o.hashCode();
   }

   // $VF: synthetic method
   e2$n5(t9 var1) {
      this();
   }
}
