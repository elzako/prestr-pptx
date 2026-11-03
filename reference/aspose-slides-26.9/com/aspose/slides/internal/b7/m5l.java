package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.NotImplementedException;

final class m5l {
   private static m5l n5;
   private static final Object l6 = new Object();

   public static m5l n5() {
      m5l var0 = n5;
      if (var0 == null) {
         var0 = n5;
         synchronized (l6) {
            if (var0 == null) {
               n5 = var0 = new m5l();
            }
         }
      }

      return var0;
   }

   public t5g n5(v2s var1, f1c var2, p6t var3, u6p var4, w1n var5, j6 var6) {
      j9e var7 = var1 instanceof j9e ? (j9e)var1 : null;
      t5g var8;
      if (null != var7) {
         var8 = new w4w(var7, var2, var3, var4, var5, var6);
      } else {
         n3c var9 = var1 instanceof n3c ? (n3c)var1 : null;
         if (null != var9) {
            var8 = new c9b(var9, var2, var3, var4, var5, var6);
         } else {
            u0a var10 = var1 instanceof u0a ? (u0a)var1 : null;
            if (null != var10) {
               var8 = new k3h(var10, var2, var3, var4, var5, var6);
            } else {
               v9e var11 = var1 instanceof v9e ? (v9e)var1 : null;
               if (null == var11) {
                  throw new NotImplementedException();
               }

               var8 = new u4k(var11, var2, var3, var4, var5, var6);
            }
         }
      }

      return var8;
   }
}
