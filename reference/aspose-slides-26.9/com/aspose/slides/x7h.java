package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class x7h {
   private static final x7h$n5 n5 = new x7h$1();
   private static final char[] l6 = new char[]{'○', '一', '二', '三', '四', '五', '六', '七', '八', '九', '十'};
   private static final String[] k5 = new String[]{
      "{0}.",
      "{0}.",
      "{0})",
      "{0}.",
      "({0})",
      "{0})",
      "{0}.",
      "{0}.",
      "({0})",
      "{0})",
      "({0})",
      "{0})",
      "({0})",
      "{0}",
      "({0})",
      "{0})",
      "{0}",
      "{0}.",
      "{0}",
      "{0}",
      "{0}",
      "{0}",
      "{0}.",
      "{0}-",
      "{0}-",
      "{0}-",
      "{0}",
      "{0}.",
      "{0}",
      "{0}.",
      "{0}.",
      "{0})",
      "({0})",
      "{0}.",
      "{0})",
      "({0})",
      "{0}.",
      "{0}."
   };
   private static final char[] u3 = new char[]{
      'أ', 'ب', 'ت', 'ث', 'ج', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'س', 'ش', 'ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ك', 'ل', 'م', 'ن', 'ه', 'و', 'ي'
   };
   private static final x7h$n5[] a6 = new x7h$n5[]{
      new x7h$12(),
      new x7h$21(),
      new x7h$22(),
      new x7h$23(),
      new x7h$24(),
      new x7h$25(),
      new x7h$26(),
      new x7h$27(),
      new x7h$2(),
      new x7h$3(),
      new x7h$4(),
      new x7h$5(),
      new x7h$6(),
      new x7h$7(),
      new x7h$8(),
      new x7h$9(),
      new x7h$10(),
      new x7h$11(),
      new x7h$13(),
      new x7h$14(),
      new x7h$15(),
      new x7h$16(),
      new x7h$17(),
      new x7h$18(),
      new x7h$19(),
      new x7h$20()
   };

   public static String[] n5() {
      return k5;
   }

   public static x7h$n5[] l6() {
      return a6;
   }

   public static x7h$n5 k5() {
      return n5;
   }

   private static String t9(int var0) {
      char var1 = (char)(97 + --var0 % 26);
      var0 = var0 / 26 + 1;
      return com.aspose.slides.ms.System.d1.n5(var1, var0);
   }

   private static String z1(int var0) {
      char var1 = (char)(65 + --var0 % 26);
      var0 = var0 / 26 + 1;
      return com.aspose.slides.ms.System.d1.n5(var1, var0);
   }

   private static String t4(int var0) {
      return com.aspose.slides.ms.System.a3.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }

   private static String q0(int var0) {
      if (var0 < 0) {
         throw new ArgumentException("Roman numbering for a negative number called");
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (var0 >= 1000) {
         var1.n5('m', var0 / 1000);
         var0 %= 1000;
      }

      if (var0 >= 900) {
         var1.n5("cm");
         var0 -= 900;
      }

      if (var0 >= 500) {
         var1.n5('d');
         var0 -= 500;
      }

      if (var0 >= 400) {
         var1.n5("cd");
         var0 -= 400;
      }

      if (var0 >= 100) {
         var1.n5('c', var0 / 100);
         var0 %= 100;
      }

      if (var0 >= 90) {
         var1.n5("xc");
         var0 -= 90;
      }

      if (var0 >= 50) {
         var1.n5('l');
         var0 -= 50;
      }

      if (var0 >= 40) {
         var1.n5("xl");
         var0 -= 40;
      }

      if (var0 >= 10) {
         var1.n5('x', var0 / 10);
         var0 %= 10;
      }

      if (var0 >= 9) {
         var1.n5("ix");
         var0 -= 9;
      }

      if (var0 >= 5) {
         var1.n5('v');
         var0 -= 5;
      }

      if (var0 >= 4) {
         var1.n5("iv");
         var0 -= 4;
      }

      if (var0 >= 1) {
         var1.n5('i', var0);
      }

      return var1.toString();
   }

   private static String z3(int var0) {
      if (var0 < 0) {
         throw new ArgumentException("Roman numbering for a negative number called");
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (var0 >= 1000) {
         var1.n5('M', var0 / 1000);
         var0 %= 1000;
      }

      if (var0 >= 900) {
         var1.n5("CM");
         var0 -= 900;
      }

      if (var0 >= 500) {
         var1.n5('D');
         var0 -= 500;
      }

      if (var0 >= 400) {
         var1.n5("CD");
         var0 -= 400;
      }

      if (var0 >= 100) {
         var1.n5('C', var0 / 100);
         var0 %= 100;
      }

      if (var0 >= 90) {
         var1.n5("XC");
         var0 -= 90;
      }

      if (var0 >= 50) {
         var1.n5('L');
         var0 -= 50;
      }

      if (var0 >= 40) {
         var1.n5("XL");
         var0 -= 40;
      }

      if (var0 >= 10) {
         var1.n5('X', var0 / 10);
         var0 %= 10;
      }

      if (var0 >= 9) {
         var1.n5("IX");
         var0 -= 9;
      }

      if (var0 >= 5) {
         var1.n5('V');
         var0 -= 5;
      }

      if (var0 >= 4) {
         var1.n5("IV");
         var0 -= 4;
      }

      if (var0 >= 1) {
         var1.n5('I', var0);
      }

      return var1.toString();
   }

   private static String m1(int var0) {
      String var5;
      if (var0 >= 100) {
         var5 = t4(var0);
         char[] var2 = com.aspose.slides.ms.System.d1.c8(var5);

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = l6[var2[var3] - '0'];
         }

         var5 = com.aspose.slides.ms.System.d1.n5(var2);
      } else {
         int var6 = var0 / 10;
         if (var6 > 1) {
            var5 = com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.t9.q0(l6[var6]), l6[10]});
         } else if (var6 == 1) {
            var5 = com.aspose.slides.ms.System.t9.q0(l6[10]);
         } else {
            var5 = "";
         }

         var0 %= 10;
         if (var0 > 0) {
            var5 = com.aspose.slides.ms.System.d1.l6(var5, l6[var0]);
         }
      }

      return var5;
   }

   private static String k7(int var0) {
      if (var0 <= 20) {
         var0 += 9311;
         return com.aspose.slides.ms.System.d1.n5((char)var0, 1);
      } else {
         return t4(var0);
      }
   }

   private static String m3(int var0) {
      var0 = var0 % 10 == 0 ? 10 : var0 % 10;
      var0 += 9311;
      return com.aspose.slides.ms.System.d1.n5((char)var0, 1);
   }

   private static String z8(int var0) {
      var0 = var0 % 10 == 0 ? 10 : var0 % 10;
      var0 += 10101;
      return com.aspose.slides.ms.System.d1.n5((char)var0, 1);
   }

   private static String j5(int var0) {
      if (var0 > 22) {
         return com.aspose.slides.ms.System.d1.n5(new Object[]{j5(var0 - 22), 'ת'});
      }

      if (var0 >= 18) {
         var0 += 5;
      } else if (var0 >= 17) {
         var0 += 4;
      } else if (var0 >= 14) {
         var0 += 3;
      } else if (var0 >= 13) {
         var0 += 2;
      } else if (var0 >= 11) {
         var0++;
      }

      char var1 = (char)(1488 + --var0);
      return com.aspose.slides.ms.System.d1.n5(var1, 1);
   }

   private static String w1(int var0) {
      if (var0 > 28) {
         return com.aspose.slides.ms.System.d1.n5(new Object[]{w1(var0 - 28), u3[var0 - 29]});
      }

      char var1 = u3[var0 - 1];
      return com.aspose.slides.ms.System.d1.n5(var1, 1);
   }

   private static String r4(int var0) {
      return m1(var0);
   }

   private static String c4(int var0) {
      return m1(var0);
   }

   private static String y2(int var0) {
      return w1(var0);
   }

   private static String y1(int var0) {
      return k5().n5(var0);
   }

   // $VF: synthetic method
   static String n5(int var0) {
      return t4(var0);
   }

   // $VF: synthetic method
   static String l6(int var0) {
      return t9(var0);
   }

   // $VF: synthetic method
   static String k5(int var0) {
      return z1(var0);
   }

   // $VF: synthetic method
   static String u3(int var0) {
      return q0(var0);
   }

   // $VF: synthetic method
   static String a6(int var0) {
      return z3(var0);
   }

   // $VF: synthetic method
   static String u9(int var0) {
      return m1(var0);
   }

   // $VF: synthetic method
   static String h0(int var0) {
      return k7(var0);
   }

   // $VF: synthetic method
   static String c8(int var0) {
      return m3(var0);
   }

   // $VF: synthetic method
   static String t2(int var0) {
      return z8(var0);
   }

   // $VF: synthetic method
   static String s7(int var0) {
      return r4(var0);
   }

   // $VF: synthetic method
   static String x8(int var0) {
      return c4(var0);
   }

   // $VF: synthetic method
   static String n3(int var0) {
      return y2(var0);
   }

   // $VF: synthetic method
   static String y4(int var0) {
      return y1(var0);
   }

   // $VF: synthetic method
   static String e2(int var0) {
      return j5(var0);
   }
}
