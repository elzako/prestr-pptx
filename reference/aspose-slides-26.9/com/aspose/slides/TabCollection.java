package com.aspose.slides;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public final class TabCollection implements ITabCollection, r0g {
   SortedList<Double, ITab> n5;
   private r0g k5;
   long l6;

   TabCollection(r0g parentImmediate) {
      this.k5 = parentImmediate;
      this.n5 = new SortedList<>();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final ITab get_Item(int index) {
      return this.n5.getValues().get_Item(index);
   }

   @Override
   public final ITab add(double position, int align) {
      Tab var4 = new Tab(position, align);
      this.add(var4);
      return var4;
   }

   @Override
   public final int add(ITab value) {
      if (((r0g)value).getParent_Immediate() != null) {
         throw new PptxEditException("Can't add already used tab");
      }

      ((Tab)value).n5(this);
      if (this.n5.containsKey(value.getPosition())) {
         if (((Tab)this.n5.get_Item(value.getPosition())).getAlignment() == 0) {
            this.n5.set_Item(value.getPosition(), value);
         }
      } else {
         this.n5.set_Item(value.getPosition(), value);
      }

      this.n5();
      return this.n5.indexOfKey(value.getPosition());
   }

   @Override
   public final void clear() {
      IGenericEnumerator var1 = this.n5.getValues().iterator();

      try {
         while (var1.hasNext()) {
            Tab var2 = (Tab)var1.next();
            var2.n5((com.aspose.slides.TabCollection)null);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.n5.clear();
      this.n5();
   }

   @Override
   public final void removeAt(int index) {
      ((Tab)this.n5.getValues().get_Item(index)).n5((com.aspose.slides.TabCollection)null);
      this.n5.removeAt(index);
      this.n5();
   }

   final void n5(double var1) {
      int var3 = this.n5.indexOfKey(var1);
      if (var3 >= 0) {
         this.removeAt(var3);
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }

   final void n5() {
      this.l6++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, PVIObject.class)) {
         ((PVIObject)this.k5).k7();
      }
   }

   final long l6() {
      return this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      TabCollection var2 = com.aspose.slides.internal.v6g.k5.n5(obj, TabCollection.class);
      if (var2 == null) {
         return super.equals(obj);
      }

      int var3 = this.size();
      if (var3 != var2.size()) {
         return false;
      }

      for (int var4 = 0; var4 < var3; var4++) {
         ITab var5 = this.n5.getValues().get_Item(var4);
         ITab var6 = var2.n5.getValues().get_Item(var4);
         if (var5.getPosition() != var6.getPosition() || var5.getAlignment() != var6.getAlignment()) {
            return false;
         }
      }

      return true;
   }

   final void n5(TabCollection var1) {
      this.clear();
      int var2 = var1.size();

      for (int var3 = 0; var3 < var2; var3++) {
         ITab var4 = var1.n5.getValues().get_Item(var3);
         this.add(new Tab(var4.getPosition(), var4.getAlignment()));
      }
   }

   @Override
   public final IGenericEnumerator<ITab> iterator() {
      return this.n5.getValues().iterator();
   }

   @Override
   public final IGenericEnumerator<ITab> iteratorJava() {
      return this.n5.iteratorJavaValues();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      ((ICollection)this.n5.getValues()).copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
