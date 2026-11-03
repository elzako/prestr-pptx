package com.aspose.slides.internal.i4;

import com.aspose.slides.exceptions.ArgumentException;
import java.util.TimeZone;

public class c4 extends u6 {
   private j9 u3;

   private boolean n5(String var1, com.aspose.slides.ms.System.h2 var2, double[] var3) {
      com.aspose.slides.ms.System.j5 var4 = new com.aspose.slides.ms.System.j5(0L, 1L);
      var3[0] = 0.0;
      com.aspose.slides.ms.System.j5[] var5 = new com.aspose.slides.ms.System.j5[]{var4};
      boolean var6 = com.aspose.slides.ms.System.j5.n5(var1, var2, 0, var5);
      var5[0].u3(var4);
      if (var6) {
         var3[0] = this.u3.z1().n5(var4.m3()).l6();
         return true;
      }

      var5[0] = var4;
      boolean var7 = com.aspose.slides.ms.System.j5.n5(var1, "ddd, dd MMM yyyy HH':'mm':'ss 'GMT'zzz", var2, 0, var5);
      var5[0].u3(var4);
      if (var7) {
         var3[0] = this.u3.z1().n5(var4.m3()).l6();
         return true;
      }

      com.aspose.slides.ms.System.j5 var8 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var9 = new com.aspose.slides.ms.System.j5[]{var8};
      boolean var10 = com.aspose.slides.ms.System.j5.n5(var1, "ddd, dd MMM yyyy", var2, 0, var9);
      var9[0].u3(var8);
      if (var10) {
         var4.n5(var8.n3()).u3(var4);
      }

      var9[0] = var8;
      boolean var11 = com.aspose.slides.ms.System.j5.n5(var1, "HH':'mm':'ss 'GMT'zzz", var2, 0, var9);
      var9[0].u3(var8);
      if (var11) {
         var4.n5(var8.n3()).u3(var4);
      }

      if (var4.n3() > 0L) {
         var3[0] = this.u3.z1().n5(var4.m3()).l6();
         return true;
      } else {
         return true;
      }
   }

   public static com.aspose.slides.ms.System.j5 n5(double var0) {
      return new com.aspose.slides.ms.System.j5(com.aspose.slides.internal.v6g.k5.u9(var0 * 10000.0 + w1.n5, 14), 1L);
   }

   public final g7 n5(g7[] var1) {
      double var2 = 0.0;
      double[] var4 = new double[]{0.0};
      boolean var5 = this.n5(var1[0].toString(), com.aspose.slides.internal.x7n.l6.k5(), var4);
      var2 = var4[0];
      return var5 ? this.u3.w1().n5(var2) : this.u3.y2();
   }

   public final g7 l6(g7[] var1) {
      double var2 = 0.0;
      double[] var4 = new double[]{0.0};
      boolean var5 = this.n5(var1[0].toString(), com.aspose.slides.internal.x7n.l6.u3(), var4);
      var2 = var4[0];
      return var5 ? this.u3.w1().n5(var2) : this.u3.y2();
   }

   public final w1 k5(g7[] var1) {
      w1 var2 = null;
      if (var1.length == 1) {
         if (("Number".equals(var1[0].u3()) || "Object".equals(var1[0].u3())) && com.aspose.slides.ms.System.d2.k5(var1[0].l6())) {
            var2 = this.u3.z1().n5(Double.NaN);
         } else if ("Number".equals(var1[0].u3())) {
            var2 = this.u3.z1().n5(var1[0].l6());
         } else {
            double var3 = 0.0;
            double[] var5 = new double[]{0.0};
            boolean var6 = this.n5(var1[0].toString(), com.aspose.slides.internal.x7n.l6.k5(), var5);
            var3 = var5[0];
            if (var6) {
               var2 = this.u3.z1().n5(var3);
            } else {
               var5[0] = var3;
               boolean var7 = this.n5(var1[0].toString(), com.aspose.slides.internal.x7n.l6.u3(), var5);
               var3 = var5[0];
               if (var7) {
                  var2 = this.u3.z1().n5(var3);
               } else {
                  var2 = this.u3.z1().n5(0.0);
               }
            }
         }
      } else if (var1.length > 1) {
         com.aspose.slides.ms.System.j5 var8 = new com.aspose.slides.ms.System.j5(0L, 2L);
         if (var1.length > 0) {
            int var9 = com.aspose.slides.internal.v6g.k5.u3(var1[0].l6(), 14) - 1;
            if (var9 < 100) {
               var9 += 1900;
            }

            var8.l6(var9).u3(var8);
         }

         if (var1.length > 1) {
            var8.n5(com.aspose.slides.internal.v6g.k5.u3(var1[1].l6(), 14)).u3(var8);
         }

         if (var1.length > 2) {
            var8.n5((double)(com.aspose.slides.internal.v6g.k5.u3(var1[2].l6(), 14) - 1)).u3(var8);
         }

         if (var1.length > 3) {
            var8.l6((double)com.aspose.slides.internal.v6g.k5.u3(var1[3].l6(), 14)).u3(var8);
         }

         if (var1.length > 4) {
            var8.u3((double)com.aspose.slides.internal.v6g.k5.u3(var1[4].l6(), 14)).u3(var8);
         }

         if (var1.length > 5) {
            var8.a6(com.aspose.slides.internal.v6g.k5.u3(var1[5].l6(), 14)).u3(var8);
         }

         if (var1.length > 6) {
            var8.k5((double)com.aspose.slides.internal.v6g.k5.u3(var1[6].l6(), 14)).u3(var8);
         }

         var2 = this.u3.z1().n5(var8.m3());
      } else {
         var2 = this.u3.z1().n5(com.aspose.slides.ms.System.j5.t2().m3());
      }

      return var2;
   }

