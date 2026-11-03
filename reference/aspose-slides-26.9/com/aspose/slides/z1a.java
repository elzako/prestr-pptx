package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.awt.Color;

final class z1a extends g8<LineFillFormat, z1a> implements ILineFillFormatEffectiveData {
   byte n5 = -1;
   boolean l6 = false;
   private j3z k5;
   private j0p u3;
   private g3a a6;
   private f3f u9;

   final void n5() {
      this.n5 = -1;
      this.l6 = false;
      if (this.k5 != null) {
         this.k5.u3();
      }

      if (this.u3 != null) {
         this.u3.n5();
      }

      if (this.a6 != null) {
         this.a6.n5();
      }

      if (this.u9 != null) {
         this.u9.n5();
      }
   }

   final IPictureFillFormatEffectiveData l6() {
      if (this.getFillType() == 4) {
         return this.u9;
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "PictureFillFormat is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   final f3f k5() {
      if (this.u9 == null) {
         this.u9 = new f3f(this);
      }

      return this.u9;
   }

   @Override
   public final byte getFillType() {
      return this.n5;
   }

   @Override
   public final Color getSolidFillColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u3());
   }

   com.aspose.slides.internal.o9b.c8 u3() {
      if (this.getFillType() == 1) {
         return this.k5.n5();
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "SolidFillColor is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final IGradientFormatEffectiveData getGradientFormat() {
      if (this.getFillType() == 2) {
         return this.u3;
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "GradientFormat is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final IPatternFormatEffectiveData getPatternFormat() {
      if (this.getFillType() == 3) {
         return this.a6;
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "PatternFormat is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final boolean getRotateWithShape() {
      return this.l6;
   }

   final j3z a6() {
      if (this.k5 == null) {
         this.k5 = new j3z();
      }

      return this.k5;
   }

   final j0p u9() {
      if (this.u3 == null) {
         this.u3 = new j0p();
      }

      return this.u3;
   }

   final g3a h0() {
      if (this.a6 == null) {
         this.a6 = new g3a();
      }

      return this.a6;
   }

   final void n5(i7b var1) {
      z1a var2 = (z1a)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
      switch (this.getFillType()) {
         case 0:
         default:
            break;
         case 1:
            this.a6().n5(var2.a6());
            break;
         case 2:
            this.u9().n5((i7b)var2.u9());
            break;
         case 3:
            this.h0().n5((i7b)var2.h0());
            break;
         case 4:
            this.k5().n5((i7b)var2.k5());
      }
   }

   void n5(i7b var1, LineFillFormat var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(LineFillFormat var1) {
      if (var1.getFillType() != -1) {
         this.n5 = var1.getFillType();
         switch (this.getFillType()) {
            case -1:
            case 5:
               throw new ArgumentException();
            case 0:
               break;
            case 1:
               if (((ColorFormat)var1.getSolidFillColor()).z3()) {
                  this.a6().n5((ColorFormat)var1.getSolidFillColor());
               }
               break;
            case 2:
               if (((GradientFormat)var1.getGradientFormat()).z3()) {
                  this.u9().n5((GradientFormat)var1.getGradientFormat());
               }
               break;
            case 3:
               if (((PatternFormat)var1.getPatternFormat()).z3()) {
                  this.h0().n5((PatternFormat)var1.getPatternFormat());
               }
               break;
            case 4:
               if (((PictureFillFormat)var1.t2()).z3()) {
                  this.k5().n5((PictureFillFormat)var1.t2());
               }
               break;
            default:
               throw new ArgumentException();
         }

         if (var1.getRotateWithShape() != -1) {
            this.l6 = var1.getRotateWithShape() == 1;
         }
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      switch (this.getFillType()) {
         case 0:
         default:
            break;
         case 1:
            this.a6().n5(var1, var2);
            break;
         case 2:
            this.u9().n5(var1, var2);
            break;
         case 3:
            this.h0().n5(var1, var2);
            break;
         case 4:
            this.k5().n5(var1, var2);
      }
   }

   boolean n5(z1a var1) {
      if (var1 == null) {
         return false;
      }

      if (this.n5 != var1.n5) {
         return false;
      }

      switch (this.n5) {
         case -1:
         case 0:
         default:
            return true;
         case 1:
            return this.a6().equals(var1.a6());
         case 2:
            return this.u9().equals(var1.u9()) && this.l6 == var1.l6;
         case 3:
            return this.h0().equals(var1.h0()) && this.l6 == var1.l6;
         case 4:
            return this.k5().n5(var1.k5()) && this.l6 == var1.l6;
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.z1a)recoveredArg);
   }
}
