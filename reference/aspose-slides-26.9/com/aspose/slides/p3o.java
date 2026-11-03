package com.aspose.slides;

class p3o {
   private IMarker n5;
   private n1g l6;
   private g3y k5;
   private boolean u3 = true;
   private com.aspose.slides.internal.o9b.w1 a6 = new com.aspose.slides.internal.o9b.w1();

   p3o(n1g var1, IMarker var2, g3y var3) {
      this.n5 = var2;
      this.l6 = var1;
      this.k5 = var3;
   }

   public final IMarker n5() {
      return this.n5;
   }

   final void n5(float var1, float var2, float var3) {
      float var4 = var3 == 0.0F ? this.k5() : var3;
      int var5 = g6z.k5(var4 / 2.0F);
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      int var7 = this.n5.getSymbol();
      if (this.n5.getSymbol() == -1
         && com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(this.n5, r0g.class).getParent_Immediate(), ChartDataPoint.class)) {
         var7 = this.k5.s7().n5().getSymbol();
      }

      if (var7 == -1) {
         this.l6();
      }

      LineFormat var8 = (LineFormat)this.n5.getFormat().getLine();
      if (var8.getFillFormat().getFillType() == -1) {
         var8 = (LineFormat)this.k5.u9().getMarker().getFormat().getLine();
      }

      FillFormat var9 = (FillFormat)this.n5.getFormat().getFill();
      if (var9.getFillType() == -1) {
         var9 = (FillFormat)this.k5.u9().getMarker().getFormat().getFill();
      }

      IEffectFormat var10 = this.n5.getFormat().getEffect();
      if (var10.isNoEffects()) {
         var10 = this.k5.u9().getMarker().getFormat().getEffect();
      }

      ChartSeries var11 = this.k5.u9();
      switch (var7) {
         case 0:
            var1 -= var5;
            var2 -= var5;
            var6.n5(var1, var2, var5 * 2.0F, var5 * 2.0F);
            w5k.n5(this.k5.h0().o8(), var11.c8().o8(), this.l6, var6, var8, var9, var10);
            break;
         case 1:
            int var27 = g6z.k5(var4);
            int var28 = g6z.k5(var4 / 4.0F);
            var1 = (float)(var1 - var27 / 2.0);
            var2 = (float)(var2 - var28 / 2.0);
            w5k.n5(this.k5.h0().o8(), var11.c8().o8(), this.l6, new com.aspose.slides.internal.o9b.y1(var1, var2, var27, var28), var8, var9, var10);
            break;
         case 2:
            com.aspose.slides.internal.o9b.w1[] var12 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
            );
            var12[0].n5(var1 - var5);
            var12[0].l6(var2);
            var12[1].n5(var1);
            var12[1].l6(var2 - var5);
            var12[2].n5(var1 + var5);
            var12[2].l6(var2);
            var12[3].n5(var1);
            var12[3].l6(var2 + var5);
            var6.k5(var12);
            w5k.n5(this.k5.h0().o8(), var11.c8().o8(), this.l6, var6, var8, var9, var10);
            break;
         case 3:
            int var14 = g6z.k5(var4 / 2.0F);
            int var15 = g6z.k5(var4 / 4.0F);
            if (var15 < 2) {
               var2 = com.aspose.slides.internal.v6g.k5.u3(var2 - var15 / 2.0 + 0.5, 14);
            } else {
               var2 = (float)(var2 - var15 / 2.0);
            }

            w5k.n5(this.k5.h0().o8(), var11.c8().o8(), this.l6, new com.aspose.slides.internal.o9b.y1(var1, var2, var14, var15), var8, var9, var10);
         case 4:
         case 5:
         case 6:
         default:
            break;
         case 7:
            var1 -= var5;
            var2 -= var5;
            var6.l6(new com.aspose.slides.internal.o9b.y1(var1, var2, 2.0F * var5, 2.0F * var5));
            w5k.n5(this.k5.h0().o8(), var11.c8().o8(), this.l6, var6, var8, var9, var10);
            break;
         case 8:
            var1 -= var5;
            var2 -= var5;
            w5k.n5(
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               this.l6,
               new com.aspose.slides.internal.o9b.y1(var1, var2, var5 * 2.0F, var5 * 2.0F),
               (Format)this.n5.getFormat()
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var1, var2),
               new com.aspose.slides.internal.o9b.w1(var1 + var5 * 2, var2 + var5 * 2),
               this.k5.h0().o8(),
               var8,
               this.l6
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var1, var2 + var5 * 2),
               new com.aspose.slides.internal.o9b.w1(var1 + var5 * 2, var2),
               this.k5.h0().o8(),
               var8,
               this.l6
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var1 + var5, var2),
               new com.aspose.slides.internal.o9b.w1(var1 + var5, var2 + var5 * 2),
               this.k5.h0().o8(),
               var8,
               this.l6
            );
            break;
         case 9:
            com.aspose.slides.internal.o9b.w1[] var13 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 3)
            );
            var13[0].n5(var1 - var5);
            var13[0].l6(var2 + var5);
            var13[1].n5(var1);
            var13[1].l6(var2 - var5);
            var13[2].n5(var1 + var5);
            var13[2].l6(var2 + var5);
            var6.k5(var13);
            w5k.n5(this.k5.h0().o8(), var11.c8().o8(), this.l6, var6, var8, var9, var10);
            break;
         case 10:
            var1 -= var5;
            var2 -= var5;
            w5k.n5(
               this.k5.h0().o8(),
               var11.c8().o8(),
               this.l6,
               new com.aspose.slides.internal.o9b.y1(var1, var2, var5 * 2.0F, var5 * 2.0F),
               (Format)this.n5.getFormat()
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var1, var2),
               new com.aspose.slides.internal.o9b.w1(var1 + var5 * 2, var2 + var5 * 2),
               this.k5.h0().o8(),
               var8,
               this.l6
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var1, var2 + var5 * 2),
               new com.aspose.slides.internal.o9b.w1(var1 + var5 * 2, var2),
               this.k5.h0().o8(),
               var8,
               this.l6
            );
      }
   }

   final int l6() {
      ChartSeries var1 = this.k5.u9();
      int var2 = (int)var1.n5().n5();
      if (var2 == -1) {
         return 7;
      }

      if (var1.getType() == 68) {
         return 0;
      }

      var2 %= 9;
      var2 += 2;
      switch (var2) {
         case 2:
            return 2;
         case 3:
            return 7;
         case 4:
            return 9;
         case 5:
            return 10;
         case 6:
            return 8;
         case 7:
            return 0;
         case 8:
            return 10;
         case 9:
            return 3;
         case 10:
            return 1;
         default:
            return 4;
      }
   }

   private int k5() {
      int var1 = this.l6.n3().getStyle() + 1;
      if (var1 <= 8) {
         return 5;
      } else if (var1 <= 24) {
         return 7;
      } else {
         return var1 <= 32 ? 11 : 7;
      }
   }
}
