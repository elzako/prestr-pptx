package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public final class m1 extends o0 {
   private r4 a6 = new r4();
   private v3 u9 = new v3();

   public m1(k7 var1, b3 var2, w1 var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public m1(k7 var1, b3 var2, List<w1> var3, int var4) {
      super(var1, var2, var3, var4);
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

      v3 var19 = new v3(0.0F);
      List$Enumerator var7 = this.k5.iterator();

      try {
         while (var7.hasNext()) {
            w1 var8 = (w1)var7.next();
            v3 var9 = v3.n5(var8.k5()).h0();
            float var10 = w2.l6(v3.k5(var1.l6.h0(), var9.h0()));
            if (var10 > 0.0F) {
               v3.n5(var4, v3.n5(var8.l6(), var10)).l6(var4);
               w2.n5(var4.h0()).l6(var4);
               v3 var11 = v3.l6(v3.n5(2.0F * var10, var1.l6), var9).u9().h0();
               v3.n5(var19, v3.n5(var8.u3(), (float)q1.a6(w2.l6(v3.k5(var11.h0(), var1.u3.h0())), var8.a6()))).l6(var19);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return g7.n5(g7.l6(var2, var4), var19).u9();
   }

   @Override
   protected void n5() {
      r4.n5(r4.n5(this.l6.k5(), this.l6.n5()), this.l6.l6()).n5(this.a6);
      this.l6.n5().u3().l6().l6(this.u9);
   }
}
