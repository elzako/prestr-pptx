package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

final class Collect$1 implements ForEach$ForEachShapeCallback {
   // $VF: synthetic field
   final List n5;

   Collect$1(List var1) {
      this.n5 = var1;
   }

   @Override
   public void invoke(Shape shape, BaseSlide slide, int index) {
      this.n5.addItem(shape);
   }
}
