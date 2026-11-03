package com.aspose.slides.Collections.Generic;

class Dictionary$1<TKey, TValue> implements Dictionary$Transform<TKey, TValue, KeyValuePair<TKey, TValue>> {
   // $VF: synthetic field
   final Dictionary n5;

   Dictionary$1(Dictionary this$0) {
      this.n5 = this$0;
   }

   public KeyValuePair<TKey, TValue> n5(TKey var1, TValue var2) {
      return Dictionary.n5(var1, var2);
   }

   // $VF: synthetic method
   @Override
   public KeyValuePair<TKey, TValue> l6(TKey var1, TValue var2) {
      return this.n5(var1, var2);
   }
}
