package com.aspose.slides.internal.i2i;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;

public final class n3 {
   static byte[] n5 = new byte[]{85, 4, 6};
   static byte[] l6 = new byte[]{85, 4, 10};
   static byte[] k5 = new byte[]{85, 4, 11};
   static byte[] u3 = new byte[]{85, 4, 3};
   static byte[] a6 = new byte[]{85, 4, 7};
   static byte[] u9 = new byte[]{85, 4, 8};
   static byte[] h0 = new byte[]{85, 4, 9};
   static byte[] c8 = new byte[]{9, -110, 38, -119, -109, -14, 44, 100, 1, 25};
   static byte[] t2 = new byte[]{9, -110, 38, -119, -109, -14, 44, 100, 1, 1};
   static byte[] s7 = new byte[]{42, -122, 72, -122, -9, 13, 1, 9, 1};
   static byte[] x8 = new byte[]{85, 4, 46};
   static byte[] n3 = new byte[]{85, 4, 12};
   static byte[] y4 = new byte[]{85, 4, 4};
   static byte[] e2 = new byte[]{85, 4, 42};
   static byte[] t9 = new byte[]{85, 4, 43};
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "C", "O", "OU", "CN", "L", "S", "ST", "E", "DC", "UID", "DNQUALIFIER", "T", "SN", "G", "I"
   );

   public static String n5(com.aspose.slides.internal.x8w.l6 var0) {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < var0.n5(); var2++) {
         com.aspose.slides.internal.x8w.l6 var3 = var0.n5(var2);
         n5(var1, var3, true);
         if (var2 < var0.n5() - 1) {
            var1.n5(", ");
         }
      }

      return var1.toString();
   }

   public static String n5(com.aspose.slides.internal.x8w.l6 var0, boolean var1, String var2, boolean var3) {
      a5 var4 = new a5();
      if (var1) {
         for (int var5 = var0.n5() - 1; var5 >= 0; var5--) {
            com.aspose.slides.internal.x8w.l6 var6 = var0.n5(var5);
            n5(var4, var6, var3);
            if (var5 > 0) {
               var4.n5(var2);
            }
         }
      } else {
         for (int var7 = 0; var7 < var0.n5(); var7++) {
            com.aspose.slides.internal.x8w.l6 var8 = var0.n5(var7);
            n5(var4, var8, var3);
            if (var7 < var0.n5() - 1) {
               var4.n5(var2);
            }
         }
      }

      return var4.toString();
   }

   private static void n5(a5 var0, com.aspose.slides.internal.x8w.l6 var1, boolean var2) {
      for (int var3 = 0; var3 < var1.n5(); var3++) {
         com.aspose.slides.internal.x8w.l6 var4 = var1.n5(var3);
         com.aspose.slides.internal.x8w.l6 var5 = var4.n5(1);
         if (var5 != null) {
            com.aspose.slides.internal.x8w.l6 var6 = var4.n5(0);
            if (var6 != null) {
               if (var6.l6(n5)) {
                  var0.n5("C=");
               } else if (var6.l6(l6)) {
                  var0.n5("O=");
               } else if (var6.l6(k5)) {
                  var0.n5("OU=");
               } else if (var6.l6(u3)) {
                  var0.n5("CN=");
               } else if (var6.l6(a6)) {
                  var0.n5("L=");
               } else if (var6.l6(u9)) {
                  var0.n5("S=");
               } else if (var6.l6(h0)) {
                  var0.n5("STREET=");
               } else if (var6.l6(c8)) {
                  var0.n5("DC=");
               } else if (var6.l6(t2)) {
                  var0.n5("UID=");
               } else if (var6.l6(s7)) {
                  var0.n5("E=");
               } else if (var6.l6(x8)) {
                  var0.n5("dnQualifier=");
               } else if (var6.l6(n3)) {
                  var0.n5("T=");
               } else if (var6.l6(y4)) {
                  var0.n5("SN=");
               } else if (var6.l6(e2)) {
                  var0.n5("G=");
               } else if (var6.l6(t9)) {
                  var0.n5("I=");
               } else {
                  var0.n5("OID.");
                  var0.n5(com.aspose.slides.internal.x8w.k5.l6(var6));
                  var0.n5("=");
               }

               String var7 = null;
               if (var5.l6() == 30) {
                  a5 var8 = new a5();

                  for (int var9 = 1; var9 < var5.u3().length; var9 += 2) {
                     var8.n5((char)var5.u3()[var9]);
                  }

                  var7 = var8.toString();
               } else {
                  if (var5.l6() == 20) {
                     var7 = j5.q0().l6(var5.u3());
                  } else {
                     var7 = j5.z3().l6(var5.u3());
                  }

                  char[] var11 = new char[]{',', '+', '"', '\\', '<', '>', ';'};
                  if (var2 && (d1.n5(var7, var11, 0, var7.length()) > 0 || d1.l6(var7, " ") || d1.k5(var7, " "))) {
                     var7 = d1.n5(new String[]{"\"", var7, "\""});
                  }
               }

               var0.n5(var7);
               if (var3 < var1.n5() - 1) {
                  var0.n5(", ");
               }
            }
         }
      }
   }
}
