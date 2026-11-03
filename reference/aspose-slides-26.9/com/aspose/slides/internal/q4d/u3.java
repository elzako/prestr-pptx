package com.aspose.slides.internal.q4d;

import com.aspose.slides.internal.r1x.k7;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.SampleModel;
import javax.imageio.ImageTypeSpecifier;

public class u3 {
   private final int n5;
   private final int l6;
   private final int k5;
   private final int[] u3;
   private final int[] a6;
   private final int[] u9;
   private final int[] h0;
   private final byte[] c8;
   private int t2;

   public u3(com.aspose.slides.internal.f2i.n5 var1) {
      this.n5 = var1.y2();
      this.l6 = var1.m3();
      this.k5 = var1.s3();
      this.u3 = var1.k7();
      this.a6 = var1.d5();
      this.u9 = new int[]{var1.j5()};
      this.h0 = var1.z8();
      if (var1.s7(34675) != null) {
         this.c8 = var1.z3();
      } else {
         this.c8 = null;
      }

      this.t2 = 0;

      for (int var2 = 0; var2 < this.u3.length; var2++) {
         this.t2 = this.t2 + this.u3[var2];
      }
   }

   public ImageTypeSpecifier n5() {
      if (this.l6()) {
         return this.n3();
      }

      if (this.k5()) {
         return this.y4();
      }

      if (this.u3()) {
         return this.e2();
      }

      if (this.a6()) {
         return this.t9();
      }

      if (this.u9()) {
         return this.z1();
      }

      if (this.h0()) {
         return this.t4();
      }

      if (this.c8()) {
         return this.q0();
      }

      if (this.t2()) {
         return this.z3();
      }

      if (this.s7()) {
         return this.m1();
      }

      if (this.x8()) {
         ImageTypeSpecifier var1 = this.k7();
         if (var1 != null) {
            return var1;
         }
      }

      if (this.h0 == null && this.a6[0] != 3) {
         int var9 = 0;

         for (int var2 = 0; var2 < this.u3.length; var2++) {
            if (this.u3[var2] > var9) {
               var9 = this.u3[var2];
            }
         }

         boolean var10 = this.a6[0] == 2;
         if (this.k5 == 1) {
            int var15 = this.n5(var9, var10);
            return ImageTypeSpecifier.createGrayscale(var9, var15, var10);
         }

         if (this.k5 == 2) {
            boolean var14 = false;
            if (this.u9 != null && this.u9[0] == 1) {
               var14 = true;
            }

            int var19 = this.n5(var9, var10);
            return ImageTypeSpecifier.createGrayscale(var9, var19, false, var14);
         }

         if (this.k5 != 3 && this.k5 != 4) {
            int var13 = this.n5(var9, var10);
            SampleModel var18 = this.n5(var13, this.k5);
            n5 var21 = new n5(this.k5);
            ColorModel var22 = this.n5(var21, this.k5, var13, false, false);
            return new ImageTypeSpecifier(var22, var18);
         }

         if (this.t2 <= 32 && !var10) {
            int var12 = this.n5(this.u3, 0);
            int var17 = this.n5(this.u3, 1);
            int var20 = this.n5(this.u3, 2);
            int var6 = this.k5 == 4 ? this.n5(this.u3, 3) : 0;
            int var7 = this.n5(this.t2, false);
            boolean var8 = false;
            if (this.u9 != null && this.u9[0] == 1) {
               var8 = true;
            }

            return ImageTypeSpecifier.createPacked(ColorSpace.getInstance(1000), var12, var17, var20, var6, var7, var8);
         }

         if (this.k5 == 3) {
            int[] var11 = new int[]{0, 1, 2};
            int var16 = this.n5(var9, var10);
            return ImageTypeSpecifier.createInterleaved(ColorSpace.getInstance(1000), var11, var16, false, false);
         }

         if (this.k5 == 4) {
            int[] var3 = new int[]{0, 1, 2, 3};
            int var4 = this.n5(var9, var10);
            boolean var5 = false;
            if (this.u9 != null && this.u9[0] == 1) {
               var5 = true;
            }

            return ImageTypeSpecifier.createInterleaved(ColorSpace.getInstance(1000), var3, var4, true, var5);
         }
      }

      return null;
   }

   private boolean l6() {
      return this.k5 == 1 && (this.u3[0] == 1 || this.u3[0] == 2 || this.u3[0] == 4 || this.u3[0] == 8 || this.u3[0] == 16) && this.h0 == null;
   }

