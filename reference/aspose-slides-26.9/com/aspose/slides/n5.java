package com.aspose.slides;

class n5 {
   public static void n5(String var0, int[] var1, int[] var2) {
      com.aspose.slides.internal.r7c.u3 var3 = new com.aspose.slides.internal.r7c.c8("^\\s*([a-zA-Z]+)(\\d+)\\s*$").l6(var0);
      if (!var3.u3()) {
         throw new CellInvalidReferenceException("An invalid cell address is detected.", var0);
      }

      var1[0] = n5(var3.a6().n5(1).k5());
      var2[0] = com.aspose.slides.ms.System.z3.u3(var3.a6().n5(2).k5());
   }

   public static void n5(String var0, int[] var1, int[] var2, int[] var3, int[] var4) {
      com.aspose.slides.internal.r7c.u3 var5 = new com.aspose.slides.internal.r7c.c8("^\\s*([a-zA-Z]+)(\\d+):([a-zA-Z]+)(\\d+)\\s*$").l6(var0);
      if (!var5.u3()) {
         throw new CellInvalidReferenceException("An invalid cell range address is detected.", var0);
      }

      var1[0] = n5(var5.a6().n5(1).k5());
      var2[0] = com.aspose.slides.ms.System.z3.u3(var5.a6().n5(2).k5());
      var3[0] = n5(var5.a6().n5(3).k5());
      var4[0] = com.aspose.slides.ms.System.z3.u3(var5.a6().n5(4).k5());
   }

   public static a1h n5(String var0, int var1, int var2, String var3) {
      com.aspose.slides.internal.r7c.u3 var4 = new com.aspose.slides.internal.r7c.c8("^\\s*(\\$?)([a-zA-Z]+)(\\$?)(\\d+)\\s*$").l6(var0);
      if (!var4.u3()) {
         return null;
      }

      boolean var5 = "$".equals(var4.a6().n5(1).k5());
      int var6 = n5(var4.a6().n5(2).k5());
      if (!var5) {
         var6 -= var1;
      }

      boolean var7 = "$".equals(var4.a6().n5(3).k5());
      int var8 = com.aspose.slides.ms.System.z3.u3(var4.a6().n5(4).k5());
      if (!var7) {
         var8 -= var2;
      }

      q8x var9 = new q8x(var8, var7, var3);
      e8b var10 = new e8b(var6, var5, var3);
      return new y9w(var9, var10, var3);
   }

   public static a1h n5(String var0, int var1, int var2) {
      com.aspose.slides.internal.r7c.u3 var3 = new com.aspose.slides.internal.r7c.c8("'(.*)'!(\\$?)([a-zA-Z]+)(\\$?)(\\d+)").l6(var0);
      if (!var3.u3()) {
         var3 = new com.aspose.slides.internal.r7c.c8("([a-zA-Z0-9_]*)!(\\$?)([a-zA-Z]+)(\\$?)(\\d+)").l6(var0);
         if (!var3.u3()) {
            return null;
         }
      }

      String var4 = k5(var3.a6().n5(1).k5());
      var4 = com.aspose.slides.ms.System.d1.n5(var4, "''", "'");
      boolean var5 = "$".equals(var3.a6().n5(2).k5());
      int var6 = n5(var3.a6().n5(3).k5());
      if (!var5) {
         var6 -= var1;
      }

      boolean var7 = "$".equals(var3.a6().n5(4).k5());
      int var8 = com.aspose.slides.ms.System.z3.u3(var3.a6().n5(5).k5());
      if (!var7) {
         var8 -= var2;
      }

      q8x var9 = new q8x(var8, var7, var4);
      e8b var10 = new e8b(var6, var5, var4);
      return new y9w(var9, var10, var4);
   }

