package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.v4;

class Stack$Enumerator implements IEnumerator, v4, Cloneable {
   private Stack n5;
   private int l6;
   private int k5;

   Stack$Enumerator(Stack s) {
      this.n5 = s;
      this.l6 = Stack.n5(s);
      this.k5 = -2;
   }

   private Stack$Enumerator() {
   }

   @Override
   public Object deepClone() {
      return this.n5();
   }

   @Override
   public Object next() {
      if (this.l6 == Stack.n5(this.n5) && this.k5 != -2 && this.k5 != -1 && this.k5 <= Stack.l6(this.n5)) {
         return Stack.k5(this.n5)[this.k5];
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public boolean hasNext() {
      if (this.l6 != Stack.n5(this.n5)) {
         throw new InvalidOperationException();
      }

      switch (this.k5) {
         case -2:
            this.k5 = Stack.u3(this.n5);
            return this.k5 != -1;
         case -1:
            return false;
         default:
            this.k5--;
            return this.k5 != -1;
      }
   }

   @Override
   public void remove() {
      throw new NotImplementedException();
   }

   @Override
   public void reset() {
      if (this.l6 != Stack.n5(this.n5)) {
         throw new InvalidOperationException();
      }

      this.k5 = -2;
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
      Stack$Enumerator var1 = new Stack$Enumerator();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      return var1;
   }
}
