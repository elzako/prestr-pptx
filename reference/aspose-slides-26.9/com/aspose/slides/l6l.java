package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;

class l6l {
   public final String n5;
   public boolean l6;
   public final byte k5;
   public a0n u3 = new a0n();

   private l6l(String var1, boolean var2, byte var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public String toString() {
      return this.n5;
   }

   public static void n5(String var0, IGenericList<l6l> var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         List var2 = new List<>(new l4(var0));
         boolean var3 = true;
         byte var4 = com.aspose.slides.internal.n2d.u9.u3(((d6b)var2.get_Item(0)).n5());
         byte var5 = 0;
         byte var6 = 0;

         for (int var7 = 0; var7 < var2.size(); var7++) {
            d6b var8 = ((d6b)var2.get_Item(var7)).l6();
            boolean var9 = !com.aspose.slides.internal.n2d.u9.d5(var8.k5);
            if (var8.k5 == 8722 && var7 != 0 && ((d6b)var2.get_Item(var7 - 1)).k5 == '=') {
               var9 = true;
            }

            byte var10 = com.aspose.slides.internal.n2d.u9.u3(var8.n5());
            if (var9 != var3 || var10 != var4) {
               n5(var0, var5, var6, !var3, var4, var1);
               var3 = var9;
               var4 = var10;
               var5 = var6;
            }

            var6 += var8.l6 ? 2 : 1;
         }

         n5(var0, var5, var0.length(), !var3, var4, var1);
      }
   }

   private static void n5(String var0, int var1, int var2, boolean var3, byte var4, IGenericList<l6l> var5) {
      if (var1 < var2) {
         l6l var6 = new l6l(com.aspose.slides.ms.System.d1.l6(var0, var1, var2 - var1), var3, var4);
         var5.addItem(var6);
      }
   }
}
