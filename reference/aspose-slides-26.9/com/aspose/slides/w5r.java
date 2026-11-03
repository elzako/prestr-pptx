package com.aspose.slides;

import java.util.Arrays;

class w5r extends n8 {
   final void n5(Slide var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "sld".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.g2 var2 = new com.aspose.slides.internal.k4y.g2(this.s7());
            a1g.n5(var1.getThemeManager(), var2.c8());
            k3.n5(var1.getThemeManager(), this.k5());
            k2.n5(var1, var2.h0(), this.n5());
            n8c.n5(var1.getSlideShowTransition(), var2.t2(), this.k5());
            var1.setHidden(!var2.u9());
            var1.setShowMasterShapes(var2.u3());
            this.l6(var1);
            this.k5(var1);
            this.n5(var1, var2);
         }
      }

      this.n3();
   }

   private void l6(Slide var1) {
      com.aspose.slides.internal.c8m.r7[] var2 = this.k5().k7().n5(com.aspose.slides.internal.c8m.z0.n5);
      if (var2.length > 0) {
         h9s var3 = new h9s(var2[0].l6(), this.k5());
         var3.n5(var1);
      }
   }

   private void k5(Slide var1) {
      com.aspose.slides.internal.c8m.r7[] var2 = this.k5().k7().n5(com.aspose.slides.internal.c8m.n2.n5);
      if (var2.length > 0) {
         q1c var3 = new q1c(var2[0].l6(), this.k5());
         var3.n5(var1);
      }
   }

   private void n5(ISlide var1, com.aspose.slides.internal.k4y.g2 var2) {
      s4m var3 = ((Slide)var1).q0();
      w3j var4 = new w3j(this.n5().n5(), this.n5().u3());
      if (var2.s7() == null) {
         var2.k5();
      }

      var3.n5(var2.s7());
      o5.n5(var1.getTimeline(), var2.s7(), var4);
      com.aspose.slides.internal.f8y.n5.n5(var2.s7() != null);
      var3.n5(var2.s7().u3());
      var3.n5(var2.s7().a6());
      var3.u3(var2.x8());
      var3.n5(var2.a6());
   }

   final void n5(ISlide var1) {
      this.y4();
      com.aspose.slides.internal.k4y.g2 var2 = new com.aspose.slides.internal.k4y.g2();
      s4m var3 = ((Slide)var1).q0();
      this.u3().k5().addItem(var1, this.t9());
      this.n5(var1.getShapes(), this.l6());
      k2.n5(var1, var2.h0(), this.l6());
      if (var2.s7() == null) {
         var2.k5();
      }

      d5t var4 = new d5t(this.l6().n5(), this.l6().a6());
      o5.n5(var1.getTimeline(), var1.getShapes(), var2.s7(), var4);
      var2.s7().n5(var3.k5());
      a1g.l6(((BaseThemeManager)var1.getThemeManager()).u3(), var2.n5());
      n8c.n5(var1.getSlideShowTransition(), var2.l6(), this.u3());
      var2.k5(!var1.getHidden());
      var2.n5(var1.getShowMasterShapes());
      var2.n5(var3.t2());
      var2.l6(var3.c8());
      com.aspose.slides.internal.o9b.f2 var5 = ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6();
      n5(var2.h0().u9(), var5.l6(), var5.k5(), "TextBox", this.l6());
      var2.n5(null, this.x8(), "sld");
      this.e2();
   }

   public w5r(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public w5r(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2, var3);
   }

   private static void n5(com.aspose.slides.internal.k4y.e2 var0, float var1, float var2, String var3, n4i var4) {
      String[] var5 = null;
      Presentation var6 = (Presentation)var4.n5().t2();
      String[][] var7 = new String[][]{var5};
      byte[] var8 = null;
      byte[][] var9 = new byte[][]{var8};
      int[] var10 = Presentation.n5((s4e)var6.t4(), var9);
      var8 = var9[0];
      var7[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var10, i7t.l6) && var8 != null && var8.length > 0) {
         var7[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var8), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var11 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var11 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var17) {
            var11 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var17);
         }
      }

      var5 = var7[0];
      if ((
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var10, i7t.k5)
         && !Arrays.equals(var11, com.aspose.slides.internal.n8e.z7.l6)) {
         double var13 = (var1 - 504.8F) / 2.0;
         double var15 = (var2 - 123.6F) / 2.0;
         n5(var0, var13, var15, var3, var5, var4);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.e2 var0, double var1, double var3, String var5, String[] var6, n4i var7) {
      com.aspose.slides.internal.k4y.x1u var8 = (com.aspose.slides.internal.k4y.x1u)var0.n5("sp").l6();
      var8.n5().n5().n5(var7.u3());
      var8.n5().n5().n5(var5);
      var8.n5().l6().n5(true);
      var8.n5().l6().n5();
      var8.n5().l6().k5().l6(true);
      var8.n5().l6().k5().k5(true);
      var8.n5().l6().k5().a6(true);
      var8.n5().l6().k5().n5(true);
      var8.l6().n5();
      var8.l6().u9().n5();
      var8.l6().u9().u9().n5(var1);
      var8.l6().u9().u9().l6(var3);
      var8.l6().u9().l6();
      var8.l6().u9().h0().n5(504.8324409448819);
      var8.l6().u9().h0().l6(123.59527559055118);
      com.aspose.slides.internal.k4y.r7n var9 = (com.aspose.slides.internal.k4y.r7n)var8.l6().k5("prstGeom").l6();
      var9.n5(5);
      var9.n5();
      var8.l6().l6("noFill");
      var8.u9();
      var8.a6().k5().n5(1);
      var8.a6().k5().a6((byte)0);
      var8.a6().k5().h0((byte)1);
      var8.a6().k5().c8((byte)1);
      var8.a6().k5().n5("spAutoFit");
      var8.a6().n5();
      var8.a6().u3().l6();
      var8.a6().u3().n3().l6(1);
      var8.a6().u3().n3().n5();
      ((com.aspose.slides.internal.k4y.z3b)var8.a6().u3().n3().t4().n5("spcPct").l6()).n5(150.0F);
      var8.a6().u3().n3().l6();
      ((com.aspose.slides.internal.k4y.z3b)var8.a6().u3().n3().q0().n5("spcPct").l6()).n5(0.0F);
      var8.a6().u3().n3().k5();
      ((com.aspose.slides.internal.k4y.z3b)var8.a6().u3().n3().z3().n5("spcPct").l6()).n5(0.0F);
      var8.a6().u3().n3().a6();
      var8.a6().u3().n3().w1().a6("en-US");
      var8.a6().u3().n3().w1().n5(32.0F);
      var8.a6().u3().n3().w1().l6((byte)1);
      var8.a6().u3().n3().w1().n5(false);
      var8.a6().u3().n3().w1().l6(false);
      var8.a6().u3().n3().w1().c8((byte)1);
      com.aspose.slides.internal.k4y.e2l var10 = (com.aspose.slides.internal.k4y.e2l)var8.a6().u3().n3().w1().l6("solidFill").l6();
      com.aspose.slides.internal.k4y.x4a var11 = (com.aspose.slides.internal.k4y.x4a)var10.n5("prstClr").l6();
      var11.n5(113);
      ((com.aspose.slides.internal.k4y.d2n)var11.n5("lumOff").l6()).n5(30.0F);
      ((com.aspose.slides.internal.k4y.d2n)var11.n5("alpha").l6()).n5(40.0F);
      com.aspose.slides.internal.k4y.o9b var12 = (com.aspose.slides.internal.k4y.o9b)var8.a6().u3().n3().w1().n5("effectLst").l6();
      var12.a6();
      var12.y4().n5(4.0);
      var12.y4().l6(3.0);
      var12.y4().n5((byte)2);
      var12.y4().n5(false);
      var11 = (com.aspose.slides.internal.k4y.x4a)var12.y4().n5("prstClr").l6();
      var11.n5(7);
      ((com.aspose.slides.internal.k4y.d2n)var11.n5("alpha").l6()).n5(80.0F);
      var8.a6().u3().n3().w1().k5();
      var8.a6().u3().n3().w1().s3().n5("Calibri");
      var8.a6().u3().n3().w1().s3().n5((byte)34);
      var8.a6().u3().n3().w1().s3().l6((byte)0);

      for (int var13 = 0; var13 < var6.length; var13++) {
         String var14 = var6[var13];
         var8.a6().l6();
         var8.a6().a6()[var13].n5().l6(2);
         com.aspose.slides.internal.k4y.r6a var15 = (com.aspose.slides.internal.k4y.r6a)var8.a6().a6()[var13].n5("r").l6();
         var15.n5(var14);
      }
   }
}
