package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.b7s.z6;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f5;
import com.aspose.slides.internal.r1x.v3;

class k5$l6 implements com.aspose.slides.internal.b8u.e2, com.aspose.slides.internal.y7w.n5 {
   private final com.aspose.slides.internal.b8u.x8 n5;
   private final com.aspose.slides.internal.v6s.u3 l6;
   private final long[] k5;
   private final byte[] u3;
   private final int a6;
   private final int u9;
   private final int h0;
   private final int c8;
   private final k5 t2;

   public k5$l6(k5 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, byte[] var4) {
      this.l6 = var2;
      this.n5 = var3;
      this.u3 = var4;
      this.k5 = com.aspose.slides.internal.o9n.k5.u3(var1);
      this.u9 = var1.u9();
      this.h0 = com.aspose.slides.internal.o9n.k5.a6(var1);
      this.c8 = com.aspose.slides.internal.o9n.k5.u9(var1);
      this.a6 = var1.c8().y2();
      this.t2 = var1;
   }

   @Override
   public final void n5(y2 var1) {
      com.aspose.slides.internal.y7w.l6 var2 = new com.aspose.slides.internal.y7w.l6(this.u9, this.h0, this.c8, this.n5);
      var2.n5(var1.n3(), this);
   }

   @Override
   public final int[] n5(int var1, int var2, int var3, y2 var4) {
      int var5 = var2 * this.h0;
      int var6 = var3 * this.c8;
      com.aspose.slides.internal.p5w.n5 var7 = new com.aspose.slides.internal.p5w.n5();
      var7.n5(f5.n5(this.a6));
      if (this.u3 != null) {
         y0 var8 = new y0(new com.aspose.slides.internal.z0k.e2(this.u3), true);

         try {
            y0 var9 = new y0(new com.aspose.slides.internal.z0k.e2(this.u3), true);

            try {
               com.aspose.slides.internal.b7s.u3[] var10 = com.aspose.slides.internal.l3e.n5.n5(var8);
               z6[] var11 = com.aspose.slides.internal.l3e.n5.l6(var9);
               var7.n5(var10);
               var7.n5(var11);
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      }

      long var14 = this.k5[var1] & 4294967295L;
      v3 var38 = this.l6.k5(var14);

      try {
         Object var39 = null;
         if (com.aspose.slides.internal.o9n.k5.k5(this.t2) != null) {
            var39 = com.aspose.slides.internal.o9n.k5.k5(this.t2).u3();
         }

         var7.n5(var39);
         com.aspose.slides.internal.l1f.k5 var12 = com.aspose.slides.internal.l1f.n5.k5(var38, var7);

         try {
            var12.u3().n5(this.t2);
            k5$l6$n5 var13 = new k5$l6$n5(new j5(var5, var6), var4.n3(), this.n5);
            var12.u3().l6(var4.n3(), var13);
         } finally {
            if (var12.c8() != null && var12.c8().a6() != null) {
               var12.c8().a6().dispose();
            }

            if (var12.h0() != null && var12.h0().l6() != null) {
               var12.h0().l6().dispose();
            }
         }
      } finally {
         if (var38 != null) {
            var38.dispose();
         }
      }

      return null;
   }
}
