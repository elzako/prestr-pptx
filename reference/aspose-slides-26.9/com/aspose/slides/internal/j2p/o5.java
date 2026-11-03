package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class o5 implements IList {
   private ArrayList n5 = new ArrayList();

   @Override
   public final IEnumerator iterator() {
      return this.n5.iterator();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final int addItem(Object value) {
      if (value == null) {
         throw new ArgumentNullException("value");
      } else if (!com.aspose.slides.internal.v6g.k5.l6(value, j5.class) && !com.aspose.slides.internal.v6g.k5.l6(value, a5.class)) {
         throw new ArgumentException("Type of input object is invalid.", "value");
      } else {
         return this.n5.addItem(value);
      }
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   @Override
   public final boolean contains(Object value) {
      return this.n5.contains(value);
   }

   @Override
   public final int indexOf(Object value) {
      return this.n5.indexOf(value);
   }

   @Override
   public final void insertItem(int index, Object value) {
      if (value == null) {
         throw new ArgumentNullException("value");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(value, j5.class) && !com.aspose.slides.internal.v6g.k5.l6(value, a5.class)) {
         throw new ArgumentException("Type of input object is invalid.", "value");
      }

      this.n5.insertItem(index, value);
   }

   @Override
   public final void removeItem(Object value) {
      this.n5.removeItem(value);
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   public final c4 n5(int var1) {
      return (c4)this.n5.get_Item(var1);
   }

   public final c4 l6(int var1) {
      return this.n5(var1);
   }

   @Override
   public final Object get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final void set_Item(int index, Object value) {
      if (value == null) {
         throw new ArgumentNullException("value");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(value, j5.class) && !com.aspose.slides.internal.v6g.k5.l6(value, a5.class)) {
         throw new ArgumentException("Type of input object is invalid.", "value");
      }

      this.n5.set_Item(index, value);
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isFixedSize() {
      return this.n5.isFixedSize();
   }

   @Override
   public final boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   @Override
   public final Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public final boolean isSynchronized() {
      return this.n5.isSynchronized();
   }
}
