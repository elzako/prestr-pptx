package com.aspose.slides.Collections.Generic;

import com.aspose.slides.ms.System.j3;

@j3
public final class EqualityComparer$DefaultComparer<T> extends EqualityComparer<T> {
   @Override
   public int hashCodeT(T obj) {
      return obj == null ? 0 : obj.hashCode();
   }

   @Override
   public boolean equalsT(T x, T y) {
      return x == null ? y == null : x.equals(y);
   }
}
