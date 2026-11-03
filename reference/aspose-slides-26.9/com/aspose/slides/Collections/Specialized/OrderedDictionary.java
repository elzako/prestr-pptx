package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.h0;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.u3;

public class OrderedDictionary implements ICollection, IDictionary, IEnumerable, IOrderedDictionary, h0, s7 {
   private ArrayList n5;
   private Hashtable l6;
   private boolean k5;
   private int u3;
   private c4 a6;
   private IGenericEqualityComparer u9;

   public OrderedDictionary() {
      this.n5 = new ArrayList();
      this.l6 = new Hashtable();
   }

   public OrderedDictionary(int capacity) {
      this.u3 = capacity < 0 ? 0 : capacity;
      this.n5 = new ArrayList(this.u3);
      this.l6 = new Hashtable(this.u3);
   }

   public OrderedDictionary(IGenericEqualityComparer equalityComparer) {
      this.n5 = new ArrayList();
      this.l6 = new Hashtable(equalityComparer);
      this.u9 = equalityComparer;
   }

   public OrderedDictionary(int capacity, IGenericEqualityComparer equalityComparer) {
      this.u3 = capacity < 0 ? 0 : capacity;
      this.n5 = new ArrayList(this.u3);
      this.l6 = new Hashtable(this.u3, equalityComparer);
      this.u9 = equalityComparer;
   }

   protected OrderedDictionary(c4 info, s3 context) {
      this.a6 = info;
   }

   @Override
   public void onDeserialization(Object sender) {
      throw new NotSupportedException();
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
      throw new NotSupportedException();
   }

   @Override
   public int size() {
      return this.n5.size();
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
   public void copyTo(u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return this.k5;
   }

   @Override
   public Object get_Item(Object key) {
      return this.l6.get_Item(key);
   }

   @Override
   public void set_Item(Object key, Object value) {
      this.n5();
      if (this.l6.contains(key)) {
         int var3 = this.n5(key);
         this.n5.set_Item(var3, com.aspose.slides.internal.v6g.k5.n5(new DictionaryEntry(key, value)));
      } else {
         this.n5.addItem(com.aspose.slides.internal.v6g.k5.n5(new DictionaryEntry(key, value)));
      }

      this.l6.set_Item(key, value);
   }

   @Override
   public Object get_Item(int index) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(index), DictionaryEntry.class).getValue();
   }

   @Override
   public void set_Item(int index, Object value) {
      this.n5();
      DictionaryEntry var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(index), DictionaryEntry.class).Clone();
      var3.setValue(value);
      this.n5.set_Item(index, com.aspose.slides.internal.v6g.k5.n5(var3));
      this.l6.set_Item(var3.getKey(), value);
   }

   @Override
   public ICollection getKeys() {
      return new OrderedDictionary$OrderedCollection(this.n5, true);
   }

   @Override
   public ICollection getValues() {
      return new OrderedDictionary$OrderedCollection(this.n5, false);
   }

   @Override
   public void addItem(Object key, Object value) {
      this.n5();
      this.l6.addItem(key, value);
      this.n5.addItem(com.aspose.slides.internal.v6g.k5.n5(new DictionaryEntry(key, value)));
   }

   @Override
   public void clear() {
      this.n5();
      this.l6.clear();
      this.n5.clear();
   }

   @Override
   public boolean contains(Object key) {
      return this.l6.contains(key);
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return new OrderedDictionary$OrderedEntryCollectionEnumerator(this.n5.iterator());
   }

   @Override
   public void removeItem(Object key) {
      this.n5();
      if (this.l6.contains(key)) {
         this.l6.removeItem(key);
         int var2 = this.n5(key);
         this.n5.removeAt(var2);
      }
   }

   private int n5(Object var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         DictionaryEntry var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var2), DictionaryEntry.class).Clone();
         if (this.u9 != null ? this.u9.equals(var3.getKey(), var1) : var3.getKey().equals(var1)) {
            return var2;
         }
      }

      return -1;
   }

   private void n5() {
      if (this.k5) {
         throw new NotSupportedException("Collection is read only");
      }
   }

   public OrderedDictionary asReadOnly() {
      OrderedDictionary var1 = new OrderedDictionary();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.u9 = this.u9;
      var1.k5 = true;
      return var1;
   }

   @Override
   public void insert(int index, Object key, Object value) {
      this.n5();
      this.l6.addItem(key, value);
      this.n5.insertItem(index, com.aspose.slides.internal.v6g.k5.n5(new DictionaryEntry(key, value)));
   }

   @Override
   public void removeAt(int index) {
      this.n5();
      DictionaryEntry var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(index), DictionaryEntry.class).Clone();
      this.n5.removeAt(index);
      this.l6.removeItem(var2.getKey());
   }
}
