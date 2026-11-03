package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArrayTypeMismatchException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.u3;
import java.util.Arrays;

@j3
public class Queue<T> implements IGenericEnumerable<T>, ICollection<T> {
   private Object[] n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private final Object u9;

   public Queue() {
      this.n5 = new Object[0];
      this.u9 = this;
   }

   public Queue(int capacity) {
      if (capacity < 0) {
         throw new ArgumentOutOfRangeException("capacity");
      }

      this.n5 = new Object[capacity];
      this.u9 = this;
   }

   public Queue(IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      IGenericCollection var2 = collection instanceof IGenericCollection ? (IGenericCollection)collection : null;
      int var3 = var2 != null ? var2.size() : 0;
      this.n5 = new Object[var3];

      for (Object var5 : collection) {
         this.enqueue((T)var5);
      }

      this.u9 = this;
   }

   public void clear() {
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.n5.length);
      this.l6 = this.k5 = this.u3 = 0;
      this.a6++;
   }

   public boolean contains(T item) {
      if (item == null) {
         for (Object var3 : this) {
            if (var3 == null) {
               return true;
            }
         }
      } else {
         for (Object var5 : this) {
            if (item.equals(var5)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException();
      }

      if ((arrayIndex & 4294967295L) > (array.a6() & 4294967295L)) {
         throw new ArgumentOutOfRangeException();
      }

      if (array.a6() - arrayIndex < this.u3) {
         throw new ArgumentException();
      }

      if (this.u3 != 0) {
         try {
            int var3 = this.n5.length;
            int var4 = var3 - this.l6;
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, array, arrayIndex, q1.l6(this.u3, var4));
            if (this.u3 > var4) {
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, array, arrayIndex + var4, this.u3 - var4);
            }
         } catch (ArrayTypeMismatchException var5) {
            throw new ArgumentException();
         }
      }
   }

   public T dequeue() {
      Object var1 = this.peek();
      this.n5[this.l6] = null;
      if (++this.l6 == this.n5.length) {
         this.l6 = 0;
      }

      this.u3--;
      this.a6++;
      return (T)var1;
   }

   public T peek() {
      if (this.u3 == 0) {
         throw new InvalidOperationException();
      } else {
         return (T)this.n5[this.l6];
      }
   }

   public void enqueue(T item) {
      if (this.u3 == this.n5.length || this.k5 == this.n5.length) {
         this.n5(q1.n5(q1.n5(this.u3, this.k5) * 2, 4));
      }

      this.n5[this.k5] = item;
      if (++this.k5 == this.n5.length) {
         this.k5 = 0;
      }

      this.u3++;
      this.a6++;
   }

   public T[] toArray(T[] a) {
      if (a.length < this.u3) {
         return (T[])Arrays.copyOf(this.n5, this.u3, (Class<? extends T[]>)a.getClass());
      }

      System.arraycopy(this.n5, 0, a, 0, this.u3);
      if (a.length > this.u3) {
         a[this.u3] = null;
      }

      return a;
   }

   public void trimExcess() {
      if (this.u3 < this.n5.length * 0.9) {
         this.n5(this.u3);
      }
   }

   private void n5(int var1) {
      if (var1 != this.n5.length) {
         if (var1 < this.u3) {
            throw new InvalidOperationException("shouldnt happen");
         }

         Object[] var2 = new Object[var1];
         if (this.u3 > 0) {
            this.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0);
         }

         this.n5 = var2;
         this.k5 = this.u3;
         this.l6 = 0;
         this.a6++;
      }
   }

   @Override
   public int size() {
      return this.u3;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.u9;
   }

   public Queue$Enumerator iterator() {
      return new Queue$Enumerator<>(this);
   }

   // $VF: synthetic method
   static int n5(Queue var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int l6(Queue var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static Object[] k5(Queue var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static int u3(Queue var0) {
      return var0.l6;
   }
}
