package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class t5s {
   private static final String n5 = com.aspose.slides.ms.System.d1.n5(new String[]{"anim", ":", "par"});

   public static void n5(Slide var0, com.aspose.slides.internal.k4y.i4x var1, IGenericList<com.aspose.slides.internal.k4y.g7> var2, h6j var3) {
      if (var1 == null) {
         throw new ArgumentNullException("pageElementData");
      }

      n5((IBaseSlide)var0);
      var0.setName(var1.a6());
      n5(var0, var1);
      n7n.n5(var0, var1.u9(), var3);
      com.aspose.slides.internal.k4y.y2i var4 = var3.k5().get_Item(var1.u9());
      com.aspose.slides.internal.k4y.r9l var5 = t2f.n5(com.aspose.slides.internal.k4y.r9l.class, "drawing-page-properties", var4.u3());
      com.aspose.slides.internal.k4y.q9k var6 = n5(var1.c8(), var3);
      var3.n5(new m1g(var0, var6));
      List$Enumerator var7 = var1.t2().iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
            var3.n5().u3().throwIfInterruptionRequested();
            d7g.n5((ShapeCollection)var0.getShapes(), var8, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var5 != null) {
         var0.setShowMasterShapes(var5.e2() == 1);
         var0.setHidden(var5.y4() == 2);
         IGenericEnumerator var30 = var2.iterator();

         try {
            while (var30.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var9 = (com.aspose.slides.internal.k4y.g7)var30.next();
               if (!com.aspose.slides.ms.System.d1.n5(var1.k5()) && com.aspose.slides.ms.System.d1.a6("footer-decl", var9.n5()) && var5.t9() == 1) {
                  var0.m1().setFooterVisibility(true);
                  com.aspose.slides.internal.k4y.y1a var10 = (com.aspose.slides.internal.k4y.y1a)var9.k5();
                  if (var10.n5() != null) {
                     var0.m1().setFooterText(var10.n5());
                  }
               }

               if (!com.aspose.slides.ms.System.d1.n5(var1.u3()) && com.aspose.slides.ms.System.d1.a6("date-time-decl", var9.n5()) && var5.t4() == 1) {
                  var0.m1().setDateTimeVisibility(true);
                  com.aspose.slides.internal.k4y.r9m var35 = (com.aspose.slides.internal.k4y.r9m)var9.k5();
                  if (var35.n5() != null) {
                     var0.m1().setDateTimeText(var35.n5());
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
               var30.dispose();
            }
         }

         if (var5.z1() == 1) {
            var0.m1().setSlideNumberVisibility(true);
         }
      }

      if (var1.s7() != null) {
         p3.n5(var0.getTimeline(), (com.aspose.slides.internal.k4y.g4z)var1.s7().l6(), new l4h(var3));
      }

      if (var1.x8() != null) {
         INotesSlide var31 = ((NotesSlideManager)var0.getNotesSlideManager()).n5(false);
         List$Enumerator var33 = var1.x8().l6().iterator();

         try {
            while (var33.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var36 = (com.aspose.slides.internal.k4y.g7)var33.next();
               com.aspose.slides.internal.k4y.b4f var11 = null;
               com.aspose.slides.internal.k4y.o2e var12 = null;
               com.aspose.slides.internal.k4y.b4f[] var13 = new com.aspose.slides.internal.k4y.b4f[]{var11};
               com.aspose.slides.internal.k4y.o2e[] var14 = new com.aspose.slides.internal.k4y.o2e[]{var12};
               boolean var15 = n5(var36, var13, var14);
               var11 = var13[0];
               var12 = var14[0];
               if (var15) {
                  q4v var16 = new q4v(var11);
                  d7g.n5((TextFrame)var31.getNotesTextFrame(), var16, var12, var11, var3);
               } else {
                  d7g.n5((ShapeCollection)var31.getShapes(), var36, var3);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
               var33.dispose();
            }
         }
      }

      if (var1.n3().length > 0) {
         for (com.aspose.slides.internal.k4y.p3p var39 : var1.n3()) {
            n5(var0, var39, var3);
         }
      }

      n5(var0);
   }

   private static com.aspose.slides.internal.k4y.q9k n5(String var0, h6j var1) {
      return var1.n5().l6().s7().containsKey(var0) ? var1.n5().l6().s7().get_Item(var0) : null;
   }

   private static void n5(Slide var0) {
      IGenericList var1 = var0.getHyperlinkQueries().getAnyHyperlinks();
      if (var1.size() != 0) {
         List var2 = new List();

         for (int var3 = 0; var3 < var1.size(); var3++) {
            PortionFormat var4 = com.aspose.slides.internal.v6g.k5.n5(var1.get_Item(var3), PortionFormat.class);
            if (var4 != null) {
               c9g var5 = var4.r4();
               ((Hyperlink)var4.getHyperlinkClick()).l6(var5.getFontUnderline() == 0);
               ParagraphFormat var6 = (ParagraphFormat)((Portion)var4.getParent_Immediate()).n3().getParagraphFormat();
               if (var4.getFillFormat().getFillType() != -1 || var6.u3().getFillFormat().getFillType() != -1) {
                  var2.addItem(var5);
               }
            }
         }

         if (var2.size() != 0) {
            c9g var10 = null;
            List$Enumerator var11 = var2.iterator();

            try {
               while (var11.hasNext()) {
                  c9g var12 = (c9g)var11.next();
                  if (var12.getFillFormat().getFillType() != 1) {
                     return;
                  }

                  if (var10 != null && com.aspose.slides.internal.o9b.c8.l6(((f6a)var12.getFillFormat()).h0(), ((f6a)var10.getFillFormat()).h0())) {
                     return;
                  }

                  var10 = var12;
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }

            if (var10 != null) {
               var0.getThemeManager().getOverrideTheme().initColorSchemeFromInherited();
               ((ColorFormat)var0.getThemeManager().getOverrideTheme().getColorScheme().getHyperlink()).n5(((f6a)var10.getFillFormat()).h0().o8());
            }
         }
      }
   }

   private static boolean n5(com.aspose.slides.internal.k4y.g7 var0, com.aspose.slides.internal.k4y.b4f[] var1, com.aspose.slides.internal.k4y.o2e[] var2) {
      var1[0] = null;
      var2[0] = null;
      com.aspose.slides.internal.k4y.b4f var3 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.b4f.class);
      if (var3 == null) {
         return false;
      }

      if (var3.n3() != 11) {
         return false;
      }

      com.aspose.slides.internal.k4y.o2e var4 = d7g.n5(var3.e2());
      if (var4 == null) {
         return false;
      }

      var1[0] = var3;
      var2[0] = var4;
      return true;
   }

   private static void n5(IBaseSlide var0) {
      for (int var1 = var0.getShapes().size() - 1; var1 >= 0; var1--) {
         var0.getShapes().removeAt(var1);
      }
   }

   private static void n5(Slide var0, com.aspose.slides.internal.k4y.i4x var1) {
      MasterSlideCollection var2 = (MasterSlideCollection)((Presentation)var0.getPresentation()).getMasters();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            MasterSlide var4 = (MasterSlide)var3.next();
            MasterThemeManager var5 = (MasterThemeManager)var4.getThemeManager();
            IMasterTheme var6 = var5.n5();
            if (com.aspose.slides.ms.System.d1.a6(var6.getName(), var1.h0())) {
               MasterLayoutSlideCollection var7 = (MasterLayoutSlideCollection)var4.getLayoutSlides();
               IGenericEnumerator var8 = var7.iterator();

               try {
                  while (var8.hasNext()) {
                     LayoutSlide var9 = (LayoutSlide)var8.next();
                     if (var9.getLayoutType() == 11) {
                        var0.l6(var9);
                        return;
                     }
                  }
                  break;
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(ISlide var0, com.aspose.slides.internal.k4y.p3p var1, h6j var2) {
      double var3 = 0.0;
      double var5 = 0.0;
      if (var1.k5() == null) {
         var1.k5("no author");
      }

      ICommentAuthorCollection var7 = var0.getPresentation().getCommentAuthors();
      ICommentAuthor[] var8 = var7.findByName(var1.k5());
      ICommentAuthor var11;
      if (var8.length == 0) {
         String var9;
         if ("no author".equals(var1.k5())) {
            var9 = "n/a";
         } else {
            String[] var10 = com.aspose.slides.ms.System.d1.n5(var1.k5(), ' ');
            if (var10.length > 1) {
               var9 = com.aspose.slides.ms.System.d1.n5(new Object[]{var10[0].charAt(0), ".", var10[1].charAt(0), "."});
            } else {
               var9 = com.aspose.slides.ms.System.d1.n5(new Object[]{var10[0].charAt(0), "."});
            }
         }

         var11 = var7.addAuthor(var1.k5(), var9);
      } else {
         var11 = var8[0];
      }

      double[] var19 = new double[]{0.0};
      com.aspose.slides.ms.System.d2.n5(
         com.aspose.slides.ms.System.d1.n5(var1.n5(), var1.n5().length() - 2), 511, com.aspose.slides.internal.x7n.l6.k5(), var19
      );
      var3 = var19[0];
      double[] var12 = new double[]{0.0};
      com.aspose.slides.ms.System.d2.n5(
         com.aspose.slides.ms.System.d1.n5(var1.l6(), var1.l6().length() - 2), 511, com.aspose.slides.internal.x7n.l6.k5(), var12
      );
      var5 = var12[0];
      var3 = com.aspose.slides.internal.n2d.t2.c8(var3);
      var5 = com.aspose.slides.internal.n2d.t2.c8(var5);
      com.aspose.slides.ms.System.j5 var13 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var14 = new com.aspose.slides.ms.System.j5[]{var13};
      com.aspose.slides.ms.System.j5.n5(var1.u3(), var14);
      var14[0].u3(var13);
      ((CommentCollection)var11.getComments()).n5(n5(var1, var2), var0, new com.aspose.slides.internal.o9b.w1((float)var3, (float)var5), var13.m3());
   }

   private static String n5(com.aspose.slides.internal.k4y.p3p var0, h6j var1) {
      int var2 = var0.a6().size();
      if (var2 == 0) {
         return "";
      }

      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (int var4 = 0; var4 < var2; var4++) {
         com.aspose.slides.internal.k4y.u1x var5 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().get_Item(var4).k5(), com.aspose.slides.internal.k4y.u1x.class);
         if (var5 != null) {
            Paragraph var6 = new Paragraph();
            i3h.n5(var6, null, var5, var1, h2k.l6());
            var3.n5(var6.u3());
            if (var4 < var2 - 1) {
               var3.n5('\n');
            }
         }
      }

      return var3.toString();
   }
}
