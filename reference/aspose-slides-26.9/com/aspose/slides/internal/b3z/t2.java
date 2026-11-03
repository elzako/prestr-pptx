package com.aspose.slides.internal.b3z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class t2 extends List<Float> {
   @Override
   public String toString() {
      a5 var1 = new a5();

      for (float var3 : this) {
         var1.n5("{0} ",new Object[]{ c8.n5(var3)});
      }

      return var1.l6() > 0 ? var1.n5(0, var1.l6() - 1) : d1.n5;
   }

   public static t2 n5(String var0) {
      if (d1.n5(var0)) {
         return null;
      }

      if (d1.u3("none", d1.l6(var0), (short)3)) {
         return null;
      }

      String[] var1 = d1.n5(var0, new char[]{',', ' ', '\r', '\n', '\t'}, (short)1);
      t2 var2 = new t2();

      for (String var6 : var1) {
         float var7 = c8.n5(d1.l6(var6));
         var2.addItem(var7);
      }

      return var2;
   }
}
