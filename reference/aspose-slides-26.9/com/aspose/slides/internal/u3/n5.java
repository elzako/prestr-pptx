package com.aspose.slides.internal.u3;

import com.aspose.slides.Collections.Generic.Dictionary;

public class n5<TKey, T> {
   private Class<TKey> n5;
   private Class<T> l6;
   private final Dictionary<TKey, T> k5;
   private T u3;

   public n5(Class<TKey> var1, Class<T> var2) {
      this(var1, var2, (T)com.aspose.slides.internal.v6g.k5.k5(var2));
   }

   public n5() {
      this.k5 = new Dictionary<>();
   }

   public n5(Class<TKey> var1, Class<T> var2, T var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new Dictionary<>();
      this.u3 = (T)var3;
   }

   public final void n5(TKey var1, T var2) {
      if (this.k5.containsKey((TKey)var1)) {
         this.k5.set_Item((TKey)var1, (T)var2);
      } else {
         this.k5.addItem((TKey)var1, (T)var2);
      }
   }

   public final T n5(TKey var1) {
      return this.k5.containsKey((TKey)var1) ? this.k5.get_Item((TKey)var1) : this.u3;
   }

   public final void l6(TKey var1) {
      this.k5.removeItemByKey((TKey)var1);
   }

   public final boolean k5(TKey var1) {
      return this.k5.containsKey((TKey)var1);
   }

   public final int n5() {
      return this.k5.size();
   }
}
