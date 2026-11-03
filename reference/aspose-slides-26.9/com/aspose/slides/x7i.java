package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NotImplementedException;

class x7i {
   private static String n5 = "(?:(?:'((?:(?!'!).)+)'|[a-zA-Z0-9_]+)!)?(\\\\?[a-zA-Z0-9_\\.]+)";

   public static void n5(ChartDataCell var0, com.aspose.slides.internal.k4y.u1v var1, o9g var2) {
      if (var1 != null) {
         var0.u3(var1.n5());
         var0.t2().z1().l6 = var1.k5();
         var0.n5(var0.k5().u3.n5((int)var1.l6()));
         if ((var0.c8().u3() & 4294967295L) >= 164L && var0.c8().t2() != 0) {
            h6g var3 = var0.x8();
            if (var3 != null) {
               var0.setCustomNumberFormat(var3.n5());
            }
         }

         if (var1.a6() == null) {
            var0.t2().z1().n5 = null;
         } else {
            switch (var1.k5()) {
               case 0:
                  Integer var4 = b4x.l6(var1.a6()).n5();
                  if (var4 != null) {
                     var0.t2().z1().n5 = var4 == 1;
                  } else {
                     var0.t2().z1().n5 = null;
                     var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Boolean value ", var1.a6(), " has unknown format and is not loaded."}), 1);
                  }
                  break;
               case 1:
                  Double var8 = b4x.n5(var1.a6()).n5();
                  if (var8 != null) {
                     var0.t2().z1().n5 = var8;
                  } else {
                     var0.t2().z1().n5 = null;
                     var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Number value ", var1.a6(), " has unknown format and is not loaded."}), 1);
                  }
                  break;
               case 2:
               case 4:
               case 5:
               default:
                  var0.t2().z1().n5 = var1.a6();
                  break;
               case 3:
                  try {
                     var0.l6(com.aspose.slides.ms.System.z3.u3(var1.a6()));
                     String var7 = var0.k5().l6.n5(var0.y4());
                     var0.t2().z1().n5 = var7;
                  } catch (NotImplementedException var6) {
                     var0.t2().z1().n5 = null;
                     var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"SharedString ", var1.a6(), " has unknown type and is not loaded"}), 1);
                  }
                  break;
               case 6:
                  Double var5 = b4x.n5(var1.a6(), 0).n5();
                  if (var5 != null) {
                     var0.t2().z1().n5 = var5;
                     var0.t2().z1().l6 = 1;
                  } else {
                     var0.t2().z1().n5 = null;
                     var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Date value ", var1.a6(), " has unknown format and is not loaded."}), 1);
                  }
            }
         }

         l6(var0, var1, var2);
         var0.n5 = true;
      }
   }

   public static void n5(ChartDataCell var0, com.aspose.slides.internal.k4y.u1v var1, n2x var2) {
      var1.n5(var0.a6());
      var1.n5(var0.t2().z1().l6);
      if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.getCustomNumberFormat()))) {
         h6g var3 = var0.n3();
         var0.c8().l6(var3.l6());
      }

      var1.n5(var0.s7() & 4294967295L);
      if (var0.t2().z1().n5 == null) {
         var1.l6(null);
      } else if (var0.t2().z1().l6 == 3) {
         g4l var8 = var0.k5().l6;
         int var4 = -1;

         for (int var5 = 0; var5 < var8.l6(); var5++) {
            try {
               if (com.aspose.slides.ms.System.d1.a6(var8.n5(var5), (String)var0.getValue())) {
                  var4 = var5;
                  break;
               }
            } catch (RuntimeException var7) {
               var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"SharedString ", var1.a6(), " has unknown type and is not read"}), 1);
            }
         }

         if (var4 == -1) {
            var4 = var8.n5((String)var0.getValue());
            var8.l6++;
         }

         var1.l6(com.aspose.slides.ms.System.z3.n5(var4, com.aspose.slides.internal.x7n.l6.k5()));
         var8.n5++;
      } else if (var0.t2().z1().l6 == 0) {
         if (var0.t2().u9() != null) {
            var1.l6(com.aspose.slides.ms.System.z3.n5(var0.t2().u9(), com.aspose.slides.internal.x7n.l6.k5()));
         } else {
            var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Boolean value is lost for cell ", var0.a6(), "."}), 1);
         }
      } else {
         var1.l6(com.aspose.slides.ms.System.z3.t9(var0.t2().z1().n5, com.aspose.slides.internal.x7n.l6.k5()));
      }

      l6(var0, var1, var2);
   }

   private static void l6(ChartDataCell var0, com.aspose.slides.internal.k4y.u1v var1, o9g var2) {
      if (var1 != null && var1.u3() != null) {
         switch (var1.u3().n5()) {
            case 0:
            case 1:
               if (var2.u9() && !n5(var0, var1.u3().a6())) {
                  var2.n5(
                     com.aspose.slides.ms.System.d1.n5(
                        "Formula {0} (type: {1}) is not supported.",new Object[]{ var1.u3().a6(), com.aspose.slides.ms.System.j8.n5(var1.u3())
                     }),
                     1
                  );
               }

               var0.t2().z1().k5 = var1.u3().a6();
               var0.t2().z1().u3(0);
               break;
            case 2:
            default:
               var2.n5(
                  com.aspose.slides.ms.System.d1.n5("Formula {0} (type: {1}) is not supported.",new Object[]{ var1.u3().a6(), com.aspose.slides.ms.System.j8.n5(var1.u3())}),
                  1
               );
               break;
            case 3:
               if (!com.aspose.slides.ms.System.d1.n5(var1.u3().l6())) {
                  if (var2.u9() && !n5(var0, var1.u3().a6())) {
                     var2.n5(
                        com.aspose.slides.ms.System.d1.n5(
                           "Formula {0} (type: {1}) is not supported.",new Object[]{ var1.u3().a6(), com.aspose.slides.ms.System.j8.n5(var1.u3())
                        }),
                        1
                     );
                  }

                  var0.t2().z1().k5 = var1.u3().a6();
                  var0.t2().z1().u3(0);
                  var2.u3().n5(var0, var1.u3().u3(), var1.u3().l6());
               } else {
                  ChartDataCell var3 = var2.u3().n5(var0, var1.u3().u3());
                  if (var3 == null) {
                     String var4 = "A master formula cell is not found for the cell {0}.";
                     throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var4, new Object[]{var1.n5()}));
                  }

                  var0.t2().z1().u3 = var3.t2().z1();
                  if (var3.t2().z1().a6 == null) {
                     var3.t2().z1().a6 = new List<>();
                  }

                  var3.t2().z1().a6.addItem(var0.t2().z1());
               }
         }

         var0.t2().z1().h0 = var1.u3().k5();
      }
   }

   private static void l6(ChartDataCell var0, com.aspose.slides.internal.k4y.u1v var1, n2x var2) {
      com.aspose.slides.internal.k4y.h2d var3 = var0.t2().z1().u9;
      if (var3 != null) {
         var1.n5(var3);
         if (n5(var3)) {
            var2.u3().n5(var0, var3.u3(), var3.l6());
         }
      } else if (var0.t2().e2()) {
         com.aspose.slides.internal.k4y.h2d var6 = new com.aspose.slides.internal.k4y.h2d();
         var6.l6(var0.getFormula());
         var6.n5(3);
         var6.n5(var2.u3().n5(var0.getChartDataWorksheet().getIndex()) & 4294967295L);
         var6.n5(var0.t2().t4());
         var6.n5(var0.t2().z1().h0);
         var1.n5(var6);
         var2.u3().n5(var0, var6.u3(), var6.l6());
      } else if (var0.t2().t9()) {
         com.aspose.slides.internal.k4y.h2d var5 = new com.aspose.slides.internal.k4y.h2d();
         var5.n5(3);
         var5.n5(var2.u3().n5(var0));
         var5.n5(var0.t2().z1().h0);
         var1.n5(var5);
      } else if (com.aspose.slides.ms.System.d1.n5(var0.getFormula())) {
         var1.n5((com.aspose.slides.internal.k4y.h2d)null);
      } else {
         com.aspose.slides.internal.k4y.h2d var4 = new com.aspose.slides.internal.k4y.h2d();
         var4.l6(var0.getFormula());
         var4.n5(0);
         var4.n5(var0.t2().z1().h0);
         var1.n5(var4);
      }
   }

   private static boolean n5(ChartDataCell var0, String var1) {
      List var2 = new List();
      var2.addRange(a8v.k5());
      var2.addRange(a8v.u3());
      var2.addRange(a8v.n5());
      r6v var3 = new r6v(var2, var1);
      p3b var4 = new p3b(var3, var0.getRow() + 1, var0.getColumn() + 1, 0);
      y9i var5 = var4.k5();
      if (var5 == null) {
         return false;
      }

      l4s var6 = com.aspose.slides.internal.v6g.k5.n5(var5, l4s.class);
      if (var6 != null && "#NAME?".equals(var6.n5())) {
         com.aspose.slides.internal.r7c.u3 var7 = new com.aspose.slides.internal.r7c.c8(n5).l6(var1);
         if (var7.u3()) {
            String var8 = var0.k5().u9(var7.a6().n5(2).k5());
            if (var8 != null) {
               var4 = new p3b(new r6v(var2, var8), var0.getRow() + 1, var0.getColumn() + 1, 0);
               if (var4.k5() == null) {
                  return false;
               }
            }
         }
      }

      if (var4.l6().size() > 0) {
         y9w var9 = var0.t2().t2();
         var0.t2().n5().n5().k5().n5(var9.n5(), var9, var4.l6());
      }

      return true;
   }

   private static boolean n5(com.aspose.slides.internal.k4y.h2d var0) {
      return var0.n5() == 3 && !com.aspose.slides.ms.System.d1.n5(var0.l6());
   }
}
