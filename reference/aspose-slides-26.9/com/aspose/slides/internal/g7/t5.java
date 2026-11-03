package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.ArrayList;

public class t5 implements c9 {
   private String n5;

   public t5(String var1) {
      this.n5 = var1;
   }

   @Override
   public final n2[] n5() {
      try {
         String[] var1 = com.aspose.slides.internal.z0k.u3.a6(this.n5);
         if (var1.length < 1) {
            return new n2[0];
         }

         int var2 = 0;
         ArrayList var3 = new ArrayList(var1.length);

         for (int var4 = 0; var4 < var1.length; var4++) {
            try {
               String var5 = com.aspose.slides.ms.System.d1.n5;
               var2 = com.aspose.slides.ms.System.d1.k5(var1[var4], '.');
               if (var2 < var1[var4].length() - 1) {
                  var5 = com.aspose.slides.ms.System.d1.l6(var1[var4], var2 + 1, var1[var4].length() - var2 - 1);
               }

               if (com.aspose.slides.ms.System.d1.n5(var5, w1n.l6(), true) != 0 && com.aspose.slides.ms.System.d1.n5(var5, w1n.n5(), true) != 0) {
                  if (com.aspose.slides.ms.System.d1.n5(var5, w1n.k5(), true) == 0) {
                     c0 var16 = new c0(var1[var4]);

                     for (n2 var10 : var16.n5()) {
                        var3.addItem(var10);
                     }
                  } else if (com.aspose.slides.ms.System.d1.n5(var5, m2n.l6(), true) == 0 || com.aspose.slides.ms.System.d1.n5(var5, m2n.n5(), true) == 0) {
                     x0 var15 = new x0(var1[var4]);
                     e2o var17 = new e2o();
                     n2 var19 = var17.n5(var15);
                     if (var19 != null) {
                        var3.addItem(var19);
                     }
                  }
               } else {
                  x0 var6 = new x0(var1[var4]);
                  m6n var7 = new m6n();
                  n2 var8 = var7.n5(var6);
                  if (var8 != null) {
                     var3.addItem(var8);
                  }
               }
            } catch (RuntimeException var11) {
               if (r6.n5().k5() != 1) {
                  throw var11;
               }
            }
         }

         return com.aspose.slides.internal.v6g.k5.k5(var3.toArray(com.aspose.slides.internal.v6g.k5.n5(n2.class)), n2[].class);
      } catch (l0 var12) {
         throw var12;
      } catch (RuntimeException var13) {
         throw new l0("Unexpected font parsing exception", var13);
      }
   }
}
