package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.FormatException;

class y2i {
   public static boolean n5(OleObjectFrame var0, byte[] var1, com.aspose.slides.internal.c8m.x8 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("oleFrame");
      } else if (var1 == null) {
         throw new ArgumentNullException("streamData");
      } else if (var1.length == 0) {
         return false;
      } else {
         String var3 = null;
         String var4 = null;
         byte[] var5 = null;
         String[] var6 = new String[]{var4};
         String[] var7 = new String[]{var3};
         byte[][] var8 = new byte[][]{var5};
         boolean var9 = n5(var1, var6, var7, var8);
         var4 = var6[0];
         var3 = var7[0];
         var5 = var8[0];
         if (var9) {
            var0.l6(var4);
            var0.n5(var3);
            var0.z1().n5(var5);
            var0.z1().n5(n5(var4, var2));
            return true;
         } else {
            return false;
         }
      }
   }

   private static boolean n5(byte[] var0, String[] var1, String[] var2, byte[][] var3) {
      var3[0] = null;
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var5 = new com.aspose.slides.internal.z0k.n5(var4);

         try {
            int var6 = var5.m3();
            if (var6 != var0.length - 4) {
               var1[0] = var2[0] = null;
               return false;
            }

            var5.k7();
            var2[0] = com.aspose.slides.internal.n8e.v4.n5(var5);
            var1[0] = com.aspose.slides.internal.n8e.v4.n5(var5);
            var5.z1();
            var5.z1();
            var5.k7();

            try {
               String var7 = r5p.n5(var5).n5();
            } catch (FormatException var19) {
               return false;
            }

            int var23 = var5.m3();
            if (var23 > 0) {
               var3[0] = var5.c8(var23);
               return !com.aspose.slides.ms.System.d1.n5(var1[0]);
            } else {
               var3[0] = null;
               return false;
            }
         } catch (EndOfStreamException var20) {
            var1[0] = var2[0] = null;
            return false;
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private static String n5(String var0, com.aspose.slides.internal.c8m.x8 var1) {
      try {
         return com.aspose.slides.internal.z0k.z1.a6(var0);
      } catch (ArgumentException var3) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, t5w.class)) {
            ((t5w)var1).n5(var3.toString(), 1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z5q.class)) {
            ((z5q)var1).n5(var3.toString(), 1);
         }

         return "";
      }
   }
}
