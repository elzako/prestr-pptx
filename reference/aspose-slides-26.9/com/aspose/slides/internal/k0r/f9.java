package com.aspose.slides.internal.k0r;

import com.aspose.slides.InvalidPasswordException;
import com.aspose.slides.PptReadException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;

public final class f9 {
   public static com.aspose.slides.internal.x1.x8 n5(com.aspose.slides.internal.x1.x8 var0, c4 var1, j2 var2, String var3) {
      c0 var4 = var1.l6();
      l3 var5 = var4.n5(var3);

      try {
         n5(var0, var5, var4);
         n5(var0, var5, var1, var2);
         n5(var0, var5);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var0;
   }

   private static void n5(com.aspose.slides.internal.x1.x8 var0, l3 var1, c0 var2) {
      if (!var2.k5.n5().n5()) {
         com.aspose.slides.internal.x1.u9 var3 = (com.aspose.slides.internal.x1.u9)var0.n5().u3("\u0005SummaryInformation");
         com.aspose.slides.internal.x1.u9 var4 = (com.aspose.slides.internal.x1.u9)var0.n5().u3("\u0005DocumentSummaryInformation");
         p3 var5 = new p3();
         var5.a6 = new a3[2];
         var5.u3 = 2L;
         a3 var6 = new a3();
         var6.n5 = 8L;
         var6.l6 = var3.n5().length & 4294967295L;
         var6.k5 = 0;
         var6.u3 = (byte)"\u0005SummaryInformation".length();
         var6.a6 = 1;
         var6.h0 = "\u0005SummaryInformation";
         var5.a6[0] = var6;
         c1 var7 = var1.n5(0L);
         byte[] var8 = var7.l6(var3.n5());
         var6 = new a3();
         var6.n5 = 8L + (var3.n5().length & 4294967295L) & 4294967295L;
         var6.l6 = var4.n5().length & 4294967295L;
         var6.k5 = 1;
         var6.u3 = (byte)"\u0005DocumentSummaryInformation".length();
         var6.a6 = 1;
         var6.h0 = "\u0005DocumentSummaryInformation";
         var5.a6[1] = var6;
         var7 = var1.n5(1L);
         byte[] var9 = var7.l6(var4.n5());
         var5.k5 = new byte[var8.length + var9.length];
         System.arraycopy(var8, 0, var5.k5, 0, var8.length);
         System.arraycopy(var9, 0, var5.k5, var8.length, var9.length);
         var5.n5 = (var5.k5.length & 4294967295L) + 8L & 4294967295L;
         var5.l6 = (4L + (var5.a6[0].n5() & 4294967295L) & 4294967295L) + (var5.a6[1].n5() & 4294967295L) & 4294967295L;
         com.aspose.slides.internal.x1.u9 var10 = new com.aspose.slides.internal.x1.u9("EncryptedSummary");
         var10.n5(var5.n5(var1));
         var0.n5().a6(var10);
         var0.n5().u9(var3);
         var0.n5().u9(var4);
         var4 = new com.aspose.slides.internal.x1.u9("\u0005DocumentSummaryInformation");
         var4.n5(com.aspose.slides.internal.n8e.e9.n5(com.aspose.slides.internal.n8e.e9.l6.k5()));
         var0.n5().a6(var4);
      }
   }

   private static void n5(com.aspose.slides.internal.x1.x8 var0, l3 var1, c4 var2, j2 var3) {
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(
         ((com.aspose.slides.internal.x1.u9)var0.n5().u3("PowerPoint Document")).n5()
      );

      for (int var5 = 0; var5 < var3.l6().size(); var5++) {
         long var6 = var3.l6().get_Item(var5).l6();
         if ((var2.c8() & 4294967295L) != (var3.l6().get_Item(var5).n5() & 4294967295L)) {
            var4.seek(var6 & 4294967295L, 0);
            byte[] var8 = com.aspose.slides.internal.n8e.y2.l6(var4, 8);
            int var9 = com.aspose.slides.internal.n8e.y2.k5(var8, 4);
            byte[] var10 = new byte[var9 + 8];
            var4.seek(var6 & 4294967295L, 0);
            var4.read(var10, 0, var9 + 8);
            c1 var11 = var1.n5(var3.l6().get_Item(var5).n5());
            byte[] var12 = var11.l6(var10);
            var4.seek(var6 & 4294967295L, 0);
            var4.write(var12, 0, var9 + 8);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.x1.x8 var0, l3 var1) {
      com.aspose.slides.internal.x1.u9 var2 = (com.aspose.slides.internal.x1.u9)var0.n5().u3("Pictures");
      if (var2 != null) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2.n5());
         int var4 = 0;

         while (var3.getLength() >= var4 + 8) {
            var3.setPosition(var4);
            byte[] var5 = com.aspose.slides.internal.n8e.y2.l6(var3, 8);
            c1 var6 = var1.n5(0L);
            byte[] var7 = var6.l6(var5);
            short var8 = com.aspose.slides.internal.n8e.y2.n5(var5, 0);
            int var9 = com.aspose.slides.internal.n8e.y2.n5(var5, 2);
            int var10 = com.aspose.slides.internal.n8e.y2.k5(var5, 4);
            if ((var9 & 65535) != 61447 && ((var9 & 65535) < 61464 || (var9 & 65535) > 61719) || var3.getLength() < var4 + var10 + 8) {
               break;
            }

            if ((var9 & 65535) == 61447) {
               throw new NotImplementedException();
            }

            switch (var9 & 65535) {
               case 61466:
               case 61467:
               case 61468:
                  var3.setPosition(var4 + 8L);
                  byte[] var30 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                  var6 = var1.n5(0L);
                  byte[] var31 = var6.l6(var30);
                  byte var32 = 16;
                  byte[] var33 = new byte[16];
                  if ((var8 & '\uffff') == 15696
                     || (var8 & '\uffff') == 981
                     || (var8 & '\uffff') == 8560
                     || (var8 & '\uffff') == 535
                     || (var8 & '\uffff') == 21552
                     || (var8 & '\uffff') == 1347) {
                     var3.setPosition(var4 + 8L + 16L);
                     byte[] var34 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                     var6 = var1.n5(0L);
                     var33 = var6.l6(var34);
                     var32 = 32;
                  }

                  var3.setPosition(var4 + 8L + var32);
                  byte[] var16 = com.aspose.slides.internal.n8e.y2.l6(var3, 34);
                  var6 = var1.n5(0L);
                  byte[] var17 = var6.l6(var16);
                  byte[] var35 = new byte[var10 - var32 - 34];
                  var3.seek(var4 + 8L + var32 + 34L, 0);
                  var3.read(var35, 0, var10 - var32 - 34);
                  var6 = var1.n5(0L);
                  byte[] var36 = var6.l6(var35);
                  var3.seek(var4, 0);
                  var3.write(var7, 0, 8);
                  var3.seek(var4 + 8L, 0);
                  var3.write(var31, 0, 16);
                  if (var32 == 32) {
                     var3.seek(var4 + 8L + 16L, 0);
                     var3.write(var33, 0, 16);
                  }

                  var3.seek(var4 + 8L + var32, 0);
                  var3.write(var17, 0, 34);
                  var3.seek(var4 + 8L + var32 + 34L, 0);
                  var3.write(var36, 0, var10 - var32 - 34);
                  break;
               case 61469:
               case 61470:
               case 61471:
               case 61481:
               case 61482:
                  var3.setPosition(var4 + 8L);
                  byte[] var11 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                  var6 = var1.n5(0L);
                  byte[] var12 = var6.l6(var11);
                  byte var13 = 16;
                  byte[] var14 = new byte[16];
                  if ((var8 & '\uffff') == 28176
                     || (var8 & '\uffff') == 1761
                     || (var8 & '\uffff') == 18096
                     || (var8 & '\uffff') == 1131
                     || (var8 & '\uffff') == 28208
                     || (var8 & '\uffff') == 1763
                     || (var8 & '\uffff') == 31376
                     || (var8 & '\uffff') == 1961
                     || (var8 & '\uffff') == 28240
                     || (var8 & '\uffff') == 1765) {
                     var3.setPosition(var4 + 8L + 16L);
                     byte[] var15 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                     var6 = var1.n5(0L);
                     var14 = var6.l6(var15);
                     var13 = 32;
                  }

                  var3.setPosition(var4 + 8L + var13);
                  byte[] var20 = com.aspose.slides.internal.n8e.y2.l6(var3, 1);
                  var6 = var1.n5(0L);
                  byte[] var21 = var6.l6(var20);
                  byte[] var18 = new byte[var10 - var13 - 1];
                  var3.seek(var4 + 8L + var13 + 1L, 0);
                  var3.read(var18, 0, var10 - var13 - 1);
                  var6 = var1.n5(0L);
                  byte[] var19 = var6.l6(var18);
                  var3.seek(var4, 0);
                  var3.write(var7, 0, 8);
                  var3.seek(var4 + 8L, 0);
                  var3.write(var12, 0, 16);
                  if (var13 == 32) {
                     var3.seek(var4 + 8L + 16L, 0);
                     var3.write(var14, 0, 16);
                  }

                  var3.seek(var4 + 8L + var13, 0);
                  var3.write(var21, 0, 1);
                  var3.seek(var4 + 8L + var13 + 1L, 0);
                  var3.write(var19, 0, var10 - var13 - 1);
                  break;
               case 61472:
               case 61473:
               case 61474:
               case 61475:
               case 61476:
               case 61477:
               case 61478:
               case 61479:
               case 61480:
               default:
                  throw new NotImplementedException();
            }

            var4 += var10 + 8;
         }
      }
   }

   public static void n5(com.aspose.slides.internal.x1.x8 var0, c4i var1, j2 var2, String var3, boolean var4, boolean[] var5) {
      byte[] var6 = ((com.aspose.slides.internal.x1.u9)var0.n5().u3("PowerPoint Document")).n5();
      n5(var0, var6, var1, var2, var3, var4, var5);
   }

   public static void n5(com.aspose.slides.internal.x1.x8 var0, byte[] var1, c4i var2, j2 var3, String var4, boolean var5, boolean[] var6) {
      com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2(var1);
      String var8 = var4 != null ? var4 : "/01Hannes Ruescher/01";
      int var9 = n5(var2.u9(), var3);
      var7.seek(var9, 0);
      c4 var10 = c4.n5(var7);
      c0 var11 = var10.l6();
      boolean var12 = false;
      boolean[] var13 = new boolean[]{false};
      l3 var14 = n5(var11, var10, var8, var5, var6, var13);
      var12 = var13[0];

      try {
         if (!var12) {
            var13[0] = var12;
            l3 var15 = n5(var11, var10, var4 != null ? "/01Hannes Ruescher/01" : var8, var5, var6, var13);
            var12 = var13[0];

            try {
               if (!var12) {
                  throw new InvalidPasswordException("Invalid password.");
               }

               n5(var0, var11, var15, var2, var3, var7);
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }
         } else {
            n5(var0, var11, var14, var2, var3, var7);
         }
      } finally {
         if (var14 != null) {
            var14.dispose();
         }
      }
   }

   public static boolean n5(com.aspose.slides.internal.x1.x8 var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      c0 var2 = null;
      c0[] var3 = new c0[]{var2};
      l3 var4 = n5(var0, var1, var3);
      var2 = var3[0];

      try {
         return var2.n5(var4);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public static boolean n5(com.aspose.slides.internal.x1.x8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      z1 var1 = l6(var0);
      return var1 != null;
   }

   public static boolean l6(com.aspose.slides.internal.x1.x8 var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      if (var1 == null) {
         throw new ArgumentNullException("password");
      }

      if (com.aspose.slides.ms.System.d1.a6(var1, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentException("The password argument value is empty.");
      }

      z1 var2 = l6(var0);
      return var2 == null ? false : com.aspose.slides.ms.System.d1.a6(var2.l6(), var1);
   }

   private static l3 n5(com.aspose.slides.internal.x1.x8 var0, String var1, c0[] var2) {
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(
         ((com.aspose.slides.internal.x1.u9)var0.n5().u3("PowerPoint Document")).n5()
      );

      try {
         y2 var4 = y2.n5(var0);
         c4i var5 = (c4i)e3.n5(var3, var4.l6() & 4294967295L, null);
         j2 var6 = (j2)e3.n5(var3, var5.k5(), null);
         int var7 = n5(var5.u9(), var6);
         var3.seek(var7, 0);
         c4 var8 = c4.n5(var3);
         var2[0] = var8.l6();
         return var2[0].n5(var1);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.x1.x8 var0, c0 var1, l3 var2, c4i var3, j2 var4, com.aspose.slides.internal.z0k.t4 var5) {
      n5(var0, var1, var2);
      n5(var3, var4, var5, var2);
      l6(var0, var2);
   }

   private static l3 n5(c0 var0, c4 var1, String var2, boolean var3, boolean[] var4, boolean[] var5) {
      l3 var6 = var0.n5(var2);
      var4[0] = !var1.l6().k5.n5().n5();
      var5[0] = true;
      if (!var3 && !var0.n5(var6)) {
         var5[0] = false;
      }

      return var6;
   }

   private static void n5(com.aspose.slides.internal.x1.x8 var0, c0 var1, l3 var2) {
      if (!var1.k5.n5().n5()) {
         com.aspose.slides.internal.x1.c8 var3 = var0.n5().u3("EncryptedSummary");
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(((com.aspose.slides.internal.x1.u9)var3).n5());
         p3 var5 = p3.n5(var4, var2);
         byte[] var6 = var5.n5(var2, (var5.u3 & 4294967295L) - 2L & 4294967295L);
         byte[] var7 = var5.n5(var2, (var5.u3 & 4294967295L) - 1L & 4294967295L);
         var0.n5().u9(var3);
         com.aspose.slides.internal.x1.u9 var8 = new com.aspose.slides.internal.x1.u9("\u0005SummaryInformation");
         var8.n5(var6);
         var0.n5().a6(var8);
         var0.n5().k5("\u0005DocumentSummaryInformation");
         com.aspose.slides.internal.x1.u9 var9 = new com.aspose.slides.internal.x1.u9("\u0005DocumentSummaryInformation");
         var9.n5(var7);
         var0.n5().a6(var9);
      }
   }

   private static void n5(c4i var0, j2 var1, com.aspose.slides.internal.z0k.t4 var2, l3 var3) {
      int var4 = n5(var0.u9(), var1);

      for (int var5 = 0; var5 < var1.l6().size(); var5++) {
         long var6 = var1.l6().get_Item(var5).l6();
         if ((var6 & 4294967295L) != var4) {
            var2.seek(var6 & 4294967295L, 0);
            byte[] var8 = com.aspose.slides.internal.n8e.y2.l6(var2, 8);
            c1 var9 = var3.n5(var1.l6().get_Item(var5).n5());
            byte[] var10 = var9.n5(var8);
            int var11 = com.aspose.slides.internal.n8e.y2.k5(var10, 4);
            byte[] var12 = new byte[var11 + 8];
            var2.seek(var6 & 4294967295L, 0);
            var2.read(var12, 0, var11 + 8);
            var9 = var3.n5(var1.l6().get_Item(var5).n5());
            byte[] var13 = var9.n5(var12);
            var2.seek(var6 & 4294967295L, 0);
            var2.write(var13, 0, var11 + 8);
         }
      }

      var1.l6(var0.u9());
   }

   private static void l6(com.aspose.slides.internal.x1.x8 var0, l3 var1) {
      com.aspose.slides.internal.x1.u9 var2 = (com.aspose.slides.internal.x1.u9)var0.n5().u3("Pictures");
      if (var2 != null) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2.n5());
         int var4 = 0;

         while (var3.getLength() >= var4 + 8) {
            var3.setPosition(var4);
            byte[] var5 = com.aspose.slides.internal.n8e.y2.l6(var3, 8);
            c1 var6 = var1.n5(0L);
            byte[] var7 = var6.n5(var5);
            short var8 = com.aspose.slides.internal.n8e.y2.n5(var7, 0);
            int var9 = com.aspose.slides.internal.n8e.y2.n5(var7, 2);
            int var10 = com.aspose.slides.internal.n8e.y2.k5(var7, 4);
            if ((var9 & 65535) != 61447 && ((var9 & 65535) < 61464 || (var9 & 65535) > 61719) || var3.getLength() < var4 + var10 + 8) {
               break;
            }

            if ((var9 & 65535) == 61447) {
               throw new NotImplementedException();
            }

            switch (var9 & 65535) {
               case 61466:
               case 61467:
               case 61468:
                  var3.setPosition(var4 + 8L);
                  byte[] var30 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                  var6 = var1.n5(0L);
                  byte[] var31 = var6.n5(var30);
                  byte var32 = 16;
                  byte[] var33 = new byte[16];
                  if ((var8 & '\uffff') == 15696
                     || (var8 & '\uffff') == 981
                     || (var8 & '\uffff') == 8560
                     || (var8 & '\uffff') == 535
                     || (var8 & '\uffff') == 21552
                     || (var8 & '\uffff') == 1347) {
                     var3.setPosition(var4 + 8L + 16L);
                     byte[] var34 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                     var6 = var1.n5(0L);
                     var33 = var6.n5(var34);
                     var32 = 32;
                  }

                  var3.setPosition(var4 + 8L + var32);
                  byte[] var16 = com.aspose.slides.internal.n8e.y2.l6(var3, 34);
                  var6 = var1.n5(0L);
                  byte[] var17 = var6.n5(var16);
                  byte[] var35 = new byte[var10 - var32 - 34];
                  var3.seek(var4 + 8L + var32 + 34L, 0);
                  var3.read(var35, 0, var10 - var32 - 34);
                  var6 = var1.n5(0L);
                  byte[] var36 = var6.n5(var35);
                  var3.seek(var4, 0);
                  var3.write(var7, 0, 8);
                  var3.seek(var4 + 8L, 0);
                  var3.write(var31, 0, 16);
                  if (var32 == 32) {
                     var3.seek(var4 + 8L + 16L, 0);
                     var3.write(var33, 0, 16);
                  }

                  var3.seek(var4 + 8L + var32, 0);
                  var3.write(var17, 0, 34);
                  var3.seek(var4 + 8L + var32 + 34L, 0);
                  var3.write(var36, 0, var10 - var32 - 34);
                  break;
               case 61469:
               case 61470:
               case 61471:
               case 61481:
               case 61482:
                  var3.setPosition(var4 + 8L);
                  byte[] var11 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                  var6 = var1.n5(0L);
                  byte[] var12 = var6.n5(var11);
                  byte var13 = 16;
                  byte[] var14 = new byte[16];
                  if ((var8 & '\uffff') == 28176
                     || (var8 & '\uffff') == 1761
                     || (var8 & '\uffff') == 18096
                     || (var8 & '\uffff') == 1131
                     || (var8 & '\uffff') == 28208
                     || (var8 & '\uffff') == 1763
                     || (var8 & '\uffff') == 31376
                     || (var8 & '\uffff') == 1961
                     || (var8 & '\uffff') == 28240
                     || (var8 & '\uffff') == 1765) {
                     var3.setPosition(var4 + 8L + 16L);
                     byte[] var15 = com.aspose.slides.internal.n8e.y2.l6(var3, 16);
                     var6 = var1.n5(0L);
                     var14 = var6.n5(var15);
                     var13 = 32;
                  }

                  var3.setPosition(var4 + 8L + var13);
                  byte[] var20 = com.aspose.slides.internal.n8e.y2.l6(var3, 1);
                  var6 = var1.n5(0L);
                  byte[] var21 = var6.n5(var20);
                  byte[] var18 = new byte[var10 - var13 - 1];
                  var3.seek(var4 + 8L + var13 + 1L, 0);
                  var3.read(var18, 0, var10 - var13 - 1);
                  var6 = var1.n5(0L);
                  byte[] var19 = var6.n5(var18);
                  var3.seek(var4, 0);
                  var3.write(var7, 0, 8);
                  var3.seek(var4 + 8L, 0);
                  var3.write(var12, 0, 16);
                  if (var13 == 32) {
                     var3.seek(var4 + 8L + 16L, 0);
                     var3.write(var14, 0, 16);
                  }

                  var3.seek(var4 + 8L + var13, 0);
                  var3.write(var21, 0, 1);
                  var3.seek(var4 + 8L + var13 + 1L, 0);
                  var3.write(var19, 0, var10 - var13 - 1);
                  break;
               case 61472:
               case 61473:
               case 61474:
               case 61475:
               case 61476:
               case 61477:
               case 61478:
               case 61479:
               case 61480:
               default:
                  throw new NotImplementedException();
            }

            var4 += var10 + 8;
         }
      }
   }

   private static int n5(long var0, j2 var2) {
      return var2.n5(var0) != null ? (int)var2.n5(var0).l6() : -1;
   }

   private static z1 l6(com.aspose.slides.internal.x1.x8 var0) {
      com.aspose.slides.internal.x1.c8 var1 = var0.n5().u3("PowerPoint Document");
      if (var1 == null) {
         throw new PptReadException("The PowerPoint Document file entry is not found.");
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(((com.aspose.slides.internal.x1.u9)var1).n5());
      y2 var3 = y2.n5(var0);
      if (var3 == null) {
         throw new PptReadException("The CurrentUserAtom record in the document file system is not found.");
      }

      c4i[] var4 = new c4i[]{(c4i)e3.n5(var2, var3.l6() & 4294967295L, null)};
      if (var4[0] == null) {
         throw new PptReadException("The UserEditAtom record in the document file system is not found.");
      }

      j2 var5 = (j2)e3.n5(var2, var4[0].k5(), null);
      if (var5 == null) {
         throw new PptReadException("The PersistDirectoryAtom record in the document file system is not found.");
      }

      boolean var6 = false;
      if ((var4[0].u9() & 4294967295L) != 0L && var5.n5(var4[0].u9()) != null) {
         boolean[] var7 = new boolean[]{false};
         n5(var0, var4[0], var5, null, false, var7);
         var6 = var7[0];
      }

      int var10 = var5.l6().findIndex(new f9$1(var4));
      if (var10 != -1 && var5.l6().get_Item(var10).l6() != 4294967295L) {
         t1 var8 = (t1)e3.n5(var2, var5.l6().get_Item(var10).l6() & 4294967295L, null);
         if (var8 == null) {
            throw new PptReadException("The DocumentContainer record in the document file system is not found.");
         } else {
            return var8.z1() != null && var8.z1().u3() != null && var8.z1().u3().u3() != null ? var8.z1().u3().u3().z3() : null;
         }
      } else {
         throw new PptReadException("The DocumentContainer record in the document file system is not found.");
      }
   }
}
