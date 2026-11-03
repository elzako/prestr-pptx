package com.aspose.slides.internal.g7;

class d5 {
   private a5 n5;
   private v0 l6;

   public d5(v0 var1, a5 var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   public final void n5(d2 var1) {
      int var2 = this.l6.n5().h0().k5();
      var1.n5(new int[var2]);
      if (this.l6.k5().n5().m1 > 2L) {
         this.n5.n5(this.l6.k5().n5().m1);
         byte var3 = this.n5.k5();
         switch (var3) {
            case 0:
               for (int var13 = 1; var13 < var2; var13++) {
                  var1.n5()[var13] = this.n5.u3();
               }
               break;
            case 1:
            case 2:
               int var4 = 1;

               while (var4 < var2) {
                  int var5 = this.n5.a6();
                  int var6;
                  if (com.aspose.slides.internal.v6g.k5.u3(var3, 6) == 1) {
                     var6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 6);
                  } else {
                     var6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.a6(), 8);
                  }

                  for (int var7 = 0; var4 < var2 && var7 <= var6; var5++) {
                     var1.n5()[var4] = var5;
                     var7++;
                     var4++;
                  }
               }
         }
      } else {
         switch ((int)this.l6.k5().n5().m1) {
            case 0:
               for (int var10 = 0; var10 < var2; var10++) {
                  var1.n5()[var10] = j4.n5.k5().n5((byte)var10);
               }
               break;
            case 1:
               for (int var9 = 0; var9 < var2; var9++) {
                  var1.n5()[var9] = j4.n5.n5().n5((byte)var9);
               }
               break;
            case 2:
               for (int var8 = 0; var8 < var2; var8++) {
                  var1.n5()[var8] = j4.n5.l6().n5((byte)var8);
               }
         }
      }

      int var11 = 0;

      for (int var14 = 0; var14 < var2; var14++) {
         if (com.aspose.slides.internal.v6g.k5.k5(var1.n5()[var14], 8) > com.aspose.slides.internal.v6g.k5.k5(var11, 8)) {
            var11 = var1.n5()[var14];
         }
      }

      var1.l6(new int[com.aspose.slides.internal.v6g.k5.k5(++var11, 8)]);

      for (int var15 = 0; var15 < com.aspose.slides.internal.v6g.k5.k5(var11, 8); var15++) {
         var1.l6()[var15] = 0;
      }

      for (int var16 = 0; var16 < var2; var16++) {
         var1.l6()[com.aspose.slides.internal.v6g.k5.u3(var1.n5()[var16], 8)] = com.aspose.slides.internal.v6g.k5.k5(var16, 9);
      }
   }
}
