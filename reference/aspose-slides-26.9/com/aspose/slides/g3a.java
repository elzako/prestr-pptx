package com.aspose.slides;

import java.awt.Color;

final class g3a extends g8<PatternFormat, g3a> implements IPatternFormatEffectiveData {
   byte n5;
   final j3z l6 = new j3z();
   final j3z k5 = new j3z();

   final void n5() {
      this.l6.u3();
      this.k5.u3();
   }

   @Override
   public final byte getPatternStyle() {
      return this.n5;
   }

   @Override
   public final Color getForeColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.l6.n5();
   }

   @Override
   public final Color getBackColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.k5());
   }

   com.aspose.slides.internal.o9b.c8 k5() {
      return this.k5.n5();
   }

   @Override
   public final IImage getTileIImage(Color background, Color foreground) {
      return this.n5(com.aspose.slides.internal.o9b.c8.n5(background), com.aspose.slides.internal.o9b.c8.n5(foreground));
   }

   IImage n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      return u4i.n5(n5(2498570, this.getPatternStyle(), var1.o8(), var2.o8()));
   }

   static com.aspose.slides.internal.o9b.l6 n5(int var0, byte var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3) {
      byte[][] var4 = PatternFormat.l6.get_Item(Integer.valueOf(var1)).n5;
      if (var4 == null) {
         var4 = PatternFormat.l6.get_Item(1).n5;
      }

      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.ms.System.u3.n5(var4, 2).u3(1) + 1, com.aspose.slides.ms.System.u3.n5(var4, 2).u3(0) + 1, var0
      );

      for (int var6 = 0; var6 <= com.aspose.slides.ms.System.u3.n5(var4, 2).u3(0); var6++) {
         for (int var7 = 0; var7 <= com.aspose.slides.ms.System.u3.n5(var4, 2).u3(1); var7++) {
            float var8 = (var4[var6][var7] & 0xFF) / 255.0F;
            float var9 = 1.0F - var8;
            var5.n5(
               var7,
               var6,
               com.aspose.slides.internal.o9b.c8.n5(
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.s7() & 0xFF) * var8 + (var2.s7() & 0xFF) * var9), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.x8() & 0xFF) * var8 + (var2.x8() & 0xFF) * var9), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.n3() & 0xFF) * var8 + (var2.n3() & 0xFF) * var9), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.y4() & 0xFF) * var8 + (var2.y4() & 0xFF) * var9), 14)
                  )
                  .o8()
            );
         }
      }

      return var5;
   }

   final void n5(i7b var1) {
      g3a var2 = (g3a)var1;
      this.n5 = var2.getPatternStyle();
      this.l6.n5(var2.l6);
      this.k5.n5(var2.k5);
   }

   void n5(i7b var1, PatternFormat var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(PatternFormat var1) {
      if (var1.getPatternStyle() != -1) {
         this.n5 = var1.getPatternStyle();
      }

      if (var1.getForeColor().getColorType() != -1) {
         this.l6.n5((ColorFormat)var1.getForeColor());
      }

      if (var1.getBackColor().getColorType() != -1) {
         this.k5.n5((ColorFormat)var1.getBackColor());
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.l6.n5(var1, var2);
      this.k5.n5(var1, var2);
   }

   boolean n5(g3a var1) {
      if (var1 == null) {
         return false;
      } else if (this.n5 != var1.n5) {
         return false;
      } else {
         return !this.l6.equals(var1.l6) ? false : this.k5.equals(var1.k5);
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.g3a)recoveredArg);
   }
}
