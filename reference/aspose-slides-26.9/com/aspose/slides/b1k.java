package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class b1k {
   public static void n5(j2x var0, com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.k4y.y1z var2) {
      if (var0 == null) {
         throw new ArgumentNullException("geometry");
      }

      if (var2 == null) {
         throw new ArgumentNullException("enhancedGeometryElementData");
      }

      boolean var3 = t2f.k5(var2.h0());
      boolean var4 = var3 && var2.c8() > 0.0 && var2.t2() > 0.0 && !n5(var2.h0());
      w8s var5 = new w8s(var2, var1.y4(), var4);
      var5.n5(var2);
      List var6 = new List(var5.k5().size());

      for (int var7 = 0; var7 < var5.n5().size(); var7++) {
         var6.addItem(null);
         var6.set_Item(var7, new r8e(var5.n5().get_Item(var7), var5.k5().get_Item(var5.n5().get_Item(var7)), var5.u3(), var6));
      }

      var0.n5((r8e[])var6.toArray(new r8e[0]));
      var0.n5(new y1[1]);
      var0.l6(new y1[1]);
      var0.h0()[0] = new y1(var5.u9()[0], var5.u9()[1], var5.u3(), var6);
      var0.c8()[0] = new y1(var5.u9()[2], var5.u9()[3], var5.u3(), var6);
      if (var5.l6() != null && var5.l6().size() > 0) {
         var0.n5(new y2[var5.l6().size()]);
         int var19 = 0;
         Dictionary$Enumerator var8 = var5.l6().iterator();

         try {
            while (var8.hasNext()) {
               KeyValuePair var9 = (KeyValuePair)var8.next();
               var0.l6()[var19] = new y2((String)var9.getKey(), (String)var9.getValue());
               var19++;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }

      if (var3) {
         List var20 = new List();
         int var21 = com.aspose.slides.ms.System.q1.n5(var5.a6().k5() - var5.a6().n5());
         int var22 = com.aspose.slides.ms.System.q1.n5(var5.a6().l6() - var5.a6().u3());
         String var10 = com.aspose.slides.ms.System.d1.l6(var2.h0());
         int var11 = com.aspose.slides.ms.System.d1.u3(var10, 'N');
         if (var11 != -1 && var11 != var10.length() - 1) {
            String[] var12 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.a6(var2.h0(), new char[]{}), 'N');

            for (String var16 : var12) {
               if (!com.aspose.slides.ms.System.d1.n5(var16)) {
                  var20.addItem(new q7g(com.aspose.slides.ms.System.d1.n5(new String[]{var16, " N"}), var21, var22, var0, var5.u3(), var6, var5.h0()));
               }
            }
         } else {
            var20.addItem(new q7g(var10, var21, var22, var0, var5.u3(), var6, var5.h0()));
         }

         var0.n5((q7g[])var20.toArray(new q7g[0]));
      }
   }

   private static boolean n5(String var0) {
      String[] var1 = com.aspose.slides.ms.System.d1.n5(var0, ' ');
      int var2 = 0;

      for (String var6 : var1) {
         int[] var7 = new int[]{var2};
         boolean var8 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var6), var7);
         var2 = var7[0];
         if (var8) {
            return true;
         }
      }

      return false;
   }
}
