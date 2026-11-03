package com.aspose.slides.internal.d0e;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class u3 implements IGenericEnumerable<KeyValuePair<Integer, t2>> {
   private SortedDictionary<Integer, t2> n5 = new SortedDictionary<>(new l6());
   private final t2 l6;

   public u3(t2 var1) {
      this.l6 = var1;
   }

   public final int n5() {
      return this.n5.size();
   }

   public final void n5(t2 var1) {
      var1.n5 = this.l6;
      this.n5.addItem(this.n5.size(), var1);
   }

   public final void n5(int var1, t2 var2) {
      var2.n5 = this.l6;
      this.n5.addItem(var1, var2);
   }

   public final void n5(int var1) {
      if (var1 >= 0 && var1 <= this.n5.size() - 1) {
         SortedDictionary var2 = new SortedDictionary<>(this.n5);
         this.n5.clear();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            if (var3 != var1) {
               this.n5((t2)var2.get_Item(var3));
            }
         }
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public final void l6(int var1, t2 var2) {
      if (var1 >= 0 && var1 <= this.n5.size()) {
         SortedDictionary var3 = new SortedDictionary<>(this.n5);
         this.n5.clear();

         for (int var4 = 0; var4 < var1; var4++) {
            this.n5((t2)var3.get_Item(var4));
         }

         this.n5(var2);

         for (int var5 = var1; var5 < var3.size(); var5++) {
            this.n5((t2)var3.get_Item(var5));
         }
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public final t2 l6(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void k5(int var1, t2 var2) {
      this.n5.set_Item(var1, var2);
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<Integer, t2>> iterator() {
      return this.n5.iterator();
   }
}
