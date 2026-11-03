package com.aspose.slides.internal.n7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.i0.a5;
import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.internal.i0.c3;
import com.aspose.slides.internal.i0.c4;
import com.aspose.slides.internal.i0.c8;
import com.aspose.slides.internal.i0.d1;
import com.aspose.slides.internal.i0.d2;
import com.aspose.slides.internal.i0.d5;
import com.aspose.slides.internal.i0.e5;
import com.aspose.slides.internal.i0.e9;
import com.aspose.slides.internal.i0.g7;
import com.aspose.slides.internal.i0.h2;
import com.aspose.slides.internal.i0.i1;
import com.aspose.slides.internal.i0.i9;
import com.aspose.slides.internal.i0.j8;
import com.aspose.slides.internal.i0.j9;
import com.aspose.slides.internal.i0.l4;
import com.aspose.slides.internal.i0.m3;
import com.aspose.slides.internal.i0.o0;
import com.aspose.slides.internal.i0.o5;
import com.aspose.slides.internal.i0.p3;
import com.aspose.slides.internal.i0.r4;
import com.aspose.slides.internal.i0.s0;
import com.aspose.slides.internal.i0.s3;
import com.aspose.slides.internal.i0.t1;
import com.aspose.slides.internal.i0.u9;
import com.aspose.slides.internal.i0.v0;
import com.aspose.slides.internal.i0.x9;
import com.aspose.slides.internal.i0.y0;
import com.aspose.slides.internal.i0.y1;
import com.aspose.slides.internal.i0.y2;
import com.aspose.slides.internal.i0.z1;
import com.aspose.slides.internal.i0.z7;
import com.aspose.slides.internal.i0.z8;
import com.aspose.slides.internal.l5.e2;
import com.aspose.slides.internal.l5.h0;
import com.aspose.slides.internal.l5.n3;
import com.aspose.slides.internal.l5.t2;
import com.aspose.slides.internal.l5.x8;
import com.aspose.slides.internal.l5.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.q1;

public class k5 {
   public static s0[] n5(w1[] var0) {
      if (var0 == null) {
         return null;
      }

      s0[] var1 = new s0[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new s0(var0[var2].u3());
      }

      return var1;
   }

   public static p3 n5(s7 var0) {
      if (var0 == null) {
         return null;
      }

      p3 var1 = new p3();
      if (var0.u3().n5().length == 0) {
         var1.n5(0L);
         var1.n5(new s0[0]);
         var1.n5((short)0);
         var1.l6(new j9[0]);
         return var1;
      }

      w1[] var2 = var0.a6();
      byte[] var3 = var0.u9();
      var1.n5(var2.length & 4294967295L);
      var1.n5(n5(var2));
      j9[] var4 = new j9[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         j9 var6 = new j9();
         var6.n5(var3[var5] & 255);
         var4[var5] = var6;
      }

      var1.l6(var4);
      if (var0.k5() == 1) {
         var1.n5((short)n5(var1.l6(), 13, true));
      }

      return var1;
   }

   public static e9 n5(n3 var0) {
      o5 var1 = new o5();
      var1.n5(128L);
      j8 var2 = new j8();
      if (!var0.z1().l6()) {
         var2.n5(n5(var0.z1()));
      }

      var2.n5(var0.t9() & 4294967295L);
      var2.l6(var0.n3() & 4294967295L);
      var2.n5(var0.y4());
      var2.n5(var0.e2());
      var2.l6(var0.x8());
      var2.k5(var0.c8());
      var2.l6(var0.t2());
      if (var0.x8() == 5 && var0.s7().length > 0) {
         var2.n5(new d2());
         var2.s7().n5(var0.s7());
         var2.s7().n5(var0.s7().length & 4294967295L);
         var1.n5(var1.n5() | 256L);
      }

      var2.u3(var0.l6());
      if (var0.a6().length > 0) {
         var2.n5(new m3());
         var2.n3().n5(var0.a6());
         var2.n3().n5(var0.a6().length);
      }

      if (var0.t9() == 255) {
         var2.n5(n5(var0.h0()));
         var1.n5(var1.n5() | 2L);
         var1.n5(var1.n5() | 2048L);
      }

      if (var0.n3() == 255) {
         var2.n5(l6(var0.u9()));
         var1.n5(var1.n5() | 4L);
         var1.n5(var1.n5() | 4096L);
      }

      if (var0.l6() != 0) {
         var1.n5(var1.n5() | 512L);
      }

      if (var0.a6().length > 0) {
         var1.n5(var1.n5() | 1024L);
      }

      if (var0.x8() != 0 && var0.x8() != 5) {
         var1.n5(var1.n5() | 32L);
      }

      if (var0.c8() != 0) {
         var1.n5(var1.n5() | 64L);
      }

      if (var0.n3() != 0) {
         var1.n5(var1.n5() | 4L);
      }

      if (var0.t9() != 0) {
         var1.n5(var1.n5() | 2L);
      }

      if (var0.y4() != 0) {
         var1.n5(var1.n5() | 8L);
      }

      if (q1.n5(var0.e2() - 10.0F) > 0.001) {
         var1.n5(var1.n5() | 16L);
      }

      var1.n5(0);
      var1.n5(var0.t4());
      var1.n5(var2);
      e9 var3 = new e9();
      var3.n5(var1);
      var3.n5(n5(var0.k5()));
      return var3;
   }

