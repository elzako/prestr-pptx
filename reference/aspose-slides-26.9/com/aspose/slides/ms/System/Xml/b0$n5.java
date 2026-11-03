package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import java.util.Comparator;

class b0$n5 implements Comparator<Object> {
   private static Comparator<Object> n5 = new b0$n5();

   private b0$n5() {
   }

   public static Comparator<Object> n5() {
      return n5;
   }

   @Override
   public final int compare(Object x, Object y) {
      if (x == null) {
         return y == null ? 0 : -1;
      }

      if (y == null) {
         return 1;
      }

      b0$a6 var3 = com.aspose.slides.internal.v6g.k5.n5(x, b0$a6.class);
      String var4;
      String var5;
      if (var3 != null) {
         var4 = var3.l6;
         var5 = var3.k5;
      } else {
         b3 var6 = com.aspose.slides.internal.v6g.k5.n5(x, b3.class);
         if (var6 == null) {
            throw new XmlException("An XML error has occurred.", com.aspose.slides.ms.System.d1.n5);
         }

         var4 = var6.l6();
         var5 = var6.n5();
      }

      var3 = com.aspose.slides.internal.v6g.k5.n5(y, b0$a6.class);
      String var7;
      String var8;
      if (var3 != null) {
         var7 = var3.l6;
         var8 = var3.k5;
      } else {
         b3 var10 = com.aspose.slides.internal.v6g.k5.n5(y, b3.class);
         if (var10 == null) {
            throw new XmlException("An XML error has occurred.", com.aspose.slides.ms.System.d1.n5);
         }

         var7 = var10.l6();
         var8 = var10.n5();
      }

      int var11 = com.aspose.slides.ms.System.d1.a6(var4, var7, (short)4);
      return var11 != 0 ? var11 : com.aspose.slides.ms.System.d1.a6(var5, var8, (short)4);
   }
}
