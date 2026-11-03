package com.aspose.slides;

class t4l implements r8k {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private com.aspose.slides.internal.o9b.c8 u9 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 h0 = new com.aspose.slides.internal.o9b.c8();
   private XamlOptions c8;

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

   public final com.aspose.slides.internal.o9b.c8 u9() {
      return this.u9.o8();
   }

   private void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.u9 = var1.o8();
   }

   public final com.aspose.slides.internal.o9b.c8 h0() {
      return this.h0.o8();
   }

   private void l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.h0 = var1.o8();
   }

   @Override
   public String toString() {
      return this.c8();
   }

   public t4l(IShape var1, XamlOptions var2) {
      if (var1 == null) {
         String var4 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfEllipseObject", "shape"});
         throw new t1c(var4);
      }

      if (var2 == null) {
         String var3 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfEllipseObject", "options"});
         throw new t1c(var3);
      }

      this.n5(0.0F);
      this.l6(0.0F);
      this.k5(0.0F);
      this.u3(0.0F);
      this.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
      this.l6(com.aspose.slides.internal.o9b.c8.u3.o8());
      this.c8 = var2;
      this.n5(var1);
   }

   private void n5(IShape var1) {
      this.n5(p7f.n5(this.c8, this.c8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getX()));
      this.n5((float)com.aspose.slides.ms.System.q1.n5((double)(this.n5()), 2));
      this.l6(p7f.n5(this.c8, this.c8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getY()));
      this.l6((float)com.aspose.slides.ms.System.q1.n5((double)(this.l6()), 2));
      this.k5(p7f.n5(this.c8, this.c8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getWidth()));
      this.k5((float)com.aspose.slides.ms.System.q1.n5((double)(this.k5()), 2));
      this.u3(p7f.n5(this.c8, this.c8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getHeight()));
      this.u3((float)com.aspose.slides.ms.System.q1.n5((double)(this.u3()), 2));
      IFillFormatEffectiveData var2 = var1.getFillFormat().getEffective();
      ILineFormatEffectiveData var3 = var1.getLineFormat().getEffective();
      if (var2.getFillType() == 1) {
         this.n5(((f6a)var2).h0().o8());
      }

      if (var3.getStyle() != -1 && var3.getFillFormat().getFillType() == 1) {
         this.l6(((z1a)var3.getFillFormat()).u3().o8());
         float var4 = com.aspose.slides.ms.System.z3.x8(var3.getWidth());
         this.a6(p7f.n5(this.c8, this.c8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4));
         this.a6((float)com.aspose.slides.ms.System.q1.n5((double)(this.a6()), 2));
      }
   }

   private String c8() {
      String var1 = this.t2();
      String var2 = this.n5(this.u9().o8(), "Fill");
      String var3 = this.n5(this.h0().o8(), "Stroke");
      String var4 = this.s7();
      String var5 = this.x8();
      return com.aspose.slides.ms.System.d1.n5("<Ellipse{0}{1}{2}{3}{4}/>",new Object[]{ var1, var2, var3, var4, var5});
   }

   private String n5(com.aspose.slides.internal.o9b.c8 var1, String var2) {
      return var1 != null && !com.aspose.slides.internal.o9b.c8.n5(var1, com.aspose.slides.internal.o9b.c8.u3)
         ? com.aspose.slides.ms.System.d1.n5(
            " {0}=\"#{1}{2}{3}{4}\"",new Object[]{
            var2,
            com.aspose.slides.ms.System.e2.n5(var1.s7(), "X2"),
            com.aspose.slides.ms.System.e2.n5(var1.x8(), "X2"),
            com.aspose.slides.ms.System.e2.n5(var1.n3(), "X2"),
            com.aspose.slides.ms.System.e2.n5(var1.y4(), "X2")
         })
         : com.aspose.slides.ms.System.d1.n5;
   }

   private String t2() {
      return com.aspose.slides.ms.System.d1.n5(
         " Margin=\"{0}, {1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.n5(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.l6(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String s7() {
      return com.aspose.slides.ms.System.d1.n5(
         " Width=\"{0}\" Height=\"{1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.k5(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.u3(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String x8() {
      return !com.aspose.slides.ms.System.n1.k5(this.a6()) && this.a6() != 0.0F
         ? com.aspose.slides.ms.System.d1.n5(
            " StrokeThickness=\"{0}\"", new Object[]{com.aspose.slides.ms.System.n1.n5(this.a6(), com.aspose.slides.internal.x7n.l6.k5())}
         )
         : com.aspose.slides.ms.System.d1.n5;
   }
}
