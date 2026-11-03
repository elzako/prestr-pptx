package com.aspose.slides.internal.t4r;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.ms.System.j5;

public class n5<TKey, TValue> {
   private Class l6;
   private Class<TValue> k5;
   protected final n5$n5<TKey> n5;
   private final int u3;

   public n5(Class var1, Class<TValue> var2) {
      this(var1, var2, Integer.MAX_VALUE, new n5$n5());
   }

   public n5(Class var1, Class<TValue> var2, int var3) {
      this(var1, var2, var3, new n5$n5());
   }

   public n5(Class var1, Class<TValue> var2, int var3, IGenericEqualityComparer<TKey> var4) {
      this(var1, var2, var3, new n5$n5(var4));
   }

   protected n5(Class var1, Class<TValue> var2, int var3, n5$n5 var4) {
      this.l6 = var1;
      this.k5 = var2;
      if (var3 <= 0) {
         throw new ArgumentException("maxSize");
      }

      this.u3 = var3;
      this.n5 = var4;
   }

   public final boolean n5(TKey var1, TValue[] var2) {
      var2[0] = (TValue)com.aspose.slides.internal.v6g.k5.k5(this.k5);
      if (!this.n5((TKey)var1)) {
         return false;
      }

      var2[0] = this.k5((TKey)var1);
      return true;
   }

   public final boolean n5(TKey var1) {
      return this.n5.containsKey(var1);
   }

   private TValue k5(TKey var1) {
      if (this.n5.containsKey(var1)) {
         this.n5.get_Item(var1).n5(j5.s7().n3());
         this.u3();
         return (TValue)this.n5.get_Item(var1).l6();
      } else {
         throw new KeyNotFoundException();
      }
   }

   public final void n5(TKey var1, TValue var2) {
      if (this.n5.containsKey(var1)) {
         this.n5.get_Item(var1).n5(j5.s7().n3());
         this.n5.get_Item(var1).n5(var2);
      } else {
         this.n5.addItem(var1, new n5$l6<>(var2));
      }

      this.u3();
   }

   public final int n5() {
      return this.n5.size();
   }

   public final Dictionary<TKey, TValue> l6() {
      Dictionary var1 = new Dictionary(this.n5.size());

      for (Object recoveredElement$var3$2242 : this.n5) {
         KeyValuePair var3 = (KeyValuePair)recoveredElement$var3$2242;
         var1.addItem(var3.getKey(), ((n5$l6)var3.getValue()).l6());
      }

      return var1;
   }

   public final void l6(TKey var1) {
      this.n5.removeItemByKey(var1);
   }

   public final void k5() {
      this.n5.clear();
   }

   protected void u3() {
      if (this.n5.size() >= this.u3) {
         if (this.n5.size() > 0) {
            this.a6();
         }
      }
   }

   protected final void a6() {
      TKey var1 = this.u9();
      this.n5.removeItemByKey(var1);
   }

   private TKey u9() {
      com.aspose.slides.internal.f8y.n5.n5(this.n5.size() > 0);
      Object var1 = com.aspose.slides.internal.v6g.k5.k5(this.l6);
      long var2 = Long.MAX_VALUE;

      for (Object recoveredElement$var5$2965 : this.n5) {
         KeyValuePair var5 = (KeyValuePair)recoveredElement$var5$2965;
         if (((n5$l6)var5.getValue()).n5() < var2) {
            var2 = ((n5$l6)var5.getValue()).n5();
            var1 = var5.getKey();
         }
      }

      if (var2 == Long.MAX_VALUE) {
         throw new InvalidOperationException("Unable to find the oldest entry key in non-empty storage.");
      } else {
         return (TKey)var1;
      }
   }
}
