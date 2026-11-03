package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class z1 {
   private int n5;
   private com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 u3 = new com.aspose.slides.internal.o9b.c8();

   public static z1 n5(com.aspose.slides.internal.e5.w1 var0) {
      return l6(var0);
   }

   private static z1 l6(com.aspose.slides.internal.e5.w1 var0) {
      z1 var1 = null;
      com.aspose.slides.internal.e5.w1 var2 = var0.k5();
      if (var2 != null) {
         var1 = l6(var2);
      }

      a5 var3 = var0.l6(248);
      if (var3 != null) {
         List var4 = var3.t_();
         List$Enumerator var5 = var4.iterator();

         try {
            while (var5.hasNext()) {
               a5 var6 = (a5)var5.next();
               int var7 = var6.a6();
               com.aspose.slides.internal.y1.u3 var8 = var0 == null ? null : (var0.n5() == null ? null : var0.n5().q_());
               if (var7 == 95) {
                  if (var1 != null) {
                     var1.n5 = 0;
                  }

                  return var1;
               }

               if (var7 == 153) {
                  if (var1 == null) {
                     var1 = new z1();
                  }

                  var1.n5 |= 1;
                  var0.u3(72).n5(var8).n5(var1.l6);
               } else if (var7 == 92) {
                  if (var1 != null) {
                     var1.n5 &= 14;
                     var0.u3(72).n5(var8).n5(var1.l6);
                  }
               } else if (var7 == 103) {
                  if (var1 == null) {
                     var1 = new z1();
                  }

                  var1.n5 |= 2;
                  var0.u3(72).n5(var8).n5(var1.k5);
               } else if (var7 == 91) {
                  if (var1 != null) {
                     var1.n5 &= 13;
                     var0.u3(72).n5(var8).n5(var1.k5);
                  }
               } else if (var7 == 77) {
                  if (var1 == null) {
                     var1 = new z1();
                  }

                  var1.n5 |= 4;
                  var0.u3(72).n5(var8).n5(var1.u3);
               } else if (var7 == 90) {
                  if (var1 != null) {
                     var1.n5 &= 11;
                     var0.u3(72).n5(var8).n5(var1.u3);
                  }
               } else if (var7 == 17) {
                  if (var1 == null) {
                     var1 = new z1();
                  }

                  var1.n5 |= 8;
               } else {
                  if (var7 != 86) {
                     throw new com.aspose.slides.internal.b3.z8(d1.n5(new String[]{"Illegal value encountered: ", var6.j_()}));
                  }

                  if (var1 != null) {
                     var1.n5 &= 7;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      return var1;
   }

   public final boolean n5() {
      return (this.n5 & 1) != 0;
   }

   public final boolean l6() {
      return (this.n5 & 2) != 0;
   }

   public final boolean k5() {
      return (this.n5 & 4) != 0;
   }

   public final boolean u3() {
      return (this.n5 & 8) != 0;
   }

   public final com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 u9() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.c8 h0() {
      return this.u3;
   }
}
