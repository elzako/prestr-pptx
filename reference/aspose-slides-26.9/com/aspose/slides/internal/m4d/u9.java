package com.aspose.slides.internal.m4d;

import com.aspose.slides.Collections.Generic.List;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;

public class u9 {
   protected RenderedImage n5;
   protected ColorModel l6;
   protected Raster k5;
   protected int u3;
   protected u9$n5 a6;
   protected int u9;
   protected int h0;
   protected int c8;
   protected int t2;
   protected u9$n5[] s7;
   protected u9$n5[] x8;
   protected int n3;
   protected u9$n5 y4;

   public static RenderedImage n5(RenderedImage var0) {
      int var1 = var0.getWidth() * var0.getHeight();
      if (var1 >= 256) {
         u9 var14 = new u9(var0);
         var14.l6();
         return var14.n5();
      }

      int var2 = -1;
      List var3 = new List();
      int[] var4 = new int[var1];

      for (int var5 = 0; var5 < var0.getHeight(); var5++) {
         for (int var6 = 0; var6 < var0.getWidth(); var6++) {
            int var7 = ((BufferedImage)var0).getRGB(var6, var5);
            Color var8 = new Color(var7, true);
            int var9 = var6 + var5 * var0.getWidth();
            if (!var3.contains(var8)) {
               if (var8.getAlpha() == 0) {
                  var2 = var3.size();
               }

               var4[var9] = var3.size();
               var3.addItem(var8);
            } else {
               var4[var9] = var3.indexOf(var8);
            }
         }
      }

      var1 = var3.size();
      byte[] var15 = new byte[var1];
      byte[] var16 = new byte[var1];
      byte[] var17 = new byte[var1];

      for (int var18 = 0; var18 < var1; var18++) {
         var15[var18] = (byte)((Color)var3.get_Item(var18)).getRed();
         var16[var18] = (byte)((Color)var3.get_Item(var18)).getGreen();
         var17[var18] = (byte)((Color)var3.get_Item(var18)).getBlue();
      }

      IndexColorModel var19 = new IndexColorModel(8, var1, var15, var16, var17, var2);
      BufferedImage var20 = new BufferedImage(var0.getWidth(), var0.getHeight(), 13, var19);

      for (int var10 = 0; var10 < var0.getHeight(); var10++) {
         for (int var11 = 0; var11 < var0.getWidth(); var11++) {
            int var12 = var11 + var10 * var0.getWidth();
            var20.setRGB(var11, var10, ((BufferedImage)var0).getRGB(var11, var10));
         }
      }

      return var20;
   }

   protected RenderedImage n5() {
      IndexColorModel var1 = this.k5();
      BufferedImage var2 = new BufferedImage(this.n5.getWidth(), this.n5.getHeight(), 13, var1);
      WritableRaster var3 = var2.getRaster();

      for (int var4 = 0; var4 < var2.getHeight(); var4++) {
         for (int var5 = 0; var5 < var2.getWidth(); var5++) {
            Color var6 = this.n5(var5, var4);
            var3.setSample(var5, var4, 0, this.n5(this.a6, var6));
         }
      }

      return var2;
   }

   protected u9(RenderedImage var1) {
      this(var1, Math.min(256, var1.getHeight() * var1.getWidth()));
   }

   protected u9(RenderedImage var1, int var2) {
      this.n5 = var1;
      this.l6 = var1.getColorModel();
      this.k5 = var1.getData();
      this.n3 = this.l6.getTransparency();
      if (this.n3 != 1) {
         this.u3 = var2 - 1;
         this.y4 = new u9$n5(this);
         this.y4.n5 = true;
      } else {
         this.u3 = var2;
      }
   }

   private Color n5(int var1, int var2) {
      int var3 = this.l6.getRGB(this.k5.getDataElements(var1, var2, null));
      return new Color(var3, this.n3 != 1);
   }

   protected int n5(u9$n5 var1, Color var2) {
      if (this.n3 != 1 && var2.getAlpha() != 255) {
         return 0;
      }

      if (var1.n5) {
         return var1.c8;
      }

      int var3 = this.n5(var2, var1.t2);
      return this.n5(var1.k5[var3], var2);
   }

   protected void l6() {
      this.s7 = new u9$n5[9];

      for (int var1 = 0; var1 < this.s7.length; var1++) {
         this.s7[var1] = null;
      }

      this.u9 = 0;
      this.h0 = 0;
      this.a6 = null;
      this.t2 = 0;
      this.c8 = 8;
      boolean var7 = false;
      int var2 = this.n5.getWidth();
      int var3 = this.n5.getHeight();

      for (int var4 = 0; var4 < var3; var4++) {
         for (int var5 = 0; var5 < var2; var5++) {
            Color var6 = this.n5(var2 - var5 - 1, var3 - var4 - 1);
            if (this.n3 != 1 && var6.getAlpha() != 255) {
               if (!var7) {
                  this.a6 = this.n5(this.a6, var6, 0);
                  var7 = true;
               }

               this.y4 = this.n5(this.y4, var6, 0);
            } else {
               this.a6 = this.n5(this.a6, var6, 0);
            }

            if (this.t2 > this.u3) {
               this.u3();
            }
         }
      }
   }

