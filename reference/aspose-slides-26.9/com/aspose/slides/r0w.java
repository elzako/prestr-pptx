package com.aspose.slides;

class r0w extends com.aspose.slides.internal.c8m.w2 {
   void n5(IDocumentProperties var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1
            && "http://schemas.openxmlformats.org/package/2006/metadata/core-properties".equals(this.s7().y4())
            && this.s7().n3().equals("coreProperties")) {
            com.aspose.slides.internal.k4y.s3 var2 = new com.aspose.slides.internal.k4y.s3(this.s7());
            var1.setTitle(var2.y4());
            var1.setAuthor(var2.a6());
            var1.setSubject(var2.n3());
            var1.setKeywords(var2.h0());
            var1.setComments(com.aspose.slides.ms.System.d1.n5(var2.u9(), "_x000d_", ""));
            var1.setCategory(var2.n5());
            var1.setContentStatus(var2.l6());
            var1.setContentType(var2.k5());
            ((DocumentProperties)var1).n5(var2.u3().m3());
            ((DocumentProperties)var1).u3(var2.s7().m3());
            ((DocumentProperties)var1).k5(var2.t2().m3());
            var1.setLastSavedBy(var2.c8());
            int var3 = 0;
            int[] var4 = new int[]{0};
            boolean var5 = com.aspose.slides.ms.System.a3.n5(var2.x8(), var4);
            var3 = var4[0];
            if (var5) {
               var1.setRevisionNumber(var3);
            }
         }
      }

      this.n3();
   }

   void l6(IDocumentProperties var1) {
      this.y4();
      com.aspose.slides.internal.k4y.s3 var2 = new com.aspose.slides.internal.k4y.s3();
      var2.s7(var1.getTitle());
      var2.u3(var1.getAuthor());
      var2.t2(var1.getSubject());
      var2.u9(var1.getKeywords());
      var2.a6(var1.getComments());
      var2.n5(var1.getCategory());
      var2.l6(var1.getContentStatus());
      var2.k5(var1.getContentType());
      var2.n5(((DocumentProperties)var1).l6().m3());
      var2.k5(((DocumentProperties)var1).k5().m3());
      var2.l6(((DocumentProperties)var1).u3().m3());
      var2.h0(var1.getLastSavedBy());
      var2.c8(com.aspose.slides.ms.System.a3.n5(var1.getRevisionNumber(), com.aspose.slides.internal.x7n.l6.k5()));
      var2.n5(null, this.x8(), "coreProperties");
      this.e2();
   }

   final void k5(IDocumentProperties var1) {
      this.t9().n3();
      this.l6(var1);
   }

   public r0w(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.e9 var2) {
      super(var1, var2);
   }

   public r0w(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.o5 var2) {
      super(var1, var2);
   }
}
