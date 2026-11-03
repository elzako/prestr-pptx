package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.v4;

final class ArrayList$ArrayListEnumerator implements IEnumerator, v4, Cloneable {
   private Object n5;
   private ArrayList l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;

   private ArrayList$ArrayListEnumerator() {
   }

   @Override
   public Object deepClone() {
      return this.n5();
   }

   public ArrayList$ArrayListEnumerator(ArrayList list, int index, int count) {
      this.l6 = list;
      this.u3 = index;
      this.a6 = count;
      this.k5 = this.u3 - 1;
      this.n5 = null;
      this.u9 = list.getVersion();
   }

   @Override
   public Object next() {
      if (this.k5 == this.u3 - 1) {
         throw new IllegalStateException("Enumerator unusable (Reset pending, or past end of array.");
      } else {
         return this.n5;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.l6.getVersion() != this.u9) {
         throw new IllegalStateException("List has changed.");
      } else {
         this.k5++;
         if (this.k5 - this.u3 < this.a6) {
            this.n5 = this.l6.get_Item(this.k5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void reset() {
      this.n5 = null;
      this.k5 = this.u3 - 1;
   }

   protected Object n5() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      ArrayList$ArrayListEnumerator var1 = new ArrayList$ArrayListEnumerator();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      return var1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
