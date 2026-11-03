package com.aspose.slides;

class e2q {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("pi");

   public static z9l n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return new q0y(0.0F);
      }

      if (w3u.n5(var0)) {
         return new w3u(var0);
      }

      switch (n5.n5(var0)) {
         case 0:
            return new q0y((float) Math.PI);
         default:
            for (int var1 = 0; var1 < var0.length(); var1++) {
               if (t7.n5(var0.charAt(var1))) {
                  return n5(var0, var1);
               }

               switch (var0.charAt(var1)) {
                  case '(':
                     int[] var2 = new int[]{var1};
                     n5(var0, var2);
                     var1 = var2[0];
                     break;
               }
            }

            if (var0.charAt(0) == '(' && var0.charAt(var0.length() - 1) == ')') {
               return n5(com.aspose.slides.ms.System.d1.l6(var0, 1, var0.length() - 2));
            } else {
               float var4 = 0.0F;
               float[] var6 = new float[]{0.0F};
               boolean var3 = com.aspose.slides.ms.System.n1.n5(var0, 511, com.aspose.slides.internal.x7n.l6.k5(), var6);
               var4 = var6[0];
               return var3 ? new q0y(var4) : l6(var0);
            }
      }
   }

   private static z9l l6(String var0) {
      if (var0.charAt(var0.length() - 1) != ')') {
         return null;
      }

      int var1 = com.aspose.slides.ms.System.d1.u3(var0, '(');
      if (var1 <= 0) {
         return null;
      }

      String var2 = com.aspose.slides.ms.System.d1.l6(var0, 0, var1);
      if (!o5z.n5(var2)) {
         return null;
      }

      String var3 = com.aspose.slides.ms.System.d1.l6(var0, var1 + 1, var0.length() - var1 - 2);
      z9l var4 = n5(var3);
      return var4 == null ? null : new o5z(var2, var4);
   }

   private static void n5(String var0, int[] var1) {
      int var2 = 0;

      while (var1[0] < var0.length()) {
         switch (var0.charAt(var1[0])) {
            case '(':
               var2++;
               break;
            case ')':
               if (--var2 == 0) {
                  return;
               }
         }

         var1[0]++;
      }
   }

   private static z9l n5(String var0, int var1) {
      z9l var2 = n5(com.aspose.slides.ms.System.d1.l6(var0, 0, var1));
      if (var2 == null) {
         return null;
      }

      z9l var3 = n5(com.aspose.slides.ms.System.d1.k5(var0, var1 + 1));
      if (var3 == null) {
         return null;
      }

      char var4 = var0.charAt(var1);
      return new t7(var4, var2, var3);
   }
}
