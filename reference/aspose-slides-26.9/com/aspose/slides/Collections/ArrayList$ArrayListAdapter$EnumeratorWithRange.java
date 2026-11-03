package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.v4;

final class ArrayList$ArrayListAdapter$EnumeratorWithRange implements IEnumerator, v4, Cloneable {
   private int n5;
   private int l6;
   private int k5;
   private IEnumerator u3;

   private ArrayList$ArrayListAdapter$EnumeratorWithRange() {
   }

   public ArrayList$ArrayListAdapter$EnumeratorWithRange(IEnumerator enumerator, int index, int count) {
      this.l6 = 0;
      this.n5 = index;
      this.k5 = count;
      this.u3 = enumerator;
      this.reset();
   }

   @Override
   public Object deepClone() {
      return this.n5();
   }

   @Override
   public Object next() {
      return this.u3.next();
   }

   @Override
   public boolean hasNext() {
      if (this.l6 >= this.k5) {
         return false;
      }

      this.l6++;
      return this.u3.hasNext();
   }

   @Override
   public void reset() {
      this.l6 = 0;
      this.u3.reset();

      for (int var1 = 0; var1 < this.n5; var1++) {
         this.u3.hasNext();
      }
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
      ArrayList$ArrayListAdapter$EnumeratorWithRange var1 = new ArrayList$ArrayListAdapter$EnumeratorWithRange();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      return var1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
