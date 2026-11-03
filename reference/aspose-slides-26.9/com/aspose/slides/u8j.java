package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Iterator;

class u8j {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("boolVal", "intVal", "fltVal", "strVal", "clrVal");

   public static void n5(com.aspose.slides.internal.k4y.a4w var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.t9() != null) {
         com.aspose.slides.internal.k0r.p6r var3 = var1.t9();
         r2p.n5(var0.h0(), var1, var3.c8(), var2);
         n5(new u8j$1(var0), var3);
         var0.n5(var3.a6() == null ? null : var3.a6().a6());
         var0.l6(var3.u9() == null ? null : var3.u9().a6());
         var0.k5(var3.h0() == null ? null : var3.h0().a6());
         var0.n5(n5(var3.l6().l6()));
         var0.l6(n5(var3.l6().k5()));
      } else {
         throw new InvalidOperationException();
      }
   }

   private static void n5(com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.f3w> var0, com.aspose.slides.internal.k0r.p6r var1) {
      if (var1.u3() != null && var1.u3().u3().size() != 0) {
         com.aspose.slides.internal.k4y.f3w var2 = (com.aspose.slides.internal.k4y.f3w)var0.invoke();
         Iterator var3 = var1.u3().u3().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k0r.h6l var4 = (com.aspose.slides.internal.k0r.h6l)var3.next();
               com.aspose.slides.internal.k4y.x8x var5 = var2.n5();
               if (var4.n5().l6() > -1) {
                  var5.n5(com.aspose.slides.ms.System.a3.n5(var4.n5().l6() * 100, com.aspose.slides.internal.x7n.l6.k5()));
               }

               com.aspose.slides.internal.k4y.k7v var6 = var5.n5();
               n5(var4, var5, var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k0r.h6l var0, com.aspose.slides.internal.k4y.x8x var1, com.aspose.slides.internal.k4y.k7v var2) {
      com.aspose.slides.internal.k0r.v4m var3 = var0.l6();
      switch (var3.l6()) {
         case 0:
            com.aspose.slides.internal.k0r.j3z var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k0r.j3z.class);
            com.aspose.slides.internal.k4y.w5w var5 = (com.aspose.slides.internal.k4y.w5w)var2.n5("boolVal").l6();
            var5.n5(var4.a6());
            break;
         case 1:
            com.aspose.slides.internal.k0r.s5r var8 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k0r.s5r.class);
            com.aspose.slides.internal.k4y.f1f var9 = (com.aspose.slides.internal.k4y.f1f)var2.n5("intVal").l6();
            var9.n5(var8.a6());
            break;
         case 2:
            com.aspose.slides.internal.k0r.f4l var6 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k0r.f4l.class);
            com.aspose.slides.internal.k4y.k1k var7 = (com.aspose.slides.internal.k4y.k1k)var2.n5("fltVal").l6();
            var7.n5(var6.a6());
            break;
         case 3:
            com.aspose.slides.internal.k0r.g5d var10 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k0r.g5d.class);
            com.aspose.slides.internal.k4y.w8j var11 = (com.aspose.slides.internal.k4y.w8j)var2.n5("strVal").l6();
            var11.n5(var10.a6());
      }

      if (var0.k5() != null) {
         String var12 = var0.k5().a6();
         if (var12 != null) {
            var1.l6(var12);
         }
      }
   }

   private static byte n5(long var0) {
      switch ((int)var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            return -1;
      }
   }

   private static long n5(byte var0) {
      switch (var0) {
         case 0:
            return 0L;
         case 1:
            return 1L;
         case 2:
            return 2L;
         default:
            throw new NotImplementedException();
      }
   }

   private static byte n5(int var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            return -1;
      }
   }

   private static int l6(byte var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            throw new NotImplementedException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.a4w var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.p6r var3 = new com.aspose.slides.internal.k0r.p6r();
         var1.e2().addItem(var3);
         n5(var0, var3);
         n5(var0, var3, var2);
         if (!com.aspose.slides.ms.System.d1.n5(var0.l6())) {
            com.aspose.slides.internal.k0r.g5d var4 = new com.aspose.slides.internal.k0r.g5d(var0.l6());
            var4.w1().n5((short)1);
            var3.e2().addItem(var4);
         }

         if (!com.aspose.slides.ms.System.d1.n5(var0.k5())) {
            com.aspose.slides.internal.k0r.g5d var5 = new com.aspose.slides.internal.k0r.g5d(var0.k5());
            var5.w1().n5((short)2);
            var3.e2().addItem(var5);
         }

         if (!com.aspose.slides.ms.System.d1.n5(var0.u3())) {
            com.aspose.slides.internal.k0r.g5d var6 = new com.aspose.slides.internal.k0r.g5d(var0.u3());
            var6.w1().n5((short)3);
            var3.e2().addItem(var6);
         }

         n5(var0.h0(), var3, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.a4w var0, com.aspose.slides.internal.k0r.p6r var1) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.c5q var2 = new com.aspose.slides.internal.k0r.c5q();
      var1.e2().addItem(var2);
      if (var0.a6() != -1) {
         var2.u3(true);
         var2.n5(n5(var0.a6()));
      } else {
         var2.u3(false);
         var2.n5(0L);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.l6())) {
         var2.n5(true);
      } else {
         var2.n5(false);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.k5())) {
         var2.l6(true);
      } else {
         var2.l6(false);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.u3())) {
         var2.k5(true);
      } else {
         var2.k5(false);
      }

      if (var0.c8() != null && var0.c8().l6().length > 0) {
         var2.a6(true);
      } else {
         var2.a6(false);
      }

      if (var0.u9() != -1) {
         var2.u9(true);
         var2.n5(l6(var0.u9()));
      } else {
         var2.u9(false);
         var2.n5(1);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.a4w var0, com.aspose.slides.internal.k0r.p6r var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var0.c8() != null && var0.c8().l6().length != 0) {
         com.aspose.slides.internal.k0r.y4k var3 = new com.aspose.slides.internal.k0r.y4k();
         var1.e2().addItem(var3);

         for (com.aspose.slides.internal.k4y.x8x var7 : var0.c8().l6()) {
            n5(var7, var3, var2);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.x8x var0, com.aspose.slides.internal.k0r.y4k var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var0.u3() != null) {
         if (var0.u3().n5() == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.e4w var3 = null;
         if (!com.aspose.slides.ms.System.d1.n5(var0.l6())) {
            var3 = new com.aspose.slides.internal.k0r.e4w();
            var3.n5(w7n.n5(o5.n5(var0.l6())) / 100);
         }

         if (var3 == null) {
            throw new InvalidOperationException();
         }

         var1.e2().addItem(var3);
         com.aspose.slides.internal.k0r.v4m var4 = null;
         com.aspose.slides.internal.k4y.g7 var5 = var0.u3().n5();
         switch (n5.n5(var5.n5())) {
            case 0:
               com.aspose.slides.internal.k4y.w5w var6 = (com.aspose.slides.internal.k4y.w5w)var5.l6();
               var4 = new com.aspose.slides.internal.k0r.j3z(var6.n5());
               break;
            case 1:
               com.aspose.slides.internal.k4y.f1f var7 = (com.aspose.slides.internal.k4y.f1f)var5.l6();
               var4 = new com.aspose.slides.internal.k0r.s5r(var7.n5());
               break;
            case 2:
               com.aspose.slides.internal.k4y.k1k var8 = (com.aspose.slides.internal.k4y.k1k)var5.l6();
               var4 = new com.aspose.slides.internal.k0r.f4l(var8.n5());
               break;
            case 3:
               com.aspose.slides.internal.k4y.w8j var9 = (com.aspose.slides.internal.k4y.w8j)var5.l6();
               var4 = new com.aspose.slides.internal.k0r.g5d(var9.n5());
               break;
            case 4:
               var2.n5("Writing of the animation value list failed.", 1);
               break;
            default:
               throw new NotImplementedException();
         }

         if (var4 != null) {
            var4.w1().n5((short)0);
            var1.e2().addItem(var4);
         }

         if (var0.k5() != null) {
            com.aspose.slides.internal.k0r.g5d var10 = new com.aspose.slides.internal.k0r.g5d(var0.k5());
            var10.w1().n5((short)1);
            var1.e2().addItem(var10);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.p6r var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.q9u var3 = new com.aspose.slides.internal.k0r.q9u();
      var1.e2().addItem(var3);
      r2p.n5(var0, var3);
      r2p.l6(var0, var3);
      y1t.n5(var0.h0(), var3, var2);
   }

   static void n5(k1z var0) {
      Effect var1 = var0.y2();
      if (var1 != null) {
         d5t var2 = var0.a6().a0();
         if (var2 != null && var2.k5()) {
            com.aspose.slides.internal.k4y.o2n var3 = var1.k5().h0();
            if (var3 == null) {
               throw new ArgumentNullException();
            }

            com.aspose.slides.internal.k0r.c9 var4 = var0.w1();
            if (var4 == null) {
               throw new ArgumentNullException();
            }

            com.aspose.slides.internal.k0r.l6 var5 = new com.aspose.slides.internal.k0r.l6();
            var4.n5(var5);
            com.aspose.slides.internal.k0r.n5 var6 = new com.aspose.slides.internal.k0r.n5();
            var5.e2().addItem(var6);
            var6.n5(new com.aspose.slides.internal.k0r.m1(6L, com.aspose.slides.internal.o9b.c8.m3().o8()));
            var6.u3((byte)0);
            IGenericEnumerator var7 = var1.getBehaviors().iterator();

            try {
               while (var7.hasNext()) {
                  IBehavior var8 = (IBehavior)var7.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var8, IColorEffect.class) && ((IColorEffect)var8).getTo() != null) {
                     var6.u3((byte)1);
                     var6.n5(new com.aspose.slides.internal.k0r.m1(254L, ((ColorFormat)((IColorEffect)var8).getTo()).u3().o8()));
                  }

                  if (com.aspose.slides.internal.v6g.k5.l6(var8, ISetEffect.class)
                     && com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var8).getTo(), String.class))) {
                     var6.u3((byte)2);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }

            var6.n5(var1.getTiming().getTriggerType() != 1);
            var6.u3(true);
            var6.a6((byte)0);
            var6.u9((byte)0);
            var6.l6(1);
            var6.n5((byte)1);
            if (var1.getSound() != null) {
               var6.n5(e0j.n5(var1.getSound(), var0.a6().n5()) & 4294967295L);
            }

            if (var1.getStopPreviousSound()) {
               var6.l6(true);
            }

            TextAnimation var12 = (TextAnimation)var1.k5().a6();
            if (var12 != null) {
               if (var12.l6().l6() != null) {
                  var6.a6(true);
               }

               switch (var12.getBuildType()) {
                  case 0:
                  case 1:
                     var6.n5((byte)1);
                     break;
                  case 2:
                     var6.n5((byte)2);
                     break;
                  case 3:
                     var6.n5((byte)3);
                     break;
                  case 4:
                     var6.n5((byte)4);
                     break;
                  case 5:
                     var6.n5((byte)5);
                     break;
                  case 6:
                     var6.n5((byte)6);
               }
            }

            var6.n5((short)var0.y1());
            if (com.aspose.slides.ms.System.n1.a6(var1.getTiming().getTriggerDelayTime())) {
               var6.n5(Integer.MAX_VALUE);
            } else if (!com.aspose.slides.ms.System.n1.k5(var6.h0())) {
               var6.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getTiming().getTriggerDelayTime() * 1000.0F), 14));
            }

            n5(var3, var6);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.o2n var0, com.aspose.slides.internal.k0r.n5 var1) {
      if (var0.n5().c8() != 0) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.k4y.n0d var2 = var0.n5();
      var1.l6((byte)0);
      var1.k5((byte)0);
      if (var2.h0() == 1L) {
         var1.l6((byte)0);
         var1.k5((byte)0);
      } else if (var2.h0() == 0L) {
         var1.l6((byte)6);
         var1.k5((byte)0);
      } else if (var2.h0() == 3L) {
         var1.l6((byte)2);
         if (var2.t2() == 5L) {
            var1.k5((byte)0);
         } else if (var2.t2() == 10L) {
            var1.k5((byte)1);
         }
      } else if (var2.h0() == 5L) {
         var1.l6((byte)3);
         if (var2.t2() == 5L) {
            var1.k5((byte)1);
         } else if (var2.t2() == 10L) {
            var1.k5((byte)0);
         }
      } else if (var2.h0() == 12L) {
         var1.l6((byte)4);
         var1.k5((byte)0);
      } else if (var2.h0() == 9L) {
         var1.l6((byte)5);
         var1.k5((byte)0);
      } else if (var2.h0() == 10L) {
         var1.l6((byte)6);
         var1.k5((byte)0);
      } else if (var2.h0() == 14L) {
         var1.l6((byte)8);
         if (var2.t2() == 5L) {
            var1.k5((byte)1);
         } else if (var2.t2() == 10L) {
            var1.k5((byte)0);
         }
      } else if (var2.h0() == 18L) {
         var1.l6((byte)9);
         if (var2.t2() == 3L) {
            var1.k5((byte)5);
         } else if (var2.t2() == 6L) {
            var1.k5((byte)7);
         } else if (var2.t2() == 9L) {
            var1.k5((byte)4);
         } else if (var2.t2() == 12L) {
            var1.k5((byte)6);
         }
      } else if (var2.h0() == 22L) {
         var1.l6((byte)10);
         if (var2.t2() == 8L) {
            var1.k5((byte)2);
         } else if (var2.t2() == 1L) {
            var1.k5((byte)3);
         } else if (var2.t2() == 2L) {
            var1.k5((byte)0);
         } else if (var2.t2() == 4L) {
            var1.k5((byte)1);
         }
      } else if (var2.h0() == 53L) {
         var1.l6((byte)11);
         var1.k5((byte)0);
      } else if (var2.h0() == 2L) {
         var1.l6((byte)12);
         if (var2.t2() == 8L) {
            var1.k5((byte)0);
         } else if (var2.t2() == 1L) {
            var1.k5((byte)1);
         } else if (var2.t2() == 2L) {
            var1.k5((byte)2);
         } else if (var2.t2() == 4L) {
            var1.k5((byte)3);
         } else if (var2.t2() == 9L) {
            var1.k5((byte)4);
         } else if (var2.t2() == 3L) {
            var1.k5((byte)5);
         } else if (var2.t2() == 12L) {
            var1.k5((byte)6);
         } else if (var2.t2() == 6L) {
            var1.k5((byte)7);
         }
      } else if (var2.h0() == 16L) {
         var1.l6((byte)13);
         if (var2.t2() == 26L) {
            var1.k5((byte)0);
         } else if (var2.t2() == 42L) {
            var1.k5((byte)1);
         } else if (var2.t2() == 21L) {
            var1.k5((byte)3);
         } else if (var2.t2() == 37L) {
            var1.k5((byte)3);
         }
      } else if (var2.h0() == 8L) {
         var1.l6((byte)17);
         var1.k5((byte)0);
      } else if (var2.h0() == 13L) {
         var1.l6((byte)18);
         var1.k5((byte)0);
      } else if (var2.h0() == 20L) {
         var1.l6((byte)19);
         var1.k5((byte)0);
      } else if (var2.h0() == 21L) {
         var1.l6((byte)26);
         var1.k5((byte)1);
      }
   }

   static void n5(IShape var0, IAnimationTimeLine var1, com.aspose.slides.internal.k0r.n5 var2, int var3, d5f var4) {
      short var5;
      byte var6;
      var5 = 0;
      var6 = 0;
      label252:
      switch (var2.s7()) {
         case 0:
            var5 = 0;
            if ((var2.x8() & 255) != 0) {
               return;
            }
            break;
         case 1:
            var5 = 127;
            break;
         case 2:
            var5 = 4;
            var6 = (byte)((var2.x8() & 255) == 0 ? 44 : 22);
            break;
         case 3:
            var5 = 20;
            var6 = (byte)((var2.x8() & 255) == 1 ? 44 : 1);
            break;
         case 4:
            var5 = 123;
            switch (var2.x8()) {
               case 1:
                  var6 = 38;
                  break label252;
               case 2:
                  var6 = 36;
                  break label252;
               case 3:
                  var6 = 2;
                  break label252;
               default:
                  var6 = 30;
                  break label252;
            }
         case 5:
            var5 = 36;
            if ((var2.x8() & 255) != 0) {
               return;
            }
            break;
         case 6:
            var5 = 39;
            if ((var2.x8() & 255) != 0) {
               return;
            }
            break;
         case 7:
            var5 = 29;
            switch (var2.x8()) {
               case 1:
                  var6 = 38;
                  break label252;
               case 2:
                  var6 = 36;
                  break label252;
               case 3:
                  var6 = 2;
                  break label252;
               default:
                  var6 = 30;
                  break label252;
            }
         case 8:
            var5 = 126;
            var6 = (byte)((var2.x8() & 255) == 0 ? 22 : 44);
            break;
         case 9:
            var5 = 136;
            switch (var2.x8()) {
               case 5:
                  var6 = 43;
                  break label252;
               case 6:
                  var6 = 13;
                  break label252;
               case 7:
                  var6 = 14;
                  break label252;
               default:
                  var6 = 42;
                  break label252;
            }
         case 10:
            var5 = 149;
            switch (var2.x8()) {
               case 1:
                  var6 = 2;
                  break label252;
               case 2:
                  var6 = 30;
                  break label252;
               case 3:
                  var6 = 38;
                  break label252;
               default:
                  var6 = 36;
                  break label252;
            }
         case 11:
            var5 = 151;
            var6 = (byte)((var2.x8() & 255) == 0 ? 33 : 27);
            break;
         case 12:
            var5 = 47;
            switch (var2.x8()) {
               case 1:
                  var6 = 38;
                  break label252;
               case 2:
                  var6 = 36;
                  break label252;
               case 3:
                  var6 = 2;
                  break label252;
               case 4:
                  var6 = 39;
                  break label252;
               case 5:
                  var6 = 40;
                  break label252;
               case 6:
                  var6 = 3;
                  break label252;
               case 7:
                  var6 = 4;
                  break label252;
               default:
                  var6 = 30;
                  break label252;
            }
         case 13:
            var5 = 134;
            switch (var2.x8()) {
               case 1:
                  var6 = 23;
                  break label252;
               case 2:
                  var6 = 46;
                  break label252;
               case 3:
                  var6 = 45;
                  break label252;
               default:
                  var6 = 24;
                  break label252;
            }
         case 14:
            var5 = 43;
            break;
         case 15:
            var5 = 35;
            if ((var2.x8() & 255) != 0) {
               return;
            }

            var6 = 32;
            break;
         case 16:
            var5 = 125;
            if ((var2.x8() & 255) != 0) {
               return;
            }

            var6 = 32;
            break;
         case 17:
            var5 = 146;
            if ((var2.x8() & 255) != 0) {
               return;
            }
            break;
         case 18:
            var5 = 147;
            switch (var2.x8()) {
               case 2:
                  var6 = 48;
                  break label252;
               case 3:
                  var6 = 49;
                  break label252;
               case 4:
                  var6 = 50;
                  break label252;
               case 5:
               case 6:
               case 7:
               default:
                  var6 = 47;
                  break label252;
               case 8:
                  var6 = 51;
                  break label252;
            }
         case 19:
            var5 = 21;
            if ((var2.x8() & 255) != 0) {
               return;
            }

            var6 = 32;
      }

      Sequence var7 = (Sequence)var1.getMainSequence();
      int var8 = z9u.n5(var5, (int)var6);
      Effect var9 = var7.n5(var0, var5, var6, var8, 1);
      var9.k5().n5(var3);
      var9.k5().l6(var7.l6().n5().n3());
      if ((var2.u9() & 4294967295L) > 0L) {
         com.aspose.slides.internal.k0r.d0p var10 = var4.h0().s7();
         com.aspose.slides.internal.k0r.x6s var11 = var10.n5((int)var2.u9());
         if (var11 != null && var11.a6() != null && var11.u9() != null) {
            var9.k5().n5(var4.n5(var11));
         }
      }

      if (var2.h0() >= 0 && var2.h0() < Integer.MAX_VALUE) {
         var9.getTiming().setTriggerDelayTime(var2.h0() / 1000.0F);
      }

      float var19 = 0.0F;
      ISetEffect var20 = null;
      IGenericEnumerator var12 = var9.getBehaviors().iterator();

      try {
         while (var12.hasNext()) {
            IBehavior var13 = (IBehavior)var12.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var13, ISetEffect.class)
               && "visible".equals(com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var13).getTo(), String.class))) {
               var20 = (ISetEffect)var13;
            } else if (!com.aspose.slides.ms.System.n1.k5(var13.getTiming().getDuration())) {
               var19 += var13.getTiming().getDuration();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      if (var19 == 0.0F && var20 != null) {
         var20.getTiming().setTriggerDelayTime(0.5F);
      }

      IBehavior var21 = null;
      com.aspose.slides.internal.k4y.o2n var14 = var9.k5().h0();
      switch (var2.n3()) {
         case 1:
            var21 = var7.n5().s7().createColorEffect();
            u0b.n5(((IColorEffect)var21).getTo(), var2.l6());
            break;
         case 2:
            var21 = var7.n5().s7().createSetEffect();
            ((ISetEffect)var21).setTo("hidden");
      }

      if (var21 != null) {
         ((Behavior)var21).n5().n5(var9);
         var9.getBehaviors().add(var21);
      }

      byte var15 = 0;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, IAutoShape.class) && ((IAutoShape)var0).getTextFrame() != null) {
         switch (var2.t2()) {
            case 2:
               var15 = 2;
               break;
            case 3:
               var15 = 3;
               break;
            case 4:
               var15 = 4;
               break;
            case 5:
               var15 = 5;
               break;
            case 6:
               var15 = 6;
         }

         TextAnimation var16 = ((TextAnimationCollection)var1.getTextAnimationCollection()).add();
         var16.n5(var7);
         if (var2.a6()) {
            var16.l6().n5(var9);
         }

         var16.l6().n5(var0);
         var16.l6().n5().addItem(var9);
         var9.k5().n5(var16);
         var16.n5 = var15;
         if (var15 > 1) {
            var16.n5(1);
         }
      }
   }
}
