package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class m3 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.j3.m3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "getNamedItem", "setNamedItem", "removeNamedItem", "item", "get_length", "getNamedItemNS", "setNamedItemNS", "removeNamedItemNS"
   );

   @Override
   public void l6() {
      this.k5("getNamedItem");
      this.k5("setNamedItem");
      this.k5("removeNamedItem");
      this.k5("item");
      this.k5("getNamedItemNS");
      this.k5("setNamedItemNS");
      this.k5("removeNamedItemNS");
      this.n5("length", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.j3.m3 var4 = (com.aspose.slides.internal.j3.m3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var11 = var4.u3(var3[0].toString());
               if (var11 == null) {
                  return this.u9();
               }

               return this.n5(var11, j8.n5(var11));
            }
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var10 = var4.k5((com.aspose.slides.internal.f5.r4)var3[0].D_());
               if (var10 == null) {
                  return this.u9();
               }

               return this.n5(var10, j8.n5(var10));
            }
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var9 = var4.a6(var3[0].toString());
               if (var9 == null) {
                  return this.u9();
               }

               return this.n5(var9, j8.n5(var9));
            }
         case 3:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var8 = var4.n5(var3[0].d2());
               if (var8 == null) {
                  return this.u9();
               }

               return this.n5(var8, j8.n5(var8));
            }
         case 4:
            return this.n5(var4.n5());
         case 5:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var7 = var4.k5(var3[0].toString(), var3[1].toString());
               if (var7 == null) {
                  return this.u9();
               }

               return this.n5(var7, j8.n5(var7));
            }
         case 6:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var6 = var4.u3((com.aspose.slides.internal.f5.r4)var3[0].D_());
               if (var6 == null) {
                  return this.u9();
               }

               return this.n5(var6, j8.n5(var6));
            }
         case 7:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            } else {
               com.aspose.slides.internal.j3.z8 var5 = var4.u3(var3[0].toString(), var3[1].toString());
               if (var5 == null) {
                  return this.u9();
               }

               return this.n5(var5, j8.n5(var5));
            }
         default:
            throw new j3("unknown function");
      }
   }
}
