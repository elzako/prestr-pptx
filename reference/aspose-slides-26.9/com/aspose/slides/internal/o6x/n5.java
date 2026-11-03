package com.aspose.slides.internal.o6x;

import com.aspose.slides.internal.o9b.n3;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.TextAttribute;
import java.awt.font.TextMeasurer;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.HashMap;
import java.util.Map;

public class n5 {
   private final String n5;
   private final n3 l6;
   private final n3 k5;
   private final FontRenderContext u3;

   public n5(String var1, n3 var2, n3 var3, FontRenderContext var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public TextMeasurer n5() {
      AttributedCharacterIterator var1 = this.n5(false).getIterator();
      return new TextMeasurer(var1, this.u3);
   }

   public TextMeasurer l6() {
      AttributedCharacterIterator var1 = this.n5(true).getIterator();
      return new TextMeasurer(var1, new FontRenderContext(this.u3.getTransform(), true, true));
   }

   private AttributedString n5(boolean var1) {
      AttributedString var2 = new AttributedString(this.n5);
      if (this.n5.length() == 0) {
         return var2;
      }

      Font var3 = n3.n5(this.l6);
      if (var1) {
         Map var4 = var3.getAttributes();
         var4.put(TextAttribute.TRACKING, 0.0F);
         var3 = var3.deriveFont(var4);
      }

      if (this.k5 == null) {
         var2.addAttributes(this.n5(var3), 0, this.n5.length());
      } else {
         byte var9 = 0;
         byte var5 = 0;
         boolean var6 = false;
         Font var7 = n3.n5(this.k5);
         int var8 = 0;

         while (var9 < this.n5.length()) {
            var5 = var9;
            var9 = (byte)(var6 ? this.l6(this.n5, var9, var7) : this.n5(this.n5, var9, var7));
            if (var8 > 2) {
               throw new IllegalStateException();
            }

            var6 = !var6;
            if (var9 == var5) {
               var8++;
            } else {
               var8 = 0;
               var2.addAttributes(this.n5(var6 ? var7 : var3), var5, var9);
            }
         }
      }

      return var2;
   }

   private Map<TextAttribute, Object> n5(Font var1) {
      HashMap var2 = new HashMap();
      var2.put(TextAttribute.FONT, var1);
      if ((this.l6.x8() & 4) != 0) {
         var2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      }

      if ((this.l6.x8() & 8) != 0) {
         var2.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
      }

      if ((this.l6.x8() & 2) != 0) {
         var2.put(TextAttribute.POSTURE, this.l6.z1().getItalicAngle());
      } else {
         var2.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      }

      if ((this.l6.x8() & 1) != 0) {
         var2.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
      }

      var2.put(TextAttribute.CHAR_REPLACEMENT, null);
      var2.put(TextAttribute.FAMILY, var1.getFamily());
      var2.put(TextAttribute.JUSTIFICATION, TextAttribute.JUSTIFICATION_FULL);
      var2.put(TextAttribute.SIZE, var1.getSize2D());
      var2.put(TextAttribute.WIDTH, TextAttribute.WIDTH_REGULAR);
      var2.put(TextAttribute.RUN_DIRECTION, TextAttribute.RUN_DIRECTION_LTR);
      var2.put(TextAttribute.LIGATURES, TextAttribute.LIGATURES_ON);
      var2.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
      return var2;
   }

   private int n5(String var1, int var2, Font var3) {
      int var4 = var1.length();

      for (int var5 = var2; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         if (!var3.canDisplay(var6)) {
            if (!Character.isHighSurrogate(var6)) {
               return var5;
            }

            if (!var3.canDisplay(var1.codePointAt(var5))) {
               return var5;
            }

            var5++;
         }
      }

      return var4;
   }

   private int l6(String var1, int var2, Font var3) {
      int var4 = var1.length();

      for (int var5 = var2; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         if (var3.canDisplay(var6)) {
            return var5;
         }
      }

      return var4;
   }
}
