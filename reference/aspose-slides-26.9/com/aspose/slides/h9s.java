package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class h9s extends x0q {
   final void n5(Slide var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "cmLst".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.d2 var2 = new com.aspose.slides.internal.k4y.d2(this.s7());

            for (com.aspose.slides.internal.k4y.q3g var6 : var2.l6()) {
               ICommentAuthor var7 = null;
               ICommentAuthor[] var8 = new ICommentAuthor[]{var7};
               this.k5().t2().tryGetValue(var6.n5(), var8);
               var7 = var8[0];
               if (var7 == null) {
                  throw new Exception(
                     com.aspose.slides.ms.System.d1.n5(new String[]{"Comment by nonexistent author. AuthorId = ", com.aspose.slides.ms.System.l4.l6(var6.n5()), "."})
                  );
               }

               IComment var9 = ((CommentCollection)var7.getComments())
                  .n5(
                     var6.a6(),
                     var1,
                     new com.aspose.slides.internal.o9b.w1((float)(var6.u3().n5() * 12700.0 / 8.0), (float)(var6.u3().l6() * 12700.0 / 8.0)),
                     var6.l6().m3()
                  );
               this.n5((Comment)var9, var6);
            }
         }
      }

      this.n3();
   }

   private void n5(Comment var1, com.aspose.slides.internal.k4y.q3g var2) {
      r2q var3 = var1.u3();
      var3.n5(var2.k5());
      var3.n5(var2.u9());
      com.aspose.slides.ms.System.Xml.m8 var4 = n5(var3.l6());
      if (var4 != null) {
         if (var4.u3("timeZoneBias")) {
            var1.n5(com.aspose.slides.ms.System.a3.n5(var4.n5("timeZoneBias")));
         }

         com.aspose.slides.ms.System.Xml.m8 var5 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
            var4, "parentCm", "http://schemas.microsoft.com/office/powerpoint/2012/main"
         );
         if (var5 != null && var5 != null && var5.u3("authorId") && var5.u3("idx")) {
            int var6 = 0;
            int[] var7 = new int[]{0};
            boolean var8 = com.aspose.slides.ms.System.a3.n5(var5.n5("authorId"), var7);
            var6 = var7[0];
            if (var8) {
               CommentAuthor var9 = ((CommentAuthorCollection)var1.getSlide().getPresentation().getCommentAuthors()).n5(var6);
               int var10 = 0;
               int[] var11 = new int[]{0};
               boolean var12 = com.aspose.slides.ms.System.a3.n5(var5.n5("idx"), var11);
               var10 = var11[0];
               if (var12) {
                  IComment var13 = ((CommentCollection)var9.getComments()).findCommentByIdx(var10);
                  var1.setParentComment(var13);
               }
            }
         }
      }
   }

   final void n5(IComment[] var1) {
      this.y4();
      com.aspose.slides.internal.k4y.d2 var2 = new com.aspose.slides.internal.k4y.d2();

      for (IComment var6 : var1) {
         com.aspose.slides.internal.k4y.q3g var7 = var2.n5();
         var7.u3().n5(((Comment)var6).l6().l6() * 8.0F / 12700.0);
         var7.u3().l6(((Comment)var6).l6().k5() * 8.0F / 12700.0);
         var7.n5(var6.getText());
         var7.n5(((CommentAuthor)var6.getAuthor()).l6().n5());
         var7.n5(((Comment)var6).n5().m3());
         this.l6((Comment)var6, var7);
      }

      var2.n5(null, this.x8(), "cmLst");
      this.e2();
   }

   private void l6(Comment var1, com.aspose.slides.internal.k4y.q3g var2) {
      r2q var3 = var1.u3();
      var2.l6(var3.n5());
      var3.n5(new com.aspose.slides.internal.k4y.j9y());
      com.aspose.slides.internal.k4y.b2l var4 = com.aspose.slides.internal.k4y.s4m.n5(var3.l6(), "{C676402C-5697-4E1C-873F-D02D1690AC5C}");
      XmlDocument var5 = new XmlDocument();
      com.aspose.slides.ms.System.Xml.t5 var6 = var5.createDocumentFragment();
      var6.setInnerXml(var4.n5());
      com.aspose.slides.ms.System.Xml.m8 var7 = var6.getChildNodes()
         .k5(0)
         .getOwnerDocument()
         .createElement("p15", "threadingInfo", "http://schemas.microsoft.com/office/powerpoint/2012/main");
      var7.k5("timeZoneBias", com.aspose.slides.ms.System.a3.l6(var1.k5()));
      if (var1.getParentComment() != null) {
         com.aspose.slides.ms.System.Xml.m8 var8 = var5.createElement("p15", "parentCm", "http://schemas.microsoft.com/office/powerpoint/2012/main");
         var8.k5("authorId", com.aspose.slides.ms.System.l4.l6(((CommentAuthor)var1.getParentComment().getAuthor()).l6().n5()));
         var8.k5("idx", com.aspose.slides.ms.System.l4.l6(((Comment)var1.getParentComment()).u3().n5()));
         var7.appendChild(var8);
      }

      var6.getChildNodes().k5(0).appendChild(var7);
      var4.n5(var6.getOuterXml());
      var2.n5(var3.l6());
   }

   static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      if (var0 != null && var0.n5().length != 0) {
         XmlDocument var1 = com.aspose.slides.internal.k4y.i8w.n5(var0, "{C676402C-5697-4E1C-873F-D02D1690AC5C}");
         if (var1 == null) {
            return null;
         }

         com.aspose.slides.ms.System.Xml.m8 var2 = var1.getDocumentElement();
         return var2 == null
            ? null
            : (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var2, "threadingInfo", "http://schemas.microsoft.com/office/powerpoint/2012/main");
      } else {
         return null;
      }
   }

   public h9s(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public h9s(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
