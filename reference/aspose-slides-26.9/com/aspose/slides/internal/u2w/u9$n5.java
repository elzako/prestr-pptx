package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.q0;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.ms.System.IDisposable;

public class u9$n5 extends q0 implements x8 {
   private final u9$l6 n5;
   private k5 l6;

   public u9$n5(com.aspose.slides.internal.f2i.n5 var1, long var2, com.aspose.slides.internal.v6s.a6 var4, int var5, int var6) {
      this.l6 = com.aspose.slides.internal.c4z.n5.n5(var1, var5, var6);
      long var7 = var1.d2();
      this.n5 = u9$l6.n5(var1, var4, var2, this.l6.h0() & 4294967295L, var7, this.l6.c8().r4() == 2);
   }

   public long[] n5() {
      return this.n5.n5();
   }

   public long[] l6() {
      return this.n5.l6();
   }

   public final u9$l6 k5() {
      return this.n5;
   }

   @Override
   public final void n5(y2 var1, int[] var2, j5 var3, j5 var4) {
      try {
         this.l6.n5(var2, var1.n3(), this.n5);
      } catch (OutOfMemoryError var6) {
         throw new com.aspose.slides.internal.z3b.k5("Fatal error", var6);
      }
   }

   public final void n5(y2 var1, byte[] var2, z6 var3, j5 var4, j5 var5) {
      try {
         this.l6.n5(var2, var1.n3(), this.n5, var3);
      } catch (OutOfMemoryError var7) {
         throw new com.aspose.slides.internal.z3b.k5("Fatal error", var7);
      }
   }

   @Override
   protected void a6() {
      IDisposable var1 = com.aspose.slides.internal.v6g.k5.n5(this.l6, IDisposable.class);
      if (var1 != null) {
         var1.dispose();
         this.l6 = null;
      }

      super.a6();
   }
}
