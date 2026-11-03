package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.w5;
import com.aspose.slides.ms.System.y8;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

class ArrayList$ArrayListInternalized extends ArrayList {
   private List n5;
   private int l6;

   @Override
   protected int getVersion() {
      return this.n5 instanceof ArrayList ? ((ArrayList)this.n5).getVersion() : this.l6;
   }

   public ArrayList$ArrayListInternalized(List internal) {
      this.n5 = internal;
      if (internal instanceof ArrayList) {
         this.l6 = ((ArrayList)internal).getVersion();
      }
   }

   @Override
   public Object get_Item(int index) {
      return this.n5.get(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      this.n5.set(index, value);
      this.l6++;
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public int getCapacity() {
      return Math.max(super.getCapacity(), this.n5.size());
   }

   @Override
   public void setCapacity(int value) {
      if (value < this.n5.size()) {
         throw new ArgumentOutOfRangeException("Capacity", value, "Must be more than count.");
      }

      for (int var2 = 0; var2 < value - this.n5.size(); var2++) {
         this.n5.add(null);
      }
   }

   @Override
   public boolean isFixedSize() {
      return false;
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
   public int addItem(Object value) {
      int var2 = this.n5.size();
      this.n5.add(value);
      this.l6++;
      return var2;
   }

   @Override
   public void clear() {
      this.n5.clear();
      this.l6++;
   }

   @Override
   public boolean contains(Object item) {
      return this.n5.contains(item);
   }

   @Override
   public int indexOf(Object value) {
      return this.n5.indexOf(value);
   }

   @Override
   public int indexOf(Object value, int startIndex) {
      return this.indexOf(value, startIndex, this.n5.size() - startIndex);
   }

   @Override
   public int indexOf(Object value, int startIndex, int count) {
      if (startIndex < 0 || startIndex > this.n5.size()) {
         throw new ArgumentOutOfRangeException("startIndex", startIndex, "Does not specify valid index.");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("count", count, "Can't be less than 0.");
      } else if (startIndex > this.n5.size() - count) {
         throw new ArgumentOutOfRangeException("count", "Start index and count do not specify a valid range.");
      } else {
         return com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), value, startIndex, count);
      }
   }

   @Override
   public int lastIndexOf(Object value) {
      return this.n5.lastIndexOf(value);
   }

   @Override
   public int lastIndexOf(Object value, int startIndex) {
      return this.lastIndexOf(value, startIndex, startIndex + 1);
   }

   @Override
   public int lastIndexOf(Object value, int startIndex, int count) {
      return w5.n5(this.n5.toArray(), value, startIndex, count);
   }

   @Override
   public void insertItem(int index, Object value) {
      if (index >= 0 && index <= this.n5.size()) {
         this.n5.add(index, value);
         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Index must be >= 0 and <= Count.");
      }
   }

   @Override
   public void insertRange(int index, ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index >= 0 && index <= this.n5.size()) {
         for (Object var4 : c) {
            this.n5.add(index++, var4);
         }

         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Index must be >= 0 and <= Count.");
      }
   }

