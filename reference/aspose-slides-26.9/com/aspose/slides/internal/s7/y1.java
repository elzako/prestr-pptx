package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class y1 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "border-left";
   }

   @Override
   public int l6() {
      return 47;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(59)).a6();
      com.aspose.slides.internal.u3.c8 var6 = ((com.aspose.slides.internal.n3.h0)var1.h0(62)).a6();
      com.aspose.slides.internal.u3.c8 var7 = ((com.aspose.slides.internal.n3.s7)var1.h0(63)).a6();
      List var8 = new List();
      List var9 = new List();
      List var10 = new List();
      boolean var11 = false;
      IGenericList var12 = com.aspose.slides.internal.z8.n5.n5(var3);
      IGenericEnumerator var13 = var12.iterator();

      try {
         while (var13.hasNext()) {
            com.aspose.slides.internal.z8.y4 var14 = (com.aspose.slides.internal.z8.y4)var13.next();
            switch (var14.n5()) {
               case 12:
                  var8.addItem(var14);
                  var9.addItem(var14);
                  var10.addItem(var14);
                  break;
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
                  var10.addItem(var14);
               case 24:
               case 25:
               case 26:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               default:
                  break;
               case 27:
                  var8.addItem(var14);
                  break;
               case 35:
                  String var15 = com.aspose.slides.ms.System.d1.a6(var14.t2());
                  if (var5.n5(var15) != null) {
                     var8.addItem(var14);
                  }

                  if (var6.n5(var15) != null) {
                     var9.addItem(var14);
                     if ("none".equals(var15)) {
                        var11 = true;
                     }
                  }

                  if (var7.n5(var15) != null) {
                     var10.addItem(var14);
                  }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      if (var8.size() == 0) {
         var8.addItem(com.aspose.slides.internal.z8.n5.l6(null, "initial"));
      }

      if (var9.size() == 0) {
         var9.addItem(com.aspose.slides.internal.z8.n5.l6(null, "initial"));
      }

      if (var10.size() == 0) {
         var10.addItem(com.aspose.slides.internal.z8.n5.l6(null, "initial"));
      }

      this.n5(var2, "border-left-color", var8, var4);
      this.n5(var2, "border-left-style", var9, var4);
      this.n5(var2, "border-left-width", var10, var4);
   }
}
