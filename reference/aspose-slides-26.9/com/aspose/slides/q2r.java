package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.InvalidOperationException;

class q2r<TObj, TEqualityComparer extends IGenericEqualityComparer<TObj>, TNoValue> implements z1f<TObj, TNoValue> {
   private final Dictionary<TObj, TObj> n5;
   private final Dictionary<TObj, Integer> l6 = new Dictionary<>(new k2q<>());

   public q2r(TEqualityComparer var1) {
      this.n5 = new Dictionary<>(var1);
   }

   @Override
   public final boolean n5(TObj var1) {
      return var1 == null ? false : this.l6.containsKey((TObj)var1);
   }

   @Override
   public final void n5(TObj var1, g0e<TObj> var2) {
      if (this.n5((TObj)var1)) {
         var2.n5(var1);
         this.l6((TObj)var1);
      }
   }

   @Override
   public final void n5(TObj[] var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      boolean var4 = this.n5.tryGetValue((TObj)var1[0], var3);
      var2 = var3[0];
      if (var4) {
         if (!this.l6.containsKey((TObj)var2)) {
            throw new InvalidOperationException("Consistency of value registry is broken");
         }

         var1[0] = (TObj)var2;
         this.l6.set_Item((TObj)var2, this.l6.get_Item((TObj)var2) + 1);
      } else {
         if (this.l6.containsKey((TObj)var1[0])) {
            throw new InvalidOperationException("Consistency of value registry is broken");
         }

         this.n5.addItem((TObj)var1[0], (TObj)var1[0]);
         this.l6.addItem((TObj)var1[0], 1);
      }
   }

   private void l6(TObj var1) {
      if (!this.l6.containsKey((TObj)var1)) {
         throw new InvalidOperationException("Consistency of value registry is broken");
      }

      if (!this.n5.containsKey((TObj)var1)) {
         throw new InvalidOperationException("Consistency of value registry is broken");
      }

      this.l6.set_Item((TObj)var1, this.l6.get_Item((TObj)var1) - 1);
      if (this.l6.get_Item((TObj)var1) == 0) {
         this.n5.removeItemByKey((TObj)var1);
         this.l6.removeItemByKey((TObj)var1);
      }
   }
}
