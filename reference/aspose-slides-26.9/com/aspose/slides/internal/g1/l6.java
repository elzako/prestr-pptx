package com.aspose.slides.internal.g1;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class l6 {
   private com.aspose.slides.internal.m0.n5 n5;
   private k5 l6 = null;
   private p8 k5 = new p8();

   public l6(com.aspose.slides.internal.m0.n5 var1, com.aspose.slides.internal.o1.u3 var2) {
      this.n5 = var1;
      var2.u3().k5(this.k5);
   }

   public final k5 n5() {
      if (this.l6 == null) {
         if (this.n5.n3() != null) {
            y2 var1 = this.n5.n3().l6().u9().n3();
            if (var1.t2() != 0 && var1.l6() != 0) {
               int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.n5(var1.t2())), 14);
               int var3 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.n5(var1.l6())), 14);
               return new k5(var1.n3(), new y2(0, 0, var2, var3));
            }

            this.l6 = this.l6();
         } else {
            this.l6 = this.l6();
         }
      }

      return this.l6;
   }

   private float n5(int var1) {
      return var1 / this.n5.t2() * 96.0F;
   }

   private k5 l6() {
      u9 var1 = new u9(this.n5.l6() == 2);
      n5 var2 = new n5();
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(this.k5.l6(), this.k5.k5());

      try {
         z1 var4 = z1.n5(var3);

         try {
            var1.n5(new Object[this.n5.x8().u9()]);
            var1.n5(8);
            var1.l6(new y2(0, 0, var3.e2(), var3.h0()));
            var1.n5(var1.k5().n3());
            IGenericEnumerator var5 = this.n5.n5().iterator();

            try {
               while (var5.hasNext()) {
                  v4 var6 = (v4)var5.next();
                  com.aspose.slides.internal.k4.l6 var7 = com.aspose.slides.internal.k4.n5.n5(var6.t9());
                  n5 var8 = var7 == null ? com.aspose.slides.internal.g1.n5.k5() : var7.n5(var6, var4, var1);
                  if (var8.l6()) {
                     y2 var9 = var8.n5().n3();
                     var9.n5(var1.d5().n3());
                     if (var2.l6()) {
                        var2.n5(y2.l6(this.n5(var9.n3(), var4, var1).n3(), var2.n5().n3()).n3());
                     } else {
                        var2 = new n5(this.n5(var9.n3(), var4, var1).n3());
                     }
                  }

                  if (var6.t9() == 0) {
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }

            com.aspose.slides.internal.d9.n5[] var28 = this.n5.t9();
            boolean var29 = false;
            int var30 = 0;
            int var31 = 0;
            if (var28.length > 0) {
               var29 = true;

               for (com.aspose.slides.internal.d9.n5 var13 : var28) {
                  var30 = q1.n5(var30, var13.u9());
                  var31 = q1.n5(var31, var13.h0());
               }
            }

            y2 var32 = var1.l6().n3();
            if (var32.t2() < 0) {
               var32.k5(var32.s7() + var32.t2());
               var32.l6(-var32.t2());
            }

            if (var32.l6() < 0) {
               var32.u3(var32.x8() + var32.l6());
               var32.n5(-var32.l6());
            }

            if (!var2.l6()) {
               return new k5(y2.l6(y1.n5(var32).y4()).n3(), new y2(0, 0, 2, 2));
            } else if (var29) {
               return new k5(y2.l6(y1.n5(var32).y4()).n3(), new y2(0, 0, var30, var31));
            } else {
               return !var2.n5().k5() ? new k5(var32.n3(), var32.n3(), var1.k5().n3(), var2.n5().n3()) : new k5(var32.n3(), var1.k5().n3());
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private y2 n5(y2 var1, z1 var2, u9 var3) {
      a0 var4 = new a0(var1.n3());
      var4.l6(var3.f2());
      return y2.l6(var4.n5(var2).y4());
   }
}
