package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
class ArrayList$FixedSizeListWrapper extends ArrayList$ListWrapper {
   protected String n5() {
      return "List is fixed-size.";
   }

   @Override
   public boolean isFixedSize() {
      return true;
   }

   public ArrayList$FixedSizeListWrapper(IList innerList) {
      super(innerList);
   }

   @Override
   public int addItem(Object value) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void clear() {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void insertItem(int index, Object value) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void removeItem(Object value) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void removeAt(int index) {
      throw new NotSupportedException(this.n5());
   }
}
