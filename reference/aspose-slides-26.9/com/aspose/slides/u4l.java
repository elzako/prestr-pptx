package com.aspose.slides;

class u4l extends com.aspose.slides.internal.c8m.w2 {
   final void n5(Presentation var1) {
      this.n5();
      com.aspose.slides.internal.k4y.v7w var2 = null;

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "presentationPr".equals(this.s7().n3())) {
            p8x var3 = var1.n3().q0();
            if (var3 == null) {
               var3 = new p8x();
               var1.n3().n5(var3);
            }

            var2 = new com.aspose.slides.internal.k4y.v7w(this.s7());
            com.aspose.slides.internal.k4y.q3j var4 = com.aspose.slides.internal.k4y.x2m.n5(var2.k5());
            com.aspose.slides.internal.k4y.a8y var5 = com.aspose.slides.internal.k4y.x2m.l6(var2.k5());
            com.aspose.slides.internal.k4y.e7j var6 = com.aspose.slides.internal.k4y.x2m.k5(var2.k5());
            com.aspose.slides.internal.k4y.t1f var7 = com.aspose.slides.internal.k4y.x2m.u3(var2.k5());
            if (var4 != null) {
               var3.n5(var4.n5());
            }

            if (var5 != null) {
               var3.n5(var5.n5());
            }

            if (var6 != null) {
               var3.l6(var6.n5());
            }

            if (var7 != null) {
               var1.getProtectionManager().setReadOnlyRecommended(var7.n5());
            }
         }
      }

      com.aspose.slides.internal.k4y.k6n var8 = null;
      if (var2 != null) {
         var8 = var2.l6();
      }

      var1.n5(n5(var1, var8));
      this.n3();
   }

   final void l6(Presentation var1) {
      this.y4();
      p8x var2 = var1.n3().q0();
      if (var2 == null) {
         var2 = new p8x();
         var1.n3().n5(var2);
      }

      com.aspose.slides.internal.k4y.v7w var3 = new com.aspose.slides.internal.k4y.v7w();
      SlideShowSettings var4 = var1.getSlideShowSettings();
      n5(var4);
      var3.n5(var4.n5);
      com.aspose.slides.internal.k4y.x8 var5 = var3.k5();
      if (var5 == null) {
         var5 = var3.n5();
      }

      com.aspose.slides.internal.k4y.x2m.n5(var5, var2.n5());
      com.aspose.slides.internal.k4y.x2m.n5(var5, var2.l6());
      com.aspose.slides.internal.k4y.x2m.l6(var5, var2.k5());
      com.aspose.slides.internal.k4y.x2m.k5(var5, var1.getProtectionManager().getReadOnlyRecommended());
      var3.n5(null, this.x8(), "presentationPr");
      this.e2();
   }

   private static void n5(SlideShowSettings var0) {
      com.aspose.slides.internal.k4y.k6n var1 = var0.n5;
      SlideShowType var2 = var0.getSlideShowType();
      com.aspose.slides.internal.k4y.g7 var5;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, BrowsedByIndividual.class)) {
         BrowsedByIndividual var3 = (BrowsedByIndividual)var2;
         com.aspose.slides.internal.k4y.t1u var4 = new com.aspose.slides.internal.k4y.t1u();
         var4.n5(var3.getShowScrollbar());
         var5 = new com.aspose.slides.internal.k4y.g7("browse", var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, BrowsedAtKiosk.class)) {
         BrowsedAtKiosk var7 = (BrowsedAtKiosk)var2;
         com.aspose.slides.internal.k4y.v4n var9 = var7.n5;
         if (var9 == null) {
            var9 = new com.aspose.slides.internal.k4y.v4n();
         }

         var5 = new com.aspose.slides.internal.k4y.g7("kiosk", var9);
      } else {
         var5 = new com.aspose.slides.internal.k4y.g7("present", new com.aspose.slides.internal.k4y.e0j());
      }

      var1.n5(var5);
      com.aspose.slides.internal.k4y.g7 var8;
      if (var0.getSlides() != null) {
         com.aspose.slides.internal.k4y.v6b var10 = new com.aspose.slides.internal.k4y.v6b();
         var10.n5(var0.getSlides().getStart());
         var10.l6(var0.getSlides().getEnd());
         var8 = new com.aspose.slides.internal.k4y.g7("sldRg", var10);
      } else {
         var8 = var1.c8();
      }

      var1.l6(var8);
      IColorFormat var11 = var0.getPenColor();
      if (var11.getColorType() != -1) {
         if (var1.t2() == null) {
            var1.n5();
         }

         c4i.l6(var11, var1.t2());
      } else {
         var1.n5((com.aspose.slides.internal.k4y.z4)null);
      }

      com.aspose.slides.internal.k4y.x8 var6 = var1.s7();
      if (var6 == null) {
         var6 = var1.l6();
      }

      com.aspose.slides.internal.k4y.f5e.n5(var6, var0.getShowMediaControls());
   }

   private static SlideShowSettings n5(Presentation var0, com.aspose.slides.internal.k4y.k6n var1) {
      SlideShowSettings var2 = new SlideShowSettings(var0, var1);
      SlideShowType var3 = null;
      com.aspose.slides.internal.k4y.g7 var4 = var2.n5.h0();
      if (var4 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), com.aspose.slides.internal.k4y.t1u.class)) {
            var3 = new BrowsedByIndividual((com.aspose.slides.internal.k4y.t1u)var4.l6());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4.l6(), com.aspose.slides.internal.k4y.v4n.class)) {
            var3 = new BrowsedAtKiosk((com.aspose.slides.internal.k4y.v4n)var4.l6());
         } else {
            var3 = PresentedBySpeaker.n5;
         }
      } else {
         var3 = PresentedBySpeaker.n5;
      }

      var2.setSlideShowType(var3);
      com.aspose.slides.internal.k4y.g7 var5 = var2.n5.c8();
      if (var5 != null && com.aspose.slides.internal.v6g.k5.l6(var5.l6(), com.aspose.slides.internal.k4y.v6b.class)) {
         com.aspose.slides.internal.k4y.v6b var6 = (com.aspose.slides.internal.k4y.v6b)var5.l6();
         var2.setSlides(new SlidesRange());
         var2.getSlides().setStart(var6.n5());
         var2.getSlides().setEnd(var6.l6());
      }

      c4i.n5(var2.getPenColor(), var1 == null ? null : var1.t2());
      var2.setShowMediaControls(true);
      com.aspose.slides.internal.k4y.t5s var8 = com.aspose.slides.internal.k4y.f5e.n5(var2.n5.s7());
      if (var8 != null) {
         var2.setShowMediaControls(var8.n5());
      }

      return var2;
   }

   public u4l(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.e9 var2) {
      super(var1, var2);
   }

   public u4l(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.o5 var2) {
      super(var1, var2);
   }
}
