package com.aspose.slides.internal.d2n;

import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.ms.System.v4;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.util.HashMap;

public final class l6 implements v4 {
   String n5;
   int l6;
   Font k5;
   Font u3;
   float a6;
   boolean u9;
   boolean h0;
   boolean c8 = false;
   boolean t2 = false;
   boolean s7 = false;

   static Float n5(int var0) {
      if (var0 < 400) {
         return var0 < 300 ? TextAttribute.WEIGHT_EXTRA_LIGHT : TextAttribute.WEIGHT_DEMILIGHT;
      }

      if (var0 < 700) {
         if (var0 < 500) {
            return TextAttribute.WEIGHT_REGULAR;
         } else {
            return var0 < 600 ? TextAttribute.WEIGHT_MEDIUM : TextAttribute.WEIGHT_DEMIBOLD;
         }
      } else if (var0 < 800) {
         return TextAttribute.WEIGHT_BOLD;
      } else {
         return var0 < 900 ? TextAttribute.WEIGHT_EXTRABOLD : TextAttribute.WEIGHT_ULTRABOLD;
      }
   }

   public l6(com.aspose.slides.internal.o6t.k5 var1, k5 var2) {
      this.n5(var1, var2.n5, var2);
   }

   public l6(com.aspose.slides.internal.o6t.k5 var1, u3 var2) {
      this.n5(var1, var2, null);
   }

   private void n5(com.aspose.slides.internal.o6t.k5 var1, u3 var2, k5 var3) {
      this.a6 = var2.k5 / 10.0F;
      float var4 = (var2.u3 - var2.k5) / 10.0F;
      switch (var2.n3) {
         case 3:
            this.c8 = true;
            break;
         case 4:
            this.t2 = true;
            break;
         case 5:
            this.s7 = true;
      }

      HashMap var5 = new HashMap();
      this.l6 = com.aspose.slides.internal.v6g.k5.u3(var2.t2, 6);
      this.n5 = var2.e2;
      if (this.n5 == null) {
         this.n5 = var1.n5(this.l6, var2.t9);
      }

      if (this.n5 != "") {
         var5.put(TextAttribute.FAMILY, this.n5);
      } else {
         String var6;
         switch (var2.y4 & 240) {
            case 0:
            default:
               var6 = "";
               break;
            case 16:
               var6 = "serif";
               break;
            case 32:
               var6 = "sansserif";
               break;
            case 48:
               var6 = "monospaced";
               break;
            case 64:
               var6 = "script";
               break;
            case 80:
               var6 = "decorative";
         }

         var5.put(TextAttribute.FAMILY, var6);
         this.n5 = var6;
      }

      int var14 = 0;
      Float var7 = null;
      if (var2.n5 > 0) {
         var7 = new Float(var2.n5 / 1.2F);
      } else if (var2.n5 < 0) {
         var7 = new Float(-var2.n5);
      }

      if (var7 != null) {
         var5.put(TextAttribute.SIZE, var7);
      }

      if (var2.a6 != 0) {
         var5.put(TextAttribute.WEIGHT, n5(var2.a6));
         if (var2.a6 >= 600) {
            var14 |= 1;
         }
      }

      if (var2.u9 != 0) {
         var5.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
         var14 |= 2;
      } else {
         var5.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      }

      var5.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
      this.u9 = var2.h0 != 0;
      if (this.u9) {
         var14 |= 4;
      }

      this.h0 = var2.c8 != 0;
      if (this.h0) {
         var14 |= 8;
      }

      y4 var8 = com.aspose.slides.internal.f3l.k5.l6(this.n5);
      n3 var9 = new n3(var8, 16.0F);
      var5.put(TextAttribute.FAMILY, var8.a6());
      this.k5 = var9.z1().deriveFont(var5);
      if (var2.l6 != 0 && var7 != null) {
         FontMetrics var10 = var1.z1().getFontMetrics(this.k5);
         int[] var11 = var10.getWidths();
         float var12 = 0.0F;

         for (int var13 = 0; var13 < var11.length; var13++) {
            var12 += var11[var13];
         }

         var12 /= var11.length;
         var5.put(TextAttribute.WIDTH, new Float(var2.l6 / var12));
         this.k5 = this.k5.deriveFont(var5);
      }

      if (Math.abs(var4) > 0.05) {
         this.u3 = this.k5.deriveFont(AffineTransform.getRotateInstance(var4));
      } else {
         this.u3 = this.k5;
      }
   }

   public l6(String var1, int var2, int var3) {
      this.a6 = 0.0F;
      Font var4 = n3.n5(var1, var3, var2).z1();
      this.k5 = this.u3 = var4;
      this.n5 = var1;
      this.l6 = 1;
   }

   public void n5(com.aspose.slides.internal.o6t.k5 var1, int var2) {
      Font var3 = var2 == 2 ? this.u3 : this.k5;
      Graphics2D var4 = var1.z1();
      var4.setFont(var3);
   }

   public String n5() {
      return this.n5;
   }

   public int l6() {
      return this.l6;
   }

   public Font k5() {
      return this.k5;
   }

   public Font u3() {
      return this.u3;
   }

   public float a6() {
      return this.a6;
   }

   public boolean u9() {
      return this.u9;
   }

   public boolean h0() {
      return this.h0;
   }

   public boolean c8() {
      return this.c8;
   }

   public boolean t2() {
      return this.t2;
   }

   public boolean s7() {
      return this.s7;
   }

   @Override
   public Object deepClone() {
      l6 var1 = new l6(this.n5, this.k5.getStyle(), this.k5.getSize());
      var1.l6 = this.l6;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      return var1;
   }
}
