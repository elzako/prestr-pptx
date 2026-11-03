package com.aspose.slides.Collections;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class ArrayList$ListItr extends ArrayList$Itr implements ListIterator {
   // $VF: synthetic field
   final ArrayList u3;

   ArrayList$ListItr(ArrayList var1, int index) {
      super(var1, null);
      this.u3 = var1;
      this.n5 = index;
   }

   @Override
   public boolean hasPrevious() {
      return this.n5 != 0;
   }

   @Override
   public int nextIndex() {
      return this.n5;
   }

   @Override
   public int previousIndex() {
      return this.n5 - 1;
   }

   @Override
   public Object previous() {
      int var1 = this.n5 - 1;
      if (var1 < 0) {
         throw new NoSuchElementException();
      }

      Object[] var2 = ArrayList.n5(this.u3);
      if (var1 >= var2.length) {
         throw new ConcurrentModificationException();
      }

      this.n5 = var1;
      return var2[this.l6 = var1];
   }

   @Override
   public void set(Object e) {
      if (this.l6 < 0) {
         throw new IllegalStateException();
      }

      try {
         ArrayList.n5(this.u3)[this.l6] = e;
      } catch (IndexOutOfBoundsException var3) {
         throw new ConcurrentModificationException();
      }
   }

   @Override
   public void add(Object e) {
      try {
         int var2 = this.n5;
         this.u3.add(var2, e);
         this.n5 = var2 + 1;
         this.l6 = -1;
      } catch (IndexOutOfBoundsException var3) {
         throw new ConcurrentModificationException();
      }
   }
}
