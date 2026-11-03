package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class y2 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public y2(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 2) {
         com.aspose.slides.internal.v2.n5 var13 = com.aspose.slides.internal.v6g.k5.n5(var2.get_Item(0), com.aspose.slides.internal.v2.n5.class);
         if (var13 != null) {
            com.aspose.slides.internal.v2.t2 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.get_Item(1), com.aspose.slides.internal.v2.t2.class);
            if (var4 != null) {
               com.aspose.slides.internal.t8.a6 var5 = this.n5.n5();
               float[] var6 = new float[var13.n5()];

               for (int var7 = 0; var7 < var6.length; var7++) {
                  var6[var7] = var13.u3(var7) / var5.s7();
               }

               IGenericEnumerator var14 = var13.iterator();

               try {
                  while (var14.hasNext()) {
                     com.aspose.slides.internal.v2.s7 var8 = (com.aspose.slides.internal.v2.s7)var14.next();
                     if (!com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.v2.t2.class)) {
                        var13 = new com.aspose.slides.internal.v2.n5();
                        break;
                     }

                     com.aspose.slides.internal.v2.t2 var9 = (com.aspose.slides.internal.v2.t2)var8;
                     if (var9.u3() != 0.0F) {
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     var14.dispose();
                  }
               }

               int var15 = var4.k5();
               if (var15 < 0) {
                  var15 = 0;
               }

               com.aspose.slides.internal.z2.n5 var16 = new com.aspose.slides.internal.z2.n5(var13, var15);
               var5.n5(var16);
               var5.n5((float)var15);
               var5.n5(var6);
               this.n5.n5(var5);
            }
         }
      } else {
         String var3 = "Arguments should has 2 operands!";
         throw new ArgumentException(var3);
      }
   }
}
