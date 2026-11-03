package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;

public class x8 extends i0 implements IList {
   private ArrayList n5 = new ArrayList();

   @Override
   public l0 n5(int var1) {
      return (l0)this.n5.get_Item(var1);
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public final int addItem(Object value) {
      if (!com.aspose.slides.internal.v6g.k5.l6(value, l0.class)) {
         throw new ArgumentException("Type of input object is invalid.", "node");
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
      if (!com.aspose.slides.internal.v6g.k5.l6(value, l0.class)) {
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

   @Override
   public final boolean isFixedSize() {
      return this.n5.isFixedSize();
   }

   @Override
   public final boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   @Override
   public final Object get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final void set_Item(int index, Object value) {
      if (!com.aspose.slides.internal.v6g.k5.l6(value, l0.class)) {
         throw new ArgumentException("Type of input object is invalid.", "value");
      }

      this.n5.set_Item(index, value);
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public final boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   @Override
   public int n5() {
      return this.n5.size();
   }
}
