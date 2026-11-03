package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 extends s7 {
   private final Dictionary<String, List<n5$n5>> n5 = new Dictionary<>();

   public n5(com.aspose.slides.internal.z5z.n5 var1) {
      int var2 = (int)var1.n5().getPosition();
      int var3 = var1.a6() & 65535;
      if (var3 != 0) {
         throw new InvalidOperationException("Unexpected cmap table version.");
      }

      int var4 = var1.a6() & 65535;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1.a6();
         int var7 = var1.a6();
         int var8 = var1.l6();
         int var9 = (int)var1.n5().getPosition();
         var1.n5().setPosition(var2 + var8);
         int var10 = var1.a6();
         if ((var10 & 65535) > 6) {
            var1.a6();
         }

         com.aspose.slides.internal.t6w.c8 var11 = null;
         switch (var10) {
            case 2:
               var11 = new com.aspose.slides.internal.t6w.u3(var6, var7, this);
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
            default:
               break;
            case 4:
               if ((var6 & 65535) == 0 || (var6 & 65535) == 3 && ((var7 & 65535) == 1 || (var7 & 65535) == 0)) {
                  var11 = new com.aspose.slides.internal.t6w.u9(var6, var7, this);
               }
               break;
            case 6:
               var11 = new com.aspose.slides.internal.t6w.h0(var6, var7, this);
               break;
            case 10:
               var11 = new com.aspose.slides.internal.t6w.n5(var6, var7, this);
               break;
            case 12:
               var11 = new com.aspose.slides.internal.t6w.l6(var6, var7, this);
         }

         if (var11 != null) {
            var11.n5(var1);
            n5$n5 var12 = new n5$n5(var6, var7, this);
            var12.k5 = var11;
            String var13 = l6(var6, var7);
            if (!this.n5.containsKey(var13)) {
               this.n5.set_Item(var13, new List<>());
            }

            this.n5.get_Item(var13).addItem(var12);
         }

         var1.n5().setPosition(var9);
      }

      if (this.n5.size() == 0) {
         throw new InvalidOperationException("Cannot find a required cmap table.");
      }
   }

   public final com.aspose.slides.internal.t6w.c8[] n5(int var1, int var2) {
      String var3 = l6(var1, var2);
      if (!this.n5.containsKey(var3)) {
         return new com.aspose.slides.internal.t6w.c8[0];
      }

      n5$n5[] var4 = (n5$n5[])this.n5.get_Item(var3).toArray(new n5$n5[0]);
      List var5 = new List();

      for (n5$n5 var9 : var4) {
         var5.addItem(var9.k5);
      }

      return (com.aspose.slides.internal.t6w.c8[])var5.toArray(new com.aspose.slides.internal.t6w.c8[0]);
   }

   public final t2 n5(c4 var1) {
      com.aspose.slides.internal.t6w.c8 var2 = this.n5(true);
      if (var2 != null) {
         return var2.n5(var1);
      }

      var2 = this.n5();
      return var2 != null ? var2.n5(var1) : new t2(this.l6());
   }

   public final com.aspose.slides.internal.t6w.c8 n5(boolean var1) {
      List var2 = new List();
      boolean var3 = false;
      Dictionary$KeyCollection$Enumerator var4 = this.n5.getKeys().iterator();

      try {
         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            List$Enumerator var6 = this.n5.get_Item(var5).iterator();

            try {
               while (var6.hasNext()) {
                  n5$n5 var7 = (n5$n5)var6.next();
                  com.aspose.slides.internal.t6w.c8 var8 = var7.k5;
                  switch (var8.l6()) {
                     case 0:
                        if (!var1 && com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.t6w.l6.class)) {
                           var2.insertItem(0, var8);
                           var3 = true;
                        } else {
                           var2.addItem(var8);
                        }
                     case 1:
                     default:
                        break;
                     case 2:
                        var2.addItem(var8);
                        break;
                     case 3:
                        if ((var8.k5() & 65535) == 0) {
                           var2.insertItem(0, var8);
                           var3 = true;
                        } else if ((var8.k5() & 65535) == 1) {
                           var2.insertItem(0, var8);
                           if (var1) {
                              var3 = true;
                           }
                        } else if ((var8.k5() & 65535) == 10) {
                           var2.insertItem(0, var8);
                           if (!var1) {
                              var3 = true;
                           }
                        } else if ((var8.k5() & 65535) == 4) {
                           var2.addItem(var8);
                        }
                  }

                  if (var3) {
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            if (var3) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2.size() > 0 ? (com.aspose.slides.internal.t6w.c8)var2.get_Item(0) : null;
   }

   public final com.aspose.slides.internal.t6w.c8 n5() {
      Dictionary$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            List var3 = (List)var2.getValue();
            if (var3.size() != 0) {
               n5$n5 var4 = (n5$n5)var3.get_Item(0);
               return var4.k5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   public final boolean l6() {
      return this.n5(3, 0).length > 0;
   }

   private static String l6(int var0, int var1) {
      return d1.n5("{0}_{1}",new Object[]{ var0, var1});
   }
}
