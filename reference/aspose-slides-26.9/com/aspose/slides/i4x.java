package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class i4x extends o0s {
   static void l6(v5s var0) {
      i1w var1 = (i1w)var0.a6();
      LegacyDiagram var2 = var1.c8();
      e4c var3 = new e4c();
      e4c var4 = new e4c();
      x4t var5 = new x4t();
      e4c[] var6 = new e4c[]{var3};
      e4c[] var7 = new e4c[]{var4};
      x4t[] var8 = new x4t[]{var5};
      w9v.n5(var1.k5(), var6, var7, var8);
      var6[0].l6(var3);
      var7[0].l6(var4);
      var8[0].n5(var5);
      var2.n5(var3.u9(), var4.u9(), var5.n5());
      var2.n5().n5(var0.t2());
      o7.n5(var0);
      GroupShape var29 = var2.k5();
      var29.l6(var2.x9());
      w9v.n5(var29, var1.k5());
      List$Enumerator var30 = var1.u9().iterator();

      try {
         while (var30.hasNext()) {
            v5s var31 = (v5s)var30.next();
            if (var31.c8() == 3) {
               AutoShape var33 = ((ShapeCollection)var29.getShapes()).y4();
               var31.a6().n5(var33);
               t3.n5(var31);
               var33.k7().n5(var31.k5().a6());
               var33.k7().n5(var31.k5().h0());
               if (com.aspose.slides.internal.v6g.k5.l6(var31.k5(), com.aspose.slides.internal.k0r.q5.class)) {
                  var33.k7().n5(((com.aspose.slides.internal.k0r.q5)var31.k5()).x8());
               }
            } else if (var31.c8() == 8) {
               Connector var34 = ((ShapeCollection)var29.getShapes()).t4();
               var31.a6().n5(var34);
               d3l.n5(var31);
               var34.k7().n5(var31.k5().a6());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }

      com.aspose.slides.internal.k0r.a9 var32 = var0.k5().h0();
      var29.n5().n5(var0.t2());
      com.aspose.slides.internal.k0r.v8 var35 = com.aspose.slides.internal.v6g.k5.n5(var0.k5().a6().l6().n5(896), com.aspose.slides.internal.k0r.v8.class);
      if (var35 != null && var35.l6().length > 0) {
         var29.setName(n5(var35.l6()));
      }

      com.aspose.slides.internal.k0r.v8 var36 = com.aspose.slides.internal.v6g.k5.n5(var0.k5().a6().l6().n5(896), com.aspose.slides.internal.k0r.v8.class);
      if (var36 != null) {
         var29.setAlternativeText(n5(var36.l6()));
      }

      var29.k7().n5(var32);
      var29.k7().n5(var0.k5().a6());
      Dictionary var37 = new Dictionary();
      IGenericEnumerator var38 = var29.getShapes().iterator();

      try {
         while (var38.hasNext()) {
            Shape var9 = (Shape)var38.next();
            byte[] var10 = com.aspose.slides.internal.l7h.j5.z1().l6(com.aspose.slides.ms.System.d1.c8(var9.getName()));
            if (var10.length > 0) {
               com.aspose.slides.ms.System.u3.u3(com.aspose.slides.ms.System.u3.n5((Object)(var10)));
               long var11 = com.aspose.slides.internal.h3k.u3.n5(var10);
               if (!var37.containsKey(var11)) {
                  var37.addItem(var11, var9.h0().z3());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var38, IDisposable.class)) {
            var38.dispose();
         }
      }

      com.aspose.slides.internal.k4y.j2m var39 = new com.aspose.slides.internal.k4y.j2m();
      var39.n5(2);
      com.aspose.slides.internal.k0r.b2 var40 = com.aspose.slides.internal.v6g.k5.n5(var32.l6().n5(1284), com.aspose.slides.internal.k0r.b2.class);

      for (int var14 = 0; var14 < (var40.u3() & 65535); var14++) {
         byte[] var15 = var40.k5(var14);
         long var16 = com.aspose.slides.internal.n8e.y2.u3(var15, 0) & 4294967295L;
         long var18 = com.aspose.slides.internal.n8e.y2.u3(var15, 4) & 4294967295L;
         long var20 = com.aspose.slides.internal.n8e.y2.u3(var15, 8) & 4294967295L;
         if (var37.containsKey(var16) && var37.containsKey(var18)) {
            com.aspose.slides.internal.k4y.x4j var22 = var39.n5();
            var22.n5(2);
            var22.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"#_s", com.aspose.slides.ms.System.l4.l6((Long)var37.get_Item(var16))}));
            var22.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"#_s", com.aspose.slides.ms.System.l4.l6((Long)var37.get_Item(var18))}));
            if ((var20 & 4294967295L) > 0L) {
               var22.k5(com.aspose.slides.ms.System.d1.n5(new String[]{"#_s", com.aspose.slides.ms.System.l4.l6((Long)var37.get_Item(var20))}));
            }
         }
      }

      if (var39.l6() != null && var39.l6().length >= 1) {
         var2.n5().n5(var39);
      } else {
         var0.h0().remove(var2);
      }
   }

   static void n5(s6o var0) {
      com.aspose.slides.internal.k0r.a9 var1 = var0.t9().k5().k7().y4();
      if (var1 != null) {
         com.aspose.slides.internal.k0r.a9 var2 = var0.z3().h0();
         IGenericEnumerator var3 = var1.l6().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k0r.q1 var4 = (com.aspose.slides.internal.k0r.q1)var3.next();
               var2.l6().l6(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         k1z var27 = com.aspose.slides.internal.v6g.k5.n5(var0.n3().get_Item(0), k1z.class);
         com.aspose.slides.internal.k0r.q5 var5 = var27.z3();
         var5.u3().n5(75);
         if (var5.x8() != null) {
            var5.e2().removeItem(var5.x8());
         }

         List$Enumerator var6 = var0.n3().iterator();

         try {
            while (var6.hasNext()) {
               k1z var7 = (k1z)var6.next();
               com.aspose.slides.internal.k0r.q5 var8 = var7.z3();
               if (var8 != null) {
                  if (var8.u3().t2() == 20) {
                     var8.u3().n5(32);
                  }

                  if (var8.u3().t2() == 0) {
                     com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(1280), com.aspose.slides.internal.k0r.z5.class);
                     if (var9 != null) {
                        switch ((int)var9.j5()) {
                           case 4:
                              var8.u3().n5(8);
                              break;
                           case 6:
                              var8.u3().n5(23);
                        }
                     }
                  }

                  com.aspose.slides.internal.k0r.a9 var28 = var7.s7().k7().y4();
                  if (var28 != null) {
                     var2 = var7.z3().h0();
                     IGenericEnumerator var10 = var28.l6().iterator();

                     try {
                        while (var10.hasNext()) {
                           com.aspose.slides.internal.k0r.q1 var11 = (com.aspose.slides.internal.k0r.q1)var10.next();
                           var2.l6().l6(var11);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                           var10.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }
}
