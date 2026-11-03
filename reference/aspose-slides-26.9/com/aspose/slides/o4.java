package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class o4 {
   public static void n5(IBehavior var0, com.aspose.slides.internal.k4y.b3 var1, w3j var2) {
      com.aspose.slides.internal.k4y.u2q var3 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, IColorEffect.class)) {
         com.aspose.slides.internal.k4y.s5v var4 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.s5v.class);
         var3 = var4.u9();
         k4o.n5((IColorEffect)var0, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, ICommandEffect.class)) {
         com.aspose.slides.internal.k4y.s1z var10 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.s1z.class);
         var3 = var10.k5();
         o2b.n5((ICommandEffect)var0, var10, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IFilterEffect.class)) {
         com.aspose.slides.internal.k4y.n3m var11 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.n3m.class);
         var3 = var11.u3();
         e5s.n5((IFilterEffect)var0, var11);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IMotionEffect.class)) {
         com.aspose.slides.internal.k4y.h7g var12 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.h7g.class);
         var3 = var12.s7();
         l8c.n5((IMotionEffect)var0, var12);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IPropertyEffect.class)) {
         com.aspose.slides.internal.k4y.a4w var13 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.a4w.class);
         var3 = var13.h0();
         n9g.n5((IPropertyEffect)var0, var13);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IRotationEffect.class)) {
         com.aspose.slides.internal.k4y.c3t var14 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.c3t.class);
         var3 = var14.u3();
         l9s.n5((IRotationEffect)var0, var14);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IScaleEffect.class)) {
         com.aspose.slides.internal.k4y.q6i var15 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.q6i.class);
         var3 = var15.a6();
         i6d.n5((IScaleEffect)var0, var15);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0, ISetEffect.class)) {
            throw new Exception();
         }

         com.aspose.slides.internal.k4y.p2j var16 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.p2j.class);
         var3 = var16.l6();
         d6w.n5((ISetEffect)var0, var16);
      }

      if (var3.c8() != null && var3.c8().n5().length > 0) {
         for (String var7 : var3.c8().n5()) {
            BehaviorProperty var8 = BehaviorProperty.getOrCreateByValue(var7);
            var0.getProperties().addItem(var8);
         }
      }
   }

   public static void n5(IBehavior var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, IColorEffect.class)) {
         k4o.n5((IColorEffect)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, ICommandEffect.class)) {
         o2b.n5((ICommandEffect)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IFilterEffect.class)) {
         e5s.n5((IFilterEffect)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IMotionEffect.class)) {
         l8c.n5((IMotionEffect)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IPropertyEffect.class)) {
         n9g.n5((IPropertyEffect)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IRotationEffect.class)) {
         l9s.n5((IRotationEffect)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IScaleEffect.class)) {
         i6d.n5((IScaleEffect)var0, var1, var2);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0, ISetEffect.class)) {
            throw new Exception();
         }

         d6w.n5((ISetEffect)var0, var1, var2);
      }

      n5(var0, var2);
   }

   private static void n5(IBehavior var0, com.aspose.slides.internal.k4y.u2q[] var1) {
      if (var0.getProperties().size() > 0) {
         com.aspose.slides.internal.k4y.g1l var2 = var1[0].n5();
         IGenericEnumerator var3 = var0.getProperties().iterator();

         try {
            while (var3.hasNext()) {
               BehaviorProperty var4 = (BehaviorProperty)var3.next();
               var2.n5(var4.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }
}
