package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class l6 extends f0 {
   private final Dictionary<String, List<l6$n5>> n5 = new Dictionary<>();

   public l6(com.aspose.slides.internal.n2d.k5 var1) {
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

         com.aspose.slides.internal.v3s.u9 var11 = null;
         switch (var10) {
            case 2:
               var11 = new com.aspose.slides.internal.v3s.k5(var6, var7, this);
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
                  var11 = new com.aspose.slides.internal.v3s.u3(var6, var7, this);
               }
               break;
            case 6:
               var11 = new com.aspose.slides.internal.v3s.a6(var6, var7, this);
               break;
            case 10:
               var11 = new com.aspose.slides.internal.v3s.n5(var6, var7, this);
               break;
            case 12:
               var11 = new com.aspose.slides.internal.v3s.l6(var6, var7, this);
         }

         if (var11 != null) {
            var11.n5(var1);
            l6$n5 var12 = new l6$n5(var6, var7, this);
            var12.a6 = var11;
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

   public final com.aspose.slides.internal.v3s.u9[] n5(int var1, int var2) {
      String var3 = l6(var1, var2);
      if (!this.n5.containsKey(var3)) {
         return new com.aspose.slides.internal.v3s.u9[0];
      }

      l6$n5[] var4 = (l6$n5[])this.n5.get_Item(var3).toArray(new l6$n5[0]);
      List var5 = new List();

      for (l6$n5 var9 : var4) {
         var5.addItem(var9.a6);
      }

      return (com.aspose.slides.internal.v3s.u9[])var5.toArray(new com.aspose.slides.internal.v3s.u9[0]);
   }

   public final a5 n5(w1 var1) {
      com.aspose.slides.internal.v3s.u9 var2 = this.n5();
      if (var2 != null) {
         return var2.n5(var1);
      }

      var2 = this.l6();
      return var2 != null ? var2.n5(var1) : new a5(this.k5());
   }

   public final void n5(com.aspose.slides.internal.n2d.k7 var1) {
      com.aspose.slides.internal.v3s.u9 var2 = this.n5(true);
      if (var2 != null && var2 instanceof com.aspose.slides.internal.v3s.u3) {
         ((com.aspose.slides.internal.v3s.u3)var2).n5(var1);
      } else {
         com.aspose.slides.internal.v3s.u3 var3 = new com.aspose.slides.internal.v3s.u3(3, 1, this);
         var3.n5(var1);
         l6$n5 var4 = new l6$n5(3, 1, this);
         var4.a6 = var3;
         String var5 = l6(3, 1);
         if (!this.n5.containsKey(var5)) {
            this.n5.set_Item(var5, new List<>());
         }

         this.n5.get_Item(var5).addItem(var4);
      }
   }

   public final com.aspose.slides.internal.v3s.u9 n5() {
      return this.n5(false);
   }

   public final com.aspose.slides.internal.v3s.u9 n5(boolean var1) {
      List var2 = new List();
      boolean var3 = false;
      Dictionary$KeyCollection$Enumerator var4 = this.n5.getKeys().iterator();

      try {
         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            List$Enumerator var6 = this.n5.get_Item(var5).iterator();

            try {
               while (var6.hasNext()) {
                  l6$n5 var7 = (l6$n5)var6.next();
                  com.aspose.slides.internal.v3s.u9 var8 = var7.a6;
                  switch (var8.a6()) {
                     case 0:
                        if (!var1 && com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.v3s.l6.class)) {
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
                        if ((var8.u9() & 65535) == 0) {
                           var2.insertItem(0, var8);
                           var3 = true;
                        } else if ((var8.u9() & 65535) == 1) {
                           var2.insertItem(0, var8);
                           if (var1) {
                              var3 = true;
                           }
                        } else if ((var8.u9() & 65535) == 10) {
                           var2.insertItem(0, var8);
                           if (!var1) {
                              var3 = true;
                           }
                        } else if ((var8.u9() & 65535) == 4) {
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

      return var2.size() > 0 ? (com.aspose.slides.internal.v3s.u9)var2.get_Item(0) : null;
   }

   public final com.aspose.slides.internal.v3s.u9 l6() {
      Dictionary$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            List var3 = (List)var2.getValue();
            if (var3.size() != 0) {
               l6$n5 var4 = (l6$n5)var3.get_Item(0);
               return var4.a6;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.u3 var1) {
      com.aspose.slides.internal.v3s.u9 var2 = this.n5(true);
      if (var2 != null) {
         l6$n5[] var3 = new l6$n5[]{this.n5(var2)};
         var1.l6(0);
         var1.l6(var3.length & 65535);
         int var4 = 0;

         for (int var5 = 0; var5 < var3.length; var5++) {
            var3[var5].n5();
            var1.l6(var3[var5].n5 & 65535);
            var1.l6(var3[var5].l6 & 65535);
            int var6 = 4 + var3.length * 8 + var4;
            var1.n5(var6);
            var4 += (int)var3[var5].u3;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            var1.n5(var3[var7].k5, 0, var3[var7].k5.length);
         }
      }
   }

   private l6$n5 n5(com.aspose.slides.internal.v3s.u9 var1) {
      Dictionary$KeyCollection$Enumerator var2 = this.n5.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            List$Enumerator var4 = this.n5.get_Item(var3).iterator();

            try {
               while (var4.hasNext()) {
                  l6$n5 var5 = (l6$n5)var4.next();
                  if (j8.l6(var5.a6, var1)) {
                     return var5;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final boolean k5() {
      return this.n5(3, 0).length > 0;
   }

   private static String l6(int var0, int var1) {
      return d1.n5("{0}_{1}",new Object[]{ var0, var1});
   }
}
