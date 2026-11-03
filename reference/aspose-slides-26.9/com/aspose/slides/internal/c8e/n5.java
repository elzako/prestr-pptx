package com.aspose.slides.internal.c8e;

import com.aspose.slides.internal.g7.i2;
import com.aspose.slides.internal.g7.m3;
import com.aspose.slides.internal.g7.n2;
import com.aspose.slides.internal.g7.r5t;
import com.aspose.slides.internal.g7.u0a;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class n5 {
   public static boolean n5(String var0) {
      return 0 <= d1.c8(var0, "Symbol") || 0 <= d1.c8(var0, "Webdings") || 0 <= d1.c8(var0, "Wingdings") || 0 <= d1.c8(var0, "Dingbats");
   }

   public static String l6(String var0) {
      if ("Helv".equals(var0)) {
         return "Arial";
      } else if ("Tms Rmn".equals(var0)) {
         return "Times New Roman";
      } else if ("MS Serif".equals(var0)) {
         return "Times New Roman";
      } else if ("MS Sans Serif".equals(var0)) {
         return "Microsoft Sans Serif";
      } else {
         return "Courier".equals(var0) ? "Courier New" : var0;
      }
   }

   public static char n5(int var0) {
      return l6((char)var0) ? (char)(var0 - 61440) : (char)var0;
   }

   public static boolean l6(int var0) {
      return var0 >= 61472 && var0 <= 61695;
   }

   public static char k5(int var0) {
      return (char)(var0 + 61440);
   }

   public static byte[] n5(byte[] var0) {
      r5t var1 = new r5t();
      u0a var2 = (u0a)var1.n5(new n2(0, new m3(var0)));
      i2 var3 = var2.l6(0);
      return ((m3)((u0a)var3).x8().k5()[0].k5()).n5();
   }

   public static String n5(String var0, String[] var1) {
      String var2 = d1.l6(d1.n5(d1.n5(d1.n5(d1.n5(var0, "-", " "), ",", " "), "MT", ""), "PS", ""));
      if (d1.t2(var2, "BoldItalic")) {
         var1[0] = "BoldItalic";
         return k5(d1.l6(d1.n5(var2, "BoldItalic", "")));
      } else if (d1.t2(var2, "Italic")) {
         var1[0] = "Italic";
         return k5(d1.l6(d1.n5(var2, "Italic", "")));
      } else if (d1.t2(var2, "Bold")) {
         var1[0] = "Bold";
         return k5(d1.l6(d1.n5(var2, "Bold", "")));
      } else {
         var1[0] = "Regular";
         return k5(var2);
      }
   }

   private static String k5(String var0) {
      a5 var1 = new a5();
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (t9.e2(var4) && !var2 && var1.l6() > 0 && var1.l6(var1.l6() - 1) != ' ') {
            var1.n5(' ');
         }

         var1.n5(var4);
         var2 = t9.e2(var4);
      }

      return var1.toString();
   }
}
