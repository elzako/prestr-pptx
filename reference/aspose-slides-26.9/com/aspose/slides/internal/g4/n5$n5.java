package com.aspose.slides.internal.g4;

import com.aspose.slides.ms.System.d1;

class n5$n5 implements k5 {
   private static final a6 n5 = new a6();
   private static final char[] l6 = new char[]{
      'Ç',
      'ü',
      'é',
      'â',
      'ä',
      'à',
      'å',
      'ç',
      'ê',
      'ë',
      'è',
      'ï',
      'î',
      'ì',
      'Ä',
      'Å',
      'É',
      'æ',
      'Æ',
      'ô',
      'ö',
      'ò',
      'û',
      'ù',
      'ÿ',
      'Ö',
      'Ü',
      '¢',
      '£',
      '¥',
      '₧',
      'ƒ',
      'á',
      'í',
      'ó',
      'ú',
      'ñ',
      'Ñ',
      'ª',
      'º',
      '¿',
      '⌐',
      '¬',
      '½',
      '¼',
      '¡',
      '«',
      '»',
      '░',
      '▒',
      '▓',
      '│',
      '┤',
      '╡',
      '╢',
      '╖',
      '╕',
      '╣',
      '║',
      '╗',
      '╝',
      '╜',
      '╛',
      '┐',
      '└',
      '┴',
      '┬',
      '├',
      '─',
      '┼',
      '╞',
      '╟',
      '╚',
      '╔',
      '╩',
      '╦',
      '╠',
      '═',
      '╬',
      '╧',
      '╨',
      '╤',
      '╥',
      '╙',
      '╘',
      '╒',
      '╓',
      '╫',
      '╪',
      '┘',
      '┌',
      '█',
      '▄',
      '▌',
      '▐',
      '▀',
      'α',
      'ß',
      'Γ',
      'π',
      'Σ',
      'σ',
      'µ',
      'τ',
      'Φ',
      'Θ',
      'Ω',
      'δ',
      '∞',
      'φ',
      'ε',
      '∩',
      '≡',
      '±',
      '≥',
      '≤',
      '⌠',
      '⌡',
      '÷',
      '≈',
      '°',
      '∙',
      '·',
      '√',
      'ⁿ',
      '²',
      '■',
      ' '
   };

   private n5$n5() {
   }

   @Override
   public String n5(byte[] var1, String var2) {
      int var3 = var1.length;
      char[] var4 = new char[var3];
      int var5 = 0;

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var1[var6] & 255 & 0xFF;
         if (var7 >= 32) {
            if (var7 < 128) {
               var4[var5++] = (char)var7;
            } else {
               char var8 = l6[var7 - 128];
               var4[var5++] = var8;
            }
         }
      }

      return d1.n5(var4, 0, var5);
   }

   static {
      for (int var0 = 0; var0 < l6.length; var0++) {
         n5.n5(l6[var0], var0 + 128);
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/g4/n5$1;)V -> ()V
   n5$n5(com.aspose.slides.internal.g4.n5$1 recoveredArg0) {
      this();
   }
}
