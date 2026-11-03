package com.aspose.slides.internal.i8n;

import com.aspose.slides.internal.f4l.f5;
import com.aspose.slides.internal.f4l.o0;
import com.aspose.slides.internal.f4l.s3;
import com.aspose.slides.internal.f4l.z1;
import com.aspose.slides.internal.j9e.t2;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.y5s.t9;

public class k5 {
   public static c8 n5(int var0) {
      return c8.n5(var0);
   }

   public static c8[] n5(int[] var0) {
      c8[] var1 = new c8[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = n5(var0[var2]);
      }

      return var1;
   }

   public static m1 n5(t9 var0) {
      return new m1(var0.n5(), var0.l6(), var0.k5(), var0.u3(), var0.a6(), var0.u9());
   }

   public static n3 n5(s3 var0, boolean var1) {
      return new n3(var0.n5(), var0.a6(), var0.k5(), var0.u3(), (byte)1, var1);
   }

   public static t2 n5(o0 var0) {
      t2 var1 = new t2();
      var1.n5(var0.n5(), c8.n5(var0.l6()), var0.n5() == 4);
      return var1;
   }

   public static e5 n5(f5 var0) {
      e5 var1 = l6(var0) ? e5.t2() : new e5();
      var1.n5(var0.n5(), var0.l6());
      if (var0.x8().n5() != null) {
         var1.n5(var0.k5(), var0.x8().n5());
      }

      var1.u3(var0.u3());
      var1.l6(var0.c8());
      var1.n5(n5(var0.x8().l6()));
      var1.n5(var0.s7());
      var1.k5((int)var0.n3());
      var1.a6(var0.e2());
      return var1;
   }

   private static boolean l6(f5 var0) {
      e5 var1 = e5.t2();
      return var0.n3() == var1.k5()
         && var0.s7() == var1.n5()
         && var0.c8() == var1.l6()
         && var0.a6() == var1.u9()
         && var0.l6() == var1.h0()
         && var0.u3() == var1.u3()
         && var0.e2() == var1.a6();
   }

   private static com.aspose.slides.internal.o9b.u9[] n5(z1[] var0) {
      if (var0 == null) {
         return new com.aspose.slides.internal.o9b.u9[0];
      }

      com.aspose.slides.internal.o9b.u9[] var1 = new com.aspose.slides.internal.o9b.u9[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new com.aspose.slides.internal.o9b.u9(var0[var2].n5(), var0[var2].l6());
      }

      return var1;
   }
}
