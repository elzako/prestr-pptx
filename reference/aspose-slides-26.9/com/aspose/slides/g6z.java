package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class g6z extends com.aspose.slides.internal.v6g.h0<g6z> {
   public g6z() {
   }

   static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var0), 14);
   }

   static int l6(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var0), 14);
   }

   static int k5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 + 0.5, 14);
   }

   static void n5(List<g3y> var0, g3y var1, l5 var2, l5 var3) {
      if (var1 != null && !ChartTypeCharacterizer.c8(var1.u9().getType()) && !ChartTypeCharacterizer.s7(var1.u9().getType())) {
         if (var2.c8() != null && var2.c8().isLogarithmic() && ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var1.u9().getType())) {
            for (int var4 = 0; var4 < var0.size(); var4++) {
               for (int var5 = 0; var5 < ((g3y)var0.get_Item(var4)).c8().size(); var5++) {
                  t9z var6 = ((g3y)var0.get_Item(var4)).c8().get_Item(var5);
                  if (var6 != null) {
                     if (var6.l6() > 0.0) {
                        var6.l6(com.aspose.slides.ms.System.q1.n5((double)(var6.l6()), (double)(var2.c8().getLogBase())));
                     } else {
                        var6.l6(true);
                     }
                  }
               }
            }
         }

         if (var3.c8() != null && var3.c8().isLogarithmic()) {
            for (int var7 = 0; var7 < var0.size(); var7++) {
               for (int var8 = 0; var8 < ((g3y)var0.get_Item(var7)).c8().size(); var8++) {
                  t9z var9 = ((g3y)var0.get_Item(var7)).c8().get_Item(var8);
                  if (var9 != null) {
                     if (var9.n5() > 0.0) {
                        var9.n5(com.aspose.slides.ms.System.q1.n5((double)(var9.n5()), (double)(var3.c8().getLogBase())));
                     } else {
                        var9.l6(true);
                     }
                  }
               }
            }
         }
      }
   }

   static int u3(double var0) {
      char var2 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      int var3 = 1;
      String var4 = "";
      String var5 = com.aspose.slides.ms.System.d2.n5(var0, "R");
      int var6 = com.aspose.slides.ms.System.d1.c8(var5, "E");
      int var7 = com.aspose.slides.ms.System.d1.c8(var5, "e");
      if (var6 > 0 || var7 > 0) {
         String[] var8;
         if (var6 > 0) {
            var8 = com.aspose.slides.ms.System.d1.n5(var5, 'E');
         } else {
            var8 = com.aspose.slides.ms.System.d1.n5(var5, 'e');
         }

         if (var8[0].charAt(0) == '-') {
            var8[0] = com.aspose.slides.ms.System.d1.k5(var8[0], 1);
         }

         int var9 = com.aspose.slides.ms.System.d1.u3(var8[0], var2);
         int var10 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.z3.u3(var8[1]));
         if (var9 > 0) {
            var4 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.l6(var8[0], 0, var9), com.aspose.slides.ms.System.d1.k5(var8[0], var9 + 1)});
            if (var8[1].charAt(0) != '-') {
               while (var10 > 0) {
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{var4, "0"});
                  var10--;
               }
            } else {
               int var14 = var10 - (var9 - 1);
               if (var14 <= 0) {
                  if (var14 < 0) {
                     var4 = com.aspose.slides.ms.System.d1.n5(new Object[]{
                        com.aspose.slides.ms.System.d1.l6(var4, 0, var9 + var14), var2, com.aspose.slides.ms.System.d1.k5(var4, var9 + var14)
                     });
                  }
               } else {
                  while (var14 > 0) {
                     var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"0", var4});
                     var14--;
                  }

                  var4 = com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.t9.q0(var4.charAt(0)), var2, com.aspose.slides.ms.System.d1.k5(var4, 1)});
               }
            }
         } else {
            var4 = var8[0];
            if (var8[1].charAt(0) != '-') {
               while (var10 > 0) {
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{var4, "0"});
                  var10--;
               }
            } else {
               int var11 = var10 - (var4.length() - 1);
               if (var11 <= 0) {
                  if (var11 < 0) {
                     var4 = com.aspose.slides.ms.System.d1.n5(new Object[]{
                        com.aspose.slides.ms.System.d1.l6(var4, 0, var4.length() + var11), var2, com.aspose.slides.ms.System.d1.k5(var4, var4.length() + var11)
                     });
                  }
               } else {
                  while (var11 > 0) {
                     var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"0", var4});
                     var11--;
                  }

                  var4 = com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.t9.q0(var4.charAt(0)), var2, com.aspose.slides.ms.System.d1.k5(var4, 1)});
               }
            }
         }

         var5 = var4;
      }

      int var13 = com.aspose.slides.ms.System.d1.l6(var5, var2, 0);
      if (var13 > 0) {
         var3 = var5.length() - var13;
         if (var5.length() >= 16) {
            var3 = 16 - var13;
         }
      }

      return var3 > 15 ? 15 : var3;
   }

   static double n5(double var0, double var2) {
      int var4 = u3(var0);
      int var5 = u3(var2);
      int var6 = var4 > var5 ? var4 : var5;
      return com.aspose.slides.ms.System.q1.n5((double)(var0 - var2), var6);
   }

   static double l6(double var0, double var2) {
      int var4 = u3(var0);
      int var5 = u3(var2);
      int var6 = var4 > var5 ? var4 : var5;
      if (var6 > 15) {
         var6 = 15;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      return com.aspose.slides.ms.System.q1.n5((double)(var0 + var2), var6);
   }

   static boolean n5(double[] var0, double[] var1, List<g3y> var2, int var3, int var4, double var5, double var7) {
      var1[0] = 0.0;
      if (var0[0] >= 0.0) {
         if (var0[0] > 0.0 && var5 <= 0.0 || var0[0] == 0.0 && var5 < 0.0) {
            var0[0] = 0.0;
            var1[0] = 0.0;
            return false;
         }

         for (int var9 = 0; var9 < var3; var9++) {
            t9z var10 = ((g3y)var2.get_Item(var9)).c8().get_Item(var4);
            if (var10 != null) {
               double var11 = var10.n5();
               if (var11 >= 0.0) {
                  if (!(var1[0] + var11 <= var5)) {
                     var1[0] = var5;
                     var0[0] = 0.0;
                     return false;
                  }

                  var1[0] += var11;
               }
            }
         }

         if (var0[0] + var1[0] <= var5) {
            var1[0] += var0[0];
         } else {
            var0[0] = var5 - var1[0];
            var1[0] = var5;
         }
      } else {
         if (var0[0] < 0.0 && var7 >= 0.0 || var0[0] == 0.0 && var7 > 0.0) {
            var0[0] = 0.0;
            var1[0] = 0.0;
            return false;
         }

         for (int var13 = 0; var13 < var3; var13++) {
            t9z var14 = ((g3y)var2.get_Item(var13)).c8().get_Item(var4);
            if (var14 != null) {
               double var15 = var14.n5();
               if (var15 < 0.0) {
                  if (!(var1[0] + var15 >= var7)) {
                     var1[0] = var7;
                     var0[0] = 0.0;
                     return false;
                  }

                  var1[0] += var15;
               }
            }
         }

         if (var0[0] + var1[0] >= var7) {
            var1[0] += var0[0];
         } else {
            var0[0] = var7 - var1[0];
            var1[0] = var7;
         }
      }

      return true;
   }

   static double n5(List<g3y> var0, int var1) {
      double var2 = 0.0;

      for (int var4 = 0; var4 < var0.size(); var4++) {
         t9z var5 = ((g3y)var0.get_Item(var4)).c8().get_Item(var1);
         if (var5 != null) {
            double var6 = var5.n5();
            var2 += com.aspose.slides.ms.System.q1.n5(var6);
         }
      }

      return var2;
   }

   static boolean n5(double[] var0, double[] var1, List<g3y> var2, int var3, int var4, double var5, l5 var7) {
      double var8 = var7.z3() * var5 / 100.0;
      double var10 = var7.q0() * var5 / 100.0;
      return n5(var0, var1, var2, var3, var4, var8, var10);
   }

   static boolean n5(com.aspose.slides.internal.o9b.y2 var0) {
      return var0.t2() <= 0 || var0.l6() <= 0;
   }

   static com.aspose.slides.internal.o9b.y2 l6(com.aspose.slides.internal.o9b.y2 var0) {
      return new com.aspose.slides.internal.o9b.y2(var0.s7(), var0.x8(), var0.t2(), var0.l6());
   }

   static com.aspose.slides.ms.System.j5 n5(double var0, boolean var2) {
      if (var0 > 2958465.99) {
         return com.aspose.slides.ms.System.j5.k5;
      }

      if (var2) {
         var0 += 1462.0;
      }

      if (var0 < 60.0) {
         var0++;
      }

      return com.aspose.slides.ms.System.j5.h0(var0);
   }

   static double n5(com.aspose.slides.ms.System.j5 var0, boolean var1) {
      if (var1) {
         com.aspose.slides.ms.System.s4 var10 = com.aspose.slides.ms.System.j5.t2(var0, new com.aspose.slides.ms.System.j5(1904, 1, 1)).n3();
         double var3 = var10.u9();
         return var3 < 0.0 ? -1.0 : var3;
      }

      new com.aspose.slides.ms.System.j5();
      new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5 var6 = new com.aspose.slides.ms.System.j5(1900, 3, 1);
      com.aspose.slides.ms.System.s4 var7 = com.aspose.slides.ms.System.j5.t2(var0, var6).n3();
      com.aspose.slides.ms.System.j5 var2;
      if (var7.u9() > 0.0) {
         var2 = new com.aspose.slides.ms.System.j5(1899, 12, 30);
      } else {
         var2 = new com.aspose.slides.ms.System.j5(1899, 12, 31);
      }

      com.aspose.slides.ms.System.j5 var5 = new com.aspose.slides.ms.System.j5(9999, 12, 31, 23, 59, 59, 999);
      com.aspose.slides.ms.System.j5.t2(var5, var0).u3(var7);
      if (var7.u9() < 0.0) {
         return -1.0;
      }

      com.aspose.slides.ms.System.j5.t2(var0, var2).u3(var7);
      if (var7.u9() < 0.0) {
         return -1.0;
      }

      double var8 = var7.u9();
      if (var0.e2() == 1900 && var0.c8() == 3 && var0.l6() == 1) {
         var8++;
      }

      return var8;
   }

   public void n5(g6z var1) {
   }

   public g6z n5() {
      g6z var1 = new g6z();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(g6z var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof g6z) ? false : this.l6((g6z)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g6z Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(g6z bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
