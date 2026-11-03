package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;

public final class c2<T> extends List<T> {
   public c2() {
   }

   private c2(IGenericEnumerable<T> var1) {
      super(var1);
   }

   public final void n5(T var1) {
      super.addItem((T)var1);
   }

   public final T n5() {
      int var1 = super.size() - 1;
      Object var2 = super.get_Item(var1);
      super.removeAt(var1);
      return (T)var2;
   }

   public final T l6() {
      return super.get_Item(super.size() - 1);
   }

   public final c2<T> k5() {
      return new c2<>(this);
   }
}
