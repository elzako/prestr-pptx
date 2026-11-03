package com.aspose.slides.Collections.Generic;

import com.aspose.slides.ms.System.j3;

@j3
public abstract class EqualityComparer<T> implements IGenericEqualityComparer<T> {
   static EqualityComparer n5 = new EqualityComparer$DefaultComparer();

   @Override
   public int hashCode(Object obj) {
      return obj == null ? 0 : this.hashCodeT((T)obj);
   }

   @Override
   public boolean equals(Object x, Object y) {
      if (x == y) {
         return true;
      } else {
         return x != null && y != null ? this.equalsT((T)x, (T)y) : false;
      }
   }

   @Override
   public abstract int hashCodeT(T var1);

   @Override
   public abstract boolean equalsT(T var1, T var2);

   public static <T> EqualityComparer<T> getDefault() {
      return n5;
   }
}
