package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.y8;
import java.util.Comparator;

@j3
final class ArrayList$ArrayListAdapter extends ArrayList {
   private IList n5;

   public ArrayList$ArrayListAdapter(IList adaptee) {
      super(0, true, null);
      this.n5 = adaptee;
   }

   @Override
   public Object get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      this.n5.set_Item(index, value);
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public int getCapacity() {
      return this.n5.size();
   }

   @Override
   public void setCapacity(int value) {
      if (value < this.n5.size()) {
         throw new ArgumentException("capacity");
      }
   }

   @Override
   public boolean isFixedSize() {
      return this.n5.isFixedSize();
   }

   @Override
   public boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public int addItem(Object value) {
      return this.n5.addItem(value);
   }

   @Override
   public void clear() {
      this.n5.clear();
   }

   @Override
   public boolean contains(Object value) {
      return this.n5.contains(value);
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
         n5("startIndex", startIndex, "Does not specify valid index.");
      }

      if (count < 0) {
         n5("count", count, "Can't be less than 0.");
      }

      if (startIndex > this.n5.size() - count) {
         throw new ArgumentOutOfRangeException("count", "Start index and count do not specify a valid range.");
      }

      if (value == null) {
         for (int var4 = startIndex; var4 < startIndex + count; var4++) {
            if (this.n5.get_Item(var4) == null) {
               return var4;
            }
         }
      } else {
         for (int var5 = startIndex; var5 < startIndex + count; var5++) {
            if (value.equals(this.n5.get_Item(var5))) {
               return var5;
            }
         }
      }

