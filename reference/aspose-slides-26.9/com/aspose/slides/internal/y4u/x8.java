package com.aspose.slides.internal.y4u;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public class x8 {
   private static final Dictionary<Long, List<x8$k5>> n5 = new Dictionary<>();

   public static s7 n5(
      int var0,
      int var1,
      int var2,
      com.aspose.slides.internal.b8u.a6 var3,
      com.aspose.slides.internal.r1x.v4 var4,
      com.aspose.slides.internal.o9b.y2 var5,
      com.aspose.slides.internal.b8u.a6 var6,
      com.aspose.slides.internal.r1x.v4 var7,
      int var8,
      int var9,
      com.aspose.slides.internal.b8u.t2 var10,
      com.aspose.slides.internal.b8u.u3 var11,
      int var12,
      Object var13
   ) {
      int var14 = var4.q0();
      int var15 = var7.q0();
      s7 var16 = null;
      if (var9 == 2 && var11 != null) {
         var16 = new y4();
      } else if (var4.t4() == var7.t4() && n5(var3, var6, var9, var14, var15)) {
         var16 = new t9();
      } else if (var4.t4() == 1) {
         if (var7.t4() == 1 && n5(var3, var6, var9, var14, var15)) {
            var16 = new t9();
         } else if (var9 != 2 && var15 <= 8) {
            int var17 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var15), 14);
            if (var12 >= var17) {
               throw new ArgumentOutOfRangeException(
                  "fallbackIndex",
                  com.aspose.slides.ms.System.d1.n5(new Object[]{"Cannot use fallback index since the index value is out of range for the ", var7, " format."})
               );
            }
         }
      }

      if (var16 == null) {
         var16 = n5(var4, var7);
      }

      if (var16 == null) {
         throw new NotImplementedException(com.aspose.slides.ms.System.d1.n5("Cannot perform conversion from{0} to {1} format.",new Object[]{ var4, var7}));
      }

      var16.n5(var0, var1, var2, var3, var4, var5.n3(), var6, var7, var8, var9, var10, var11, var12, var13);
      return var16;
   }

   private static boolean n5(com.aspose.slides.internal.b8u.a6 var0, com.aspose.slides.internal.b8u.a6 var1, int var2, int var3, int var4) {
      boolean var5;
      if (var2 == 1) {
         if (var3 <= 8 && var0 == null) {
            throw new ArgumentNullException("sourcePalette", "The source palette must exist for bits count <= 8.");
         }

         if (var4 <= 8 && var1 == null) {
            throw new ArgumentNullException("destinationColorPalette", "The destination palette must exist for bits count <= 8.");
         }

         var5 = n5(var0, var1, var3, var4);
      } else {
         var5 = var3 == var4 && var2 != 2;
      }

      return var5;
   }

   private static boolean n5(com.aspose.slides.internal.b8u.a6 var0, com.aspose.slides.internal.b8u.a6 var1, int var2, int var3) {
      boolean var4 = var2 == var3;
      if (var4 && var2 <= 8) {
         var4 = com.aspose.slides.ms.System.j8.l6(var0, var1);
         if (!var4) {
            var4 = true;
            int[] var5 = var0.l6();
            int[] var6 = var1.l6();
            int var7 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var2), 14);
            int var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var3), 14);
            int var9 = com.aspose.slides.ms.System.q1.l6(var5.length, var7);
            int var10 = com.aspose.slides.ms.System.q1.l6(var6.length, var8);
            if (var10 < var9) {
               var4 = false;
            } else {
               int var11 = com.aspose.slides.ms.System.q1.l6(var9, var10);
               com.aspose.slides.internal.r1x.o5 var12 = new com.aspose.slides.internal.r1x.o5(var1);

               for (int var13 = 0; var13 < var11; var13++) {
                  int var14 = var5[var13];
                  if (var12.n5(var14) != var13) {
                     var4 = false;
                     break;
                  }
               }
            }
         }
      }

      return var4;
   }

   private static List<x8$k5> n5(int var0, int var1) {
      long var2 = (long)var0 << 32 | var1;
      List var4;
      if (n5.containsKey(var2)) {
         var4 = n5.get_Item(var2);
      } else {
         var4 = new List();
         n5.set_Item(var2, var4);
      }

      return var4;
   }

   private static <T extends s7> void n5(Class<T> var0, int var1, int var2) {
      List var3 = n5(var1, var2);
      var3.addItem(new x8$a6(var0, var2));
   }

   private static <T extends s7> void n5(Class<T> var0, int var1, int var2, int var3) {
      List var4 = n5(var1, var2);
      var4.addItem(new x8$u3(var0, var3));
   }

   private static <T extends s7> void n5(Class<T> var0, int var1, com.aspose.slides.internal.r1x.v4 var2) {
      List var3 = n5(var1, var2.t4());
      var3.addItem(new x8$n5(var0, var2));
   }

   private static <T extends s7> void n5(Class<T> var0, int var1, int var2, com.aspose.slides.internal.r1x.v4 var3) {
      List var4 = n5(var1, var3.t4());
      var4.addItem(new x8$l6(var0, var3, var2));
   }

   private static s7 n5(com.aspose.slides.internal.r1x.v4 var0, com.aspose.slides.internal.r1x.v4 var1) {
      long var2 = (long)var0.t4() << 32 | var1.t4();
      s7 var4 = null;
      if (n5.containsKey(var2)) {
         List var5 = n5.get_Item(var2);
         List$Enumerator var6 = var5.iterator();

         try {
            while (var6.hasNext()) {
               x8$k5 var7 = (x8$k5)var6.next();
               if (var7.n5(var0, var1)) {
                  var4 = var7.n5();
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      return var4;
   }

   static {
      n5(w1.class, 0, 12, com.aspose.slides.internal.r1x.v4.t9());
      n5(u5.class, 3, 36, com.aspose.slides.internal.r1x.v4.t9());
      n5(e2.class, 2, 36, com.aspose.slides.internal.r1x.v4.t9());
      n5(z8.class, 0, 4);
      n5(j5.class, 0, com.aspose.slides.internal.r1x.v4.z1());
      n5(y2.class, 0, 8, com.aspose.slides.internal.r1x.v4.x8());
      n5(w1.class, 0, 8, com.aspose.slides.internal.r1x.v4.u3());
      n5(w1.class, 0, 8, com.aspose.slides.internal.r1x.v4.t9());
      n5(r4.class, 0, 8, com.aspose.slides.internal.r1x.v4.n5());
      n5(c4.class, 0, 8, com.aspose.slides.internal.r1x.v4.e2());
      n5(m3.class, 0, 16, com.aspose.slides.internal.r1x.v4.x8());
      n5(t4.class, 0, 16, com.aspose.slides.internal.r1x.v4.u3());
      n5(z3.class, 0, 16, com.aspose.slides.internal.r1x.v4.n5());
      n5(z1.class, 0, 16, com.aspose.slides.internal.r1x.v4.a6());
      n5(q0.class, 0, 16, com.aspose.slides.internal.r1x.v4.e2());
      n5(k7.class, 0, 16, com.aspose.slides.internal.r1x.v4.t9());
      n5(m1.class, 0, 16, com.aspose.slides.internal.r1x.v4.n3());
      n5(u5.class, 3, com.aspose.slides.internal.r1x.v4.t9());
      n5(c2.class, 3, com.aspose.slides.internal.r1x.v4.e2());
      n5(q1.class, 3, com.aspose.slides.internal.r1x.v4.u3());
      n5(w5.class, 3, com.aspose.slides.internal.r1x.v4.a6());
      n5(w8.class, 3, com.aspose.slides.internal.r1x.v4.n5());
      n5(t3.class, 3, com.aspose.slides.internal.r1x.v4.l6());
      n5(k8.class, 3, com.aspose.slides.internal.r1x.v4.n3());
      n5(y5.class, 3, com.aspose.slides.internal.r1x.v4.z1());
      n5(b5.class, 3, 2, 8);
      n5(b5.class, 3, 1, 8);
      n5(b5.class, 3, 4, 8);
      n5(b5.class, 3, 0, 8);
      n5(b5.class, 3, 3, 8);
      n5(b5.class, 3, 5, 8);
      n5(u3.class, 4, 1, 24);
      n5(k5.class, 4, 1, 16);
      n5(u9.class, 4, 1, 32);
      n5(c8.class, 4, 2, 32);
      n5(a6.class, 4, 2, 24);
      n5(n5.class, 4, 0, 16);
      n5(l6.class, 4, 0, 8);
      n5(t2.class, 4, 3);
      n5(u4.class, 5, 4);
      n5(p3.class, 2, 24, com.aspose.slides.internal.r1x.v4.a6());
      n5(a5.class, 1, 16, com.aspose.slides.internal.r1x.v4.t9());
      n5(x9.class, 2, 24, com.aspose.slides.internal.r1x.v4.u3());
      n5(y0.class, 2, 24, com.aspose.slides.internal.r1x.v4.n5());
      n5(j9.class, 2, 24, com.aspose.slides.internal.r1x.v4.e2());
      n5(v0.class, 2, 24, com.aspose.slides.internal.r1x.v4.l6());
      n5(a3.class, 2, 24, com.aspose.slides.internal.r1x.v4.n3());
      n5(f0.class, 2, 24, com.aspose.slides.internal.r1x.v4.z1());
      n5(z6.class, 2, 24, com.aspose.slides.internal.r1x.v4.x8());
      n5(y8.class, 2, 32, com.aspose.slides.internal.r1x.v4.h0());
      n5(c3.class, 2, 32, com.aspose.slides.internal.r1x.v4.a6());
      n5(l4.class, 2, 32, com.aspose.slides.internal.r1x.v4.u3());
      n5(a7.class, 2, 32, com.aspose.slides.internal.r1x.v4.n5());
      n5(i6.class, 2, 32, com.aspose.slides.internal.r1x.v4.t9());
      n5(d1.class, 2, 32, com.aspose.slides.internal.r1x.v4.l6());
      n5(h6.class, 2, 32, com.aspose.slides.internal.r1x.v4.n3());
      n5(s4.class, 2, 32, com.aspose.slides.internal.r1x.v4.z1());
      n5(r8.class, 2, 32, com.aspose.slides.internal.r1x.v4.x8());
      n5(u6.class, 1, 16, com.aspose.slides.internal.r1x.v4.s7());
      n5(u6.class, 1, 16, com.aspose.slides.internal.r1x.v4.t2());
      n5(u6.class, 1, 16, com.aspose.slides.internal.r1x.v4.c8());
      n5(u6.class, 1, 16, com.aspose.slides.internal.r1x.v4.h0());
      n5(t1.class, 1, 16, com.aspose.slides.internal.r1x.v4.u3());
      n5(h2.class, 1, 16, com.aspose.slides.internal.r1x.v4.n5());
      n5(v4.class, 1, 16, com.aspose.slides.internal.r1x.v4.l6());
      n5(o5.class, 1, 24, com.aspose.slides.internal.r1x.v4.s7());
      n5(o5.class, 1, 24, com.aspose.slides.internal.r1x.v4.t2());
      n5(o5.class, 1, 24, com.aspose.slides.internal.r1x.v4.c8());
      n5(o5.class, 1, 24, com.aspose.slides.internal.r1x.v4.h0());
      n5(j8.class, 1, 24, com.aspose.slides.internal.r1x.v4.a6());
      n5(s0.class, 1, 24, com.aspose.slides.internal.r1x.v4.n5());
      n5(v3.class, 1, 24, com.aspose.slides.internal.r1x.v4.x8());
      n5(n1.class, 1, 24, com.aspose.slides.internal.r1x.v4.l6());
      n5(e9.class, 1, 24, com.aspose.slides.internal.r1x.v4.n3());
      n5(w2.class, 1, 24, com.aspose.slides.internal.r1x.v4.t9());
      n5(v8.class, 1, 24, com.aspose.slides.internal.r1x.v4.e2());
      n5(j4.class, 1, 32, com.aspose.slides.internal.r1x.v4.s7());
      n5(j4.class, 1, 32, com.aspose.slides.internal.r1x.v4.t2());
      n5(j4.class, 1, 32, com.aspose.slides.internal.r1x.v4.c8());
      n5(j4.class, 1, 32, com.aspose.slides.internal.r1x.v4.h0());
      n5(i9.class, 1, 32, com.aspose.slides.internal.r1x.v4.a6());
      n5(f5.class, 1, 32, com.aspose.slides.internal.r1x.v4.u3());
      n5(j3.class, 1, 32, com.aspose.slides.internal.r1x.v4.x8());
      n5(n1.class, 1, 32, com.aspose.slides.internal.r1x.v4.l6());
      n5(g7.class, 1, 32, com.aspose.slides.internal.r1x.v4.n3());
      n5(l4.class, 1, 32, com.aspose.slides.internal.r1x.v4.t9());
      n5(a7.class, 1, 32, com.aspose.slides.internal.r1x.v4.e2());
      n5(e5.class, 1, 8, com.aspose.slides.internal.r1x.v4.h0());
      n5(e5.class, 1, 4, com.aspose.slides.internal.r1x.v4.c8());
      n5(e5.class, 1, 2, com.aspose.slides.internal.r1x.v4.t2());
      n5(e5.class, 1, 1, com.aspose.slides.internal.r1x.v4.s7());
      n5(o0.class, 1, 8, com.aspose.slides.internal.r1x.v4.c8());
      n5(o0.class, 1, 8, com.aspose.slides.internal.r1x.v4.t2());
      n5(o0.class, 1, 8, com.aspose.slides.internal.r1x.v4.s7());
      n5(o0.class, 1, 4, com.aspose.slides.internal.r1x.v4.t2());
      n5(o0.class, 1, 4, com.aspose.slides.internal.r1x.v4.s7());
      n5(o0.class, 1, 2, com.aspose.slides.internal.r1x.v4.s7());
      n5(b3.class, 1, 1, com.aspose.slides.internal.r1x.v4.t2());
      n5(b3.class, 1, 1, com.aspose.slides.internal.r1x.v4.c8());
      n5(b3.class, 1, 1, com.aspose.slides.internal.r1x.v4.h0());
      n5(b3.class, 1, 2, com.aspose.slides.internal.r1x.v4.c8());
      n5(b3.class, 1, 2, com.aspose.slides.internal.r1x.v4.h0());
      n5(b3.class, 1, 4, com.aspose.slides.internal.r1x.v4.h0());
      n5(a0.class, 1, 1, com.aspose.slides.internal.r1x.v4.z1());
      n5(a0.class, 1, 2, com.aspose.slides.internal.r1x.v4.z1());
      n5(a0.class, 1, 4, com.aspose.slides.internal.r1x.v4.z1());
      n5(a0.class, 1, 8, com.aspose.slides.internal.r1x.v4.z1());
      n5(d2.class, 1, 1, com.aspose.slides.internal.r1x.v4.a6());
      n5(d2.class, 1, 2, com.aspose.slides.internal.r1x.v4.a6());
      n5(d2.class, 1, 4, com.aspose.slides.internal.r1x.v4.a6());
      n5(d2.class, 1, 8, com.aspose.slides.internal.r1x.v4.a6());
      n5(d5.class, 1, 1, com.aspose.slides.internal.r1x.v4.u3());
      n5(d5.class, 1, 2, com.aspose.slides.internal.r1x.v4.u3());
      n5(d5.class, 1, 4, com.aspose.slides.internal.r1x.v4.u3());
      n5(d5.class, 1, 8, com.aspose.slides.internal.r1x.v4.u3());
      n5(s3.class, 1, 1, com.aspose.slides.internal.r1x.v4.t9());
      n5(s3.class, 1, 2, com.aspose.slides.internal.r1x.v4.t9());
      n5(s3.class, 1, 4, com.aspose.slides.internal.r1x.v4.t9());
      n5(s3.class, 1, 8, com.aspose.slides.internal.r1x.v4.t9());
      n5(p8.class, 1, 1, com.aspose.slides.internal.r1x.v4.n5());
      n5(p8.class, 1, 2, com.aspose.slides.internal.r1x.v4.n5());
      n5(p8.class, 1, 4, com.aspose.slides.internal.r1x.v4.n5());
      n5(p8.class, 1, 8, com.aspose.slides.internal.r1x.v4.n5());
      n5(i1.class, 1, 1, com.aspose.slides.internal.r1x.v4.e2());
      n5(i1.class, 1, 2, com.aspose.slides.internal.r1x.v4.e2());
      n5(i1.class, 1, 4, com.aspose.slides.internal.r1x.v4.e2());
      n5(i1.class, 1, 8, com.aspose.slides.internal.r1x.v4.e2());
      n5(e2.class, 2, 24, com.aspose.slides.internal.r1x.v4.u3());
   }
}
