package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

class u3$c8 implements u3$n5 {
   private final u3 n5;
   private int l6;
   private int k5;
   private int u3;
   private boolean a6;

   private u3$c8(u3$c8 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
   }

   public u3$c8(u3 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var2 + var3 - 1;
      this.reset();
   }

   private void l6() {
      if (this.k5 < this.l6) {
         throw new InvalidOperationException("Enumeration has not started.");
      }

      if (this.a6) {
         throw new InvalidOperationException("Enumeration has already ended");
      }
   }

   @Override
   public Object next() {
      this.l6();
      return this.n5.n5(this.k5);
   }

   @Override
   public void n5(Object var1) {
      this.l6();
      this.n5.l6(var1, this.k5);
   }

   private void k5() {
      this.k5++;
      this.a6 = this.k5 > this.u3;
   }

   @Override
   public boolean hasNext() {
      if (this.a6) {
         return false;
      }

      this.k5();
      return !this.a6;
   }

   @Override
   public void reset() {
      this.k5 = this.l6 - 1;
      this.a6 = this.l6 > this.u3;
   }

   @Override
   public Object deepClone() {
      return this.n5();
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
      return new u3$c8(this);
   }

   @Override
   public void remove() {
      throw new NotSupportedException("Collection was of a fixed size.");
   }
}
