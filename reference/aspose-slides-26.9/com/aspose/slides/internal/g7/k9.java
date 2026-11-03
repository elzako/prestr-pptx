package com.aspose.slides.internal.g7;

class k9 {
   private k6 n5;
   private double l6;

   public k9(k6 var1, double var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5(v5$n5 var1) {
      k9$n5 var2 = k9$n5.n5.l6();

      for (int var3 = 0; var3 < var1.k5(); var3++) {
         for (int var4 = 0; var4 < var1.l6(); var4++) {
            int var5 = var3 * var1.l6() + var4;
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var5 / 8.0, 14);
            int var7 = var5 - var6 * 8;
            boolean var8 = (com.aspose.slides.internal.v6g.k5.u3(var1.u9()[var6], 6) & 1 << 7 - var7) != 0;
            if (var8) {
               if (var2.n5()) {
                  var2 = new k9$n5(var4, var3);
               } else {
                  var2.k5++;
               }
            } else if (!var2.n5()) {
               this.n5(var1, var2.l6());
               k9$n5.n5.n5(var2);
            }
         }

         if (!var2.n5()) {
            this.n5(var1, var2.l6());
            k9$n5.n5.n5(var2);
         }
      }
   }

   private void n5(v5$n5 var1, k9$n5 var2) {
      double var3 = (var2.l6 + var1.u3()) * this.l6;
      double var5 = (var2.k5 + var1.u3()) * this.l6;
      double var7 = (var1.k5() - var2.u3 - (var1.k5() - var1.a6())) * this.l6;
      this.n5.u9().n5().n5(new j0(var3, var7));
      this.n5.u9().n5().n5(new f7(var3, var7 + 1.0 * this.l6));
      this.n5.u9().n5().n5(new f7(var5 + 1.0 * this.l6, var7 + 1.0 * this.l6));
      this.n5.u9().n5().n5(new f7(var5 + 1.0 * this.l6, var7));
      this.n5.u9().n5().n5(new b5(var3, var7));
   }
}
