package com.aspose.slides;

final class Convert$1 implements ForEach$ForEachSlideCallback {
   // $VF: synthetic field
   final Convert$GetOutPathCallback n5;
   // $VF: synthetic field
   final ISVGOptions l6;

   Convert$1(Convert$GetOutPathCallback var1, ISVGOptions var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void invoke(Slide slide, int index) {
      String var3 = this.n5.invoke(slide, index);
      com.aspose.slides.internal.z0k.n3 var4 = new com.aspose.slides.internal.z0k.n3(var3, 2, 3);

      try {
         slide.n5(var4, this.l6);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }
}
