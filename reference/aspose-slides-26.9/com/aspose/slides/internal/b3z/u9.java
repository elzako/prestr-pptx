package com.aspose.slides.internal.b3z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class u9 extends List<a6> {
   public u9() {
   }

   public u9(a6 var1) {
      this.addItem(var1);
   }

   @Override
   public String toString() {
      a5 var1 = new a5();

      for (a6 var3 : this) {
         var1.n5("{0}, ", var3);
      }

      return var1.l6() > 0 ? var1.n5(0, var1.l6() - 2) : d1.n5;
   }

   public static u9 n5(String var0) {
      if (!d1.n5(var0) && !d1.u3("none", d1.l6(var0), (short)3)) {
         String[] var1 = d1.n5(var0, new char[]{',', ' ', '\r', '\n', '\t'}, (short)1);
         u9 var2 = new u9();

         for (String var6 : var1) {
            try {
               a6 var7 = a6.n5(d1.l6(var6));
               var2.addItem(var7);
            } catch (RuntimeException var8) {
               if (!com.aspose.slides.internal.n1n.n5.n5) {
                  throw var8;
               }

               return var2;
            }
         }

         return var2;
      } else {
         return new u9();
      }
   }

   public static boolean n5(u9 var0) {
      return var0 == null || var0.size() < 1;
   }
}
