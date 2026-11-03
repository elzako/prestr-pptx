package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class PropertyEffectPlaying {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "ppt_x", "#ppt_x", "ppt_y", "#ppt_y", "ppt_w", "#ppt_w", "ppt_h", "#ppt_h", "style.rotation"
   );

   public static l8k n5(e9 var0, IShape var1, PropertyEffect var2) {
      if (var2.getProperties().size() != 1) {
         return null;
      }

      IBehaviorProperty var3 = var2.getProperties().get_Item(0);
      PropertyEffectPlaying$SetValueHandler var4 = null;
      switch (n5.n5(var3.getValue())) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            var4 = new PropertyEffectPlaying$1(var0, var1, var3);
            IPointCollection var5 = var2.getPoints();
            if (var5.getCount() <= 1) {
               return null;
            } else {
               List var6 = new List();
               r9g var7 = new r9g(var1);
               boolean var8 = false;
               int var9 = 1;

               for (; var9 < var5.getCount(); var9++) {
                  IPoint var10 = var5.get_Item(var9 - 1);
                  IPoint var11 = var5.get_Item(var9);
                  float var12 = var11.getTime() - var10.getTime();
                  l8k var13 = null;
                  if (!com.aspose.slides.ms.System.d1.n5(var10.getFormula())) {
                     z9l var14 = e2q.n5(var10.getFormula());
                     if (var14 != null) {
                        var13 = new t7i(var7, var14, var4);
                        var8 = true;
                     }
                  } else {
                     z9l var38 = n5(var10.getValue());
                     z9l var15;
                     if (!com.aspose.slides.ms.System.d1.n5(var11.getFormula())) {
                        var15 = e2q.n5(var11.getFormula());
                        var8 = true;
                     } else {
                        var15 = n5(var11.getValue());
                     }

                     if (var38 != null && var15 != null) {
                        var13 = new u9b(var7, var4, var38, var15);
                     }
                  }

                  if (var13 != null) {
                     var6.addItem(new KeyValuePair<>(var12, var13));
                  }
               }

               if (var6.size() == 1) {
                  return (l8k)((KeyValuePair)var6.get_Item(0)).getValue();
               } else if (var6.size() <= 1) {
                  return null;
               } else {
                  float var32 = 0.0F;
                  float var33 = (Float)((KeyValuePair)var6.get_Item(0)).getKey();
                  boolean var34 = true;
                  List$Enumerator var35 = var6.iterator();

                  try {
                     while (var35.hasNext()) {
                        KeyValuePair var36 = (KeyValuePair)var35.next();
                        var32 += ((Float)var36.getKey()).floatValue();
                        if ((Float)var36.getKey() != var33) {
                           var34 = false;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
                        var35.dispose();
                     }
                  }

                  d4c var37 = new d4c();
                  if (!var34 && var8) {
                     List$Enumerator var40 = var6.iterator();

                     try {
                        while (var40.hasNext()) {
                           KeyValuePair var42 = (KeyValuePair)var40.next();
                           float var16 = (Float)var42.getKey() / var32;
                           var37.n5(new q8c((l8k)var42.getValue(), var16));
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
                           var40.dispose();
                        }
                     }
                  } else {
                     List$Enumerator var39 = var6.iterator();

                     try {
                        while (var39.hasNext()) {
                           KeyValuePair var41 = (KeyValuePair)var39.next();
                           var37.n5((l8k)var41.getValue());
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
                           var39.dispose();
                        }
                     }
                  }

                  return var37;
               }
            }
         default:
            return null;
      }
   }

   private static z9l n5(Object var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, String.class)) {
         return e2q.n5((String)var0);
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var0, Float.class) ? new q0y(com.aspose.slides.internal.v6g.k5.u3(var0, float.class)) : null;
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n5;
   }
}
