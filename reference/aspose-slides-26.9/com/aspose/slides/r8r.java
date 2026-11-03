package com.aspose.slides;

class r8r extends y0k {
   public r8r(PictureFrame var1) {
      super(var1);
   }

   public final PictureFrame n5() {
      return (PictureFrame)super.a6();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (this.n5().getPictureFormat().getPicture().getImage() != null
         && this.n5().getPictureFormat().getPicture().getImage().getSvgImage() != null
         && "image/png".equals(this.n5().getPictureFormat().getPicture().getImage().getContentType())
         && !this.u9().h0().containsItem(this.n5())) {
         this.n5().n5(this.n5().getPictureFormat().getPicture().getImage());
      }

      if (!this.a6().getHidden()) {
         if (this.a6().getHyperlinkClick() != null) {
            var1.l6(this.a6().getHyperlinkClick());
         }

         ShapeFrame var4 = this.n3();
         float var5 = var4.getX();
         float var6 = var4.getY();
         float var7 = var4.getWidth();
         float var8 = var4.getHeight();
         if (!com.aspose.slides.ms.System.n1.k5(var5)
            && !com.aspose.slides.ms.System.n1.k5(var6)
            && !com.aspose.slides.ms.System.n1.k5(var7)
            && !com.aspose.slides.ms.System.n1.k5(var8)) {
            com.aspose.slides.internal.w0.c8 var9 = new com.aspose.slides.internal.w0.c8(
               var4.getFlipH() == 1 ? -1.0F : 1.0F,
               0.0F,
               0.0F,
               var4.getFlipV() == 1 ? -1.0F : 1.0F,
               var4.getFlipH() == 1 ? var4.getCenterX() * 2.0F : 0.0F,
               var4.getFlipV() == 1 ? var4.getCenterY() * 2.0F : 0.0F
            );
            if (!com.aspose.slides.ms.System.n1.k5(var4.getRotation())) {
               var9.n5(
                  var4.getFlipH() == 1 ^ var4.getFlipV() == 1 ? -var4.getRotation() : var4.getRotation(),
                  new com.aspose.slides.internal.o9b.w1(var4.getCenterX(), var4.getCenterY()),
                  0
               );
            }

            com.aspose.slides.internal.w0.c8 var10 = var9;
            Shape[] var11 = this.a6().f2();
            j2x var12 = this.n5().e2();
            if (var12.x8() == -1) {
               for (int var13 = 0; var13 < var11.length; var13++) {
                  GeometryShape var14 = com.aspose.slides.internal.v6g.k5.n5(var11[var13], GeometryShape.class);
                  if (var14 != null && var14.e2().x8() != -1) {
                     var12 = var14.e2();
                     break;
                  }
               }
            }

            if (var12.x8() != -1) {
               ShapeElement[] var16 = var12.n5(this.a6(), var5, var6, var7, var8);
               IEffectFormatEffectiveData var17 = var16.length > 0 ? this.a6().y1().getEffective() : null;
               boolean var15 = false;
               if (l6(var17)) {
                  if (x0d.l6(this.n5())) {
                     var15 = l6o.n5(var1, var2, this.n5(), var16, var4, this.a6().getFillFormat(), true);
                  }

                  if (!var15) {
                     var15 = l6o.n5(var1, var2, this.n5(), var16, var4, this.n5().getPictureFormat());
                  }
               }

               if (!var15) {
                  var1.k5(var10);
                  this.n5(var1, var2, var16, var4, var17, (byte)7);
               }

               if (this.a6().getHyperlinkClick() != null) {
                  var1.a6();
               }

               if (!var15) {
                  var1.z3();
               }
            }
         }
      }
   }

   private boolean l6() {
      if (this.a6().getFillFormat().getFillType() != 0 && this.a6().getFillFormat().getFillType() != -1) {
         IPictureFillFormat var1 = this.n5().getPictureFormat();
         if (k8s.l6(var1.getPicture().getImageTransform())) {
            return false;
         }

         if (var1.getCropLeft() == 0.0F && var1.getCropRight() == 0.0F && var1.getCropTop() == 0.0F && var1.getCropBottom() == 0.0F) {
            PPImage var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getPicture().getImage(), PPImage.class);
            if (var2 != null && var2.getSvgImage() == null && !var2.s7()) {
               com.aspose.slides.internal.o9b.t4 var3 = var2.n5();

               try {
                  return var3 == null ? false : !com.aspose.slides.internal.n8e.k7.k5((com.aspose.slides.internal.o9b.l6)var3);
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   void n5(e3 var1, s5u var2, ShapeElement[] var3, ShapeFrame var4, IEffectFormatEffectiveData var5, byte var6) {
      if ((var6 & 2) != 0 && n5(var5)) {
         this.n5(var1, var2, var3, var4, this.a6().getFillFormat(), var5, true);
         this.n5(var1, var2, var3, var4, this.n5().getPictureFormat(), var5, true);
      }

      if ((var6 & 1) != 0 && l6(var5)) {
         boolean var7 = var1.y2();
         if (this.n5().getPictureFormat().getPicture().getImage() != null) {
            String var8 = this.n5().getPictureFormat().getPicture().getImage().getContentType();
            if (!"image/x-emf".equals(var8) && !"image/x-wmf".equals(var8)) {
               var1.l6(false);
            }
         }

         IPictureFillFormat var10 = com.aspose.slides.internal.v6g.k5.n5(this.a6().getFillFormat(), IPictureFillFormat.class);
         if (var10 == null) {
            FillFormat var9 = com.aspose.slides.internal.v6g.k5.n5(this.a6().getFillFormat(), FillFormat.class);
            if (var9 != null) {
               var10 = var9.getPictureFillFormat();
            }

            if (com.aspose.slides.internal.v6g.k5.l6(this.n5().getPictureFormat(), PictureFillFormat.class)
               && com.aspose.slides.internal.v6g.k5.l6(var10, PictureFillFormat.class)) {
               ((PictureFillFormat)this.n5().getPictureFormat()).n5(((PictureFillFormat)var10).t2());
            }
         }

         if (!this.l6()) {
            this.n5(var1, var2, var3, var4, this.a6().getFillFormat(), var10);
         }

         this.n5(var1, var2, var3, var4, this.n5().getPictureFormat(), this.n5().getPictureFormat());
         var1.l6(var7);
      }

      if ((var6 & 4) != 0 && n5(var5)) {
         this.n5(var1, var2, var3, var4, this.n5().getPictureFormat(), var5, false);
      }

      if ((var6 & 1) != 0 && k5(var5)) {
         this.n5(var1, var2, var3, var4);
      }
   }
}
