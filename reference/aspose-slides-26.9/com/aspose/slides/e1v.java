package com.aspose.slides;

class e1v implements r8k {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private XamlOptions u9;
   private String h0;

   public final float n5() {
      return this.n5;
   }

   private void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   private void l6(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   private void k5(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   private void u3(float var1) {
      this.u3 = var1;
   }

   public final float a6() {
      return this.a6;
   }

   private void a6(float var1) {
      this.a6 = var1;
   }

   @Override
   public String toString() {
      return this.u9();
   }

   public e1v(IShape var1, XamlOptions var2, String var3) {
      if (var1 == null) {
         String var6 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfBlockOpenTag", "shape"});
         throw new t1c(var6);
      }

      if (var2 == null) {
         String var5 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfBlockOpenTag", "options"});
         throw new t1c(var5);
      }

      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         String var4 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfBlockOpenTag", "blockOpenTag"});
         throw new t1c(var4);
      }

      this.n5(0.0F);
      this.l6(0.0F);
      this.k5(0.0F);
      this.u3(0.0F);
      this.a6(0.0F);
      this.u9 = var2;
      this.h0 = var3;
      this.n5(var1);
   }

   private void n5(IShape var1) {
      this.n5(p7f.n5(this.u9, this.u9.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getX()));
      this.n5((float)com.aspose.slides.ms.System.q1.n5((double)(this.n5()), 2));
      this.l6(p7f.n5(this.u9, this.u9.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getY()));
      this.l6((float)com.aspose.slides.ms.System.q1.n5((double)(this.l6()), 2));
      this.u3(p7f.n5(this.u9, this.u9.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getHeight()));
      this.u3((float)com.aspose.slides.ms.System.q1.n5((double)(this.u3()), 2));
      this.k5(p7f.n5(this.u9, this.u9.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getWidth()));
      this.k5((float)com.aspose.slides.ms.System.q1.n5((double)(this.k5()), 2));
      this.a6(var1.getRotation());
      this.a6((float)com.aspose.slides.ms.System.q1.n5((double)(this.a6()), 2));
   }

   private String u9() {
      String var1 = this.h0();
      String var2 = com.aspose.slides.ms.System.d1.n5(this.h0, new Object[]{var1});
      if (this.a6() != 0.0F) {
         String var3 = this.c8();
         var2 = com.aspose.slides.ms.System.d1.n5(var2, var3);
      }

      return var2;
   }

   private String h0() {
      return com.aspose.slides.ms.System.d1.n5(
         " Margin=\"{0}, {1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.n5(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.l6(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String c8() {
      return com.aspose.slides.ms.System.d1.n5(
         "\n    <Canvas.RenderTransform>\n        <RotateTransform Angle=\"{0}\"/>\n    </Canvas.RenderTransform>",
         new Object[]{com.aspose.slides.ms.System.n1.n5(this.a6(), com.aspose.slides.internal.x7n.l6.k5())}
      );
   }
}
