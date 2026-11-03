package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.u3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class Hashtable$ReadOnlyItemCollection implements Set {
   private u3 l6;
   // $VF: synthetic field
   final Hashtable n5;

   Hashtable$ReadOnlyItemCollection(Hashtable var1, u3 items) {
      this.n5 = var1;
      this.l6 = items;
   }

   @Override
   public int size() {
      return this.l6.size();
   }

   @Override
   public boolean isEmpty() {
      return this.l6.size() == 0;
   }

   @Override
   public boolean contains(Object o) {
      return this.l6.contains(o);
   }

   @Override
   public Iterator iterator() {
      return this.l6.iterator();
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.size()];
      u3 var2 = u3.n5((Object)(var1));
      this.l6.copyTo(var2, 0);
      return var1;
   }

   @Override
   public boolean add(Object o) {
      throw new NotSupportedException("Collection is read only");
   }

   @Override
   public boolean remove(Object o) {
      throw new NotSupportedException("Collection is read only");
   }

   @Override
   public boolean containsAll(Collection c) {
      for (Object var3 : c) {
         if (!this.contains(var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean addAll(Collection c) {
      throw new NotSupportedException("Collection is read only");
   }

   @Override
   public boolean retainAll(Collection c) {
      throw new NotSupportedException("Collection is read only");
   }

   @Override
   public boolean removeAll(Collection c) {
      throw new NotSupportedException("Collection is read only");
   }

   @Override
   public void clear() {
      throw new NotSupportedException("Collection is read only");
   }

   @Override
   public Object[] toArray(Object[] a) {
      if (a.length <= this.size()) {
         a = new Object[this.size()];
      }

      this.l6.copyTo(u3.n5((Object)(a)), 0);
      return a;
   }
}