   private boolean k5() {
      return this.k5 == 1
         && (this.u3[0] == 1 || this.u3[0] == 2 || this.u3[0] == 4 || this.u3[0] == 7 || this.u3[0] == 8 || this.u3[0] == 16)
         && this.h0 != null;
   }

   private boolean u3() {
      return this.k5 == 2 && this.u3[0] == 8 && this.u3[1] == 8;
   }

   private boolean a6() {
      return this.k5 == 2 && this.u3[0] == 16 && this.u3[1] == 16;
   }

   private boolean u9() {
      return this.k5 == 3 && this.u3[0] == 8 && this.u3[1] == 8 && this.u3[2] == 8;
   }

   private boolean h0() {
      return this.k5 == 4 || this.k5 == 5 && this.u9.length == 1 && this.u3[0] == 8 && this.u3[1] == 8 && this.u3[2] == 8 && this.u3[3] == 8;
   }

   private boolean c8() {
      return this.k5 == 3 && this.u3[0] == 16 && this.u3[1] == 16 && this.u3[2] == 16;
   }

   private boolean t2() {
      return this.k5 == 4 && this.u3[0] == 16 && this.u3[1] == 16 && this.u3[2] == 16 && this.u3[3] == 16;
   }

   private boolean s7() {
      return (this.k5 == 3 || this.k5 == 4) && (this.t2 == 8 || this.t2 == 16);
   }

   private boolean x8() {
      return this.u3[0] % 8 == 0;
   }

   private ImageTypeSpecifier n3() {
      if (this.u3[0] == 16) {
         return ImageTypeSpecifier.createFromBufferedImageType(6);
      }

      boolean var1 = this.a6[0] == 2;
      int var2;
      if (this.u3[0] <= 8) {
         var2 = 0;
      } else {
         var2 = this.a6[0] == 2 ? 2 : 1;
      }

      int var3 = this.u3[0];
      if (var3 == 4) {
         var3 = 8;
      }

      return ImageTypeSpecifier.createGrayscale(var3, var2, var1);
   }

   private ImageTypeSpecifier y4() {
      int var1 = this.u3[0] == 7 ? 8 : this.u3[0];
      int var2 = 1 << var1;
      byte[] var3 = new byte[var2];
      byte[] var4 = new byte[var2];
      byte[] var5 = new byte[var2];
      Object var6 = null;
      int var7 = 1 << this.u3[0];
      boolean var8 = false;

      for (int var9 = 0; var9 < this.h0.length; var9++) {
         if ((this.h0[var9] & 65535) > 255) {
            var8 = true;
            break;
         }
      }

      for (int var10 = 0; var10 < var7; var10++) {
         if (var8) {
            var3[var10] = (byte)((this.h0[var10] & 65535) >> 8 & 0xFF);
            var4[var10] = (byte)((this.h0[var7 + var10] & 65535) >> 8 & 0xFF);
            var5[var10] = (byte)((this.h0[2 * var7 + var10] & 65535) >> 8 & 0xFF);
         } else {
            var3[var10] = (byte)this.h0[var10];
            var4[var10] = (byte)this.h0[var7 + var10];
            var5[var10] = (byte)this.h0[2 * var7 + var10];
         }
      }

      int var11 = this.u3[0] <= 8 ? 0 : 1;
      return ImageTypeSpecifier.createIndexed(var3, var4, var5, (byte[])var6, var1, var11);
   }

   private ImageTypeSpecifier e2() {
      byte var1 = 0;
      boolean var2 = false;
      if (this.u9 != null && this.u9[0] == 1) {
         var2 = true;
      }

      return ImageTypeSpecifier.createGrayscale(8, var1, false, var2);
   }

   private ImageTypeSpecifier t9() {
      int var1 = this.a6[0] == 2 ? 2 : 1;
      boolean var2 = false;
      if (this.u9 != null && this.u9[0] == 1) {
         var2 = true;
      }

      boolean var3 = var1 == 2;
      return ImageTypeSpecifier.createGrayscale(16, var1, var3, var2);
   }

   private ImageTypeSpecifier z1() {
      return ImageTypeSpecifier.createFromBufferedImageType(5);
   }

   private ImageTypeSpecifier t4() {
      return com.aspose.slides.internal.t5g.u3.a6() && this.n5 == 5
         ? com.aspose.slides.internal.v4y.n5.n5(k7.n5().n5(), k7.l6().n5())
         : ImageTypeSpecifier.createFromBufferedImageType(6);
   }

