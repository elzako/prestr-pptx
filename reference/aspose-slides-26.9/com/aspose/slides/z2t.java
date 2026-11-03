package com.aspose.slides;

class z2t {
   static void n5(ILightRig var0, com.aspose.slides.internal.k0r.r3 var1, t2s var2) {
      com.aspose.slides.internal.k0r.w8 var3 = var1 != null ? var1.l6() : new com.aspose.slides.internal.k0r.w8();
      com.aspose.slides.internal.k0r.z5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(722), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(723), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(724), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(725), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(726), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(730), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.h5 var10 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(767), com.aspose.slides.internal.k0r.h5.class);
      if (var10 == null) {
         var10 = new com.aspose.slides.internal.k0r.h5();
      }

      com.aspose.slides.internal.k0r.h5 var11 = var10;
      long var12 = 20000L;
      long var14 = 50000L;
      long var16 = 0L;
      long var18 = 38000L;
      long var20 = 38000L;
      long var22 = var4 != null ? var4.j5() : 20000L;
      long var24 = var5 != null ? var5.j5() : 50000L;
      long var26 = var6 != null ? var6.j5() : 0L;
      long var28 = var8 != null ? var8.j5() : 38000L;
      long var30 = var9 != null ? var9.j5() : 38000L;
      boolean var32 = var11.n3();
      boolean var33 = var11.t9();
      var0.setLightType(-1);
      var0.setDirection(-1);
      if (var24 == 4294917296L && var26 == 4294917296L) {
         if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
            var0.setLightType(10);
            var0.setDirection(1);
         } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
            var0.setLightType(18);
            var0.setDirection(1);
         } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
            var0.setLightType(14);
            var0.setDirection(1);
         }
      } else if (var24 == 4294917296L && var26 == 0L) {
         if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
            var0.setLightType(11);
            var0.setDirection(1);
         } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
            var0.setLightType(19);
            var0.setDirection(1);
         } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
            var0.setLightType(15);
            var0.setDirection(1);
         }
      } else if (var24 == 4294917296L && (var26 & 4294967295L) == 50000L) {
         if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
            var0.setLightType(12);
            var0.setDirection(1);
         } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
            var0.setLightType(20);
            var0.setDirection(1);
         } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
            var0.setLightType(16);
            var0.setDirection(1);
         }
      } else if ((var24 & 4294967295L) != 0L || var26 != 4294917296L) {
         if ((var24 & 4294967295L) == 0L && (var26 & 4294967295L) == 50000L) {
            if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
               var0.setLightType(11);
               var0.setDirection(7);
            } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
               var0.setLightType(19);
               var0.setDirection(7);
            } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
               var0.setLightType(15);
               var0.setDirection(7);
            }
         } else if (var24 == 50000L && var26 == 4294917296L) {
            if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
               var0.setLightType(12);
               var0.setDirection(5);
            } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
               var0.setLightType(20);
               var0.setDirection(5);
            } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
               var0.setLightType(16);
               var0.setDirection(5);
            }
         } else if (var24 == 50000L && var26 == 0L) {
            if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
               var0.setLightType(11);
               var0.setDirection(5);
            } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
               var0.setLightType(19);
               var0.setDirection(5);
            } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
               var0.setLightType(15);
               var0.setDirection(5);
            }
         } else if (var24 == 50000L && (var26 & 4294967295L) == 50000L) {
            if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
               var0.setLightType(10);
               var0.setDirection(5);
            } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
               var0.setLightType(18);
               var0.setDirection(5);
            } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
               var0.setLightType(14);
               var0.setDirection(5);
            }
         } else if ((var24 & 4294967295L) == 0L && var26 == 0L) {
            if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
               var0.setLightType(9);
               var0.setDirection(1);
            } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
               var0.setLightType(17);
               var0.setDirection(1);
            } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
               var0.setLightType(13);
               var0.setDirection(1);
            }
         }
      } else if (var22 == 20000L && var28 == 38000L && var30 == 38000L && var32 && !var33) {
         var0.setLightType(11);
         var0.setDirection(3);
      } else if ((var22 & 4294967295L) == 10000L && (var28 & 4294967295L) == 44000L && (var30 & 4294967295L) == 24000L && var32 && !var33) {
         var0.setLightType(19);
         var0.setDirection(3);
      } else if ((var22 & 4294967295L) == 4000L && (var28 & 4294967295L) == 52000L && (var30 & 4294967295L) == 14000L && var32 && var33) {
         var0.setLightType(15);
         var0.setDirection(3);
      }

      if (var0.getLightType() == -1 || var0.getDirection() == -1) {
         var0.setLightType(9);
         var0.setDirection(3);
         ((LightRig)var0).n5(true);
      }

      if (var7 != null) {
         var2.a6().n5().a6().n5("Deserialization of the Style3Dc3DKeyZ is not imlemented yet.", 3);
      }

      com.aspose.slides.internal.k0r.z5 var34 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(727), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var35 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(728), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var36 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(729), com.aspose.slides.internal.k0r.z5.class);
   }

   static void n5(ILightRig var0, com.aspose.slides.internal.k0r.r3 var1, boolean[] var2, g6o var3) {
      com.aspose.slides.internal.k0r.w8 var4 = var1.l6();
      if (var0.getLightType() != -1) {
         com.aspose.slides.internal.k0r.h5 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(767), com.aspose.slides.internal.k0r.h5.class);
         var2[0] = true;
         if (var0.getLightType() == 10 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.k5(722);
            var4.k5(726);
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 18 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 14 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 11 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.k5(724);
            var4.k5(722);
            var4.k5(726);
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 19 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.k5(724);
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 15 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.k5(724);
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 12 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.k5(722);
            var4.k5(726);
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 20 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 16 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 50000L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 11 && var0.getDirection() == 3) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.k5(722);
            var4.k5(726);
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(728, 50000L));
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 19 && var0.getDirection() == 3) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(728, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 15 && var0.getDirection() == 3) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(728, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 11 && var0.getDirection() == 7) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.k5(722);
            var4.k5(726);
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(728, 4294917296L));
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 19 && var0.getDirection() == 7) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(728, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 15 && var0.getDirection() == 7) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(728, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 12 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.k5(722);
            var4.k5(726);
            var4.k5(727);
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 20 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.k5(727);
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 16 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 4294917296L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.k5(727);
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 11 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.k5(724);
            var4.k5(722);
            var4.k5(726);
            var4.k5(727);
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 19 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.k5(724);
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.k5(727);
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 15 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.k5(724);
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.k5(727);
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 10 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.k5(722);
            var4.k5(726);
            var4.k5(727);
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 18 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.k5(727);
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 14 && var0.getDirection() == 5) {
            var4.k5(723);
            var4.l6(new com.aspose.slides.internal.k0r.z5(724, 50000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.k5(727);
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() == 9 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.k5(724);
            var4.k5(722);
            var4.k5(726);
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.k5(728);
            var4.k5(730);
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 17 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.k5(724);
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 10000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 44000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 24000L));
            var5.c8(true);
            var5.t2(false);
         } else if (var0.getLightType() == 13 && var0.getDirection() == 1) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(723, 0L));
            var4.k5(724);
            var4.l6(new com.aspose.slides.internal.k0r.z5(722, 4000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(726, 52000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(727, 0L));
            var4.k5(728);
            var4.l6(new com.aspose.slides.internal.k0r.z5(730, 14000L));
            var5.c8(true);
            var5.t2(true);
         } else if (var0.getLightType() != 9 || var0.getDirection() != 3 || !((LightRig)var0).u3()) {
            var3.n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Serialization of the non-Legacy combinations of lightRig.LightType and ", "lightRig.Direction into metroBlob is not imlemented yet."
               }),
               3
            );
            var2[0] = false;
         }

         float[] var6 = var0.getRotation();
         if (var6 != null && (var6[0] != 0.0F || var6[1] != 0.0F || var6[2] != 0.0F)) {
            var3.n5("Serialization of the lightRig Rotation is not imlemented yet.", 3);
         }
      }
   }
}
