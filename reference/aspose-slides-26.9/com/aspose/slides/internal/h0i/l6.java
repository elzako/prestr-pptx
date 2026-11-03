package com.aspose.slides.internal.h0i;

import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.j7.s7;
import com.aspose.slides.internal.k2s.a6;
import com.aspose.slides.internal.k2s.h0;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.w9s.u3;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.t9;

public class l6 extends h0 {
   private final u3 n5;
   private final a0 l6;
   private final s7 k5;

   public l6(u3 var1, com.aspose.slides.internal.p1s.l6 var2, s7 var3, a6 var4, a0 var5) {
      super(var2, var4);
      this.n5 = var1;
      this.l6 = var5;
      this.k5 = var3;
   }

   @Override
   public float n5(t2 var1, char var2, float var3, float var4, float var5, f2 var6) {
      y4 var7 = this.k5.n5(this.n5());
      w1 var8 = new w1(var3, var4 - this.n5().t2());
      com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();
      var9.n5(t9.q0(var2), var7, this.n5().l6(), this.n5().c8(), var8.u3(), e5.t2());
      if (q1.n5(var5) > 0.0F) {
         m1 var10 = new m1();
         var10.n5(var5, new w1(var3, var4));
         var9.l6(var10);
      }

      if (this.l6 == null) {
         t2 var11 = var1.n5;
         if (com.aspose.slides.internal.v6g.k5.l6(var11, com.aspose.slides.internal.j7h.k5.class)) {
            com.aspose.slides.internal.f5n.k5.n5(this.n5, var9, var11, var6.a6());
         } else {
            com.aspose.slides.internal.f5n.k5.n5(this.n5, var9, var1, var6.a6());
         }
      } else {
         com.aspose.slides.internal.f5n.k5.n5(this.l6, var9, this.n5, var1, var6.a6());
      }

      return this.n5(var2);
   }
}
