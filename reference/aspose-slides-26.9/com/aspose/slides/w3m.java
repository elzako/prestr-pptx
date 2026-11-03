package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class w3m extends x0q {
   final void n5(IPresentation var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "presentation".equals(this.s7().n3())) {
            com.aspose.slides.internal.c8m.a2 var2 = this.n5();
            com.aspose.slides.internal.k4y.f5 var3 = new com.aspose.slides.internal.k4y.f5(this.s7());
            l1x var4 = ((Presentation)var1).n3();
            n5(var1, var3);
            w4s.n5(((Presentation)var1).t9(), var3.c4(), this.k5());
            var1.setFirstSlideNumber(var3.x8());
            t1f.n5(var1.getSlideSize(), var3.j5());
            o7q.n5(var1.getNotesSize(), var3.w1());
            if (var3.m1() != null) {
               for (com.aspose.slides.internal.k4y.p2y var8 : var3.m1().l6()) {
                  String var9 = var8.l6();
                  com.aspose.slides.internal.c8m.j8 var10 = var2.n5(var9).l6();
                  p2p var11 = new p2p(var10, this.k5());
                  IMasterSlide var12 = ((MasterSlideCollection)var1.getMasters()).n5();
                  var11.n5(var12);
                  ((MasterSlide)var12).t4().n5(var8.n5());
                  var4.l6(var8.n5());
                  this.k5().x8().addItem(var10.l6(), var12);
                  ((MasterSlide)var12).t4().l6(var8.k5());
               }

               IGenericEnumerator var27 = this.k5().y4().getKeys().iterator();

               try {
                  while (var27.hasNext()) {
                     String var32 = (String)var27.next();
                     SortedList var37 = null;
                     SortedList[] var44 = new SortedList[]{var37};
                     this.k5().y4().tryGetValue(var32, var44);
                     var37 = var44[0];
                     if (var37 != null) {
                        IGenericEnumerator var49 = var37.getValues().iterator();

                        try {
                           while (var49.hasNext()) {
                              com.aspose.slides.internal.c8m.j8 var54 = (com.aspose.slides.internal.c8m.j8)var49.next();
                              if (!this.k5().x8().containsKey(var54.l6()) && this.k5().x8().containsKey(var32)) {
                                 p8c var57 = new p8c(var54, this.k5());
                                 IMasterSlide var60 = (IMasterSlide)this.k5().x8().get_Item(var32);
                                 ILayoutSlide var13 = null;
                                 ILayoutSlide[] var14 = new ILayoutSlide[]{var13};
                                 var57.n5(var60, var14);
                                 var13 = var14[0];
                                 ((LayoutSlide)var13).t4().n5(var4.w1());
                                 this.k5().x8().addItem(var54.l6(), var13);
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
                              var49.dispose();
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                     var27.dispose();
                  }
               }
            }

            if (var3.k7() != null) {
               com.aspose.slides.internal.k4y.t4j var28 = var3.k7().l6();
               String var33 = var28.n5();
               com.aspose.slides.internal.c8m.j8 var39 = var2.n5(var33).l6();
               p3r var45 = new p3r(var39, this.k5());
               MasterNotesSlide var50 = ((i6f)var1.getMasterNotesSlideManager()).n5();
               var45.n5(var50);
               this.k5().x8().addItem(var39.l6(), var50);
               var50.t4().l6(var28.l6());
            }

            if (var3.m3() != null) {
               com.aspose.slides.internal.k4y.d0m var29 = var3.m3().l6();
               String var34 = var29.n5();
               com.aspose.slides.internal.c8m.j8 var40 = var2.n5(var34).l6();
               i3t var46 = new i3t(var40, this.k5());
               MasterHandoutSlide var51 = ((z4k)var1.getMasterHandoutSlideManager()).n5();
               var46.n5(var51);
               this.k5().x8().addItem(var40.l6(), var51);
               var51.t4().l6(var29.l6());
            }

            if (var3.z8() != null) {
               for (com.aspose.slides.internal.k4y.z7s var47 : var3.z8().l6()) {
                  this.k5().z1().throwIfInterruptionRequested();
                  String var52 = var47.l6();
                  com.aspose.slides.internal.c8m.j8 var55 = var2.n5(var52).l6();
                  w5r var58 = new w5r(var55, this.k5());
                  com.aspose.slides.internal.c8m.r7[] var61 = var55.e2().n5(com.aspose.slides.internal.c8m.z9.n5);
                  IBaseSlide var63 = null;
                  IBaseSlide[] var65 = new IBaseSlide[]{var63};
                  boolean var15 = !this.k5().x8().tryGetValue(var61[0].n5(), var65);
                  var63 = var65[0];
                  if (var15) {
                     var63 = var1.getLayoutSlides().getByType((byte)11);
                     if (var63 == null) {
                        var63 = ((MasterSlide)var1.getMasters().get_Item(0)).l6((byte)11);
                        ((LayoutSlide)var63).t4().n5(var4.w1());
                     }
                  }

                  var61[0].t2();
                  Slide var16 = ((SlideCollection)var1.getSlides()).n5();
                  var16.n5((LayoutSlide)var63);
                  var58.n5(var16);
                  ((SlideCollection)var1.getSlides()).n5(var16);
                  com.aspose.slides.internal.c8m.r7[] var17 = var55.e2().n5(com.aspose.slides.internal.c8m.u4.n5);
                  if (var17 != null && var17.length > 0) {
                     com.aspose.slides.internal.c8m.j8 var18 = var17[0].l6();
                     n3e var19 = new n3e(var18, this.k5());
                     INotesSlide var20 = ((NotesSlideManager)var16.getNotesSlideManager()).n5(false);
                     var19.n5(var20);
                     this.k5().x8().addItem(var18.l6(), var20);
                  }

                  var16.q0().n5(var47.n5());
                  var4.n5(var47.n5());
                  this.k5().x8().addItem(var55.l6(), var16);
                  var16.q0().l6(var47.k5());
               }
            }

            this.l6(var1, var3);
            a0w.n5(var1, var3, this.k5());
            i2i.n5(var1.getCustomData(), var3.a0(), this.k5());
            if (var3.d5() != null) {
               p2m.n5(var1.getDefaultTextStyle(), var3.d5(), this.k5());
            } else {
               s4r.n5(var1);
            }

            var4.n5().n5(var3.s3());
            String var31 = var1.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().getLanguageId();
            if (!com.aspose.slides.ms.System.d1.n5(var31)) {
               int var36 = 0;
               Fonts$n5 var42 = null;
               Fonts$n5[] var48 = new Fonts$n5[]{var42};
               boolean var53 = !com.aspose.slides.ms.System.d1.n5(var31) && Fonts.l6.tryGetValue(var31, var48);
               var42 = var48[0];
               if (var53) {
                  var36 = var42.k5;
               }

               int var56 = var36;
               String var59 = Fonts.n5(var31);
               this.n5((Fonts)var1.getMasterTheme().getFontScheme().getMajor(), var59, var56);
               this.n5((Fonts)var1.getMasterTheme().getFontScheme().getMinor(), var59, var56);
            }

            this.k5(var1, var3);
         }
      }

      this.n3();
   }

   private void n5(Fonts var1, String var2, int var3) {
      if (var1.n5().n5().containsKey(var2)) {
         String var4 = var1.n5().n5().get_Item(var2);
         FontData var5 = new FontData(var4);
         if (var3 == 1) {
            var1.setEastAsianFont(var5);
         } else if (var3 == 2) {
            var1.setComplexScriptFont(var5);
         }
      }
   }

   private com.aspose.slides.internal.c8m.a2 n5() {
      com.aspose.slides.internal.c8m.a2 var1 = this.k5().k7();
      this.k5().n5(com.aspose.slides.internal.l7h.j5.z3().u3("Generated by Aspose.Slides for Java "));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         this.k5().n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }

      return var1;
   }

   private static void n5(IPresentation var0, com.aspose.slides.internal.k4y.f5 var1) {
      l1x var2 = ((Presentation)var0).n3();
      var2.n5(var1.r4());
      var2.n5(var1.y1());
      var2.n5(var1.d2());
      var2.n5(var1.p8());
      var2.n5(var1.s7() / 100.0F);
      var2.n5(var1.n3());
      var2.l6(var1.y4());
      var2.k5(var1.e2());
      var2.u3(var1.t9());
      var2.a6(var1.z1());
      var2.u9(var1.t4());
      var2.h0(var1.q0());
      var2.l6((int)var1.z3());
   }

   private void l6(IPresentation var1, com.aspose.slides.internal.k4y.f5 var2) {
      if (var2.y2() != null) {
         j1p var3 = new j1p();

         for (com.aspose.slides.internal.k4y.s4b var7 : var2.y2().l6()) {
            u8h var8 = new u8h(var7.l6(), var7.n5());

            for (com.aspose.slides.internal.k4y.k4l var12 : var7.k5().l6()) {
               com.aspose.slides.internal.c8m.r7 var13 = this.k5().k7().n5(var12.n5());
               IBaseSlide var14 = this.k5().x8().get_Item(var13.n5());
               var8.k5().addItem(var14);
            }

            var3.n5().addItem(var8);
         }

         l1x var15 = ((Presentation)var1).n3();
         var15.n5(var3);
      }
   }

   private void k5(IPresentation var1, com.aspose.slides.internal.k4y.f5 var2) {
      if (var2.p8() != null) {
         IViewProperties var3 = var1.getViewProperties();
         n5((DrawingGuidesCollection)var3.getSlideViewProperties().getDrawingGuides(), var2.p8(), "{EFAFB233-063F-42B5-8137-9DF3F51BA10A}");
         n5((DrawingGuidesCollection)var3.getNotesViewProperties().getDrawingGuides(), var2.p8(), "{2D200454-40CA-4A62-9FC3-DE9A4176ACB9}");
      }
   }

   static void n5(DrawingGuidesCollection var0, com.aspose.slides.internal.k4y.x8 var1, String var2) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.b2l var3 = com.aspose.slides.internal.k4y.i8w.l6(var1, var2);
         if (var3 != null && !com.aspose.slides.ms.System.d1.n5(var3.l6().getDocumentElement().getInnerXml())) {
            com.aspose.slides.internal.k4y.i1x var4 = null;
            com.aspose.slides.ms.System.Xml.p5 var5 = new com.aspose.slides.ms.System.Xml.p5(
               new com.aspose.slides.internal.z0k.w1(var3.l6().getDocumentElement().getInnerXml())
            );

            try {
               var5.n5((com.aspose.slides.ms.System.Xml.o8)null);

               while (!var5.j5() && var5.s7() != 1) {
                  var5.u9();
               }

               if (!var5.j5()) {
                  var4 = new com.aspose.slides.internal.k4y.i1x(var5);
               }
            } finally {
               var5.dispose();
            }

            if (var4 != null) {
               for (com.aspose.slides.internal.k4y.w5r var9 : var4.n5()) {
                  ColorFormat var10 = new ColorFormat(null);
                  c4i.n5(var10, var9.k5());
                  var0.n5(new DrawingGuide(var9.n5(), com.aspose.slides.internal.n2d.t2.x8(var9.l6() * 12700.0), var10.u3().o8()));
               }
            }
         }
      }
   }

   final void l6(IPresentation var1) {
      this.y4();
      com.aspose.slides.internal.k4y.f5 var2 = new com.aspose.slides.internal.k4y.f5();
      l1x var3 = ((Presentation)var1).n3();
      i2i.n5(var1.getCustomData(), new w3m$1(this, var2), this.u3());
      var2.n5(var1.getFirstSlideNumber());
      if (this.t9().t9().n5()) {
         var2.n5("strict");
      }

      if (var1.getMasters().size() > 0) {
         com.aspose.slides.internal.k4y.j6m var4 = var2.n5();
         IGenericEnumerator var5 = var1.getMasters().iterator();

         try {
            while (var5.hasNext()) {
               IMasterSlide var6 = (IMasterSlide)var5.next();
               com.aspose.slides.internal.k4y.p2y var7 = var4.n5();
               var7.n5(((MasterSlide)var6).t4().u3());
               var7.n5(this.t9().e2().n5(this.u3().k5().get_Item(var6)).a6());
               var7.n5(((MasterSlide)var6).t4().a6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      if (var1.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         com.aspose.slides.internal.k4y.g1a var16 = var2.l6();
         com.aspose.slides.internal.k4y.t4j var19 = var16.n5();
         var19.n5(this.t9().e2().n5(this.u3().k5().get_Item(var1.getMasterNotesSlideManager().getMasterNotesSlide())).a6());
         var19.n5(((MasterNotesSlide)var1.getMasterNotesSlideManager().getMasterNotesSlide()).t4().a6());
      }

      if (var1.getMasterHandoutSlideManager().getMasterHandoutSlide() != null) {
         com.aspose.slides.internal.k4y.h4j var17 = var2.k5();
         com.aspose.slides.internal.k4y.d0m var20 = var17.n5();
         var20.n5(this.t9().e2().n5(this.u3().k5().get_Item(var1.getMasterHandoutSlideManager().getMasterHandoutSlide())).a6());
         var20.n5(((MasterHandoutSlide)var1.getMasterHandoutSlideManager().getMasterHandoutSlide()).t4().a6());
      }

      if (var1.getSlides().size() > 0) {
         com.aspose.slides.internal.k4y.s8k var18 = var2.u3();
         IGenericEnumerator var21 = var1.getSlides().iterator();

         try {
            while (var21.hasNext()) {
               Slide var22 = (Slide)var21.next();
               com.aspose.slides.internal.k4y.z7s var23 = var18.n5();
               var23.n5(var22.q0().u3());
               var23.n5(this.t9().e2().n5(this.u3().k5().get_Item(var22)).a6());
               var23.n5(var22.q0().a6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
               var21.dispose();
            }
         }

         this.a6(var1, var2);
      }

      this.u9(var1, var2);
      t1f.n5(var1.getSlideSize(), new w3m$2(this, var2));
      o7q.l6(var1.getNotesSize(), var2.w1());
      p2m.n5(var1.getDefaultTextStyle(), new w3m$3(this, var2), this.u3());
      var2.n5(var3.n5().k5());
      a0w.n5((Presentation)var1);
      n5((Presentation)var1);
      u3(var1, var2);
      this.x8().u9(com.aspose.slides.ms.System.d1.n5(new String[]{"Generated by Aspose.Slides for Java ", "26.9"}));
      var2.n5(null, this.x8(), "presentation");
      this.e2();
   }

   private static void u3(IPresentation var0, com.aspose.slides.internal.k4y.f5 var1) {
      l1x var2 = ((Presentation)var0).n3();
      var1.n5(var2.k5());
      var1.l6(var2.a6());
      var1.k5(var2.u9());
      var1.n5(var2.h0());
      var1.n5(var2.c8() * 100.0F);
      var1.n5(var2.t2());
      var1.l6(var2.s7());
      var1.k5(var2.x8());
      var1.u3(var2.n3());
      var1.a6(var2.y4());
      var1.h0(var2.e2());
      var1.c8(var2.t9());
      var1.n5(var2.z1() & 4294967295L);
   }

   private void a6(IPresentation var1, com.aspose.slides.internal.k4y.f5 var2) {
      l1x var3 = ((Presentation)var1).n3();
      if (var3.u3() != null) {
         com.aspose.slides.internal.k4y.l5e var4 = var2.h0();
         List$Enumerator var5 = var3.u3().n5().iterator();

         try {
            while (var5.hasNext()) {
               u8h var6 = (u8h)var5.next();
               com.aspose.slides.internal.k4y.s4b var7 = var4.n5();
               var7.n5(var6.n5());
               var7.n5(var6.l6());
               List$Enumerator var8 = var6.k5().iterator();

               try {
                  while (var8.hasNext()) {
                     IBaseSlide var9 = (IBaseSlide)var8.next();
                     com.aspose.slides.internal.c8m.r7 var10 = this.t9().e2().n5(this.u3().k5().get_Item(var9));
                     com.aspose.slides.internal.k4y.k4l var11 = var7.k5().n5();
                     var11.n5(var10.a6());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   private void u9(IPresentation var1, com.aspose.slides.internal.k4y.f5 var2) {
      k6j var3 = ((Presentation)var1).t9();
      if (var3.a6() && var3.n5().n5() != 0) {
         var2.u9(true);
         w4s.n5(var3.n5(), new w3m$4(this, var2), this.u3());
      }
   }

   private static void n5(Presentation var0) {
      IViewProperties var1 = var0.getViewProperties();
      DrawingGuidesCollection var2 = (DrawingGuidesCollection)var1.getSlideViewProperties().getDrawingGuides();
      DrawingGuidesCollection var3 = (DrawingGuidesCollection)var1.getNotesViewProperties().getDrawingGuides();
      l1x var4 = var0.n3();
      if ((var2.getCount() > 0 || var3.getCount() > 0) && var4.h0() == null) {
         var4.n5(new com.aspose.slides.internal.k4y.y1g());
      }

      l6(var2, var4.h0(), "{EFAFB233-063F-42B5-8137-9DF3F51BA10A}");
      l6(var3, var4.h0(), "{2D200454-40CA-4A62-9FC3-DE9A4176ACB9}");
   }

   static com.aspose.slides.internal.k4y.x8 l6(DrawingGuidesCollection var0, com.aspose.slides.internal.k4y.x8 var1, String var2) {
      if (var0.getCount() == 0) {
         a0w.n5(var1, var2);
         return var1;
      }

      com.aspose.slides.internal.k4y.x8 var3 = var1;
      if (var3 == null) {
         var3 = new com.aspose.slides.internal.k4y.j9y();
      }

      com.aspose.slides.internal.k4y.x8 var4 = var3;
      com.aspose.slides.internal.k4y.i8w.k5(var4, var2);
      com.aspose.slides.internal.k4y.b2l var5 = com.aspose.slides.internal.k4y.i8w.l6(var4, var2);
      com.aspose.slides.internal.k4y.i1x var6 = new com.aspose.slides.internal.k4y.i1x();
      long var7 = 1L;
      IGenericEnumerator var9 = var0.iterator();

      try {
         while (var9.hasNext()) {
            IDrawingGuide var10 = (IDrawingGuide)var9.next();
            com.aspose.slides.internal.k4y.w5r var11 = new com.aspose.slides.internal.k4y.w5r();
            var11.n5(var7++);
            var11.n5(true);
            var11.n5(var10.getOrientation());
            var11.n5(com.aspose.slides.internal.n2d.t2.n3(var10.getPosition()) / 12700.0);
            ColorFormat var12 = new ColorFormat(null, ((DrawingGuide)var10).n5().o8());
            c4i.l6(var12, var11.k5());
            var6.n5(var11);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      var5.l6().getDocumentElement().setInnerXml(m0y.n5("sldGuideLst", var6));
      return var4;
   }

   public w3m(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public w3m(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
