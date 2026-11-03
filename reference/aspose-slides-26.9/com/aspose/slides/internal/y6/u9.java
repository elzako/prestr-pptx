package com.aspose.slides.internal.y6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.t1;
import com.aspose.slides.internal.i3.k7;
import com.aspose.slides.internal.i3.t9;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.k1.s7;
import com.aspose.slides.internal.k1.t2;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.l7h.m1;
import com.aspose.slides.internal.l7h.q0;
import com.aspose.slides.internal.n2d.x8;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.x9;

public class u9 {
   public static byte[] n5(t4 var0, String var1, com.aspose.slides.internal.z0k.t4 var2, int var3) {
      com.aspose.slides.internal.o9b.l6 var4 = null;
      if (var0 != null) {
         short var5 = 256;
         var4 = new com.aspose.slides.internal.o9b.l6(var5, var5, 2498570);
         z1 var6 = z1.n5(var4);

         try {
            var6.l6(new i1(com.aspose.slides.internal.o9b.c8.w4().o8()), new y2(0, 0, var5, var5));
            var6.n5(var0, new y2(0, 0, var5, var5), new y2(0, 0, var0.e2(), var0.h0()), 2);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }

      return n5(var4, var1, var2, null, null, var3);
   }

   public static byte[] n5(String var0, com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.z0k.t4 var2, int var3) {
      t2 var4 = null;
      t2 var5 = null;
      com.aspose.slides.internal.k3.k5 var6 = new com.aspose.slides.internal.k3.k5(var1);

      try {
         com.aspose.slides.internal.m0.n5 var7 = (com.aspose.slides.internal.m0.n5)var6.n5();
         IGenericEnumerator var8 = var7.n5().iterator();

         try {
            while (var8.hasNext()) {
               v4 var9 = (v4)var8.next();
               if (var9.t9() == 2881) {
                  t9 var10 = com.aspose.slides.internal.v6g.k5.n5(var9, t9.class);
                  if (var10.n3().n5().k5() == 1) {
                     var4 = var10.n3();
                  } else {
                     var5 = var10.n3();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return n5(null, var0, var2, var4, var5, var3);
   }

   public static byte[] n5(e2 var0, String[] var1) {
      var1[0] = "";
      List var2 = new List();
      List var3 = new List();
      com.aspose.slides.internal.k3.k5 var4 = new com.aspose.slides.internal.k3.k5(var0);

      try {
         s7 var5 = null;
         com.aspose.slides.internal.m0.n5 var6 = (com.aspose.slides.internal.m0.n5)var4.n5();
         IGenericEnumerator var7 = var6.n5().iterator();

         try {
            while (var7.hasNext()) {
               v4 var8 = (v4)var7.next();
               if (var8.t9() == 2881) {
                  t9 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, t9.class);
                  com.aspose.slides.internal.o9b.l6 var10 = var9.n3().l6((k5)null);
                  var2.addItem(var10);
               }

               com.aspose.slides.internal.i3.h0 var54 = com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.i3.h0.class);
               if (var54 != null) {
                  var5 = var54.n5();
               }

               if (var8.t9() == 2610) {
                  k7 var55 = com.aspose.slides.internal.v6g.k5.n5(var8, k7.class);
                  String var11;
                  if (var5 != null) {
                     var11 = com.aspose.slides.internal.r0.l6.n5(var5.s7(), var5.q0()).l6(var55.h0());
                  } else {
                     var11 = x8.n5(1252).l6(var55.h0());
                  }

                  if (!d1.n5(var11)) {
                     if (var11.charAt(var11.length() - 1) == 0) {
                        var11 = d1.l6(var11, 0, var11.length() - 1);
                     }

                     var3.addItem(var11);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      if (var3.size() <= 2) {
         List$Enumerator var47 = var3.iterator();

         try {
            while (var47.hasNext()) {
               String var50 = (String)var47.next();
               var1[0] = d1.n5(var1[0], var50);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var47, IDisposable.class)) {
               var47.dispose();
            }
         }
      }

      if (var2.size() <= 2 && var2.size() != 0) {
         e2 var49 = new e2();
         ((com.aspose.slides.internal.o9b.l6)var2.get_Item(var2.size() - 1)).n5(var49, com.aspose.slides.internal.j9e.x8.s7());
         List$Enumerator var52 = var2.iterator();

         try {
            while (var52.hasNext()) {
               com.aspose.slides.internal.o9b.l6 var53 = (com.aspose.slides.internal.o9b.l6)var52.next();
               var53.dispose();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var52, IDisposable.class)) {
               var52.dispose();
            }
         }

         return var49.toArray();
      } else {
         List$Enumerator var48 = var2.iterator();

         try {
            while (var48.hasNext()) {
               com.aspose.slides.internal.o9b.l6 var51 = (com.aspose.slides.internal.o9b.l6)var48.next();
               var51.dispose();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
               var48.dispose();
            }
         }

         return var0.toArray();
      }
   }

   public static byte[] l6(e2 var0, String[] var1) {
      var1[0] = "";
      List var2 = new List();
      List var3 = new List();
      com.aspose.slides.internal.k3.n5 var4 = new com.aspose.slides.internal.k3.n5(var0);

      try {
         com.aspose.slides.internal.d9.n5 var5 = (com.aspose.slides.internal.d9.n5)var4.n5();
         IGenericEnumerator var6 = var5.n5().iterator();

         try {
            while (var6.hasNext()) {
               s9 var7 = (s9)var6.next();
               if (var7.c4() == 114L) {
                  com.aspose.slides.internal.b9.n5 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.b9.n5.class);
                  com.aspose.slides.internal.o9b.l6 var9 = var8.z3().l6((k5)null);
                  var2.addItem(var9);
               }

               if (var7.c4() == 84L) {
                  t1 var28 = com.aspose.slides.internal.v6g.k5.n5(var7, t1.class);
                  String var29 = j5.z1().l6(var28.u9().c8());
                  var3.addItem(var29);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      if (var3.size() <= 2) {
         List$Enumerator var25 = var3.iterator();

         try {
            while (var25.hasNext()) {
               String var27 = (String)var25.next();
               var1[0] = d1.n5(var1[0], var27);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
               var25.dispose();
            }
         }
      }

      if (var2.size() == 1) {
         e2 var26 = new e2();
         ((com.aspose.slides.internal.o9b.l6)var2.get_Item(var2.size() - 1)).n5();
         ((com.aspose.slides.internal.o9b.l6)var2.get_Item(var2.size() - 1)).n5(var26, com.aspose.slides.internal.j9e.x8.s7());
         return var26.toArray();
      } else {
         return var0.toArray();
      }
   }

   private static byte[] n5(com.aspose.slides.internal.o9b.l6 var0, String var1, com.aspose.slides.internal.z0k.t4 var2, t2 var3, t2 var4, int var5) {
      List var6 = new List();
      com.aspose.slides.internal.i3.h0 var7 = null;
      t9 var8 = null;
      com.aspose.slides.internal.k3.k5 var9 = new com.aspose.slides.internal.k3.k5(var2);

      try {
         com.aspose.slides.internal.m0.n5 var10 = (com.aspose.slides.internal.m0.n5)var9.n5();
         List var11 = n5(var1, var10.z1().n5().t2());
         IGenericEnumerator var12 = var10.n5().iterator();

         try {
            while (var12.hasNext()) {
               v4 var13 = (v4)var12.next();
               t9 var14 = com.aspose.slides.internal.v6g.k5.n5(var13, t9.class);
               if (var14 != null) {
                  if (var0 != null) {
                     if (var14.n3().n5().k5() == 1) {
                        var8 = var14;
                     } else {
                        int var45 = var14.n3().u9().length;
                        t2 var46 = n5(var0);
                        var14.l6((var14.e2() & 4294967295L) + ((var46.u9().length - var45) / 2 & 4294967295L) & 4294967295L);
                        var14.n5(var46);
                        var14.n5(204L);
                        var14.u9((short)var0.e2());
                        var14.a6((short)var0.h0());
                     }
                  } else {
                     if (var14.n3().n5().k5() == 1) {
                        if (var3 == null) {
                           continue;
                        }

                        var14.n5(var3);
                     } else if (var4 != null) {
                        var14.n5(var4);
                     }

                     if (d1.n5(var1)) {
                        var14.c8((short)82);
                        var14.t2((short)96);
                        var14.u3((short)0);
                     }
                  }
               } else {
                  com.aspose.slides.internal.i3.h0 var15 = com.aspose.slides.internal.v6g.k5.n5(var13, com.aspose.slides.internal.i3.h0.class);
                  if (var15 != null) {
                     var7 = var15;
                  }

                  k7 var16 = com.aspose.slides.internal.v6g.k5.n5(var13, k7.class);
                  if (var16 != null) {
                     var6.addItem(var16);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }

         if (var11.size() == 0) {
            List$Enumerator var41 = var6.iterator();

            try {
               while (var41.hasNext()) {
                  k7 var44 = (k7)var41.next();
                  var10.n5().u3(var44);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
                  var41.dispose();
               }
            }
         } else {
            for (int var42 = 0; var42 < var11.size(); var42++) {
               n5((k7)var6.get_Item(var42), var7, (String)var11.get_Item(var42), var5);
            }

            if (var11.size() == 1) {
               var10.n5().u3((u3)var6.get_Item(1));
            }
         }

         if (var8 != null) {
            var10.n5().u3(var8);
         }

         e2 var43 = new e2();

         try {
            var10.a_(var43);
            return var43.toArray();
         } finally {
            if (var43 != null) {
               var43.dispose();
            }
         }
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   private static List<String> n5(String var0, int var1) {
      List var2 = new List();
      String var3 = "";
      float var4 = var1 + 2;
      float var5 = 0.0F;
      if (d1.n5(var0)) {
         return var2;
      }

      com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(200, 200);
      z1 var7 = z1.n5(var6);
      e5 var8 = new e5(e5.t2());
      var8.k5(var8.k5() | 2048);
      n3 var9 = new n3("Segoe UI", 8.0F);

      for (int var10 = 0; var10 < var0.length(); var10++) {
         var3 = d1.l6(var3, var0.charAt(var10));
         var5 = var7.n5(var3, var9, new w1(0.0F, 0.0F), var8).l6();
         if (var5 > var4) {
            if (d1.t2(var3, " ") && var2.size() == 0) {
               if (var0.charAt(var10) == ' ') {
                  var10--;
               } else {
                  while (var0.charAt(var10) != ' ') {
                     var10--;
                  }
               }
            } else {
               var10--;
            }

            if (var2.size() != 0) {
               var2.addItem(d1.l6(var3, 0, var10 - ((String)var2.get_Item(0)).length() - 1));
               break;
            }

            var2.addItem(d1.l6(var0, 0, var10 + 1));
            var3 = "";
            var5 = 0.0F;
         }
      }

      if (var2.size() == 0) {
         var2.addItem(var3);
      } else if (var2.size() == 1) {
         var2.addItem(var3);
      }

      return var2;
   }

   private static t2 n5(com.aspose.slides.internal.o9b.l6 var0) {
      t2 var1 = new t2();
      byte[] var2 = l6(var0);
      com.aspose.slides.internal.k1.a6 var3 = new com.aspose.slides.internal.k1.a6();
      var3.l6(24);
      var3.n5(40L);
      var3.n5(1);
      var3.k5(var0.e2());
      var3.u3(var0.h0());
      var3.k5(var2.length & 4294967295L);
      var1.n5(var3);
      var1.n5(new byte[0]);
      var1.l6(var2);
      return var1;
   }

   private static byte[] l6(com.aspose.slides.internal.o9b.l6 var0) {
      com.aspose.slides.internal.j9e.n5 var1 = null;

      try {
         var1 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
         int var2 = var1.a6() * var0.h0();
         byte[] var3 = new byte[var2];
         byte[] var4 = new byte[var2 / 4 * 3];
         x9 var5 = var1.u3();
         com.aspose.slides.internal.e3m.n5.n5(var5, var3, 0, var2);
         int var6 = 0;

         for (int var7 = var0.h0() - 1; var6 < var0.h0(); var7--) {
            for (int var8 = 0; var8 < var0.e2(); var8++) {
               var4[(var6 * var0.h0() + var8) * 3] = var3[(var7 * var0.h0() + var8) * 4];
               var4[(var6 * var0.h0() + var8) * 3 + 1] = var3[(var7 * var0.h0() + var8) * 4 + 1];
               var4[(var6 * var0.h0() + var8) * 3 + 2] = var3[(var7 * var0.h0() + var8) * 4 + 2];
            }

            var6++;
         }

         return var4;
      } finally {
         if (var1 != null) {
            var0.n5(var1);
         }
      }
   }

   private static void n5(k7 var0, com.aspose.slides.internal.i3.h0 var1, String var2, int var3) {
      byte var4 = 22;
      var0.n5(var2);
      j5 var5 = x8.n5(1252);
      if (var3 != 1252) {
         try {
            var0.n5(j5.n5(var3, q0.u3(), com.aspose.slides.internal.l7h.t2.u3()).u3(var2));
            var1.n5().u3(com.aspose.slides.internal.r0.l6.n5(var3));
         } catch (m1 var7) {
            var0.n5(var5.u3(var2));
         }
      } else {
         var0.n5(var5.u3(var2));
      }

      int var6 = var0.h0().length;
      var0.k5((short)var6);
      var0.l6(((var6 % 2 > 0 ? var6 + var4 + 1 : var6 + var4) & 4294967295L) / 2L & 4294967295L);
   }
}
