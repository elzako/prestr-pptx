package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;

abstract class a8m<T, TComparer> implements IGenericEqualityComparer<T> {
   @Override
   public final boolean equals(Object x, Object y) {
      if (x == null && y == null) {
         return true;
      } else {
         return x != null && y != null ? this.n5((T)x, (T)y) : false;
      }
   }

   @Override
   public final boolean equalsT(T x, T y) {
      if (x == null && y == null) {
         return true;
      } else {
         return x != null && y != null ? this.n5(x, y) : false;
      }
   }

   public final int l6(Object var1) {
      return com.aspose.slides.ms.System.j8.l6(var1, null) ? 0 : this.n5((T)var1);
   }

   @Override
   public int hashCodeT(T obj) {
      return com.aspose.slides.ms.System.j8.l6(obj, null) ? 0 : this.n5(obj);
   }

   @Override
   public int hashCode(Object obj) {
      return com.aspose.slides.ms.System.j8.l6(obj, null) ? 0 : this.n5((T)obj);
   }

   protected abstract boolean n5(T var1, T var2);

   protected abstract int n5(T var1);

   protected static <TObj> int k5(TObj var0) {
      return com.aspose.slides.ms.System.j8.l6(var0, null) ? 0 : var0.hashCode();
   }

   public a8m() {
   }
}
