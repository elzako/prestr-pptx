package com.aspose.slides;

import java.awt.geom.Dimension2D;

public final class HtmlGenerator implements IHtmlGenerator {
   private char[] n5 = new char[1024];
   private int l6 = 0;
   private com.aspose.slides.internal.z0k.a0 k5;
   private final com.aspose.slides.internal.o9b.f2 u3 = new com.aspose.slides.internal.o9b.f2();
   private int a6 = 0;
   private int u9 = -1;
   private int h0 = -1;
   private int c8 = -1;
   private static final com.aspose.slides.internal.n8e.e2 t2 = new com.aspose.slides.internal.n8e.e2("in", "cm", "mm", "pt", "pc", "em", "ex", "px", "%");
   private int[] s7;

   HtmlGenerator(com.aspose.slides.internal.z0k.a0 tw, com.aspose.slides.internal.o9b.f2 slideSize, int sizeUnit, int[] slides) {
      this.k5 = tw;
      slideSize.l6(this.u3);
      this.a6 = sizeUnit;
      this.s7 = slides;
   }

   private HtmlGenerator() {
   }

   @Override
   public final void addHtml(String html) {
      this.n5(html, 0, html.length());
   }

   @Override
   public final void addHtml(char[] html) {
      this.n5(html, 0, html.length);
   }

   @Override
   public final void addHtml(char[] html, int startIndex, int length) {
      this.n5(html, startIndex, length);
   }

   @Override
   public final void addText(String text) {
      int var2 = text.length();
      int var3 = 0;
      int var4 = 0;

      while (var3 < var2) {
         char var5 = text.charAt(var3);
         if ('&' == var5) {
            if (var4 < var3) {
               this.n5(text, var4, var3 - var4);
            }

            this.n5("&amp;");
            var4 = ++var3;
         } else if ('<' == var5) {
            if (var4 < var3) {
               this.n5(text, var4, var3 - var4);
            }

            this.n5("&lt;");
            var4 = ++var3;
         } else if ('>' == var5) {
            if (var4 < var3) {
               this.n5(text, var4, var3 - var4);
            }

            this.n5("&gt;");
            var4 = ++var3;
         } else if (160 < var5 && 256 >= var5) {
            if (var4 < var3) {
               this.n5(text, var4, var3 - var4);
            }

            this.n5("&");
            this.n5(com.aspose.slides.ms.System.a3.n5(var5, com.aspose.slides.internal.x7n.l6.k5()));
            this.n5(";");
            var4 = ++var3;
         } else {
            var3++;
         }
      }
   }

   @Override
   public final void addText(char[] text) {
      this.addText(text, 0, text.length);
   }

   @Override
   public final void addText(char[] text, int startIndex, int length) {
      int var4 = startIndex;
      int var5 = startIndex;

      while (var4 < length) {
         char var6 = text[var4];
         if ('&' == var6) {
            if (var5 < var4) {
               this.n5(text, var5, var4 - var5);
            }

            this.n5("&amp;");
            var5 = ++var4;
         } else if ('<' == var6) {
            if (var5 < var4) {
               this.n5(text, var5, var4 - var5);
            }

            this.n5("&lt;");
            var5 = ++var4;
         } else if ('>' == var6) {
            if (var5 < var4) {
               this.n5(text, var5, var4 - var5);
            }

            this.n5("&gt;");
            var5 = ++var4;
         } else if (160 < var6 && 256 >= var6) {
            if (var5 < var4) {
               this.n5(text, var5, var4 - var5);
            }

            this.n5("&");
            this.n5(com.aspose.slides.ms.System.a3.n5(var6, com.aspose.slides.internal.x7n.l6.k5()));
            this.n5(";");
            var5 = ++var4;
         } else {
            var4++;
         }
      }
   }