   public static a1h n5(String var0, int var1, String var2) {
      com.aspose.slides.internal.r7c.u3 var3 = new com.aspose.slides.internal.r7c.c8("(.*?)(\\$?)(\\d+):(.*?)(\\$?)(\\d+)\\s*$").l6(var0);
      if (!var3.u3()) {
         return null;
      }

      String var4 = l6(var3.a6().n5(1).k5());
      boolean var5 = "$".equals(var3.a6().n5(2).k5());
      int var6 = com.aspose.slides.ms.System.z3.u3(var3.a6().n5(3).k5());
      String var7 = l6(var3.a6().n5(4).k5());
      boolean var8 = "$".equals(var3.a6().n5(5).k5());
      int var9 = com.aspose.slides.ms.System.z3.u3(var3.a6().n5(6).k5());
      boolean var10 = var5 && var8;
      boolean var11 = !var5 && !var8;
      if (var4 == null) {
         var4 = var2;
      }

      if (var7 == null) {
         var7 = var4;
      }

      if (var6 != var9 || !var10 && !var11) {
         if (!var5) {
            var6 -= var1;
         }

         if (!var8) {
            var9 -= var1;
         }

         q8x var14 = new q8x(var6, var5, var4);
         q8x var13 = new q8x(var9, var8, var7);
         return new c2e(var14, var13, var2);
      } else {
         int var12 = var10 ? var6 : var6 - var1;
         return new q8x(var12, var10, var7);
      }
   }

   public static a1h n5(String var0, int var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8("'(.*?)'!(\\$?)(\\d)+:(\\$?)(\\d+)").l6(var0);
      if (!var2.u3()) {
         var2 = new com.aspose.slides.internal.r7c.c8("([a-zA-Z0-9_]+)!(\\$?)(\\d+):(\\$?)(\\d+)").l6(var0);
         if (!var2.u3()) {
            return null;
         }
      }

      String var3 = k5(var2.a6().n5(1).k5());
      var3 = com.aspose.slides.ms.System.d1.n5(var3, "''", "'");
      boolean var4 = "$".equals(var2.a6().n5(2).k5());
      int var5 = com.aspose.slides.ms.System.z3.u3(var2.a6().n5(3).k5());
      boolean var6 = "$".equals(var2.a6().n5(4).k5());
      int var7 = com.aspose.slides.ms.System.z3.u3(var2.a6().n5(5).k5());
      boolean var8 = var4 && var6;
      boolean var9 = !var4 && !var6;
      if (var5 != var7 || !var8 && !var9) {
         if (!var4) {
            var5 -= var1;
         }

         if (!var6) {
            var7 -= var1;
         }

         q8x var13 = new q8x(var5, var4, var3);
         q8x var11 = new q8x(var7, var6, var3);
         return new c2e(var13, var11, var3);
      } else {
         int var10 = var8 ? var5 : var5 - var1;
         return new q8x(var10, var8, var3);
      }
   }

   public static a1h l6(String var0, int var1, String var2) {
      com.aspose.slides.internal.r7c.u3 var3 = new com.aspose.slides.internal.r7c.c8("(.*?)(\\$?)([a-zA-Z]+):(.*?)(\\$?)([a-zA-Z]+)\\s*$").l6(var0);
      if (!var3.u3()) {
         return null;
      }

      String var4 = l6(var3.a6().n5(1).k5());
      boolean var5 = "$".equals(var3.a6().n5(2).k5());
      int var6 = n5(var3.a6().n5(3).k5());
      String var7 = l6(var3.a6().n5(4).k5());
      boolean var8 = "$".equals(var3.a6().n5(5).k5());
      int var9 = n5(var3.a6().n5(6).k5());
      boolean var10 = var5 && var8;
      boolean var11 = !var5 && !var8;
      if (var4 == null) {
         var4 = var2;
      }

      if (var7 == null) {
         var7 = var4;
      }

      if (var6 != var9 || !var10 && !var11) {
         if (!var5) {
            var6 -= var1;
         }

         if (!var8) {
            var9 -= var1;
         }

         e8b var14 = new e8b(var6, var5, var4);
         e8b var13 = new e8b(var9, var8, var7);
         return new c2e(var14, var13, var2);
      } else {
         int var12 = var10 ? var6 : var6 - var1;
         return new e8b(var12, var10, var7);
      }
   }

