package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class i2i {
   public static void n5(ICustomData var0, com.aspose.slides.internal.k4y.r9o var1, t5w var2) {
      if (var1 != null) {
         com.aspose.slides.internal.c8m.a2 var3 = var2.k7();
         com.aspose.slides.internal.k4y.p5t[] var4 = var1.k5();
         if (var4 != null && var4.length > 0) {
            for (com.aspose.slides.internal.k4y.p5t var8 : var4) {
               com.aspose.slides.internal.c8m.j8 var9 = var3.n5(var8.n5()).l6();
               CustomXmlPart var10 = (CustomXmlPart)var2.u3(var9);
               var10.n5((CustomXmlPartCollection)var0.getCustomXmlParts());
            }
         }

         if (var1.u3() != null && var3.n5(var1.u3().n5()) != null) {
            com.aspose.slides.internal.c8m.j8 var11 = var3.n5(var1.u3().n5()).l6();
            if (var11 == null) {
               return;
            }

            q6c var12 = new q6c(var11, var2);
            var12.n5(var0.getTags());
         }
      }
   }

   public static void n5(ICustomData var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.r9o> var1, g6c var2) {
      if (var0.getCustomXmlParts().size() != 0 || var0.getTags().size() != 0) {
         com.aspose.slides.internal.k4y.r9o var3 = (com.aspose.slides.internal.k4y.r9o)var1.invoke();
         if (var0.getCustomXmlParts().size() > 0) {
            boolean var4 = com.aspose.slides.internal.v6g.k5.l6(((r0g)var0).getParent_Immediate(), IPresentation.class);
            IGenericEnumerator var5 = var0.getCustomXmlParts().iterator();

            try {
               while (var5.hasNext()) {
                  CustomXmlPart var6 = (CustomXmlPart)var5.next();
                  if (var2.u9().containsKey(var6)) {
                     com.aspose.slides.internal.c8m.r7 var7 = var2.u9().get_Item(var6);
                     String var8;
                     if (var4) {
                        var8 = var7.a6();
                     } else {
                        var8 = var2.u6().l6(var7.l6()).a6();
                     }

                     com.aspose.slides.internal.k4y.p5t var9 = var3.n5();
                     var9.n5(var8);
                  } else {
                     com.aspose.slides.internal.c8m.j8 var18 = var2.a6()
                        .n5("/customXml/item{0}.xml", new i2i$1(var2), new com.aspose.slides.internal.c8m.d2(), var6.getXmlData());
                     com.aspose.slides.internal.c8m.j8 var19 = var2.a6()
                        .n5("/customXml/itemProps{0}.xml", new i2i$2(var2), new com.aspose.slides.internal.c8m.d5());
                     s0c var20 = new s0c(var19, var2);
                     var20.l6(var6);
                     var18.e2().l6(var19);
                     String var10 = var2.u6().l6(var18).a6();
                     com.aspose.slides.internal.k4y.p5t var11 = var3.n5();
                     var11.n5(var10);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }

         if (var0.getTags().size() > 0 && !var2.c8()) {
            com.aspose.slides.internal.c8m.j8 var15 = var2.a6().n5("/ppt/tags/tag{0}.xml", new i2i$3(var2), new com.aspose.slides.internal.c8m.a4());
            q6c var16 = new q6c(var15, var2);
            var16.l6(var0.getTags());
            com.aspose.slides.internal.k4y.w4m var17 = var3.l6();
            var17.n5(var2.u6().l6(var15).a6());
         }
      }
   }
}
