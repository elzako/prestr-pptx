package com.aspose.slides.internal.s6;

final class z6 {
   public static void n5(p3 var0, a5 var1, boolean var2) {
      for (int var3 = 0; var3 < 3; var3++) {
         if (var1 == var1.l6()[var3].l6()[0]) {
            var1.l6()[var3].l6()[0] = null;
            if (!var2 && var1.l6()[var3].l6()[1] == null) {
               var0.l6().l6(var1.l6()[var3]);
            }
         } else if (var1 == var1.l6()[var3].l6()[1]) {
            var1.l6()[var3].l6()[1] = null;
            if (!var2 && var1.l6()[var3].l6()[0] == null) {
               var0.l6().l6(var1.l6()[var3]);
            }
         }
      }

      for (int var4 = 0; var4 < 3; var4++) {
         var1.n5()[var4].u3().l6(var1);
      }

      var0.u3().l6(var1);
   }

   public static void n5(p3 var0, e2 var1, boolean var2) {
      for (int var3 = 0; var3 < 2; var3++) {
         for (int var4 = 0; var4 < 3 && var1.l6()[var3] != null; var4++) {
            if (var1.l6()[var3].l6()[var4] != var1) {
               if (var1.l6()[var3].l6()[var4].l6()[0] == var1.l6()[var3]) {
                  var1.l6()[var3].l6()[var4].l6()[0] = null;
                  if (!var2 && var1.l6()[var3].l6()[var4].l6()[1] == null) {
                     var0.l6().l6(var1.l6()[var3].l6()[var4]);
                  }
               } else if (var1.l6()[var3].l6()[var4].l6()[1] == var1.l6()[var3]) {
                  var1.l6()[var3].l6()[var4].l6()[1] = null;
                  if (!var2 && var1.l6()[var3].l6()[var4].l6()[0] == null) {
                     var0.l6().l6(var1.l6()[var3].l6()[var4]);
                  }
               }
            }
         }

         for (int var5 = 0; var5 < 3; var5++) {
            if (var1.l6()[var3] != null) {
               var1.l6()[var3].n5()[var5].u3().l6(var1.l6()[var3]);
            }
         }

         var0.u3().l6(var1.l6()[var3]);
      }

      var0.l6().l6(var1);
   }
}
