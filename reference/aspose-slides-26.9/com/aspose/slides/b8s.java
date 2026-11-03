package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class b8s {
   private static final String[][][][] n5 = new String[256][][][];
   private static final String[] l6 = new String[]{
      "Arial", "Cambria Math", "MS Gothic", "Gulim", "Arial Unicode", "SimSun", "Segoe UI Symbol", "DejaVu Sans", "Liberation Serif", "FreeSans"
   };
   private static final String[] k5 = new String[]{"Courier", "Courier New", "MS Mincho", "Batang", "Arial Unicode"};
   private static final String[] u3 = new String[]{"Times New Roman", "MS Mincho", "Batang", "Arial Unicode"};
   private static final String[] a6 = new String[]{"Calibri", "Microsoft YaHei", "Tahoma", "Verdana", "Arial", "MS Gothic"};
   private static final String[] u9 = new String[]{"Vivaldi", "Segoe Marker", "Vladimir Script", "Viner Hand ITC", "Informal Roman", "Parchment"};
   private static final String[] h0 = new String[]{
      "Jokerman", "Juice ITC", "Niagara Engraved", "Harrington", "Playbill", "Colonna MT", "Bodoni MT Poster Compressed"
   };
   private static final String[] c8 = new String[]{"Wingdings"};
   private static final String[] t2 = new String[]{"DaunPenh", "Cambria", "Arial", "MS Mincho"};
   private static final String[] s7 = new String[]{"DaunPenh", "Cambria", "Times New Roman", "MS Mincho"};
   private static final String[] x8 = new String[]{"Gabriola", "Times New Roman", "MS Mincho"};
   private static final String[] n3 = new String[]{"PMingLiU", "Times New Roman"};
   private static final String[] y4 = new String[]{"MingLiU", "Courier New"};
   private static final String[] e2 = new String[]{"Microsoft JhengHei", "Calibri", "Arial"};
   private static final String[] t9 = new String[]{"SimSun", "Times New Roman"};
   private static final String[] z1 = new String[]{"SimSun", "Courier New"};
   private static final String[] t4 = new String[]{"Microsoft YaHei", "Arial"};
   private static final String[] q0 = new String[]{"Gulim", "Arial"};
   private static final String[] z3 = new String[]{"GulimChe", "Courier New"};
   private static final String[] m1 = new String[]{"Batang", "Times New Roman"};
   private static final String[] k7 = new String[]{"BatangChe", "Courier New"};
   private static final String[] m3 = new String[]{"MS PGothic", "Arial"};
   private static final String[] z8 = new String[]{"MS Gothic", "Courier New"};
   private static final String[] j5 = new String[]{"MS PMincho", "Times New Roman"};
   private static final String[] w1 = new String[]{"MS Mincho", "Courier New"};
   private static final com.aspose.slides.internal.v6g.u9 r4;

   public static String[] n5(byte var0, int var1, byte[] var2, String var3) {
      int var4 = var1 >> 4;
      if (var4 > 5) {
         var4 = 0;
      }

      int var5 = var1 & 15;
      if (var5 > 2) {
         var5 = var5 == 8 ? 1 : 0;
      }

      if (l6(var2) && (var2[0] & 255) < 2) {
         return var0 == 0 && var4 != 0 && var5 != 0 ? n5(var0 & 255, var4, var5) : new String[]{"Courier New"};
      }

      if (var2 != null && (var2[0] & 255) >= 2) {
         switch (var2[0]) {
            case 2:
               if ((var2[3] & 255) == 9) {
                  return n5(var0 & 255, 0, 1);
               } else if ((var2[1] & 255) < 11) {
                  return n5(var0 & 255, 2, 1);
               } else if (var0 == 0) {
                  if ((var2[1] & 255) == 11 && (var2[4] & 255) > 2) {
                     return l6(var3);
                  }

                  return a6;
               } else {
                  if (var0 != 1 && var0 != 77) {
                     return n5(var0 & 255, 2, 2);
                  }

                  return l6(var3);
               }
            case 3:
               if (var0 == 0) {
                  return u9;
               }

               return n5(var0 & 255, 1, 2);
            case 4:
               if (var0 == 0) {
                  return h0;
               }

               return n5(var0 & 255, 5, 0);
            case 5:
               return c8;
            default:
               return l6;
         }
      } else {
         return var0 == 1 && var4 == 0 && var5 == 0 ? l6(var3) : n5(var0 & 255, var4, var5);
      }
   }

   public static byte[] n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return null;
      }

      if (var0.length() % 2 == 1) {
         throw new ArgumentException("Panose must have an even number of characters", "panose");
      }

      byte[] var1 = new byte[var0.length() / 2];

      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = com.aspose.slides.ms.System.d1.l6(var0, var2 * 2, 2);
         var1[var2] = com.aspose.slides.ms.System.e2.n5(var3, 515, com.aspose.slides.internal.x7n.l6.k5());
      }

      return var1;
   }

   public static String n5(byte[] var0) {
      return var0 == null ? null : com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.x8.n5(var0), "-", com.aspose.slides.ms.System.d1.n5);
   }

   private static void n5(String[][][] var0, String[] var1) {
      for (int var2 = 0; var2 < 6; var2++) {
         for (int var3 = 0; var3 < 3; var3++) {
            var0[var2][var3] = var1;
         }
      }
   }

   private static void n5(String[][][] var0, int var1, String[] var2) {
      for (int var3 = 0; var3 < 6; var3++) {
         var0[var3][var1] = var2;
      }
   }

   private static void n5(String[][][] var0, int var1, int var2, String[] var3) {
      var0[var1][var2] = var3;
   }

   private static String[][][] n5(int var0) {
      String[][][] var1 = n5[var0];
      if (var1 == null) {
         String[][][] var2 = new String[6][3][];
         var1 = var2;
         n5[var0] = var2;
      }

      return var1;
   }

   private static String[] n5(int var0, int var1, int var2) {
      String[][][] var3 = n5[var0];
      if (var3 == null) {
         var3 = n5[0];
      }

      return var3[var1][var2];
   }

   private static String[] l6(String var0) {
      switch (r4.n5(var0)) {
         case 0:
            return new String[]{"MS Gothic", "Microsoft JhengHei", "Arial Unicode"};
         case 1:
            return new String[]{"Arial", "Cambria Math", "MS Gothic", "Gulim", "Arial Unicode", "SimSun", "Segoe UI Symbol"};
         case 2:
         case 3:
            return new String[]{"Calibri", "Cambria Math", "MS Gothic", "Gulim", "Arial Unicode", "SimSun", "Segoe UI Symbol"};
         default:
            return n5[1][0][0];
      }
   }

   private static boolean l6(byte[] var0) {
      return var0 != null
         && (
               var0[0] & 255
                  | var0[1] & 255
                  | var0[2] & 255
                  | var0[3] & 255
                  | var0[4] & 255
                  | var0[5] & 255
                  | var0[6] & 255
                  | var0[7] & 255
                  | var0[8] & 255
                  | var0[9] & 255
            )
            != 0;
   }

   static {
      String[][][] var0 = n5(0);
      n5(var0, l6);
      n5(var0, 0, 2, t2);
      n5(var0, 1, 2, new String[]{"Times New Roman", "MS Mincho"});
      n5(var0, 2, 1, new String[]{"Franklin Gothic Medium Cond", "Arial", "MS Gothic", "Gulim", "Arial Unicode"});
      n5(var0, 3, 1, new String[]{"Courier New", "MS Mincho"});
      n5(var0, 3, 2, new String[]{"Calibri", "OCR A Extended", "Courier New", "MS Mincho"});
      n5(var0, 4, 1, new String[]{"DFKai-SB", "Cambria", "Courier New"});
      n5(var0, 4, 2, new String[]{"Estrangelo Edessa", "Cambria", "Arabic Typesetting", "Times New Roman", "MS Mincho"});
      n5(var0, 5, 2, x8);
      var0 = n5(2);
      n5(var0, new String[]{"Wingdings", "OpenSymbol"});
      var0 = n5(128);
      n5(var0, m3);
      n5(var0, 0, 1, z8);
      n5(var0, 1, 0, j5);
      n5(var0, 1, 1, w1);
      n5(var0, 1, 2, j5);
      n5(var0, 2, 1, z8);
      n5(var0, 3, 0, z8);
      n5(var0, 3, 1, z8);
      n5(var0, 4, 1, z8);
      n5(var0, 5, 1, z8);
      var0 = n5(129);
      n5(var0, q0);
      n5(var0, 1, z3);
      n5(var0, 1, 0, m1);
      n5(var0, 1, 1, k7);
      n5(var0, 1, 2, m1);
      n5(var0, 3, 0, z3);
      var0 = n5(130);
      n5(var0, new String[]{"Arial Unicode MS"});
      var0 = n5(134);
      n5(var0, t9);
      n5(var0, 1, z1);
      n5(var0, 1, 0, t4);
      n5(var0, 1, 1, t4);
      n5(var0, 1, 2, t4);
      n5(var0, 2, 2, t4);
      n5(var0, 3, 0, z1);
      var0 = n5(136);
      n5(var0, n3);
      n5(var0, 1, y4);
      n5(var0, 1, 0, e2);
      n5(var0, 1, 1, e2);
      n5(var0, 1, 2, n3);
      n5(var0, 2, 2, e2);
      n5(var0, 3, 0, y4);
      n5(var0, 4, 1, new String[]{"DFKai-SB", "Cambria", "Courier New"});
      var0 = n5(161);
      n5(var0, 0, 2, new String[]{"Segoe Print", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 4, 2, new String[]{"Comic Sans MS", "Arabic Typesetting", "Times New Roman", "MS Mincho"});
      n5(var0, 5, 2, x8);
      var0 = n5(162);
      n5(var0, 0, 2, new String[]{"Nyala", "Cambria", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 4, 2, s7);
      n5(var0, 5, 2, x8);
      var0 = n5(163);
      n5(var0, 0, 2, l6);
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 5, 2, l6);
      var0 = n5(177);
      n5(var0, 0, 2, new String[]{"Aharoni", "Cambria", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 5, 2, l6);
      var0 = n5(178);
      n5(var0, 0, 2, new String[]{"Arial", "Microsoft Uighur", "Sakkal Majalla", "Cambria", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 4, 2, s7);
      n5(var0, 5, 2, l6);
      var0 = n5(186);
      n5(var0, 0, 2, new String[]{"Nyala", "Cambria", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 4, 2, s7);
      n5(var0, 5, 2, x8);
      var0 = n5(204);
      n5(var0, 0, 2, new String[]{"Segoe Print", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 4, 2, new String[]{"Comic Sans MS", "Arabic Typesetting", "Times New Roman", "MS Mincho"});
      n5(var0, 5, 2, x8);
      var0 = n5(222);
      n5(var0, new String[]{"DokChampa", "Arial", "MS Gothic"});
      n5(var0, 1, 2, new String[]{"Angsana New", "Cambria", "Times New Roman", "MS Mincho"});
      var0 = n5(238);
      n5(var0, 0, 2, new String[]{"Nyala", "Cambria", "Arial", "MS Mincho"});
      n5(var0, 3, 2, l6);
      n5(var0, 4, 1, l6);
      n5(var0, 4, 2, s7);
      n5(var0, 5, 2, x8);
      String[][][] var1 = n5[0];

      for (int var2 = 1; var2 < 256; var2++) {
         if (n5[var2] == null) {
            n5[var2] = var1;
         } else {
            var0 = n5[var2];

            for (int var3 = 0; var3 < 6; var3++) {
               for (int var4 = 0; var4 < 3; var4++) {
                  if (var0[var3][var4] == null) {
                     var0[var3][var4] = var1[var3][var4];
                  }
               }
            }
         }
      }

      r4 = new com.aspose.slides.internal.v6g.u9("zh-CN", "ar-AE", "en-IN", "en-US");
   }
}