   protected u9$n5 n5(u9$n5 var1, Color var2, int var3) {
      if (var1 == null) {
         var1 = new u9$n5(this);
         this.u9++;
         if (this.u9 > this.h0) {
            this.h0 = this.u9;
         }

         var1.t2 = var3;
         var1.n5 = var3 > 8;
         if (var1.n5) {
            this.t2++;
         }
      }

      var1.u3++;
      var1.a6 = var1.a6 + var2.getRed();
      var1.h0 = var1.h0 + var2.getGreen();
      var1.u9 = var1.u9 + var2.getBlue();
      if (!var1.n5) {
         int var4 = this.n5(var2, var3);
         if (var1.k5[var4] == null) {
            var1.l6++;
            if (var1.l6 == 2) {
               var1.s7 = this.s7[var3];
               this.s7[var3] = var1;
            }
         }

         var1.k5[var4] = this.n5(var1.k5[var4], var2, var3 + 1);
      }

      return var1;
   }

   protected IndexColorModel k5() {
      int var1 = this.t2;
      if (this.n3 == 2) {
         var1++;
      }

      byte[] var2 = new byte[var1];
      byte[] var3 = new byte[var1];
      byte[] var4 = new byte[var1];
      int var5 = 0;
      this.x8 = new u9$n5[var1];
      if (this.n3 == 2) {
         var5++;
      }

      int var6 = this.n5(this.a6, var5, var2, var3, var4);
      IndexColorModel var7 = null;
      if (this.n3 == 2) {
         var7 = new IndexColorModel(8, var1, var2, var3, var4, 0);
      } else {
         var7 = new IndexColorModel(8, this.t2, var2, var3, var4);
      }

      return var7;
   }

   protected int n5(u9$n5 var1, int var2, byte[] var3, byte[] var4, byte[] var5) {
      if (var1.n5) {
         var3[var2] = (byte)(var1.a6 / var1.u3);
         var4[var2] = (byte)(var1.h0 / var1.u3);
         var5[var2] = (byte)(var1.u9 / var1.u3);
         var1.c8 = var2;
         this.x8[var2] = var1;
         var2++;
      } else {
         for (int var6 = 0; var6 < 8; var6++) {
            if (var1.k5[var6] != null) {
               var2 = this.n5(var1.k5[var6], var2, var3, var4, var5);
            }
         }
      }

      return var2;
   }

   protected int n5(Color var1, int var2) {
      if (var2 <= 8 && var2 >= 0) {
         int var3 = 8 - var2;
         int var4 = 1 & (0xFF & var1.getRed()) >> var3;
         int var5 = 1 & (0xFF & var1.getGreen()) >> var3;
         int var6 = 1 & (0xFF & var1.getBlue()) >> var3;
         return var4 << 2 | var5 << 1 | var6;
      } else {
         throw new IllegalArgumentException("Invalid octree node depth: " + var2);
      }
   }

   protected void u3() {
      int var1 = this.s7.length - 1;

      while (this.s7[var1] == null && var1 >= 0) {
         var1--;
      }

      u9$n5 var2 = this.s7[var1];
      if (var2 != null) {
         u9$n5 var3 = var2;
         int var4 = var3.u3;

         for (int var5 = 1; var3.s7 != null; var5++) {
            if (var4 > var3.s7.u3) {
               var2 = var3;
               var4 = var3.u3;
            }

            var3 = var3.s7;
         }

         if (var2 == this.s7[var1]) {
            this.s7[var1] = var2.s7;
         } else {
            var3 = var2.s7;
            var2.s7 = var3.s7;
            var2 = var3;
         }

         if (!var2.n5) {
            int var6 = var2.n5();
            var2.n5 = true;
            this.t2 -= var6 - 1;
            int var7 = var2.t2;

            for (int var8 = 0; var8 < 8; var8++) {
               var2.k5[var8] = this.n5(var2.k5[var8]);
            }

            var2.l6 = 0;
         }
      }
   }

   protected u9$n5 n5(u9$n5 var1) {
      if (var1 == null) {
         return null;
      }

      for (int var2 = 0; var2 < 8; var2++) {
         var1.k5[var2] = this.n5(var1.k5[var2]);
      }

      this.u9--;
      return null;
   }
}
