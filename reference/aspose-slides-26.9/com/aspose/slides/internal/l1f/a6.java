package com.aspose.slides.internal.l1f;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.h0;
import com.aspose.slides.internal.r1x.m3;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.t6q.s7;
import com.aspose.slides.internal.u3r.t2;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.x8;

public class a6 {
   protected static final List<Integer> n5 = new List<>();

   public static com.aspose.slides.internal.v6s.u3 n5(byte[] var0, int var1) {
      com.aspose.slides.internal.v6s.u3 var2 = null;
      if (var0.length - var1 >= 4) {
         short var3 = (short)x8.u3(var0, var1);
         var1 += 2;
         int var4 = 0;
         int[] var5 = new int[]{0};
         boolean var6 = n5(var3, true, var5);
         var4 = var5[0];
         if (var6) {
            short var7;
            if (var4 == 19789) {
               var7 = h0.u3(var0, var1);
            } else {
               var7 = (short)x8.u3(var0, var1);
            }

            if (var7 != 42) {
               throw new com.aspose.slides.internal.z3b.a6("The EXIF header is unknown. Probably it is not a EXIF data format.");
            }

            var1 -= 2;
            var2 = com.aspose.slides.internal.v6s.k5.n5(var0, var1, var0.length - var1, var4);
         }
      }

      return var2;
   }

   public static boolean n5(short var0, boolean var1, int[] var2) {
      boolean var3 = true;
      if (var0 == 18761) {
         var2[0] = 18761;
      } else if (var0 == 19789) {
         var2[0] = 19789;
      } else {
         var2[0] = 0;
         var3 = false;
         if (var1) {
            throw new com.aspose.slides.internal.z3b.a6("The tiff header byte order is unknown. Probably it is not a tiff file format.");
         }
      }

      return var3;
   }

   public static com.aspose.slides.internal.v6s.u3 n5(v3 var0, boolean var1) {
      com.aspose.slides.internal.v6s.u3 var2 = null;
      byte[] var3 = new byte[4];
      synchronized (var0.n5()) {
         var0.n5(0L, 0);
         var0.n5(var3, 0, 4);
      }

      short var4 = (short)x8.u3(var3, 0);
      int var5 = 0;
      int[] var6 = new int[]{0};
      boolean var7 = n5(var4, var1, var6);
      var5 = var6[0];
      if (var7) {
         short var8;
         if (var5 == 19789) {
            var8 = h0.u3(var3, 2);
         } else {
            var8 = (short)x8.u3(var3, 2);
         }

         boolean var9 = true;
         if (var8 != 42) {
            var9 = false;
            if (var1) {
               throw new com.aspose.slides.internal.z3b.a6("The tiff header is unknown. Probably it is not a tiff file format.");
            }
         }

         if (var9) {
            synchronized (var0.n5()) {
               var0.n5(0L, 0);
               var2 = com.aspose.slides.internal.v6s.k5.l6(var0, var5);
            }
         }
      }

      return var2;
   }

   public static com.aspose.slides.internal.u2w.a6[] n5(com.aspose.slides.internal.v6s.u3 var0, long var1) {
      a6$l6 var3 = n5(var0, null, var1).n5();
      return var3.n5;
   }

   public static com.aspose.slides.internal.d0c.l6 n5(com.aspose.slides.internal.v6s.u3 var0) {
      long var1 = 4L;
      f0 var3 = null;
      var1 = var0.n5(var1) & 4294967295L;
      com.aspose.slides.internal.d0c.l6 var4 = null;
      if (var1 > 0L) {
         com.aspose.slides.internal.u2w.a6[] var5 = n5(var0, var1);
         long var6 = var1 + (var5.length * 12 + 2);
         int var8 = (int)var0.n5(var6);
         if (var8 != 0) {
            com.aspose.slides.internal.u2w.a6[] var9 = n5(var0, var8);
            boolean var10 = false;
            long var11 = 0L;
            long var13 = 0L;

            for (int var15 = 0; var15 < var9.length; var15++) {
               if ((var9[var15].l6() & 65535) == 259) {
                  y4 var16 = (y4)var9[var15];
                  if ((var16.y4()[0] & 65535) == 6) {
                     var10 = true;
                  }
               }

               if ((var9[var15].l6() & 65535) == 513) {
                  com.aspose.slides.internal.a3p.h0 var21 = (com.aspose.slides.internal.a3p.h0)var9[var15];
                  var11 = var21.y4()[0] & 4294967295L;
               }

               if ((var9[var15].l6() & 65535) == 514) {
                  com.aspose.slides.internal.a3p.h0 var22 = (com.aspose.slides.internal.a3p.h0)var9[var15];
                  var13 = var22.y4()[0] & 4294967295L;
               }
            }

            if (var10 && var11 > 0L && var13 > 0L) {
               byte[] var20 = var0.n5(var11, var13);
               var3 = (f0)m3.u3(new e2(var20));
            }
         }

         a6$n5 var18 = n5(var5, var0, var1, null);
         if (var18.u3()) {
            List var19 = new List();
            var19.addRange(com.aspose.slides.ms.System.u3.n5(var5));
            if (var18.n5() != null && var18.n5() != var5) {
               var19.addRange(com.aspose.slides.ms.System.u3.n5(var18.n5()));
            }

            var4 = new com.aspose.slides.internal.d0c.l6();
            var4.n5((com.aspose.slides.internal.u2w.a6[])var19.toArray(new com.aspose.slides.internal.u2w.a6[0]));
            var4.l6(var18.l6());
            var4.k5(var18.k5());
            var4.n5(var3);
         } else if (var5.length > 0) {
            var4 = new com.aspose.slides.internal.d0c.l6();
            var4.n5(var5);
            var4.n5(var3);
         }
      }

      return var4;
   }

