package com.aspose.slides.internal.e5q;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.c8;
import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.p8;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b7s.t2;
import com.aspose.slides.internal.b7s.t4;
import com.aspose.slides.internal.b7s.t9;
import com.aspose.slides.internal.b8u.h0;
import com.aspose.slides.internal.l3e.u9;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.l7h.u6;
import com.aspose.slides.internal.n5p.u3;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.m3;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.t6q.s7;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z3b.a6;
import com.aspose.slides.internal.z3b.k5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class n5 implements h0 {
   private static Dictionary<Byte, List<Integer>> n5 = new Dictionary<>();
   private static final Object l6 = new Object();

   public static void n5(h2 var0, com.aspose.slides.internal.d0c.l6[] var1, s7[] var2) {
      int var3 = 0;
      int[] var4 = new int[]{0};
      var0.n5(var4);
      var3 = var4[0];
      var3 -= 2;
      int var5 = var3;
      e2 var6 = new e2();
      int var7 = 0;

      while (var5 > 0) {
         byte[] var8 = new byte[var3];
         if (!var0.u3()) {
            throw new k5("Cannot parse file.", new a6("Not enough data in stream."));
         }

         int var9 = var0.n5(var8, 0, var5);
         var6.write(var8, 0, var9);
         var7 += var9;
         var5 -= var9;
      }

      n5(var6, var1, var2);
   }

   public static boolean n5(v3 var0) {
      int var1 = var0.x8();
      int var2 = var0.x8();
      return var1 == 255 || var2 == 216;
   }

   public static q0 l6(v3 var0, d2 var1) {
      l6 var2 = k5(var0, var1);
      q0 var3 = q0.n5(var2.n5(), var2.l6(), var2.k5(), var2.u3());
      var2.u3().n5(new n5$n5(var3));
      synchronized (l6) {
         n5 = var2.x8();
      }

      var3.l6(var2.a6());
      var3.n5(var2.u9());
      var3.n5(var2.t2());
      var3.n5(var2.h0());
      var3.n5(var2.c8());
      var3.n5(var2.s7());
      if (var1 != null && var1.u3() != null) {
         var3.n5(var1.u3());
      }

      return var3;
   }

   public static l6 k5(v3 var0, d2 var1) {
      l6 var2 = new l6();
      Dictionary var3 = new Dictionary();
      c8 var4 = new c8();
      synchronized (var0.n5()) {
         var0.n5(0L, 0);
         if (!n5(var0)) {
            throw new k5("Cannot parse file.", new a6("Not a jpeg data."));
         }

         h2 var6 = new h2(var0);
         t9 var7 = new t9(var6);
         var7.n5(com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.p5w.n5.class));
         var7.n5(var4.n5());
         s7 var8 = null;
         com.aspose.slides.internal.d0c.l6 var9 = null;
         t2 var10 = null;
         com.aspose.slides.internal.b7s.n5 var11 = null;
         boolean var12 = false;
         byte[] var13 = null;

         while (!var12) {
            int var14 = var6.l6();
            byte var15 = var6.u9();
            n5(var3, var15, var14);
            switch (var15) {
               case -64:
               case -63:
                  var7.n5(t4.n5(var6, (byte)-64));
                  n5(var2, var1, var7, var11, var10, var9, var8);
                  break;
               case -62:
                  var7.n5(t4.n5(var6, (byte)-62));
                  n5(var2, var1, var7, var11, var10, var9, var8);
                  break;
               case -61:
                  var7.n5(t4.n5(var6, (byte)-61));
                  l6(var2, var1, var7, var11, var10, var9, var8);
                  break;
               case -60:
               case -56:
               case -52:
               case -48:
               case -47:
               case -46:
               case -45:
               case -44:
               case -43:
               case -42:
               case -41:
               case -40:
               case -37:
               case -36:
               case -35:
               case -34:
               case -33:
               case -29:
               case -28:
               case -27:
               case -26:
               case -25:
               case -24:
               case -23:
               case -22:
               case -21:
               case -20:
               case -19:
               case -16:
               case -15:
               case -14:
               case -13:
               case -12:
               case -11:
               case -10:
               case -7:
               case -6:
               case -5:
               case -4:
               case -3:
               default:
                  l6(var6);
                  break;
               case -59:
               case -58:
               case -57:
               case -55:
               case -54:
               case -53:
               case -51:
               case -50:
               case -49:
                  throw new k5(d1.n5("Format {0} is not supported", new Object[]{s3.n5(u3.class, var15)}), new NotSupportedException());
               case -39:
                  com.aspose.slides.internal.h6t.l6 var16 = new com.aspose.slides.internal.h6t.l6("Not enough data in stream.", 1);
                  var16.n5(var7.u3().l6());
                  throw new k5("Cannot parse file.", var16);
               case -38:
                  if (var7.u3().k5() == -9) {
                     var7.n5(p3.n5(var6, var7.u3()));
                  }

                  var12 = true;
                  break;
               case -32:
                  if (var10 == null) {
                     var10 = com.aspose.slides.internal.l9a.l6.n5(var6);
                  } else {
                     l6(var6);
                  }
                  break;
               case -31:
                  try {
                     if (var9 != null && var8 != null) {
                        l6(var6);
                        continue;
                     }

                     com.aspose.slides.internal.d0c.l6[] var29 = new com.aspose.slides.internal.d0c.l6[]{var9};
                     s7[] var31 = new s7[]{var8};
                     n5(var6, var29, var31);
                     var9 = var29[0];
                     var8 = var31[0];
                  } catch (RuntimeException var23) {
                  }
                  break;
               case -30:
                  var4.n5(var6);
                  break;
               case -18:
                  var11 = com.aspose.slides.internal.b7s.n5.n5(var6);
                  break;
               case -17:
                  l6(var6);
                  break;
               case -9:
                  var7.n5(t4.n5(var6, (byte)-9));
                  k5(var2, var1, var7, var11, var10, var9, var8);
                  break;
               case -8:
                  var6.l6(2);
                  int var27 = 0;
                  int[] var30 = new int[]{0};
                  var6.l6(var30);
                  var27 = var30[0];
                  if (var27 != 1) {
                     String var32 = d1.n5(new String[]{"Unknown/unsupported LSE type ", a3.l6(var27), " encountered. Only X'01' is supported."});
                     throw new k5(var32);
                  }

                  var7.n5(n5(var6));
                  break;
               case -2:
                  int var17 = 0;
                  int[] var18 = new int[]{0};
                  var6.n5(var18);
                  var17 = var18[0];
                  var17 -= 2;
                  var13 = new byte[var17];

                  for (int var19 = 0; var19 < var17; var19++) {
                     int var20 = 0;
                     int[] var21 = new int[]{0};
                     var6.l6(var21);
                     var20 = var21[0];
                     var13[var19] = (byte)var20;
                  }
                  break;
               case -1:
                  l6(var6);
            }
         }

         var2.n5(var3);
         var2.n5(var10);
         var2.n5(var9);
         var2.n5(var8);
         if (var13 != null) {
            var2.n5(u6.z3().l6(var13, 0, var13.length));
         }

         return var2;
      }
   }

   private static void n5(l6 var0, d2 var1, t9 var2, com.aspose.slides.internal.b7s.n5 var3, t2 var4, com.aspose.slides.internal.d0c.n5 var5, s7 var6) {
      var0.n5(var2.u3().c8() & 65535);
      var0.l6(var2.u3().t2() & 65535);
      com.aspose.slides.internal.p5w.n5 var7 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.p5w.n5.class);
      int var8;
      if (var7 != null) {
         var8 = n5(var7.c8());
      } else {
         var8 = n5(var2.u3(), var3, var4, var2.l6(), var5, var6);
      }

      byte var9 = var2.u3().n5();
      v4 var10;
      switch (var8) {
         case 0:
            var10 = v4.n5(var9 & 255);
            break;
         case 1:
         case 2:
            var8 = 1;
            var10 = v4.l6(var9 & 255);
            break;
         case 3:
            var10 = v4.k5(var9 & 255);
            break;
         case 4:
            var10 = v4.u3(var9 & 255);
            break;
         case 5:
            var10 = v4.a6(var9 & 255);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      com.aspose.slides.internal.a4s.n5 var11 = new com.aspose.slides.internal.a4s.n5();
      var11.l6(var2);
      var11.l6(var8);
      var11.n5(new z6());
      var11.h0().n5((com.aspose.slides.internal.b8u.a6)null);
      var11.h0().n5(0);
      var11.h0().n5((com.aspose.slides.internal.b8u.t2)null);
      var11.h0().k5(((var9 & 255) * var2.u3().l6().length * (var2.u3().c8() & 65535) + 7) / 8);
      var11.h0().n5(var10);
      var0.n5(new com.aspose.slides.internal.l9a.k5(var11, var7));
      var0.k5(var8);
      if (var2.l6().getLength() > 0L) {
         var2.l6().seek(0L, 0);
         var0.n5(new com.aspose.slides.internal.l0u.n5(var2.l6()));
         var0.l6(k7.l6());
      }
   }

   private static void l6(l6 var0, d2 var1, t9 var2, com.aspose.slides.internal.b7s.n5 var3, t2 var4, com.aspose.slides.internal.d0c.n5 var5, s7 var6) {
      var0.n5(var2.u3().c8() & 65535);
      var0.l6(var2.u3().t2() & 65535);
      com.aspose.slides.internal.p5w.n5 var7 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.p5w.n5.class);
      int var8;
      if (var7 != null) {
         var8 = n5(var7.c8());
      } else {
         var8 = n5(var2.u3(), var3, var4, var2.l6(), var5, var6);
      }

      byte var9 = var2.u3().n5();
      v4 var10;
      switch (var8) {
         case 0:
            var10 = v4.n5(var9 & 255);
            break;
         case 1:
         case 2:
            var8 = 1;
            var10 = v4.l6(var9 & 255);
            break;
         case 3:
            var10 = v4.k5(var9 & 255);
            break;
         case 4:
            var10 = v4.u3(var9 & 255);
            break;
         case 5:
            var10 = v4.a6(var9 & 255);
            break;
         default:
            throw new ArgumentOutOfRangeException(d1.n5(new String[]{s3.n5(com.aspose.slides.internal.r1x.u6.class, var8), " color format is not supported yet."}));
      }

      com.aspose.slides.internal.l3e.u3 var11 = new com.aspose.slides.internal.l3e.u3();
      var11.l6(var2);
      var11.l6(var8);
      var11.n5(new z6());
      var11.h0().n5((com.aspose.slides.internal.b8u.a6)null);
      var11.h0().n5(0);
      var11.h0().n5((com.aspose.slides.internal.b8u.t2)null);
      var11.h0().k5((var2.u3().n5() & 255) * var2.u3().l6().length * (var2.u3().c8() & 65535));
      var11.h0().n5(var10);
      var0.n5(new com.aspose.slides.internal.l9a.k5(var11, var7));
      var0.k5(var8);
      if (var2.l6().getLength() > 0L) {
         var2.l6().seek(0L, 0);
         var0.n5(new com.aspose.slides.internal.l0u.n5(var2.l6()));
         var0.l6(k7.l6());
      }
   }

   private static void k5(l6 var0, d2 var1, t9 var2, com.aspose.slides.internal.b7s.n5 var3, t2 var4, com.aspose.slides.internal.d0c.n5 var5, s7 var6) {
      var0.n5(var2.u3().c8() & 65535);
      var0.l6(var2.u3().t2() & 65535);
      com.aspose.slides.internal.p5w.n5 var7 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.p5w.n5.class);
      int var8;
      if (var7 != null) {
         var8 = n5(var7.c8());
      } else {
         var8 = n5(var2.u3(), var3, var4, var2.l6(), var5, var6);
      }

      byte var9 = var2.u3().n5();
      v4 var10;
      switch (var8) {
         case 0:
            var10 = v4.n5(var9 & 255);
            break;
         case 1:
         case 2:
            var8 = 1;
            var10 = v4.l6(var9 & 255);
            break;
         case 3:
            var10 = v4.k5(var9 & 255);
            break;
         case 4:
            var10 = v4.u3(var9 & 255);
            break;
         case 5:
            var10 = v4.a6(var9 & 255);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      u9 var11 = new u9();
      var11.l6(var2);
      var11.l6(var8);
      var11.n5(new z6());
      var11.h0().n5((com.aspose.slides.internal.b8u.a6)null);
      var11.h0().n5(0);
      var11.h0().n5((com.aspose.slides.internal.b8u.t2)null);
      var11.h0().k5((var2.u3().n5() & 255) * var2.u3().l6().length * (var2.u3().c8() & 65535));
      var11.h0().n5(var10);
      var0.n5(new com.aspose.slides.internal.l9a.k5(var11, var7));
      var0.k5(var8);
      if (var2.l6().getLength() > 0L) {
         var2.l6().seek(0L, 0);
         var0.n5(new com.aspose.slides.internal.l0u.n5(var2.l6()));
         var0.l6(k7.l6());
      }
   }

   private static p8 n5(h2 var0) {
      p8 var1 = new p8();
      int var2 = 0;
      int[] var3 = new int[]{0};
      var0.n5(var3);
      var2 = var3[0];
      var1.n5(var2);
      var3[0] = var2;
      var0.n5(var3);
      var2 = var3[0];
      var1.l6(var2);
      var3[0] = var2;
      var0.n5(var3);
      var2 = var3[0];
      var1.k5(var2);
      var3[0] = var2;
      var0.n5(var3);
      var2 = var3[0];
      var1.u3(var2);
      var3[0] = var2;
      var0.n5(var3);
      var2 = var3[0];
      var1.a6(var2);
      return var1;
   }

   private static int n5(int var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 3;
         case 2:
            return 4;
         case 3:
            return 5;
         case 4:
            return 2;
         default:
            return 1;
      }
   }

   private static void n5(e2 var0, com.aspose.slides.internal.d0c.l6[] var1, s7[] var2) {
      var0.seek(0L, 0);
      String var3 = "Exif";
      int var4 = "Exif".length() + 2;
      int var5 = "http://ns.adobe.com/xap/1.0/".length() + 1;
      int var6 = (int)var0.getLength() > var5 ? var5 : var4;
      byte[] var7 = new byte[var6];
      var0.read(var7, 0, var7.length);
      String var8 = j5.z3().l6(var7, 0, var7.length);
      if (d1.l6(var8, "Exif")) {
         try {
            byte[] var9 = var0.toArray();
            com.aspose.slides.internal.v6s.u3 var10 = com.aspose.slides.internal.l1f.a6.n5(var9, var4);
            var1[0] = com.aspose.slides.internal.l1f.a6.n5(var10);
            if (var1[0] != null) {
               var1[0].n5(com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.v6s.n5.class));
            }
         } catch (RuntimeException var12) {
            com.aspose.slides.internal.f8y.n5.u3(d1.n5(new String[]{"Exception on JpegLoader.GetMetadata: ", var12.toString()}));
         }
      } else if (d1.l6(var8, "http://ns.adobe.com/xap/1.0/")) {
         com.aspose.slides.internal.c5i.n5 var13 = new com.aspose.slides.internal.c5i.n5(j5.z3());
         var0.seek(var5, 0);
         String var14 = var13.l6(var0, (int)var0.getLength() - var5);
         com.aspose.slides.internal.u3r.t2 var11 = new com.aspose.slides.internal.u3r.t2(var14);
         var2[0] = var11.n5();
      }
   }

   private static void l6(h2 var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      var0.n5(var2);
      var1 = var2[0];
      var0.l6(var1 - 2);
   }

   @Override
   public final m3 n5(v3 var1, d2 var2) {
      return l6(var1, var2);
   }

   public static int n5(
      t4 var0, com.aspose.slides.internal.b7s.n5 var1, t2 var2, com.aspose.slides.internal.z0k.t4 var3, com.aspose.slides.internal.d0c.n5 var4, s7 var5
   ) {
      n3[] var6 = var0.l6();
      int var7 = var0.l6().length;
      if (var2 != null) {
         if (var7 == 1) {
            return 0;
         }

         if (var7 == 3) {
            return 3;
         }
      }

      if (var1 != null) {
         if ((var1.n5() & 255) == 2 && var7 == 4) {
            return 5;
         }

         if ((var1.n5() & 255) == 1 && var7 == 3) {
            return 3;
         }

         if ((var1.n5() & 255) == 0) {
            if (var7 == 1) {
               return 0;
            }

            if (var7 == 3) {
               return 2;
            }

            if (var7 == 4) {
               return 4;
            }
         }

         throw new com.aspose.slides.internal.h6t.k5(var0, var3, var1, var2, var4, var5);
      } else {
         if (var7 == 1) {
            return 0;
         }

         if (var7 == 3) {
            if ((var6[0].u9() & 255) == 1 && (var6[1].u9() & 255) == 2 && (var6[2].u9() & 255) == 3) {
               return 3;
            }

            if ((var6[0].u9() & 255) == 82 && (var6[1].u9() & 255) == 71 && (var6[2].u9() & 255) == 66) {
               return 2;
            }
         }

         boolean var8 = false;

         for (int var9 = 0; var9 < var7; var9++) {
            if ((var6[var9].u3() & 255) > 1 || (var6[var9].n3() & 255) > 1) {
               var8 = true;
               break;
            }
         }

         if (var8) {
            if (var7 == 3) {
               return 3;
            }

            if (var7 == 4) {
               return 4;
            }
         } else {
            if (var7 == 3) {
               return 3;
            }

            if (var7 == 4) {
               return 4;
            }
         }

         throw new com.aspose.slides.internal.h6t.k5(var0, var3, var1, var2, var4, var5);
      }
   }

   private static void n5(Dictionary<Byte, List<Integer>> var0, byte var1, int var2) {
      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = !var0.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var3 = new List();
         var0.addItem(var1, var3);
      }

      var3.addItem(var2);
   }
}
