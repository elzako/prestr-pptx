package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class f5e extends g4a {
   public f5e(SummaryZoomFrame var1) {
      super(var1);
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      var3.throwIfInterruptionRequested();
      if (!this.a6().getHidden()) {
         ShapeFrame var4 = this.n3();
         float var5 = var4.getX();
         float var6 = var4.getY();
         float var7 = var4.getWidth();
         float var8 = var4.getHeight();
         if (!com.aspose.slides.ms.System.n1.k5(var5)
            && !com.aspose.slides.ms.System.n1.k5(var6)
            && !com.aspose.slides.ms.System.n1.k5(var7)
            && !com.aspose.slides.ms.System.n1.k5(var8)) {
            boolean var9 = false;
            if (!this.a6().a5()) {
               var9 = var1.n5("TOC", ((ShapeFrame)this.a6().getFrame()).n5().y4(), this.a6().getAlternativeText());
            }

            com.aspose.slides.internal.w0.c8 var10 = new com.aspose.slides.internal.w0.c8(
               var1.q0().u3(), var1.q0().a6(), var1.q0().u9(), var1.q0().h0(), var5, var6
            );
            var1.k5(var10);
            IGenericEnumerator var11 = ((SummaryZoomFrame)this.a6()).getSummaryZoomCollection().iterator();

            try {
               while (var11.hasNext()) {
                  ISummaryZoomSection var12 = (ISummaryZoomSection)var11.next();
                  var12.setDecorative(this.a6().isDecorative());
                  ((SummaryZoomSection)var12).e5().n5(var1, var2, var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }

            var1.z3();
            if (var9) {
               var1.u9();
            }
         }
      }
   }
}
