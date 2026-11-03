package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.g7;
import com.aspose.slides.ms.System.k7;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.w5;
import com.aspose.slides.ms.System.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

class List$ListInternalized<T> extends List<T> {
   private java.util.List<T> n5;
   private int l6;

   public List$ListInternalized() {
      this.n5 = new ArrayList<>();
   }

   public List$ListInternalized(java.util.List<T> list) {
      super(list.size());

      for (Object var3 : list) {
         super.addItem((T)var3);
      }

      this.n5 = list;
   }

   @Override
   protected int getVersion() {
      return this.l6;
   }

   @Override
   public void addRange(IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      this.n5(collection);
      this.l6++;
   }

   @Override
   public void addRange(T[] collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      for (Object var5 : collection) {
         this.addItem((T)var5);
      }

      this.l6++;
   }

   @Override
   public ReadOnlyCollection<T> asReadOnly() {
      return new ReadOnlyCollection<>(this);
   }

   @Override
   public int binarySearch(T item) {
      return w5.n5(this.n5.toArray(), 0, this.n5.size(), item);
   }

   @Override
   public int binarySearch(T item, Comparator<T> comparer) {
      return w5.n5(this.n5.toArray(), 0, this.n5.size(), item, comparer);
   }

   @Override
   public int binarySearch(int index, int count, T item, Comparator<T> comparer) {
      this.n5(index, count);
      return w5.n5(this.n5.toArray(), index, count, item, comparer);
   }

   private void n5(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: count");
      }

