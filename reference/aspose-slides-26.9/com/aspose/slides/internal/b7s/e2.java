package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public abstract class e2 implements com.aspose.slides.internal.b8u.n3, com.aspose.slides.internal.b8u.t9, com.aspose.slides.internal.b8u.x8 {
   protected com.aspose.slides.internal.b8u.t9 n5;
   protected com.aspose.slides.internal.r1x.v4 l6;

   public static e2 n5(com.aspose.slides.internal.b8u.t9 var0, com.aspose.slides.internal.g7e.n5 var1) {
      int var2 = var1.z1() == 4 && var1.n3() != null ? 1 : var1.z1();
      e2 var3;
      switch (var2) {
         case 0:
            var3 = new com.aspose.slides.internal.a2p.l6(var0);
            break;
         case 1:
            var3 = new com.aspose.slides.internal.a2p.u3(var0);
            break;
         case 2:
            n5(var1);
            com.aspose.slides.internal.z0k.t4 var4 = var1.m1() != null ? com.aspose.slides.internal.r1x.h2.n5(var1.m1().n5(), true) : null;
            com.aspose.slides.internal.z0k.t4 var5 = var1.k7() != null ? com.aspose.slides.internal.r1x.h2.n5(var1.k7().n5(), true) : null;
            var3 = new com.aspose.slides.internal.a2p.n5(var0, var4, var5);
            break;
         case 3:
            n5(var1);
            com.aspose.slides.internal.z0k.t4 var6 = var1.m1() != null ? com.aspose.slides.internal.r1x.h2.n5(var1.m1().n5(), true) : null;
            com.aspose.slides.internal.z0k.t4 var7 = var1.k7() != null ? com.aspose.slides.internal.r1x.h2.n5(var1.k7().n5(), true) : null;
            var3 = new com.aspose.slides.internal.a2p.a6(var0, var6, var7);
            break;
         case 4:
            var3 = new com.aspose.slides.internal.a2p.k5(var0);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      return var3;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      byte[] var5 = this.n5(var2);
      this.n5.n5(var1.n3(), var5, var3.k5(), var4.k5());
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      this.n5.n5(var1.n3(), var2, var3.k5(), var4.k5());
   }

   @Override
   public final long n5(long var1) {
      byte var3 = 3;
      return var1 * (3 + this.l6.z3());
   }

   protected abstract byte[] n5(int[] var1);

   private static void n5(com.aspose.slides.internal.g7e.n5 var0) {
      if (var0.m1() == null) {
         var0.n5(com.aspose.slides.internal.r1x.k7.l6());
      }

      if (var0.k7() == null) {
         var0.l6(com.aspose.slides.internal.r1x.k7.n5());
      }
   }
}
