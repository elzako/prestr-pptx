package com.aspose.slides;

class t4w {
   void n5(byte[] var1, IPresentation var2) {
      if (var1 != null) {
         Presentation var3 = (Presentation)var2;
         var3.n5(new com.aspose.slides.internal.l6z.h6(var1));
         var3.setVbaProject(new VbaProject(var3.l6()));
      }
   }

   void n5(com.aspose.slides.internal.c8m.j8 var1, IPresentation var2) {
      if (((Presentation)var2).l6() != null) {
         var1.n5(((Presentation)var2).l6().n5());
      }
   }
}
