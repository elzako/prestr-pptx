package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import java.util.Comparator;

@j3
public class SortedDictionary<TKey, TValue>
   implements IGenericCollection<KeyValuePair<TKey, TValue>>,
   IGenericDictionary<TKey, TValue>,
   IGenericEnumerable<KeyValuePair<TKey, TValue>>,
   s7 {
   private RBTree n5;
   private SortedDictionary$NodeHelper l6;

   public SortedDictionary() {
      this((Comparator<TKey>)null);
   }

   public SortedDictionary(Comparator<TKey> comparer) {
      this.l6 = SortedDictionary$NodeHelper.n5(comparer);
      this.n5 = new RBTree(this.l6);
   }

   public SortedDictionary(IGenericDictionary<TKey, TValue> dictionary) {
      this(dictionary, null);
   }

   public SortedDictionary(IGenericDictionary<TKey, TValue> dictionary, Comparator<TKey> comparer) {
      this(comparer);
      if (dictionary == null) {
         throw new ArgumentNullException("dictionary");
      }

      for (KeyValuePair var4 : dictionary) {
         this.addItem((TKey)var4.getKey(), (TValue)var4.getValue());
      }
   }

   protected SortedDictionary(c4 info, s3 context) {
      this.l6 = (SortedDictionary$NodeHelper)info.n5("Helper", k5.n5(SortedDictionary$NodeHelper.class));
      this.n5 = new RBTree(this.l6);
      KeyValuePair[] var3 = (KeyValuePair[])info.n5("KeyValuePairs", k5.n5(KeyValuePair[].class));

      for (KeyValuePair var7 : var3) {
         this.addItem((TKey)var7.getKey(), (TValue)var7.getValue());
      }
   }

   public Comparator<TKey> getComparer() {
      return this.l6.n5;
   }

   int n5() {
      return this.n5.k5();
   }

   @Override
   public int size() {
      return this.n5();
   }

   TValue n5(TKey var1) {
      SortedDictionary$Node var2 = (SortedDictionary$Node)this.n5.l6(var1);
      if (var2 == null) {
         throw new KeyNotFoundException();
      } else {
         return (TValue)var2.l6;
      }
   }

   @Override
   public TValue get_Item(TKey key) {
      return this.n5(key);
   }

   void n5(TKey var1, TValue var2) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      SortedDictionary$Node var3 = (SortedDictionary$Node)this.n5.n5(var1, null);
      var3.l6 = (TValue)var2;
   }

   @Override
   public void set_Item(TKey key, TValue value) {
      this.n5(key, value);
   }

   public SortedDictionary$KeyCollection<TKey, TValue> getKeys() {
      return new SortedDictionary$KeyCollection<>(this);
   }

   public SortedDictionary$ValueCollection<TKey, TValue> getValues() {
      return new SortedDictionary$ValueCollection<>(this);
   }

   void l6(TKey var1, TValue var2) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      SortedDictionary$Node var3 = new SortedDictionary$Node<>(var1, var2);
      if (this.n5.n5(var1, var3) != var3) {
         throw new ArgumentException("key already present in dictionary", "key");
      }
   }

   @Override
   public void addItem(TKey key, TValue value) {
      this.l6(key, value);
   }

   public void addItem(KeyValuePair<TKey, TValue> item) {
      this.addItem(item.getKey(), item.getValue());
   }

   public boolean containsItem(KeyValuePair<TKey, TValue> item) {
      Object[] var2 = new Object[]{null};
      boolean var3 = this.tryGetValue(item.getKey(), var2);
      boolean var4 = new EqualityComparer$DefaultComparer().equals(item.getValue(), var2[0]);
      return var3 && var4;
   }

   public boolean removeItem(KeyValuePair<TKey, TValue> item) {
      return this.removeItemByKey(item.getKey());
   }

   void l6() {
      this.n5.l6();
   }

   @Override
   public void clear() {
      this.l6();
   }

   boolean l6(TKey var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      } else {
         return this.n5.l6(var1) != null;
      }
   }

   @Override
   public boolean containsKey(TKey key) {
      return this.l6(key);
   }

   public boolean containsValue(TValue value) {
      EqualityComparer$DefaultComparer var2 = new EqualityComparer$DefaultComparer();

      for (Object recoveredElement$var4$4648 : this.n5.u9()) {
         SortedDictionary$Node var4 = (SortedDictionary$Node)recoveredElement$var4$4648;
         if (var2.equals(value, var4.l6)) {
            return true;
         }
      }

      return false;
   }

   void n5(KeyValuePair<TKey, TValue>[] var1, int var2) {
      if (this.size() != 0) {
         if (var1 == null) {
            throw new ArgumentNullException();
         }

         if (var2 < 0) {
            throw new ArgumentOutOfRangeException();
         }

         if (var1.length <= var2) {
            throw new ArgumentException();
         }

         if (var1.length < this.size()) {
            throw new ArgumentException();
         }

         if (var1.length - var2 < this.size()) {
            throw new ArgumentException();
         }

         for (Object recoveredElement$var4$5380 : this.n5.u9()) {
            SortedDictionary$Node var4 = (SortedDictionary$Node)recoveredElement$var4$5380;
            var1[var2++] = var4.n5().Clone();
         }
      }
   }

   public void copyToTArray(KeyValuePair<TKey, TValue>[] array, int index) {
      this.n5(array, index);
   }

   public SortedDictionary$Enumerator<TKey, TValue> iterator() {
      return new SortedDictionary$Enumerator<>(this);
   }

   boolean k5(TKey var1) {
      return this.n5.n5(var1) != null;
   }

   @Override
   public boolean removeItemByKey(TKey key) {
      return this.k5(key);
   }

   @Override
   public boolean tryGetValue(TKey key, Object[] valueRef) {
      SortedDictionary$Node var3 = (SortedDictionary$Node)this.n5.l6(key);
      valueRef[0] = var3 == null ? null : var3.l6;
      return var3 != null;
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
      if (info == null) {
         throw new ArgumentNullException("info");
      }

      KeyValuePair[] var3 = (KeyValuePair[])u3.n5(u3.n5(k5.n5(KeyValuePair.class), this.size()));
      this.copyToTArray(var3, 0);
      info.n5("KeyValuePairs", var3);
      info.n5("Helper", this.l6);
   }

   private TKey u3(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      } else {
         return (TKey)var1;
      }
   }

   private TValue a6(Object var1) {
      return (TValue)var1;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   public IDictionary getIDictionary() {
      return new SortedDictionary$1(this);
   }

   public ICollection getICollection() {
      return new SortedDictionary$2(this);
   }

   public IEnumerable getIEnumerable() {
      return new SortedDictionary$3(this);
   }

   public IGenericEnumerable<KeyValuePair<TKey, TValue>> getIGenericEnumerable() {
      return new SortedDictionary$4(this);
   }

   SortedDictionary<TKey, TValue> k5() {
      return this;
   }

   // $VF: synthetic method
   static Object n5(SortedDictionary var0, Object var1) {
      return var0.u3(var1);
   }

   // $VF: synthetic method
   static Object l6(SortedDictionary var0, Object var1) {
      return var0.a6(var1);
   }

   // $VF: synthetic method
   static RBTree n5(SortedDictionary var0) {
      return var0.n5;
   }
}
