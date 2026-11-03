package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class f2 extends n3 {
   private i1 n5;
   private static final f2 l6 = new f2();

   public static f2 n5() {
      return l6;
   }

   @Override
   public com.aspose.slides.internal.o9b.n3 n5(String var1, float var2, int var3) {
      try {
         return com.aspose.slides.internal.o9b.n3.n5(var1, var2, var3);
      } catch (ArgumentException var6) {
         com.aspose.slides.internal.o9b.y4 var5 = new com.aspose.slides.internal.o9b.y4(var1);
         return com.aspose.slides.internal.o9b.n3.n5(var5, var2, n5(var5, var3));
      } catch (RuntimeException var7) {
         return null;
      }
   }

   private static int n5(com.aspose.slides.internal.o9b.y4 var0, int var1) {
      if (var0.c8(var1)) {
         return var1;
      }

      switch (var1) {
         case 1:
         case 2:
            if (var0.c8(3)) {
               return 3;
            }
            break;
         case 3:
            if (var0.c8(2)) {
               return 2;
            }

            if (var0.c8(1)) {
               return 1;
            }
      }

      if (var0.c8(0)) {
         return 0;
      } else if (var0.c8(1)) {
         return 1;
      } else if (var0.c8(2)) {
         return 2;
      } else {
         return var0.c8(3) ? 3 : var1;
      }
   }

   @Override
   public i1 n5(String var1, int var2) {
      return this.c8().n5(var1, var2, true);
   }

   public final i1 n5(String var1, int var2, String var3) {
      i1 var4 = this.c8().n5(var1, var2, false);
      if (var4 == null) {
         if (com.aspose.slides.internal.n2d.t4.l6(var3)) {
            var4 = this.c8().n5(var3, var2, false);
         }

         if (var4 == null) {
            var4 = this.c8().n5(var2);
            if (var4 == null) {
               com.aspose.slides.internal.o9b.n3 var5 = new com.aspose.slides.internal.o9b.n3(var1, 10.0F);
               var4 = this.c8().n5(var5.h0(), var2, false);
               if (var4 == null) {
                  var4 = com.aspose.slides.internal.e1x.n5.l6().c8().n5(var1, var2, false);
                  if (var4 == null) {
                     if (com.aspose.slides.internal.n2d.t4.l6(var3)) {
                        var4 = com.aspose.slides.internal.e1x.n5.l6().c8().n5(var3, var2, false);
                     }

                     if (var4 == null) {
                        var4 = this.l6();
                        if (var4 == null) {
                           var4 = this.n3();
                           if (var4 == null) {
                              throw new InvalidOperationException("Cannot find any fonts installed on the system.");
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var4;
   }

   public final i1 l6() {
      if (this.n5 == null) {
         i1 var1 = this.c8().n5(0);
         if (var1 == null) {
            var1 = this.c8().n5(com.aspose.slides.internal.o9b.v4.l6().l6().a6(), 0, false);
         }

         i1 var2 = var1;
         if (var2 == null) {
            var2 = this.c8().n5();
         }

         this.n5 = var2;
      }

      return this.n5;
   }

   public final i1 n3() {
      if (this.n5 == null) {
         i1 var1 = com.aspose.slides.internal.e1x.n5.l6().c8().n5(0);
         if (var1 == null) {
            var1 = com.aspose.slides.internal.e1x.n5.l6().c8().n5();
         }

         this.n5 = var1;
      }

      return this.n5;
   }

   @Override
   public z3[] k5() {
      return this.c8().l6();
   }

   @Override
   public i1 l6(String var1, int var2) {
      return this.c8().l6(var1, var2, true);
   }

   @Override
   public i1 n5(int var1) {
      return this.c8().n5(var1);
   }

   private f2() {
      super(y4(), (byte[][])null);
   }

   private static String[] y4() {
      try {
         return com.aspose.slides.internal.e5m.n5.l6().n5();
      } catch (RuntimeException var1) {
         return null;
      }
   }

   @Override
   void n5(IGenericDictionary<String, String> var1) {
      Dictionary var2 = com.aspose.slides.internal.r5w.n5.n5(var1);

      for (Object recoveredElement$var4$4375 : var2.getValues()) {
         String var4 = (String)recoveredElement$var4$4375;
         var1.set_Item(var4, var4);
         this.l6(var4);
      }

      var2.clear();
   }
}
