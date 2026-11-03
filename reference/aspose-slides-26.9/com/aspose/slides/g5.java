package com.aspose.slides;

class g5 {
   static void n5(ICamera var0, com.aspose.slides.internal.k0r.r3 var1, t2s var2) {
      com.aspose.slides.internal.k0r.w8 var3 = var1 != null ? var1.l6() : new com.aspose.slides.internal.k0r.w8();
      h8 var4 = ((Camera)var0).u3();
      com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(704), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(705), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(715), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(716), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(718), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.z5 var10 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(719), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.h5 var11 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(767), com.aspose.slides.internal.k0r.h5.class);
      if (var11 == null) {
         var11 = new com.aspose.slides.internal.k0r.h5();
      }

      com.aspose.slides.internal.k0r.h5 var12 = var11;
      long var13 = 1250000L;
      long var15 = 4293717296L;
      long var17 = 32768L;
      long var19 = 4294934528L;
      long var21 = var7 != null ? var7.j5() : 1250000L;
      long var23 = var8 != null ? var8.j5() : 4293717296L;
      long var25 = var9 != null ? var9.j5() : 32768L;
      long var27 = var10 != null ? var10.j5() : 4294934528L;
      if (var21 == 4293717296L && var23 == 4293717296L && var25 == 4294934528L && var27 == 4294934528L) {
         var0.setCameraType(!var12.x8() ? 36 : 27);
      } else if ((var21 & 4294967295L) == 0L && var23 == 4293717296L && (var25 & 4294967295L) == 0L && var27 == 4294934528L) {
         var0.setCameraType(!var12.x8() ? 35 : 26);
      } else if (var21 == 1250000L && var23 == 4293717296L && var25 == 32768L && var27 == 4294934528L) {
         var0.setCameraType(!var12.x8() ? 37 : 28);
      } else if (var21 == 4293717296L && (var23 & 4294967295L) == 0L && var25 == 4294934528L && (var27 & 4294967295L) == 0L) {
         var0.setCameraType(!var12.x8() ? 33 : 24);
      } else if ((var21 & 4294967295L) == 0L && (var23 & 4294967295L) == 0L && (var25 & 4294967295L) == 0L && (var27 & 4294967295L) == 0L) {
         var0.setCameraType(!var12.x8() ? 32 : 23);
      } else if (var21 == 1250000L && (var23 & 4294967295L) == 0L && var25 == 32768L && (var27 & 4294967295L) == 0L) {
         var0.setCameraType(!var12.x8() ? 34 : 25);
      } else if (var21 == 4293717296L && (var23 & 4294967295L) == 1250000L && var25 == 4294934528L && (var27 & 4294967295L) == 32768L) {
         var0.setCameraType(!var12.x8() ? 30 : 21);
      } else if ((var21 & 4294967295L) == 0L && (var23 & 4294967295L) == 1250000L && (var25 & 4294967295L) == 0L && (var27 & 4294967295L) == 32768L) {
         var0.setCameraType(!var12.x8() ? 29 : 20);
      } else if (var21 == 1250000L && (var23 & 4294967295L) == 1250000L && var25 == 32768L && (var27 & 4294967295L) == 32768L) {
         var0.setCameraType(!var12.x8() ? 31 : 22);
      } else {
         var0.setCameraType(!var12.x8() ? 36 : 27);
         var4.n5(true);
      }

