package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.g7;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.k7;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.w5;
import com.aspose.slides.ms.System.w5$n5;
import com.aspose.slides.ms.System.z1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

@j3
public class List<T> implements IGenericList<T>, java.util.List<T> {
   private Object[] n5;
   private int l6;
   private int k5;
   private final Object u3 = new Object();
   static Object[] u9 = new Object[0];

   public List() {
      this.n5 = u9;
   }

   public List(IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      this.n5 = u9;
      this.n5(collection);
   }

   public List(int capacity) {
      if (capacity < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: capacity");
      }

      this.n5 = new Object[capacity];
   }

   private List(T[] data, int size) {
      this.n5 = data;
      this.l6 = size;
   }

   protected int getVersion() {
      return this.k5;
   }

   @Override
   public void addItem(T item) {
      if (this.l6 == this.n5.length) {
         this.n5(1);
      }

      this.n5[this.l6++] = item;
      this.k5++;
   }

   private void n5(int var1) {
      int var2 = this.l6 + var1;
      if (var2 > this.n5.length) {
         this.setCapacity(Math.max(Math.max(this.getCapacity() * 2, 4), var2));
      }
   }

   private void n5(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: count");
      }

      if ((var1 & 4294967295L) + (var2 & 4294967295L) > (this.l6 & 4294967295L)) {
         throw new ArgumentException("index and count exceed length of list");
      }
   }

   private void n5(IGenericEnumerable<T> var1) {
      for (Object var3 : var1) {
         this.addItem((T)var3);
      }
   }

   public void addRange(IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      this.n5((IGenericEnumerable<T>)(new List<>(collection)));
      this.k5++;
   }

   public void addRange(T[] collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      for (Object var5 : collection) {
         this.addItem((T)var5);
      }

      this.k5++;
   }

   public ReadOnlyCollection<T> asReadOnly() {
      return new ReadOnlyCollection<>(this);
   }

   public int binarySearch(T item) {
      return w5.n5(this.n5, 0, this.l6, item);
   }

   public int binarySearch(T item, Comparator<T> comparer) {
      return w5.n5(this.n5, 0, this.l6, item, comparer);
   }

   public int binarySearch(int index, int count, T item, Comparator<T> comparer) {
      this.n5(index, count);
      return w5.n5(this.n5, index, count, item, comparer);
   }

   @Override
   public void clear() {
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.n5.length);
      this.l6 = 0;
      this.k5++;
   }

   public <TOutput> List<TOutput> convertAll(k7<T, TOutput> converter) {
      if (converter == null) {
         throw new ArgumentNullException("converter");
      }

      List var2 = new List(this.l6);

      for (int var3 = 0; var3 < this.l6; var3++) {
         var2.n5[var3] = converter.n5((T)this.n5[var3]);
      }

      var2.l6 = this.l6;
      return var2;
   }

   public void copyTo(T[] array) {
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, array, 0, this.l6);
   }

   @Override
   public void copyToTArray(T[] array, int arrayIndex) {
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, array, arrayIndex, this.l6);
   }

   public void copyTo(int index, T[] array, int arrayIndex, int count) {
      this.n5(index, count);
      com.aspose.slides.ms.System.u3.n5(this.n5, index, array, arrayIndex, count);
   }

   public boolean exists(g7<T> match) {
      n5(match);
      return this.n5(0, this.l6, match) != -1;
   }

   public T find(g7<T> match) {
      n5(match);
      int var2 = this.n5(0, this.l6, match);
      return (T)(var2 != -1 ? this.n5[var2] : null);
   }

   static <T> void n5(g7<T> var0) {
      if (var0 == null) {
         throw new ArgumentNullException("match");
      }
   }

   public List<T> findAll(g7<T> match) {
      n5(match);
      return this.l6(match);
   }

   private List<T> l6(g7<T> var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < this.l6; var3++) {
         if (var1.invoke((T)this.n5[var3])) {
            var2.addItem(this.n5[var3]);
         }
      }

      return var2;
   }

   public int findIndex(g7<T> match) {
      n5(match);
      return this.n5(0, this.l6, match);
   }

   public int findIndex(int startIndex, g7<T> match) {
      n5(match);
      this.l6(startIndex);
      return this.n5(startIndex, this.l6 - startIndex, match);
   }

   public int findIndex(int startIndex, int count, g7<T> match) {
      n5(match);
      this.n5(startIndex, count);
      return this.n5(startIndex, count, match);
   }

   private int n5(int var1, int var2, g7<T> var3) {
      int var4 = var1 + var2;

      for (int var5 = var1; var5 < var4; var5++) {
         if (var3.invoke((T)this.n5[var5])) {
            return var5;
         }
      }

      return -1;
   }

   public T findLast(g7<T> match) {
      n5(match);
      int var2 = this.l6(0, this.l6, match);
      return var2 == -1 ? null : this.get_Item(var2);
   }

   public int findLastIndex(g7<T> match) {
      n5(match);
      return this.l6(0, this.l6, match);
   }

   public int findLastIndex(int startIndex, g7<T> match) {
      n5(match);
      this.l6(startIndex);
      return this.l6(0, startIndex + 1, match);
   }

   public int findLastIndex(int startIndex, int count, g7<T> match) {
      n5(match);
      int var4 = startIndex - count + 1;
      this.n5(var4, count);
      return this.l6(var4, count, match);
   }

   private int l6(int var1, int var2, g7<T> var3) {
      int var4 = var1 + var2;

      while (var4 != var1) {
         if (var3.invoke((T)this.n5[--var4])) {
            return var4;
         }
      }

      return -1;
   }

   public void forEach(com.aspose.slides.ms.System.n5<T> action) {
      if (action == null) {
         throw new ArgumentNullException("action");
      }

      for (int var2 = 0; var2 < this.l6; var2++) {
         action.invoke((T)this.n5[var2]);
      }
   }

   public List$Enumerator<T> iterator() {
      return new List$Enumerator<>(this);
   }

   @Deprecated
   public List$EnumeratorJava<T> iteratorJava() {
      return new List$EnumeratorJava<>(this);
   }

   public List<T> getRange(int index, int count) {
      this.n5(index, count);
      Object[] var3 = new Object[count];
      com.aspose.slides.ms.System.u3.n5(this.n5, index, var3, 0, count);
      return new List<>((T[])var3, count);
   }

   @Override
   public int indexOfItem(T item) {
      return com.aspose.slides.ms.System.u3.n5(this.n5, item, 0, this.l6);
   }

   public int indexOf(T item, int index) {
      this.l6(index);
      return com.aspose.slides.ms.System.u3.n5(this.n5, item, index, this.l6 - index);
   }

   public int indexOf(T item, int index, int count) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("Parameter name: count");
      } else if ((index & 4294967295L) + (count & 4294967295L) > (this.l6 & 4294967295L)) {
         throw new ArgumentOutOfRangeException("Parameter name: index and count exceed length of list");
      } else {
         return com.aspose.slides.ms.System.u3.n5(this.n5, item, index, count);
      }
   }

   private void l6(int var1, int var2) {
      if (var2 < 0) {
         var1 -= var2;
      }

      if (var1 < this.l6) {
         com.aspose.slides.ms.System.u3.n5(this.n5, var1, this.n5, var1 + var2, this.l6 - var1);
      }

      this.l6 += var2;
      if (var2 < 0) {
         com.aspose.slides.ms.System.u3.n5(this.n5, this.l6, -var2);
      }
   }

   private void l6(int var1) {
      if (var1 < 0 || (var1 & 4294967295L) > (this.l6 & 4294967295L)) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }
   }

   @Override
   public void insertItem(int index, T item) {
      this.l6(index);
      if (this.l6 == this.n5.length) {
         this.n5(1);
      }

      this.l6(index, 1);
      this.n5[index] = item;
      this.k5++;
   }

   void k5(int var1) {
      Object[] var2 = new Object[this.l6];
      this.copyToTArray((T[])var2, 0);
      this.n5(this.l6);
      this.l6(var1, var2.length);
      com.aspose.slides.ms.System.u3.n5(var2, 0, this.n5, var1, var2.length);
   }

   public void insertRange(int index, IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      this.l6(index);
      if (collection == this) {
         this.k5(index);
      } else {
         this.n5(index, collection);
      }

      this.k5++;
   }

   private void n5(int var1, IGenericEnumerable<T> var2) {
      for (Object var4 : var2) {
         this.insertItem(var1++, (T)var4);
      }
   }

   @Override
   public int lastIndexOf(Object item) {
      return this.l6 == 0 ? -1 : w5.n5(this.n5, item, this.l6 - 1, this.l6);
   }

   public int lastIndexOf(T item, int index) {
      this.l6(index);
      return w5.n5(this.n5, item, index, index + 1);
   }

   public int lastIndexOf(T item, int index, int count) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", index, "index is negative");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("count", count, "count is negative");
      } else if (index - count + 1 < 0) {
         throw new ArgumentOutOfRangeException("cound", count, "count is too large");
      } else {
         return w5.n5(this.n5, item, index, count);
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

   public int removeAll(g7<T> match) {
      n5(match);
      int var2 = 0;
      int var3 = 0;
      var2 = 0;

      while (var2 < this.l6 && !match.invoke((T)this.n5[var2])) {
         var2++;
      }

      if (var2 == this.l6) {
         return 0;
      }

      this.k5++;

      for (var3 = var2 + 1; var3 < this.l6; var3++) {
         if (!match.invoke((T)this.n5[var3])) {
            this.n5[var2++] = this.n5[var3];
         }
      }

      if (var3 - var2 > 0) {
         com.aspose.slides.ms.System.u3.n5(this.n5, var2, var3 - var2);
      }

      this.l6 = var2;
      return var3 - var2;
   }

   @Override
   public void removeAt(int index) {
      if (index >= 0 && (index & 4294967295L) < (this.l6 & 4294967295L)) {
         this.l6(index, -1);
         com.aspose.slides.ms.System.u3.n5(this.n5, this.l6, 1);
         this.k5++;
      } else {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }
   }

   public void removeRange(int index, int count) {
      this.n5(index, count);
      if (count > 0) {
         this.l6(index, -count);
         com.aspose.slides.ms.System.u3.n5(this.n5, this.l6, count);
         this.k5++;
      }
   }

   public void reverse() {
      w5.n5(this.n5, 0, this.l6);
      this.k5++;
   }

   public void reverse(int index, int count) {
      this.n5(index, count);
      w5.n5(this.n5, index, count);
      this.k5++;
   }

   public void sort() {
      Arrays.sort(this.n5, 0, this.l6);
      this.k5++;
   }

   @Override
   public void sort(Comparator<? super T> comparer) {
      Arrays.sort((T[])this.n5, 0, this.l6, comparer);
      this.k5++;
   }

   public void sort(z1<T> comparison) {
      if (comparison == null) {
         throw new ArgumentNullException("comparison");
      }

      Arrays.sort((T[])this.n5, 0, this.l6, new w5$n5<>(comparison));
      this.k5++;
   }

   public void sort(int index, int count, Comparator<T> comparer) {
      this.n5(index, count);
      Arrays.sort((T[])this.n5, index, index + count, comparer);
      this.k5++;
   }

   @Override
   public <T> T[] toArray(T[] a) {
      if (a.length < this.l6) {
         return (T[])Arrays.copyOf(this.n5, this.l6, (Class<? extends T[]>)a.getClass());
      }

      System.arraycopy(this.n5, 0, a, 0, this.l6);
      if (a.length > this.l6) {
         a[this.l6] = null;
      }

      return a;
   }

   public void trimExcess() {
      this.setCapacity(this.l6);
   }

   public boolean trueForAll(g7<T> match) {
      n5(match);

      for (int var2 = 0; var2 < this.l6; var2++) {
         if (!match.invoke((T)this.n5[var2])) {
            return false;
         }
      }

      return true;
   }

   public int getCapacity() {
      return this.n5.length;
   }

   public void setCapacity(int value) {
      if ((value & 4294967295L) < (this.l6 & 4294967295L)) {
         throw new ArgumentOutOfRangeException();
      }

      this.n5 = Arrays.copyOf(this.n5, value);
   }

   @Override
   public int size() {
      return this.l6;
   }

   @Override
   public T get_Item(int index) {
      if ((index & 4294967295L) >= (this.l6 & 4294967295L)) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      } else {
         return (T)this.n5[index];
      }
   }

   @Override
   public void set_Item(int index, T value) {
      this.l6(index);
      if (index == this.l6) {
         throw new ArgumentOutOfRangeException("Parameter name: index");
      }

      this.n5[index] = value;
      this.k5++;
   }

   public void copyTo(u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (array.u3() <= 1 && array.l6(0) == 0) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, array, arrayIndex, this.l6);
      } else {
         throw new ArgumentException("Array must be zero based and single dimentional\r\nParameter name: array");
      }
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   public boolean isSynchronized() {
      return false;
   }

   public Object getSyncRoot() {
      return this.u3;
   }

   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isEmpty() {
      return this.l6 == 0;
   }

   @Override
   public boolean contains(Object o) {
      if (o == null) {
         for (int var3 = 0; var3 < this.l6; var3++) {
            if (this.n5[var3] == null) {
               return true;
            }
         }

         return false;
      } else {
         for (int var2 = 0; var2 < this.l6; var2++) {
            if (this.n5[var2].equals(o)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean containsItem(T item) {
      if (item == null) {
         for (int var3 = 0; var3 < this.l6; var3++) {
            if (this.n5[var3] == null) {
               return true;
            }
         }

         return false;
      } else {
         for (int var2 = 0; var2 < this.l6; var2++) {
            if (this.n5[var2].equals(item)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.l6];
      System.arraycopy(this.n5, 0, var1, 0, this.l6);
      return var1;
   }

   @Override
   public boolean add(T t) {
      int var2 = this.l6;
      this.addItem(t);
      return var2 != this.l6;
   }

   @Override
   public boolean remove(Object o) {
      int var2 = this.l6;
      this.removeItem((T)o);
      return var2 != this.l6;
   }

   @Override
   public boolean containsAll(Collection<?> c) {
      for (Object var3 : c) {
         if (!this.contains(var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean addAll(Collection<? extends T> c) {
      int var2 = 0;
      int var3 = this.size();

      for (Object var5 : c) {
         this.insertItem(var2++, (T)var5);
      }

      return var3 != this.size();
   }

   @Override
   public boolean addAll(int index, Collection<? extends T> c) {
      int var3 = index;
      int var4 = this.size();

      for (Object var6 : c) {
         this.insertItem(var3++, (T)var6);
      }

      return var4 != this.size();
   }

   @Override
   public boolean removeAll(Collection<?> c) {
      int var2 = this.size();

      for (Object var4 : c) {
         this.remove(var4);
      }

      return var2 != this.size();
   }

   @Override
   public boolean retainAll(Collection<?> c) {
      int var2 = this.size();
      Object[] var3 = this.toArray();

      for (Object var7 : var3) {
         if (!c.contains(var7)) {
            this.remove(var7);
         }
      }

      return var2 != this.size();
   }

   @Override
   public T get(int index) {
      return this.get_Item(index);
   }

   @Override
   public T set(int index, T element) {
      Object var3 = this.get_Item(index);
      this.set_Item(index, element);
      return (T)var3;
   }

   @Override
   public void add(int index, T element) {
      this.insertItem(index, element);
   }

   @Override
   public T remove(int index) {
      Object var2 = this.get_Item(index);
      this.removeAt(index);
      return (T)var2;
   }

   @Override
   public int indexOf(Object o) {
      if (o == null) {
         for (int var3 = 0; var3 < this.l6; var3++) {
            if (this.n5[var3] == null) {
               return var3;
            }
         }

         return -1;
      } else {
         for (int var2 = 0; var2 < this.l6; var2++) {
            if (o.equals(this.n5[var2])) {
               return var2;
            }
         }

         return -1;
      }
   }

   @Override
   public ListIterator listIterator() {
      return new List$ListItr(this, 0);
   }

   @Override
   public ListIterator listIterator(int index) {
      return new List$ListItr(this, index);
   }

   @Override
   public java.util.List<T> subList(int fromIndex, int toIndex) {
      int var3 = toIndex - fromIndex;
      return this.getRange(fromIndex, var3);
   }

   public static <T> List<T> fromJava(java.util.List<T> list) {
      return list == null ? null : new List$ListInternalized<>(list);
   }

   public static <T> java.util.List<T> toJava(List<T> list) {
      return list;
   }

   // $VF: synthetic method
   static int n5(List var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Object[] l6(List var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static int n5(List var0, int var1) {
      return var0.l6 = var1;
   }

   // Restored original synthetic constructor delegation: ([Ljava/lang/Object;ILcom/aspose/slides/Collections/Generic/List$1;)V -> ([Ljava/lang/Object;I)V
   List(java.lang.Object[] recoveredArg0, int recoveredArg1, com.aspose.slides.Collections.Generic.List$1 recoveredArg2) {
      this((T[]) recoveredArg0, recoveredArg1);
   }
}
