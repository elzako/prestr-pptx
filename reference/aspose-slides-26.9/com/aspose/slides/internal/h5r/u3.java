package com.aspose.slides.internal.h5r;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.b8u.n3;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.h2;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.z0k.t4;

public abstract class u3 implements n3, t9, x8 {
   protected t9 n5;
   protected v4 l6;
   protected byte[] k5 = null;

   public static u3 n5(t9 var0, com.aspose.slides.internal.g7e.n5 var1) {
      int var2 = var1.z1();
      u3 var3;
      switch (var2) {
         case 0:
            var3 = new k5(var0);
            break;
         case 1:
            var3 = new u9(var0);
            break;
         case 2:
            n5(var1);
            t4 var4 = var1.m1() != null ? h2.n5(var1.m1().n5(), true) : null;
            t4 var5 = var1.k7() != null ? h2.n5(var1.k7().n5(), true) : null;
            var3 = new l6(var0, var4, var5);
            break;
         case 3:
            n5(var1);
            t4 var6 = var1.m1() != null ? h2.n5(var1.m1().n5(), true) : null;
            t4 var7 = var1.k7() != null ? h2.n5(var1.k7().n5(), true) : null;
            var3 = new h0(var0, var6, var7);
            break;
         case 4:
            var3 = new a6(var0);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      return var3;
   }

   @Override
   public final void n5(y2 var1, int[] var2, j5 var3, j5 var4) {
      byte[] var5 = this.l6(var2);
      this.n5.n5(var1.n3(), var5, var3.k5(), var4.k5());
   }

   @Override
   public final void n5(y2 var1, byte[] var2, j5 var3, j5 var4) {
      if (this.k5 == null) {
         this.k5 = new byte[var2.length];
         this.n5(var2, this.k5);
      }

      this.n5.n5(var1.n3(), this.k5, var3.k5(), var4.k5());
   }

   @Override
   public final long n5(long var1) {
      byte var3 = 3;
      return var1 * (3 + this.l6.z3());
   }

   protected abstract void n5(byte[] var1, byte[] var2);

   protected abstract byte[] n5(int[] var1);

   protected final byte[] l6(int[] var1) {
      if (this.k5 == null) {
         this.k5 = this.n5(var1);
      }

      return this.k5;
   }

   private static void n5(com.aspose.slides.internal.g7e.n5 var0) {
      if (var0.m1() == null) {
         var0.n5(k7.l6());
      }

      if (var0.k7() == null) {
         var0.l6(k7.n5());
      }
   }

   public void n5(t9 var1) {
      this.n5 = var1;
   }

   public void n5() {
      this.k5 = null;
   }
}
