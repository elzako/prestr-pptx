package com.aspose.slides;

class v8w {
   static void n5(IEffectFormat var0, com.aspose.slides.internal.k0r.q5 var1) {
      com.aspose.slides.internal.k0r.r3 var2 = var1.a6();
      v8w$n5 var3 = new v8w$n5(var2);
      if (n5(var3)) {
         com.aspose.slides.internal.k0r.z5 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(517), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(518), com.aspose.slides.internal.k0r.z5.class);
         var0.enablePresetShadowEffect();
         IPresetShadow var6 = var0.getPresetShadowEffect();
         if (l6(var3)) {
            var6.setPreset(2);
         }

         if (k5(var3)) {
            var6.setPreset(3);
         }

         if (u3(var3)) {
            var6.setPreset(4);
         }

         if (a6(var3)) {
            var6.setPreset(6);
         }

         if (u9(var3)) {
            var6.setPreset(7);
         }

         if (h0(var3)) {
            var6.setPreset(8);
         }

         if (c8(var3)) {
            var6.setPreset(9);
         }

         p0s var7 = g0t.n5(var4, var5).n5();
         var6.setDistance(var7.n5);
         var6.setDirection(var7.l6);
         u0b.n5(var6.getShadowColor(), var1, 513, 516, 8421504L);
      }
   }

   static boolean n5(com.aspose.slides.internal.k0r.r3 var0) {
      return n5(new v8w$n5(var0));
   }

   private static boolean n5(v8w$n5 var0) {
      return l6(var0) || k5(var0) || u3(var0) || a6(var0) || u9(var0) || h0(var0) || c8(var0);
   }

   private static boolean l6(v8w$n5 var0) {
      return var0.n5 != null
         && (var0.n5.j5() & 4294967295L) == 2L
         && var0.l6 != null
         && (var0.l6.j5() & 4294967295L) == 92680L
         && var0.u3 != null
         && var0.u3.j5() == 4294967280L
         && var0.a6 != null
         && var0.a6.j5() == 4294934528L
         && var0.u9 != null
         && (var0.u9.j5() & 4294967295L) == 32768L;
   }

   private static boolean k5(v8w$n5 var0) {
      return var0.n5 != null
         && (var0.n5.j5() & 4294967295L) == 2L
         && var0.l6 != null
         && var0.l6.j5() == 4294874616L
         && var0.u3 != null
         && var0.u3.j5() == 4294967280L
         && var0.a6 != null
         && (var0.a6.j5() & 4294967295L) == 32768L
         && var0.u9 != null
         && (var0.u9.j5() & 4294967295L) == 32768L;
   }

   private static boolean u3(v8w$n5 var0) {
      return var0.n5 != null && (var0.n5.j5() & 4294967295L) == 1L;
   }

   private static boolean a6(v8w$n5 var0) {
      return var0.n5 != null
         && (var0.n5.j5() & 4294967295L) == 2L
         && var0.l6 != null
         && (var0.l6.j5() & 4294967295L) == 92680L
         && var0.k5 != null
         && var0.k5.j5() == 4294901760L
         && var0.u3 != null
         && var0.u3.j5() == 4294967280L
         && var0.a6 != null
         && var0.a6.j5() == 4294934528L
         && var0.u9 != null
         && (var0.u9.j5() & 4294967295L) == 32768L;
   }

   private static boolean u9(v8w$n5 var0) {
      return var0.n5 != null
         && (var0.n5.j5() & 4294967295L) == 2L
         && var0.l6 != null
         && var0.l6.j5() == 4294874616L
         && var0.k5 != null
         && var0.k5.j5() == 4294901760L
         && var0.u3 != null
         && var0.u3.j5() == 4294967280L
         && var0.a6 != null
         && (var0.a6.j5() & 4294967295L) == 32768L
         && var0.u9 != null
         && (var0.u9.j5() & 4294967295L) == 32768L;
   }

   private static boolean h0(v8w$n5 var0) {
      return var0.n5 != null && (var0.n5.j5() & 4294967295L) == 5L && !c8(var0);
   }

   private static boolean c8(v8w$n5 var0) {
      return var0.n5 != null
         && (var0.n5.j5() & 4294967295L) == 5L
         && var0.h0 != null
         && var0.h0.j5() == 4294954596L
         && var0.c8 != null
         && var0.c8.j5() == 4294954596L;
   }

   static void n5(IPresetShadowEffectiveData var0, k1z var1) {
      if (var0 != null) {
         u0y var2 = com.aspose.slides.internal.v6g.k5.n5(var0, u0y.class);
         com.aspose.slides.internal.k0r.r3 var3 = var1.z3().a6();
         com.aspose.slides.internal.k0r.w8 var4 = var3.l6();
         com.aspose.slides.internal.k0r.w8 var5 = var1.z3().h0().l6();
         g0t.n5(new p0s(var2.getDistance(), var2.getDirection()), var3);
         u0b.n5(var2.n5.k5(), var4, 513, 516, var1.u3().a6().n5());
         n5(var2.getPreset(), var4);
      }
   }

   static void n5(IPresetShadow var0, k1z var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.r3 var2 = var1.z3().a6();
         com.aspose.slides.internal.k0r.w8 var3 = var2.l6();
         g0t.n5(new p0s(var0.getDistance(), var0.getDirection()), var2);
         u0b.n5(var0.getShadowColor(), var3, 513, 516, var1.u3().a6().n5());
         n5(var0.getPreset(), var3);
      }
   }

   private static void n5(int var0, com.aspose.slides.internal.k0r.w8 var1) {
      com.aspose.slides.internal.k0r.z5 var2 = null;
      com.aspose.slides.internal.k0r.z5 var3 = null;
      switch (var0) {
         case 0:
         case 1:
         case 5:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         default:
            break;
         case 2:
            var1.l6(new com.aspose.slides.internal.k0r.z5(512, 2L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(522, 92680L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(526, 4294967280L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
            break;
         case 3:
            var1.l6(new com.aspose.slides.internal.k0r.z5(512, 2L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(522, 4294874616L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(526, 4294967280L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
            break;
         case 4:
            var1.l6(new com.aspose.slides.internal.k0r.z5(512, 1L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(514, 275121139L));
            var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(517), com.aspose.slides.internal.k0r.z5.class);
            if (var2 != null) {
               var1.l6(new com.aspose.slides.internal.k0r.z5(519, (var2.j5() & 4294967295L) * 2L & 4294967295L));
            }

            var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(518), com.aspose.slides.internal.k0r.z5.class);
            if (var3 != null) {
               var1.l6(new com.aspose.slides.internal.k0r.z5(520, (var3.j5() & 4294967295L) * 2L & 4294967295L));
            }
            break;
         case 6:
            var1.l6(new com.aspose.slides.internal.k0r.z5(512, 2L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(522, 92680L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(524, 4294901760L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(526, 4294967280L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(528, 4294934528L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
            break;
         case 7:
            var1.l6(new com.aspose.slides.internal.k0r.z5(512, 2L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(522, 4294874616L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(524, 4294901760L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(526, 4294967280L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(528, 32768L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(529, 32768L));
            break;
         case 8:
         case 9:
            var1.l6(new com.aspose.slides.internal.k0r.z5(512, 5L));
            var1.l6(new com.aspose.slides.internal.k0r.z5(514, 275121139L));
            var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(517), com.aspose.slides.internal.k0r.z5.class);
            if (var2 != null) {
               var1.l6(new com.aspose.slides.internal.k0r.z5(519, -(var2.j5() & 4294967295L) & 4294967295L));
            }

            var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(518), com.aspose.slides.internal.k0r.z5.class);
            if (var3 != null) {
               var1.l6(new com.aspose.slides.internal.k0r.z5(520, -(var3.j5() & 4294967295L) & 4294967295L));
            }

            var1.l6(new com.aspose.slides.internal.k0r.z5(268, 271778803L));
            com.aspose.slides.internal.k0r.r1 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(703), com.aspose.slides.internal.k0r.r1.class);
            if (var4 == null) {
               var4 = new com.aspose.slides.internal.k0r.r1();
               var1.l6(var4);
            }

            var4.n5(true);
      }
   }
}
