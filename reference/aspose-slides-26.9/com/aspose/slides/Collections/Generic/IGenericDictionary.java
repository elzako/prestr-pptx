package com.aspose.slides.Collections.Generic;

public interface IGenericDictionary<TKey, TValue> extends IGenericCollection<KeyValuePair<TKey, TValue>> {
   void addItem(TKey var1, TValue var2);

   boolean containsKey(TKey var1);

   boolean removeItemByKey(TKey var1);

   boolean tryGetValue(TKey var1, Object[] var2);

   TValue get_Item(TKey var1);

   void set_Item(TKey var1, TValue var2);

   IGenericCollection<TKey> getKeys();

   IGenericCollection<TValue> getValues();
}