   public static a1h l6(String var0, int var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8("'(.*?)'!(\\$?)([a-zA-Z]+):(\\$?)([a-zA-Z]+)").l6(var0);
      if (!var2.u3()) {
         var2 = new com.aspose.slides.internal.r7c.c8("([a-zA-Z0-9_]+)!(\\$?)([a-zA-Z]+):(\\$?)([a-zA-Z]+)").l6(var0);
         if (!var2.u3()) {
            return null;
         }
      }

      String var3 = k5(var2.a6().n5(1).k5());
      var3 = com.aspose.slides.ms.System.d1.n5(var3, "''", "'");
      boolean var4 = "$".equals(var2.a6().n5(2).k5());
      int var5 = n5(var2.a6().n5(3).k5());
      boolean var6 = "$".equals(var2.a6().n5(4).k5());
      int var7 = n5(var2.a6().n5(5).k5());
      boolean var8 = var4 && var6;
      boolean var9 = !var4 && !var6;
      if (var5 != var7 || !var8 && !var9) {
         if (!var4) {
            var5 -= var1;
         }

         if (!var6) {
            var7 -= var1;
         }

         e8b var13 = new e8b(var5, var4, var3);
         e8b var11 = new e8b(var7, var6, var3);
         return new c2e(var13, var11, var3);
      } else {
         int var10 = var8 ? var5 : var5 - var1;
         return new e8b(var10, var8, var3);
      }
   }

   public static a1h n5(String var0, r6t var1) {
      a1h var2 = l6(var0, var1.k5(), var1.n5().l6());
      if (var2 == null) {
         var2 = n5(var0, var1.l6(), var1.n5().l6());
      }

      if (var2 != null) {
         return var2;
      }

      String[] var3 = com.aspose.slides.ms.System.d1.n5(var0, ':');
      a1h var4 = n5(var3[0], var1.k5(), var1.l6());
      if (var4 == null) {
         var4 = n5(var3[0], var1.k5(), var1.l6(), var1.n5().l6());
      }

      a1h var5 = n5(var3[1], var1.k5(), var1.l6());
      if (var5 == null) {
         var5 = n5(var3[0], var1.k5(), var1.l6(), var1.n5().l6());
      }

      return var4 != null && var5 != null ? new c2e(var4, var5) : null;
   }

   public static a1h l6(String var0, int var1, int var2) {
      com.aspose.slides.internal.r7c.u3 var3 = new com.aspose.slides.internal.r7c.c8("'(.*?)'!(\\$?[a-zA-Z]+\\$?\\d+):(\\$?[a-zA-Z]+\\$?\\d+)").l6(var0);
      if (!var3.u3()) {
         return null;
      }

      String var4 = k5(var3.a6().n5(1).k5());
      var4 = com.aspose.slides.ms.System.d1.n5(var4, "''", "'");
      a1h var5 = n5(com.aspose.slides.ms.System.d1.n5("'", var3.a6().n5(1).k5(), "'!", var3.a6().n5(2).k5()), var1, var2);
      a1h var6 = n5(com.aspose.slides.ms.System.d1.n5("'", var3.a6().n5(1).k5(), "'!", var3.a6().n5(3).k5()), var1, var2);
      return new c2e(var5, var6, var4);
   }

   public static int n5(String var0) {
      String var1 = com.aspose.slides.ms.System.d1.t2(var0);
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         var2 *= 26;
         var2 += var1.charAt(var3) - 'A' + 1;
      }

      return var2;
   }

   public static String n5(int var0) {
      String var1 = "";
      int var2 = var0;

      while (var2 > 0) {
         int var3 = (var2 - 1) % 26;
         var1 = com.aspose.slides.ms.System.d1.n5((char)(65 + var3), var1);
         var2 = (var2 - var3) / 26;
      }

      return var1;
   }

   private static String l6(String var0) {
      if (!com.aspose.slides.ms.System.d1.n5(var0) && com.aspose.slides.ms.System.d1.t2(var0, "!")) {
         if (com.aspose.slides.ms.System.d1.t2(var0, "]")) {
            var0 = com.aspose.slides.ms.System.d1.k5(var0, com.aspose.slides.ms.System.d1.c8(var0, "]") + 1);
         }

         if (var0.charAt(var0.length() - 1) == '!') {
            var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var0.length() - 1);
         }

         if (var0.charAt(var0.length() - 1) == '\'') {
            var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var0.length() - 1);
         }

         return var0;
      } else {
         return null;
      }
   }

   private static String k5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (!com.aspose.slides.ms.System.d1.t2(var0, "]")) {
         return var0;
      }

      int var1 = com.aspose.slides.ms.System.d1.u3(var0, ']');
      return com.aspose.slides.ms.System.d1.l6(var0, ++var1, var0.length() - var1);
   }
}
