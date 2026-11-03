package com.aspose.slides;

import java.awt.Color;

final class y4u implements IColorSchemeEffectiveData, i7b {
   String n5 = null;
   ColorFormat[] l6;
   z3b k5;

   y4u() {
      this(null);
   }

   y4u(ColorScheme var1) {
      byte var2 = 12;
      this.l6 = new ColorFormat[12];
      if (var1 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var1.n5())) {
            this.n5 = var1.n5();
         }

         for (int var3 = 0; var3 < 12; var3++) {
            ColorFormat var4 = var1.l6[var3];
            if (var4.getColorType() != -1) {
               this.l6[var3] = var4;
            }
         }

         this.k5 = new z3b();
         this.k5.n5(var1.l6());
      } else {
         this.k5 = new z3b();

         for (int var5 = 0; var5 < 12; var5++) {
            this.l6[var5] = null;
         }
      }
   }

   @Override
   public final Color getByColorSchemeIndex(byte index) {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5(index));
   }

   com.aspose.slides.internal.o9b.c8 n5(byte var1) {
      int var2 = (var1 & 255) - 0;
      return var2 >= 0 && var2 < this.l6.length ? this.l6[var2].u3() : com.aspose.slides.internal.o9b.c8.m3();
   }

   @Override
   public final Color getDark1() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.c8 n5() {
      return this.n5((byte)0);
   }

   @Override
   public final Color getLight1() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.n5((byte)1);
   }

   @Override
   public final Color getDark2() {
      return com.aspose.slides.internal.o9b.c8.l6(this.k5());
   }

   com.aspose.slides.internal.o9b.c8 k5() {
      return this.n5((byte)2);
   }

   @Override
   public final Color getLight2() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u3());
   }

   com.aspose.slides.internal.o9b.c8 u3() {
      return this.n5((byte)3);
   }

   @Override
   public final Color getAccent1() {
      return com.aspose.slides.internal.o9b.c8.l6(this.a6());
   }

   com.aspose.slides.internal.o9b.c8 a6() {
      return this.n5((byte)4);
   }

   @Override
   public final Color getAccent2() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u9());
   }

   com.aspose.slides.internal.o9b.c8 u9() {
      return this.n5((byte)5);
   }

   @Override
   public final Color getAccent3() {
      return com.aspose.slides.internal.o9b.c8.l6(this.h0());
   }

   com.aspose.slides.internal.o9b.c8 h0() {
      return this.n5((byte)6);
   }

   @Override
   public final Color getAccent4() {
      return com.aspose.slides.internal.o9b.c8.l6(this.c8());
   }

   com.aspose.slides.internal.o9b.c8 c8() {
      return this.n5((byte)7);
   }

   @Override
   public final Color getAccent5() {
      return com.aspose.slides.internal.o9b.c8.l6(this.t2());
   }

   com.aspose.slides.internal.o9b.c8 t2() {
      return this.n5((byte)8);
   }

   @Override
   public final Color getAccent6() {
      return com.aspose.slides.internal.o9b.c8.l6(this.s7());
   }

   com.aspose.slides.internal.o9b.c8 s7() {
      return this.n5((byte)9);
   }

   @Override
   public final Color getHyperlink() {
      return com.aspose.slides.internal.o9b.c8.l6(this.x8());
   }

   com.aspose.slides.internal.o9b.c8 x8() {
      return this.n5((byte)10);
   }

   @Override
   public final Color getFollowedHyperlink() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n3());
   }

   com.aspose.slides.internal.o9b.c8 n3() {
      return this.n5((byte)11);
   }

   final String y4() {
      return this.n5;
   }

   final ColorFormat l6(byte var1) {
      int var2 = (var1 & 255) - 0;
      if (var2 >= 0 && var2 < this.l6.length) {
         return this.l6[var2];
      } else {
         throw new PptException("ColorScheme: wrong index");
      }
   }

   final void n5(y4u var1, ColorScheme var2) {
      if (var1 != null) {
         this.n5 = var1.n5;
         System.arraycopy(var1.l6, 0, this.l6, 0, 12);
         this.k5.n5(var1.k5);
      }

      if (var2 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var2.n5())) {
            this.n5 = var2.n5();
         }

         for (int var3 = 0; var3 <= 11; var3++) {
            if (var2.l6[var3].getColorType() != -1) {
               ColorFormat var4 = var2.l6[var3];
               if (var4 != null) {
                  this.l6[var3] = var4;
               }
            }
         }

         this.k5.n5(var2.l6());
      }
   }

   final boolean n5(y4u var1) {
      if (var1 == null) {
         return false;
      }

      for (int var2 = 0; var2 <= 11; var2++) {
         if (!com.aspose.slides.ms.System.j8.n5(this.l6[var2], var1.l6[var2])) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   @Override
   public boolean equals(Object obj) {
      y4u var2 = com.aspose.slides.internal.v6g.k5.n5(obj, y4u.class);
      return var2 == null ? false : this.n5(var2);
   }
}
