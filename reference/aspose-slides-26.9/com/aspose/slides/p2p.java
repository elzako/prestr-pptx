package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class p2p extends n8 {
   final void n5(IMasterSlide var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "sldMaster".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.s8 var2 = new com.aspose.slides.internal.k4y.s8(this.s7());
            a1g.n5(var1.getThemeManager(), var2.c8());
            this.n5(var1.getThemeManager());
            k2.n5(var1, var2.h0(), this.n5());
            n8c.n5(var1.getSlideShowTransition(), var2.s7(), this.k5());
            com.aspose.slides.internal.k4y.q0h var3 = var2.y4();
            if (var3 != null) {
               p2m.n5(var1.getTitleStyle(), var3.u3(), this.k5());
               p2m.n5(var1.getBodyStyle(), var3.a6(), this.k5());
               p2m.n5(var1.getOtherStyle(), var3.u9(), this.k5());
            }

            var1.setPreserve(var2.u9());
            this.l6(var1, var2);
            this.n5(var1, var2);
         }
      }

      this.n3();
   }

   private void n5(IMasterSlide var1, com.aspose.slides.internal.k4y.s8 var2) {
      SortedList var3 = null;
      SortedList[] var4 = new SortedList[]{var3};
      this.k5().y4().tryGetValue(this.t9().l6(), var4);
      var3 = var4[0];
      if (var2.t2() != null) {
         for (com.aspose.slides.internal.k4y.p8e var8 : var2.t2().l6()) {
            String var9 = var8.l6();
            com.aspose.slides.internal.c8m.j8 var10 = this.k5().k7().n5(var9).l6();
            p8c var11 = new p8c(var10, this.k5());
            ILayoutSlide var12 = null;
            ILayoutSlide[] var13 = new ILayoutSlide[]{var12};
            var11.n5(var1, var13);
            var12 = var13[0];
            switch (this.k5().u9()) {
               case 0:
                  ((LayoutSlide)var12).t4().n5(var8.n5());
                  break;
               case 1:
                  ((LayoutSlide)var12).t4().n5(((Presentation)var1.getPresentation()).n3().w1());
               case 2:
               case 3:
                  break;
               default:
                  throw new ArgumentOutOfRangeException();
            }

            ((Presentation)var1.getPresentation()).n3().l6(var8.n5());
            this.k5().x8().addItem(var10.l6(), var12);
            ((LayoutSlide)var12).t4().l6(var8.k5());
            if (var3 != null) {
               var3.removeItemByKey(var10.l6());
            }
         }
      }
   }

   private void l6(IMasterSlide var1, com.aspose.slides.internal.k4y.s8 var2) {
      o1l var3 = ((MasterSlide)var1).t4();
      var3.n5(var2.x8());
      w3j var4 = new w3j(this.n5().n5(), this.n5().u3());
      o5.n5(var1.getTimeline(), var2.x8(), var4);
      f6p.n5(var3.c8(), var2.n3());
      var3.u3(var2.e2());
      com.aspose.slides.internal.k4y.q0h var5 = var2.y4();
      if (var5 != null) {
         var3.a6(var5.h0());
      }

      w3m.n5((DrawingGuidesCollection)var1.getDrawingGuides(), var3.t2(), "{27BBF7A9-308A-43DC-89C8-2F10F3537804}");
   }

   final void n5(IMasterSlide var1, boolean var2) {
      this.y4();
      com.aspose.slides.internal.k4y.s8 var3 = new com.aspose.slides.internal.k4y.s8();
      o1l var4 = ((MasterSlide)var1).t4();
      this.u3().k5().addItem(var1, this.t9());
      this.n5(var1.getShapes(), this.l6());
      if (var3.x8() == null) {
         var3.k5();
      }

      d5t var5 = new d5t(this.l6().n5(), this.l6().a6());
      o5.n5(var1.getTimeline(), var1.getShapes(), var3.x8(), var5);
      k2.n5(var1, var3.h0(), this.l6());
      a1g.l6(var1.getThemeManager(), var3.c8());
      if (var1.getLayoutSlides().size() > 0 && var2) {
         com.aspose.slides.internal.k4y.j5e var6 = var3.n5();
         IGenericEnumerator var7 = var1.getLayoutSlides().iterator();

         try {
            while (var7.hasNext()) {
               LayoutSlide var8 = (LayoutSlide)var7.next();
               com.aspose.slides.internal.k4y.p8e var9 = var6.n5();
               var9.n5(var8.t4().u3());
               var9.n5(this.t9().e2().n5(this.u3().k5().get_Item(var8)).a6());
               var9.n5(var8.t4().a6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      n8c.n5(var1.getSlideShowTransition(), var3.l6(), this.u3());
      com.aspose.slides.internal.k4y.q0h var13 = var3.a6();
      p2m.n5(var1.getTitleStyle(), new p2p$1(this, var13), this.u3());
      p2m.n5(var1.getBodyStyle(), new p2p$2(this, var13), this.u3());
      p2m.n5(var1.getOtherStyle(), new p2p$3(this, var13), this.u3());
      var3.n5(var1.getPreserve());
      f6p.n5(var4.c8(), new p2p$4(this, var3));
      var4.u3(w3m.l6((DrawingGuidesCollection)var1.getDrawingGuides(), var4.t2(), "{27BBF7A9-308A-43DC-89C8-2F10F3537804}"));
      var3.n5(var4.t2());
      var3.y4().n5(var4.s7());
      var3.n5(null, this.x8(), "sldMaster");
      this.e2();
   }

   public p2p(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public p2p(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2, var3);
   }
}
