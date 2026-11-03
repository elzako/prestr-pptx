package com.aspose.slides;

class f7v extends com.aspose.slides.internal.c8m.w2 {
   final void n5(IDocumentProperties var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1
            && "http://schemas.openxmlformats.org/officeDocument/2006/custom-properties".equals(this.s7().y4())
            && "Properties".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.p8 var2 = new com.aspose.slides.internal.k4y.p8(this.s7());
            com.aspose.slides.internal.k4y.o4z[] var3 = var2.l6();

            for (int var4 = 0; var4 < var3.length; var4++) {
               try {
                  ((DocumentProperties)var1).n5(var3[var4].n5(), var3[var4].l6().k5());
               } catch (RuntimeException var6) {
                  com.aspose.slides.internal.n8e.v4.n5(var6);
               }
            }
         }
      }

      this.n3();
   }

   final void l6(IDocumentProperties var1) {
      this.y4();
      com.aspose.slides.internal.k4y.p8 var2 = new com.aspose.slides.internal.k4y.p8();

      for (int var3 = 0; var3 < var1.getCountOfCustomProperties(); var3++) {
         com.aspose.slides.internal.k4y.o4z var4 = var2.n5();
         var4.n5("{D5CDD505-2E9C-101B-9397-08002B2CF9AE}");
         var4.n5(var3 + 2);
         var4.l6(var1.getCustomPropertyName(var3));
         Object var5 = ((DocumentProperties)var1).l6(var4.n5());
         if (var5 != null) {
            var4.n5(var5);
         }
      }

      var2.n5(null, this.x8(), "Properties");
      this.e2();
   }

   final void k5(IDocumentProperties var1) {
      this.t9().n3();
      this.l6(var1);
   }

   public f7v(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.e9 var2) {
      super(var1, var2);
   }

   public f7v(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.o5 var2) {
      super(var1, var2);
   }
}
