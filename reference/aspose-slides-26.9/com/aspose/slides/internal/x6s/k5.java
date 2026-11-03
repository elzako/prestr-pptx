package com.aspose.slides.internal.x6s;

import com.aspose.slides.internal.v7y.j9;
import com.aspose.slides.internal.v7y.t3;
import com.aspose.slides.internal.v7y.z6;
import com.aspose.slides.ms.System.Xml.a3;
import com.aspose.slides.ms.System.Xml.s2;

public abstract class k5 {
   public abstract void n5(s2 var1);

   public static k5 n5(String var0) {
      return n5(var0, null);
   }

   public static k5 n5(String var0, a3 var1) {
      boolean var2 = false;
      boolean[] var3 = new boolean[]{false};
      j9 var4 = new z6().n5(var0, var3);
      var2 = var3[0];
      t3 var5 = new t3(var4, var0, var2);
      if (null != var1) {
         var5.n5(var1);
      }

      return var5;
   }
}
