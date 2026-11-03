package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public class HybridDictionary implements ICollection, IDictionary {
   private boolean n5;
   private Hashtable l6;
   private ListDictionary k5;

   private IDictionary n5() {
      return this.k5 == null ? this.l6 : this.k5;
   }

   public HybridDictionary() {
      this(0, false);
   }

   public HybridDictionary(boolean caseInsensitive) {
      this(0, caseInsensitive);
   }

   public HybridDictionary(int initialSize) {
      this(initialSize, false);
   }

   public HybridDictionary(int initialSize, boolean caseInsensitive) {
      this.n5 = caseInsensitive;
      CaseInsensitiveComparer var3 = caseInsensitive ? CaseInsensitiveComparer.getDefaultInvariant() : null;
      CaseInsensitiveHashCodeProvider var4 = caseInsensitive ? CaseInsensitiveHashCodeProvider.getDefaultInvariant() : null;
      if (initialSize <= 10) {
         this.k5 = new ListDictionary(var3);
      } else {
         this.l6 = new Hashtable(initialSize, var4, var3);
      }
   }

   @Override
   public int size() {
      return this.n5().size();
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
      return this.n5().get_Item(key);
   }

   @Override
   public void set_Item(Object key, Object value) {
      this.n5().set_Item(key, value);
      if (this.k5 != null && this.size() > 10) {
         this.l6();
      }
   }

   @Override
   public ICollection getKeys() {
      return this.n5().getKeys();
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public ICollection getValues() {
      return this.n5().getValues();
   }

   @Override
   public void addItem(Object key, Object value) {
      this.n5().addItem(key, value);
      if (this.k5 != null && this.size() > 10) {
         this.l6();
      }
   }

   @Override
   public void clear() {
      this.n5().clear();
   }

   @Override
   public boolean contains(Object key) {
      return this.n5().contains(key);
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.n5().copyTo(array, index);
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return this.n5().iterator();
   }

   public IEnumerable getIEnumerable() {
      return new HybridDictionary$1(this);
   }

   @Override
   public void removeItem(Object key) {
      this.n5().removeItem(key);
   }

   private void l6() {
      CaseInsensitiveComparer var1 = this.n5 ? CaseInsensitiveComparer.getDefaultInvariant() : null;
      CaseInsensitiveHashCodeProvider var2 = this.n5 ? CaseInsensitiveHashCodeProvider.getDefaultInvariant() : null;
      this.l6 = new Hashtable(this.k5, var2, var1);
      this.k5.clear();
      this.k5 = null;
   }

   // $VF: synthetic method
   static IDictionary n5(HybridDictionary var0) {
      return var0.n5();
   }
}
