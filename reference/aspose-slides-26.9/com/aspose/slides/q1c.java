package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class q1c extends x0q {
   public q1c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public q1c(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }

   final void n5(Slide var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "cmLst".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.q4r var2 = new com.aspose.slides.internal.k4y.q4r(this.s7());

            for (com.aspose.slides.internal.k4y.u4i var6 : var2.l6()) {
               CommentAuthor var7 = ((CommentAuthorCollection)var1.getPresentation().getCommentAuthors()).n5(var6.c8().k5());
               com.aspose.slides.internal.k4y.r6a var8 = this.n5(var6.t9());
               if (var8 != null) {
                  Shape var9 = null;
                  if (var6.x8() != null && var6.x8().l6() != null) {
                     var9 = this.n5(var1, ((com.aspose.slides.internal.k4y.o9n)var6.x8().l6().k5()).n5());
                  } else if (var6.n3() != null && var6.n3().l6() != null) {
                     var9 = this.n5(var1, var6.n3().l6().n5());
                  }

                  float var10 = var6.y4() != null ? (float)var6.y4().l6() : 0.0F;
                  float var11 = 0.0F;
                  if (var6.y4() != null) {
                     var11 = (float)var6.y4().n5();
                  } else if (var9 != null) {
                     var11 = var9.getWidth();
                  }

                  ModernComment var12 = (ModernComment)((CommentCollection)var7.getComments())
                     .n5(var8.k5(), var1, var9, new com.aspose.slides.internal.o9b.w1(var11, var10), var6.s7().m3());
                  var12.n5(var6.h0().k5());
                  switch (var6.t2()) {
                     case 1:
                        var12.setStatus((byte)1);
                        break;
                     case 2:
                        var12.setStatus((byte)2);
                        break;
                     case 3:
                        var12.setStatus((byte)3);
                  }

                  if (var6.n3() != null) {
                     var12.setTextSelectionStart(var6.n3().k5().l6());
                     var12.setTextSelectionLength(var6.n3().k5().k5());
                     if (var6.n3().k5().u3() != null) {
                        var12.u9().n5(var6.n3().k5().u3().n5());
                        var12.u9().l6(var6.n3().k5().u3().l6());
                     }
                  }

                  if (var6.e2() != null) {
                     for (com.aspose.slides.internal.k4y.e6d var16 : var6.e2().l6()) {
                        CommentAuthor var17 = ((CommentAuthorCollection)var1.getPresentation().getCommentAuthors()).n5(var16.l6().k5());
                        if (var17 == null) {
                           throw new Exception(com.aspose.slides.ms.System.d1.n5(new Object[]{"Comment reply by nonexistent author. AuthorId = ", var16.l6(), "."}));
                        }

                        com.aspose.slides.internal.k4y.r6a var18 = this.n5(var16.u3());
                        if (var18 != null) {
                           ModernComment var19 = (ModernComment)((CommentCollection)var17.getComments())
                              .n5(var18.k5(), var1, null, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), var16.k5().m3());
                           var19.setParentComment(var12);
                        }
                     }
                  }
               }
            }
         }
      }

      this.n3();
   }

   private Shape n5(Slide var1, long var2) {
      IGenericEnumerator var4 = var1.getShapes().iterator();

      try {
         while (var4.hasNext()) {
            Shape var5 = (Shape)var4.next();
            if (var5.v4() == var2) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   private long n5(String var1) {
      long var2 = 0L;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         var2 = (((var2 & 4294967295L) << 5 & 4294967295L) + (var2 & 4294967295L) & 4294967295L) + var1.charAt(var4);
      }

      return (((var2 & 4294967295L) << 5 & 4294967295L) + (var2 & 4294967295L) & 4294967295L) + 13L & 4294967295L;
   }

   private com.aspose.slides.internal.k4y.r6a n5(com.aspose.slides.internal.k4y.j3z var1) {
      com.aspose.slides.internal.k4y.r1x[] var2 = var1.a6();
      com.aspose.slides.internal.k4y.r6a var3;
      if (var2.length != 0 && !var2[0].u3().isEmpty()) {
         var3 = com.aspose.slides.internal.v6g.k5.n5(var2[0].u3().get_Item(0).l6(), com.aspose.slides.internal.k4y.r6a.class);
      } else {
         var3 = new com.aspose.slides.internal.k4y.r6a();
         var3.n5(var2[0].a6());
         var3.n5("");
      }

      return var3;
   }

   final void n5(IComment[] var1) {
      this.y4();
      com.aspose.slides.internal.k4y.q4r var2 = new com.aspose.slides.internal.k4y.q4r();

      for (IComment var6 : var1) {
         ModernComment var7 = (ModernComment)var6;
         if (var7.getParentComment() == null) {
            com.aspose.slides.internal.k4y.u4i var8 = var2.n5();
            var8.n5(var7.a6().k5());
            var8.n5(var7.n5().m3());
            var8.l6(((CommentAuthor)var7.getAuthor()).k5().n5().k5());
            IShape var9 = var7.getShape();
            if (var9 == null) {
               com.aspose.slides.internal.k4y.n6p var10 = var8.n5();
               var10.n5().l6(var7.getSlide().getSlideId());
               var10.n5().n5(((Slide)var7.getSlide()).n5());
            } else {
               long var11 = var9.getOfficeInteropShapeId();
               if (com.aspose.slides.internal.v6g.k5.l6(var9, AutoShape.class) && var7.getTextSelectionLength() != 0) {
                  com.aspose.slides.internal.k4y.e0w var28 = var8.k5();
                  var28.n5().l6(var7.getSlide().getSlideId());
                  var28.n5().n5(((Slide)var7.getSlide()).n5());
                  var28.l6().n5(var11);
                  var28.k5().n5(var7.getTextSelectionStart());
                  var28.k5().l6(var7.getTextSelectionLength());
                  com.aspose.slides.internal.k4y.y7w var30 = var28.k5().n5();
                  String var15 = ((AutoShape)var9).getTextFrame().getText();
                  if ((var7.u9().l6() & 4294967295L) == 0L) {
                     var30.n5((var15.length() & 4294967295L) + 1L & 4294967295L);
                     var30.l6(this.n5(var15));
                  } else {
                     var30.n5(var7.u9().n5());
                     var30.l6(var7.u9().l6());
                  }
               } else {
                  com.aspose.slides.internal.k4y.t6g var13 = var8.l6();
                  var13.n5().l6(var7.getSlide().getSlideId());
                  var13.n5().n5(((Slide)var7.getSlide()).n5());
                  com.aspose.slides.internal.k4y.g7 var14;
                  if (com.aspose.slides.internal.v6g.k5.l6(var9, PictureFrame.class)) {
                     var14 = var13.n5("picMk");
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var9, GroupShape.class)) {
                     var14 = var13.n5("grpSpMk");
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var9, Connector.class)) {
                     var14 = var13.n5("cxnSpMk");
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var9, Ink.class)) {
                     var14 = var13.n5("inkMk");
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var9, GraphicalObject.class)) {
                     var14 = var13.n5("graphicFrameMk");
                  } else {
                     var14 = var13.n5("spMk");
                  }

                  ((com.aspose.slides.internal.k4y.o9n)var14.k5()).n5(var11);
               }
            }

            var8.u3();
            var8.y4().n5(var7.l6().l6());
            var8.y4().l6(var7.l6().k5());
            switch (var7.getStatus()) {
               case 1:
                  var8.n5(1);
                  break;
               case 2:
                  var8.n5(2);
                  break;
               case 3:
                  var8.n5(3);
            }

            com.aspose.slides.internal.k4y.j3z var27 = var8.u9();
            var27.n5();
            com.aspose.slides.internal.k4y.r1x var16 = var27.l6();
            com.aspose.slides.internal.k4y.r6a var29 = (com.aspose.slides.internal.k4y.r6a)var16.n5("r").l6();
            com.aspose.slides.internal.k4y.m0l var31 = var29.n5();
            var29.n5(var7.getText());
            ModernComment[] var32 = this.n5(var1, var7);
            if (var32.length > 0) {
               com.aspose.slides.internal.k4y.z6s var17 = var8.a6();

               for (ModernComment var21 : var32) {
                  com.aspose.slides.internal.k4y.e6d var22 = var17.n5();
                  var22.n5(var21.a6().k5());
                  var22.l6(((CommentAuthor)var21.getAuthor()).k5().n5().k5());
                  var22.n5(var21.n5().m3());
                  com.aspose.slides.internal.k4y.j3z var23 = var22.n5();
                  var23.n5();
                  com.aspose.slides.internal.k4y.r1x var24 = var23.l6();
                  com.aspose.slides.internal.k4y.r6a var25 = (com.aspose.slides.internal.k4y.r6a)var24.n5("r").l6();
                  com.aspose.slides.internal.k4y.m0l var26 = var25.n5();
                  var25.n5(var21.getText());
               }
            }
         }
      }

      var2.n5(null, this.x8(), "cmLst");
      this.e2();
   }

   private ModernComment[] n5(IComment[] var1, ModernComment var2) {
      List var3 = new List();

      for (IComment var7 : var1) {
         ModernComment var8 = (ModernComment)var7;
         if (var8.getParentComment() == var2) {
            var3.addItem(var8);
         }
      }

      return (ModernComment[])var3.toArray(new ModernComment[0]);
   }
}
