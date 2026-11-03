package com.aspose.slides;

class u1x {
   public static a1h n5(String var0, String var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8("^\\s*R((\\d+)|\\[(-?\\d*)\\])?\\s*C((\\d+)|\\[(-?\\d*)\\])?\\s*$")
         .l6(var0);
      if (!var2.u3()) {
         return null;
      }

      int var3;
      boolean var4;
      if (!com.aspose.slides.ms.System.d1.a6(var2.a6().n5(2).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var3 = com.aspose.slides.ms.System.a3.n5(var2.a6().n5(2).k5());
         if (var3 < 1) {
            return null;
         }

         var4 = true;
      } else {
         String var5 = var2.a6().n5(3).k5();
         var3 = !"".equals(var5) && !"-".equals(var5) ? com.aspose.slides.ms.System.a3.n5(var5) : 0;
         var4 = false;
      }

      int var6;
      boolean var7;
      if (!com.aspose.slides.ms.System.d1.a6(var2.a6().n5(5).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var6 = com.aspose.slides.ms.System.a3.n5(var2.a6().n5(5).k5());
         if (var6 < 1) {
            return null;
         }

         var7 = true;
      } else {
         String var9 = var2.a6().n5(6).k5();
         var6 = !"".equals(var9) && !"-".equals(var9) ? com.aspose.slides.ms.System.a3.n5(var9) : 0;
         var7 = false;
      }

      q8x var10 = new q8x(var3, var4, var1);
      e8b var8 = new e8b(var6, var7, var1);
      return new y9w(var10, var8, var1);
   }

   public static a1h n5(String var0) {
      com.aspose.slides.internal.r7c.u3 var1 = new com.aspose.slides.internal.r7c.c8("'(.*?)'!R(\\d+|\\[-?\\d*\\])?\\s*C(\\d+|\\[-?\\d*\\])?").l6(var0);
      if (!var1.u3()) {
         var1 = new com.aspose.slides.internal.r7c.c8("([a-zA-Z0-9]+)!R(\\d+|\\[-?\\d*\\])?\\s*C(\\d+|\\[-?\\d*\\])?").l6(var0);
         if (!var1.u3()) {
            return null;
         }
      }

      String var2 = var1.a6().n5(1).k5();
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "''", "'");
      int var3;
      boolean var4;
      if (!com.aspose.slides.ms.System.d1.a6(var1.a6().n5(2).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var3 = com.aspose.slides.ms.System.a3.n5(var1.a6().n5(2).k5());
         if (var3 < 1) {
            return null;
         }

         var4 = true;
      } else {
         String var5 = var1.a6().n5(3).k5();
         var3 = !"".equals(var5) && !"-".equals(var5) ? com.aspose.slides.ms.System.a3.n5(var5) : 0;
         var4 = false;
      }

      int var6;
      boolean var7;
      if (!com.aspose.slides.ms.System.d1.a6(var1.a6().n5(3).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var6 = com.aspose.slides.ms.System.a3.n5(var1.a6().n5(3).k5());
         if (var6 < 1) {
            return null;
         }

         var7 = true;
      } else {
         String var10 = var1.a6().n5(3).k5();
         var6 = !"".equals(var10) && !"-".equals(var10) ? com.aspose.slides.ms.System.a3.n5(var10) : 0;
         var7 = false;
      }

      q8x var11 = new q8x(var3, var4, var2);
      e8b var8 = new e8b(var6, var7, var2);
      return new y9w(var11, var8, var2);
   }

   public static a1h l6(String var0, String var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8("^\\s*R((\\d+)|\\[(-?\\d*)\\])?\\s*$").l6(var0);
      if (!var2.u3()) {
         return null;
      }

      int var3;
      boolean var4;
      if (!com.aspose.slides.ms.System.d1.a6(var2.a6().n5(2).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var3 = com.aspose.slides.ms.System.a3.n5(var2.a6().n5(2).k5());
         if (var3 < 1) {
            return null;
         }

         var4 = true;
      } else {
         String var5 = var2.a6().n5(3).k5();
         var3 = !"".equals(var5) && !"-".equals(var5) ? com.aspose.slides.ms.System.a3.n5(var5) : 0;
         var4 = false;
      }

      return new q8x(var3, var4, var1);
   }

   public static a1h l6(String var0) {
      com.aspose.slides.internal.r7c.u3 var1 = new com.aspose.slides.internal.r7c.c8("'(.*?)'!R((\\d+)|\\[(-?\\d*)\\])?").l6(var0);
      if (!var1.u3()) {
         var1 = new com.aspose.slides.internal.r7c.c8("([a-zA-Z0-9_]+)!R((\\d+)|\\[(-?\\d*)\\])?").l6(var0);
         if (!var1.u3()) {
            return null;
         }
      }

      String var2 = var1.a6().n5(1).k5();
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "''", "'");
      int var3;
      boolean var4;
      if (!com.aspose.slides.ms.System.d1.a6(var1.a6().n5(3).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var3 = com.aspose.slides.ms.System.a3.n5(var1.a6().n5(3).k5());
         if (var3 < 1) {
            return null;
         }

         var4 = true;
      } else {
         String var5 = var1.a6().n5(4).k5();
         var3 = !"".equals(var5) && !"-".equals(var5) ? com.aspose.slides.ms.System.a3.n5(var5) : 0;
         var4 = false;
      }

      return new q8x(var3, var4, var2);
   }

   public static a1h k5(String var0, String var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8("^\\s*C((\\d+)|\\[(-?\\d*)\\])?\\s*$").l6(var0);
      if (!var2.u3()) {
         return null;
      }

      int var3;
      boolean var4;
      if (!com.aspose.slides.ms.System.d1.a6(var2.a6().n5(2).k5(), com.aspose.slides.ms.System.d1.n5)) {
         var3 = com.aspose.slides.ms.System.a3.n5(var2.a6().n5(2).k5());
         if (var3 < 1) {
            return null;
         }

         var4 = true;
      } else {
         String var5 = var2.a6().n5(3).k5();
         var3 = !"".equals(var5) && !"-".equals(var5) ? com.aspose.slides.ms.System.a3.n5(var5) : 0;
         var4 = false;
      }

      return new e8b(var3, var4, var1);
   }

   public static a1h k5(String var0) {
      com.aspose.slides.internal.r7c.u3 var1 = new com.aspose.slides.internal.r7c.c8("'(.*?)'!C((\\d+)|\\[(-?\\d*)\\])?").l6(var0);
      if (!var1.u3()) {
         var1 = new com.aspose.slides.internal.r7c.c8("([a-zA-Z0-9_]+)!C((\\d+)|\\[(-?\\d*)\\])?").l6(var0);
         if (!var1.u3()) {
            return null;
         }
      }

      String var2 = var1.a6().n5(1).k5();
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "''", "'");
      int var3;
      boolean var4;
      if (!com.aspose.slides.ms.System.d1.n5(var1.a6().n5(3).k5())) {
         var3 = com.aspose.slides.ms.System.a3.n5(var1.a6().n5(3).k5());
         if (var3 < 1) {
            return null;
         }

         var4 = true;
      } else {
         String var5 = var1.a6().n5(4).k5();
         var3 = !"".equals(var5) && !"-".equals(var5) ? com.aspose.slides.ms.System.a3.n5(var5) : 0;
         var4 = false;
      }

      return new e8b(var3, var4, var2);
   }

   public static a1h u3(String var0) {
      com.aspose.slides.internal.r7c.u3 var1 = new com.aspose.slides.internal.r7c.c8(
            "'(.*?)'!(R\\d+|\\[-?\\d*\\]?\\s*C\\d+|\\[-?\\d*\\])?:(R\\d+|\\[-?\\d*\\]?\\s*C\\d+|\\[-?\\d*\\])?"
         )
         .l6(var0);
      if (!var1.u3()) {
         return null;
      }

      String var2 = var1.a6().n5(1).k5();
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "''", "'");
      a1h var3 = n5(com.aspose.slides.ms.System.d1.n5("'", var1.a6().n5(1).k5(), "'!", var1.a6().n5(2).k5()));
      a1h var4 = n5(com.aspose.slides.ms.System.d1.n5("'", var1.a6().n5(1).k5(), "'!", var1.a6().n5(3).k5()));
      return new c2e(var3, var4, var2);
   }
}