   public final g7 u3(g7[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == l5.n5
            || "Number".equals(var1[var2].u3()) && com.aspose.slides.ms.System.d2.k5(var1[var2].l6())
            || "Number".equals(var1[var2].u3()) && com.aspose.slides.ms.System.d2.l6(var1[var2].l6())) {
            return this.u3.y2();
         }
      }

      w1 var5 = this.k5(var1);
      double var3 = var5.l6() + com.aspose.slides.ms.System.h6.n5(TimeZone.getDefault(), new com.aspose.slides.ms.System.j5()).h0();
      return this.u3.w1().n5(var3);
   }

   public final g7 n5(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).q0().n5("ddd, dd MMM yyyy HH':'mm':'ss 'GMT'zzz", com.aspose.slides.internal.x7n.l6.k5()));
   }

   public final g7 l6(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).q0().n5("ddd, dd MMM yyyy", com.aspose.slides.internal.x7n.l6.k5()));
   }

   public final g7 k5(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).q0().n5("HH':'mm':'ss 'GMT'zzz", com.aspose.slides.internal.x7n.l6.k5()));
   }

   public final g7 u3(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).q0().n5("F", com.aspose.slides.internal.x7n.l6.u3()));
   }

   public final g7 a6(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).q0().n5("ddd, dd MMM yyyy"));
   }

   public final g7 u9(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).q0().n5("HH':'mm':'ss 'GMT'zzz"));
   }

   public final g7 h0(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5(var1.l6());
   }

   public final g7 c8(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5(var1.l6());
   }

   public final g7 t2(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().e2()));
   }

   public final g7 s7(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().e2()));
   }

   public final g7 x8(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().c8() - 1));
   }

   public final g7 n3(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().c8() - 1));
   }

   public final g7 y4(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().l6()));
   }

   public final g7 e2(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().l6()));
   }

   public final g7 t9(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().k5()));
   }

   public final g7 z1(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().k5()));
   }

   public final g7 t4(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().u3()));
   }

   public final g7 q0(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().u3()));
   }

   public final g7 z3(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().h0()));
   }

   public final g7 m1(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().h0()));
   }

   public final g7 k7(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().x8()));
   }

   public final g7 m3(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().x8()));
   }

   public final g7 z8(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).q0().u9()));
   }

   public final g7 j5(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6()) ? this.u3.y2() : this.u3.w1().n5((double)(n5(var1.l6()).k7().u9()));
   }

   public final g7 w1(y1 var1, g7[] var2) {
      return this.u3.w1().n5(-com.aspose.slides.ms.System.h6.n5(TimeZone.getDefault(), new com.aspose.slides.ms.System.j5()).c8());
   }

   public static g7 r4(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no tiem specified");
      }

      var0.n5(var1[0].l6());
      return var0;
   }

   public final g7 c4(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no millisecond specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).q0().m3();
      var3.k5((double)(-var3.u9())).u3(var3);
      var3.k5(var2[0].l6()).u3(var3);
      var1.n5(this.u3.z1().n5(var3.m3()).l6());
      return var1;
   }

   public final g7 y2(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no millisecond specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).m3();
      var3.k5((double)(-var3.u9())).u3(var3);
      var3.k5(var2[0].l6()).u3(var3);
      var1.n5(this.u3.z1().n5(var3.m3()).l6());
      return var1;
   }

   public final g7 y1(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no second specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).q0().m3();
      var3.a6(-var3.x8()).u3(var3);
      var3.a6(var2[0].l6()).u3(var3);
      var1.n5(var3.m3());
      if (var2.length > 1) {
         g7[] var4 = new g7[var2.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var1 = (w1)this.c4(var1, var4);
      }

      return var1;
   }

   public final g7 a0(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no second specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).m3();
      var3.a6(-var3.x8()).u3(var3);
      var3.a6(var2[0].l6()).u3(var3);
      var1.n5(var3.m3());
      if (var2.length > 1) {
         g7[] var4 = new g7[var2.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var1 = (w1)this.c4(var1, var4);
      }

      return var1;
   }

   public final g7 d2(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no minute specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).q0().m3();
      var3.u3((double)(-var3.h0())).u3(var3);
      var3.u3(var2[0].l6()).u3(var3);
      var1.n5(var3.m3());
      if (var2.length > 1) {
         g7[] var4 = new g7[var2.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var1 = (w1)this.y1(var1, var4);
      }

      return var1;
   }

   public final g7 d5(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no minute specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).m3();
      var3.u3((double)(-var3.h0())).u3(var3);
      var3.u3(var2[0].l6()).u3(var3);
      var1.n5(var3.m3());
      if (var2.length > 1) {
         g7[] var4 = new g7[var2.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var1 = (w1)this.y1(var1, var4);
      }

      return var1;
   }

   public final g7 s3(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no hour specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).q0().m3();
      var3.l6((double)(-var3.u3())).u3(var3);
      var3.l6(var2[0].l6()).u3(var3);
      var1.n5(var3.m3());
      if (var2.length > 1) {
         g7[] var4 = new g7[var2.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var1 = (w1)this.d2(var1, var4);
      }

      return var1;
   }

   public final g7 p8(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         throw new ArgumentException("There was no hour specified");
      }

      com.aspose.slides.ms.System.j5 var3 = n5(var1.l6()).m3();
      var3.l6((double)(-var3.u3())).u3(var3);
      var3.l6(var2[0].l6()).u3(var3);
      var1.n5(var3.m3());
      if (var2.length > 1) {
         g7[] var4 = new g7[var2.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var1 = (w1)this.d2(var1, var4);
      }

      return var1;
   }

   public static g7 f2(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no date specified");
      }

      com.aspose.slides.ms.System.j5 var2 = n5(var0.l6()).q0().m3();
      var2.n5((double)(-var2.l6())).u3(var2);
      var2.n5(var1[0].l6()).u3(var2);
      var0.n5(var2.m3());
      return var0;
   }

   public static g7 i1(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no date specified");
      }

      com.aspose.slides.ms.System.j5 var2 = n5(var0.l6()).m3();
      var2.n5((double)(-var2.l6())).u3(var2);
      var2.n5(var1[0].l6()).u3(var2);
      var0.n5(var2.m3());
      return var0;
   }

   public static g7 e5(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no month specified");
      }

      com.aspose.slides.ms.System.j5 var2 = n5(var0.l6()).q0().m3();
      var2.n5(-var2.c8()).u3(var2);
      var2.n5(com.aspose.slides.internal.v6g.k5.u3(var1[0].l6(), 14)).u3(var2);
      var0.n5(var2.m3());
      if (var1.length > 1) {
         g7[] var3 = new g7[var1.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, var3.length);
         var0 = (w1)f2(var0, var3);
      }

      return var0;
   }

   public static g7 b3(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no month specified");
      }

      com.aspose.slides.ms.System.j5 var2 = n5(var0.l6()).m3();
      var2.n5(-var2.c8()).u3(var2);
      var2.n5(com.aspose.slides.internal.v6g.k5.u3(var1[0].l6(), 14)).u3(var2);
      var0.n5(var2.m3());
      if (var1.length > 1) {
         g7[] var3 = new g7[var1.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, var3.length);
         var0 = (w1)f2(var0, var3);
      }

      return var0;
   }

   public static g7 o0(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no year specified");
      }

      com.aspose.slides.ms.System.j5 var2 = n5(var0.l6()).q0().m3();
      int var3 = var2.e2() - com.aspose.slides.internal.v6g.k5.u3(var1[0].l6(), 14);
      var2.l6(-var3).u3(var2);
      var0.n5(var2.m3());
      if (var1.length > 1) {
         g7[] var4 = new g7[var1.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var0 = (w1)e5(var0, var4);
      }

      return var0;
   }

   public static g7 z7(y1 var0, g7[] var1) {
      if (var1.length == 0) {
         throw new ArgumentException("There was no year specified");
      }

      com.aspose.slides.ms.System.j5 var2 = n5(var0.l6()).m3();
      int var3 = var2.e2() - com.aspose.slides.internal.v6g.k5.u3(var1[0].l6(), 14);
      var2.l6(-var3).u3(var2);
      var0.n5(var2.m3());
      if (var1.length > 1) {
         g7[] var4 = new g7[var1.length - 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 1, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var4.length);
         var0 = (w1)e5(var0, var4);
      }

      return var0;
   }

   public final g7 v4(y1 var1, g7[] var2) {
      return com.aspose.slides.ms.System.d2.k5(var1.l6())
         ? this.u3.c4().u9(com.aspose.slides.ms.System.d2.u9(Double.NaN))
         : this.u3.c4().u9(n5(var1.l6()).n5("ddd, dd MMM yyyy HH':'mm':'ss 'UTC'", com.aspose.slides.internal.x7n.l6.k5()));
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("UTC".equals(this.n5)) {
         var4 = this.u3(var3);
      } else if ("parse".equals(this.n5)) {
         var4 = this.n5(var3);
      } else if ("parseLocale".equals(this.n5)) {
         var4 = this.l6(var3);
      } else if ("toString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("toDateString".equals(this.n5)) {
         var4 = this.l6(var2, var3);
      } else if ("toTimeString".equals(this.n5)) {
         var4 = this.k5(var2, var3);
      } else if ("toLocaleString".equals(this.n5)) {
         var4 = this.u3(var2, var3);
      } else if ("toLocaleDateString".equals(this.n5)) {
         var4 = this.a6(var2, var3);
      } else if ("toLocaleTimeString".equals(this.n5)) {
         var4 = this.u9(var2, var3);
      } else if ("valueOf".equals(this.n5)) {
         var4 = this.h0(var2, var3);
      } else if ("getTime".equals(this.n5)) {
         var4 = this.c8(var2, var3);
      } else if ("getFullYear".equals(this.n5)) {
         var4 = this.t2(var2, var3);
      } else if ("getUTCFullYear".equals(this.n5)) {
         var4 = this.s7(var2, var3);
      } else if ("getMonth".equals(this.n5)) {
         var4 = this.x8(var2, var3);
      } else if ("getUTCMonth".equals(this.n5)) {
         var4 = this.n3(var2, var3);
      } else if ("getDate".equals(this.n5)) {
         var4 = this.y4(var2, var3);
      } else if ("getUTCDate".equals(this.n5)) {
         var4 = this.e2(var2, var3);
      } else if ("getDay".equals(this.n5)) {
         var4 = this.t9(var2, var3);
      } else if ("getUTCDay".equals(this.n5)) {
         var4 = this.z1(var2, var3);
      } else if ("getHours".equals(this.n5)) {
         var4 = this.t4(var2, var3);
      } else if ("getUTCHours".equals(this.n5)) {
         var4 = this.q0(var2, var3);
      } else if ("getMinutes".equals(this.n5)) {
         var4 = this.z3(var2, var3);
      } else if ("getUTCMinutes".equals(this.n5)) {
         var4 = this.m1(var2, var3);
      } else if ("getSeconds".equals(this.n5)) {
         var4 = this.k7(var2, var3);
      } else if ("getUTCSeconds".equals(this.n5)) {
         var4 = this.m3(var2, var3);
      } else if ("getMilliseconds".equals(this.n5)) {
         var4 = this.z8(var2, var3);
      } else if ("getUTCMilliseconds".equals(this.n5)) {
         var4 = this.j5(var2, var3);
      } else if ("getTimezoneOffset".equals(this.n5)) {
         var4 = this.w1(var2, var3);
      } else if ("setTime".equals(this.n5)) {
         var4 = r4(var2, var3);
      } else if ("setMilliseconds".equals(this.n5)) {
         var4 = this.c4(var2, var3);
      } else if ("setUTCMilliseconds".equals(this.n5)) {
         var4 = this.y2(var2, var3);
      } else if ("setSeconds".equals(this.n5)) {
         var4 = this.y1(var2, var3);
      } else if ("setUTCSeconds".equals(this.n5)) {
         var4 = this.a0(var2, var3);
      } else if ("setMinutes".equals(this.n5)) {
         var4 = this.d2(var2, var3);
      } else if ("setUTCMinutes".equals(this.n5)) {
         var4 = this.d5(var2, var3);
      } else if ("setHours".equals(this.n5)) {
         var4 = this.s3(var2, var3);
      } else if ("setUTCHours".equals(this.n5)) {
         var4 = this.p8(var2, var3);
      } else if ("setDate".equals(this.n5)) {
         var4 = f2(var2, var3);
      } else if ("setUTCDate".equals(this.n5)) {
         var4 = i1(var2, var3);
      } else if ("setMonth".equals(this.n5)) {
         var4 = e5(var2, var3);
      } else if ("setUTCMonth".equals(this.n5)) {
         var4 = b3(var2, var3);
      } else if ("setFullYear".equals(this.n5)) {
         var4 = o0(var2, var3);
      } else if ("setUTCFullYear".equals(this.n5)) {
         var4 = z7(var2, var3);
      } else {
         if (!"toUTCString".equals(this.n5)) {
            throw new j3("unknown date function");
         }

         var4 = this.v4(var2, var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public c4(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
