package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class Queue$Enumerator<T> extends h0<Queue$Enumerator> implements IGenericEnumerator<T>, IDisposable {
   private Queue<T> l6;
   private int k5;
   private int u3;
   // $VF: synthetic field
   static final boolean n5 = !Queue.class.desiredAssertionStatus();

   public Queue$Enumerator() {
   }

   Queue$Enumerator(Queue<T> q) {
      this.l6 = q;
      this.k5 = -2;
      this.u3 = Queue.n5(q);
   }

   @Override
   public void dispose() {
      this.k5 = -2;
   }

   @Override
   public boolean hasNext() {
      if (this.u3 != Queue.n5(this.l6)) {
         throw new InvalidOperationException();
      }

      if (this.k5 == -2) {
         this.k5 = Queue.l6(this.l6);
      }

      return this.k5 != -1 && --this.k5 != -1;
   }

   @Override
   public T next() {
      if (this.k5 < 0) {
         throw new InvalidOperationException();
      } else {
         return (T)Queue.k5(this.l6)[(Queue.l6(this.l6) - 1 - this.k5 + Queue.u3(this.l6)) % Queue.k5(this.l6).length];
      }
   }

   @Override
   public void reset() {
      if (this.u3 != Queue.n5(this.l6)) {
         throw new InvalidOperationException();
      }

      this.k5 = -2;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   public void CloneTo(Queue$Enumerator that) {
      that.l6 = this.l6;
      that.k5 = this.k5;
      that.u3 = this.u3;
   }

   public Queue$Enumerator Clone() {
      Queue$Enumerator var1 = new Queue$Enumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(Queue$Enumerator var1) {
      return j8.n5(var1.l6, this.l6) && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof Queue$Enumerator) ? false : this.n5((Queue$Enumerator)obj);
      }
   }

   public static boolean equals(Queue$Enumerator obj1, Queue$Enumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      var1 = 31 * var1 + this.k5;
      return 31 * var1 + this.u3;
   }
}