      if (var12.s7()) {
         int var29 = var6 != null ? (int)var6.j5() : 0;
         int var30 = var5 != null ? (int)var5.j5() : 0;
         byte var31 = 0;
         float var32 = -var29 / 65536.0F;
         if (var32 < 0.0F) {
            var32 += 360.0F;
         }

         float var33 = var30 / 65536.0F;
         if (var33 < 0.0F) {
            var33 += 360.0F;
         }

         var0.setRotation(var32, var33, var31 / 65536.0F);
      } else {
         var2.a6()
            .n5()
            .a6()
            .n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Deserialization of the ", "Style3Dc3DRotationAxisX, ..AxisY, ..AxisZ, ..Angle Camera data is not imlemented yet."
               }),
               2
            );
      }
   }

   static void n5(ICamera var0, com.aspose.slides.internal.k0r.r3 var1, boolean[] var2, g6o var3) {
      com.aspose.slides.internal.k0r.w8 var4 = var1.l6();
      h8 var5 = ((Camera)var0).u3();
      if (var5.l6()) {
         var4.k5(717);
         var4.k5(720);
         var4.k5(721);
      }

      var4.k5(704);
      var4.k5(705);
      if (var0.getCameraType() != -1) {
         com.aspose.slides.internal.k0r.h5 var6 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(767), com.aspose.slides.internal.k0r.h5.class);
         var2[0] = true;
         switch (var0.getCameraType()) {
            case -1:
               var2[0] = false;
               break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
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
               var3.n5("Serialization of the non-Legacy CameraPreset types into metroBlob is not imlemented yet.", 2);
               var2[0] = false;
               break;
            case 20:
            case 29:
               var4.l6(new com.aspose.slides.internal.k0r.z5(715, 0L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(716, 1250000L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(718, 0L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(719, 32768L));
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 5898240L));
               }

               var6.h0(var0.getCameraType() == 20);
               break;
            case 21:
            case 30:
               var4.l6(new com.aspose.slides.internal.k0r.z5(715, 4293717296L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(716, 1250000L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(718, 4294934528L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(719, 32768L));
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 2949120L));
               }

               var6.h0(var0.getCameraType() == 21);
               break;
            case 22:
            case 31:
               var4.k5(715);
               var4.l6(new com.aspose.slides.internal.k0r.z5(716, 1250000L));
               var4.k5(718);
               var4.l6(new com.aspose.slides.internal.k0r.z5(719, 32768L));
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 8847360L));
               }

               var6.h0(var0.getCameraType() == 22);
               break;
            case 23:
            case 32:
               var4.l6(new com.aspose.slides.internal.k0r.z5(715, 0L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(716, 0L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(718, 0L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(719, 0L));
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 0L));
               }

               var6.h0(var0.getCameraType() == 23);
               break;
            case 24:
            case 33:
               var4.l6(new com.aspose.slides.internal.k0r.z5(715, 4293717296L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(716, 0L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(718, 4294934528L));
               var4.l6(new com.aspose.slides.internal.k0r.z5(719, 0L));
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 4271374336L));
               }

               var6.h0(var0.getCameraType() == 24);
               break;
            case 25:
            case 34:
               var4.k5(715);
               var4.l6(new com.aspose.slides.internal.k0r.z5(716, 0L));
               var4.k5(718);
               var4.l6(new com.aspose.slides.internal.k0r.z5(719, 0L));
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 11796480L));
               }

               var6.h0(var0.getCameraType() == 25);
               break;
            case 26:
            case 35:
               var4.l6(new com.aspose.slides.internal.k0r.z5(715, 0L));
               var4.k5(716);
               var4.l6(new com.aspose.slides.internal.k0r.z5(718, 0L));
               var4.k5(719);
               if (var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 4289069056L));
               }

               var6.h0(var0.getCameraType() == 26);
               break;
            case 27:
            case 36:
               if (!var5.n5() || var5.l6()) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(715, 4293717296L));
                  var4.l6(new com.aspose.slides.internal.k0r.z5(718, 4294934528L));
                  var4.l6(new com.aspose.slides.internal.k0r.z5(720, 4292018176L));
                  var6.h0(var0.getCameraType() == 27);
               }
               break;
            case 28:
            case 37:
               var4.k5(715);
               var4.k5(716);
               var4.k5(718);
               var4.k5(719);
               var6.h0(var0.getCameraType() == 28);
         }

         float[] var7 = var0.getRotation();
         if (var7 != null) {
            int var8 = com.aspose.slides.internal.v6g.k5.u3(-var7[0] * 65536.0, 14);
            if (var8 != 0) {
               var4.n5(new com.aspose.slides.internal.k0r.z5(705, var8 & 4294967295L));
               var2[0] = true;
            }

            if (var7[0] > 90.0F) {
               var7[0] -= 360.0F;
            }

            if (var7[1] > 90.0F) {
               var7[1] -= 360.0F;
            }

            int var9 = com.aspose.slides.internal.v6g.k5.u3(var7[1] * 65536.0, 14);
            if (var9 != 0) {
               var4.n5(new com.aspose.slides.internal.k0r.z5(704, var9 & 4294967295L));
               var2[0] = true;
            }
         }
      }
   }
}
