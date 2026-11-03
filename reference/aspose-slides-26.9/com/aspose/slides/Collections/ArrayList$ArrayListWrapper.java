package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.y8;
import java.util.Comparator;

@j3
class ArrayList$ArrayListWrapper extends ArrayList {
   protected ArrayList n5;

   public ArrayList$ArrayListWrapper(ArrayList innerArrayList) {
      this.n5 = innerArrayList;
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
      return this.n5.getCapacity();
   }

   @Override
   public void setCapacity(int value) {
      this.n5.setCapacity(value);
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
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
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
      return this.n5.indexOf(value, startIndex);
   }

   @Override
   public int indexOf(Object value, int startIndex, int count) {
      return this.n5.indexOf(value, startIndex, count);
   }

   @Override
   public int lastIndexOf(Object value) {
      return this.n5.lastIndexOf(value);
   }

   @Override
   public int lastIndexOf(Object value, int startIndex) {
      return this.n5.lastIndexOf(value, startIndex);
   }

   @Override
   public int lastIndexOf(Object value, int startIndex, int count) {
      return this.n5.lastIndexOf(value, startIndex, count);
   }

   @Override
   public void insertItem(int index, Object value) {
      this.n5.insertItem(index, value);
   }

   @Override
   public void insertRange(int index, ICollection c) {
      this.n5.insertRange(index, c);
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
      this.n5.removeRange(index, count);
   }

   @Override
   public void reverse() {
      this.n5.reverse();
   }

   @Override
   public void reverse(int index, int count) {
      this.n5.reverse(index, count);
   }

   @Override
   public void setRange(int index, ICollection c) {
      this.n5.setRange(index, c);
   }

   @Override
   public void copyTo(u3 array) {
      this.n5.copyTo(array);
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public void copyTo(int index, u3 array, int arrayIndex, int count) {
      this.n5.copyTo(index, array, arrayIndex, count);
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }

   @Override
   public IEnumerator iterator(int index, int count) {
      return this.n5.iterator(index, count);
   }

   @Override
   public void addRange(ICollection c) {
      this.n5.addRange(c);
   }

   @Override
   public int binarySearch(Object value) {
      return this.n5.binarySearch(value);
   }

   @Override
   public int binarySearch(Object value, Comparator comparer) {
      return this.n5.binarySearch(value, comparer);
   }

   @Override
   public int binarySearch(int index, int count, Object value, Comparator comparer) {
      return this.n5.binarySearch(index, count, value, comparer);
   }

   @Override
   public Object deepClone() {
      return this.n5.deepClone();
   }

   @Override
   public ArrayList getRange(int index, int count) {
      return this.n5.getRange(index, count);
   }

   @Override
   public void trimToSize() {
      this.n5.trimToSize();
   }

   @Override
   public void sort() {
      this.n5.sort();
   }

   @Override
   public void sort(Comparator comparer) {
      this.n5.sort(comparer);
   }

   @Override
   public void sort(int index, int count, Comparator comparer) {
      this.n5.sort(index, count, comparer);
   }

   @Override
   public Object[] toArray() {
      return this.n5.toArray();
   }

   @Override
   public u3 toArray(y8 elementType) {
      return this.n5.toArray(elementType);
   }
}
