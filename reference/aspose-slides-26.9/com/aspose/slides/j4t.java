package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;

class j4t {
   static void n5(ISlidesPicture var0, int var1, int var2, int var3, a9x var4) {
      com.aspose.slides.internal.k0r.q5 var5 = var4.n3();
      com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var5.a6().l6().n5(var1), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         long var7 = var6.j5();
         if ((var7 & 4294901760L & 4294967295L) == 4294901760L) {
            var7 = var7 & 65535L & 4294967295L;
         }

         int var9 = (int)var7;
         SortedList var10 = var4.y4().a6().t2();
         if (var10.containsKey(var9)) {
            var0.setImage(((y8g)var10.get_Item(var9)).k5());
            ((Picture)var0).l6().n5(true);
         }
      }

      com.aspose.slides.internal.k0r.v8 var16 = com.aspose.slides.internal.v6g.k5.n5(var5.a6().l6().n5(var2), com.aspose.slides.internal.k0r.v8.class);
      com.aspose.slides.internal.k0r.z5 var11 = com.aspose.slides.internal.v6g.k5.n5(var5.a6().l6().n5(var3), com.aspose.slides.internal.k0r.z5.class);
      if (var16 != null && var11 != null && ((var11.j5() & 1L & 4294967295L) != 0L || (var11.j5() & 2L & 4294967295L) != 0L)) {
         com.aspose.slides.internal.l7h.t1 var12 = new com.aspose.slides.internal.l7h.t1();
         char[] var17 = var12.n5(var16.l6());
         String var13 = null;
         if (var17 != null && var17.length > 0) {
            if (var17[var17.length - 1] == 0) {
               var13 = com.aspose.slides.ms.System.d1.n5(var17, 0, var17.length - 1);
            } else {
               var13 = com.aspose.slides.ms.System.d1.n5(var17);
            }
         }

         if (!com.aspose.slides.ms.System.d1.n5(var13)) {
            try {
               com.aspose.slides.ms.System.r8 var14 = new com.aspose.slides.ms.System.r8(var13);
               ((Picture)var0).n5(var14.c8() ? var14.x8() : var14.l6());
            } catch (RuntimeException var15) {
               if (!com.aspose.slides.internal.n8e.v4.k5(var13)) {
                  ((Picture)var0).n5(var13);
               }

               com.aspose.slides.internal.n8e.v4.n5(var15);
            }

            if (((Picture)var0).l6().a6() && !com.aspose.slides.ms.System.d1.n5(var0.getLinkPathLong())) {
               PPImage var18 = com.aspose.slides.internal.v6g.k5.n5(var4.y4().a6().t9().n5(var0.getLinkPathLong()), PPImage.class);
               if (var18 != null && var18 != ((ImageCollection)var18.x8().getImages()).n5()) {
                  var0.setImage(var18);
               }
            }
         }
      }

      g3e.n5(var0, var4);
   }

   static void n5(ISlidesPicture var0, com.aspose.slides.internal.k0r.r3 var1, int var2, int var3, int var4, g6o var5) {
      var1.l6().k5(var2);
      var1.l6().k5(var3);
      var1.l6().k5(var4);
      if (var0 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var0.getLinkPathLong())) {
            com.aspose.slides.internal.k0r.v8 var6 = new com.aspose.slides.internal.k0r.v8(var3, var0.getLinkPathLong());
            var1.l6().n5(var6);
            com.aspose.slides.internal.k0r.z5 var7 = new com.aspose.slides.internal.k0r.z5(var4, (2L | (var0.getImage() == null ? 4L : 0L) | 8L) & 4294967295L);
            var1.l6().n5(var7);
            if (((Picture)var0).l6().a6() && var0.getImage() != null) {
               com.aspose.slides.internal.k0r.z5 var8 = new com.aspose.slides.internal.k0r.z5(var2, true, 0L);
               var1.l6().n5(var8);
               var5.n5(var8, var0.getImage());
            }
         } else if (var0.getImage() != null) {
            com.aspose.slides.internal.k0r.z5 var9 = new com.aspose.slides.internal.k0r.z5(var2, true, 0L);
            var1.l6().n5(var9);
            var5.n5(var9, var0.getImage());
         } else {
            com.aspose.slides.internal.k0r.z5 var10 = new com.aspose.slides.internal.k0r.z5(var2, true, 0L);
            var1.l6().n5(var10);
            var5.n5(var10, ((ImageCollection)var0.getPresentation().getImages()).n5());
         }

         g3e.n5(var0.getImageTransform(), var1, var5);
      }
   }
}
