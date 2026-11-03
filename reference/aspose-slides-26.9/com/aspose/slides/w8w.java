package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class w8w extends f7c {
   private List<q0g> n5 = new List<>();

   w8w(p7m var1, g3y var2) {
      super(var1, var2);
      double var3 = 0.0;

      for (int var5 = 0; var5 < var2.c8().size(); var5++) {
         t9z var6 = var2.c8().get_Item(var5);
         boolean var7 = var6.s7().getSetAsTotal();
         var3 = var7 ? var6.n5() : var3 + var6.n5();
         z2v var8 = new z2v(var6);
         this.l6.addItem(var8);
         var8.n5(var3);
         this.n5(var8);
         if (!var6.c8() && var6.t9() != null && var6.t9().y4()) {
            t3h var9 = new t3h(var8);
            this.k5.addItem(var9);
            this.n5(var9);
         }
      }

      if (this.e2().u9().getShowConnectorLines()) {
         for (int var10 = 0; var10 < var2.c8().size() - 1; var10++) {
            q0g var11 = new q0g(var2);
            this.n5(var11);
            this.n5.addItem(var11);
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      ValueAxisBase var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class);
      u7 var3 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, u7.class);
      float var4 = var2.n5(0.0);

      for (int var5 = 0; var5 < this.l6.size(); var5++) {
         if (this.l6.get_Item(var5).e2().s7().getSetAsTotal()) {
            var4 = var2.n5(0.0);
         }

         float var6 = var2.n5(this.l6.get_Item(var5).n3());
         float var7 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(var6)) - com.aspose.slides.ms.System.q1.l6(var4, var6);
         if (var7 < 0.001F && this.l6.get_Item(var5).e2().s7().t2().n5() != null) {
            var7 = 0.001F;
         }

         float var8 = this.u3() - this.u3() * this.h0() / 2.0F;
         if (var3 != null && !com.aspose.slides.ms.System.d2.k5(var3.n5().c8().l6())) {
            var8 = this.u3() / (1.0F + (float)var3.n5().c8().l6());
         }

         this.l6.get_Item(var5).n3(new z5(var8, var7));
         var4 = var6;
      }

      for (int var12 = 0; var12 < this.n5.size(); var12++) {
         this.n5.get_Item(var12).n3(var1);
      }

      List$Enumerator var13 = this.k5.iterator();

      try {
         while (var13.hasNext()) {
            q8o var14 = (q8o)var13.next();
            var14.n3(var14.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      ValueAxisBase var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class);
      float var3 = var2.n5(0.0);

      for (int var4 = 0; var4 < this.l6.size(); var4++) {
         if (this.l6.get_Item(var4).e2().s7().getSetAsTotal()) {
            var3 = var2.n5(0.0);
         }

         float var5 = var2.n5(this.l6.get_Item(var4).n3());
         this.l6.get_Item(var4).u9(com.aspose.slides.ms.System.q1.l6(var3, var5));
         this.l6.get_Item(var4).a6(var4 * this.u3() + this.u3() / 2.0F - this.l6.get_Item(var4).d2() / 2.0F);
         var3 = var5;
         this.l6.get_Item(var4).t1();
      }

      for (int var6 = 0; var6 < this.n5.size(); var6++) {
         if (this.l6.get_Item(var6).e2().n5() < 0.0) {
            this.n5.get_Item(var6).u3().a6(this.l6.get_Item(var6).b3() + this.l6.get_Item(var6).d2());
            this.n5.get_Item(var6).u3().u9(this.l6.get_Item(var6).o0() + this.l6.get_Item(var6).d5());
         } else {
            this.n5.get_Item(var6).u3().a6(this.l6.get_Item(var6).b3() + this.l6.get_Item(var6).d2());
            this.n5.get_Item(var6).u3().u9(this.l6.get_Item(var6).o0());
         }

         if (this.l6.get_Item(var6 + 1).e2().s7().getSetAsTotal()) {
            if (this.l6.get_Item(var6 + 1).e2().n5() < 0.0) {
               this.n5.get_Item(var6).a6().a6(this.l6.get_Item(var6 + 1).b3());
               this.n5.get_Item(var6).a6().u9(this.l6.get_Item(var6 + 1).o0() + this.l6.get_Item(var6 + 1).d5());
            } else {
               this.n5.get_Item(var6).a6().a6(this.l6.get_Item(var6 + 1).b3());
               this.n5.get_Item(var6).a6().u9(this.l6.get_Item(var6 + 1).o0());
            }
         } else if (this.l6.get_Item(var6 + 1).e2().n5() < 0.0) {
            this.n5.get_Item(var6).a6().a6(this.l6.get_Item(var6 + 1).b3());
            this.n5.get_Item(var6).a6().u9(this.l6.get_Item(var6 + 1).o0());
         } else {
            this.n5.get_Item(var6).a6().a6(this.l6.get_Item(var6 + 1).b3());
            this.n5.get_Item(var6).a6().u9(this.l6.get_Item(var6 + 1).o0() + this.l6.get_Item(var6 + 1).d5());
         }

         if (!this.l6.get_Item(var6).T_() || this.l6.get_Item(var6).e2().c8()) {
            this.n5.get_Item(var6).u3().a6(this.l6.get_Item(var6).b3() + this.l6.get_Item(var6).d2() / 2.0F);
            this.n5.get_Item(var6).u3().u9(this.l6.get_Item(var6).o0() + this.l6.get_Item(var6).d5());
         }

         if (!this.l6.get_Item(var6 + 1).T_() || this.l6.get_Item(var6 + 1).e2().c8()) {
            this.n5.get_Item(var6).a6().a6(this.l6.get_Item(var6 + 1).b3() + this.l6.get_Item(var6 + 1).d2() / 2.0F);
            this.n5.get_Item(var6).a6().u9(this.l6.get_Item(var6 + 1).o0() + this.l6.get_Item(var6 + 1).d5());
         }

         this.n5.get_Item(var6).t1();
      }

      this.k5(var1);
   }

   private void k5(z5 var1) {
      float var2 = 4.0F;

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         z2v var4 = (z2v)com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var3), t3h.class).u3();
         q8o var5 = this.k5.get_Item(var3);
         switch (var4.e2().t9().c8()) {
            case 2:
               var5.u9(var4.o0() + var4.d5() / 2.0F - var5.d5() / 2.0F);
               break;
            case 3:
               if (var4.e2().n5() < 0.0) {
                  var5.u9(var4.o0());
               } else {
                  var5.u9(var4.o0() + var4.d5() - var5.d5());
               }
               break;
            case 4:
               if (var4.e2().n5() < 0.0) {
                  var5.u9(var4.o0() + var4.d5() - var5.d5());
               } else {
                  var5.u9(var4.o0());
               }
            case 5:
            default:
               break;
            case 6:
               if (var4.e2().n5() < 0.0) {
                  var5.u9(var4.o0() + var4.d5() + var2);
               } else {
                  var5.u9(var4.o0() - var5.d5() - var2);
               }
         }

         var5.a6(var4.b3() + var4.d2() / 2.0F - var5.d2() / 2.0F);
         var5.t1();
      }
   }

   private float h0() {
      return this.e2().u9().getGapWidth() / 100.0F;
   }

   protected final float u3() {
      return com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)
         ? com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, m3o.class).w1()
         : com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, a0k.class).a5();
   }
}
