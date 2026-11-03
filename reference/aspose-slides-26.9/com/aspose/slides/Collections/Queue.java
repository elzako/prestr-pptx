package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.v4;
import java.util.Arrays;

@j3
public class Queue implements ICollection, IEnumerable, v4 {
   private Object[] n5;
   private int l6 = 0;
   private int k5 = 0;
   private int u3 = 0;
   private int a6;
   private int u9 = 0;

   public Queue() {
      this(32, 2.0F);
   }

   public Queue(int capacity) {
      this(capacity, 2.0F);
   }

   public Queue(ICollection col) {
      this(col == null ? 32 : col.size());
      if (col == null) {
         throw new ArgumentNullException("col");
      }

      for (Object var3 : col) {
         this.enqueue(var3);
      }
   }

   public Queue(int capacity, float growFactor) {
      if (capacity < 0) {
         throw new ArgumentOutOfRangeException("capacity", "Needs a non-negative number");
      }

      if (growFactor >= 1.0F && growFactor <= 10.0F) {
         this.n5 = new Object[capacity];
         this.a6 = (int)(growFactor * 100.0F);
      } else {
         throw new ArgumentOutOfRangeException("growFactor", "Queue growth factor must be between 1.0 and 10.0, inclusive");
      }
   }

   @Override
   public int size() {
      return this.k5;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (array.u3() <= 1 && (index == 0 || index < array.a6()) && this.k5 <= array.a6() - index) {
         int var3 = this.n5.length;
         int var4 = var3 - this.l6;
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, array, index, Math.min(this.k5, var4));
         if (this.k5 > var4) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, array, index + var4, this.k5 - var4);
         }
      } else {
         throw new ArgumentException();
      }
   }

   @Override
   public IEnumerator iterator() {
      return new Queue$QueueEnumerator(this);
   }

   @Override
   public Object deepClone() {
      Queue var1 = new Queue(this.n5.length);
      var1.a6 = this.a6;
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, var1.n5, 0, this.n5.length);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      return var1;
   }

   public void clear() {
      this.u9++;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;

      for (int var1 = this.n5.length - 1; var1 >= 0; var1--) {
         this.n5[var1] = null;
      }
   }

   public boolean contains(Object obj) {
      int var2 = this.l6 + this.k5;
      if (obj == null) {
         for (int var3 = this.l6; var3 < var2; var3++) {
            if (this.n5[var3 % this.n5.length] == null) {
               return true;
            }
         }
      } else {
         for (int var4 = this.l6; var4 < var2; var4++) {
            if (obj.equals(this.n5[var4 % this.n5.length])) {
               return true;
            }
         }
      }

      return false;
   }

   public Object dequeue() {
      this.u9++;
      if (this.k5 < 1) {
         throw new InvalidOperationException();
      }

      Object var1 = this.n5[this.l6];
      this.n5[this.l6] = null;
      this.l6 = (this.l6 + 1) % this.n5.length;
      this.k5--;
      return var1;
   }

   public void enqueue(Object obj) {
      this.u9++;
      if (this.k5 == this.n5.length) {
         this.n5();
      }

      this.n5[this.u3] = obj;
      this.u3 = (this.u3 + 1) % this.n5.length;
      this.k5++;
   }

   public Object peek() {
      if (this.k5 < 1) {
         throw new InvalidOperationException();
      } else {
         return this.n5[this.l6];
      }
   }

   public static Queue sync(Queue queue) {
      if (queue == null) {
         throw new ArgumentNullException("queue");
      } else {
         return new Queue$SyncQueue(queue);
      }
   }

   public <T> T[] toArray(T[] a) {
      if (a.length < this.k5) {
         return (T[])Arrays.copyOf(this.n5, this.k5, (Class<? extends T[]>)a.getClass());
      }

      System.arraycopy(this.n5, 0, a, 0, this.k5);
      if (a.length > this.k5) {
         a[this.k5] = null;
      }

      return a;
   }

   public void trimToSize() {
      this.u9++;
      Object[] var1 = new Object[this.k5];
      this.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0);
      this.n5 = var1;
      this.l6 = 0;
      this.u3 = 0;
   }

   private void n5() {
      int var1 = this.n5.length * this.a6 / 100;
      if (var1 < this.n5.length + 1) {
         var1 = this.n5.length + 1;
      }

      Object[] var2 = new Object[var1];
      this.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0);
      this.n5 = var2;
      this.l6 = 0;
      this.u3 = this.l6 + this.k5;
   }

   // $VF: synthetic method
   static int n5(Queue var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static int l6(Queue var0) {
      return var0.k5;
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
