package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;

class e2 implements d5 {
   static final Hashtable n5 = Hashtable.sync(new Hashtable());

   static Hashtable l6() {
      synchronized (n5.getSyncRoot()) {
         n5(n5.size());
      }

      return n5;
   }

   static void n5(int var0) {
      if (var0 >= 10) {
         com.aspose.slides.ms.System.j5 var1 = com.aspose.slides.ms.System.j5.k5.m3();
         com.aspose.slides.ms.System.j5 var2 = com.aspose.slides.ms.System.j5.s7().m3();
         ArrayList var3 = null;

         for (Object recoveredElement$var5$623 : n5.getKeys()) {
            int var5 = (Integer)recoveredElement$var5$623;
            z1 var6 = (z1)n5.get_Item(com.aspose.slides.internal.v6g.k5.l6(var5));
            if (com.aspose.slides.ms.System.j5.k5(var6.h0(), var1) && com.aspose.slides.ms.System.j5.t2(var6.h0(), var2).a6() > 6000000000L) {
               var6.h0().u3(var1);
               if (var3 == null) {
                  var3 = new ArrayList();
               }

               var3.addItem(com.aspose.slides.internal.v6g.k5.l6(var5));
            }
         }

         if (var3 != null) {
            for (Object recoveredElement$var8$1151 : var3) {
               int var8 = (Integer)recoveredElement$var8$1151;
               n5.removeItem(com.aspose.slides.internal.v6g.k5.l6(var8));
            }
         }
      }
   }

   @Override
   public l6 n5(String var1, b5 var2, f2 var3) {
      if (var3 != null && var1 != null) {
         String var4 = com.aspose.slides.ms.System.d1.l6(var1);
         if (com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.u9(var4), "digest") == -1) {
            return null;
         }

         w1 var5 = com.aspose.slides.internal.v6g.k5.n5(var2, w1.class);
         if (var5 == null) {
            return null;
         }

         z1 var6 = new z1();
         if (!var6.n5(var1)) {
            return null;
         }

         int var7 = var5.n5().hashCode() ^ var3.hashCode() ^ var6.k5().hashCode();
         z1 var8 = (z1)l6().get_Item(com.aspose.slides.internal.v6g.k5.l6(var7));
         boolean var9 = var8 == null;
         if (var9) {
            var8 = var6;
         } else if (!var8.n5(var1)) {
            return null;
         }

         if (var9) {
            l6().addItem(com.aspose.slides.internal.v6g.k5.l6(var7), var8);
         }

         return var8.n5(var2, var3);
      } else {
         return null;
      }
   }

   @Override
   public l6 l6(b5 var1, f2 var2) {
      w1 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, w1.class);
      if (var3 == null) {
         return null;
      }

      if (var2 == null) {
         return null;
      }

      int var4 = var3.n5().hashCode() ^ var2.hashCode();
      z1 var5 = (z1)l6().get_Item(com.aspose.slides.internal.v6g.k5.l6(var4));
      return var5 == null ? null : var5.n5(var1, var2);
   }

   @Override
   public String n5() {
      return "Digest";
   }
}
