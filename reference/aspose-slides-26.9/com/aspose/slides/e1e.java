package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class e1e {
   private g6c n5;
   private boolean l6 = false;

   public final void n5(Presentation var1, com.aspose.slides.internal.z0k.t4 var2, int var3, IPptxOptions var4, InterruptionToken var5) {
      if (this.l6) {
         throw new Exception("PptxSerializator instance can call WritePresentationToZipFile() method only once.");
      }

      this.l6 = true;
      com.aspose.slides.internal.e5a.d2 var6 = new com.aspose.slides.internal.e5a.d2();

      try {
         com.aspose.slides.internal.c8m.d9 var7 = this.n5(var1, var3, var4, var5);

         try {
            l6(var7, var1, this.n5);
            if (var2.canSeek()) {
               var6.l6(1);
            }

            if (var4 != null) {
               switch (var4.getZip64Mode()) {
                  case 0:
                     int var8 = var7.t2().length;
                     if (var8 > 65534) {
                        throw new PptxException(
                           com.aspose.slides.ms.System.d1.n5(new String[]{
                              "Can't save the Presentation with ",
                              com.aspose.slides.ms.System.a3.l6(var8),
                              " parts to ZIP32. ",
                              "Consider setting the IPptxOptions.Zip64Mode property."
                           })
                        );
                     }

                     var6.l6(0);
                     break;
                  case 1:
                     var6.l6(1);
                     break;
                  case 2:
                     var6.l6(2);
               }

               var6.n5(var4.getCompressionLevel());
            } else {
               if (var2.canSeek()) {
                  var6.l6(1);
               } else if (var7.t2().length > 65534) {
                  var6.l6(2);
               }

               var6.n5(6);
            }

            var7.n5(var6);
            var6.l6(var2);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   public final void l6(Presentation var1, com.aspose.slides.internal.z0k.t4 var2, int var3, IPptxOptions var4, InterruptionToken var5) {
      if (this.l6) {
         throw new Exception("PptxSerializator instance can call WritePresentationToZipFile() method only once.");
      }

      this.l6 = true;
      com.aspose.slides.internal.c8m.d9 var6 = this.n5(var1, var3, var4, var5);

      try {
         var6.n5(var2);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private com.aspose.slides.internal.c8m.d9 n5(Presentation var1, int var2, IPptxOptions var3, InterruptionToken var4) {
      com.aspose.slides.internal.c8m.d9 var5 = new com.aspose.slides.internal.c8m.d9();
      if (var3 != null) {
         var5.n5(var3.getConformance());
      }

      this.n5 = new g6c(var5, var1, null, var3, var4);
      com.aspose.slides.internal.c8m.r6 var6 = this.n5(var2);
      com.aspose.slides.internal.c8m.j8 var7 = var5.n5("/ppt/presentation.xml", null, var6);
      var5.c8().l6(var7);
      this.n5(var1, var7);
      this.k5(var5, var1, this.n5);
      this.n5(var5, (IPresentation)var1);
      this.l6(var5, var1);
      this.n5(var5, var1, var3);
      this.a6(var5, var1);
      this.u9(var5, var1);
      IGenericEnumerator var8 = var1.getSlides().iterator();

      try {
         while (var8.hasNext()) {
            ISlide var9 = (ISlide)var8.next();
            this.n5.l6().addItem(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slides/slide", com.aspose.slides.ms.System.a3.l6(this.n5.d5()), ".xml"}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      IGenericEnumerator var25 = var1.getMasters().iterator();

      try {
         while (var25.hasNext()) {
            IMasterSlide var10 = (IMasterSlide)var25.next();
            n5(var5, var10, true, this.n5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
            var25.dispose();
         }
      }

      n5(var5, var1, this.n5);
      u3(var5, var1, this.n5);
      IGenericEnumerator var26 = var1.getSlides().iterator();

      try {
         while (var26.hasNext()) {
            ISlide var11 = (ISlide)var26.next();
            n5(var5, var11, this.n5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      w3m var27 = new w3m(var7, this.n5);
      var27.l6(var1);
      this.n5(var5, var1);
      this.u3(var5, var1);
      this.k5(var5, var1);
      this.n5(var5, var1, var2);
      n5(var5, var1.getMasterTheme(), this.n5);
      var5.w1().e2().l6(this.n5.u3().get_Item(var1.getMasterTheme()));
      this.h0(var5, var1);
      this.n5(var5, var1.getSensitivityLabels(), this.n5);
      return var5;
   }

   public final String n5(BaseSlide var1) {
      return this.n5(var1, true);
   }

   public final String n5(BaseSlide var1, boolean var2) {
      com.aspose.slides.internal.c8m.d9 var3 = new com.aspose.slides.internal.c8m.d9();
      this.n5 = new g6c(var3, var1.getPresentation(), null, new PptxOptions(), InterruptionToken.getNone());
      IGenericEnumerator var4 = var1.getPresentation().getSlides().iterator();

      try {
         while (var4.hasNext()) {
            Slide var5 = (Slide)var4.next();
            this.n5.l6().addItem(var5, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slides/slide", com.aspose.slides.ms.System.a3.l6(this.n5.d5()), ".xml"}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
         this.n5.l6().addItem(var1, "");
      }

      com.aspose.slides.internal.c8m.j8 var16 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
         var16 = var3.n5(this.n5.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.l0());
         w5r var6 = new w5r(var16, this.n5, var1);
         var6.n5(com.aspose.slides.internal.v6g.k5.n5(var1, Slide.class));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, LayoutSlide.class)) {
         var16 = var3.n5(this.n5.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.z9());
         p8c var18 = new p8c(var16, this.n5, var1);
         var18.n5(com.aspose.slides.internal.v6g.k5.n5(var1, LayoutSlide.class));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterSlide.class)) {
         var16 = var3.n5(this.n5.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.s2());
         p2p var19 = new p2p(var16, this.n5, var1);
         var19.n5(com.aspose.slides.internal.v6g.k5.n5(var1, MasterSlide.class), false);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, NotesSlide.class)) {
         var16 = var3.n5(this.n5.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.u4());
         n3e var20 = new n3e(var16, this.n5, var1);
         var20.l6(com.aspose.slides.internal.v6g.k5.n5(var1, NotesSlide.class));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterNotesSlide.class)) {
         var16 = var3.n5(this.n5.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.t3());
         p3r var21 = new p3r(var16, this.n5, var1);
         var21.l6(com.aspose.slides.internal.v6g.k5.n5(var1, MasterNotesSlide.class));
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, MasterHandoutSlide.class)) {
            throw new NotImplementedException();
         }

         var16 = var3.n5(this.n5.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.n1());
         i3t var22 = new i3t(var16, this.n5, var1);
         var22.l6(com.aspose.slides.internal.v6g.k5.n5(var1, MasterHandoutSlide.class));
      }

      String var23 = com.aspose.slides.ms.System.d1.n5;
      if (var2) {
         IGenericEnumerator var7 = var16.e2().iterator();

         try {
            while (var7.hasNext()) {
               com.aspose.slides.internal.c8m.r7 var8 = (com.aspose.slides.internal.c8m.r7)var7.next();
               if (var8.n5() == null || !com.aspose.slides.ms.System.d1.t2(var8.n5(), "slide")) {
                  if (var8.l6() != null) {
                     var23 = com.aspose.slides.ms.System.d1.n5(
                        var23, com.aspose.slides.ms.System.d1.n5(new String[]{"; ", com.aspose.slides.ms.System.p3.l6(var8.l6().n5())})
                     );
                  } else {
                     var23 = com.aspose.slides.ms.System.d1.n5(var23, com.aspose.slides.ms.System.d1.n5(new String[]{"; ", var8.n5()}));
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var16.u9(), var23});
   }

   private com.aspose.slides.internal.c8m.r6 n5(int var1) {
      com.aspose.slides.internal.c8m.r6 var2;
      switch (var1) {
         case 0:
         case 6:
            var2 = new com.aspose.slides.internal.c8m.w9();
            break;
         case 1:
            var2 = new com.aspose.slides.internal.c8m.b9();
            break;
         case 2:
            var2 = new com.aspose.slides.internal.c8m.p9();
            break;
         case 3:
            var2 = new com.aspose.slides.internal.c8m.g8();
            break;
         case 4:
            var2 = new com.aspose.slides.internal.c8m.x3();
            break;
         case 5:
            var2 = new com.aspose.slides.internal.c8m.b2();
            break;
         default:
            throw new Exception();
      }

      return var2;
   }

   private void n5(IPresentation var1, com.aspose.slides.internal.c8m.j8 var2) {
      l1x var3 = ((Presentation)var1).n3();
      d3o.n5(var2, var3.z3(), var3.m1());
      IGenericEnumerator var4 = var3.z3().iterator();

      try {
         while (var4.hasNext()) {
            h0o var5 = (h0o)var4.next();
            d3o.n5(this.n5.a6(), var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      ((DocumentProperties)var2.getDocumentProperties()).u3(com.aspose.slides.ms.System.j5.t2().m3());
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/docProps/core.xml", null, new com.aspose.slides.internal.c8m.y1());
      r0w var4 = new r0w(var3, this.n5);
      var4.l6(var2.getDocumentProperties());
      var1.c8().l6(var3);
   }

   private void l6(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/docProps/app.xml", null, new com.aspose.slides.internal.c8m.i9());
      d1t var4 = new d1t(var3, this.n5);
      var4.n5(var2.getDocumentProperties(), var2);
      var1.c8().l6(var3);
   }

   private void n5(com.aspose.slides.internal.c8m.d9 var1, Presentation var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/ppt/presProps.xml", null, new com.aspose.slides.internal.c8m.r5());
      u4l var4 = new u4l(var3, this.n5);
      var4.l6(var2);
      var1.w1().e2().l6(var3);
   }

   private void k5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (var2.getDocumentProperties().getCountOfCustomProperties() > 0) {
         com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/docProps/custom.xml", null, new com.aspose.slides.internal.c8m.a0());
         var1.c8().l6(var3);
         f7v var4 = new f7v(var3, this.n5);
         var4.l6(var2.getDocumentProperties());
      }
   }

   private void u3(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      l1x var3 = ((Presentation)var2).n3();
      if (var3.t4() == null) {
         var3.n5(new a1c());
         var3.t4().n5(new com.aspose.slides.internal.k4y.l1());
      }

      com.aspose.slides.internal.k4y.l1 var4 = var3.t4().n5();
      IViewProperties var5 = var2.getViewProperties();
      if (var5.getLastView() != 0) {
         byte var6;
         switch (var5.getLastView()) {
            case 0:
               var6 = 0;
               break;
            case 1:
               var6 = 1;
               break;
            case 2:
               var6 = 2;
               break;
            case 3:
               var6 = 3;
               break;
            case 4:
               var6 = 4;
               break;
            case 5:
               var6 = 5;
               break;
            case 6:
               var6 = 6;
               break;
            case 7:
               var6 = 7;
               break;
            case 8:
               var6 = 8;
               break;
            default:
               var6 = 1;
         }

         var4.n5(var6);
      }

      if (var5.getShowComments() == 1) {
         var4.n5(true);
      } else if (var5.getShowComments() == 0) {
         var4.n5(false);
      }

      if (var4.h0() == null) {
         var4.n5();
      }

      if (var4.c8() == null) {
         var4.l6();
      }

      if (var4.s7() == null) {
         var4.k5();
      }

      if (var4.x8() == null) {
         var4.u3();
      }

      p9i.l6(((ViewProperties)var5).getNormalViewProperties(), var4.h0());
      y7w.l6(var5.getSlideViewProperties(), var4.c8().n5());
      y7w.l6(var5.getNotesViewProperties(), var4.s7().n5());
      var4.x8().n5(var5.getGridSpacing());
      var4.x8().l6(var5.getGridSpacing());
      com.aspose.slides.internal.c8m.j8 var8;
      if (var3.t4() == null) {
         var8 = var1.n5(
            "/ppt/viewProps.xml",
            null,
            new com.aspose.slides.internal.c8m.o1(),
            com.aspose.slides.internal.l7h.u6.z3()
               .u3(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<p:viewPr xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\" xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\" xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\"><p:normalViewPr><p:restoredLeft sz=\"15620\"/><p:restoredTop sz=\"94660\"/></p:normalViewPr><p:slideViewPr><p:cSldViewPr><p:cViewPr varScale=\"1\"><p:scale><a:sx n=\"101\" d=\"100\"/><a:sy n=\"101\" d=\"100\"/></p:scale><p:origin x=\"-558\" y=\"-90\"/></p:cViewPr><p:guideLst><p:guide orient=\"horz\" pos=\"2160\"/><p:guide pos=\"2880\"/></p:guideLst></p:cSldViewPr></p:slideViewPr><p:notesTextViewPr><p:cViewPr><p:scale><a:sx n=\"1\" d=\"1\"/><a:sy n=\"1\" d=\"1\"/></p:scale><p:origin x=\"0\" y=\"0\"/></p:cViewPr></p:notesTextViewPr><p:gridSpacing cx=\"73736200\" cy=\"73736200\"/></p:viewPr>"
               )
         );
      } else {
         var8 = var1.n5("/ppt/viewProps.xml", null, new com.aspose.slides.internal.c8m.o1());
         g9m var7 = new g9m(var8, this.n5);
         var7.l6(var2);
      }

      var1.w1().e2().l6(var8);
   }

   private void n5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2, IPptxOptions var3) {
      ImageCollection var4 = (ImageCollection)var2.getImages();
      byte[] var5 = null;
      if (var3 != null && !var3.getRefreshThumbnail()) {
         var5 = ((DocumentProperties)var2.getDocumentProperties()).a6();
         if (var5 == null) {
            return;
         }
      } else {
         com.aspose.slides.internal.o9b.f2 var6 = ((SlideSize)var2.getSlideSize()).n5().a6();
         com.aspose.slides.internal.o9b.p8 var7 = (var6.l6() > var6.k5()
               ? new com.aspose.slides.internal.o9b.p8(
                  256, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(256.0F * var6.k5() / var6.l6())), 14)
               )
               : new com.aspose.slides.internal.o9b.p8(
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(256.0F * var6.l6() / var6.k5())), 14), 256
               ))
            .u3();
         com.aspose.slides.internal.o9b.l6 var8;
         if (var2.getSlides().size() > 0) {
            var8 = ((Slide)var2.getSlides().get_Item(0)).t4().n5(var7.u3());
         } else {
            var8 = new com.aspose.slides.internal.o9b.l6(var7.l6(), var7.k5());
            var8.n5(96.0F, 96.0F);
            com.aspose.slides.internal.o9b.z1 var9 = com.aspose.slides.internal.o9b.z1.n5(var8);
            var9.n5(com.aspose.slides.internal.o9b.a6.u3(), 0, 0, var7.l6(), var7.k5());
         }

         com.aspose.slides.internal.z0k.e2 var15 = new com.aspose.slides.internal.z0k.e2();

         try {
            var8.n5(var15, com.aspose.slides.internal.j9e.x8.c8());
            var8.dispose();
            var5 = var15.toArray();
            ((DocumentProperties)var2.getDocumentProperties()).n5(var5);
         } finally {
            if (var15 != null) {
               var15.dispose();
            }
         }
      }

      com.aspose.slides.internal.c8m.j8 var14 = var1.n5("/docProps/thumbnail.jpeg", null, new com.aspose.slides.internal.c8m.v9(), var5);
      var1.c8().l6(var14);
   }

   private void k5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2, g6c var3) {
      CustomXmlPartCollection var4 = ((Presentation)var2).q0();
      IGenericEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            CustomXmlPart var6 = (CustomXmlPart)var5.next();
            com.aspose.slides.internal.c8m.j8 var7 = var1.n5(
               "/customXml/item{0}.xml", new e1e$1(this, var3), new com.aspose.slides.internal.c8m.d2(), var6.getXmlData()
            );
            com.aspose.slides.internal.c8m.j8 var8 = var1.n5("/customXml/itemProps{0}.xml", new e1e$3(this, var3), new com.aspose.slides.internal.c8m.d5());
            s0c var9 = new s0c(var8, var3);
            var9.l6(var6);
            var7.e2().l6(var8);
            var3.u9().addItem(var6, var1.w1().e2().l6(var7));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.c8m.d9 var1, ISensitivityLabelCollection var2, g6c var3) {
      if (var2.getCount() != 0) {
         com.aspose.slides.internal.c8m.j8 var4 = var1.n5("/docMetadata/LabelInfo.xml", null, new com.aspose.slides.internal.c8m.w5());
         v8p var5 = new v8p(var4, var3);
         var5.l6(var2);
         var1.c8().l6(var4);
      }
   }

   static com.aspose.slides.internal.c8m.j8 n5(com.aspose.slides.internal.c8m.d9 var0, IMasterSlide var1, boolean var2, g6c var3) {
      com.aspose.slides.internal.c8m.j8 var4 = var0.n5("/ppt/slideMasters/slideMaster{0}.xml", new e1e$4(var3), new com.aspose.slides.internal.c8m.s2());
      p2p var5 = new p2p(var4, var3, var1);
      switch (var3.h0()) {
         case 0:
            var0.w1().e2().l6(var4);
         case 1:
         case 2:
            break;
         default:
            throw new Exception();
      }

      var3.l6().addItem(var1, var4.l6());
      if (var2) {
         IGenericEnumerator var6 = var1.getLayoutSlides().iterator();

         try {
            while (var6.hasNext()) {
               ILayoutSlide var7 = (ILayoutSlide)var6.next();
               n5(var0, var7, var4, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      var5.n5(var1, var2);
      MasterThemeManager var11 = (MasterThemeManager)var1.getThemeManager();
      IMasterTheme var12 = var11.n5();
      n5(var0, var12, var3);
      var4.e2().l6(var3.u3().get_Item(var12));
      return var4;
   }

   static com.aspose.slides.internal.c8m.j8 n5(com.aspose.slides.internal.c8m.d9 var0, ILayoutSlide var1, com.aspose.slides.internal.c8m.j8 var2, g6c var3) {
      com.aspose.slides.internal.c8m.j8 var4 = var0.n5("/ppt/slideLayouts/slideLayout{0}.xml", new e1e$5(var3), new com.aspose.slides.internal.c8m.z9());
      p8c var5 = new p8c(var4, var3, var1);
      var5.n5(var1);
      var3.l6().addItem(var1, var4.l6());
      if (var2 != null) {
         var4.e2().l6(var2);
         var2.e2().l6(var4);
      }

      k3.n5(var1.getThemeManager(), var4.e2(), var3);
      return var4;
   }

   static com.aspose.slides.internal.c8m.j8 n5(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, g6c var2) {
      IMasterNotesSlide var3 = var1.getMasterNotesSlideManager().getMasterNotesSlide();
      if (var3 != null) {
         com.aspose.slides.internal.c8m.j8 var4 = var0.n5("/ppt/notesMasters/notesMaster1.xml", null, new com.aspose.slides.internal.c8m.t3());
         p3r var5 = new p3r(var4, var2, var3);
         var5.l6(var3);
         switch (var2.h0()) {
            case 0:
               var0.w1().e2().l6(var4);
            case 1:
            case 2:
               MasterThemeManager var6 = (MasterThemeManager)var3.getThemeManager();
               IMasterTheme var7 = var6.n5();
               n5(var0, var7, var2);
               var4.e2().l6(var2.u3().get_Item(var7));
               return var4;
            default:
               throw new Exception();
         }
      } else {
         return null;
      }
   }

   static com.aspose.slides.internal.c8m.j8 l6(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, g6c var2) {
      boolean var3 = false;
      IGenericEnumerator var4 = var1.getDigitalSignatures().iterator();

      try {
         while (var4.hasNext()) {
            DigitalSignature var5 = (DigitalSignature)var4.next();
            if (var5.getCertificate() != null && var5.n5().t4() != null) {
               var3 = true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (var3) {
         com.aspose.slides.internal.c8m.j8 var17 = var0.n5("/_xmlsignatures/origin.sigs", null, new com.aspose.slides.internal.c8m.o0());
         var17.n5(new byte[0]);
         var17.z1();
         IGenericEnumerator var6 = var1.getDigitalSignatures().iterator();

         try {
            while (var6.hasNext()) {
               DigitalSignature var7 = (DigitalSignature)var6.next();
               if (var7.getCertificate() != null && var7.n5().t4() != null) {
                  com.aspose.slides.internal.c8m.j8 var8 = var0.n5("/_xmlsignatures/sig{0}.xml", new e1e$6(var2), new com.aspose.slides.internal.c8m.z7());
                  o6x var9 = new o6x(var8, var2);
                  var9.l6(var7);
                  var17.e2().l6(var8);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var0.c8().l6(var17);
      }

      return null;
   }

   private void a6(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (((CommentAuthorCollection)var2.getCommentAuthors()).n5() > 0) {
         com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/ppt/commentAuthors.xml", null, new com.aspose.slides.internal.c8m.z8());
         k0b var4 = new k0b(var3, this.n5);
         var4.l6(var2);
         var1.w1().e2().l6(var3);
      }
   }

   private void u9(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (((CommentAuthorCollection)var2.getCommentAuthors()).l6() > 0) {
         com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/ppt/authors.xml", null, new com.aspose.slides.internal.c8m.t2());
         u8 var4 = new u8(var3, this.n5);
         var4.l6(var2);
         var1.w1().e2().l6(var3);
      }
   }

   static com.aspose.slides.internal.c8m.j8 n5(com.aspose.slides.internal.c8m.d9 var0, ISlide var1, g6c var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var0.n5(var2.l6().get_Item(var1), null, new com.aspose.slides.internal.c8m.l0());
      w5r var4 = new w5r(var3, var2, var1);
      switch (var2.h0()) {
         case 0:
            var3.e2().l6(var2.k5().get_Item(var1.getLayoutSlide()));
            var0.w1().e2().l6(var3);
            k3.n5(var1.getThemeManager(), var3.e2(), var2);
         case 1:
         case 2:
            n5(var0, var1, var3, var2);
            switch (var2.h0()) {
               case 0:
               case 1:
                  l6(var0, var1, var3, var2);
                  k5(var0, var1, var3, var2);
               case 2:
                  var4.n5(var1);
                  return var3;
               default:
                  throw new Exception();
            }
         default:
            throw new Exception();
      }
   }

   private static void n5(com.aspose.slides.internal.c8m.d9 var0, ISlide var1, com.aspose.slides.internal.c8m.j8 var2, g6c var3) {
      if (var1.getNotesSlideManager().getNotesSlide() != null) {
         INotesSlide var4 = var1.getNotesSlideManager().getNotesSlide();
         com.aspose.slides.internal.c8m.j8 var5 = var0.n5("/ppt/notesSlides/notesSlide{0}.xml", new e1e$7(var3), new com.aspose.slides.internal.c8m.u4());
         n3e var6 = new n3e(var5, var3, var4);
         var5.e2().l6(var2);
         var2.e2().l6(var5);
         switch (var3.h0()) {
            case 0:
               if (var4.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide() != null) {
                  com.aspose.slides.internal.c8m.j8 var7 = var0.t4()[0];
                  var5.e2().l6(var7);
               }

               k3.n5(var4.getThemeManager(), var5.e2(), var3);
            case 1:
            case 2:
               var6.l6(var4);
               break;
            default:
               throw new Exception();
         }
      }
   }

   private static void l6(com.aspose.slides.internal.c8m.d9 var0, ISlide var1, com.aspose.slides.internal.c8m.j8 var2, g6c var3) {
      IComment[] var4 = ((Slide)var1).n5((ICommentAuthor)null);
      if (var4.length > 0) {
         com.aspose.slides.internal.c8m.j8 var5 = var0.n5("/ppt/comments/comment{0}.xml", new e1e$8(var3), new com.aspose.slides.internal.c8m.z0());
         h9s var6 = new h9s(var5, var3);
         var6.n5(var4);
         var2.e2().l6(var5);
      }
   }

   private static void k5(com.aspose.slides.internal.c8m.d9 var0, ISlide var1, com.aspose.slides.internal.c8m.j8 var2, g6c var3) {
      IComment[] var4 = ((Slide)var1).l6((ICommentAuthor)null);
      if (var4.length > 0) {
         com.aspose.slides.internal.c8m.j8 var5 = var0.n5("/ppt/comments/moderncomment{0}.xml", new e1e$9(var3), new com.aspose.slides.internal.c8m.n2());
         q1c var6 = new q1c(var5, var3);
         var6.n5(var4);
         var2.e2().l6(var5);
      }
   }

   private static void u3(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, g6c var2) {
      IMasterHandoutSlide var3 = var1.getMasterHandoutSlideManager().getMasterHandoutSlide();
      if (var3 != null) {
         com.aspose.slides.internal.c8m.j8 var4 = var0.n5("/ppt/handoutMasters/handoutMaster1.xml", null, new com.aspose.slides.internal.c8m.n1());
         i3t var5 = new i3t(var4, var2, var3);
         var5.l6(var3);
         var0.w1().e2().l6(var4);
         MasterThemeManager var6 = (MasterThemeManager)var3.getThemeManager();
         IMasterTheme var7 = var6.n5();
         n5(var0, var7, var2);
         var4.e2().l6(var2.u3().get_Item(var7));
      }
   }

   private static void n5(com.aspose.slides.internal.c8m.d9 var0, IMasterTheme var1, g6c var2) {
      if (var1 != null && !var2.u3().containsKey(var1)) {
         com.aspose.slides.internal.c8m.j8 var3 = var0.n5("/ppt/theme/theme{0}.xml", new e1e$10(var2), new com.aspose.slides.internal.c8m.j1());
         v6p var4 = new v6p(var3, var2);
         var4.n5(var1);
         var2.u3().addItem(var1, var3);
      }
   }

   static void n5(IOverrideTheme var0, g6c var1) {
      if (var0 != null && !var1.u3().containsKey(var0)) {
         com.aspose.slides.internal.c8m.j8 var2 = var1.a6().n5("/ppt/theme/themeOverride{0}.xml", new e1e$2(var1), new com.aspose.slides.internal.c8m.b1());
         x8c var3 = new x8c(var2, var1);
         var3.n5(var0);
         var1.u3().addItem(var0, var2);
      }
   }

   private void n5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2, int var3) {
      boolean var4 = var3 == 1 || var3 == 3 || var3 == 5;
      if (var2.getVbaProject() != null && var4) {
         com.aspose.slides.internal.c8m.j8 var5 = var1.n5("/ppt/vbaProject.bin", null, new com.aspose.slides.internal.c8m.t0());
         t4w var6 = new t4w();
         var6.n5(var5, var2);
         var1.w1().e2().l6(var5);
      }
   }

   private void h0(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/ppt/tableStyles.xml", null, new com.aspose.slides.internal.c8m.i8());
      i1s var4 = new i1s(var3, this.n5);
      var4.l6(((Presentation)var2).n3().k7());
      var1.w1().e2().l6(var3);
   }
}
