package com.aspose.slides.Collections.Generic;

import com.aspose.slides.ms.System.j3;
import java.util.Comparator;

@j3
class SortedDictionary$NodeHelper<TKey> implements RBTree$INodeHelper<TKey> {
   public Comparator<TKey> n5;
   static SortedDictionary$NodeHelper l6 = new SortedDictionary$NodeHelper(Comparer.getDefault());

   @Override
   public int compare(TKey key, RBTree$Node node) {
      return this.n5.compare(key, (TKey)((SortedDictionary$Node)node).n5);
   }

   @Override
   public RBTree$Node createNode(TKey key) {
      return new SortedDictionary$Node(key);
   }

   private SortedDictionary$NodeHelper(Comparator<TKey> cmp) {
      this.n5 = cmp;
   }

   public static SortedDictionary$NodeHelper n5(Comparator var0) {
      return var0 != null && var0 != Comparer.getDefault() ? new SortedDictionary$NodeHelper(var0) : l6;
   }
}
