package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class f4a extends e8y {
   f4a(p7m var1, g3y var2) {
      super(var1, var2);
      List$Enumerator var3 = this.e2().c8().iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            y3t var5 = new y3t(var4);
            this.l6.addItem(var5);
            this.n5(var5);
            if (!var5.e2().c8() && var4.t9() != null && var4.t9().y4()) {
               t3h var6 = new t3h(var5);
               var5.l6(var6);
               this.k5.addItem(var6);
               this.n5(var6);
               if (var4.t9().l6().getDataLabelFormat().getShowLeaderLines() || var2.u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                  a6y var7 = new a6y(var4);
                  this.u3.addItem(var7);
                  this.n5(var7);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         this.l6.get_Item(var2).n3(var1);
      }

      List$Enumerator var12 = this.k5.iterator();

      try {
         while (var12.hasNext()) {
            q8o var3 = (q8o)var12.next();
            var3.n3(var3.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      List$Enumerator var13 = this.u3.iterator();

      try {
         while (var13.hasNext()) {
            a6y var4 = (a6y)var13.next();
            var4.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      double var2 = this.d2() / 2.0F;
      double var4 = this.d5() / 2.0F;
      double var6 = this.d2() / 2.0F;
      double var8 = (Math.PI * 2) / this.l6.size();
      double var10 = Math.PI / 2;

      for (int var12 = 0; var12 < this.l6.size(); var12++) {
         ValueAxisBase var13 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class);
         if (var13.n5().c8().isLogarithmic()) {
            com.aspose.slides.ms.System.q1.n5((double)(var13.h2()), (double)(var13.n5().c8().getLogBase()));
         } else {
            var13.h2();
         }

         if (var13.n5().c8().isLogarithmic()) {
            com.aspose.slides.ms.System.q1.n5((double)(var13.v0()), (double)(var13.n5().c8().getLogBase()));
         } else {
            var13.v0();
         }

         float var18 = this.t9().l6.d5() - this.t9().l6.n5(this.l6.get_Item(var12).n3());
         double var19 = var2 + var18 * com.aspose.slides.ms.System.q1.c8(var10);
         double var21 = var4 - var18 * com.aspose.slides.ms.System.q1.h0(var10);
         this.l6.get_Item(var12).a6((float)var19 - this.l6.get_Item(var12).d2() / 2.0F);
         this.l6.get_Item(var12).u9((float)var21 - this.l6.get_Item(var12).d5() / 2.0F);
         if (this.l6.get_Item(var12).s7() != null) {
            q8o var23 = this.l6.get_Item(var12).s7();
            double var24 = var2 + (var18 + var6 * 0.2) * com.aspose.slides.ms.System.q1.c8(var10);
            double var26 = var4 - (var18 + var6 * 0.2) * com.aspose.slides.ms.System.q1.h0(var10);
            var23.a6((float)var24 - var23.d2() / 2.0F);
            var23.u9((float)var26 - var23.d5() / 2.0F);
            a9v var28 = (a9v)var1;
            com.aspose.slides.internal.o9b.y1 var29 = new com.aspose.slides.internal.o9b.y1(-var28.u3(), -var28.a6(), this.y2().d2(), this.y2().d5());
            com.aspose.slides.internal.o9b.w1 var30 = var23.l6(new com.aspose.slides.internal.o9b.w1(var23.b3(), var23.o0()), var29.y4()).u3();
            var23.a6(var30.l6());
            var23.u9(var30.k5());
            this.l6.get_Item(var12).s7().t1();
         }

         var10 -= var8;
         this.l6.get_Item(var12).t1();
      }

      this.u3();
   }

   private void u3() {
      for (int var1 = 0; var1 < this.u3.size(); var1++) {
         h2v var2 = ((t3h)this.k5.get_Item(var1)).u3();
         q8o var3 = this.k5.get_Item(var1);
         a6y var4 = this.u3.get_Item(var1);
         com.aspose.slides.internal.o9b.w1 var5 = var2.n5(var3).u3();
         com.aspose.slides.internal.o9b.w1[] var6;
         if (!(var3.p8() > var5.l6()) && !(var3.p8() + var3.d2() < var5.l6())) {
            var6 = var3.z3();
         } else {
            var6 = var3.q0();
         }

         if (!var4.n5(var3.e5().y4(), new com.aspose.slides.internal.o9b.w1[]{var5}, var6)
            || var3.e5().k5(var2.e5().y4())
            || var3.t2() == 0.0F && var3.s7() == 0.0F) {
            var4.n5(false);
         } else {
            var4.n5(true);
         }

         var4.t1();
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
      f9 var2 = new f9(this.e2().t2());
      var2.n5(var1.y4());

      try {
         List var3 = new List();

         for (int var4 = 0; var4 < this.l6.size(); var4++) {
            if (this.l6.get_Item(var4).e2().c8()) {
               if (this.e2().t2().n3().getDisplayBlanksAs() != 0) {
                  continue;
               }

               this.n5(var3);
               var3.clear();
            } else {
               var3.addItem(this.l6.get_Item(var4));
            }

            if (var4 == this.l6.size() - 1 && !this.l6.get_Item(0).e2().c8()) {
               var3.addItem(this.l6.get_Item(0));
            }
         }

         if (var3.size() > 0) {
            if (this.e2().u9().getType() == 72) {
               com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3.size())
               );

               for (int var5 = 0; var5 < var9.length; var5++) {
                  var9[var5] = new com.aspose.slides.internal.o9b.w1(((h2v)var3.get_Item(var5)).p8(), ((h2v)var3.get_Item(var5)).f2());
               }

               com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
               var10.k5(var9);
               this.e2().k5(var10);
               this.e2().n5(var10);
            } else {
               this.n5(var3);
            }
         }
      } finally {
         var2.n5();
      }
   }
}
