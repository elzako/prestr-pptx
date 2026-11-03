package com.aspose.slides.internal.b0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e1x.f2;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.n3;
import com.aspose.slides.internal.e1x.x8;
import com.aspose.slides.internal.e1x.z3;
import com.aspose.slides.internal.k1.t4;
import com.aspose.slides.internal.t5n.l6$n5;

public class n5 {
   private static Dictionary<String, Integer> n5 = new Dictionary<>();

   public static i1 n5(x8 var0, l6$n5 var1) {
      i1 var2 = n5(com.aspose.slides.internal.e1x.n5.l6(), var1, null, null);
      return n5(f2.n5(), var1, var2, n5);
   }

   private static i1 n5(n3 var0, l6$n5 var1, i1 var2, Dictionary<String, Integer> var3) {
      int var4 = l6.k5(var1);
      t4 var5 = new t4(var1.y4);
      byte var6 = var5.k5();
      z3[] var7 = var0.k5();
      z3 var8 = null;
      z3 var9 = null;
      n5$n5 var10 = new n5$n5();

      for (z3 var14 : var7) {
         byte[] var15 = var14.l6();
         if (var15 != null) {
            boolean var16 = (var15[3] & 255) == 9;
            boolean var17 = (var15[1] & 255) == 11 || (var15[1] & 255) == 12 || (var15[1] & 255) == 13;
            boolean var18 = !var17 && (var15[1] & 255) != 1;
            label116:
            switch (var5.l6()) {
               case 0:
                  switch (var6) {
                     case 0:
                        var8 = var14;
                        break label116;
                     case 1:
                        if (var16) {
                           var8 = var14;
                        }
                        break label116;
                     case 2:
                        if (!var16) {
                           var8 = var14;
                        }
                     default:
                        break label116;
                  }
               case 1:
                  if (var18) {
                     switch (var6) {
                        case 0:
                           var8 = var14;
                           break;
                        case 1:
                           if (var16) {
                              var8 = var14;
                           }
                           break;
                        case 2:
                           if (!var16) {
                              var8 = var14;
                           }
                     }
                  }
                  break;
               case 2:
                  if (var17) {
                     switch (var6) {
                        case 0:
                           var8 = var14;
                           break;
                        case 1:
                           if (var16) {
                              var8 = var14;
                           }
                           break;
                        case 2:
                           if (!var16) {
                              var8 = var14;
                           }
                     }
                  }
                  break;
               case 3:
                  if (var16) {
                     var8 = var14;
                  }
                  break;
               case 4:
                  if ((var15[0] & 255) == 3) {
                     switch (var6) {
                        case 0:
                           var8 = var14;
                           break;
                        case 1:
                           if (var16) {
                              var8 = var14;
                           }
                           break;
                        case 2:
                           if (!var16) {
                              var8 = var14;
                           }
                     }
                  }
                  break;
               case 5:
                  if ((var15[0] & 255) == 4) {
                     switch (var6) {
                        case 0:
                           var8 = var14;
                           break;
                        case 1:
                           if (var16) {
                              var8 = var14;
                           }
                           break;
                        case 2:
                           if (!var16) {
                              var8 = var14;
                           }
                     }
                  }
            }

            if (var8 != null) {
               if (var3 != null) {
                  int var19 = 0;
                  Integer[] var20 = new Integer[]{var19};
                  boolean var21 = n5.tryGetValue(var8.n5(), var20) && var20[0] < var10.l6();
                  var19 = var20[0];
                  if (var21) {
                     var10.n5(var8);
                     var10.n5(var19);
                     continue;
                  }
               }

               if (var9 == null) {
                  var9 = var8;
               }
            }
         }
      }

      if (var10.n5() != null) {
         i1 var22 = var0.l6(var10.n5().n5(), var4);
         if (var22 != null) {
            return var22;
         }
      }

      if (var2 != null) {
         return var2;
      }

      if (var9 != null) {
         i1 var23 = var0.l6(var9.n5(), var4);
         if (var23 != null) {
            return var23;
         }
      }

      return var0.n5(var4);
   }

   static {
      n5.addItem("Arial", 10);
      n5.addItem("Times New Roman", 20);
      n5.addItem("Cambria Math", 30);
      n5.addItem("MS Gothic", 40);
      n5.addItem("Gulim", 50);
      n5.addItem("Arial Unicode", 60);
      n5.addItem("SimSun", 70);
      n5.addItem("Segoe UI Symbol", 80);
      n5.addItem("DejaVu Sans", 90);
      n5.addItem("Liberation Serif", 100);
      n5.addItem("FreeSans", 110);
      n5.addItem("Arial Unicode MS", 120);
      n5.addItem("Apple SD Gothic Neo", 130);
      n5.addItem("Rockwell", 140);
   }
}
