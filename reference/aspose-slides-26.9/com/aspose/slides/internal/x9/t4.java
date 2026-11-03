package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.f0;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v4;
import com.aspose.slides.internal.p3.w2;

public class t4 extends w1 {
   private com.aspose.slides.internal.v4.n3 t2;
   private w1 s7;
   private com.aspose.slides.internal.p3.j5 x8;
   private com.aspose.slides.internal.p3.i1 n3;

   public t4(com.aspose.slides.internal.v4.n3 var1) {
      super(var1);
      this.t2 = var1;
   }

   @Override
   public void t4() {
      this.s7 = new k7(this.t2.e5());
      this.x8 = new com.aspose.slides.internal.p3.j5(this.t2.b3());
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.s7.n5(this);
      this.s7.t4();
      this.x8.n5(this);
      this.x8.t4();
      List var3 = new List();

      while (!this.s7.m3()) {
         List var4 = this.s7.n5(var1, var2);
         if (var4 != null) {
            var3.addRange(var4);
         }
      }

      if (var3.size() == 0) {
         com.aspose.slides.internal.p3.d5 var8 = new com.aspose.slides.internal.p3.d5();
         this.n3 = new c4(0, null, null, true);
         var8.addItem(this.n3);
         var3.addItem(var8);
      }

      this.k5(true);
      this.k5(var3);
      com.aspose.slides.internal.r4.u3 var9 = new com.aspose.slides.internal.r4.u3(var3);
      com.aspose.slides.internal.r4.u3 var5 = null;
      List var6 = null;
      com.aspose.slides.internal.p3.i1 var7 = null;

      while (var9.l6()) {
         var6 = ((com.aspose.slides.internal.r4.u9)var9.k5()).l6();
         var5 = new com.aspose.slides.internal.r4.u3(var6);

         while (var5.l6()) {
            var7 = (com.aspose.slides.internal.p3.i1)var5.k5();
            var7.n5(this.n5(new f0(this, var7.k7())));
         }
      }

      return var3;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      List var4 = super.n5(var1, var2, var3);
      this.k5(var4);
      return var4;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      List var3 = new List();

      while (var1.l6()) {
         j8 var4 = (j8)var1.k5();
         if (var4 != null && var4.k5() != null) {
            var3.addItem(var4.k5());
         }
      }

      this.s7.n5(this.h0());
      t1 var5 = new t1(var2);
      w2 var6 = new w2(new com.aspose.slides.internal.r4.u3(var3));

      com.aspose.slides.internal.p3.y2 var7;
      while ((var7 = var6.u9()) != null) {
         var7.n5(var6, var5);
         var5.n5(var5.e2());
         var5.n5(256, true);
      }
   }

   private void k5(List<com.aspose.slides.internal.r4.u9> var1) {
      c4 var2 = null;
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1, var1.size());

      while (var3.u3() && var2 == null) {
         com.aspose.slides.internal.r4.u9 var4 = (com.aspose.slides.internal.r4.u9)var3.a6();
         if (var4.k5()) {
            com.aspose.slides.internal.p3.i1 var8 = (com.aspose.slides.internal.p3.i1)var4.n5();
            if (com.aspose.slides.internal.v6g.k5.l6(var8, c4.class)) {
               var2 = (c4)var8;
            }
         } else {
            v4 var5 = var4.l6();
            com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3<>(var5, var5.size());

            while (var6.u3() && var2 == null) {
               com.aspose.slides.internal.p3.i1 var7 = (com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var6.a6()).n5();
               if (com.aspose.slides.internal.v6g.k5.l6(var7, c4.class) && !var7.t9() || var7 == this.n3) {
                  var2 = (c4)var7;
               }
            }
         }
      }

      if (var2 != null) {
         var2.n5(this.x8);
      }
   }
}
