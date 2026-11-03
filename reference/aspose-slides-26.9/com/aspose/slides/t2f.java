package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class t2f {
   public static com.aspose.slides.internal.o9b.y1 n5(String var0, String var1, String var2, String var3) {
      com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1((float)u9(var0), (float)u9(var1), (float)u9(var2), (float)u9(var3));
      if (com.aspose.slides.ms.System.n1.k5(var4.x8())) {
         var4.k5(0.0F);
      }

      if (com.aspose.slides.ms.System.n1.k5(var4.n3())) {
         var4.u3(0.0F);
      }

      return var4;
   }

   public static <T extends com.aspose.slides.internal.k4y.b3> T n5(Class<T> var0, String var1, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var2) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentNullException("name");
      }

      if (var2 == null) {
         throw new ArgumentNullException("namedObjects");
      }

      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.n5(), var1)) {
               return (T)var4.l6();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (T)com.aspose.slides.internal.v6g.k5.k5(var0);
   }

   public static <T extends com.aspose.slides.internal.k4y.b3> T n5(
      Class<T> var0, String var1, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var2, g7$n5 var3
   ) {
      com.aspose.slides.internal.k4y.b3 var4 = n5(var0, var1, var2);
      if (var4 == null) {
         var4 = var3.n5(var1).l6();
      }

      return (T)var4;
   }

   public static void n5(String var0, int[] var1, int[] var2, int[] var3, int[] var4) {
      var1[0] = var2[0] = var3[0] = var4[0] = 0;
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         String[] var5 = com.aspose.slides.ms.System.d1.n5(var0, ' ');
         var1[0] = com.aspose.slides.ms.System.z3.u3(var5[0]);
         var2[0] = com.aspose.slides.ms.System.z3.u3(var5[1]);
         var3[0] = com.aspose.slides.ms.System.z3.u3(var5[2]);
         var4[0] = com.aspose.slides.ms.System.z3.u3(var5[3]);
      }
   }

   public static void n5(String var0, int[] var1, int[] var2) {
      var1[0] = var2[0] = 0;
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         String[] var3 = com.aspose.slides.ms.System.d1.n5(var0, ' ');
         com.aspose.slides.ms.System.a3.n5(var3[0], var1);
         com.aspose.slides.ms.System.a3.n5(var3[1], var2);
      }
   }

   public static List<int[]> n5(String var0) {
      List var1 = new List();
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         char[] var2 = new char[]{' ', ','};
         String[] var3 = com.aspose.slides.ms.System.d1.u9(var0, var2);

         for (byte var4 = 0; var4 < var3.length; var4 += 2) {
            int[] var5 = new int[]{com.aspose.slides.ms.System.z3.u3(var3[var4]), com.aspose.slides.ms.System.z3.u3(var3[var4 + 1])};
            var1.addItem(var5);
         }
      }

      return var1;
   }

   public static <T extends com.aspose.slides.internal.k4y.b3> Object[] n5(String var0, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         throw new ArgumentNullException("name");
      }

      if (var1 == null) {
         throw new ArgumentNullException("namedObjects");
      }

      List var2 = new List();
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.n5(), var0)) {
               var2.addItem(var4.l6());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2.toArray(new Object[0]);
   }

   public static boolean l6(String var0) {
      return com.aspose.slides.ms.System.d1.n5(var0) ? false : com.aspose.slides.ms.System.d1.c8(var0, "%") > -1;
   }

   public static boolean k5(String var0) {
      return !com.aspose.slides.ms.System.d1.n5(var0);
   }

   public static boolean n5(h2k var0) {
      return var0 != h2k.l6();
   }

   public static int u3(String var0) {
      return n5(var0, 100);
   }

   public static int n5(String var0, int var1) {
      if (k5(var0) && l6(var0)) {
         String var2 = com.aspose.slides.ms.System.d1.n5(var0, "%", "");
         double var3 = 0.0;
         double[] var5 = new double[]{0.0};
         boolean var6 = com.aspose.slides.ms.System.d2.n5(var2, 511, com.aspose.slides.internal.x7n.l6.k5(), var5);
         var3 = var5[0];
         return var6 ? com.aspose.slides.internal.v6g.k5.u3(var3, 14) : var1;
      } else {
         return var1;
      }
   }

   public static byte a6(String var0) {
      return n5(var0, (byte)-1);
   }

   public static byte n5(String var0, byte var1) {
      if (!k5(var0)) {
         return var1;
      } else {
         return (byte)(!"false".equals(var0) && !"0".equals(var0) && !"f".equals(var0) ? 1 : 0);
      }
   }

   public static double u9(String var0) {
      return n5(var0, Double.NaN);
   }

   public static double n5(String var0, double var1) {
      if (!k5(var0)) {
         return var1;
      } else if (com.aspose.slides.ms.System.d1.u9(var0, "in", (short)4) > 0) {
         return c8(var0);
      } else {
         return com.aspose.slides.ms.System.d1.u9(var0, "pt", (short)4) > 0 ? s7(var0) : t2(var0);
      }
   }

   public static double h0(String var0) {
      return l6(var0, Double.NaN);
   }

   public static double l6(String var0, double var1) {
      if (!k5(var0)) {
         return var1;
      } else {
         return l6(var0) ? u3(var0) : u9(var0) * -1.0;
      }
   }

   public static double c8(String var0) {
      if (com.aspose.slides.ms.System.d1.c8(var0, "in") > 0) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "in", "");
      }

      double var1 = com.aspose.slides.ms.System.d2.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      return 72.02813067150636 * var1;
   }

   public static double t2(String var0) {
      if (com.aspose.slides.ms.System.d1.c8(var0, "cm") > 0) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "cm", "");
      }

      double var1 = com.aspose.slides.ms.System.d2.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      return 28.348214285714285 * var1;
   }

   public static double s7(String var0) {
      if (com.aspose.slides.ms.System.d1.c8(var0, "pt") > 0) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "pt", "");
      }

      return com.aspose.slides.ms.System.d2.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, int var1) {
      byte var2 = com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.ms.System.q1.u3(var1 / 100.0F * 255.0F)), 14);
      return com.aspose.slides.internal.o9b.c8.n5(var2 & 255, var0.o8());
   }

   public static com.aspose.slides.internal.o9b.c8 x8(String var0) {
      return n5(var0, com.aspose.slides.internal.o9b.s7.l6(255).o8());
   }

   public static com.aspose.slides.internal.o9b.c8 n5(String var0, com.aspose.slides.internal.o9b.c8 var1) {
      if (!k5(var0)) {
         return var1;
      }

      if (com.aspose.slides.ms.System.d1.u3(var0, '#') != -1) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "#", "");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "transparent")) {
         return com.aspose.slides.internal.o9b.c8.u3;
      }

      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      if (var0.length() == 6) {
         var2 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var0, 0, 2), 512);
         var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var0, 2, 2), 512);
         var4 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var0, 4, 2), 512);
      } else if (var0.length() == 3) {
         var2 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var0.charAt(0), com.aspose.slides.ms.System.t9.q0(var0.charAt(0))}), 512);
         var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var0.charAt(1), com.aspose.slides.ms.System.t9.q0(var0.charAt(1))}), 512);
         var4 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var0.charAt(2), com.aspose.slides.ms.System.t9.q0(var0.charAt(2))}), 512);
      }

      return com.aspose.slides.internal.o9b.c8.n5(var2, var3, var4);
   }

   public static String n5(com.aspose.slides.internal.o9b.c8 var0) {
      if (com.aspose.slides.internal.o9b.c8.n5(var0, com.aspose.slides.internal.o9b.c8.u3)) {
         return "transparent";
      }

      int var1 = var0.x8() & 255;
      int var2 = var0.n3() & 255;
      int var3 = var0.y4() & 255;
      String var4 = com.aspose.slides.ms.System.z3.n5(var1, 16);
      String var5 = com.aspose.slides.ms.System.z3.n5(var2, 16);
      String var6 = com.aspose.slides.ms.System.z3.n5(var3, 16);
      if (var4.length() == 1) {
         var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"0", var4});
      }

      if (var5.length() == 1) {
         var5 = com.aspose.slides.ms.System.d1.n5(new String[]{"0", var5});
      }

      if (var6.length() == 1) {
         var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"0", var6});
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{"#", var4, var5, var6});
   }

   public static double n3(String var0) {
      double var1 = 1.0;
      if (com.aspose.slides.ms.System.d1.c8(var0, "in") > 0) {
         var1 = 72.0;
      }

      String var3 = com.aspose.slides.ms.System.d1.n5(var0, "pt", "");
      var3 = com.aspose.slides.ms.System.d1.n5(var3, "in", "");
      var3 = com.aspose.slides.ms.System.d1.n5(var3, "%", "");
      return com.aspose.slides.ms.System.d2.n5(var3, com.aspose.slides.internal.x7n.l6.k5()) * var1;
   }

   public static <T> void n5(Class<T> var0, IGenericDictionary<String, T> var1, String var2, com.aspose.slides.internal.k4y.g7 var3, t2f$n5<T> var4) {
      if (com.aspose.slides.ms.System.d1.a6(var3.n5(), var2)) {
         T var5 = (T)com.aspose.slides.internal.v6g.k5.n5(var3.l6(), var0);
         if (var5 == null) {
            throw new InvalidOperationException();
         }

         String var6 = var4.n5(var5);
         if (!var1.containsKey(var6)) {
            var1.addItem(var4.n5(var5), var5);
         }
      }
   }

   public static <T> void n5(Class<T> var0, IGenericList<T> var1, String var2, com.aspose.slides.internal.k4y.g7 var3, t2f$n5<T> var4) {
      if (com.aspose.slides.ms.System.d1.a6(var3.n5(), var2)) {
         T var5 = (T)com.aspose.slides.internal.v6g.k5.n5(var3.l6(), var0);
         if (var5 == null) {
            throw new InvalidOperationException();
         }

         var1.addItem(var5);
      }
   }

   public static double y4(String var0) {
      double var1 = 1.0;
      if (com.aspose.slides.ms.System.d1.u9(var0, "cm", (short)4) > 0) {
         var1 = 28.348214285714285;
      } else if (com.aspose.slides.ms.System.d1.u9(var0, "mm", (short)4) > 0) {
         var1 = 2.8348214285714284;
      } else if (com.aspose.slides.ms.System.d1.u9(var0, "in", (short)4) > 0) {
         var1 = 72.02813067150636;
      } else if (com.aspose.slides.ms.System.d1.u9(var0, "pt", (short)4) > 0) {
         var1 = 803.3883971827371;
      }

      String var3 = com.aspose.slides.internal.r7c.c8.n5(var0, "[^0-9.-]", "");
      double var4 = com.aspose.slides.ms.System.d2.n5(var3, com.aspose.slides.internal.x7n.l6.k5());
      return var1 * var4;
   }

   public static String n5(double var0) {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}cm",
         new Object[]{
            com.aspose.slides.ms.System.d2.n5(com.aspose.slides.ms.System.q1.n5((double)(0.0352755905511811 * var0), 3), com.aspose.slides.internal.x7n.l6.k5())
         }
      );
   }

   public static String l6(double var0) {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}in",
         new Object[]{
            com.aspose.slides.ms.System.d2.n5(com.aspose.slides.ms.System.q1.n5((double)(var0 / 72.02813067150636), 5), com.aspose.slides.internal.x7n.l6.k5())
         }
      );
   }

   public static String k5(double var0) {
      return com.aspose.slides.ms.System.d1.n5("{0}pt", new Object[]{com.aspose.slides.ms.System.d2.n5(var0, com.aspose.slides.internal.x7n.l6.k5())});
   }

   public static String u3(double var0) {
      return com.aspose.slides.ms.System.d2.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static byte n5(boolean var0) {
      return (byte)(var0 ? 1 : 0);
   }

   public static String a6(double var0) {
      double var2 = com.aspose.slides.ms.System.d2.k5(var0) ? 100.0 : var0;
      String var4 = com.aspose.slides.ms.System.d2.n5(var2, com.aspose.slides.internal.x7n.l6.k5());
      return com.aspose.slides.ms.System.d1.n5(new String[]{var4, "%"});
   }

   public static String u9(double var0) {
      return var0 <= 0.0 ? n5(var0 * -1.0) : n5(com.aspose.slides.internal.v6g.k5.u3(var0, 14));
   }

   public static void n5(IShape var0, String[] var1, String[] var2, String[] var3, String[] var4) {
      var1[0] = n5(var0.getX());
      var2[0] = n5(var0.getY());
      var3[0] = n5(var0.getWidth());
      var4[0] = n5(var0.getHeight());
   }

   public static String h0(double var0) {
      String var2 = com.aspose.slides.ms.System.d2.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      return com.aspose.slides.ms.System.d1.n5(new String[]{var2, "pt"});
   }

   public static String n5(int var0) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var0), "%"});
   }

   public static int[] e2(String var0) {
      return n5(var0, new int[]{0});
   }

   public static boolean t9(String var0) {
      String var1 = z1(var0);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var1));
   }

   public static String z1(String var0) {
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var0, "\r", ""), "\n", "");
   }

   public static String n5(com.aspose.slides.internal.k4y.g7 var0) {
      return com.aspose.slides.internal.v6g.k5.n5(var0.k5(), String.class);
   }

   public static float t4(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return 0.0F;
      }

      String var1 = var0;
      int var2 = com.aspose.slides.ms.System.d1.u3(var1, '%');
      if (var2 > 0) {
         var1 = com.aspose.slides.ms.System.d1.l6(var1, 0, var2);
      }

      if (com.aspose.slides.ms.System.d1.l6(var1, "super")) {
         var1 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var1, 6));
      } else if (com.aspose.slides.ms.System.d1.l6(var1, "sub")) {
         var1 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var1, 3));
         if (var1.charAt(0) != '-') {
            var1 = com.aspose.slides.ms.System.d1.n5(new Object[]{'-', var1});
         }
      }

      return com.aspose.slides.ms.System.n1.n5(var1, com.aspose.slides.internal.x7n.l6.k5().e2());
   }

   public static int[] n5(String var0, int[] var1) {
      if (!k5(var0)) {
         return var1;
      }

      String[] var2 = com.aspose.slides.ms.System.d1.u3(var0);
      int[] var3 = new int[var2.length];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3[var4] = com.aspose.slides.internal.v6g.k5.u3(
            com.aspose.slides.ms.System.q1.u3(com.aspose.slides.ms.System.z3.n3(var2[var4], com.aspose.slides.internal.x7n.l6.k5())), 14
         );
      }

      return var3;
   }

   public static com.aspose.slides.ms.System.s4 q0(String var0) {
      String var1 = "0";
      String var2 = "0";
      String var3 = "0";
      String var4 = "0";
      String var5 = "0";
      String var6 = "0";
      int var7 = com.aspose.slides.ms.System.d1.u3(var0, 'T');
      com.aspose.slides.internal.r7c.c8 var8 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=S)");
      com.aspose.slides.internal.r7c.u3 var9 = var8.l6(var0);
      if (var9.u3()) {
         var6 = var9.k5();
      }

      var8 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=H)");
      var9 = var8.l6(var0);
      if (var9.u3()) {
         var4 = var9.k5();
      }

      var8 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=D)");
      var9 = var8.l6(var0);
      if (var9.u3()) {
         var3 = var9.k5();
      }

      var8 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=Y)");
      var9 = var8.l6(var0);
      if (var9.u3()) {
         var1 = var9.k5();
      }

      var8 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=M)");
      if (var7 >= 0 && var7 < var0.length()) {
         var9 = var8.l6(var0, var7);
         if (var9.u3()) {
            var5 = var9.k5();
         }

         if (var7 > 0) {
            var9 = var8.n5(var0, 0, var7);
            if (var9.u3()) {
               var2 = var9.k5();
            }
         }
      } else {
         var9 = var8.l6(var0);
         if (var9.u3()) {
            var2 = var9.k5();
         }
      }

      com.aspose.slides.ms.System.j5 var10 = new com.aspose.slides.ms.System.j5(
         com.aspose.slides.ms.System.a3.n5(var1) + 1,
         com.aspose.slides.ms.System.a3.n5(var2) + 1,
         com.aspose.slides.ms.System.a3.n5(var3) + 1,
         com.aspose.slides.ms.System.a3.n5(var4),
         com.aspose.slides.ms.System.a3.n5(var5),
         com.aspose.slides.ms.System.a3.n5(var6)
      );
      com.aspose.slides.ms.System.s4 var11 = com.aspose.slides.ms.System.j5.t2(var10, com.aspose.slides.ms.System.j5.l6).n3();
      if (com.aspose.slides.ms.System.d1.u3(var0, '-') == 0) {
         var11.x8().u3(var11);
      }

      return var11;
   }

   public static String n5(com.aspose.slides.ms.System.s4 var0) {
      com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5(var0.s7().a6());
      String var2 = com.aspose.slides.ms.System.s4.u9(var0, com.aspose.slides.ms.System.s4.k5) ? "-P" : "P";
      if (var1.e2() - 1 > 0) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var1.e2() - 1), "Y"}));
      }

      if (var1.c8() - 1 > 0) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var1.c8() - 1), "M"}));
      }

      if (var1.l6() - 1 > 0) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var1.l6() - 1), "D"}));
      }

      if (var1.u3() > 0 || var1.h0() > 0 || var1.x8() > 0) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, "T");
         if (var1.u3() > 0) {
            var2 = com.aspose.slides.ms.System.d1.n5(var2, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var1.u3()), "H"}));
         }

         if (var1.h0() > 0) {
            var2 = com.aspose.slides.ms.System.d1.n5(var2, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var1.h0()), "M"}));
         }

         if (var1.x8() > 0) {
            var2 = com.aspose.slides.ms.System.d1.n5(var2, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var1.x8()), "S"}));
         }
      }

      return var2;
   }

   public static float n5(String var0, float var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var1;
      }

      float var2 = 1.0F;
      if (com.aspose.slides.ms.System.d1.u9(var0, "rad", (short)4) > 0) {
         var2 = (float) (180.0 / Math.PI);
      } else if (com.aspose.slides.ms.System.d1.u9(var0, "grad", (short)4) > 0) {
         var2 = 0.9F;
      }

      String var3 = com.aspose.slides.internal.r7c.c8.n5(var0, "[^0-9.-]", "");
      float var4 = com.aspose.slides.ms.System.n1.n5(var3, com.aspose.slides.internal.x7n.l6.k5());
      return var4 * var2;
   }
}
