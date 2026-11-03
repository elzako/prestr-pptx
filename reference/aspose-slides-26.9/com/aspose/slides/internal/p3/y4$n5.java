package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

class y4$n5 {
   private g7 n5;
   private g7 l6;
   private boolean k5 = true;

   private y4$n5(List<com.aspose.slides.internal.r4.u9> var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var1);

      while (var2.l6()) {
         Object var3 = var2.k5();
         g7 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, g7.class);
         if (var4 != null) {
            if (var4.x8().equals(v3.n5)) {
               if (this.n5 == null) {
                  this.n5 = var4;
               }
            } else if (var4.x8().equals(v3.l6)) {
               this.l6 = var4;
            }
         } else {
            f2 var5 = com.aspose.slides.internal.v6g.k5.n5(var3, f2.class);
            if (var5 != null) {
               if (this.k5 && var5.z1() != 0) {
                  this.k5 = false;
               }

               this.l6 = null;
            }
         }
      }
   }

   public static void n5(List<com.aspose.slides.internal.r4.u9> var0, List<com.aspose.slides.internal.r4.u9> var1) {
      y4$n5 var2 = new y4$n5(var1);
      y4$n5 var3 = new y4$n5(var0);
      if (var2.n5()) {
         if (var3.n5()) {
            com.aspose.slides.internal.v8.u9 var4 = var2.n5.s7();
            com.aspose.slides.internal.v8.u9 var5 = var2.l6.s7();
            if (var4.l6() < var5.l6()) {
               var4 = var5;
            }

            var2.n5.l6(com.aspose.slides.internal.v8.u9.n5);
            var2.l6.l6(var4);
            var4 = var3.l6.s7();
            var5 = var2.l6.s7();
            if (var4.l6() < var5.l6()) {
               var4 = var5;
            }

            var3.l6.l6(com.aspose.slides.internal.v8.u9.n5);
            var2.l6.l6(var4);
         } else if (var3.l6 != null) {
            com.aspose.slides.internal.v8.u9 var7 = var3.l6.s7();
            com.aspose.slides.internal.v8.u9 var10 = var2.n5.s7();
            if (var7.l6() < var10.l6()) {
               var7 = var10;
            }

            var10 = var2.l6.s7();
            if (var7.l6() < var10.l6()) {
               var7 = var10;
            }

            var3.l6.l6(com.aspose.slides.internal.v8.u9.n5);
            var2.n5.l6(com.aspose.slides.internal.v8.u9.n5);
            var2.l6.l6(var7);
         } else {
            com.aspose.slides.internal.v8.u9 var8 = var2.n5.s7();
            com.aspose.slides.internal.v8.u9 var12 = var2.l6.s7();
            if (var8.l6() < var12.l6()) {
               var8 = var12;
            }

            var2.n5.l6(com.aspose.slides.internal.v8.u9.n5);
            var2.l6.l6(var8);
         }
      }

      com.aspose.slides.internal.v3.t2.n5(var0, var1);
   }

   private boolean n5() {
      return this.k5 && this.n5 != null && this.l6 != null;
   }
}
