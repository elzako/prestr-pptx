package com.aspose.slides.internal.z6;

import com.aspose.slides.ms.System.d1;

public abstract class n5 {
   protected com.aspose.slides.internal.y1.u3 n5 = null;

   public n5(com.aspose.slides.internal.y1.u3 var1) {
      this.n5 = var1;
   }

   protected final t2 n5(String var1) {
      t2 var2 = this.n5.a6().t4();
      if (var2 == null) {
         return null;
      }

      t2 var3 = null;
      String var4 = this.n5();
      t2[] var5 = var2.n5(d1.n5(new String[]{var4, "s"})).l6(var4);

      for (int var6 = 0; var6 < var5.length; var6++) {
         t2 var7 = var5[var6];

         try {
            if (d1.a6(var7.k5("mime"), var1)) {
               var3 = var7;
               break;
            }
         } catch (RuntimeException var9) {
            throw var9;
         }
      }

      return var3;
   }

   public abstract String n5();
}
