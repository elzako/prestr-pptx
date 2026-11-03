package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.Xml.k6;

class y8$c8 extends y8$n3 {
   public y8$c8() {
      super(2, 2, 3, new int[]{1, 5});
   }

   @Override
   public Object n5(com.aspose.slides.internal.k4s.h0 var1, Object[] var2, com.aspose.slides.internal.x6s.a6 var3) {
      y8 var4 = (y8)var1;
      String var5 = null;
      String var6 = null;
      String[] var7 = new String[]{var6};
      String[] var8 = new String[]{var5};
      f0.n5(k5(var2[0]), var7, var8);
      var6 = var7[0];
      var5 = var8[0];
      String var9 = var1.n5(var6);
      k6 var10 = new k6(var5, var9);
      com.aspose.slides.internal.x6s.a6 var11 = var3.n5();
      var11.z3();
      ArrayList var12 = null;

      for (f2 var16 : y8.l6(var4).a6()) {
         if (k6.n5(var16.n5(), var10)) {
            Hashtable var17 = var16.n5(var11);
            if (var17 == null) {
               var17 = y8.n5(var4, var16, var11);
               var16.n5(var11, var17);
            }

            com.aspose.slides.internal.x6s.h0 var18 = com.aspose.slides.internal.v6g.k5.n5(var2[1], com.aspose.slides.internal.x6s.h0.class);
            if (var18 != null) {
               var18 = var18.n5();

               while (var18.l6()) {
                  var12 = n5(var12, (ArrayList)var17.get_Item(var18.k5().c8()));
               }
            } else {
               var12 = n5(var12, (ArrayList)var17.get_Item(k5(var2[1])));
            }
         }
      }

      if (var12 == null) {
         return com.aspose.slides.internal.v7y.s4.n5;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var12.get_Item(0), com.aspose.slides.internal.x6s.a6.class)
            ? new com.aspose.slides.internal.v7y.f5(var12)
            : new com.aspose.slides.internal.v7y.h6(var12);
      }
   }

   private static ArrayList n5(ArrayList var0, ArrayList var1) {
      if (var1 == null) {
         return var0;
      }

      if (var0 == null) {
         return var1;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(0), ArrayList.class)) {
         ArrayList var2 = var0;
         var0 = new ArrayList();
         var0.addItem(var2);
      }

      var0.addItem(var1);
      return var0;
   }
}
