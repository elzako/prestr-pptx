package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.v4;
import com.aspose.slides.ms.System.w5;
import java.util.Arrays;

@j3
public class Stack implements ICollection, IEnumerable, v4 {
   private Object[] n5;
   private int l6 = -1;
   private int k5;
   private int u3;
   private int a6;

   private void n5(int var1) {
      var1 = Math.max(var1, 16);
      Object[] var2 = new Object[var1];
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, var2, 0, this.k5);
      this.u3 = var1;
      this.n5 = var2;
   }

   public Stack() {
      this.n5 = new Object[16];
      this.u3 = 16;
   }

   public Stack(ICollection col) {
      this(col == null ? 16 : col.size());
      if (col == null) {
         throw new ArgumentNullException("col");
      }

      for (Object var3 : col) {
         this.push(var3);
      }
   }

   public Stack(int initialCapacity) {
      if (initialCapacity < 0) {
         throw new ArgumentOutOfRangeException("initialCapacity");
      }

      this.u3 = initialCapacity;
      this.n5 = new Object[this.u3];
   }

   public static Stack sync(Stack stack) {
      if (stack == null) {
         throw new ArgumentNullException("stack");
      } else {
         return new Stack$SyncStack(stack);
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

   public void clear() {
      this.a6++;

      for (int var1 = 0; var1 < this.k5; var1++) {
         this.n5[var1] = null;
      }

      this.k5 = 0;
      this.l6 = -1;
   }

   @Override
   public Object deepClone() {
      Stack var1 = new Stack(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)));
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      return var1;
   }

   public boolean contains(Object obj) {
      if (this.k5 == 0) {
         return false;
      }

      if (obj == null) {
         for (int var2 = 0; var2 < this.k5; var2++) {
            if (this.n5[var2] == null) {
               return true;
            }
         }
      } else {
         for (int var3 = 0; var3 < this.k5; var3++) {
            if (obj.equals(this.n5[var3])) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (array.u3() <= 1 && (array.a6() <= 0 || index < array.a6()) && this.k5 <= array.a6() - index) {
         for (int var3 = this.l6; var3 != -1; var3--) {
            array.k5(this.n5[var3], this.k5 - (var3 + 1) + index);
         }
      } else {
         throw new ArgumentException();
      }
   }

   @Override
   public IEnumerator iterator() {
      return new Stack$Enumerator(this);
   }

   public Object peek() {
      if (this.l6 == -1) {
         throw new InvalidOperationException();
      } else {
         return this.n5[this.l6];
      }
   }

   public Object pop() {
      if (this.l6 == -1) {
         throw new InvalidOperationException();
      }

      this.a6++;
      Object var1 = this.n5[this.l6];
      this.n5[this.l6] = null;
      this.k5--;
      this.l6--;
      if (this.k5 <= this.u3 / 4 && this.k5 > 16) {
         this.n5(this.u3 / 2);
      }

      return var1;
   }

   public void push(Object obj) {
      this.a6++;
      if (this.u3 == this.k5) {
         this.n5(this.u3 * 2);
      }

      this.k5++;
      this.l6++;
      this.n5[this.l6] = obj;
   }

   public <T> T[] toArray(T[] a) {
      if (a.length < this.k5) {
         a = (T[])Arrays.copyOf(this.n5, this.k5, (Class<? extends T[]>)a.getClass());
         w5.n5(a);
         return a;
      }

      System.arraycopy(this.n5, 0, a, 0, this.k5);
      if (a.length > this.k5) {
         a[this.k5] = null;
      }

      w5.n5(a);
      return a;
   }

   // $VF: synthetic method
   static int n5(Stack var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int l6(Stack var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static Object[] k5(Stack var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static int u3(Stack var0) {
      return var0.l6;
   }
}
