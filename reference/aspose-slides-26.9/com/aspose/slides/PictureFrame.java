package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class PictureFrame extends GeometryShape implements IPictureFrame {
   final PictureFillFormat u9 = new PictureFillFormat(this);
   private ISvgImage n5;
   static final Dictionary<Integer, Integer> h0 = n5(true, 1, 96, 97, 98, 99, 100, 101, 102, 103, 104);

   final ISvgImage x8() {
      return this.n5;
   }

   final void n5(ISvgImage var1) {
      this.n5 = var1;
   }

   PictureFrame(r0g parentImmediate, c8h pptxUnsupportedProps) {
      super(parentImmediate, pptxUnsupportedProps, new PictureFrameLock());
   }

   PictureFrame(r0g parentImmediate) {
      super(parentImmediate, new c8h(), new PictureFrameLock());
      this.n5(new r8r(this));
   }

   final void n5(IPPImage var1) {
      this.n5((ISvgImage)null);
      if (var1 != null && var1.getSvgImage() != null) {
         if (!((Presentation)this.getPresentation()).h0().containsItem(this)) {
            if (this.getPictureFormat().getPicture().getImage() == null) {
               this.getPictureFormat().getPicture().setImage(var1);
            }

            ((Presentation)this.getPresentation()).h0().addItem(this);
         }

         SvgImage var2 = (SvgImage)var1.getSvgImage();
         this.n5(((SvgImage)var1.getSvgImage()).n5(this));
         boolean var3 = false;
         IGenericEnumerator var4 = ((ImageCollection)this.getPresentation().getImages()).iterator();

         try {
            while (var4.hasNext()) {
               IPPImage var5 = (IPPImage)var4.next();
               if (var5.getSvgImage() != null && ((SvgImage)var5.getSvgImage()).l6() == var2.l6() && !var2.k5() && "image/x-emf".equals(var5.getContentType())) {
                  var1 = var5;
                  var3 = true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         if (!var3) {
            IPPImage var18 = var1;
            float var6 = var18.getWidth();
            float var7 = var18.getHeight();
            float var8 = com.aspose.slides.ms.System.q1.n5((float)(this.getWidth() / var6), (float)(this.getHeight() / var7));
            if (var8 > 1.0F) {
               var6 *= var8;
               var7 *= var8;
            }

            var1 = ((ImageCollection)this.getPresentation().getImages()).n5(this.x8(), var6, var7, 1.0F, false);
            var1.setSvgImage(var2);
            List$Enumerator var9 = ((Presentation)this.getPresentation()).h0().iterator();

            try {
               while (var9.hasNext()) {
                  PictureFrame var10 = (PictureFrame)var9.next();
                  if (((SvgImage)var10.getPictureFormat().getPicture().getImage().getSvgImage()).l6() == var2.l6()) {
                     var10.getPictureFormat().getPicture().setImage(var1);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }

            ((ImageCollection)this.getPresentation().getImages()).n5(var18);
         } else {
            this.getPictureFormat().getPicture().getImage().replaceImage(var1);
         }
      } else {
         ((Presentation)this.getPresentation()).h0().removeItem(this);
         this.n5((ISvgImage)null);
      }

      if (this.getPictureFormat().getPicture().getImage() == null) {
         this.getPictureFormat().getPicture().setImage(var1);
      }
   }

   final void y4() {
      if (this.getPictureFormat().getPicture().getImage() != null
         && this.getPictureFormat().getPicture().getImage().getSvgImage() == null
         && "image/gif".equals(this.getPictureFormat().getPicture().getImage().getContentType())
         && com.aspose.slides.internal.n8e.k7.t2(this.getPictureFormat().getPicture().getImage().getBinaryData())) {
         ((Sequence)this.getSlide().getTimeline().getMainSequence()).n5(this);
      }
   }

   c8h a6() {
      return (c8h)super.u9();
   }

   @Override
   void l6(float var1) {
      if (!this.d5() && super.getWidth() > 0.0F && this.getPictureFrameLock().getAspectRatioLocked()) {
         d2k var2 = new d2k(var1, super.getHeight() / super.getWidth() * var1);
         super.l6(var2.u3());
      } else {
         super.l6(var1);
      }
   }

   @Override
   void k5(float var1) {
      if (!this.d5() && super.getHeight() > 0.0F && this.getPictureFrameLock().getAspectRatioLocked()) {
         d2k var2 = new d2k(super.getWidth() / super.getHeight() * var1, var1);
         super.l6(var2.u3());
      } else {
         super.k5(var1);
      }
   }

   @Override
   void s7() {
      ShapeFrame var1 = this.p8();
      super.s7();
      ShapeFrame var2 = ((Slide)this.j9()).w1().l6(this.getPlaceholder().getIndex()).p8();
      this.setWidth(var1.getWidth());
      this.setHeight(var1.getHeight());
      this.setX(var2.getCenterX() - this.getWidth() / 2.0F);
      this.setY(var2.getCenterY() - this.getHeight() / 2.0F);
   }

   @Override
   public final IPictureFrameLock getPictureFrameLock() {
      return (IPictureFrameLock)super.getShapeLock();
   }

   @Override
   public int getShapeType() {
      return super.getShapeType();
   }

   @Override
   public void setShapeType(int value) {
      if (!h0.containsKey(value)) {
         throw new PptxEditException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Incorrect ShapeType value for PictureFrame specified: ", com.aspose.slides.ms.System.s3.n5(ShapeType.class, value)
            })
         );
      }

      super.setShapeType(value);
   }

   @Override
   public final IPictureFillFormat getPictureFormat() {
      return this.u9;
   }

   @Override
   public final float getRelativeScaleHeight() {
      return (float)com.aspose.slides.ms.System.q1.n5(
         (double)(this.getHeight()
            / (72.0F / ((PPImage)this.getPictureFormat().getPicture().getImage()).t2().k5() * this.getPictureFormat().getPicture().getImage().getHeight())),
         2
      );
   }

   @Override
   public final void setRelativeScaleHeight(float value) {
      this.setHeight(
         72.0F / ((PPImage)this.getPictureFormat().getPicture().getImage()).t2().k5() * this.getPictureFormat().getPicture().getImage().getHeight() * value
      );
   }

   @Override
   public final float getRelativeScaleWidth() {
      return (float)com.aspose.slides.ms.System.q1.n5(
         (double)(this.getWidth()
            / (72.0F / ((PPImage)this.getPictureFormat().getPicture().getImage()).t2().l6() * this.getPictureFormat().getPicture().getImage().getWidth())),
         2
      );
   }

   @Override
   public final void setRelativeScaleWidth(float value) {
      this.setWidth(
         72.0F / ((PPImage)this.getPictureFormat().getPicture().getImage()).t2().l6() * this.getPictureFormat().getPicture().getImage().getWidth() * value
      );
   }

   public final boolean isCameo() {
      if (this.a6().x8() != null && this.a6().x8().n5() != null) {
         for (int var1 = 0; var1 < this.a6().x8().n5().length; var1++) {
            if (com.aspose.slides.ms.System.d1.t2(this.a6().x8().n5()[0].n5(), "{51228E76-BA90-4043-B771-695A4F85340A}")) {
               return true;
            }
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   c8h u9() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   c8h h0() {
      return this.a6();
   }

}
