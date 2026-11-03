package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

abstract class p9<TDomObject> {
   protected final TDomObject n5;

   protected p9(TDomObject var1) {
      if (var1 == null) {
         throw new ArgumentNullException("parent");
      }

      this.n5 = (TDomObject)var1;
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   public final void n5(IBaseSlide var1, w6a var2) {
   }
}
