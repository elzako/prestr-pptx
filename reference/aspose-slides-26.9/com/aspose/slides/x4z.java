package com.aspose.slides;

class x4z extends g4a {
   public x4z(ZoomObject var1) {
      super(var1);
   }

   public final ZoomObject n5() {
      return (ZoomObject)super.a6();
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
               String var10 = this.a6().getAlternativeText();
               var9 = var1.n5("TOCI", ((ShapeFrame)this.a6().getFrame()).n5().y4(), var10);
            }

            com.aspose.slides.internal.w0.c8 var17 = new com.aspose.slides.internal.w0.c8();
            var1.k5(var17);
            j5m var11 = new j5m(var4.cloneT(), new com.aspose.slides.internal.w0.c8(), null, this.h0(), var2);
            com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1(var5, var6, var7, var8);
            var1.n5(var12.y4(), null, a1v.n5(var11, (FillFormat)this.a6().getFillFormat()));
            if (this.n5().getTargetSlide() != null) {
               var1.l6(new Hyperlink(this.n5().getTargetSlide()));
            }

            if (this.n5().z8().getPicture().getImage() != null) {
               IPPImage var13 = this.n5().z8().getPicture().getImage();
               if (this.n5().z8().getPicture().getImage().getSvgImage() != null) {
                  SvgImage var14 = (SvgImage)this.n5().z8().getPicture().getImage().getSvgImage();
                  PictureFrame var15 = new PictureFrame(this.n5());
                  ISvgImage var16 = var14.n5(var15);
                  var13 = ((ImageCollection)this.n5().getPresentation().getImages()).l6(var16);
               }

               var1.n5(var13, var12.y4(), null);
            }

            if (!this.a6().getLineFormat().isFormatNotDefined()) {
               float var18 = com.aspose.slides.ms.System.d2.k5(this.a6().getLineFormat().getWidth()) ? 0.0F : (float)this.a6().getLineFormat().getWidth();
               var1.n5(
                  new com.aspose.slides.internal.o9b.y1(var5 - var18 / 2.0F, var6 - var18 / 2.0F, var7 + var18, var8 + var18),
                  new l6v(var11, (LineFormat)this.a6().getLineFormat()),
                  null
               );
            }

            var1.a6();
            var1.z3();
            if (var9) {
               var1.u9();
            }
         }
      }
   }
}
