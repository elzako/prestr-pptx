package com.aspose.slides;

final class g0h extends DomObject<Table> implements q1v {
   private final d7f[][] n5 = this.n5();
   private IPresentationComponent l6;
   private final long k5;
   private static long u3 = 1L;

   g0h(Table var1) {
      super(var1);
      this.k5 = u3++;
   }

   final d7f n5(int var1, int var2) {
      return this.n5[var2][var1];
   }

   final d7f[][] n5() {
      int var1 = this.u9.n5.size();
      int var2 = this.u9.l6.size();
      w0j[][] var3 = new w0j[var1][var2];
      c7e[][] var4 = new c7e[var1][var2];
      v9r[][][] var5 = new v9r[var1 + 1][var2 + 1][6];
      w0j var6 = null;
      c7e var7 = null;
      v9r var8 = null;
      v9r var9 = null;
      v9r var10 = null;
      v9r var11 = null;
      v9r var12 = null;
      v9r var13 = null;
      v9r var14 = null;
      v9r var15 = null;
      z2x var16 = this.u9.u9();
      if (var16 != null) {
         for (int var17 = 0; var17 < var1; var17++) {
            for (int var18 = 0; var18 < var2; var18++) {
               var4[var17][var18] = new c7e(var16);
            }
         }

         w0j[] var84 = new w0j[]{var6};
         c7e[] var87 = new c7e[]{var7};
         v9r[] var19 = new v9r[]{var8};
         v9r[] var20 = new v9r[]{var9};
         v9r[] var21 = new v9r[]{var10};
         v9r[] var22 = new v9r[]{var11};
         v9r[] var23 = new v9r[]{var12};
         v9r[] var24 = new v9r[]{var13};
         v9r[] var25 = new v9r[]{var14};
         v9r[] var26 = new v9r[]{var15};
         boolean var27 = n5(var16.k5(), var16.z1(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
         var6 = var84[0];
         var7 = var87[0];
         var8 = var19[0];
         var9 = var20[0];
         var10 = var21[0];
         var11 = var22[0];
         var12 = var23[0];
         var13 = var24[0];
         var14 = var25[0];
         var15 = var26[0];
         if (var27) {
            v9r var28 = var9;

            for (int var29 = 0; var29 < var1; var29++) {
               v9r var30 = var8;

               for (int var31 = 0; var31 < var2; var31++) {
                  var3[var29][var31] = var6;
                  var4[var29][var31].n5(var7);
                  var5[var29][var31][4] = var14;
                  var5[var29][var31][5] = var15;
                  var5[var29][var31][0] = var30;
                  var5[var29][var31][1] = var28;
                  var30 = var13;
               }

               var5[var29][var2][0] = var10;
               var28 = var12;
            }

            for (int var101 = 0; var101 < var2; var101++) {
               var5[var1][var101][1] = var11;
            }
         }

         int var102 = this.u9.getFirstRow() ? 1 : 0;
         int var105 = this.u9.getLastRow() ? var1 - 1 : var1;
         int var32 = this.u9.getFirstCol() ? 1 : 0;
         int var33 = this.u9.getLastCol() ? var2 - 1 : var2;
         if (this.u9.getHorizontalBanding()) {
            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.u3(), var16.t4(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               this.n5(var102, var105, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
            }

            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.a6(), var16.q0(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               this.n5(var102 + 1, var105, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
            }
         }

         if (this.u9.getVerticalBanding()) {
            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.u9(), var16.z3(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               this.l6(var32, var33, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
            }

            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.h0(), var16.m1(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               this.l6(var32 + 1, var33, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
            }
         }

         if (this.u9.getLastCol()) {
            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.c8(), var16.k7(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               Column var34 = this.u9.l6.n5(var2 - 1);
               int var35 = var34.get_Item(0).getColSpan();
               v9r var99 = var9;
               int var36 = 0;

               while (var36 < var1) {
                  Cell var37 = (Cell)var34.get_Item(var36);
                  int var38 = var37.getColSpan();
                  int var39 = var37.getFirstColumnIndex();

                  for (int var40 = 0; var40 < var37.getRowSpan(); var40++) {
                     if (var8 != null) {
                        var5[var36 + var40][var39][0] = var8;
                     }

                     if (var11 != null) {
                        var5[var36 + var40][var2][0] = var10;
                     }
                  }

                  if (var6 != null) {
                     var3[var36][var39] = var6;
                  }

                  if (var7 != null) {
                     var4[var36][var39].l6(var7);
                  }

                  if (var14 != null) {
                     var5[var36][var39][4] = var14;
                  }

                  if (var15 != null) {
                     var5[var36][var39][5] = var15;
                  }

                  int var134 = var36 + var37.getRowSpan();
                  int var41 = com.aspose.slides.ms.System.q1.l6(var35, var38);
                  int var42 = com.aspose.slides.ms.System.q1.n5(var35, var38);
                  if (var8 != null) {
                     for (int var43 = var2 - var42; var43 < var2 - var41; var43++) {
                        var5[var36][var43][1] = var9;
                     }
                  }

                  if (var99 != null) {
                     for (int var147 = var2 - var41; var147 < var2; var147++) {
                        var5[var36][var147][0] = var99;
                     }
                  }

                  var99 = var12;
                  var35 = var38;
                  var36 = var134;
               }

               if (var11 != null) {
                  Cell var119 = (Cell)var34.get_Item(var1 - 1);

                  for (int var112 = var2 - var119.getColSpan(); var112 < var2; var112++) {
                     var5[var1][var112][1] = var11;
                  }
               }
            }
         }

         if (this.u9.getFirstCol()) {
            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.t2(), var16.m3(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               Column var106 = this.u9.l6.n5(0);
               int var109 = var106.n5(0).getColSpan();
               v9r var100 = var9;
               int var113 = 0;

               while (var113 < var1) {
                  Cell var120 = var106.n5(var113);
                  int var126 = var120.getColSpan();

                  for (int var129 = 0; var129 < var120.getRowSpan(); var129++) {
                     if (var8 != null) {
                        var5[var113 + var129][0][0] = var8;
                     }

                     if (var10 != null) {
                        var5[var113 + var129][var126][0] = var10;
                     }
                  }

                  if (var6 != null) {
                     var3[var113][0] = var6;
                  }

                  if (var7 != null) {
                     var4[var113][0].l6(var7);
                  }

                  if (var14 != null) {
                     var5[var113][0][4] = var14;
                  }

                  if (var15 != null) {
                     var5[var113][0][5] = var15;
                  }

                  int var130 = var113 + var120.getRowSpan();
                  int var135 = com.aspose.slides.ms.System.q1.l6(var109, var126);
                  int var139 = com.aspose.slides.ms.System.q1.n5(var109, var126);
                  if (var100 != null) {
                     for (int var142 = 0; var142 < var135; var142++) {
                        var5[var113][var142][1] = var100;
                     }
                  }

                  if (var10 != null) {
                     for (int var143 = var135; var143 < var139; var143++) {
                        var5[var113][var143][1] = var10;
                     }
                  }

                  var100 = var12;
                  var109 = var126;
                  var113 = var130;
               }

               if (var11 != null) {
                  Cell var121 = (Cell)var106.get_Item(var1 - 1);

                  for (int var114 = 0; var114 < var121.getColSpan(); var114++) {
                     var5[var1][var114][1] = var11;
                  }
               }
            }
         }

         if (this.u9.getLastRow()) {
            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.s7(), var16.z8(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               Row var107 = this.u9.n5.n5(var1 - 1);
               int var110 = var107.get_Item(0).getRowSpan();
               v9r var103 = var8;
               int var115 = 0;

               while (var115 < var2) {
                  Cell var122 = (Cell)var107.get_Item(var115);
                  int var127 = var122.getRowSpan();
                  int var131 = var122.getFirstRowIndex();

                  for (int var136 = 0; var136 < var122.getColSpan(); var136++) {
                     if (var9 != null) {
                        var5[var131][var115 + var136][1] = var9;
                     }

                     if (var11 != null) {
                        var5[var1][var115 + var136][1] = var11;
                     }
                  }

                  if (var6 != null) {
                     var3[var131][var115] = var6;
                  }

                  if (var7 != null) {
                     var4[var131][var115].l6(var7);
                  }

                  if (var14 != null) {
                     var5[var131][var115][4] = var14;
                  }

                  if (var15 != null) {
                     var5[var131][var115][5] = var15;
                  }

                  int var137 = var115 + var122.getColSpan();
                  int var140 = com.aspose.slides.ms.System.q1.l6(var110, var127);
                  int var144 = com.aspose.slides.ms.System.q1.n5(var110, var127);
                  if (var9 != null) {
                     for (int var148 = var1 - var144; var148 < var1 - var140; var148++) {
                        var5[var148][var115][0] = var9;
                     }
                  }

                  if (var103 != null) {
                     for (int var149 = var1 - var140; var149 < var1; var149++) {
                        var5[var149][var115][0] = var103;
                     }
                  }

                  var103 = var13;
                  var110 = var127;
                  var115 = var137;
               }

               if (var10 != null) {
                  Cell var123 = (Cell)var107.get_Item(var2 - 1);

                  for (int var116 = var1 - var123.getRowSpan(); var116 < var1; var116++) {
                     var5[var116][var2][0] = var10;
                  }
               }
            }
         }

         if (this.u9.getFirstRow()) {
            var84[0] = var6;
            var87[0] = var7;
            var19[0] = var8;
            var20[0] = var9;
            var21[0] = var10;
            var22[0] = var11;
            var23[0] = var12;
            var24[0] = var13;
            var25[0] = var14;
            var26[0] = var15;
            var27 = n5(var16.y4(), var16.r4(), var84, var87, var19, var20, var21, var22, var23, var24, var25, var26);
            var6 = var84[0];
            var7 = var87[0];
            var8 = var19[0];
            var9 = var20[0];
            var10 = var21[0];
            var11 = var22[0];
            var12 = var23[0];
            var13 = var24[0];
            var14 = var25[0];
            var15 = var26[0];
            if (var27) {
               Row var108 = this.u9.n5.n5(0);
               int var111 = var108.n5(0).getRowSpan();
               v9r var104 = var8;
               int var117 = 0;

               while (var117 < var2) {
                  Cell var124 = var108.n5(var117);
                  int var128 = var124.getRowSpan();

                  for (int var132 = 0; var132 < var124.getColSpan(); var132++) {
                     if (var9 != null) {
                        var5[0][var117 + var132][1] = var9;
                     }

                     if (var11 != null) {
                        var5[var128][var117 + var132][1] = var11;
                     }
                  }

                  if (var6 != null) {
                     var3[0][var117] = var6;
                  }

                  if (var7 != null) {
                     var4[0][var117].l6(var7);
                  }

                  if (var14 != null) {
                     var5[0][var117][4] = var14;
                  }

                  if (var15 != null) {
                     var5[0][var117][5] = var15;
                  }

                  int var133 = var117 + var124.getColSpan();
                  int var138 = com.aspose.slides.ms.System.q1.l6(var111, var128);
                  int var141 = com.aspose.slides.ms.System.q1.n5(var111, var128);
                  if (var104 != null) {
                     for (int var145 = 0; var145 < var138; var145++) {
                        var5[var145][var117][0] = var104;
                     }
                  }

                  if (var11 != null) {
                     for (int var146 = var138; var146 < var141; var146++) {
                        var5[var146][var117][0] = var11;
                     }
                  }

                  var104 = var13;
                  var111 = var128;
                  var117 = var133;
               }

               if (var10 != null) {
                  Cell var125 = (Cell)var108.get_Item(var2 - 1);

                  for (int var118 = 0; var118 < var125.getRowSpan(); var118++) {
                     var5[var118][var2][0] = var10;
                  }
               }
            }
         }

         if (this.u9.getFirstRow() && this.u9.getFirstCol()) {
            this.n5(0, 0, var3, var4, var5, var16.t9(), var16.y2());
         }

         if (this.u9.getFirstRow() && this.u9.getLastCol()) {
            this.n5(0, var2 - 1, var3, var4, var5, var16.e2(), var16.c4());
         }

         if (this.u9.getLastRow() && this.u9.getFirstCol()) {
            this.n5(var1 - 1, 0, var3, var4, var5, var16.n3(), var16.w1());
         }

         if (this.u9.getLastRow() && this.u9.getLastCol()) {
            this.n5(var1 - 1, var2 - 1, var3, var4, var5, var16.x8(), var16.j5());
         }
      }

      for (int var85 = 0; var85 < var1; var85++) {
         for (int var88 = 0; var88 < var2; var88++) {
            var5[var85][var88][2] = var5[var85][var88 + 1][0];
            var5[var85][var88][3] = var5[var85 + 1][var88][1];
         }
      }

      d7f[][] var86 = new d7f[var1][var2];

      for (int var89 = 0; var89 < var1; var89++) {
         for (int var90 = 0; var90 < var2; var90++) {
            var86[var89][var90] = new d7f(
               (Cell)this.u9.get_Item(var90, var89),
               var3[var89][var90],
               var4[var89][var90],
               var5[var89][var90][0],
               var5[var89][var90][1],
               var5[var89][var90][2],
               var5[var89][var90][3],
               var5[var89][var90][4],
               var5[var89][var90][5]
            );
         }
      }

      return var86;
   }

   static boolean n5(
      x6q var0, c7e var1, w0j[] var2, c7e[] var3, v9r[] var4, v9r[] var5, v9r[] var6, v9r[] var7, v9r[] var8, v9r[] var9, v9r[] var10, v9r[] var11
   ) {
      var2[0] = var0.t2().u3() != 0 ? var0.t2() : null;
      var3[0] = var1.c8() ? var1 : null;
      var4[0] = var0.n5().n5() != 0 ? var0.n5() : null;
      var5[0] = var0.k5().n5() != 0 ? var0.k5() : null;
      var6[0] = var0.l6().n5() != 0 ? var0.l6() : null;
      var7[0] = var0.u3().n5() != 0 ? var0.u3() : null;
      var8[0] = var0.a6().n5() != 0 ? var0.a6() : null;
      var9[0] = var0.u9().n5() != 0 ? var0.u9() : null;
      var10[0] = var0.h0().n5() != 0 ? var0.h0() : null;
      var11[0] = var0.c8().n5() != 0 ? var0.c8() : null;
      return var2[0] != null
         || var3[0] != null
         || var4[0] != null
         || var5[0] != null
         || var6[0] != null
         || var7[0] != null
         || var8[0] != null
         || var9[0] != null
         || var10[0] != null
         || var11[0] != null;
   }

   private void n5(
      int var1,
      int var2,
      w0j[][] var3,
      c7e[][] var4,
      v9r[][][] var5,
      w0j var6,
      c7e var7,
      v9r var8,
      v9r var9,
      v9r var10,
      v9r var11,
      v9r var12,
      v9r var13,
      v9r var14,
      v9r var15
   ) {
      int var16 = this.u9.getColumns().size();
      int var17 = var1 & 1;
      Row var18 = null;

      for (int var19 = var1; var19 < var2; var19 += 2) {
         Row var20 = this.u9.n5.n5(var19);
         int var21 = 0;

         while (var21 < var16) {
            Cell var22 = var20.n5(var21);
            if (!var22.c8() && var19 + var22.getRowSpan() <= var2) {
               int var23 = var22.getRowSpan();
               int var24 = var22.getColSpan();

               for (int var25 = 0; var25 < var24; var25++) {
                  if (var18 != null && (var18.get_Item(var21 + var25).getRowSpan() & 1) != 1) {
                     if (var12 != null) {
                        var5[var19][var21 + var25][1] = var12;
                     }
                  } else if (var9 != null) {
                     var5[var19][var21 + var25][1] = var9;
                  }

                  if (var11 != null && (var23 & 1) == 1) {
                     var5[var19 + var23][var21 + var25][1] = var11;
                  }
               }

               Column var28 = var21 > 0 ? this.u9.l6.n5(var21 - 1) : null;
               Column var26 = var21 + var24 < var16 ? this.u9.l6.n5(var21 + var24) : null;

               for (int var27 = 0; var27 < var23; var27++) {
                  if (var28 != null && (var28.get_Item(var19 + var27).getFirstRowIndex() & 1) == var17) {
                     if (var13 != null) {
                        var5[var19 + var27][var21][0] = var13;
                     }
                  } else if (var8 != null) {
                     var5[var19 + var27][var21][0] = var8;
                  }

                  if (var10 != null && (var26 == null || (var26.get_Item(var19 + var27).getFirstRowIndex() & 1) != var17)) {
                     var5[var19 + var27][var21 + var24][0] = var10;
                  }
               }

               if (var6 != null) {
                  var3[var19][var21] = var6;
               }

               if (var7 != null) {
                  var4[var19][var21].l6(var7);
               }

               if (var14 != null) {
                  var5[var19][var21][4] = var14;
               }

               if (var15 != null) {
                  var5[var19][var21][5] = var15;
               }

               var21 += var24;
            } else {
               var21 += var22.a6().getColSpan();
            }
         }

         var18 = var20;
      }
   }

   private void l6(
      int var1,
      int var2,
      w0j[][] var3,
      c7e[][] var4,
      v9r[][][] var5,
      w0j var6,
      c7e var7,
      v9r var8,
      v9r var9,
      v9r var10,
      v9r var11,
      v9r var12,
      v9r var13,
      v9r var14,
      v9r var15
   ) {
      int var16 = this.u9.getRows().size();
      int var17 = var1 & 1;
      Column var18 = null;

      for (int var19 = var1; var19 < var2; var19 += 2) {
         Column var20 = this.u9.l6.n5(var19);
         int var21 = 0;

         while (var21 < var16) {
            Cell var22 = var20.n5(var21);
            if (!var22.c8() && var19 + var22.getColSpan() <= var2) {
               int var23 = var22.getColSpan();
               int var24 = var22.getRowSpan();

               for (int var25 = 0; var25 < var24; var25++) {
                  if (var18 != null && (var18.get_Item(var21 + var25).getColSpan() & 1) != 1) {
                     if (var13 != null) {
                        var5[var21 + var25][var19][0] = var13;
                     }
                  } else if (var8 != null) {
                     var5[var21 + var25][var19][0] = var8;
                  }

                  if (var10 != null && (var23 & 1) == 1) {
                     var5[var21 + var25][var19 + var23][0] = var10;
                  }
               }

               Row var28 = var21 > 0 ? this.u9.n5.n5(var21 - 1) : null;
               Row var26 = var21 + var24 < var16 ? this.u9.n5.n5(var21 + var24) : null;

               for (int var27 = 0; var27 < var23; var27++) {
                  if (var28 != null && (var28.get_Item(var19 + var27).getFirstColumnIndex() & 1) == var17) {
                     if (var12 != null) {
                        var5[var21 + var27][var19][1] = var12;
                     }
                  } else if (var9 != null) {
                     var5[var21][var19 + var27][1] = var9;
                  }

                  if (var11 != null && (var26 == null || (var26.get_Item(var19 + var27).getFirstColumnIndex() & 1) != var17)) {
                     var5[var21 + var24][var19 + var27][1] = var11;
                  }
               }

               if (var6 != null) {
                  var3[var21][var19] = var6;
               }

               if (var7 != null) {
                  var4[var21][var19].l6(var7);
               }

               if (var14 != null) {
                  var5[var21][var19][4] = var14;
               }

               if (var15 != null) {
                  var5[var21][var19][5] = var15;
               }

               var21 += var24;
            } else {
               var21 += var22.a6().getRowSpan();
            }
         }

         var18 = var20;
      }
   }

   private void n5(int var1, int var2, w0j[][] var3, c7e[][] var4, v9r[][][] var5, x6q var6, c7e var7) {
      w0j var8 = null;
      c7e var9 = null;
      v9r var10 = null;
      v9r var11 = null;
      v9r var12 = null;
      v9r var13 = null;
      v9r var14 = null;
      v9r var15 = null;
      v9r var16 = null;
      v9r var17 = null;
      w0j[] var18 = new w0j[]{var8};
      c7e[] var19 = new c7e[]{var9};
      v9r[] var20 = new v9r[]{var10};
      v9r[] var21 = new v9r[]{var11};
      v9r[] var22 = new v9r[]{var12};
      v9r[] var23 = new v9r[]{var13};
      v9r[] var24 = new v9r[]{var14};
      v9r[] var25 = new v9r[]{var15};
      v9r[] var26 = new v9r[]{var16};
      v9r[] var27 = new v9r[]{var17};
      boolean var28 = !n5(var6, var7, var18, var19, var20, var21, var22, var23, var24, var25, var26, var27);
      var8 = var18[0];
      var9 = var19[0];
      var10 = var20[0];
      var11 = var21[0];
      var12 = var22[0];
      var13 = var23[0];
      var14 = var24[0];
      var15 = var25[0];
      var16 = var26[0];
      var17 = var27[0];
      if (!var28) {
         ICell var29 = this.u9.get_Item(var2, var1);
         var2 = var29.getFirstColumnIndex();
         var1 = var29.getFirstRowIndex();

         for (int var30 = 0; var30 < var29.getColSpan(); var30++) {
            if (var11 != null) {
               var5[var1][var2 + var30][1] = var11;
            }

            if (var13 != null) {
               var5[var1 + var29.getRowSpan()][var2 + var30][1] = var13;
            }
         }

         for (int var43 = 0; var43 < var29.getRowSpan(); var43++) {
            if (var10 != null) {
               var5[var1 + var43][var2][0] = var10;
            }

            if (var12 != null) {
               var5[var1 + var43][var2 + var29.getColSpan()][0] = var12;
            }
         }

         if (var8 != null) {
            var3[var1][var2] = var8;
         }

         if (var9 != null) {
            var4[var1][var2].l6(var9);
         }

         if (var16 != null) {
            var5[var1][var2][4] = var16;
         }

         if (var17 != null) {
            var5[var1][var2][5] = var17;
         }
      }
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.l6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }

   @Override
   public final long getVersion() {
      return this.k5;
   }
}
