package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
class ArrayList$FixedSizeArrayListWrapper extends ArrayList$ArrayListWrapper {
   public ArrayList$FixedSizeArrayListWrapper(ArrayList innerList) {
      super(innerList);
   }

   protected String n5() {
      return "Can't add or remove from a fixed-size list.";
   }

   @Override
   public int getCapacity() {
      return super.getCapacity();
   }

   @Override
   public void setCapacity(int value) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public boolean isFixedSize() {
      return true;
   }

   @Override
   public int addItem(Object value) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void addRange(ICollection c) {
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
   public void insertRange(int index, ICollection c) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void insertRange(int index, Object[] c) {
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

   @Override
   public void removeRange(int index, int count) {
      throw new NotSupportedException(this.n5());
   }

   @Override
   public void trimToSize() {
      throw new NotSupportedException(this.n5());
   }
}
