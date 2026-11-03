package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p3;
import com.aspose.slides.ms.System.w5;

public class k5 {
   public static l6 n5(int var0) {
      byte[] var1 = com.aspose.slides.ms.System.x8.l6(var0);
      w5.n5(var1);
      int var2 = 0;

      while (var2 < var1.length && var1[var2] == 0) {
         var2++;
      }

      l6 var3 = new l6((byte)2);
      switch (var2) {
         case 0:
            var3.n5(var1);
            break;
         case 4:
            var3.n5(new byte[1]);
            break;
         default:
            byte[] var4 = new byte[4 - var2];
            com.aspose.slides.ms.System.y4.n5(var1, var2, var4, 0, var4.length);
            var3.n5(var4);
      }

      return var3;
   }

   public static l6 n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("oid");
      } else {
         return new l6(com.aspose.slides.internal.o8m.y4.k5(var0));
      }
   }

   public static int n5(l6 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("asn1");
      }

      if (var0.l6() != 2) {
         throw new FormatException("Only integer can be converted");
      }

      int var1 = 0;

      for (int var2 = 0; var2 < var0.u3().length; var2++) {
         var1 = (var1 << 8) + (var0.u3()[var2] & 255);
      }

      return var1;
   }

   public static String l6(l6 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("asn1");
      }

      byte[] var1 = var0.u3();
      StringBuilder var2 = new StringBuilder();
      byte var3 = (byte)((var1[0] & 255) / 40);
      byte var4 = (byte)((var1[0] & 255) % 40);
      if ((var3 & 255) > 2) {
         var4 = (byte)((var4 & 255) + ((byte)(((var3 & 255) - 2) * 40) & 255));
         var3 = 2;
      }

      var2.append(com.aspose.slides.ms.System.e2.n5(var3, com.aspose.slides.internal.x7n.l6.k5()));
      var2.append(".");
      var2.append(com.aspose.slides.ms.System.e2.n5(var4, com.aspose.slides.internal.x7n.l6.k5()));
      long var5 = 0L;

      for (byte var7 = 1; (var7 & 255) < var1.length; var7++) {
         var5 = var5 << 7 | (byte)(var1[var7 & 0xFF] & 0xFF & 127);
         if ((var1[var7 & 0xFF] & 255 & 128) != 128) {
            var2.append(".");
            var2.append(p3.n5(var5, com.aspose.slides.internal.x7n.l6.k5()));
            var5 = 0L;
         }
      }

      return var2.toString();
   }

   public static com.aspose.slides.ms.System.j5 k5(l6 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("time");
      }

      String var1 = com.aspose.slides.internal.l7h.j5.e2().l6(var0.u3());
      String var2 = null;
      switch (var1.length()) {
         case 11:
            var2 = "yyMMddHHmmZ";
         case 12:
         case 14:
         case 16:
         default:
            break;
         case 13:
            short var6 = com.aspose.slides.ms.System.z3.a6(var1.substring(0, 2), com.aspose.slides.internal.x7n.l6.k5());
            if (var6 >= 50) {
               var1 = "19" + var1;
            } else {
               var1 = "20" + var1;
            }

            var2 = "yyyyMMddHHmmssZ";
            break;
         case 15:
            var2 = "yyyyMMddHHmmssZ";
            break;
         case 17:
            short var3 = com.aspose.slides.ms.System.z3.a6(var1.substring(0, 2), com.aspose.slides.internal.x7n.l6.k5());
            String var4 = var3 >= 50 ? "19" : "20";
            int var5 = var1.charAt(12) == '+' ? 45 : 43;
            var1 = d1.n5(
               "{0}{1}{2}{3}{4}:{5}{6}",
               var4,
               var1.substring(0, 12),
               Character.valueOf((char)var5),
               var1.charAt(13),
               var1.charAt(14),
               var1.charAt(15),
               var1.charAt(16)
            );
            var2 = "yyyyMMddHHmmsszzz";
      }

      return com.aspose.slides.ms.System.j5.n5(var1, var2, com.aspose.slides.internal.x7n.l6.k5(), 16);
   }
}
