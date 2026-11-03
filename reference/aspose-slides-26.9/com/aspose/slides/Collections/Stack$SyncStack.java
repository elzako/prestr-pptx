package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
class Stack$SyncStack extends Stack {
   private final Stack n5;

   Stack$SyncStack(Stack s) {
      this.n5 = s;
   }

   @Override
   public int size() {
      synchronized (this.n5) {
         return this.n5.size();
      }
   }

   @Override
   public boolean isSynchronized() {
      return true;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public void clear() {
      synchronized (this.n5) {
         this.n5.clear();
      }
   }

   @Override
   public Object deepClone() {
      synchronized (this.n5) {
         return Stack.sync((Stack)this.n5.deepClone());
      }
   }

   @Override
   public boolean contains(Object obj) {
      synchronized (this.n5) {
         return this.n5.contains(obj);
      }
   }

   @Override
   public void copyTo(u3 array, int index) {
      synchronized (this.n5) {
         this.n5.copyTo(array, index);
      }
   }

   @Override
   public IEnumerator iterator() {
      synchronized (this.n5) {
         return new Stack$Enumerator(this.n5);
      }
   }

   @Override
   public Object peek() {
      synchronized (this.n5) {
         return this.n5.peek();
      }
   }

   @Override
   public Object pop() {
      synchronized (this.n5) {
         return this.n5.pop();
      }
   }

   @Override
   public void push(Object obj) {
      synchronized (this.n5) {
         this.n5.push(obj);
      }
   }

   @Override
   public <T> T[] toArray(T[] a) {
      synchronized (this.n5) {
         return (T[])this.n5.toArray(a);
      }
   }
}
