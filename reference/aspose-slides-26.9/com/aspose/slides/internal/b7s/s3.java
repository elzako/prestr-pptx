package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.r1x.i9;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.y4u.s9;

public class s3 implements com.aspose.slides.internal.b8u.e2 {
   private final com.aspose.slides.internal.l3e.u9 n5;
   private final com.aspose.slides.internal.b8u.t9 l6;
   private final com.aspose.slides.internal.r1x.m1 k5;
   private final com.aspose.slides.internal.r1x.z6 u3;
   private final boolean a6;
   private Object u9;

   public s3(
      com.aspose.slides.internal.l3e.u9 var1,
      com.aspose.slides.internal.b8u.t9 var2,
      com.aspose.slides.internal.r1x.z6 var3,
      com.aspose.slides.internal.r1x.m1 var4,
      com.aspose.slides.internal.r1x.d2 var5
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var4;
      if (var3 == null) {
         this.u3 = this.n5.h0();
         this.a6 = false;
      } else {
         this.u3 = var3;
         this.a6 = this.n5.h0().n5().t4() != var3.n5().t4();
      }

      if (var5 != null) {
         this.n5(var5);
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1) {
      if (com.aspose.slides.internal.r1x.a6.n5() > 0) {
         int var2 = var1.t2() * var1.l6() * com.aspose.slides.internal.v6g.k5.n5(9);
         if (var2 > com.aspose.slides.internal.r1x.a6.n5()) {
            throw new OutOfMemoryException();
         }
      }

      this.n5.c8().n3().h0();
      this.n5.n5(this.n5.c8().n3(), var1.n3());
      this.n5(this.n5.n5(), var1.n3(), var1.n3());
   }

   private void n5(byte[][] var1, com.aspose.slides.internal.o9b.y2 var2, com.aspose.slides.internal.o9b.y2 var3) {
      com.aspose.slides.internal.o9b.y2 var4 = var2.n3();
      var4.k5(-var3.s7(), -var3.x8());
      x8 var5 = this.n5(var2.n3(), var3.n3());
      byte[] var6 = var5.n5(var1, var4.n3());
      this.l6.n5(var2.n3(), var6, var2.a6().k5(), new com.aspose.slides.internal.o9b.j5(var2.u9(), var2.n5()));
   }

   private x8 n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.o9b.y2 var2) {
      com.aspose.slides.internal.o9b.y2 var3 = var1.n3();
      var3.k5(-var2.s7(), -var2.x8());
      com.aspose.slides.internal.r1x.v4 var4 = this.n5.h0().n5();
      com.aspose.slides.internal.r1x.v4 var5 = this.u3.n5();
      int[] var6 = new int[var4.z3()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = 8;
      }

      var4 = new com.aspose.slides.internal.r1x.v4(var6, var4.t4(), var4.k7());
      int var28 = var1.t2();
      int var8 = var1.t2() * var1.l6() * var5.z3();
      byte[] var9 = new byte[var8];
      if (!this.a6) {
         com.aspose.slides.internal.y4u.e2 var31 = new com.aspose.slides.internal.y4u.e2();
         var31.n5(var2.t2(), var2.l6(), var2.t2() * var4.z3(), null, var4, var3.n3(), null, var5, var3.t2() * var5.z3(), 0, null, null, 0, this.u9);
         return new x8(var31, var5.z3(), var2.t2());
      }

      if (var4.t4() == 4) {
         com.aspose.slides.internal.z0k.t4 var30 = this.k5.l6() != null && !this.k5.k5() ? this.k5.l6().n5() : com.aspose.slides.internal.r1x.k7.n5().n5();
         com.aspose.slides.internal.z0k.t4 var32 = this.k5.n5() != null && !this.k5.k5() ? this.k5.n5().n5() : com.aspose.slides.internal.r1x.k7.l6().n5();
         v3 var33 = new v3(var30);
         v3 var34 = new v3(var32);

         try {
            com.aspose.slides.internal.y4u.h0 var35 = new com.aspose.slides.internal.y4u.h0();
            var35.n5(var2.t2(), var2.l6(), var2.t2() * var4.z3(), null, var4, var3.n3(), null, var5, var3.t2() * var5.z3(), 0, null, null, 0, this.u9);
            var35.n5(var33, var34, false, false);
            return new x8(var35, var5.z3(), var2.t2());
         } finally {
            i9 var18 = (i9)i9.n5();
            var18.n5(var33);
            var18.n5(var34);
         }
      } else {
         if (var4.t4() != 5) {
            com.aspose.slides.internal.y4u.s7 var29 = com.aspose.slides.internal.y4u.x8.n5(
               var2.t2(), var2.l6(), var4.z3() * var2.t2(), null, var4, var3.n3(), this.u3.l6(), var5, var3.t2() * var5.z3(), 0, null, null, 0, this.u9
            );
            return new x8(var29, var5.z3(), var2.t2());
         }

         com.aspose.slides.internal.z0k.t4 var10 = this.k5.l6() != null && !this.k5.k5() ? this.k5.l6().n5() : com.aspose.slides.internal.r1x.k7.n5().n5();
         com.aspose.slides.internal.z0k.t4 var11 = this.k5.n5() != null && !this.k5.k5() ? this.k5.n5().n5() : com.aspose.slides.internal.r1x.k7.l6().n5();
         v3 var12 = new v3(var10);
         v3 var13 = new v3(var11);

         try {
            s9 var14 = new s9();
            var14.n5(var2.t2(), var2.l6(), var2.t2() * var4.z3(), null, var4, var3.n3(), null, var5, var3.t2() * var5.z3(), 0, null, null, 0, this.u9);
            var14.n5(var12, var13, false, false);
            return new x8(var14, var5.z3(), var2.t2());
         } finally {
            i9 var20 = (i9)i9.n5();
            var20.n5(var12);
            var20.n5(var13);
         }
      }
   }

   private void n5(com.aspose.slides.internal.r1x.d2 var1) {
      this.u9 = var1.u3();
   }
}
