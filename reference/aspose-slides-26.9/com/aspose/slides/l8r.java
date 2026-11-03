package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

final class l8r extends g4a {
   public l8r(Chart var1) {
      super(var1);
   }

   public final Chart n5() {
      return (Chart)super.a6();
   }

   public final void l6() {
      this.u3();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!this.a6().getHidden()) {
         var3.throwIfInterruptionRequested();
         n1g var4 = new n1g(this.n5(), var1, var2);
         ShapeFrame var5 = this.n3();
         float var6 = var5.getX();
         float var7 = var5.getY();
         float var8 = var5.getWidth();
         float var9 = var5.getHeight();
         if (!com.aspose.slides.ms.System.n1.k5(var6)
            && !com.aspose.slides.ms.System.n1.k5(var7)
            && !com.aspose.slides.ms.System.n1.k5(var8)
            && !com.aspose.slides.ms.System.n1.k5(var9)) {
            if (var5.getWidth() != 0.0F || var5.getHeight() != 0.0F) {
               boolean var10 = false;
               if (!this.n5().a5()) {
                  var10 = var1.n5("Chart", ((ShapeFrame)this.n5().getFrame()).n5().y4(), this.n5().getAlternativeText());
                  if (var10) {
                     var1.u9();
                  }
               }

               com.aspose.slides.internal.w0.c8 var11 = new com.aspose.slides.internal.w0.c8(
                  var5.getFlipH() == 1 ? -1.0F : 1.0F,
                  0.0F,
                  0.0F,
                  var5.getFlipV() == 1 ? -1.0F : 1.0F,
                  var5.getFlipH() == 1 ? var5.getCenterX() * 2.0F : 0.0F,
                  var5.getFlipV() == 1 ? var5.getCenterY() * 2.0F : 0.0F
               );
               if (!com.aspose.slides.ms.System.n1.k5(var5.getRotation())) {
                  var11.n5(
                     var5.getFlipH() == 1 ^ var5.getFlipV() == 1 ? -var5.getRotation() : var5.getRotation(),
                     new com.aspose.slides.internal.o9b.w1(var5.getCenterX(), var5.getCenterY()),
                     0
                  );
               }

               com.aspose.slides.internal.w0.c8 var12 = var11;
               var1.k5(var12);
               if (this.n5().k5()) {
                  if (var4.y4().size() != 0) {
                     u2w var13 = new u2w(var4);
                     var13.a6();
                  }
               } else if (this.n5().getType() == 81) {
                  if (this.a6().w1() != null) {
                     this.a6().w1().e5().n5(var1, var2, var3);
                  }
               } else {
                  if (!ChartTypeCharacterizer.is3DChart(this.n5().getType())) {
                     throw new NotImplementedException("Chart type is not supported for rendering");
                  }

                  if (u6p.n5(this.n5())) {
                     p4l var15 = new p4l(var4);
                     var15.n5();
                  } else {
                     g8v.l6(var4);
                  }
               }

               var1.n5(true);
               this.l6(var1, var2, var3);
               var1.n5(false);
               var1.z3();
            }
         }
      }
   }

   private void l6(e3 var1, s5u var2, InterruptionToken var3) {
      if (this.n5().e2() != null) {
         this.u3();
         f9 var4 = new f9();
         e3[] var5 = new e3[]{var1};
         var4.n5(var5, ((ShapeFrame)this.a6().getFrame()).n5().y4());
         var1 = var5[0];
         this.n5().e2().e5().n5(var1, var2, var3);
         var5[0] = var1;
         var4.n5(var5);
         var1 = var5[0];
      }
   }

   private void u3() {
      o4f var1 = this.a6().R_();
      o4f var2 = this.n5().e2().R_();
      var2.n5(new e4c(this.a6().getX(), this.a6().getY()));
      this.n5().e2().n5((double)this.a6().getWidth(), (double)this.a6().getHeight());
      var2.n5(var1.k5(), var1.u3(), var1.a6());
   }
}
