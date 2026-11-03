package com.aspose.slides.internal.p8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v3.a6;
import com.aspose.slides.internal.v3.x8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class k5 {
   private static final int[] n5 = new int[]{49};
   private static final int[] l6 = new int[]{46};
   private int[] k5;
   private int[] u3;
   private int[][] a6;
   private int[][] u9;
   private final int h0;
   private final int c8;
   private int t2;
   private final String s7;
   private final String x8;
   private final String n3;
   private static final String[][] y4 = new String[][]{{"eng", "en"}, {"fra", "fre", "fr"}, {"spa", "es"}};
   private static final int[][] e2 = new int[][]{{65, 26}, {97, 26}};
   private static final int[][] t9 = new int[][]{{73}, {105}, {913}, {945}, {1488}, {1571}, {1575}, {3585}, {12354}, {12356}, {12450}, {12452}};
   private static final String[] z1 = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
   private static final String[] t4 = new String[]{
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
   };
   private static final String[] q0 = new String[]{d1.n5, "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
   private static final String[] z3 = new String[]{"hundred", "thousand", "million", "billion"};
   private static final String[] m1 = new String[]{"none", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth"};
   private static final String[] k7 = new String[]{
      "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth"
   };
   private static final String[] m3 = new String[]{
      d1.n5, "tenth", "twentieth", "thirtieth", "fortieth", "fiftieth", "sixtieth", "seventieth", "eightieth", "ninetith"
   };
   private static final String[] z8 = new String[]{"hundredth", "thousandth", "millionth", "billionth"};
   private static final String[] j5 = new String[]{"zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"};
   private static final String[] w1 = new String[]{"dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"};
   private static final String[] r4 = new String[]{
      d1.n5, "dix", "vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix", "quatre-vingt", "quatre-vingt-dix"
   };
   private static final String[] c4 = new String[]{"cent", "cents", "mille", "million", "millions", "milliard", "milliards"};
   private static final String[] y2 = new String[]{
      "premier", "deuxième", "troisième", "quatrième", "cinquième", "sixième", "septième", "huitième", "neuvième", "dixième"
   };
   private static final String[] y1 = new String[]{
      "première", "deuxième", "troisième", "quatrième", "cinquième", "sixième", "septième", "huitième", "neuvième", "dixième"
   };
   private static final String[] a0 = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seise", "siete", "ocho", "nueve"};
   private static final String[] d2 = new String[]{"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
   private static final String[] d5 = new String[]{
      "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"
   };
   private static final String[] s3 = new String[]{d1.n5, "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
   private static final String[] p8 = new String[]{
      d1.n5, "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
   };
   private static final String[] f2 = new String[]{"un", "cien", "mil", "millón", "millones"};
   private static final String[] i1 = new String[]{
      "ninguno", "primero", "segundo", "tercero", "cuarto", "quinto", "sexto", "séptimo", "octavo", "novento", "décimo"
   };
   private static final String[] e5 = new String[]{
      "ninguna", "primera", "segunda", "tercera", "cuarta", "quinta", "sexta", "séptima", "octava", "noventa", "décima"
   };
   private static final int[] b3 = new int[]{
      100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
   };
   private static final String[] o0 = new String[]{
      null, null, null, null, null, null, null, null, "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", null, null, null, "v", "iv", null, null, "i"
   };
   private static final String[] z7 = new String[]{
      "ↈ", "ↂↈ", "ↇ", "ↂↇ", "ↂ", "ↀↂ", "ↁ", "ↀↁ", "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", null, null, null, "v", "iv", null, null, "i"
   };
   private static final String[] v4 = new String[]{
      "ↈ", "ↂↈ", "ↇ", "ↂↇ", "ↂ", "ↀↂ", "ↁ", "ↀↁ", "Ⅿ", "ⅭⅯ", "Ⅾ", "ⅭⅮ", "Ⅽ", "ⅩⅭ", "Ⅼ", "ⅩⅬ", "Ⅹ", "Ⅸ", "Ⅷ", "Ⅶ", "Ⅵ", "Ⅴ", "Ⅳ", "Ⅲ", "Ⅱ", "Ⅰ"
   };
   private static final int[] u6 = new int[]{
      1488,
      1489,
      1490,
      1491,
      1492,
      1493,
      1494,
      1495,
      1496,
      1497,
      1499,
      1500,
      1502,
      1504,
      1505,
      1506,
      1508,
      1510,
      1511,
      1512,
      1513,
      1514,
      1498,
      1501,
      1503,
      1507,
      1509
   };
   private static final int[] t1 = new int[]{
      1571,
      1576,
      1580,
      1583,
      1607,
      1608,
      1586,
      1581,
      1591,
      1609,
      1603,
      1604,
      1605,
      1606,
      1587,
      1593,
      1601,
      1589,
      1602,
      1585,
      1588,
      1578,
      1579,
      1582,
      1584,
      1590,
      1592,
      1594
   };
   private static final int[] a5 = new int[]{
      1571,
      1576,
      1578,
      1579,
      1580,
      1581,
      1582,
      1583,
      1584,
      1585,
      1586,
      1587,
      1588,
      1589,
      1590,
      1591,
      1592,
      1593,
      1594,
      1601,
      1602,
      1603,
      1604,
      1605,
      1606,
      1607,
      1608,
      1609
   };
   private static final int[] h2 = new int[]{
      12354,
      12356,
      12358,
      12360,
      12362,
      12363,
      12365,
      12367,
      12369,
      12371,
      12373,
      12375,
      12377,
      12379,
      12381,
      12383,
      12385,
      12388,
      12390,
      12392,
      12394,
      12395,
      12396,
      12397,
      12398,
      12399,
      12402,
      12405,
      12408,
      12411,
      12414,
      12415,
      12416,
      12417,
      12418,
      12420,
      12422,
      12424,
      12425,
      12426,
      12427,
      12428,
      12429,
      12431,
      12432,
      12433,
      12434,
      12435
   };
   private static final int[] v0 = new int[]{
      12450,
      12452,
      12454,
      12456,
      12458,
      12459,
      12461,
      12463,
      12465,
      12467,
      12469,
      12471,
      12473,
      12475,
      12477,
      12479,
      12481,
      12484,
      12486,
      12488,
      12490,
      12491,
      12492,
      12493,
      12494,
      12495,
      12498,
      12501,
      12504,
      12507,
      12510,
      12511,
      12512,
      12513,
      12514,
      12516,
      12518,
      12520,
      12521,
      12522,
      12523,
      12524,
      12525,
      12527,
      12528,
      12529,
      12530,
      12531
   };
   private static final int[] f0 = new int[]{
      3585,
      3586,
      3587,
      3588,
      3589,
      3590,
      3591,
      3592,
      3593,
      3594,
      3595,
      3596,
      3597,
      3598,
      3599,
      3600,
      3601,
      3602,
      3603,
      3604,
      3605,
      3606,
      3607,
      3608,
      3609,
      3610,
      3611,
      3612,
      3613,
      3614,
      3615,
      3616,
      3617,
      3618,
      3619,
      3621,
      3623,
      3624,
      3625,
      3626,
      3627,
      3628,
      3629,
      3630
   };

   public k5(String var1, int var2, int var3, int var4, String var5, String var6, String var7) {
      this.h0 = var2;
      this.c8 = var3;
      this.t2 = var4;
      this.s7 = var5;
      this.x8 = var6 != null ? d1.u9(var6) : null;
      this.n3 = var7 != null ? d1.u9(var7) : null;
      this.n5(var1);
   }

   public final String n5(long var1) {
      List var3 = new List();
      var3.addItem(var1);
      return this.n5(var3);
   }

   public final String n5(List<Long> var1) {
      List var2 = new List();
      if (this.k5 != null) {
         k5(var2, new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)))));
      }

      this.l6(var2, var1);
      if (this.u3 != null) {
         k5(var2, new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.u3)))));
      }

      return l6(var2);
   }

   private void n5(String var1) {
      List var2 = new List();
      List var3 = new List();
      if (var1 == null || var1.length() == 0) {
         var1 = "1";
      }

      int var4 = 0;
      List var5 = new List();
      int[] var6 = com.aspose.slides.internal.p8.u3.n5(var1, 0, true);
      int var7 = 0;

      for (int var8 = var6.length; var7 < var8; var7++) {
         int var9 = var6[var7];
         int var10 = n5(var9) ? 1 : 2;
         if (var10 != var4) {
            if (var5.size() > 0) {
               if (var4 == 1) {
                  var2.addItem(com.aspose.slides.internal.v3.a6.n5(var5));
               } else {
                  var3.addItem(com.aspose.slides.internal.v3.a6.n5(var5));
               }

               var5.clear();
            }

            var4 = var10;
         }

         var5.addItem(var9);
      }

      if (var5.size() > 0) {
         if (var4 == 1) {
            var2.addItem(com.aspose.slides.internal.v3.a6.n5(var5));
         } else {
            var3.addItem(com.aspose.slides.internal.v3.a6.n5(var5));
         }
      }

      if (var3.size() != 0) {
         this.k5 = (int[])var3.get_Item(0);
         var3.removeAt(0);
      }

      if (var3.size() != 0) {
         this.u3 = (int[])var3.get_Item(var3.size() - 1);
         var3.removeAt(var3.size() - 1);
      }

      this.u9 = new int[var3.size()][];

      for (int var11 = 0; var11 < var3.size(); var11++) {
         this.u9[var11] = new int[((int[])var3.get_Item(var11)).length];

         for (int var13 = 0; var13 < ((int[])var3.get_Item(var11)).length; var13++) {
            this.u9[var11][var13] = ((int[])var3.get_Item(var11))[var13];
         }
      }

      this.a6 = new int[var2.size()][];

      for (int var12 = 0; var12 < var2.size(); var12++) {
         this.a6[var12] = new int[((int[])var2.get_Item(var12)).length];

         for (int var14 = 0; var14 < ((int[])var2.get_Item(var12)).length; var14++) {
            this.a6[var12][var14] = ((int[])var2.get_Item(var12))[var14];
         }
      }
   }

   private static boolean n5(int var0) {
      switch (com.aspose.slides.ms.System.t9.l6((char)var0)) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 8:
         case 9:
         case 10:
            return true;
         case 5:
         case 6:
         case 7:
         default:
            return false;
      }
   }

   private void l6(List<Integer> var1, List<Long> var2) {
      int[] var3 = n5;
      int var4 = 0;
      int var5 = this.a6.length;
      int var6 = 0;
      int var7 = this.u9.length;
      int var8 = 0;
      List$Enumerator var9 = var2.iterator();

      try {
         while (var9.hasNext()) {
            long var10 = com.aspose.slides.internal.v6g.k5.u3(var9.next(), long.class);
            int[] var12 = null;
            int[] var13;
            if (var4 < var5) {
               if (var8 > 0) {
                  if (var6 < var7) {
                     var12 = this.u9[var6++];
                  } else {
                     var12 = l6;
                  }
               }

               var13 = this.a6[var4++];
            } else {
               var13 = var3;
            }

            k5(var1, new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.n5(var10, var12, var13))))));
            var3 = var13;
            var8++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }
   }

   private int[] n5(long var1, int[] var3, int[] var4) {
      List var5 = new List();
      if (var3 != null) {
         k5(var5, new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var3)))));
      }

      if (var4 != null) {
         k5(var5, new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.n5(var1, var4))))));
      }

      return com.aspose.slides.internal.v3.a6.n5(var5);
   }

   private int[] n5(long var1, int[] var3) {
      int[] var4 = null;
      if (var1 < 0L) {
         throw new ArgumentException("number must be non-negative");
      }

      if (var3.length == 1) {
         int var5 = var3[0];
         switch (var5) {
            case 49:
               var4 = this.n5(var1, 49, 1);
               break;
            case 65:
            case 73:
            case 97:
            case 105:
            default:
               if (k5(var5)) {
                  var4 = this.n5(var1, var5, 1);
               } else if (u3(var5)) {
                  var4 = l6(var1, var5, a6(var5), null);
               } else if (u9(var5)) {
                  var4 = this.n5(var1, var5);
               } else {
                  var4 = null;
               }
               break;
            case 87:
            case 119:
               var4 = this.l6(var1, var5 == 87 ? 0 : 1);
         }
      } else if (var3.length == 2 && var3[0] == 87 && var3[1] == 119) {
         var4 = this.l6(var1, 2);
      } else {
         if (!k5(var3)) {
            throw new ArgumentException(d1.n5(new String[]{"invalid format token: \"", com.aspose.slides.internal.p8.u3.n5(var3), "\""}));
         }

         int var7 = var3[var3.length - 1];
         var4 = this.n5(var1, var7, var3.length);
      }

      if (var4 == null) {
         var4 = this.n5(var1, n5);
      }

      return (int[])var4;
   }

   private int[] n5(long var1, int var3, int var4) {
      List var5 = new List();
      int var6 = var3 - 1;

      while (var1 > 0L) {
         long var7 = var1 % 10L;
         var5.insertItem(0, var6 + (int)var7);
         var1 /= 10L;
      }

      while (var4 > var5.size()) {
         var5.insertItem(0, var6);
      }

      if (this.c8 != 0 && this.h0 != 0) {
         var5 = n5(var5, this.c8, this.h0);
      }

      return com.aspose.slides.internal.v3.a6.n5(var5);
   }

   private static List<Integer> n5(List<Integer> var0, int var1, int var2) {
      if (var0.size() > var1) {
         List var3 = new List();
         int var4 = 0;
         int var5 = var0.size();
         int var6 = 0;

         while (var4 < var5) {
            int var7 = var5 - var4 - 1;
            if (var6 == var1) {
               var3.insertItem(0, var2);
               var6 = 1;
            } else {
               var6++;
            }

            var3.insertItem(0, var0.get_Item(var7));
            var4++;
         }

         return var3;
      } else {
         return var0;
      }
   }

   private static int[] l6(long var0, int var2, int var3, int[] var4) {
      List var5 = new List();
      if (var0 == 0L) {
         return null;
      }

      long var6 = var0;

      while (var6 > 0L) {
         int var8 = (int)((var6 - 1L) % var3);
         int var9 = var4 != null ? var4[var8] : var2 + var8;
         var5.insertItem(0, var9);
         var6 = (var6 - 1L) / var3;
      }

      return com.aspose.slides.internal.v3.a6.n5(var5);
   }

   private int[] n5(long var1, int var3) {
      k5$a6 var4 = n5(var3, this.t2, this.s7, this.n3);
      return var4 != null ? var4.n5(var1, var3, this.t2, this.s7, this.x8, this.n3) : null;
   }

   private int[] l6(long var1, int var3) {
      k5$a6 var4 = null;
      if (this.l6("eng")) {
         var4 = new k5$l6(var3);
      } else if (this.l6("spa")) {
         var4 = new k5$t2(var3);
      } else if (this.l6("fra")) {
         var4 = new k5$k5(var3);
      } else {
         var4 = new k5$l6(var3);
      }

      return var4.n5(var1, 0, this.t2, this.s7, this.x8, this.n3);
   }

   private boolean l6(String var1) {
      if (this.x8 == null) {
         return false;
      } else {
         return d1.a6(this.x8, var1) ? true : l6(var1, this.x8);
      }
   }

   private static boolean l6(String var0, String var1) {
      for (String[] var5 : y4) {
         if (d1.a6(var5[0], var0)) {
            int var6 = 0;

            for (int var7 = var5.length; var6 < var7; var6++) {
               if (d1.a6(var5[var6], var1)) {
                  return true;
               }
            }

            return false;
         }
      }

      return false;
   }

   private static boolean k5(String var0, String var1) {
      if (var0 != null) {
         String[] var2 = d1.n5(var0, ',');

         for (String var6 : var2) {
            String[] var7 = d1.n5(var6, '=');
            String var8 = var7[0];
            if (d1.a6(var8, var1)) {
               return true;
            }
         }
      }

      return false;
   }

   private static void k5(List<Integer> var0, List<Integer> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            int var3 = com.aspose.slides.internal.v6g.k5.u3(var2.next(), int.class);
            var0.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static String l6(List<Integer> var0) {
      int[] var1 = com.aspose.slides.internal.v3.a6.n5(var0);
      return com.aspose.slides.internal.p8.u3.n5(var1);
   }

   private static boolean k5(int[] var0) {
      if (l6(var0[var0.length - 1]) != 1) {
         return false;
      }

      int var1 = 0;

      for (int var2 = var0.length - 1; var1 < var2; var1++) {
         if (l6(var0[var1]) != 0) {
            return false;
         }
      }

      return true;
   }

   private static int l6(int var0) {
      char var1 = (char)var0;
      return com.aspose.slides.ms.System.t9.l6(var1) == 8 ? com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.t9.n5(var1), 14) : -1;
   }

   private static boolean k5(int var0) {
      return com.aspose.slides.ms.System.t9.n5((char)var0) == 1.0
         && com.aspose.slides.ms.System.t9.n5((char)(var0 - 1)) == 0.0
         && com.aspose.slides.ms.System.t9.n5((char)(var0 + 8)) == 9.0;
   }

   private static boolean u3(int var0) {
      for (int[] var4 : e2) {
         if (var4[0] == var0) {
            return true;
         }
      }

      return false;
   }

   private static int a6(int var0) {
      for (int[] var4 : e2) {
         if (var4[0] == var0) {
            return var4[1];
         }
      }

      return 0;
   }

   private static boolean u9(int var0) {
      for (int[] var4 : t9) {
         if (var4[0] == var0) {
            return true;
         }
      }

      return false;
   }

   private static k5$a6 n5(int var0, int var1, String var2, String var3) {
      if (var0 == 73) {
         return new k5$c8(null);
      } else if (var0 == 105) {
         return new k5$c8(null);
      } else if (var0 == 913) {
         return new k5$u9(null);
      } else if (var0 == 945) {
         return new k5$u9(null);
      } else if (var0 == 1488) {
         return new k5$u3(null);
      } else if (var0 == 1571) {
         return new k5$n5(null);
      } else if (var0 == 1575) {
         return new k5$n5(null);
      } else if (var0 == 3585) {
         return new k5$s7(null);
      } else if (var0 == 12354) {
         return new k5$h0(null);
      } else if (var0 == 12356) {
         return new k5$h0(null);
      } else if (var0 == 12450) {
         return new k5$h0(null);
      } else {
         return var0 == 12452 ? new k5$h0(null) : null;
      }
   }

   private static int[] u3(int[] var0) {
      int var1 = 0;

      for (int var2 = var0.length; var1 < var2; var1++) {
         int var3 = var0[var1];
         var0[var1] = com.aspose.slides.ms.System.t9.z3((char)var3);
      }

      return var0;
   }

   private static int[] a6(int[] var0) {
      int var1 = 0;

      for (int var2 = var0.length; var1 < var2; var1++) {
         int var3 = var0[var1];
         var0[var1] = com.aspose.slides.ms.System.t9.z1((char)var3);
      }

      return var0;
   }

   private static List<String> l6(List<String> var0, int var1) {
      List var2 = new List();
      List$Enumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            var2.addItem(n5(var4, var1));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static String n5(String var0, int var1) {
      if (var1 == 0) {
         return d1.t2(var0);
      }

      if (var1 == 1) {
         return d1.u9(var0);
      }

      if (var1 == 2) {
         a5 var2 = new a5();
         int var3 = 0;

         for (int var4 = var0.length(); var3 < var4; var3++) {
            String var5 = com.aspose.slides.internal.v3.x8.n5(var0, var3, var3 + 1);
            if (var3 == 0) {
               var2.n5(d1.t2(var5));
            } else {
               var2.n5(d1.u9(var5));
            }
         }

         return var2.toString();
      } else {
         return var0;
      }
   }

   private static String l6(List<String> var0, String var1) {
      a5 var2 = new a5();
      List$Enumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            if (var2.l6() > 0) {
               var2.n5(var1);
            }

            var2.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2.toString();
   }

   // $VF: synthetic method
   static boolean n5(String var0, String var1) {
      return k5(var0, var1);
   }

   // $VF: synthetic method
   static String[] n5() {
      return z1;
   }

   // $VF: synthetic method
   static String[] l6() {
      return m1;
   }

   // $VF: synthetic method
   static String[] k5() {
      return z8;
   }

   // $VF: synthetic method
   static String[] u3() {
      return z3;
   }

   // $VF: synthetic method
   static List n5(List var0, int var1) {
      return l6(var0, var1);
   }

   // $VF: synthetic method
   static String n5(List var0, String var1) {
      return l6(var0, var1);
   }

   // $VF: synthetic method
   static String[] a6() {
      return k7;
   }

   // $VF: synthetic method
   static String[] u9() {
      return t4;
   }

   // $VF: synthetic method
   static String[] h0() {
      return m3;
   }

   // $VF: synthetic method
   static String[] c8() {
      return q0;
   }

   // $VF: synthetic method
   static String[] t2() {
      return j5;
   }

   // $VF: synthetic method
   static String[] s7() {
      return y1;
   }

   // $VF: synthetic method
   static String[] x8() {
      return y2;
   }

   // $VF: synthetic method
   static String[] n3() {
      return c4;
   }

   // $VF: synthetic method
   static String[] y4() {
      return w1;
   }

   // $VF: synthetic method
   static String[] e2() {
      return r4;
   }

   // $VF: synthetic method
   static String[] t9() {
      return a0;
   }

   // $VF: synthetic method
   static String[] z1() {
      return e5;
   }

   // $VF: synthetic method
   static String[] t4() {
      return i1;
   }

   // $VF: synthetic method
   static String[] q0() {
      return f2;
   }

   // $VF: synthetic method
   static String[] z3() {
      return p8;
   }

   // $VF: synthetic method
   static String[] m1() {
      return d2;
   }

   // $VF: synthetic method
   static String[] k7() {
      return d5;
   }

   // $VF: synthetic method
   static String[] m3() {
      return s3;
   }

   // $VF: synthetic method
   static String[] z8() {
      return v4;
   }

   // $VF: synthetic method
   static String[] j5() {
      return z7;
   }

   // $VF: synthetic method
   static String[] w1() {
      return o0;
   }

   // $VF: synthetic method
   static int[] r4() {
      return b3;
   }

   // $VF: synthetic method
   static void n5(List var0, List var1) {
      k5(var0, var1);
   }

   // $VF: synthetic method
   static int[] n5(int[] var0) {
      return u3(var0);
   }

   // $VF: synthetic method
   static int[] l6(int[] var0) {
      return a6(var0);
   }

   // $VF: synthetic method
   static int[] c4() {
      return u6;
   }

   // $VF: synthetic method
   static int[] n5(long var0, int var2, int var3, int[] var4) {
      return l6(var0, var2, var3, var4);
   }

   // $VF: synthetic method
   static int[] y2() {
      return t1;
   }

   // $VF: synthetic method
   static int[] y1() {
      return a5;
   }

   // $VF: synthetic method
   static int[] a0() {
      return h2;
   }

   // $VF: synthetic method
   static int[] d2() {
      return v0;
   }

   // $VF: synthetic method
   static int[] d5() {
      return f0;
   }
}
