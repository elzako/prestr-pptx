package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class d6 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "font-variant";
   }

   @Override
   public int l6() {
      return 120;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(126)).a6();
      com.aspose.slides.internal.u3.c8 var6 = ((com.aspose.slides.internal.n3.h0)var1.h0(121)).a6();
      com.aspose.slides.internal.u3.c8 var7 = ((com.aspose.slides.internal.n3.h0)var1.h0(122)).a6();
      com.aspose.slides.internal.u3.c8 var8 = ((com.aspose.slides.internal.n3.h0)var1.h0(123)).a6();
      com.aspose.slides.internal.u3.c8 var9 = ((com.aspose.slides.internal.n3.h0)var1.h0(124)).a6();
      com.aspose.slides.internal.u3.c8 var10 = ((com.aspose.slides.internal.n3.h0)var1.h0(125)).a6();
      List var11 = new List();
      List var12 = new List();
      List var13 = new List();
      List var14 = new List();
      List var15 = new List();
      List var16 = new List();
      IGenericList var17 = com.aspose.slides.internal.z8.n5.n5(var3);
      IGenericEnumerator var18 = var17.iterator();

      try {
         while (var18.hasNext()) {
            com.aspose.slides.internal.z8.y4 var19 = (com.aspose.slides.internal.z8.y4)var18.next();
            switch (var19.n5()) {
               case 12:
                  var11.addItem(var19);
                  var12.addItem(var19);
                  var13.addItem(var19);
                  var14.addItem(var19);
                  var15.addItem(var19);
                  var16.addItem(var19);
                  break;
               case 35:
                  String var20 = com.aspose.slides.ms.System.d1.a6(var19.t2());
                  if (!"normal".equals(var20) && !"initial".equals(var20)) {
                     if (var5.n5(var20) != null) {
                        var11.addItem(var19);
                     } else if (var6.n5(var20) != null) {
                        var12.addItem(var19);
                     } else if (var7.n5(var20) != null) {
                        var13.addItem(var19);
                     } else if (var8.n5(var20) != null) {
                        var14.addItem(var19);
                     } else if (var9.n5(var20) != null) {
                        var15.addItem(var19);
                     } else {
                        if (var10.n5(var20) == null) {
                           throw this.l6(var20);
                        }

                        var16.addItem(var19);
                     }
                     break;
                  }

                  com.aspose.slides.internal.z8.y4 var21 = com.aspose.slides.internal.z8.n5.l6(null, "normal");
                  var11.addItem(var21);
                  var12.addItem(var21);
                  var13.addItem(var21);
                  var14.addItem(var21);
                  var15.addItem(var21);
                  var16.addItem(var21);
                  break;
               default:
                  throw this.n5(var19.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      this.n5(var2, "font-variant-alternates", var11, var4);
      this.n5(var2, "font-variant-caps", var12, var4);
      this.n5(var2, "font-variant-east-asian", var13, var4);
      this.n5(var2, "font-variant-ligatures", var14, var4);
      this.n5(var2, "font-variant-numeric", var15, var4);
      this.n5(var2, "font-variant-position", var16, var4);
   }
}