      if ((var1 & 4294967295L) + (var2 & 4294967295L) > (this.n5.size() & 4294967295L)) {
         throw new ArgumentException("index and count exceed length of list");
      }
   }

   @Override
   public <TOutput> List<TOutput> convertAll(k7<T, TOutput> converter) {
      if (converter == null) {
         throw new ArgumentNullException("converter");
      }

      List var2 = new List(this.n5.size());

      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         List.l6(var2)[var3] = converter.n5(this.get_Item(var3));
      }

      List.n5(var2, this.n5.size());
      return var2;
   }

   @Override
   public void copyTo(T[] array) {
      com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), 0, array, 0, this.n5.size());
   }

   @Override
   public void copyToTArray(T[] array, int arrayIndex) {
      com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), 0, array, arrayIndex, this.n5.size());
   }

   @Override
   public void copyTo(int index, T[] array, int arrayIndex, int count) {
      this.n5(index, count);
      com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), index, array, arrayIndex, count);
   }

   @Override
   public boolean exists(g7<T> match) {
      l6(match);
      return this.n5(0, this.n5.size(), match) != -1;
   }

   private int n5(int var1, int var2, g7<T> var3) {
      int var4 = var1 + var2;

      for (int var5 = var1; var5 < var4; var5++) {
         if (var3.invoke(this.n5.get(var5))) {
            return var5;
         }
      }

      return -1;
   }

   static <T> void l6(g7<T> var0) {
      if (var0 == null) {
         throw new ArgumentNullException("match");
      }
   }

   @Override
   public T find(g7<T> match) {
      l6(match);
      int var2 = this.n5(0, this.n5.size(), match);
      return var2 != -1 ? this.n5.get(var2) : null;
   }

   @Override
   public List<T> findAll(g7<T> match) {
      l6(match);
      return this.k5(match);
   }

   private List<T> k5(g7<T> var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < this.size(); var3++) {
         if (var1.invoke(this.n5.get(var3))) {
            var2.addItem(this.n5.get(var3));
         }
      }

      return var2;
   }

   @Override
   public int findIndex(g7<T> match) {
      l6(match);
      return this.n5(0, this.n5.size(), match);
   }

   @Override
   public int findIndex(int startIndex, g7<T> match) {
      l6(match);
      this.n5(startIndex);
      return this.n5(startIndex, this.n5.size() - startIndex, match);
   }

   private void n5(int var1) {
      if (var1 < 0 || (var1 & 4294967295L) > (this.n5.size() & 4294967295L)) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }
   }

   @Override
   public int findIndex(int startIndex, int count, g7<T> match) {
      l6(match);
      this.n5(startIndex, count);
      return this.n5(startIndex, count, match);
   }

   @Override
   public T findLast(g7<T> match) {
      l6(match);
      int var2 = this.l6(0, this.n5.size(), match);
      return var2 == -1 ? null : this.get_Item(var2);
   }

   private int l6(int var1, int var2, g7<T> var3) {
      int var4 = var1 + var2;

      while (var4 != var1) {
         if (var3.invoke(this.n5.get(--var4))) {
            return var4;
         }
      }

      return -1;
   }

   @Override
   public int findLastIndex(g7<T> match) {
      l6(match);
      return this.l6(0, this.n5.size(), match);
   }

   @Override
   public int findLastIndex(int startIndex, g7<T> match) {
      l6(match);
      this.n5(startIndex);
      return this.l6(0, startIndex + 1, match);
   }

   @Override
   public int findLastIndex(int startIndex, int count, g7<T> match) {
      l6(match);
      int var4 = startIndex - count + 1;
      this.n5(var4, count);
      return this.l6(var4, count, match);
   }

   @Override
   public void forEach(com.aspose.slides.ms.System.n5<T> action) {
      if (action == null) {
         throw new ArgumentNullException("action");
      }

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         action.invoke(this.n5.get(var2));
      }
   }

   @Override
   public List$Enumerator<T> iterator() {
      return new List$Enumerator<>(this);
   }

   @Override
   public List<T> getRange(int index, int count) {
      this.n5(index, count);
      Object[] var3 = new Object[count];
      com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), index, var3, 0, count);
      return new List<>(var3, count, null);
   }

   @Override
   public int indexOfItem(T item) {
      return this.n5.indexOf(item);
   }

   @Override
   public int indexOf(T item, int index) {
      this.n5(index);
      return com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), item, index, this.n5.size() - index);
   }

   @Override
   public int indexOf(T item, int index, int count) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: count");
      } else if ((index & 4294967295L) + (count & 4294967295L) > (this.n5.size() & 4294967295L)) {
         throw new ArgumentOutOfRangeException("Parameter name: index and count exceed length of list");
      } else {
         return com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), item, index, count);
      }
   }

   @Override
   public int lastIndexOf(Object item) {
      return this.n5.size() == 0 ? -1 : w5.n5(this.n5.toArray(), item, this.n5.size() - 1, this.n5.size());
   }

   @Override
   public int lastIndexOf(T item, int index) {
      this.n5(index);
      return w5.n5(this.n5.toArray(), item, index, index + 1);
   }

   @Override
   public int lastIndexOf(T item, int index, int count) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", index, "index is negative");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("count", count, "count is negative");
      } else if (index - count + 1 < 0) {
         throw new ArgumentOutOfRangeException("cound", count, "count is too large");
      } else {
         return w5.n5(this.n5.toArray(), item, index, count);
      }
   }

   @Override
   public boolean removeItem(T item) {
      int var2 = this.indexOfItem(item);
      if (var2 != -1) {
         this.removeAt(var2);
      }

      return var2 != -1;
   }

   @Override
   public <T1> T1[] toArray(T1[] a) {
      return this.n5.toArray(a);
   }

   @Override
   public void trimExcess() {
      this.setCapacity(this.n5.size());
   }

   @Override
   public boolean trueForAll(g7<T> match) {
      l6(match);

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         if (!match.invoke(this.n5.get(var2))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int getCapacity() {
      return this.n5.size();
   }

   @Override
   public void setCapacity(int value) {
      if ((value & 4294967295L) < (this.n5.size() & 4294967295L)) {
         throw new ArgumentOutOfRangeException();
      }

      for (int var2 = 0; var2 < value - this.n5.size(); var2++) {
         this.n5.add(null);
      }
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public T get_Item(int index) {
      return this.n5.get(index);
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (array.u3() <= 1 && array.l6(0) == 0) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5.toArray())), 0, array, arrayIndex, this.n5.size());
      } else {
         throw new ArgumentException("Array must be zero based and single dimentional\r\nParameter name: array");
      }
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isEmpty() {
      return this.size() != 0;
   }

   @Override
   public boolean contains(Object o) {
      if (o == null) {
         for (int var3 = 0; var3 < this.n5.size(); var3++) {
            if (this.get(var3) == null) {
               return true;
            }
         }

         return false;
      } else {
         for (int var2 = 0; var2 < this.n5.size(); var2++) {
            if (this.get(var2).equals(o)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean containsItem(T item) {
      if (item == null) {
         for (int var3 = 0; var3 < this.n5.size(); var3++) {
            if (this.n5.get(var3) == null) {
               return true;
            }
         }

         return false;
      } else {
         for (int var2 = 0; var2 < this.n5.size(); var2++) {
            if (this.n5.get(var2).equals(item)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public Object[] toArray() {
      return this.n5.toArray();
   }

   @Override
   public boolean add(T t) {
      this.l6++;
      return this.n5.add(t);
   }

   @Override
   public boolean remove(Object o) {
      this.l6++;
      return this.n5.remove(o);
   }

   @Override
   public boolean containsAll(Collection<?> c) {
      return this.n5.containsAll(c);
   }

   @Override
   public boolean addAll(Collection<? extends T> c) {
      this.l6++;
      return this.n5.addAll(c);
   }

   @Override
   public boolean addAll(int index, Collection<? extends T> c) {
      this.l6++;
      return this.n5.addAll(index, c);
   }

   @Override
   public boolean removeAll(Collection<?> c) {
      this.l6++;
      return this.n5.removeAll(c);
   }

   @Override
   public boolean retainAll(Collection<?> c) {
      this.l6++;
      return this.n5.retainAll(c);
   }

   @Override
   public T get(int index) {
      return this.n5.get(index);
   }

   @Override
   public T set(int index, T element) {
      this.l6++;
      return this.n5.set(index, element);
   }

   @Override
   public void add(int index, T element) {
      this.l6++;
      this.n5.add(index, element);
   }

   @Override
   public T remove(int index) {
      this.l6++;
      return this.n5.remove(index);
   }

   @Override
   public int indexOf(Object o) {
      return this.n5.indexOf(o);
   }

   @Override
   public ListIterator listIterator() {
      return this.n5.listIterator();
   }

   @Override
   public ListIterator listIterator(int index) {
      return this.n5.listIterator(index);
   }

   @Override
   public java.util.List<T> subList(int fromIndex, int toIndex) {
      return this.n5.subList(fromIndex, toIndex);
   }

   @Override
   public void addItem(T item) {
      this.n5.add(item);
      this.l6++;
   }

   @Override
   public void clear() {
      this.n5.clear();
      this.l6++;
   }

   @Override
   public void insertItem(int index, T item) {
      this.n5.add(index, item);
      this.l6++;
   }

   @Override
   public void insertRange(int index, IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      if (index >= 0 && (index & 4294967295L) <= (this.n5.size() & 4294967295L)) {
         int var3 = index;
         if (collection == this) {
            Object[] var4 = new Object[this.size()];
            this.copyTo((T[])var4);

            for (Object var8 : var4) {
               this.n5.add(var3++, (T)var8);
            }
         } else {
            for (Object var10 : collection) {
               this.n5.add(var3++, (T)var10);
            }
         }

         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }
   }

   @Override
   public int removeAll(g7<T> match) {
      l6(match);
      int var2 = 0;
      int var3 = 0;
      var2 = 0;

      while (var2 < this.n5.size() && !match.invoke(this.n5.get(var2))) {
         var2++;
      }

      if (var2 == this.n5.size()) {
         return 0;
      }

      this.l6++;

      for (var3 = var2 + 1; var3 < this.n5.size(); var3++) {
         if (!match.invoke(this.n5.get(var3))) {
            this.n5.set(var2++, this.n5.get(var3));
         }
      }

      if (var3 - var2 > 0) {
         for (int var4 = 0; var4 < var3 - var2; var4++) {
            this.n5.remove(this.n5.size() - 1);
         }
      }

      return var3 - var2;
   }

   @Override
   public void removeAt(int index) {
      if (index >= 0 && (index & 4294967295L) < (this.n5.size() & 4294967295L)) {
         this.n5.remove(index);
         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }
   }

   @Override
   public void removeRange(int index, int count) {
      this.n5(index, count);
      if (count > 0) {
         for (int var3 = 0; var3 < count; var3++) {
            this.n5.remove(index);
         }

         this.l6++;
      }
   }

   @Override
   public void reverse() {
      this.reverse(0, this.size());
   }

   @Override
   public void reverse(int index, int count) {
      this.n5(index, count);
      int var3 = index;

      for (int var4 = index + count - 1; var3 < var4; var4--) {
         Object var5 = this.n5.get(var3);
         this.n5.set(var3, this.n5.get(var4));
         this.n5.set(var4, (T)var5);
         var3++;
      }

      this.l6++;
   }

   @Override
   public void sort() {
      Collections.sort(this.n5, null);
      this.l6++;
   }

   @Override
   public void sort(Comparator<? super T> comparer) {
      Collections.sort(this.n5, comparer);
      this.l6++;
   }

   @Override
   public void sort(z1<T> tComparison) {
      if (tComparison == null) {
         throw new ArgumentNullException("comparison");
      }

      Collections.sort(this.n5, new List$ListInternalized$1(this, tComparison));
      this.l6++;
   }

   @Override
   public void sort(int index, int count, Comparator<T> comparer) {
      this.n5(index, count);
      java.util.List var4 = this.n5.subList(index, count);
      Collections.sort(var4, comparer);

      for (int var5 = 0; var5 < count; var5++) {
         this.n5.set(index + var5, (T)var4.get(var5));
      }

      this.l6++;
   }

   @Override
   public void set_Item(int index, T value) {
      this.n5(index);
      if (index == this.n5.size()) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }

      this.n5.set(index, value);
      this.l6++;
   }

   private void n5(IGenericEnumerable<T> var1) {
      for (Object var3 : var1) {
         this.addItem((T)var3);
      }
   }
}
