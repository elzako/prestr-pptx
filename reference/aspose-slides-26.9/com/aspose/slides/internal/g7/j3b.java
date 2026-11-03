package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class j3b {
   public static byte n5(int var0, int var1, int var2) {
      byte var3 = 16;
      int var4 = var1 + var2;
      int var5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var2) - 1.0, 14);
      if (var4 > 16) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("incorrect arguments Offset={0}, Length = {1} in bit extraction",new Object[]{ var1, var2}));
      }

      byte var6 = 0;
      if (var4 < 16) {
         var6 = (byte)((var0 & 65535) >> 16 - var4);
         var6 = (byte)(var6 & var5);
      } else {
         var6 = (byte)(var0 & 65535 & var5);
      }

      int var7 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var2 - 1), 14);
      if ((var6 & var7) == 0) {
         return var6;
      }

      var6 = (byte)(~var6 + 1);
      var6 = (byte)(var6 & var5);
      return (byte)(-var6);
   }

   public static boolean n5(r9 var0, b8c var1, p6r var2) {
      if (b8c.n5(var1.n5().l6(var0)) != 3) {
         return false;
      }

      if (var2.l6().n5()) {
         return true;
      }

      if (var2.l6().l6()) {
         if ((var2.k5() & 65535) > var1.k5().l6().length - 1) {
            throw new r7c(
               com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "Incorrect value of MarkFilteringSet field = {0} ", "for lookup type = {1}, when UseMarkFilteringSet bit is true"
                  }),new Object[]{
                  var2.k5(),
                  var2.n5()
               })
            );
         } else {
            return var1.k5().l6()[var2.k5() & 65535].l6(var0);
         }
      } else if ((var2.l6().k5() & 255) != 0) {
         if (var1.l6() == null) {
            throw new r7c(
               com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "MarkAttachmentType field = {0} in lookup with type = {1}",
                     " is not zero but Mark Attachment Class Definition table is absent",
                     " in GDEF table"
                  }),new Object[]{
                  var2.l6().k5(),
                  var2.n5()
               })
            );
         } else {
            return var1.l6().l6(var0) != (var2.l6().k5() & 255);
         }
      } else {
         return false;
      }
   }

   public static void n5(p5k var0, g2x var1, int[] var2, int[] var3) {
      var2[0] = var0.k5();
      var3[0] = var0.u3();
      switch (var0.l6()) {
         case 3:
            if ((var1.u3() & 65535) != 0) {
               var2[0] += var0.a6().n5(var1.u3() & 65535);
            }

            if ((var1.a6() & 65535) != 0) {
               var3[0] += var0.a6().n5(var1.a6() & 65535);
            }
         case 1:
         case 2:
      }
   }

   public static void n5(o9i var0, o5k var1, g2x var2) {
      if ((var0.s7() & 65535 & 1) != 0) {
         var1.u3(var1.n5() + (var0.l6() & 65535));
      }

      if ((var0.s7() & 65535 & 2) != 0) {
         var1.a6(var1.l6() + (var0.k5() & 65535));
      }

      if ((var0.s7() & 65535 & 4) != 0) {
         var1.u9(var1.k5() + (var0.u3() & 65535));
      }

      if ((var0.s7() & 65535 & 8) != 0) {
         var1.h0(var1.u3() + (var0.a6() & 65535));
      }

      if ((var0.s7() & 65535 & 16) != 0 && (var2.u3() & 65535) != 0) {
         var1.u3(var1.n5() + var0.u9().n5(var2.u3() & 65535));
      }

      if ((var0.s7() & 65535 & 32) != 0 && (var2.a6() & 65535) != 0) {
         var1.a6(var1.l6() + var0.h0().n5(var2.a6() & 65535));
      }

      if ((var0.s7() & 65535 & 64) != 0 && (var2.u3() & 65535) != 0) {
         var1.u9(var1.k5() + var0.c8().n5(var2.u3() & 65535));
      }

      if ((var0.s7() & 65535 & 128) != 0 && (var2.a6() & 65535) != 0) {
         var1.h0(var1.u3() + var0.t2().n5(var2.a6() & 65535));
      }
   }

   public static boolean n5(g2x var0, int var1, int[] var2, f1c var3, boolean var4) {
      l6(var0, var1, var2, var4);

      for (int var5 = 0; var5 < var2.length; var5++) {
         r9 var6 = var4 ? var0.n5().get_Item(var1 + 1 + var5).n5() : var0.n5().get_Item(var1 - 1 - var5).n5();
         int var7 = var3.l6(var6);
         if ((var2[var5] & 65535) != var7) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(g2x var0, int var1, int[] var2, boolean var3) {
      if (!l6(var0, var1, var2, var3)) {
         return false;
      }

      for (int var4 = 0; var4 < var2.length; var4++) {
         r9 var5 = var3 ? var0.n5().get_Item(var1 + 1 + var4).n5() : var0.n5().get_Item(var1 - 1 - var4).n5();
         k2 var6 = new k2(var2[var4] & 65535);
         if (r9.n5(var5, var6)) {
            return false;
         }
      }

      return true;
   }

   private static boolean l6(g2x var0, int var1, int[] var2, boolean var3) {
      int var4 = 0;
      if (var3) {
         var4 = var1 + var2.length;
         if (var4 > var0.l6() - 1) {
            return false;
         }
      } else {
         var4 = var1 - var2.length;
         if (var4 < 0) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(long var0, int var2) {
      byte var3 = 32;
      if ((var2 & 65535) > 31) {
         return false;
      }

      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var2 & 65535), 14);
      return (var0 & 4294967295L & var4 & 4294967295L) != 0L;
   }

   public static String n5(u0a var0, int var1, String var2) {
      byte var3 = k5(var0, var1, var2);
      if (var3 == 123) {
         return n5(var0, var1, new String[]{"DFLT"});
      }

      switch (var3) {
         case 0:
         case 1:
         case 2:
         case 3:
            return n5(var0, var1, new String[]{"latn"});
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         default:
            return n5(var0, var1, new String[]{"DFLT"});
         case 13:
            return n5(var0, var1, new String[]{"arab"});
         case 15:
            return n5(var0, var1, new String[]{"deva", "dev2"});
         case 21:
            return n5(var0, var1, new String[]{"telu", "tel2"});
      }
   }

   private static boolean l6(u0a var0, int var1, String var2) {
      a2w var3 = var1 == 1 ? var0.l6().z3().n5().n5(var2) : var0.l6().q0().n5().n5(var2);
      return var3 != null;
   }

   private static String n5(u0a var0, int var1, String[] var2) {
      for (String var6 : var2) {
         if (l6(var0, var1, var6)) {
            return var6;
         }
      }

      return null;
   }

   private static byte k5(u0a var0, int var1, String var2) {
      if (var0.l6().t4() == null) {
         return 123;
      }

      List var3 = new List();

      for (int var4 = 0; var4 < 123; var4++) {
         byte var5;
         if (var4 < 32) {
            var5 = 0;
         } else if (var4 < 64) {
            var5 = 1;
         } else if (var4 < 96) {
            var5 = 2;
         } else {
            var5 = 3;
         }

         long var6 = var0.l6().t4().z1()[var5];
         if (n5(var6, var4 - var5 * 32 & 65535)) {
            var3.addItem((byte)var4);
         }
      }

      byte var13 = 123;
      if (var3.size() != 0) {
         List$Enumerator var8 = var3.iterator();

         try {
            while (var8.hasNext()) {
               byte var9 = com.aspose.slides.internal.v6g.k5.u3(var8.next(), byte.class);
               if (n5(var2, var9)) {
                  var13 = var9;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }

      return var13 != 123 ? var13 : n5(var2);
   }

   private static boolean n5(String var0, byte var1) {
      if (var0.length() == 0) {
         return false;
      }

      j3b$n5 var2 = n5(var1);
      return !n5(var0.charAt(0), var2) ? false : n5(var0, var2);
   }

   private static boolean n5(String var0, j3b$n5 var1) {
      for (int var2 = 1; var2 < var0.length(); var2++) {
         if (!n5(var0.charAt(var2), var1)) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(char var0, j3b$n5 var1) {
      return var1.n5(var0) || l6(var0);
   }

   private static j3b$n5 n5(byte var0) {
      switch (var0) {
         case 0:
            return j3b$n5.a6;
         case 1:
            return j3b$n5.u9;
         case 2:
            return j3b$n5.h0;
         case 3:
            return j3b$n5.c8;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         default:
            return j3b$n5.u3;
         case 13:
            return j3b$n5.s7;
         case 15:
            return j3b$n5.t2;
      }
   }

   private static byte n5(String var0) {
      if (var0.length() == 0) {
         return 123;
      }

      j3b$n5 var1 = n5(var0.charAt(0));
      return n5(var0, var1) ? var1.k5 : 123;
   }

   private static j3b$n5 n5(char var0) {
      for (j3b$n5 var4 : j3b$n5.n3) {
         if (var4.n5(var0)) {
            return var4;
         }
      }

      return j3b$n5.u3;
   }

   private static boolean l6(char var0) {
      return j3b$n5.a6.n5(var0);
   }
}
