package com.aspose.slides;

abstract class g8<TLocalData, TEffectiveData extends g8<TLocalData, TEffectiveData>> implements i7b {
   abstract void n5(i7b var1, TLocalData var2);

   void n5(IBaseSlide var1, w6a var2) {
   }

   void n5(IBaseSlide var1) {
   }

   @Override
   public final int hashCode() {
      return 23454;
   }

   @Override
   public final boolean equals(Object obj) {
      g8 var2;
      try {
         var2 = (g8)obj;
      } catch (ClassCastException var4) {
         com.aspose.slides.internal.n8e.v4.n5(var4);
         var2 = null;
      }

      return var2 == null ? false : this.n5((TEffectiveData)var2);
   }

   abstract boolean n5(g8<TLocalData, TEffectiveData> var1);
}
