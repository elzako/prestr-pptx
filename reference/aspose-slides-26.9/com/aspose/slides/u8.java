package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class u8 extends x0q {
   final void n5(IPresentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "authorLst".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.g8f var2 = new com.aspose.slides.internal.k4y.g8f(this.s7());
            com.aspose.slides.internal.k4y.s3x[] var3 = var2.l6();

            for (int var4 = 0; var4 < var3.length; var4++) {
               String var5 = var3[var4].l6();
               String var6 = var3[var4].k5();
               CommentAuthor var7 = null;
               ICommentAuthor[] var8 = var1.getCommentAuthors().findByNameAndInitials(var5, var6);
               if (var8.length == 0) {
                  var7 = (CommentAuthor)var1.getCommentAuthors().addAuthor(var5, var6);
               } else {
                  var7 = (CommentAuthor)var8[0];
               }

               this.n5(var7, var3[var4]);
            }
         }
      }

      this.n3();
   }

   private void n5(CommentAuthor var1, com.aspose.slides.internal.k4y.s3x var2) {
      w5 var3 = var1.k5();
      var3.n5(var2.n5().k5());
      var3.n5(var2.u3());
      var3.l6(var2.a6());
      this.k5().s7().addItem(var2.n5().k5(), var1);
   }

   final void l6(IPresentation var1) {
      this.y4();
      com.aspose.slides.internal.k4y.g8f var2 = new com.aspose.slides.internal.k4y.g8f();
      IGenericEnumerator var3 = var1.getCommentAuthors().iterator();

      try {
         while (var3.hasNext()) {
            CommentAuthor var4 = (CommentAuthor)var3.next();
            if (var4.n5() > 0) {
               com.aspose.slides.internal.k4y.s3x var5 = var2.n5();
               var5.n5(var4.getName());
               var5.l6(var4.getInitials());
               this.l6(var4, var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.n5(null, this.x8(), "authorLst");
      this.e2();
   }

   private void l6(CommentAuthor var1, com.aspose.slides.internal.k4y.s3x var2) {
      w5 var3 = var1.k5();
      var2.n5(var3.n5().k5());
      String var4 = var3.l6();
      if (var4 == null) {
         var4 = "";
      }

      var2.k5(var4);
      String var5 = var3.k5();
      if (var5 == null) {
         var5 = "";
      }

      var2.u3(var5);
   }

   public u8(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public u8(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
