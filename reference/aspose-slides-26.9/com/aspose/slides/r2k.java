package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class r2k {
   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, PdfOptions var2, InterruptionToken var3) {
      int[] var4 = new int[var0.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      n5(var0, var1, var4, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, PdfOptions var3, InterruptionToken var4) {
      k4y var5 = null;
      if (var3 != null && var3.getProgressCallback() != null) {
         var5 = new k4y(var3.getProgressCallback());
         var5.n5(var0, var2);
      }

      com.aspose.slides.internal.z0k.t4 var6 = var1.canSeek() ? var1 : new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.t4r.k5 var7 = new com.aspose.slides.internal.t4r.k5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class, com.aspose.slides.internal.v6g.k5.h0(52428800, 9)
      );
      com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2(
         (float)com.aspose.slides.internal.n2d.t2.l6(((SlideSize)var0.getSlideSize()).n5().l6(), 72.0),
         (float)com.aspose.slides.internal.n2d.t2.l6(((SlideSize)var0.getSlideSize()).n5().k5(), 72.0)
      );
      y4x var9 = new y4x();
      com.aspose.slides.internal.z4.k7 var10 = var3.l6();
      var10.n5(var7);
      com.aspose.slides.internal.z4.c4 var11 = new com.aspose.slides.internal.z4.c4(var6, var10);
      var9.y4 = var3;
      var9.n5 = true;
      var9.u3 = var3.getWarningCallback();
      var9.a6 = var3.getJpegQuality();
      var9.u9 = var3.getSufficientResolution();
      var9.c8 = var3.getDrawSlidesFrame();
      var9.e2.setHideInk(var3.getInkOptions().getHideInk());
      var9.e2.setInterpretMaskOpAsOpacity(var3.getInkOptions().getInterpretMaskOpAsOpacity());
      var9.z1 = var3.getGradientStyle();
      List var12 = n5(var0, var2, var3.getShowHiddenSlides());
      c2m var13 = var0.j5();

      try {
         try {
            var11.l6().n5(var0.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().getLanguageId());
            if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
               boolean var56 = false;
               MasterHandoutSlide var58 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().getMasterHandoutSlide();
               if (var58 == null) {
                  var56 = true;
                  var58 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
               }

               HandoutLayoutingOptions var60 = (HandoutLayoutingOptions)var9.y4.getSlidesLayoutOptions();
               h9j var61 = new h9j(var58, var60, var9.y4.getShowHiddenSlides());
               var61.n5(var11, var2, var9.y4.getSaveMetafilesAsPng(), var7, var9, var12, var4);
               if (var56) {
                  var0.getMasterHandoutSlideManager().removeMasterHandoutSlide();
               }
            } else {
               for (int var17 : var2) {
                  if (var17 >= 1 && var17 <= var0.getSlides().size()) {
                     Slide var18 = (Slide)var0.getSlides().get_Item(var17 - 1);
                     if (var18 != null && (!var18.getHidden() || var3.getShowHiddenSlides())) {
                        com.aspose.slides.internal.e1.w1 var19 = new com.aspose.slides.internal.e1.w1(var8.l6(), var8.k5());
                        w2 var20 = var18.n5(var3.getSaveMetafilesAsPng(), var7, var9, var12, var4);

                        try {
                           var19.n5(var20.y4());
                           var11.l6(var19, new r2k$1(var4));
                           var19.c8();
                           if (var3.k5()) {
                              var18.getShapes().clear();
                           }
                        } finally {
                           if (var20 != null) {
                              var20.dispose();
                           }
                        }
                     }
                  }
               }
            }

            com.aspose.slides.internal.b8.u9 var57 = var11.l6().k5();
            IDocumentProperties var59 = var0.getDocumentProperties();
            var57.a6("Aspose.Slides for Java 26.9");
            var57.k5(var59.getAuthor());
            var57.s7(var59.getCategory());
            var57.l6(((DocumentProperties)var59).l6().m3());
            var57.h0(var59.getComments());
            var57.n5("Aspose.Slides for Java 26.9");
            var57.u9(var59.getKeywords());
            var57.c8(var59.getLastSavedBy());
            var57.n5(((DocumentProperties)var59).u3().m3());
            var57.k5(((DocumentProperties)var59).k5().m3());
            var57.t2(com.aspose.slides.ms.System.a3.n5(var59.getRevisionNumber(), com.aspose.slides.internal.x7n.l6.k5()));
            var57.u3(var59.getSubject());
            var57.l6(var59.getTitle());
            var11.n5();
            var6.flush();
            if (var6 != var1) {
               ((com.aspose.slides.internal.z0k.e2)var6).writeTo(var1);
            }

            if (var5 != null) {
               var5.n5();
            }
         } finally {
            Dictionary$Enumerator var24 = var7.l6().iterator();

            try {
               while (var24.hasNext()) {
                  KeyValuePair var25 = (KeyValuePair)var24.next();
                  if (!var0.c4().n5((com.aspose.slides.internal.k9.h0)var25.getKey())) {
                     ((com.aspose.slides.internal.k9.u9)var25.getValue()).k5().dispose();
                     var7.l6(var25.getKey());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                  var24.dispose();
               }
            }
         }
      } finally {
         if (var13 != null) {
            var13.dispose();
         }
      }
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, PdfOptions var2, InterruptionToken var3) {
      f2z.n5(var0, var1, var2, var3);
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, PdfOptions var3, InterruptionToken var4) {
      f2z.n5(var0, var1, var2, var3, var4);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, SwfOptions var2, InterruptionToken var3) {
      int[] var4 = new int[var0.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      n5(var0, var1, var4, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, SwfOptions var3, InterruptionToken var4) {
      com.aspose.slides.internal.z0k.t4 var5 = var1.canSeek() ? var1 : new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.t4r.n5 var6 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class, 30
      );
      String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{"Aspose.Slides for Java", " ", "26.9"});
      com.aspose.slides.internal.b8.u9 var8 = new com.aspose.slides.internal.b8.u9();
      IDocumentProperties var9 = var0.getDocumentProperties();
      var8.a6(var7);
      var8.k5(var9.getAuthor());
      var8.s7(var9.getCategory());
      var8.l6(((DocumentProperties)var9).l6().m3());
      var8.h0(var9.getComments());
      var8.n5(var7);
      var8.u9(var9.getKeywords());
      var8.c8(var9.getLastSavedBy());
      var8.n5(((DocumentProperties)var9).u3().m3());
      var8.k5(((DocumentProperties)var9).k5().m3());
      var8.t2(com.aspose.slides.ms.System.a3.n5(var9.getRevisionNumber(), com.aspose.slides.internal.x7n.l6.k5()));
      var8.u3(var9.getSubject());
      var8.l6(var9.getTitle());
      com.aspose.slides.internal.p5k.j5 var10 = new com.aspose.slides.internal.p5k.j5(var5, var8, var3.n5());
      y4x var11 = new y4x();
      var11.n5 = true;
      var11.u3 = var3.getWarningCallback();
      var11.u9 = 96.0F;
      List var12 = n5(var0, var2, var3.getShowHiddenSlides());
      c2m var13 = var0.j5();

      try {
         try {
            for (int var17 : var2) {
               if (var17 >= 1 && var17 <= var0.getSlides().size()) {
                  Slide var18 = (Slide)var0.getSlides().get_Item(var17 - 1);
                  if (var18 != null && (!var18.getHidden() || var3.getShowHiddenSlides())) {
                     com.aspose.slides.internal.e1.w1 var19 = new com.aspose.slides.internal.e1.w1(
                        ((SlideSize)var0.getSlideSize()).n5().l6(), ((SlideSize)var0.getSlideSize()).n5().k5()
                     );
                     w2 var20 = var18.n5(true, var6, var11, var12, var4);
                     var19.n5(var20.y4());
                     var10.l6(var19, new r2k$2(var4));
                  }
               }
            }

            var10.n5();
            var5.flush();
            if (var5 != var1) {
               ((com.aspose.slides.internal.z0k.e2)var5).writeTo(var1);
            }
         } finally {
            Dictionary$Enumerator var23 = var6.l6().iterator();

            try {
               while (var23.hasNext()) {
                  KeyValuePair var24 = (KeyValuePair)var23.next();
                  if (!var0.c4().n5((com.aspose.slides.internal.k9.h0)var24.getKey())) {
                     ((com.aspose.slides.internal.k9.u9)var24.getValue()).k5().dispose();
                     var6.l6(var24.getKey());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
                  var23.dispose();
               }
            }
         }
      } finally {
         if (var13 != null) {
            var13.dispose();
         }
      }
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, SwfOptions var2, InterruptionToken var3) {
      f2z.n5(var0, var1, var2, var3);
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, SwfOptions var3, InterruptionToken var4) {
      f2z.n5(var0, var1, var2, var3, var4);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, XpsOptions var2, InterruptionToken var3) {
      int[] var4 = new int[var0.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      n5(var0, var1, var4, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, XpsOptions var3, InterruptionToken var4) {
      com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2(
         (float)com.aspose.slides.internal.n2d.t2.l6(((SlideSize)var0.getSlideSize()).n5().l6(), 72.0),
         (float)com.aspose.slides.internal.n2d.t2.l6(((SlideSize)var0.getSlideSize()).n5().k5(), 72.0)
      );
      com.aspose.slides.internal.b8.u9 var6 = new com.aspose.slides.internal.b8.u9();
      com.aspose.slides.internal.z6z.n3 var7 = new com.aspose.slides.internal.z6z.n3();
      com.aspose.slides.internal.z6z.q0 var8 = new com.aspose.slides.internal.z6z.q0(var6, var7);
      com.aspose.slides.internal.t4r.n5 var9 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class, 4
      );
      y4x var10 = new y4x();
      var10.n5 = true;
      var10.u3 = var3.getWarningCallback();
      var10.c8 = var3.getDrawSlidesFrame();
      var10.t9 = 2.0F;
      var10.z1 = var3.getGradientStyle();
      List var11 = n5(var0, var2, var3.getShowHiddenSlides());
      c2m var12 = var0.j5();

      try {
         try {
            for (int var16 : var2) {
               if (var16 >= 1 && var16 <= var0.getSlides().size()) {
                  Slide var17 = (Slide)var0.getSlides().get_Item(var16 - 1);
                  if (var17 != null && (!var17.getHidden() || var3.getShowHiddenSlides())) {
                     com.aspose.slides.internal.e1.w1 var18 = new com.aspose.slides.internal.e1.w1(var5.l6(), var5.k5());
                     w2 var19 = var17.n5(var3.getSaveMetafilesAsPng(), var9, var10, var11, var4);

                     try {
                        var18.n5(var19.y4());
                        var8.n5((com.aspose.slides.internal.e1.m3)var18);
                     } finally {
                        if (var19 != null) {
                           var19.dispose();
                        }
                     }
                  }
               }
            }

            var8.n5();
            var8.l6().n5(var1);
            var1.flush();
            if (var3.getWarningCallback() != null && var8.k5().size() > 0) {
               IGenericEnumerator var67 = var8.k5().iterator();

               try {
                  while (var67.hasNext()) {
                     com.aspose.slides.internal.b8.n3 var68 = (com.aspose.slides.internal.b8.n3)var67.next();
                     byte var69;
                     switch (var68.n5()) {
                        case 1:
                           var69 = 1;
                           break;
                        case 2:
                           var69 = 2;
                           break;
                        case 3:
                           var69 = 3;
                           break;
                        default:
                           var69 = 99;
                     }

                     com.aspose.slides.internal.n8e.u6 var70 = new com.aspose.slides.internal.n8e.u6(var68.l6(), var69);
                     var70.sendWarning(var3.getWarningCallback());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var67, IDisposable.class)) {
                     var67.dispose();
                  }
               }
            }
         } finally {
            Dictionary$Enumerator var24 = var9.l6().iterator();

            try {
               while (var24.hasNext()) {
                  KeyValuePair var25 = (KeyValuePair)var24.next();
                  if (!var0.c4().n5((com.aspose.slides.internal.k9.h0)var25.getKey())) {
                     ((com.aspose.slides.internal.k9.u9)var25.getValue()).k5().dispose();
                     var9.l6(var25.getKey());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                  var24.dispose();
               }
            }
         }
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, TiffOptions var2, InterruptionToken var3) {
      int[] var4 = new int[var0.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      l6(var0, var1, var4, var2, var3);
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, TiffOptions var2, InterruptionToken var3) {
      f2z.n5(var0, var1, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, TiffOptions var3, InterruptionToken var4) {
      f2z.n5(var0, var1, var2, var3, var4);
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, TiffOptions var3, InterruptionToken var4) {
      com.aspose.slides.internal.j9e.s7 var5 = null;

      for (com.aspose.slides.internal.j9e.s7 var9 : com.aspose.slides.internal.j9e.s7.n5()) {
         if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var9.h0()), "image/tiff")) {
            var5 = var9;
         }
      }

      com.aspose.slides.internal.j9e.a6 var24 = com.aspose.slides.internal.j9e.a6.h0;
      if (var5 == null) {
         throw new PptException("Multi-page TIFF encoder not found.");
      }

      com.aspose.slides.internal.j9e.h0 var25;
      if (var3.getCompressionType() != 0) {
         var25 = new com.aspose.slides.internal.j9e.h0(3);
         var25.n5()[1] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.k5, n5(var3.getCompressionType()));
         var25.n5()[2] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.l6, (long)var3.getPixelFormat());
      } else {
         var25 = new com.aspose.slides.internal.j9e.h0(2);
         var25.n5()[1] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.l6, (long)var3.getPixelFormat());
      }

      c2m var26 = var0.j5();

      try {
         if (!com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
            com.aspose.slides.internal.o9b.l6 var27 = null;

            for (int var10 = 0; var10 < var2.length; var10++) {
               var4.throwIfInterruptionRequested();
               int var11 = var2[var10] - 1;
               if (var11 >= 0 && var11 <= var0.getSlides().size() - 1) {
                  Slide var12 = (Slide)var0.getSlides().get_Item(var11);
                  if (var12 != null && (!var12.getHidden() || var3.getShowHiddenSlides())) {
                     com.aspose.slides.internal.o9b.f2 var13 = (com.aspose.slides.internal.v6g.k5.l6(
                                 var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class
                              )
                              && ((NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions()).getNotesPosition() != 0
                           ? ((NotesSize)var0.getNotesSize()).n5()
                           : ((SlideSize)var0.getSlideSize()).n5())
                        .a6();
                     int var14 = !var3.n5().n5()
                        ? var3.n5().l6()
                        : com.aspose.slides.internal.v6g.k5.u3(
                           com.aspose.slides.internal.n2d.t2.n5(var13.l6(), 96.0) * ((float)(var3.getDpiX() & 4294967295L) / 96.0F), 14
                        );
                     int var15 = !var3.n5().n5()
                        ? var3.n5().k5()
                        : com.aspose.slides.internal.v6g.k5.u3(
                           com.aspose.slides.internal.n2d.t2.n5(var13.k5(), 96.0) * ((float)(var3.getDpiY() & 4294967295L) / 96.0F), 14
                        );
                     com.aspose.slides.internal.o9b.p8 var16 = new com.aspose.slides.internal.o9b.p8(var14, var15);
                     com.aspose.slides.internal.t4r.n5 var17 = new com.aspose.slides.internal.t4r.n5<>(
                        com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
                     );
                     y4x var18 = new y4x();
                     var18.e2.setHideInk(var3.getInkOptions().getHideInk());
                     var18.e2.setInterpretMaskOpAsOpacity(var3.getInkOptions().getInterpretMaskOpAsOpacity());
                     var18.z1 = var3.getGradientStyle();
                     s5u var19 = new s5u(var12, var17, var18);
                     com.aspose.slides.internal.o9b.l6 var20;
                     if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                        && ((NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions()).getNotesPosition() != 0) {
                        if (var12.getNotesSlideManager().getNotesSlide() == null) {
                           var12.getNotesSlideManager().addNotesSlide();
                        }

                        var20 = ((NotesSlide)var12.getNotesSlideManager().getNotesSlide()).t4().n5(var16.u3(), var18);
                     } else {
                        var20 = var12.t4().n5(var16.u3(), var19);
                     }

                     var20.n5((float)(var3.getDpiX() & 4294967295L), (float)(var3.getDpiY() & 4294967295L));
                     if ((var3.getCompressionType() == 2 || var3.getCompressionType() == 3) && var3.getBwConversionMode() != 0) {
                        var20 = l1.n5(var20, var3.getBwConversionMode());
                     }

                     if (var20 != null) {
                        if (var27 == null) {
                           var27 = var20;
                           var25.n5()[0] = new com.aspose.slides.internal.j9e.u9(var24, 18L);
                           var27.n5(var1, var5, var25);
                        } else {
                           var25.n5()[0] = new com.aspose.slides.internal.j9e.u9(var24, 23L);
                           var27.n5(var20, var25);
                        }
                     }
                  }
               }
            }

            if (var27 != null) {
               var25.n5()[0] = new com.aspose.slides.internal.j9e.u9(var24, 20L);
               var27.n5(var25);
            }
         } else {
            boolean var28 = false;
            MasterHandoutSlide var29 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().getMasterHandoutSlide();
            if (var29 == null) {
               var28 = true;
               var29 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
            }

            h9j var30 = new h9j(var29, (HandoutLayoutingOptions)var3.getSlidesLayoutOptions(), var3.getShowHiddenSlides());
            var30.n5(var2, var5, var1, var3, var25, var4);
            if (var28) {
               var0.getMasterHandoutSlideManager().removeMasterHandoutSlide();
            }
         }
      } finally {
         if (var26 != null) {
            var26.dispose();
         }
      }
   }

   static void n5(Slide var0, com.aspose.slides.internal.z0k.t4 var1, ITiffOptions var2) {
      com.aspose.slides.internal.j9e.s7 var3 = null;

      for (com.aspose.slides.internal.j9e.s7 var7 : com.aspose.slides.internal.j9e.s7.n5()) {
         if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var7.h0()), "image/tiff")) {
            var3 = var7;
         }
      }

      if (var3 == null) {
         throw new PptException("TIFF encoder not found.");
      }

      com.aspose.slides.internal.j9e.h0 var13;
      if (var2.getCompressionType() != 0) {
         var13 = new com.aspose.slides.internal.j9e.h0(3);
         var13.n5()[1] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.k5, n5(var2.getCompressionType()));
         var13.n5()[2] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.l6, (long)var2.getPixelFormat());
      } else {
         var13 = new com.aspose.slides.internal.j9e.h0(2);
         var13.n5()[1] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.l6, (long)var2.getPixelFormat());
      }

      com.aspose.slides.internal.o9b.f2 var15 = ((SlideSize)var0.z1().getSlideSize()).n5().a6();
      int var16 = !((TiffOptions)var2).n5().n5()
         ? ((TiffOptions)var2).n5().l6()
         : com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n5(var15.l6(), 96.0) * ((float)(var2.getDpiX() & 4294967295L) / 96.0F), 14);
      int var8 = !((TiffOptions)var2).n5().n5()
         ? ((TiffOptions)var2).n5().k5()
         : com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n5(var15.k5(), 96.0) * ((float)(var2.getDpiY() & 4294967295L) / 96.0F), 14);
      com.aspose.slides.internal.o9b.p8 var9 = new com.aspose.slides.internal.o9b.p8(var16, var8);
      com.aspose.slides.internal.t4r.n5 var10 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      y4x var11 = new y4x();
      var11.e2.setHideInk(var2.getInkOptions().getHideInk());
      var11.e2.setInterpretMaskOpAsOpacity(var2.getInkOptions().getInterpretMaskOpAsOpacity());
      var11.z1 = var2.getGradientStyle();
      s5u var12 = new s5u(var0, var10, var11);
      com.aspose.slides.internal.o9b.l6 var14 = var0.t4().n5(var9.u3(), var12);
      var14.n5((float)(var2.getDpiX() & 4294967295L), (float)(var2.getDpiY() & 4294967295L));
      var13.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 18L);
      var14.n5(var1, var3, var13);
      var13.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 20L);
      var14.n5(var13);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, HtmlOptions var2, InterruptionToken var3) {
      int[] var4 = new int[var0.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      n5(var0, var1, var4, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, Html5Options var2, InterruptionToken var3) {
      int[] var4 = new int[var0.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      n5(var0, var1, var4, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, HtmlOptions var3, InterruptionToken var4) {
      if (var3 == null) {
         var3 = new HtmlOptions();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
         boolean var72 = false;
         MasterHandoutSlide var73 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().getMasterHandoutSlide();
         if (var73 == null) {
            var72 = true;
            var73 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
         }

         h9j var74 = new h9j(var73, (HandoutLayoutingOptions)var3.getSlidesLayoutOptions(), var3.getShowHiddenSlides());
         var74.n5(var1, var2, var3, var4);
         if (var72) {
            var0.getMasterHandoutSlideManager().removeMasterHandoutSlide();
         }
      } else {
         ILinkEmbedController var5 = var3.l6();
         y4x var6 = new y4x();
         var6.u9 = 96.0F;
         var6.t2 = var3.k5().k5();
         var6.s7 = var3.getDeletePicturesCroppedAreas();
         var6.e2.setHideInk(var3.getInkOptions().getHideInk());
         var6.e2.setInterpretMaskOpAsOpacity(var3.getInkOptions().getInterpretMaskOpAsOpacity());
         var6.z1 = var3.getGradientStyle();
         var6.t4 = var3.getDisableFontLigatures();
         v3s var7 = new v3s();
         a4w var8 = new a4w(var7);
         SVGOptions var9 = null;
         q4b[] var10 = null;
         String[] var11 = new String[var0.getSlides().size()];
         String[] var12 = new String[var0.getSlides().size()];
         int[] var13 = null;
         com.aspose.slides.internal.z0k.j5 var14 = new com.aspose.slides.internal.z0k.j5(var1, new com.aspose.slides.internal.l7h.u6(true));
         List var15 = new List();
         SlideImageFormat var16 = var3.n5();
         int var17 = var16.n5();
         String var18 = "image/svg+xml";
         String var19 = "svg";
         com.aspose.slides.internal.j9e.s7 var20 = null;
         com.aspose.slides.internal.j9e.h0 var21 = null;
         com.aspose.slides.internal.o9b.f2 var22 = (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions()).getNotesPosition() != 0
               ? ((NotesSize)var0.getNotesSize()).n5()
               : ((SlideSize)var0.getSlideSize()).n5())
            .a6();
         HtmlGenerator var23;
         if (var17 == 1) {
            var23 = new HtmlGenerator(var14, var22.a6(), 3, var2);
            var13 = new int[var0.getSlides().size()];
            if (var16.l6() == 5) {
               var18 = "image/jpeg";
               var19 = "jpg";
               var21 = new com.aspose.slides.internal.j9e.h0(1);
               var21.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, var3.getJpegQuality() & 255);
            } else if (var16.l6() == 6) {
               var18 = "image/png";
               var19 = "png";
            } else {
               if (var16.l6() != 7) {
                  throw new ArgumentException("Unsupported image format");
               }

               var18 = "image/tiff";
               var19 = "tif";
            }

            for (com.aspose.slides.internal.j9e.s7 var27 : com.aspose.slides.internal.j9e.s7.n5()) {
               if (com.aspose.slides.ms.System.d1.a6(var27.h0(), var18)) {
                  var20 = var27;
                  break;
               }
            }
         } else {
            boolean var75 = false;
            com.aspose.slides.internal.o9b.f2 var77 = new com.aspose.slides.internal.o9b.f2(var22.l6() / 72.0F, var22.k5() / 72.0F);
            var23 = new HtmlGenerator(var14, var77.a6(), 0, var2);
            var6.h0 = true;
            var10 = new q4b[var0.getSlides().size()];
            var9 = (SVGOptions)(
               var3.getSlideImageFormat() != null && ((SlideImageFormat)var3.getSlideImageFormat()).k5() != null
                  ? ((SlideImageFormat)var3.getSlideImageFormat()).k5().u3()
                  : null
            );
            if (var9 == null) {
               var9 = new SVGOptions();
               var9.setDefaultRegularFont(var3.getDefaultRegularFont());
               var9.setJpegQuality(var3.getJpegQuality() & 255);
               var9.setPicturesCompression(var3.getPicturesCompression());
            }

            var9.n5(var5);
            var9.setDeletePicturesCroppedAreas(var3.getDeletePicturesCroppedAreas());
            var9.setSkipJavaScriptLinks(var3.getSkipJavaScriptLinks());
         }

         HtmlFormatter var76 = var3.n5(com.aspose.slides.internal.v6g.k5.u3(var22.k5() / var22.l6() * 100.0F, 13));
         c2m var78 = var0.j5();

         try {
            com.aspose.slides.internal.t4r.n5 var79 = new com.aspose.slides.internal.t4r.n5<>(
               com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
            );

            try {
               EmbedAllFontsHtmlController var80 = com.aspose.slides.internal.v6g.k5.n5(var76.n5(), EmbedAllFontsHtmlController.class);
               if (var80 != null) {
                  var8.n5(n5(var0, var80, var2));
                  var8.n5(var80.getControllerInternal().n5());
               }

               n5(var0, var2, var11, var12, var13, var10, var15, var18, var8, var7, var5, var19, var17, var9, var3);
               var76.n5(var23, var0);

               for (j0v var31 : var8.k5()) {
                  var8.x8.addItem(var31.u3());
               }

               if (!com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
                  for (int var81 = 0; var81 < var15.size(); var81++) {
                     var4.throwIfInterruptionRequested();
                     int var82 = (Integer)var15.get_Item(var81);
                     int var83 = var81 > 0 ? (Integer)var15.get_Item(var81) : -1;
                     int var84 = var81 + 1 < var15.size() ? (Integer)var15.get_Item(var81 + 1) : -1;
                     Slide var32 = (Slide)var0.getSlides().get_Item(var82);
                     var23.n5(var83, var82, var84);
                     var76.n5(var23, var32);
                     var23.n5();
                     if (var12[var82] == null) {
                        if (var17 == 0) {
                           q4b var33 = var10[var82];
                           var33.n3 = true;
                           if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                              && ((NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions()).getNotesPosition() != 0) {
                              INotesSlide var87 = var32.getNotesSlideManager().getNotesSlide();
                              if (var87 == null) {
                                 var87 = var32.getNotesSlideManager().addNotesSlide();
                              }

                              c0z var35 = new c0z(var87, var79, var6, var23, var76.n5(), var9.getShapeFormattingController());
                              ((NotesSlide)var87).t4().n5(var33, var35, var6);
                           } else {
                              c0z var34 = new c0z(var32, var79, var6, var23, var76.n5(), var9.getShapeFormattingController());
                              var32.t4().n5(var33, null, var34, var6, var4);
                           }

                           if (var33.k5()) {
                              var33.n5(var23.k5(), false);
                           }
                        } else {
                           com.aspose.slides.internal.o9b.f2 var85 = ((SlideSize)var0.getSlideSize()).n5().a6();
                           com.aspose.slides.internal.o9b.p8 var88 = new com.aspose.slides.internal.o9b.p8(
                              com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var85.l6() * var16.u3()), 14),
                              com.aspose.slides.internal.v6g.k5.u3(
                                 com.aspose.slides.ms.System.q1.u3(com.aspose.slides.internal.v6g.k5.u3(var85.k5(), 13) * var16.u3()), 14
                              )
                           );
                           com.aspose.slides.internal.o9b.l6 var91 = var32.t4().l6(var88.u3());
                           n5(var14, var91, var20, var21);
                        }
                     } else {
                        com.aspose.slides.internal.z0k.e2 var86 = new com.aspose.slides.internal.z0k.e2();

                        try {
                           if (var17 == 0) {
                              if (var10 == null) {
                                 throw new NullReferenceException("Canvas couldn't be empty.");
                              }

                              q4b var89 = var10[var82];
                              if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                                 && ((NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions()).getNotesPosition() != 0) {
                                 INotesSlide var93 = var32.getNotesSlideManager().getNotesSlide();
                                 if (var93 == null) {
                                    var93 = var32.getNotesSlideManager().addNotesSlide();
                                 }

                                 c0z var36 = new c0z(var93, var79, var6, var23, var76.n5(), var9.getShapeFormattingController());
                                 ((NotesSlide)var93).t4().n5(var89, var36, var6);
                              } else {
                                 c0z var92 = new c0z(var32.t4().l6(), var79, var6, var23, var76.n5(), var9.getShapeFormattingController());
                                 var32.t4().n5(var89, null, var92, var6, var4);
                              }

                              var89.n5(var86, true);
                              var5.saveExternal(var89.s7, var86.toArray());
                              var14.l6(com.aspose.slides.ms.System.d1.n5("<object data=\"{0}\" type=\"image/svg+xml\"></object>", new Object[]{var12[var82]}));
                           } else {
                              com.aspose.slides.internal.o9b.f2 var90 = ((SlideSize)var0.getSlideSize()).n5().a6();
                              com.aspose.slides.internal.o9b.p8 var94 = new com.aspose.slides.internal.o9b.p8(
                                 com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var90.l6() * var16.u3()), 14),
                                 com.aspose.slides.internal.v6g.k5.u3(
                                    com.aspose.slides.ms.System.q1.u3(com.aspose.slides.internal.v6g.k5.u3(var90.k5(), 13) * var16.u3()), 14
                                 )
                              );
                              com.aspose.slides.internal.o9b.l6 var95 = var32.t4().l6(var94.u3());
                              var95.n5(var86, var20, var21);
                              var5.saveExternal(var13[var82], var86.toArray());
                              var14.l6(com.aspose.slides.ms.System.d1.n5("<img src=\"{0}\" class=\"slideImage\">", new Object[]{var12[var82]}));
                           }
                        } finally {
                           if (var86 != null) {
                              var86.dispose();
                           }
                        }
                     }

                     var76.l6(var23, var32);
                     var23.n5();
                  }
               }

               var76.l6(var23, var0);
               var23.n5();
               var14.k5();
            } finally {
               Dictionary$Enumerator var40 = var79.l6().iterator();

               try {
                  while (var40.hasNext()) {
                     KeyValuePair var41 = (KeyValuePair)var40.next();
                     if (!var0.c4().n5((com.aspose.slides.internal.k9.h0)var41.getKey())) {
                        ((com.aspose.slides.internal.k9.u9)var41.getValue()).k5().dispose();
                        var79.l6(var41.getKey());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
                     var40.dispose();
                  }
               }
            }
         } finally {
            if (var78 != null) {
               var78.dispose();
            }
         }
      }
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, Html5Options var3, InterruptionToken var4) {
      if (var3 == null) {
         var3 = new Html5Options();
      }

      n5(var0, var1, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, IHtml5Options var3) {
      WebDocumentOptions var4 = new WebDocumentOptions();
      var4.setTemplateEngine(new f5l());
      var4.setOutputSaver(new f6r());
      var4.setEmbedImages(var3.getEmbedImages());
      var4.setAnimateShapes(var3.getAnimateShapes());
      var4.setAnimateTransitions(var3.getAnimateTransitions());
      WebDocument var5 = new WebDocument(var4);
      String var6 = var3.getOutputPath();
      if (com.aspose.slides.ms.System.d1.n5(var6) && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.n3.class)) {
         var6 = com.aspose.slides.internal.z0k.z1.u9(((com.aspose.slides.internal.z0k.n3)var1).n5());
      }

      var5.getGlobal().put("slideMargin", 10);
      var5.getGlobal().put("embedImages", var3.getEmbedImages());
      var5.getGlobal().put("animateTransitions", var3.getAnimateTransitions());
      var5.getGlobal().put("animateShapes", var3.getAnimateShapes());
      var5.getGlobal().put("navigationEnabled", false);
      var5.getGlobal().put("slidesPath", var6);
      var5.getGlobal().put("stylesPath", var6);
      var5.getGlobal().put("scriptsPath", var6);
      var5.getGlobal().put("mediaPath", var6);
      var5.getGlobal().put("slideIndicies", var2);
      var5.getGlobal().put("disableFontLigatures", var3.getDisableFontLigatures());
      var5.getGlobal().put("skipJavaScriptLinks", var3.getSkipJavaScriptLinks());
      if (var3.getSlidesLayoutOptions() != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
            NotesCommentsLayoutingOptions var7 = (NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions();
            var5.getGlobal().put("notesPosition", com.aspose.slides.ms.System.s3.n5(NotesPositions.class, var7.getNotesPosition()));
            var5.getGlobal().put("commentsPosition", com.aspose.slides.ms.System.s3.n5(CommentsPositions.class, var7.getCommentsPosition()));
            var5.getGlobal().put("commentsAreaWidth", var7.getCommentsAreaWidth());
            var5.getGlobal().put("commentsAreaColor", var7.n5().o8());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
            HandoutLayoutingOptions var9 = (HandoutLayoutingOptions)var3.getSlidesLayoutOptions();
            var5.getGlobal().put("handout", var9.getHandout());
            var5.getGlobal().put("printComments", var9.getPrintComments());
            var5.getGlobal().put("printSlideNumbers", var9.getPrintSlideNumbers());
            var5.getGlobal().put("printFrameSlide", var9.getPrintFrameSlide());
         }
      }

      var5.getInput().n5("styles-pres", new t1u(null, null));
      var5.getInput().n5("styles-master", new s8p(null, null));
      var5.getInput().n5("scripts-animation", new s6b(null, null));
      var5.getInput().n5("scripts-effects", new x8f(null, null));
      var5.getInput().n5("scripts-navigation", new o5i(null, null));
      var5.getInput().n5("index", new q3j(null, null));
      var5.getInput().n5("slide", new n1e(null, null));
      var5.getInput().n5("comments", new a8y(null, null));
      var5.getInput().n5("autoshape", new p7(null, null));
      var5.getInput().n5("textframe", new b5e(null, null));
      var5.getInput().n5("paragraph", new q8j(null, null));
      var5.getInput().n5("bullet", new v1(null, null));
      var5.getInput().n5("portion", new o4a(null, null));
      var5.getInput().n5("videoframe", new x2j(null, null));
      var5.getInput().n5("pictureframe", new u6g(null, null));
      var5.getInput().n5("table", new h7e(null, null));
      var5.getInput().n5("shape", new c5p(null, null));
      if (var3.getPicturesCompression() != 5) {
         var5.getGlobal().put("picturesCompression", var3.getPicturesCompression());
      }

      if (!var3.getEmbedImages()) {
         String var10 = var3.getOutputPath();
         if (com.aspose.slides.ms.System.d1.n5(var10) && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.n3.class)) {
            var10 = com.aspose.slides.internal.z0k.z1.u9(((com.aspose.slides.internal.z0k.n3)var1).n5());
         }

         String var8 = com.aspose.slides.internal.z0k.z1.l6(var10, "images");
         var5.getGlobal().put("slidesPath", var10);
         var5.getGlobal().put("imagesPath", var8);
         n5(var5, var3, var8, var0);
         n5(var5, var8, (IPresentation)var0);
      }

      var5.getOutput().n5(var1, "index", var0);
      if (var6 != null) {
         var5.getOutput().add(com.aspose.slides.internal.z0k.z1.l6(var6, "pres.css"), "styles-pres", var0);
         var5.getOutput().add(com.aspose.slides.internal.z0k.z1.l6(var6, "master.css"), "styles-master", (MasterSlide)var0.getMasters().get_Item(0));
         var5.getOutput().add(com.aspose.slides.internal.z0k.z1.l6(var6, "animation.js"), "scripts-animation", var0);
         var5.getOutput().add(com.aspose.slides.internal.z0k.z1.l6(var6, "effects.js"), "scripts-effects", var0);
         var5.getOutput().add(com.aspose.slides.internal.z0k.z1.l6(var6, "navigation.js"), "scripts-navigation", var0);
         n5(var5, var5.getGlobal().get("mediaPath"), var0);
         l6(var5, var5.getGlobal().get("mediaPath"), var0);
      }

      var5.save();
   }

   public static void n5(WebDocument var0, String var1, Presentation var2) {
      List var3 = o6c.n5(VideoFrame.class, var2);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         Video var5 = com.aspose.slides.internal.v6g.k5.n5(((VideoFrame)var3.get_Item(var4)).getEmbeddedVideo(), Video.class);
         String var6 = var5.u3();
         String var7 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5("video{0}.{1}",new Object[]{ var4, var6}));
         IOutputFile var8 = var0.getOutput().add(var7, var5);
         var0.getOutput().bindResource(var8, var5);
      }
   }

   public static void l6(WebDocument var0, String var1, Presentation var2) {
      List var3 = new List();
      List$Enumerator var4 = o6c.n5(AudioFrame.class, var2).iterator();

      try {
         while (var4.hasNext()) {
            AudioFrame var5 = (AudioFrame)var4.next();
            if (var5.getEmbeddedAudio() != null && !var3.containsItem(var5.getEmbeddedAudio())) {
               var3.addItem(var5.getEmbeddedAudio());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      IGenericEnumerator var43 = var2.getSlides().iterator();

      try {
         while (var43.hasNext()) {
            Slide var6 = (Slide)var43.next();
            n5(var6.getTimeline().getMainSequence(), var3);
            IGenericEnumerator var7 = var6.getTimeline().getInteractiveSequences().iterator();

            try {
               while (var7.hasNext()) {
                  ISequence var8 = (ISequence)var7.next();
                  n5(var8, var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }

            n5(var6.getLayoutSlide().getTimeline().getMainSequence(), var3);
            IGenericEnumerator var46 = var6.getLayoutSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var46.hasNext()) {
                  ISequence var9 = (ISequence)var46.next();
                  n5(var9, var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var46, IDisposable.class)) {
                  var46.dispose();
               }
            }

            n5(var6.getLayoutSlide().getMasterSlide().getTimeline().getMainSequence(), var3);
            IGenericEnumerator var48 = var6.getLayoutSlide().getMasterSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var48.hasNext()) {
                  ISequence var10 = (ISequence)var48.next();
                  n5(var10, var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
                  var48.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }

      for (int var44 = 0; var44 < var3.size(); var44++) {
         IAudio var45 = (IAudio)var3.get_Item(var44);
         String var47 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5("audio{0}.{1}",new Object[]{ var44, n5(var45)}));
         IOutputFile var49 = var0.getOutput().add(var47, var45);
         var0.getOutput().bindResource(var49, var45);
      }
   }

   private static void n5(ISequence var0, List<IAudio> var1) {
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IEffect var3 = (IEffect)var2.next();
            if (var3.getSound() != null && !var1.containsItem(var3.getSound())) {
               var1.addItem(var3.getSound());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static String n5(IAudio var0) {
      Audio var1 = com.aspose.slides.internal.v6g.k5.n5(var0, Audio.class);
      if (var1 != null && !com.aspose.slides.ms.System.d1.n5(var1.u9())) {
         return var1.u9();
      }

      String var2 = var0.getContentType();
      if (com.aspose.slides.ms.System.d1.u3(var2, "audio/mpeg", (short)5)) {
         return "mp3";
      }

      if (com.aspose.slides.ms.System.d1.u3(var2, "audio/x-wav", (short)5)) {
         return "wav";
      }

      int var3 = var2 == null ? -1 : com.aspose.slides.ms.System.d1.u3(var2, '/');
      return var3 >= 0 && var3 < var2.length() - 1 ? com.aspose.slides.ms.System.d1.k5(var2, var3 + 1) : "wav";
   }

   static void n5(WebDocument var0, String var1, IPresentation var2) {
      long var3 = 0L;
      List var5 = new List();
      IGenericEnumerator var6 = var2.getSlides().iterator();

      try {
         while (var6.hasNext()) {
            ISlide var7 = (ISlide)var6.next();
            List var8 = new List();
            IGenericEnumerator var9 = var7.getShapes().iterator();

            try {
               while (var9.hasNext()) {
                  IShape var10 = (IShape)var9.next();
                  var8.addItem(var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }

            List$Enumerator var50 = var8.iterator();

            try {
               while (var50.hasNext()) {
                  IShape var11 = (IShape)var50.next();
                  long[] var12 = new long[]{var3};
                  n5(var11, var0, var1, var2, var12);
                  var3 = var12[0];
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
                  var50.dispose();
               }
            }

            if (!var5.containsItem(var7.getLayoutSlide())) {
               var5.addItem(var7.getLayoutSlide());
            }

            if (!var5.containsItem(var7.getLayoutSlide().getMasterSlide())) {
               var5.addItem(var7.getLayoutSlide().getMasterSlide());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      IGenericEnumerator var47 = var5.iterator();

      try {
         while (var47.hasNext()) {
            IBaseSlide var48 = (IBaseSlide)var47.next();
            IGenericEnumerator var49 = var48.getShapes().iterator();

            try {
               while (var49.hasNext()) {
                  IShape var51 = (IShape)var49.next();
                  long[] var52 = new long[]{var3};
                  n5(var51, var0, var1, var2, var52);
                  var3 = var52[0];
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
                  var49.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var47, IDisposable.class)) {
            var47.dispose();
         }
      }
   }

   static void n5(WebDocument var0, IHtml5Options var1, String var2, IPresentation var3) {
      for (int var4 = 0; var4 < var3.getImages().size(); var4++) {
         IPPImage var5 = var3.getImages().get_Item(var4);
         String var6;
         if (!"image/x-emf".equals(var5.getContentType()) && !"image/x-wmf".equals(var5.getContentType())) {
            var6 = ((PPImage)var5).l6().u3();
         } else {
            var6 = "png";
         }

         String var7 = com.aspose.slides.internal.z0k.z1.l6(var2, com.aspose.slides.ms.System.d1.n5("image{0}.{1}",new Object[]{ var4, var6}));
         byte[] var8 = h5s.n5(var3, var5, var1.getPicturesCompression());
         if (var8 != null) {
            IOutputFile var9 = var0.getOutput().n5(com.aspose.slides.internal.z0k.z1.n5(var7, "png"), var8);
            var0.getOutput().bindResource(var9, var5);
         } else {
            IOutputFile var10 = var0.getOutput().add(var7, var5);
            var0.getOutput().bindResource(var10, var5);
         }
      }
   }

   private static void n5(IShape var0, WebDocument var1, String var2, IPresentation var3, long[] var4) {
      if (!var0.getHidden()) {
         AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
         if (var5 == null || var5.getShapeType() != 5 && var5.getShapeType() != -1) {
            IVideoFrame var6 = com.aspose.slides.internal.v6g.k5.n5(var0, IVideoFrame.class);
            if (var6 != null) {
               Video var18 = (Video)var6.getEmbeddedVideo();
               String var19 = com.aspose.slides.internal.z0k.z1.l6(
                  var2, com.aspose.slides.ms.System.d1.n5("video{0}.{1}",new Object[]{ Long.valueOf((long)(var4[0]++)), var18.u3()})
               );
               IOutputFile var21 = var1.getOutput().add(var19, var18);
               var1.getOutput().bindResource(var21, var18);
            } else if (!com.aspose.slides.internal.v6g.k5.l6(var0, IPictureFrame.class)) {
               IImage var7;
               if (var5 != null && !com.aspose.slides.ms.System.d1.n5(var5.getTextFrame().getText())) {
                  AutoShape var9 = (AutoShape)var3.getSlides().get_Item(0).getShapes().addClone(var5);

                  try {
                     var9.getTextFrame().getParagraphs().clear();
                     var7 = o6c.l6(var5) ? var9.getImage(2, 1.0F, 1.0F) : var9.getImage();
                  } finally {
                     var3.getSlides().get_Item(0).getShapes().remove(var9);
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IConnector.class)) {
                  var7 = var0.getImage(2, 1.0F, 1.0F);
               } else {
                  var7 = var0.getImage();
               }

               String var8 = com.aspose.slides.internal.z0k.z1.l6(
                  var2,
                  com.aspose.slides.ms.System.d1.n5(
                     "{0}{1}.png",new Object[]{ com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.j8.n5(var0).s7()), Long.valueOf((long)(var4[0]++))
                  })
               );
               com.aspose.slides.internal.z0k.e2 var20 = new com.aspose.slides.internal.z0k.e2();

               try {
                  ((u4i)var7).n5(var20, 6);
                  IOutputFile var10 = var1.getOutput().n5(var8, var20.toArray());
                  var1.getOutput().bindResource(var10, var0);
               } finally {
                  if (var20 != null) {
                     var20.dispose();
                  }
               }

               var7.dispose();
            }
         }
      }
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, HtmlOptions var2, InterruptionToken var3) {
      f2z.n5(var0, var1, var2, var3);
   }

   static void l6(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, HtmlOptions var3, InterruptionToken var4) {
      f2z.n5(var0, var1, var2, var3, var4);
   }

   static void n5(
      com.aspose.slides.internal.z0k.j5 var0,
      com.aspose.slides.internal.o9b.t4 var1,
      com.aspose.slides.internal.j9e.s7 var2,
      com.aspose.slides.internal.j9e.h0 var3
   ) {
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.n5(var4, var2, var3);
         var0.l6(
            com.aspose.slides.ms.System.d1.n5(
               "<img src=\"data:;base64,{0}\" class=\"slideImage\">",
               new Object[]{com.aspose.slides.ms.System.z3.n5(var4.getBuffer(), 0, (int)var4.getLength())}
            )
         );
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private static void n5(
      Presentation var0,
      int[] var1,
      String[] var2,
      String[] var3,
      int[] var4,
      q4b[] var5,
      List<Integer> var6,
      String var7,
      a4w var8,
      v3s var9,
      ILinkEmbedController var10,
      String var11,
      int var12,
      SVGOptions var13,
      HtmlOptions var14
   ) {
      List var15 = n5(var0);

      for (int var16 = 0; var16 < var1.length; var16++) {
         if (var1[var16] >= 1 && var1[var16] <= var0.getSlides().size()) {
            Slide var17 = (Slide)var0.getSlides().get_Item(var1[var16] - 1);
            if (var17 != null && (!var17.getHidden() || var14.getShowHiddenSlides())) {
               var8.n5(var17.getSlideNumber());
               IGenericEnumerator var18 = var17.getShapes().iterator();

               try {
                  while (var18.hasNext()) {
                     Shape var19 = (Shape)var18.next();
                     if (com.aspose.slides.internal.v6g.k5.l6(var19, AutoShape.class)
                        && var19.getPlaceholder() != null
                        && (var19.getPlaceholder().getType() == 0 || var19.getPlaceholder().getType() == 2)) {
                        var2[var1[var16] - 1] = ((TextFrame)((AutoShape)var19).getTextFrame()).t2();
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                     var18.dispose();
                  }
               }

               int var26 = 0;
               int[] var20 = new int[]{0};
               int var21 = var9.n5(var10, var17, null, "slide", var7, var11, var20);
               var26 = var20[0];
               boolean var22 = var26 == 0;
               if (var22) {
                  var3[var1[var16] - 1] = var10.getUrl(var21, 0);
                  if (var3[var1[var16] - 1] == null) {
                     var26 = 2;
                  }
               }

               if (var26 != 2) {
                  var6.addItem(var1[var16] - 1);
                  if (var12 == 0) {
                     a4w var23;
                     if (var22) {
                        var23 = new a4w(var9);
                        var23.n5(var8.k5());
                        var23.x8 = var8.x8;
                     } else {
                        var23 = var8;
                     }

                     if (com.aspose.slides.internal.v6g.k5.l6(var14.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                        && ((NotesCommentsLayoutingOptions)var14.getSlidesLayoutOptions()).getNotesPosition() != 0) {
                        var5[var1[var16] - 1] = new q4b(
                           com.aspose.slides.internal.v6g.k5.u3(((NotesSize)var0.getNotesSize()).n5().l6(), 13),
                           com.aspose.slides.internal.v6g.k5.u3(((NotesSize)var0.getNotesSize()).n5().k5(), 13),
                           72.0F,
                           72.0F,
                           72.0F,
                           var13,
                           var23
                        );
                     } else {
                        var5[var1[var16] - 1] = new q4b(
                           com.aspose.slides.internal.v6g.k5.u3(((SlideSize)var0.getSlideSize()).n5().l6(), 13),
                           com.aspose.slides.internal.v6g.k5.u3(((SlideSize)var0.getSlideSize()).n5().k5(), 13),
                           72.0F,
                           72.0F,
                           72.0F,
                           var13,
                           var23
                        );
                     }

                     var5[var1[var16] - 1].x8 = var15.containsItem(var17.getSlideId()) ? var1[var16] : -1;
                     var5[var1[var16] - 1].s7 = var22 ? var21 : 0;
                     var5[var1[var16] - 1].y4 = true;
                     var5[var1[var16] - 1].a6(var14.getSvgResponsiveLayout());
                  } else {
                     var4[var1[var16] - 1] = var21;
                  }
               }
            }
         }
      }
   }

   private static j0v[] n5(Presentation var0, EmbedAllFontsHtmlController var1, int[] var2) {
      m6q var3 = new m6q(var0);

      j0v[] var4;
      try {
         var4 = var3.n5(var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      String[] var5 = var1.getControllerInternal().n5();
      List var6 = new List(var4.length - var5.length);

      for (j0v var10 : var4) {
         if (com.aspose.slides.internal.n8e.v4.n5(var5, new r2k$3(var10)) == -1) {
            var6.addItem(var10);
         }
      }

      return (j0v[])var6.toArray(new j0v[0]);
   }

   private static long n5(int var0) {
      switch (var0) {
         case 1:
            return 6L;
         case 2:
            return 3L;
         case 3:
            return 4L;
         case 4:
         default:
            return 2L;
         case 5:
            return 5L;
      }
   }

   private static List<Integer> n5(Presentation var0, int[] var1, boolean var2) {
      List var3 = new List();
      if (var1.length > 0 && var1.length == var0.getSlides().size() && var1[0] == 1 && var1[var1.length - 1] == var0.getSlides().size()) {
         int var16 = 0;
         IGenericEnumerator var18 = var0.getSlides().iterator();

         try {
            while (var18.hasNext()) {
               ISlide var19 = (ISlide)var18.next();
               int var20 = -1;
               if (!var19.getHidden() || var2) {
                  var20 = var16++;
               }

               var3.addItem(var20);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
               var18.dispose();
            }
         }
      } else {
         List var4 = new List();

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (!var0.getSlides().get_Item(var1[var5] - 1).getHidden() || var2) {
               var4.addItem(var1[var5]);
            }
         }

         IGenericEnumerator var17 = var0.getSlides().iterator();

         try {
            while (var17.hasNext()) {
               ISlide var6 = (ISlide)var17.next();
               int var7 = -1;

               for (int var8 = 0; var8 < var4.size(); var8++) {
                  if ((Integer)var4.get_Item(var8) == ((SlideCollection)var0.getSlides()).indexOf(var6) + 1) {
                     var7 = var8;
                     break;
                  }
               }

               var3.addItem(var7);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }
      }

      return var3;
   }

   private static List<Long> n5(Presentation var0) {
      List var1 = new List();
      IGenericList var2 = var0.getHyperlinkQueries().getAnyHyperlinks();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            IHyperlinkContainer var4 = (IHyperlinkContainer)var3.next();
            ISlide var5 = null;
            if (var4.getHyperlinkClick() != null) {
               var5 = var4.getHyperlinkClick().getTargetSlide();
            } else if (var4.getHyperlinkMouseOver() != null) {
               var5 = var4.getHyperlinkMouseOver().getTargetSlide();
            }

            if (var5 != null) {
               var1.addItem(var5.getSlideId());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }
}
