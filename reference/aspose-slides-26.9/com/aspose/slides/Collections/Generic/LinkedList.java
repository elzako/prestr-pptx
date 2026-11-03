package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.h0;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public class LinkedList<T> implements IGenericCollection<T>, h0, s7 {
   private long l6;
   private long k5;
   private final Object u3 = new Object();
   LinkedListNode<T> n5;

   public LinkedList() {
   }

   public LinkedList(IGenericEnumerable<T> collection) {
      for (Object var3 : collection) {
         this.addLast((T)var3);
      }
   }

   protected LinkedList(c4 info, s3 context) {
      throw new NotSupportedException();
   }

   private void l6(LinkedListNode<T> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("node");
      }

      if (var1.getList() != this) {
         throw new InvalidOperationException();
      }
   }

   static void n5(LinkedListNode var0) {
      if (var0 == null) {
         throw new ArgumentNullException("newNode");
      }

      if (var0.getList() != null) {
         throw new InvalidOperationException();
      }
   }

   public LinkedListNode<T> addAfter(LinkedListNode<T> node, T value) {
      this.l6(node);
      LinkedListNode var3 = new LinkedListNode<>(this, value, node, node.n5);
      this.l6++;
      this.k5++;
      return var3;
   }

   public void addAfter(LinkedListNode<T> node, LinkedListNode<T> newNode) {
      this.l6(node);
      n5(newNode);
      newNode.n5(node, node.n5, this);
      this.l6++;
      this.k5++;
   }

   public LinkedListNode<T> addBefore(LinkedListNode<T> node, T value) {
      this.l6(node);
      LinkedListNode var3 = new LinkedListNode<>(this, value, node.l6, node);
      this.l6++;
      this.k5++;
      if (node == this.n5) {
         this.n5 = var3;
      }

      return var3;
   }

   public void addBefore(LinkedListNode<T> node, LinkedListNode<T> newNode) {
      this.l6(node);
      n5(newNode);
      newNode.n5(node.l6, node, this);
      this.l6++;
      this.k5++;
      if (node == this.n5) {
         this.n5 = newNode;
      }
   }

   public void addFirst(LinkedListNode<T> node) {
      n5(node);
      if (this.n5 == null) {
         node.n5(this);
      } else {
         node.n5(this.n5.l6, this.n5, this);
      }

      this.l6++;
      this.k5++;
      this.n5 = node;
   }

   public LinkedListNode<T> addFirst(T value) {
      LinkedListNode var2;
      if (this.n5 == null) {
         var2 = new LinkedListNode<>(this, value);
      } else {
         var2 = new LinkedListNode<>(this, value, this.n5.l6, this.n5);
      }

      this.l6++;
      this.k5++;
      this.n5 = var2;
      return var2;
   }

   public LinkedListNode<T> addLast(T value) {
      LinkedListNode var2;
      if (this.n5 == null) {
         var2 = new LinkedListNode<>(this, value);
         this.n5 = var2;
      } else {
         var2 = new LinkedListNode<>(this, value, this.n5.l6, this.n5);
      }

      this.l6++;
      this.k5++;
      return var2;
   }

   public void addLast(LinkedListNode<T> node) {
      n5(node);
      if (this.n5 == null) {
         node.n5(this);
         this.n5 = node;
      } else {
         node.n5(this.n5.l6, this.n5, this);
      }

      this.l6++;
      this.k5++;
   }

   @Override
   public void clear() {
      this.l6 = com.aspose.slides.internal.v6g.k5.a6(0, 9);
      this.n5 = null;
      this.k5++;
   }

   @Override
   public boolean containsItem(T value) {
      LinkedListNode var2 = this.n5;
      if (var2 == null) {
         return false;
      }

      while (!value.equals(com.aspose.slides.internal.v6g.k5.n5(var2.getValue()))) {
         var2 = var2.n5;
         if (var2 == this.n5) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void copyToTArray(T[] array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(index, 9), 10)
         < com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.u3.n5((Object)(array)).l6(0), 9), 10)) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (com.aspose.slides.ms.System.u3.n5((Object)(array)).u3() != 1) {
         throw new ArgumentException("array", "Array is multidimensional");
      }

      if (com.aspose.slides.ms.System.u3.n5((Object)(array)).a6() < com.aspose.slides.internal.v6g.k5.a6(this.l6, 10)) {
         throw new ArgumentException("number of items exceeds capacity");
      }

      if (com.aspose.slides.ms.System.u3.n5((Object)(array)).a6() - index + com.aspose.slides.ms.System.u3.n5((Object)(array)).l6(0)
         < com.aspose.slides.internal.v6g.k5.a6(this.l6, 10)) {
         throw new ArgumentOutOfRangeException("number of items exceeds capacity");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException();
      }

      LinkedListNode var3 = this.n5;
      if (this.n5 != null) {
         do {
            array[index] = (T)var3.getValue();
            index++;
            var3 = var3.n5;
         } while (var3 != this.n5);
      }
   }

   public LinkedListNode<T> find(T value) {
      LinkedListNode var2 = this.n5;
      if (var2 == null) {
         return null;
      }

      while ((value != null || var2.getValue() != null) && (value == null || !value.equals(com.aspose.slides.internal.v6g.k5.n5(var2.getValue())))) {
         var2 = var2.n5;
         if (var2 == this.n5) {
            return null;
         }
      }

      return var2;
   }

   public LinkedListNode<T> findLast(T value) {
      LinkedListNode var2 = this.n5;
      if (var2 == null) {
         return null;
      }

      do {
         var2 = var2.l6;
         if (value.equals(com.aspose.slides.internal.v6g.k5.n5(var2.getValue()))) {
            return var2;
         }
      } while (var2 != this.n5);

      return null;
   }

   public LinkedList$Enumerator iterator() {
      return new LinkedList$Enumerator<>(this);
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
      throw new NotSupportedException();
   }

   @Override
   public void onDeserialization(Object sender) {
      throw new NotSupportedException();
   }

   @Override
   public boolean removeItem(T value) {
      LinkedListNode var2 = this.find(value);
      if (var2 == null) {
         return false;
      }

      this.remove(var2);
      return true;
   }

   public void remove(LinkedListNode<T> node) {
      this.l6(node);
      this.l6--;
      if (com.aspose.slides.internal.v6g.k5.a6(this.l6, 10) == 0L) {
         this.n5 = null;
      }

      if (node == this.n5) {
         this.n5 = this.n5.n5;
      }

      this.k5++;
      node.n5();
   }

   public void removeFirst() {
      if (this.n5 != null) {
         this.remove(this.n5);
      }
   }

   public void removeLast() {
      if (this.n5 != null) {
         this.remove(this.n5.l6);
      }
   }

   @Override
   public void addItem(T value) {
      this.addLast(value);
   }

   public void copyTo(u3 array, int index) {
      Object[] var3 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(array), Object[].class);
      if (var3 == null) {
         throw new ArgumentException("array");
      }

      this.copyToTArray((T[])var3, index);
   }

   @Override
   public int size() {
      return com.aspose.slides.internal.v6g.k5.u3(this.l6, 10);
   }

   public LinkedListNode<T> getFirst() {
      return this.n5;
   }

   public LinkedListNode<T> getLast() {
      return this.n5 != null ? this.n5.l6 : null;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   public boolean isSynchronized() {
      return false;
   }

   public Object getSyncRoot() {
      return this;
   }

   // $VF: synthetic method
   static long n5(LinkedList var0) {
      return var0.k5;
   }
}
