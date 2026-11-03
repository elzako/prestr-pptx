package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.FormatException;

public abstract class b3 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
      "urn:schemas-microsoft-com:vml",
      "urn:schemas-microsoft-com:office:office",
      "http://schemas.microsoft.com/office/powerpoint/2010/main",
      "http://schemas.openxmlformats.org/officeDocument/2006/math",
      "Infinity",
      "INF",
      "-Infinity",
      "-INF",
      "-"
   );

   public abstract void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3);

   protected static void n5(com.aspose.slides.ms.System.Xml.c7 var0, b3$n5 var1) {
      while (var0.u3()) {
         if (!"xmlns".equals(var0.e2())) {
            boolean var2 = var1.n5(var0.x8(), var0.z1());
            if (!var2 && !var1.n5(k5(var0), var0.z1())) {
            }
         }
      }

      var0.a6();
   }

   protected static void n5(com.aspose.slides.ms.System.Xml.c7 var0, b3$l6 var1) {
      while (var0.u3()) {
         if (!"xmlns".equals(var0.e2())) {
            boolean var2 = var1.n5(var0.x8(), var0.z1(), var0.l6());
            if (!var2 && !var1.n5(k5(var0), var0.z1(), var0.l6())) {
            }
         }
      }

      var0.a6();
   }

   protected static void n5(com.aspose.slides.ms.System.Xml.c7 var0, b3$k5 var1) {
      if (!var0.m1()) {
         String var2 = var0.n3();
         boolean var3 = false;

         while (var3 && !var0.j5() || var0.u9()) {
            if (var0.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var0.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var0.s7() == 1) {
               var3 = !var1.n5(var0);
               if (var3) {
                  var0.r4();
               }
            }
         }
      }
   }

   protected static void l6(com.aspose.slides.ms.System.Xml.c7 var0) {
      n5(var0, new b3$1());
   }

   protected static String k5(com.aspose.slides.ms.System.Xml.c7 var0) {
      if ("".equals(var0.y4())) {
         return var0.x8();
      }

      switch (n5.n5(var0.y4())) {
         case 0:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"r:", var0.n3()});
         case 1:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"v:", var0.n3()});
         case 2:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"o:", var0.n3()});
         case 3:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"p14:", var0.n3()});
         case 4:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"m:", var0.n3()});
         default:
            return var0.x8();
      }
   }

   protected static double e2(String var0) {
      double var1 = 0.0;
      double[] var3 = new double[]{0.0};
      boolean var4 = n5(var0, var3);
      var1 = var3[0];
      if (var4) {
         return var1;
      }

      var3[0] = var1;
      boolean var5 = !com.aspose.slides.ms.System.d2.n5(var0, 167, com.aspose.slides.internal.x7n.s7.x8(), var3);
      var1 = var3[0];
      if (var5) {
         String var6 = com.aspose.slides.ms.System.d1.l6(var0);
         var3[0] = var1;
         boolean var7 = n5(var6, var3);
         var1 = var3[0];
         if (var7) {
            return var1;
         } else {
            throw new FormatException(com.aspose.slides.ms.System.d1.n5(new String[]{"Couldn't parse string '", var0, "' as a Double"}));
         }
      } else {
         return var1 == 0.0 && var0.charAt(0) == '-' ? -0.0 : var1;
      }
   }

   private static boolean n5(String var0, double[] var1) {
      switch (n5.n5(var0)) {
         case 5:
         case 6:
            var1[0] = Double.POSITIVE_INFINITY;
            return true;
         case 7:
         case 8:
            var1[0] = Double.NEGATIVE_INFINITY;
            return true;
         case 9:
            var1[0] = -0.0;
            return true;
         default:
            var1[0] = 0.0;
            return false;
      }
   }

   protected final void n5(String var1, com.aspose.slides.ms.System.Xml.l1 var2, String var3, String var4, boolean var5) {
      if (var4 != null && var4.length() > 0 && (var4.charAt(var4.length() - 1) == ' ' || var4.charAt(0) == ' ')) {
         var2.n5(var1, var3, null);
         if (var5) {
            var2.a6("xml:space", "", "preserve");
         }

         var2.l6(var4);
         var2.s7();
      } else {
         var2.k5(var1, var3, null, var4);
      }
   }

   protected static com.aspose.slides.ms.System.s4 t9(String var0) {
      String var1 = "0";
      String var2 = "0";
      String var3 = "0";
      com.aspose.slides.internal.r7c.c8 var4 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=S)");
      com.aspose.slides.internal.r7c.u3 var5 = var4.l6(var0);
      if (var5.u3()) {
         var3 = var5.k5();
      }

      var4 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=M)");
      var5 = var4.l6(var0);
      if (var5.u3()) {
         var2 = var5.k5();
      }

      var4 = new com.aspose.slides.internal.r7c.c8("[0-9]+(?=H)");
      var5 = var4.l6(var0);
      if (var5.u3()) {
         var1 = var5.k5();
      }

      com.aspose.slides.ms.System.s4 var6 = com.aspose.slides.ms.System.s4.k5(
            com.aspose.slides.ms.System.s4.k5(
               com.aspose.slides.ms.System.s4.l6(com.aspose.slides.ms.System.d2.n5(var1)),
               com.aspose.slides.ms.System.s4.k5(com.aspose.slides.ms.System.d2.n5(var2))
            ),
            com.aspose.slides.ms.System.s4.u3(com.aspose.slides.ms.System.d2.n5(var3))
         )
         .n3();
      if (var6.h0() == 0.0) {
         float var7 = n5(var0, 0.0F);
         if (var7 > 0.0F) {
            com.aspose.slides.ms.System.s4.u3(var7).u3(var6);
         }
      }

      return var6;
   }

   protected static String n5(com.aspose.slides.ms.System.s4 var0) {
      return com.aspose.slides.ms.System.d1.n5("PT{0}H{1}M{2}S",new Object[]{ var0.l6(), var0.k5(), var0.u3()});
   }

   protected static byte z1(String var0) {
      try {
         return (byte)(com.aspose.slides.ms.System.Xml.f4.t2(var0) ? 1 : 0);
      } catch (FormatException var2) {
         return -1;
      }
   }

   protected static long t4(String var0) {
      int var1 = (6 - var0.length()) / 2;
      long var2 = com.aspose.slides.ms.System.l4.n5(var0, 515);
      return var1 > 0 ? (var2 & 4294967295L) << (8 * var1 & 31) & 4294967295L : var2;
   }

   protected static float n5(String var0, float var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var1;
      } else {
         return com.aspose.slides.ms.System.d1.k5(var0, "s")
            ? l6(com.aspose.slides.ms.System.d1.l6(var0, 0, var0.length() - 1), var1)
            : l6(var0, var1) * 1000.0F;
      }
   }

   protected static float l6(String var0, float var1) {
      float var2 = 0.0F;
      float[] var3 = new float[]{0.0F};
      boolean var4 = !com.aspose.slides.ms.System.n1.n5(var0, 111, com.aspose.slides.internal.x7n.l6.k5(), var3);
      var2 = var3[0];
      return var4 ? var1 : var2;
   }

   protected static long q0(String var0) {
      return n5(var0) & 4294967295L;
   }

   private static long n5(String var0) {
      double var1 = com.aspose.slides.ms.System.d2.n5(var0, 239, com.aspose.slides.internal.x7n.s7.x8());
      return (long)var1;
   }
}
