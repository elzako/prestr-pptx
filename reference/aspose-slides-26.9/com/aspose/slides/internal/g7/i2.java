package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public abstract class i2 implements b6 {
   private static final g1 n5 = w5.n5().l6().n5();
   private final x3 l6 = new x3();
   private static final com.aspose.slides.internal.r7c.c8 k5 = new com.aspose.slides.internal.r7c.c8("([A-Z]{6})\\+(.*)");

   public static i2 n5(n2 var0) {
      try {
         a4 var1 = a4.n5(var0.l6());
         i2 var2 = var1.n5(var0);
         com.aspose.slides.internal.z0k.t4 var3 = var0.k5()[0].k5().l6();
         var3.setPosition((int)var0.k5()[0].k5().a6());
         byte[] var4 = new byte[4];
         var3.read(var4, 0, 4);
         if (var0.l6() == 0 && com.aspose.slides.internal.v6g.k5.l6(var2, u0a.class)) {
            u0a var5 = (u0a)var2;
            if (var5.l6().u3() == null) {
               var5.l6().n5(new q4d(var5.l6(), var5));
            }

            if (var5.l6().t4() == null) {
               var5.l6().n5(new y5s(var5.l6(), var5));
            }
         }

         if ("OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var4, 0, 4))) {
            var2 = var2.l6(0);
         }

         return var2;
      } catch (RuntimeException var6) {
         n5.n5(com.aspose.slides.ms.System.d1.n5("Could not create font. \r\nFont definition: \r\n{0}", new Object[]{a8.n5(var0)}), var6);
         throw var6;
      }
   }

   public static i2 n5(int var0, z4 var1) {
      p9 var2 = new p9(var1);
      n2 var3 = new n2(var0, var2);
      return n5(var3);
   }

   public static i2 n5(int var0, i2 var1, x7 var2) {
      if (var0 == 0) {
         return u0a.n5(var1, var2);
      } else {
         throw new x5();
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      b2 var2 = b2.n5(this, var1);
      var2.n5();
   }

   public i2 l6(int var1) {
      if (var1 == 0) {
         u0a var2 = new u0a();
         u0a var3 = (u0a)this;
         var2.u3(var3.u9());
         var2.n5(var3.u3());
         var2.l6(var3.h0());
         Dictionary var4 = new Dictionary();

         for (int var5 = 0; var5 < (var3.l6().a6().n5() & 65535); var5++) {
            k2 var6 = new k2(var5);
            k6 var7 = var3.n5(var6);
            if (var5 < var3.l6().s7().n5().n5()) {
               var7.k5(var3.l6().s7().n5().n5(var5).n5() & 65535);
            }

            int var8 = var3.s7().n5(var6);
            int var9 = var2.n5(var7);
            var2.s7().n5(var9, var8);
            var4.addItem(var9, var5);
         }

         var2.l6().k5().n5(var3.l6().k5().l6());
         var2.l6().k5().n5(var3.l6().k5().k5());
         var2.l6().k5().l6(var3.l6().k5().u3());
         var2.l6().k5().k5(var3.l6().k5().a6());
         var2.l6().k5().u3(var3.l6().k5().u9());
         var2.l6().k5().l6(var3.l6().k5().h0());
         var2.l6().k5().k5(var3.l6().k5().c8());
         var2.l6().k5().n5(var3.l6().k5().n5());
         var2.l6().t2().n5(var3.l6().t2().k5());
         var2.l6().t2().l6(var3.l6().t2().u3());
         var2.l6().t2().k5(var3.l6().t2().a6());
         var2.l6().t2().u3(var3.l6().t2().u9());
         var2.l6().t4().n5(var3.l6().t4().n5());
         var2.l6().t4().n5(var3.l6().t4().l6());
         var2.l6().t4().l6(var3.l6().t4().k5());
         var2.l6().t4().k5(var3.l6().t4().u3());
         var2.l6().t4().l6(var3.l6().t4().a6());
         var2.l6().t4().k5(var3.l6().t4().u9());
         var2.l6().t4().u3(var3.l6().t4().h0());
         var2.l6().t4().a6(var3.l6().t4().c8());
         var2.l6().t4().u9(var3.l6().t4().t2());
         var2.l6().t4().h0(var3.l6().t4().s7());
         var2.l6().t4().c8(var3.l6().t4().x8());
         var2.l6().t4().t2(var3.l6().t4().n3());
         var2.l6().t4().s7(var3.l6().t4().y4());
         var2.l6().t4().x8(var3.l6().t4().e2());
         var2.l6().t4().u3(var3.l6().t4().q0());
         var2.l6().t4().a6(var3.l6().t4().z3());
         var2.l6().t4().u9(var3.l6().t4().m1());
         var2.l6().t4().n3(var3.l6().t4().k7());
         var2.l6().t4().y4(var3.l6().t4().m3());
         var2.l6().t4().e2(var3.l6().t4().z8());
         var2.l6().t4().h0(var3.l6().t4().j5());
         var2.l6().t4().c8(var3.l6().t4().w1());
         var2.l6().t4().t9(var3.l6().t4().r4());
         var2.l6().t4().z1(var3.l6().t4().c4());
         com.aspose.slides.internal.z0k.e2 var10 = new com.aspose.slides.internal.z0k.e2();
         var2.n5(var10);
         byte[] var11 = var10.toArray();
         r5t var12 = new r5t();
         return (u0a)var12.n5(new n2(0, new m3(var11)));
      } else {
         throw new x5();
      }
   }

   public abstract d3 n3();

   @Override
   public r9[] k5(String var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < var1.length(); var3++) {
         int var4 = com.aspose.slides.ms.System.t9.a6(var1.charAt(var3))
            ? com.aspose.slides.ms.System.t9.n5(var1.charAt(var3), var1.charAt(var3 + 1))
            : var1.charAt(var3);
         var2.addItem(this.s7().n5(var4));
      }

      return (r9[])var2.toArray(new r9[0]);
   }

   @Override
   public abstract v7 s7();

   public abstract n2 x8();

   public final x3 t9() {
      return this.l6;
   }
}