      return -1;
   }

   @Override
   public int lastIndexOf(Object value) {
      return this.lastIndexOf(value, this.n5.size() - 1);
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

      if (startIndex - count + 1 < 0) {
         n5("count", count, "count is too large.");
      }

      if (value == null) {
         for (int var4 = startIndex; var4 > startIndex - count; var4--) {
            if (this.n5.get_Item(var4) == null) {
               return var4;
            }
         }
      } else {
         for (int var5 = startIndex; var5 > startIndex - count; var5--) {
            if (value.equals(this.n5.get_Item(var5))) {
               return var5;
            }
         }
      }

      return -1;
   }

   @Override
   public void insertItem(int index, Object value) {
      this.n5.insertItem(index, value);
   }

   @Override
   public void insertRange(int index, ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index > this.n5.size()) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      for (Object var4 : c) {
         this.n5.insertItem(index++, var4);
      }
   }

   @Override
   public void removeItem(Object value) {
      this.n5.removeItem(value);
   }

   @Override
   public void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public void removeRange(int index, int count) {
      n5(index, count, this.n5.size());

      for (int var3 = 0; var3 < count; var3++) {
         this.n5.removeAt(index);
      }
   }

   @Override
   public void reverse() {
      this.reverse(0, this.n5.size());
   }

   @Override
   public void reverse(int index, int count) {
      n5(index, count, this.n5.size());

      for (int var3 = 0; var3 < count / 2; var3++) {
         Object var4 = this.n5.get_Item(var3 + index);
         this.n5.set_Item(var3 + index, this.n5.get_Item(index + count - var3 + index - 1));
         this.n5.set_Item(index + count - var3 + index - 1, var4);
      }
   }

   @Override
   public void setRange(int index, ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index >= 0 && index + c.size() <= this.n5.size()) {
         int var3 = index;

         for (Object var5 : c) {
            this.n5.set_Item(var3++, var5);
         }
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public void copyTo(u3 array) {
      this.n5.copyTo(array, 0);
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public void copyTo(int index, u3 array, int arrayIndex, int count) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         n5("index", index, "Can't be less than zero.");
      }

      if (arrayIndex < 0) {
         n5("arrayIndex", arrayIndex, "Can't be less than zero.");
      }

      if (count < 0) {
         n5("index", index, "Can't be less than zero.");
      }

      if (array.u3() > 1) {
         throw new ArgumentException("Can't copy into multi-dimensional array.");
      }

      if (array.a6() - arrayIndex < count) {
         throw new ArgumentException("Destination array is too small.");
      }

      if (index > this.n5.size() - count) {
         throw new ArgumentException("Index and count do not denote a valid range of elements.", "index");
      }

      for (int var5 = 0; var5 < count; var5++) {
         array.k5(this.n5.get_Item(index + var5), arrayIndex + var5);
      }
   }

   @Override
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }

   @Override
   public IEnumerator iterator(int index, int count) {
      n5(index, count, this.n5.size());
      return new ArrayList$ArrayListAdapter$EnumeratorWithRange(this.n5.iterator(), index, count);
   }

   @Override
   public void addRange(ICollection c) {
      for (Object var3 : c) {
         this.n5.addItem(var3);
      }
   }

   @Override
   public int binarySearch(Object value) {
      return this.binarySearch(value, null);
   }

   @Override
   public int binarySearch(Object value, Comparator comparer) {
      return this.binarySearch(0, this.n5.size(), value, comparer);
   }

   @Override
   public int binarySearch(int index, int count, Object value, Comparator comparer) {
      n5(index, count, this.n5.size());
      if (comparer == null) {
         comparer = Comparer.Default;
      }

      int var5 = index;
      int var6 = index + count - 1;

      while (var5 <= var6) {
         int var7 = var5 + (var6 - var5) / 2;

         int var8;
         try {
            var8 = comparer.compare(value, this.n5.get_Item(var7));
         } catch (Exception var10) {
            throw new InvalidOperationException("value is not of the same type", var10);
         }

         if (var8 < 0) {
            var6 = var7 - 1;
         } else {
            if (var8 <= 0) {
               return var7;
            }

            var5 = var7 + 1;
         }
      }

      return ~var5;
   }

   @Override
   public Object deepClone() {
      return new ArrayList$ArrayListAdapter(this.n5);
   }

   @Override
   public ArrayList getRange(int index, int count) {
      n5(index, count, this.n5.size());
      return new ArrayList$RangedArrayList(this, index, count);
   }

   @Override
   public void trimToSize() {
   }

   @Override
   public void sort() {
      this.sort(Comparer.Default);
   }

   @Override
   public void sort(Comparator comparer) {
      this.sort(0, this.n5.size(), comparer);
   }

   @Override
   public void sort(int index, int count, Comparator comparer) {
      n5(index, count, this.n5.size());
      if (comparer == null) {
         comparer = Comparer.Default;
      }

      n5(this.n5, index, index + count - 1, comparer);
   }

   private static void n5(IList var0, int var1, int var2) {
      Object var3 = var0.get_Item(var1);
      var0.set_Item(var1, var0.get_Item(var2));
      var0.set_Item(var2, var3);
   }

   static void n5(IList var0, int var1, int var2, Comparator var3) {
      if (var1 < var2) {
         int var4 = var1 + (var2 - var1) / 2;
         if (var3.compare(var0.get_Item(var4), var0.get_Item(var1)) < 0) {
            n5(var0, var4, var1);
         }

         if (var3.compare(var0.get_Item(var2), var0.get_Item(var1)) < 0) {
            n5(var0, var2, var1);
         }

         if (var3.compare(var0.get_Item(var2), var0.get_Item(var4)) < 0) {
            n5(var0, var2, var4);
         }

         if (var2 - var1 + 1 > 3) {
            n5(var0, var2 - 1, var4);
            Object var5 = var0.get_Item(var2 - 1);
            int var6 = var1;
            int var7 = var2 - 1;

            while (true) {
               if (var3.compare(var0.get_Item(++var6), var5) >= 0) {
                  while (var3.compare(var0.get_Item(--var7), var5) > 0) {
                  }

                  if (var6 >= var7) {
                     n5(var0, var2 - 1, var6);
                     n5(var0, var1, var6 - 1, var3);
                     n5(var0, var6 + 1, var2, var3);
                     return;
                  }

                  n5(var0, var6, var7);
               }
            }
         }
      }
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.n5.size()];
      this.n5.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0);
      return var1;
   }

   @Override
   public u3 toArray(y8 elementType) {
      u3 var2 = com.aspose.slides.ms.System.u3.n5(elementType, this.n5.size());
      this.n5.copyTo(var2, 0);
      return var2;
   }
}
