package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentNullException;

public class e2 {
   private String n5;
   private String l6;
   private int k5;
   private boolean u3;
   private int a6;
   private l6 u9;
   private boolean h0;
   private e2$n5 c8;

   e2(l6 var1, int var2, e2$n5 var3) {
      if (var3 == null) {
         throw new ArgumentNullException("data");
      }

      if (var1 == null) {
         throw new ArgumentNullException("CultureInfo");
      }

      this.a6 = var2;
      this.u9 = var1;
      this.c8 = var3;
      switch (var1.t2()) {
         case 31:
         case 44:
            this.h0 = true;
      }
   }

   private e2(e2 var1) {
      this.a6 = var1.a6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.n5 = var1.k5();
      this.l6 = var1.u3();
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
   }

   public int n5() {
      return e2$n5.n5(this.c8);
   }

   public int l6() {
      return this.a6;
   }

   public String k5() {
      if (this.n5 == null) {
         this.n5 = Character.toString(e2$n5.l6(this.c8));
      }

      return this.n5;
   }

   public String u3() {
      if (this.l6 == null) {
         this.l6 = this.u9.s7();
      }

      return this.l6;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (o != null && this.getClass() == o.getClass()) {
         e2 var2 = (e2)o;
         if (this.a6 != var2.a6) {
            return false;
         } else {
            return this.u9 != null ? this.u9.equals(var2.u9) : var2.u9 == null;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a6;
   }

   @Override
   public String toString() {
      return "TextInfo - " + this.a6;
   }

   public char n5(char var1) {
      if (var1 >= '@' && ('`' >= var1 || var1 >= 128)) {
         if ('A' > var1 || var1 > 'Z' || this.h0 && var1 == 'I') {
            if (this.u9 != null && this.u9.t2() != 127) {
               switch (var1) {
                  case 'I':
                     if (this.h0) {
                        return 'ı';
                     }
                  default:
                     return com.aspose.slides.ms.System.t9.t4(var1);
                  case 'İ':
                     return 'i';
                  case 'ǅ':
                     return 'ǆ';
                  case 'ǈ':
                     return 'ǉ';
                  case 'ǋ':
                     return 'ǌ';
                  case 'ǲ':
                     return 'ǳ';
                  case 'ϒ':
                     return 'υ';
                  case 'ϓ':
                     return 'ύ';
                  case 'ϔ':
                     return 'ϋ';
               }
            } else {
               return com.aspose.slides.ms.System.t9.t4(var1);
            }
         } else {
            return (char)(var1 + ' ');
         }
      } else {
         return var1;
      }
   }

   public String n5(String var1) {
      StringBuilder var2 = new StringBuilder();

      for (char var6 : var1.toCharArray()) {
         var2.append(this.n5(var6));
      }

      return var2.toString();
   }

   public char l6(char var1) {
      if (var1 < '`') {
         return var1;
      }

      if ('a' > var1 || var1 > 'z' || this.h0 && var1 == 'i') {
         if (this.u9 != null && this.u9.t2() != 127) {
            switch (var1) {
               case 'i':
                  if (this.h0) {
                     return 'İ';
                  }
               default:
                  return com.aspose.slides.ms.System.t9.m1(var1);
               case 'ı':
                  return 'I';
               case 'ǅ':
                  return 'Ǆ';
               case 'ǈ':
                  return 'Ǉ';
               case 'ǋ':
                  return 'Ǌ';
               case 'ǲ':
                  return 'Ǳ';
               case 'ΐ':
                  return 'Ϊ';
               case 'ΰ':
                  return 'Ϋ';
               case 'ϐ':
                  return 'Β';
               case 'ϑ':
                  return 'Θ';
               case 'ϕ':
                  return 'Φ';
               case 'ϖ':
                  return 'Π';
               case 'ϰ':
                  return 'Κ';
               case 'ϱ':
                  return 'Ρ';
            }
         } else {
            return com.aspose.slides.ms.System.t9.m1(var1);
         }
      } else {
         return (char)(var1 - ' ');
      }
   }

   public char k5(char var1) {
      switch (var1) {
         case 'Ǆ':
         case 'ǅ':
         case 'ǆ':
            return 'ǅ';
         case 'Ǉ':
         case 'ǈ':
         case 'ǉ':
            return 'ǈ';
         case 'Ǌ':
         case 'ǋ':
         case 'ǌ':
            return 'ǋ';
         case 'Ǎ':
         case 'ǎ':
         case 'Ǐ':
         case 'ǐ':
         case 'Ǒ':
         case 'ǒ':
         case 'Ǔ':
         case 'ǔ':
         case 'Ǖ':
         case 'ǖ':
         case 'Ǘ':
         case 'ǘ':
         case 'Ǚ':
         case 'ǚ':
         case 'Ǜ':
         case 'ǜ':
         case 'ǝ':
         case 'Ǟ':
         case 'ǟ':
         case 'Ǡ':
         case 'ǡ':
         case 'Ǣ':
         case 'ǣ':
         case 'Ǥ':
         case 'ǥ':
         case 'Ǧ':
         case 'ǧ':
         case 'Ǩ':
         case 'ǩ':
         case 'Ǫ':
         case 'ǫ':
         case 'Ǭ':
         case 'ǭ':
         case 'Ǯ':
         case 'ǯ':
         case 'ǰ':
         default:
            return (8560 > var1 || var1 > 8575) && (9424 > var1 || var1 > 9449) ? this.l6(var1) : var1;
         case 'Ǳ':
         case 'ǲ':
         case 'ǳ':
            return 'ǲ';
      }
   }

   public String l6(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         StringBuilder var2 = new StringBuilder();
         boolean var3 = true;
         int var4 = var1.length();
         int var5 = 0;

         while (var5 < var4) {
            int var6 = var1.codePointAt(var5);
            if (n5(var6) && var6 != 39) {
               var3 = true;
               var2.appendCodePoint(var6);
            } else if (var3 && var6 != 39) {
               int var7 = n5(var1, var5);
               if (k5(var1.substring(var5, var7))) {
                  var2.append(var1, var5, var7);
                  var5 = var7;
                  var3 = true;
                  continue;
               }

               var2.appendCodePoint(Character.toTitleCase(var6));
               var3 = false;
            } else if (var6 == 39 && var5 > 0 && Character.isLetter(var1.codePointAt(var5 - 1))) {
               var2.appendCodePoint(var6);
               var3 = false;
            } else if (var6 != 39 || var5 != 0 && !n5(var1.codePointAt(var5 - 1))) {
               var2.appendCodePoint(Character.toLowerCase(var6));
            } else {
               var2.appendCodePoint(var6);
               var3 = true;
            }

            var5 += Character.charCount(var6);
         }

         return var2.toString();
      } else {
         return var1;
      }
   }

   private static boolean n5(int var0) {
      return !Character.isLetterOrDigit(var0) && var0 != 39;
   }

   private static boolean k5(String var0) {
      int var1 = 0;

      while (var1 < var0.length()) {
         int var2 = var0.codePointAt(var1);
         if (!Character.isUpperCase(var2)) {
            return false;
         }

         var1 += Character.charCount(var0.codePointAt(var1));
      }

      return true;
   }

   private static int n5(String var0, int var1) {
      int var2 = var0.length();
      int var3 = var1;

      while (var3 < var2 && Character.isLetterOrDigit(var0.codePointAt(var3))) {
         var3 += Character.charCount(var0.codePointAt(var3));
      }

      return var3;
   }

   @Override
   public Object clone() {
      return new e2(this);
   }
}
