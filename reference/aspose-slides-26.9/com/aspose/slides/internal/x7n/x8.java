package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class x8 {
   private String n5;
   private int l6;

   public x8() {
      this(d1.n5);
   }

   public x8(String var1) {
      this.n5(var1);
   }

   @Override
   public boolean equals(Object value) {
      x8 var2 = com.aspose.slides.internal.v6g.k5.n5(value, x8.class);
      return var2 != null && d1.a6(this.n5, var2.n5);
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   public void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6 = -1;
      this.n5 = var1;
   }

   public static String n5(String var0, int var1) {
      int var2 = l6(var0, var1);
      return var2 != 1 ? d1.l6(var0, var1, var2) : d1.n5(var0.charAt(var1), 1);
   }

   static int l6(String var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("string is null");
      }

      if (var1 >= var0.length()) {
         return 0;
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("Index is not valid");
      }

      char var2 = var0.charAt(var1);
      int var3 = com.aspose.slides.ms.System.t9.l6(var2);
      if (var3 == 16) {
         if (var2 >= '\ud800' && var2 <= '\udbff') {
            return var1 + 1 < var0.length() && var0.charAt(var1 + 1) >= 56320 && var0.charAt(var1 + 1) <= 57343 ? 2 : 1;
         } else {
            return 1;
         }
      } else if (var3 != 5 && var3 != 6 && var3 != 7) {
         int var4;
         for (var4 = 1; var1 + var4 < var0.length(); var4++) {
            var3 = com.aspose.slides.ms.System.t9.l6(var0.charAt(var1 + var4));
            if (var3 != 5 && var3 != 6 && var3 != 7) {
               break;
            }
         }

         return var4;
      } else {
         return 1;
      }
   }

   public static y4 l6(String var0) {
      if (var0 != null && var0.length() != 0) {
         return new y4(var0, 0);
      } else {
         throw new ArgumentNullException("string is null");
      }
   }
}
