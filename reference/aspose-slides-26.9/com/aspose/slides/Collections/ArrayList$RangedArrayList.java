package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.y8;
import java.util.Comparator;

@j3
final class ArrayList$RangedArrayList extends ArrayList$ArrayListWrapper {
   private int l6;
   private int k5;
   private int u3;

   public ArrayList$RangedArrayList(ArrayList innerList, int index, int count) {
      super(innerList);
      this.l6 = index;
      this.k5 = count;
      this.u3 = innerList.getVersion();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object get_Item(int index) {
      if (index >= 0 && index <= this.k5) {
         return this.n5.get_Item(this.l6 + index);
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public void set_Item(int index, Object value) {
      if (index >= 0 && index <= this.k5) {
         this.n5.set_Item(this.l6 + index, value);
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public int size() {
      this.n5();
      return this.k5;
   }

   @Override
   public int getCapacity() {
      return this.n5.getCapacity();
   }

   @Override
   public void setCapacity(int value) {
      if (value < this.k5) {
         throw new ArgumentOutOfRangeException();
      }
   }

   private void n5() {
      if (this.u3 != this.n5.getVersion()) {
         throw new IllegalStateException("ArrayList view is invalid because the underlying ArrayList was modified.");
      }
   }

   @Override
   public int addItem(Object value) {
      this.n5();
      this.n5.insertItem(this.l6 + this.k5, value);
      this.u3 = this.n5.getVersion();
      return ++this.k5;
   }

   @Override
   public void clear() {
      this.n5();
      this.n5.removeRange(this.l6, this.k5);
      this.k5 = 0;
      this.u3 = this.n5.getVersion();
   }

   @Override
   public boolean contains(Object value) {
      return this.n5.n5(value, this.l6, this.k5);
   }

   @Override
   public int indexOf(Object value) {
      return this.indexOf(value, 0);
   }

   @Override
   public int indexOf(Object value, int startIndex) {
      return this.indexOf(value, startIndex, this.k5 - startIndex);
   }

   @Override
   public int indexOf(Object value, int startIndex, int count) {
      if (startIndex < 0 || startIndex > this.k5) {
         n5("startIndex", startIndex, "Does not specify valid index.");
      }

      if (count < 0) {
         n5("count", count, "Can't be less than 0.");
      }

      if (startIndex > this.k5 - count) {
         throw new ArgumentOutOfRangeException("count", "Start index and count do not specify a valid range.");
      }

      int var4 = this.n5.indexOf(value, this.l6 + startIndex, count);
      return var4 == -1 ? -1 : var4 - this.l6;
   }

   @Override
   public int lastIndexOf(Object value) {
      return this.lastIndexOf(value, this.k5 - 1);
   }

   @Override
   public int lastIndexOf(Object value, int startIndex) {
      return this.lastIndexOf(value, startIndex, startIndex + 1);
   }

   @Override
   public int lastIndexOf(Object value, int startIndex, int count) {
      if (startIndex < 0) {
         n5("startIndex", startIndex, "< 0");
      }

      if (count < 0) {
         n5("count", count, "count is negative.");
      }

      int var4 = this.n5.lastIndexOf(value, this.l6 + startIndex, count);
      return var4 == -1 ? -1 : var4 - this.l6;
   }

   @Override
   public void insertItem(int index, Object value) {
      this.n5();
      if (index < 0 || index > this.k5) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      this.n5.insertItem(this.l6 + index, value);
      this.k5++;
      this.u3 = this.n5.getVersion();
   }

   @Override
   public void insertRange(int index, ICollection c) {
      this.n5();
      if (index < 0 || index > this.k5) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      this.n5.insertRange(this.l6 + index, c);
      this.k5 = this.k5 + c.size();
      this.u3 = this.n5.getVersion();
   }

   @Override
   public void removeItem(Object value) {
      this.n5();
      int var2 = this.indexOf(value);
      if (var2 > -1) {
         this.removeAt(var2);
      }

      this.u3 = this.n5.getVersion();
   }

   @Override
   public void removeAt(int index) {
      this.n5();
      if (index < 0 || index > this.k5) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      this.n5.removeAt(this.l6 + index);
      this.k5--;
      this.u3 = this.n5.getVersion();
   }

   @Override
   public void removeRange(int index, int count) {
      this.n5();
      n5(index, count, this.k5);
      this.n5.removeRange(this.l6 + index, count);
      this.k5 -= count;
      this.u3 = this.n5.getVersion();
   }

   @Override
   public void reverse() {
      this.reverse(0, this.k5);
   }

   @Override
   public void reverse(int index, int count) {
      this.n5();
      n5(index, count, this.k5);
      this.n5.reverse(this.l6 + index, count);
      this.u3 = this.n5.getVersion();
   }

   @Override
   public void setRange(int index, ICollection c) {
      this.n5();
      if (index < 0 || index > this.k5) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      this.n5.setRange(this.l6 + index, c);
      this.u3 = this.n5.getVersion();
   }

   @Override
   public void copyTo(u3 array) {
      this.copyTo(array, 0);
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.copyTo(0, array, index, this.k5);
   }

   @Override
   public void copyTo(int index, u3 array, int arrayIndex, int count) {
      n5(index, count, this.k5);
      this.n5.copyTo(this.l6 + index, array, arrayIndex, count);
   }

   @Override
   public IEnumerator iterator() {
      return this.iterator(0, this.k5);
   }

   @Override
   public IEnumerator iterator(int index, int count) {
      n5(index, count, this.k5);
      return this.n5.iterator(this.l6 + index, count);
   }

   @Override
   public void addRange(ICollection c) {
      this.n5();
      this.n5.insertRange(this.k5, c);
      this.k5 = this.k5 + c.size();
      this.u3 = this.n5.getVersion();
   }

   @Override
   public int binarySearch(Object value) {
      return this.binarySearch(0, this.k5, value, Comparer.Default);
   }

   @Override
   public int binarySearch(Object value, Comparator comparer) {
      return this.binarySearch(0, this.k5, value, comparer);
   }

   @Override
   public int binarySearch(int index, int count, Object value, Comparator comparer) {
      n5(index, count, this.k5);
      return this.n5.binarySearch(this.l6 + index, count, value, comparer);
   }

   @Override
   public Object deepClone() {
      return new ArrayList$RangedArrayList((ArrayList)this.n5.deepClone(), this.l6, this.k5);
   }

   @Override
   public ArrayList getRange(int index, int count) {
      n5(index, count, this.k5);
      return new ArrayList$RangedArrayList(this, index, count);
   }

   @Override
   public void trimToSize() {
      throw new NotSupportedException();
   }

   @Override
   public void sort() {
      this.sort(Comparer.Default);
   }

   @Override
   public void sort(Comparator comparer) {
      this.sort(0, this.k5, comparer);
   }

   @Override
   public void sort(int index, int count, Comparator comparer) {
      this.n5();
      n5(index, count, this.k5);
      this.n5.sort(this.l6 + index, count, comparer);
      this.u3 = this.n5.getVersion();
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.k5];
      this.n5.copyTo(this.l6, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, this.k5);
      return var1;
   }

   @Override
   public u3 toArray(y8 elementType) {
      u3 var2 = com.aspose.slides.ms.System.u3.n5(elementType, this.k5);
      this.n5.copyTo(this.l6, var2, 0, this.k5);
      return var2;
   }
}
