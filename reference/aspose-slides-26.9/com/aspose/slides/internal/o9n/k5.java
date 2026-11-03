package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.o0;

public class k5 extends com.aspose.slides.internal.u2w.l6 {
   private final d2 u9;
   private byte[] h0;

   public k5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, d2 var4) {
      super(var1, var2, var3);
      this.u9 = var4;
   }

   public final byte[] x8() {
      return this.h0;
   }

   public final void n5(byte[] var1) {
      this.h0 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.v6s.u3 var1, y2 var2, com.aspose.slides.internal.b8u.x8 var3) {
      com.aspose.slides.internal.b8u.e2 var4 = this.n5 ? new k5$l6(this, var1, var3, this.h0) : new k5$n5(this, var1, var3, this.h0);
      o0.n5(var2.n3(), var4);
   }

   // $VF: synthetic method
   static long[] n5(k5 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static long[] l6(k5 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static d2 k5(k5 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static long[] u3(k5 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static int a6(k5 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int u9(k5 var0) {
      return var0.k5;
   }
}