   public static z1 n5(com.aspose.slides.internal.l5.l6 var0) {
      z1 var1 = new z1();
      var1.n5(l6(var0));
      switch ((int)var1.l6()) {
         case 0:
            var1.n5(n5((y4)var0));
            break;
         case 1:
            var1.n5(n5((h0)var0));
            break;
         case 2:
            var1.n5(n5((e2)var0));
            break;
         case 3:
            var1.n5(n5((x8)var0));
            break;
         case 4:
            var1.n5(n5((com.aspose.slides.internal.l5.s7)var0));
      }

      return var1;
   }

   public static i9 n5(a0 var0) {
      com.aspose.slides.internal.x4g.w1 var1 = var0.k5();
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(new com.aspose.slides.internal.z0k.e2(var1.n5()));
      int var3 = var2.m3();
      int var4 = var2.m3();
      com.aspose.slides.internal.i8.j9 var5 = new com.aspose.slides.internal.i8.j9();
      return (i9)var5.n5(var2);
   }

   public static z7 n5(t2 var0) {
      z7 var1 = new z7();
      var1.n5(0);
      var1.n5(var0.n5() & 4294967295L);
      var1.n5(new com.aspose.slides.internal.i0.n5(var0.l6().o8()));
      var1.l6(0);
      var1.k5(0);
      return var1;
   }

