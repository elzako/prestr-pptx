package com.aspose.slides.internal.d3v;

import com.aspose.slides.internal.f9d.n3;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.z6;

public class a6 extends l6 {
   private a6$n5 u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private l6$q0 n3;

   public a6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final void l6(int var1) {
      this.c8 = var1;
   }

   public final void k5(int var1) {
      this.t2 = var1;
   }

   public final void u3(int var1) {
      this.s7 = var1;
   }

   public final void a6(int var1) {
      this.x8 = var1;
   }

   @Override
   public void n5(int[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3) {
      if (this.n3 == null) {
         this.n3 = n5(this.c8(), this.u9(), this.h0(), this.s7());
         n3 var4 = new n3(var3, this.c8);
         var4.n3();
         this.u9 = new a6$n5(var4, this.h0(), this.s7());
      }

      this.n3.n5(var1, this.u9);
   }

   @Override
   public void n5(byte[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3, z6 var4) {
      if (this.n3 == null) {
         this.n3 = n5(this.c8(), this.u9(), this.h0(), this.s7(), var4);
         n3 var5 = new n3(var3, this.c8);
         var5.n3();
         this.u9 = new a6$n5(var5, this.h0(), this.s7());
      }

      this.n3.n5(var1, this.u9);
   }
}
