package com.aspose.slides.internal.f3l;

import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.o9b.z1;
import java.awt.Font;

public class k5 {
   private static com.aspose.slides.internal.v7u.n5 n5 = null;

   public static com.aspose.slides.internal.v7u.n5 n5() {
      return n5;
   }

   public static float n5(n3 var0, int var1) {
      y4 var2 = var0.l6();
      int var3 = var2.k5(var1);
      return n5(var2, var0, var1, var3);
   }

   public static float l6(n3 var0, int var1) {
      y4 var2 = var0.l6();
      int var3 = var2.a6(var1);
      return n5(var2, var0, var1, var3);
   }

   public static float k5(n3 var0, int var1) {
      y4 var2 = var0.l6();
      int var3 = var2.h0(var1);
      return n5(var2, var0, var1, var3);
   }

   public static float u3(n3 var0, int var1) {
      y4 var2 = var0.l6();
      int var3 = var2.h0(var1) - var2.k5(var1) - var2.a6(var1);
      return n5(var2, var0, var1, var3);
   }

   public static float n5(y4 var0, n3 var1, int var2, int var3) {
      float var4 = var1.z1().getSize2D();
      return n5(var4, var0.u9(var2), var3);
   }

   public static float n5(float var0, float var1, int var2) {
      return var2 * var0 / var1;
   }

   public static boolean n5(y4 var0) {
      return var0.c8(2) && !var0.c8(0);
   }

   public static float n5(float var0, int var1, z1 var2) {
      int var3 = var2 == null ? 1 : var2.e2();
      float var4 = 1.0F;
      return (float)com.aspose.slides.internal.r5w.n5.n5(var1, var3, (double)var0) / var4;
   }

   public static String n5(n3 var0, String var1) {
      if (var1.contains("…") && var0.z1().canDisplayUpTo(var1) != -1) {
         String var2 = var1.replaceAll("…", "...");
         if (var0.z1().canDisplayUpTo(var2) == -1) {
            var1 = var2;
         }
      }

      return var1;
   }

   public static n3 l6(n3 var0, String var1) {
      return n5(var0, var1, 0);
   }

   public static n3 n5(n3 var0, String var1, int var2) {
      String[] var3 = l6.z7();
      n5[] var4 = com.aspose.slides.internal.f3l.n5.n5();

      for (String var8 : var3) {
         if (var8.equalsIgnoreCase(var0.h0())) {
            return var0;
         }
      }

      int var24 = n3.n5(var0).canDisplayUpTo(var1);
      if (var24 == -1) {
         return var0;
      }

      boolean[] var25 = new boolean[var4.length];

      for (n5 var10 : var4) {
         var25[var10.ordinal()] = false;
      }

      int var27 = 0;
      char[] var29 = var1.toCharArray();
      int var30 = Math.min(var29.length, 100);

      for (int var31 = var24; var31 < var30 && var27 < var25.length; var31++) {
         for (n5 var14 : var4) {
            if (!var25[var14.ordinal()]) {
               int[][] var15 = l6.n5(var14);
               if (var15 != null) {
                  for (int var16 = 0; var16 < var15.length; var16++) {
                     if (var29[var31] >= var15[var16][0] && var29[var31] <= var15[var16][1]
                        || var29[var31] == ' ' && var14 == com.aspose.slides.internal.f3l.n5.f2) {
                        var25[var14.ordinal()] = true;
                        var27++;
                        break;
                     }
                  }
               }
            }
         }
      }

      n3 var32 = new n3(y4.k5(), 10.0F);
      int var33 = 0;
      Font[][] var34 = l6.n5().k5();
      String[][] var35 = l6.n5().l6();

      for (int var36 = 0; var36 < var4.length; var36++) {
         for (int var37 = 0; var37 < var34[var36].length; var37++) {
            Font var38 = var34[var36][var37];
            String var17 = var34[var36].length > var35[var36].length ? var38.getFamily() : var35[var36][var37];
            if (!var32.h0().equalsIgnoreCase(var38.getName()) || var32.h0().equalsIgnoreCase(var17)) {
               int var18 = var38.canDisplayUpTo(var1);
               if (var18 == -1 && (var36 < var4.length && var25[var36] || var36 >= var4.length && var27 > 0)) {
                  if (var2 <= var33 || var37 >= var35[var36].length - 1) {
                     float var19 = l6.n5().l6(var4[var36]);
                     n3 var20 = new n3(var17, var0.c8() * var19, var0.x8(), var0.y4(), var0.k5(), var0.u3());
                     if (var19 != 1.0F) {
                        return var20;
                     }

                     float var21 = n5(var0, var0.x8()) + l6(var0, var0.x8());
                     float var22 = n5(var20, var20.x8()) + l6(var20, var20.x8());
                     if (var22 < var21) {
                        float var23 = var21 / var22;
                        var23 = Math.min(var23, 1.1F);
                        var20 = new n3(var20.l6(), var20.c8() * var23, var20.x8(), var20.y4(), var20.k5(), var20.u3());
                     }

                     return var20;
                  }

                  var33++;
               }
            }
         }
      }

      return var0;
   }

   public static String n5(String var0, String var1) {
      for (String var5 : l6.u3()) {
         if (var5.equalsIgnoreCase(var0)) {
            char[] var6 = var1.toCharArray();
            if (var6.length == 1 && var6[0] == 8226 && "Symbol".equals(var0)) {
               return var1;
            }

            for (int var7 = 0; var7 < var6.length; var7++) {
               var6[var7] = (char)(var6[var7] | 61440);
            }

            return new String(var6);
         }
      }

      return var1;
   }

   public static boolean n5(String var0) {
      if (var0 != null) {
         for (String var4 : l6.u3()) {
            if (var4.equalsIgnoreCase(var0)) {
               return true;
            }
         }
      }

      return false;
   }

   public static y4 l6(String var0) {
      try {
         return new y4(var0, n5);
      } catch (Exception var2) {
         return y4.k5();
      }
   }

   public static y4 k5(String var0) {
      try {
         return new y4(var0);
      } catch (Exception var2) {
         return null;
      }
   }

   public static boolean k5(n3 var0, String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         if (com.aspose.slides.internal.n1b.a6.n5(var1.codePointAt(var2))) {
            return false;
         }
      }

      return true;
   }
}
