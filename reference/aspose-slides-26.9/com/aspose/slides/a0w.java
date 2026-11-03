package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class a0w {
   public static void n5(IPresentation var0, com.aspose.slides.internal.k4y.f5 var1, t5w var2) {
      if (var1.p8() != null) {
         com.aspose.slides.internal.k4y.b2l var3 = com.aspose.slides.internal.k4y.i8w.l6(var1.p8(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}");
         if (var3 != null && !com.aspose.slides.ms.System.d1.n5(var3.l6().getDocumentElement().getInnerXml())) {
            com.aspose.slides.internal.k4y.p8c var4 = null;
            com.aspose.slides.internal.z0k.w1 var5 = new com.aspose.slides.internal.z0k.w1(var3.l6().getDocumentElement().getInnerXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var6 = new com.aspose.slides.ms.System.Xml.p5(var5);

               try {
                  var6.n5((com.aspose.slides.ms.System.Xml.o8)null);

                  while (!var6.j5() && var6.s7() != 1) {
                     var6.u9();
                  }

                  if (!var6.j5()) {
                     var4 = new com.aspose.slides.internal.k4y.p8c(var6);
                  }
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }

            if (var4 == null) {
               throw new NullReferenceException("Section couldn't be empty.");
            }

            for (int var26 = 0; var26 < var4.l6().length; var26++) {
               Slide var7 = null;
               com.aspose.slides.internal.k4y.q8l var8 = var4.l6()[var26];
               if (var8.k5().l6().length > 0) {
                  long var9 = var8.k5().l6()[0].n5();
                  IGenericEnumerator var11 = var0.getSlides().iterator();

                  try {
                     while (var11.hasNext()) {
                        Slide var12 = (Slide)var11.next();
                        if (var12.q0().u3() == var9) {
                           var7 = var12;
                           break;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                        var11.dispose();
                     }
                  }
               }

               ((SectionCollection)var0.getSections()).n5(var8.n5(), var7, var8.l6().k5());
            }
         }
      }
   }

   public static void n5(Presentation var0) {
      if (var0.getSections().size() == 0) {
         n5(var0.n3().h0(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}");
      } else {
         if (var0.n3().h0() == null) {
            var0.n3().n5(new com.aspose.slides.internal.k4y.y1g());
         }

         com.aspose.slides.internal.k4y.i8w.k5(var0.n3().h0(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}");
         com.aspose.slides.internal.k4y.b2l var1 = com.aspose.slides.internal.k4y.i8w.l6(var0.n3().h0(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}");
         com.aspose.slides.internal.k4y.p8c var2 = new com.aspose.slides.internal.k4y.p8c();
         IGenericEnumerator var3 = var0.getSections().iterator();

         try {
            while (var3.hasNext()) {
               Section var4 = (Section)var3.next();
               com.aspose.slides.internal.k4y.q8l var5 = var2.n5();
               var5.n5(var4.n5().k5());
               var5.n5(var4.getName());
               ISectionSlideCollection var6 = var4.getSlidesListOfSection();
               IGenericEnumerator var7 = var6.iterator();

               try {
                  while (var7.hasNext()) {
                     Slide var8 = (Slide)var7.next();
                     com.aspose.slides.internal.k4y.p2p var9 = var5.k5().n5();
                     var9.n5(var8.k5().u3());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.l7h.a5 var34 = new com.aspose.slides.internal.l7h.a5();
         com.aspose.slides.internal.z0k.r4 var35 = new com.aspose.slides.internal.z0k.r4(var34);

         try {
            com.aspose.slides.internal.n8e.u4 var36 = new com.aspose.slides.internal.n8e.u4(var35);

            try {
               var2.n5("p14", var36, "sectionLst");
            } finally {
               if (var36 != null) {
                  var36.dispose();
               }
            }

            var35.k5();
         } finally {
            if (var35 != null) {
               var35.dispose();
            }
         }

         var1.l6().getDocumentElement().setInnerXml(var34.toString());
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.x8 var0, String var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.b2l var2 = com.aspose.slides.internal.k4y.i8w.l6(var0, var1);
         if (var2 != null) {
            var2.n5("");
         }
      }
   }
}
