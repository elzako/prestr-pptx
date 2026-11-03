package com.aspose.slides.internal.b8n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.w0.n3;
import com.aspose.slides.internal.w0.y4;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.z3;

public class u9 {
   private static final com.aspose.slides.internal.x7n.l6 n5 = new com.aspose.slides.internal.x7n.l6("en-US");
   private com.aspose.slides.internal.d8v.n5 l6 = new com.aspose.slides.internal.d8v.n5();
   private Dictionary<String, Integer> k5 = new Dictionary<>();
   private boolean u3;
   private h0 a6;

   private String n5(String var1) {
      int var2 = 0;
      if (this.k5.containsKey(var1)) {
         var2 = this.k5.get_Item(var1) + 1;
         this.k5.set_Item(var1, var2);
      } else {
         this.k5.addItem(var1, var2);
      }

      return d1.n5("{0}_{1}",new Object[]{ var1, var2});
   }

   public static String n5(w1[] var0, boolean var1) {
      u9 var2 = new u9();
      return var2.n5(var0[0], var1);
   }

   private String n5(w1 var1, boolean var2) {
      com.aspose.slides.internal.x7n.l6 var3 = null;

      try {
         var3 = com.aspose.slides.internal.r5t.t2.n5().u9();
         com.aspose.slides.internal.r5t.t2.n5().n5(new com.aspose.slides.internal.x7n.l6("en-US"));
         if (var2) {
            u9$n5 var4 = new u9$n5(null);
            var4.l6(var1);
         }

         float var18 = var1.u3();
         float var5 = var1.a6();
         if (var18 < 300.0F) {
            var18 = 600.0F;
         }

         if (var5 < 300.0F) {
            var5 = 300.0F;
         }

         com.aspose.slides.internal.d8v.a6 var6 = new com.aspose.slides.internal.d8v.a6();
         var6.h0(this.n5("body_"));
         if (this.u3) {
            var6.n5(new com.aspose.slides.internal.b3z.s7(0.0F, 0.0F, var18, var5));
            var6.n5(new com.aspose.slides.internal.b3z.k5(1));
         } else {
            var6.u3(com.aspose.slides.internal.b3z.a6.k5(var18));
            var6.a6(com.aspose.slides.internal.b3z.a6.k5(var5));
            var6.n5(new com.aspose.slides.internal.b3z.s7(0.0F, 0.0F, var1.l6(), var1.k5()));
         }

         List var7 = new List();

         for (int var8 = 0; var8 < var1.t2(); var8++) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(var8), com.aspose.slides.internal.e1.t2.class)) {
               com.aspose.slides.internal.e1.t2 var9 = (com.aspose.slides.internal.e1.t2)var1.n5(var8);
               var7.addItem(this.n5(var1, var9));
            }
         }

         if (this.l6.m1()) {
            var6.n5(this.l6);
         }

         List$Enumerator var19 = var7.iterator();

         try {
            while (var19.hasNext()) {
               com.aspose.slides.internal.d0e.a6 var20 = (com.aspose.slides.internal.d0e.a6)var19.next();
               var6.n5(var20);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
               var19.dispose();
            }
         }

         return com.aspose.slides.internal.n1n.u3.n5(var6);
      } finally {
         this.k5 = new Dictionary<>();
         this.l6 = new com.aspose.slides.internal.d8v.n5();
         if (var3 != null) {
            com.aspose.slides.internal.r5t.t2.n5().n5(var3);
         }
      }
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, y1 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(z3.h0(var1.s7()), z3.h0(var1.k5()));
      z1 var3 = z1.n5(var2);
      var3.n5(var0, -var1.x8(), -var1.n3());
      return var2;
   }

   private com.aspose.slides.internal.d8v.k5 n5(k7 var1) {
      t4 var2 = t4.n5(new e2(var1.u3()));
      com.aspose.slides.internal.o9b.l6 var3 = null;

      try {
         if (!x8.n3().equals(var2.x8()) && !x8.u3().equals(var2.x8())) {
            var3 = (com.aspose.slides.internal.o9b.l6)var2;
         } else {
            var3 = new com.aspose.slides.internal.o9b.l6(var2, var2.e2(), var2.h0());
         }

         y1 var4 = new y1(var1.n5().u3(), var1.l6().a6());
         byte[] var11;
         if (var1.h0() != null && !var1.h0().n5()) {
            com.aspose.slides.internal.s5.c8 var20 = var1.h0();
            int var6 = 2;
            int[] var7 = new int[]{2};
            y1 var8 = var2.n5(var7).y4();
            var6 = var7[0];
            var20.n5(var8.y4()).a6(var8);
            com.aspose.slides.internal.o9b.l6 var9 = n5(var3, var8.y4());

            try {
               e2 var10 = new e2();
               var9.n5(var10, x8.s7());
               var11 = var10.toArray();
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         } else if (x8.s7().equals(var2.x8())) {
            var11 = var1.u3();
         } else {
            e2 var5 = new e2();
            var3.n5(var5, x8.s7());
            var11 = var5.toArray();
         }

         return this.n5(var11, var4.y4());
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private com.aspose.slides.internal.d8v.l6 n5(w1 var1, com.aspose.slides.internal.e1.t2 var2) {
      com.aspose.slides.internal.d8v.l6 var3 = new com.aspose.slides.internal.d8v.l6();
      if (var2.u3() != null) {
         var3.t2(d1.n5("matrix({0})", new Object[]{var2.u3()}));
      }

      if (var2.a6() != null) {
         com.aspose.slides.internal.u3t.n5 var4 = this.n5(var1, var2.a6());
         var3.c8(d1.n5("url(#{0})", new Object[]{var4.k7()}));
      }

      for (int var5 = 0; var5 < var2.t2(); var5++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(var5), com.aspose.slides.internal.e1.a6.class)) {
            var3.n5(n5(var5, (com.aspose.slides.internal.e1.a6)var2.n5(var5)));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(var5), r4.class)) {
            var3.n5(this.n5(var1, (r4)var2.n5(var5), true, false));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(var5), y2.class)) {
            var3.n5(l6((y2)var2.n5(var5)));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(var5), com.aspose.slides.internal.e1.z1.class)) {
            var3.n5(this.n5((com.aspose.slides.internal.e1.z1)var2.n5(var5)));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(var5), com.aspose.slides.internal.e1.t2.class)) {
            var3.n5(this.n5(var1, (com.aspose.slides.internal.e1.t2)var2.n5(var5)));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(var5), k7.class)) {
            var3.n5(this.n5((k7)var2.n5(var5)));
         }
      }

      return var3;
   }

   private com.aspose.slides.internal.u3t.n5 n5(w1 var1, r4 var2) {
      com.aspose.slides.internal.u3t.n5 var3 = new com.aspose.slides.internal.u3t.n5();
      var3.h0(this.n5("clipPath"));
      com.aspose.slides.internal.z9u.l6 var4 = this.n5(var1, var2, false, true);
      var3.n5(var4);
      this.l6.n5(var3);
      return var3;
   }

   private static com.aspose.slides.internal.z9u.l6 n5(int var0, com.aspose.slides.internal.e1.a6 var1) {
      com.aspose.slides.internal.z9u.l6 var2 = new com.aspose.slides.internal.z9u.l6();
      var2.k5("black");
      var2.s7(l6(var0, var1));
      return var2;
   }

   private static String l6(int var0, com.aspose.slides.internal.e1.a6 var1) {
      a5 var2 = new a5();
      if (var0 == 0) {
         var2.n5("M{0} {1}", var1.n5().n5().l6(), var1.n5().n5().k5());
      }

      var2.n5(
         "C{0} {1} {2} {3} {4} {5}",
         var1.n5().l6().l6(),
         var1.n5().l6().k5(),
         var1.n5().k5().l6(),
         var1.n5().k5().k5(),
         var1.n5().u3().l6(),
         var1.n5().u3().k5()
      );
      return var2.toString();
   }

   private com.aspose.slides.internal.z9u.l6 n5(w1 var1, r4 var2, boolean var3, boolean var4) {
      com.aspose.slides.internal.z9u.l6 var5 = new com.aspose.slides.internal.z9u.l6();
      if (var4) {
         var5.a6(0);
      }

      if (var2.a6() != null) {
         com.aspose.slides.internal.u3t.n5 var6 = this.n5(var1, var2.a6());
         var5.c8(d1.n5("url(#{0})", new Object[]{var6.k7()}));
      }

      String var7 = n5(var2);
      var5.s7(var7);
      if (var2.u3() != null) {
         var5.t2(d1.n5("matrix({0})", new Object[]{var2.u3()}));
      }

      if (var3) {
         this.n5(var2.l6(), var2.k5(), var2.h0(), var5);
      }

      return var5;
   }

   private void n5(com.aspose.slides.internal.w0.s7 var1, com.aspose.slides.internal.w0.l6 var2, int var3, com.aspose.slides.internal.d0e.a6 var4) {
      if (var1 != null && var1.u9() != null && ((n3)var1.u9()).l6() != null) {
         com.aspose.slides.internal.b3z.u3 var5 = new com.aspose.slides.internal.b3z.u3(((n3)var1.u9()).l6().n5().o8());
         float var6 = (var5.n5().s7() & 0xFF) / 255.0F;
         var4.k5(var5.toString());
         var4.n5(com.aspose.slides.internal.b3z.a6.k5(var1.l6()));
         if (var6 < 1.0F) {
            var4.n5(var6);
         }

         var4.n5(com.aspose.slides.internal.b3z.h0.l6(var1.k5()));
         if (var1.x8().length > 0) {
            com.aspose.slides.internal.b3z.u9 var7 = new com.aspose.slides.internal.b3z.u9();

            for (int var8 = 0; var8 < var1.x8().length; var8++) {
               var7.addItem(com.aspose.slides.internal.b3z.a6.k5(var1.x8()[var8]));
            }

            var4.n5(var7);
         }
      } else {
         var4.k5("none");
      }

      if (var2 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, n3.class)) {
            com.aspose.slides.internal.p1s.n5 var9 = ((n3)var2).l6();
            com.aspose.slides.internal.b3z.u3 var12 = new com.aspose.slides.internal.b3z.u3(var9.n5().o8());
            float var15 = (var12.n5().s7() & 0xFF) / 255.0F;
            var4.u3(var12.toString());
            var4.l6(var15);
            var4.u9(com.aspose.slides.internal.a3s.l6.l6(var3));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.w0.h0.class)) {
            com.aspose.slides.internal.w0.h0 var10 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.w0.h0.class);
            com.aspose.slides.internal.w5i.l6 var13 = this.n5(var10);
            var4.u3(d1.n5("url(#{0})", new Object[]{var13.k7()}));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, y4.class)) {
            y4 var11 = com.aspose.slides.internal.v6g.k5.n5(var2, y4.class);
            com.aspose.slides.internal.w5i.u3 var14 = this.n5(var11);
            var4.u3(d1.n5("url(#{0})", new Object[]{var14.k7()}));
         }
      } else {
         var4.u3("none");
      }
   }

   private com.aspose.slides.internal.w5i.u3 n5(y4 var1) {
      com.aspose.slides.internal.w5i.u3 var2 = new com.aspose.slides.internal.w5i.u3();
      var2.h0(this.n5("pattern"));
      com.aspose.slides.internal.k4d.u3 var3 = com.aspose.slides.internal.k4d.a6.z3(var1.l6());
      y1 var4 = new y1(0.0F, 0.0F, var3.n5(), var3.l6());
      var2.s7(d1.n5("matrix({0})", new Object[]{var1.n3()}));
      var2.u3(com.aspose.slides.internal.b3z.a6.k5(var4.s7()));
      var2.a6(com.aspose.slides.internal.b3z.a6.k5(var4.k5()));
      var2.h0(0);
      com.aspose.slides.internal.d8v.k5 var5 = this.n5(var1.l6(), var4.y4());
      var2.n5(var5);
      this.l6.n5(var2);
      return var2;
   }

   private com.aspose.slides.internal.d8v.k5 n5(byte[] var1, y1 var2) {
      com.aspose.slides.internal.d8v.k5 var3 = new com.aspose.slides.internal.d8v.k5();
      var3.h0(this.n5("svg_img"));
      var3.l6(com.aspose.slides.internal.b3z.a6.k5(var2.x8()));
      var3.k5(com.aspose.slides.internal.b3z.a6.k5(var2.n3()));
      var3.u3(com.aspose.slides.internal.b3z.a6.k5(var2.s7()));
      var3.a6(com.aspose.slides.internal.b3z.a6.k5(var2.k5()));
      if (this.a6 != null) {
         var3.s7(this.a6.n5(var1, 1, d1.n5(new String[]{var3.k7(), ".png"})));
      } else {
         var3.s7(d1.n5(new String[]{"data:image/png;base64,", z3.n5(var1)}));
      }

      return var3;
   }

   private com.aspose.slides.internal.w5i.l6 n5(com.aspose.slides.internal.w0.h0 var1) {
      com.aspose.slides.internal.w5i.l6 var2 = new com.aspose.slides.internal.w5i.l6();
      var2.h0(this.n5("lgrad"));
      if (!var1.s7().n5() && !var1.x8().n5()) {
         var2.l6(com.aspose.slides.internal.b3z.a6.k5(var1.s7().l6()));
         var2.k5(com.aspose.slides.internal.b3z.a6.k5(var1.s7().k5()));
         var2.u3(com.aspose.slides.internal.b3z.a6.k5(var1.x8().l6()));
         var2.a6(com.aspose.slides.internal.b3z.a6.k5(var1.x8().k5()));
      } else {
         var2.l6(com.aspose.slides.internal.b3z.a6.k5(var1.a6().x8()));
         var2.k5(com.aspose.slides.internal.b3z.a6.k5(var1.a6().n3()));
         var2.u3(com.aspose.slides.internal.b3z.a6.k5(var1.a6().h0()));
         var2.a6(com.aspose.slides.internal.b3z.a6.k5(var1.a6().t2()));
      }

      var2.t2(d1.n5("matrix({0})", new Object[]{var1.n3()}));
      var2.n5(n5(0.0F, new com.aspose.slides.internal.b3z.u3(var1.u9().n5().o8())));
      var2.n5(n5(100.0F, new com.aspose.slides.internal.b3z.u3(var1.h0().n5().o8())));
      this.l6.n5(var2);
      return var2;
   }

   private static com.aspose.slides.internal.w5i.u9 n5(float var0, com.aspose.slides.internal.b3z.u3 var1) {
      com.aspose.slides.internal.w5i.u9 var2 = new com.aspose.slides.internal.w5i.u9();
      var2.k5(var0);
      var2.n5(var1);
      float var3 = (var1.n5().s7() & 0xFF) / 255.0F;
      if (var3 < 1.0F) {
         var2.u3(var3);
      }

      return var2;
   }

   private static String n5(r4 var0) {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < var0.t2(); var2++) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0.n5(var2), c4.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0.n5(var2), com.aspose.slides.internal.e1.a6.class)) {
               var1.n5(l6(var2, (com.aspose.slides.internal.e1.a6)var0.n5(var2)));
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var0.n5(var2), y2.class)) {
               var1.n5(n5(var2, (y2)var0.n5(var2)));
            }
         } else {
            c4 var3 = (c4)var0.n5(var2);

            for (int var4 = 0; var4 < var3.t2(); var4++) {
               if (com.aspose.slides.internal.v6g.k5.l6(var3.n5(var4), com.aspose.slides.internal.e1.a6.class)) {
                  var1.n5(l6(var4, (com.aspose.slides.internal.e1.a6)var3.n5(var4)));
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var3.n5(var4), y2.class)) {
                  var1.n5(n5(var4, (y2)var3.n5(var4)));
               }
            }

            if (var3.n5()) {
               var1.n5("z");
            }
         }
      }

      return var1.toString();
   }

   private static String n5(y2 var0) {
      a5 var1 = new a5(d1.n5);

      for (int var2 = 0; var2 < var0.n5().size(); var2++) {
         com.aspose.slides.internal.o9b.w1 var3 = var0.n5().get_Item(var2).u3();
         var1.n5(d1.n5("{0},{1},",new Object[]{ n1.n5(var3.l6(), n5), n1.n5(var3.k5(), n5)}));
      }

      return var1.toString();
   }

   private static com.aspose.slides.internal.i1k.a6 l6(y2 var0) {
      com.aspose.slides.internal.i1k.a6 var1 = new com.aspose.slides.internal.i1k.a6();
      var1.k5("black");
      var1.s7(n5(var0));
      return var1;
   }

   private com.aspose.slides.internal.j7h.k5 n5(com.aspose.slides.internal.e1.z1 var1) {
      com.aspose.slides.internal.j7h.k5 var2 = new com.aspose.slides.internal.j7h.k5();
      var2.l6(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(var1.s7().l6())));
      var2.k5(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(var1.s7().k5())));
      var2.t2(d1.n5("matrix({0})", new Object[]{var1.u3()}));
      var2.s7(var1.l6().h0());
      if (var1.l6().k5()) {
         var2.h0(700);
      }

      if (var1.l6().u3()) {
         var2.c8(1);
      }

      var2.k5(com.aspose.slides.internal.b3z.a6.k5(var1.l6().c8()));
      this.n5(null, new n3(var1.k5()), 0, var2);
      var2.n5(new com.aspose.slides.internal.j7h.n5(var1.x8()));
      return var2;
   }

   private static String n5(int var0, y2 var1) {
      a5 var2 = new a5();

      for (int var3 = 0; var3 < var1.n5().size(); var3++) {
         com.aspose.slides.internal.o9b.w1 var4 = var1.n5().get_Item(var3).u3();
         if (var0 == 0 && var3 == 0) {
            var2.n5("M{0} {1}", var4.l6(), var4.k5());
         } else {
            var2.n5("L{0} {1}", var4.l6(), var4.k5());
         }
      }

      return var2.toString();
   }
}
