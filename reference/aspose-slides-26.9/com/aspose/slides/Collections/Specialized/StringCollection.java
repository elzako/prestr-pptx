package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public class StringCollection implements ICollection<String>, IEnumerable<String> {
   private ArrayList n5 = new ArrayList();

   public String get_Item(int index) {
      return (String)this.n5.get_Item(index);
   }

   public void set_Item(int index, String value) {
      this.n5.set_Item(index, value);
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   public int addItem(String value) {
      return this.n5.addItem(value);
   }

   public void addRange(String[] value) {
      if (value == null) {
         throw new ArgumentNullException("value");
      }

      this.n5.addRange(u3.n5((Object)(value)));
   }

   public void clear() {
      this.n5.clear();
   }

   public boolean contains(String value) {
      return this.n5.contains(value);
   }

   public void copyTo(String[] array, int index) {
      this.copyTo(u3.n5((Object)(array)), index);
   }

   public int indexOf(String value) {
      return this.n5.indexOf(value);
   }

   public void insertItem(int index, String value) {
      this.n5.insertItem(index, value);
   }

   public boolean isReadOnly() {
      return false;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   public void removeItem(String value) {
      this.n5.removeItem(value);
   }

   public void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (this.n5.size() != 0) {
         this.n5.copyTo(array, index);
      }
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }
}
