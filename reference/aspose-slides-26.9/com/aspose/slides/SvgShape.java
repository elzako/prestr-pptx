package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class SvgShape implements ISvgShape {
   private SortedList<Integer, String> n5 = new SortedList<>();
   private String l6;

   SvgShape() {
   }

   @Override
   public final void setEventHandler(int eventType, String handler) {
      if (handler != null) {
         this.n5.set_Item(eventType, handler);
      } else {
         this.n5.removeItemByKey(eventType);
      }
   }

   final IGenericDictionary<Integer, String> n5() {
      return this.n5;
   }

   final boolean l6() {
      return !com.aspose.slides.ms.System.d1.n5(this.l6) || this.n5.size() > 0;
   }

   @Override
   public final String getId() {
      return this.l6;
   }

   @Override
   public final void setId(String value) {
      if (com.aspose.slides.ms.System.d1.n5(value)) {
         throw new ArgumentNullException("value");
      }

      this.l6 = value;
   }
}