   @Override
   public void insertRange(int index, Object[] c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index >= 0 && index <= this.n5.size()) {
         for (Object var6 : c) {
            this.n5.add(index++, var6);
         }

         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Index must be >= 0 and <= Count.");
      }
   }

   @Override
   public void removeItem(Object obj) {
      this.n5.remove(obj);
      this.l6++;
   }

   @Override
   public void removeAt(int index) {
      if (index >= 0 && index <= this.n5.size()) {
         this.n5.remove(index);
         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Index must be >= 0 and <= Count.");
      }
   }

   @Override
   public void removeRange(int index, int count) {
      if (index < 0 || index > this.n5.size()) {
         throw new ArgumentOutOfRangeException("index", index, "Index must be >= 0 and <= Count.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count", count, "Can't be less than 0.");
      }

      if (index > this.n5.size() - count) {
         throw new ArgumentException("Index and count do not denote a valid range of elements.", "index");
      }

      for (int var3 = 0; var3 < count; var3++) {
         this.n5.remove(index);
      }

      this.l6++;
   }

   @Override
   public void reverse() {
      this.reverse(0, this.n5.size());
   }

   @Override
   public void reverse(int index, int count) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", index, "Can't be less than 0.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count", count, "Can't be less than 0.");
      }

      if (index > this.n5.size() - count) {
         throw new ArgumentException("Index and count do not denote a valid range of elements.", "index");
      }

      int var3 = index;

      for (int var4 = index + this.n5.size() - 1; var3 < var4; var4--) {
         Object var5 = this.n5.get(var3);
         this.n5.set(var3, this.n5.get(var4));
         this.n5.set(var4, var5);
         var3++;
      }

      this.l6++;
   }

   @Override
   public void copyTo(u3 array) {
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5.toArray())), 0, array, 0, this.n5.size());
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      this.copyTo(0, array, arrayIndex, this.n5.size());
   }

   @Override
   public void copyTo(int index, u3 array, int arrayIndex, int count) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (array.u3() != 1) {
         throw new ArgumentException("Must have only 1 dimensions.", "array");
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5.toArray())), index, array, arrayIndex, count);
   }

   @Override
   public IEnumerator iterator() {
      return new ArrayList$SimpleEnumerator(this);
   }

   @Override
   public IEnumerator iterator(int index, int count) {
      ArrayList.n5(index, count, this.n5.size());
      return new ArrayList$ArrayListEnumerator(this, index, count);
   }

   @Override
   public void addRange(ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      this.insertRange(this.size(), c);
   }

   @Override
   public void addRange(Object[] collection) {
      if (collection == null) {
         throw new ArgumentNullException("c");
      }

      this.insertRange(this.n5.size(), collection);
   }

   @Override
   public int binarySearch(Object value) {
      if (value == null) {
         return -1;
      }

      try {
         return w5.n5(this.n5.toArray(), 0, this.n5.size(), value);
      } catch (InvalidOperationException var3) {
         throw new ArgumentException(var3.getMessage());
      }
   }

   @Override
   public int binarySearch(Object value, Comparator comparer) {
      try {
         return w5.n5(this.n5.toArray(), 0, this.n5.size(), value, comparer);
      } catch (InvalidOperationException var4) {
         throw new ArgumentException(var4.getMessage());
      }
   }

   @Override
   public int binarySearch(int index, int count, Object value, Comparator comparer) {
      try {
         return w5.n5(this.n5.toArray(), index, count, value, comparer);
      } catch (InvalidOperationException var6) {
         throw new ArgumentException(var6.getMessage());
      }
   }

   @Override
   public ArrayList getRange(int index, int count) {
      ArrayList.n5(index, count, this.n5.size());
      return this.isSynchronized() ? ArrayList.sync(new ArrayList$RangedArrayList(this, index, count)) : new ArrayList$RangedArrayList(this, index, count);
   }

   @Override
   public void setRange(int index, ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index >= 0 && index + c.size() <= this.n5.size()) {
         for (Object var4 : c) {
            this.n5.set(index++, var4);
         }

         this.l6++;
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public void trimToSize() {
   }

   @Override
   public void sort() {
      Collections.sort(this.n5, null);
      this.l6++;
   }

   @Override
   public void sort(Comparator comparer) {
      Collections.sort(this.n5, comparer);
      this.l6++;
   }

   @Override
   public void sort(int index, int count, Comparator comparer) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", index, "Can't be less than 0.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count", count, "Can't be less than 0.");
      }

      if (index > this.n5.size() - count) {
         throw new ArgumentException("Index and count do not denote a valid range of elements.", "index");
      }

      List var4 = this.n5.subList(index, count);
      if (comparer == null) {
         Collections.sort(var4);
      } else {
         Collections.sort(var4, comparer);
      }

      for (int var5 = index; var5 < count; var5++) {
         this.n5.set(var5, var4.get(var5 - index));
      }

      this.l6++;
   }

   @Override
   public Object[] toArray() {
      return this.n5.toArray();
   }

   @Override
   public u3 toArray(y8 type) {
      u3 var2 = com.aspose.slides.ms.System.u3.n5(type, this.n5.size());
      this.copyTo(var2);
      return var2;
   }

   @Override
   public Object deepClone() {
      Object[] var1 = new Object[this.n5.size()];
      com.aspose.slides.ms.System.u3.n5(this.n5.toArray(), 0, var1, 0, this.n5.size());
      java.util.ArrayList var2 = new java.util.ArrayList();
      var2.addAll(var2);
      return new ArrayList$ArrayListInternalized(var2);
   }

   @Override
   public boolean isEmpty() {
      return this.n5.size() == 0;
   }

   @Override
   public Object[] toArray(Object[] a) {
      return this.n5.toArray(a);
   }

   @Override
   public boolean add(Object o) {
      this.l6++;
      return this.n5.add(o);
   }

   @Override
   public boolean remove(Object o) {
      this.l6++;
      return this.n5.remove(o);
   }

   @Override
   public boolean containsAll(Collection c) {
      return this.n5.containsAll(c);
   }

   @Override
   public boolean addAll(Collection c) {
      this.l6++;
      return this.n5.addAll(c);
   }

   @Override
   public boolean addAll(int index, Collection c) {
      this.l6++;
      return this.n5.addAll(index, c);
   }

   @Override
   public boolean removeAll(Collection c) {
      this.l6++;
      return this.n5.removeAll(c);
   }

   @Override
   public boolean retainAll(Collection c) {
      this.l6++;
      return this.n5.retainAll(c);
   }

   @Override
   public Object get(int index) {
      return this.n5.get(index);
   }

   @Override
   public Object set(int index, Object element) {
      this.l6++;
      return this.n5.set(index, element);
   }

   @Override
   public void add(int index, Object element) {
      this.n5.add(index, element);
      this.l6++;
   }

   @Override
   public Object remove(int index) {
      this.l6++;
      return this.n5.remove(index);
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
   public List subList(int fromIndex, int toIndex) {
      return this.n5.subList(fromIndex, toIndex);
   }
}
