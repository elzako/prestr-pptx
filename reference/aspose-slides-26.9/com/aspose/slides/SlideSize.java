package com.aspose.slides;

import java.awt.geom.Dimension2D;

public class SlideSize extends DomObject<Presentation> implements ISlideSize {
   long n5 = -1L;
   long l6 = -1L;
   int k5 = 6;
   static final long[] u3 = new long[]{
      9144000L,
      6858000L,
      9144000L,
      6858000L,
      9906000L,
      6858000L,
      10287000L,
      6858000L,
      9144000L,
      6858000L,
      7315200L,
      914400L,
      0L,
      0L,
      12179300L,
      9134475L,
      12801600L,
      9601200L,
      10826750L,
      8120063L,
      7169150L,
      5376863L,
      10972800L,
      8229600L,
      7315200L,
      5486400L,
      4572000L,
      2971800L,
      9144000L,
      5143500L,
      9144000L,
      5715000L,
      12192000L,
      6858000L
   };

   @Override
   public final Dimension2D getSize() {
      return com.aspose.slides.internal.o9b.f2.n5(this.n5());
   }

   com.aspose.slides.internal.o9b.f2 n5() {
      return this.n5 < 0L
         ? new com.aspose.slides.internal.o9b.f2(Float.NaN, Float.NaN)
         : new com.aspose.slides.internal.o9b.f2((float)(this.n5 / 12700.0), (float)(this.l6 / 12700.0));
   }

   @Override
   public final int getType() {
      return this.k5;
   }

   @Override
   public final int getOrientation() {
      return this.n5 >= this.l6 ? 0 : 1;
   }

   @Override
   public final void setOrientation(int value) {
      if (this.n5 < this.l6 ^ value == 1) {
         com.aspose.slides.internal.o9b.f2 var2 = this.n5().a6();
         long var3 = this.n5;
         this.n5 = this.l6;
         this.l6 = var3;
         this.n5(var2.a6(), 1);
      }
   }

   @Override
   public final void setSize(int type, int scaleType) {
      com.aspose.slides.internal.o9b.f2 var3 = this.n5().a6();
      this.k5 = type;
      if (type != 6) {
         int var4 = 2 * type;
         if (this.n5 >= this.l6) {
            this.n5 = u3[var4];
            this.l6 = u3[var4 + 1];
         } else {
            this.n5 = u3[var4 + 1];
            this.l6 = u3[var4];
         }
      }

      this.n5(var3.a6(), scaleType);
   }

   @Override
   public final void setSize(float width, float height, int scaleType) {
      if (!(width < 1.0F) && !(height < 1.0F)) {
         com.aspose.slides.internal.o9b.f2 var4 = this.n5().a6();
         if (!com.aspose.slides.ms.System.n1.k5(width) && !com.aspose.slides.ms.System.n1.k5(height)) {
            this.k5 = 6;
            this.n5 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(width * 12700.0), 14);
            this.l6 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(height * 12700.0), 14);
         } else {
            this.n5 = this.l6 = -1L;
         }

         this.n5(var4.a6(), scaleType);
      } else {
         throw new PptxEditException("Slide size dimensions should be positive.");
      }
   }

   final boolean n5(int var1) {
      int var2 = 2 * var1;
      long var3 = -1L;
      long var5 = -1L;
      if (this.n5 >= this.l6) {
         var3 = u3[var2];
         var5 = u3[var2 + 1];
      } else {
         var3 = u3[var2 + 1];
         var5 = u3[var2];
      }

      return this.n5 == var3 && this.l6 == var5;
   }

   SlideSize(Presentation parentImmediate) {
      super(parentImmediate);
   }

   private static float n5(float var0, float var1, int var2) {
      if (var2 == 2) {
         if (var0 > 1.0F && var1 > 1.0F) {
            return com.aspose.slides.ms.System.q1.l6(var0, var1);
         }

         if (var0 > 1.0F || var1 > 1.0F) {
            return com.aspose.slides.ms.System.q1.n5((float)(var0), (float)(var1));
         }
      } else if (var2 == 1 && (var0 < 1.0F || var1 < 1.0F)) {
         return com.aspose.slides.ms.System.q1.l6(var0, var1);
      }

      return 1.0F;
   }

   private void n5(com.aspose.slides.internal.o9b.f2 var1, int var2) {
      if (this.u9 != null) {
         if (var2 != 0) {
            if (var1.l6() > 0.0F && var1.k5() > 0.0F) {
               com.aspose.slides.internal.o9b.f2 var3 = this.n5().a6();
               float var4 = var3.l6() / var1.l6();
               float var5 = var3.k5() / var1.k5();
               if (var4 == 1.0F && var5 == 1.0F || var4 == 0.0F || var5 == 0.0F) {
                  return;
               }

               float var6 = n5(var4, var5, var2);
               if (var2 == 2) {
                  if (var6 > 1.0F) {
                     this.u9.n5(var4, var5, var6);
                     return;
                  }

                  this.u9.n5(var4, var5);
               } else if (var2 == 1) {
                  if (var6 < 1.0F) {
                     this.u9.n5(var4, var5, var6);
                     return;
                  }

                  this.u9.n5(var4, var5);
               }
            }
         }
      }
   }
}