   private static com.aspose.slides.internal.u2w.a6[] n5(
      com.aspose.slides.internal.u2w.a6[] var0, com.aspose.slides.internal.v6s.u3 var1, long var2, int var4, d2 var5
   ) {
      com.aspose.slides.internal.u2w.a6[] var6 = null;

      for (int var7 = var0.length - 1; var7 >= 0; var7--) {
         if ((var0[var7].l6() & 65535) == (var4 & 65535)) {
            com.aspose.slides.internal.u2w.a6 var8 = var0[var7];
            if ((var8.n5() & 4294967295L) != 1L && j8.n5(var8) != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.a3p.h0.class)) {
               break;
            }

            long var9 = com.aspose.slides.internal.v6g.k5.k5(var0[var7].h0(), long[].class)[0] & 4294967295L;
            if (var9 <= var1.n5()) {
               if (var9 == var2) {
                  var6 = var0;
               } else {
                  var6 = n5(var1, var5, var9).n5;
               }
            }
            break;
         }
      }

      return var6;
   }

   protected static s7 n5(com.aspose.slides.internal.u2w.a6[] var0) {
      short var1 = 700;
      com.aspose.slides.internal.u2w.a6 var2 = null;

      for (com.aspose.slides.internal.u2w.a6 var6 : var0) {
         if (var6.l6() == 700) {
            var2 = var6;
         }
      }

      s7 var11 = null;
      if (var2 != null && var2.h0() != null && com.aspose.slides.internal.v6g.k5.l6(var2.h0(), com.aspose.slides.ms.System.u3.class)) {
         e2 var12 = new e2(com.aspose.slides.internal.v6g.k5.k5(var2.h0(), byte[].class));

         try {
            com.aspose.slides.internal.c5i.n5 var13 = new com.aspose.slides.internal.c5i.n5(j5.z3());
            String var14 = var13.l6(var12, (int)var2.u9());
            t2 var7 = new t2(var14);
            var11 = var7.n5();
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }
      }

      return var11;
   }

   protected static a6$n5 n5(com.aspose.slides.internal.u2w.a6[] var0, com.aspose.slides.internal.v6s.u3 var1, long var2, d2 var4) {
      a6$n5 var5 = new a6$n5();
      com.aspose.slides.internal.u2w.a6[] var6 = n5(var0, var1, var2, 34665, var4);
      if (var6 != null) {
         if (var6 == var0) {
            var5.n5(var6);
         } else {
            var5.l6(var6);
         }
      }

      com.aspose.slides.internal.u2w.a6[] var7 = n5(var0, var1, var2, 34853, var4);
      if (var7 != null) {
         if (var7 == var0) {
            var5.n5(var7);
         } else {
            var5.k5(var7);
         }
      }

      return var5;
   }

   protected static a6$l6 n5(com.aspose.slides.internal.v6s.u3 var0, d2 var1, long var2) {
      long var4 = var0.l6(var2) & 65535;
      var2 += 2L;
      com.aspose.slides.internal.u2w.a6[] var6 = new com.aspose.slides.internal.u2w.a6[(int)(var4 & 4294967295L)];

      for (int var7 = 0; var7 < (var4 & 4294967295L); var7++) {
         try {
            var6[var7] = com.aspose.slides.internal.u2w.a6.n5(var0, var2);
         } catch (com.aspose.slides.internal.z3b.t2 var10) {
            if (var1 != null && var1.n5() != 0) {
               com.aspose.slides.internal.u2w.a6[] var9 = new com.aspose.slides.internal.u2w.a6[var7];
               System.arraycopy(var6, 0, var9, 0, var7);
               var6 = var9;
               break;
            }

            throw var10;
         }

         var2 += 12L;
      }

      a6$l6 var12 = new a6$l6();
      var12.l6 = var4 & 4294967295L;
      var12.n5 = var6;
      return var12;
   }

   protected static void n5(com.aspose.slides.internal.u2w.a6[] var0, byte[][] var1) {
      for (com.aspose.slides.internal.u2w.a6 var5 : var0) {
         if ((var5.l6() & 65535) == 347) {
            var1[0] = com.aspose.slides.internal.v6g.k5.k5(var5.h0(), byte[].class);
            return;
         }
      }
   }

   static {
      n5.addItem(5);
      n5.addItem(3);
      n5.addItem(2);
      n5.addItem(4);
      n5.addItem(7);
      n5.addItem(1);
      n5.addItem(32946);
      n5.addItem(8);
      n5.addItem(6);
      n5.addItem(32773);
      n5.sort();
   }
}
