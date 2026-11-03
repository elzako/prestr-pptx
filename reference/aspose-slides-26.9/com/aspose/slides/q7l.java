package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class q7l extends g4a {
   public q7l(GroupShape var1) {
      super(var1);
   }

   public final GroupShape n5() {
      return (GroupShape)super.a6();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!l6o.n5(var1, var2, this.n5())) {
         this.l6(var1, var2, var3);
         this.k5(var1, var2, var3);
      }
   }

   private void l6(e3 var1, s5u var2, InterruptionToken var3) {
      IEffectFormatEffectiveData var4 = this.n5().getEffectFormat().getEffective();
      if (var4 != null && (var4.getOuterShadowEffect() != null || var4.getGlowEffect() != null)) {
         if (this.l6()) {
            return;
         }

         if (var4 != null && (var4.getOuterShadowEffect() != null || var4.getGlowEffect() != null)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
               y4x var5 = new y4x();
               s5u var6 = new s5u(var2.u3(), var2.t4(), var5);
               com.aspose.slides.internal.o9b.l6 var7 = new com.aspose.slides.internal.o9b.l6(var1.s7(), var1.x8());

               try {
                  r1c var8 = new r1c(var7, var7.e2(), var7.h0());

                  try {
                     com.aspose.slides.internal.o9b.z1 var9 = com.aspose.slides.internal.o9b.z1.n5(var7);

                     try {
                        var9.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
                     } finally {
                        if (var9 != null) {
                           var9.dispose();
                        }
                     }

                     this.n5(var8, var6, var4, var3);
                     var1.n5(var7, 0, 0);
                  } finally {
                     if (var8 != null) {
                        var8.dispose();
                     }
                  }
               } finally {
                  if (var7 != null) {
                     var7.dispose();
                  }
               }

               return;
            }

            this.n5(var1, var2, var4, var3);
         }
      }
   }

   private void n5(e3 var1, s5u var2, IEffectFormatEffectiveData var3, InterruptionToken var4) {
      j0b var5 = new j0b(var1.s7(), var1.x8(), var1.c8() / 8.0F, var1.t2() / 8.0F);

      try {
         this.k5(var5, var2, var4);
         if (var3.getOuterShadowEffect() != null) {
            n7q var6 = new n7q(var3.getOuterShadowEffect());
            var6.n5(var1, var5.y4());
         }

         if (var3.getGlowEffect() != null) {
            i5q var10 = new i5q(var3.getGlowEffect());
            var10.n5(var1, var5.y4());
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private boolean l6() {
      if (this.n5().getThreeDFormat().getCamera().getCameraType() != -1) {
         return true;
      }

      IGenericEnumerator var1 = this.n5().getShapes().iterator();

      try {
         while (var1.hasNext()) {
            IShape var2 = (IShape)var1.next();
            if (var2.getThreeDFormat().getCamera().getCameraType() == -1) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   private void k5(e3 var1, s5u var2, InterruptionToken var3) {
      var3.throwIfInterruptionRequested();
      if (!this.a6().getHidden()) {
         if (this.a6().getHyperlinkClick() != null) {
            var1.l6(this.a6().getHyperlinkClick());
         }

         boolean var4 = com.aspose.slides.internal.v6g.k5.l6(this.h0(), Slide.class)
            || com.aspose.slides.internal.v6g.k5.l6(this.h0(), NotesSlide.class)
            || com.aspose.slides.internal.v6g.k5.l6(this.h0(), MasterHandoutSlide.class);
         ShapeCollection var5 = this.n5().n5;
         boolean var6 = false;

         for (int var7 = 0; var7 < var5.size(); var7++) {
            Shape var8 = (Shape)var5.get_Item(var7);
            var6 = false;
            boolean var9 = com.aspose.slides.internal.v6g.k5.l6(var8, AutoShape.class)
               && ((AutoShape)var8).getTextFrame() != null
               && com.aspose.slides.ms.System.d1.n5(((TextFrame)((AutoShape)var8).getTextFrame()).t2());
            String var10 = com.aspose.slides.ms.System.d1.n5(var8.getAlternativeText()) ? var8.getAlternativeTextTitle() : var8.getAlternativeText();
            if (com.aspose.slides.internal.v6g.k5.l6(this.h0(), MasterSlide.class) || com.aspose.slides.internal.v6g.k5.l6(this.h0(), LayoutSlide.class)) {
               var8.a6(true);
            } else if (!var8.a5()
               && this.h0().k5 == this.n5()
               && (com.aspose.slides.internal.v6g.k5.l6(var8, GroupShape.class) || com.aspose.slides.internal.v6g.k5.l6(var8, PictureFrame.class) || var9)
               && !com.aspose.slides.ms.System.d1.n5(var10)) {
               var6 = var1.n5("Figure", ((ShapeFrame)var8.getFrame()).n5().y4(), var10);
            }

            IShapeFrame var11 = var8.getFrame();
            if (var11.getWidth() == 0.0F && var11.getHeight() == 0.0F) {
               IAutoShape var12 = com.aspose.slides.internal.v6g.k5.n5(var8, IAutoShape.class);
               if (var12 == null || var12.getTextFrame() == null || com.aspose.slides.ms.System.d1.n5(((TextFrame)var12.getTextFrame()).t2())) {
                  continue;
               }
            }

            if (var4 || !var8.isTextHolder()) {
               var2.n5(var1, var8, var3);
            }

            if (var6) {
               var1.u9();
            }
         }

         if (this.a6().getHyperlinkClick() != null) {
            var1.a6();
         }
      }
   }
}
