package com.aspose.slides.internal.z6z;

import com.aspose.slides.ms.System.d1;

public class x8 {
   public static byte[] n5(com.aspose.slides.internal.j7.n5 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      switch (var0.u9()) {
         case 4:
         case 5:
         case 8:
            var0.n5(var1, var0.u9());
            break;
         case 6:
         case 7:
            var0.n5(var1, 5);
            break;
         default:
            var0.l6(var1, 100);
      }

      return com.aspose.slides.internal.n2d.t4.l6(var1);
   }

   public static byte[] n5(byte[] var0) {
      if (a6(var0)) {
         return var0;
      }

      try {
         com.aspose.slides.internal.j7.n5 var1 = new com.aspose.slides.internal.j7.n5(var0);

         try {
            return n5(var1);
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } catch (RuntimeException var7) {
         return com.aspose.slides.internal.s5.s7.l6();
      }
   }

   private static boolean a6(byte[] var0) {
      int var1 = com.aspose.slides.internal.k4d.a6.l6(var0);
      switch (var1) {
         case 4:
            return l6(var0);
         case 5:
            return k5(var0);
         case 6:
         case 7:
         default:
            return false;
         case 8:
            return u3(var0);
      }
   }

   public static boolean l6(byte[] var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);
         var2.a6();

         for (int var3 = var2.a6(); (var3 & 65535 & 65520) != 65472 || (var3 & 65535) == 65476 || (var3 & 65535) == 65484; var3 = var2.a6()) {
            switch (var3) {
               case 65504:
               case 65505:
               case 65506:
               case 65517:
               case 65518:
                  return true;
               case 65507:
               case 65508:
               case 65509:
               case 65510:
               case 65511:
               case 65512:
               case 65513:
               case 65514:
               case 65515:
               case 65516:
               default:
                  int var4 = var2.a6();
                  var1.seek((var4 & 65535) - 2, 1);
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      return false;
   }

   public static boolean k5(byte[] var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);
         byte var3 = 8;
         var1.setPosition(8L);
         String var4 = d1.n5;
         String var5 = d1.n5;
         boolean var6 = true;

         while (var1.getPosition() <= var1.getLength() - 8L) {
            long var7 = var2.k5();
            String var9 = d1.n5(var2.l6(4));
            if (var6) {
               var4 = var9;
               var6 = false;
            }

            var5 = var9;
            var1.seek((var7 & 4294967295L) + 4L & 4294967295L, 1);
         }

         return "IHDR".equals(var4) && "IEND".equals(var5);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean u3(byte[] var0) {
      com.aspose.slides.internal.k4d.u9 var1 = new com.aspose.slides.internal.k4d.u9(var0);
      return var1.a6();
   }
}
