package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;

class SortedDictionary$Node<TKey, TValue> extends RBTree$Node {
   public TKey n5;
   public TValue l6;

   public SortedDictionary$Node(TKey key) {
      this.n5 = key;
   }

   public SortedDictionary$Node(TKey key, TValue value) {
      this.n5 = key;
      this.l6 = value;
   }

   @Override
   public void swapValue(RBTree$Node other) {
      SortedDictionary$Node var2 = (SortedDictionary$Node)other;
      Object var3 = this.n5;
      this.n5 = (TKey)var2.n5;
      var2.n5 = (TKey)var3;
      Object var4 = this.l6;
      this.l6 = (TValue)var2.l6;
      var2.l6 = (TValue)var4;
   }

   public KeyValuePair<TKey, TValue> n5() {
      return new KeyValuePair<>(this.n5, this.l6);
   }

   public DictionaryEntry l6() {
      return new DictionaryEntry(this.n5, this.l6);
   }
}
