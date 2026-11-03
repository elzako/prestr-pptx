package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

public class i9 implements com.aspose.slides.internal.b8u.k7 {
   private Dictionary<j4$n5, j4> n5 = new Dictionary<>();
   private Object l6 = new Object();
   private static com.aspose.slides.internal.b8u.k7 k5;

   protected i9() {
   }

   public static com.aspose.slides.internal.b8u.k7 n5() {
      com.aspose.slides.internal.b8u.k7 var0 = k5;
      if (var0 == null) {
         var0 = k5 = new i9();
      }

      return var0;
   }

   @Override
   public final j4 n5(com.aspose.slides.internal.z0k.t4 var1) {
      return this.n5(var1, false);
   }

   @Override
   public final j4 n5(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      synchronized (this.l6) {
         j4 var4 = null;
         j4$n5 var5 = new j4$n5(var1);
         j4[] var6 = new j4[]{var4};
         boolean var7 = !this.n5.tryGetValue(var5, var6);
         var4 = var6[0];
         if (var7) {
            var4 = new j4(var1);
            var4.u9();
            this.n5.addItem(var5, var4);
         }

         if (!var1.equals(var4.k5()) && var2) {
            var1.dispose();
         }

         var4.a6();
         return var4;
      }
   }

   @Override
   public final void n5(j4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("syncStream");
      }

      synchronized (this.l6) {
         com.aspose.slides.internal.z0k.t4 var3 = var1.k5();
         j4 var4 = null;
         j4$n5 var5 = new j4$n5(var3);
         j4[] var6 = new j4[]{var4};
         boolean var7 = this.n5.tryGetValue(var5, var6);
         var4 = var6[0];
         if (var7) {
            var4.u9();
            if (var4.l6() <= 0) {
               this.n5.removeItemByKey(var5);
            }
         }
      }
   }

   public final void n5(v3 var1) {
      if (var1 != null && !var1.c8()) {
         synchronized (var1.n5()) {
            if (!var1.e2()) {
               j4 var3 = null;
               j4[] var4 = new j4[]{var3};
               boolean var5 = j4.n5(var1, var4);
               var3 = var4[0];
               if (var5) {
                  n5().n5(var3);
               }
            }

            var1.dispose();
            Object var8 = null;
         }
      }
   }
}