   private ImageTypeSpecifier q0() {
      return com.aspose.slides.internal.v4y.n5.k5(1);
   }

   private ImageTypeSpecifier z3() {
      boolean var1 = false;
      if (this.u9 != null && this.u9[0] == 1) {
         var1 = true;
      }

      return var1 ? com.aspose.slides.internal.v4y.n5.l6() : com.aspose.slides.internal.v4y.n5.n5();
   }

   private ImageTypeSpecifier m1() {
      int var1 = this.n5(this.u3, 0);
      int var2 = this.n5(this.u3, 1);
      int var3 = this.n5(this.u3, 2);
      int var4 = this.k5 == 4 ? this.n5(this.u3, 3) : 0;
      int var5 = this.t2 == 8 ? 0 : 1;
      boolean var6 = false;
      if (this.u9 != null && this.u9[0] == 1) {
         var6 = true;
      }

      return ImageTypeSpecifier.createPacked(ColorSpace.getInstance(1000), var1, var2, var3, var4, var5, var6);
   }

   private ImageTypeSpecifier k7() {
      boolean var1 = true;

      for (int var2 = 1; var2 < this.u3.length; var2++) {
         if (this.u3[var2] != this.u3[var2 - 1]) {
            var1 = false;
            break;
         }
      }

      if (var1) {
         byte var9 = -1;
         boolean var3 = false;
         switch (this.u3[0]) {
            case 8:
               if (this.a6[0] != 3) {
                  var9 = 0;
                  var3 = true;
               }
               break;
            case 16:
               if (this.a6[0] != 3) {
                  if (this.a6[0] == 2) {
                     var9 = 2;
                  } else {
                     var9 = 1;
                  }

                  var3 = true;
               }
               break;
            case 32:
               if (this.a6[0] == 3) {
                  var9 = 4;
               } else {
                  var9 = 3;
               }

               var3 = true;
         }

         if (var3) {
            SampleModel var4 = this.n5(var9, this.k5);
            ColorModel var8;
            if (this.k5 >= 1 && this.k5 <= 4 && (var9 == 3 || var9 == 4)) {
               ColorSpace var10 = this.k5 <= 2 ? ColorSpace.getInstance(1003) : ColorSpace.getInstance(1000);
               boolean var6 = this.k5 % 2 == 0;
               boolean var7 = false;
               if (var6 && this.u9 != null && this.u9[0] == 1) {
                  var7 = true;
               }

               var8 = this.n5(var10, this.k5, var9, var6, var7);
            } else {
               n5 var5 = new n5(this.k5);
               var8 = this.n5(var5, this.k5, var9, false, false);
            }

            return new ImageTypeSpecifier(var8, var4);
         }
      }

      return null;
   }

   private int n5(int[] var1, int var2) {
      int var3 = (1 << var1[var2]) - 1;

      for (int var4 = var2 + 1; var4 < var1.length; var4++) {
         var3 <<= var1[var4];
      }

      return var3;
   }

   private SampleModel n5(int var1, int var2) {
      int[] var3 = new int[var2];
      int var4 = 0;

      while (var4 < var2) {
         var3[var4] = var4++;
      }

      return new PixelInterleavedSampleModel(var1, 1, 1, var2, var2, var3);
   }

   private ColorModel n5(ColorSpace var1, int var2, int var3, boolean var4, boolean var5) {
      int var6 = var4 ? 3 : 1;
      if (var3 != 4 && var3 != 5) {
         int[] var7 = new int[var2];
         byte var8;
         if (var3 == 0) {
            var8 = 8;
         } else if (var3 != 2 && var3 != 1) {
            if (var3 != 3) {
               throw new IllegalArgumentException("dataType = " + var3);
            }

            var8 = 32;
         } else {
            var8 = 16;
         }

         for (int var9 = 0; var9 < var2; var9++) {
            var7[var9] = var8;
         }

         return new ComponentColorModel(var1, var7, var4, var5, var6, var3);
      } else {
         return new ComponentColorModel(var1, var4, var5, var6, var3);
      }
   }

   private int n5(int var1, boolean var2) {
      if (var1 <= 8) {
         return 0;
      } else if (var1 <= 16) {
         return var2 ? 2 : 1;
      } else {
         return 3;
      }
   }
}
