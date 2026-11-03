package com.aspose.slides.internal.h0i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.f7k.u9;
import com.aspose.slides.internal.k2s.a6;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.w9s.u3;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;

public class n5 extends com.aspose.slides.internal.k2s.k5 {
   private final n3 n5;
   private final u3 l6;
   private final a0 k5;

   public n5(u3 var1, com.aspose.slides.internal.k2s.l6 var2, a6 var3, a0 var4) {
      super(var2, var3);
      this.n5 = var1.a6();
      this.l6 = var1;
      this.k5 = var4;
   }

   @Override
   public float n5(t2 var1, char var2, float var3, float var4, float var5, f2 var6) {
      u9 var7 = this.l6(var2);
      this.n5(var1, var7, var3, var4, var5, this.n5(), var6.a6());
      return this.n5(var2);
   }

   private void n5(t2 var1, u9 var2, float var3, float var4, float var5, float var6, f2 var7) {
      float var8 = n3.k5();
      var6 *= var8;
      m1 var9 = new m1();
      var9.n5(var6, -var6, 1);
      var9.n5(var5, 1);
      var9.l6(var3, var4, 1);
      List var10 = var2.n5(this.n5, var7.a6());
      s7 var11 = com.aspose.slides.internal.w9s.n5.n5(var10);
      var11.l6(var9);
      if (this.k5 == null) {
         t2 var12 = var1.n5;
         if (com.aspose.slides.internal.v6g.k5.l6(var12, com.aspose.slides.internal.j7h.k5.class)) {
            com.aspose.slides.internal.f5n.k5.n5(this.l6, var11, var12, var7.a6());
         } else {
            com.aspose.slides.internal.f5n.k5.n5(this.l6, var11, var1, var7.a6());
         }
      } else {
         com.aspose.slides.internal.f5n.k5.n5(this.k5, var11, this.l6, var1, var7.a6());
      }
   }
}
