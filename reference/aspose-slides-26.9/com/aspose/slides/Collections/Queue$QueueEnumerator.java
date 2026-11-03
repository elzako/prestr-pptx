package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.v4;

@j3
class Queue$QueueEnumerator implements IEnumerator, v4 {
   private Queue n5;
   private int l6;
   private int k5;

   Queue$QueueEnumerator(Queue q) {
      this.n5 = q;
      this.l6 = Queue.n5(q);
      this.k5 = -1;
   }

   @Override
   public Object deepClone() {
      Queue$QueueEnumerator var1 = new Queue$QueueEnumerator(this.n5);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      return var1;
   }

   @Override
   public Object next() {
      if (this.l6 == Queue.n5(this.n5) && this.k5 >= 0 && this.k5 < Queue.l6(this.n5)) {
         return Queue.k5(this.n5)[(Queue.u3(this.n5) + this.k5) % Queue.k5(this.n5).length];
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public boolean hasNext() {
      if (this.l6 != Queue.n5(this.n5)) {
         throw new InvalidOperationException();
      } else if (this.k5 >= Queue.l6(this.n5) - 1) {
         this.k5 = Integer.MAX_VALUE;
         return false;
      } else {
         this.k5++;
         return true;
      }
   }

   @Override
   public void remove() {
      throw new NotImplementedException();
   }

   @Override
   public void reset() {
      if (this.l6 != Queue.n5(this.n5)) {
         throw new InvalidOperationException();
      }

      this.k5 = -1;
   }
}
