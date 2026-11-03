package com.aspose.slides;

class y2c implements e5n {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private boolean u9;
   private boolean h0;
   private byte[] c8;
   private String t2;
   private XamlOptions s7;
   private boolean x8;

   public final float k5() {
      return this.n5;
   }

   private void n5(float var1) {
      this.n5 = var1;
   }

   public final float u3() {
      return this.l6;
   }

   private void l6(float var1) {
      this.l6 = var1;
   }

   public final float a6() {
      return this.k5;
   }

   private void k5(float var1) {
      this.k5 = var1;
   }

   public final float u9() {
      return this.u3;
   }

   private void u3(float var1) {
      this.u3 = var1;
   }

   public final float h0() {
      return this.a6;
   }

   private void a6(float var1) {
      this.a6 = var1;
   }

   public final boolean c8() {
      return this.u9;
   }

   private void n5(boolean var1) {
      this.u9 = var1;
   }

   public final boolean t2() {
      return this.h0;
   }

   private void l6(boolean var1) {
      this.h0 = var1;
   }

   @Override
   public final byte[] n5() {
      return this.c8;
   }

   private void n5(byte[] var1) {
      this.c8 = var1;
   }

   @Override
   public final String l6() {
      return this.t2;
   }

   private void n5(String var1) {
      this.t2 = var1;
   }

   @Override
   public final String n5(IShape var1, XamlOptions var2) {
      if (var1 == null) {
         String var4 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfCustomObject", "shape"});
         throw new t1c(var4);
      } else if (var2 == null) {
         String var3 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfCustomObject", "options"});
         throw new t1c(var3);
      } else {
         this.n5(0.0F);
         this.l6(0.0F);
         this.k5(0.0F);
         this.u3(0.0F);
         this.a6(0.0F);
         this.n5(false);
         this.l6(false);
         this.s7 = var2;
         this.n5(com.aspose.slides.ms.System.d1.n5);
         this.n5(var1);
         return this.s7();
      }
   }

   private void n5(IShape var1) {
      this.n5(p7f.n5(this.s7, this.s7.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getX()));
      this.n5((float)com.aspose.slides.ms.System.q1.n5((double)(this.k5()), 2));
      this.l6(p7f.n5(this.s7, this.s7.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getY()));
      this.l6((float)com.aspose.slides.ms.System.q1.n5((double)(this.u3()), 2));
      this.k5(p7f.n5(this.s7, this.s7.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getWidth()));
      this.k5((float)com.aspose.slides.ms.System.q1.n5((double)(this.a6()), 2));
      this.u3(p7f.n5(this.s7, this.s7.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getHeight()));
      this.u3((float)com.aspose.slides.ms.System.q1.n5((double)(this.u9()), 2));
      this.a6(var1.getRotation());
      this.a6((float)com.aspose.slides.ms.System.q1.n5((double)(this.h0()), 2));
      this.n5(var1.getFrame().getFlipH() == 1);
      this.l6(var1.getFrame().getFlipV() == 1);
      if (this.h0() != 0.0F || this.c8() || this.t2()) {
         this.x8 = true;
      }

      this.l6(var1);
   }

   private void l6(IShape var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(var1.getName(), " ", "");
      long var3 = var1.getSlide().getSlideId();
      String var5 = "Slide{SlideID}{PictureName}";
      var5 = com.aspose.slides.ms.System.d1.n5(var5, "{SlideID}", com.aspose.slides.ms.System.l4.l6(var3));
      var5 = com.aspose.slides.ms.System.d1.n5(var5, "{PictureName}", var2);
      this.n5(com.aspose.slides.ms.System.d1.n5("{0}_{1}.png",new Object[]{ var5, com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())}));
      IImage var6 = var1.getImage();

      try {
         com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2();

         try {
            ((u4i)var6).n5(var7, 6);
            this.n5(var7.toArray());
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } finally {
         var6.dispose();
      }
   }

   private String s7() {
      String var1 = this.x8();
      String var2 = this.n3();
      String var3 = this.y4();
      String var4 = com.aspose.slides.ms.System.d1.n5;
      if (!this.x8) {
         var4 = com.aspose.slides.ms.System.d1.n5("<Image{0}{1}{2}/>",new Object[]{ var1, var2, var3});
      } else {
         String var5 = this.e2();
         String var6 = this.t9();
         var4 = com.aspose.slides.ms.System.d1.n5("<Image{0}{1}{2}{3}>{4}\r\n</Image>",new Object[]{ var1, var2, var3, var5, var6});
      }

      return var4;
   }

   private String x8() {
      return com.aspose.slides.ms.System.d1.n5(this.l6())
         ? com.aspose.slides.ms.System.d1.n5
         : com.aspose.slides.ms.System.d1.n5(" Source=\"{0}\"", new Object[]{this.l6()});
   }

   private String n3() {
      return com.aspose.slides.ms.System.d1.n5(
         " Margin=\"{0}, {1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.k5(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.u3(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String y4() {
      return com.aspose.slides.ms.System.d1.n5(
         " Width=\"{0}\" Height=\"{1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.a6(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.u9(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String e2() {
      return this.x8 ? " RenderTransformOrigin=\"0.5, 0.5\"" : com.aspose.slides.ms.System.d1.n5;
   }

   private String t9() {
      String var1 = this.z1();
      String var2 = this.t4();
      return com.aspose.slides.ms.System.d1.n5(
         "\r\n<Image.RenderTransform>\r\n    <TransformGroup>\r\n        {0}\r\n        <SkewTransform/>  \r\n        {1}\r\n        <TranslateTransform/>   \r\n    </TransformGroup>   \r\n</Image.RenderTransform>",new Object[]{
         var1,
         var2
      });
   }

   private String z1() {
      return com.aspose.slides.ms.System.d1.n5(
         "<ScaleTransform{0}{1}/>",new Object[]{
         this.c8() ? " ScaleX=\"-1\"" : com.aspose.slides.ms.System.d1.n5,
         this.t2() ? " ScaleY=\"-1\"" : com.aspose.slides.ms.System.d1.n5
      });
   }

   private String t4() {
      return com.aspose.slides.ms.System.d1.n5(
         "<RotateTransform{0}/>",
         new Object[]{
            this.h0() != 0.0F
               ? com.aspose.slides.ms.System.d1.n5(
                  " Angle=\"{0}\"", new Object[]{com.aspose.slides.ms.System.n1.n5(this.h0(), com.aspose.slides.internal.x7n.l6.k5())}
               )
               : com.aspose.slides.ms.System.d1.n5
         }
      );
   }
}
