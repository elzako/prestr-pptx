package com.aspose.slides;

final class h5t extends g4a {
   private boolean n5;

   public h5t(SmartArt var1) {
      super(var1);
   }

   public final SmartArt n5() {
      return (SmartArt)super.a6();
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void k5(boolean var1) {
      this.n5 = var1;
   }

   public final void u3() {
      if (!this.n5) {
         ShapeFrame var1 = this.n3();
         if (!com.aspose.slides.ms.System.n1.k5(var1.getX())
            && !com.aspose.slides.ms.System.n1.k5(var1.getY())
            && !com.aspose.slides.ms.System.n1.k5(var1.getWidth())
            && !com.aspose.slides.ms.System.n1.k5(var1.getHeight())) {
            this.n5(var1);
         }
      }
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!this.a6().getHidden()) {
         if (this.a6().getHyperlinkClick() != null) {
            var1.l6(this.a6().getHyperlinkClick());
         }

         ShapeFrame var4 = this.n3();
         if (!com.aspose.slides.ms.System.n1.k5(var4.getX())
            && !com.aspose.slides.ms.System.n1.k5(var4.getY())
            && !com.aspose.slides.ms.System.n1.k5(var4.getWidth())
            && !com.aspose.slides.ms.System.n1.k5(var4.getHeight())) {
            com.aspose.slides.internal.w0.c8 var5 = new com.aspose.slides.internal.w0.c8(
               var4.getFlipH() == 1 ? -1.0F : 1.0F,
               0.0F,
               0.0F,
               var4.getFlipV() == 1 ? -1.0F : 1.0F,
               var4.getFlipH() == 1 ? var4.getCenterX() * 2.0F : 0.0F,
               var4.getFlipV() == 1 ? var4.getCenterY() * 2.0F : 0.0F
            );
            if (!com.aspose.slides.ms.System.n1.k5(var4.getRotation())) {
               var5.n5(
                  var4.getFlipH() == 1 ^ var4.getFlipV() == 1 ? -var4.getRotation() : var4.getRotation(),
                  new com.aspose.slides.internal.o9b.w1(var4.getCenterX(), var4.getCenterY()),
                  0
               );
            }

            var1.k5(var5);
            com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
            var6.l6(var4.n5().y4());
            j5m var7 = new j5m(var4.cloneT(), var1.q0(), var6, this.h0(), var2);
            a1v var8 = a1v.n5(var7, this.a6().c8);
            l6v var9 = new l6v(var7, this.a6().y2());
            this.n5(var1, var2, var6, var8, var9, var4, this.a6().getEffectFormat().getEffective());
            var1.n5(var6, null, var8);
            if (this.l6()) {
               GroupShape var10 = this.n5().y4().k5();
               var10.setFrame(var4);
               var10.n5(e4c.k5.u9());
               var10.l6(new e4c(var4.getWidth(), var4.getHeight()));
            } else {
               this.n5(var4);
            }

            if (!this.n5().a5()) {
               var1.n5("Diagram", ((ShapeFrame)this.n5().getFrame()).n5().y4(), this.n5().getAlternativeText());
            }

            this.n5().y4().k5().e5().n5(var1, var2, var3);
            var1.n5(var6, var9, (a1v)null);
            if (!this.n5().a5()) {
               var1.u9();
            }

            var1.z3();
         }

         if (this.a6().getHyperlinkClick() != null) {
            var1.a6();
         }
      }
   }

   final void n5(ShapeFrame var1) {
      this.n5 = true;
      GroupShape var2 = this.n5().y4().k5();
      var2.setFrame(var1);
      var2.n5(e4c.k5.u9());
      var2.l6(new e4c(var1.getWidth(), var1.getHeight()));
      if (!this.n5().e2()) {
         this.n5().u9().h0().getShapes().clear();
         this.n5().y4().h0();
         this.n5().y4().a6();
      }

      this.n5().z1();
   }

   final void n5(e3 var1, s5u var2, com.aspose.slides.internal.x4g.s7 var3, a1v var4, l6v var5, ShapeFrame var6, IEffectFormatEffectiveData var7) {
      if (var7 != null && var3.h0() != 0) {
         if (var7.getReflectionEffect() != null) {
            q2b var8 = new q2b(var7.getReflectionEffect());
            var8.n5(var1, var3, var4, var5, var6);
         }

         if (var7.getOuterShadowEffect() != null) {
            n7q var9 = new n7q(var7.getOuterShadowEffect());
            var9.n5(var1, var3, var4, var5);
         }

         if (var7.getGlowEffect() != null) {
            i5q var10 = new i5q(var7.getGlowEffect());
            var10.n5(var1, var3, var4, var5);
         }

         if (var7.getInnerShadowEffect() != null) {
            y3w var11 = new y3w(var7.getInnerShadowEffect());
            var11.n5(var1, var3, var4, var5, var6);
         }

         if (var7.getSoftEdgeEffect() != null && var7.getSoftEdgeEffect().getRadius() != 0.0) {
            e7o var12 = new e7o(var7.getSoftEdgeEffect());
            var12.n5(var1, var2, var3, var4, var5);
         }
      }
   }
}
