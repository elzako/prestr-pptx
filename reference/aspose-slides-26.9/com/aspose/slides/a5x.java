package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.k4y.d1n;
import com.aspose.slides.internal.k4y.l7p;
import com.aspose.slides.internal.k4y.t3k;
import com.aspose.slides.ms.System.IDisposable;

class a5x {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "m",
      "c",
      "v",
      "l",
      "r",
      "e",
      "val",
      "sum",
      "prod",
      "product",
      "mid",
      "abs",
      "min",
      "max",
      "if",
      "mod",
      "atan",
      "sin",
      "cos",
      "cosatan2",
      "sinatan2",
      "sqrt",
      "tan",
      "nf",
      "ns",
      "x"
   );

   public static com.aspose.slides.internal.x4g.s7[] n5(com.aspose.slides.internal.k4y.m1 var0, float var1, float var2) {
      String var3 = var0.z3();
      if (var3 != null && var3.length() > 0) {
         long var4 = 0L;
         long var6 = 0L;
         String var8 = var0.u3();
         if (var8 != null && var8.length() > 0) {
            String[] var9 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var8, " ", ""), ',');
            var4 = com.aspose.slides.ms.System.Xml.f4.t9(var9[0]);
            var6 = com.aspose.slides.ms.System.Xml.f4.t9(var9[1]);
         }

         long var10 = 1000L;
         long var12 = 1000L;
         String var14 = var0.k5();
         if (var14 != null && var14.length() > 0) {
            String[] var15 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var14, " ", ""), ',');
            var10 = com.aspose.slides.ms.System.Xml.f4.t9(var15[0]);
            var12 = com.aspose.slides.ms.System.Xml.f4.t9(var15[1]);
         }

         var3 = com.aspose.slides.ms.System.d1.u9(var3);
         int var35 = 0;
         int[] var16 = new int[]{0};
         String var17 = n5(var3, var16);
         var35 = var16[0];
         var16[0] = var35;
         String[] var18 = l6(var3, var16);
         var35 = var16[0];
         float var19 = 0.0F;
         float var20 = 0.0F;
         com.aspose.slides.internal.x4g.s7 var21 = null;
         List var22 = new List();

         while (var17.length() > 0) {
            int var23 = 0;
            switch (n5.n5(var17)) {
               case 0:
                  var21 = new com.aspose.slides.internal.x4g.s7();
                  var19 = com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                  var20 = com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                  break;
               case 1:
                  while (var23 < var18.length) {
                     float var56 = n5(var19, (float)var4, var10, var1);
                     float var60 = n5(var20, (float)var6, var12, var2);
                     float var63 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]), (float)var4, var10, var1);
                     float var66 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]), (float)var6, var12, var2);
                     float var68 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]), (float)var4, var10, var1);
                     float var70 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]), (float)var6, var12, var2);
                     var19 = com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     var20 = com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     float var71 = n5(var19, (float)var4, var10, var1);
                     float var72 = n5(var20, (float)var6, var12, var2);
                     var21.n5(var56, var60, var63, var66, var68, var70, var71, var72);
                  }
                  break;
               case 2:
                  while (var23 < var18.length) {
                     float var55 = n5(var19, (float)var4, var10, var1);
                     float var59 = n5(var20, (float)var6, var12, var2);
                     float var62 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]) + var19, (float)var4, var10, var1);
                     float var65 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]) + var20, (float)var6, var12, var2);
                     float var67 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]) + var19, (float)var4, var10, var1);
                     float var69 = n5(com.aspose.slides.ms.System.n1.n5(var18[var23++]) + var20, (float)var6, var12, var2);
                     float var30 = var19 + com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     float var31 = var20 + com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     float var32 = n5(var30, (float)var4, var10, var1);
                     float var33 = n5(var31, (float)var6, var12, var2);
                     var21.n5(var55, var59, var62, var65, var67, var69, var32, var33);
                     var19 = var30;
                     var20 = var31;
                  }
                  break;
               case 3:
                  while (var23 < var18.length) {
                     float var54 = n5(var19, (float)var4, var10, var1);
                     float var58 = n5(var20, (float)var6, var12, var2);
                     var19 = com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     var20 = com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     float var61 = n5(var19, (float)var4, var10, var1);
                     float var64 = n5(var20, (float)var6, var12, var2);
                     var21.l6(var54, var58, var61, var64);
                  }
                  break;
               case 4:
                  while (var23 < var18.length) {
                     float var24 = n5(var19, (float)var4, var10, var1);
                     float var25 = n5(var20, (float)var6, var12, var2);
                     float var26 = var19 + com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     float var27 = var20 + com.aspose.slides.ms.System.n1.n5(var18[var23++]);
                     float var28 = n5(var26, (float)var4, var10, var1);
                     float var29 = n5(var27, (float)var6, var12, var2);
                     var21.l6(var24, var25, var28, var29);
                     var19 = var26;
                     var20 = var27;
                  }
                  break;
               case 5:
                  var22.addItem(var21);
                  var21 = null;
            }

            var16[0] = var35;
            var17 = n5(var3, var16);
            var35 = var16[0];
            var16[0] = var35;
            var18 = l6(var3, var16);
            var35 = var16[0];
         }

         com.aspose.slides.internal.x4g.s7[] var53 = new com.aspose.slides.internal.x4g.s7[var22.size()];

         for (int var57 = 0; var57 < var22.size(); var57++) {
            var53[var57] = (com.aspose.slides.internal.x4g.s7)var22.get_Item(var57);
         }

         return var53;
      } else {
         return new com.aspose.slides.internal.x4g.s7[0];
      }
   }

   private static float n5(float var0, float var1, long var2, float var4) {
      return (var0 - var1) * var4 / (float)var2;
   }

   private static String n5(String var0, int[] var1) {
      if (var1[0] >= 0 && var1[0] < var0.length()) {
         while (var0.charAt(var1[0]) == ' ' && var1[0] < var0.length()) {
            var1[0]++;
         }

         while (var0.charAt(var1[0]) == ',' && var1[0] < var0.length()) {
            var1[0]++;
         }

         while (var0.charAt(var1[0]) == ' ' && var1[0] < var0.length()) {
            var1[0]++;
         }

         if (var1[0] >= var0.length()) {
            return com.aspose.slides.ms.System.d1.n5;
         } else {
            int var2 = var1[0];
            char var3 = var0.charAt(var1[0]);
            if (var3 != 'n' && var3 != 'a' && var3 != 'q' && var3 != 'w') {
               var1[0]++;
               return com.aspose.slides.ms.System.t9.q0(var3);
            } else {
               var1[0]++;
               return com.aspose.slides.ms.System.d1.l6(var0, var2, var1[0] - var2);
            }
         }
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   private static String[] l6(String var0, int[] var1) {
      if (var1[0] >= 0 && var1[0] < var0.length()) {
         while (var0.charAt(var1[0]) == ' ' && var1[0] < var0.length()) {
            var1[0]++;
         }

         if (var1[0] >= var0.length()) {
            return null;
         }

         int var2 = var1[0];

         while (var0.charAt(var1[0]) == ',' && var1[0] < var0.length()) {
            var1[0]++;
         }

         while (var0.charAt(var1[0]) == ' ' && var1[0] < var0.length()) {
            var1[0]++;
         }

         for (char var3 = var0.charAt(var1[0]); var3 >= '0' && var3 <= '9' || var3 == '-' || var3 == ',' || var3 == ' '; var3 = var0.charAt(var1[0])) {
            var1[0]++;
            if (var1[0] >= var0.length()) {
               break;
            }
         }

         String var4 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var0, var2, var1[0] - var2), " ", "");
         String[] var5 = com.aspose.slides.ms.System.d1.n5(var4, ',');

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].length() == 0) {
               var5[var6] = "0";
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.m1 var1, l7p var2) {
      long[] var3 = n5(var1.q0(), 10000L);
      if (var2 != null) {
         float var4 = var2.e2();
         var0.setShapeType(s1f.n5(com.aspose.slides.internal.v6g.k5.u3(var4, 13)));
         if (var0.getShapeType() == 41 && var3.length > 1) {
            var3[1] /= 2L;
         }

         int[] var5 = new int[var3.length];

         for (int var6 = 0; var6 < var3.length; var6++) {
            var5[var6] = (int)var3[var6];
         }

         s1f.n5(var0.e2().l6(), var0.getShapeType(), var5, var0.getRawFrame().getWidth(), var0.getRawFrame().getHeight());
      }

      if (var0.getShapeType() == -1 || var0.getShapeType() == 0) {
         n5(var0, var2);

         for (int var7 = 0; var7 < var3.length && var7 < var0.getAdjustments().size(); var7++) {
            var0.getAdjustments().get_Item(var7).setRawValue(var3[var7]);
         }
      }
   }

   private static void n5(GeometryShape var0, l7p var1) {
      if (var1 != null && var0 != null) {
         try {
            u3k var2 = var0.e2().n5();
            var2.n5(0);
            u3k var3 = n5(var1);
            var2.n5(var3.n5());
            var2.n5(var3.a6());
            var2.n5(var3.u3());
         } catch (RuntimeException var4) {
            var0.setShapeType(5);
         }
      }
   }

   private static u3k n5(com.aspose.slides.internal.k4y.m1 var0) {
      long var1 = 0L;
      long var3 = 0L;
      long var5 = 0L;
      long var7 = 0L;
      long[] var9 = new long[]{0L};
      long[] var10 = new long[]{0L};
      long[] var11 = new long[]{0L};
      long[] var12 = new long[]{0L};
      n5(var0, var9, var10, var11, var12);
      var1 = var9[0];
      var3 = var10[0];
      var5 = var11[0];
      var7 = var12[0];
      return new u3k(l6(var0), k5(var0), null, null, a6(var0), new y1(var1, var3), new y1(var1 + var5, var3 + var7));
   }

   private static y2[] l6(com.aspose.slides.internal.k4y.m1 var0) {
      long[] var1 = n5(var0.q0(), 10000L);
      y2[] var2 = new y2[var1.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = new y2(com.aspose.slides.ms.System.d1.n5(new String[]{"adj", com.aspose.slides.ms.System.a3.l6(var3)}), var1[var3]);
      }

      return var2;
   }

   private static r8e[] k5(com.aspose.slides.internal.k4y.m1 var0) {
      com.aspose.slides.internal.k4y.j2b var1 = (com.aspose.slides.internal.k4y.j2b)var0.n5("formulas");
      if (var1 == null) {
         return new r8e[0];
      }

      Dictionary var2 = u3(var0);
      com.aspose.slides.internal.k4y.w0o[] var3 = var1.l6();
      r8e[] var4 = new r8e[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = n5(var5, com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var3[var5].n5()), ' '), var2);
      }

      return var4;
   }

   private static Dictionary<String, Long> u3(com.aspose.slides.internal.k4y.m1 var0) {
      Dictionary var1 = new Dictionary();
      long[] var2 = n5(var0.k5(), 10000L);
      long var3 = var2.length == 2 ? var2[0] : 10000L;
      long var5 = var2.length == 2 ? var2[1] : 10000L;
      long[] var7 = n5(var0.u3(), 0L);
      long var8 = var7.length == 2 ? var7[0] : 0L;
      long var10 = var7.length == 2 ? var7[1] : 0L;
      var1.addItem("width", var3);
      var1.addItem("height", var5);
      var1.addItem("xcenter", var8 + var3 / 2L);
      var1.addItem("ycenter", var10 + var5 / 2L);
      var1.addItem("pixellinewidth", 0L);
      var1.addItem("pixelwidth", var3 * 72L / 96L);
      var1.addItem("pixelheight", var5 * 72L / 96L);
      var1.addItem("emuwidth", var3 / 12700L);
      var1.addItem("emuheight", var5 / 12700L);
      var1.addItem("emuwidth2", var3 / 2L / 12700L);
      var1.addItem("emuheight2", var5 / 2L / 12700L);
      t3k var12 = (t3k)var0.n5("path");
      if (var12 != null) {
         long[] var13 = n5(var12.n5(), 0L);
         if (var13.length == 2) {
            var1.addItem("xlimo", var13[0]);
            var1.addItem("ylimo", var13[2]);
         }
      }

      d1n var15 = (d1n)var0.n5("stroke");
      if (var15 != null) {
         var1.addItem("linedrawn", (long)(com.aspose.slides.internal.k4y.m1.n5(var15.n5(), true) ? 1 : 0));
         var1.addItem("hasstroke", (long)(com.aspose.slides.internal.k4y.m1.n5(var15.n5(), true) ? 1 : 0));
      } else {
         var1.addItem("linedrawn", 0L);
         var1.addItem("hasstroke", 0L);
      }

      com.aspose.slides.internal.k4y.e6k var14 = (com.aspose.slides.internal.k4y.e6k)var0.n5("fill");
      if (var14 != null) {
         var1.addItem("hasfill", (long)(com.aspose.slides.internal.k4y.m1.n5(var14.l6(), true) ? 1 : 0));
      } else {
         var1.addItem("hasfill", 0L);
      }

      return var1;
   }

   private static r8e n5(int var0, String[] var1, Dictionary<String, Long> var2) {
      switch (n5.n5(var1[0])) {
         case 6:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)11, 0L, n5(var1[1], var2), 50000L);
         case 7:
            return new r8e(
               com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}),
               (byte)1,
               n5(var1[1], var2),
               n5(var1[2], var2),
               n5(var1[3], var2)
            );
         case 8:
         case 9:
            return new r8e(
               com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}),
               (byte)0,
               n5(var1[1], var2),
               n5(var1[2], var2),
               n5(var1[3], var2)
            );
         case 10:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)2, n5(var1[1], var2), n5(var1[2], var2), 2L);
         case 11:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)4, n5(var1[1], var2), 0L, 0L);
         case 12:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)9, n5(var1[1], var2), n5(var1[2], var2), 0L);
         case 13:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)8, n5(var1[1], var2), n5(var1[2], var2), 0L);
         case 14:
            return new r8e(
               com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}),
               (byte)3,
               n5(var1[1], var2),
               n5(var1[2], var2),
               n5(var1[3], var2)
            );
         case 15:
            return new r8e(
               com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}),
               (byte)10,
               n5(var1[1], var2),
               n5(var1[2], var2),
               n5(var1[3], var2)
            );
         case 16:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)5, n5(var1[1], var2), n5(var1[2], var2), 0L);
         case 17:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)13, n5(var1[1], var2), n5(var1[2], var2), 0L);
         case 18:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)7, n5(var1[1], var2), n5(var1[2], var2), 0L);
         case 19:
            return new r8e(
               com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}),
               (byte)6,
               n5(var1[1], var2),
               n5(var1[2], var2),
               n5(var1[3], var2)
            );
         case 20:
            return new r8e(
               com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}),
               (byte)12,
               n5(var1[1], var2),
               n5(var1[2], var2),
               n5(var1[3], var2)
            );
         case 21:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)14, n5(var1[1], var2), 0L, 0L);
         case 22:
            return new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"g_", com.aspose.slides.ms.System.a3.l6(var0)}), (byte)15, n5(var1[1], var2), n5(var1[2], var2), 0L);
         default:
            throw new PptxException("Can't read Vml geometry formula");
      }
   }

   private static long n5(String var0, Dictionary<String, Long> var1) {
      var0 = com.aspose.slides.ms.System.d1.u9(var0);
      if (var1.containsKey(var0)) {
         return (Long)var1.get_Item(var0);
      } else if (var0.charAt(0) == '#') {
         return 27273042316901L + com.aspose.slides.ms.System.Xml.f4.t9(com.aspose.slides.ms.System.d1.k5(var0, 1));
      } else {
         return var0.charAt(0) == '@'
            ? -27273042329612L - com.aspose.slides.ms.System.Xml.f4.t9(com.aspose.slides.ms.System.d1.k5(var0, 1))
            : com.aspose.slides.ms.System.Xml.f4.t9(var0);
      }
   }

   private static q7g[] a6(com.aspose.slides.internal.k4y.m1 var0) {
      List var1 = new List();
      String var2 = null;
      int var3 = 0;
      String var4 = var0.z3();
      if (var4 == null) {
         var4 = "";
      }

      String var5 = var4;

      for (int var6 = 0; var6 < var5.length(); var6++) {
         char var7 = var5.charAt(var6);
         if (a5x$n5.l6(var7)) {
            if (var2 != null) {
               int var8 = var6 - var3;
               String var9 = var8 == 0 ? "" : com.aspose.slides.ms.System.d1.l6(var5, var3, var8);
               a5x$n5 var10 = new a5x$n5(var2, var9);
               var1.addItem(var10);
               Object var32 = null;
            }

            if (a5x$n5.n5(var7)) {
               var2 = com.aspose.slides.ms.System.t9.q0(var7);
               var3 = var6 + 1;
            } else {
               var2 = com.aspose.slides.ms.System.d1.l6(var5, var6, 2);
               var3 = ++var6 + 1;
            }
         }
      }

      if (var2 != null) {
         a5x$n5 var33 = new a5x$n5(var2, "");
         var1.addItem(var33);
      }

      List var34 = new List();
      long var11 = 0L;
      long var13 = 0L;
      long var15 = 0L;
      long var17 = 0L;
      long[] var19 = new long[]{0L};
      long[] var20 = new long[]{0L};
      long[] var21 = new long[]{0L};
      long[] var22 = new long[]{0L};
      n5(var0, var19, var20, var21, var22);
      var11 = var19[0];
      var13 = var20[0];
      var15 = var21[0];
      var17 = var22[0];
      boolean var23 = true;
      boolean var24 = true;
      List var25 = new List();
      List var26 = new List();
      List$Enumerator var27 = var1.iterator();

      try {
         while (var27.hasNext()) {
            a5x$n5 var28 = (a5x$n5)var27.next();
            switch (n5.n5(var28.n5())) {
               case 5:
                  var34.addItem(
                     new q7g(
                        com.aspose.slides.internal.n8e.v4.l6(var25),
                        com.aspose.slides.internal.n8e.v4.u9(var26),
                        var15,
                        var17,
                        (byte)(var23 ? 1 : 0),
                        var24,
                        true
                     )
                  );
                  var25.clear();
                  var26.clear();
                  var24 = true;
                  var23 = true;
                  break;
               case 23:
                  var23 = false;
                  break;
               case 24:
                  var24 = false;
                  break;
               default:
                  var28.n5(var25, var26);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
            var27.dispose();
         }
      }

      return (q7g[])var34.toArray(new q7g[0]);
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, long[] var1, long[] var2, long[] var3, long[] var4) {
      long[] var5 = n5(var0.k5(), 10000L);
      var3[0] = var5.length == 2 ? var5[0] : 10000L;
      var4[0] = var5.length == 2 ? var5[1] : 10000L;
      long[] var6 = n5(var0.u3(), 0L);
      var1[0] = var6.length == 2 ? var6[0] : 0L;
      var2[0] = var6.length == 2 ? var6[1] : 0L;
   }

   static long[] n5(String var0, long var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return new long[0];
      }

      String[] var3 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var0, " ", ""), ',');
      long[] var4 = new long[var3.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         long var6 = 0L;
         long[] var8 = new long[]{0L};
         boolean var9 = !com.aspose.slides.ms.System.d1.n5(var3[var5]) && com.aspose.slides.ms.System.p3.n5(var3[var5], var8);
         var6 = var8[0];
         if (var9) {
            var4[var5] = var6;
         } else {
            var4[var5] = var1;
         }
      }

      return var4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n5;
   }
}
