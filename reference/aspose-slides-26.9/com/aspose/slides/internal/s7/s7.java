package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class s7 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "background";
   }

   @Override
   public int l6() {
      return 17;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(18)).a6();
      com.aspose.slides.internal.u3.c8 var6 = ((com.aspose.slides.internal.n3.h0)var1.h0(20)).a6();
      com.aspose.slides.internal.u3.c8 var7 = ((com.aspose.slides.internal.n3.c8)var1.h0(21)).a6();
      com.aspose.slides.internal.u3.c8 var8 = ((com.aspose.slides.internal.n3.s7)var1.h0(23)).a6();
      com.aspose.slides.internal.u3.c8 var9 = ((com.aspose.slides.internal.n3.h0)var1.h0(24)).a6();
      List var10 = new List();
      List var11 = new List();
      List var12 = new List();
      List var13 = new List();
      List var14 = new List();
      IGenericList var15 = com.aspose.slides.internal.z8.n5.n5(var3);
      IGenericEnumerator var16 = var15.iterator();

      try {
         while (var16.hasNext()) {
            com.aspose.slides.internal.z8.y4 var17 = (com.aspose.slides.internal.z8.y4)var16.next();
            switch (var17.n5()) {
               case 4:
                  break;
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 25:
               case 26:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               default:
                  throw this.n5(var17.n5());
               case 12:
                  var10.addItem(var17);
                  var11.addItem(var17);
                  var12.addItem(var17);
                  var13.addItem(var17);
                  var14.addItem(var17);
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
                  var13.addItem(var17);
                  break;
               case 24:
               case 41:
                  var12.addItem(var17);
                  break;
               case 27:
                  var11.addItem(var17);
                  break;
               case 35:
                  String var18 = com.aspose.slides.ms.System.d1.a6(var17.t2());
                  if (var5.n5(var18) != null) {
                     var10.addItem(var17);
                  } else if (var6.n5(var18) != null) {
                     var11.addItem(var17);
                  } else if (var7.n5(var18) != null) {
                     var12.addItem(var17);
                  } else if (var8.n5(var18) != null) {
                     var13.addItem(var17);
                  } else if (var9.n5(var18) != null) {
                     var14.addItem(var17);
                  } else if (!"auto".equals(var18)) {
                     throw this.n5(var17.n5());
                  }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      if (var11.size() == 0) {
         var11.addItem(com.aspose.slides.internal.z8.n5.l6(null, "initial"));
      }

      this.n5(var2, "background-attachment", var10, var4);
      this.n5(var2, "background-color", var11, var4);
      this.n5(var2, "background-image", var12, var4);
      this.n5(var2, "background-position", var13, var4);
      this.n5(var2, "background-repeat", var14, var4);
   }
}