   @Override
   public final void addAttributeValue(String value) {
      this.n5("\"");
      int var2 = value.length();
      int var3 = 0;
      int var4 = 0;

      while (var3 < var2) {
         char var5 = value.charAt(var3);
         if ('"' == var5) {
            if (var4 < var3) {
               this.n5(value, var4, var3 - var4);
            }

            this.n5("&quot;");
            var4 = ++var3;
         } else if ('&' == var5) {
            if (var4 < var3) {
               this.n5(value, var4, var3 - var4);
            }

            this.n5("&amp;");
            var4 = ++var3;
         } else if ('<' == var5) {
            if (var4 < var3) {
               this.n5(value, var4, var3 - var4);
            }

            this.n5("&lt;");
            var4 = ++var3;
         } else if ('>' == var5) {
            if (var4 < var3) {
               this.n5(value, var4, var3 - var4);
            }

            this.n5("&gt;");
            var4 = ++var3;
         } else if (160 < var5 && 256 >= var5) {
            if (var4 < var3) {
               this.n5(value, var4, var3 - var4);
            }

            this.n5("&");
            this.n5(com.aspose.slides.ms.System.a3.n5(var5, com.aspose.slides.internal.x7n.l6.k5()));
            this.n5(";");
            var4 = ++var3;
         } else {
            var3++;
         }
      }

      this.n5("\"");
   }

   @Override
   public final void addAttributeValue(char[] value) {
      this.addAttributeValue(value, 0, value.length);
   }

   @Override
   public final void addAttributeValue(char[] value, int startIndex, int length) {
      this.n5("\"");
      int var4 = startIndex;
      int var5 = startIndex;

      while (var4 < length) {
         char var6 = value[var4];
         if ('"' == var6) {
            if (var5 < var4) {
               this.n5(value, var5, var4 - var5);
            }

            this.n5("&quot;");
            var5 = ++var4;
         } else if ('&' == var6) {
            if (var5 < var4) {
               this.n5(value, var5, var4 - var5);
            }

            this.n5("&amp;");
            var5 = ++var4;
         } else if ('<' == var6) {
            if (var5 < var4) {
               this.n5(value, var5, var4 - var5);
            }

            this.n5("&lt;");
            var5 = ++var4;
         } else if ('>' == var6) {
            if (var5 < var4) {
               this.n5(value, var5, var4 - var5);
            }

            this.n5("&gt;");
            var5 = ++var4;
         } else if (160 < var6 && 256 >= var6) {
            if (var5 < var4) {
               this.n5(value, var5, var4 - var5);
            }

            this.n5("&");
            this.n5(com.aspose.slides.ms.System.a3.n5(var6, com.aspose.slides.internal.x7n.l6.k5()));
            this.n5(";");
            var5 = ++var4;
         } else {
            var4++;
         }
      }

      this.n5("\"");
   }

   private void n5(String var1) {
      this.n5(var1, 0, var1.length());
   }

   private void n5(String var1, int var2, int var3) {
      this.n5(this.l6 + var3);
      com.aspose.slides.ms.System.d1.n5(var1, var2, this.n5, this.l6, var3);
      this.l6 = this.l6 + var1.length();
   }

   private void n5(char[] var1, int var2, int var3) {
      this.n5(this.l6 + var3);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, var3);
      this.l6 += var1.length;
   }

   final void n5() {
      this.k5.n5(this.n5, 0, this.l6);
      this.k5.k5();
      this.u9();
   }

   final boolean l6() {
      return this.l6 > 0;
   }

   private void n5(int var1) {
      if (var1 > this.n5.length) {
         int var2 = var1 % 512;
         if (var2 > 0) {
            var1 += 512 - var2;
         }

         char[] var3 = new char[var1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), com.aspose.slides.ms.System.u3.n5((Object)(var3)), this.l6);
         this.n5 = var3;
      }
   }

   private void u9() {
      this.l6 = 0;
   }

   final com.aspose.slides.internal.z0k.a0 k5() {
      return this.k5;
   }

   @Override
   public final Dimension2D getSlideImageSize() {
      return com.aspose.slides.internal.o9b.f2.n5(this.u3());
   }

   com.aspose.slides.internal.o9b.f2 u3() {
      return this.u3;
   }

   @Override
   public final int getSlideImageSizeUnit() {
      return this.a6;
   }

   @Override
   public final String getSlideImageSizeUnitCode() {
      return t2.n5(this.a6);
   }

   @Override
   public final int getPreviousSlideIndex() {
      return this.u9;
   }

   @Override
   public final int getSlideIndex() {
      return this.h0;
   }

   @Override
   public final int getNextSlideIndex() {
      return this.c8;
   }

   final int[] a6() {
      return this.s7;
   }

   final void n5(int var1, int var2, int var3) {
      this.u9 = var1;
      this.h0 = var2;
      this.c8 = var3;
   }
}
