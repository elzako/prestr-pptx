package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class PortionCollection extends DomObject<Paragraph> implements IPortionCollection {
   private final List<IPortion> n5 = new List<>();

   PortionCollection(Paragraph parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int getCount() {
      return this.n5.size();
   }

   public final boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   @Override
   public final IPortion get_Item(int index) {
      return this.n5.get_Item(index);
   }

   public final void set_Item(int index, IPortion value) {
      Portion var3 = (Portion)this.get_Item(index);
      var3.n5((PortionCollection)null);
      if (((r0g)value).getParent_Immediate() != null) {
         throw new PptxEditException("Can't insert already used portion");
      }

      ((Portion)value).n5(this);
      this.n5.set_Item(index, value);
      this.n5(value);
   }

   final IPortion n5() {
      Portion var1 = new Portion("");
      this.add(var1);
      return var1;
   }

   @Override
   public final void add(IPortion value) {
      if (((r0g)value).getParent_Immediate() != null) {
         throw new PptxEditException("Can't add already used portion");
      }

      ((Portion)value).n5(this);
      this.n5.addItem(value);
      this.n5(value);
   }

   final void n5(Portion var1) {
      this.n5.addItem(var1);
      this.n5((IPortion)var1);
   }

   @Override
   public final int indexOf(IPortion item) {
      return this.n5.indexOf(item);
   }

   @Override
   public final void insert(int index, IPortion value) {
      if (((r0g)value).getParent_Immediate() != null) {
         throw new PptxEditException("Can't insert already used portion");
      }

      ((Portion)value).n5(this);
      this.n5.insertItem(index, value);
      this.n5(value);
   }

   @Override
   public final void clear() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            Portion var2 = (Portion)var1.next();
            var2.n5((PortionCollection)null);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.n5.clear();
      this.n5((IPortion)null);
   }

   @Override
   public final boolean contains(IPortion item) {
      return this.n5.containsItem(item);
   }

   public final void copyTo(IPortion[] array, int arrayIndex) {
      this.n5.copyToTArray(array, arrayIndex);
   }

   @Override
   public final boolean remove(IPortion item) {
      Portion var2 = (Portion)item;
      var2.n5((PortionCollection)null);
      boolean var3 = this.n5.removeItem(item);
      if (var3) {
         this.n5((IPortion)null);
      }

      return var3;
   }

   @Override
   public final void removeAt(int index) {
      Portion var2 = (Portion)this.get_Item(index);
      var2.n5((PortionCollection)null);
      this.n5.removeAt(index);
      this.n5((IPortion)null);
   }

   final void l6() {
      if (this.getCount() != 0) {
         this.removeAt(this.getCount() - 1);
      }
   }

   final IGenericEnumerable<f1b> k5() {
      return new com.aspose.slides.internal.f3.n5<>(this.n5, new PortionCollection$1(this));
   }

   @Override
   public final IGenericEnumerator<IPortion> iterator() {
      return this.n5.iterator();
   }

   public final IGenericEnumerator<IPortion> iteratorJava() {
      return this.n5.iteratorJava();
   }

   private void n5(IPortion var1) {
      if (this.u9 != null) {
         if (var1 != null) {
            this.u9.n5(var1.getPortionFormat());
         } else {
            this.u9.n5((IPortionFormat)null);
         }
      }
   }

   final Paragraph u3() {
      return this.u9;
   }
}
