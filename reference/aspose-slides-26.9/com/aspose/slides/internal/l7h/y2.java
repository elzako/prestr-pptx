package com.aspose.slides.internal.l7h;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p6;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class y2 {
   private static final Hashtable n5 = Hashtable.sync(new Hashtable(p6.u3()));
   private static volatile AtomicReferenceArray<k5> l6 = new AtomicReferenceArray<>(8);
   private static final String k5 = d1.n5(new String[]{
      "ansi_x3.4-1968",
      "ansi_x3.4-1986",
      "ascii",
      "cp367",
      "cp819",
      "csascii",
      "csisolatin1",
      "csunicode11utf7",
      "ibm367",
      "ibm819",
      "iso-10646-ucs-2",
      "iso-8859-1",
      "iso-ir-100",
      "iso-ir-6",
      "iso646-us",
      "iso8859-1",
      "iso_646.irv:1991",
      "iso_8859-1",
      "iso_8859-1:1987",
      "l1",
      "latin1",
      "ucs-2",
      "unicode",
      "unicode-1-1-utf-7",
      "unicode-1-1-utf-8",
      "unicode-2-0-utf-7",
      "unicode-2-0-utf-8",
      "unicodefffe",
      "us",
      "us-ascii",
      "utf-16",
      "utf-16be",
      "utf-16le",
      "utf-32",
      "utf-32be",
      "utf-32le",
      "utf-7",
      "utf-8",
      "x-unicode-1-1-utf-7",
      "x-unicode-1-1-utf-8",
      "x-unicode-2-0-utf-7",
      "x-unicode-2-0-utf-8"
   });
   private static final int[] u3 = new int[]{
      0,
      14,
      28,
      33,
      38,
      43,
      50,
      61,
      76,
      82,
      88,
      103,
      113,
      123,
      131,
      140,
      149,
      165,
      175,
      190,
      192,
      198,
      203,
      210,
      227,
      244,
      261,
      278,
      289,
      291,
      299,
      305,
      313,
      321,
      327,
      335,
      343,
      348,
      353,
      372,
      391,
      410,
      429
   };
   private static final int[] a6 = new int[]{
      20127,
      20127,
      20127,
      20127,
      28591,
      20127,
      28591,
      65000,
      20127,
      28591,
      1200,
      28591,
      28591,
      20127,
      20127,
      28591,
      20127,
      28591,
      28591,
      28591,
      28591,
      1200,
      1200,
      65000,
      65001,
      65000,
      65001,
      1201,
      20127,
      20127,
      1200,
      1201,
      1200,
      12000,
      12001,
      12000,
      65000,
      65001,
      65000,
      65001,
      65000,
      65001
   };
   private static final int[] u9 = new int[]{1200, 1201, 12000, 12001, 20127, 28591, 65000, 65001};
   private static final int[] h0 = new int[]{1200, 1200, 1200, 1200, 1252, 1252, 1200, 1200};
   private static final String c8 = d1.n5(new String[]{"utf-16", "utf-16BE", "utf-32", "utf-32BE", "us-ascii", "iso-8859-1", "utf-7", "utf-8"});
   private static final int[] t2 = new int[]{0, 6, 14, 20, 28, 36, 46, 51, 56};
   private static final String s7 = d1.n5(new String[]{
      "Unicode",
      "Unicode (Big-Endian)",
      "Unicode (UTF-32)",
      "Unicode (UTF-32 Big-Endian)",
      "US-ASCII",
      "Western European (ISO)",
      "Unicode (UTF-7)",
      "Unicode (UTF-8)"
   });
   private static final int[] x8 = new int[]{0, 7, 27, 43, 70, 78, 100, 115, 130};
   private static final long[] n3 = new long[]{512L, 0L, 0L, 0L, 257L, 771L, 257L, 771L};

   public static int n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("name");
      }

      Object var1 = n5.get_Item(var0);
      if (var1 != null) {
         return com.aspose.slides.internal.v6g.k5.u3(var1, int.class);
      }

      int var2 = l6(var0);
      n5.set_Item(var0, var2);
      return var2;
   }

   private static int l6(String var0) {
      int var1 = 0;
      int var2 = u3.length - 2;
      String var3 = d1.a6(var0);

      while (var2 - var1 > 3) {
         int var4 = (var2 - var1) / 2 + var1;
         int var5 = d1.h0(var3, d1.l6(k5, u3[var4], u3[var4 + 1] - u3[var4]));
         if (var5 == 0) {
            return a6[var4] & 65535;
         }

         if (var5 < 0) {
            var2 = var4;
         } else {
            var1 = var4;
         }
      }

      while (var1 <= var2) {
         if (d1.h0(var3, d1.l6(k5, u3[var1], u3[var1 + 1] - u3[var1])) == 0) {
            return a6[var1] & 65535;
         }

         var1++;
      }

      throw new ArgumentException(
         o0.n5(
            "'{0}' is not a supported encoding name. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
            var0
         ),
         "name"
      );
   }

   public static k5 n5(int var0) {
      byte var1;
      switch (var0) {
         case 1200:
            var1 = 0;
            break;
         case 1201:
            var1 = 1;
            break;
         case 12000:
            var1 = 2;
            break;
         case 12001:
            var1 = 3;
            break;
         case 20127:
            var1 = 4;
            break;
         case 28591:
            var1 = 5;
            break;
         case 65000:
            var1 = 6;
            break;
         case 65001:
            var1 = 7;
            break;
         default:
            return null;
      }

      k5 var2 = l6.get(var1);
      if (var2 == null) {
         l6.set(var1, n5(var0, var1));
         var2 = l6.get(var1);
      }

      return var2;
   }

   private static k5 n5(int var0, int var1) {
      int var2 = h0[var1];
      String var3 = d1.l6(c8, t2[var1], t2[var1 + 1] - t2[var1]);
      String var4 = l6(var0, var1);
      long var5 = n3[var1];
      return new k5(var0, var2, var3, var3, var3, var4, var5);
   }

   private static String l6(int var0, int var1) {
      String var2 = o0.n5(d1.n5(new String[]{"Globalization_cp_", a3.l6(var0)}));
      if (d1.n5(var2)) {
         var2 = d1.l6(s7, x8[var1], x8[var1 + 1] - x8[var1]);
      }

      return var2;
   }
}
