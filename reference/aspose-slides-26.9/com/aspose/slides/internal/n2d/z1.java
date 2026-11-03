package com.aspose.slides.internal.n2d;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;

public class z1<TKey, TValue> implements IGenericDictionary<TKey, TValue> {
   private Class<TKey> n5;
   private Class<TValue> l6;
   private final List<KeyValuePair<TKey, TValue>> k5;
   private final Dictionary<TKey, Integer> u3;

   public z1(Class<TKey> var1, Class<TValue> var2) {
      this(var1, var2, null, null);
   }

   public z1(Class<TKey> var1, Class<TValue> var2, z1<TKey, TValue> var3, IGenericEqualityComparer<TKey> var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3 != null ? new List<>(var3.k5) : new List<>();
      this.u3 = var3 != null ? new Dictionary<>(var3.u3, var4) : new Dictionary<>(var4);
   }

   @Override
   public final void addItem(TKey key, TValue value) {
      n5(key);
      if (this.containsKey(key)) {
         throw new ArgumentException("An element with the same key already exists");
      }

      this.k5.addItem(new KeyValuePair<>(key, value));
      this.u3.addItem(key, this.k5.size() - 1);
   }

   public final void n5(KeyValuePair<TKey, TValue> var1) {
      this.addItem((TKey)var1.getKey(), (TValue)var1.getValue());
   }

   @Override
   public final TValue get_Item(TKey key) {
      n5(key);
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = this.u3.tryGetValue(key, var3);
      var2 = var3[0];
      if (var4) {
         return this.k5.get_Item(var2).getValue();
      } else {
         throw new KeyNotFoundException(d1.n5("The '{0}' was not found", new Object[]{key}));
      }
   }

   @Override
   public final void set_Item(TKey key, TValue value) {
      n5(key);
      int var3 = 0;
      Integer[] var4 = new Integer[]{var3};
      boolean var5 = this.u3.tryGetValue(key, var4);
      var3 = var4[0];
      if (var5) {
         this.k5.set_Item(var3, new KeyValuePair<>(key, value));
      } else {
         this.k5.addItem(new KeyValuePair<>(key, value));
         this.u3.addItem(key, this.k5.size() - 1);
      }
   }

   @Override
   public final boolean tryGetValue(TKey key, Object[] value) {
      n5(key);
      int var3 = 0;
      Integer[] var4 = new Integer[]{var3};
      boolean var5 = this.u3.tryGetValue(key, var4);
      var3 = var4[0];
      if (var5) {
         value[0] = this.k5.get_Item(var3).getValue();
         return true;
      } else {
         value[0] = com.aspose.slides.internal.v6g.k5.k5(this.l6);
         return false;
      }
   }

   public final boolean l6(KeyValuePair<TKey, TValue> var1) {
      return this.k5.containsItem(var1.Clone());
   }

   @Override
   public final boolean containsKey(TKey key) {
      n5(key);
      return this.u3.containsKey(key);
   }

   @Override
   public final void clear() {
      this.k5.clear();
      this.u3.clear();
   }

   public final boolean k5(KeyValuePair<TKey, TValue> var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = this.u3.tryGetValue((TKey)var1.getKey(), var3) && this.k5.get_Item(var3[0]).getValue().equals(var1.getValue());
      var2 = var3[0];
      if (var4) {
         this.k5.removeAt(var2);
         this.u3.removeItemByKey((TKey)var1.getKey());
         this.n5();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final boolean removeItemByKey(TKey key) {
      n5(key);
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = this.u3.tryGetValue(key, var3);
      var2 = var3[0];
      if (var4) {
         this.k5.removeAt(var2);
         this.u3.removeItemByKey(key);
         this.n5();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final IGenericCollection<TKey> getKeys() {
      return this.u3.getKeys();
   }

   @Override
   public final IGenericCollection<TValue> getValues() {
      Object[] var1 = new Object[this.k5.size()];

      for (int var2 = 0; var2 < this.k5.size(); var2++) {
         var1[var2] = this.k5.get_Item(var2).getValue();
      }

      return com.aspose.slides.ms.System.u3.n5((TValue[])var1);
   }

   private void n5() {
      com.aspose.slides.internal.f8y.n5.n5(this.k5.size() == this.u3.size());

      for (int var1 = 0; var1 < this.k5.size(); var1++) {
         this.u3.set_Item(this.k5.get_Item(var1).getKey(), var1);
      }
   }

   private static <TKey> void n5(TKey var0) {
      if (var0 == null) {
         throw new ArgumentNullException("Key cannot be null");
      }
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
      return this.k5.iterator();
   }

   public final void n5(KeyValuePair<TKey, TValue>[] var1, int var2) {
      throw new NotImplementedException();
   }

   @Override
   public final int size() {
      return this.k5.size();
   }

   @Override
   public final boolean isReadOnly() {
      throw new NotImplementedException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(KeyValuePair<TKey, TValue> bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(KeyValuePair<TKey, TValue>[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(KeyValuePair<TKey, TValue> bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(KeyValuePair<TKey, TValue> bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
