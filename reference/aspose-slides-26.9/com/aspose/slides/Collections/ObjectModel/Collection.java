package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;

@j3
public class Collection<T> implements IGenericList<T> {
   private IGenericList<T> n5;
   private Object l6;
   private final Object k5 = new Object();

   public Collection() {
      List var1 = new List();
      this.l6 = var1.getSyncRoot();
      this.n5 = var1;
   }

   public Collection(IGenericList<T> list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      }

      this.n5 = list;
   }

   @Override
   public void addItem(T item) {
      int var2 = this.n5.size();
      this.insertItem(var2, item);
   }

   @Override
   public void clear() {
      this.n5.clear();
   }

   @Override
   public boolean containsItem(T item) {
      return this.n5.containsItem(item);
   }

   @Override
   public void copyToTArray(T[] array, int arrayIndex) {
      this.n5.copyToTArray(array, arrayIndex);
   }

   @Override
   public IGenericEnumerator<T> iterator() {
      return this.n5.iterator();
   }

   protected IGenericList<T> get_Items() {
      return this.n5;
   }

   @Override
   public boolean removeItem(T item) {
      int var2 = this.indexOfItem(item);
      if (var2 == -1) {
         return false;
      }

      this.removeAt(var2);
      return true;
   }

   @Override
   public int indexOfItem(T item) {
      return this.n5.indexOfItem(item);
   }

   @Override
   public void insertItem(int index, T item) {
      this.n5.insertItem(index, item);
   }

   @Override
   public void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public T get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, T value) {
      this.setItem(index, value);
   }

   protected void setItem(int index, T value) {
      this.n5.set_Item(index, value);
   }

   @Override
   public boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   public Object getSyncRoot() {
      return this.n5();
   }

   private Object n5() {
      if (this.l6 == null) {
         ICollection var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ICollection.class);
         if (var1 != null) {
            this.l6 = var1.getSyncRoot();
         } else {
            synchronized (this.k5) {
               if (this.l6 == null) {
                  this.l6 = new Object();
               }
            }
         }
      }

      return this.l6;
   }

   public ICollection getICollection() {
      return new Collection$1(this);
   }

   public IList getIList() {
      return new Collection$2(this);
   }

   // $VF: synthetic method
   static IGenericList n5(Collection var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static Object l6(Collection var0) {
      return var0.n5();
   }
}
