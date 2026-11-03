package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class c4y implements IFontData {
   private final byte n5;
   private final byte[] l6;
   private final int k5;
   private final IFontData u3;
   private final IGenericDictionary<Integer, byte[]> a6 = new Dictionary<>();
   private final IGenericDictionary<Integer, byte[]> u9 = new Dictionary<>();
   private final IGenericDictionary<Integer, String> h0 = new Dictionary<>();
   private final boolean c8;

   public c4y(String var1, byte var2, byte[] var3, int var4, int var5, boolean var6) {
      this.u3 = new FontData(var1, var2, (byte)var4, var5, var3);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.c8 = var6;
   }

   public final FontData n5() {
      return (FontData)this.u3;
   }

   public final byte l6() {
      return this.n5;
   }

   public final int k5() {
      int var1 = this.k5 >> 4;
      if (var1 > 5) {
         var1 = 0;
      }

      return var1;
   }

   public final int u3() {
      int var1 = this.k5 & 15;
      if (var1 > 2) {
         var1 = var1 == 8 ? 1 : 0;
      }

      return var1;
   }

   @Override
   public final String getFontName() {
      return this.u3.getFontName();
   }

   @Override
   public final String getFontName(IThemeEffectiveData theme) {
      return this.u3.getFontName(theme);
   }

   public final void n5(int var1, byte[] var2, byte[] var3) {
      if (var2 == null) {
         throw new ArgumentNullException("trueTypeData");
      }

      if (var3 == null) {
         throw new ArgumentNullException("eotData");
      }

      if (!this.a6.containsKey(var1)) {
         this.a6.addItem(var1, var2);
         this.u9.addItem(var1, var3);
         this.h0.addItem(var1, this.n5(var2));
      }
   }

   private String n5(byte[] var1) {
      com.aspose.slides.internal.o8m.h6 var2 = new com.aspose.slides.internal.o8m.h6();

      String var3;
      try {
         var3 = com.aspose.slides.ms.System.z3.n5(var2.l6(var1));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var3;
   }

   public final byte[] a6() {
      return this.l6;
   }

   public final int u9() {
      return this.k5;
   }

   public final IGenericDictionary<Integer, byte[]> h0() {
      return this.a6;
   }

   public final IGenericDictionary<Integer, byte[]> c8() {
      return this.u9;
   }

   public final boolean t2() {
      return this.c8;
   }

   public final String n5(int var1) {
      return this.a6.containsKey(var1) ? this.h0.get_Item(var1) : "";
   }

   final void n5(c4y var1) {
      IGenericEnumerator var2 = var1.h0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            this.h0.addItem((Integer)var3.getKey(), (String)var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
