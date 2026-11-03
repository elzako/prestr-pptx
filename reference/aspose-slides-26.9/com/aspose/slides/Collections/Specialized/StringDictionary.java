package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public class StringDictionary implements IEnumerable {
   private Hashtable n5 = new Hashtable();

   public int getCount() {
      return this.n5.size();
   }

   public boolean isSynchronized() {
      return false;
   }

   public String get_Item(String key) {
      if (key == null) {
         throw new ArgumentNullException("key");
      } else {
         return (String)this.n5.get_Item(d1.n5(key, l6.k5()));
      }
   }

   public void set_Item(String key, String value) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      this.n5.set_Item(d1.n5(key, l6.k5()), value);
   }

   public ICollection getKeys() {
      return this.n5.getKeys();
   }

   public ICollection getValues() {
      return this.n5.getValues();
   }

   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   public void add(String key, String value) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      this.n5.addItem(d1.n5(key, l6.k5()), value);
   }

   public void clear() {
      this.n5.clear();
   }

   public boolean containsKey(String key) {
      if (key == null) {
         throw new ArgumentNullException("key");
      } else {
         return this.n5.containsKey(d1.n5(key, l6.k5()));
      }
   }

   public boolean containsValue(String value) {
      return this.n5.containsValue(value);
   }

   public void copyTo(u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }

   public void remove(String key) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      this.n5.removeItem(d1.n5(key, l6.k5()));
   }
}
