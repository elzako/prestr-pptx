package com.aspose.slides.internal.g7;

class b3 {
   private a5 n5;
   private v0 l6;

   public b3(v0 var1, a5 var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   public final void n5(p3 var1) {
      int var2 = this.l6.n5().h0().k5();
      if (this.l6.k5().n5().k7 > 1L) {
         this.n5.n5(this.l6.k5().n5().k7);
         byte var3 = this.n5.k5();
         byte var4 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) & 127);
         switch (var4) {
            case 0:
               byte var15 = this.n5.k5();

               for (byte var18 = 1; com.aspose.slides.internal.v6g.k5.u3(var18, 6) <= com.aspose.slides.internal.v6g.k5.u3(var15, 6); var18++) {
                  byte var20 = this.n5.k5();
                  if (com.aspose.slides.internal.v6g.k5.u3(var18, 6) < var2) {
                     var1.n5[com.aspose.slides.internal.v6g.k5.u3(var20, 6)] = com.aspose.slides.internal.v6g.k5.k5(var18, 6);
                     var1.l6[com.aspose.slides.internal.v6g.k5.u3(var20, 6)] = this.l6.n5().t2().n5()[com.aspose.slides.internal.v6g.k5.u3(var18, 6)];
                  }
               }
               break;
            case 1:
               byte var5 = this.n5.k5();
               int var6 = 1;

               for (int var7 = 0; var7 < com.aspose.slides.internal.v6g.k5.u3(var5, 6); var7++) {
                  byte var8 = this.n5.k5();
                  byte var9 = this.n5.k5();

                  for (int var10 = 0; var10 < com.aspose.slides.internal.v6g.k5.u3(var9, 6) + 1; var10++) {
                     var1.n5[com.aspose.slides.internal.v6g.k5.u3(var8, 6) + var10] = var6;
                     var1.l6[com.aspose.slides.internal.v6g.k5.u3(var8, 6) + var10] = this.l6.n5().t2().n5()[com.aspose.slides.internal.v6g.k5.u3(var6, 8)];
                     var6++;
                  }
               }
         }

         if ((com.aspose.slides.internal.v6g.k5.u3(var3, 6) & 128) != 0) {
            byte var16 = this.n5.k5();

            for (int var19 = 0; var19 < com.aspose.slides.internal.v6g.k5.u3(var16, 6); var19++) {
               byte var21 = this.n5.k5();
               int var22 = this.n5.u3();
               var1.l6[com.aspose.slides.internal.v6g.k5.u3(var21, 6)] = var22;

               for (int var23 = 0; com.aspose.slides.internal.v6g.k5.k5(var23, 8) < var2; var23++) {
                  if (com.aspose.slides.internal.v6g.k5.k5(this.l6.n5().t2().n5()[com.aspose.slides.internal.v6g.k5.u3(var23, 8)], 8)
                     == com.aspose.slides.internal.v6g.k5.k5(var22, 8)) {
                     var1.n5[com.aspose.slides.internal.v6g.k5.u3(var21, 6)] = var23;
                     break;
                  }
               }
            }
         }
      } else {
         switch ((int)this.l6.k5().n5().k7) {
            case 0:
               for (int var12 = 0; var12 <= 255; var12++) {
                  var1.l6[var12] = j4.n5.a6().n5((byte)var12);
               }
               break;
            case 1:
               for (int var11 = 0; var11 <= 255; var11++) {
                  var1.l6[var11] = j4.n5.u3().n5((byte)var11);
               }
         }

         for (int var13 = 0; var13 <= 255; var13++) {
            if (com.aspose.slides.internal.v6g.k5.k5(var1.l6[var13], 8) != 0) {
               boolean var14 = false;

               for (int var17 = 1; com.aspose.slides.internal.v6g.k5.k5(var17, 8) < var2; var17++) {
                  if (com.aspose.slides.internal.v6g.k5.k5(this.l6.n5().t2().n5()[com.aspose.slides.internal.v6g.k5.u3(var17, 8)], 8)
                     == com.aspose.slides.internal.v6g.k5.k5(var1.l6[var13], 8)) {
                     var1.n5[var13] = var17;
                     var14 = true;
                     break;
                  }
               }

               if (!var14) {
                  var1.n5[var13] = 0;
                  var1.l6[var13] = 0;
               }
            }
         }
      }
   }
}
