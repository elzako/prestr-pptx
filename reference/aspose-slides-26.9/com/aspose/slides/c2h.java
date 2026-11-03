package com.aspose.slides;

class c2h {
   public static String n5(String var0, String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         boolean var5 = var3 == 0;
         String var6 = null;
         int var7 = 0;
         String[] var8 = new String[]{var6};
         int[] var9 = new int[]{0};
         boolean var10 = l6(var3, var0, var1, var8, var9);
         var6 = var8[0];
         var7 = var9[0];
         if (var10) {
            var2.n5(var6);
            var3 = var7;
         } else {
            var8[0] = var6;
            var9[0] = var7;
            boolean var11 = n5(var3, var0, var1, var8, var9);
            var6 = var8[0];
            var7 = var9[0];
            if (var11) {
               var2.n5(var6);
               var3 = var7;
            } else {
               var8[0] = var6;
               var9[0] = var7;
               boolean var12 = n5(var3, var0, var1, var5, var8, var9);
               var6 = var8[0];
               var7 = var9[0];
               if (var12) {
                  var2.n5(var6);
                  var3 = var7;
               } else {
                  var8[0] = var6;
                  var9[0] = var7;
                  boolean var13 = k5(var3, var0, var1, var8, var9);
                  var6 = var8[0];
                  var7 = var9[0];
                  if (var13) {
                     var2.n5(var6);
                     var3 = var7;
                  } else if (n5(var4)) {
                     var2.n5(var1).n5(var4);
                  } else if (n5(var4, var5, var0, var3)) {
                     var2.n5(var1).n5(var4);
                  } else {
                     var8[0] = var6;
                     var9[0] = var7;
                     boolean var14 = u3(var3, var0, var1, var8, var9);
                     var6 = var8[0];
                     var7 = var9[0];
                     if (var14) {
                        var2.n5(var6);
                        var3 = var7;
                     } else {
                        var2.n5(var4);
                     }
                  }
               }
            }
         }
      }

