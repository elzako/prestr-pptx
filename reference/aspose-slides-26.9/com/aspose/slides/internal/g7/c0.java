package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class c0 implements c9 {
   private z4 n5;

   public c0(z4 var1) {
      this.n5 = var1;
   }

   public c0(String var1) {
      this.n5 = new x0(var1);
   }

   @Override
   public final n2[] n5() {
      try {
         List var1 = new List();
         f3c var2 = new f3c(this.n5);

         try {
            long var3 = 1L;
            String var5 = var2.n5(4, "us-ascii");
            if (com.aspose.slides.ms.System.d1.n5(var5, "ttcf", true) != 0) {
               var2.n5(0L);
               z4 var6 = (z4)this.n5.k5();
               l3 var7 = new l3(0, w1n.n5(), var6, 0L);
               n2 var8 = new n2(0, var7);
               r5t var9 = new r5t();
               u0a var10 = (u0a)var9.n5(var8);
               var8 = new n2(var10.z1(), var10.t4(), 0, var7);
               var1.addItem(var8);
            } else {
               var2.u3();
               var3 = var2.y4();
               int var22 = (int)var3;
               long[] var23 = new long[var22];

               for (int var25 = 0; var25 < var23.length; var25++) {
                  var23[var25] = var2.y4();
                  z4 var26 = (z4)this.n5.k5();
                  var26.n5(var23[var25] & 4294967295L);
                  l3 var27 = new l3(var25, w1n.k5(), var26, var23[var25] & 4294967295L);
                  n2 var11 = new n2(0, var27);
                  r5t var12 = new r5t();
                  u0a var13 = (u0a)var12.n5(var11);
                  var11 = new n2(var13.z1(), var13.t4(), 0, var27);
                  var1.addItem(var11);
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }

         return (n2[])var1.toArray(new n2[0]);
      } catch (l0 var19) {
         throw var19;
      } catch (RuntimeException var20) {
         throw new f6("Unexpected font parsing exception", var20);
      }
   }
}
