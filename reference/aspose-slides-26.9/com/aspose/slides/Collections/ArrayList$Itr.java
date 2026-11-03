package com.aspose.slides.Collections;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ArrayList$Itr implements Iterator {
   int n5;
   int l6;
   // $VF: synthetic field
   final ArrayList k5;

   private ArrayList$Itr(ArrayList var1) {
      this.k5 = var1;
      this.l6 = -1;
   }

   @Override
   public boolean hasNext() {
      return this.n5 != this.k5.size();
   }

   @Override
   public Object next() {
      int var1 = this.n5;
      if (var1 >= this.k5.size()) {
         throw new NoSuchElementException();
      }

      Object[] var2 = ArrayList.n5(this.k5);
      if (var1 >= var2.length) {
         throw new ConcurrentModificationException();
      }

      this.n5 = var1 + 1;
      return var2[this.l6 = var1];
   }

   @Override
   public void remove() {
      if (this.l6 < 0) {
         throw new IllegalStateException();
      }

      try {
         this.k5.remove(this.l6);
         this.n5 = this.l6;
         this.l6 = -1;
      } catch (IndexOutOfBoundsException var2) {
         throw new ConcurrentModificationException();
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/Collections/ArrayList;Lcom/aspose/slides/Collections/ArrayList$1;)V -> (Lcom/aspose/slides/Collections/ArrayList;)V
   ArrayList$Itr(com.aspose.slides.Collections.ArrayList recoveredArg0, com.aspose.slides.Collections.ArrayList$1 recoveredArg1) {
      this(recoveredArg0);
   }
}
