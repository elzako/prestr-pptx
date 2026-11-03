package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;

public final class AdjustValueCollection extends DomObject<GeometryShape> implements IAdjustValueCollection {
   static final AdjustValueCollection n5 = new AdjustValueCollection(null);

   AdjustValueCollection(GeometryShape parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int size() {
      return this.u9.e2().l6().length;
   }

   @Override
   public final IAdjustValue get_Item(int index) {
      return new AdjustValue(this.u9.e2().l6()[index]);
   }

   final y2 n5(int var1) {
      return this.u9.e2().l6()[var1];
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      com.aspose.slides.ms.System.u3.n5((Object)(this.u9.e2().l6())).copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IEnumerator iterator() {
      return com.aspose.slides.ms.System.u3.n5((Object)(this.u9.e2().l6())).iterator();
   }
}
