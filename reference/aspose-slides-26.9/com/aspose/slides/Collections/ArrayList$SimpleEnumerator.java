package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.v4;

final class ArrayList$SimpleEnumerator implements IEnumerator, v4, Cloneable {
   private ArrayList l6;
   private Object k5;
   private int u3;
   private int a6;
   static Object n5 = new Object();

   private ArrayList$SimpleEnumerator() {
   }

   public ArrayList$SimpleEnumerator(ArrayList list) {
      this.l6 = list;
      this.u3 = -1;
      this.a6 = list.getVersion();
      this.k5 = n5;
   }

   @Override
   public Object deepClone() {
      return this.n5();
   }

   @Override
   public boolean hasNext() {
      if (this.a6 != this.l6.getVersion()) {
         throw new IllegalStateException("List has changed.");
      } else if (++this.u3 < this.l6.size()) {
         this.k5 = this.l6.get_Item(this.u3);
         return true;
      } else {
         this.k5 = n5;
         return false;
      }
   }

   @Override
   public Object next() {
      if (this.k5 == n5) {
         if (this.u3 == -1) {
            throw new IllegalStateException("Enumerator not started");
         } else {
            throw new IllegalStateException("Enumerator ended");
         }
      } else {
         return this.k5;
      }
   }

   @Override
   public void reset() {
      if (this.a6 != this.l6.getVersion()) {
         throw new IllegalStateException("List has changed.");
      }

      this.k5 = n5;
      this.u3 = -1;
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
      ArrayList$SimpleEnumerator var1 = new ArrayList$SimpleEnumerator();
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      return var1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
