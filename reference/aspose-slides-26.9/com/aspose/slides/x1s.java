package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;

final class x1s<TKey, TValue> implements IGenericDictionary<TKey, TValue> {
   private final Dictionary<TKey, TValue> n5;

   private IGenericDictionary<TKey, TValue> n5() {
      return this.n5;
   }

   public x1s(Dictionary<TKey, TValue> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("implementation");
      }

      this.n5 = var1;
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
      return this.n5().iterator();
   }

   public final void n5(KeyValuePair<TKey, TValue> var1) {
      this.n5().addItem(var1.Clone());
   }

   @Override
   public final void clear() {
      this.n5().clear();
   }

   public final boolean l6(KeyValuePair<TKey, TValue> var1) {
      return this.n5().containsItem(var1.Clone());
   }

   public final void n5(KeyValuePair<TKey, TValue>[] var1, int var2) {
      this.n5().copyToTArray(var1, var2);
   }

   public final boolean k5(KeyValuePair<TKey, TValue> var1) {
      return this.n5().removeItem(var1.Clone());
   }

   @Override
   public final int size() {
      return this.n5().size();
   }

   @Override
   public final boolean isReadOnly() {
      return this.n5().isReadOnly();
   }

   @Override
   public final boolean containsKey(TKey key) {
      return key == null ? false : this.n5().containsKey(key);
   }

   @Override
   public final void addItem(TKey key, TValue value) {
      this.n5().addItem(key, value);
   }

   @Override
   public final boolean removeItemByKey(TKey key) {
      return this.n5().removeItemByKey(key);
   }

   @Override
   public final boolean tryGetValue(TKey key, Object[] value) {
      return this.n5().tryGetValue(key, value);
   }

   @Override
   public final TValue get_Item(TKey key) {
      return this.n5().get_Item(key);
   }

   @Override
   public final void set_Item(TKey key, TValue value) {
      this.n5().set_Item(key, value);
   }

   @Override
   public final com.aspose.slides.Collections.Generic.IGenericCollection<TKey> getKeys() {
      return this.n5().getKeys();
   }

   @Override
   public final com.aspose.slides.Collections.Generic.IGenericCollection<TValue> getValues() {
      return this.n5().getValues();
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
