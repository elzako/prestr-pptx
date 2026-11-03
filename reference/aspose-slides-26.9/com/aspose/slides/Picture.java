package com.aspose.slides;

public final class Picture implements ISlidesPicture, q1v {
   private t9a l6;
   final com.aspose.slides.internal.v6g.n5<t9a> n5 = new Picture$1(this);
   private k8s k5;
   private boolean u3;
   private final r0g a6;
   private IPresentationComponent u9;
   private ISlideComponent h0;
   private ImageTransformOperationCollection c8;
   private e3e t2;

   Picture(r0g parentImmediate) {
      this.a6 = parentImmediate;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   @Override
   public final long getVersion() {
      return this.k5 == null ? 1L : this.k5.a6();
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.u9 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.u9};
         d0u.n5(IPresentationComponent.class, this.a6, var1);
         this.u9 = var1[0];
         if (com.aspose.slides.internal.v6g.k5.l6(this.u9, PVIObject.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, IChartComponent.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, Background.class)) {
            this.u9 = com.aspose.slides.internal.v6g.k5.n5(this.u9, PVIObject.class).getParent_IPresentationComponent();
         }
      }

      return this.u9;
   }

   @Override
   public final IPPImage getImage() {
      return this.k5 != null ? this.k5.n5() : null;
   }

   @Override
   public final void setImage(IPPImage value) {
      if (!com.aspose.slides.ms.System.j8.l6(value, this.getImage())) {
         PPImage var2 = (PPImage)value;
         if (var2 != null && var2.x8() != null && this.getPresentation() != null && var2.x8() != this.getPresentation()) {
            throw new PptxEditException("Can't assign an image from the other presentation.");
         }

         this.h0();
         this.k5.n5((PPImage)value);
         this.u3();
      }
   }

   @Override
   public final String getLinkPathLong() {
      return this.k5 != null ? this.k5.l6() : null;
   }

   @Override
   public final void setLinkPathLong(String value) {
      if (!com.aspose.slides.ms.System.d1.a6(value, this.getLinkPathLong())) {
         this.h0();
         this.k5.n5(value);
         this.u3();
      }
   }

   final String n5() {
      return this.k5 != null ? this.k5.k5() : null;
   }

   final void n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.a6(var1, this.n5())) {
         this.h0();
         this.k5.l6(var1);
         this.u3();
      }
   }

   @Override
   public final IImageTransformOperationCollection getImageTransform() {
      return this.a6();
   }

   @Override
   public final IPresentation getPresentation() {
      return this.getParent_IPresentationComponent() != null ? this.getParent_IPresentationComponent().getPresentation() : null;
   }

   final e3e l6() {
      this.a6();
      return this.t2;
   }

   final void k5() {
      if (this.k5 != null) {
         this.h0();
         this.k5.u3();
         this.u3();
      }
   }

   final void n5(Picture var1) {
      if (this.k5 != null || var1.k5 != null) {
         this.h0();
         this.k5.n5(var1);
         this.u3();
      }
   }

   final void n5(IPictureEffectiveData var1) {
      this.h0();
      this.k5.n5(var1);
      this.u3();
   }

   final com.aspose.slides.internal.k9.u9 n5(j5m var1, com.aspose.slides.internal.o9b.f2 var2, s5u var3, IBaseSlide var4, boolean var5, PictureFillFormat var6) {
      this.h0();
      return this.k5.n5(var1, var2.a6(), var3, var4, var5, var6);
   }

   private void u3() {
      t9a var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(obj, this)) {
         return true;
      }

      Picture var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Picture.class);
      return var2 == null ? false : k8s.n5(this.k5, var2.k5);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public final IBaseSlide getSlide() {
      if (this.h0 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.h0};
         d0u.n5(ISlideComponent.class, this.a6, var1);
         this.h0 = var1[0];
         if (com.aspose.slides.internal.v6g.k5.l6(this.h0, PVIObject.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, IChartComponent.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u9, Background.class)) {
            this.h0 = com.aspose.slides.internal.v6g.k5.n5(this.h0, PVIObject.class).getParent_ISlideComponent();
         }
      }

      ISlideComponent var2 = this.h0;
      return var2 != null ? (BaseSlide)var2.getSlide() : null;
   }

   private ImageTransformOperationCollection a6() {
      if (this.c8 == null) {
         this.c8 = new ImageTransformOperationCollection(this);
         this.t2 = new e3e(this);
         this.c8.n5.l6(new Picture$2(this));
      }

      return this.c8;
   }

   private k8s u9() {
      if (this.k5 == null) {
         this.k5 = new k8s(this.a6(), this.t2);
      }

      return this.k5;
   }

   private void h0() {
      this.u9();
      if (!this.u3) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.a6, PVIObject.class)) {
            ((PVIObject)this.a6).k7();
         }

         this.u3 = true;
      }
   }

   // $VF: synthetic method
   static t9a n5(Picture var0, t9a var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void l6(Picture var0) {
      var0.u3();
   }
}
