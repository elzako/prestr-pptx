package com.aspose.slides.internal.z5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.a8.s7;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.j3.z1;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.internal.k5.j5;
import com.aspose.slides.internal.k5.m1;
import com.aspose.slides.internal.m3.u6;
import com.aspose.slides.internal.r4.q0;
import com.aspose.slides.internal.r4.t4;
import com.aspose.slides.internal.w8.t9;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;

public class n5 {
   private e2 n5;
   private com.aspose.slides.internal.j4.l6 l6;
   private com.aspose.slides.internal.j4.k5 k5;

   public n5(com.aspose.slides.internal.j4.l6 var1, com.aspose.slides.internal.j4.k5 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Deprecated
   public final k5 n5(String var1, l6 var2) {
      this.l6.l6(var2.u9());
      this.l6.n5(var2.c8());
      com.aspose.slides.internal.f5.k5 var3 = new com.aspose.slides.internal.f5.k5(this.k5, this.l6, var2);
      z1 var4 = var3.n5(var1);
      return this.n5(var4, var2);
   }

   public final k5 n5(z1 var1, l6 var2) {
      this.n5(com.aspose.slides.internal.v6g.k5.n5(var1, m1.class));
      this.n5(var1);

      try {
         this.n5 = new e2();
         s7 var3 = new s7(this.n5);

         try {
            com.aspose.slides.internal.f4.n5 var4 = new com.aspose.slides.internal.f4.n5(var1, new com.aspose.slides.internal.y9.l6());
            com.aspose.slides.internal.u4.k5.n5((t9)var1, var2);
            com.aspose.slides.internal.a8.c8 var5 = new com.aspose.slides.internal.a8.c8(this.l6, var3, var2, this.k5, var4);
            var5.n5(com.aspose.slides.internal.v6g.k5.n5(var1, t9.class));
            var3.l6();
            this.n5.seek(0L, 0);
            q0 var6 = new q0();
            var6.n5("Times New Roman");
            Dictionary var7 = new Dictionary();
            var6.n5(var7);
            var6.n5(new com.aspose.slides.internal.p7.n5(this.k5));
            var6.n5(var2.k5());
            var6.l6(true);
            w1[] var8 = t4.n5(this.n5, var6).toArray(new w1[0]);
            if (var2.a6()) {
               var8 = new h0(var2).n5(var8);
            }

            var4.n5(var8);
            var4.n5(var7);
            return new k5(var4);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         com.aspose.slides.internal.r4.z1.n5().dispose();
         com.aspose.slides.internal.t9.u3.k5(0);
      }
   }

   private void n5(m1 var1) {
      IGenericEnumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            j5 var3 = (j5)var2.next();
            IGenericEnumerator var4 = var3.l6().iterator();

            try {
               while (var4.hasNext()) {
                  com.aspose.slides.internal.k5.q0 var5 = (com.aspose.slides.internal.k5.q0)var4.next();
                  if (var5.n5() == 5) {
                     com.aspose.slides.internal.t9.u9 var6 = com.aspose.slides.internal.t9.u9.n5((com.aspose.slides.internal.k5.e2)var5);
                     String var7 = null;
                     IGenericEnumerator var8 = var6.l6().iterator();

                     try {
                        while (var8.hasNext()) {
                           com.aspose.slides.internal.t9.h0 var9 = (com.aspose.slides.internal.t9.h0)var8.next();
                           if (var9.k5() != null && (d1.l6(var9.k5(), ".ttf", (short)5) || d1.l6(var9.k5(), ".woff", (short)5))
                              || var9.l6() != null && (d1.l6(var9.l6(), ".ttf", (short)5) || d1.l6(var9.l6(), ".woff", (short)5))) {
                              var7 = var9.l6();
                              break;
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                           var8.dispose();
                        }
                     }

                     if (var7 != null) {
                        com.aspose.slides.internal.j4.a6 var48 = this.n5(var7, var5);
                        if (var48.l6() == null && var48.n5() != null) {
                           byte[] var10 = var48.n5();
                           if (d1.l6(var7, ".woff", (short)5)) {
                              e2 var11 = new e2(var10);

                              try {
                                 e2 var12 = new e2();

                                 try {
                                    com.aspose.slides.internal.u1s.n5 var13 = new com.aspose.slides.internal.u1s.n5();
                                    var13.n5(var11, var12);
                                    var10 = var12.toArray();
                                 } finally {
                                    if (var12 != null) {
                                       var12.dispose();
                                    }
                                 }
                              } finally {
                                 if (var11 != null) {
                                    var11.dispose();
                                 }
                              }
                           }

                           com.aspose.slides.internal.r4.z1.n5()
                              .n5(
                                 var6.n5(),
                                 com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(u6.class), var6.k5()),
                                 n5(var6.u3()),
                                 var10
                              );
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private com.aspose.slides.internal.j4.a6 n5(String var1, com.aspose.slides.internal.k5.q0 var2) {
      r8 var3 = new r8(var1, 0);
      if (var3.z3()) {
         return this.k5.n5(this, new com.aspose.slides.internal.j4.u3(var1));
      }

      if (var2.u3() != null) {
         var1 = com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.u9(var2.u3().k5()), var1);
      }

      com.aspose.slides.internal.j4.a6 var4 = this.k5.n5(this, new com.aspose.slides.internal.j4.u3(var1));
      return var4.l6() == null ? var4 : this.k5.n5(this, new com.aspose.slides.internal.j4.u3(com.aspose.slides.internal.z0k.z1.l6(this.l6.n5(), var1)));
   }

   private static int n5(com.aspose.slides.internal.k7.m1 var0) {
      return var0.h0();
   }

   private void n5(z1 var1) {
      com.aspose.slides.internal.j3.j5 var2 = var1.x8("BODY");
      if (var2.n5() != 0) {
         z8 var3 = var2.n5(0);
         this.n5(var3, var3);
      }
   }

   private void n5(z8 var1, z8 var2) {
      z8 var3 = var1.t1();
      if (var3 != null) {
         com.aspose.slides.internal.w5.k5 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w5.k5.class);

         while (var3 != null) {
            if (var3.n3() == 1) {
               com.aspose.slides.internal.w5.k5 var5 = (com.aspose.slides.internal.w5.k5)var3;
               if (var5.a3().a3() == 2 && var4 != null && var4.a3().k7().h0() == 14) {
                  z8 var6 = var3.z7();
                  var2.l6(var3, var2.u6());
                  var3 = var6;
                  continue;
               }
            }

            this.n5(var3, var2);
            var3 = var3.z7();
         }
      }
   }
}
