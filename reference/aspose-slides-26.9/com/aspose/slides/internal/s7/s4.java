package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class s4 extends com.aspose.slides.internal.n3.t2 {
   @Override
   public String n5() {
      return "crop";
   }

   @Override
   public int l6() {
      return 86;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.y1;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 35:
            if (com.aspose.slides.ms.System.d1.u3(var1.t2(), l6$n5.y1.l6(), (short)3)) {
               return l6$n5.y1;
            }

            throw this.n5(var1.t2());
         case 38:
            var1 = var1.c8();
            if (var1 == null) {
               throw this.k5("rect");
            } else {
               com.aspose.slides.internal.k5.u3 var23 = this.l6(var1, var2);
               var1 = var1.k5();
               if (var1 != null && var1.n5() == 0) {
                  var1 = var1.k5();
                  if (var1 == null) {
                     throw this.k5("rect");
                  }

                  com.aspose.slides.internal.k5.u3 var24 = this.l6(var1, var2);
                  var1 = var1.k5();
                  if (var1 != null && var1.n5() == 0) {
                     var1 = var1.k5();
                     if (var1 == null) {
                        throw this.k5("rect");
                     }

                     com.aspose.slides.internal.k5.u3 var25 = this.l6(var1, var2);
                     var1 = var1.k5();
                     if (var1 != null && var1.n5() == 0) {
                        var1 = var1.k5();
                        if (var1 == null) {
                           throw this.k5("rect");
                        }

                        com.aspose.slides.internal.k5.u3 var26 = this.l6(var1, var2);
                        var1 = var1.k5();
                        if (var1 != null) {
                           throw this.k5("rect");
                        }

                        return new com.aspose.slides.internal.y4.e2(var23, var24, var25, var26);
                     }

                     throw this.k5("rect");
                  }

                  throw this.k5("rect");
               }

               throw this.k5("rect");
            }
         case 41:
            if (!com.aspose.slides.ms.System.d1.u3(var1.h0(), "inset-rect(", (short)3)) {
               throw this.n5(var1);
            } else {
               var1 = var1.c8();
               if (var1 == null) {
                  throw this.k5("rect");
               } else {
                  com.aspose.slides.internal.k5.u3 var3 = this.l6(var1, var2);
                  var1 = var1.k5();
                  if (var1 != null && var1.n5() == 0) {
                     var1 = var1.k5();
                     if (var1 == null) {
                        throw this.k5("rect");
                     }

                     com.aspose.slides.internal.k5.u3 var4 = this.l6(var1, var2);
                     var1 = var1.k5();
                     if (var1 != null && var1.n5() == 0) {
                        var1 = var1.k5();
                        if (var1 == null) {
                           throw this.k5("rect");
                        }

                        com.aspose.slides.internal.k5.u3 var5 = this.l6(var1, var2);
                        var1 = var1.k5();
                        if (var1 != null && var1.n5() == 0) {
                           var1 = var1.k5();
                           if (var1 == null) {
                              throw this.k5("rect");
                           }

                           com.aspose.slides.internal.k5.u3 var6 = this.l6(var1, var2);
                           var1 = var1.k5();
                           if (var1 != null) {
                              throw this.k5("rect");
                           }

                           return new com.aspose.slides.internal.y4.x8(var3, var4, var5, var6);
                        }

                        throw this.k5("rect");
                     }

                     throw this.k5("rect");
                  }

                  throw this.k5("rect");
               }
            }
         default:
            throw this.n5(var1);
      }
   }

   private com.aspose.slides.internal.k5.u3 l6(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      if (var1.n5() == 35) {
         if (com.aspose.slides.ms.System.d1.u3(var1.t2(), l6$n5.y1.l6(), (short)3)) {
            return l6$n5.y1;
         } else {
            throw this.n5(var1.t2());
         }
      } else {
         return (com.aspose.slides.internal.k5.u3)super.n5(var1, var2);
      }
   }
}
