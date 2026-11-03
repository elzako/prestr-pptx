package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import java.util.Comparator;

@j3
public class ListDictionary implements ICollection, IDictionary, IEnumerable {
   private int n5 = 0;
   private int l6 = 0;
   private ListDictionary$DictionaryNode k5;
   private Comparator u3 = null;

   public ListDictionary() {
      this.k5 = null;
   }

   public ListDictionary(Comparator comparer) {
      this();
      this.u3 = comparer;
   }

   private ListDictionary$DictionaryNode n5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key", "Attempted lookup for a null key.");
      }

      ListDictionary$DictionaryNode var2 = this.k5;
      if (this.u3 == null) {
         while (var2 != null && !var1.equals(var2.n5)) {
            var2 = var2.k5;
         }
      } else {
         while (var2 != null && this.u3.compare(var1, var2.n5) != 0) {
            var2 = var2.k5;
         }
      }

      return var2;
   }

   private ListDictionary$DictionaryNode n5(Object var1, ListDictionary$DictionaryNode[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("key", "Attempted lookup for a null key.");
      }

      ListDictionary$DictionaryNode var3 = this.k5;
      var2[0] = null;
      if (this.u3 == null) {
         while (var3 != null && !var1.equals(var3.n5)) {
            var2[0] = var3;
            var3 = var3.k5;
         }
      } else {
         while (var3 != null && this.u3.compare(var1, var3.n5) != 0) {
            var2[0] = var3;
            var3 = var3.k5;
         }
      }

      return var3;
   }

   private void n5(Object var1, Object var2, ListDictionary$DictionaryNode var3) {
      if (var3 == null) {
         this.k5 = new ListDictionary$DictionaryNode(var1, var2, this.k5);
      } else {
         var3.k5 = new ListDictionary$DictionaryNode(var1, var2, var3.k5);
      }

      this.n5++;
      this.l6++;
   }

   @Override
   public int size() {
      return this.n5;
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
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array", "Array cannot be null.");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", "index is less than 0");
      }

      if (index > array.a6()) {
         throw new IndexOutOfRangeException("index is too large");
      }

      if (this.size() > array.a6() - index) {
         throw new ArgumentException("Not enough room in the array");
      }

      for (Object recoveredElement$var4$3226 : this) {
         DictionaryEntry var4 = (DictionaryEntry)recoveredElement$var4$3226;
         array.k5(var4.Clone(), index++);
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
   public Object get_Item(Object key) {
      ListDictionary$DictionaryNode var2 = this.n5(key);
      return var2 == null ? null : var2.l6;
   }

   @Override
   public void set_Item(Object key, Object value) {
      ListDictionary$DictionaryNode var3 = null;
      ListDictionary$DictionaryNode[] var4 = new ListDictionary$DictionaryNode[]{var3};
      ListDictionary$DictionaryNode var5 = this.n5(key, var4);
      var3 = var4[0];
      if (var5 != null) {
         var5.l6 = value;
      } else {
         this.n5(key, value, var3);
      }
   }

   @Override
   public ICollection getKeys() {
      return new ListDictionary$DictionaryNodeCollection(this, true);
   }

   @Override
   public ICollection getValues() {
      return new ListDictionary$DictionaryNodeCollection(this, false);
   }

   @Override
   public void addItem(Object key, Object value) {
      ListDictionary$DictionaryNode var3 = null;
      ListDictionary$DictionaryNode[] var4 = new ListDictionary$DictionaryNode[]{var3};
      ListDictionary$DictionaryNode var5 = this.n5(key, var4);
      var3 = var4[0];
      if (var5 != null) {
         throw new ArgumentException("key", "Duplicate key in add.");
      }

      this.n5(key, value, var3);
   }

   @Override
   public void clear() {
      this.k5 = null;
      this.n5 = 0;
      this.l6++;
   }

   @Override
   public boolean contains(Object key) {
      return this.n5(key) != null;
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return new ListDictionary$DictionaryNodeEnumerator(this);
   }

   @Override
   public void removeItem(Object key) {
      ListDictionary$DictionaryNode var2 = null;
      ListDictionary$DictionaryNode[] var3 = new ListDictionary$DictionaryNode[]{var2};
      ListDictionary$DictionaryNode var4 = this.n5(key, var3);
      var2 = var3[0];
      if (var4 != null) {
         if (var2 == null) {
            this.k5 = var4.k5;
         } else {
            var2.k5 = var4.k5;
         }

         var4.l6 = null;
         this.n5--;
         this.l6++;
      }
   }

   // $VF: synthetic method
   static int n5(ListDictionary var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static ListDictionary$DictionaryNode l6(ListDictionary var0) {
      return var0.k5;
   }
}
