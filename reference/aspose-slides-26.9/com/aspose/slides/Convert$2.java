package com.aspose.slides;

final class Convert$2 implements ForEach$ForEachSlideCallback {
   // $VF: synthetic field
   final Presentation n5;
   // $VF: synthetic field
   final ISVGOptions l6;

   Convert$2(Presentation var1, ISVGOptions var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void invoke(Slide slide, int index) {
      String var3 = com.aspose.slides.ms.System.d1.n5("{0}_{1}.svg",new Object[]{ com.aspose.slides.internal.z0k.z1.l6(this.n5.l6), index});
      com.aspose.slides.internal.z0k.n3 var4 = new com.aspose.slides.internal.z0k.n3(var3, 2, 2);

      try {
         slide.n5(var4, this.l6);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }
}
