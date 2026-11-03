package com.aspose.slides.internal.c9b;

import java.io.Serializable;

final class t2 implements Serializable {
   private final double[][] n5;
   private final double[][] l6;
   private final double[] k5;
   private final int u3;
   private final int a6;

   public t2(s7 var1) {
      double[][] var2 = var1.k5();
      this.u3 = var1.u3();
      this.a6 = var1.a6();
      int var3 = Math.min(this.u3, this.a6);
      this.k5 = new double[Math.min(this.u3 + 1, this.a6)];
      this.n5 = new double[this.u3][var3];
      this.l6 = new double[this.a6][this.a6];
      double[] var4 = new double[this.a6];
      double[] var5 = new double[this.u3];
      boolean var6 = true;
      boolean var7 = true;
      int var8 = Math.min(this.u3 - 1, this.a6);
      int var9 = Math.max(0, Math.min(this.a6 - 2, this.u3));

      for (int var10 = 0; var10 < Math.max(var8, var9); var10++) {
         if (var10 < var8) {
            this.k5[var10] = 0.0;

            for (int var11 = var10; var11 < this.u3; var11++) {
               this.k5[var10] = s7$n5.n5(this.k5[var10], var2[var11][var10]);
            }

            if (this.k5[var10] != 0.0) {
               if (var2[var10][var10] < 0.0) {
                  this.k5[var10] = -this.k5[var10];
               }

               for (int var65 = var10; var65 < this.u3; var65++) {
                  var2[var65][var10] = var2[var65][var10] / this.k5[var10];
               }

               var2[var10][var10]++;
            }

            this.k5[var10] = -this.k5[var10];
         }

         for (int var66 = var10 + 1; var66 < this.a6; var66++) {
            if (var10 < var8 & this.k5[var10] != 0.0) {
               double var12 = 0.0;

               for (int var14 = var10; var14 < this.u3; var14++) {
                  var12 += var2[var14][var10] * var2[var14][var66];
               }

               var12 = -var12 / var2[var10][var10];

               for (int var80 = var10; var80 < this.u3; var80++) {
                  var2[var80][var66] = var2[var80][var66] + var12 * var2[var80][var10];
               }
            }

            var4[var66] = var2[var10][var66];
         }

         if (var6 & var10 < var8) {
            for (int var67 = var10; var67 < this.u3; var67++) {
               this.n5[var67][var10] = var2[var67][var10];
            }
         }

         if (var10 < var9) {
            var4[var10] = 0.0;

            for (int var68 = var10 + 1; var68 < this.a6; var68++) {
               var4[var10] = s7$n5.n5(var4[var10], var4[var68]);
            }

            if (var4[var10] != 0.0) {
               if (var4[var10 + 1] < 0.0) {
                  var4[var10] = -var4[var10];
               }

               for (int var69 = var10 + 1; var69 < this.a6; var69++) {
                  var4[var69] /= var4[var10];
               }

               var4[var10 + 1]++;
            }

            var4[var10] = -var4[var10];
            if (var10 + 1 < this.u3 & var4[var10] != 0.0) {
               for (int var70 = var10 + 1; var70 < this.u3; var70++) {
                  var5[var70] = 0.0;
               }

               for (int var71 = var10 + 1; var71 < this.a6; var71++) {
                  for (int var15 = var10 + 1; var15 < this.u3; var15++) {
                     var5[var15] += var4[var71] * var2[var15][var71];
                  }
               }

               for (int var72 = var10 + 1; var72 < this.a6; var72++) {
                  double var79 = -var4[var72] / var4[var10 + 1];

                  for (int var81 = var10 + 1; var81 < this.u3; var81++) {
                     var2[var81][var72] = var2[var81][var72] + var79 * var5[var81];
                  }
               }
            }

            if (var7) {
               for (int var73 = var10 + 1; var73 < this.a6; var73++) {
                  this.l6[var73][var10] = var4[var73];
               }
            }
         }
      }

      int var64 = Math.min(this.a6, this.u3 + 1);
      if (var8 < this.a6) {
         this.k5[var8] = var2[var8][var8];
      }

      if (this.u3 < var64) {
         this.k5[var64 - 1] = 0.0;
      }

      if (var9 + 1 < var64) {
         var4[var9] = var2[var9][var64 - 1];
      }

      var4[var64 - 1] = 0.0;
      if (var6) {
         for (int var74 = var8; var74 < var3; var74++) {
            for (int var82 = 0; var82 < this.u3; var82++) {
               this.n5[var82][var74] = 0.0;
            }

            this.n5[var74][var74] = 1.0;
         }

         for (int var75 = var8 - 1; var75 >= 0; var75--) {
            if (this.k5[var75] != 0.0) {
               for (int var84 = var75 + 1; var84 < var3; var84++) {
                  double var16 = 0.0;

                  for (int var18 = var75; var18 < this.u3; var18++) {
                     var16 += this.n5[var18][var75] * this.n5[var18][var84];
                  }

                  var16 = -var16 / this.n5[var75][var75];

                  for (int var94 = var75; var94 < this.u3; var94++) {
                     this.n5[var94][var84] = this.n5[var94][var84] + var16 * this.n5[var94][var75];
                  }
               }

               for (int var85 = var75; var85 < this.u3; var85++) {
                  this.n5[var85][var75] = -this.n5[var85][var75];
               }

               this.n5[var75][var75]++;

               for (int var86 = 0; var86 < var75 - 1; var86++) {
                  this.n5[var86][var75] = 0.0;
               }
            } else {
               for (int var83 = 0; var83 < this.u3; var83++) {
                  this.n5[var83][var75] = 0.0;
               }

               this.n5[var75][var75] = 1.0;
            }
         }
      }

      if (var7) {
         for (int var76 = this.a6 - 1; var76 >= 0; var76--) {
            if (var76 < var9 & var4[var76] != 0.0) {
               for (int var87 = var76 + 1; var87 < var3; var87++) {
                  double var91 = 0.0;

                  for (int var95 = var76 + 1; var95 < this.a6; var95++) {
                     var91 += this.l6[var95][var76] * this.l6[var95][var87];
                  }

                  var91 = -var91 / this.l6[var76 + 1][var76];

                  for (int var96 = var76 + 1; var96 < this.a6; var96++) {
                     this.l6[var96][var87] = this.l6[var96][var87] + var91 * this.l6[var96][var76];
                  }
               }
            }

            for (int var88 = 0; var88 < this.a6; var88++) {
               this.l6[var88][var76] = 0.0;
            }

            this.l6[var76][var76] = 1.0;
         }
      }

      int var77 = var64 - 1;
      int var89 = 0;
      double var93 = Math.pow(2.0, -52.0);
      double var19 = Math.pow(2.0, -966.0);

      while (var64 > 0) {
         int var21;
         for (var21 = var64 - 2; var21 >= -1 && var21 != -1; var21--) {
            if (Math.abs(var4[var21]) <= var19 + var93 * (Math.abs(this.k5[var21]) + Math.abs(this.k5[var21 + 1]))) {
               var4[var21] = 0.0;
               break;
            }
         }

         byte var22;
         if (var21 == var64 - 2) {
            var22 = 4;
         } else {
            int var23;
            for (var23 = var64 - 1; var23 >= var21 && var23 != var21; var23--) {
               double var24 = (var23 != var64 ? Math.abs(var4[var23]) : 0.0) + (var23 != var21 + 1 ? Math.abs(var4[var23 - 1]) : 0.0);
               if (Math.abs(this.k5[var23]) <= var19 + var93 * var24) {
                  this.k5[var23] = 0.0;
                  break;
               }
            }

            if (var23 == var21) {
               var22 = 3;
            } else if (var23 == var64 - 1) {
               var22 = 1;
            } else {
               var22 = 2;
               var21 = var23;
            }
         }

         var21++;
         switch (var22) {
            case 1:
               double var103 = var4[var64 - 2];
               var4[var64 - 2] = 0.0;
               int var106 = var64 - 2;

               for (; var106 >= var21; var106--) {
                  double var108 = s7$n5.n5(this.k5[var106], var103);
                  double var110 = this.k5[var106] / var108;
                  double var111 = var103 / var108;
                  this.k5[var106] = var108;
                  if (var106 != var21) {
                     var103 = -var111 * var4[var106 - 1];
                     var4[var106 - 1] = var110 * var4[var106 - 1];
                  }

                  if (var7) {
                     for (int var112 = 0; var112 < this.a6; var112++) {
                        var108 = var110 * this.l6[var112][var106] + var111 * this.l6[var112][var64 - 1];
                        this.l6[var112][var64 - 1] = -var111 * this.l6[var112][var106] + var110 * this.l6[var112][var64 - 1];
                        this.l6[var112][var106] = var108;
                     }
                  }
               }
               break;
            case 2:
               double var102 = var4[var21 - 1];
               var4[var21 - 1] = 0.0;

               for (int var105 = var21; var105 < var64; var105++) {
                  double var29 = s7$n5.n5(this.k5[var105], var102);
                  double var31 = this.k5[var105] / var29;
                  double var33 = var102 / var29;
                  this.k5[var105] = var29;
                  var102 = -var33 * var4[var105];
                  var4[var105] = var31 * var4[var105];
                  if (var6) {
                     for (int var35 = 0; var35 < this.u3; var35++) {
                        var29 = var31 * this.n5[var35][var105] + var33 * this.n5[var35][var21 - 1];
                        this.n5[var35][var21 - 1] = -var33 * this.n5[var35][var105] + var31 * this.n5[var35][var21 - 1];
                        this.n5[var35][var105] = var29;
                     }
                  }
               }
               break;
            case 3:
               double var101 = Math.max(
                  Math.max(Math.max(Math.max(Math.abs(this.k5[var64 - 1]), Math.abs(this.k5[var64 - 2])), Math.abs(var4[var64 - 2])), Math.abs(this.k5[var21])),
                  Math.abs(var4[var21])
               );
               double var36 = this.k5[var64 - 1] / var101;
               double var38 = this.k5[var64 - 2] / var101;
               double var40 = var4[var64 - 2] / var101;
               double var42 = this.k5[var21] / var101;
               double var44 = var4[var21] / var101;
               double var46 = ((var38 + var36) * (var38 - var36) + var40 * var40) / 2.0;
               double var48 = var36 * var40 * (var36 * var40);
               double var50 = 0.0;
               if (var46 != 0.0 | var48 != 0.0) {
                  var50 = Math.sqrt(var46 * var46 + var48);
                  if (var46 < 0.0) {
                     var50 = -var50;
                  }

                  var50 = var48 / (var46 + var50);
               }

               double var52 = (var42 + var36) * (var42 - var36) + var50;
               double var54 = var42 * var44;

               for (int var56 = var21; var56 < var64 - 1; var56++) {
                  double var57 = s7$n5.n5(var52, var54);
                  double var59 = var52 / var57;
                  double var61 = var54 / var57;
                  if (var56 != var21) {
                     var4[var56 - 1] = var57;
                  }

                  var52 = var59 * this.k5[var56] + var61 * var4[var56];
                  var4[var56] = var59 * var4[var56] - var61 * this.k5[var56];
                  var54 = var61 * this.k5[var56 + 1];
                  this.k5[var56 + 1] = var59 * this.k5[var56 + 1];
                  if (var7) {
                     for (int var63 = 0; var63 < this.a6; var63++) {
                        var57 = var59 * this.l6[var63][var56] + var61 * this.l6[var63][var56 + 1];
                        this.l6[var63][var56 + 1] = -var61 * this.l6[var63][var56] + var59 * this.l6[var63][var56 + 1];
                        this.l6[var63][var56] = var57;
                     }
                  }

                  var57 = s7$n5.n5(var52, var54);
                  var59 = var52 / var57;
                  var61 = var54 / var57;
                  this.k5[var56] = var57;
                  var52 = var59 * var4[var56] + var61 * this.k5[var56 + 1];
                  this.k5[var56 + 1] = -var61 * var4[var56] + var59 * this.k5[var56 + 1];
                  var54 = var61 * var4[var56 + 1];
                  var4[var56 + 1] = var59 * var4[var56 + 1];
                  if (var6 && var56 < this.u3 - 1) {
                     for (int var121 = 0; var121 < this.u3; var121++) {
                        var57 = var59 * this.n5[var121][var56] + var61 * this.n5[var121][var56 + 1];
                        this.n5[var121][var56 + 1] = -var61 * this.n5[var121][var56] + var59 * this.n5[var121][var56 + 1];
                        this.n5[var121][var56] = var57;
                     }
                  }
               }

               var4[var64 - 2] = var52;
               var89++;
               break;
            case 4:
               if (this.k5[var21] <= 0.0) {
                  this.k5[var21] = this.k5[var21] < 0.0 ? -this.k5[var21] : 0.0;
                  if (var7) {
                     for (int var98 = 0; var98 <= var77; var98++) {
                        this.l6[var98][var21] = -this.l6[var98][var21];
                     }
                  }
               }

               for (; var21 < var77 && !(this.k5[var21] >= this.k5[var21 + 1]); var21++) {
                  double var26 = this.k5[var21];
                  this.k5[var21] = this.k5[var21 + 1];
                  this.k5[var21 + 1] = var26;
                  if (var7 && var21 < this.a6 - 1) {
                     for (int var28 = 0; var28 < this.a6; var28++) {
                        var26 = this.l6[var28][var21 + 1];
                        this.l6[var28][var21 + 1] = this.l6[var28][var21];
                        this.l6[var28][var21] = var26;
                     }
                  }

                  if (var6 && var21 < this.u3 - 1) {
                     for (int var104 = 0; var104 < this.u3; var104++) {
                        var26 = this.n5[var104][var21 + 1];
                        this.n5[var104][var21 + 1] = this.n5[var104][var21];
                        this.n5[var104][var21] = var26;
                     }
                  }
               }

               var89 = 0;
               var64--;
         }
      }
   }

   public double[] n5() {
      return this.k5;
   }
}
