package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

final class i7 implements c1m, l8k, IDisposable {
   private final y7 n5;
   private final h3m l6;
   private com.aspose.slides.internal.w0.t4 k5 = new com.aspose.slides.internal.w0.t4();
   private boolean u3 = true;
   private final j8h a6;

   public static i7 n5(Shape var0, e9 var1, FilterEffect var2) {
      q2i var3 = new q2i(var0, var1);
      return new i7(var1.n5(var0), var2, var3);
   }

   public static i7 n5(Paragraph var0, Shape var1, e9 var2, FilterEffect var3) {
      d5g var4 = new d5g(var0, var2);
      return new i7(new g7u(var0, var1), var3, var4);
   }

   private i7(j8h var1, FilterEffect var2, h3m var3) {
      this.l6 = var3;
      this.a6 = var1;
      this.a6.l6.l6(new i7$1(this));
      this.n5(this.a6.n5().u3());
      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.a6.l6().n5), 14) + 2,
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.a6.l6().l6), 14) + 2
      );
      m0s var5 = null;
      if (var2.getType() == 1) {
         boolean var6 = var2.getReveal() == 1;
         switch (var2.getSubtype()) {
            case 11:
            case 12:
               var5 = new j9y(var4.u3(), true, var2.getSubtype() == 12 ? 0 : 1, var6);
               break;
            case 13:
            case 14:
            default:
               throw new NotImplementedException();
            case 15:
            case 16:
               var5 = new j9y(var4.u3(), false, var2.getSubtype() == 16 ? 0 : 1, var6);
         }
      } else if (var2.getType() == 18) {
         double var7 = 0.0;
         switch (var2.getSubtype()) {
            case 2:
               var7 = -Math.PI / 2;
               break;
            case 17:
               var7 = Math.PI;
               break;
            case 23:
               var7 = Math.PI / 2;
         }

         var5 = new x3q(var4.u3(), var7, var2.getReveal() == 1);
      } else {
         if (var2.getType() != 17) {
            throw new NotImplementedException();
         }

         var5 = new WheelEffect(var4.u3(), 0);
         this.u3 = false;
      }

      this.n5 = new y7(var4.u3(), var5);
   }

   @Override
   public final void dispose() {
      this.a6.l6.n5(new i7$2(this));
      if (com.aspose.slides.internal.v6g.k5.l6(this.a6, k9k.class)) {
         ((k9k)this.a6).u3();
      }

      this.n5.dispose();
   }

   @Override
   public final void n5(float var1) {
      this.n5.n5(this.u3 ? 1.0F - var1 : var1);
      this.l6.n5(this);
   }

   @Override
   public final void n5() {
   }

   @Override
   public final void n5(r1c var1) {
      this.n5.n5(this.k5.n5(), var1.y1());
   }

   private void n5(j8h var1) {
      this.n5(var1.n5().u3());
   }

   private void n5(d2k var1) {
      this.k5 = new com.aspose.slides.internal.w0.t4(com.aspose.slides.internal.v6g.k5.u3(var1.n5, 13), com.aspose.slides.internal.v6g.k5.u3(var1.l6, 13));
      this.k5.k5--;
      this.k5.u3--;
   }

   // $VF: synthetic method
   static void n5(i7 var0, j8h var1) {
      var0.n5(var1);
   }
}
