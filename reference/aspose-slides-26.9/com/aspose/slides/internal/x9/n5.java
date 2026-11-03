package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;

public abstract class n5 extends y1 {
   public n5(com.aspose.slides.internal.v4.n5 var1) {
      super(var1);
   }

   private com.aspose.slides.internal.d2.x8 d2() {
      com.aspose.slides.internal.v4.n5 var1 = (com.aspose.slides.internal.v4.n5)this.k5;
      com.aspose.slides.internal.o9b.p8 var2 = new com.aspose.slides.internal.o9b.p8(var1.a5(), var1.h2());
      int var3 = var1.d2();
      z3 var4 = new z3(var1, this, var2.u3());
      com.aspose.slides.internal.o9b.y1 var5 = var4.l6().y4();
      com.aspose.slides.internal.h2.t2 var6 = var1.e5();
      this.n5(var6);
      int var7 = var6.n5(0, false, this);
      var7 += var6.n5(0, false);
      var5.u3(var5.n3() + var7);
      if (var3 != -1 && (var3 & 1) != 0) {
         int var12 = var6.n5(3, false, this);
         var12 += var6.n5(3, false);
         var5.k5(var5.x8() + var12);
      } else {
         int var8 = var6.n5(2, false, this);
         var8 += var6.n5(2, false);
         var5.k5(var5.x8() + var8);
      }

      com.aspose.slides.internal.a0.l6 var14 = this.y1();
      p6.n5(var14, var1.y1());
      this.n5(var14);
      com.aspose.slides.internal.d2.x8 var9 = new com.aspose.slides.internal.d2.x8(var14, var3);
      p6.n5(var9, var1.u6());
      p6.n5(var9, var1.y1());
      var9.l6(var4.k5().l6());
      var9.k5(var4.k5().k5());
      var9.n5(var5.y4());
      var9.l6(var4.u3());
      var9.t9(0);
      p6.n5(var9, var6, false, false, false, false, this);
      p6.l6(var9, var6, false, false, false, false, this);
      p6.n5(var9, var6, this);
      return var9;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      com.aspose.slides.internal.d2.x8 var3 = this.d2();
      this.n5(var3);
      return super.n5(var1, var2);
   }

   @Override
   protected k5 n5(t1 var1) {
      com.aspose.slides.internal.v4.n5 var2 = (com.aspose.slides.internal.v4.n5)this.k5;
      return new k5(this.l6(var1).a6(), var2.b3(), var2.o0(), var2.z7(), var2.v4(), var1.j5());
   }

   protected abstract com.aspose.slides.internal.a0.l6 y1();

   @Override
   public int n5(int var1, com.aspose.slides.internal.e5.t9 var2) {
      switch (var1) {
         case 7:
            return ((com.aspose.slides.internal.v4.n5)var2).a5();
         case 8:
            return ((com.aspose.slides.internal.v4.n5)var2).h2();
         case 12:
            return this.l6((t1)null).e_();
         default:
            return super.n5(var1, var2);
      }
   }
}
