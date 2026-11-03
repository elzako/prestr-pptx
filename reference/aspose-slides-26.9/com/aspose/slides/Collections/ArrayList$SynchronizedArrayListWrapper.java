package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.y8;
import java.util.Comparator;

@j3
final class ArrayList$SynchronizedArrayListWrapper extends ArrayList$ArrayListWrapper {
   private final Object l6;

   ArrayList$SynchronizedArrayListWrapper(ArrayList innerArrayList) {
      super(innerArrayList);
      this.l6 = innerArrayList.getSyncRoot();
   }

   @Override
   public Object get_Item(int index) {
      synchronized (this.l6) {
         return this.n5.get_Item(index);
      }
   }

   @Override
   public void set_Item(int index, Object value) {
      synchronized (this.l6) {
         this.n5.set_Item(index, value);
      }
   }

   @Override
   public int size() {
      synchronized (this.l6) {
         return this.n5.size();
      }
   }

   @Override
   public int getCapacity() {
      synchronized (this.l6) {
         return this.n5.getCapacity();
      }
   }

   @Override
   public void setCapacity(int value) {
      synchronized (this.l6) {
         this.n5.setCapacity(value);
      }
   }

   @Override
   public boolean isFixedSize() {
      synchronized (this.l6) {
         return this.n5.isFixedSize();
      }
   }

   @Override
   public boolean isReadOnly() {
      synchronized (this.l6) {
         return this.n5.isReadOnly();
      }
   }

   @Override
   public boolean isSynchronized() {
      return true;
   }

   @Override
   public Object getSyncRoot() {
      return this.l6;
   }

   @Override
   public int addItem(Object value) {
      synchronized (this.l6) {
         return this.n5.addItem(value);
      }
   }

   @Override
   public void clear() {
      synchronized (this.l6) {
         this.n5.clear();
      }
   }

   @Override
   public boolean contains(Object value) {
      synchronized (this.l6) {
         return this.n5.contains(value);
      }
   }

   @Override
   public int indexOf(Object value) {
      synchronized (this.l6) {
         return this.n5.indexOf(value);
      }
   }

   @Override
   public int indexOf(Object value, int startIndex) {
      synchronized (this.l6) {
         return this.n5.indexOf(value, startIndex);
      }
   }

   @Override
   public int indexOf(Object value, int startIndex, int count) {
      synchronized (this.l6) {
         return this.n5.indexOf(value, startIndex, count);
      }
   }

   @Override
   public int lastIndexOf(Object value) {
      synchronized (this.l6) {
         return this.n5.lastIndexOf(value);
      }
   }

   @Override
   public int lastIndexOf(Object value, int startIndex) {
      synchronized (this.l6) {
         return this.n5.lastIndexOf(value, startIndex);
      }
   }

   @Override
   public int lastIndexOf(Object value, int startIndex, int count) {
      synchronized (this.l6) {
         return this.n5.lastIndexOf(value, startIndex, count);
      }
   }

   @Override
   public void insertItem(int index, Object value) {
      synchronized (this.l6) {
         this.n5.insertItem(index, value);
      }
   }

   @Override
   public void insertRange(int index, ICollection c) {
      synchronized (this.l6) {
         this.n5.insertRange(index, c);
      }
   }

   @Override
   public void removeItem(Object value) {
      synchronized (this.l6) {
         this.n5.removeItem(value);
      }
   }

   @Override
   public void removeAt(int index) {
      synchronized (this.l6) {
         this.n5.removeAt(index);
      }
   }

   @Override
   public void removeRange(int index, int count) {
      synchronized (this.l6) {
         this.n5.removeRange(index, count);
      }
   }

   @Override
   public void reverse() {
      synchronized (this.l6) {
         this.n5.reverse();
      }
   }

   @Override
   public void reverse(int index, int count) {
      synchronized (this.l6) {
         this.n5.reverse(index, count);
      }
   }

   @Override
   public void copyTo(u3 array) {
      synchronized (this.l6) {
         this.n5.copyTo(array);
      }
   }

   @Override
   public void copyTo(u3 array, int index) {
      synchronized (this.l6) {
         this.n5.copyTo(array, index);
      }
   }

   @Override
   public void copyTo(int index, u3 array, int arrayIndex, int count) {
      synchronized (this.l6) {
         this.n5.copyTo(index, array, arrayIndex, count);
      }
   }

   @Override
   public IEnumerator iterator() {
      synchronized (this.l6) {
         return this.n5.iterator();
      }
   }

   @Override
   public IEnumerator iterator(int index, int count) {
      synchronized (this.l6) {
         return this.n5.iterator(index, count);
      }
   }

   @Override
   public void addRange(ICollection c) {
      synchronized (this.l6) {
         this.n5.addRange(c);
      }
   }

   @Override
   public int binarySearch(Object value) {
      synchronized (this.l6) {
         return this.n5.binarySearch(value);
      }
   }

   @Override
   public int binarySearch(Object value, Comparator comparer) {
      synchronized (this.l6) {
         return this.n5.binarySearch(value, comparer);
      }
   }

   @Override
   public int binarySearch(int index, int count, Object value, Comparator comparer) {
      synchronized (this.l6) {
         return this.n5.binarySearch(index, count, value, comparer);
      }
   }

   @Override
   public Object deepClone() {
      synchronized (this.l6) {
         return this.n5.deepClone();
      }
   }

   @Override
   public ArrayList getRange(int index, int count) {
      synchronized (this.l6) {
         return this.n5.getRange(index, count);
      }
   }

   @Override
   public void trimToSize() {
      synchronized (this.l6) {
         this.n5.trimToSize();
      }
   }

   @Override
   public void sort() {
      synchronized (this.l6) {
         this.n5.sort();
      }
   }

   @Override
   public void sort(Comparator comparer) {
      synchronized (this.l6) {
         this.n5.sort(comparer);
      }
   }

   @Override
   public void sort(int index, int count, Comparator comparer) {
      synchronized (this.l6) {
         this.n5.sort(index, count, comparer);
      }
   }

   @Override
   public Object[] toArray() {
      synchronized (this.l6) {
         return this.n5.toArray();
      }
   }

   @Override
   public u3 toArray(y8 elementType) {
      synchronized (this.l6) {
         return this.n5.toArray(elementType);
      }
   }
}
