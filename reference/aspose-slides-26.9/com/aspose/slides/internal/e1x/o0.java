package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public class o0 {
   public static int n5(i1 var0) {
      int var1 = var0.z8();
      if (var1 != 0) {
         return var1;
      }

      v4 var2 = new v4(var0, false);
      int var3 = var2.n5(88);
      Dictionary var4 = var2.n5();
      t1 var5 = null;
      t1[] var6 = new t1[]{var5};
      var4.tryGetValue(var3, var6);
      var5 = var6[0];
      int var7 = 0;
      int var8 = 0;
      IGenericEnumerator var9 = var5.a6().iterator();
      if (var9.hasNext()) {
         var8 = var7 = ((h2)var9.next()).l6();

         while (var9.hasNext()) {
            int var10 = ((h2)var9.next()).l6();
            if (var10 > var8) {
               var8 = var10;
            }

            if (var10 < var7) {
               var7 = var10;
            }
         }
      }

      return (var8 - var7) / 10;
   }

   public static int l6(i1 var0) {
      int var1 = var0.j5();
      if (var1 != 0) {
         return var1;
      }

      v4 var2 = new v4(var0, false);
      int var3 = var2.n5(120);
      Dictionary var4 = var2.n5();
      t1 var5 = null;
      t1[] var6 = new t1[]{var5};
      var4.tryGetValue(var3, var6);
      var5 = var6[0];
      int var7 = 0;
      int var8 = 0;
      IGenericEnumerator var9 = var5.a6().iterator();
      if (var9.hasNext()) {
         var8 = var7 = ((h2)var9.next()).l6();

         while (var9.hasNext()) {
            int var10 = ((h2)var9.next()).l6();
            if (var10 > var8) {
               var8 = var10;
            }

            if (var10 < var7) {
               var7 = var10;
            }
         }
      }

      return (var8 - var7) / 10;
   }
}
