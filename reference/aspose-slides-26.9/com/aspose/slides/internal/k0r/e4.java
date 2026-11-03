package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e4 extends g6 {
   public e4() {
      super(61443);
   }

   @Override
   public q9 l6() {
      return ((q5)this.e2().get_Item(0)).l6();
   }

   @Override
   public p1 u3() {
      return ((q5)this.e2().get_Item(0)).u3();
   }

   @Override
   public r3 a6() {
      return ((q5)this.e2().get_Item(0)).a6();
   }

   @Override
   public m9 u9() {
      return null;
   }

   @Override
   public a9 h0() {
      return ((q5)this.e2().get_Item(0)).h0();
   }

   @Override
   public v7 c8() {
      return ((q5)this.e2().get_Item(0)).c8();
   }

   @Override
   public t7 t2() {
      return ((q5)this.e2().get_Item(0)).t2();
   }

   @Override
   public c9 s7() {
      return ((q5)this.e2().get_Item(0)).s7();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.h0() != null) {
         this.n5(var1, this.h0().u3());
      } else {
         super.n5(var1);
      }
   }

   @Override
   public int n5() {
      return this.n5(this.h0() != null && this.h0().u3());
   }

   final int n5(com.aspose.slides.internal.z0k.l6 var1, boolean var2) {
      long var3 = var1.n5().getPosition();
      List$Enumerator var5 = this.e2().iterator();

      try {
         while (var5.hasNext()) {
            e6r var6 = (e6r)var5.next();
            c9 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, c9.class);
            if (var7 != null) {
               if (var7.e2().size() == 0) {
                  continue;
               }

               if (var7.e2().size() == 1 && com.aspose.slides.internal.v6g.k5.l6(var7.e2().get_Item(0), d0.class)) {
                  d0 var8 = (d0)var7.e2().get_Item(0);
                  if (var8.e2().size() == 0) {
                     continue;
                  }
               }
            }

            q5 var13 = com.aspose.slides.internal.v6g.k5.n5(var6, q5.class);
            if (var2 && var13 != null && var13.u3().t2() == 20) {
               if (var13.a6() == null || var13.a6().l6() == null) {
                  continue;
               }

               z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var13.a6().l6().n5(511), z5.class);
               if (var9 == null || (var9.j5() & 4294967295L & 8L & 4294967295L) == 0L) {
                  continue;
               }
            }

            var6.l6(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return (int)(var1.n5().getPosition() - var3);
   }

   private int n5(boolean var1) {
      int var2 = 0;
      List$Enumerator var3 = this.e2().iterator();

      try {
         while (var3.hasNext()) {
            e6r var4 = (e6r)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, c9.class)) {
               c9 var5 = (c9)var4;
               if (var5.e2().size() == 0) {
                  continue;
               }

               if (var5.e2().size() == 1 && com.aspose.slides.internal.v6g.k5.l6(var5.e2().get_Item(0), d0.class)) {
                  d0 var6 = (d0)var5.e2().get_Item(0);
                  if (var6.e2().size() == 0) {
                     continue;
                  }
               }
            }

            if (var1 && com.aspose.slides.internal.v6g.k5.l6(var4, q5.class)) {
               q5 var10 = (q5)var4;
               if (var10.u3().t2() == 20) {
                  if (var10.a6() == null || var10.a6().l6() == null) {
                     continue;
                  }

                  z5 var11 = com.aspose.slides.internal.v6g.k5.n5(var10.a6().l6().n5(511), z5.class);
                  if (var11 == null || (var11.j5() & 4294967295L & 8L & 4294967295L) == 0L) {
                     continue;
                  }
               }
            }

            var2 += var4.n5() + 8;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }
}
