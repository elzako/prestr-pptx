package com.aspose.slides;

class m3c extends e8y {
   m3c(p7m var1, g3y var2) {
      super(var1, var2);
   }

   @Override
   protected void l6(z5 var1) {
      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, u7.class)) {
            w3 var3 = this.t9().k5;
            int var4 = this.t9().k5.n5.size();
            if (this.t9().k5.n5().a0()) {
               float var5 = var3.d2();
               this.l6.get_Item(var2).a6((float)(this.l6.get_Item(var2).y4() / var4 * var5) - this.l6.get_Item(var2).d2() / 2.0F - this.h0() / 2.0F);
            } else {
               float var10 = var3.d2();
               this.l6.get_Item(var2).a6((float)((this.l6.get_Item(var2).y4() - 1.0) / (var4 - 1) * var10) - this.l6.get_Item(var2).d2() / 2.0F);
            }
         } else {
            this.l6.get_Item(var2).a6(this.t9().k5.n5(this.l6.get_Item(var2).y4()) - this.l6.get_Item(var2).d2() / 2.0F);
            if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)) {
               this.l6.get_Item(var2).a6(this.l6.get_Item(var2).b3() + this.h0() / 2.0F);
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().l6, u7.class)) {
            if (this.t9().l6.n5().a0()) {
               this.l6
                  .get_Item(var2)
                  .u9(this.d5() - com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, l5n.class).a5() * (var2 + 0.5F) - this.l6.get_Item(var2).d5() / 2.0F);
            } else {
               this.l6
                  .get_Item(var2)
                  .u9(this.d5() - com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, l5n.class).a5() * var2 - this.l6.get_Item(var2).d5() / 2.0F);
            }
         } else {
            this.l6.get_Item(var2).u9(this.t9().l6.n5(this.l6.get_Item(var2).n3()) - this.l6.get_Item(var2).d5() / 2.0F);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, ValueAxisBase.class)) {
            double var6 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, ValueAxisBase.class).h2();
            double var8 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, ValueAxisBase.class).v0();
            if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, g3p.class)) {
               var6 = this.t9().k5.n5().n5(var6);
               var8 = this.t9().k5.n5().n5(var8);
            }

            if (this.l6.get_Item(var2).y4() < var8 || this.l6.get_Item(var2).y4() > var6) {
               this.l6.get_Item(var2).l6(false);
            }
         }

         this.l6.get_Item(var2).t1();
      }

      this.k5(var1);
      this.u3();
      this.n3();
      this.x8();
   }

   private boolean n5(h2v var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, ValueAxisBase.class)) {
         double var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, ValueAxisBase.class).h2();
         double var4 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, ValueAxisBase.class).v0();
         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, g3p.class)) {
            var2 = this.t9().k5.n5().n5(var2);
            var4 = this.t9().k5.n5().n5(var4);
         }

         if (var1.y4() < var4 || var1.y4() > var2) {
            return true;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.t9().l6, ValueAxisBase.class)) {
         double var6 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class).h2();
         double var7 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class).v0();
         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().l6, i2t.class)) {
            var6 = this.t9().l6.n5().n5(var6);
            var7 = this.t9().l6.n5().n5(var7);
         }

         if (var1.n3() < var7 || var1.n3() > var6) {
            return true;
         }
      }

      return false;
   }

   private void k5(z5 var1) {
      float var2 = 4.0F;

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         if (this.k5.get_Item(var3) != null) {
            h2v var4 = ((q1h)this.k5.get_Item(var3)).u3();
            q8o var5 = this.k5.get_Item(var3);
            if (!var4.T_()) {
               var5.n5(false);
            } else {
               switch (var4.e2().t9().c8()) {
                  case 0:
                     var5.u9(var4.o0() + var4.d5() + var2);
                     var5.a6(var4.i1().l6() - var5.d2() / 2.0F);
                     break;
                  case 1:
                  case 3:
                  case 4:
                  case 6:
                  case 7:
                  default:
                     var5.u9(this.t9().l6.n5(var4.n3()) - var5.d5() / 2.0F);
                     var5.a6(var4.b3() + var4.d2() + var2);
                     break;
                  case 2:
                     var5.u9(this.t9().l6.n5(var4.n3()) - var5.d5() / 2.0F);
                     var5.a6(var4.i1().l6() - var5.d2() / 2.0F);
                     break;
                  case 5:
                     var5.u9(this.t9().l6.n5(var4.n3()) - var5.d5() / 2.0F);
                     var5.a6(var4.b3() - var5.d2() - var2);
                     break;
                  case 8:
                     var5.u9(var4.o0() - var5.d5() - var2);
                     var5.a6(var4.i1().l6() - var5.d2() / 2.0F);
               }

               a9v var6 = (a9v)var1;
               com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(-var6.u3(), -var6.a6(), this.y2().d2(), this.y2().d5());
               com.aspose.slides.internal.o9b.w1 var8 = var5.l6(new com.aspose.slides.internal.o9b.w1(var5.b3(), var5.o0()), var7.y4()).u3();
               var5.a6(var8.l6());
               var5.u9(var8.k5());
            }

            if (!this.e2().u9().getChart().getShowDataLabelsOverMaximum() && this.n5(((q1h)var5).u3())) {
               this.l6(var5);
            }

            var5.t1();
            float var9 = var4.i1().l6() - var5.b3();
            float var10 = var4.i1().k5() - var5.o0();
            var5.n5(new com.aspose.slides.internal.o9b.w1(var9, var10));
         }
      }
   }

   private void u3() {
      for (int var1 = 0; var1 < this.u3.size(); var1++) {
         h2v var2 = ((q1h)this.k5.get_Item(var1)).u3();
         q8o var3 = this.k5.get_Item(var1);
         a6y var4 = this.u3.get_Item(var1);
         com.aspose.slides.internal.o9b.w1 var5 = var2.n5(var3).u3();
         com.aspose.slides.internal.o9b.w1[] var6;
         if (!(var3.p8() > var5.l6()) && !(var3.p8() + var3.d2() < var5.l6())) {
            var6 = var3.z3();
         } else {
            var6 = var3.q0();
         }

         boolean var7 = var4.n5(var3.e5().y4(), new com.aspose.slides.internal.o9b.w1[]{var5}, var6);
         boolean var8 = !var3.e5().k5(var2.e5().y4());
         boolean var9 = var3.t2() != 0.0F || var3.s7() != 0.0F;
         float var10 = com.aspose.slides.ms.System.q1.l6(var4.h0().l6(), var4.c8().l6());
         float var11 = com.aspose.slides.ms.System.q1.n5((float)(var4.h0().l6()), (float)(var4.c8().l6()));
         float var12 = com.aspose.slides.ms.System.q1.l6(var4.h0().k5(), var4.c8().k5());
         float var13 = com.aspose.slides.ms.System.q1.n5((float)(var4.h0().k5()), (float)(var4.c8().k5()));
         com.aspose.slides.internal.o9b.y1 var14 = new com.aspose.slides.internal.o9b.y1(var10, var12, var11 - var10, var13 - var12);
         boolean var15 = var3.e5().k5(var14.y4());
         if (var7 && var8 && var9) {
            if (var5.l6() > this.y2().s3().n5 || var5.k5() > this.y2().s3().l6) {
               var4.n5(false);
            } else if (var15) {
               var4.n5(false);
            } else {
               var4.n5(true);
            }
         } else {
            var4.n5(false);
         }

         var4.t1();
      }
   }
}
