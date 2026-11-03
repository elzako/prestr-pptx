package com.aspose.slides.Collections.Generic;

public class LinkedListNode<T> {
   private T k5;
   private LinkedList<T> u3;
   LinkedListNode<T> n5;
   LinkedListNode<T> l6;

   public LinkedListNode(T value) {
      this.k5 = value;
   }

   LinkedListNode(LinkedList<T> list, T value) {
      this.u3 = list;
      this.k5 = value;
      LinkedListNode var3 = this;
      this.n5 = var3;
      this.l6 = var3;
   }

   LinkedListNode(LinkedList<T> list, T value, LinkedListNode<T> previousNode, LinkedListNode<T> nextNode) {
      this.u3 = list;
      this.k5 = value;
      this.l6 = previousNode;
      this.n5 = nextNode;
      previousNode.n5 = this;
      nextNode.l6 = this;
   }

   void n5() {
      this.l6.n5 = this.n5;
      this.n5.l6 = this.l6;
      this.l6 = null;
      this.n5 = null;
      this.u3 = null;
   }

   void n5(LinkedList<T> var1) {
      this.n5 = this;
      this.l6 = this;
      this.u3 = var1;
   }

   void n5(LinkedListNode<T> var1, LinkedListNode<T> var2, LinkedList<T> var3) {
      var1.n5 = this;
      var2.l6 = this;
      this.n5 = var2;
      this.l6 = var1;
      this.u3 = var3;
   }

   public LinkedList<T> getList() {
      return this.u3;
   }

   public LinkedListNode<T> getNext() {
      return this.u3 != null && this.n5 != this.u3.n5 ? this.n5 : null;
   }

   public LinkedListNode<T> getPrevious() {
      return this.u3 != null && this != this.u3.n5 ? this.l6 : null;
   }

   public T getValue() {
      return this.k5;
   }

   public void setValue(T value) {
      this.k5 = value;
   }
}
