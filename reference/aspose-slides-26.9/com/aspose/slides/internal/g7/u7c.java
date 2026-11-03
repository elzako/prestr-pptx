package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;

public class u7c extends s7k {
   private float n5;
   private float l6;
   private short k5;
   private short u3;
   private long a6;
   private long u9;
   private long h0;
   private long c8;
   private long t2;
   private Dictionary<String, Integer> s7;
   private Dictionary<Integer, String> x8;
   private String[] n3 = new String[]{
      ".notdef",
      ".null",
      "nonmarkingreturn",
      "space",
      "exclam",
      "quotedbl",
      "numbersign",
      "dollar",
      "percent",
      "ampersand",
      "quotesingle",
      "parenleft",
      "parenright",
      "asterisk",
      "plus",
      "comma",
      "hyphen",
      "period",
      "slash",
      "zero",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "colon",
      "semicolon",
      "less",
      "equal",
      "greater",
      "question",
      "at",
      "A",
      "B",
      "C",
      "D",
      "E",
      "F",
      "G",
      "H",
      "I",
      "J",
      "K",
      "L",
      "M",
      "N",
      "O",
      "P",
      "Q",
      "R",
      "S",
      "T",
      "U",
      "V",
      "W",
      "X",
      "Y",
      "Z",
      "bracketleft",
      "backslash",
      "bracketright",
      "asciicircum",
      "underscore",
      "grave",
      "a",
      "b",
      "c",
      "d",
      "e",
      "f",
      "g",
      "h",
      "i",
      "j",
      "k",
      "l",
      "m",
      "n",
      "o",
      "p",
      "q",
      "r",
      "s",
      "t",
      "u",
      "v",
      "w",
      "x",
      "y",
      "z",
      "braceleft",
      "bar",
      "braceright",
      "asciitilde",
      "Adieresis",
      "Aring",
      "Ccedilla",
      "Eacute",
      "Ntilde",
      "Odieresis",
      "Udieresis",
      "aacute",
      "agrave",
      "acircumflex",
      "adieresis",
      "atilde",
      "aring",
      "ccedilla",
      "eacute",
      "egrave",
      "ecircumflex",
      "edieresis",
      "iacute",
      "igrave",
      "icircumflex",
      "idieresis",
      "ntilde",
      "oacute",
      "ograve",
      "ocircumflex",
      "odieresis",
      "otilde",
      "uacute",
      "ugrave",
      "ucircumflex",
      "udieresis",
      "dagger",
      "degree",
      "cent",
      "sterling",
      "section",
      "bullet",
      "paragraph",
      "germandbls",
      "registered",
      "copyright",
      "trademark",
      "acute",
      "dieresis",
      "notequal",
      "AE",
      "Oslash",
      "infinity",
      "plusminus",
      "lessequal",
      "greaterequal",
      "yen",
      "mu",
      "partialdiff",
      "summation",
      "product",
      "pi",
      "integral",
      "ordfeminine",
      "ordmasculine",
      "Omega",
      "ae",
      "oslash",
      "questiondown",
      "exclamdown",
      "logicalnot",
      "radical",
      "florin",
      "approxequal",
      "Delta",
      "guillemotleft",
      "guillemotright",
      "ellipsis",
      "nonbreakingspace",
      "Agrave",
      "Atilde",
      "Otilde",
      "OE",
      "oe",
      "endash",
      "emdash",
      "quotedblleft",
      "quotedblright",
      "quoteleft",
      "quoteright",
      "divide",
      "lozenge",
      "ydieresis",
      "Ydieresis",
      "fraction",
      "currency",
      "guilsinglleft",
      "guilsinglright",
      "fi",
      "fl",
      "daggerdbl",
      "periodcentered",
      "quotesinglbase",
      "quotedblbase",
      "perthousand",
      "Acircumflex",
      "Ecircumflex",
      "Aacute",
      "Edieresis",
      "Egrave",
      "Iacute",
      "Icircumflex",
      "Idieresis",
      "Igrave",
      "Oacute",
      "Ocircumflex",
      "apple",
      "Ograve",
      "Uacute",
      "Ucircumflex",
      "Ugrave",
      "dotlessi",
      "circumflex",
      "tilde",
      "macron",
      "breve",
      "dotaccent",
      "ring",
      "cedilla",
      "hungarumlaut",
      "ogonek",
      "caron",
      "Lslash",
      "lslash",
      "Scaron",
      "scaron",
      "Zcaron",
      "zcaron",
      "brokenbar",
      "Eth",
      "eth",
      "Yacute",
      "yacute",
      "Thorn",
      "thorn",
      "minus",
      "multiply",
      "onesuperior",
      "twosuperior",
      "threesuperior",
      "onehalf",
      "onequarter",
      "threequarters",
      "franc",
      "Gbreve",
      "gbreve",
      "Idotaccent",
      "Scedilla",
      "scedilla",
      "Cacute",
      "cacute",
      "Ccaron",
      "ccaron",
      "dcroat"
   };

