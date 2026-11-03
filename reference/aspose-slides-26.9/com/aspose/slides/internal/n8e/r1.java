package com.aspose.slides.internal.n8e;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DecoderFallbackException;

public class r1 {
   private static final com.aspose.slides.internal.l7h.u6 n5 = new com.aspose.slides.internal.l7h.u6(false, true);

   public static y1 n5(com.aspose.slides.internal.z0k.t4 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("stream");
      } else if (!var0.canRead()) {
         throw new ArgumentException("Stream must be readable.", "stream");
      } else {
         byte[] var1 = l6(var0);
         y1 var2 = new y1();
         if (var1.length == 0) {
            var2.n5 = true;
            var2.l6 = "Empty input treated as text.";
            var2.k5 = "Unknown/Legacy";
            var2.u3 = 1.0;
            var2.a6 = 0.0;
            var2.u9 = 0.0;
            var2.h0 = 0.0;
            return var2;
         } else {
            String var3 = null;
            String[] var4 = new String[]{var3};
            boolean var5 = n5(var1, var4);
            var3 = var4[0];
            if (var5) {
               var2.n5 = false;
               var2.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{"Recognized binary magic: ", var3, "."});
               var2.k5 = "Binary";
               var2.u3 = 0.0;
               var2.a6 = 1.0;
               var2.u9 = n5(var1, (byte)0);
               var2.h0 = l6(var1);
               return var2;
            } else {
               double var6 = n5(var1, (byte)0);
               double var8 = l6(var1);
               com.aspose.slides.internal.l7h.j5 var10 = null;
               int var11 = 0;
               com.aspose.slides.internal.l7h.j5[] var12 = new com.aspose.slides.internal.l7h.j5[]{var10};
               int[] var13 = new int[]{0};
               boolean var14 = n5(var1, var12, var13);
               var10 = var12[0];
               var11 = var13[0];
               if (var14) {
                  r8 var24 = n5(var1, var10, var11).n5();
                  return n5(var24.n5(), var6, var8, n5(var10));
               } else {
                  boolean var15 = false;
                  boolean[] var16 = new boolean[]{false};
                  boolean var17 = n5(var1, var16);
                  var15 = var16[0];
                  if (var17) {
                     var10 = var15 ? com.aspose.slides.internal.l7h.j5.z1() : com.aspose.slides.internal.l7h.j5.t4();
                     r8 var26 = n5(var1, var10, 0).n5();
                     return n5(var26.n5(), var6, var8, var15 ? "UTF-16LE" : "UTF-16BE");
                  } else if (k5(var1)) {
                     r8 var25 = n5(var1, com.aspose.slides.internal.l7h.j5.z3(), 0).n5();
                     return n5(var25.n5(), var6, var8, "UTF-8");
                  } else {
                     r8 var18 = n5(var1).n5();
                     return n5(var18.n5(), var6, var8, "Unknown/Legacy");
                  }
               }
            }
         }
      }
   }

   private static y1 n5(r8 var0, double var1, double var3, String var5) {
      y1 var6 = new y1();
      var6.u3 = var0.n5;
      var6.a6 = var0.l6;
      var6.u9 = var1;
      var6.h0 = var3;
      var6.k5 = var5;
      if (var0.l6 > 0.08 && var0.n5 < 0.85) {
         var6.n5 = false;
         var6.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{"Too many control characters (", n5(var0.l6), ") with low printable ratio (", n5(var0.n5), ")."});
         var6.k5 = "Binary";
         return var6;
      } else if (var3 > 7.35 && var0.n5 < 0.9) {
         var6.n5 = false;
         var6.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{
            "High entropy (", com.aspose.slides.ms.System.d2.n5(var3, "F2"), " bits/byte) and insufficient printable ratio (", n5(var0.n5), ")."
         });
         var6.k5 = "Binary";
         return var6;
      } else if (var0.n5 >= 0.92 && var0.l6 <= 0.03) {
         var6.n5 = true;
         var6.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{"High printable ratio (", n5(var0.n5), ") and low control ratio (", n5(var0.l6), ")."});
         return var6;
      } else {
         boolean var7 = var0.n5 >= 0.88 && var0.l6 <= 0.06 && var3 <= 7.6;
         if (var7) {
            var6.n5 = true;
            var6.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{
               "Plausible text: printable ", n5(var0.n5), ", control ", n5(var0.l6), ", entropy ", com.aspose.slides.ms.System.d2.n5(var3, "F2"), "."
            });
            return var6;
         } else {
            var6.n5 = false;
            var6.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{
               "Not convincing as text: printable ", n5(var0.n5), ", control ", n5(var0.l6), ", entropy ", com.aspose.slides.ms.System.d2.n5(var3, "F2"), "."
            });
            var6.k5 = "Binary";
            return var6;
         }
      }
   }

   private static String n5(double var0) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d2.n5(var0 * 100.0, "F1"), "%"});
   }

   private static r8 n5(byte[] var0, com.aspose.slides.internal.l7h.j5 var1, int var2) {
      r8 var3 = new r8();
      int var4 = var0.length - var2;
      if (var4 <= 0) {
         var3.n5 = 1.0;
         var3.l6 = 0.0;
         return var3;
      }

      String var5;
      try {
         var5 = var1.l6(var0, var2, var4);
      } catch (RuntimeException var11) {
         var3.n5 = 0.0;
         var3.l6 = 1.0;
         return var3;
      }

      if (var5.isEmpty()) {
         var3.n5 = 1.0;
         var3.l6 = 0.0;
         return var3;
      }

      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 < var5.length(); var9++) {
         char var10 = var5.charAt(var9);
         var8++;
         if (var10 == '\t' || var10 == '\n' || var10 == '\r' || var10 == '\f') {
            var6++;
         } else if (var10 != '�') {
            if (com.aspose.slides.ms.System.t9.k5(var10)) {
               var7++;
            } else {
               var6++;
            }
         }
      }

      var3.n5 = var8 == 0 ? 1.0 : (double)var6 / var8;
      var3.l6 = var8 == 0 ? 0.0 : (double)var7 / var8;
      return var3;
   }

   private static r8 n5(byte[] var0) {
      r8 var1 = new r8();
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length; var4++) {
         byte var5 = var0[var4];
         if ((var5 & 255) == 9 || (var5 & 255) == 10 || (var5 & 255) == 13 || (var5 & 255) == 12) {
            var2++;
         } else if ((var5 & 255) >= 32 && (var5 & 255) <= 126) {
            var2++;
         } else if ((var5 & 255) >= 32 && (var5 & 255) != 127) {
            var2++;
         } else {
            var3++;
         }
      }

      double var6 = var0.length;
      var1.n5 = var6 == 0.0 ? 1.0 : var2 / var6;
      var1.l6 = var6 == 0.0 ? 0.0 : var3 / var6;
      return var1;
   }

   private static boolean n5(byte[] var0, com.aspose.slides.internal.l7h.j5[] var1, int[] var2) {
      com.aspose.slides.internal.l7h.j5[] var3 = new com.aspose.slides.internal.l7h.j5[]{
         com.aspose.slides.internal.l7h.j5.z3(), com.aspose.slides.internal.l7h.j5.z1(), com.aspose.slides.internal.l7h.j5.t4()
      };

      for (int var4 = 0; var4 < var3.length; var4++) {
         byte[] var5 = var3[var4].c8();
         if (var5 != null && var5.length > 0 && n5(var0, var5)) {
            var1[0] = var3[var4];
            var2[0] = var5.length;
            return true;
         }
      }

      var1[0] = com.aspose.slides.internal.l7h.j5.z3();
      var2[0] = 0;
      return false;
   }

   private static boolean n5(byte[] var0, byte[] var1) {
      if (var0 != null && var1 != null) {
         if (var0.length < var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var1.length; var2++) {
            if ((var0[var2] & 255) != (var1[var2] & 255)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static String n5(com.aspose.slides.internal.l7h.j5 var0) {
      if (var0 == com.aspose.slides.internal.l7h.j5.z3()) {
         return "UTF-8";
      } else if (var0 == com.aspose.slides.internal.l7h.j5.z1()) {
         return "UTF-16LE";
      } else {
         return var0 == com.aspose.slides.internal.l7h.j5.t4() ? "UTF-16BE" : var0.s7();
      }
   }

   private static double n5(byte[] var0, byte var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var0.length; var3++) {
         if (var0[var3] == var1) {
            var2++;
         }
      }

      return var0.length == 0 ? 0.0 : (double)var2 / var0.length;
   }

   private static double l6(byte[] var0) {
      if (var0.length == 0) {
         return 0.0;
      }

      int[] var1 = new int[256];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var0[var2] & 0xFF]++;
      }

      double var3 = 1.0 / var0.length;
      double var5 = 0.0;

      for (int var7 = 0; var7 < 256; var7++) {
         int var8 = var1[var7];
         if (var8 != 0) {
            double var9 = var8 * var3;
            var5 -= var9 * (com.aspose.slides.ms.System.q1.t4(var9) / com.aspose.slides.ms.System.q1.t4(2.0));
         }
      }

      return var5;
   }

   private static boolean n5(byte[] var0, boolean[] var1) {
      var1[0] = true;
      int var2 = var0.length;
      if (var2 > 65536) {
         var2 = 65536;
      }

      var2 &= -2;
      if (var2 < 8) {
         return false;
      }

      int var3 = 0;
      int var4 = 0;
      int var5 = var2 / 2;

      for (int var6 = 0; var6 < var2; var6 += 2) {
         if ((var0[var6] & 255) == 0) {
            var3++;
         }

         if ((var0[var6 + 1] & 255) == 0) {
            var4++;
         }
      }

      double var7 = (double)var3 / var5;
      double var9 = (double)var4 / var5;
      if (var9 > 0.6 && var7 < 0.2) {
         var1[0] = true;
         return true;
      } else if (var7 > 0.6 && var9 < 0.2) {
         var1[0] = false;
         return true;
      } else {
         return false;
      }
   }

   private static boolean k5(byte[] var0) {
      try {
         n5.n5(var0, 0, var0.length);
         return true;
      } catch (DecoderFallbackException var2) {
         return false;
      }
   }

   private static boolean n5(byte[] var0, String[] var1) {
      var1[0] = "";
      if (var0 != null && var0.length != 0) {
         if (var0.length >= 4
            && (var0[0] & 255) == 80
            && (var0[1] & 255) == 75
            && n5(var0[2], (byte)3, (byte)5, (byte)7)
            && n5(var0[3], (byte)4, (byte)6, (byte)8)) {
            var1[0] = "ZIP (PK)";
            return true;
         } else if (n5(var0, new byte[]{-48, -49, 17, -32, -95, -79, 26, -31}, "OLE Compound (D0 CF 11 E0...)")) {
            var1[0] = "OLE Compound (D0 CF 11 E0...)";
            return true;
         } else if (n5(var0, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10}, "PNG")) {
            var1[0] = "PNG";
            return true;
         } else if (n5(var0, new byte[]{-1, -40, -1}, "JPEG")) {
            var1[0] = "JPEG";
            return true;
         } else if (var0.length >= 6
            && (var0[0] & 255) == 71
            && (var0[1] & 255) == 73
            && (var0[2] & 255) == 70
            && (var0[3] & 255) == 56
            && n5(var0[4], (byte)55, (byte)57)
            && (var0[5] & 255) == 97) {
            var1[0] = "GIF";
            return true;
         } else if (n5(var0, new byte[]{37, 80, 68, 70, 45}, "PDF")) {
            var1[0] = "PDF";
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean n5(byte[] var0, byte[] var1, String var2) {
      if (var0.length < var1.length) {
         return false;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if ((var0[var3] & 255) != (var1[var3] & 255)) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(byte var0, byte var1, byte var2, byte var3) {
      return var0 == var1 || var0 == var2 || var0 == var3;
   }

   private static boolean n5(byte var0, byte var1, byte var2) {
      return var0 == var1 || var0 == var2;
   }

   private static byte[] l6(com.aspose.slides.internal.z0k.t4 var0) {
      long var1 = 0L;
      boolean var3 = var0.canSeek();
      if (var3) {
         var1 = var0.getPosition();
      }

      byte[] var4 = new byte[16384];
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(65536);

      try {
         int var6 = 262144;

         while (var6 > 0) {
            int var7 = var6 < var4.length ? var6 : var4.length;
            int var8 = var0.read(var4, 0, var7);
            if (var8 <= 0) {
               break;
            }

            var5.write(var4, 0, var8);
            var6 -= var8;
         }

         if (var3) {
            var0.setPosition(var1);
         }

         return var5.toArray();
      } finally {
         var5.dispose();
      }
   }
}
