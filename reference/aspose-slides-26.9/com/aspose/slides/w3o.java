package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class w3o {
   public static n9p[] n5(String var0) {
      List var1 = new List();
      a0q var2 = new a0q(var0);
      if (var2.n5()) {
         return (n9p[])var1.toArray(new n9p[0]);
      }

      while (!var2.l6()) {
         var2.a6();
         String[] var3 = n5(var2);
         if (var3.length == 0) {
            break;
         }

         var2.u9();
         l3a[] var4 = l6(var2);
         var2.u9();
         n9p var5 = new n9p(var3, var4);
         var1.addItem(var5);
      }

      return (n9p[])var1.toArray(new n9p[0]);
   }

   public static n9p l6(String var0) {
      a0q var1 = new a0q(var0);
      if (!var1.l6()) {
         var1.a6();
         l3a[] var2 = n5(var1, false);
         return new n9p(null, var2);
      } else {
         return null;
      }
   }

   private static String[] n5(a0q var0) {
      List var1 = new List();
      int var2 = var0.k5();
      var0.n5('{');
      if (var0.l6()) {
         return (String[])var1.toArray(new String[0]);
      }

      int var3 = var0.k5();
      String var4 = var0.n5(var2, var3);
      String[] var5 = com.aspose.slides.ms.System.d1.n5(var4, ',');

      for (String var9 : var5) {
         String var10 = k5(com.aspose.slides.ms.System.d1.l6(var9));
         if (!com.aspose.slides.ms.System.d1.n5(var10)) {
            var1.addItem(var10);
         }
      }

      return (String[])var1.toArray(new String[0]);
   }

   private static l3a[] l6(a0q var0) {
      return n5(var0, true);
   }

   private static l3a[] n5(a0q var0, boolean var1) {
      List var2 = new List();
      int var3 = var0.k5();
      var0.n5('}');
      if (var1 && var0.l6()) {
         return (l3a[])var2.toArray(new l3a[0]);
      }

      int var4 = var0.k5();
      String var5 = var0.n5(var3, var4);
      String[] var6 = com.aspose.slides.ms.System.d1.n5(var5, ';');

      for (String var10 : var6) {
         String var11 = com.aspose.slides.ms.System.d1.l6(var10);
         if (!com.aspose.slides.ms.System.d1.n5(var11)) {
            int var12 = com.aspose.slides.ms.System.d1.u3(var11, ':');
            String var13 = k5(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var11, 0, var12 == -1 ? 0 : var12)));
            String var14 = k5(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var11, var12 == -1 ? 0 : var12 + 1)));
            l3a var15 = new l3a(var13, var14);
            var2.addItem(var15);
         }
      }

      return (l3a[])var2.toArray(new l3a[0]);
   }

   private static String k5(String var0) {
      return com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.k5(var0,new char[]{ '\''}),new char[]{ '"'});
   }
}
