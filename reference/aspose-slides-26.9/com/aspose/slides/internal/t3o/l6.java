package com.aspose.slides.internal.t3o;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.s3;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class l6 extends Hashtable {
   private Map n5;
   private int l6;

   public l6(Map var1) {
      this.n5 = var1;
      if (var1 instanceof Hashtable) {
         this.l6 = ((Hashtable)var1).getVersion();
      }
   }

   @Override
   public int getVersion() {
      return this.n5 instanceof Hashtable ? ((Hashtable)this.n5).getVersion() : this.l6;
   }

   @Override
   public void addItem(Object key, Object value) {
      this.n5.put(key, value);
      this.l6++;
   }

   @Override
   public void clear() {
      this.n5.clear();
      this.l6++;
   }

   @Override
   public Object deepClone() {
      java.util.Hashtable var1 = new java.util.Hashtable(this.n5.size());

      for (Object var3 : this.n5.keySet()) {
         var1.put(var3, this.n5.get(var3));
      }

      return var1;
   }

   @Override
   public boolean contains(Object key) {
      return this.n5.containsKey(key);
   }

   @Override
   public boolean containsKey(Object key) {
      return this.n5.containsKey(key);
   }

   @Override
   public boolean containsValue(Object value) {
      return this.n5.containsValue(value);
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array", "Array cannot be null");
      }

      if (array.u3() != 1) {
         throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
      }

      if (arrayIndex < 0) {
         throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
      }

      if (array.a6() - arrayIndex < this.size()) {
         throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
      }

      for (Object var4 : this.n5.keySet()) {
         DictionaryEntry var5 = new DictionaryEntry(var4, this.n5.get(var4));
         array.k5(var5.clone(), arrayIndex++);
      }
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return new k5(this);
   }

   @Override
   protected int getHash(Object key) {
      return this.n5.hashCode();
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
   }

   @Override
   protected boolean keyEquals(Object item, Object key) {
      return item != null && item.equals(key);
   }

   @Override
   public void onDeserialization(Object sender) {
   }

   @Override
   public void removeItem(Object key) {
      this.n5.remove(key);
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   protected IGenericEqualityComparer getEqualityComparer() {
      return null;
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
   public Object get_Item(Object key) {
      return this.n5.get(key);
   }

   @Override
   public void set_Item(Object key, Object value) {
      this.n5.put(key, value);
      this.l6++;
   }

   @Override
   public ICollection getKeys() {
      return new u3(this);
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public ICollection getValues() {
      return new u9(this);
   }

   @Override
   public boolean isEmpty() {
      return this.n5.size() == 0;
   }

   @Override
   public Object get(Object key) {
      return this.n5.get(key);
   }

   @Override
   public Object put(Object key, Object value) {
      this.l6++;
      return this.n5.put(key, value);
   }

   @Override
   public Object remove(Object key) {
      this.l6++;
      return this.n5.remove(key);
   }

   @Override
   public void putAll(Map m) {
      this.n5.putAll(m);
      this.l6++;
   }

   @Override
   public Set keySet() {
      return this.n5.keySet();
   }

   @Override
   public Collection values() {
      return this.n5.values();
   }

   @Override
   public Set entrySet() {
      return this.n5.entrySet();
   }

   // $VF: synthetic method
   static Map n5(l6 var0) {
      return var0.n5;
   }
}
