package com.aspose.slides.internal.p0;

import com.aspose.slides.Collections.Generic.Dictionary;

public abstract class n5 {
   public static final z3 n5 = new t9();
   public static final z3 l6 = new a6();
   public static final z3 k5 = new y4();
   public static final z3 u3 = new q0();
   public static final z3 a6 = new z1();
   public static final z3 u9 = new u9();
   public static final z3 h0 = new x8();
   public static final z3 c8 = new k5();
   public static final z3 t2 = new l6();
   public static final z3 s7 = new t2();
   public static final z3 x8 = new m1();
   public static final z3 n3 = new h0();
   public static final z3 y4 = new c8();
   public static final e2 e2 = new s7();
   public static final e2 t9 = new t4();
   public static final e2 z1 = new u3();
   public static final e2 t4 = new n3();
   private static final Dictionary<com.aspose.slides.internal.v2.c8, n5> q0 = n5();
   private static final Dictionary<n5, com.aspose.slides.internal.v2.c8> z3 = l6();

   private static Dictionary<com.aspose.slides.internal.v2.c8, n5> n5() {
      Dictionary var0 = new Dictionary();
      var0.addItem(com.aspose.slides.internal.v2.c8.s7k, n5);
      var0.addItem(com.aspose.slides.internal.v2.c8.d7u, n5);
      var0.addItem(com.aspose.slides.internal.v2.c8.j3b, k5);
      var0.addItem(com.aspose.slides.internal.v2.c8.o9i, u3);
      var0.addItem(com.aspose.slides.internal.v2.c8.a1k, a6);
      var0.addItem(com.aspose.slides.internal.v2.c8.k5w, u9);
      var0.addItem(com.aspose.slides.internal.v2.c8.k4o, h0);
      var0.addItem(com.aspose.slides.internal.v2.c8.v4m, c8);
      var0.addItem(com.aspose.slides.internal.v2.c8.j3z, t2);
      var0.addItem(com.aspose.slides.internal.v2.c8.f4l, s7);
      var0.addItem(com.aspose.slides.internal.v2.c8.s5r, x8);
      var0.addItem(com.aspose.slides.internal.v2.c8.g5d, n3);
      var0.addItem(com.aspose.slides.internal.v2.c8.u0b, y4);
      var0.addItem(com.aspose.slides.internal.v2.c8.c4i, e2);
      var0.addItem(com.aspose.slides.internal.v2.c8.m2n, t9);
      var0.addItem(com.aspose.slides.internal.v2.c8.e2o, t4);
      var0.addItem(com.aspose.slides.internal.v2.c8.m0l, z1);
      return var0;
   }

   public static n5 n5(com.aspose.slides.internal.v2.s7 var0) {
      n5 var1 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.c8.class)) {
         com.aspose.slides.internal.v2.c8 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.v2.c8.class);
         var1 = q0.get_Item(var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.n5.class)) {
         com.aspose.slides.internal.v2.n5 var5 = (com.aspose.slides.internal.v2.n5)var0;

         for (int var3 = 0; var3 < var5.n5(); var3++) {
            com.aspose.slides.internal.v2.c8 var4 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(var3), com.aspose.slides.internal.v2.c8.class);
            if (var4 != null) {
               var1 = q0.get_Item(var4);
               if (var1 != null) {
                  break;
               }
            }
         }
      }

      return var1 != null ? var1 : n5;
   }

   private static Dictionary<n5, com.aspose.slides.internal.v2.c8> l6() {
      Dictionary var0 = new Dictionary();
      var0.addItem(n5, com.aspose.slides.internal.v2.c8.s7k);
      var0.addItem(l6, com.aspose.slides.internal.v2.c8.s7k);
      var0.addItem(k5, com.aspose.slides.internal.v2.c8.j3b);
      var0.addItem(u3, com.aspose.slides.internal.v2.c8.o9i);
      var0.addItem(a6, com.aspose.slides.internal.v2.c8.a1k);
      var0.addItem(u9, com.aspose.slides.internal.v2.c8.k5w);
      var0.addItem(h0, com.aspose.slides.internal.v2.c8.k4o);
      var0.addItem(c8, com.aspose.slides.internal.v2.c8.v4m);
      var0.addItem(t2, com.aspose.slides.internal.v2.c8.j3z);
      var0.addItem(s7, com.aspose.slides.internal.v2.c8.f4l);
      var0.addItem(x8, com.aspose.slides.internal.v2.c8.s5r);
      var0.addItem(n3, com.aspose.slides.internal.v2.c8.g5d);
      var0.addItem(y4, com.aspose.slides.internal.v2.c8.u0b);
      var0.addItem(e2, com.aspose.slides.internal.v2.c8.c4i);
      var0.addItem(t9, com.aspose.slides.internal.v2.c8.m2n);
      var0.addItem(t4, com.aspose.slides.internal.v2.c8.e2o);
      var0.addItem(z1, com.aspose.slides.internal.v2.c8.m0l);
      return var0;
   }
}
