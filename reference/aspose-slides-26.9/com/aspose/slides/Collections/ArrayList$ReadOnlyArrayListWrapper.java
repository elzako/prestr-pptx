package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;
import java.util.Comparator;

@j3
final class ArrayList$ReadOnlyArrayListWrapper extends ArrayList$FixedSizeArrayListWrapper {
   @Override
   protected String n5() {
      return "Can't modify a readonly list.";
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   public ArrayList$ReadOnlyArrayListWrapper(ArrayList innerArrayList) {
      super(innerArrayList);
   }

   @Override
   public Object get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void reverse() {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void reverse(int index, int count) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void setRange(int index, ICollection c) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void sort() {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void sort(Comparator comparer) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void sort(int index, int count, Comparator comparer) {
      throw new NotSupportedException(this.n5());
   }
}
