package com.aspose.slides.internal.i8n;

import com.aspose.slides.internal.f4l.a5;
import com.aspose.slides.internal.f4l.b3;
import com.aspose.slides.internal.f4l.c8;
import com.aspose.slides.internal.f4l.d1;
import com.aspose.slides.internal.f4l.d5;
import com.aspose.slides.internal.f4l.h0;
import com.aspose.slides.internal.f4l.i1;
import com.aspose.slides.internal.f4l.i9;
import com.aspose.slides.internal.f4l.n3;
import com.aspose.slides.internal.f4l.p3;
import com.aspose.slides.internal.f4l.p6;
import com.aspose.slides.internal.f4l.t1;
import com.aspose.slides.internal.f4l.t2;
import com.aspose.slides.internal.f4l.t9;
import com.aspose.slides.internal.f4l.x9;
import com.aspose.slides.internal.f4l.y4;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.z3;
import com.aspose.slides.internal.y5s.m1;

public class n5 {
   public static com.aspose.slides.internal.o9b.u3 n5(t9 var0) {
      com.aspose.slides.internal.f4l.l6 var1 = var0.n5();
      if (var1 instanceof t1) {
         return n5((t1)var1);
      } else if (var1 instanceof p3) {
         return n5((p3)var1);
      } else if (var1 instanceof i9) {
         return n5((i9)var1);
      } else if (var1 instanceof i1) {
         return n5((i1)var1);
      } else if (var1 instanceof p6) {
         return n5((p6)var1);
      } else {
         throw new IllegalArgumentException("Unknown type of EMF+ brush");
      }
   }

   public static com.aspose.slides.internal.o9b.i1 n5(i9 var0) {
      return new com.aspose.slides.internal.o9b.i1(k5.n5(var0.n5()));
   }

   private static z3 n5(t1 var0) {
      z3 var1 = z3.n5(com.aspose.slides.internal.m0l.l6.n5(var0.u3()), k5.n5(var0.a6()), k5.n5(var0.l6()), 0);
      var1.n5(var0.u9());
      a5 var2 = var0.k5();
      if (var2 != null) {
         h0[] var3 = var2.l6();
         if (var3 != null && var3.length > 0) {
            for (h0 var7 : var3) {
               if (var7 instanceof c8) {
                  var1.n5(n5((c8)var7));
               } else if (var7 instanceof t2) {
                  var1.n5(n5((t2)var7));
               }
            }
         }

         if (var2.n5() != null) {
            var1.n5(k5.n5(var2.n5()));
         }
      }

      return var1;
   }

   private static m3 n5(p3 var0) {
      m3 var2;
      if (var0.h0() instanceof n3) {
         n3 var1 = (n3)var0.h0();
         var2 = new m3(u3.n5(var1.n5()));
      } else {
         y4 var4 = (y4)var0.h0();
         m1[] var3 = var4.l6();
         var2 = new m3(com.aspose.slides.internal.m0l.n5.n5(var3, 0, var3.length, false, false));
      }

      var2.n5(var0.l6());
      var2.n5(k5.n5(var0.k5()));
      var2.n5(com.aspose.slides.internal.m0l.n5.n5(var0.u3()));
      var2.n5(k5.n5(var0.u9()));
      if (var0.c8() != null) {
         x9 var5 = var0.c8();
         if (var5.n5() != null) {
            var2.k5(k5.n5(var5.n5()));
         }

         if (var5.l6() != null) {
            if (var5.l6() instanceof c8) {
               var2.n5(n5((c8)var5.l6()));
            } else if (var5.l6() instanceof t2) {
               var2.n5(n5((t2)var5.l6()));
            }
         }

         if (var5.k5() != null) {
            d5 var6 = var5.k5();
            var2.l6(new w1(var6.n5(), var6.l6()));
         }
      }

      return var2;
   }

   private static com.aspose.slides.internal.x4g.n3 n5(i1 var0) {
      return new com.aspose.slides.internal.x4g.n3(var0.k5(), k5.n5(var0.l6()), k5.n5(var0.n5()));
   }

   private static u6 n5(p6 var0) {
      d1 var1 = var0.k5();
      b3 var2 = var1.l6();
      t4 var3 = l6.n5(var2);
      u6 var4 = new u6(var3, var0.l6());
      if (var1.n5() != null) {
         var4.k5(k5.n5(var1.n5()));
      }

      return var4;
   }

   public static com.aspose.slides.internal.x4g.a6 n5(c8 var0) {
      com.aspose.slides.internal.x4g.a6 var1 = new com.aspose.slides.internal.x4g.a6(var0.l6());
      var1.n5(k5.n5(var0.k5()));
      var1.n5(var0.n5());
      return var1;
   }

   private static com.aspose.slides.internal.x4g.u3 n5(t2 var0) {
      com.aspose.slides.internal.x4g.u3 var1 = new com.aspose.slides.internal.x4g.u3(var0.l6());
      var1.n5(var0.k5());
      float[] var2 = var0.n5();
      if (Math.abs(var2[var2.length - 1] - 1.0F) < 1.0E-5) {
         var2[var2.length - 1] = 1.0F;
      }

      var1.l6(var2);
      return var1;
   }
}
