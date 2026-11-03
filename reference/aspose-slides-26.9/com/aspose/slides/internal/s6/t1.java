package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public final class t1 extends o0 {
   private r4 a6 = new r4();
   private v3 u9 = new v3();
   private float h0;
   private float c8;

   public t1(k7 var1, b3 var2, w1 var3, int var4, float var5, float var6) {
      super(var1, var2, var3, var4);
      this.h0 = var5;
      this.c8 = var6;
   }

   public t1(k7 var1, b3 var2, List<w1> var3, int var4, float var5, float var6) {
      super(var1, var2, var3, var4);
      this.h0 = var5;
      this.c8 = var6;
   }

   @Override
   public o0$k5 n5(o0$l6 var1) {
      o0$k5 var2 = new o0$k5();
      this.a6.k5(var1.n5.h0()).n5(var2.n5);
      this.l6.k5().l6(var1.l6.h0()).l6(var2.l6);
      var1.k5.n5(var2.k5);
      v3 var3 = this.l6.k5().n5(var1.n5.h0()).h0();
      v3.l6(this.u9, var3).u9().l6(var2.u3);
      return var2;
   }

   @Override
   public g7 n5(o0$k5 var1) {
      g7 var2 = new g7();
      g7[] var3 = new g7[]{var2};
      this.n5.getPixel(var1.k5.n5(), var1.k5.l6(), var3);
      var3[0].n5(var2);
      v3 var4 = new v3(0.0F);
      List$Enumerator var5 = this.k5.iterator();

      try {
         while (var5.hasNext()) {
            w1 var6 = (w1)var5.next();
            v3.n5(var4, var6.n5()).l6(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (this.k5.size() > 1) {
         v3.l6(var4, this.k5.size()).l6(var4);
      }

      float var20 = w2.n5(this.h0, this.c8, v3.k5(var1.l6.h0(), new v3(0.0F, 0.0F, 1.0F)));
      v3 var7 = new v3(0.0F);
      List$Enumerator var8 = this.k5.iterator();

      try {
         while (var8.hasNext()) {
            w1 var9 = (w1)var8.next();
            v3 var10 = v3.n5(var9.k5()).h0();
            float var11 = w2.l6(v3.k5(var1.l6.h0(), var10.h0()));
            if (var11 > 0.0F) {
               v3.n5(var4, v3.n5(var9.l6(), var11)).l6(var4);
               w2.n5(var4.h0()).l6(var4);
               v3 var12 = v3.l6(v3.n5(2.0F * var11, var1.l6), var10).u9().h0();
               v3.n5(var7, v3.n5(var9.u3(), (float)q1.a6(w2.l6(v3.k5(var12.h0(), var1.u3.h0())), var9.a6()))).l6(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      g7 var21 = g7.n5(g7.l6(var2, var4), var7).u9();
      var21.u3(var20);
      return var21;
   }

   @Override
   protected void n5() {
      r4.n5(r4.n5(this.l6.k5(), this.l6.n5()), this.l6.l6()).n5(this.a6);
      this.l6.n5().u3().l6().l6(this.u9);
   }
}
