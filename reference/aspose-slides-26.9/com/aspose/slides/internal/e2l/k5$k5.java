package com.aspose.slides.internal.e2l;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.y5s.d2;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;

class k5$k5 implements com.aspose.slides.internal.j3b.h0 {
   private final com.aspose.slides.internal.b9y.n5 n5;
   private final com.aspose.slides.internal.j3b.c8 l6;
   private final com.aspose.slides.internal.j3b.u3 k5 = null;
   private final com.aspose.slides.internal.y5s.h0 u3 = null;
   private final int[] a6 = null;
   private final byte u9 = 0;
   private final int h0 = 0;
   private final int c8 = 0;
   private final boolean t2 = false;
   private final j5 s7 = new j5();

   public k5$k5(com.aspose.slides.internal.b9y.n5 var1, com.aspose.slides.internal.j3b.c8 var2, j5 var3) {
      var3.n5(this.s7);
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(j5 var1) {
      int var2 = var1.a6();
      int var3 = var1.u9();
      int var4 = var2 * var3;
      if (com.aspose.slides.internal.y5s.n5.n5() > 0 && var4 > com.aspose.slides.internal.y5s.n5.n5()) {
         throw new OutOfMemoryException();
      }

      j5 var5 = j5.n5(var1.n3(), this.s7.n3()).n3();
      byte[] var6 = new byte[var4];
      byte[] var7 = null;
      if (var5.a6() > 0 && var5.u9() > 0 && !var5.equals(com.aspose.slides.internal.v6g.k5.n5(var1))) {
         var7 = new byte[var5.a6() * var5.u9()];
      }

      d2 var8 = this.n5.n5(var6, var6.length).n5();
      int var9 = var8.l6;
      if (var6.length == var9 && var8.n5) {
         if (var5.a6() > 0 && var5.u9() > 0) {
            j5 var10 = new j5(var5.h0() - var1.h0(), var5.c8() - var1.c8(), var5.a6(), var5.u9());
            byte[] var11 = com.aspose.slides.internal.y5s.n5.n5(var6, var2, var3, var7, var10.n3(), false);
            var10.n5(var1.l6().u3());
            this.l6.n5(var10.n3(), var11, var10.l6().u3(), new z3(var10.t2(), var10.s7()));
         }
      } else {
         throw new com.aspose.slides.internal.g9t.n5("Found inconsistency in image data. The image data contained has incorrect pixels count.");
      }
   }
}
