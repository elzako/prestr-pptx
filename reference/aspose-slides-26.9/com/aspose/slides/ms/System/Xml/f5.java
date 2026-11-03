package com.aspose.slides.ms.System.Xml;

public class f5 {
   private byte[] n5;

   public f5(byte[] var1) {
      this.n5 = var1;
   }

   public final byte n5(String var1) {
      int var2 = 0;
      int var3 = 0;
      byte[] var4 = this.n5;
      char var5 = var1.charAt(var2);
      if (var5 > 'z') {
         return 0;
      }

      if (var5 >= 'a') {
         var5 -= ' ';
      }

      while (true) {
         int var6 = var3 * 4;
         int var7 = var4[var6 + 0] & 255;
         if (var5 < var7) {
            if ((var4[var6 + 1] & 255) == 0) {
               break;
            }

            var3 += var4[var6 + 1] & 255;
         } else if (var5 > var7) {
            if ((var4[var6 + 2] & 255) == 0) {
               break;
            }

            var3 += var4[var6 + 2] & 255;
         } else {
            if (var5 == 0) {
               return var4[var6 + 3];
            }

            var3++;
            if (++var2 == var1.length()) {
               var5 = 0;
            } else {
               var5 = var1.charAt(var2);
               if (var5 > 'z') {
                  return 0;
               }

               if (var5 >= 'a') {
                  var5 -= ' ';
               }
            }
         }
      }

      return 0;
   }
}