      return var2.toString();
   }

   private static boolean n5(char var0) {
      return var0 == '\\' || var0 == '`' || var0 == '*' || var0 == '|';
   }

   private static boolean n5(char var0, boolean var1, String var2, int var3) {
      if (!var1) {
         return false;
      }

      if (var0 == '#' || var0 == '+' || var0 == '-') {
         int var4 = var3 + 1;
         if (var4 < var2.length() && com.aspose.slides.ms.System.t9.t9(var2.charAt(var4))) {
            return true;
         }
      }

      return var0 == '>';
   }

   private static boolean n5(int var0, String var1, String var2, String[] var3, int[] var4) {
      var3[0] = null;
      var4[0] = var0;
      if (var1.charAt(var0) == '<') {
         int var5 = com.aspose.slides.ms.System.d1.l6(var1, '>', var0 + 1);
         if (var5 > var0 + 1) {
            String var6 = com.aspose.slides.ms.System.d1.l6(var1, var0 + 1, var5 - var0 - 1);
            if (!com.aspose.slides.ms.System.d1.n5(var6) && com.aspose.slides.ms.System.d1.u3(var6, ' ') == -1) {
               for (int var7 = 0; var7 < var6.length(); var7++) {
                  if (com.aspose.slides.ms.System.t9.u3(var6.charAt(var7))) {
                     return false;
                  }
               }

               var3[0] = com.aspose.slides.ms.System.d1.n5(var2, "<", var6, var2, ">");
               var4[0] = var5;
               return true;
            }
         }
      }

      return false;
   }

   private static boolean l6(int var0, String var1, String var2, String[] var3, int[] var4) {
      var3[0] = null;
      var4[0] = var0;
      if (var1.charAt(var0) == '[' || var1.charAt(var0) == '!' && var0 + 1 < var1.length() && var1.charAt(var0 + 1) == '[') {
         int var5 = var1.charAt(var0) == '!' ? var0 + 1 : var0;
         int var6 = com.aspose.slides.ms.System.d1.l6(var1, ']', var5);
         if (var6 > var5 && var6 + 1 < var1.length() && var1.charAt(var6 + 1) == '(') {
            int var7 = com.aspose.slides.ms.System.d1.l6(var1, ')', var6 + 2);
            if (var7 > var6 + 2) {
               com.aspose.slides.internal.l7h.a5 var8 = new com.aspose.slides.internal.l7h.a5();
               if (var1.charAt(var0) == '!') {
                  var8.n5(var2).n5("!");
               }

               var8.n5(var2).n5("[");
               var8.n5(com.aspose.slides.ms.System.d1.l6(var1, var5 + 1, var6 - var5 - 1));
               var8.n5(var2).n5("]");
               var8.n5(var2).n5("(");
               var8.n5(com.aspose.slides.ms.System.d1.l6(var1, var6 + 2, var7 - var6 - 2));
               var8.n5(var2).n5(")");
               var3[0] = var8.toString();
               var4[0] = var7;
               return true;
            }
         }
      }

      return false;
   }

   private static boolean n5(int var0, String var1, String var2, boolean var3, String[] var4, int[] var5) {
      var4[0] = null;
      var5[0] = var0;
      if (var3 && com.aspose.slides.ms.System.t9.u3(var1.charAt(var0))) {
         int var6 = var0;

         while (var6 < var1.length() && com.aspose.slides.ms.System.t9.u3(var1.charAt(var6))) {
            var6++;
         }

         if (var6 < var1.length() && (var1.charAt(var6) == '.' || var1.charAt(var6) == ')')) {
            int var7 = var6 + 1;
            if (var7 < var1.length() && com.aspose.slides.ms.System.t9.t9(var1.charAt(var7))) {
               var4[0] = com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.d1.l6(var1, var0, var6 - var0), var2, var1.charAt(var6)});
               var5[0] = var6;
               return true;
            }
         }
      }

      return false;
   }

   private static boolean k5(int var0, String var1, String var2, String[] var3, int[] var4) {
      var3[0] = null;
      var4[0] = var0;
      if (var1.charAt(var0) != '_') {
         return false;
      }

      if (var0 > 0 && var1.charAt(var0 - 1) != ' ') {
         return false;
      }

      int var5 = 1;

      while (var0 + var5 < var1.length() && var1.charAt(var0 + var5) == '_') {
         var5++;
      }

      String var6 = com.aspose.slides.ms.System.d1.n5('_', var5);
      int var7 = com.aspose.slides.ms.System.d1.n5(var1, var6, var0 + var5);
      if (var7 > var0 + var5) {
         String var8 = com.aspose.slides.ms.System.d1.l6(var1, var0 + var5, var7 - (var0 + var5));
         if (!com.aspose.slides.ms.System.d1.l6(var8).isEmpty()) {
            com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();

            for (int var10 = 0; var10 < var5; var10++) {
               var9.n5(var2).n5("_");
            }

            var9.n5(var8);

            for (int var11 = 0; var11 < var5; var11++) {
               var9.n5(var2).n5("_");
            }

            var3[0] = var9.toString();
            var4[0] = var7 + var5 - 1;
            return true;
         }
      }

      return false;
   }

   private static boolean u3(int var0, String var1, String var2, String[] var3, int[] var4) {
      var3[0] = null;
      var4[0] = var0;
      byte var5 = 45;
      if (var0 == 0 && var1.charAt(var0) == '-') {
         int var6 = 0;

         while (var6 < var1.length() && var1.charAt(var6) == '-') {
            var6++;
         }

         if (var6 > 0 && var6 == var1.length()) {
            com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5(var1.length() * 2);

            for (int var8 = 0; var8 < var6; var8++) {
               var7.n5(var2).n5('-');
            }

            var3[0] = var7.toString();
            var4[0] = var6 - 1;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
