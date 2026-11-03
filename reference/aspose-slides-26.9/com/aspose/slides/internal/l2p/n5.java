package com.aspose.slides.internal.l2p;

public class n5 {
   public static final String n5(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         if (var0.charAt(var2) == '\\') {
            var1 += 100;
         }
      }

      StringBuffer var3 = new StringBuffer(var1);
      boolean var5 = false;

      for (int var6 = 0; var6 < var0.length(); var6++) {
         int var4 = var0.codePointAt(var6);
         if (var0.codePointAt(var6) > 65535) {
            var6++;
         }

         if (!var5) {
            if (var4 == 92) {
               var5 = true;
            } else {
               var3.append(Character.toChars(var4));
            }
         } else if (var4 == 92) {
            var5 = false;
            var3.append("\\\\");
         } else {
            switch (var4) {
               case 119:
                  var3.append("[\\p{L}\\p{M}\\p{Nd}\\p{Nl}\\p{Pc}[\\p{InEnclosedAlphanumerics}&&\\p{So}]]");
                  break;
               default:
                  var3.append('\\');
                  var3.append(Character.toChars(var4));
            }

            var5 = false;
         }
      }

      if (var5) {
         var3.append('\\');
      }

      return var3.toString();
   }
}
