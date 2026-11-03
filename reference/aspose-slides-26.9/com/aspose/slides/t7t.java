package com.aspose.slides;

class t7t implements r2w {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private int a6;
   private float u9;
   private boolean h0;
   private boolean c8;
   private byte[] t2;
   private String s7;
   private XamlOptions x8;

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

   private void n5(int var1) {
      this.a6 = var1;
   }

   public final float h0() {
      return this.u9;
   }

   private void a6(float var1) {
      this.u9 = var1;
   }

   public final boolean c8() {
      return this.h0;
   }

   private void n5(boolean var1) {
      this.h0 = var1;
   }

   public final boolean t2() {
      return this.c8;
   }

   private void l6(boolean var1) {
      this.c8 = var1;
   }

   @Override
   public final byte[] n5() {
      return this.t2;
   }

   private void n5(byte[] var1) {
      this.t2 = var1;
   }

   @Override
   public final String l6() {
      return this.s7;
   }

   private void n5(String var1) {
      this.s7 = var1;
   }

   @Override
   public String toString() {
      return this.s7();
   }

   public t7t(IPictureFrame var1, XamlOptions var2) {
      if (var1 == null) {
         String var4 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamarinImageObject", "pictureFrame"});
         throw new t1c(var4);
      }

      if (var2 == null) {
         String var3 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamarinImageObject", "options"});
         throw new t1c(var3);
      }

      this.n5(0.0F);
      this.l6(0.0F);
      this.k5(0.0F);
      this.u3(0.0F);
      this.a6(0.0F);
      this.n5(false);
      this.l6(false);
      this.x8 = var2;
      this.n5(com.aspose.slides.ms.System.d1.n5);
      this.n5(var1);
   }

   private void n5(IPictureFrame var1) {
      this.n5(p7f.n5(this.x8, this.x8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getX()));
      this.n5((float)com.aspose.slides.ms.System.q1.n5((double)(this.k5()), 2));
      this.l6(p7f.n5(this.x8, this.x8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getY()));
      this.l6((float)com.aspose.slides.ms.System.q1.n5((double)(this.u3()), 2));
      this.k5(p7f.n5(this.x8, this.x8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getWidth()));
      this.k5((float)com.aspose.slides.ms.System.q1.n5((double)(this.a6()), 2));
      this.u3(p7f.n5(this.x8, this.x8.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var1.getHeight()));
      this.u3((float)com.aspose.slides.ms.System.q1.n5((double)(this.u9()), 2));
      this.n5(var1.getPictureFormat().getPictureFillMode());
      this.a6(var1.getRotation());
      this.n5(var1.getFrame().getFlipH() == 1);
      this.l6(var1.getFrame().getFlipV() == 1);
      this.l6(var1);
   }

   private void l6(IPictureFrame var1) {
      IPPImage var2 = var1.getPictureFormat().getPicture().getImage();
      if (com.aspose.slides.ms.System.d1.n5(var2.getContentType())) {
         String var17 = com.aspose.slides.ms.System.d1.n5(
            "In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamarinImageObject", "pictureFrame.PictureFormat.Picture.Image.ContentType"
         });
         throw new t1c(var17);
      }

      String var3 = com.aspose.slides.ms.System.d1.n5(var1.getName(), " ", "");
      long var4 = var1.getSlide().getSlideId();
      String var6 = "Slide{SlideID}{PictureName}";
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{SlideID}", com.aspose.slides.ms.System.l4.l6(var4));
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{PictureName}", var3);
      this.n5(com.aspose.slides.ms.System.d1.n5("{0}.png", new Object[]{var6}));
      IImage var7 = var2.getImage();

      try {
         com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

         try {
            ((u4i)var7).n5(var8, 6);
            this.n5(var8.toArray());
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      } finally {
         var7.dispose();
      }
   }

   private String s7() {
      String var1 = this.x8();
      String var2 = this.n3();
      String var3 = this.y4();
      String var4 = this.e2();
      String var5 = this.t9();
      String var6 = this.z1();
      return com.aspose.slides.ms.System.d1.n5("<Image{0}{1}{2}{3}{4}{5}/>",new Object[]{ var1, var2, var3, var4, var5, var6});
   }

   private String x8() {
      return com.aspose.slides.ms.System.d1.n5(this.l6())
         ? com.aspose.slides.ms.System.d1.n5
         : com.aspose.slides.ms.System.d1.n5(" Source=\"{0}\"", new Object[]{this.l6()});
   }

   private String n3() {
      return !com.aspose.slides.ms.System.n1.k5(this.k5())
            && !com.aspose.slides.ms.System.n1.k5(this.u3())
            && !com.aspose.slides.ms.System.n1.k5(this.a6())
            && !com.aspose.slides.ms.System.n1.k5(this.u9())
         ? com.aspose.slides.ms.System.d1.n5(
            " AbsoluteLayout.LayoutBounds=\"{0}, {1}\"",new Object[]{
            com.aspose.slides.ms.System.n1.n5(this.k5(), com.aspose.slides.internal.x7n.l6.k5()),
            com.aspose.slides.ms.System.n1.n5(this.u3(), com.aspose.slides.internal.x7n.l6.k5())
         })
         : com.aspose.slides.ms.System.d1.n5;
   }

   private String y4() {
      return !com.aspose.slides.ms.System.n1.k5(this.k5())
            && !com.aspose.slides.ms.System.n1.k5(this.u3())
            && !com.aspose.slides.ms.System.n1.k5(this.a6())
            && !com.aspose.slides.ms.System.n1.k5(this.u9())
         ? com.aspose.slides.ms.System.d1.n5(
            " WidthRequest=\"{0}\" HeightRequest=\"{1}\"",new Object[]{
            com.aspose.slides.ms.System.n1.n5(this.a6(), com.aspose.slides.internal.x7n.l6.k5()),
            com.aspose.slides.ms.System.n1.n5(this.u9(), com.aspose.slides.internal.x7n.l6.k5())
         })
         : com.aspose.slides.ms.System.d1.n5;
   }

   private String e2() {
      return this.c8() ? " RotationX=\"180\"" : com.aspose.slides.ms.System.d1.n5;
   }

   private String t9() {
      return this.t2() ? " RotationY=\"180\"" : com.aspose.slides.ms.System.d1.n5;
   }

   private String z1() {
      float var1 = this.h0() * 2.0F;
      return this.h0() != 0.0F
         ? com.aspose.slides.ms.System.d1.n5(" Rotation=\"{0}\"", new Object[]{com.aspose.slides.ms.System.n1.n5(var1, com.aspose.slides.internal.x7n.l6.k5())})
         : com.aspose.slides.ms.System.d1.n5;
   }
}
