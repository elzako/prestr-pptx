package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.XmlException;

public class h6 extends d1 {
   @Override
   public int l6(byte[] var1, int var2, int var3, char[] var4, int var5) {
      var3 += var2;
      int var6 = var2;
      int var7 = var5;

      while (var6 + 3 < var3) {
         long var8 = ((var1[var6 + 1] & 255) << 24 | (var1[var6] & 255) << 16 | (var1[var6 + 3] & 255) << 8 | var1[var6 + 2] & 0xFF) & 4294967295L;
         if ((var8 & 4294967295L) > 1114111L) {
            throw new ArgumentException(v3.n5("Invalid byte was found at index {0}.", var6), (String)null);
         }

         if ((var8 & 4294967295L) > 65535L) {
            this.n5(var8, var4, var7);
            var7++;
         } else {
            if (u4.k5((int)var8)) {
               throw new XmlException("Invalid character in the given encoding.", com.aspose.slides.ms.System.d1.n5);
            }

            var4[var7] = (char)var8;
         }

         var7++;
         var6 += 4;
      }

      return var7 - var5;
   }
}
