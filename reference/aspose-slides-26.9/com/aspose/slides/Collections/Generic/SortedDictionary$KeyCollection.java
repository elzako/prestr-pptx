package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
public final class SortedDictionary$KeyCollection<TKey, TValue> implements IGenericCollection<TKey>, IGenericEnumerable<TKey> {
   private SortedDictionary<TKey, TValue> n5;

   public SortedDictionary$KeyCollection(SortedDictionary<TKey, TValue> dictionary) {
      this.n5 = dictionary;
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   void n5(TKey[] var1, int var2) {
      if (this.size() != 0) {
         if (var1 == null) {
            throw new ArgumentNullException();
         }

         if (var2 < 0) {
            throw new ArgumentOutOfRangeException();
         }

         if (var1.length <= var2) {
            throw new ArgumentException();
         }

         if (var1.length - var2 < this.size()) {
            throw new ArgumentException();
         }

         for (Object recoveredElement$var4$1244 : SortedDictionary.n5(this.n5).u9()) {
            SortedDictionary$Node var4 = (SortedDictionary$Node)recoveredElement$var4$1244;
            var1[var2++] = (TKey)var4.n5;
         }
      }
   }

   public void copyTo(TKey[] array, int index) {
      this.n5(array, index);
   }

   public SortedDictionary$KeyCollection$Enumerator<TKey, TValue> iterator() {
      return new SortedDictionary$KeyCollection$Enumerator<>(this.n5);
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public void addItem(TKey tKey) {
      throw new NotSupportedException();
   }

   @Override
   public void clear() {
      throw new NotSupportedException();
   }

   @Override
   public boolean containsItem(TKey item) {
      return this.n5.containsKey(item);
   }

   @Override
   public void copyToTArray(TKey[] tKeys, int i) {
      this.n5(tKeys, i);
   }

   @Override
   public boolean removeItem(TKey tKey) {
      throw new NotSupportedException();
   }

   public ICollection getICollection() {
      return new SortedDictionary$KeyCollection$1(this);
   }

   public IEnumerable getIEnumerable() {
      return new SortedDictionary$KeyCollection$2(this);
   }

   Object n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static SortedDictionary n5(SortedDictionary$KeyCollection var0) {
      return var0.n5;
   }
}
