package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
final class ArrayList$ReadOnlyListWrapper extends ArrayList$FixedSizeListWrapper {
   @Override
   protected String n5() {
      return "List is read-only.";
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   public ArrayList$ReadOnlyListWrapper(IList innerList) {
      super(innerList);
   }

   @Override
   public Object get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      throw new NotSupportedException(this.n5());
   }
}
