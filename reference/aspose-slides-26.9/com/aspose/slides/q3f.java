package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class q3f {
   private t5w n5;
   private com.aspose.slides.internal.c8m.j8 l6;

   public final void n5(Presentation var1, com.aspose.slides.internal.z0k.t4 var2, InterruptionToken var3) {
      try {
         boolean var4 = false;
         int var5 = var2.readByte();
         if (var5 > 0) {
            var2.seek(-1L, 1);
            if ((byte)var5 == 80) {
               var4 = true;
            }
         }

         boolean var6 = var4;
         com.aspose.slides.internal.c8m.d9 var7;
         if (var4) {
            var7 = new com.aspose.slides.internal.c8m.d9(var2, false, new q3f$1(this, var3));
         } else {
            com.aspose.slides.internal.l2.k5 var8 = new com.aspose.slides.internal.l2.k5(var2);
            var7 = new com.aspose.slides.internal.c8m.d9(var8, new q3f$2(this, var3));
         }

         this.n5 = new t5w(var1, var3, var7.n5());
         l1x var12 = var1.n3();
         this.l6 = var7.w1();
         var12.n5(!var6 ? 6 : q6s.n5(this.l6.y4().n5(), 0));
         var1.n5 = q6s.n5(var12.l6());
         this.t2(var7, var1);
         this.n5(var7, (IPresentation)var1);
         this.n5(var1);
         this.l6(var7, (IPresentation)var1);
         this.k5(var7, var1);
         this.u3(var7, var1);
         this.a6(var7, var1);
         this.u9(var7, var1);
         n5(var7, this.n5);
         this.h0(var7, var1);
         this.n5(var7, var1);
         this.l6(var7, var1);
         com.aspose.slides.internal.c8m.j8 var9 = var7.a0();
         if (var9 != null) {
            u4l var10 = new u4l(var9, this.n5);
            var10.n5(var1);
            var9.n5(true);
         }

         this.c8(var7, var1);
         l6(var7, var1, this.n5);
         u3(var7, var1, this.n5);
         n5(var7, var1, this.n5);
         k5(var7, var1, this.n5);
      } catch (RuntimeException var11) {
         if (com.aspose.slides.internal.v6g.k5.l6(var11, com.aspose.slides.internal.c8m.w3.class)) {
            throw new PptxUnsupportedFormatException(var11.getMessage(), var11);
         } else {
            throw new PptxReadException(var11.getMessage(), var11);
         }
      }
   }

   public static boolean n5(com.aspose.slides.internal.c8m.d9 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      var1.write(var0.w1().a6(), 0, var0.w1().a6().length);
      var1.seek(0L, 0);
      com.aspose.slides.ms.System.Xml.c7 var2 = com.aspose.slides.ms.System.Xml.c7.n5(var1);
      return var2.a6("p:modifyVerifier");
   }

   public static boolean n5(com.aspose.slides.internal.c8m.d9 var0, String var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      var2.write(var0.w1().a6(), 0, var0.w1().a6().length);
      var2.seek(0L, 0);
      com.aspose.slides.ms.System.Xml.c7 var3 = com.aspose.slides.ms.System.Xml.c7.n5(var2);
      if (!var3.a6("p:modifyVerifier")) {
         return false;
      }

      com.aspose.slides.internal.k4y.x8o var4 = new com.aspose.slides.internal.k4y.x8o(var3);
      return f4p.n5(var1, var4);
   }

   final void n5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (var2.getProtectionManager().getEncryptDocumentProperties()) {
         n5(var1, var2.getDocumentProperties(), this.n5);
      }

      if (var1.m3() != null) {
         var1.m3().n5(true);
      }

      if (var1.z8() != null) {
         var1.z8().n5(true);
      }

      l6(var1, var2.getDocumentProperties(), this.n5);
      if (var1.d5() != null) {
         ((DocumentProperties)var2.getDocumentProperties()).n5(var1.d5().a6());
      }
   }

   private void n5(IPresentation var1) {
      com.aspose.slides.internal.c8m.j8[] var2 = this.l6.n5(new com.aspose.slides.internal.c8m.z8());
      if (var2.length > 0) {
         k0b var3 = new k0b(var2[0], this.n5);
         var3.n5(var1);
      }

      com.aspose.slides.internal.c8m.j8[] var5 = this.l6.n5(new com.aspose.slides.internal.c8m.t2());
      if (var5.length > 0) {
         u8 var4 = new u8(var5[0], this.n5);
         var4.n5(var1);
      }
   }

   private void l6(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var1.s7()) {
         com.aspose.slides.internal.c8m.j8[] var7 = var6.n5(com.aspose.slides.internal.c8m.y8.n5);

         for (com.aspose.slides.internal.c8m.j8 var11 : var7) {
            this.n5.z1().throwIfInterruptionRequested();
            this.n5.n5(var11);
         }
      }
   }

   private void k5(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var1.t2()) {
         if (com.aspose.slides.ms.System.d1.l6(var6.y4().n5(), "audio/")) {
            this.n5.l6(var6);
         }
      }
   }

   private void u3(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var1.t2()) {
         if (com.aspose.slides.ms.System.d1.l6(var6.y4().n5(), "video/")) {
            this.n5.k5(var6);
         }
      }
   }

   private void a6(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (var1.r4() != null) {
         i1s var3 = new i1s(var1.r4(), this.n5);
         var3.n5(((Presentation)var2).n3().k7());
      }
   }

   private void u9(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (var1.c4() == null) {
         b2y.n5(var2.getMasterTheme());
      } else {
         v6p var3 = new v6p(var1.c4(), this.n5);
         var3.n5(var2);
      }
   }

   static void n5(com.aspose.slides.internal.c8m.d9 var0, t5w var1) {
      for (com.aspose.slides.internal.c8m.j8 var5 : var0.e2()) {
         com.aspose.slides.internal.c8m.r7[] var6 = var5.e2().n5(com.aspose.slides.internal.c8m.s2.n5);
         if (var6 != null && var6.length > 0) {
            SortedList var7 = var1.y4();
            if (!var7.containsKey(var6[0].n5())) {
               var1.y4().addItem(var6[0].n5(), new SortedList<>());
            }

            ((SortedList)var7.get_Item(var6[0].n5())).addItem(var5.l6(), var5);
         }
      }
   }

   private void h0(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      w3m var3 = new w3m(var1.w1(), this.n5);
      var3.n5(var2);
      String var4 = var2.getDocumentProperties().getPresentationFormat();
      if (!com.aspose.slides.ms.System.d1.n5(var4)
         && com.aspose.slides.ms.System.d1.a6("widescreen", com.aspose.slides.ms.System.d1.u9(var4))
         && ((SlideSize)var2.getSlideSize()).n5(16)) {
         var2.getSlideSize().setSize(16, 0);
      }
   }

   private void n5(com.aspose.slides.internal.c8m.d9 var1, Presentation var2) {
      if (var1.y2() != null) {
         if (!var2.a6().getDeleteEmbeddedBinaryObjects()) {
            t4w var3 = new t4w();
            var3.n5(var1.y2().a6(), var2);
            var2.n3().n5(var1.y2().a6());
            var2.n3().n5(((VbaProject)var2.getVbaProject()).n5());
         }

         var1.y2().n5(true);
      }
   }

   private void l6(com.aspose.slides.internal.c8m.d9 var1, Presentation var2) {
      if (var1.y1() != null) {
         if (!var2.a6().getDeleteEmbeddedBinaryObjects()) {
            var2.n3().l6(var1.y1().a6());
         }

         var1.y1().n5(true);
      }
   }

   private void c8(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      if (var1.d2() != null) {
         g9m var3 = new g9m(var1.d2(), this.n5);
         var3.n5(var2);
         a1c var4 = ((Presentation)var2).n3().t4();
         if (var4 != null && var4.n5() != null) {
            com.aspose.slides.internal.k4y.l1 var5 = var4.n5();
            ViewProperties var6 = (ViewProperties)var2.getViewProperties();
            int var7 = var5.a6();
            switch (var7) {
               case 0:
                  var6.setLastView(0);
                  break;
               case 1:
                  var6.setLastView(1);
                  break;
               case 2:
                  var6.setLastView(2);
                  break;
               case 3:
                  var6.setLastView(3);
                  break;
               case 4:
                  var6.setLastView(4);
                  break;
               case 5:
                  var6.setLastView(5);
                  break;
               case 6:
                  var6.setLastView(6);
                  break;
               case 7:
                  var6.setLastView(7);
                  break;
               case 8:
                  var6.setLastView(8);
                  break;
               default:
                  throw new PptxReadException(
                     com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown view type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.u0k.class, var7)})
                  );
            }

            var6.setShowComments((byte)(var5.u9() ? 1 : 0));
            if (var5.h0() != null) {
               p9i.n5(var6.getNormalViewProperties(), var5.h0());
            }

            if (var5.c8() != null) {
               y7w.n5(var6.getSlideViewProperties(), var5.c8().n5());
            }

            if (var5.s7() != null) {
               y7w.n5(var6.getNotesViewProperties(), var5.s7().n5());
            }

            if (var5.x8() == null) {
               var6.n5(6.0F);
            } else {
               var6.n5((float)var5.x8().n5());
            }
         }
      }
   }

   private void t2(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2) {
      com.aspose.slides.internal.c8m.r7[] var3 = var1.w1().e2().n5(com.aspose.slides.internal.c8m.d2.n5);

      for (com.aspose.slides.internal.c8m.r7 var7 : var3) {
         com.aspose.slides.internal.c8m.j8 var8 = var7.l6();
         if (var8.e2() != null) {
            ICustomXmlPart var9 = this.n5.u3(var8);
            com.aspose.slides.internal.c8m.r7[] var10 = var8.e2().n5(com.aspose.slides.internal.c8m.d5.n5);
            if (var10.length > 0) {
               com.aspose.slides.internal.c8m.j8 var11 = var10[0].l6();
               if (var11.a6().length > 0) {
                  s0c var12 = new s0c(var11, this.n5);
                  var12.n5(var9);
               }

               var11.n5(true);
            }
         } else {
            var8.n5(true);
         }
      }
   }

   static void n5(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, t5w var2) {
      l1x var3 = ((Presentation)var1).n3();

      for (com.aspose.slides.internal.c8m.j8 var7 : var0.t2()) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var7.y4(), com.aspose.slides.internal.c8m.f8.class)
            && !var7.s7()
            && !com.aspose.slides.internal.v6g.k5.l6(var7.y4(), com.aspose.slides.internal.c8m.h1.class)
            && (
               !com.aspose.slides.internal.v6g.k5.l6(var7.y4(), com.aspose.slides.internal.c8m.k2.class)
                  || !com.aspose.slides.ms.System.d1.l6(var7.k5(), "ppt/slides/slide")
            )) {
            for (com.aspose.slides.internal.c8m.j8 var11 : var0.s7()) {
               if (com.aspose.slides.ms.System.d1.a6(var11.u3(), com.aspose.slides.ms.System.d1.n5(new String[]{var7.u3(), ".rels"}))) {
                  var7.n5(var11.e2());
                  break;
               }
            }

            var3.z3().n5(var7.l6(), var7.a6(), var7.y4().n5(), var7.y4().l6() != null ? var7.y4().l6().n5() : "", var7.e2());
            var7.n5(true);
         }
      }

      switch (var2.u9()) {
         case 0:
            for (com.aspose.slides.internal.c8m.r7 var37 : var0.w1().e2().l6()) {
               n5(var3, var3.m1(), var37);
            }

            for (com.aspose.slides.internal.c8m.r7 var38 : var0.c8().l6()) {
               l6(var3, var3.m1(), var38);
            }
         case 1:
         case 2:
         case 3:
            List var18 = new List();

            for (com.aspose.slides.internal.c8m.j8 var46 : var0.q0()) {
               var18.addItem(var46);
            }

            for (com.aspose.slides.internal.c8m.j8 var47 : var0.e2()) {
               var18.addItem(var47);
            }

            for (com.aspose.slides.internal.c8m.j8 var48 : var0.t9()) {
               var18.addItem(var48);
            }

            for (com.aspose.slides.internal.c8m.j8 var49 : var0.z1()) {
               var18.addItem(var49);
            }

            for (com.aspose.slides.internal.c8m.j8 var50 : var0.t4()) {
               var18.addItem(var50);
            }

            for (com.aspose.slides.internal.c8m.j8 var51 : var0.y4()) {
               var18.addItem(var51);
            }

            List$Enumerator var27 = var18.iterator();

            try {
               while (var27.hasNext()) {
                  com.aspose.slides.internal.c8m.j8 var36 = (com.aspose.slides.internal.c8m.j8)var27.next();
                  if (var2.x8().containsKey(var36.l6())) {
                     IBaseSlide var45 = var2.x8().get_Item(var36.l6());
                     o8 var52 = ((BaseSlide)var45).k5();

                     for (com.aspose.slides.internal.c8m.r7 var12 : var36.e2().l6()) {
                        n5(var3, var52.h0(), var12);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                  var27.dispose();
               }
            }

            return;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   static void l6(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, t5w var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var0.m1()) {
         DigitalSignature var7 = new DigitalSignature();
         o6x var8 = new o6x(var6, var2);
         var8.n5(var7);
         var1.getDigitalSignatures().add(var7);
         var6.n5(true);
      }

      if (var1.getDigitalSignatures().size() > 0) {
         com.aspose.slides.internal.c8m.j8 var9 = var0.u9("/_xmlsignatures/origin.sigs");
         if (var9 != null) {
            var9.n5(true);
         }

         LoadOptions var10 = ((Presentation)var1).a6();
         if (var10 != null) {
            var10.k5();
         }
      }
   }

   private static void n5(l1x var0, List<b8o> var1, com.aspose.slides.internal.c8m.r7 var2) {
      h0o var3 = var0.z3().n5(var2.n5());
      if (var3 != null) {
         if (com.aspose.slides.ms.System.d1.n5(var3.u3())) {
            var3.n5(var2.u9());
         }

         var1.addItem(new b8o(var2.a6(), var2.u9(), var2.n5(), var2.h0()));
      } else {
         var1.addItem(new b8o(var2.a6(), var2.u9(), var2.n5(), var2.h0()));
      }
   }

   private static void l6(l1x var0, List<b8o> var1, com.aspose.slides.internal.c8m.r7 var2) {
      h0o var3 = var0.z3().n5(var2.n5());
      if (var3 != null) {
         if (com.aspose.slides.ms.System.d1.n5(var3.u3())) {
            var3.n5(var2.u9());
         }

         var1.addItem(new b8o(var2.a6(), var2.u9(), var2.n5(), var2.h0(), true));
      }
   }

   static void k5(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, t5w var2) {
      List$Enumerator var3 = var2.n3().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, IAudioFrame.class)) {
               n5((AudioFrame)var4);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IVideoFrame.class)) {
               n5((IVideoFrame)var4);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, SummaryZoomFrame.class)) {
               n5((SummaryZoomFrame)var4, var2.t9());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, SectionZoomFrame.class)) {
               n5((SectionZoomFrame)var4, var2.t9());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IZoomFrame.class)) {
               n5((IZoomFrame)var4, var2.t9());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, AutoShape.class)) {
               ((Shape)var4).c8();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.m1();
   }

   static void n5(com.aspose.slides.internal.c8m.d9 var0, IDocumentProperties var1, com.aspose.slides.internal.c8m.e9 var2) {
      if (var0.m3() != null) {
         r0w var3 = new r0w(var0.m3(), var2);
         var3.n5(var1);
      }

      if (var0.z8() != null) {
         d1t var4 = new d1t(var0.z8(), var2);
         var4.n5(var1);
      }
   }

   static void l6(com.aspose.slides.internal.c8m.d9 var0, IDocumentProperties var1, com.aspose.slides.internal.c8m.e9 var2) {
      if (var0.k7() != null) {
         f7v var3 = new f7v(var0.k7(), var2);
         var3.n5(var1);
      }
   }

   static void u3(com.aspose.slides.internal.c8m.d9 var0, IPresentation var1, t5w var2) {
      if (var0.j5() != null) {
         v8p var3 = new v8p(var0.j5(), var2);
         var3.n5(var1.getSensitivityLabels());
      }
   }

   static void n5(IVideoFrame var0) {
      o5o var1 = ((VideoFrame)var0).n5();
      com.aspose.slides.internal.k4y.k8g var2 = ((BaseSlide)var0.getSlide()).k5().n5();
      if (var2 != null) {
         com.aspose.slides.internal.k4y.u3l var3 = null;
         com.aspose.slides.internal.k4y.g7[] var4 = n5(var2.k5(), var0);
         var1.n5(-1);

         for (com.aspose.slides.internal.k4y.g7 var8 : var4) {
            float var9 = 1.0F;
            var3 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.u3l.class);
            if (var3 != null) {
               var9 = o5.n5(var3.l6().a6().x8());
               var0.setHideAtShowing(!var3.l6().u3());
               var0.setPlayLoopMode(var9 == Float.POSITIVE_INFINITY);
               var0.setFullScreenMode(var3.n5());
               var0.setRewindVideo(var3.l6().a6().q0() == 0);
               if (var3.l6().l6()) {
                  var0.setVolume(0);
               } else {
                  var0.setVolume(n5(var3.l6().n5()));
               }
            }

            List var10 = new List();
            IGenericEnumerator var11 = var0.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var11.hasNext()) {
                  ISequence var12 = (ISequence)var11.next();
                  IEffect[] var13 = var12.getEffectsByShape(var0);

                  for (IEffect var17 : var13) {
                     var10.addItem(var17);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }

            IEffect[] var22 = var0.getSlide().getTimeline().getMainSequence().getEffectsByShape(var0);
            n5(var22.length > 0 ? var22 : (IEffect[])var10.toArray(new IEffect[0]), var9);
            if (var22.length == 1 && var10.size() == 1) {
               if (var3 != null) {
                  if ((var3.l6().k5() & 4294967295L) == 999L) {
                     var1.n5(2);
                  } else {
                     var1.n5(var22[0].getTiming().getTriggerType() == 1 ? 3 : 0);
                  }
               } else {
                  var1.n5(0);
               }
            } else if (var10.size() == 1) {
               var1.n5(1);
            }

            if (var3 == null && ((Presentation)var0.getPresentation()).m3() != 0) {
               var0.setVolume(-1);
            }
         }
      }
   }

   private static void n5(IZoomFrame var0, Presentation var1) {
      IGenericEnumerator var2 = var1.getSlides().iterator();

      try {
         while (var2.hasNext()) {
            ISlide var3 = (ISlide)var2.next();
            if (((ZoomFrame)var0).m3() == ((Slide)var3).getSlideId()) {
               ((ZoomFrame)var0).l6(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(SectionZoomFrame var0, Presentation var1) {
      IGenericEnumerator var2 = var1.getSections().iterator();

      try {
         while (var2.hasNext()) {
            ISection var3 = (ISection)var2.next();
            if (com.aspose.slides.ms.System.o0.n5(var0.n5(), ((Section)var3).n5())) {
               var0.n5(var3);
               var0.l6(var3.getStartedFromSlide());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(SummaryZoomFrame var0, Presentation var1) {
      IGenericEnumerator var2 = var1.getSections().iterator();

      try {
         while (var2.hasNext()) {
            ISection var3 = (ISection)var2.next();
            IGenericEnumerator var4 = var0.getSummaryZoomCollection().iterator();

            try {
               while (var4.hasNext()) {
                  ISummaryZoomSection var5 = (ISummaryZoomSection)var4.next();
                  if (com.aspose.slides.ms.System.o0.n5(((SummaryZoomSection)var5).n5(), ((Section)var3).n5())) {
                     ((SummaryZoomSection)var5).setTargetSection(var3);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   static float n5(int var0) {
      if (var0 == 3) {
         return 0.8F;
      } else if (var0 == 2) {
         return 0.5F;
      } else {
         return var0 == 1 ? 0.2F : 0.0F;
      }
   }

   static int n5(float var0) {
      if (var0 >= 80.0F) {
         return 3;
      } else {
         return var0 >= 50.0F ? 2 : 1;
      }
   }

   static void n5(AudioFrame var0) {
      o8 var1 = ((BaseSlide)var0.getSlide()).k5();
      if (var1.n5() == null) {
         var1.n5(new com.aspose.slides.internal.k4y.k8g());
      }

      com.aspose.slides.internal.k4y.k8g var2 = var1.n5();
      com.aspose.slides.internal.k4y.g7[] var3 = n5(var2.k5(), var0);
      com.aspose.slides.internal.k4y.e3b var4 = null;
      com.aspose.slides.internal.k4y.u3l var5 = null;
      com.aspose.slides.internal.k4y.c7e var6 = null;

      for (com.aspose.slides.internal.k4y.g7 var10 : var3) {
         if (com.aspose.slides.internal.v6g.k5.l6(var10.l6(), com.aspose.slides.internal.k4y.e3b.class)) {
            var4 = (com.aspose.slides.internal.k4y.e3b)var10.l6();
            var6 = var4.l6();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var10.l6(), com.aspose.slides.internal.k4y.u3l.class)) {
            var5 = (com.aspose.slides.internal.k4y.u3l)var10.l6();
            var6 = var5.l6();
         }
      }

      float var19 = 1.0F;
      if (var6 != null) {
         var19 = o5.n5(var6.a6().x8());
         var0.setHideAtShowing(!var6.u3());
         var0.setPlayLoopMode(var19 == Float.POSITIVE_INFINITY);
         var0.setRewindAudio(var6.a6().q0() == 0);
         if (var6.l6()) {
            var0.setVolume(0);
         } else {
            var0.setVolume(n5(var6.n5()));
         }

         var0.n5(var6.n5());
      }

      List var20 = new List();
      IGenericEnumerator var21 = var0.getSlide().getTimeline().getInteractiveSequences().iterator();

      try {
         while (var21.hasNext()) {
            ISequence var22 = (ISequence)var21.next();
            IEffect[] var11 = var22.getEffectsByShape(var0);

            for (IEffect var15 : var11) {
               var20.addItem(var15);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      IEffect[] var23 = var0.getSlide().getTimeline().getMainSequence().getEffectsByShape(var0);
      n5(var23.length > 0 ? var23 : (IEffect[])var20.toArray(new IEffect[0]), var19);
      var0.setPlayMode(-1);
      if (var23.length == 1 && var20.size() == 0) {
         com.aspose.slides.internal.v6g.k5.n5(var0, AudioFrame.class).k5 = var23[0].getTiming().getTriggerType() == 1 ? 3 : 0;
      } else if (var20.size() == 1) {
         com.aspose.slides.internal.v6g.k5.n5(var0, AudioFrame.class).k5 = 1;
      }

      if (var4 != null) {
         com.aspose.slides.internal.v6g.k5.n5(var0, AudioFrame.class).n5().n5(var4.n5());
         if (var6 != null && (var6.k5() & 4294967295L) > 1L) {
            var0.setPlayAcrossSlides(true);
         }
      }

      if (var4 == null && var5 == null && ((Presentation)var0.getPresentation()).m3() != 0) {
         var0.setVolume(-1);
      }
   }

   private static void n5(IEffect[] var0, float var1) {
      for (IEffect var5 : var0) {
         if (var5.getPresetClassType() == 4) {
            var5.getTiming().setRepeatCount(var1);
         }
      }
   }

   static com.aspose.slides.internal.k4y.g7[] n5(com.aspose.slides.internal.k4y.h7e var0, IShape var1) {
      List var2 = new List();
      n5(var2, var0, var1);
      return (com.aspose.slides.internal.k4y.g7[])var2.toArray(new com.aspose.slides.internal.k4y.g7[0]);
   }

   private static void n5(List<com.aspose.slides.internal.k4y.g7> var0, com.aspose.slides.internal.k4y.h7e var1, IShape var2) {
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.n5().size(); var3++) {
            com.aspose.slides.internal.k4y.g7 var4 = var1.n5().get_Item(var3);
            if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), com.aspose.slides.internal.k4y.s2a.class)) {
               com.aspose.slides.internal.k4y.s2a var5 = (com.aspose.slides.internal.k4y.s2a)var4.l6();
               n5(var0, var5.n5(), var4, var2);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), com.aspose.slides.internal.k4y.e3b.class)) {
               com.aspose.slides.internal.k4y.e3b var6 = (com.aspose.slides.internal.k4y.e3b)var4.l6();
               n5(var0, var6.l6().u9().n5(), var4, var2);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), com.aspose.slides.internal.k4y.u3l.class)) {
               com.aspose.slides.internal.k4y.u3l var7 = (com.aspose.slides.internal.k4y.u3l)var4.l6();
               n5(var0, var7.l6().u9().n5(), var4, var2);
            }

            if (o5.l6(var4.n5())) {
               com.aspose.slides.internal.k4y.n0d var8 = o5.n5(var4);
               if (var8 != null) {
                  if (var8.d2() != null) {
                     n5(var0, var8.d2(), var2);
                  }

                  if (var8.d5() != null) {
                     n5(var0, var8.d5(), var2);
                  }
               }
            }
         }
      }
   }

   private static void n5(
      List<com.aspose.slides.internal.k4y.g7> var0, com.aspose.slides.internal.k4y.g7 var1, com.aspose.slides.internal.k4y.g7 var2, IShape var3
   ) {
      if (var1 != null && "spTgt".equals(var1.n5())) {
         Shape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, Shape.class);
         if (var4 != null) {
            com.aspose.slides.internal.k4y.h1f var5 = (com.aspose.slides.internal.k4y.h1f)var1.l6();
            if (com.aspose.slides.ms.System.d1.a6(var5.n5(), com.aspose.slides.ms.System.Xml.f4.l6(var4.v4()))) {
               var0.addItem(var2);
            }
         }
      }
   }
}
