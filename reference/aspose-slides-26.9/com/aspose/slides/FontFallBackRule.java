package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public class FontFallBackRule implements IFontFallBackRule {
   private long n5;
   private long l6 = 0L;
   private long k5 = 0L;
   private List<y1i> u3 = null;
   private List<FontFallBackRulesCollection> a6 = new List<>();

   FontFallBackRule(long startIndex, long endIndex) {
      this.l6 = startIndex;
      this.k5 = endIndex;
      this.a6();
      this.u3 = new List<>();
      this.n5(0L);
   }

   public FontFallBackRule(long startIndex, long endIndex, String fontNames) {
      this(startIndex, endIndex);
      this.addFallBackFonts(fontNames);
   }

   public FontFallBackRule(long startIndex, long endIndex, String[] fontNames) {
      this(startIndex, endIndex);
      this.addFallBackFonts(fontNames);
   }

   @Override
   public final void addFallBackFonts(String fontName) {
      if (com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(fontName))) {
         throw new ArgumentException("Empty name of the font can't be added to list!");
      }

      String[] var2 = com.aspose.slides.ms.System.d1.u9(fontName, ',');

      for (String var6 : var2) {
         y1i var7 = new y1i(com.aspose.slides.ms.System.d1.l6(var6));
         this.u3.addItem(var7);
         this.u9();
      }
   }

   @Override
   public final void addFallBackFonts(String[] fontNames) {
      if (fontNames == null) {
         throw new ArgumentNullException("fontNames", "Any fonts weren't defined for fall back range!");
      }

      for (String var5 : fontNames) {
         this.addFallBackFonts(var5);
      }
   }

   @Override
   public final long getRangeStartIndex() {
      return this.l6;
   }

   public final void setRangeStartIndex(long value) {
      if ((this.l6 & 4294967295L) != (value & 4294967295L)) {
         this.l6 = value;
         this.a6();
         this.u9();
      }
   }

   @Override
   public final long getRangeEndIndex() {
      return this.k5;
   }

   public final void setRangeEndIndex(long value) {
      if ((this.k5 & 4294967295L) != (value & 4294967295L)) {
         this.k5 = value;
         this.a6();
         this.u9();
      }
   }

   @Override
   public final int getCount() {
      return this.u3.size();
   }

   @Override
   public final String get_Item(int index) {
      return this.u3.get_Item(index).n5();
   }

   @Override
   public final void clear() {
      if (this.u3.size() != 0) {
         this.u3.clear();
         this.u9();
      }
   }

   @Override
   public final void remove(String fontName) {
      int var2 = this.indexOf(fontName);
      if (var2 >= 0) {
         this.u3.removeAt(var2);
         this.u9();
      }
   }

   @Override
   public final void removeAt(int index) {
      if (index >= 0 && index < this.u3.size()) {
         this.u3.removeAt(index);
         this.u9();
      } else {
         throw new ArgumentOutOfRangeException("index", "The target index is out of range!");
      }
   }

   @Override
   public final String[] toArray() {
      int var1 = this.u3.size();
      String[] var2 = new String[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.u3.get_Item(var3).n5();
      }

      return var2;
   }

   @Override
   public final String[] toArray(int startIndex, int count) {
      int var3 = this.u3.size();
      if (startIndex < 0 || startIndex >= var3) {
         throw new ArgumentOutOfRangeException("startIndex", "The startIndex index is out of range!");
      }

      if (count < 1) {
         throw new ArgumentOutOfRangeException("count", "The defined length of the out array must be greater then zero!");
      }

      if (startIndex + count > var3) {
         throw new ArgumentException("The demanded part of fonts is out of range!");
      }

      String[] var4 = new String[count];

      for (int var5 = 0; var5 < count; var5++) {
         var4[var5] = this.u3.get_Item(startIndex + var5).n5();
      }

      return var4;
   }

   @Override
   public final int indexOf(String fontName) {
      if (com.aspose.slides.ms.System.d1.n5(fontName)) {
         throw new ArgumentException("Font's name doesn't specified!");
      }

      String var2 = com.aspose.slides.ms.System.d1.l6(fontName);

      for (int var3 = 0; var3 < this.u3.size(); var3++) {
         if (com.aspose.slides.ms.System.d1.a6(this.u3.get_Item(var3).n5(), var2)) {
            return var3;
         }
      }

      return -1;
   }

   FontFallBackRule(long startIndex, long endIndex, FontFallBackRule sourceFallBackRule) {
      this(startIndex, endIndex);
      if (sourceFallBackRule.u3.size() > 0) {
         this.u3.addRange(sourceFallBackRule.u3);
      }
   }

   final void n5(y1i var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceFallBackFontContext", "Font's context doesn't specified!");
      }

      label61:
      if (var2) {
         List$Enumerator var3 = this.u3.iterator();

         y1i var4;
         try {
            do {
               if (!var3.hasNext()) {
                  break label61;
               }

               var4 = (y1i)var3.next();
            } while (var1 != var4);
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return;
      }

      this.u3.addItem(var1);
   }

   final void n5(FontFallBackRule var1, boolean var2) {
      if (var1 != null) {
         List$Enumerator var3 = var1.u3.iterator();

         try {
            while (var3.hasNext()) {
               y1i var4 = (y1i)var3.next();
               this.n5(var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   private void a6() {
      if ((this.l6 & 4294967295L) > (this.k5 & 4294967295L)) {
         throw new ArgumentException("End index must be equal or greater than start index!");
      }
   }

   final List<y1i> n5() {
      return this.u3;
   }

   final long l6() {
      return this.n5;
   }

   final void n5(long var1) {
      this.n5 = var1;
   }

   private void u9() {
      List$Enumerator var1 = this.a6.iterator();

      try {
         while (var1.hasNext()) {
            FontFallBackRulesCollection var2 = (FontFallBackRulesCollection)var1.next();
            var2.n5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final void n5(FontFallBackRulesCollection var1) {
      if (var1 != null) {
         if (!this.a6.containsItem(var1)) {
            this.a6.addItem(var1);
         }
      }
   }

   final void l6(FontFallBackRulesCollection var1) {
      if (var1 != null) {
         if (this.a6.containsItem(var1)) {
            this.a6.removeItem(var1);
         }
      }
   }

   final void k5() {
      this.a6.clear();
      this.a6 = null;
      this.u3.clear();
      this.u3 = null;
   }

   final void u3() {
      List$Enumerator var1 = this.u3.iterator();

      try {
         while (var1.hasNext()) {
            y1i var2 = (y1i)var1.next();
            var2.n5(false);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }
}
