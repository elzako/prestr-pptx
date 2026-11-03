package com.aspose.slides.internal.i1k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.c8;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.d1;

public class k5 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5, com.aspose.slides.internal.z9u.n5 {
   public k5() {
      this.u9 = "line";
   }

   public final com.aspose.slides.internal.b3z.a6 a0() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x1"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y1"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x2"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y2"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      s7 var3 = com.aspose.slides.internal.w9s.n5.n5(this.l6(var1, var2.a6()));
      return var3.s7();
   }

   @Override
   public final List<c8> l6(n3 var1, f2 var2) {
      float var3 = var1.n5(this.a0(), "x1", this, var2.a6()) * n3.k5();
      float var4 = var1.n5(this.d2(), "y1", this, var2.a6()) * n3.k5();
      float var5 = var1.n5(this.d5(), "x2", this, var2.a6()) * n3.k5();
      float var6 = var1.n5(this.s3(), "y2", this, var2.a6()) * n3.k5();
      String var7 = d1.n5(
         "M {0} {1} L {2} {3}",new Object[]{
         com.aspose.slides.internal.b3z.c8.n5(var3),
         com.aspose.slides.internal.b3z.c8.n5(var4),
         com.aspose.slides.internal.b3z.c8.n5(var5),
         com.aspose.slides.internal.b3z.c8.n5(var6)
      });
      return t2.n5(var7, var1);
   }
}
