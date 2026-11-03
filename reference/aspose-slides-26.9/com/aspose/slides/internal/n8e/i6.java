package com.aspose.slides.internal.n8e;

public class i6 {
   private static final com.aspose.slides.internal.x7n.l6 n5 = com.aspose.slides.internal.x7n.l6.k5();
   private int l6;
   private char k5;

   public static com.aspose.slides.internal.o9b.y1 n5(String var0) {
      float var1 = 0.0F;
      float var2 = 0.0F;
      float var3 = 0.0F;
      float var4 = 0.0F;
      int var5 = 0;

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      int var6 = var5;
      if (var5 < var0.length() && (var0.charAt(var5) == '-' || var0.charAt(var5) == '+')) {
         var5++;

         while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
            var5++;
         }
      }

      while (var5 < var0.length() && (var0.charAt(var5) >= '0' && var0.charAt(var5) <= '9' || var0.charAt(var5) == '.')) {
         var5++;
      }

      if (var6 != var5) {
         var1 = com.aspose.slides.ms.System.n1.n5(com.aspose.slides.ms.System.d1.l6(var0, var6, var5 - var6));
      }

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      if (var5 < var0.length() && var0.charAt(var5) == ',') {
         var5++;
      }

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      var6 = var5;
      if (var5 < var0.length() && (var0.charAt(var5) == '-' || var0.charAt(var5) == '+')) {
         var5++;

         while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
            var5++;
         }
      }

      while (var5 < var0.length() && (var0.charAt(var5) >= '0' && var0.charAt(var5) <= '9' || var0.charAt(var5) == '.')) {
         var5++;
      }

      if (var6 != var5) {
         var2 = com.aspose.slides.ms.System.n1.n5(com.aspose.slides.ms.System.d1.l6(var0, var6, var5 - var6));
      }

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      if (var5 < var0.length() && var0.charAt(var5) == ',') {
         var5++;
      }

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      var6 = var5;
      if (var5 < var0.length() && (var0.charAt(var5) == '-' || var0.charAt(var5) == '+')) {
         var5++;

         while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
            var5++;
         }
      }

      while (var5 < var0.length() && (var0.charAt(var5) >= '0' && var0.charAt(var5) <= '9' || var0.charAt(var5) == '.')) {
         var5++;
      }

      if (var6 != var5) {
         var3 = com.aspose.slides.ms.System.n1.n5(com.aspose.slides.ms.System.d1.l6(var0, var6, var5 - var6));
      }

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      if (var5 < var0.length() && var0.charAt(var5) == ',') {
         var5++;
      }

      while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
         var5++;
      }

      var6 = var5;
      if (var5 < var0.length() && (var0.charAt(var5) == '-' || var0.charAt(var5) == '+')) {
         var5++;

         while (var5 < var0.length() && var0.charAt(var5) <= ' ') {
            var5++;
         }
      }

      while (var5 < var0.length() && (var0.charAt(var5) >= '0' && var0.charAt(var5) <= '9' || var0.charAt(var5) == '.')) {
         var5++;
      }

      if (var6 != var5) {
         var4 = com.aspose.slides.ms.System.n1.n5(com.aspose.slides.ms.System.d1.l6(var0, var6, var5 - var6));
      }

      return new com.aspose.slides.internal.o9b.y1(var1, var2, var3, var4);
   }

   public static void n5(com.aspose.slides.internal.x4g.s7 var0, com.aspose.slides.internal.l7h.a5 var1, com.aspose.slides.internal.l7h.a5 var2) {
      n5(var0, var1, var2, 0.0F, 0.0F, 0.0F, false);
   }

   public static void n5(
      com.aspose.slides.internal.x4g.s7 var0,
      com.aspose.slides.internal.l7h.a5 var1,
      com.aspose.slides.internal.l7h.a5 var2,
      float var3,
      float var4,
      float var5,
      boolean var6
   ) {
      i6 var7 = new i6();
      com.aspose.slides.internal.o9b.y1 var8 = var0.s7().y4();
      float var9 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var8.s7()), com.aspose.slides.ms.System.q1.n5(var8.k5()));
      if (var6) {
         var7.l6 = 100;
      } else {
         byte var10 = 1;

         while (1000.0 / var10 > var9) {
            var10 *= 10;
         }

         var7.l6 = var10;
      }

      var7.n5(var0, var1, var2, var3, var4, var5);
   }

   private void n5(
      com.aspose.slides.internal.x4g.s7 var1,
      com.aspose.slides.internal.l7h.a5 var2,
      com.aspose.slides.internal.l7h.a5 var3,
      float var4,
      float var5,
      float var6
   ) {
      if (var1.h0() != 0) {
         byte[] var7 = var1.u9();
         com.aspose.slides.internal.o9b.w1[] var8 = var1.a6();
         int var9 = 0;
         boolean var10 = com.aspose.slides.ms.System.q1.n5(var4) + com.aspose.slides.ms.System.q1.n5(var5) < 0.01;
         float var11 = 0.0F;
         float var12 = 0.0F;
         float var13 = var6 < 16.0F ? var6 / 2.0F : var6 / 4.0F;
         if (var4 > 0.0F) {
            var11 = var4 + var13;
            var11 *= var11;
         }

         if (var5 > 0.0F) {
            var12 = var5 + var13;
            var12 *= var12;
         }

         int var14 = var1.h0();

         while (var9 < var7.length) {
            boolean var15 = false;
            int var16 = var9;

            while (var9 < var14 && !var15) {
               if ((var7[var9] & 255 & 31) == 0 && var9 > var16) {
                  if ((var7[var9] & 255) == 0) {
                     var15 = true;
                  }
                  break;
               }

               switch (var7[var9] & 0xFF & 31) {
                  case 0:
                  case 1:
                  default:
                     var9++;
                     break;
                  case 2:
                     var9 += 2;
                     break;
                  case 3:
                     var9 += 3;
               }

               if ((var7[var9 - 1] & 255 & 128) != 0) {
                  var15 = true;
               }
            }

            if (var9 > var14) {
               var9 = var14;
            }

            com.aspose.slides.internal.l7h.a5 var17;
            if (!var15 && !var10 && var9 - var16 != 1) {
               int var18 = var16 + 1;
               int var19 = var9 - 1;
               int var20 = var19;
               double var21 = -1.0;
               double var23 = -1.0;
               double var25 = var8[var16].l6();
               double var27 = var8[var16].k5();
               double var29 = var8[var19].l6();
               double var31 = var8[var19].k5();
               boolean var33 = var4 < 1.0E-4;

               while (var18 < var9 && !var33) {
                  switch (var7[var18] & 0xFF & 31) {
                     case 1:
                     default:
                        if (!(n5(var8[var16].u3(), var8[var18].u3()) > var11)) {
                           var18++;
                           break;
                        }

                        double var96 = var8[var18 - 1].l6() - var25;
                        double var101 = var8[var18 - 1].k5() - var27;
                        double var114 = var8[var18].l6() - var25 - var96;
                        double var130 = var8[var18].k5() - var27 - var101;
                        double var146 = 2.0 * (var114 + var130);
                        double var160 = var114 * var114 + var130 * var130;
                        double var169 = var146 * var146 - 4.0 * var160 * (var96 * var96 + var101 * var101 - var11);
                        double var175 = com.aspose.slides.ms.System.q1.z3(var169);
                        double var181 = (-var146 - var175) / 2.0 / var160;
                        double var187 = (-var146 + var175) / 2.0 / var160;
                        var21 = var181 >= 0.0 && var181 <= 1.0 ? var181 : var187;
                        var33 = true;
                        break;
                     case 2:
                        if (!(n5(var8[var16].u3(), var8[var18].u3()) > var11) && !(n5(var8[var16].u3(), var8[var18 + 1].u3()) > var11)) {
                           var18 += 2;
                        } else {
                           double var95 = var8[var18 - 1].l6() - var25;
                           double var100 = var8[var18 - 1].k5() - var27;
                           double var113 = var8[var18].l6() - var25;
                           double var129 = var8[var18].k5() - var27;
                           double var145 = var8[var18 + 1].l6() - var25;
                           double var159 = var8[var18 + 1].k5() - var27;
                           double var168 = var95 - 2.0 * var113 + var145;
                           double var174 = 2.0 * (var113 - var95);
                           double var180 = var100 - 2.0 * var129 + var159;
                           double var186 = 2.0 * (var129 - var100);
                           double[] var54 = new double[]{
                              var95 * var95 + var100 * var100 - var11,
                              2.0 * (var95 * var174 + var100 * var186),
                              var174 * var174 + 2.0 * (var95 * var168 + var100 * var186) + var186 * var186,
                              2.0 * (var168 * var174 + var180 * var186),
                              var168 * var168 + var180 * var180
                           };
                           double[] var55 = v0.n5(var54, 0.0, 1.0);
                           if (var55.length > 0) {
                              var21 = var55[0];
                              var33 = true;
                           } else {
                              var18 += 2;
                           }
                        }
                        break;
                     case 3:
                        if (!(n5(var8[var16].u3(), var8[var18].u3()) > var11)
                           && !(n5(var8[var16].u3(), var8[var18 + 1].u3()) > var11)
                           && !(n5(var8[var16].u3(), var8[var18 + 2].u3()) > var11)) {
                           var18 += 3;
                        } else {
                           double var34 = var8[var18 - 1].l6() - var25;
                           double var36 = var8[var18 - 1].k5() - var27;
                           double var38 = var8[var18].l6() - var25;
                           double var40 = var8[var18].k5() - var27;
                           double var42 = var8[var18 + 1].l6() - var25;
                           double var44 = var8[var18 + 1].k5() - var27;
                           double var46 = var8[var18 + 2].l6() - var25;
                           double var48 = var8[var18 + 2].k5() - var27;
                           double var50 = var46 - 3.0 * var42 + 3.0 * var38 - var34;
                           double var52 = 3.0 * (var42 - 2.0 * var38 + var34);
                           double var56 = 3.0 * (var38 - var34);
                           double var58 = var48 - 3.0 * var44 + 3.0 * var40 - var36;
                           double var60 = 3.0 * (var44 - 2.0 * var40 + var36);
                           double var62 = 3.0 * (var40 - var36);
                           double[] var64 = new double[]{
                              var34 * var34 + var36 * var36 - var11,
                              2.0 * (var34 * var56 + var36 * var62),
                              var56 * var56 + 2.0 * (var34 * var52 + var36 * var60) + var62 * var62,
                              2.0 * (var50 * var34 + var56 * var52 + var58 * var36 + var62 * var60),
                              var52 * var52 + 2.0 * (var50 * var56 + var58 * var62) + var60 * var60,
                              2.0 * (var50 * var52 + var58 * var60),
                              var50 * var50 + var58 * var58
                           };
                           double[] var65 = v0.n5(var64, 0.0, 1.0);
                           if (var65.length > 0) {
                              var21 = var65[0];
                              var33 = true;
                           } else {
                              var18 += 3;
                           }
                        }
                  }
               }

               var33 = var5 < 1.0E-4;

               while (var16 < var20 && !var33) {
                  switch (var7[var20] & 0xFF & 31) {
                     case 1:
                     default:
                        if (!(n5(var8[var19].u3(), var8[var20 - 1].u3()) > var12)) {
                           var20--;
                           break;
                        }

                        double var99 = var8[var20].l6() - var29;
                        double var104 = var8[var20].k5() - var31;
                        double var117 = var8[var20 - 1].l6() - var29 - var99;
                        double var133 = var8[var20 - 1].k5() - var31 - var104;
                        double var149 = 2.0 * (var117 + var133);
                        double var163 = var117 * var117 + var133 * var133;
                        double var172 = var149 * var149 - 4.0 * var163 * (var99 * var99 + var104 * var104 - var12);
                        double var178 = com.aspose.slides.ms.System.q1.z3(var172);
                        double var184 = (-var149 - var178) / 2.0 / var163;
                        double var190 = (-var149 + var178) / 2.0 / var163;
                        var23 = var184 >= 0.0 && var184 <= 1.0 ? var184 : var190;
                        var33 = true;
                        break;
                     case 2:
                        if (!(n5(var8[var19].u3(), var8[var20 - 1].u3()) > var12) && !(n5(var8[var19].u3(), var8[var20 - 2].u3()) > var12)) {
                           var20 -= 2;
                        } else {
                           double var98 = var8[var20].l6() - var29;
                           double var103 = var8[var20].k5() - var31;
                           double var116 = var8[var20 - 1].l6() - var29;
                           double var132 = var8[var20 - 1].k5() - var31;
                           double var148 = var8[var20 - 2].l6() - var29;
                           double var162 = var8[var20 - 2].k5() - var31;
                           double var171 = var98 - 2.0 * var116 + var148;
                           double var177 = 2.0 * (var116 - var98);
                           double var183 = var103 - 2.0 * var132 + var162;
                           double var189 = 2.0 * (var132 - var103);
                           double[] var192 = new double[]{
                              var98 * var98 + var103 * var103 - var12,
                              2.0 * (var98 * var177 + var103 * var189),
                              var177 * var177 + 2.0 * (var98 * var171 + var103 * var189) + var189 * var189,
                              2.0 * (var171 * var177 + var183 * var189),
                              var171 * var171 + var183 * var183
                           };
                           double[] var195 = v0.n5(var192, 0.0, 1.0);
                           if (var195.length > 0) {
                              var23 = var195[0];
                              var33 = true;
                           } else {
                              var20 -= 2;
                           }
                        }
                        break;
                     case 3:
                        if (!(n5(var8[var19].u3(), var8[var20 - 1].u3()) > var12)
                           && !(n5(var8[var19].u3(), var8[var20 - 2].u3()) > var12)
                           && !(n5(var8[var19].u3(), var8[var20 - 3].u3()) > var12)) {
                           var20 -= 3;
                        } else {
                           double var97 = var8[var20].l6() - var29;
                           double var102 = var8[var20].k5() - var31;
                           double var115 = var8[var20 - 1].l6() - var29;
                           double var131 = var8[var20 - 1].k5() - var31;
                           double var147 = var8[var20 - 2].l6() - var29;
                           double var161 = var8[var20 - 2].k5() - var31;
                           double var170 = var8[var20 - 3].l6() - var29;
                           double var176 = var8[var20 - 3].k5() - var31;
                           double var182 = var170 - 3.0 * var147 + 3.0 * var115 - var97;
                           double var188 = 3.0 * (var147 - 2.0 * var115 + var97);
                           double var198 = 3.0 * (var115 - var97);
                           double var199 = var176 - 3.0 * var161 + 3.0 * var131 - var102;
                           double var200 = 3.0 * (var161 - 2.0 * var131 + var102);
                           double var201 = 3.0 * (var131 - var102);
                           double[] var202 = new double[]{
                              var97 * var97 + var102 * var102 - var12,
                              2.0 * (var97 * var198 + var102 * var201),
                              var198 * var198 + 2.0 * (var97 * var188 + var102 * var200) + var201 * var201,
                              2.0 * (var182 * var97 + var198 * var188 + var199 * var102 + var201 * var200),
                              var188 * var188 + 2.0 * (var182 * var198 + var199 * var201) + var200 * var200,
                              2.0 * (var182 * var188 + var199 * var200),
                              var182 * var182 + var199 * var199
                           };
                           double[] var203 = v0.n5(var202, 0.0, 1.0);
                           if (var203.length > 0) {
                              var23 = var203[0];
                              var33 = true;
                           } else {
                              var20 -= 3;
                           }
                        }
                  }
               }

               if (var20 < var18) {
                  byte[] var204 = new byte[]{0, 1, 1, 1};
                  com.aspose.slides.internal.o9b.w1[] var205 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
                  );
                  if (var21 >= 0.0) {
                     switch (var7[var19] & 0xFF & 3) {
                        case 1:
                        default:
                           var205[1] = new com.aspose.slides.internal.o9b.w1(
                              (float)((1.0 - var21) * var8[var18 - 1].l6() + var21 * var8[var18].l6()),
                              (float)((1.0 - var21) * var8[var18 - 1].k5() + var21 * var8[var18].k5())
                           );
                           break;
                        case 2:
                           double var106 = 1.0 - var21;
                           double var122 = var21 * var21;
                           double var138 = var106 * var106;
                           double var154 = var21 * var106;
                           var205[1] = new com.aspose.slides.internal.o9b.w1(
                              (float)(var138 * var8[var18 - 1].l6() + 2.0 * var154 * var8[var18].l6() + var122 * var8[var18 + 1].l6()),
                              (float)(var138 * var8[var18 - 1].k5() + 2.0 * var154 * var8[var18].k5() + var122 * var8[var18 + 1].k5())
                           );
                           break;
                        case 3:
                           double var105 = 1.0 - var21;
                           double var121 = var21 * var21;
                           double var137 = var105 * var105;
                           double var153 = var121 * var21;
                           double var166 = var137 * var105;
                           var205[1] = new com.aspose.slides.internal.o9b.w1(
                              (float)(
                                 var166 * var8[var18 - 1].l6()
                                    + 3.0 * var21 * var137 * var8[var18].l6()
                                    + 3.0 * var121 * var105 * var8[var18 + 1].l6()
                                    + var153 * var8[var18 + 2].l6()
                              ),
                              (float)(
                                 var166 * var8[var18 - 1].k5()
                                    + 3.0 * var21 * var137 * var8[var18].k5()
                                    + 3.0 * var121 * var105 * var8[var18 + 1].k5()
                                    + var153 * var8[var18 + 2].k5()
                              )
                           );
                     }
                  } else {
                     double var107 = var8[var19].l6() - var8[var16].l6();
                     double var123 = var8[var19].k5() - var8[var16].k5();
                     double var139 = com.aspose.slides.ms.System.q1.z3(var107 * var107 + var123 * var123);
                     double var155 = com.aspose.slides.ms.System.q1.z3(var11);
                     var205[1] = new com.aspose.slides.internal.o9b.w1(
                        (float)(var8[var16].l6() + var107 / var139 * var155), (float)(var8[var16].k5() + var123 / var139 * var155)
                     );
                  }

                  if (var23 >= 0.0) {
                     switch (var7[var19] & 0xFF & 3) {
                        case 1:
                        default:
                           var205[2] = new com.aspose.slides.internal.o9b.w1(
                              (float)((1.0 - var23) * var8[var20].l6() + var23 * var8[var20 - 1].l6()),
                              (float)((1.0 - var23) * var8[var20].k5() + var23 * var8[var20 - 1].k5())
                           );
                           break;
                        case 2:
                           double var109 = 1.0 - var23;
                           double var125 = var23 * var23;
                           double var141 = var109 * var109;
                           double var157 = var23 * var109;
                           var205[2] = new com.aspose.slides.internal.o9b.w1(
                              (float)(var141 * var8[var20].l6() + 2.0 * var157 * var8[var20 - 1].l6() + var125 * var8[var20 - 2].l6()),
                              (float)(var141 * var8[var20].k5() + 2.0 * var157 * var8[var20 - 1].k5() + var125 * var8[var20 - 2].k5())
                           );
                           break;
                        case 3:
                           double var108 = 1.0 - var23;
                           double var124 = var23 * var23;
                           double var140 = var108 * var108;
                           double var156 = var124 * var23;
                           double var167 = var140 * var108;
                           var205[2] = new com.aspose.slides.internal.o9b.w1(
                              (float)(
                                 var167 * var8[var20].l6()
                                    + 3.0 * var23 * var140 * var8[var20 - 1].l6()
                                    + 3.0 * var124 * var108 * var8[var20 - 2].l6()
                                    + var156 * var8[var20 - 3].l6()
                              ),
                              (float)(
                                 var167 * var8[var20].k5()
                                    + 3.0 * var23 * var140 * var8[var20 - 1].k5()
                                    + 3.0 * var124 * var108 * var8[var20 - 2].k5()
                                    + var156 * var8[var20 - 3].k5()
                              )
                           );
                     }
                  } else {
                     double var110 = var8[var16].l6() - var8[var19].l6();
                     double var126 = var8[var16].k5() - var8[var19].k5();
                     double var142 = com.aspose.slides.ms.System.q1.z3(var110 * var110 + var126 * var126);
                     double var158 = com.aspose.slides.ms.System.q1.z3(var12);
                     var205[2] = new com.aspose.slides.internal.o9b.w1(
                        (float)(var8[var19].l6() + var110 / var142 * var158), (float)(var8[var19].k5() + var126 / var142 * var158)
                     );
                  }

                  double var111 = var8[var16].l6() - var205[1].l6();
                  double var127 = var8[var16].k5() - var205[1].k5();
                  double var143 = com.aspose.slides.ms.System.q1.z3(var111 * var111 + var127 * var127);
                  var205[0] = new com.aspose.slides.internal.o9b.w1(
                     (float)(var205[1].l6() + var111 / var143 * var13), (float)(var205[1].k5() + var127 / var143 * var13)
                  );
                  var111 = var8[var19].l6() - var205[2].l6();
                  var127 = var8[var19].k5() - var205[2].k5();
                  var143 = com.aspose.slides.ms.System.q1.z3(var111 * var111 + var127 * var127);
                  var205[3] = new com.aspose.slides.internal.o9b.w1(
                     (float)(var205[2].l6() + var111 / var143 * var13), (float)(var205[2].k5() + var127 / var143 * var13)
                  );
                  var17 = this.n5(var204, var205, 0, var204.length);
               } else {
                  int var66 = var20 - var18 + 2;
                  if (var4 > 0.0F) {
                     var66++;
                  }

                  if (var5 > 0.0F) {
                     var66++;
                  }

                  com.aspose.slides.internal.o9b.w1[] var67 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var66)
                  );
                  byte[] var68 = new byte[var66];
                  int var69 = var21 >= 0.0 ? 1 : 0;

                  for (int var70 = var18 - 1; var70 <= var20; var69++) {
                     var68[var69] = var7[var70];
                     var8[var70].n5(var67[var69]);
                     var70++;
                  }

                  var68[0] = 0;
                  if (var21 >= 0.0) {
                     switch (var68[2] & 0xFF & 3) {
                        case 1:
                        default:
                           var67[1] = new com.aspose.slides.internal.o9b.w1(
                              (float)((1.0 - var21) * var67[1].l6() + var21 * var67[2].l6()), (float)((1.0 - var21) * var67[1].k5() + var21 * var67[2].k5())
                           );
                           break;
                        case 2:
                           double var207 = var21 * var21;
                           double var209 = 1.0 - var21;
                           double var211 = var209 * var209;
                           double var213 = var21 * var209;
                           com.aspose.slides.internal.o9b.w1 var79 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var211 * var67[1].l6() + 2.0 * var213 * var67[2].l6() + var207 * var67[3].l6()),
                              (float)(var211 * var67[1].k5() + 2.0 * var213 * var67[2].k5() + var207 * var67[3].k5())
                           );
                           com.aspose.slides.internal.o9b.w1 var80 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var209 * var67[2].l6() + var21 * var67[3].l6()), (float)(var209 * var67[2].k5() + var21 * var67[3].k5())
                           );
                           var79.n5(var67[1]);
                           var80.n5(var67[2]);
                           break;
                        case 3:
                           double var71 = 1.0 - var21;
                           double var73 = var21 * var21;
                           double var75 = var73 * var21;
                           double var77 = var21 * var71;
                           double var81 = var71 * var71;
                           double var83 = var73 * var71;
                           double var85 = var21 * var81;
                           double var87 = var81 * var71;
                           com.aspose.slides.internal.o9b.w1 var89 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var87 * var67[1].l6() + 3.0 * var85 * var67[2].l6() + 3.0 * var83 * var67[3].l6() + var75 * var67[4].l6()),
                              (float)(var87 * var67[1].k5() + 3.0 * var85 * var67[2].k5() + 3.0 * var83 * var67[3].k5() + var75 * var67[4].k5())
                           );
                           com.aspose.slides.internal.o9b.w1 var193 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var81 * var67[2].l6() + 2.0 * var77 * var67[3].l6() + var73 * var67[4].l6()),
                              (float)(var81 * var67[2].k5() + 2.0 * var77 * var67[3].k5() + var73 * var67[4].k5())
                           );
                           com.aspose.slides.internal.o9b.w1 var196 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var71 * var67[3].l6() + var21 * var67[4].l6()), (float)(var71 * var67[3].k5() + var21 * var67[4].k5())
                           );
                           var89.n5(var67[1]);
                           var193.n5(var67[2]);
                           var196.n5(var67[3]);
                     }

                     double var208 = var8[var16].l6() - var67[1].l6();
                     double var210 = var8[var16].k5() - var67[1].k5();
                     double var212 = com.aspose.slides.ms.System.q1.z3(var208 * var208 + var210 * var210);
                     var67[0] = new com.aspose.slides.internal.o9b.w1(
                        (float)(var67[1].l6() + var208 / var212 * var13), (float)(var67[1].k5() + var210 / var212 * var13)
                     );
                     var68[1] = 1;
                  }

                  if (var23 >= 0.0) {
                     if (var20 - var18 < (var7[var20] & 255 & 3) && var21 >= 0.0) {
                        var23 = var23 / (1.0 - var21) + 0.001;
                     }

                     var69 = var68.length - 2;
                     switch (var68[var69] & 0xFF & 31) {
                        case 1:
                        default:
                           var67[var69] = new com.aspose.slides.internal.o9b.w1(
                              (float)((1.0 - var23) * var67[var69].l6() + var23 * var67[var69 - 1].l6()),
                              (float)((1.0 - var23) * var67[var69].k5() + var23 * var67[var69 - 1].k5())
                           );
                           break;
                        case 2:
                           double var119 = var23 * var23;
                           double var135 = 1.0 - var23;
                           double var151 = var135 * var135;
                           double var165 = var23 * var135;
                           com.aspose.slides.internal.o9b.w1 var214 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var151 * var67[var69].l6() + 2.0 * var165 * var67[var69 - 1].l6() + var119 * var67[var69 - 2].l6()),
                              (float)(var151 * var67[var69].k5() + 2.0 * var165 * var67[var69 - 1].k5() + var119 * var67[var69 - 2].k5())
                           );
                           com.aspose.slides.internal.o9b.w1 var90 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var135 * var67[var69 - 1].l6() + var23 * var67[var69 - 2].l6()),
                              (float)(var135 * var67[var69 - 1].k5() + var23 * var67[var69 - 2].k5())
                           );
                           var214.n5(var67[var69]);
                           var90.n5(var67[var69 - 1]);
                           break;
                        case 3:
                           double var118 = 1.0 - var23;
                           double var134 = var23 * var23;
                           double var150 = var134 * var23;
                           double var164 = var23 * var118;
                           double var173 = var118 * var118;
                           double var179 = var134 * var118;
                           double var185 = var23 * var173;
                           double var191 = var173 * var118;
                           com.aspose.slides.internal.o9b.w1 var194 = new com.aspose.slides.internal.o9b.w1(
                              (float)(
                                 var191 * var67[var69].l6()
                                    + 3.0 * var185 * var67[var69 - 1].l6()
                                    + 3.0 * var179 * var67[var69 - 2].l6()
                                    + var150 * var67[var69 - 3].l6()
                              ),
                              (float)(
                                 var191 * var67[var69].k5()
                                    + 3.0 * var185 * var67[var69 - 1].k5()
                                    + 3.0 * var179 * var67[var69 - 2].k5()
                                    + var150 * var67[var69 - 3].k5()
                              )
                           );
                           com.aspose.slides.internal.o9b.w1 var197 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var173 * var67[var69 - 1].l6() + 2.0 * var164 * var67[var69 - 2].l6() + var134 * var67[var69 - 3].l6()),
                              (float)(var173 * var67[var69 - 1].k5() + 2.0 * var164 * var67[var69 - 2].k5() + var134 * var67[var69 - 3].k5())
                           );
                           com.aspose.slides.internal.o9b.w1 var91 = new com.aspose.slides.internal.o9b.w1(
                              (float)(var118 * var67[var69 - 2].l6() + var23 * var67[var69 - 3].l6()),
                              (float)(var118 * var67[var69 - 2].k5() + var23 * var67[var69 - 3].k5())
                           );
                           var194.n5(var67[var69]);
                           var197.n5(var67[var69 - 1]);
                           var91.n5(var67[var69 - 2]);
                     }

                     double var120 = var8[var19].l6() - var67[var69].l6();
                     double var136 = var8[var19].k5() - var67[var69].k5();
                     double var152 = com.aspose.slides.ms.System.q1.z3(var120 * var120 + var136 * var136);
                     var67[var69 + 1] = new com.aspose.slides.internal.o9b.w1(
                        (float)(var67[var69].l6() + var120 / var152 * var13), (float)(var67[var69].k5() + var136 / var152 * var13)
                     );
                     var68[var69 + 1] = 1;
                  }

                  var17 = this.n5(var68, var67, 0, var68.length);
               }
            } else {
               var17 = this.n5(var7, var8, var16, var9);
            }

            if (var15) {
               if (var2 != null) {
                  var2.n5((Object)var17);
               }
            } else if (var3 != null) {
               var3.n5((Object)var17);
            }
         }
      }
   }

   private com.aspose.slides.internal.l7h.a5 n5(byte[] var1, com.aspose.slides.internal.o9b.w1[] var2, int var3, int var4) {
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      int var6 = var3;
      double var7 = 0.0;
      double var9 = 0.0;
      this.k5 = '*';

      while (var6 < var4) {
         switch (var1[var6] & 0xFF & 31) {
            case 0:
               double var31 = this.n5(var2[var6].l6());
               double var34 = this.n5(var2[var6].k5());
               var6++;
               String var37 = com.aspose.slides.ms.System.d1.n5("M{0}{1}",new Object[]{ this.l6(var31), this.k5(var34)});
               String var40 = com.aspose.slides.ms.System.d1.n5("m{0}{1}",new Object[]{ this.l6(var31 - var7), this.k5(var34 - var9)});
               var7 = var31;
               var9 = var34;
               if (var37.length() <= var40.length()) {
                  var5.n5(var37);
                  this.k5 = 'M';
               } else {
                  var5.n5(var40);
                  this.k5 = 'm';
               }
               break;
            case 1:
               double var30 = this.n5(var2[var6].l6());
               double var33 = this.n5(var2[var6].k5());
               var6++;
               String var36 = this.k5 == 'L'
                  ? com.aspose.slides.ms.System.d1.n5(new String[]{this.k5(var30), this.k5(var33)})
                  : com.aspose.slides.ms.System.d1.n5("L{0}{1}",new Object[]{ this.l6(var30), this.k5(var33)});
               String var39 = this.k5 == 'l'
                  ? com.aspose.slides.ms.System.d1.n5(new String[]{this.k5(var30), this.k5(var33)})
                  : com.aspose.slides.ms.System.d1.n5("l{0}{1}",new Object[]{ this.l6(var30), this.k5(var33)});
               var7 = var30;
               var9 = var33;
               if (var36.length() <= var39.length()) {
                  var5.n5(var36);
                  this.k5 = 'L';
               } else {
                  var5.n5(var39);
                  this.k5 = 'l';
               }
               break;
            case 2:
               double var29 = this.n5(var2[var6].l6());
               double var32 = this.n5(var2[var6].k5());
               double var41 = this.n5(var2[++var6].l6());
               double var42 = this.n5(var2[var6].k5());
               var6++;
               String var35 = this.k5 == 'Q'
                  ? com.aspose.slides.ms.System.d1.n5("{0}{1}{2}{3}",new Object[]{ this.k5(var29), this.k5(var32), this.k5(var41), this.k5(var42)})
                  : com.aspose.slides.ms.System.d1.n5("Q{0}{1}{2}{3}",new Object[]{ this.l6(var29), this.k5(var32), this.k5(var41), this.k5(var42)});
               String var38 = this.k5 == 'q'
                  ? com.aspose.slides.ms.System.d1.n5("{0}{1}{2}{3}",new Object[]{ this.k5(var29), this.k5(var32), this.k5(var41), this.k5(var42)})
                  : com.aspose.slides.ms.System.d1.n5("q{0}{1}{2}{3}",new Object[]{ this.l6(var29), this.k5(var32), this.k5(var41), this.k5(var42)});
               var7 = var41;
               var9 = var42;
               if (var35.length() <= var38.length()) {
                  var5.n5(var35);
                  this.k5 = 'Q';
               } else {
                  var5.n5(var38);
                  this.k5 = 'q';
               }

               var6 += 2;
               break;
            case 3:
               double var11 = this.n5(var2[var6].l6());
               double var13 = this.n5(var2[var6].k5());
               double var17 = this.n5(var2[++var6].l6());
               double var19 = this.n5(var2[var6].k5());
               double var21 = this.n5(var2[++var6].l6());
               double var23 = this.n5(var2[var6].k5());
               var6++;
               String var15 = this.k5 == 'C'
                  ? com.aspose.slides.ms.System.d1.n5(
                     "{0}{1}{2}{3}{4}{5}",new Object[]{ this.k5(var11), this.k5(var13), this.k5(var17), this.k5(var19), this.k5(var21), this.k5(var23)
                  })
                  : com.aspose.slides.ms.System.d1.n5(
                     "C{0}{1}{2}{3}{4}{5}",new Object[]{ this.l6(var11), this.k5(var13), this.k5(var17), this.k5(var19), this.k5(var21), this.k5(var23)
                  });
               String var16 = this.k5 == 'c'
                  ? com.aspose.slides.ms.System.d1.n5(
                     "{0}{1}{2}{3}{4}{5}",new Object[]{ this.k5(var11), this.k5(var13), this.k5(var17), this.k5(var19), this.k5(var21), this.k5(var23)
                  })
                  : com.aspose.slides.ms.System.d1.n5(
                     "c{0}{1}{2}{3}{4}{5}",new Object[]{ this.l6(var11), this.k5(var13), this.k5(var17), this.k5(var19), this.k5(var21), this.k5(var23)
                  });
               var7 = var21;
               var9 = var23;
               if (var15.length() <= var16.length()) {
                  var5.n5(var15);
                  this.k5 = 'C';
               } else {
                  var5.n5(var16);
                  this.k5 = 'c';
               }
         }

         if ((var1[var6 - 1] & 255 & 128) != 0) {
            var5.n5("z");
            this.k5 = 'z';
         }
      }

      return var5;
   }

   private double n5(double var1) {
      return com.aspose.slides.ms.System.q1.u3(var1 * this.l6) / this.l6;
   }

   private String l6(double var1) {
      return com.aspose.slides.ms.System.d2.n5(var1, n5);
   }

   private String k5(double var1) {
      return var1 < 0.0 ? com.aspose.slides.ms.System.d2.n5(var1, n5) : com.aspose.slides.ms.System.d1.n5(new String[]{" ", com.aspose.slides.ms.System.d2.n5(var1, n5)});
   }

   private static float n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      float var2 = var0.l6() - var1.l6();
      float var3 = var0.k5() - var1.k5();
      return var2 * var2 + var3 * var3;
   }
}
