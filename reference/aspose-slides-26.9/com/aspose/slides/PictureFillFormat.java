package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public final class PictureFillFormat extends PVIObject implements IPictureFillFormat {
   private v4d l6;
   final com.aspose.slides.internal.v6g.n5<v4d> n5 = new PictureFillFormat$1(this);
   private int k5;
   private Picture u3;
   private l6g a6;
   private boolean u9 = true;

   PictureFillFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u3 = new Picture(this);
      this.a6 = new l6g(this);
      this.u3.n5.l6(new PictureFillFormat$2(this));
      this.a6.n5.l6(new PictureFillFormat$3(this));
   }

   @Override
   Object M_() {
      return new e3u(this.u3, this.a6);
   }

   final e3u l6() {
      return (e3u)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().h0();
   }

   @Override
   public final int getDpi() {
      return this.z3() ? this.l6().n5() : 96;
   }

   @Override
   public final void setDpi(int value) {
      this.n5((java.lang.Object)(96), (java.lang.Object)(Integer.valueOf(value)));
      if (this.z3()) {
         this.l6().n5(value);
         this.s7();
      }
   }

   @Override
   public final int getPictureFillMode() {
      return this.z3() ? this.l6().l6() : 0;
   }

   @Override
   public final void setPictureFillMode(int value) {
      this.n5((java.lang.Object)(0), (java.lang.Object)(Integer.valueOf(value)));
      if (this.z3()) {
         this.l6().l6(value);
         this.s7();
      }
   }

   @Override
   public final ISlidesPicture getPicture() {
      this.m3();
      return this.u3;
   }

   @Override
   public final float getCropLeft() {
      return this.u3().l6;
   }

   @Override
   public final void setCropLeft(float value) {
      i2h var2 = this.u3().k5();
      var2.l6 = value;
      this.n5(var2.k5());
   }

   @Override
   public final float getCropTop() {
      return this.u3().k5;
   }

   @Override
   public final void setCropTop(float value) {
      i2h var2 = this.u3().k5();
      var2.k5 = value;
      this.n5(var2.k5());
   }

   @Override
   public final float getCropRight() {
      return this.u3().u3;
   }

   @Override
   public final void setCropRight(float value) {
      i2h var2 = this.u3().k5();
      var2.u3 = value;
      this.n5(var2.k5());
   }

   @Override
   public final float getCropBottom() {
      return this.u3().a6;
   }

   @Override
   public final void setCropBottom(float value) {
      i2h var2 = this.u3().k5();
      var2.a6 = value;
      this.n5(var2.k5());
   }

   @Override
   public final IPPImage deletePictureCroppedAreas() {
      PPImage var1 = com.aspose.slides.internal.v6g.k5.n5(this.getPicture().getImage(), PPImage.class);
      boolean var2 = s4s.l6(this.h0().n5(), c1t.n5);
      boolean var3 = !this.u3().equals(i2h.n5.k5());
      if (var1 != null && var1.getSvgImage() == null && !var1.k5().k5() && (var3 || var2)) {
         com.aspose.slides.internal.o9b.l6 var4 = null;

         try {
            com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(0, 0, var1.getWidth(), var1.getHeight());
            com.aspose.slides.internal.o9b.y1 var6 = this.n5(var5.t2(), var5.l6()).y4();
            if (var2) {
               Shape var7 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_ISlideComponent(), Shape.class);
               if (var7 != null) {
                  com.aspose.slides.internal.o9b.y1 var8 = ((ShapeFrame)var7.getFrame()).n5().y4();
                  c1t var9 = new c1t();
                  var9.n5(this.h0().n5().l6());
                  com.aspose.slides.internal.o9b.y1 var10 = var9.n5(var8.y4()).y4();
                  s4s var11 = new s4s(
                     (var8.x8() - var10.x8()) / var10.s7(), (var8.n3() - var10.n3()) / var10.k5(), var8.s7() / var10.s7(), var8.k5() / var10.k5()
                  );
                  var9.n5(var11.l6());
                  var9.n5(com.aspose.slides.internal.o9b.y1.n5(var5).y4()).a6(var6);
               }
            }

            var5.n5(com.aspose.slides.internal.o9b.y2.l6(var6.y4()).n3());
            if (var5.t2() < 1 || var5.l6() < 1) {
               return var1;
            }

            com.aspose.slides.internal.j9e.x8 var41 = com.aspose.slides.internal.j9e.x8.s7();
            if (!var1.s7()) {
               com.aspose.slides.internal.o9b.l6 var42 = (com.aspose.slides.internal.o9b.l6)var1.n5();

               try {
                  var4 = var42.n5(var5.n3(), var42.s7());
                  var41 = var42.x8();
               } finally {
                  if (var42 != null) {
                     var42.dispose();
                  }
               }
            } else {
               var4 = new com.aspose.slides.internal.o9b.l6(var5.t2(), var5.l6(), 2498570);
               com.aspose.slides.internal.o9b.z1 var43 = com.aspose.slides.internal.o9b.z1.n5(var4);

               try {
                  var43.k5(7);
                  var43.a6(2);
                  var43.u9(4);
                  com.aspose.slides.internal.n8e.k7.n5(
                     var43, var1.getBinaryData(), new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.getWidth(), var1.getHeight())
                  );
               } finally {
                  if (var43 != null) {
                     var43.dispose();
                  }
               }
            }

            if (var4 != null) {
               if (!var1.s7()) {
                  boolean var44 = var41.equals(com.aspose.slides.internal.j9e.x8.s7());
                  if (!var44) {
                     com.aspose.slides.internal.z0k.e2 var45 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        var4.n5(var45, var41);
                        this.getPicture().setImage(this.getPresentation().getImages().addImage(var45.toArray()));
                     } finally {
                        if (var45 != null) {
                           var45.dispose();
                        }
                     }
                  } else {
                     this.getPicture().setImage(((ImageCollection)this.getPresentation().getImages()).n5(var4));
                  }
               } else {
                  this.getPicture().setImage(((ImageCollection)this.getPresentation().getImages()).n5(var4));
               }

               if (var2) {
                  this.h0().n5(this.n5(this.h0().n5().l6(), 1.0F, 1.0F, true).l6());
               }

               if (var3) {
                  this.h0().l6().n5(this.n5(this.h0().l6().u3().l6(), (float)var1.getWidth() / var4.e2(), (float)var1.getHeight() / var4.h0(), false).l6());
               }

               return this.getPicture().getImage();
            }
         } catch (RuntimeException var39) {
            com.aspose.slides.internal.n8e.v4.n5(var39);
            ((ImageCollection)this.getPresentation().getImages())
               .l6(com.aspose.slides.ms.System.d1.n5(new String[]{var1.getContentType(), " during DeleteCroppedAreas execution."}));
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   @Override
   public final boolean compressImage(boolean deleteCroppedAreasOfImage, int resolution) {
      float var3;
      switch (resolution) {
         case 0:
            var3 = 330.0F;
            break;
         case 1:
            var3 = 220.0F;
            break;
         case 2:
            var3 = 150.0F;
            break;
         case 3:
            var3 = 96.0F;
            break;
         case 4:
            var3 = 72.0F;
            break;
         case 5:
            var3 = Float.MAX_VALUE;
            break;
         default:
            throw new ArgumentException("Invalid resolution.", "resolution");
      }

      return this.compressImage(deleteCroppedAreasOfImage, var3);
   }

   @Override
   public final boolean compressImage(boolean deleteCroppedAreasOfImage, float resolution) {
      IPPImage var3 = com.aspose.slides.internal.v6g.k5.n5(this.getPicture().getImage(), PPImage.class);
      if (var3 == null) {
         return false;
      }

      boolean var4 = this.n5(resolution);
      boolean var5 = false;
      if (deleteCroppedAreasOfImage) {
         IPPImage var6 = this.deletePictureCroppedAreas();
         var5 = var3.getWidth() > var6.getWidth() || var3.getHeight() > var6.getHeight();
      }

      return var4 || var5;
   }

   private boolean n5(float var1) {
      if (var1 <= 0.0F) {
         throw new ArgumentException("Resolution must be a positive value.");
      }

      if (!(var1 < 72.0F) && var1 != Float.MAX_VALUE) {
         PPImage var2 = com.aspose.slides.internal.v6g.k5.n5(this.getPicture().getImage(), PPImage.class);
         if (var2 != null && var2.getSvgImage() == null && !var2.s7()) {
            Shape var3 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_ISlideComponent(), Shape.class);
            if (var3 == null) {
               return false;
            }

            com.aspose.slides.internal.o9b.y1 var4 = ((ShapeFrame)var3.getFrame()).n5().y4();
            boolean var5 = !this.u3().equals(i2h.n5.k5());
            if (var5) {
               float var6 = this.u3().l6 / 100.0F;
               float var7 = this.u3().u3 / 100.0F;
               float var8 = 1.0F - var7 - var6;
               float var9 = var4.s7();
               if (var8 != 0.0F) {
                  var9 = var4.s7() / var8;
               }

               float var10 = this.u3().k5 / 100.0F;
               float var11 = this.u3().a6 / 100.0F;
               float var12 = 1.0F - var11 - var10;
               float var13 = var4.k5();
               if (var12 != 0.0F) {
                  var13 = var4.k5() / var12;
               }

               var4 = new com.aspose.slides.internal.o9b.y1(var4.u9().u3(), new com.aspose.slides.internal.o9b.f2(var9, var13));
            }

            boolean var42 = s4s.l6(this.h0().n5(), c1t.n5);
            if (var42) {
               c1t var43 = new c1t();
               var43.n5(this.h0().n5().l6());
               var43.n5(var4.y4()).a6(var4);
            }

            float var44 = var1 / 72.0F;
            int var45 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4.s7() * var44), 14);
            int var46 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4.k5() * var44), 14);
            if (var45 < var2.getWidth() && var46 < var2.getHeight() && var45 > 0 && var46 > 0) {
               try {
                  com.aspose.slides.internal.o9b.t4 var47 = var2.n5();

                  try {
                     com.aspose.slides.internal.j9e.x8 var48 = var47.x8();
                     com.aspose.slides.internal.o9b.l6 var49 = new com.aspose.slides.internal.o9b.l6(var45, var46, var47.s7());
                     var49.n5(var1, var1);
                     float var50 = com.aspose.slides.ms.System.q1.n5((float)((float)var47.e2() / var49.e2()), (float)((float)var47.h0() / var49.h0()));
                     com.aspose.slides.internal.o9b.z1 var14 = com.aspose.slides.internal.o9b.z1.n5(var49);

                     try {
                        var14.a6(2);
                        var14.u9(4);
                        var14.k5(5);
                        if (var50 < 2.0F) {
                           var14.k5(var48.equals(com.aspose.slides.internal.j9e.x8.c8()) && var1 >= 216.0F ? 6 : 3);
                        }

                        var14.n5(var47, new com.aspose.slides.internal.o9b.y2(0, 0, var45, var46));
                     } finally {
                        if (var14 != null) {
                           var14.dispose();
                        }
                     }

                     com.aspose.slides.internal.z0k.e2 var15 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        if (var48.equals(com.aspose.slides.internal.j9e.x8.c8())) {
                           com.aspose.slides.internal.j9e.s7 var16 = com.aspose.slides.internal.s5.h0.n5(var48);
                           com.aspose.slides.internal.j9e.h0 var17 = new com.aspose.slides.internal.j9e.h0(1);
                           long var18 = var1 >= 216.0F ? 96L : 80L;
                           var17.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, var18);
                           var49.n5(var15, var16, var17);
                        } else {
                           var49.n5(var15, var48);
                        }

                        this.getPicture().setImage(this.getPresentation().getImages().addImage(var15.toArray()));
                     } finally {
                        if (var15 != null) {
                           var15.dispose();
                        }
                     }
                  } finally {
                     if (var47 != null) {
                        var47.dispose();
                     }
                  }

                  return true;
               } catch (ArgumentException var40) {
                  com.aspose.slides.internal.n8e.v4.n5(var40);
                  ((ImageCollection)this.getPresentation().getImages())
                     .l6(com.aspose.slides.ms.System.d1.n5(new String[]{var2.getContentType(), " during ReducePictureSize execution. Argument error."}));
               } catch (RuntimeException var41) {
                  com.aspose.slides.internal.n8e.v4.n5(var41);
                  ((ImageCollection)this.getPresentation().getImages())
                     .l6(com.aspose.slides.ms.System.d1.n5(new String[]{var2.getContentType(), " during ReducePictureSize execution. General error."}));
               }

               return false;
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

   private s4s n5(s4s var1, float var2, float var3, boolean var4) {
      d2k var5 = var1.n5.u3();
      d2k var6 = d2k.l6(var1.n5(), d2k.u3).u3();
      if (var4) {
         var5 = new d2k(var5.n5 > 0.0F ? var5.n5 : 0.0F, var5.l6 > 0.0F ? var5.l6 : 0.0F);
         var6 = new d2k(var6.n5 > 0.0F ? 0.0F : var6.n5, var6.l6 > 0.0F ? 0.0F : var6.l6);
      } else {
         var5 = new d2k(var5.n5 < 0.0F ? var5.n5 * var2 : 0.0F, var5.l6 < 0.0F ? var5.l6 * var3 : 0.0F);
         var6 = new d2k(var6.n5 < 0.0F ? 0.0F : var6.n5 * var2, var6.l6 < 0.0F ? 0.0F : var6.l6 * var3);
      }

      return new s4s(var5.u3(), d2k.l6(d2k.n5(d2k.u3, var6), var5).u3());
   }

   final i2h u3() {
      return this.z3() ? this.l6().k5() : i2h.n5;
   }

   final void n5(i2h var1) {
      this.n5(i2h.n5.k5(), var1.k5());
      if (this.z3()) {
         this.l6().n5(var1.k5());
         this.s7();
      }
   }

   final boolean a6() {
      return this.u9;
   }

   final void n5(boolean var1) {
      this.u9 = var1;
   }

   @Override
   public final float getStretchOffsetLeft() {
      return this.u9().l6;
   }

   @Override
   public final void setStretchOffsetLeft(float value) {
      i2h var2 = this.u9().k5();
      var2.l6 = value;
      this.l6(var2.k5());
   }

   @Override
   public final float getStretchOffsetTop() {
      return this.u9().k5;
   }

   @Override
   public final void setStretchOffsetTop(float value) {
      i2h var2 = this.u9().k5();
      var2.k5 = value;
      this.l6(var2.k5());
   }

   @Override
   public final float getStretchOffsetRight() {
      return this.u9().u3;
   }

   @Override
   public final void setStretchOffsetRight(float value) {
      i2h var2 = this.u9().k5();
      var2.u3 = value;
      this.l6(var2.k5());
   }

   @Override
   public final float getStretchOffsetBottom() {
      return this.u9().a6;
   }

   @Override
   public final void setStretchOffsetBottom(float value) {
      i2h var2 = this.u9().k5();
      var2.a6 = value;
      this.l6(var2.k5());
   }

   final i2h u9() {
      return this.z3() ? this.l6().u3() : i2h.n5.k5();
   }

   final void l6(i2h var1) {
      this.n5(i2h.n5.k5(), var1.k5());
      if (this.z3()) {
         this.l6().l6(var1.k5());
         this.s7();
      }
   }

   @Override
   public final float getTileOffsetX() {
      return this.x8().n5;
   }

   @Override
   public final void setTileOffsetX(float value) {
      this.n5(new d2k(value, this.x8().l6));
   }

   @Override
   public final float getTileOffsetY() {
      return this.x8().l6;
   }

   @Override
   public final void setTileOffsetY(float value) {
      this.n5(new d2k(this.x8().n5, value));
   }

   @Override
   public final float getTileScaleX() {
      return this.n3().n5;
   }

   @Override
   public final void setTileScaleX(float value) {
      this.l6(new d2k(value, this.n3().l6));
   }

   @Override
   public final float getTileScaleY() {
      return this.n3().l6;
   }

   @Override
   public final void setTileScaleY(float value) {
      this.l6(new d2k(this.n3().n5, value));
   }

   @Override
   public final byte getTileAlignment() {
      return this.z3() ? this.l6().a6().u9() : 0;
   }

   @Override
   public final void setTileAlignment(byte value) {
      this.n5((java.lang.Object)((byte)0), (java.lang.Object)(Byte.valueOf(value)));
      if (this.z3()) {
         this.l6().a6().n5(value);
         this.s7();
      }
   }

   @Override
   public final int getTileFlip() {
      return this.z3() ? this.l6().a6().a6() : 0;
   }

   @Override
   public final void setTileFlip(int value) {
      this.n5((java.lang.Object)(0), (java.lang.Object)(Integer.valueOf(value)));
      if (this.z3()) {
         this.l6().a6().n5(value);
         this.s7();
      }
   }

   final l6g h0() {
      this.m3();
      return this.a6;
   }

   final com.aspose.slides.internal.o9b.y1 n5(int var1, int var2) {
      this.k7();
      return this.l6().n5(var1, var2);
   }

   final void c8() {
      if (this.z3()) {
         this.k7();
         this.l6().u9();
      }
   }

   final void n5(PictureFillFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   final void n5(IPictureFillFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
   }

   private d2k x8() {
      return this.z3() ? this.l6().a6().k5().a6() : d2k.k5;
   }

   private void n5(d2k var1) {
      this.n5(d2k.k5.u3(), var1.u3());
      if (this.z3()) {
         this.l6().a6().n5(new e4c(var1.n5, var1.l6));
         this.s7();
      }
   }

   private d2k n3() {
      return this.z3() ? d2k.n5(this.l6().a6().u3(), 100.0F) : d2k.n5(d2k.u3, 100.0F);
   }

   private void l6(d2k var1) {
      this.n5(d2k.u3.u3(), var1.u3());
      if (this.z3()) {
         this.l6().a6().n5(d2k.n5(var1, 100).u3());
         this.s7();
      }
   }

   final int t2() {
      return this.k5;
   }

   final void n5(int var1) {
      this.k5 = var1;
   }

   final void s7() {
      v4d var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final void l6(PictureFillFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().n5(var1);
         } else {
            this.n5((Object)null);
         }
      }
   }

   // $VF: synthetic method
   static v4d n5(PictureFillFormat var0, v4d var1) {
      return var0.l6 = var1;
   }
}
