package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.u3;

class Queue$SyncQueue extends Queue {
   private final Queue n5;

   Queue$SyncQueue(Queue queue) {
      this.n5 = queue;
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
   public void copyTo(u3 array, int index) {
      synchronized (this.n5) {
         this.n5.copyTo(array, index);
      }
   }

   @Override
   public IEnumerator iterator() {
      synchronized (this.n5) {
         return this.n5.iterator();
      }
   }

   @Override
   public Object deepClone() {
      synchronized (this.n5) {
         return new Queue$SyncQueue((Queue)this.n5.deepClone());
      }
   }

   @Override
   public void clear() {
      synchronized (this.n5) {
         this.n5.clear();
      }
   }

   @Override
   public void trimToSize() {
      synchronized (this.n5) {
         this.n5.trimToSize();
      }
   }

   @Override
   public boolean contains(Object obj) {
      synchronized (this.n5) {
         return this.n5.contains(obj);
      }
   }

   @Override
   public Object dequeue() {
      synchronized (this.n5) {
         return this.n5.dequeue();
      }
   }

   @Override
   public void enqueue(Object obj) {
      synchronized (this.n5) {
         this.n5.enqueue(obj);
      }
   }

   @Override
   public Object peek() {
      synchronized (this.n5) {
         return this.n5.peek();
      }
   }

   @Override
   public <T> T[] toArray(T[] a) {
      synchronized (this.n5) {
         return (T[])this.n5.toArray(a);
      }
   }
}
