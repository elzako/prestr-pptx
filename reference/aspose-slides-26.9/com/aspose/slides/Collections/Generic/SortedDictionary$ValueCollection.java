package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
public final class SortedDictionary$ValueCollection<TKey, TValue> implements IGenericCollection<TValue>, IGenericEnumerable<TValue> {
   private SortedDictionary<TKey, TValue> n5;

   public SortedDictionary$ValueCollection(SortedDictionary<TKey, TValue> dictionary) {
      this.n5 = dictionary;
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   void n5(TValue[] var1, int var2) {
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

         for (Object recoveredElement$var4$1254 : SortedDictionary.n5(this.n5).u9()) {
            SortedDictionary$Node var4 = (SortedDictionary$Node)recoveredElement$var4$1254;
            var1[var2++] = (TValue)var4.l6;
         }
      }
   }

   public void copyTo(TValue[] array, int index) {
      this.n5(array, index);
   }

   public SortedDictionary$ValueCollection$Enumerator<TKey, TValue> iterator() {
      return new SortedDictionary$ValueCollection$Enumerator<>(this.n5);
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public void addItem(TValue tValue) {
      throw new NotSupportedException();
   }

   @Override
   public void clear() {
      throw new NotSupportedException();
   }

   @Override
   public boolean containsItem(TValue item) {
      return this.n5.containsValue(item);
   }

   @Override
   public void copyToTArray(TValue[] tValues, int i) {
      this.n5(tValues, i);
   }

   @Override
   public boolean removeItem(TValue tValue) {
      throw new NotSupportedException();
   }

   public ICollection getICollection() {
      return new SortedDictionary$ValueCollection$1(this);
   }

   public IEnumerable getIEnumerable() {
      return new SortedDictionary$ValueCollection$2(this);
   }

   // $VF: synthetic method
   static SortedDictionary n5(SortedDictionary$ValueCollection var0) {
      return var0.n5;
   }
}
