package com.aspose.slides;

class l5w extends d5 {
   @Override
   public boolean n5(int var1) {
      return var1 == 30 || var1 == 0;
   }

   @Override
   public boolean n5(k6a var1) {
      double var2 = var1.a6(30);
      double var4 = var1.a6(0);
      k6a var6 = var1.l6().size() > 0 ? var1.l6().get_Item(0) : null;
      if (var6 != null) {
         k6a var7 = var1.l6().size() > 1 ? var1.l6().get_Item(1) : null;
         k6a var8 = var1.l6().size() > 2 ? var1.l6().get_Item(2) : null;
         e4c var9 = e4c.k5.u9();
         e4c var10 = this.n5(var6, var7, var2, var4, false).u9();
         e4c var11 = this.n5(var6, var8, var2, var4, true).u9();
         double var12 = Double.MAX_VALUE;
         double var14 = Double.MAX_VALUE;
         if (var7 != null && c8(var7)) {
            if (var12 > var10.n5) {
               var12 = var10.n5;
            }

            if (var14 > var10.l6) {
               var14 = var10.l6;
            }
         }

         if (var8 != null && c8(var8)) {
            if (var7 != null) {
               switch (this.c8().k5()) {
                  case 1:
                     var10 = new e4c(var10.n5, var10.l6 + var8.c8().x8() + var2);
                     break;
                  case 2:
                     var10 = new e4c(var10.n5, var10.l6 - var8.c8().x8() - var2);
                     break;
                  case 3:
                     var10 = new e4c(var10.n5 + var2 + var8.c8().h0(), var10.l6);
                     break;
                  case 4:
                     var10 = new e4c(var10.n5 - var2 - var8.c8().h0(), var10.l6);
               }

               if (var12 > var10.n5) {
                  var12 = var10.n5;
               }

               if (var14 > var10.l6) {
                  var14 = var10.l6;
               }
            }

            if (var12 > var11.n5) {
               var12 = var11.n5;
            }

            if (var14 > var11.l6) {
               var14 = var11.l6;
            }
         }

         if (var12 > var9.n5) {
            var12 = var9.n5;
         }

         if (var14 > var9.l6) {
            var14 = var9.l6;
         }

         var6.c8().n5(var9.n5 - var12, var9.l6 - var14);
         if (var7 != null) {
            var7.c8().n5(var10.n5 - var12, var10.l6 - var14);
         }

         if (var8 != null) {
            var8.c8().n5(var11.n5 - var12, var11.l6 - var14);
         }
      }

      var1.c8().z7();
      return true;
   }

   private e4c n5(k6a var1, k6a var2, double var3, double var5, boolean var7) {
      double var8 = 0.0;
      double var10 = 0.0;
      if (var1 != null && var2 != null && c8(var1) && c8(var2)) {
         boolean var12 = this.c8().k5() == 1 || this.c8().k5() == 2;
         switch (this.c8().k5()) {
            case 1:
               var10 = var1.c8().x8() + var3;
               break;
            case 2:
               var10 = -var2.c8().x8() - var3;
               break;
            case 3:
               var8 = var1.c8().h0() + var3;
               break;
            case 4:
               var8 = -var2.c8().h0() - var3;
         }

         if (var7) {
            e4c var13 = n5(var1, var2).u9();
            if (var12) {
               var8 = var13.n5;
            } else {
               var10 = var13.l6;
            }
         } else {
            switch (this.c8().u3()) {
               case 0:
                  var10 = var1.c8().x8() * var5;
                  break;
               case 1:
                  var10 = var1.c8().x8() - (var2.c8().x8() + var1.c8().x8() * var5);
                  break;
               case 2:
                  var8 = var1.c8().h0() * var5;
                  break;
               case 3:
                  var8 = -(var2.c8().h0() - var1.c8().h0()) - var1.c8().h0() * var5;
                  break;
               case 4:
                  e4c var16 = n5(var1, var2).u9();
                  if (var16.l6() > 0.0) {
                     if (var12) {
                        var8 = var16.n5;
                     } else {
                        var10 = var16.l6;
                     }
                  } else {
                     u6x var14 = new u6x(com.aspose.slides.ms.System.u3.n5(var2.c8().f2()));
                     if (var12) {
                        var8 = var2.c8().u3() - var14.n5() + (var1.c8().h0() - var14.t2()) / 2.0;
                     } else {
                        var10 = var2.c8().a6() - var14.l6() + (var1.c8().x8() - var14.s7()) / 2.0;
                     }
                  }
                  break;
               case 5:
                  e4c var15 = n5(var1, var2).u9();
                  if (var15.l6() > 0.0) {
                     if (var12) {
                        var8 = var15.n5;
                     } else {
                        var10 = var15.l6;
                     }
                  } else if (var12) {
                     var8 = (var1.c8().h0() - var2.c8().h0()) / 2.0;
                  } else {
                     var10 = (var1.c8().x8() - var2.c8().x8()) / 2.0;
                  }
            }
         }
      }

      return new e4c(var8, var10);
   }

   private static e4c n5(k6a var0, k6a var1) {
      d8r var2 = com.aspose.slides.internal.v6g.k5.n5(var1.s7(), d8r.class);
      double var3 = var1.c8().k5(4);
      double var5 = var1.c8().k5(5);
      return var2 == null || var3 == 0.0 && var5 == 0.0 ? e4c.k5 : new e4c(var0.c8().h0() / 2.0 - var3, var0.c8().x8() / 2.0 - var5);
   }

   protected static boolean c8(k6a var0) {
      return var0.s3() ? true : var0.l6().size() > 0;
   }

   private e8a c8() {
      return (e8a)this.n5();
   }
}
