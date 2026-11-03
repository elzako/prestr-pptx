package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class y6k {
   private t5w n5;

   public final void n5(Presentation var1, com.aspose.slides.internal.z0k.t4 var2, f7o var3, InterruptionToken var4) {
      try {
         com.aspose.slides.internal.c8m.k6 var5 = new com.aspose.slides.internal.c8m.k6(var2, false);
         if (var5.e2().size() == 0) {
            this.n5 = new t5w(var1, var4);
            this.u3(var5, var1);
            MasterSlide var6 = x2f.n5(var1);
            LayoutSlide var7 = w6g.n5(var6, (byte)0);
            LayoutSlide var8 = w6g.n5(var6, (byte)15);
            LayoutSlide var9 = w6g.n5(var6, (byte)31);
            LayoutSlide var10 = w6g.n5(var6, (byte)28);
            LayoutSlide var11 = w6g.n5(var6, (byte)32);
            LayoutSlide var12 = w6g.n5(var6, (byte)10);
            LayoutSlide var13 = w6g.n5(var6, (byte)11);
            LayoutSlide var14 = w6g.n5(var6, (byte)33);
            LayoutSlide var15 = w6g.n5(var6, (byte)34);
            LayoutSlide var16 = w6g.n5(var6, (byte)24);
            LayoutSlide var17 = w6g.n5(var6, (byte)26);
            ((Background)var6.getBackground()).getStyleColor().setSchemeColor(2);
            IMasterThemeManager var18 = var6.getThemeManager();
            m0l var19 = ((BaseThemeManager)var18).u3();
            var19.n5(0, (byte)0);
            var19.n5(1, (byte)1);
            var19.n5(2, (byte)2);
            var19.n5(3, (byte)3);
            var19.n5(4, (byte)4);
            var19.n5(5, (byte)5);
            var19.n5(6, (byte)6);
            var19.n5(7, (byte)7);
            var19.n5(8, (byte)8);
            var19.n5(9, (byte)9);
            var19.n5(10, (byte)10);
            var19.n5(11, (byte)11);
            ((Background)var6.getBackground()).setStyleIndex(3);
            ((FillFormat)((TextStyle)var6.getTitleStyle()).u3()[1].u3().getFillFormat()).getSolidFillColor().setSchemeColor(3);
            ((MasterSlideCollection)var1.getMasters()).n5(var6);
            var6.t2();
         } else {
            for (int var21 = 0; var21 < var5.e2().size(); var21++) {
               this.n5 = new t5w(var1, var4);
               l1x var22 = var1.n3();
               var22.n5(q6s.n5(var5.e2().get_Item(var21).y4().n5(), 0));
               this.n5(var5, var1);
               this.l6(var5, var1);
               this.k5(var5, var1);
               this.u3(var5, var1);
               n5(var5, this.n5);
               this.n5(var5.e2().get_Item(var21), var1);
               this.a6(var5, var1);
               this.u9(var5, var1);
               n5(var5, var1, this.n5);
               if (var21 < var5.e2().size() - 1) {
                  z5o var23 = var3.l6();
                  var1 = var23.l6();
               }
            }
         }
      } catch (RuntimeException var20) {
         if (com.aspose.slides.internal.v6g.k5.l6(var20, com.aspose.slides.internal.c8m.w3.class)) {
            throw new PptxUnsupportedFormatException(var20.getMessage(), var20);
         } else {
            throw new PptxReadException(var20.getMessage(), var20);
         }
      }
   }

   private void n5(com.aspose.slides.internal.c8m.k6 var1, IPresentation var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var1.s7()) {
         com.aspose.slides.internal.c8m.j8[] var7 = var6.n5(com.aspose.slides.internal.c8m.y8.n5);

         for (com.aspose.slides.internal.c8m.j8 var11 : var7) {
            this.n5.n5(var11);
         }
      }
   }

   private void l6(com.aspose.slides.internal.c8m.k6 var1, IPresentation var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var1.t2()) {
         if (com.aspose.slides.ms.System.d1.l6(var6.y4().n5(), "audio/")) {
            this.n5.l6(var6);
         }
      }
   }

   private void k5(com.aspose.slides.internal.c8m.k6 var1, IPresentation var2) {
      for (com.aspose.slides.internal.c8m.j8 var6 : var1.t2()) {
         if (com.aspose.slides.ms.System.d1.l6(var6.y4().n5(), "video/")) {
            this.n5.k5(var6);
         }
      }
   }

   private void u3(com.aspose.slides.internal.c8m.k6 var1, IPresentation var2) {
      if (var1.t9() != null) {
         v6p var3 = new v6p(var1.t9(), this.n5);
         var3.n5(var2);
      }
   }

   static void n5(com.aspose.slides.internal.c8m.k6 var0, t5w var1) {
      for (com.aspose.slides.internal.c8m.j8 var5 : var0.y4()) {
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

   private void n5(com.aspose.slides.internal.c8m.j8 var1, IPresentation var2) {
      w3m var3 = new w3m(var1, this.n5);
      var3.n5(var2);
   }

   private void a6(com.aspose.slides.internal.c8m.k6 var1, IPresentation var2) {
      if (var1.z1() != null) {
         t4w var3 = new t4w();
         var3.n5(var1.z1().a6(), var2);
         ((Presentation)var2).n3().n5(var1.z1().a6());
         ((Presentation)var2).n3().n5(((VbaProject)var2.getVbaProject()).n5());
         var1.z1().n5(true);
      }
   }

   private void u9(com.aspose.slides.internal.c8m.k6 var1, IPresentation var2) {
      if (var1.t4() != null) {
         ((Presentation)var2).n3().l6(var1.t4().a6());
         var1.t4().n5(true);
      }
   }

   static void n5(com.aspose.slides.internal.c8m.k6 var0, IPresentation var1, t5w var2) {
      List$Enumerator var3 = var2.n3().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, IAudioFrame.class)) {
               n5((IAudioFrame)var4);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IVideoFrame.class)) {
               n5((IVideoFrame)var4);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAutoShape.class)) {
               ((AutoShape)var4).c8();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.m1();
   }

   private static void n5(IVideoFrame var0) {
      o5o var1 = ((VideoFrame)var0).n5();
      com.aspose.slides.internal.k4y.k8g var2 = ((BaseSlide)var0.getSlide()).k5().n5();
      if (var2 != null) {
         com.aspose.slides.internal.k4y.u3l var3 = null;
         com.aspose.slides.internal.k4y.g7[] var4 = n5(var2.k5(), var0);
         var1.n5(-1);

         for (com.aspose.slides.internal.k4y.g7 var8 : var4) {
            if (com.aspose.slides.internal.v6g.k5.l6(var8.l6(), com.aspose.slides.internal.k4y.u3l.class)) {
               var3 = (com.aspose.slides.internal.k4y.u3l)var8.l6();
               var0.setHideAtShowing(!var3.l6().u3());
               var0.setPlayLoopMode(o5.n5(var3.l6().a6().x8()) == Float.POSITIVE_INFINITY);
               var0.setFullScreenMode(var3.n5());
               var0.setRewindVideo(var3.l6().a6().q0() == 0);
               if (var3.l6().l6()) {
                  var0.setVolume(0);
               } else {
                  var0.setVolume(n5(var3.l6().n5()));
               }
            }

            List var9 = new List();
            IGenericEnumerator var10 = var0.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var10.hasNext()) {
                  ISequence var11 = (ISequence)var10.next();
                  IEffect[] var12 = var11.getEffectsByShape(var0);

                  for (IEffect var16 : var12) {
                     var9.addItem(var16);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }

            IEffect[] var20 = var0.getSlide().getTimeline().getMainSequence().getEffectsByShape(var0);
            if (var20.length == 1 && var9.size() == 1) {
               if (var3 != null) {
                  if ((var3.l6().k5() & 4294967295L) == 999L) {
                     var1.n5(2);
                  } else {
                     var1.n5(var20[0].getTiming().getTriggerType() == 1 ? 3 : 0);
                  }
               } else {
                  var1.n5(0);
               }
            } else if (var9.size() == 1) {
               var1.n5(1);
            }

            if (var3 == null) {
               var0.setVolume(-1);
            }
         }
      }
   }

   static int n5(float var0) {
      if (var0 >= 80.0F) {
         return 3;
      } else if (var0 >= 50.0F) {
         return 2;
      } else {
         return var0 >= 20.0F ? 1 : 0;
      }
   }

   private static void n5(IAudioFrame var0) {
      o8 var1 = ((BaseSlide)var0.getSlide()).k5();
      if (var1.n5() == null) {
         var1.n5(new com.aspose.slides.internal.k4y.k8g());
      }

      com.aspose.slides.internal.k4y.k8g var2 = var1.n5();
      com.aspose.slides.internal.k4y.g7[] var3 = n5(var2.k5(), var0);
      com.aspose.slides.internal.k4y.e3b var4 = null;

      for (com.aspose.slides.internal.k4y.g7 var8 : var3) {
         if (com.aspose.slides.internal.v6g.k5.l6(var8.l6(), com.aspose.slides.internal.k4y.e3b.class)) {
            var4 = (com.aspose.slides.internal.k4y.e3b)var8.l6();
            var0.setHideAtShowing(!var4.l6().u3());
            var0.setPlayLoopMode(o5.n5(var4.l6().a6().x8()) == Float.POSITIVE_INFINITY);
            ((AudioFrame)var0).setRewindAudio(var4.l6().a6().q0() == 0);
            if (var4.l6().l6()) {
               var0.setVolume(0);
            } else if (var4.l6().n5() >= 80.0F) {
               var0.setVolume(3);
            } else if (var4.l6().n5() >= 50.0F) {
               var0.setVolume(2);
            } else if (var4.l6().n5() >= 20.0F) {
               var0.setVolume(1);
            }
         }
      }

      List var16 = new List();
      IGenericEnumerator var17 = var0.getSlide().getTimeline().getInteractiveSequences().iterator();

      try {
         while (var17.hasNext()) {
            ISequence var18 = (ISequence)var17.next();
            IEffect[] var20 = var18.getEffectsByShape(var0);

            for (IEffect var12 : var20) {
               var16.addItem(var12);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
            var17.dispose();
         }
      }

      IEffect[] var19 = var0.getSlide().getTimeline().getMainSequence().getEffectsByShape(var0);
      var0.setPlayMode(-1);
      if (var19.length == 1 && var16.size() == 0) {
         com.aspose.slides.internal.v6g.k5.n5(var0, AudioFrame.class).k5 = var19[0].getTiming().getTriggerType() == 1 ? 3 : 0;
      } else if (var16.size() == 1) {
         com.aspose.slides.internal.v6g.k5.n5(var0, AudioFrame.class).k5 = 1;
      }

      if (var4 != null) {
         com.aspose.slides.internal.v6g.k5.n5(var0, AudioFrame.class).n5().n5(var4.n5());
         if ((var4.l6().k5() & 4294967295L) == 999L) {
            var0.setPlayAcrossSlides(true);
         }
      }

      if (var4 == null) {
         var0.setVolume(-1);
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
