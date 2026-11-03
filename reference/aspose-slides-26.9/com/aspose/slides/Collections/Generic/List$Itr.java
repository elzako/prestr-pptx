package com.aspose.slides.Collections.Generic;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class List$Itr<T> implements Iterator<T> {
   int n5;
   int l6;
   // $VF: synthetic field
   final List k5;

   private List$Itr(List var1) {
      this.k5 = var1;
      this.l6 = -1;
   }

   @Override
   public boolean hasNext() {
      return this.n5 != List.n5(this.k5);
   }

   @Override
   public T next() {
      int var1 = this.n5;
      if (var1 >= List.n5(this.k5)) {
         throw new NoSuchElementException();
      }

      Object[] var2 = List.l6(this.k5);
      if (var1 >= var2.length) {
         throw new ConcurrentModificationException();
      }

      this.n5 = var1 + 1;
      return (T)var2[this.l6 = var1];
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

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/Collections/Generic/List;Lcom/aspose/slides/Collections/Generic/List$1;)V -> (Lcom/aspose/slides/Collections/Generic/List;)V
   List$Itr(com.aspose.slides.Collections.Generic.List recoveredArg0, com.aspose.slides.Collections.Generic.List$1 recoveredArg1) {
      this(recoveredArg0);
   }
}
