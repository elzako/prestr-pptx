package com.aspose.slides.Collections.Generic;

class n5<T> extends Comparer<T> {
   @Override
   public int compare(T x, T y) {
      return com.aspose.slides.Collections.Comparer.Default.compare(x, y);
   }

   @Override
   public boolean equals(Object obj) {
      return obj instanceof n5;
   }

   @Override
   public int hashCode() {
      return this.getClass().getName().hashCode();
   }
}
