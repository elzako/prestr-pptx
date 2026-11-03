package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public final class Dictionary$KeyCollection<TKey, TValue> implements IGenericCollection<TKey>, IGenericEnumerable<TKey> {
   private Dictionary<TKey, TValue> n5;

   public Dictionary$KeyCollection(Dictionary<TKey, TValue> dictionary) {
      if (dictionary == null) {
         throw new ArgumentNullException("dictionary");
      }

      this.n5 = dictionary;
   }

   @Override
   public void copyToTArray(TKey[] array, int index) {
      Dictionary.n5(this.n5, u3.n5((Object)(array)), index);
      Dictionary.n5(this.n5, array, index);
   }

   @Override
   public void addItem(TKey item) {
      throw new NotSupportedException("this is a read-only collection");
   }

   @Override
   public void clear() {
      throw new NotSupportedException("this is a read-only collection");
   }

   @Override
   public boolean containsItem(TKey item) {
      return this.n5.containsKey(item);
   }

   @Override
   public boolean removeItem(TKey item) {
      throw new NotSupportedException("this is a read-only collection");
   }

   public Dictionary$KeyCollection$Enumerator<TKey, TValue> iterator() {
      return new Dictionary$KeyCollection$Enumerator<>(this.n5);
   }

   @Deprecated
   public Dictionary$KeyCollection$EnumeratorJava<TKey, TValue> iteratorJava() {
      return new Dictionary$KeyCollection$EnumeratorJava<>(this.n5);
   }

   public void copyTo(u3 array, int index) {
      Dictionary.n5(this.n5, array, index);
      Dictionary.n5(this.n5, array, index, new Dictionary$KeyCollection$1(this));
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   public boolean isSynchronized() {
      return false;
   }

   public Object getSyncRoot() {
      return ((ICollection)this.n5).getSyncRoot();
   }
}
