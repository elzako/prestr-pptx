package com.aspose.slides.internal.t9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.internal.k7.y1;
import com.aspose.slides.ms.System.y8;

public abstract class a6 {
   private static final com.aspose.slides.internal.v6g.c8<com.aspose.slides.internal.u3.n5<Integer, com.aspose.slides.internal.m1.n5<z3>>> n5 = new com.aspose.slides.internal.v6g.c8<>(
      null
   );

   public abstract com.aspose.slides.internal.k5.u9 l6(int var1);

   public final int n5(y8 var1, int var2) {
      com.aspose.slides.internal.k5.u9 var3 = this.l6(var2);
      if (var3.h0() == 1) {
         return com.aspose.slides.internal.u3.k5.n5(var1, var3.u9());
      }

      IGenericEnumerator var4 = ((com.aspose.slides.internal.k5.h0)var3).iterator();
      var4.hasNext();
      int var5 = com.aspose.slides.internal.u3.k5.n5(var1, ((com.aspose.slides.internal.k5.u9)var4.next()).u9());

      while (var4.hasNext()) {
         var5 |= com.aspose.slides.internal.u3.k5.n5(var1, ((com.aspose.slides.internal.k5.u9)var4.next()).u9());
      }

      return var5;
   }

   public final com.aspose.slides.internal.o9b.c8 u3(int var1) {
      return ((com.aspose.slides.internal.k5.u3)this.l6(var1)).a6().a6();
   }

   public final y1 a6(int var1) {
      return y1.n5(this.l6(var1));
   }

   public final boolean n5(int var1, z3 var2) {
      if (n5.get() == null) {
         n5.set(n5());
      }

      return n5.get().k5(var1) ? n5.get().n5(var1).n5(var2) : true;
   }

   private static com.aspose.slides.internal.u3.n5<Integer, com.aspose.slides.internal.m1.n5<z3>> n5() {
      com.aspose.slides.internal.u3.n5 var0 = new com.aspose.slides.internal.u3.n5();
      var0.n5(39, new com.aspose.slides.internal.z3.n5(6, 7));
      var0.n5(56, new com.aspose.slides.internal.z3.n5(6, 7));
      var0.n5(65, new com.aspose.slides.internal.z3.l6(0).n5());
      var0.n5(69, new com.aspose.slides.internal.z3.n5(15));
      var0.n5(70, new com.aspose.slides.internal.z3.n5(1, 2, 6));
      var0.n5(71, new com.aspose.slides.internal.z3.l6(2, 3));
      var0.n5(101, new com.aspose.slides.internal.z3.n5(14));
      var0.n5(150, new com.aspose.slides.internal.z3.l6(0).n5());
      var0.n5(159, new com.aspose.slides.internal.z3.n5(2));
      var0.n5(160, new com.aspose.slides.internal.z3.n5(2));
      var0.n5(161, new com.aspose.slides.internal.z3.n5(2));
      var0.n5(158, new com.aspose.slides.internal.z3.n5(2));
      var0.n5(162, new com.aspose.slides.internal.z3.n5(1, 0, 3, 7, 2, 21, 4, 6, 15));
      var0.n5(163, new com.aspose.slides.internal.z3.n5(1, 0, 3, 7, 2, 21, 4, 6, 15));
      var0.n5(164, new com.aspose.slides.internal.z3.n5(1, 0, 3, 7, 2, 21, 4, 6, 15));
      var0.n5(165, new com.aspose.slides.internal.z3.n5(1, 0, 3, 7, 2, 21, 4, 6, 15));
      var0.n5(166, new com.aspose.slides.internal.z3.n5(1, 0, 3, 7, 2, 21, 4, 6, 15));
      var0.n5(173, new com.aspose.slides.internal.z3.n5(6, 15, 13, 12, 10, 9, 7, 11, 8).n5());
      var0.n5(174, new com.aspose.slides.internal.z3.n5(6, 15, 13, 12, 10, 9, 7, 11, 8).n5());
      var0.n5(175, new com.aspose.slides.internal.z3.n5(6, 15, 13, 12, 10, 9, 7, 11, 8).n5());
      var0.n5(176, new com.aspose.slides.internal.z3.n5(6, 15, 13, 12, 10, 9, 7, 11, 8).n5());
      var0.n5(187, new com.aspose.slides.internal.z3.n5(1, 2, 6));
      var0.n5(193, new com.aspose.slides.internal.z3.n5(1, 2, 6));
      var0.n5(198, new com.aspose.slides.internal.z3.n5(11, 9, 10, 11, 12, 13).n5());
      var0.n5(199, new com.aspose.slides.internal.z3.n5(11, 9, 10, 11, 12, 13).n5());
      var0.n5(200, new com.aspose.slides.internal.z3.n5(11, 9, 10, 11, 12, 13).n5());
      var0.n5(201, new com.aspose.slides.internal.z3.n5(11, 9, 10, 11, 12, 13).n5());
      var0.n5(202, new com.aspose.slides.internal.z3.n5(11, 9, 10, 11, 12, 13).n5());
      var0.n5(222, new com.aspose.slides.internal.z3.l6(0).n5());
      var0.n5(238, new com.aspose.slides.internal.z3.n5(6, 7));
      var0.n5(240, new com.aspose.slides.internal.z3.n5(1, 2, 6, 14, 3));
      var0.n5(254, new com.aspose.slides.internal.z3.n5(1, 2, 6));
      var0.n5(262, new com.aspose.slides.internal.z3.l6(0).n5());
      var0.n5(272, new com.aspose.slides.internal.z3.n5(0, 7, 3, 14));
      var0.n5(254, new com.aspose.slides.internal.z3.n5(1, 2, 6));
      var0.n5(284, new com.aspose.slides.internal.z3.n5(1, 2, 6));
      var0.n5(289, new com.aspose.slides.internal.z3.l6(0).n5());
      return var0;
   }
}
