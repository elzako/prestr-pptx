package com.aspose.slides;

import java.awt.Color;

final class k5w extends w9s<ColorChange, k5w> implements IColorChangeEffectiveData {
   j3z n5;
   j3z l6;
   private byte u9 = -1;
   static final k5w k5 = a6();

   k5w(ColorChange var1) {
      super(var1, ColorChange.class, k5w.class);
   }

   @Override
   public final Color getFromColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.n5.n5();
   }

   @Override
   public final Color getToColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u3());
   }

   com.aspose.slides.internal.o9b.c8 u3() {
      return this.l6.n5();
   }

   @Override
   public final boolean getUseAlpha() {
      return this.u9 == 1;
   }

   static k5w a6() {
      k5w var0 = new k5w(null);
      var0.u9().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.h0().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.u9 = 0;
      return var0;
   }

   void n5(i7b var1, ColorChange var2) {
      k5w var3 = (k5w)var1;
      this.u9 = var3.u9;
      int var4 = var2.u3() ? 1 : 0;
      if (var4 != -1) {
         this.u9 = (byte)var4;
      }

      this.u9().n5(var3.u9(), (ColorFormat)var2.getFromColor());
      this.h0().n5(var3.h0(), (ColorFormat)var2.getToColor());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.u9().n5(var1, var2);
      this.h0().n5(var1, var2);
   }

   boolean n5(k5w var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.getUseAlpha() == var1.getUseAlpha() && this.u9().equals(var1.u9()) && this.h0().equals(var1.h0());
      }
   }

   final j3z u9() {
      if (this.n5 == null) {
         this.n5 = new j3z();
      }

      return this.n5;
   }

   final j3z h0() {
      if (this.l6 == null) {
         this.l6 = new j3z();
      }

      return this.l6;
   }

   @Override
   public c0v n5(c0v var1) {
      com.aspose.slides.internal.o9b.c8 var2 = this.l6().o8();
      com.aspose.slides.internal.o9b.c8 var3 = this.u3().o8();
      int var4 = (var2.x8() & 255) - 17;
      int var5 = (var2.x8() & 255) + 17;
      int var6 = (var2.n3() & 255) - 17;
      int var7 = (var2.n3() & 255) + 17;
      int var8 = (var2.y4() & 255) - 17;
      int var9 = (var2.y4() & 255) + 17;
      if (this.getUseAlpha()) {
         int var10 = (var2.s7() & 255) - 17;
         int var11 = (var2.s7() & 255) + 17;

         for (int var12 = 0; var12 < var1.a6().length; var12 += 4) {
            if (var10 < (var1.a6()[var12 + 3] & 255)
               && (var1.a6()[var12 + 3] & 255) < var11
               && var4 < (var1.a6()[var12 + 2] & 255)
               && (var1.a6()[var12 + 2] & 255) < var5
               && var6 < (var1.a6()[var12 + 1] & 255)
               && (var1.a6()[var12 + 1] & 255) < var7
               && var8 < (var1.a6()[var12] & 255)
               && (var1.a6()[var12] & 255) < var9) {
               var1.a6()[var12 + 3] = var3.s7();
               var1.a6()[var12 + 2] = var3.x8();
               var1.a6()[var12 + 1] = var3.n3();
               var1.a6()[var12] = var3.y4();
            }
         }
      } else {
         for (int var13 = 0; var13 < var1.a6().length; var13 += 4) {
            if (var4 < (var1.a6()[var13 + 2] & 255)
               && (var1.a6()[var13 + 2] & 255) < var5
               && var6 < (var1.a6()[var13 + 1] & 255)
               && (var1.a6()[var13 + 1] & 255) < var7
               && var8 < (var1.a6()[var13] & 255)
               && (var1.a6()[var13] & 255) < var9) {
               var1.a6()[var13 + 2] = var3.x8();
               var1.a6()[var13 + 1] = var3.n3();
               var1.a6()[var13] = var3.y4();
            }
         }
      }

      return var1;
   }

   @Override
   public String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         super.n5(),
         ' ',
         this.n5 != null ? this.n5.toString() : "",
         ' ',
         this.l6 != null ? this.l6.toString() : "",
         ' ',
         com.aspose.slides.ms.System.s3.n5(NullableBool.class, this.u9)
      });
   }
}
