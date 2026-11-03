package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class k0b extends x0q {
   final void n5(IPresentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "cmAuthorLst".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.a0 var2 = new com.aspose.slides.internal.k4y.a0(this.s7());
            com.aspose.slides.internal.k4y.r2s[] var3 = var2.l6();

            for (int var4 = 0; var4 < var3.length; var4++) {
               ICommentAuthor var5 = var1.getCommentAuthors().addAuthor(var3[var4].l6(), var3[var4].k5());
               this.n5(var5, var3[var4]);
            }
         }
      }

      this.n3();
   }

   private void n5(ICommentAuthor var1, com.aspose.slides.internal.k4y.r2s var2) {
      t2d var3 = ((CommentAuthor)var1).l6();
      var3.n5(var2.n5());
      this.k5().t2().addItem(var2.n5(), var1);
      var3.n5((int)var2.u3());
      var3.n5(var2.a6());
   }

   final void l6(IPresentation var1) {
      this.y4();
      com.aspose.slides.internal.k4y.a0 var2 = new com.aspose.slides.internal.k4y.a0();
      int var3 = 0;
      IGenericEnumerator var4 = var1.getCommentAuthors().iterator();

      try {
         while (var4.hasNext()) {
            CommentAuthor var5 = (CommentAuthor)var4.next();
            com.aspose.slides.internal.k4y.r2s var6 = var2.n5();
            var6.n5(var5.getName());
            var6.l6(var5.getInitials());
            int[] var7 = new int[]{var3};
            this.n5(var5, var6, var7);
            var3 = var7[0];
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.n5(null, this.x8(), "cmAuthorLst");
      this.e2();
   }

   private void n5(ICommentAuthor var1, com.aspose.slides.internal.k4y.r2s var2, int[] var3) {
      t2d var4 = ((CommentAuthor)var1).l6();
      var2.n5(var4.n5());
      int var5 = var4.l6();
      if (var5 < 0) {
         var5 = var3[0] + 1;
      }

      if (var5 > var3[0]) {
         var3[0] = var5;
      }

      var2.k5(var5 & 4294967295L);
      var2.l6(var4.k5());
      var2.n5(var4.u3());
   }

   public k0b(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public k0b(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
