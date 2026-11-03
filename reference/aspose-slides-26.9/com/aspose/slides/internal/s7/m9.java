package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class m9 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "text-emphasis";
   }

   @Override
   public int l6() {
      return 249;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(252)).a6();
      List var6 = new List();
      List var7 = new List();
      IGenericList var8 = com.aspose.slides.internal.z8.n5.n5(var3);
      IGenericEnumerator var9 = var8.iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.internal.z8.y4 var10 = (com.aspose.slides.internal.z8.y4)var9.next();
            switch (var10.n5()) {
               case 12:
                  var6.addItem(var10);
                  var7.addItem(var10);
                  break;
               case 35:
                  String var11 = com.aspose.slides.ms.System.d1.a6(var10.t2());
                  if (var5.k5(var11)) {
                     var6.addItem(var10);
                  } else {
                     var7.addItem(var10);
                  }
                  break;
               case 36:
                  var6.addItem(var10);
                  break;
               default:
                  throw this.n5(var10.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      this.n5(var2, "text-emphasis-color", var7, var4);
      this.n5(var2, "text-emphasis-style", var6, var4);
   }
}
