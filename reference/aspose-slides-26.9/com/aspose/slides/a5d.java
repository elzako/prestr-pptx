package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class a5d {
   static final char n5 = com.aspose.slides.ms.System.z3.l6(8226);

   static IGenericList<m2g> n5(IGenericList<com.aspose.slides.internal.g4.x8> var0, IGenericList<com.aspose.slides.internal.g4.s7> var1) {
      List var2 = new List();
      List var3 = new List();
      List var4 = new List();
      IGenericEnumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.g4.x8 var6 = (com.aspose.slides.internal.g4.x8)var5.next();
            if (!var6.a6()
               && var6.n5().a6().length == 2
               && com.aspose.slides.ms.System.q1.n5(var6.n5().a6()[0].k5() - var6.n5().a6()[1].k5()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var6.n5().a6()[0].l6() - var6.n5().a6()[1].l6()) > 10.0F) {
               var3.addItem(var6);
            }

            if (!var6.a6()
               && var6.n5().a6().length == 2
               && com.aspose.slides.ms.System.q1.n5(var6.n5().a6()[0].l6() - var6.n5().a6()[1].l6()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var6.n5().a6()[0].k5() - var6.n5().a6()[1].k5()) > 10.0F) {
               var4.addItem(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      com.aspose.slides.internal.g4.x8 var16 = (com.aspose.slides.internal.g4.x8)var3.get_Item(0);
      com.aspose.slides.internal.g4.x8 var7 = null;

      do {
         int var8 = 0;
         IGenericList var9 = null;
         IGenericList var10 = null;

         for (int var11 = var3.size() - 1; var11 >= 0; var11--) {
            var7 = (com.aspose.slides.internal.g4.x8)var3.get_Item(var11);
            float var12 = var7.n5().a6()[1].l6() - var7.n5().a6()[0].l6();
            if (com.aspose.slides.ms.System.q1.n5(var12 - (var16.n5().a6()[1].l6() - var16.n5().a6()[0].l6())) < 2.0F) {
               IGenericList var13 = l6(var16, var7, var4);
               if (var13.size() == 2) {
                  var9 = n5(var16, var7, var3);
                  var10 = n5(
                     var16,
                     (com.aspose.slides.internal.g4.x8)var9.get_Item(1),
                     (com.aspose.slides.internal.g4.x8)var13.get_Item(0),
                     (com.aspose.slides.internal.g4.x8)var13.get_Item(1),
                     var4
                  );
                  var8 = var11;
                  break;
               }
            }
         }

         IGenericDictionary var17 = n5(var16, var9, var10, var1);
         m2g var18 = new m2g();
         var18.n5(var16.n5().a6()[0].l6());
         var18.l6(var16.n5().a6()[0].k5());
         var18.n5(var9);
         var18.l6(var10);
         var18.n5(var17);
         var2.addItem(var18);
         if (var7 != var3.get_Item(var3.size() - 1)) {
            var16 = (com.aspose.slides.internal.g4.x8)var3.get_Item(var8 + 1);
         }
      } while (var16 != var3.get_Item(var3.size() - 1) && var7 != var3.get_Item(var3.size() - 1));

      return var2;
   }

   private static IGenericDictionary<s6y, com.aspose.slides.internal.g4.s7> n5(
      com.aspose.slides.internal.g4.x8 var0,
      IGenericList<com.aspose.slides.internal.g4.x8> var1,
      IGenericList<com.aspose.slides.internal.g4.x8> var2,
      IGenericList<com.aspose.slides.internal.g4.s7> var3
   ) {
      com.aspose.slides.internal.n2d.z1 var4 = new com.aspose.slides.internal.n2d.z1<>(s6y.class, com.aspose.slides.internal.g4.s7.class);
      int var5 = -1;
      int var6 = -1;
      int var7 = 0;
      IGenericEnumerator var8 = var3.iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.g4.s7 var9 = (com.aspose.slides.internal.g4.s7)var8.next();
            boolean var10 = false;
            float var11 = var0.n5().a6()[0].k5();
            if (var1 != null && var2 != null) {
               for (int var12 = 0; var12 < var1.size(); var12++) {
                  float var13 = var0.n5().a6()[0].l6();

                  for (int var14 = 0; var14 < var2.size(); var14++) {
                     com.aspose.slides.internal.o9b.y1 var15 = new com.aspose.slides.internal.o9b.y1(
                        var13,
                        var11,
                        ((com.aspose.slides.internal.g4.x8)var2.get_Item(var14)).n5().a6()[1].l6() - var13,
                        ((com.aspose.slides.internal.g4.x8)var1.get_Item(var12)).n5().a6()[1].k5() - var11
                     );
                     if (var15.l6(var9.k5().y4())) {
                        var7 = var5 == var12 && var6 == var14 ? ++var7 : 0;
                        s6y var16 = new s6y();
                        var16.n5(var12);
                        var16.l6(var7);
                        var16.k5(var14);
                        var4.set_Item(var16, var9);
                        var5 = var12;
                        var6 = var14;
                        var10 = true;
                        break;
                     }

                     var13 = ((com.aspose.slides.internal.g4.x8)var2.get_Item(var14)).n5().a6()[0].l6();
                  }

                  var11 = ((com.aspose.slides.internal.g4.x8)var1.get_Item(var12)).n5().a6()[0].k5();
                  if (var10) {
                     break;
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      return var4;
   }

   private static IGenericList<com.aspose.slides.internal.g4.x8> n5(
      com.aspose.slides.internal.g4.x8 var0,
      com.aspose.slides.internal.g4.x8 var1,
      com.aspose.slides.internal.g4.x8 var2,
      com.aspose.slides.internal.g4.x8 var3,
      IGenericList<com.aspose.slides.internal.g4.x8> var4
   ) {
      List var5 = new List();
      var5.addItem(var2);
      IGenericEnumerator var6 = var4.iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.internal.g4.x8 var7 = (com.aspose.slides.internal.g4.x8)var6.next();
            if (var7 != var2
               && var7 != var3
               && com.aspose.slides.ms.System.q1.n5(var7.n5().a6()[0].k5() - var0.n5().a6()[0].k5()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var7.n5().a6()[1].k5() - var1.n5().a6()[0].k5()) < 2.0F) {
               var5.addItem(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var5.addItem(var3);
      return var5;
   }

   private static IGenericList<com.aspose.slides.internal.g4.x8> n5(
      com.aspose.slides.internal.g4.x8 var0, com.aspose.slides.internal.g4.x8 var1, IGenericList<com.aspose.slides.internal.g4.x8> var2
   ) {
      List var3 = new List();
      var3.addItem(var0);
      float var4 = var0.n5().a6()[1].l6() - var0.n5().a6()[0].l6();
      float var5 = var0.n5().a6()[0].k5();
      float var6 = var1.n5().a6()[0].k5();
      IGenericEnumerator var7 = var2.iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.g4.x8 var8 = (com.aspose.slides.internal.g4.x8)var7.next();
            float var9 = var8.n5().a6()[1].l6() - var8.n5().a6()[0].l6();
            if (var8 != var0
               && var8 != var1
               && com.aspose.slides.ms.System.q1.n5(var9 - var4) < 4.0F
               && var8.n5().a6()[0].k5() > var5
               && var8.n5().a6()[0].k5() < var6) {
               var3.addItem(var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      var3.addItem(var1);
      return var3;
   }

   private static IGenericList<com.aspose.slides.internal.g4.x8> l6(
      com.aspose.slides.internal.g4.x8 var0, com.aspose.slides.internal.g4.x8 var1, IGenericList<com.aspose.slides.internal.g4.x8> var2
   ) {
      List var3 = new List();
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.g4.x8 var5 = (com.aspose.slides.internal.g4.x8)var4.next();
            if (com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[0].l6() - var0.n5().a6()[0].l6()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[0].k5() - var0.n5().a6()[0].k5()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[1].l6() - var1.n5().a6()[0].l6()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[1].k5() - var1.n5().a6()[0].k5()) < 2.0F) {
               var3.addItem(var5);
            } else if (com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[0].l6() - var0.n5().a6()[1].l6()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[0].k5() - var0.n5().a6()[1].k5()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[1].l6() - var1.n5().a6()[1].l6()) < 2.0F
               && com.aspose.slides.ms.System.q1.n5(var5.n5().a6()[1].k5() - var1.n5().a6()[1].k5()) < 2.0F) {
               var3.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }
}
