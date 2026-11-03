package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArrayTypeMismatchException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.w5;
import java.util.Arrays;

@j3
public class Stack<T> implements IGenericEnumerable<T>, ICollection<T> {
   private Object[] n5;
   private int l6;
   private int k5;

   public Stack() {
   }

   public Stack(int capacity) {
      if (capacity < 0) {
         throw new ArgumentOutOfRangeException("capacity");
      }

      this.n5 = new Object[capacity];
   }

   public Stack(IGenericEnumerable<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      for (Object var3 : collection) {
         this.push((T)var3);
      }
   }

   public Stack(IGenericCollection<T> collection) {
      if (collection == null) {
         throw new ArgumentNullException("collection");
      }

      if (collection != null) {
         this.l6 = collection.size();
         this.n5 = new Object[this.l6];
         collection.copyToTArray((T[])this.n5, 0);
      }
   }

   public void clear() {
      if (this.n5 != null) {
         u3.n5(this.n5, 0, this.n5.length);
      }

      this.l6 = 0;
      this.k5++;
   }

   public boolean contains(T item) {
      return this.n5 != null && u3.n5(this.n5, item, 0, this.l6) != -1;
   }

   public void copyToTArray(T[] array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (arrayIndex < 0) {
         throw new ArgumentOutOfRangeException("idx");
      }

      if (arrayIndex >= array.length) {
         throw new ArgumentOutOfRangeException("idx");
      }

      if (this.l6 - arrayIndex > array.length) {
         throw new ArgumentException("idx");
      }

      if (this.n5 != null) {
         u3.n5(this.n5, 0, array, arrayIndex, this.l6);
         w5.n5(array, arrayIndex, this.l6);
      }
   }

   public T peek() {
      if (this.l6 == 0) {
         throw new InvalidOperationException();
      } else {
         return (T)this.n5[this.l6 - 1];
      }
   }

   public T pop() {
      if (this.l6 == 0) {
         throw new InvalidOperationException();
      }

      this.k5++;
      Object var1 = this.n5[--this.l6];
      this.n5[this.l6] = null;
      return (T)var1;
   }

   public void push(T item) {
      if (this.n5 == null || this.l6 == this.n5.length) {
         if (this.n5 == null) {
            this.n5 = new Object[16];
         }

         this.n5 = Arrays.copyOf(this.n5, this.l6 == 0 ? 16 : 2 * this.l6);
      }

      this.k5++;
      this.n5[this.l6++] = item;
   }

   public <T> T[] toArray(T[] array) {
      if (array.length >= this.l6) {
         this.copyTo(u3.n5((Object)(array)), 0);
         return array;
      } else {
         u3 var2 = u3.n5(com.aspose.slides.internal.v6g.k5.n5(array.getClass().getComponentType()), this.l6);
         this.copyTo(var2, 0);
         return (T[])((Object[])u3.n5(var2));
      }
   }

   public void trimExcess() {
      if (this.n5 != null && this.l6 < this.n5.length * 0.9) {
         this.n5 = Arrays.copyOf(this.n5, this.l6);
      }

      this.k5++;
   }

   @Override
   public int size() {
      return this.l6;
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
   public void copyTo(u3 dest, int idx) {
      try {
         if (dest == null) {
            throw new ArgumentNullException();
         }

         if (this.n5 != null) {
            if (idx < 0) {
               throw new ArgumentOutOfRangeException("idx");
            }

            if (idx >= this.l6) {
               throw new ArgumentOutOfRangeException("idx");
            }

            if (this.l6 - idx > dest.a6()) {
               throw new ArgumentException("idx");
            }

            u3.n5(u3.n5((Object)(this.n5)), 0, dest, idx, this.l6);
            u3.l6(dest, idx, this.l6);
         }
      } catch (ArrayTypeMismatchException var4) {
         throw new ArgumentException();
      }
   }

   public Stack$Enumerator<T> iterator() {
      return new Stack$Enumerator<>(this);
   }

   // $VF: synthetic method
   static int n5(Stack var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int l6(Stack var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Object[] k5(Stack var0) {
      return var0.n5;
   }
}
