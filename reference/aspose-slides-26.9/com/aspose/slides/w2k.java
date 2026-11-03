package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.ms.System.IDisposable;

final class w2k extends e8s {
   public final w1g n5 = new w1g();
   private k8l<g6h> l6;
   private k8l<g6h> k5;
   private k8l<g6h> u3;
   private float a6;
   private float u9;
   private d2k n3 = new d2k();

   public w2k(MathDelimiter var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);
      IGenericEnumerator var4 = var1.getArguments().iterator();

      try {
         while (var4.hasNext()) {
            IMathElement var5 = (IMathElement)var4.next();
            this.n5(var5, var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public final MathDelimiter n5() {
      return (MathDelimiter)super.t2;
   }

   @Override
   public void n5(v1l var1) {
      com.aspose.slides.internal.o9b.u3 var2 = this.n5(var1.l6);
      if (this.l6 != null && this.l6.n5().n5 != 0.0F) {
         c6v var3 = new c6v(var1.n5);

         try {
            var1.n5.n5(0.0F, this.u9);
            this.l6.n5(var1.n5, var2);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }

      ReadOnlyCollection var31 = this.h0;
      if (var31.size() > 1) {
         for (int var4 = 0; var4 < var31.size(); var4++) {
            e8s var5 = (e8s)var31.get_Item(var4);
            d2k var6 = var5.h0().u3();
            c6v var7 = new c6v(var1.n5);

            try {
               if (var4 > 0) {
                  var1.n5.n5(var6.n5 - this.u3.n5().n5, this.a6);
                  this.u3.n5(var1.n5, var2);
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }

            c6v var8 = new c6v(var1.n5);

            try {
               var1.n5.n5(var6.n5, var6.l6);
               var5.n5(var1.n5());
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }
         }
      } else {
         super.n5(var1.n5());
      }

      if (this.k5 != null && this.k5.n5().n5 != 0.0F) {
         c6v var32 = new c6v(var1.n5);

         try {
            var1.n5.n5(this.n3.n5, this.n3.l6);
            this.k5.n5(var1.n5, var2);
         } finally {
            if (var32 != null) {
               var32.dispose();
            }
         }
      }
   }

   @Override
   protected y1m n5(d2k var1) {
      if (this.n5().getArguments().getCount() == 0) {
         return new y1m();
      }

      p1e var2 = this.a6().n5(this.n5.a6);
      if (this.n5().getArguments().getCount() == 1) {
         e8s var15 = this.h0.get_Item(0);
         y1m var16 = var15.u9().n5();
         n3y var18 = var16.l6.l6();
         d2k var21 = new d2k();
         float var23 = var18.n5() * 1.087F;
         if (com.aspose.slides.internal.v6g.k5.l6(var15, t7e.class)) {
            var23 = var18.n5() * (this.n5().getBeginningCharacter() == '(' ? 0.934F : 0.924F);
            IGenericEnumerator var24 = var15.h0.iterator();

            try {
               while (var24.hasNext()) {
                  e8s var27 = (e8s)var24.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var27, g5s.class)
                     && com.aspose.slides.internal.v6g.k5.l6(var27.t2, MathSuperscriptElement.class)
                     && var27.u9().l6.n5() * 1.2F > var16.l6.n5()) {
                     var23 = var18.n5() * 1.1F;
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                  var24.dispose();
               }
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var15, l4i.class)) {
            var23 = var18.n5() * 0.8F;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var15, g5s.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var15.h0.get_Item(1), k3i.class)) {
               var2 = this.a6().n5(var18.n5() * 1.74F);
               var23 = var18.n5() * 0.87F;
            } else if (com.aspose.slides.internal.v6g.k5.l6(var15.h0.get_Item(1), g5s.class)) {
               var23 = var18.n5() * 1.3F;
            }
         }

         if (this.n5.h0 || com.aspose.slides.internal.v6g.k5.l6(var15, d1.class)) {
            var23 = var18.n5() * 1.01F;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var15, k3i.class)) {
            k3i var25 = com.aspose.slides.internal.v6g.k5.n5(var15, k3i.class);
            if (this.a6().h0.n5() && this.n5.l6 <= 0) {
               var23 = (var25.n5().u9().l6.n5() - var25.n5().u9().l6.l6 * 0.9F) * 2.95F;
            } else {
               var23 = var18.n5() * 0.85F;
            }
         }

         if (this.a6().a6 && !com.aspose.slides.internal.v6g.k5.l6(var15, l4i.class)) {
            var23 *= 0.7F;
         }

         d2k[] var26 = new d2k[]{var21};
         y1m var28 = this.n5(var16.n5(), var23, var2, var26).n5();
         var26[0].n5(var21);
         var15.l6(var21.u3());
         return var28;
      } else {
         y1m var3 = this.h0.get_Item(0).u9().n5();
         float[] var4 = new float[this.h0.size()];

         for (int var5 = 1; var5 < this.h0.size(); var5++) {
            e8s var6 = this.h0.get_Item(var5);
            n3y.n5(var3.l6.l6(), var6.u9().l6.l6()).n5(var3.l6);
         }

         this.u3 = this.a6().n5().n5(this.n5().getSeparatorCharacter(), this.n5.a6, var3.l6.n5());
         float var17 = this.u3.n5().n5;
         var3.n5 += var17;

         for (int var19 = 1; var19 < this.h0.size(); var19++) {
            e8s var7 = this.h0.get_Item(var19);
            var4[var19] = var3.n5;
            var3.n5 = var3.n5 + var7.u9().n5;
            if (var19 + 1 < this.h0.size()) {
               var3.n5 += var17;
            }
         }

         d2k var20 = new d2k();
         float var22 = var3.l6.n5();
         d2k[] var8 = new d2k[]{var20};
         y1m var9 = this.n5(var3.n5(), var22, var2, var8).n5();
         var8[0].n5(var20);
         float var10 = this.u3.n5().k5 / 2.0F + var2.t2();
         n3y var11 = new n3y(this.u3.n5().k5 / 2.0F + var2.t2(), this.u3.n5().k5 - var10);
         n3y.n5(var9.l6.l6(), var11.l6()).n5(var9.l6);
         this.a6 = var3.l6.n5 - var11.n5 + var20.l6;

         for (int var29 = 0; var29 < this.h0.size(); var29++) {
            e8s var30 = this.h0.get_Item(var29);
            float var12 = var3.l6.n5 - var30.u9().l6.n5;
            var30.l6(var4[var29] + var20.n5, var12 + var20.l6);
         }

         return var9;
      }
   }

   private y1m n5(y1m var1, float var2, p1e var3, d2k[] var4) {
      n3y var5 = var1.l6.l6();
      this.l6 = this.a6().n5().n5(this.n5().getBeginningCharacter(), this.n5.a6, var2);
      this.k5 = this.a6().n5().n5(this.n5().getEndingCharacter(), this.n5.a6, var2);
      g6h var6 = this.l6.n5().n5();
      g6h var7 = this.k5.n5().n5();
      float var8 = var5.n5 - var3.t2();
      this.u9 = var8 - var6.k5 / 2.0F;
      this.n3.l6 = var8 - var7.k5 / 2.0F;
      this.n3.n5 = var6.n5 + var1.n5;
      y1m var9 = new y1m();
      var5.n5(var9.l6);
      var9.n5 = var6.n5 + var1.n5 + var7.n5;
      float var10 = com.aspose.slides.ms.System.q1.n5((float)(this.u9 + var6.k5), (float)(this.n3.l6 + var7.k5));
      var9.l6.l6 = com.aspose.slides.ms.System.q1.n5((float)(var10), (float)(var5.n5())) - var5.n5;
      float var11 = com.aspose.slides.ms.System.q1.l6(this.u9, this.n3.l6);
      float var12 = com.aspose.slides.ms.System.q1.l6(var11, 0.0F);
      var9.l6.n5 = var5.n5 - var12;
      if (var12 < 0.0F) {
         var4[0] = new d2k(var6.n5, -var12);
         this.u9 -= var12;
         this.n3.l6 -= var12;
      } else {
         var4[0] = new d2k(var6.n5, 0.0F);
      }

      return var9;
   }

   public final float l6() {
      return this.k5.n5().k5;
   }
}
