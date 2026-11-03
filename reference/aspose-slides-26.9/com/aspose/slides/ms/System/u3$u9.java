package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

class u3$u9 implements IEnumerator, u3$n5, Cloneable {
   private final u3 n5;
   private int l6;
   private int k5;
   private int u3;
   private boolean a6;
   private int[] u9;

   private u3$u9(u3$u9 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = (int[])var1.u9.clone();
   }

   u3$u9(u3 var1, int var2, int var3) {
      this.n5 = var1;
      this.u3 = var2;
      this.l6 = var2 + var3 - 1;
      this.u9 = new int[var1.u3()];
      this.reset();
   }

   private void l6() {
      if (this.k5 < this.u3) {
         throw new InvalidOperationException("Enumeration has not started");
      }

      if (this.a6) {
         throw new InvalidOperationException("Enumeration has already ended");
      }
   }

   @Override
   public Object next() {
      this.l6();
      return this.n5.n5(this.u9);
   }

   @Override
   public void n5(Object var1) {
      this.l6();
      this.n5.n5(var1, this.u9);
   }

   private void k5() {
      this.k5++;
      if (this.k5 > this.l6) {
         this.a6 = true;
      } else {
         int var1 = this.n5.u3();
         this.u9[var1 - 1]++;

         for (int var2 = var1 - 1; var2 >= 0; var2--) {
            if (this.u9[var2] > this.n5.u3(var2)) {
               if (var2 == 0) {
                  this.a6 = true;
                  this.u9[0] = this.n5.l6(0);
                  return;
               }

               for (int var3 = var2; var3 < var1; var3++) {
                  this.u9[var3] = this.n5.l6(var3);
               }

               this.u9[var2 - 1]++;
            }
         }
      }
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
      this.k5 = this.u3 - 1;
      int[] var1 = new int[]{this.u3};
      int var2 = 1;

      for (int var3 = 0; var3 < this.n5.u3(); var3++) {
         int var4 = this.n5.a6(var3);
         this.u9[var3] = q1.n5(var1[0], var4, var1);
         var2 *= var4;
      }

      int var6 = this.n5.a6(this.u9.length - 1);
      this.u9[this.u9.length - 1] = var1[0] - 1;
      var2 *= var6;
      this.a6 = var2 == 0 || this.u3 > this.l6;
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
      return new u3$u9(this);
   }

   @Override
   public void remove() {
      throw new NotSupportedException("Collection was of a fixed size.");
   }
}
