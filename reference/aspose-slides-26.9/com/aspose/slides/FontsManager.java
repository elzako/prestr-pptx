package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class FontsManager implements IFontsManager {
   private final v6v n5;
   private final k6j l6;
   private IFontSubstRuleCollection k5;
   private boolean u3 = false;
   private final IPresentation a6;
   private final char[] u9 = new char[]{
      '\u0000',
      '\r',
      ' ',
      '!',
      '"',
      '#',
      '$',
      '%',
      '&',
      '\'',
      '(',
      ')',
      '*',
      '+',
      ',',
      '-',
      '.',
      '/',
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9',
      ':',
      ';',
      '<',
      '=',
      '>',
      '?',
      '@',
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Y',
      '[',
      ']',
      '^',
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '{',
      '|',
      '}',
      '~',
      ' ',
      '\u00ad',
      '‐',
      '⁄'
   };
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("regular", "italic", "bold", "bolditalic");

   FontsManager(k6j fontsManagerInternal, v6v fontsList, IPresentation owner) {
      this.a6 = owner;
      if (fontsList == null) {
         throw new ArgumentNullException("fontsList");
      }

      if (fontsManagerInternal == null) {
         throw new ArgumentNullException("fontsManagerInternal");
      }

      this.l6 = fontsManagerInternal;
      this.n5 = fontsList;
      this.n5.n5(this);
   }

   @Override
   public final IFontSubstRuleCollection getFontSubstRuleList() {
      if (this.k5 == null) {
         this.k5 = new FontSubstRuleCollection();
      }

      return this.k5;
   }

   @Override
   public final void setFontSubstRuleList(IFontSubstRuleCollection value) {
      this.k5 = value;
   }

   @Override
   public final IFontFallBackRulesCollection getFontFallBackRulesCollection() {
      return this.l6.l6();
   }

   @Override
   public final void setFontFallBackRulesCollection(IFontFallBackRulesCollection value) {
      this.l6.n5(value);
   }

   @Override
   public final IFontData[] getFonts() {
      List var1 = new List();
      IGenericEnumerator var2 = this.n5.u9().iterator();

      try {
         while (var2.hasNext()) {
            y5g var3 = (y5g)var2.next();
            if (!var3.h0() && !var1.containsItem(var3.l6()) && var3.c8()) {
               c4y var4 = this.l6().n5().n5(var3.l6().getFontName());
               if (var4 == null) {
                  var1.addItem(var3.l6());
               } else if (!var1.containsItem(var4)) {
                  var1.addItem(var4);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var13 = s3p.l6().u9().iterator();

      try {
         while (var13.hasNext()) {
            y5g var14 = (y5g)var13.next();
            if (!var14.h0() && !var1.containsItem(var14.l6()) && var14.c8()) {
               var1.addItem(var14.l6());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      return (IFontData[])var1.toArray(new IFontData[0]);
   }

   @Override
   public final IGenericEnumerable<FontSubstitutionInfo> getSubstitutions() {
      int[] var1 = new int[this.a6.getSlides().size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var2 + 1;
      }

      m6q var7 = new m6q((Presentation)this.a6);

      IGenericList var3;
      try {
         var3 = com.aspose.slides.ms.System.u3.n5(var7.l6(var1));
      } finally {
         var7.dispose();
      }

      return var3;
   }

   @Override
   public final IGenericEnumerable<FontSubstitutionInfo> getSubstitutions(int[] slides) {
      m6q var2 = new m6q((Presentation)this.a6);

      IGenericList var3;
      try {
         var3 = com.aspose.slides.ms.System.u3.n5(var2.l6(slides));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var3;
   }

   @Override
   public final IFontData[] getEmbeddedFonts() {
      if (!this.l6.a6()) {
         return new IFontData[0];
      }

      e6s var1 = this.l6.n5();
      List var2 = new List(var1.n5());
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            var2.addItem(var4.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (IFontData[])var2.toArray(new IFontData[0]);
   }

   @Override
   public final void removeEmbeddedFont(IFontData fontData) {
      if (fontData == null) {
         throw new ArgumentNullException("fontData");
      }

      c4y var2 = com.aspose.slides.internal.v6g.k5.n5(fontData, c4y.class);
      if (var2 == null) {
         throw new ArgumentException("fontData is not correct embedded font value", "fontData");
      }

      this.l6.n5().n5(var2);
      this.l6.h0();
      this.a6();
   }

   @Override
   public final void addEmbeddedFont(IFontData fontData, int embedFontRule) {
      if (com.aspose.slides.internal.v6g.k5.l6(fontData, c4y.class)) {
         if (!this.l6.a6() || this.l6.n5().n5(fontData.getFontName()) == null) {
            c4y var20 = com.aspose.slides.internal.v6g.k5.n5(fontData, c4y.class);
            IGenericEnumerator var21 = var20.h0().iterator();

            try {
               while (var21.hasNext()) {
                  KeyValuePair var22 = (KeyValuePair)var21.next();
                  this.l6
                     .n5(
                        (byte[])var22.getValue(),
                        var20.c8().get_Item((Integer)var22.getKey()),
                        var20.getFontName(),
                        var20.l6(),
                        var20.a6(),
                        (byte)var20.u9(),
                        (Integer)var22.getKey(),
                        embedFontRule == 0
                     );
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                  var21.dispose();
               }
            }
         }
      } else {
         FontData var3 = com.aspose.slides.internal.v6g.k5.n5(fontData, FontData.class);
         if (var3 == null) {
            throw new ArgumentException("Unsupported font data type", "fontData");
         }

         com.aspose.slides.internal.e1x.i1 var4 = null;
         IEnumerator var5 = com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.e2.class)).iterator();

         try {
            while (var5.hasNext()) {
               Object var6 = var5.next();
               int var7 = ((Long)var6).intValue();
               var3 = new FontData(var3, var7);
               synchronized (com.aspose.slides.internal.e1x.x8.u3()) {
                  var4 = com.aspose.slides.internal.e1x.x8.u3().n5(var3.getFontName(), var7);
               }

               if (var4 != null && var4.c8() == var7) {
                  this.n5(com.aspose.slides.internal.z0k.u9.h0(var4.u9()), var3, embedFontRule);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               ((IDisposable)var5).dispose();
            }
         }

         if (var4 == null) {
            throw new InvalidOperationException("Font not found");
         }
      }
   }

   @Override
   public final void addEmbeddedFont(byte[] fontData, int embedFontRule) {
      if (fontData == null) {
         throw new ArgumentNullException("fontData");
      }

      switch (embedFontRule) {
         case 0:
            this.n5(fontData, true);
            break;
         case 1:
            this.n5(fontData, false);
            break;
         default:
            throw new ArgumentOutOfRangeException("embedFontRule", com.aspose.slides.ms.System.s3.n5(EmbedFontCharacters.class, embedFontRule), null);
      }
   }

   final void n5(boolean var1) {
      this.u3 = var1;
      if (var1) {
         this.k5();
      } else {
         this.u3();
      }
   }

   private void k5() {
      if (this.k5 != null && this.k5.size() != 0) {
         IGenericEnumerator var1 = this.k5.iterator();

         try {
            while (var1.hasNext()) {
               IFontSubstRule var2 = (IFontSubstRule)var1.next();
               this.n5.n5(var2.getSourceFont(), var2.getDestFont(), var2.getReplaceFontCondition());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         this.a6();
      }
   }

   private void u3() {
      this.n5.l6();
   }

   @Override
   public final void replaceFont(IFontData sourceFont, IFontData destFont) {
      if (this.k5 == null) {
         this.k5 = new FontSubstRuleCollection();
      }

      this.k5.add(new FontSubstRule(sourceFont, destFont));
      this.n5.n5(sourceFont, destFont);
      this.a6();
   }

   @Override
   public final void replaceFont(IFontSubstRule substRule) {
      if (this.k5 == null) {
         this.k5 = new FontSubstRuleCollection();
      }

      this.k5.add(substRule);
      e4z var2 = this.n5((FontData)substRule.getSourceFont());
      if (substRule.getReplaceFontCondition() == 1 || !var2.u3()) {
         this.n5.n5(substRule.getSourceFont(), substRule.getDestFont());
         this.a6();
      }
   }

   @Override
   public final void replaceFont(IFontSubstRuleCollection substRules) {
      if (this.k5 == null) {
         this.k5 = new FontSubstRuleCollection();
      }

      IGenericEnumerator var2 = substRules.iterator();

      try {
         while (var2.hasNext()) {
            IFontSubstRule var3 = (IFontSubstRule)var2.next();
            this.k5.add(var3);
            e4z var4 = this.n5((FontData)var3.getSourceFont());
            if (var3.getReplaceFontCondition() == 1 || !var4.u3()) {
               this.n5.n5(var3.getSourceFont(), var3.getDestFont());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.a6();
   }

   private void a6() {
      for (ITextFrame var4 : SlideUtil.getAllTextFrames(this.a6, true)) {
         TextFrame var5 = (TextFrame)var4;
         IGenericEnumerator var6 = var5.getParagraphs().iterator();

         try {
            while (var6.hasNext()) {
               Paragraph var7 = (Paragraph)var6.next();
               var7.e2();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var5.u3.a6();
      }

      ((MasterTheme)this.a6.getMasterTheme()).k5();
   }

   final e4z n5(FontData var1) {
      return this.l6.n5(var1.getFontName(), var1.n5(), var1.l6() & 255, Presentation.u9.u3().getFontHeight(), 0, false);
   }

   final void n5(FontsManager var1) {
      if (var1 == null) {
         throw new ArgumentNullException("fontsManager");
      }

      if (var1.l6().a6()) {
         this.l6.n5().n5(var1.l6().n5());
      }
   }

   private void n5(byte[] var1, FontData var2, int var3) {
      switch (var3) {
         case 0:
            this.n5(var1, var2, true);
            break;
         case 1:
            this.n5(var1, var2, false);
            break;
         default:
            throw new ArgumentOutOfRangeException("embedFontRule", com.aspose.slides.ms.System.s3.n5(EmbedFontCharacters.class, var3), null);
      }
   }

   final byte[] n5(byte[] var1, int[] var2) {
      com.aspose.slides.internal.g7.u0a var3 = n5(var1);
      return var3.u9(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.n5(this.u9), SlideUtil.n5(this.a6, var2)}));
   }

   final IGenericDictionary<Integer, byte[]> n5(c4y var1, int[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("embeddedFont");
      }

      if (!var1.t2()) {
         throw new ArgumentException("embeddedFont");
      }

      IGenericDictionary var3 = var1.h0();
      Dictionary var4 = new Dictionary(var3.size());
      IGenericEnumerator var5 = var3.iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            var4.addItem(var6.getKey(), this.n5((byte[])var6.getValue(), var2));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4;
   }

   final c4y n5(byte[] var1, boolean var2) {
      FontData var3 = null;
      FontData[] var4 = new FontData[]{var3};
      byte[] var5 = n5(var1, var4);
      var3 = var4[0];
      return this.l6.n5(var1, var5, var3.getFontName(), var3.n5(), var3.k5(), var3.l6(), var3.u3(), var2);
   }

   private void n5(byte[] var1, FontData var2, boolean var3) {
      FontData var4 = null;
      FontData[] var5 = new FontData[]{var4};
      byte[] var6 = n5(var1, var5);
      var4 = var5[0];
      byte[] var7 = var1;
      if ("ttcf".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var1, 0, 4)) && var3) {
         var7 = l6(var6);
      }

      byte[] var8 = var2.k5();
      if (var8 == null) {
         var8 = var4.k5();
      }

      this.l6.n5(var7, var6, var2.getFontName(), var2.n5(), var8, var2.l6(), var2.u3(), var3);
   }

   static byte[] n5(byte[] var0, FontData[] var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.internal.g6.u3 var4 = null;
            com.aspose.slides.internal.g6.u3[] var5 = new com.aspose.slides.internal.g6.u3[]{var4};
            com.aspose.slides.internal.x6.u3.n5(var2, var3, true, var5);
            var4 = var5[0];
            String var6 = com.aspose.slides.internal.l7h.j5.z1().l6(var4.q0);
            var1[0] = new FontData(com.aspose.slides.internal.l7h.j5.z1().l6(var4.t9), var4.u9, (byte)0, n5(var6), var4.a6);
            return var3.toArray();
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final v6v n5() {
      return this.n5;
   }

   final k6j l6() {
      return this.l6;
   }

   static com.aspose.slides.internal.g7.u0a n5(byte[] var0) {
      com.aspose.slides.internal.g7.r5t var1 = new com.aspose.slides.internal.g7.r5t();
      return (com.aspose.slides.internal.g7.u0a)var1.n5(new com.aspose.slides.internal.g7.n2(0, new com.aspose.slides.internal.g7.m3(var0)));
   }

   static com.aspose.slides.internal.e1x.i1 n5(byte[] var0, String var1) {
      byte[] var2 = var0;
      if (com.aspose.slides.internal.g7.h9.n5(var0)) {
         var2 = l6(var0);
      }

      com.aspose.slides.internal.e1x.b3 var3 = new com.aspose.slides.internal.e1x.b3();
      return var3.n5(new com.aspose.slides.internal.e1x.a0(var2), var1);
   }

   static byte[] l6(byte[] var0) {
      com.aspose.slides.internal.g7.r5 var1 = new com.aspose.slides.internal.g7.r5(new com.aspose.slides.internal.z0k.e2(var0));
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.n5(var2);
         return n5(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private static byte[] n5(com.aspose.slides.internal.z0k.e2 var0) {
      try {
         com.aspose.slides.internal.g7.u0a var1 = n5(var0.toArray());
         com.aspose.slides.internal.g7.u6p var2 = var1.l6().z3().l6().n5("smcp");
         if (var2 == null) {
            return var0.toArray();
         }

         com.aspose.slides.internal.g7.v7u var3 = var1.l6().c8();
         com.aspose.slides.internal.g7.d4n var4 = (com.aspose.slides.internal.g7.d4n)var3.n5();
         com.aspose.slides.internal.g7.l1b var5 = var1.l6().z3().k5().n5(var2.k5()[0] & 65535);
         com.aspose.slides.internal.g7.o6t var6 = (com.aspose.slides.internal.g7.o6t)var5.u3().get_Item(0);
         com.aspose.slides.internal.g7.d2n var7 = var1.l6().h0();
         List var8 = var4.l6();
         List$Enumerator var9 = var8.iterator();

         try {
            while (var9.hasNext()) {
               long var10 = com.aspose.slides.internal.v6g.k5.u3(var9.next(), long.class);
               if (com.aspose.slides.ms.System.t9.c8((char)var10)) {
                  char var12 = com.aspose.slides.ms.System.t9.z3((char)var10);
                  int var13 = var4.n5((int)var10);
                  if (var13 != 0 && !var8.containsItem(var12 & 4294967295L)) {
                     int var14 = var6.l6().k5(new com.aspose.slides.internal.g7.k2(var13));
                     if (var14 >= 0) {
                        com.aspose.slides.internal.g7.q1 var15 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(var13), com.aspose.slides.internal.g7.q1.class);
                        if (var15 != null) {
                           com.aspose.slides.internal.g7.k6 var16 = var15.l6().n5(0).n5();
                           com.aspose.slides.internal.g7.r9 var17 = var7.k5(var16);
                           int var18 = var1.s7().n5(var17);
                           char var19 = com.aspose.slides.ms.System.t9.z3((char)var18);
                           int var20 = var4.n5(var19);
                           com.aspose.slides.internal.g7.q1 var21 = new com.aspose.slides.internal.g7.q1();
                           com.aspose.slides.internal.g7.k6 var22 = var7.n5(var20);
                           var21.l6().n5(new com.aspose.slides.internal.g7.u5(var22, new com.aspose.slides.internal.g7.v2()));
                           double var23 = var22.t2() - var15.l6().n5(0).n5().t2();
                           double var25 = 319.0;
                           var21.l6()
                              .n5(
                                 new com.aspose.slides.internal.g7.u5(
                                    var15.l6().n5(1).n5(), new com.aspose.slides.internal.g7.v2(new double[]{1.0, 0.0, 0.0, 1.0, var23, var25})
                                 )
                              );
                           int var27 = var1.l6(var21);
                           var1.s7().n5(var27, var12);
                           var1.l6().c8().n5(true);
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var29 = new com.aspose.slides.internal.z0k.e2();

         try {
            var1.n5(var29);
            return var29.toArray();
         } finally {
            if (var29 != null) {
               var29.dispose();
            }
         }
      } catch (RuntimeException var40) {
         return var0.toArray();
      }
   }

   @Override
   public final byte[] getFontBytes(IFontData fontData, int fontStyle) {
      c4y var3 = com.aspose.slides.internal.v6g.k5.n5(fontData, c4y.class);
      if (var3 != null) {
         return !var3.c8().containsKey(fontStyle) ? null : var3.c8().get_Item(fontStyle);
      }

      com.aspose.slides.internal.e1x.i1 var4 = null;
      synchronized (com.aspose.slides.internal.e1x.x8.u3()) {
         var4 = com.aspose.slides.internal.e1x.x8.u3().n5(fontData.getFontName(), fontStyle);
         if (var4 == null) {
            return null;
         }

         com.aspose.slides.internal.z0k.t4 var6 = var4.y1().l6();

         byte[] var7;
         try {
            var7 = com.aspose.slides.internal.n2d.t4.l6(var6);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         return var7;
      }
   }

   @Override
   public final int getFontEmbeddingLevel(byte[] fontBytes, String fontName) {
      if (fontBytes == null) {
         throw new ArgumentNullException("Font data cannot be null.");
      }

      if (com.aspose.slides.internal.g7.h9.n5(fontBytes)) {
         fontBytes = com.aspose.slides.internal.c4y.n5.n5(fontBytes);
      }

      com.aspose.slides.internal.e1x.b3 var3 = new com.aspose.slides.internal.e1x.b3();
      com.aspose.slides.internal.e1x.i1 var4 = var3.n5(fontBytes, fontName);
      return var4.i1() & 65535;
   }

   static int n5(String var0) {
      switch (h0.n5(com.aspose.slides.ms.System.d1.u9(var0))) {
         case 0:
            return 0;
         case 1:
            return 2;
         case 2:
            return 1;
         case 3:
            return 3;
         default:
            return 0;
      }
   }
}
