package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class x1 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "target";
   }

   @Override
   public int l6() {
      return 297;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(296)).a6();
      com.aspose.slides.internal.u3.c8 var6 = ((com.aspose.slides.internal.n3.h0)var1.h0(295)).a6();
      com.aspose.slides.internal.u3.c8 var7 = ((com.aspose.slides.internal.n3.h0)var1.h0(294)).a6();
      List var8 = new List();
      List var9 = new List();
      List var10 = new List();
      IGenericList var11 = com.aspose.slides.internal.z8.n5.n5(var3);
      IGenericEnumerator var12 = var11.iterator();

      try {
         while (var12.hasNext()) {
            com.aspose.slides.internal.z8.y4 var13 = (com.aspose.slides.internal.z8.y4)var12.next();
            switch (var13.n5()) {
               case 35:
                  String var14 = com.aspose.slides.ms.System.d1.a6(var13.t2());
                  if (var5.n5(var14) != null) {
                     var8.addItem(var13);
                  }

                  if (var6.n5(var14) != null) {
                     var9.addItem(var13);
                  }

                  if (var7.n5(var14) != null) {
                     var10.addItem(var13);
                  }
                  break;
               case 36:
                  var8.addItem(var13);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      this.n5(var2, "target-name", var8, var4);
      this.n5(var2, "target-new", var9, var4);
      this.n5(var2, "target-position", var10, var4);
   }
}
