package com.aspose.slides.internal.d3v;

import com.aspose.slides.internal.r1x.n3;
import com.aspose.slides.internal.r1x.s7;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.ms.System.d1;

public abstract class l6 extends com.aspose.slides.internal.u2w.k5 {
   protected l6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   protected static l6$q0 n5(com.aspose.slides.internal.f2i.n5 var0, int var1, int var2, int var3) {
      int var4 = var0.o0();
      l6$q0 var5 = null;
      int[] var6 = var0.k7();
      int var7 = var0.t1();
      if (var6 == null) {
         throw new com.aspose.slides.internal.h6t.u3("The bits per sample are not specified");
      }

      int var8 = var0.y2();
      if (var6.length == 1) {
         com.aspose.slides.internal.b8u.a6 var9 = var0.k5();
         if (var8 == 3 && var9 == null) {
            throw new com.aspose.slides.internal.h6t.u3("The palette is not defined for palettized tiff image.");
         }

         if (var8 != 3) {
            switch (var6[0]) {
               case 1:
                  if (var8 != 1) {
                     var9 = new s7(new int[]{com.aspose.slides.internal.r1x.l6.n5(), com.aspose.slides.internal.r1x.l6.l6()});
                  } else {
                     var9 = new s7(new int[]{com.aspose.slides.internal.r1x.l6.l6(), com.aspose.slides.internal.r1x.l6.n5()});
                  }
                  break;
               case 4:
                  var9 = com.aspose.slides.internal.r1x.n3.n5(var8 == 0);
                  break;
               case 8:
               case 16:
                  var9 = com.aspose.slides.internal.r1x.n3.l6(var8 == 0);
            }
         }

         if (var4 == 2) {
            if ((var6[0] & 65535) == 8) {
               var5 = new l6$h0(var0, var1, var2, var9);
            } else if ((var6[0] & 65535) == 16) {
               var5 = new l6$k5(var0, var1, var2, var3, var9);
            }
         } else {
            switch (var6[0]) {
               case 1:
                  var5 = new l6$u3(var0, var1, var2, var3, var9);
                  break;
               case 4:
                  var5 = new l6$a6(var0, var1, var2, var3, var9);
                  break;
               case 8:
                  var5 = new l6$u9(var0, var1, var2, var3, var9);
                  break;
               case 16:
                  if (var8 == 3) {
                     var5 = new l6$l6(var0, var1, var2, var3, var9);
                  } else {
                     var5 = new l6$n5(var0, var1, var2, var3, var9);
                  }
            }
         }
      } else if (var6.length == 3) {
         if ((var6[0] & 65535) == 8 && (var6[1] & 65535) == 8 && (var6[2] & 65535) == 8) {
            if (var8 == 2) {
               if (var4 == 2) {
                  var5 = new l6$x8(var0, var1, var2);
               } else {
                  var5 = new l6$t4(var0, var1, var2, var3);
               }
            } else if (var8 == 6) {
               if (var4 == 2) {
                  var5 = new l6$m1(var1, var2, var7, var0);
               } else {
                  var5 = new l6$z3(var1, var2, var3, var0);
               }
            }
         } else if ((var6[0] & 65535) == 16 && (var6[1] & 65535) == 16 && (var6[2] & 65535) == 16 && var8 == 2) {
            if (var4 == 2) {
               var5 = new l6$t2(var0, var1, var2, var3);
            } else {
               var5 = new l6$e2(var0, var1, var2, var3);
            }
         }
      } else if (var6.length == 4 && var8 == 5) {
         var0.u3(0);
         var5 = new l6$c8(var0, var1, var2, var3);
      } else if (var6.length >= 4) {
         boolean var14 = true;

         for (int var13 : var6) {
            if ((var13 & 65535) != 8) {
               var14 = false;
               break;
            }
         }

         if (var14) {
            if (var4 == 2) {
               var5 = new l6$n3(var0, var1, var2, var7, var6.length);
            } else {
               var5 = new l6$z1(var0, var1, var2, var3, var6.length, var7);
            }
         }

         var14 = true;

         for (int var22 : var6) {
            if ((var22 & 65535) != 16) {
               var14 = false;
               break;
            }
         }

         if (var14) {
            if (var4 == 2) {
               var5 = new l6$s7(var0, var1, var2, var3, var7, var6.length);
            } else {
               var5 = new l6$t9(var0, var1, var2, var3, var6.length, var7);
            }
         }
      }

      if (var5 == null) {
         String var16 = "Unsupported bits per sample ";

         for (int var19 = 0; var19 < var6.length; var19++) {
            var16 = d1.l6(var16, var6[var19]);
            if (var19 < var6.length - 1) {
               var16 = d1.n5(var16, ", ");
            }
         }

         var16 = d1.n5(var16, " count.");
         throw new com.aspose.slides.internal.h6t.u3(var16);
      } else {
         return var5;
      }
   }

   protected static l6$q0 n5(com.aspose.slides.internal.f2i.n5 var0, int var1, int var2, int var3, z6 var4) {
      return com.aspose.slides.internal.j6e.n5.n5(var0, var1, var2, var3, var4);
   }
}
