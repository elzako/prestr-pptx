package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

public final class DrawingGuidesCollection implements IDrawingGuidesCollection {
   private final List<IDrawingGuide> u3;
   private final com.aspose.slides.internal.o9b.c8 a6 = new com.aspose.slides.internal.o9b.c8();
   static final com.aspose.slides.internal.o9b.c8 n5 = com.aspose.slides.internal.o9b.c8.n5(164, 163, 164).o8();
   static final com.aspose.slides.internal.o9b.c8 l6 = com.aspose.slides.internal.o9b.c8.n5(242, 107, 67).o8();
   static final com.aspose.slides.internal.o9b.c8 k5 = com.aspose.slides.internal.o9b.c8.n5(251, 174, 64).o8();

   DrawingGuidesCollection() {
      this.u3 = new List<>();
      n5.n5(this.a6);
   }

   DrawingGuidesCollection(com.aspose.slides.internal.o9b.c8 collectionColor) {
      this.u3 = new List<>();
      collectionColor.n5(this.a6);
   }

   @Override
   public final IDrawingGuide get_Item(int index) {
      return this.u3.get_Item(index);
   }

   @Override
   public final IDrawingGuide add(byte orientation, float position) {
      if (com.aspose.slides.ms.System.n1.k5(position)) {
         throw new ArgumentException("The value must be defined (not a float.NaN).", "position");
      }

      DrawingGuide var3 = new DrawingGuide(orientation, position, this.a6.o8());
      this.n5(var3);
      return var3;
   }

   final int n5(IDrawingGuide var1) {
      int var2 = this.u3.findIndex(new DrawingGuidesCollection$1(this, var1));
      if (var2 == -1) {
         this.u3.addItem(var1);
         return this.u3.size() - 1;
      } else {
         return var2;
      }
   }

   @Override
   public final void removeAt(int index) {
      this.u3.removeAt(index);
   }

   @Override
   public final void clear() {
      this.u3.clear();
   }

   @Override
   public final IGenericEnumerator<IDrawingGuide> iterator() {
      return this.u3.iterator();
   }

   public final IGenericEnumerator<IDrawingGuide> iteratorJava() {
      return this.u3.iteratorJava();
   }

   @Override
   public final int getCount() {
      return this.u3.size();
   }

   public final void copyTo(IDrawingGuide[] array, int index) {
      this.u3.copyToTArray(array, index);
   }
}
