package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class k2 {
   public static void n5(IBaseSlide var0, com.aspose.slides.internal.k4y.f2a var1, i1x var2) {
      if (var1 != null) {
         r3m.n5(var0.getShapes().getParentGroup(), var1.u9(), var2);
         h9.n5(var0.getBackground(), var1.a6(), var2.n5());
         long var3 = 0L;
         IGenericEnumerator var5 = var2.u3().getKeys().iterator();

         try {
            while (var5.hasNext()) {
               String var6 = (String)var5.next();
               long var7 = 0L;
               long[] var9 = new long[]{0L};
               boolean var10 = com.aspose.slides.ms.System.l4.n5(var6, var9) && (var3 & 4294967295L) < (var9[0] & 4294967295L);
               var7 = var9[0];
               if (var10) {
                  var3 = var7;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         ((BaseSlide)var0).n5((var3 & 4294967295L) + 1L & 4294967295L, false);
         List$Enumerator var72 = var2.a6().iterator();

         try {
            while (var72.hasNext()) {
               ISlideComponent var12 = (ISlideComponent)var72.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var12, Shape.class)) {
                  ((Shape)var12).u6();
                  var2.n5(com.aspose.slides.ms.System.Xml.f4.l6(((Shape)var12).h0().z3()), var12);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var72, IDisposable.class)) {
               var72.dispose();
            }
         }

         var2.a6().clear();
         if (var2.h0().size() > 0) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0, MasterSlide.class)
               || com.aspose.slides.internal.v6g.k5.l6(var0, MasterNotesSlide.class)
               || com.aspose.slides.internal.v6g.k5.l6(var0, MasterHandoutSlide.class)) {
               var3 = 0L;
               var5 = var2.u9().getKeys().iterator();

               try {
                  while (var5.hasNext()) {
                     long var86 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), long.class);
                     if ((var3 & 4294967295L) < (var86 & 4294967295L) && (var86 & 4294967295L) != 4294967295L) {
                        var3 = var86;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }

               for (IPlaceholder var80 : var2.h0().toArray(new IPlaceholder[0])) {
                  Placeholder var82 = (Placeholder)var80;
                  var82.n5(++var3);
                  var2.n5(var82.n5(), var82);
               }

               var2.h0().clear();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var0, LayoutSlide.class) || com.aspose.slides.internal.v6g.k5.l6(var0, NotesSlide.class)) {
               var3 = 0L;
               var5 = var2.u9().iterator();

               try {
                  while (var5.hasNext()) {
                     KeyValuePair var73 = (KeyValuePair)var5.next();
                     long var77 = (Long)var73.getKey();
                     IPlaceholder var78 = (IPlaceholder)var73.getValue();
                     if ((var3 & 4294967295L) < (var77 & 4294967295L)
                        && (var77 & 4294967295L) != 4294967295L
                        && (var78.getIndex() & 4294967295L) != 10L
                        && (var78.getIndex() & 4294967295L) != 11L
                        && (var78.getIndex() & 4294967295L) != 12L) {
                        var3 = var77;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }

               long var14 = 10L;
               List$Enumerator var17 = var2.h0().iterator();

               try {
                  while (var17.hasNext()) {
                     IPlaceholder var79 = (IPlaceholder)var17.next();
                     Placeholder var81 = (Placeholder)var79;
                     if ((var3 & 4294967295L) == 9L) {
                        var3 = 12L;
                     }

                     if (var81.getType() != 4 && var81.getType() != 6 && var81.getType() != 5) {
                        var81.n5(++var3);
                     } else {
                        while (var2.u9().containsKey(var14)) {
                           var14++;
                        }

                        var81.n5(var14++);
                     }

                     var2.n5(var81.n5(), var81, false);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                     var17.dispose();
                  }
               }

               var2.h0().clear();
            }
         }

         Dictionary$Enumerator var20 = var2.c8().iterator();

         try {
            while (var20.hasNext()) {
               KeyValuePair var21 = (KeyValuePair)var20.next();
               var2.n5().z1().throwIfInterruptionRequested();
               Connector var71 = (Connector)var21.getKey();
               com.aspose.slides.internal.k4y.g1p var75 = (com.aspose.slides.internal.k4y.g1p)var21.getValue();
               if (var75.a6() != null) {
                  String var84 = com.aspose.slides.ms.System.Xml.f4.l6(var75.a6().n5());
                  if (var2.u3().containsKey(var84)) {
                     IShape var88 = (IShape)var2.u3().get_Item(var84);
                     long var22 = var75.a6().l6();
                     if ((var22 & 4294967295L) >= 0L && (var22 & 4294967295L) < var88.getConnectionSiteCount()) {
                        var71.n5(var88);
                        var71.n5(var22);
                     }
                  }
               }

               if (var75.u9() != null) {
                  String var85 = com.aspose.slides.ms.System.Xml.f4.l6(var75.u9().n5());
                  if (var2.u3().containsKey(var85)) {
                     IShape var89 = (IShape)var2.u3().get_Item(var85);
                     long var90 = var75.u9().l6();
                     if ((var90 & 4294967295L) >= 0L && (var90 & 4294967295L) < var89.getConnectionSiteCount()) {
                        var71.l6(var89);
                        var71.l6(var90);
                     }
                  }
               }

               var71.k5();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }

         if (!com.aspose.slides.ms.System.d1.n5(var1.u3())) {
            var0.setName(var1.u3());
         }

         l6(var0, var1, var2);
      }
   }

   private static void l6(IBaseSlide var0, com.aspose.slides.internal.k4y.f2a var1, i1x var2) {
      o8 var3 = ((BaseSlide)var0).k5();
      t5w var4 = var2.n5();
      v2r.n5(var0.getControls(), var1.c8(), var2);
      i2i.n5(var0.getCustomData(), var1.h0(), var4);
      var3.k5(var1.t2());
      n5(var0, var1.t2(), var2);
      com.aspose.slides.internal.c8m.r7[] var5 = var4.k7().n5(com.aspose.slides.internal.c8m.m0.n5);
      if (var5.length > 0) {
         for (int var6 = 0; var6 < var5.length; var6++) {
            com.aspose.slides.internal.c8m.j8 var7 = var5[var6].l6();
            if (var6 == 0) {
               l2h var8 = new l2h(var7, var4);
               var8.n5(var0, var2);
            } else if (var4.z3()) {
               var7.n5(true);
            }
         }
      }
   }

   static void n5(IBaseSlide var0, com.aspose.slides.internal.k4y.x8 var1, i1x var2) {
      com.aspose.slides.ms.System.Xml.m8 var3 = n5(var1);
      if (var3 != null) {
         String var4 = var3.n5("val");
         ((BaseSlide)var0).n5(com.aspose.slides.ms.System.l4.n5(var4));
      }
   }

   public static void n5(IBaseSlide var0, com.aspose.slides.internal.k4y.f2a var1, n4i var2) {
      g6c var3 = var2.n5();
      r3m.n5(var0.getShapes().getParentGroup(), var1.u9(), var2, null);
      h9.n5(var0.getBackground(), new k2$1(var1), var3);
      if (!com.aspose.slides.internal.v6g.k5.l6(var0, MasterSlide.class)) {
         var1.n5(var0.getName());
      }

      l6(var0, var1, var2);
   }

   private static void l6(IBaseSlide var0, com.aspose.slides.internal.k4y.f2a var1, n4i var2) {
      o8 var3 = ((BaseSlide)var0).k5();
      g6c var4 = var2.n5();
      v2r.n5(var0.getControls(), new k2$2(var1), var2);
      i2i.n5(var0.getCustomData(), new k2$3(var1), var4);
      if (!var2.n5().c8()) {
         var1.n5(var3.u9());
      }

      if (var2.u9().size() > 0) {
         com.aspose.slides.internal.c8m.j8 var5 = var4.a6().n5("/ppt/drawings/vmlDrawing{0}.vml", new k2$4(var4), new com.aspose.slides.internal.c8m.m0());
         l2h var6 = new l2h(var5, var4);
         var6.n5(var2);
         var4.u6().l6(var5);
      }
   }

   private static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      return n5(var0, "creationId", "{BB962C8B-B14F-4D97-AF65-F5344CB8AC3E}", "http://schemas.microsoft.com/office/powerpoint/2010/main");
   }

   private static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0, String var1, String var2, String var3) {
      if (var0 != null && var0.n5().length != 0) {
         XmlDocument var4 = com.aspose.slides.internal.k4y.i8w.n5(var0, var2);
         return var4 != null && var4.getDocumentElement() != null ? (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var4.getDocumentElement(), var1, var3) : null;
      } else {
         return null;
      }
   }
}