   public u7c(d7u var1, u0a var2) {
      super(var1, var2);
      this.n5 = 3.0F;
      this.a6 = 0L;
   }

   public u7c(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
      this.s7 = new Dictionary<>();
      this.x8 = new Dictionary<>();
   }

   public final String n5(int var1) {
      this.s3();
      if (!this.x8.containsKey(var1) && (this.n5 == 1.0F || this.n5 == 3.0F) && var1 < this.n3.length) {
         return this.n3[var1];
      } else {
         return this.x8.containsKey(var1) ? this.x8.get_Item(var1) : ".notdef";
      }
   }

   public final int n5(String var1) {
      this.s3();
      return !this.s7.containsKey(var1) ? 0 : this.s7.get_Item(var1);
   }

   @Override
   public void n5(f3c var1) {
      super.n5(var1);
   }

   @Override
   public void l6(f3c var1) {
      super.l6(var1);
      var1.n5(this.d2() & 4294967295L);
      this.n5 = var1.u3();
      this.l6 = var1.u3();
      this.k5 = var1.t2();
      this.u3 = var1.t2();
      this.a6 = var1.y4();
      this.u9 = var1.y4();
      this.h0 = var1.y4();
      this.c8 = var1.y4();
      this.t2 = var1.y4();
      if (this.n5 != 1.0) {
         if (this.n5 == 2.0) {
            int var2 = var1.n3();
            if ((var2 & 65535) != (this.y2().a6().n5() & 65535)) {
               j1.n5("number of glyphs in post and maxp tables is not equal");
            }

            int[] var3 = new int[var2 & 65535];
            int var4 = 0;

            for (int var5 = 0; var5 < (var2 & 65535); var5++) {
               int var6 = var1.n3();
               if ((var6 & 65535) >= 32768) {
                  j1.n5(com.aspose.slides.ms.System.d1.n5("glyph index={0} has invalid post glyph name index = {1}",new Object[]{ var5, var6}));
                  var6 = 0;
               }

               var3[var5] = var6;
               if ((var6 & 65535) > (var4 & 65535)) {
                  var4 = var6;
               }
            }

            int var10 = (var4 & 65535) > 257 ? (var4 & 65535) - 257 : 0;
            String[] var11 = new String[var10];

            for (int var7 = 0; var7 < var10; var7++) {
               byte var8 = var1.k5();
               var11[var7] = var1.n5(var8 & 255, "us-ascii");
            }

            for (int var12 = 0; var12 < (var2 & 65535); var12++) {
               int var13 = var3[var12] & 65535;
               if (var13 < 257 + var10) {
                  if (var13 <= 257) {
                     this.x8.set_Item(var12, this.n3[var13]);
                  } else {
                     this.x8.set_Item(var12, var11[var13 - 257 - 1]);
                  }

                  this.s7.set_Item(this.x8.get_Item(var12), var12);
               }
            }
         } else if (this.n5 != 2.5 && this.n5 != 3.0F && this.n5 == 4.0F) {
            for (int var9 = 0; var9 < (this.y2().a6().n5() & 65535); var9++) {
               this.x8.set_Item(var9, com.aspose.slides.ms.System.d1.n5("a{0}", new Object[]{var1.n3()}));
               this.s7.set_Item(this.x8.get_Item(var9), var9);
            }
         }
      }
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               var5.n5(this.n5);
               var5.n5(this.l6);
               var5.n5(this.k5);
               var5.n5(this.u3);
               var5.k5(this.a6);
               var5.k5(this.u9);
               var5.k5(this.h0);
               var5.k5(this.c8);
               var5.k5(this.t2);
               if (this.n5 != 2.0F && this.n5 == 4.0F) {
               }

               this.n5(var5, var4, var1, var2, var3);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }
}
