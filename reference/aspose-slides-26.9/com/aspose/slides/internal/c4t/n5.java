package com.aspose.slides.internal.c4t;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferUShort;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public final class n5 {
   private BufferedImage k5;
   byte[] n5;
   int l6;
   private int u3 = 0;

   public n5() {
   }

   public n5(BufferedImage var1, boolean var2, int[] var3) throws com.aspose.slides.internal.p7x.l6 {
      this.k5 = var1;
      ColorModel var4 = var1.getColorModel();
      int var5 = 0;
      byte var6 = 0;
      int var7 = 0;
      int var8 = 0;
      if (var4.hasAlpha()) {
         if (var4 instanceof IndexColorModel && ((IndexColorModel)var4).getPixelSize() <= 8) {
            IndexColorModel var40 = (IndexColorModel)var4;
            var7 = var40.getPixelSize();
            if (var7 > 2) {
               if (var7 <= 4) {
                  var7 = 4;
               } else {
                  var7 = 8;
               }
            }

            int var42 = 1 << var7;
            int var44 = (var1.getWidth() * var7 + 31) / 32 * 4;
            var8 = var44 * var1.getHeight();
            int var12 = 54 + var42 * 4;
            this.n5 = new byte[var12 + var8];
            this.n5(var12);
            this.n5(40, 0, var6, var8, 0, 0);
            int var13 = 0;
            int var14 = 54;

            while (var13 < var42) {
               this.n5[var14++] = (byte)var40.getBlue(var13);
               this.n5[var14++] = (byte)var40.getGreen(var13);
               this.n5[var14++] = (byte)var40.getRed(var13);
               this.n5[var14++] = (byte)var40.getAlpha(var13);
               var13++;
            }

            WritableRaster var50 = var1.getRaster();
            var14 = 8 / var7;
            int var15 = var1.getWidth();
            int var16 = var1.getHeight();
            var5 = 54 + var42 * 4;

            for (int var17 = 0; var17 < var16; var17++) {
               int var18 = 0;
               int var19 = var5 + var44 * var17;
               byte var20 = 0;

               for (int var21 = 0; var21 < var15; var21++) {
                  int var22 = var50.getSample(var21, var17, 0);
                  if (var18 >= 8) {
                     this.n5[var19++] = var20;
                     var20 = 0;
                     var18 = 0;
                  }

                  var20 = (byte)(var20 | var22 << var18);
                  var18 += var7;
               }

               if (var18 > 0) {
                  this.n5[var19] = var20;
               }
            }
         } else {
            byte var32 = 32;
            byte var27 = 122;
            var8 = var1.getWidth() * var1.getHeight() * 4;
            this.n5 = new byte[var27 + var8];
            this.n5(var27);
            var6 = 3;
            this.n5(108, var32, var6, var8, 0, 0);
            this.n5(-16777216, 16711680, 65280, 255);
            byte var9 = var27;

            for (int var10 = 0; var10 < var1.getHeight(); var10++) {
               for (int var11 = 0; var11 < var1.getWidth(); var11++) {
                  com.aspose.slides.internal.l1b.k5.n5(this.n5, var9, var1.getRGB(var11, var10));
                  var9 += 4;
               }
            }
         }
      } else {
         boolean var41 = false;
         boolean var43 = false;
         if (var2) {
            var41 = ImageIO.getImageWritersByFormatName("JPEG").hasNext();
            var43 = ImageIO.getImageWritersByFormatName("PNG").hasNext();
         }

         byte[] var45 = null;
         if (var41 || var43) {
            try {
               ByteArrayOutputStream var46 = new ByteArrayOutputStream();
               if (!var43 || !(var4 instanceof IndexColorModel) && var41) {
                  var6 = 4;
                  ImageIO.write(var1, "JPEG", var46);
               } else {
                  var6 = 5;
                  ImageIO.write(var1, "PNG", var46);
               }

               var45 = var46.toByteArray();
            } catch (IOException var26) {
            }
         }

         if (var45 != null) {
            byte var29 = 54;
            this.n5 = new byte[var29 + var45.length];
            this.n5(var29);
            this.n5(40, 0, var6, var45.length, 0, 0);
            int var47 = 0;

            for (int var51 = var29; var47 < var45.length; var51++) {
               this.n5[var51] = var45[var47];
               var47++;
            }
         } else if (var4 instanceof IndexColorModel && ((IndexColorModel)var4).getPixelSize() <= 8) {
            IndexColorModel var49 = (IndexColorModel)var4;
            var7 = var49.getPixelSize();
            if (var7 > 2) {
               if (var7 <= 4) {
                  var7 = 4;
               } else {
                  var7 = 8;
               }
            }

            int var53 = 1 << var7;
            int var61 = (var1.getWidth() * var7 + 31) / 32 * 4;
            var8 = var61 * var1.getHeight();
            int var63 = 54 + var53 * 4;
            this.n5 = new byte[var63 + var8];
            this.n5(var63);
            this.n5(40, var7, var6, var8, 0, 0);
            int var65 = 0;
            int var67 = 54;

            while (var65 < var53) {
               this.n5[var67++] = (byte)var49.getBlue(var65);
               this.n5[var67++] = (byte)var49.getGreen(var65);
               this.n5[var67++] = (byte)var49.getRed(var65);
               this.n5[var67++] = 0;
               var65++;
            }

            WritableRaster var66 = var1.getRaster();
            var67 = 8 / var7;
            int var72 = var1.getWidth();
            int var73 = var1.getHeight();
            var5 = 54 + var53 * 4;

            for (int var74 = 0; var74 < var73; var74++) {
               int var75 = 0;
               int var76 = var5 + var61 * var74;
               byte var23 = 0;

               for (int var24 = 0; var24 < var72; var24++) {
                  int var25 = var66.getSample(var24, var74, 0);
                  if (var75 >= 8) {
                     this.n5[var76++] = var23;
                     var23 = 0;
                     var75 = 0;
                  }

                  var23 = (byte)(var23 | var25 << var75);
                  var75 += var7;
               }

               if (var75 > 0) {
                  this.n5[var76] = var23;
               }
            }
         } else {
            byte var34 = 24;
            byte var30 = 54;
            int var48 = (var1.getWidth() * var34 + 31) / 32 * 4;
            var8 = var48 * var1.getHeight();
            this.n5 = new byte[var30 + var8];
            this.n5(var30);
            var6 = 0;
            this.n5(40, var34, var6, var8, 0, 0);

            for (int var52 = 0; var52 < var1.getHeight(); var52++) {
               int var58 = var30 + var52 * var48;

               for (int var62 = 0; var62 < var1.getWidth(); var62++) {
                  int var64 = var1.getRGB(var62, var52);
                  this.n5[var58++] = (byte)var64;
                  this.n5[var58++] = (byte)(var64 >> 8);
                  this.n5[var58++] = (byte)(var64 >> 16);
               }
            }
         }
      }

      if (var3 != null) {
         var3[0] = var6;
      }

      this.l6 = this.n5.length - 14;
   }

   public int n5(byte[] var1, int var2, int var3, int var4, int var5) throws IOException {
      int var6 = var4 + var5;
      this.l6 = var6 - var2;
      if (this.l6 < 40) {
         this.k5 = null;
         this.l6 = 0;
         return var2;
      }

      int var7 = com.aspose.slides.internal.l1b.k5.k5(var1, var2 + 14);
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      int var9 = 0;
      int var10 = com.aspose.slides.internal.l1b.k5.u3(var1, var2 + 16);
      if (var7 < 15) {
         var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2 + 32);
         if (var9 == 0 || var9 > 1 << var7) {
            var9 = 1 << var7;
         }

         var9 *= 4;
      } else if (var8 == 40 && var10 == 3) {
         var9 = 12;
      }

      if (this.l6 - var8 - var5 < var9) {
         this.l6 = var8 + var5 + var9;
      }

      int var11 = 14 + this.l6;
      if (var11 % 4 != 0) {
         var11 = (var11 / 4 + 1) * 4;
      }

      this.n5 = new byte[var11];
      if (var8 >= 0) {
         System.arraycopy(var1, var2 + 0, this.n5, 14, var8);
      }

      if (var10 != 3) {
         com.aspose.slides.internal.l1b.k5.n5(this.n5, 46, var9 / 4);
      }

      int var12 = var3 - var8;
      if (var12 < var9) {
         for (int var13 = 0; var13 < var9; var13 += 4) {
            byte var14 = (byte)(255 * var13 / (var9 - 4));
            int var15 = 14 + var3 + var13;
            this.n5[var15] = var14;
            this.n5[var15 + 1] = var14;
            this.n5[var15 + 2] = var14;
            this.n5[var15 + 3] = 0;
         }
      } else {
         var12 = var9;
      }

      int var18 = var2 + var8;
      int var19 = 14 + var8;
      if (var12 >= 0) {
         System.arraycopy(var1, var18 + 0, this.n5, var19 + 0, var12);
      }

      int var20 = 14 + var8 + var9;
      if (var5 >= 0) {
         System.arraycopy(var1, var4 + 0, this.n5, var20 + 0, var5);
      }

      for (int var16 = this.l6 + 14; var16 < var11; var16++) {
         this.n5[var16] = 0;
      }

      this.n5[0] = 66;
      this.n5[1] = 77;
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 2, this.n5.length);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 6, 0);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 10, var20);
      return var2 + this.l6;
   }

   private void n5(int var1) {
      this.n5[0] = 66;
      this.n5[1] = 77;
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 2, this.n5.length);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 6, 0);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 10, var1);
   }

   private void n5(int var1, int var2, int var3, int var4, int var5, int var6) {
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 14, var1);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 18, this.k5.getWidth());
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 22, -this.k5.getHeight());
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 26, (short)1);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 28, (short)var2);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 30, var3);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 34, var4);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 38, var5);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 42, var6);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 46, 0);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 50, 0);
   }

   private void n5(int var1, int var2, int var3, int var4) {
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 54, var2);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 58, var3);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 62, var4);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 66, var1);
      com.aspose.slides.internal.l1b.k5.n5(this.n5, 70, 544106839);
      Arrays.fill(this.n5, 74, 108, (byte)0);
   }

   public void n5(byte[] var1, int var2, int var3, boolean var4) throws IOException {
      this.l6 = var3;
      if (this.l6 < 40) {
         this.k5 = null;
         this.l6 = 0;
      } else {
         int var5 = 14 + this.l6;
         if (var5 % 4 != 0) {
            var5 = (var5 / 4 + 2) * 4;
         }

         this.n5 = new byte[var5];
         System.arraycopy(var1, var2 + 0, this.n5, 14, this.l6);

         for (int var6 = this.l6 + 14; var6 < var5; var6++) {
            this.n5[var6] = 0;
         }

         this.n5[0] = 66;
         this.n5[1] = 77;
         com.aspose.slides.internal.l1b.k5.n5(this.n5, 2, 14 + this.l6);
         com.aspose.slides.internal.l1b.k5.n5(this.n5, 6, 0);
         int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         short var7 = com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 14);
         int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2 + 32);
         if (var8 == 0) {
            var8 = 1 << var7;
         }

         if (var4 && var7 > 8 || var7 > 16) {
            var8 = 0;
         }

         com.aspose.slides.internal.l1b.k5.n5(this.n5, 10, 14 + var9 + var8 * (var4 ? 2 : 4));
      }
   }

   public int n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      int var4 = var2;
      if (var3 - var2 < 16) {
         this.k5 = null;
         this.l6 = 0;
         this.n5 = null;
         return 0;
      }

      short var5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var7 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      int var8 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      byte var9 = var1[++var2];
      var8 = (var9 * var6 + 15) / 16 * 2;
      int var10 = (var9 * var6 + 31) / 32 * 4;
      int var11 = 0;
      if (var9 < 16) {
         var11 = 2 << var9;
      }

      int var12 = 54 + var11 * 4;
      int var13 = var10 * var7;
      this.n5 = new byte[var12 + var13];
      this.l6 = this.n5.length - 14;
      this.n5(var12);
      this.n5(40, var9, 0, var13, 0, 0);

      for (int var14 = 0; var14 < this.k5.getHeight(); var14++) {
         System.arraycopy(var1, var2 + var8 * var14, this.n5, var12 + var10 * var14, var8);
      }

      return var2 + var8 * var7 - var4;
   }

   static BufferedImage n5(byte[] var0) {
      return n5(var0, null);
   }

   static BufferedImage n5(byte[] var0, int[] var1) {
      BufferedImage var2 = null;
      ColorModel var3 = null;
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var0, 10);
      byte var5 = 14;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var0, var5);
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      boolean var13 = false;
      int var14;
      int var15;
      short var16;
      if (var6 == 12) {
         var14 = com.aspose.slides.internal.l1b.k5.l6(var0, var5 + 4);
         var15 = com.aspose.slides.internal.l1b.k5.l6(var0, var5 + 6);
         var16 = com.aspose.slides.internal.l1b.k5.l6(var0, var5 + 10);
         var7 = 0;
         var8 = 0;
      } else {
         var14 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 4);
         var15 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 8);
         var16 = com.aspose.slides.internal.l1b.k5.l6(var0, var5 + 14);
         var7 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 16);
         var8 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 32);
         if (var6 > 40 || var7 == 3) {
            var9 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 40);
            var10 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 44);
            var11 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 48);
            if (var6 > 52) {
               var12 = com.aspose.slides.internal.l1b.k5.u3(var0, var5 + 52);
            }
         }
      }

      int var17 = Math.abs(var15);
      if (var1 != null) {
         var1[0] = var7;
      }

      switch (var7) {
         case 0:
            int var31 = (var14 * var16 + 31) / 32 * 4;
            if (var16 == 1) {
               byte var19 = 2;
               byte[] var20 = new byte[var19 * 3 + 3];
               int var21 = 0;

               for (int var22 = 0; var22 < 3; var22++) {
                  int var23 = var5 + var6 + var22 * 4;
                  var20[var21++] = var0[var23 + 2];
                  var20[var21++] = var0[var23 + 1];
                  var20[var21++] = var0[var23];
               }

               var3 = new IndexColorModel(var16, var19, var20, 0, false);
               var2 = n5(var3, var14, var17, var0, var4, var16, var31);
            } else if (var16 <= 8) {
               int var32 = (var4 - var5 - var6) / 4;
               byte[] var33 = new byte[var32 * 3 + 3];
               int var36 = 0;

               for (int var39 = 0; var39 < var32; var39++) {
                  int var40 = var5 + var6 + var39 * 4;
                  var33[var36++] = var0[var40 + 2];
                  var33[var36++] = var0[var40 + 1];
                  var33[var36++] = var0[var40];
               }

               var3 = new IndexColorModel(var16, var32, var33, 0, false);
               var2 = n5(var3, var14, var17, var0, var4, var16, var31);
            } else if (var16 == 16) {
               var2 = n5(var14, var15, var0, var4, var16, 31744, 992, 31, var12, var31);
               return l6(var2);
            } else if (var16 != 24) {
               var2 = n5(var14, var17, var0, var4, var16, 255, 65280, 16711680, 0, var31);
               return l6(var2);
            } else {
               var3 = new ComponentColorModel(ColorSpace.getInstance(1000), false, false, 1, 0);
            }
         case 1:
         case 2:
         default:
            if (var3 != null && var3 instanceof IndexColorModel) {
               var2 = l6(var2);
            }

            return var2;
         case 3:
            int var18 = (var14 * var16 * 4 + 31) / 32;
            var2 = n5(var14, var17, var0, var4, var16, var9, var10, var11, var12, var18);
            return l6(var2);
         case 4:
         case 5:
            try {
               var2 = ImageIO.read(new ByteArrayInputStream(var0, var4, var0.length - var4));
            } catch (IOException var24) {
            }

            return var2;
      }
   }

   private static BufferedImage l6(BufferedImage var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         ImageIO.write(var0, "png", var1);
         var1.write(0);
         var1.write(0);
         var1.write(0);
         var1.write(0);
         var0 = ImageIO.read(new ByteArrayInputStream(var1.toByteArray()));
      } catch (IOException var3) {
      } catch (IndexOutOfBoundsException var4) {
      }

      return var0;
   }

   private static BufferedImage n5(ColorModel var0, int var1, int var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = Math.abs(var2);
      int var8 = (var1 * var5 + 15) / 16 * 2;
      byte[] var9 = new byte[(var7 * var8 * 4 + 3) / 4];
      int var10;
      int var11;
      if (var2 > 0) {
         var10 = var4 + (var7 - 1) * var6;
         var11 = -var6;
      } else {
         var10 = var4;
         var11 = var6;
      }

      if (var5 <= 8) {
         int var12 = 0;
         int var13 = (var1 * var5 + 7) / 8;

         for (int var14 = 0; var14 < var7; var14++) {
            int var15 = var10;

            for (int var16 = 0; var16 < var13; var16++) {
               var9[var12++] = var3[var15++];
            }

            var10 += var11;
         }
      } else if (var5 == 16) {
         int var17 = 0;

         for (int var27 = 0; var27 < var7; var27++) {
            int var31 = var10;

            for (int var34 = 0; var34 < var1; var34++) {
               var9[var17++] = var3[var31 + 1];
               var9[var17++] = var3[var31];
               var31 += 2;
            }

            var10 += var11;
         }
      } else if (var5 == 24) {
         int var19 = 0;

         for (int var28 = 0; var28 < var7; var28++) {
            int var32 = var10;

            for (int var35 = 0; var35 < var1; var35++) {
               var9[var19++] = var3[var32 + 2];
               var9[var19++] = var3[var32 + 1];
               var9[var19++] = var3[var32];
               var32 += 3;
            }

            var10 += var11;
         }
      } else if (var5 == 32) {
         int var22 = 0;

         for (int var29 = 0; var29 < var7; var29++) {
            int var33 = var10;

            for (int var36 = 0; var36 < var1; var36++) {
               var9[var22++] = var3[var33 + 3];
               var9[var22++] = var3[var33 + 2];
               var9[var22++] = var3[var33 + 1];
               var9[var22++] = var3[var33];
               var33 += 4;
            }

            var10 += var11;
         }
      }

      DataBufferByte var26 = new DataBufferByte(var9, var9.length);
      WritableRaster var30 = WritableRaster.createWritableRaster(var0.createCompatibleSampleModel(var1, var7), var26, null);
      return new BufferedImage(var0, var30, false, null);
   }

   private static BufferedImage n5(int var0, int var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      boolean var10 = var8 != 0;
      int var11 = Math.abs(var1);
      DataBuffer var12 = null;
      int var13;
      int var14;
      if (var1 > 0) {
         var13 = var3 + (var11 - 1) * var9;
         var14 = -var9;
      } else {
         var13 = var3;
         var14 = var9;
      }

      DirectColorModel var15 = var10 ? new DirectColorModel(var4, var5, var6, var7, var8) : new DirectColorModel(var4, var5, var6, var7);
      int var16 = var4 / 8;
      if (var4 <= 8) {
         int var17 = 0;
         byte[] var18 = new byte[var0 * var11];

         for (int var19 = 0; var19 < var11; var19++) {
            int var20 = var13;

            for (int var21 = 0; var21 < var0; var21++) {
               var18[var17++] = var2[var20];
               var20 += var16;
            }

            var13 += var14;
         }

         var12 = new DataBufferByte(var18, var18.length);
      } else if (var4 == 16) {
         int var23 = 0;
         short[] var27 = new short[var0 * var11];

         for (int var30 = 0; var30 < var11; var30++) {
            int var33 = var13;

            for (int var36 = 0; var36 < var0; var36++) {
               var27[var23++] = com.aspose.slides.internal.l1b.k5.l6(var2, var33);
               var33 += var16;
            }

            var13 += var14;
         }

         var12 = new DataBufferUShort(var27, var27.length);
      } else if (var4 == 24) {
         int var24 = 0;
         int[] var28 = new int[var0 * var11];

         for (int var31 = 0; var31 < var11; var31++) {
            int var34 = var13;

            for (int var37 = 0; var37 < var0; var37++) {
               var28[var24++] = (var2[var34 + 2] << 16) + (var2[var34 + 1] << 8) + var2[var34];
               var34 += var16;
            }

            var13 += var14;
         }

         var12 = new DataBufferInt(var28, var28.length);
      } else {
         if (var4 != 32) {
            return null;
         }

         int var25 = 0;
         int[] var29 = new int[var0 * var11];

         for (int var32 = 0; var32 < var11; var32++) {
            int var35 = var13;

            for (int var38 = 0; var38 < var0; var38++) {
               var29[var25++] = com.aspose.slides.internal.l1b.k5.u3(var2, var35);
               var35 += var16;
            }

            var13 += var14;
         }

         var12 = new DataBufferInt(var29, var29.length);
      }

      WritableRaster var26 = WritableRaster.createWritableRaster(var15.createCompatibleSampleModel(var0, var11), var12, null);
      return new BufferedImage(var15, var26, false, null);
   }

   @Override
   public boolean equals(Object obj) {
      if (obj != null && obj instanceof n5) {
         n5 var2 = (n5)obj;
         if (this.l6 != var2.l6) {
            return false;
         }

         for (int var3 = 0; var3 < this.l6; var3++) {
            if (this.n5[var3] != var2.n5[var3]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      if (this.u3 == 0) {
         int var1 = 0;

         for (int var2 = 0; var2 < this.l6; var2++) {
            var1 = var1 * 31 + this.n5[var2];
         }

         this.u3 = var1;
      }

      return this.u3;
   }

   public BufferedImage n5() {
      if (this.k5 == null) {
         try {
            this.k5 = ImageIO.read(new ByteArrayInputStream(this.n5));
         } catch (Exception var3) {
         }

         if (this.k5 == null) {
            try {
               this.k5 = n5(this.n5);
            } catch (Exception var2) {
            }
         }
      }

      return this.k5;
   }

   public void n5(BufferedImage var1) {
      this.k5 = var1;
   }
}
