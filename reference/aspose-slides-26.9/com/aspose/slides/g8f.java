package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class g8f {
   public static String n5(ISlide var0, d9r var1, j9u var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      String var4 = n5(var0.getSlideNumber(), var1, var2);
      var3.n5(var4);
      if (var1.k5.getExportType() != 1
         && var0.getBackground() != null
         && var0.getBackground().getFillFormat() != null
         && var0.getBackground().getFillFormat().getFillType() == 4) {
         var3.n5(n5(var1, var0));
      }

      k5y var5 = new k5y(var1, var0.getShapes());
      var3.n5(var5.n5(var2));
      if (var1.k5.getShowComments()) {
         var3.n5(l6(var0, var1, var2));
      }

      return var3.toString();
   }

   private static String n5(d9r var0, ISlide var1) {
      IPPImage var2 = var1.getBackground().getFillFormat().getPictureFillFormat().getPicture().getImage();
      return u2p.n5(var2, var0.n5, var0.l6);
   }

   private static String l6(ISlide var0, d9r var1, j9u var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      IGenericEnumerator var4 = var0.getPresentation().getCommentAuthors().iterator();

      try {
         while (var4.hasNext()) {
            ICommentAuthor var5 = (ICommentAuthor)var4.next();
            IGenericEnumerator var6 = var5.getComments().iterator();

            try {
               while (var6.hasNext()) {
                  IComment var7 = (IComment)var6.next();
                  if (var7.getSlide() == var0) {
                     var3.n5(var1.l6.u3(var1.l6.a6(var5.getName(), var7.getText())));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      String var16 = var3.toString();
      var2.n5(var16);
      return var16;
   }

   private static String n5(d9r var0) {
      String var1 = "---";
      return var0.l6.u3(var1);
   }

   private static String n5(int var0, d9r var1, j9u var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      if (!var2.n5()) {
         var3.n5(var1.l6.k5());
      }

      if (var1.k5.getShowSlideNumber() && var0 == 1) {
         var3.n5(var1.l6.k5());
      }

      var3.n5(n5(var1));
      if (var1.k5.getShowSlideNumber()) {
         String var4 = n5(var0, var1);
         var3.n5(var4);
         var3.n5(var1.l6.k5());
         var3.n5(n5(var1));
      }

      String var5 = var3.toString();
      var2.n5(var5);
      return var5;
   }

   private static String n5(int var0, d9r var1) {
      String var2 = !com.aspose.slides.ms.System.d1.n5(var1.k5.getSlideNumberFormat()) ? var1.k5.getSlideNumberFormat() : "# {0}";
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.k5(), var2, var0);
   }
}
