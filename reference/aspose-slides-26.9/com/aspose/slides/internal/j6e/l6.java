package com.aspose.slides.internal.j6e;

import com.aspose.slides.internal.d3v.l6$q0;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.z6;

public class l6 extends com.aspose.slides.internal.d3v.l6 {
   private final boolean u9;
   private l6$n5 h0;
   private int c8;
   private int t2;
   private int s7;
   private l6$q0 x8;
   private int n3 = 6;

   public l6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3);
      this.u9 = var4;
   }

   public final void n5(int var1) {
      this.c8 = var1;
   }

   public final void l6(int var1) {
      this.t2 = var1;
   }

   public final void k5(int var1) {
      this.s7 = var1;
   }

   @Override
   public void n5(int[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3) {
      if (this.x8 == null) {
         int var4 = this.s7();
         this.x8 = com.aspose.slides.internal.d3v.l6.n5(this.c8(), this.u9(), this.h0(), var4);
         l6$l6 var5 = new l6$l6(var4, var3, this.n3, this.u9);
         var5.n5();
         this.h0 = new l6$n5(var5, this.h0(), var4);
      }

      this.x8.n5(var1, this.h0);
   }

   @Override
   public void n5(byte[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3, z6 var4) {
      if (this.x8 == null) {
         int var5 = this.s7();
         this.x8 = n5(this.c8(), this.u9(), this.h0(), this.s7(), var4);
         l6$l6 var6 = new l6$l6(var5, var3, this.n3, this.u9);
         var6.n5();
         this.h0 = new l6$n5(var6, this.h0(), this.s7());
      }

      this.x8.n5(var1, this.h0);
   }
}