   private static com.aspose.slides.internal.i0.a0 n5(com.aspose.slides.internal.l5.k5 var0) {
      if (var0 != null) {
         com.aspose.slides.internal.i0.a0 var1 = new com.aspose.slides.internal.i0.a0();
         var1.n5(new r4());
         var1.n5().n5(new i1());
         com.aspose.slides.internal.l5.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.l5.n5.class);
         if (var2 != null) {
            var1.n5().n5(1);
            c4 var3 = new c4();
            var3.n5(var2.u3());
            var3.l6(var2.l6());
            var3.k5(var2.k5());
            var3.n5(var2.n5());
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[]{0};
            int[] var7 = new int[]{0};
            var2.n5(var6, var7);
            var4 = var6[0];
            var5 = var7[0];
            var3.n5(var4 & 4294967295L);
            var3.l6(var5 & 4294967295L);
            var3.n5(var2.h0());
            var3.u3(10.0F);
            var3.a6(var2.c8());
            var3.n5(new s0());
            var3.l6(new s0());
            var1.n5().n5(var3);
         } else {
            var1.n5().n5(0);
            y2 var9 = new y2();
            var9.l6(var0.a6() & 4294967295L);
            var9.n5(var0.u9());
            int var11 = 0;
            int var14 = 0;
            int[] var16 = new int[]{0};
            int[] var17 = new int[]{0};
            var0.n5(var16, var17);
            var11 = var16[0];
            var14 = var17[0];
            var9.k5(var11 & 4294967295L);
            var9.u3(var14 & 4294967295L);
            var9.n5(var0.h0());
            var9.l6(10.0F);
            var9.k5(var0.c8());
            var9.n5(new s0());
            var9.l6(new s0());
            var9.n5(new y1());
            if (var0.t2() != null) {
               d5 var8 = new d5();
               var8.n5(n5(var0.t2()));
               var8.n5(var8.n5().u9());
               var9.n3().n5(var8);
               var9.n5(var9.n5() | 1L);
            }

            if (var0.s7() != null) {
               t1 var18 = new t1();
               var18.n5(n5(var0.s7()));
               var18.n5(var18.l6().u9());
               var9.n3().n5(var18);
               var9.n5(var9.n5() | 2L);
            }

            var1.n5().n5(var9);
         }

         var1.n5(var1.n5().u9() & 4294967295L);
         return var1;
      } else {
         return null;
      }
   }

   private static com.aspose.slides.internal.i0.w1 l6(com.aspose.slides.internal.l5.k5 var0) {
      if (var0 != null) {
         com.aspose.slides.internal.i0.w1 var1 = new com.aspose.slides.internal.i0.w1();
         var1.n5(new r4());
         var1.n5().n5(new i1());
         com.aspose.slides.internal.l5.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.l5.n5.class);
         if (var2 != null) {
            var1.n5().n5(1);
            c4 var3 = new c4();
            var3.n5(var2.u3());
            var3.l6(var2.l6());
            var3.k5(var2.k5());
            var3.n5(var2.n5());
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[]{0};
            int[] var7 = new int[]{0};
            var2.n5(var6, var7);
            var4 = var6[0];
            var5 = var7[0];
            var3.n5(var4 & 4294967295L);
            var3.l6(var5 & 4294967295L);
            var3.n5(var2.h0());
            var3.u3(10.0F);
            var3.a6(var2.c8());
            var3.n5(new s0());
            var3.l6(new s0());
            var1.n5().n5(var3);
         } else {
            var1.n5().n5(0);
            y2 var9 = new y2();
            var9.l6(var0.a6() & 4294967295L);
            var9.n5(var0.u9());
            int var11 = 0;
            int var14 = 0;
            int[] var16 = new int[]{0};
            int[] var17 = new int[]{0};
            var0.n5(var16, var17);
            var11 = var16[0];
            var14 = var17[0];
            var9.k5(var11 & 4294967295L);
            var9.u3(var14 & 4294967295L);
            var9.n5(var0.h0());
            var9.l6(10.0F);
            var9.k5(var0.c8());
            var9.n5(new s0());
            var9.l6(new s0());
            var9.n5(new y1());
            if (var0.t2() != null) {
               d5 var8 = new d5();
               var8.n5(n5(var0.t2()));
               var8.n5(var8.n5().u9());
               var9.n3().n5(var8);
               var9.n5(var9.n5() | 1L);
            }

            if (var0.s7() != null) {
               t1 var18 = new t1();
               var18.n5(n5(var0.s7()));
               var18.n5(var18.l6().u9());
               var9.n3().n5(var18);
               var9.n5(var9.n5() | 2L);
            }

            var1.n5().n5(var9);
         }

         var1.n5(var1.n5().u9());
         return var1;
      } else {
         return null;
      }
   }

   public static a7 n5(m1 var0) {
      a7 var1 = new a7();
      var1.n5(var0.n5()[0]);
      var1.l6(var0.n5()[1]);
      var1.k5(var0.n5()[2]);
      var1.u3(var0.n5()[3]);
      var1.a6(var0.n5()[4]);
      var1.u9(var0.n5()[5]);
      return var1;
   }

   private static d1 n5(y4 var0) {
      d1 var1 = new d1();
      var1.n5(new com.aspose.slides.internal.i0.n5(var0.l6().o8()));
      return var1;
   }

   private static e5 n5(h0 var0) {
      e5 var1 = new e5();
      var1.l6(new com.aspose.slides.internal.i0.n5(var0.k5().o8()));
      var1.n5(new com.aspose.slides.internal.i0.n5(var0.l6().o8()));
      var1.n5(var0.u3() & 4294967295L & 4294967295L);
      return var1;
   }

   private static c3 n5(e2 var0) {
      c3 var1 = new c3();
      l4 var2 = new l4();
      if (!var0.l6().l6()) {
         var2.n5(n5(var0.l6()));
         var1.n5(var1.n5() | 2L);
      }

      var2.n5(n5(new com.aspose.slides.internal.l5.u3(((u6)var0.n5()).h0())));
      var1.l6(var0.k5() & 4294967295L & 4294967295L);
      var1.n5(var2);
      return var1;
   }

   private static x9 n5(x8 var0) {
      x9 var1 = new x9();
      var1.n5(0L);
      var1.l6(var0.s7() & 4294967295L & 4294967295L);
      var1.n5(new com.aspose.slides.internal.i0.n5(var0.u3().o8()));
      var1.n5(new s0(var0.a6().u3()));
      var1.n5(var1.n5() | 1L);
      com.aspose.slides.internal.i0.y4 var2 = new com.aspose.slides.internal.i0.y4();
      var2.n5(n5(var0.l6()));
      var2.n5(var2.n5().u9());
      var1.n5(var2);
      s7 var3 = var0.l6();
      int var4 = var3.a6().length;
      if (var0.c8() != null && var0.c8().length > 0) {
         if (var0.c8().length > 1 && var0.c8().length < var4) {
            var1.k5(var4 & 4294967295L);
            var1.n5(new com.aspose.slides.internal.i0.n5[(int)var1.a6()]);

            for (int var8 = 0; var8 < var0.c8().length; var8++) {
               var1.h0()[var8] = new com.aspose.slides.internal.i0.n5(var0.c8()[var8].o8());
            }

            for (int var9 = var0.c8().length; var9 < var4; var9++) {
               var1.h0()[var9] = new com.aspose.slides.internal.i0.n5(var0.c8()[var0.c8().length - 1].o8());
            }
         } else {
            var1.k5(var0.c8().length & 4294967295L);
            var1.n5(new com.aspose.slides.internal.i0.n5[(int)var1.a6()]);

            for (int var5 = 0; var5 < var0.c8().length; var5++) {
               var1.h0()[var5] = new com.aspose.slides.internal.i0.n5(var0.c8()[var5].o8());
            }
         }
      } else {
         var1.k5(0L);
      }

      y0 var10 = new y0();
      if (!var0.t2().l6()) {
         var10.n5(n5(var0.t2()));
         var1.n5(var1.n5() | 2L);
      }

      if (var0.n5) {
         com.aspose.slides.internal.i0.t2 var6 = new com.aspose.slides.internal.i0.t2();
         var6.n5(var0.h0().n5().length & 4294967295L);
         var6.n5(new com.aspose.slides.internal.i0.n5[var0.h0().n5().length]);
         var6.n5(new float[var0.h0().l6().length]);

         for (int var7 = 0; var7 < var6.k5().length; var7++) {
            var6.k5()[var7] = new com.aspose.slides.internal.i0.n5(var0.h0().n5()[var7].o8());
            var6.n5()[var7] = var0.h0().l6()[var7];
         }

         var10.n5(var6);
         var1.n5(var1.n5() | 4L);
      } else if (var0.l6) {
         var1.n5(var1.n5() | 8L);
         com.aspose.slides.internal.i0.s7 var11 = new com.aspose.slides.internal.i0.s7();
         var11.n5(var0.k5().l6().length & 4294967295L);
         var11.l6(new float[var0.k5().l6().length]);
         var11.n5(new float[var0.k5().k5().length]);

         for (int var13 = 0; var13 < var11.k5().length; var13++) {
            var11.k5()[var13] = var0.k5().l6()[var13];
            var11.n5()[var13] = var0.k5().k5()[var13];
         }

         var10.n5(var11);
      }

      if (var0.k5) {
         s3 var12 = new s3();
         var12.n5(var0.u9().l6());
         var12.l6(var0.u9().k5());
         var12.n5(2L);
         var10.n5(var12);
         var1.n5(var1.n5() | 64L);
      }

      var1.n5(var10);
      return var1;
   }

   private static a5 n5(com.aspose.slides.internal.l5.s7 var0) {
      a5 var1 = new a5();
      var1.n5(2L);
      var1.n5(new com.aspose.slides.internal.i0.n5(var0.u3()[1].o8()));
      var1.l6(new com.aspose.slides.internal.i0.n5(var0.u3()[0].o8()));
      var1.n5(new g7(var0.u9().y4()));
      var1.l6(var0.c8() & 4294967295L & 4294967295L);
      if (var0.k5()) {
         var1.n5(var1.n5() | 128L);
      }

      h2 var2 = new h2();
      var2.n5(n5(var0.h0()));
      if (var0.l6() != null) {
         var1.n5(var1.n5() | 8L);
         com.aspose.slides.internal.i0.s7 var3 = new com.aspose.slides.internal.i0.s7();
         var3.n5(var0.l6().l6().length & 4294967295L);
         var3.l6(new float[var0.l6().l6().length]);
         var3.n5(new float[var0.l6().k5().length]);

         for (int var4 = 0; var4 < var3.k5().length; var4++) {
            var3.k5()[var4] = var0.l6().l6()[var4];
            var3.n5()[var4] = var0.l6().k5()[var4];
         }

         var2.n5(new c8[]{null, var3});
      } else {
         try {
            com.aspose.slides.internal.i0.t2 var6 = new com.aspose.slides.internal.i0.t2();
            var6.n5(var0.a6().n5().length & 4294967295L);
            var6.n5(new com.aspose.slides.internal.i0.n5[var0.a6().n5().length]);
            var6.n5(new float[var0.a6().l6().length]);

            for (int var7 = 0; var7 < var6.k5().length; var7++) {
               var6.k5()[var7] = new com.aspose.slides.internal.i0.n5(var0.a6().n5()[var7].o8());
               var6.n5()[var7] = var0.a6().l6()[var7];
            }

            var2.n5(new c8[]{var6});
            var1.n5(var1.n5() | 4L);
         } catch (ArgumentException var5) {
         }
      }

      var1.n5(-65536);
      var1.l6(-16776961);
      var1.n5(var2);
      return var1;
   }

   public static o0 n5(com.aspose.slides.internal.l5.c8 var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.l5.u3.class)) {
         t4 var14 = ((com.aspose.slides.internal.l5.u3)var0).n5();
         o0 var15 = new o0();
         var15.n5(1L);
         u9 var16 = new u9();
         var16.l6(1L);
         z8 var17 = new z8();
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

         try {
            var14.n5(var5, com.aspose.slides.internal.j9e.x8.s7());
            var17.n5(n5(var5.toArray()));
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }

         var16.n5(var17);
         var15.n5(var16);
         return var15;
      } else {
         com.aspose.slides.internal.y6.l6 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y6.l6.class);
         if (var1 == null) {
            throw new ArgumentException("unknown image type");
         }

         o0 var2 = new o0();
         var2.n5(2L);
         v0 var3 = new v0();
         var3.n5(4L);
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            var1.a_(var4);
            var4.seek(0L, 0);
            var3.n5(var4.toArray());
            var3.l6(var3.h0().length & 4294967295L);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         var2.n5(var3);
         return var2;
      }
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.l5.c8 var0, t2 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var0.u9(), var0.h0());
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var2);

      try {
         var3.n5(var0.u3(), new com.aspose.slides.internal.o9b.y2(0, 0, var0.u9(), var0.h0()), 0, 0, var0.u9(), var0.h0(), 2, var1.k5());
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static long l6(com.aspose.slides.internal.l5.l6 var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, y4.class)) {
         return 0L;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, h0.class)) {
         return 1L;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.l5.s7.class)) {
         return 4L;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, x8.class)) {
         return 3L;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, e2.class)) {
         return 2L;
      } else {
         throw new ArgumentException("brush");
      }
   }

   public static boolean n5(short var0, int var1) {
      boolean var2 = false;
      int var3 = 1 << var1;
      if ((var0 & var3) == var3) {
         var2 = true;
      }

      return var2;
   }

   public static int n5(int var0, int var1, boolean var2) {
      int var3 = 1 << var1;
      int var4 = var0;
      if (var2) {
         var4 |= var3;
      } else {
         var4 &= ~var3;
      }

      return var4;
   }

   public static byte[] n5(byte[] var0) {
      int var1 = var0.length % 4;
      if (var1 != 0) {
         int var2 = 4 - var1;
         byte[] var3 = new byte[var0.length + var2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, var0.length);
         return var3;
      } else {
         return var0;
      }
   }
}
