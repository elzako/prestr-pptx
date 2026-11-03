package com.aspose.slides.internal.n8e;

import com.aspose.slides.IColorFormat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.Xml.f4;

public final class u5 {
   private final String n5;
   private final int l6;
   private final int k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "rgb",
      "fill",
      "fillback",
      "line",
      "lineback",
      "lineorfill",
      "fillthenline",
      "black",
      "silver",
      "gray",
      "white",
      "maroon",
      "red",
      "purple",
      "fuchsia",
      "green",
      "lime",
      "olive",
      "yellow",
      "navy",
      "blue",
      "teal",
      "aqua",
      "darken",
      "lighten",
      "add",
      "subtract",
      "reversesubtract",
      "blackwhite",
      "invert",
      "invert128",
      "pt",
      "",
      "px",
      "in",
      "cm",
      "mm",
      "em",
      "pc",
      "emu",
      "%"
   );

   public final int n5() {
      return this.u3 - this.l6;
   }

   public final void n5(int var1) {
      this.u3 = this.l6 + var1;
   }

   public u5(String var1) {
      this(var1, 0, var1 != null ? var1.length() : 0);
   }

   public u5(String var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var2 + var3;
      this.u3 = var2;
   }

   public final void n5(IColorFormat var1) {
      this.n5(var1, null, null, null, null);
   }

   public final void n5(IColorFormat var1, IColorFormat var2, IColorFormat var3, IColorFormat var4, IColorFormat var5) {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 < this.k5) {
         if (this.n5.charAt(this.u3) == '#') {
            var1.setColorType(0);
            this.u3++;
            int var6 = this.u3;

            while (
               this.u3 < this.k5
                  && (
                     this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9'
                        || this.n5.charAt(this.u3) >= 'a' && this.n5.charAt(this.u3) <= 'f'
                        || this.n5.charAt(this.u3) >= 'A' && this.n5.charAt(this.u3) <= 'F'
                  )
            ) {
               this.u3++;
            }

            if (this.u3 - var6 <= 3) {
               int var7 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.ms.System.d1.l6(this.n5, var6, this.u3 - var6), 16);
               int var8 = (var7 & 3840) >> 8;
               var1.setR((byte)(var8 * 16 + var8));
               var8 = (var7 & 240) >> 4;
               var1.setG((byte)(var8 * 16 + var8));
               var8 = var7 & 15;
               var1.setB((byte)(var8 * 16 + var8));
            } else if (this.u3 - var6 <= 6) {
               var1.setColor(
                  com.aspose.slides.internal.o9b.c8.l6(
                     com.aspose.slides.internal.o9b.c8.n5(
                        (int)(com.aspose.slides.ms.System.z3.k5(com.aspose.slides.ms.System.d1.l6(this.n5, var6, this.u3 - var6), 16) | 4278190080L)
                     )
                  )
               );
            } else {
               var1.setR((byte)0);
               var1.setG((byte)0);
               var1.setB((byte)0);
            }
         } else {
            String var9 = com.aspose.slides.ms.System.d1.a6(this.l6());
            String[] var10 = this.a6();
            switch (a6.n5(var9)) {
               case 0:
                  var1.setColorType(0);
                  var1.setR(var10.length >= 1 ? f4.z1(var10[0]) : 0);
                  var1.setG(var10.length >= 2 ? f4.z1(var10[1]) : 0);
                  var1.setB(var10.length >= 3 ? f4.z1(var10[2]) : 0);
                  break;
               case 1:
                  if (var2 != null && var2.getColorType() != -1) {
                     var1.copyFrom(var2);
                     break;
                  }

                  var1.setPresetColor(7);
                  break;
               case 2:
                  if (var3 != null && var3.getColorType() != -1) {
                     var1.copyFrom(var3);
                     break;
                  }

                  var1.setPresetColor(7);
                  break;
               case 3:
                  if (var4 != null && var4.getColorType() != -1) {
                     var1.copyFrom(var4);
                     break;
                  }

                  var1.setPresetColor(7);
                  break;
               case 4:
                  if (var5 != null && var5.getColorType() != -1) {
                     var1.copyFrom(var5);
                     break;
                  }

                  var1.setPresetColor(7);
                  break;
               case 5:
                  if (var4 != null && var4.getColorType() != -1) {
                     var1.copyFrom(var4);
                  } else {
                     if (var2 != null && var2.getColorType() != -1) {
                        var1.copyFrom(var2);
                        break;
                     }

                     var1.setPresetColor(7);
                  }
                  break;
               case 6:
                  if (var2 != null && var2.getColorType() != -1) {
                     var1.copyFrom(var2);
                  } else {
                     if (var4 != null && var4.getColorType() != -1) {
                        var1.copyFrom(var4);
                        break;
                     }

                     var1.setPresetColor(7);
                  }
                  break;
               case 7:
               default:
                  var1.setPresetColor(7);
                  break;
               case 8:
                  var1.setPresetColor(122);
                  break;
               case 9:
                  var1.setPresetColor(50);
                  break;
               case 10:
                  var1.setPresetColor(136);
                  break;
               case 11:
                  var1.setPresetColor(80);
                  break;
               case 12:
                  var1.setPresetColor(113);
                  break;
               case 13:
                  var1.setPresetColor(112);
                  break;
               case 14:
                  var1.setPresetColor(45);
                  break;
               case 15:
                  var1.setPresetColor(51);
                  break;
               case 16:
                  var1.setPresetColor(76);
                  break;
               case 17:
                  var1.setPresetColor(97);
                  break;
               case 18:
                  var1.setPresetColor(138);
                  break;
               case 19:
                  var1.setPresetColor(95);
                  break;
               case 20:
                  var1.setPresetColor(9);
                  break;
               case 21:
                  var1.setPresetColor(130);
                  break;
               case 22:
                  var1.setPresetColor(2);
            }

            this.l6(var1);
         }
      }
   }

   public final String l6() {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      int var1 = this.u3;

      while (
         this.u3 < this.k5
            && (
               this.n5.charAt(this.u3) >= 'A' && this.n5.charAt(this.u3) <= 'Z'
                  || this.n5.charAt(this.u3) >= 'a' && this.n5.charAt(this.u3) <= 'z'
                  || this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9'
                  || this.n5.charAt(this.u3) == '_'
            )
      ) {
         this.u3++;
      }

      return com.aspose.slides.ms.System.d1.l6(this.n5, var1, this.u3 - var1);
   }

   public final String k5() {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 >= this.k5) {
         return "";
      }

      if (this.n5.charAt(this.u3) != '\'' && this.n5.charAt(this.u3) != '"') {
         int var5 = this.u3;

         while (
            this.u3 < this.k5
               && (
                  this.n5.charAt(this.u3) >= 'A' && this.n5.charAt(this.u3) <= 'Z'
                     || this.n5.charAt(this.u3) >= 'a' && this.n5.charAt(this.u3) <= 'z'
                     || this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9'
                     || this.n5.charAt(this.u3) == '_'
                     || this.n5.charAt(this.u3) == '-'
               )
         ) {
            this.u3++;
         }

         return com.aspose.slides.ms.System.d1.l6(this.n5, var5, this.u3 - var5);
      } else {
         char var1 = this.n5.charAt(this.u3);
         this.u3++;
         int var2 = this.u3;

         for (boolean var3 = false; this.u3 < this.k5 && (this.n5.charAt(this.u3) != var1 || var3); this.u3++) {
            var3 = !var3 && this.n5.charAt(this.u3) == '\\';
         }

         String var4 = com.aspose.slides.ms.System.d1.l6(this.n5, var2, this.u3 - var2);
         if (this.n5.charAt(this.u3) == var1) {
            this.u3++;
         }

         return var4;
      }
   }

   public final float u3() {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      int var1 = this.u3;
      int var2 = 0;
      double var3 = 0.0;

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9') {
         var2 = var2 * 10 + this.n5.charAt(this.u3++) - 48;
      }

      if (this.u3 < this.k5) {
         if (var1 < this.u3 && (this.n5.charAt(this.u3) == 'f' || this.n5.charAt(this.u3) == 'F')) {
            this.u3++;
            return var2 / 65536.0F;
         }

         if (this.n5.charAt(this.u3) == '.') {
            this.u3++;

            for (double var5 = 0.1F; this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9'; var5 /= 10.0) {
               var3 += (this.n5.charAt(this.u3++) - '0') * var5;
            }
         }
      }

      if (var1 < this.u3 && this.u3 < this.k5 && this.n5.charAt(this.u3) == '%') {
         this.u3++;
         return (float)((var2 + var3) / 100.0);
      } else {
         return this.u3 == var1 ? Float.NaN : (float)(var2 + var3);
      }
   }

   private void l6(IColorFormat var1) {
      this.y4();
      if (this.u3 < this.k5) {
         String var2 = com.aspose.slides.ms.System.d1.a6(this.l6());
         String[] var3 = this.a6();
         if (var2.length() > 0) {
            this.n5(var1, var2, var3.length > 0 ? var3[0] : null);
         }
      }
   }

   public final String[] a6() {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 < this.k5 && this.n5.charAt(this.u3) == '(') {
         List var1 = new List();

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) != ')') {
            this.u3++;

            while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
               this.u3++;
            }

            int var2 = this.u3;

            while (this.u3 < this.k5 && this.n5.charAt(this.u3) != ',' && this.n5.charAt(this.u3) != ')') {
               this.u3++;
            }

            int var3 = this.u3;

            while (var2 < var3 && (this.n5.charAt(var3 - 1) < '0' || this.n5.charAt(var3) == ',' || this.n5.charAt(var3) == ')')) {
               var3--;
            }

            var1.addItem(com.aspose.slides.ms.System.d1.l6(this.n5, var2, var3 - var2 + 1));
         }

         return (String[])var1.toArray(new String[0]);
      } else {
         return null;
      }
   }

   private int[] y4() {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 < this.k5 && this.n5.charAt(this.u3) == '[') {
         List var1 = new List();

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) != ']') {
            this.u3++;

            while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
               this.u3++;
            }

            int var2 = this.u3;

            while (
               this.u3 < this.k5
                  && this.n5.charAt(this.u3) != ','
                  && this.n5.charAt(this.u3) >= '0'
                  && this.n5.charAt(this.u3) <= '9'
                  && this.n5.charAt(this.u3) != ']'
            ) {
               this.u3++;
            }

            int var3 = this.u3;
            var1.addItem(com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(this.n5, var2, var3 - var2)));
         }

         return v4.k5(var1);
      } else {
         return null;
      }
   }

   private void n5(IColorFormat var1, String var2, String var3) {
      com.aspose.slides.internal.o9b.c8 var4 = new com.aspose.slides.internal.o9b.c8();
      switch (a6.n5(var2)) {
         case 9:
            var1.getColorTransform().add(4);
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         default:
            break;
         case 23:
            float var9 = 0.6F;
            if (var3 != null) {
               var9 = v4.n5(f4.e2(var3) / 255.0F, 0.0F, 1.0F);
            }

            var1.getColorTransform().add(1, var9);
            break;
         case 24:
            float var8 = 0.6F;
            if (var3 != null) {
               var8 = v4.n5(f4.e2(var3) / 255.0F, 0.0F, 1.0F);
            }

            var1.getColorTransform().add(1, var8);
            break;
         case 25:
            float var7 = 0.6F;
            if (var3 != null) {
               var7 = v4.n5(f4.e2(var3) / 255.0F, 0.0F, 1.0F);
            }

            var1.getColorTransform().add(18, var7);
            var1.getColorTransform().add(21, var7);
            var1.getColorTransform().add(24, var7);
            break;
         case 26:
            float var5 = 0.6F;
            if (var3 != null) {
               var5 = v4.n5(f4.e2(var3) / 255.0F, 0.0F, 1.0F);
            }

            var1.getColorTransform().add(18, var5);
            var1.getColorTransform().add(21, var5);
            var1.getColorTransform().add(24, var5);
            break;
         case 27:
            int var10 = 255;
            if (var3 != null) {
               var10 = v4.n5(f4.e2(var3), 0, 255);
            }

            com.aspose.slides.internal.o9b.c8.n5(var1.getColor()).n5(var4);
            var1.setColor(
               com.aspose.slides.internal.o9b.c8.l6(
                  com.aspose.slides.internal.o9b.c8.n5(var10 - (var4.x8() & 255), var10 - (var4.n3() & 255), var10 - (var4.y4() & 255)).o8()
               )
            );
            break;
         case 28:
            int var6 = 128;
            if (var3 != null) {
               var6 = v4.n5(f4.e2(var3), 0, 255);
            }

            com.aspose.slides.internal.o9b.c8.n5(var1.getColor()).n5(var4);
            var1.setColor(
               com.aspose.slides.internal.o9b.c8.l6(
                  com.aspose.slides.internal.o9b.c8.n5(
                        (var4.x8() & 255) < var6 ? 0 : 255, (var4.n3() & 255) < var6 ? 0 : 255, (var4.y4() & 255) < var6 ? 0 : 255
                     )
                     .o8()
               )
            );
            break;
         case 29:
            var1.getColorTransform().add(3);
            break;
         case 30:
            com.aspose.slides.internal.o9b.c8.n5(var1.getColor()).n5(var4);
            var1.setColor(
               com.aspose.slides.internal.o9b.c8.l6(
                  com.aspose.slides.internal.o9b.c8.n5(
                        (var4.x8() & 255) < 128 ? (var4.x8() & 255) + 128 : (var4.x8() & 255) - 128,
                        (var4.n3() & 255) < 128 ? (var4.n3() & 255) + 128 : (var4.n3() & 255) - 128,
                        (var4.y4() & 255) < 128 ? (var4.y4() & 255) + 128 : (var4.y4() & 255) - 128
                     )
                     .o8()
               )
            );
      }
   }

   public final char u9() {
      return this.u3 < this.k5 ? this.n5.charAt(this.u3) : '\uffff';
   }

   public final int h0() {
      return this.k5 - this.u3;
   }

   public final char c8() {
      return this.u3 < this.k5 ? this.n5.charAt(this.u3++) : '\uffff';
   }

   public final void t2() {
      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }
   }

   public final char s7() {
      return this.u3 < this.k5 ? this.n5.charAt(this.u3) : '\uffff';
   }

   public final float x8() {
      float var1 = this.l6(Float.NaN);
      if (com.aspose.slides.ms.System.n1.k5(var1)) {
         throw new InvalidOperationException("Can't parse coordinate.");
      } else {
         return var1;
      }
   }

   public final float n5(float var1) {
      float var2 = 0.0F;
      byte var3 = 1;

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 >= this.k5) {
         return Float.NaN;
      }

      if (this.n5.charAt(this.u3) == '-') {
         this.u3++;
         var3 = -1;

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
            this.u3++;
         }
      } else if (this.n5.charAt(this.u3) == '+') {
         this.u3++;

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
            this.u3++;
         }
      }

      if (this.u3 >= this.k5) {
         return var1;
      }

      if ((this.n5.charAt(this.u3) < '0' || this.n5.charAt(this.u3) > '9') && this.n5.charAt(this.u3) != '.') {
         return var1;
      }

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9') {
         var2 = var2 * 10.0F + this.n5.charAt(this.u3++) - 48.0F;
      }

      if (this.u3 < this.k5 && this.n5.charAt(this.u3) == '.') {
         this.u3++;

         for (float var4 = 0.1F; this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9'; var4 /= 10.0F) {
            var2 += var4 * (this.n5.charAt(this.u3++) - '0');
         }
      }

      return var2 * var3;
   }

   public final float l6(float var1) {
      float var2 = this.n5(Float.NaN);
      if (com.aspose.slides.ms.System.n1.k5(var2)) {
         return var2;
      }

      String var3 = this.l6();
      switch (a6.n5(var3)) {
         case 31:
         case 32:
         default:
            return var2;
         case 33:
            return var2 * 72.0F / 96.0F;
         case 34:
            return var2 * 72.0F;
         case 35:
            return var2 * 72.0F / 2.54F;
         case 36:
            return var2 * 72.0F / 25.4F;
         case 37:
            return var2 * 72.0F / 90.0F;
         case 38:
            return var2 * 12.0F;
         case 39:
            return var2 / 12700.0F;
      }
   }

   public final float k5(float var1) {
      float var2 = this.n5(Float.NaN);
      if (com.aspose.slides.ms.System.n1.k5(var2)) {
         return var2;
      }

      String var3 = this.l6();
      switch (a6.n5(var3)) {
         case 31:
            return -var2;
         case 32:
         default:
            return var2;
         case 33:
            return -var2 * 72.0F / 96.0F;
         case 34:
            return -var2 * 72.0F;
         case 35:
            return -var2 * 72.0F / 2.54F;
         case 36:
            return -var2 * 72.0F / 25.4F;
         case 37:
            return -var2 * 72.0F / 90.0F;
         case 38:
            return -var2 * 12.0F;
         case 39:
            return -var2 / 12700.0F;
         case 40:
            return var2 / 100.0F;
      }
   }

   public final float n3() {
      float var1 = this.u3(Float.NaN);
      if (com.aspose.slides.ms.System.n1.k5(var1)) {
         throw new InvalidOperationException("Can't parse percentage.");
      } else {
         return var1;
      }
   }

   public final float u3(float var1) {
      float var2 = 0.0F;
      byte var3 = 1;

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 >= this.k5) {
         return Float.NaN;
      }

      if (this.n5.charAt(this.u3) == '-') {
         this.u3++;
         var3 = -1;

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
            this.u3++;
         }
      } else if (this.n5.charAt(this.u3) == '+') {
         this.u3++;

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
            this.u3++;
         }
      }

      if (this.u3 >= this.k5) {
         return var1;
      }

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9') {
         var2 = var2 * 10.0F + this.n5.charAt(this.u3++) - 48.0F;
      }

      if (this.u3 < this.k5 && this.n5.charAt(this.u3) == '.') {
         this.u3++;

         for (float var4 = 0.1F; this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9'; var4 /= 10.0F) {
            var2 += var4 * (this.n5.charAt(this.u3++) - '0');
         }
      }

      var2 *= var3;
      int var7 = this.k5;

      while (var7 > this.u3 && this.n5.charAt(var7 - 1) <= ' ') {
         var7--;
      }

      String var5 = this.u3 < this.k5 ? com.aspose.slides.ms.System.d1.l6(this.n5, this.u3, var7 - this.u3) : "";
      return !"%".equals(var5) ? var1 : var2;
   }

   public final int l6(int var1) {
      int var2 = 0;
      byte var3 = 1;

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
         this.u3++;
      }

      if (this.u3 >= this.k5) {
         return var1;
      }

      if (this.n5.charAt(this.u3) == '-') {
         this.u3++;
         var3 = -1;

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
            this.u3++;
         }
      } else if (this.n5.charAt(this.u3) == '+') {
         this.u3++;

         while (this.u3 < this.k5 && this.n5.charAt(this.u3) <= ' ') {
            this.u3++;
         }
      }

      if (this.u3 >= this.k5) {
         return var1;
      }

      while (this.u3 < this.k5 && this.n5.charAt(this.u3) >= '0' && this.n5.charAt(this.u3) <= '9') {
         var2 = var2 * 10 + this.n5.charAt(this.u3++) - 48;
      }

      return var2 * var3;
   }
}
