package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;

public class j9 extends z9 {
   private j9$n5[] n5;
   private int l6;
   private int k5 = 31;
   private int u3;

   public j9() {
      this.n5 = new j9$n5[this.k5 + 1];
      this.u3 = com.aspose.slides.ms.System.p8.a6();
   }

   @Override
   public String n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      int var2 = var1.length();
      if (var2 == 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var3 = var2 + this.u3;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         var3 += var3 << 7 ^ var1.charAt(var4);
      }

      var3 -= var3 >> 17;
      var3 -= var3 >> 11;
      var3 -= var3 >> 5;

      for (j9$n5 var8 = this.n5[var3 & this.k5]; var8 != null; var8 = var8.k5) {
         if (var8.l6 == var3 && com.aspose.slides.ms.System.d1.a6(var8.n5, var1)) {
            return var8.n5;
         }
      }

      return this.n5(var1, var3);
   }

   @Override
   public String n5(char[] var1, int var2, int var3) {
      if (var3 == 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("The Len is negative");
      }

      if (var1 == null) {
         throw new NullReferenceException("The key is null");
      }

      if (0 <= var2 && var2 < var1.length && var2 + var3 <= var1.length) {
         if (var3 == 0) {
            return com.aspose.slides.ms.System.d1.n5;
         }

         int var4 = var3 + this.u3;
         var4 += var4 << 7 ^ var1[var2];
         int var5 = var2 + var3;

         for (int var6 = var2 + 1; var6 < var5; var6++) {
            var4 += var4 << 7 ^ var1[var6];
         }

         var4 -= var4 >> 17;
         var4 -= var4 >> 11;
         var4 -= var4 >> 5;

         for (j9$n5 var11 = this.n5[var4 & this.k5]; var11 != null; var11 = var11.k5) {
            if (var11.l6 == var4 && n5(var11.n5, var1, var2, var3)) {
               return var11.n5;
            }
         }

         return this.n5(com.aspose.slides.ms.System.d1.n5(var1, var2, var3), var4);
      } else {
         throw new IndexOutOfRangeException("The Index is out of range.");
      }
   }

   @Override
   public String l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.length() == 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var2 = var1.length() + this.u3;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         var2 += var2 << 7 ^ var1.charAt(var3);
      }

      var2 -= var2 >> 17;
      var2 -= var2 >> 11;
      var2 -= var2 >> 5;

      for (j9$n5 var7 = this.n5[var2 & this.k5]; var7 != null; var7 = var7.k5) {
         if (var7.l6 == var2 && com.aspose.slides.ms.System.d1.a6(var7.n5, var1)) {
            return var7.n5;
         }
      }

      return null;
   }

   private String n5(String var1, int var2) {
      int var3 = var2 & this.k5;
      j9$n5 var4 = new j9$n5(var1, var2, this.n5[var3]);
      this.n5[var3] = var4;
      if (this.l6++ == this.k5) {
         this.n5();
      }

      return var4.n5;
   }

   private void n5() {
      int var1 = this.k5 * 2 + 1;
      j9$n5[] var2 = this.n5;
      j9$n5[] var3 = new j9$n5[var1 + 1];

      for (int var4 = 0; var4 < var2.length; var4++) {
         j9$n5 var5 = var2[var4];

         while (var5 != null) {
            int var6 = var5.l6 & var1;
            j9$n5 var7 = var5.k5;
            var5.k5 = var3[var6];
            var3[var6] = var5;
            var5 = var7;
         }
      }

      this.n5 = var3;
      this.k5 = var1;
   }

   private static boolean n5(String var0, char[] var1, int var2, int var3) {
      if (var0.length() != var3) {
         return false;
      }

      for (int var4 = 0; var4 < var0.length(); var4++) {
         if (var0.charAt(var4) != var1[var2 + var4]) {
            return false;
         }
      }

      return true;
   }
}
