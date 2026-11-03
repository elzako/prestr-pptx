package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class j3z {
   private com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private j3z u3;
   private ColorFormat a6;
   private ColorFormat u9;
   ColorFormat n5;
   private ColorFormat h0;
   private int c8;
   private ColorFormat t2;
   private boolean s7;

   final com.aspose.slides.internal.o9b.c8 n5() {
      if (!this.s7) {
         throw new InvalidOperationException("Color is not resolved yet.");
      } else {
         return this.k5;
      }
   }

   final int l6() {
      if (!this.s7) {
         throw new InvalidOperationException("Color is not resolved yet.");
      } else {
         return this.c8;
      }
   }

   final ColorFormat k5() {
      if (!this.s7 && this.n5.getColorType() == -1) {
         throw new InvalidOperationException("Source of color is not defined.");
      } else {
         return this.t2 == null ? this.n5 : this.t2;
      }
   }

   j3z() {
   }

   j3z(j3z var1) {
      this.n5(var1);
   }

   j3z(ColorFormat var1) {
      this.n5(var1);
   }

   final void u3() {
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.n5 = null;
      this.c8 = -1;
      this.t2 = null;
   }

   final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.l6);
   }

   final void n5(j3z var1) {
      this.a6 = var1.n5 != null ? var1.n5 : var1.a6;
      this.u9 = var1.h0 != null ? var1.h0 : var1.u9;
      this.u3 = var1;
      var1.l6.n5(this.l6);
   }

   final void n5(j3z var1, ColorFormat var2) {
      this.n5(var1);
      if (var2 != null) {
         this.n5(var2);
      }
   }

   final void n5(ColorFormat var1) {
      if (var1.getColorType() != -1) {
         this.n5 = var1;
         this.t2 = var1;
      }
   }

   final void n5(IBaseSlide var1, w6a var2) {
      r0s var3 = var2.n5();
      ColorFormat var4 = var2.l6();
      this.h0 = var4;
      if (this.n5 != null) {
         this.n5.k5(var1, var3).n5(this.k5);
         this.c8 = this.n5.getColorType() == 3 ? this.n5.getSchemeColor() : -1;
         this.t2 = this.n5;
      } else if (this.a6 == null) {
         if (var3 != null) {
            var3.n5().n5(this.k5);
            this.n5 = var4;
            this.t2 = var4;
            this.c8 = var4 != null ? var4.getSchemeColor() : -1;
         } else {
            (this.u9 != null ? this.u9.n5(var1).n5() : this.l6).n5(this.k5);
            this.c8 = this.u9 != null && this.u9.getColorType() == 3 ? this.u9.getSchemeColor() : -1;
         }
      } else {
         BaseSlide var5 = com.aspose.slides.internal.v6g.k5.n5(this.a6.x8(), BaseSlide.class);
         if (var5 != null) {
            BaseSlide var6 = var4 == null ? null : com.aspose.slides.internal.v6g.k5.n5(var4.x8(), BaseSlide.class);
            if (var5 == var1 || var6 != null && (var6 == var5 || var6 == var5.t9())) {
               if (this.u3 != null && this.u3.s7) {
                  this.u3.n5().n5(this.k5);
                  this.c8 = this.u3.l6();
                  this.t2 = this.u3.t2;
               } else {
                  this.n5(var1).n5(this.k5);
               }
            } else if (var3 != null && !com.aspose.slides.internal.v6g.k5.l6(var5, Slide.class)) {
               var3.n5().n5(this.k5);
               this.n5 = var4;
               this.t2 = var4;
               this.c8 = var4 != null ? var4.getSchemeColor() : -1;
            } else {
               this.n5(var1).n5(this.k5);
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(this.a6.x8(), Theme.class)) {
            if (this.a6.getColorType() == -1) {
               if (var3 != null) {
                  var3.n5().n5(this.k5);
                  this.n5 = var4;
                  this.c8 = var4 != null ? var4.getSchemeColor() : -1;
                  this.t2 = var4;
               } else {
                  this.l6.n5(this.k5);
               }
            } else {
               this.n5(var1, var3).n5(this.k5);
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(this.a6.x8(), TextStyle.class)) {
            TextStyle var8 = (TextStyle)this.a6.x8();
            TextFrameFormat var7 = com.aspose.slides.internal.v6g.k5.n5(var8.getParent_Immediate(), TextFrameFormat.class);
            if (var7 != null && com.aspose.slides.internal.v6g.k5.l6(var7.getParent_IPresentationComponent(), ISlideComponent.class)) {
               this.n5(var1, var3).n5(this.k5);
            } else if (var3 != null) {
               var3.n5().n5(this.k5);
               this.n5 = var4;
               this.t2 = var4;
               this.c8 = var4 != null ? var4.getSchemeColor() : -1;
            } else {
               this.n5(var1).n5(this.k5);
            }
         } else if (this.a6.x8() == null) {
            if (com.aspose.slides.internal.v6g.k5.l6(this.a6.getParent_IPresentationComponent(), z2x.class)) {
               if (var3 != null) {
                  var3.n5().n5(this.k5);
                  this.n5 = var4;
                  this.t2 = var4;
                  this.c8 = var4 != null ? var4.getSchemeColor() : -1;
               } else {
                  this.n5(var1).n5(this.k5);
               }
            } else {
               this.n5(var3, var2, var1);
            }
         }
      }

      this.s7 = true;
   }

   private void n5(r0s var1, w6a var2, IBaseSlide var3) {
      if (var1 != null) {
         var1.n5().n5(this.k5);
         this.n5 = var2.l6();
         this.c8 = var2.l6() != null ? var2.l6().getSchemeColor() : -1;
         this.t2 = var2.l6();
      } else {
         this.n5(var3).n5(this.k5);
      }
   }

   private com.aspose.slides.internal.o9b.c8 n5(IBaseSlide var1) {
      return this.n5(var1, (r0s)null);
   }

   private com.aspose.slides.internal.o9b.c8 n5(IBaseSlide var1, r0s var2) {
      if (this.a6.getColorType() == 3) {
         this.c8 = this.a6.getSchemeColor();
         this.t2 = this.a6;
         return this.a6.k5(var1, var2);
      } else if (!this.u3.s7) {
         this.t2 = this.a6;
         return this.a6.k5(var1, var2);
      } else {
         this.t2 = this.u3.t2;
         return this.u3.n5();
      }
   }

   @Override
   public boolean equals(Object obj) {
      j3z var2 = com.aspose.slides.internal.v6g.k5.n5(obj, j3z.class);
      return var2 == null ? false : this.l6(var2);
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   final boolean l6(j3z var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.s7 && var1.s7 ? this.k5.equals(var1.k5.o8()) : false;
      }
   }
}
